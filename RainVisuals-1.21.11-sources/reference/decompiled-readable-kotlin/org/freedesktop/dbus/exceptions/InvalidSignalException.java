package org.freedesktop.dbus.exceptions;

// $VF: Compiled from InvalidSignalException.java
public class InvalidSignalException extends DBusException {
   private static final long serialVersionUID = 1L;

   public InvalidSignalException(Throwable _cause) {
      super(_cause);
   }

   public InvalidSignalException(Class<?> _clz) {
      super(_clz == null ? "Null is not a signal" : _clz.getName() + " is not a signal");
   }

   public InvalidSignalException(String _message) {
      super(_message);
   }

   public InvalidSignalException(String _cause, Throwable _message) {
      super(_message, _cause);
   }
}
