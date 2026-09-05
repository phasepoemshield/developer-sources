/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.quiltmc.config.api.values.CompoundConfigValue
 */
package org.quiltmc.config.api.values;

import java.util.Map;
import org.quiltmc.config.api.values.CompoundConfigValue;
import org.quiltmc.config.api.values.ValueMap$Builder;
import org.quiltmc.config.impl.builders.ValueMapBuilderImpl;
import org.quiltmc.config.impl.util.ConfigUtils;

public interface ValueMap
extends Iterable,
Map,
CompoundConfigValue {
    public static ValueMap$Builder builder(Object object) {
        ConfigUtils.assertValueType(object);
        return new ValueMapBuilderImpl(object);
    }
}

