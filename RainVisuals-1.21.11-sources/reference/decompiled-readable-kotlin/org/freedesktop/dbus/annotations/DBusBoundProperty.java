package org.freedesktop.dbus.annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

// $VF: Compiled from DBusBoundProperty.java
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
public @interface DBusBoundProperty {
   DBusProperty.Access access() default DBusProperty.Access.READ_WRITE;

   String name() default "";

   Class<?> type() default Void.class;
}
