package io.github.cichlidmc.annotations;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Indicates that a member is exclusive to a specific distribution.
 * This annotation has a retention of RUNTIME, but note that it will
 * never be present in Minecraft classes outside a development environment.
 * @see Dist
 */
@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE, ElementType.FIELD, ElementType.METHOD, ElementType.CONSTRUCTOR, ElementType.ANNOTATION_TYPE})
public @interface Distribution {
	Dist value();
}
