/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class04995
 *  minecraft.class07185
 *  minecraft.class07739
 */
package minecraft;

import minecraft.class04995;
import minecraft.class07185;
import minecraft.class07739;

public final class class07257
extends class07739 {
    private final class07739 N;
    private final int y;
    private final int L;
    private final int u;
    private final int i;
    private final int R;
    private final int M;

    public class07257(class07739 class077392, int n, int n2, int n3, int n4, int n5, int n6) {
        super(n4 - n, n5 - n2, n6 - n3);
        this.N = class077392;
        this.y = n;
        this.L = n2;
        this.u = n3;
        this.i = n4;
        this.R = n5;
        this.M = n6;
    }

    private int N(class07185 class071852, int n) {
        int n2 = class071852.N(this.y, this.L, this.u);
        int n3 = class071852.N(this.i, this.R, this.M);
        return class04995.N((int)n, (int)n2, (int)n3) - n2;
    }

    public int method_1045(class07185 class071852) {
        return this.N(class071852, this.N.method_1045(class071852));
    }

    public int method_1055(class07185 class071852) {
        return this.N(class071852, this.N.method_1055(class071852));
    }

    public boolean method_1063(int n, int n2, int n3) {
        return this.N.method_1063(this.y + n, this.L + n2, this.u + n3);
    }

    public void method_1049(int n, int n2, int n3) {
        this.N.method_1049(this.y + n, this.L + n2, this.u + n3);
    }
}

