package com.koinosystems.qtrack.config;

import java.util.Set;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;

import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.ContextLoaderListener;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

/**
 *
 * @author mauro.almeida
 * 
 */
public class WebAppInitializer implements WebApplicationInitializer {

	@Override
	public void onStartup(ServletContext servletContext) throws ServletException {

		AnnotationConfigWebApplicationContext context = new AnnotationConfigWebApplicationContext();
		context.setConfigLocations(new String[] {"com.koinosystems.qtrack.config"});

		servletContext.addListener(new ContextLoaderListener(context));
		
		DispatcherServlet servlet = new DispatcherServlet();
		servlet.setContextConfigLocation("");

		ServletRegistration.Dynamic appServlet = servletContext.addServlet("WEB", servlet);
		appServlet.setLoadOnStartup(1);
		appServlet.setAsyncSupported(true);

		Set<String> mappingConflicts = appServlet.addMapping("/");
		if (!mappingConflicts.isEmpty()) {
			throw new IllegalStateException("'WEB' cannot be mapped to '/'");
		}

	}
}