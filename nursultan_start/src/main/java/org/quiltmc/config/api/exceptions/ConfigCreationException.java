/*
 * Decompiled with CFR 0.152.
 */
package org.quiltmc.config.api.exceptions;

public final class ConfigCreationException
extends RuntimeException {
    public ConfigCreationException(Throwable throwable) {
        super(throwable);
    }

    public ConfigCreationException(String string, Throwable throwable) {
        super(string, throwable);
    }

    public ConfigCreationException(String string) {
        super(string);
    }

    public ConfigCreationException() {
    }
}

