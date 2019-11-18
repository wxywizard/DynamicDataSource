package com.sailing.transmission.vo;

import lombok.Data;

/**
 * @author: wangxy
 */
@Data
public class ResultVo<T> {

    /** 编码 */
    private String resultCode;

    /** 提示信息 */
    private String resultDesc;

    /** 具体内同 */
    private T data;
}
