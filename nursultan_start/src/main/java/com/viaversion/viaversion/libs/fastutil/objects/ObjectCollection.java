/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.viaversion.libs.fastutil.Size64
 *  com.viaversion.viaversion.libs.fastutil.objects.ObjectSpliterator
 *  com.viaversion.viaversion.libs.fastutil.objects.ObjectSpliterators
 */
package com.viaversion.viaversion.libs.fastutil.objects;

import com.viaversion.viaversion.libs.fastutil.Size64;
import com.viaversion.viaversion.libs.fastutil.objects.ObjectIterable;
import com.viaversion.viaversion.libs.fastutil.objects.ObjectIterator;
import com.viaversion.viaversion.libs.fastutil.objects.ObjectSpliterator;
import com.viaversion.viaversion.libs.fastutil.objects.ObjectSpliterators;
import java.util.Collection;

public interface ObjectCollection<K>
extends Collection<K>,
ObjectIterable<K> {
    @Override
    public ObjectIterator<K> iterator();

    @Override
    default public ObjectSpliterator<K> spliterator() {
        return ObjectSpliterators.asSpliterator((ObjectIterator)this.iterator(), (long)Size64.sizeOf((Collection)this), (int)64);
    }
}

