package org.freedesktop.dbus.spi.message;

import java.io.Closeable;
import java.io.IOException;
import org.freedesktop.dbus.exceptions.DBusException;
import org.freedesktop.dbus.messages.Message;

// $VF: Compiled from IMessageReader.java
public interface IMessageReader extends Closeable {
   boolean isClosed();

   Message readMessage() throws DBusException, IOException;
}
