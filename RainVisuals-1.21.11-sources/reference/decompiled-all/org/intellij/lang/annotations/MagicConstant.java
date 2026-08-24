package org.intellij.lang.annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

// $VF: Compiled from MagicConstant.java
@Target({ElementType.FIELD, ElementType.PARAMETER, ElementType.LOCAL_VARIABLE, ElementType.ANNOTATION_TYPE, ElementType.METHOD})
@Retention(RetentionPolicy.SOURCE)
public @interface MagicConstant {
   Class valuesFromClass() default void.class;

   String[] stringValues() default {};

   Class flagsFromClass() default void.class;

   long[] intValues() default {};

   long[] flags() default {};
}
