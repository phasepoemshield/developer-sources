/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.quiltmc.config.api.values.CompoundConfigValue
 */
package org.quiltmc.config.api.values;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.quiltmc.config.api.values.CompoundConfigValue;
import org.quiltmc.config.impl.util.ConfigUtils;
import org.quiltmc.config.impl.values.ValueListImpl;

public interface ValueList
extends List,
CompoundConfigValue {
    public static ValueList create(Object object, Object ... objectArray) {
        ArrayList<Object> arrayList;
        ConfigUtils.assertValueType(object);
        Object object2 = object;
        object = arrayList;
        arrayList = new ArrayList<Object>(Arrays.asList(objectArray));
        return new ValueListImpl(object2, (List)object);
    }
}

