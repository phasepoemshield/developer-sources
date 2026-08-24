package org.freedesktop.dbus.exceptions;

import java.io.IOException;

// $VF: Compiled from AuthenticationException.java
public class AuthenticationException extends IOException {
   private static final long serialVersionUID = 1L;

   public AuthenticationException(String _message, Throwable _cause) {
      super(_message, _cause);
   }

   public AuthenticationException(String _message) {
      super(_message);
   }
}
