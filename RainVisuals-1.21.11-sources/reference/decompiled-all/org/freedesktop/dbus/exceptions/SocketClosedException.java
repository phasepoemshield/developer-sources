package org.freedesktop.dbus.exceptions;

import java.io.IOException;

// $VF: Compiled from SocketClosedException.java
public class SocketClosedException extends IOException {
   private static final long serialVersionUID = 1L;

   public SocketClosedException() {
   }

   public SocketClosedException(String _message) {
      super(_message);
   }

   public SocketClosedException(String _message, Throwable _cause) {
      super(_message, _cause);
   }

   public SocketClosedException(Throwable _cause) {
      super(_cause);
   }
}
