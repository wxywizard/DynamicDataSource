package com.sailing.transmission.handle;

import com.sailing.transmission.exception.TransmissionException;
import com.sailing.transmission.utils.ResultUtils;
import com.sailing.transmission.vo.ResultVo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author: wangxy
 */
@Slf4j
@ControllerAdvice
public class ExceptionHandle {

    @ExceptionHandler(value = TransmissionException.class)
    @ResponseBody
    public ResultVo TransmissionExceptionHandle(TransmissionException e){
        return ResultUtils.error(e.getCode(),e.getMessage());
    }
}
