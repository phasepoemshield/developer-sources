/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableList
 *  com.google.common.collect.ImmutableSet
 *  com.mojang.datafixers.util.Pair
 *  com.mojang.serialization.Dynamic
 *  minecraft.class00500
 *  minecraft.class01001
 *  minecraft.class01289
 *  minecraft.class01507
 *  minecraft.class01520
 *  minecraft.class01523
 *  minecraft.class01528
 *  minecraft.class01531
 *  minecraft.class02131
 *  minecraft.class02135
 *  minecraft.class02154
 *  minecraft.class03289
 *  minecraft.class04051
 *  minecraft.class04119
 *  minecraft.class04126
 *  minecraft.class04137
 *  minecraft.class04293
 *  minecraft.class04383
 *  minecraft.class04643
 *  minecraft.class04782
 *  minecraft.class04891
 *  minecraft.class04909
 *  minecraft.class05340
 *  minecraft.class05355
 *  minecraft.class05359
 *  minecraft.class05378
 *  minecraft.class05738
 *  minecraft.class05747
 *  minecraft.class05770
 *  minecraft.class05771
 *  minecraft.class05781
 *  minecraft.class05782
 *  minecraft.class06113
 *  minecraft.class06293
 *  minecraft.class07049
 *  minecraft.class07052
 *  minecraft.class07072
 *  minecraft.class07078
 *  minecraft.class07150
 *  minecraft.class07209
 *  minecraft.class07299
 *  minecraft.class07438
 *  minecraft.class07446
 *  minecraft.class08299
 *  minecraft.class08329
 *  minecraft.class08700
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.util.Pair;
import com.mojang.serialization.Dynamic;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import minecraft.class00500;
import minecraft.class01001;
import minecraft.class01289;
import minecraft.class01507;
import minecraft.class01520;
import minecraft.class01523;
import minecraft.class01528;
import minecraft.class01531;
import minecraft.class02131;
import minecraft.class02135;
import minecraft.class02154;
import minecraft.class03289;
import minecraft.class04051;
import minecraft.class04119;
import minecraft.class04126;
import minecraft.class04137;
import minecraft.class04293;
import minecraft.class04383;
import minecraft.class04643;
import minecraft.class04782;
import minecraft.class04891;
import minecraft.class04909;
import minecraft.class05293;
import minecraft.class05298;
import minecraft.class05300;
import minecraft.class05340;
import minecraft.class05355;
import minecraft.class05359;
import minecraft.class05378;
import minecraft.class05738;
import minecraft.class05747;
import minecraft.class05770;
import minecraft.class05771;
import minecraft.class05781;
import minecraft.class05782;
import minecraft.class06113;
import minecraft.class06293;
import minecraft.class07049;
import minecraft.class07052;
import minecraft.class07072;
import minecraft.class07078;
import minecraft.class07150;
import minecraft.class07209;
import minecraft.class07299;
import minecraft.class07438;
import minecraft.class07446;
import minecraft.class08299;
import minecraft.class08329;
import minecraft.class08700;
import org.jspecify.annotations.Nullable;

