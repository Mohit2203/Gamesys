package com.gamesys.test.GamesysSpringBootUserRegistration;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class GamesysSpringBootUserRegistrationApplication {

	/*
	 * @RequestMapping("/hello") public String sayHello() { return
	 * "Hello Java Code Geeks!"; }
	 */
	/*
	 * @Bean public MessageSource messageSource() {
	 * ReloadableResourceBundleMessageSource messageSource = new
	 * ReloadableResourceBundleMessageSource();
	 * 
	 * messageSource.setBasename("classpath:messages");
	 * messageSource.setDefaultEncoding("UTF-8"); return messageSource; }
	 * 
	 * 
	 * @Bean public LocalValidatorFactoryBean getValidator() {
	 * LocalValidatorFactoryBean bean = new LocalValidatorFactoryBean();
	 * bean.setValidationMessageSource(messageSource()); return bean; }
	 */
	public static void main(String[] args) {
		SpringApplication.run(GamesysSpringBootUserRegistrationApplication.class, args);
	}

}
