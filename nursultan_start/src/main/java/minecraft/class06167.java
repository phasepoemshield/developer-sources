/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class01235
 *  minecraft.class04770
 *  minecraft.class06912
 *  minecraft.class07049
 *  minecraft.class07057
 *  minecraft.class07077
 *  minecraft.class07299
 *  minecraft.class07305
 *  minecraft.class07434
 *  minecraft.class07438
 *  minecraft.class07633
 */
package minecraft;

import minecraft.class01235;
import minecraft.class04770;
import minecraft.class06165;
import minecraft.class06912;
import minecraft.class07049;
import minecraft.class07057;
import minecraft.class07077;
import minecraft.class07299;
import minecraft.class07305;
import minecraft.class07434;
import minecraft.class07438;
import minecraft.class07633;

class class06167
extends class07434 {
    public void L() {
        ((class06165)this.N).Y();
        ((class06165)this.L).Y();
        super.L();
    }

    public class06167(class06165 class061652, double d) {
        super((class07633)class061652, d);
    }

    protected void R() {
        class06165 class061652 = (class06165)this.N.y(this.y, (class07077)this.L);
        if (class061652 == null) {
            return;
        }
        class04770 class047702 = this.N.Nc();
        class04770 class047703 = this.L.Nc();
        class04770 class047704 = class047702;
        if (class047702 != null) {
            class061652.N((class07438)class047702);
        } else {
            class047704 = class047703;
        }
        if (class047703 != null && class047702 != class047703) {
            class061652.N((class07438)class047703);
        }
        if (class047704 != null) {
            class047704.method_7281(class01235.F);
            class06912.s.N(class047704, this.N, this.L, (class07077)class061652);
        }
        this.N.u(6000);
        this.L.u(6000);
        this.N.Na();
        this.L.Na();
        class061652.u(-24000);
        class061652.method_5808(this.N.method_23317(), this.N.method_23318(), this.N.method_23321(), 0.0f, 0.0f);
        this.y.y((class07049)class061652);
        this.y.method_8421((class07049)this.N, (byte)18);
        if (((Boolean)this.y.method_64395().N(class07305.O)).booleanValue()) {
            this.y.method_8649((class07049)new class07057((class07299)this.y, this.N.method_23317(), this.N.method_23318(), this.N.method_23321(), this.N.method_59922().y(7) + 1));
        }
    }
}

