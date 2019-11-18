package com.sailing.transmission.service.impl;

import com.baomidou.dynamic.datasource.annotation.DS;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.sailing.transmission.domain.Jsrjbxx;
import com.sailing.transmission.domain.Vehicle;
import com.sailing.transmission.mapper.OracleMapper;
import com.sailing.transmission.mapper.PostgreMapper;
import com.sailing.transmission.service.IAccessService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author: wangxy
 */
@Service
@Slf4j
public class AccessServiceImpl extends ServiceImpl<PostgreMapper, Vehicle> implements IAccessService {

    @Resource
    private PostgreMapper postgreMapper;

    @Resource
    private OracleMapper oracleMapper;

    @Transactional
    @Override
    @DS("slave")
    public void mysqlCameraToPgApsCamera(){
        //先查询mysqlCamera表中数据
       List<Jsrjbxx> cameraList = oracleMapper.queryJsrjbxx();
        //清空pg中ApsCamera数据
        //postgreMapper.truncateTable();
        //将mysql数据灌入pg中
    }

}
