/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Predicate
 *  com.google.common.base.Predicates
 *  com.google.common.collect.Iterators
 *  minecraft.class00750
 *  minecraft.class04995
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import com.google.common.base.Predicate;
import com.google.common.base.Predicates;
import com.google.common.collect.Iterators;
import java.util.Arrays;
import java.util.Iterator;
import minecraft.class00750;
import minecraft.class04995;
import org.jspecify.annotations.Nullable;

public class class01199<K>
implements class00750<K> {
    private static final int y = -1;
    private static final Object L = null;
    private static final float u = 0.8f;
    private @Nullable K[] i;
    private int[] R;
    private @Nullable K[] M;
    private int B;
    private int Z;

    public static <A> class01199<A> L(int n) {
        return new class01199((int)((float)n / 0.8f));
    }

    public int L() {
        return this.Z;
    }

    private int M(int n) {
        int n2;
        for (n2 = n; n2 < this.i.length; ++n2) {
            if (this.i[n2] != L) continue;
            return n2;
        }
        for (n2 = 0; n2 < n; ++n2) {
            if (this.i[n2] != L) continue;
            return n2;
        }
        throw new RuntimeException("Overflowed :(");
    }

    private class01199(int n) {
        this.i = new Object[n];
        this.R = new int[n];
        this.M = new Object[n];
    }

    private class01199(K[] KArray, int[] nArray, K[] KArray2, int n, int n2) {
        this.i = KArray;
        this.R = nArray;
        this.M = KArray2;
        this.B = n;
        this.Z = n2;
    }

    public Iterator<K> iterator() {
        return Iterators.filter((Iterator)Iterators.forArray((Object[])this.M), (Predicate)Predicates.notNull());
    }

    private int i(@Nullable K k) {
        return (class04995.B((int)System.identityHashCode(k)) & Integer.MAX_VALUE) % this.i.length;
    }

    private int i(int n) {
        if (n == -1) {
            return -1;
        }
        return this.R[n];
    }

    private int u() {
        while (this.B < this.M.length && this.M[this.B] != null) {
            ++this.B;
        }
        return this.B;
    }

    public boolean u(int n) {
        return this.N(n) != null;
    }

    public int u(K k) {
        int n = this.u();
        this.N(k, n);
        return n;
    }

    private int y(@Nullable K k, int n) {
        int n2;
        for (n2 = n; n2 < this.i.length; ++n2) {
            if (this.i[n2] == k) {
                return n2;
            }
            if (this.i[n2] != L) continue;
            return -1;
        }
        for (n2 = 0; n2 < n; ++n2) {
            if (this.i[n2] == k) {
                return n2;
            }
            if (this.i[n2] != L) continue;
            return -1;
        }
        return -1;
    }

    public class01199<K> y() {
        return new class01199<Object>((Object[])this.i.clone(), (int[])this.R.clone(), (Object[])this.M.clone(), this.B, this.Z);
    }

    public boolean y(K k) {
        return this.N(k) != -1;
    }

    public int N(@Nullable K k) {
        return this.i(this.y(k, this.i(k)));
    }

    public void N() {
        Arrays.fill(this.i, null);
        Arrays.fill(this.M, null);
        this.B = 0;
        this.Z = 0;
    }

    public void N(K k, int n) {
        int n2;
        if ((float)Math.max(n, this.Z + 1) >= (float)this.i.length * 0.8f) {
            for (n2 = this.i.length << 1; n2 < n; n2 <<= 1) {
            }
            this.R(n2);
        }
        n2 = this.M(this.i(k));
        this.i[n2] = k;
        this.R[n2] = n;
        this.M[n] = k;
        ++this.Z;
        if (n == this.B) {
            ++this.B;
        }
    }

    public @Nullable K N(int n) {
        if (n < 0 || n >= this.M.length) {
            return null;
        }
        return this.M[n];
    }

    private void R(int n) {
        K[] KArray = this.i;
        int[] nArray = this.R;
        class01199<K> class011992 = new class01199<K>(n);
        for (int i = 0; i < KArray.length; ++i) {
            if (KArray[i] == null) continue;
            class011992.N(KArray[i], nArray[i]);
        }
        this.i = class011992.i;
        this.R = class011992.R;
        this.M = class011992.M;
        this.B = class011992.B;
        this.Z = class011992.Z;
    }
}

