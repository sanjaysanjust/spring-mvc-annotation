package org.sanjay.config;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class DispatcherServletIntializer extends AbstractAnnotationConfigDispatcherServletInitializer{

	@Override
	protected Class<?>[] getRootConfigClasses() {
		Class[] classList = {AppConfig.class};
		return classList;
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		Class[] classList = {WebConfig.class};
		return classList;
	}

	@Override
	protected String[] getServletMappings() {
		// TODO Auto-generated method stub
		return new String[] {"/"};
	}

}
