/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class01328
 *  minecraft.class07079
 *  minecraft.class07430
 *  minecraft.class07438
 *  minecraft.class07453
 *  minecraft.class07953
 */
package Nursultan;

import java.util.EnumSet;
import minecraft.class01328;
import minecraft.class07079;
import minecraft.class07430;
import minecraft.class07438;
import minecraft.class07453;
import minecraft.class07953;

public class class10861
extends class07953 {
    private final class07453 N;
    private class07438 y;
    private int L;

    public void L() {
        this.i.y(this.y);
        class07438 class074382 = this.N.L_();
        if (class074382 != null) {
            this.L = class074382.method_6117();
        }
        super.L();
    }

    public class10861(class07453 class074532) {
        super((class07079)class074532, false);
        this.N = class074532;
        this.N_71(EnumSet.of(class07430.field_18408));
    }

    public boolean N() {
        if (!this.N.NQ() || this.N.NJ()) {
            return false;
        }
        class07438 class074382 = this.N.L_();
        if (class074382 == null) {
            return false;
        }
        this.y = class074382.method_6065();
        return class074382.method_6117() != this.L && this.N(this.y, class01328.N) && this.N.N(this.y, class074382);
    }
}

