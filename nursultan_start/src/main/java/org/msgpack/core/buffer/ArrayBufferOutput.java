/*
 * Decompiled with CFR 0.152.
 */
package org.msgpack.core.buffer;

import java.util.ArrayList;
import java.util.List;
import org.msgpack.core.buffer.MessageBuffer;
import org.msgpack.core.buffer.MessageBufferOutput;

public class ArrayBufferOutput
implements MessageBufferOutput {
    private final List<MessageBuffer> list;
    private final int bufferSize;
    private MessageBuffer lastBuffer;

    public ArrayBufferOutput() {
        this(8192);
    }

    public ArrayBufferOutput(int n) {
        this.bufferSize = n;
        this.list = new ArrayList<MessageBuffer>();
    }

    public int getSize() {
        int n = 0;
        for (MessageBuffer messageBuffer : this.list) {
            n += messageBuffer.size();
        }
        return n;
    }

    public byte[] toByteArray() {
        byte[] byArray = new byte[this.getSize()];
        int n = 0;
        for (MessageBuffer messageBuffer : this.list) {
            messageBuffer.getBytes(0, byArray, n, messageBuffer.size());
            n += messageBuffer.size();
        }
        return byArray;
    }

    public MessageBuffer toMessageBuffer() {
        if (this.list.size() == 1) {
            return this.list.get(0);
        }
        if (this.list.isEmpty()) {
            return MessageBuffer.allocate(0);
        }
        return MessageBuffer.wrap(this.toByteArray());
    }

    public List<MessageBuffer> toBufferList() {
        return new ArrayList<MessageBuffer>(this.list);
    }

    public void clear() {
        this.list.clear();
    }

    @Override
    public MessageBuffer next(int n) {
        MessageBuffer messageBuffer;
        if (this.lastBuffer != null && this.lastBuffer.size() > n) {
            return this.lastBuffer;
        }
        int n2 = Math.max(this.bufferSize, n);
        this.lastBuffer = messageBuffer = MessageBuffer.allocate(n2);
        return messageBuffer;
    }

    @Override
    public void writeBuffer(int n) {
        this.list.add(this.lastBuffer.slice(0, n));
        this.lastBuffer = this.lastBuffer.size() - n > this.bufferSize / 4 ? this.lastBuffer.slice(n, this.lastBuffer.size() - n) : null;
    }

    @Override
    public void write(byte[] byArray, int n, int n2) {
        MessageBuffer messageBuffer = MessageBuffer.allocate(n2);
        messageBuffer.putBytes(0, byArray, n, n2);
        this.list.add(messageBuffer);
    }

    @Override
    public void add(byte[] byArray, int n, int n2) {
        MessageBuffer messageBuffer = MessageBuffer.wrap(byArray, n, n2);
        this.list.add(messageBuffer);
    }

    @Override
    public void close() {
    }

    @Override
    public void flush() {
    }
}

