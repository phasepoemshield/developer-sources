/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.quiltmc.config.api.values.ValueList
 *  org.quiltmc.config.api.values.ValueMap$TrackedBuilder
 *  org.quiltmc.config.impl.builders.ValueMapBuilderImpl$TrackedValueMapBuilderImpl
 *  org.quiltmc.config.impl.tree.TrackedValueImpl
 *  org.quiltmc.config.impl.util.ConfigUtils
 */
package org.quiltmc.config.api;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import org.quiltmc.config.api.values.TrackedValue;
import org.quiltmc.config.api.values.ValueList;
import org.quiltmc.config.api.values.ValueMap;
import org.quiltmc.config.impl.builders.ValueMapBuilderImpl;
import org.quiltmc.config.impl.tree.TrackedValueImpl;
import org.quiltmc.config.impl.util.ConfigUtils;

public class ReflectiveConfig$Section {
    public final TrackedValue value(Object object) {
        ArrayList arrayList;
        ArrayList arrayList2;
        LinkedHashMap linkedHashMap;
        ConfigUtils.assertValueType((Object)object);
        LinkedHashMap linkedHashMap2 = linkedHashMap;
        linkedHashMap = new LinkedHashMap(0);
        ArrayList arrayList3 = arrayList2;
        arrayList2 = new ArrayList(0);
        ArrayList arrayList4 = arrayList;
        arrayList = new ArrayList(0);
        return new TrackedValueImpl(null, object, (Map)linkedHashMap2, arrayList3, arrayList4);
    }

    public final ValueMap.TrackedBuilder map(Object object) {
        return new ValueMapBuilderImpl.TrackedValueMapBuilderImpl(object, this::value);
    }

    public final TrackedValue list(Object object, Object ... objectArray) {
        return this.value(ValueList.create((Object)object, (Object[])objectArray));
    }
}

