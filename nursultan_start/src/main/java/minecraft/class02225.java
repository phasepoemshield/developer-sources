/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableList
 *  minecraft.class00549
 *  minecraft.class00574
 *  minecraft.class02696
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import com.google.common.collect.ImmutableList;
import java.util.Arrays;
import minecraft.class00549;
import minecraft.class00574;
import minecraft.class02209;
import minecraft.class02237;
import minecraft.class02696;
import org.jspecify.annotations.Nullable;

public class class02225 {
    private final class00549 N;
    private final @Nullable class02237 y;
    private class00549[] L;
    private int u = -1;
    private class00574 i = class02696::N;

    protected class02225(class00549 class005492) {
        if (class005492.L() != class005492) {
            throw new IllegalArgumentException("Not starting with the first status: " + String.valueOf(class005492));
        }
        this.N = class005492;
        this.y = null;
        this.L = new class00549[0];
    }

    protected class02225(class00549 class005492, class02237 class022372) {
        if (class022372.N().y() != class005492.y() - 1) {
            throw new IllegalArgumentException("Out of order status: " + String.valueOf(class005492));
        }
        this.N = class005492;
        this.y = class022372;
        this.L = new class00549[]{class022372.N()};
    }

    private class00549[] y() {
        if (this.y == null) {
            return this.L;
        }
        int n = this.N(this.y.N());
        class02209 class022092 = this.y.L();
        class00549[] class00549Array = new class00549[Math.max(n + class022092.y(), this.L.length)];
        for (int i = 0; i < class00549Array.length; ++i) {
            int n2 = i - n;
            class00549Array[i] = n2 < 0 || n2 >= class022092.y() ? this.L[i] : (i >= this.L.length ? class022092.N(n2) : class00549.N((class00549)this.L[i], (class00549)class022092.N(n2)));
        }
        return class00549Array;
    }

    public class02237 N() {
        return new class02237(this.N, new class02209((ImmutableList<class00549>)ImmutableList.copyOf((Object[])this.L)), new class02209((ImmutableList<class00549>)ImmutableList.copyOf((Object[])this.y())), this.u, this.i);
    }

    private int N(class00549 class005492) {
        for (int i = this.L.length - 1; i >= 0; --i) {
            if (!this.L[i].N(class005492)) continue;
            return i;
        }
        return 0;
    }

    public class02225 N(class00574 class005742) {
        this.i = class005742;
        return this;
    }

    public class02225 N(int n) {
        this.u = n;
        return this;
    }

    public class02225 N(class00549 class005492, int n) {
        if (class005492.N(this.N)) {
            throw new IllegalArgumentException("Status " + String.valueOf(class005492) + " can not be required by " + String.valueOf(this.N));
        }
        int n2 = n + 1;
        class00549[] class00549Array = this.L;
        if (n2 > class00549Array.length) {
            this.L = new class00549[n2];
            Arrays.fill(this.L, class005492);
        }
        for (int i = 0; i < Math.min(n2, class00549Array.length); ++i) {
            this.L[i] = class00549.N((class00549)class00549Array[i], (class00549)class005492);
        }
        return this;
    }
}

