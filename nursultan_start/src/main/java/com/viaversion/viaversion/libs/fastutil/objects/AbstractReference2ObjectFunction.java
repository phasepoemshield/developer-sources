/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.viaversion.libs.fastutil.objects.Reference2ObjectFunction
 */
package com.viaversion.viaversion.libs.fastutil.objects;

import com.viaversion.viaversion.libs.fastutil.objects.Reference2ObjectFunction;
import java.io.Serializable;

public abstract class AbstractReference2ObjectFunction<K, V>
implements Reference2ObjectFunction<K, V>,
Serializable {
    private static final long serialVersionUID = -4940583368468432370L;
    protected V defRetValue;

    protected AbstractReference2ObjectFunction() {
    }

    public void defaultReturnValue(V rv) {
        this.defRetValue = rv;
    }

    public V defaultReturnValue() {
        return this.defRetValue;
    }
}

