package org.freedesktop.dbus.annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

// $VF: Compiled from MethodError.java
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@DBusInterfaceName("org.freedesktop.DBus.Method.Error")
public @interface MethodError {
   String value();
}
