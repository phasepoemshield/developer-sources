package org.freedesktop.dbus.interfaces;

import org.freedesktop.dbus.exceptions.DBusException;

// $VF: Compiled from DBusSerializable.java
public interface DBusSerializable {
   Object[] serialize() throws DBusException;
}
