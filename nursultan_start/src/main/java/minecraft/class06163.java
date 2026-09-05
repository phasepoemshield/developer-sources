/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class01235
 *  minecraft.class03556
 *  minecraft.class04782
 *  minecraft.class04891
 *  minecraft.class04909
 *  minecraft.class05292
 *  minecraft.class05649
 *  minecraft.class05663
 *  minecraft.class06506
 *  minecraft.class06517
 *  minecraft.class06570
 *  minecraft.class06581
 *  minecraft.class06584
 *  minecraft.class07049
 *  minecraft.class07050
 *  minecraft.class07057
 *  minecraft.class07072
 *  minecraft.class07077
 *  minecraft.class07078
 *  minecraft.class07079
 *  minecraft.class07082
 *  minecraft.class07149
 *  minecraft.class07178
 *  minecraft.class07209
 *  minecraft.class07299
 *  minecraft.class07310
 *  minecraft.class07316
 *  minecraft.class07324
 *  minecraft.class07427
 *  minecraft.class07464
 *  minecraft.class07473
 *  minecraft.class07475
 *  minecraft.class07538
 *  minecraft.class07623
 *  minecraft.class07957
 *  minecraft.class07962
 *  minecraft.class07974
 *  minecraft.class07976
 *  minecraft.class07990
 *  minecraft.class07993
 *  minecraft.class07994
 *  minecraft.class08004
 *  minecraft.class08011
 *  minecraft.class08036
 *  minecraft.class08042
 *  minecraft.class08207
 *  minecraft.class08299
 *  minecraft.class08329
 *  org.apache.commons.lang3.tuple.Pair
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import minecraft.class01235;
import minecraft.class03556;
import minecraft.class04782;
import minecraft.class04891;
import minecraft.class04909;
import minecraft.class05292;
import minecraft.class05649;
import minecraft.class05663;
import minecraft.class06150;
import minecraft.class06171;
import minecraft.class06182;
import minecraft.class06506;
import minecraft.class06517;
import minecraft.class06570;
import minecraft.class06581;
import minecraft.class06584;
import minecraft.class07049;
import minecraft.class07050;
import minecraft.class07057;
import minecraft.class07072;
import minecraft.class07077;
import minecraft.class07078;
import minecraft.class07079;
import minecraft.class07082;
import minecraft.class07149;
import minecraft.class07178;
import minecraft.class07209;
import minecraft.class07299;
import minecraft.class07310;
import minecraft.class07316;
import minecraft.class07324;
import minecraft.class07427;
import minecraft.class07464;
import minecraft.class07473;
import minecraft.class07475;
import minecraft.class07538;
import minecraft.class07623;
import minecraft.class07957;
import minecraft.class07962;
import minecraft.class07974;
import minecraft.class07976;
import minecraft.class07990;
import minecraft.class07993;
import minecraft.class07994;
import minecraft.class08004;
import minecraft.class08011;
import minecraft.class08036;
import minecraft.class08042;
import minecraft.class08207;
import minecraft.class08299;
import minecraft.class08329;
import org.apache.commons.lang3.tuple.Pair;
import org.jspecify.annotations.Nullable;

