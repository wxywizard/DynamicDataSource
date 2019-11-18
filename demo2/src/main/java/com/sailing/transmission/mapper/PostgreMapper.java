package com.sailing.transmission.mapper;


import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.sailing.transmission.domain.Vehicle;

import java.util.Map;

public interface PostgreMapper extends BaseMapper<Vehicle> {

    void updateVehicle(Map map);
}
