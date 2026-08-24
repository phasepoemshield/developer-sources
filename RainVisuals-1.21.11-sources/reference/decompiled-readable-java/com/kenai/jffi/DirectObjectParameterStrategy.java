/*
 * Decompiled with CFR 0.152.
 */
package com.kenai.jffi;

import com.kenai.jffi.ObjectParameterStrategy;
import com.kenai.jffi.ObjectParameterType;

public abstract class DirectObjectParameterStrategy
extends ObjectParameterStrategy {
    public final Object object(Object parameter) {
        throw new RuntimeException("direct object " + (parameter != null ? parameter.getClass() : "null") + " has no array");
    }

    public final int length(Object parameter) {
        throw new RuntimeException("direct object " + (parameter != null ? parameter.getClass() : "null") + "has no length");
    }

    public final int offset(Object parameter) {
        throw new RuntimeException("direct object " + (parameter != null ? parameter.getClass() : "null") + "has no offset");
    }

    public abstract long getAddress(Object var1);

    public DirectObjectParameterStrategy(boolean isDirect, ObjectParameterType parameterType) {
        super(isDirect, parameterType);
    }
}

