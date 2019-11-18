package com.sailing.transmission.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.conditions.update.LambdaUpdateWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.sailing.transmission.config.ConversionConfig;
import com.sailing.transmission.domain.Vehicle;
import com.sailing.transmission.enums.PlateColorEnums;
import com.sailing.transmission.mapper.OracleMapper;
import com.sailing.transmission.mapper.PostgreMapper;
import com.sailing.transmission.service.IAccessService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import javax.annotation.Resource;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author: wangxy
 */
@Service
@Slf4j
public class AccessServiceImpl extends ServiceImpl<PostgreMapper, Vehicle> implements IAccessService {

    @Resource
    private PostgreMapper postgreMapper;

    @Autowired
    private ConversionConfig conversionConfig;

    @Override
    public void updateVehiclePlateColor() {
        Long start = System.currentTimeMillis();
        LambdaQueryWrapper<Vehicle> lambdaQueryWrapper = new LambdaQueryWrapper();
        List<Vehicle> list = postgreMapper.selectList(lambdaQueryWrapper);
        Map<String,String> map = carriedOutClass();
        for (Vehicle vehicle : list) {
            String plateColor = map.get(vehicle.getHpzl());
            if (!StringUtils.isEmpty(plateColor)){
                Map<String,String> params = new HashMap<>();
                params.put("plateColor",plateColor);
                params.put("plateClass",vehicle.getHpzl());
                postgreMapper.updateVehicle(params);
            }
        }
        System.out.println(System.currentTimeMillis()-start);
    }


    public Map<String,String> carriedOutClass(){
        Map<String,String> resultMap = new HashMap<>();
        Field[] f = ConversionConfig.class.getDeclaredFields();
        for (Field field : f) {
            //获取属相名
            String attributeName=field.getName();
            switch (attributeName){
                case "blue" :
                    resultMap.putAll(analysisConfig(conversionConfig.getBlue(),PlateColorEnums.BLUE));
                    break;
                case "yellow" :
                    resultMap.putAll(analysisConfig(conversionConfig.getYellow(),PlateColorEnums.YELLOW));
                    break;
                case "yellowGreen" :
                    resultMap.putAll(analysisConfig(conversionConfig.getYellowGreen(),PlateColorEnums.YELLOW_GREEN));
                    break;
                case "green" :
                    resultMap.putAll(analysisConfig(conversionConfig.getGreen(),PlateColorEnums.GREEN));
                    break;
                case "black" :
                    resultMap.putAll(analysisConfig(conversionConfig.getBlack(),PlateColorEnums.BLACK));
                    break;
                case "white" :
                    resultMap.putAll(analysisConfig(conversionConfig.getWhite(),PlateColorEnums.WHITE));
                    break;
                case "other" :
                    resultMap.putAll(analysisConfig(conversionConfig.getOther(),PlateColorEnums.OTHER));
                    break;
            }
        }
        return resultMap;
    }

    private Map<String,String> analysisConfig(String str,PlateColorEnums plateColorEnums){
        Map<String,String> resultMap = new HashMap<>();
        if (!StringUtils.isEmpty(str)){
            if (str.contains(",")){
                for (String s : str.split(",")) {
                    resultMap.put(s, plateColorEnums.getCode());
                }
            }else {
                resultMap.put(str, plateColorEnums.getCode());
            }
        }
        return resultMap;
    }
}
