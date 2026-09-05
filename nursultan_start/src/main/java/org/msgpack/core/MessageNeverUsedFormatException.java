/*
 * Decompiled with CFR 0.152.
 */
package org.msgpack.core;

import org.msgpack.core.MessageFormatException;

public class MessageNeverUsedFormatException
extends MessageFormatException {
    public MessageNeverUsedFormatException(Throwable throwable) {
        super(throwable);
    }

    public MessageNeverUsedFormatException(String string) {
        super(string);
    }

    public MessageNeverUsedFormatException(String string, Throwable throwable) {
        super(string, throwable);
    }
}

