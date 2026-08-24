/*
 * Decompiled with CFR 0.152.
 */
package org.freedesktop.dbus.spi.message;

import java.io.Closeable;
import java.io.IOException;
import org.freedesktop.dbus.exceptions.DBusException;
import org.freedesktop.dbus.messages.Message;

public interface IMessageReader
extends Closeable {
    public boolean isClosed();

    public Message readMessage() throws DBusException, IOException;
}

