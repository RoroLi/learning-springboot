package com.roro.springbootweb.handler;

import com.roro.springbootweb.exception.MyException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Map;




//全局异常处理器
@ControllerAdvice
public class MyExceptionHanlder {

    /**
     * http://localhost:8080/testError
     * 浏览器和其他客户端都返回了json 数组，不满足自适应
     * @param e
     * @param request
     * @return
     */
//    @ExceptionHandler(value= MyException.class)
//    @ResponseBody
//    public Map<String,Object> dealException(MyException e, HttpServletRequest request){
//        Map<String,Object> retInfo = new HashMap<>();
//        retInfo.put("code",e.getCode());
//        retInfo.put("msg",e.getMsg());
//        return retInfo;
//    }




    /**
     * http://localhost:8080/testError
     * 浏览器返回一个错误页面
     * postman返回json
     */
//    @ExceptionHandler(value= MyException.class)
//    public String dealException(MyException e, HttpServletRequest request){
//        Map<String,Object> retInfo = new HashMap<>();
//        retInfo.put("code",e.getCode());
//        retInfo.put("msg",e.getMsg());
//        //重定向，把请求转发到BasicErrorController来处理 /error
//        return "forward:/error";
//    }


    /**
     * http://localhost:8080/testError
     * 浏览器返回一个统一错误页面，因为设置了500
     * postman返回json
     */
    @ExceptionHandler(value= MyException.class)
    public String dealException(MyException e, HttpServletRequest request){
        Map<String,Object> retInfo = new HashMap<>();
        retInfo.put("code",e.getCode());
        retInfo.put("msg",e.getMsg());
        request.setAttribute("javax.servlet.error.status_code",500);
        request.setAttribute("ext",retInfo);
        return "forward:/error";
    }

}
