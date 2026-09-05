/*
 * Decompiled with CFR 0.152.
 */
package Nursultan;

import Nursultan.class09729;
import Nursultan.class09754;
import java.util.Iterator;
import java.util.List;

public final class class09730 {
    private static final int N = 4;
    private final int y;
    private final List<List<class09729>> L;

    class09730(int n, List<List<class09729>> list) {
        this.y = n;
        this.L = list;
    }

    public int y() {
        return this.y;
    }

    public int N(int n, int n2) {
        int n3 = 0;
        Iterator<List<class09729>> var4 = this.L.iterator();
        block0: while (var4.hasNext()) {
            Iterator<class09729> var6 = var4.next().iterator();
            while (var6.hasNext()) {
                int n4 = var6.next().N(n, n2);
                if (n4 == Integer.MIN_VALUE) continue;
                n3 += n4;
                continue block0;
            }
        }
        return n3;
    }

    public boolean N() {
        return this.L.isEmpty();
    }

    public static class09730 N(byte[] byArray) {
        try {
            return new class09754(byArray).N();
        }
        catch (RuntimeException runtimeException) {
            return new class09730(1000, List.of());
        }
    }
}

