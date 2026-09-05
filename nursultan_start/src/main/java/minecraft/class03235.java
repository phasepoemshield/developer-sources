/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class04995
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import java.util.Arrays;
import java.util.List;
import minecraft.class03195;
import minecraft.class03200;
import minecraft.class03211;
import minecraft.class04995;
import org.jspecify.annotations.Nullable;

abstract class class03235<T> {
    protected final class03195[] y;

    protected class03235(List<class03195> list) {
        this.y = list.toArray(new class03195[0]);
    }

    public String toString() {
        return Arrays.toString((Object[])this.y);
    }

    protected abstract class03211<T> N(long[] var1, @Nullable class03211<T> var2, class03200<T> var3);

    protected long N(long[] lArray) {
        long l = 0L;
        for (int i = 0; i < 7; ++i) {
            l += class04995.y((long)this.y[i].N(lArray[i]));
        }
        return l;
    }
}

