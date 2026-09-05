/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class02131
 *  minecraft.class02154
 *  minecraft.class03289
 *  minecraft.class04293
 *  minecraft.class04383
 *  minecraft.class04891
 *  minecraft.class04909
 *  minecraft.class07072
 *  minecraft.class07078
 *  minecraft.class07079
 *  minecraft.class07299
 *  minecraft.class07528
 *  minecraft.class08234
 *  minecraft.class08299
 *  minecraft.class08329
 */
package minecraft;

import minecraft.class02131;
import minecraft.class02154;
import minecraft.class03289;
import minecraft.class04293;
import minecraft.class04383;
import minecraft.class04891;
import minecraft.class04909;
import minecraft.class07072;
import minecraft.class07078;
import minecraft.class07079;
import minecraft.class07299;
import minecraft.class07528;
import minecraft.class08234;
import minecraft.class08299;
import minecraft.class08329;

public class class07146
extends class07528 {
    private static final int u = 300;
    private static final class02131<Boolean> i = class03289.N(class07146.class, (class04383)class02154.U);
    public static final String L = "StrayConversionTime";
    private static final int R = -1;
    private int M;
    private int B;

    public boolean M() {
        return (Boolean)this.method_5841().N(i);
    }

    public boolean method_32316() {
        return false;
    }

    public void method_5693(class04293 class042932) {
        super.method_5693(class042932);
        class042932.N(i, (Object)false);
    }

    public void method_5773() {
        if (!this.method_73183().method_8608() && this.method_5805() && !this.Nt()) {
            if (this.field_27857) {
                if (this.M()) {
                    --this.B;
                    if (this.B < 0) {
                        this.t();
                    }
                } else {
                    ++this.M;
                    if (this.M >= 140) {
                        this.N(300);
                    }
                }
            } else {
                this.M = -1;
                this.N(false);
            }
        }
        super.method_5773();
    }

    public void method_5652(class08329 class083292) {
        super.method_5652(class083292);
        class083292.N(L, this.M() ? this.B : -1);
    }

    public void method_5749(class08299 class082992) {
        super.method_5749(class082992);
        int n = class082992.N(L, -1);
        if (n != -1) {
            this.N(n);
        } else {
            this.N(false);
        }
    }

    public class07146(class07078<? extends class07146> class070782, class07299 class072992) {
        super(class070782, class072992);
    }

    class04891 B() {
        return class04909.kt;
    }

    protected class04891 s() {
        return class04909.kZ;
    }

    public boolean n() {
        return this.M();
    }

    protected void t() {
        this.N(class07078.yk, class08234.N((class07079)this, (boolean)true, (boolean)true), class071642 -> {
            if (!this.method_5701()) {
                this.method_73183().method_8444(null, 1048, this.method_24515(), 0);
            }
        });
    }

    public void N(boolean bl) {
        this.field_6011.N(i, (Object)bl);
    }

    public void N(int n) {
        this.B = n;
        this.N(true);
    }

    public class04891 method_6002() {
        return class04909.kU;
    }

    public class04891 method_6011(class07072 class070722) {
        return class04909.kv;
    }
}

