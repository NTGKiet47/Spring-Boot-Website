package com.eazybytes.eazyschool.annotation;

import com.eazybytes.eazyschool.validations.PasswordStrengthValidator;

import jakarta.validation.Constraint;
import jakarta.validation.Payload;
import java.lang.annotation.*;

@Documented
@Constraint(validatedBy = PasswordStrengthValidator.class)
// @Target allows this interface can be applied both input (methods) and fields
@Target( { ElementType.METHOD, ElementType.FIELD })
// RetentionPolicy.RUNTIME means the annotation information is available even at runtime
@Retention(RetentionPolicy.RUNTIME)
public @interface PasswordValidator {
    String message() default "Please choose a strong password";
    Class<?>[] groups() default {};
    Class<? extends Payload>[] payload() default {};
}
