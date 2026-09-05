/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableList
 *  com.mojang.serialization.Dynamic
 *  minecraft.class00500
 *  minecraft.class01001
 *  minecraft.class01030
 *  minecraft.class01484
 *  minecraft.class04643
 *  minecraft.class04782
 *  minecraft.class04891
 *  minecraft.class04909
 *  minecraft.class05298
 *  minecraft.class05300
 *  minecraft.class05340
 *  minecraft.class05355
 *  minecraft.class05378
 *  minecraft.class05781
 *  minecraft.class06069
 *  minecraft.class06113
 *  minecraft.class06570
 *  minecraft.class06584
 *  minecraft.class07049
 *  minecraft.class07052
 *  minecraft.class07072
 *  minecraft.class07078
 *  minecraft.class07085
 *  minecraft.class07150
 *  minecraft.class07209
 *  minecraft.class07299
 *  minecraft.class07310
 *  minecraft.class07438
 *  minecraft.class07446
 *  minecraft.class08700
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Dynamic;
import minecraft.class00500;
import minecraft.class01001;
import minecraft.class01030;
import minecraft.class01238;
import minecraft.class01289;
import minecraft.class01484;
import minecraft.class04643;
import minecraft.class04782;
import minecraft.class04891;
import minecraft.class04909;
import minecraft.class05298;
import minecraft.class05300;
import minecraft.class05340;
import minecraft.class05355;
import minecraft.class05378;
import minecraft.class05781;
import minecraft.class06069;
import minecraft.class06113;
import minecraft.class06570;
import minecraft.class06584;
import minecraft.class07049;
import minecraft.class07052;
import minecraft.class07072;
import minecraft.class07078;
import minecraft.class07085;
import minecraft.class07150;
import minecraft.class07209;
import minecraft.class07299;
import minecraft.class07310;
import minecraft.class07438;
import minecraft.class07446;
import minecraft.class08700;
import org.jspecify.annotations.Nullable;

public class class01266
extends class01238 {
    private static final int R = 50;
    private static final float M = 0.35f;
    private static final int B = 7;
    private static final double Z = 12.0;
    protected static final ImmutableList<class05340<? extends class05355<? super class01266>>> N = ImmutableList.of((Object)class05340.L, (Object)class05340.u, (Object)class05340.y, (Object)class05340.R, (Object)class05340.W);
    protected static final ImmutableList<class05378<?>> y = ImmutableList.of((Object)class05378.P, (Object)class05378.G, (Object)class05378.M, (Object)class05378.B, (Object)class05378.U, (Object)class05378.E, (Object)class05378.Nw, (Object)class05378.Nd, (Object)class05378.d, (Object)class05378.w, (Object)class05378.m, (Object)class05378.I, (Object[])new class05378[]{class05378.s, class05378.T, class05378.b, class05378.n, class05378.NW, class05378.c, class05378.y});

    public static class05300 M() {
        return class07150.Y().N(class05298.n, 50.0).N(class05298.l, (double)0.35f).N(class05298.u, 7.0).N(class05298.P, 12.0);
    }

    public boolean method_64397(class04782 class047822, class07072 class070722, float f) {
        class07049 class070492;
        boolean bl = super.method_64397(class047822, class070722, f);
        if (bl && (class070492 = class070722.u()) instanceof class07438) {
            class07438 class074382 = (class07438)class070492;
            class01030.N((class04782)class047822, (class01266)this, (class07438)class074382);
        }
        return bl;
    }

    protected void method_5712(class07209 class072092, class00500 class005002) {
        this.method_5783(class04909.GI, 0.15f, 1.0f);
    }

    public class01266(class07078<? extends class01266> class070782, class07299 class072992) {
        super(class070782, class072992);
        this.J = 20;
    }

    @Override
    public boolean B() {
        return false;
    }

    protected class04891 s() {
        return class04909.GY;
    }

    @Override
    protected void v() {
        this.method_56078(class04909.GJ);
    }

    public boolean y(class04782 class047822, class06584 class065842) {
        if (class065842.N(class06570.TI)) {
            return super.y(class047822, class065842);
        }
        return false;
    }

    @Override
    public class01484 E() {
        if (this.Nl() && this.d()) {
            return class01484.field_25165;
        }
        return class01484.field_22386;
    }

    public @Nullable class07446 N(class01001 class010012, class07052 class070522, class06113 class061132, @Nullable class07446 class074462) {
        class01030.N((class01266)this);
        this.N(class010012.method_8409(), class070522);
        return super.N(class010012, class070522, class061132, class074462);
    }

    @Override
    protected void N(class04782 class047822) {
        class04643 class046432 = class08700.N();
        class046432.N("piglinBruteBrain");
        this.method_18868().N(class047822, this);
        class046432.L();
        class01030.y((class01266)this);
        class01030.L((class01266)this);
        super.N(class047822);
    }

    protected void N(class06069 class060692, class07052 class070522) {
        this.method_5673(class07085.field_6173, new class06584((class07310)class06570.TI));
    }

    protected void W() {
        this.method_56078(class04909.GQ);
    }

    public class05781<class01266> method_28306() {
        return class01289.N(y, N);
    }

    public class04891 method_6002() {
        return class04909.GO;
    }

    public class01289<class01266> method_18868() {
        return super.method_18868();
    }

    public class04891 method_6011(class07072 class070722) {
        return class04909.Gg;
    }

    public class01289<?> method_18867(Dynamic<?> dynamic) {
        return class01030.N((class01266)this, (class01289)this.method_28306().N(dynamic));
    }
}

