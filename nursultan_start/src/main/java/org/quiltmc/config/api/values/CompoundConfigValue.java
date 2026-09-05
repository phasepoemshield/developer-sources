/*
 * Decompiled with CFR 0.152.
 */
package org.quiltmc.config.api.values;

import org.quiltmc.config.api.values.ComplexConfigValue;

public interface CompoundConfigValue
extends ComplexConfigValue {
    public Iterable values();

    public Class getType();

    public Object getDefaultValue();

    public void grow();
}

