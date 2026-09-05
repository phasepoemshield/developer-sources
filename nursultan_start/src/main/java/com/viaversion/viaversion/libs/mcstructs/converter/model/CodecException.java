/*
 * Decompiled with CFR 0.152.
 */
package com.viaversion.viaversion.libs.mcstructs.converter.model;

public class CodecException
extends RuntimeException {
    public CodecException(Throwable cause) {
        this(cause != null ? cause.getMessage() : null, cause);
    }

    public CodecException(String message, Throwable cause) {
        super(message);
        if (cause != null) {
            super.initCause(cause);
        }
    }

    public CodecException() {
        this(null, null);
    }

    public CodecException(String message) {
        this(message, null);
    }

    @Override
    public void printStackTrace() {
    }

    @Override
    public Throwable fillInStackTrace() {
        return this;
    }
}

