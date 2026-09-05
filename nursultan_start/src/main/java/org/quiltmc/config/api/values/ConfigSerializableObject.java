/*
 * Decompiled with CFR 0.152.
 */
package org.quiltmc.config.api.values;

import org.quiltmc.config.api.values.ComplexConfigValue;
import org.quiltmc.config.api.values.TrackedValue;

public interface ConfigSerializableObject
extends ComplexConfigValue {
    @Override
    default public void setValue(TrackedValue trackedValue) {
    }

    public ConfigSerializableObject convertFrom(Object var1);

    public Object getRepresentation();
}

