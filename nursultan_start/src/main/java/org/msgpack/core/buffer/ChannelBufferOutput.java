/*
 * Decompiled with CFR 0.152.
 */
package org.msgpack.core.buffer;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.WritableByteChannel;
import org.msgpack.core.Preconditions;
import org.msgpack.core.buffer.MessageBuffer;
import org.msgpack.core.buffer.MessageBufferOutput;

public class ChannelBufferOutput
implements MessageBufferOutput {
    private WritableByteChannel channel;
    private MessageBuffer buffer;

    public ChannelBufferOutput(WritableByteChannel writableByteChannel) {
        this(writableByteChannel, 8192);
    }

    public ChannelBufferOutput(WritableByteChannel writableByteChannel, int n) {
        this.channel = Preconditions.checkNotNull(writableByteChannel, "output channel is null");
        this.buffer = MessageBuffer.allocate(n);
    }

    public WritableByteChannel reset(WritableByteChannel writableByteChannel) throws IOException {
        WritableByteChannel writableByteChannel2 = this.channel;
        this.channel = writableByteChannel;
        return writableByteChannel2;
    }

    @Override
    public MessageBuffer next(int n) throws IOException {
        if (this.buffer.size() < n) {
            this.buffer = MessageBuffer.allocate(n);
        }
        return this.buffer;
    }

    @Override
    public void writeBuffer(int n) throws IOException {
        ByteBuffer byteBuffer = this.buffer.sliceAsByteBuffer(0, n);
        while (byteBuffer.hasRemaining()) {
            this.channel.write(byteBuffer);
        }
    }

    @Override
    public void write(byte[] byArray, int n, int n2) throws IOException {
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray, n, n2);
        while (byteBuffer.hasRemaining()) {
            this.channel.write(byteBuffer);
        }
    }

    @Override
    public void add(byte[] byArray, int n, int n2) throws IOException {
        this.write(byArray, n, n2);
    }

    @Override
    public void close() throws IOException {
        this.channel.close();
    }

    @Override
    public void flush() throws IOException {
    }
}

