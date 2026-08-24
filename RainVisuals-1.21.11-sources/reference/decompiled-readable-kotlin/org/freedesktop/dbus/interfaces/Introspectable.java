package org.freedesktop.dbus.interfaces;

import org.freedesktop.dbus.annotations.DBusInterfaceName;

// $VF: Compiled from Introspectable.java
@DBusInterfaceName("org.freedesktop.DBus.Introspectable")
public interface Introspectable extends DBusInterface {
   String Introspect();
}
