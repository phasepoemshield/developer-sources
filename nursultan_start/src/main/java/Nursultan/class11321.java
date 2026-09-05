/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  it.unimi.dsi.fastutil.objects.ObjectArraySet
 */
package Nursultan;

import it.unimi.dsi.fastutil.objects.ObjectArraySet;
import java.util.Collection;

public class class11321<T>
extends ObjectArraySet<T> {
    public boolean add(T t) {
        boolean bl = super.add(t);
        if (!bl) {
            this.N(t);
            bl = super.add(t);
        }
        return bl;
    }

    public boolean addAll(Collection<? extends T> collection) {
        boolean bl = false;
        for (T t : collection) {
            boolean bl2 = super.add(t);
            if (!bl2) {
                this.N(t);
                bl2 = super.add(t);
            }
            if (!bl2) continue;
            bl = true;
        }
        return bl;
    }

    public void N(T t) {
        this.remove(t);
    }
}

