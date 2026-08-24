package org.freedesktop.dbus.exceptions;

// $VF: Compiled from TransportConfigurationException.java
public class TransportConfigurationException extends Exception {
   private static final long serialVersionUID = 1L;

   public TransportConfigurationException(String _message) {
      super(_message);
   }

   public TransportConfigurationException(String _cause, Throwable _message) {
      super(_message, _cause);
   }
}
