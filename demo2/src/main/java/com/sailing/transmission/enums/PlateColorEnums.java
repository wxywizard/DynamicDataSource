package com.sailing.transmission.enums;

import lombok.Getter;

/**
 * @author: wangxy
 */
@Getter
public enum PlateColorEnums {
    BLUE("5","蓝色"),
    YELLOW("6","黄色"),
    YELLOW_GREEN("52","黄绿色"),
    GREEN("9","绿色"),
    BLACK("1","黑色"),
    WHITE("2","白色"),
    OTHER("99","其他"),
    ;

    private String code;
    private String msg;

    PlateColorEnums(String code, String msg) {
        this.code = code;
        this.msg = msg;
    }
}
