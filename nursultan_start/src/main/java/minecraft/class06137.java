/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class10558
 *  minecraft.class01317
 *  minecraft.class01328
 *  minecraft.class06165
 *  minecraft.class07209
 *  minecraft.class07299
 *  minecraft.class07438
 *  minecraft.class07473
 */
package minecraft;

import Nursultan.class10558;
import minecraft.class01317;
import minecraft.class01328;
import minecraft.class06165;
import minecraft.class07209;
import minecraft.class07299;
import minecraft.class07438;
import minecraft.class07473;

abstract class class06137
extends class07473 {
    private final class01328 y;
    final /* synthetic */ class06165 N;

    protected boolean M() {
        class07209 class072092 = class07209.method_49637((double)this.N.method_23317(), (double)this.N.method_5829().i, (double)this.N.method_23321());
        return !this.N.method_73183().N_17(class072092) && this.N.u(class072092) >= 0.0f;
    }

    class06137(class06165 class061652) {
        this.N = class061652;
        this.y = class01328.N().N(12.0).u().N((class01317)new class10558(this.N));
    }

    protected boolean Z() {
        return !class06137.N_18((class07299)this.N.method_73183()).N(class07438.class, this.y, (class07438)this.N, this.N.method_5829().L(12.0, 6.0, 12.0)).isEmpty();
    }
}

