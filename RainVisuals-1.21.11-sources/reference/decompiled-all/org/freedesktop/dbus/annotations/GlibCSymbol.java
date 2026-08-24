package org.freedesktop.dbus.annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

// $VF: Compiled from GlibCSymbol.java
@DBusInterfaceName("org.freedesktop.DBus.GLib.CSymbol")
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
public @interface GlibCSymbol {
   String value();
}
