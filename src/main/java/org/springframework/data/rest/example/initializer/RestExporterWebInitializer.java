package org.springframework.data.rest.example.initializer;

import org.springframework.data.rest.example.config.AppRootConfig;
import org.springframework.data.rest.example.config.AppWebConfig;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

/**
 * @author Francesco Pitzalis
 */
public class RestExporterWebInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {

	// specify non-web configuration classses (middle-tier and data-tier
	// configuration)
	@Override
	protected Class<?>[] getRootConfigClasses() {
		return new Class<?>[] { AppRootConfig.class };
	}

	// specify web configuration classes (where configured controllers, view
	// resolvers, handler mappings, ...)
	@Override
	protected Class<?>[] getServletConfigClasses() {
		return new Class<?>[] { AppWebConfig.class };
	}

	// map DispatcherServlet to
	@Override
	protected String[] getServletMappings() {
		return new String[] { "/" };
	}

}
