/*
 * Decompiled with CFR 0.152.
 */
package org.msgpack.core.buffer;

import java.io.Closeable;
import java.io.Flushable;
import java.io.IOException;
import org.msgpack.core.buffer.MessageBuffer;

public interface MessageBufferOutput
extends Closeable,
Flushable {
    public MessageBuffer next(int var1) throws IOException;

    public void writeBuffer(int var1) throws IOException;

    public void write(byte[] var1, int var2, int var3) throws IOException;

    public void add(byte[] var1, int var2, int var3) throws IOException;
}

