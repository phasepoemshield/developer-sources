/*
 * Decompiled with CFR 0.152.
 */
package org.msgpack.core.buffer;

import java.io.IOException;
import java.io.OutputStream;
import org.msgpack.core.Preconditions;
import org.msgpack.core.buffer.MessageBuffer;
import org.msgpack.core.buffer.MessageBufferOutput;

public class OutputStreamBufferOutput
implements MessageBufferOutput {
    private OutputStream out;
    private MessageBuffer buffer;

    public OutputStreamBufferOutput(OutputStream outputStream) {
        this(outputStream, 8192);
    }

    public OutputStreamBufferOutput(OutputStream outputStream, int n) {
        this.out = Preconditions.checkNotNull(outputStream, "output is null");
        this.buffer = MessageBuffer.allocate(n);
    }

    public OutputStream reset(OutputStream outputStream) throws IOException {
        OutputStream outputStream2 = this.out;
        this.out = outputStream;
        return outputStream2;
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
        this.write(this.buffer.array(), this.buffer.arrayOffset(), n);
    }

    @Override
    public void write(byte[] byArray, int n, int n2) throws IOException {
        this.out.write(byArray, n, n2);
    }

    @Override
    public void add(byte[] byArray, int n, int n2) throws IOException {
        this.write(byArray, n, n2);
    }

    @Override
    public void close() throws IOException {
        this.out.close();
    }

    @Override
    public void flush() throws IOException {
        this.out.flush();
    }
}

