package org.freedesktop.dbus.annotations;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

// $VF: Compiled from DeprecatedOnDBus.java
@DBusInterfaceName("org.freedesktop.DBus.Deprecated")
@Retention(RetentionPolicy.RUNTIME)
public @interface DeprecatedOnDBus {
   boolean value() default true;
}
