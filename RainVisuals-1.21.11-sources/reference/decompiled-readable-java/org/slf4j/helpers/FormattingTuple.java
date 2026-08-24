/*
 * Decompiled with CFR 0.152.
 */
package org.slf4j.helpers;

public class FormattingTuple {
    private final Object[] argArray;
    public static FormattingTuple NULL = new FormattingTuple(null);
    private final Throwable throwable;
    private final String message;

    public String getMessage() {
        return this.message;
    }

    public FormattingTuple(String message, Object[] argArray, Throwable throwable) {
        this.message = message;
        this.throwable = throwable;
        this.argArray = argArray;
    }

    public Throwable getThrowable() {
        return this.throwable;
    }

    public Object[] getArgArray() {
        return this.argArray;
    }

    public FormattingTuple(String message) {
        this(message, null, null);
    }
}

