package com.example.conf;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

/**
 * Application initializer class for Spring
 * 
 * @author Administrador
 *
 */
public class ApplicationInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {

	/**
	 * GET root config classes
	 */
	@Override
	protected Class<?>[] getRootConfigClasses() {
		return new Class[] { ApplicationConfiguration.class };
	}

	/**
	 * GET servlet config Classes
	 */
	@Override
	protected Class<?>[] getServletConfigClasses() {
		return null;
	}

	/**
	 * GET servlet Mappings
	 */
	@Override
	protected String[] getServletMappings() {
		return new String[] { "/api/*" };
	}

}
