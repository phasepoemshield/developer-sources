/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.viaversion.libs.fastutil.objects.AbstractObject2ObjectSortedMap$KeySet
 *  com.viaversion.viaversion.libs.fastutil.objects.AbstractObject2ObjectSortedMap$ValuesCollection
 *  com.viaversion.viaversion.libs.fastutil.objects.Object2ObjectSortedMap
 *  com.viaversion.viaversion.libs.fastutil.objects.ObjectCollection
 *  com.viaversion.viaversion.libs.fastutil.objects.ObjectSortedSet
 */
package com.viaversion.viaversion.libs.fastutil.objects;

import com.viaversion.viaversion.libs.fastutil.objects.AbstractObject2ObjectMap;
import com.viaversion.viaversion.libs.fastutil.objects.AbstractObject2ObjectSortedMap;
import com.viaversion.viaversion.libs.fastutil.objects.Object2ObjectSortedMap;
import com.viaversion.viaversion.libs.fastutil.objects.ObjectCollection;
import com.viaversion.viaversion.libs.fastutil.objects.ObjectSortedSet;

public abstract class AbstractObject2ObjectSortedMap<K, V>
extends AbstractObject2ObjectMap<K, V>
implements Object2ObjectSortedMap<K, V> {
    private static final long serialVersionUID = -1773560792952436569L;

    protected AbstractObject2ObjectSortedMap() {
    }

    @Override
    public ObjectCollection<V> values() {
        return new ValuesCollection(this);
    }

    @Override
    public ObjectSortedSet<K> keySet() {
        return new KeySet(this);
    }
}

