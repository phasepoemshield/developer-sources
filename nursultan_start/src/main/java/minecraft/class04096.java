/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableList
 *  com.mojang.serialization.Dynamic
 *  minecraft.class01001
 *  minecraft.class01226
 *  minecraft.class01289
 *  minecraft.class02477
 *  minecraft.class02484
 *  minecraft.class02837
 *  minecraft.class04643
 *  minecraft.class04782
 *  minecraft.class04891
 *  minecraft.class04909
 *  minecraft.class05298
 *  minecraft.class05300
 *  minecraft.class05340
 *  minecraft.class05355
 *  minecraft.class05378
 *  minecraft.class05549
 *  minecraft.class05581
 *  minecraft.class05781
 *  minecraft.class06113
 *  minecraft.class06570
 *  minecraft.class06584
 *  minecraft.class07001
 *  minecraft.class07050
 *  minecraft.class07072
 *  minecraft.class07077
 *  minecraft.class07078
 *  minecraft.class07079
 *  minecraft.class07082
 *  minecraft.class07107
 *  minecraft.class07126
 *  minecraft.class07299
 *  minecraft.class07310
 *  minecraft.class07438
 *  minecraft.class07450
 *  minecraft.class07623
 *  minecraft.class07629
 *  minecraft.class07633
 *  minecraft.class07639
 *  minecraft.class08036
 *  minecraft.class08234
 *  minecraft.class08299
 *  minecraft.class08329
 *  minecraft.class08700
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Dynamic;
import minecraft.class01001;
import minecraft.class01226;
import minecraft.class01289;
import minecraft.class02477;
import minecraft.class02484;
import minecraft.class02837;
import minecraft.class04074;
import minecraft.class04643;
import minecraft.class04782;
import minecraft.class04891;
import minecraft.class04909;
import minecraft.class05298;
import minecraft.class05300;
import minecraft.class05340;
import minecraft.class05355;
import minecraft.class05378;
import minecraft.class05549;
import minecraft.class05581;
import minecraft.class05781;
import minecraft.class06113;
import minecraft.class06570;
import minecraft.class06584;
import minecraft.class07001;
import minecraft.class07050;
import minecraft.class07072;
import minecraft.class07077;
import minecraft.class07078;
import minecraft.class07079;
import minecraft.class07082;
import minecraft.class07107;
import minecraft.class07126;
import minecraft.class07299;
import minecraft.class07310;
import minecraft.class07438;
import minecraft.class07450;
import minecraft.class07623;
import minecraft.class07629;
import minecraft.class07633;
import minecraft.class07639;
import minecraft.class08036;
import minecraft.class08234;
import minecraft.class08299;
import minecraft.class08329;
import minecraft.class08700;
import org.jspecify.annotations.Nullable;

