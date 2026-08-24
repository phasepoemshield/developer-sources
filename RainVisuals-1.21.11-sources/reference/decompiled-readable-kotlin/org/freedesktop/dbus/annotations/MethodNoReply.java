package org.freedesktop.dbus.annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

// $VF: Compiled from MethodNoReply.java
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@DBusInterfaceName("org.freedesktop.DBus.Method.NoReply")
public @interface MethodNoReply {
   boolean value() default true;
}
