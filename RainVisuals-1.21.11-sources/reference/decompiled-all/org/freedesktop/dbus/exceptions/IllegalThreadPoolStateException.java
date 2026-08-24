package org.freedesktop.dbus.exceptions;

// $VF: Compiled from IllegalThreadPoolStateException.java
public class IllegalThreadPoolStateException extends IllegalStateException {
   private static final long serialVersionUID = 1L;

   public IllegalThreadPoolStateException(String _cause, Throwable _message) {
      super(_message, _cause);
   }

   public IllegalThreadPoolStateException(String _s) {
      super(_s);
   }

   public IllegalThreadPoolStateException(Throwable _cause) {
      super(_cause);
   }

   public IllegalThreadPoolStateException() {
   }
}
