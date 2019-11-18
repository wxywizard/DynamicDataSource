package com.sailing.transmission.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.sailing.transmission.domain.Jsrjbxx;

import java.util.List;

public interface OracleMapper extends BaseMapper<Jsrjbxx> {

    List<Jsrjbxx> queryJsrjbxx();
}
