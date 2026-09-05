/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00869
 *  minecraft.class01312
 *  minecraft.class01325
 *  minecraft.class02131
 *  minecraft.class02154
 *  minecraft.class02607
 *  minecraft.class03289
 *  minecraft.class03810
 *  minecraft.class03831
 *  minecraft.class04293
 *  minecraft.class04383
 *  minecraft.class04782
 *  minecraft.class04803
 *  minecraft.class04909
 *  minecraft.class05298
 *  minecraft.class05300
 *  minecraft.class06069
 *  minecraft.class06570
 *  minecraft.class06584
 *  minecraft.class06889
 *  minecraft.class07049
 *  minecraft.class07050
 *  minecraft.class07078
 *  minecraft.class07082
 *  minecraft.class07299
 *  minecraft.class07310
 *  minecraft.class07438
 *  minecraft.class08036
 *  minecraft.class08294
 *  minecraft.class08299
 *  minecraft.class08329
 *  minecraft.class08332
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import minecraft.class00869;
import minecraft.class01312;
import minecraft.class01325;
import minecraft.class02131;
import minecraft.class02154;
import minecraft.class02607;
import minecraft.class03289;
import minecraft.class03810;
import minecraft.class03831;
import minecraft.class04293;
import minecraft.class04383;
import minecraft.class04782;
import minecraft.class04803;
import minecraft.class04909;
import minecraft.class05298;
import minecraft.class05300;
import minecraft.class06069;
import minecraft.class06570;
import minecraft.class06584;
import minecraft.class06889;
import minecraft.class07049;
import minecraft.class07050;
import minecraft.class07078;
import minecraft.class07082;
import minecraft.class07299;
import minecraft.class07310;
import minecraft.class07438;
import minecraft.class07862;
import minecraft.class07880;
import minecraft.class08036;
import minecraft.class08294;
import minecraft.class08299;
import minecraft.class08329;
import minecraft.class08332;
import org.jspecify.annotations.Nullable;

public abstract class class07877
extends class07862 {
    private static final class02131<Boolean> f = class03289.N(class07877.class, (class04383)class02154.U);
    private static final boolean C = false;
    private final class01325 S;

    @Override
    public @Nullable class04803 method_32318(int n) {
        if (n == 499) {
            return new class07880(this);
        }
        return super.method_32318(n);
    }

    @Override
    public void method_5693(class04293 class042932) {
        super.method_5693(class042932);
        class042932.N(f, (Object)false);
    }

    @Override
    public void method_5652(class08329 class083292) {
        super.method_5652(class083292);
        class083292.N("ChestedHorse", this.v());
        if (this.v()) {
            class08294 var2 = class083292.N("Items", class08332.N);
            for (int i = 0; i < this.M.method_5439(); ++i) {
                class06584 class065842 = this.M.method_5438(i);
                if (class065842.R()) continue;
                var2.N((Object)new class08332(i, class065842));
            }
        }
    }

    @Override
    public void method_5749(class08299 class082992) {
        super.method_5749(class082992);
        this.N(class082992.N("ChestedHorse", false));
        this.No();
        if (this.v()) {
            for (class08332 class083322 : class082992.L("Items", class08332.N)) {
                if (!class083322.N(this.M.method_5439())) continue;
                this.M.method_5447(class083322.N(), class083322.y());
            }
        }
    }

    public class07877(class07078<? extends class07877> class070782, class07299 class072992) {
        super(class070782, class072992);
        this.F = false;
        this.S = class070782.E().N(class03810.N().N(class03831.field_47743, 0.0f, class070782.U() - 0.15625f, 0.0f)).N(0.5f);
    }

    protected void l() {
        this.method_5783(class04909.ZJ, 1.0f, (this.field_5974.z() - this.field_5974.z()) * 0.2f + 1.0f);
    }

    public boolean v() {
        return (Boolean)this.field_6011.N(f);
    }

    private void u(class08036 class080362, class06584 class065842) {
        this.N(true);
        this.l();
        class065842.N(1, (class07438)class080362);
        this.No();
    }

    public void N(boolean bl) {
        this.field_6011.N(f, (Object)bl);
    }

    @Override
    public class07082 N(class08036 class080362, class07050 class070502) {
        boolean bl;
        boolean bl2 = bl = !this.method_6109() && this.I() && class080362.method_21823();
        if (this.method_5782() || bl) {
            return super.N(class080362, class070502);
        }
        class06584 class065842 = class080362.method_5998(class070502);
        if (!class065842.R()) {
            if (this.N(class065842)) {
                return this.y(class080362, class065842);
            }
            if (!this.I()) {
                this.NC();
                return class07082.N;
            }
            if (!this.v() && class065842.N(class06570.Rv)) {
                this.u(class080362, class065842);
                return class07082.N;
            }
        }
        return super.N(class080362, class070502);
    }

    @Override
    protected void N(class06069 class060692) {
        this.method_5996(class05298.n).N((double)class07877.N_85(arg_0 -> ((class06069)class060692).y(arg_0)));
    }

    public static class05300 W() {
        return class07877.NK().N(class05298.l, (double)0.175f).N(class05298.T, 0.5);
    }

    @Override
    public class06889[] ab_() {
        return class02607.N((class07049)this, (double)0.04, (double)0.41, (double)0.18, (double)0.73);
    }

    @Override
    public int N_() {
        return this.v() ? 5 : 0;
    }

    @Override
    public void method_16078(class04782 class047822) {
        super.method_16078(class047822);
        if (this.v()) {
            this.method_5706(class047822, (class07310)class00869.LA);
            this.N(false);
        }
    }

    public class01325 method_55694(class01312 class013122) {
        return this.method_6109() ? this.S : super.method_55694(class013122);
    }
}

