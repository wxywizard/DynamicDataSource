package com.sailing.transmission.utils;

import com.sailing.transmission.vo.ResultVo;

/**
 * @author: wangxy
 */
public class ResultUtils {

   public static ResultVo success(Object object){
       ResultVo resultVo = new ResultVo();
       resultVo.setResultCode("0");
       resultVo.setResultDesc("success");
       resultVo.setData(object);
       return resultVo;
   }

   public static ResultVo success(){
       return success(null);
   }

   public static ResultVo error(String code,String message){
       ResultVo resultVo = new ResultVo();
       resultVo.setResultCode(code);
       resultVo.setResultDesc(message);
       return resultVo;
   }
}
