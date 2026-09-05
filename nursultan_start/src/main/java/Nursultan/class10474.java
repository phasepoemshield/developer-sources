/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00675
 *  minecraft.class01328
 *  minecraft.class04882
 *  minecraft.class07049
 *  minecraft.class07078
 *  minecraft.class07430
 *  minecraft.class07438
 *  minecraft.class07473
 */
package Nursultan;

import java.util.EnumSet;
import java.util.Iterator;
import minecraft.class00675;
import minecraft.class01328;
import minecraft.class04882;
import minecraft.class07049;
import minecraft.class07078;
import minecraft.class07430;
import minecraft.class07438;
import minecraft.class07473;

public class class10474
extends class07473 {
    private final class04882 y;
    private final float L;
    public final class01328 N = class01328.y().N(8.0).u().i();

    public void L() {
        super.L();
        this.y.f().W();
        Iterator var2 = class10474.N((class07049)this.y).N(class04882.class, this.N, (class07438)this.y, this.y.method_5829().L(8.0, 8.0, 8.0)).iterator();
        while (var2.hasNext()) {
            ((class04882)var2.next()).y(this.y.T());
        }
    }

    public class10474(class00675 class006752, float f) {
        this.y = class006752;
        this.L = f * f;
        this.N_71(EnumSet.of(class07430.field_18405, class07430.field_18406));
    }

    public boolean B() {
        return true;
    }

    public void i() {
        class07438 class074382 = this.y.T();
        if (class074382 == null) {
            return;
        }
        if (this.y.method_5858((class07049)class074382) > (double)this.L) {
            this.y.p().N((class07049)class074382, 30.0f, 30.0f);
            if (class04882.u((class04882)this.y).y(50) == 0) {
                this.y.D();
            }
        } else {
            this.y.R(true);
        }
        super.i();
    }

    public void u() {
        super.u();
        class07438 class074382 = this.y.T();
        if (class074382 != null) {
            for (class04882 class048822 : class10474.N((class07049)this.y).N(class04882.class, this.N, (class07438)this.y, this.y.method_5829().L(8.0, 8.0, 8.0))) {
                class048822.y(class074382);
                class048822.R(true);
            }
            this.y.R(true);
        }
    }

    public boolean N() {
        class07438 class074382 = this.y.method_6065();
        return this.y.K() == null && class04882.L((class04882)this.y) && this.y.T() != null && !this.y.Nl() && (class074382 == null || class074382.method_5864() != class07078.Ly);
    }
}

