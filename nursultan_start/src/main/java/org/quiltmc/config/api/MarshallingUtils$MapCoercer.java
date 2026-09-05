/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.quiltmc.config.api.values.ValueMap
 *  org.quiltmc.config.api.values.ValueMap$Builder
 */
package org.quiltmc.config.api;

import java.util.function.BiFunction;
import org.quiltmc.config.api.MarshallingUtils;
import org.quiltmc.config.api.MarshallingUtils$1;
import org.quiltmc.config.api.MarshallingUtils$ValueMapCreator;
import org.quiltmc.config.api.values.ValueMap;

final class MarshallingUtils$MapCoercer
implements BiFunction {
    private final MarshallingUtils$ValueMapCreator creator;

    /* synthetic */ MarshallingUtils$MapCoercer(MarshallingUtils$ValueMapCreator valueMapCreator, MarshallingUtils$1 marshallingUtils$1) {
        this(valueMapCreator);
    }

    private MarshallingUtils$MapCoercer(MarshallingUtils$ValueMapCreator valueMapCreator) {
        this.creator = valueMapCreator;
    }

    public ValueMap apply(Object object2, ValueMap valueMap) {
        ValueMap.Builder builder = ValueMap.builder((Object)valueMap.getDefaultValue());
        this.creator.create(object2, (string, object) -> {
            MarshallingUtils$MapCoercer marshallingUtils$MapCoercer = object2;
            Object object2 = valueMap.getDefaultValue();
            builder.put(string, MarshallingUtils.coerce(object, object2, marshallingUtils$MapCoercer.creator));
        });
        return builder.build();
    }
}