public class class06163
extends class06171
implements class08207 {
    private static final int N = 0;
    private @Nullable class07209 y;
    private int L = 0;

    static /* synthetic */ class07623 L(class06163 class061632) {
        return class061632.V;
    }

    @Override
    public void method_5652(class08329 class083292) {
        super.method_5652(class083292);
        class083292.N("DespawnDelay", this.L);
        class083292.y("wander_target", class07209.field_25064, (Object)this.y);
    }

    @Override
    public void method_5749(class08299 class082992) {
        super.method_5749(class082992);
        this.L = class082992.N("DespawnDelay", 0);
        this.y = class082992.N("wander_target", class07209.field_25064).orElse(null);
        this.u(Math.max(0, this.K()));
    }

    public class06163(class07078<? extends class06163> class070782, class07299 class072992) {
        super(class070782, class072992);
    }

    public int B() {
        return this.L;
    }

    @Override
    protected void i(class04782 class047822) {
        class07316 class073162 = this.y();
        for (Pair var4 : class05649.y) {
            class05663[] class05663Array = (class05663[])var4.getLeft();
            this.N(class047822, class073162, class05663Array, (Integer)var4.getRight());
        }
    }

    @Override
    public boolean i() {
        return false;
    }

    protected class04891 s() {
        if (this.o()) {
            return class04909.gD;
        }
        return class04909.ga;
    }

    private void v() {
        if (this.L > 0 && !this.o() && --this.L == 0) {
            this.method_31472();
        }
    }

    static /* synthetic */ class07623 u(class06163 class061632) {
        return class061632.V;
    }

    @Override
    protected void y(class07324 class073242) {
        if (class073242.n()) {
            int n = 3 + this.field_5974.y(4);
            this.method_73183().method_8649((class07049)new class07057(this.method_73183(), this.method_23317(), this.method_23318() + 0.5, this.method_23321(), n));
        }
    }

    public @Nullable class07077 y(class04782 class047822, class07077 class070772) {
        return null;
    }

    public void y(int n) {
        this.L = n;
    }

    static /* synthetic */ class07623 y(class06163 class061632) {
        return class061632.V;
    }

    @Nullable class07209 E() {
        return this.y;
    }

    static /* synthetic */ class07623 N(class06163 class061632) {
        return class061632.V;
    }

    public void N(@Nullable class07209 class072092) {
        this.y = class072092;
    }

    @Override
    protected class04891 N(boolean bl) {
        return bl ? class04909.gh : class04909.gS;
    }

    public class07082 N(class08036 class080362, class07050 class070502) {
        if (!class080362.method_5998(class070502).N(class06570.tW) && this.method_5805() && !this.o() && !this.method_6109()) {
            if (class070502 == class07050.field_5808) {
                class080362.method_7281(class01235.C);
            }
            if (!this.method_73183().method_8608()) {
                if (this.y().isEmpty()) {
                    return class07082.L;
                }
                this.N(class080362);
                this.N(class080362, this.method_5476(), 1);
            }
            return class07082.N;
        }
        return super.N(class080362, class070502);
    }

    public boolean N(double d) {
        return false;
    }

    public class04891 N(class06584 class065842) {
        if (class065842.N(class06570.jT)) {
            return class04909.gA;
        }
        return class04909.gf;
    }

    @Override
    public class04891 R() {
        return class04909.gh;
    }

    protected void l_() {
        this.e.N(0, (class07473)new class07427((class07079)this));
        this.e.N(0, new class06150<class06163>(this, class06517.N((class06581)class06570.ns, (class03556)class06506.M), class04909.gF, class061632 -> this.method_73183().method_23886() && !class061632.method_5767()));
        this.e.N(0, new class06150<class06163>(this, new class06584((class07310)class06570.jT), class04909.gx, class061632 -> this.method_73183().method_8530() && class061632.method_5767()));
        this.e.N(1, (class07473)new class07990((class06171)this));
        this.e.N(1, (class07473)new class07464((class07475)this, class08004.class, 8.0f, 0.5, 0.5));
        this.e.N(1, (class07473)new class07464((class07475)this, class07538.class, 12.0f, 0.5, 0.5));
        this.e.N(1, (class07473)new class07464((class07475)this, class08011.class, 8.0f, 0.5, 0.5));
        this.e.N(1, (class07473)new class07464((class07475)this, class08042.class, 8.0f, 0.5, 0.5));
        this.e.N(1, (class07473)new class07464((class07475)this, class07178.class, 15.0f, 0.5, 0.5));
        this.e.N(1, (class07473)new class07464((class07475)this, class07149.class, 12.0f, 0.5, 0.5));
        this.e.N(1, (class07473)new class07464((class07475)this, class05292.class, 10.0f, 0.5, 0.5));
        this.e.N(1, (class07473)new class07993((class07475)this, 0.5));
        this.e.N(1, (class07473)new class07974((class06171)this));
        this.e.N(2, (class07473)new class06182(this, this, 2.0, 0.35));
        this.e.N(4, (class07473)new class07976((class07475)this, 0.35));
        this.e.N(8, (class07473)new class07957((class07475)this, 0.35));
        this.e.N(9, (class07473)new class07994((class07079)this, class08036.class, 3.0f, 1.0f));
        this.e.N(10, (class07473)new class07962((class07079)this, class07079.class, 8.0f));
    }

    public class04891 method_6002() {
        return class04909.gp;
    }

    public void method_6007() {
        super.method_6007();
        if (!this.method_73183().method_8608()) {
            this.v();
        }
    }

    public class04891 method_6011(class07072 class070722) {
        return class04909.gC;
    }
}

