/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  fun.crashsystem.jdrpc.protocol.Frame
 */
package fun.crashsystem.jdrpc.connection;

import fun.crashsystem.jdrpc.protocol.Frame;
import java.io.Closeable;
import java.io.IOException;

public interface Connection
extends Closeable {
    public boolean isOpen();

    public void write(Frame var1) throws IOException;

    public Frame read() throws IOException;
}

