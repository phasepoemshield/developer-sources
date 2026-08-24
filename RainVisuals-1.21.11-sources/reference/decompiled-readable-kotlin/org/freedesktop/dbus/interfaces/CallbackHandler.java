package org.freedesktop.dbus.interfaces;

import org.freedesktop.dbus.exceptions.DBusExecutionException;

// $VF: Compiled from CallbackHandler.java
public interface CallbackHandler<T> {
   void handle(T var1);

   void handleError(DBusExecutionException var1);
}
