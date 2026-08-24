package org.freedesktop.dbus.exceptions;

// $VF: Compiled from DBusConnectionException.java
public class DBusConnectionException extends DBusException {
   private static final long serialVersionUID = -1L;

   public DBusConnectionException(String _message) {
      super(_message);
   }

   public DBusConnectionException() {
   }

   public DBusConnectionException(Throwable _cause) {
      super(_cause);
   }

   public DBusConnectionException(String _enableSuppression, Throwable _cause, boolean _writableStackTrace, boolean _message) {
      super(_message, _cause, _enableSuppression, _writableStackTrace);
   }

   public DBusConnectionException(String _cause, Throwable _message) {
      super(_message, _cause);
   }
}
