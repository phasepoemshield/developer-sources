/*
 * Decompiled with CFR 0.152.
 */
package org.msgpack.core.buffer;

import org.msgpack.core.Preconditions;
import org.msgpack.core.buffer.MessageBuffer;
import org.msgpack.core.buffer.MessageBufferInput;

public class ArrayBufferInput
implements MessageBufferInput {
    private MessageBuffer buffer;
    private boolean isEmpty;

    public ArrayBufferInput(byte[] byArray, int n, int n2) {
        this(MessageBuffer.wrap(Preconditions.checkNotNull(byArray, "input array is null"), n, n2));
    }

    public ArrayBufferInput(byte[] byArray) {
        this(byArray, 0, byArray.length);
    }

    public ArrayBufferInput(MessageBuffer messageBuffer) {
        this.buffer = messageBuffer;
        this.isEmpty = messageBuffer == null;
    }

    public void reset(byte[] byArray, int n, int n2) {
        this.reset(MessageBuffer.wrap(Preconditions.checkNotNull(byArray, "input array is null"), n, n2));
    }

    public void reset(byte[] byArray) {
        this.reset(MessageBuffer.wrap(Preconditions.checkNotNull(byArray, "input array is null")));
    }

    public MessageBuffer reset(MessageBuffer messageBuffer) {
        MessageBuffer messageBuffer2 = this.buffer;
        this.buffer = messageBuffer;
        this.isEmpty = messageBuffer == null;
        return messageBuffer2;
    }

    @Override
    public MessageBuffer next() {
        if (this.isEmpty) {
            return null;
        }
        this.isEmpty = true;
        return this.buffer;
    }

    @Override
    public void close() {
        this.buffer = null;
        this.isEmpty = true;
    }
}

