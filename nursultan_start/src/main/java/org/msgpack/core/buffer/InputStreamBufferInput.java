/*
 * Decompiled with CFR 0.152.
 */
package org.msgpack.core.buffer;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.channels.FileChannel;
import org.msgpack.core.Preconditions;
import org.msgpack.core.buffer.ChannelBufferInput;
import org.msgpack.core.buffer.MessageBuffer;
import org.msgpack.core.buffer.MessageBufferInput;

public class InputStreamBufferInput
implements MessageBufferInput {
    private InputStream in;
    private final byte[] buffer;

    public static MessageBufferInput newBufferInput(InputStream inputStream) {
        FileChannel fileChannel;
        Preconditions.checkNotNull(inputStream, "InputStream is null");
        if (inputStream instanceof FileInputStream && (fileChannel = ((FileInputStream)inputStream).getChannel()) != null) {
            return new ChannelBufferInput(fileChannel);
        }
        return new InputStreamBufferInput(inputStream);
    }

    public InputStreamBufferInput(InputStream inputStream) {
        this(inputStream, 8192);
    }

    public InputStreamBufferInput(InputStream inputStream, int n) {
        this.in = Preconditions.checkNotNull(inputStream, "input is null");
        this.buffer = new byte[n];
    }

    public InputStream reset(InputStream inputStream) throws IOException {
        InputStream inputStream2 = this.in;
        this.in = inputStream;
        return inputStream2;
    }

    @Override
    public MessageBuffer next() throws IOException {
        int n = this.in.read(this.buffer);
        if (n == -1) {
            return null;
        }
        return MessageBuffer.wrap(this.buffer, 0, n);
    }

    @Override
    public void close() throws IOException {
        this.in.close();
    }
}

