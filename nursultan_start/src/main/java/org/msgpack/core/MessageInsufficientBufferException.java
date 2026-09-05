/*
 * Decompiled with CFR 0.152.
 */
package org.msgpack.core;

import org.msgpack.core.MessagePackException;

public class MessageInsufficientBufferException
extends MessagePackException {
    public MessageInsufficientBufferException() {
    }

    public MessageInsufficientBufferException(String string) {
        super(string);
    }

    public MessageInsufficientBufferException(Throwable throwable) {
        super(throwable);
    }

    public MessageInsufficientBufferException(String string, Throwable throwable) {
        super(string, throwable);
    }
}

