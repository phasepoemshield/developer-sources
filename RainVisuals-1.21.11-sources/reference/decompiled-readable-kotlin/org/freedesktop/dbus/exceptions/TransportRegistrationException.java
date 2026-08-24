package org.freedesktop.dbus.exceptions;

// $VF: Compiled from TransportRegistrationException.java
public class TransportRegistrationException extends RuntimeException {
   private static final long serialVersionUID = 1L;

   public TransportRegistrationException(String _cause, Throwable _message) {
      super(_message, _cause);
   }

   public TransportRegistrationException(String _message) {
      super(_message);
   }
}
