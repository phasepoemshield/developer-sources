package org.freedesktop.dbus.interfaces;

import org.freedesktop.dbus.messages.DBusSignal;

// $VF: Compiled from DBusSigHandler.java
public interface DBusSigHandler<T extends DBusSignal> {
   void handle(T var1);
}
