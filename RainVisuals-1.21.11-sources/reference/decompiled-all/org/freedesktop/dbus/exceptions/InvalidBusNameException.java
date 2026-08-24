package org.freedesktop.dbus.exceptions;

// $VF: Compiled from InvalidBusNameException.java
public class InvalidBusNameException extends DBusException {
   private static final long serialVersionUID = 1L;

   public InvalidBusNameException(String _message, Throwable _cause) {
      super(_message, _cause);
   }

   public InvalidBusNameException() {
      super((String)null);
   }

   public InvalidBusNameException(Throwable _cause) {
      super(_cause);
   }

   public InvalidBusNameException(String _busName) {
      super("Invalid bus name: " + _busName);
   }
}
