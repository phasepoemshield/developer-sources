package org.freedesktop.dbus.spi.message;

import java.io.Closeable;
import java.io.IOException;
import org.freedesktop.dbus.messages.Message;

// $VF: Compiled from IMessageWriter.java
public interface IMessageWriter extends Closeable {
   boolean isClosed();

   void writeMessage(Message var1) throws IOException;
}
