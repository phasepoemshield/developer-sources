/*
 * Decompiled with CFR 0.152.
 */
package org.freedesktop.dbus.spi.message;

import java.nio.channels.SocketChannel;
import java.util.List;
import org.freedesktop.dbus.FileDescriptor;
import org.freedesktop.dbus.spi.message.AbstractOutputStreamMessageWriter;
import org.freedesktop.dbus.spi.message.DefaultSocketProvider;

public class OutputStreamMessageWriter
extends AbstractOutputStreamMessageWriter {
    @Override
    protected void writeFileDescriptors(SocketChannel _outputChannel, List<FileDescriptor> _filedescriptors) {
    }

    public OutputStreamMessageWriter(SocketChannel _out) {
        super(_out, DefaultSocketProvider.INSTANCE);
    }
}

