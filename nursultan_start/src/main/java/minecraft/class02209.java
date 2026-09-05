/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableList
 *  minecraft.class00549
 */
package minecraft;

import com.google.common.collect.ImmutableList;
import java.util.Locale;
import minecraft.class00549;

public final class class02209 {
    private final ImmutableList<class00549> N;
    private final int[] y;

    public int L() {
        return Math.max(0, this.N.size() - 1);
    }

    public class02209(ImmutableList<class00549> immutableList) {
        this.N = immutableList;
        int n = immutableList.isEmpty() ? 0 : ((class00549)immutableList.getFirst()).y() + 1;
        this.y = new int[n];
        for (int i = 0; i < immutableList.size(); ++i) {
            int n2 = ((class00549)immutableList.get(i)).y();
            for (int j = 0; j <= n2; ++j) {
                this.y[j] = i;
            }
        }
    }

    public String toString() {
        return this.N.toString();
    }

    public int y() {
        return this.N.size();
    }

    public int N(class00549 class005492) {
        int n = class005492.y();
        if (n >= this.y.length) {
            throw new IllegalArgumentException(String.format(Locale.ROOT, "Requesting a ChunkStatus(%s) outside of dependency range(%s)", class005492, this.N));
        }
        return this.y[n];
    }

    public class00549 N(int n) {
        return (class00549)this.N.get(n);
    }

    public ImmutableList<class00549> N() {
        return this.N;
    }
}

