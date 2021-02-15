package com.github.joselion.strictnull;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import javax.annotation.Nonnull;
import javax.annotation.meta.TypeQualifierNickname;

/**
 * Prevents for the annotated element to be {@code null}. For better results,
 * this annotation is expected to be used with the package-level annotation
 * {@link StrictNullPackage}.
 * 
 * @since v0.0.3
 * @see Nullable
 * @see StrictNullPackage
 */
@Target({ElementType.METHOD, ElementType.PARAMETER, ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Nonnull
@TypeQualifierNickname
public @interface NonNull {

}
