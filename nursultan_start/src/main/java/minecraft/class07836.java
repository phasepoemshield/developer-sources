/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class01818
 *  minecraft.class06069
 *  minecraft.class06075
 */
package minecraft;

import minecraft.class01818;
import minecraft.class06069;
import minecraft.class06075;

public class class07836
extends class06075 {
    private final class06069 u;
    private int i;

    public class01818 L() {
        return this.u.L();
    }

    public void L(long l, int n, int n2) {
        this.N(l);
        long l2 = this.B();
        long l3 = this.B();
        long l4 = (long)n * l2 ^ (long)n2 * l3 ^ l;
        this.N(l4);
    }

    public class07836(class06069 class060692) {
        super(0L);
        this.u = class060692;
    }

    public void y(long l, int n, int n2) {
        long l2 = l + (long)n + (long)(10000 * n2);
        this.N(l2);
    }

    public class06069 y() {
        return this.u.y();
    }

    public void N(long l, int n, int n2, int n3) {
        long l2 = (long)n * 341873128712L + (long)n2 * 132897987541L + l + (long)n3;
        this.N(l2);
    }

    public static class06069 N(int n, int n2, long l, long l2) {
        return class06069.y((long)(l + (long)(n * n * 4987142) + (long)(n * 5947611) + (long)(n2 * n2) * 4392871L + (long)(n2 * 389711) ^ l2));
    }

    public int N() {
        return this.i;
    }

    public int N(int n) {
        ++this.i;
        class06069 class060692 = this.u;
        if (class060692 instanceof class06075) {
            return ((class06075)class060692).N(n);
        }
        return (int)(this.u.B() >>> 64 - n);
    }

    public synchronized void N(long l) {
        if (this.u == null) {
            return;
        }
        this.u.N(l);
    }

    public long N(long l, int n, int n2) {
        this.N(l);
        long l2 = this.B() | 1L;
        long l3 = this.B() | 1L;
        long l4 = (long)n * l2 + (long)n2 * l3 ^ l;
        this.N(l4);
        return l4;
    }
}

