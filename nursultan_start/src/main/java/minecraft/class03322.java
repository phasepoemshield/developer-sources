/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class07209
 *  minecraft.class07321
 */
package minecraft;

import java.util.BitSet;
import java.util.stream.Stream;
import minecraft.class03292;
import minecraft.class07209;
import minecraft.class07321;

public class class03322 {
    private final int N;
    private final BitSet y;
    private class03292 L = (n, n2, n3) -> false;

    private int L(int n, int n2, int n3) {
        return n & 0xF | (n3 & 0xF) << 4 | n2 - this.N << 8;
    }

    public class03322(int n4, int n5) {
        this.N = n5;
        this.y = new BitSet(256 * n4);
    }

    public class03322(long[] lArray, int n4) {
        this.N = n4;
        this.y = BitSet.valueOf(lArray);
    }

    public boolean y(int n, int n2, int n3) {
        return this.L.test(n, n2, n3) || this.y.get(this.L(n, n2, n3));
    }

    public long[] N() {
        return this.y.toLongArray();
    }

    public void N(int n, int n2, int n3) {
        this.y.set(this.L(n, n2, n3));
    }

    public Stream<class07209> N(class07321 class073212) {
        return this.y.stream().mapToObj(n -> {
            int n2 = n & 0xF;
            int n3 = n >> 4 & 0xF;
            int n4 = n >> 8;
            return class073212.N(n2, n4 + this.N, n3);
        });
    }

    public void N(class03292 class032922) {
        this.L = class032922;
    }
}

