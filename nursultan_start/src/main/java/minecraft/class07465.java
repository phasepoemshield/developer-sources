/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00500
 *  minecraft.class00869
 *  minecraft.class00891
 *  minecraft.class01210
 *  minecraft.class07049
 *  minecraft.class07079
 *  minecraft.class07209
 *  minecraft.class07299
 *  minecraft.class07305
 *  minecraft.class07430
 */
package minecraft;

import java.util.EnumSet;
import java.util.function.Predicate;
import minecraft.class00500;
import minecraft.class00869;
import minecraft.class00891;
import minecraft.class01210;
import minecraft.class07049;
import minecraft.class07079;
import minecraft.class07209;
import minecraft.class07299;
import minecraft.class07305;
import minecraft.class07430;
import minecraft.class07473;

public class class07465
extends class07473 {
    private static final int N = 40;
    private static final Predicate<class00500> y = class005002 -> class005002.N(class01210.yW);
    private final class07079 L;
    private final class07299 u;
    private int i;

    @Override
    public void L() {
        this.i = this.N(40);
        this.u.method_8421((class07049)this.L, (byte)10);
        this.L.f().W();
    }

    public int M() {
        return this.i;
    }

    public class07465(class07079 class070792) {
        this.L = class070792;
        this.u = class070792.method_73183();
        this.N_71(EnumSet.of(class07430.field_18405, class07430.field_18406, class07430.field_18407));
    }

    @Override
    public void i() {
        this.i = Math.max(0, this.i - 1);
        if (this.i != this.N(4)) {
            return;
        }
        class07209 class072092 = this.L.method_24515();
        if (y.test(this.u.method_8320(class072092))) {
            if (((Boolean)class07465.N_18(this.u).method_64395().N(class07305.I)).booleanValue()) {
                this.u.N(class072092, false);
            }
            this.L.x();
        } else {
            class07209 class072093 = class072092.method_10074();
            if (this.u.method_8320(class072093).N(class00869.Z)) {
                if (((Boolean)class07465.N_18(this.u).method_64395().N(class07305.I)).booleanValue()) {
                    this.u.N(2001, class072093, class00891.W((class00500)class00869.Z.W()));
                    this.u.method_8652(class072093, class00869.z.W(), 2);
                }
                this.L.x();
            }
        }
    }

    @Override
    public void u() {
        this.i = 0;
    }

    @Override
    public boolean y() {
        return this.i > 0;
    }

    @Override
    public boolean N() {
        if (this.L.method_59922().y(this.N(this.L.method_6109() ? 50 : 1000)) != 0) {
            return false;
        }
        class07209 class072092 = this.L.method_24515();
        if (y.test(this.u.method_8320(class072092))) {
            return true;
        }
        return this.u.method_8320(class072092.method_10074()).N(class00869.Z);
    }
}

