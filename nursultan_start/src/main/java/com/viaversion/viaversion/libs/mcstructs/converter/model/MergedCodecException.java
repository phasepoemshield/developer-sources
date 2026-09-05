/*
 * Decompiled with CFR 0.152.
 */
package com.viaversion.viaversion.libs.mcstructs.converter.model;

import com.viaversion.viaversion.libs.mcstructs.converter.model.CodecException;
import com.viaversion.viaversion.libs.mcstructs.converter.model.Result;
import java.util.Collection;

public class MergedCodecException
extends CodecException {
    private final String error;
    private final Collection<Result<?>> errors;

    public MergedCodecException(String error, Collection<Result<?>> errors) {
        this.error = error;
        this.errors = errors;
        for (Result<?> result : errors) {
            if (!result.isError()) continue;
            this.addSuppressed(result.getError());
        }
    }

    @Override
    public String getMessage() {
        StringBuilder errorMessagesBuilder = new StringBuilder(128);
        for (Result<?> result : this.errors) {
            if (!result.isError()) continue;
            if (errorMessagesBuilder.length() > 0) {
                errorMessagesBuilder.append(',');
            }
            errorMessagesBuilder.append('[').append(result.getError().getMessage()).append(']');
        }
        return this.error + ": " + errorMessagesBuilder;
    }
}

