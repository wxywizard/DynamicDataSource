package com.sailing.transmission.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * @author: wangxy
 */
@EnableTransactionManagement
@Configuration
@MapperScan("com.sailing.transmission.mapper")
public class MybatisPlusConfig {


}
