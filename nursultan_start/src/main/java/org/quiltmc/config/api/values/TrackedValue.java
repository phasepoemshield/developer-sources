/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.quiltmc.config.api.values.ValueKey
 *  org.quiltmc.config.api.values.ValueTreeNode
 *  org.quiltmc.config.impl.builders.TrackedValueBuilderImpl
 *  org.quiltmc.config.impl.tree.TrackedValueImpl
 *  org.quiltmc.config.impl.util.ConfigUtils
 *  org.quiltmc.config.impl.values.ValueKeyImpl
 */
package org.quiltmc.config.api.values;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import java.util.function.Consumer;
import org.quiltmc.config.api.metadata.MetadataType;
import org.quiltmc.config.api.values.TrackedValue$UpdateCallback;
import org.quiltmc.config.api.values.ValueKey;
import org.quiltmc.config.api.values.ValueTreeNode;
import org.quiltmc.config.impl.builders.TrackedValueBuilderImpl;
import org.quiltmc.config.impl.tree.TrackedValueImpl;
import org.quiltmc.config.impl.util.ConfigUtils;
import org.quiltmc.config.impl.values.ValueKeyImpl;

public interface TrackedValue
extends ValueTreeNode {
    public static TrackedValue create(Object object, String object2, String ... object3) {
        ArrayList arrayList;
        ArrayList arrayList2;
        LinkedHashMap linkedHashMap;
        ValueKeyImpl valueKeyImpl;
        ConfigUtils.assertValueType((Object)object);
        Objects.requireNonNull(object2);
        ValueKeyImpl valueKeyImpl2 = valueKeyImpl;
        valueKeyImpl = new ValueKeyImpl((String)object2, object3);
        object2 = linkedHashMap;
        linkedHashMap = new LinkedHashMap(0);
        object3 = arrayList2;
        arrayList2 = new ArrayList(0);
        ArrayList arrayList3 = arrayList;
        arrayList = new ArrayList(0);
        return new TrackedValueImpl((ValueKey)valueKeyImpl2, object, (Map)object2, (List)object3, arrayList3);
    }

    public static TrackedValue create(Object object, String string, Consumer consumer) {
        TrackedValueBuilderImpl trackedValueBuilderImpl;
        Consumer consumer2 = consumer;
        consumer = trackedValueBuilderImpl;
        consumer2.accept(new TrackedValueBuilderImpl(object, string));
        return consumer.build();
    }

    public Object metadata(MetadataType var1);

    public Object value();

    public ValueKey key();

    public Object setValue(Object var1, boolean var2);

    default public Object setValue(Object object) {
        return this.setValue(object, true);
    }

    public Object getDefaultValue();

    public Iterable constraints();

    public Optional checkForFailingConstraints(Object var1);

    public Object getRealValue();

    public void setOverride(Object var1);

    public void removeOverride();

    public boolean isBeingOverridden();

    public void serializeAndInvokeCallbacks();

    public boolean hasMetadata(MetadataType var1);

    public void invokeCallbacks();

    public void registerCallback(TrackedValue$UpdateCallback var1);
}

