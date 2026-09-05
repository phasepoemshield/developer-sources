/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class04142
 *  minecraft.class04782
 *  minecraft.class07438
 */
package minecraft;

import minecraft.class04142;
import minecraft.class04782;
import minecraft.class05748;
import minecraft.class07438;

public class class05782
implements class04142<class07438> {
    private final int N;
    private final int y;
    private class05748 L = class05748.field_18337;
    private long u;

    public class05782(int n, int n2) {
        this.N = n;
        this.y = n2;
    }

    public String method_46910() {
        return this.getClass().getSimpleName();
    }

    public final void method_18925(class04782 class047822, class07438 class074382, long l) {
        this.L = class05748.field_18337;
    }

    public final void method_18923(class04782 class047822, class07438 class074382, long l) {
        if (l > this.u) {
            this.method_18925(class047822, class074382, l);
        }
    }

    public class05748 method_18921() {
        return this.L;
    }

    public final boolean method_18922(class04782 class047822, class07438 class074382, long l) {
        this.L = class05748.field_18338;
        int n = this.N + class047822.method_8409().y(this.y + 1 - this.N);
        this.u = l + (long)n;
        return true;
    }
}

