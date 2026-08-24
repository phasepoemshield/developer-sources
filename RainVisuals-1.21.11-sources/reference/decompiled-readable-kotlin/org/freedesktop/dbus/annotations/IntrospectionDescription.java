package org.freedesktop.dbus.annotations;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

// $VF: Compiled from IntrospectionDescription.java
@Retention(RetentionPolicy.RUNTIME)
@DBusInterfaceName("org.freedesktop.DBus.Description")
public @interface IntrospectionDescription {
   String value();
}
