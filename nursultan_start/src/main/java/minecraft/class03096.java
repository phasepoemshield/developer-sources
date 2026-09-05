/*
 * Decompiled with CFR 0.152.
 */
package minecraft;

public final class class03096
extends RuntimeException {
    public static final class03096 N = new class03096();

    private class03096() {
        this.setStackTrace(new StackTraceElement[0]);
    }

    @Override
    public synchronized Throwable fillInStackTrace() {
        this.setStackTrace(new StackTraceElement[0]);
        return this;
    }
}

