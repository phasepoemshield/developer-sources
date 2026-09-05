/*
 * Decompiled with CFR 0.152.
 */
package org.msgpack.core.buffer;

import java.io.Closeable;
import java.io.IOException;
import org.msgpack.core.buffer.MessageBuffer;

public interface MessageBufferInput
extends Closeable {
    public MessageBuffer next() throws IOException;

    @Override
    public void close() throws IOException;
}

