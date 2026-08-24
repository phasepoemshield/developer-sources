package org.freedesktop.dbus.interfaces;

// $VF: Compiled from DBusInterface.java
public interface DBusInterface {
   String getObjectPath();

   default boolean isRemote() {
      return false;
   }
}
