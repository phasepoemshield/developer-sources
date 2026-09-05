/*
 * Decompiled with CFR 0.152.
 */
package org.msgpack.core;

import org.msgpack.core.MessageTypeException;

public class MessageTypeCastException
extends MessageTypeException {
    public MessageTypeCastException() {
    }

    public MessageTypeCastException(String string) {
        super(string);
    }

    public MessageTypeCastException(String string, Throwable throwable) {
        super(string, throwable);
    }

    public MessageTypeCastException(Throwable throwable) {
        super(throwable);
    }
}

