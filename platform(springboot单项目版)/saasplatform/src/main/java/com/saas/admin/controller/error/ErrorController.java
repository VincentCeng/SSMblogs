package com.saas.admin.controller.error;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.web.ErrorProperties;
import org.springframework.boot.autoconfigure.web.servlet.error.BasicErrorController;
import org.springframework.boot.autoconfigure.web.servlet.error.ErrorViewResolver;
import org.springframework.boot.web.servlet.error.ErrorAttributes;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.fasterxml.jackson.databind.ObjectMapper;

/**
 * 异常处理器
 * @ClassName: ErrorController 
 * @Description: (这里用一句话描述这个类的作用) 
 * @author Orchid
 * @date 2018年6月21日 下午7:23:02 
 *
 */
//@Controller
//@RequestMapping(value="error")
public class ErrorController extends BasicErrorController {


	public ErrorController(ErrorAttributes errorAttributes, ErrorProperties errorProperties,
			List<ErrorViewResolver> errorViewResolvers) {
		super(errorAttributes, errorProperties, errorViewResolvers);
	}

	@Autowired
	ObjectMapper objectMapper;

	@Override
	public String getErrorPath() {
		// TODO Auto-generated method stub
		return super.getErrorPath();
	}

	@Override
	public ModelAndView errorHtml(HttpServletRequest request, HttpServletResponse response) {
		// TODO Auto-generated method stub
		return super.errorHtml(request, response);
	}

	@Override
	public ResponseEntity<Map<String, Object>> error(HttpServletRequest request) {
		// TODO Auto-generated method stub
		return super.error(request);
	}

	@Override
	protected boolean isIncludeStackTrace(HttpServletRequest request, MediaType produces) {
		// TODO Auto-generated method stub
		return super.isIncludeStackTrace(request, produces);
	}

	@Override
	protected ErrorProperties getErrorProperties() {
		// TODO Auto-generated method stub
		return super.getErrorProperties();
	}
}
