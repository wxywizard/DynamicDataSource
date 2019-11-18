package com.sailing.transmission.exception;

import com.sailing.transmission.enums.ResultEnum;
import lombok.Getter;

/**
 * @author: wangxy
 */
@Getter
public class TransmissionException extends RuntimeException {

    private String code;

    public TransmissionException(ResultEnum resultEnum) {
        super(resultEnum.getMsg());
        this.code = resultEnum.getCode();
    }

    public TransmissionException(String code,String message) {
        super(message);
        this.code = code;
    }
}
