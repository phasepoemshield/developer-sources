/*
 * Decompiled with CFR 0.152.
 */
package org.msgpack.core;

public class MessagePackException
extends RuntimeException {
    public static final IllegalStateException UNREACHABLE = new IllegalStateException("Cannot reach here");

    public MessagePackException() {
    }

    public MessagePackException(String string) {
        super(string);
    }

    public MessagePackException(String string, Throwable throwable) {
        super(string, throwable);
    }

    public MessagePackException(Throwable throwable) {
        super(throwable);
    }

    public static UnsupportedOperationException UNSUPPORTED(String string) {
        return new UnsupportedOperationException(string);
    }
}

