/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00392
 *  minecraft.class05511
 *  minecraft.class05882
 */
package minecraft;

import minecraft.class00392;
import minecraft.class05511;
import minecraft.class05882;

public class class05906 {
    private static final int y = -1;
    private int L = -1;
    final /* synthetic */ class05882 N;

    public class05906(class05882 class058822) {
        this.N = class058822;
    }

    void N(int n) {
        if (this.L != -1) {
            throw new IllegalStateException("Condition already triggered at " + this.L);
        }
        this.L = n;
    }

    public void N() {
        int n = this.N.N.s();
        if (this.L != n) {
            if (this.L == -1) {
                throw new class05511((class00392)class00392.L((String)"test.error.sequence.condition_not_triggered"), n);
            }
            throw new class05511((class00392)class00392.N((String)"test.error.sequence.condition_already_triggered", (Object[])new Object[]{this.L}), n);
        }
    }
}

