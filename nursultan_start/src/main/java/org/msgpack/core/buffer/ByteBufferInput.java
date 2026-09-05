/*
 * Decompiled with CFR 0.152.
 */
package org.msgpack.core.buffer;

import java.nio.ByteBuffer;
import org.msgpack.core.Preconditions;
import org.msgpack.core.buffer.MessageBuffer;
import org.msgpack.core.buffer.MessageBufferInput;

public class ByteBufferInput
implements MessageBufferInput {
    private ByteBuffer input;
    private boolean isRead = false;

    public ByteBufferInput(ByteBuffer byteBuffer) {
        this.input = Preconditions.checkNotNull(byteBuffer, "input ByteBuffer is null").slice();
    }

    public ByteBuffer reset(ByteBuffer byteBuffer) {
        ByteBuffer byteBuffer2 = this.input;
        this.input = Preconditions.checkNotNull(byteBuffer, "input ByteBuffer is null").slice();
        this.isRead = false;
        return byteBuffer2;
    }

    @Override
    public MessageBuffer next() {
        if (this.isRead) {
            return null;
        }
        MessageBuffer messageBuffer = MessageBuffer.wrap(this.input);
        this.isRead = true;
        return messageBuffer;
    }

    @Override
    public void close() {
    }
}

