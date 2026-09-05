/*
 * Decompiled with CFR 0.152.
 */
package org.quiltmc.config.api.exceptions;

public final class ConfigFieldException
extends RuntimeException {
    public ConfigFieldException(Throwable throwable) {
        super(throwable);
    }

    public ConfigFieldException(String string, Throwable throwable) {
        super(string, throwable);
    }

    public ConfigFieldException(String string) {
        super(string);
    }

    public ConfigFieldException() {
    }
}

