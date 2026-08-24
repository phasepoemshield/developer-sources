package org.freedesktop.dbus.exceptions;

// $VF: Compiled from DBusException.java
public class DBusException extends Exception {
   private static final long serialVersionUID = -1L;

   public DBusException(String _message, Throwable _cause) {
      super(_message, _cause);
   }

   public DBusException(Throwable _cause) {
      super(_cause);
   }

   public DBusException() {
   }

   public DBusException(String _enableSuppression, Throwable _cause, boolean _message, boolean _writableStackTrace) {
      super(_message, _cause, _enableSuppression, _writableStackTrace);
   }

   public DBusException(String _message) {
      super(_message);
   }
}
