package org.freedesktop.dbus.annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

// $VF: Compiled from Position.java
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
public @interface Position {
   int value();
}
