/*
 * Decompiled with CFR 0.152.
 */
package org.quiltmc.config.impl;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import org.quiltmc.config.impl.util.ImmutableIterable;

public class StringIterator
implements Iterable {
    private final List strings;

    public StringIterator(List list) {
        ArrayList arrayList;
        Iterable iterable = arrayList;
        arrayList = new ArrayList(list);
        v1.strings = iterable;
    }

    public boolean equals(Object object) {
        if (stringIterator2 == object) {
            return true;
        }
        if (object != null && stringIterator2.getClass() == object.getClass()) {
            StringIterator stringIterator = stringIterator2;
            StringIterator stringIterator2 = (StringIterator)object;
            return Objects.equals(stringIterator.strings, stringIterator2.strings);
        }
        return false;
    }

    public int hashCode() {
        Iterable iterable = iterable.strings;
        return Objects.hash(iterable);
    }

    public Iterator iterator() {
        return new ImmutableIterable(this.strings).iterator();
    }
}

