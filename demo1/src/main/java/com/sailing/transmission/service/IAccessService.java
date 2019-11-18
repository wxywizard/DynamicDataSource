package com.sailing.transmission.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.sailing.transmission.domain.Vehicle;

public interface IAccessService extends IService<Vehicle> {
    void mysqlCameraToPgApsCamera();
}
