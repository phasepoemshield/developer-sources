/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.viaversion.libs.fastutil.objects.ObjectIterator
 *  com.viaversion.viaversion.libs.fastutil.objects.ReferenceCollection
 */
package com.viaversion.viaversion.libs.fastutil.objects;

import com.viaversion.viaversion.libs.fastutil.objects.ObjectIterator;
import com.viaversion.viaversion.libs.fastutil.objects.ReferenceCollection;
import java.util.AbstractCollection;

public abstract class AbstractReferenceCollection<K>
extends AbstractCollection<K>
implements ReferenceCollection<K> {
    protected AbstractReferenceCollection() {
    }

    @Override
    public String toString() {
        StringBuilder s = new StringBuilder();
        ObjectIterator<K> i = this.iterator();
        int n = this.size();
        boolean first = true;
        s.append("{");
        while (n-- != 0) {
            if (first) {
                first = false;
            } else {
                s.append(", ");
            }
            Object k = i.next();
            if (this == k) {
                s.append("(this collection)");
                continue;
            }
            s.append(String.valueOf(k));
        }
        s.append("}");
        return s.toString();
    }

    @Override
    public abstract ObjectIterator<K> iterator();
}

