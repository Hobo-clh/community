package com.ccsu.community.advise;

import com.ccsu.community.dto.ResultDTO;
import com.ccsu.community.exception.CustomizeErrorCode;
import com.ccsu.community.exception.CustomizeException;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * 拦截服务器内部异常 处理mvc请求异常
 * @author 华华
 */
@ControllerAdvice
public class CustomizeExceptionHandle {

    private static final String CONTENT_TYPE = "application/json";

    @ResponseBody
    @ExceptionHandler({Exception.class})
    public Object handle(HttpServletRequest request,
                        HttpServletResponse response,
                        Throwable e, Model model) {

        String contentType = request.getContentType();
        if (CONTENT_TYPE.equals(contentType)) {
            //返回json
            if (e instanceof CustomizeException) {
                return ResultDTO.errorOf((CustomizeException) e);
            } else {
                return ResultDTO.errorOf(CustomizeErrorCode.SYS_ERROR);
            }
        } else {
            //返回错误页面
            if (e instanceof CustomizeException) {
                model.addAttribute("message", e.getMessage());
                model.addAttribute("code", ((CustomizeException) e).getCode());
            } else {
                model.addAttribute("message", CustomizeErrorCode.SYS_ERROR.getMessage());
                model.addAttribute("code",CustomizeErrorCode.SYS_ERROR.getCode());
            }
            return new ModelAndView("error/error");
        }
    }
}
