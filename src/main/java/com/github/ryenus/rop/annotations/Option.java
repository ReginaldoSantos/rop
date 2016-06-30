package com.github.ryenus.rop.annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Annotate the {@link Command} fields with Option. A default option value
 * can be directly set on the annotated field.
 */
@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
public @interface Option {
  /**
   * The option keys, like {@literal '-f'}, {@literal '--file'}.
   *
   * Multiple option keys are supported, but the built-in help information
   * would only display the first short option and the first long option
   * if there're many.
   */
  String[] opt();

  /**
   * The description of the option, if too long, it would be wrapped
   * correctly with a 2-space indent starting from the second line.
   */
  String description();

  boolean required() default false;

  /**
   * Hide the option in the help information
   */
  boolean hidden() default false;

  /**
   * Must read the option from terminal, and do not echo input
   */
  boolean secret() default false;

  /**
   * The prompt to display when reading secret from terminal
   */
  String prompt() default "password: ";

}
