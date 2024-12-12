package com.senai.eli.Validator.Usuario;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import jakarta.validation.Constraint;
import jakarta.validation.Payload;

import java.lang.annotation.ElementType;

@Constraint(validatedBy = UsuarioValidator.class)
@Target({ElementType.FIELD, ElementType.PARAMETER})
@Retention(RetentionPolicy.RUNTIME)
public @interface Usuario {

    String message() default "Usuário Inválido: deve ter entre 8 e 16 caracteres, sem espaços e caracteres especiais";
    Class<?>[] groups() default {};
    Class<? extends Payload>[] payload() default {};


}
