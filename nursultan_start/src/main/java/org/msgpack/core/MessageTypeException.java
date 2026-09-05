/*
 * Decompiled with CFR 0.152.
 */
package org.msgpack.core;

import org.msgpack.core.MessagePackException;

public class MessageTypeException
extends MessagePackException {
    public MessageTypeException() {
    }

    public MessageTypeException(String string) {
        super(string);
    }

    public MessageTypeException(String string, Throwable throwable) {
        super(string, throwable);
    }

    public MessageTypeException(Throwable throwable) {
        super(throwable);
    }
}

