/*
 * Decompiled with CFR 0.152.
 */
package org.msgpack.core;

import java.io.IOException;
import java.util.List;
import org.msgpack.core.MessagePack;
import org.msgpack.core.MessagePacker;
import org.msgpack.core.buffer.ArrayBufferOutput;
import org.msgpack.core.buffer.MessageBuffer;
import org.msgpack.core.buffer.MessageBufferOutput;

public class MessageBufferPacker
extends MessagePacker {
    protected MessageBufferPacker(MessagePack.PackerConfig packerConfig) {
        this(new ArrayBufferOutput(packerConfig.getBufferSize()), packerConfig);
    }

    protected MessageBufferPacker(ArrayBufferOutput arrayBufferOutput, MessagePack.PackerConfig packerConfig) {
        super(arrayBufferOutput, packerConfig);
    }

    @Override
    public MessageBufferOutput reset(MessageBufferOutput messageBufferOutput) throws IOException {
        if (!(messageBufferOutput instanceof ArrayBufferOutput)) {
            throw new IllegalArgumentException("MessageBufferPacker accepts only ArrayBufferOutput");
        }
        return super.reset(messageBufferOutput);
    }

    private ArrayBufferOutput getArrayBufferOut() {
        return (ArrayBufferOutput)this.out;
    }

    @Override
    public void clear() {
        super.clear();
        this.getArrayBufferOut().clear();
    }

    public byte[] toByteArray() {
        try {
            this.flush();
        }
        catch (IOException iOException) {
            throw new RuntimeException(iOException);
        }
        return this.getArrayBufferOut().toByteArray();
    }

    public MessageBuffer toMessageBuffer() {
        try {
            this.flush();
        }
        catch (IOException iOException) {
            throw new RuntimeException(iOException);
        }
        return this.getArrayBufferOut().toMessageBuffer();
    }

    public List<MessageBuffer> toBufferList() {
        try {
            this.flush();
        }
        catch (IOException iOException) {
            throw new RuntimeException(iOException);
        }
        return this.getArrayBufferOut().toBufferList();
    }

    public int getBufferSize() {
        return this.getArrayBufferOut().getSize();
    }
}

