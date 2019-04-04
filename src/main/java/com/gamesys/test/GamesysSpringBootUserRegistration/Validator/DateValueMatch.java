package com.gamesys.test.GamesysSpringBootUserRegistration.Validator;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import javax.validation.Constraint;
import javax.validation.Payload;

@Documented
@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
@Constraint(validatedBy = DateValidatorImpl.class)
public @interface DateValueMatch {

	String message() default "{com.gamesys.test.GamesysSpringBootUserRegistration.Validator.DateValueMatch.message}";

	Class<?>[] groups() default {};

	Class<? extends Payload>[] payload() default {};
}
