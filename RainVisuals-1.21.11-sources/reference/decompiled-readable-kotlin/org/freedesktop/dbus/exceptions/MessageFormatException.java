package org.freedesktop.dbus.exceptions;

import org.freedesktop.dbus.interfaces.NonFatalException;

// $VF: Compiled from MessageFormatException.java
public class MessageFormatException extends DBusException implements NonFatalException {
   private static final long serialVersionUID = -4806500517504320924L;

   public MessageFormatException(String _message) {
      super(_message);
   }
}
