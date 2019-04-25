package oa.jn.advice;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import oa.jn.exception.ServiceException;
import oa.jn.vo.SysResult;

/**
 * 全局异常处理类
 */
@ControllerAdvice
public class GlobalExceptionHandler {
	//@ExceptionHandler注解描述的方法为异常处理方法
		//注解内部给定的异常类型为此方法可以处理的异常类型
		@ExceptionHandler(RuntimeException.class)
		@ResponseBody
		public SysResult doHandleRuntimeException(RuntimeException e) {
			e.printStackTrace();//也可以写日志
			return SysResult.fail("运行时错误,请稍等片刻");
		}

		@ExceptionHandler(ServiceException.class)
		@ResponseBody
		public SysResult doHandleServiceException(ServiceException e) {
			e.printStackTrace();//也可以写日志
			return SysResult.fail(e.getMessage());//封装异常信息
		}
}
