package com.github.joselion.strictnull;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import javax.annotation.Nonnull;
import javax.annotation.meta.TypeQualifierDefault;

/**
 * A package-level annotation the adds a qualifier behavior to all fields,
 * methods, and parameters in the annotated package. The default behavior is
 * given by the {@link Nonnull} annotation. To remove this behavior on any
 * field, method, or parameter, use the {@link Nullable} annotation.
 * 
 * @since v0.0.1
 * @see Nullable
 */
@Target(ElementType.PACKAGE)
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Nonnull
@TypeQualifierDefault({ElementType.FIELD, ElementType.METHOD, ElementType.PARAMETER})
public @interface StrictNullPackage {

}
