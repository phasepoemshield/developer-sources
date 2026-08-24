package org.freedesktop.dbus.exceptions;

// $VF: Compiled from InvalidObjectPathException.java
public class InvalidObjectPathException extends DBusException {
   private static final long serialVersionUID = 1L;

   public InvalidObjectPathException(String _message, Throwable _cause) {
      super(_message, _cause);
   }

   public InvalidObjectPathException(String _busName) {
      super("Invalid object path: " + _busName);
   }

   public InvalidObjectPathException(Throwable _cause) {
      super(_cause);
   }

   public InvalidObjectPathException() {
      super((String)null);
   }
}
