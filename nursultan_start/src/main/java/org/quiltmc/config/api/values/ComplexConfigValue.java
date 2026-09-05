/*
 * Decompiled with CFR 0.152.
 */
package org.quiltmc.config.api.values;

import org.quiltmc.config.api.values.TrackedValue;

public interface ComplexConfigValue {
    public void setValue(TrackedValue var1);

    public ComplexConfigValue copy();
}

