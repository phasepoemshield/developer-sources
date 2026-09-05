/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.Dynamic
 *  minecraft.class03316
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import com.mojang.serialization.Dynamic;
import java.util.List;
import minecraft.class03316;
import org.jspecify.annotations.Nullable;

public final class class03021 {
    private static final long N = 4L;
    private final List<? extends Dynamic<?>> y;
    private final long[] L;
    private final int u;
    private final long i;
    private final int R;

    public class03021(List<? extends Dynamic<?>> list, long[] lArray) {
        this.y = list;
        this.L = lArray;
        this.u = Math.max(4, class03316.N((int)list.size()));
        this.i = (1L << this.u) - 1L;
        this.R = (char)(64 / this.u);
    }

    public long[] y() {
        return this.L;
    }

    private int y(int n, int n2, int n3) {
        return (n2 << 4 | n3) << 4 | n;
    }

    public List<? extends Dynamic<?>> N() {
        return this.y;
    }

    public @Nullable Dynamic<?> N(int n, int n2, int n3) {
        int n4 = this.y.size();
        if (n4 < 1) {
            return null;
        }
        if (n4 == 1) {
            return (Dynamic)this.y.getFirst();
        }
        int n5 = this.y(n, n2, n3);
        int n6 = n5 / this.R;
        if (n6 < 0 || n6 >= this.L.length) {
            return null;
        }
        long l = this.L[n6];
        int n7 = (n5 - n6 * this.R) * this.u;
        int n8 = (int)(l >> n7 & this.i);
        if (n8 < 0 || n8 >= n4) {
            return null;
        }
        return this.y.get(n8);
    }
}

