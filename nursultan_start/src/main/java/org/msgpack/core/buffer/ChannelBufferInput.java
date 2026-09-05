/*
 * Decompiled with CFR 0.152.
 */
package org.msgpack.core.buffer;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.ReadableByteChannel;
import org.msgpack.core.Preconditions;
import org.msgpack.core.buffer.MessageBuffer;
import org.msgpack.core.buffer.MessageBufferInput;

public class ChannelBufferInput
implements MessageBufferInput {
    private ReadableByteChannel channel;
    private final MessageBuffer buffer;

    public ChannelBufferInput(ReadableByteChannel readableByteChannel) {
        this(readableByteChannel, 8192);
    }

    public ChannelBufferInput(ReadableByteChannel readableByteChannel, int n) {
        this.channel = Preconditions.checkNotNull(readableByteChannel, "input channel is null");
        Preconditions.checkArgument(n > 0, "buffer size must be > 0: " + n);
        this.buffer = MessageBuffer.allocate(n);
    }

    public ReadableByteChannel reset(ReadableByteChannel readableByteChannel) throws IOException {
        ReadableByteChannel readableByteChannel2 = this.channel;
        this.channel = readableByteChannel;
        return readableByteChannel2;
    }

    @Override
    public MessageBuffer next() throws IOException {
        ByteBuffer byteBuffer = this.buffer.sliceAsByteBuffer();
        int n = this.channel.read(byteBuffer);
        if (n == -1) {
            return null;
        }
        byteBuffer.flip();
        return this.buffer.slice(0, byteBuffer.limit());
    }

    @Override
    public void close() throws IOException {
        this.channel.close();
    }
}

