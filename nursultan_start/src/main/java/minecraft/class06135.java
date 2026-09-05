/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00737
 *  minecraft.class00753
 *  minecraft.class01296
 *  minecraft.class04782
 *  minecraft.class05456
 *  minecraft.class06889
 *  minecraft.class07209
 *  minecraft.class07430
 *  minecraft.class07473
 *  minecraft.class07475
 *  minecraft.class07623
 *  minecraft.class07830
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import java.util.EnumSet;
import minecraft.class00737;
import minecraft.class00753;
import minecraft.class01296;
import minecraft.class04782;
import minecraft.class05456;
import minecraft.class06069;
import minecraft.class06889;
import minecraft.class07209;
import minecraft.class07430;
import minecraft.class07473;
import minecraft.class07475;
import minecraft.class07623;
import minecraft.class07830;
import org.jspecify.annotations.Nullable;

public class class06135
extends class07473 {
    private static final int N = 10;
    private final class07475 y;
    private final int L;
    private @Nullable class07209 u;

    private void M() {
        class06069 class060692 = this.y.method_59922();
        class07209 class072092 = this.y.method_73183().N(class07830.field_13203, this.y.method_24515().method_10069(-8 + class060692.y(16), 0, -8 + class060692.y(16)));
        this.y.f().N((double)class072092.method_10263(), (double)class072092.method_10264(), (double)class072092.method_10260(), 1.0);
    }

    public class06135(class07475 class074752, int n) {
        this.y = class074752;
        this.L = class06135.y((int)n);
        this.N_71(EnumSet.of(class07430.field_18405));
    }

    public void i() {
        if (this.u == null) {
            return;
        }
        class07623 class076232 = this.y.f();
        if (class076232.U() && !this.u.method_19769((class00737)this.y.method_73189(), 10.0)) {
            class06889 class068892 = class06889.L((class00753)this.u);
            class06889 class068893 = this.y.method_73189();
            class068892 = class068893.u(class068892).L(0.4).i(class068892);
            class07209 class072092 = class07209.method_49638((class00737)class068892.u(class068893).u().L(10.0).i(class068893));
            class072092 = this.y.method_73183().N(class07830.field_13203, class072092);
            if (!class076232.N((double)class072092.method_10263(), (double)class072092.method_10264(), (double)class072092.method_10260(), 1.0)) {
                this.M();
            }
        }
    }

    public boolean y() {
        return this.u != null && !this.y.f().U() && this.y.f().M().equals((Object)this.u);
    }

    public boolean N() {
        class07209 class072093;
        if (this.y.method_42148()) {
            return false;
        }
        if (this.y.method_73183().method_8530()) {
            return false;
        }
        if (this.y.method_59922().y(this.L) != 0) {
            return false;
        }
        class04782 class047822 = (class04782)this.y.method_73183();
        if (!class047822.method_19497(class072093 = this.y.method_24515(), 6)) {
            return false;
        }
        class06889 class068892 = class05456.N((class07475)this.y, (int)15, (int)7, class072092 -> -class047822.method_19498(class01296.N((class07209)class072092)));
        this.u = class068892 == null ? null : class07209.method_49638((class00737)class068892);
        return this.u != null;
    }
}

