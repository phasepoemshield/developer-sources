/*
 * Decompiled with CFR 0.152.
 */
package org.msgpack.core;

import org.msgpack.core.MessagePackException;

public class MessageFormatException
extends MessagePackException {
    public MessageFormatException(Throwable throwable) {
        super(throwable);
    }

    public MessageFormatException(String string) {
        super(string);
    }

    public MessageFormatException(String string, Throwable throwable) {
        super(string, throwable);
    }
}

