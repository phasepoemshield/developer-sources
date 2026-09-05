/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00014
 *  minecraft.class00028
 *  minecraft.class00038
 *  minecraft.class00042
 *  minecraft.class00381
 *  minecraft.class04770
 *  minecraft.class04995
 *  minecraft.class06889
 *  minecraft.class07321
 *  minecraft.class07438
 */
package Nursultan;

import java.util.UUID;
import minecraft.class00014;
import minecraft.class00028;
import minecraft.class00038;
import minecraft.class00042;
import minecraft.class00381;
import minecraft.class04770;
import minecraft.class04995;
import minecraft.class06889;
import minecraft.class07321;
import minecraft.class07438;

public class class11336
implements class00038 {
    private final class07438 N;
    private final class00028 y;
    private final class04770 L;
    private float u;

    public void L() {
        this.L.field_13987.method_14364((class00381)class00014.N((UUID)this.N.method_5667(), (class00028)this.y, (float)this.u));
    }

    public class11336(class07438 class074382, class00028 class000282, class04770 class047702) {
        this.N = class074382;
        this.y = class000282;
        this.L = class047702;
        class06889 class068892 = class047702.method_73189().u(class074382.method_73189()).U();
        this.u = (float)class04995.u((double)class068892.L(), (double)class068892.N());
    }

    public void i() {
        class06889 class068892 = this.L.method_73189().u(this.N.method_73189()).U();
        float f = (float)class04995.u((double)class068892.L(), (double)class068892.N());
        if (class04995.L((float)(f - this.u)) > (float)Math.PI / 360) {
            this.L.field_13987.method_14364((class00381)class00014.y((UUID)this.N.method_5667(), (class00028)this.y, (float)f));
            this.u = f;
        }
    }

    public void u() {
        this.L.field_13987.method_14364((class00381)class00014.N((UUID)this.N.method_5667()));
    }

    public boolean y() {
        return class00042.N((class07438)this.N, (class04770)this.L) || class00042.N((class07321)this.N.method_31476(), (class04770)this.L) || !class00042.y((class07438)this.N, (class04770)this.L);
    }
}

