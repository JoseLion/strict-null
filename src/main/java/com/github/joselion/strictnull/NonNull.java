package com.github.joselion.strictnull;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

import javax.annotation.meta.TypeQualifier;
import javax.annotation.meta.TypeQualifierValidator;
import javax.annotation.meta.When;

/**
 * Prevents for the annotated element to be {@code null}. For better results,
 * this annotation is expected to be used with the package-level annotation
 * {@link StrictNullPackage}.
 * 
 * @since v0.0.3
 * @see Nullable
 * @see StrictNullPackage
 */
@Retention(RetentionPolicy.RUNTIME)
@Documented
@TypeQualifier
public @interface NonNull {

  /**
   * Annotatation parameter to define when the annotated element cannot
   * be assigned to {@code null}.
   * 
   * @return when the annotate element can be null
   */
  When when() default When.ALWAYS;

  /**
   * Implemetation of {@link TypeQualifierValidator} for the NonNull
   * annotation
   */
  class Checker implements TypeQualifierValidator<NonNull> {

    @Override
    public When forConstantValue(final NonNull annotation, final Object value) {
      return value == null
        ? When.NEVER
        : When.ALWAYS;
    }
  }
}
