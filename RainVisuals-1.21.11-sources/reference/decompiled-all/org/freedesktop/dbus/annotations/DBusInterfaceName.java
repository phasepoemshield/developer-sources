package org.freedesktop.dbus.annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

// $VF: Compiled from DBusInterfaceName.java
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
public @interface DBusInterfaceName {
   String value();
}
