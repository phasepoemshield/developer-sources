package org.freedesktop.dbus.connections;

import java.io.IOException;

// $VF: Compiled from IDisconnectCallback.java
public interface IDisconnectCallback {
   default void disconnectOnError(IOException _ex) {
   }

   default void requestedDisconnect(Integer _connectionId) {
   }

   default void exceptionOnTerminate(IOException _ex) {
   }

   default void clientDisconnect() {
   }
}
