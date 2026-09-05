/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00381
 *  minecraft.class00638
 *  minecraft.class02897
 */
package minecraft;

import java.util.ArrayList;
import java.util.List;
import minecraft.class00381;
import minecraft.class00638;
import minecraft.class02897;

public abstract class class03260<T extends class00638>
implements class00381<T> {
    private final Iterable<class00381<? super T>> N;

    protected class03260(Iterable<class00381<? super T>> iterable) {
        iterable = class03260.N(iterable);
        this.N = iterable;
    }

    private static Iterable N(Iterable iterable) {
        ArrayList arrayList = new ArrayList();
        class03260.N(iterable, arrayList);
        return arrayList;
    }

    private static void N(Iterable iterable, List list) {
        for (class00381 class003812 : iterable) {
            if (class003812 instanceof class03260) {
                class03260.N(((class03260)class003812).N(), list);
                continue;
            }
            list.add(class003812);
        }
    }

    public final Iterable<class00381<? super T>> N() {
        return this.N;
    }

    public abstract class02897<? extends class03260<T>> method_65080();
}

