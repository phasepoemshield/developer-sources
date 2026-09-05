/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class03145
 *  minecraft.class05845
 */
package minecraft;

import minecraft.class03145;
import minecraft.class05845;

class class03108
implements class05845 {
    private final int[] N = new int[9];
    private int y = 0;

    class03108(class03145 class031452) {
    }

    public int N() {
        return 10;
    }

    public void N(int n, int n2) {
        if (n == 9) {
            this.y = n2;
        } else {
            this.N[n] = n2;
        }
    }

    public int N(int n) {
        return n == 9 ? this.y : this.N[n];
    }
}

