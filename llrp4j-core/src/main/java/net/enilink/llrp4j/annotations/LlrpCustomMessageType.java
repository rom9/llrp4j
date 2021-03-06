package net.enilink.llrp4j.annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(value = RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
public @interface LlrpCustomMessageType {
	long vendor();

	int subType();

	Class<?>responseType() default void.class;

	int reserved() default 0;
}
