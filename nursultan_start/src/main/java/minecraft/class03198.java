/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import java.util.List;
import minecraft.class03195;
import minecraft.class03197;
import minecraft.class03200;
import minecraft.class03211;
import minecraft.class03235;
import org.jspecify.annotations.Nullable;

final class class03198<T>
extends class03235<T> {
    final class03235<T>[] N;

    protected class03198(List<? extends class03235<T>> list) {
        this(class03197.y(list), list);
    }

    protected class03198(List<class03195> list, List<? extends class03235<T>> list2) {
        super(list);
        this.N = list2.toArray(new class03235[0]);
    }

    @Override
    protected class03211<T> N(long[] lArray, @Nullable class03211<T> class032112, class03200<T> class032002) {
        long l = class032112 == null ? Long.MAX_VALUE : class032002.distance(class032112, lArray);
        class03211<T> class032113 = class032112;
        for (class03235<T> class032352 : this.N) {
            long l2;
            long l3 = class032002.distance(class032352, lArray);
            if (l <= l3) continue;
            class03211<T> class032114 = class032352.N(lArray, class032113, class032002);
            long l4 = l2 = class032352 == class032114 ? l3 : class032002.distance(class032114, lArray);
            if (l <= l2) continue;
            l = l2;
            class032113 = class032114;
        }
        return class032113;
    }
}

