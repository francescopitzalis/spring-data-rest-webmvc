package org.springframework.data.rest.example.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.rest.core.event.ValidatingRepositoryEventListener;
import org.springframework.data.rest.example.validator.PersonValidator;
import org.springframework.data.rest.webmvc.config.RepositoryRestMvcConfiguration;
import org.springframework.validation.Validator;
import org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer;

/**
 * @author Francesco Pitzalis
 */
@Configuration
public class AppWebConfig extends RepositoryRestMvcConfiguration {

	// by calling enable() on the given DefaultServletHandlerConfigurer the
	// DispatcherServlet forwards requests for static resources to the servlet
	// container's default servlet and not try to handle them itself
	@Override
	public void configureDefaultServletHandling(DefaultServletHandlerConfigurer configurer) {
		configurer.enable();
	}

	@Override
	public Validator getValidator() {
		return new PersonValidator();
	}

	@Override
	protected void configureValidatingRepositoryEventListener(ValidatingRepositoryEventListener validatingListener) {
		validatingListener.addValidator("beforeSave", getValidator());
	}
}
