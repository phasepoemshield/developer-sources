/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.viaversion.libs.fastutil.objects.ObjectIterator
 *  com.viaversion.viaversion.libs.fastutil.objects.ReferenceSet
 */
package com.viaversion.viaversion.libs.fastutil.objects;

import com.viaversion.viaversion.libs.fastutil.objects.AbstractReferenceCollection;
import com.viaversion.viaversion.libs.fastutil.objects.ObjectIterator;
import com.viaversion.viaversion.libs.fastutil.objects.ReferenceSet;
import java.util.Set;

public abstract class AbstractReferenceSet<K>
extends AbstractReferenceCollection<K>
implements Cloneable,
ReferenceSet<K> {
    protected AbstractReferenceSet() {
    }

    @Override
    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof Set)) {
            return false;
        }
        Set s = (Set)o;
        if (s.size() != this.size()) {
            return false;
        }
        return this.containsAll(s);
    }

    @Override
    public int hashCode() {
        int h = 0;
        int n = this.size();
        ObjectIterator<K> i = this.iterator();
        while (n-- != 0) {
            Object k = i.next();
            h += System.identityHashCode(k);
        }
        return h;
    }

    @Override
    public abstract ObjectIterator<K> iterator();
}