public class class05292
extends class07150
implements class05293 {
    private static final class02131<Boolean> L = class03289.N(class05292.class, (class04383)class02154.U);
    private static final int R = 40;
    private static final int M = 1;
    private static final float B = 0.6f;
    private static final int Z = 6;
    private static final float W = 0.5f;
    private static final int T = 40;
    private static final int b = 15;
    private static final int X = 200;
    private static final float a = 0.3f;
    private static final float p = 0.4f;
    private static final boolean F = false;
    private int A;
    protected static final ImmutableList<? extends class05340<? extends class05355<? super class05292>>> N = ImmutableList.of((Object)class05340.L, (Object)class05340.u);
    protected static final ImmutableList<? extends class05378<?>> y = ImmutableList.of((Object)class05378.M, (Object)class05378.B, (Object)class05378.U, (Object)class05378.E, (Object)class05378.P, (Object)class05378.m, (Object)class05378.I, (Object)class05378.n, (Object)class05378.s, (Object)class05378.T);

    private Optional<? extends class07438> L(class04782 class047822) {
        return this.method_18868().L(class05378.B).orElse(class04051.N()).N((T class074382) -> this.N(class047822, (class07438)class074382));
    }

    private static void L(class01289<class05292> class012892) {
        class012892.N(class05359.U, 10, ImmutableList.of((Object)class01531.N((float)1.0f), (Object)class04137.N_44(class05292::B, (class04119)class01528.N((int)40)), (Object)class04137.N_44(class05292::method_6109, (class04119)class01528.N((int)15)), (Object)class01523.N()), class05378.s);
    }

    public static class05300 M() {
        return class07150.Y().N(class05298.n, 40.0).N(class05298.l, 0.3f).N(class05298.b, 0.6f).N(class05298.i, 1.0).N(class05298.u, 6.0);
    }

    public @Nullable class07438 T() {
        return this.S();
    }

    public void method_5674(class02131<?> class021312) {
        super.method_5674(class021312);
        if (L.equals(class021312)) {
            this.method_18382();
        }
    }

    public void method_5693(class04293 class042932) {
        super.method_5693(class042932);
        class042932.N(L, (Object)false);
    }

    public boolean method_64397(class04782 class047822, class07072 class070722, float f) {
        class07049 class070492;
        boolean bl = super.method_64397(class047822, class070722, f);
        if (!bl || !((class070492 = class070722.u()) instanceof class07438)) {
            return bl;
        }
        class07438 class074382 = (class07438)class070492;
        if (this.method_18395(class074382) && !class06293.N((class07438)this, (class07438)class074382, (double)4.0)) {
            this.N(class074382);
        }
        return true;
    }

    protected void method_5712(class07209 class072092, class00500 class005002) {
        this.method_5783(class04909.JJ, 0.15f, 1.0f);
    }

    public void method_5652(class08329 class083292) {
        super.method_5652(class083292);
        class083292.N("IsBaby", this.method_6109());
    }

    public boolean method_6109() {
        return (Boolean)this.method_5841().N(L);
    }

    public void method_5749(class08299 class082992) {
        super.method_5749(class082992);
        this.y(class082992.N("IsBaby", false));
    }

    public void method_5711(byte by) {
        if (by == 4) {
            this.A = 10;
            this.method_56078(class04909.JO);
        } else {
            super.method_5711(by);
        }
    }

    public class05292(class07078<? extends class05292> class070782, class07299 class072992) {
        super(class070782, class072992);
        this.J = 5;
    }

    public boolean B() {
        return !this.method_6109();
    }

    protected class04891 s() {
        if (this.method_73183().method_8608()) {
            return null;
        }
        if (((class07438)this).fields_12212a028292fd3c078969e3ee4c71d9e8_1.N(class05378.s)) {
            return class04909.JQ;
        }
        return class04909.JY;
    }

    protected void m() {
        this.method_56078(class04909.JQ);
    }

    public boolean g() {
        return true;
    }

    private static void y(class01289<class05292> class012892) {
        class012892.N(class05359.y, 10, ImmutableList.of((Object)class01507.N((class047822, class052922) -> class052922.L(class047822)), (Object)class04126.N((float)8.0f, (class02135)class02135.y((int)30, (int)60)), (Object)new class05747((List)ImmutableList.of((Object)Pair.of((Object)class01520.N((float)0.4f), (Object)2), (Object)Pair.of((Object)class05771.N((float)0.4f, (int)3), (Object)2), (Object)Pair.of((Object)new class05782(30, 60), (Object)1)))));
    }

    public void y(boolean bl) {
        this.method_5841().N(L, (Object)bl);
        if (!this.method_73183().method_8608() && bl) {
            this.method_5996(class05298.u).N(0.5);
        }
    }

    protected void E() {
        class05359 class053592 = ((class07438)this).fields_12212a028292fd3c078969e3ee4c71d9e8_1.R().orElse(null);
        ((class07438)this).fields_12212a028292fd3c078969e3ee4c71d9e8_1.N((List)ImmutableList.of((Object)class05359.U, (Object)class05359.y));
        if ((class05359)((class07438)this).fields_12212a028292fd3c078969e3ee4c71d9e8_1.R().orElse(null) == class05359.U && class053592 != class05359.U) {
            this.m();
        }
        this.R(((class07438)this).fields_12212a028292fd3c078969e3ee4c71d9e8_1.N(class05378.s));
    }

    private void N(class07438 class074382) {
        ((class07438)this).fields_12212a028292fd3c078969e3ee4c71d9e8_1.y(class05378.I);
        ((class07438)this).fields_12212a028292fd3c078969e3ee4c71d9e8_1.N(class05378.s, (Object)class074382, 200L);
    }

    private boolean N(class04782 class047822, class07438 class074382) {
        class07078 var3 = class074382.method_5864();
        return var3 != class07078.yS && var3 != class07078.q && class05355.y((class04782)class047822, (class07438)this, (class07438)class074382);
    }

    private static void N(class01289<class05292> class012892) {
        class012892.N(class05359.N, 0, ImmutableList.of((Object)new class05770(45, 90), (Object)new class05738()));
    }

    public @Nullable class07446 N(class01001 class010012, class07052 class070522, class06113 class061132, @Nullable class07446 class074462) {
        if (class010012.method_8409().z() < 0.2f) {
            this.y(true);
        }
        return super.N(class010012, class070522, class061132, class074462);
    }

    protected void N(class04782 class047822) {
        class04643 class046432 = class08700.N();
        class046432.N("zoglinBrain");
        this.method_18868().N(class047822, (class07438)this);
        class046432.L();
        this.E();
    }

    @Override
    public int W() {
        return this.A;
    }

    public class05781<class05292> method_28306() {
        return class01289.N(y, N);
    }

    public class04891 method_6002() {
        return class04909.Jg;
    }

    public void method_6007() {
        if (this.A > 0) {
            --this.A;
        }
        super.method_6007();
    }

    public class01289<class05292> method_18868() {
        return super.method_18868();
    }

    public boolean method_6121(class04782 class047822, class07049 class070492) {
        if (!(class070492 instanceof class07438)) {
            return false;
        }
        class07438 class074382 = (class07438)class070492;
        this.A = 10;
        class047822.method_8421((class07049)this, (byte)4);
        this.method_56078(class04909.JO);
        return class05293.N(class047822, (class07438)this, class074382);
    }

    public void method_6060(class07438 class074382) {
        if (!this.method_6109()) {
            class05293.N((class07438)this, class074382);
        }
    }

    public class04891 method_6011(class07072 class070722) {
        return class04909.JI;
    }

    public class01289<?> method_18867(Dynamic<?> dynamic) {
        class01289 var2 = this.method_28306().N(dynamic);
        class05292.N((class01289<class05292>)var2);
        class05292.y((class01289<class05292>)var2);
        class05292.L((class01289<class05292>)var2);
        var2.N((Set)ImmutableSet.of((Object)class05359.N));
        var2.y(class05359.y);
        var2.i();
        return var2;
    }
}

