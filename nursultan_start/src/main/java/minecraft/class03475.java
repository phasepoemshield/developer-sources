/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class10204
 *  it.unimi.dsi.fastutil.ints.IntOpenHashSet
 *  it.unimi.dsi.fastutil.ints.IntSet
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import Nursultan.class10204;
import it.unimi.dsi.fastutil.ints.IntOpenHashSet;
import it.unimi.dsi.fastutil.ints.IntSet;
import java.util.Arrays;
import java.util.function.IntFunction;
import org.jspecify.annotations.Nullable;

public class class03475<T> {
    private static final int N = 8;
    private static final int y = 256;
    private static final int L = 255;
    private static final int u = 4351;
    private static final int i = 4352;
    private final T[] R;
    private final @Nullable T[][] M;
    private final IntFunction<T[]> B;

    public class03475(IntFunction<T[]> intFunction, IntFunction<T[][]> intFunction2) {
        this.R = intFunction.apply(256);
        this.M = intFunction2.apply(4352);
        Arrays.fill(this.M, this.R);
        this.B = intFunction;
    }

    public @Nullable T y(int n) {
        int n2 = n >> 8;
        int n3 = n & 0xFF;
        T[] TArray = this.M[n2];
        if (TArray == this.R) {
            return null;
        }
        T t = TArray[n3];
        TArray[n3] = null;
        return t;
    }

    public IntSet y() {
        IntOpenHashSet intOpenHashSet = new IntOpenHashSet();
        this.N((n, object) -> intOpenHashSet.add(n));
        return intOpenHashSet;
    }

    public void N(class10204<T> class102042) {
        for (int i = 0; i < this.M.length; ++i) {
            T[] TArray = this.M[i];
            if (TArray == this.R) continue;
            for (int j = 0; j < TArray.length; ++j) {
                T t = TArray[j];
                if (t == null) continue;
                int n = i << 8 | j;
                class102042.accept(n, t);
            }
        }
    }

    public void N() {
        Arrays.fill(this.M, this.R);
    }

    public @Nullable T N(int n) {
        int n2 = n >> 8;
        int n3 = n & 0xFF;
        return this.M[n2][n3];
    }

    public @Nullable T N(int n, T t) {
        int n2 = n >> 8;
        int n3 = n & 0xFF;
        T[] TArray = this.M[n2];
        if (TArray == this.R) {
            TArray = this.B.apply(256);
            this.M[n2] = TArray;
            TArray[n3] = t;
            return null;
        }
        T t2 = TArray[n3];
        TArray[n3] = t;
        return t2;
    }

    public T N(int n, IntFunction<T> intFunction) {
        int n2 = n >> 8;
        T[] TArray = this.M[n2];
        int n3 = n & 0xFF;
        T t = TArray[n3];
        if (t != null) {
            return t;
        }
        if (TArray == this.R) {
            TArray = this.B.apply(256);
            this.M[n2] = TArray;
        }
        T t2 = intFunction.apply(n);
        TArray[n3] = t2;
        return t2;
    }
}

