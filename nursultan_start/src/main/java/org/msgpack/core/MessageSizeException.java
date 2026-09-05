/*
 * Decompiled with CFR 0.152.
 */
package org.msgpack.core;

import org.msgpack.core.MessagePackException;

public class MessageSizeException
extends MessagePackException {
    private final long size;

    public MessageSizeException(long l) {
        this.size = l;
    }

    public MessageSizeException(String string, long l) {
        super(string);
        this.size = l;
    }

    public long getSize() {
        return this.size;
    }
}

