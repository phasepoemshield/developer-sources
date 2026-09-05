/*
 * Decompiled with CFR 0.152.
 */
package org.quiltmc.config.api.exceptions;

public final class ConfigParseException
extends RuntimeException {
    public ConfigParseException(Throwable throwable) {
        super(throwable);
    }

    public ConfigParseException(String string, Throwable throwable) {
        super(string, throwable);
    }

    public ConfigParseException(String string) {
        super(string);
    }

    public ConfigParseException() {
    }
}

