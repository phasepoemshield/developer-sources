/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.quiltmc.config.api.values.ValueList
 */
package org.quiltmc.config.api;

import java.util.List;
import java.util.function.BiFunction;
import org.quiltmc.config.api.MarshallingUtils;
import org.quiltmc.config.api.MarshallingUtils$1;
import org.quiltmc.config.api.values.ValueList;

final class MarshallingUtils$ListCoercer
implements BiFunction {
    private final BiFunction valueMapCreator;

    private MarshallingUtils$ListCoercer(BiFunction biFunction) {
        this.valueMapCreator = biFunction;
    }

    /* synthetic */ MarshallingUtils$ListCoercer(BiFunction biFunction, MarshallingUtils$1 marshallingUtils$1) {
        this(biFunction);
    }

    public ValueList apply(List objectArray, ValueList valueList) {
        objectArray = objectArray.toArray();
        for (int i = 0; i < objectArray.length; ++i) {
            Object object = valueList.getDefaultValue();
            objectArray[i] = MarshallingUtils.access$200(objectArray[i], object, this.valueMapCreator, this);
        }
        return ValueList.create((Object)valueList.getDefaultValue(), (Object[])objectArray);
    }
}

