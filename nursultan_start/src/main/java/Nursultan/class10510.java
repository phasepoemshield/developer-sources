/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.AbstractIterator
 *  minecraft.class03556
 *  minecraft.class05370
 *  minecraft.class05377
 */
package Nursultan;

import com.google.common.collect.AbstractIterator;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.function.Predicate;
import minecraft.class03556;
import minecraft.class05370;
import minecraft.class05377;

public class class10510
extends AbstractIterator<class05377> {
    private Iterator<class05377> L = Collections.emptyIterator();
    final /* synthetic */ Iterator N;
    final /* synthetic */ Predicate y;

    public class10510(class05370 class053702, Iterator iterator, Predicate predicate) {
        this.N = iterator;
        this.y = predicate;
    }

    protected class05377 computeNext() {
        while (true) {
            if (this.L.hasNext()) {
                return this.L.next();
            }
            if (!this.N.hasNext()) break;
            Map.Entry entry = (Map.Entry)this.N.next();
            if (!this.y.test((class03556)entry.getKey())) continue;
            this.L = ((Set)entry.getValue()).iterator();
        }
        return (class05377)this.endOfData();
    }
}

