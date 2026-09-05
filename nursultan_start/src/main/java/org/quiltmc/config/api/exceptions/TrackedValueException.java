/*
 * Decompiled with CFR 0.152.
 */
package org.quiltmc.config.api.exceptions;

public final class TrackedValueException
extends RuntimeException {
    public TrackedValueException(Throwable throwable) {
        super(throwable);
    }

    public TrackedValueException(String string, Throwable throwable) {
        super(string, throwable);
    }

    public TrackedValueException(String string) {
        super(string);
    }

    public TrackedValueException() {
    }
}

