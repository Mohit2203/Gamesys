package com.gamesys.test.GamesysSpringBootUserRegistration.Validator;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Documented
@Target({ ElementType.TYPE })
@Retention(RetentionPolicy.RUNTIME)
public @interface DateValueMatch {
	
	 String message() default "{com.gamesys.test.GamesysSpringBootUserRegistration.Validator.DateValueMatch.message}";
	 
	    Class<?>[] groups() default {};

}