public class class04096
extends class07629 {
    private static final int R = 0;
    public static int N = Math.abs(-24000);
    public static final float y = 0.4f;
    public static final float L = 0.3f;
    private int B = 0;
    protected static final ImmutableList<class05340<? extends class05355<? super class04096>>> u = ImmutableList.of((Object)class05340.L, (Object)class05340.u, (Object)class05340.R, (Object)class05340.j);
    protected static final ImmutableList<class05378<?>> i = ImmutableList.of((Object)class05378.P, (Object)class05378.B, (Object)class05378.m, (Object)class05378.I, (Object)class05378.n, (Object)class05378.e, (Object)class05378.p, (Object)class05378.A, (Object)class05378.a, (Object)class05378.j, (Object)class05378.NN);

    public void method_5652(class08329 class083292) {
        super.method_5652(class083292);
        class083292.N("Age", this.B);
    }

    public void method_5749(class08299 class082992) {
        super.method_5749(class082992);
        this.y(class082992.N("Age", 0));
    }

    public class04096(class07078<? extends class07629> class070782, class07299 class072992) {
        super(class070782, class072992);
        this.q = new class05581((class07079)this, 85, 10, 0.02f, 0.1f, true);
        this.o = new class07450((class07079)this, 10);
    }

    public boolean B() {
        return true;
    }

    private boolean i(class06584 class065842) {
        return class065842.N(class01226.Nf);
    }

    protected @Nullable class04891 s() {
        return null;
    }

    private int n() {
        return this.B;
    }

    protected class04891 m() {
        return class04909.QH;
    }

    private void t() {
        class07299 class072992 = this.method_73183();
        if (class072992 instanceof class04782) {
            class04782 class047822 = (class04782)class072992;
            this.N(class07078.NR, class08234.N((class07079)this, (boolean)false, (boolean)false), class040672 -> {
                class040672.N((class01001)class047822, class047822.method_8404(class040672.method_24515()), class06113.field_16468, null);
                class040672.NW();
                class040672.method_60490(this.method_18377(this.method_18376()));
                this.method_5783(class04909.Qc, 0.15f, 1.0f);
            });
        }
    }

    public static class05300 v() {
        return class07633.Ne().N(class05298.l, 1.0).N(class05298.n, 6.0);
    }

    private void y(class08036 class080362, class06584 class065842) {
        class065842.N(1, (class07438)class080362);
    }

    private void y(int n) {
        this.B = n;
        if (this.B >= N) {
            this.t();
        }
    }

    public class04891 E() {
        return class04909.uk;
    }

    public void N(boolean bl) {
    }

    private void N(class08036 class080362, class06584 class065842) {
        this.y(class080362, class065842);
        this.N(class07077.i((int)this.G()));
        this.method_73183().method_8406((class07126)class07107.F, this.method_23322(1.0), this.method_23319() + 0.5, this.method_23325(1.0), 0.0, 0.0, 0.0);
    }

    private void N(int n) {
        this.y(this.B + n * 20);
    }

    protected void N(class04782 class047822) {
        class04643 class046432 = class08700.N();
        class046432.N("tadpoleBrain");
        this.method_18868().N(class047822, (class07438)this);
        class046432.L();
        class046432.N("tadpoleActivityUpdate");
        class04074.N(this);
        class046432.L();
        super.N(class047822);
    }

    public class07082 N(class08036 class080362, class07050 class070502) {
        class06584 class065842 = class080362.method_5998(class070502);
        if (this.i(class065842)) {
            this.N(class080362, class065842);
            return class07082.N;
        }
        return class05549.N((class08036)class080362, (class07050)class070502, (class07438)this).orElse(super.N(class080362, class070502));
    }

    protected class07623 N(class07299 class072992) {
        return new class07639((class07079)this, class072992);
    }

    public void N(class07001 class070012) {
        class05549.N((class07079)this, (class07001)class070012);
        class070012.i("Age").ifPresent(this::y);
    }

    private int G() {
        return Math.max(0, N - this.B);
    }

    public class06584 Y() {
        return new class06584((class07310)class06570.jG);
    }

    public void e_(class06584 class065842) {
        class05549.N((class07079)this, (class06584)class065842);
        class02837.N((class02477)class02484.NM, (class06584)class065842, class070012 -> class070012.N("Age", this.n()));
    }

    public class05781<class04096> method_28306() {
        return class01289.N(i, u);
    }

    public @Nullable class04891 method_6002() {
        return class04909.Qe;
    }

    public void method_6007() {
        super.method_6007();
        if (!this.method_73183().method_8608()) {
            this.y(this.B + 1);
        }
    }

    public boolean method_6054() {
        return false;
    }

    public class01289<class04096> method_18868() {
        return super.method_18868();
    }

    public @Nullable class04891 method_6011(class07072 class070722) {
        return class04909.QX;
    }

    public class01289<?> method_18867(Dynamic<?> dynamic) {
        return class04074.N((class01289<class04096>)this.method_28306().N(dynamic));
    }
}

