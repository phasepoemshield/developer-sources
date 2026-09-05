/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class10401
 *  Nursultan.class10965
 *  Nursultan.class11046
 *  Nursultan.class11067
 *  Nursultan.class11072
 *  Nursultan.class11080
 *  Nursultan.class11106
 *  Nursultan.class11380
 *  Nursultan.class11382
 *  Nursultan.class11507
 *  Nursultan.class11512
 *  Nursultan.class11524
 *  Nursultan.class11782
 *  Nursultan.class11908
 *  Nursultan.class12025
 *  com.mojang.authlib.GameProfile
 *  minecraft.class00381
 *  minecraft.class00556
 *  minecraft.class00565
 *  minecraft.class03448
 *  minecraft.class04453
 *  minecraft.class04891
 *  minecraft.class04909
 *  minecraft.class04911
 *  minecraft.class04995
 *  minecraft.class05298
 *  minecraft.class06202
 *  minecraft.class06889
 *  minecraft.class07049
 *  minecraft.class07062
 *  minecraft.class07107
 *  minecraft.class07126
 *  minecraft.class07299
 *  minecraft.class08036
 */
package Nursultan;

import Nursultan.class10401;
import Nursultan.class10965;
import Nursultan.class11046;
import Nursultan.class11067;
import Nursultan.class11072;
import Nursultan.class11080;
import Nursultan.class11106;
import Nursultan.class11380;
import Nursultan.class11382;
import Nursultan.class11507;
import Nursultan.class11512;
import Nursultan.class11524;
import Nursultan.class11782;
import Nursultan.class11908;
import Nursultan.class12025;
import com.mojang.authlib.GameProfile;
import java.util.UUID;
import java.util.concurrent.ThreadLocalRandom;
import minecraft.class00381;
import minecraft.class00556;
import minecraft.class00565;
import minecraft.class03448;
import minecraft.class04453;
import minecraft.class04891;
import minecraft.class04909;
import minecraft.class04911;
import minecraft.class04995;
import minecraft.class05298;
import minecraft.class06202;
import minecraft.class06889;
import minecraft.class07049;
import minecraft.class07062;
import minecraft.class07107;
import minecraft.class07126;
import minecraft.class07299;
import minecraft.class08036;

@class11080(L="FakePlayer", y=class11072.VISUAL, N=class11106.WORLD)
public class FakePlayer
extends class11067 {
    public static Object L_0;
    public static Object L_1;
    public static Object L_2;
    public static Object L_3;
    public Object u_0;
    public Object u_1;
    public Object u_2;
    public Object u_3;
    public Object u_4;
    public Object u_5;
    public Object u_6;
    public Object u_7;
    public boolean u_init;

    private static void T() {
        L_0 = new String[]{"Fake", "Bot", "Player", "Nursultan"};
        L_1 = Float.valueOf(2.0f);
        L_2 = Float.valueOf(0.1f);
        L_3 = 3;
    }

    private void Q() {
        this.G();
        if (L_0 == null) {
            L_0 = new String[]{"Fake", "Bot", "Player", "Nursultan"};
        }
        ThreadLocalRandom threadLocalRandom = ThreadLocalRandom.current();
        String string = ((String[])L_0)[threadLocalRandom.nextInt(((String[])L_0).length)] + threadLocalRandom.nextInt(10, 100);
        class10401 class104012 = new class10401((class03448)((class06202)this.y_0).T_3, new GameProfile(UUID.randomUUID(), string));
        class104012.method_5838(-threadLocalRandom.nextInt(1000000, 2000000));
        this.u_4 = ((class04453)((class06202)this.y_0).T_4).method_73189();
        this.u_6 = Float.valueOf(((class04453)((class06202)this.y_0).T_4).method_36454());
        float f = class11908.N((float)((Float)this.u_6).floatValue());
        this.u_5 = new class06889((double)(-class04995.P((double)f)), 0.0, (double)(-class04995.m((double)f)));
        this.u_7 = Float.valueOf(0.0f);
        class104012.method_5808(((class06889)this.u_4).M, ((class06889)this.u_4).B, ((class06889)this.u_4).Z, ((Float)this.u_6).floatValue(), 0.0f);
        class104012.method_5847(((Float)this.u_6).floatValue());
        class104012.method_5636(((Float)this.u_6).floatValue());
        ((class03448)((class06202)this.y_0).T_3).u((class07049)class104012);
        this.u_3 = class104012;
    }

    public FakePlayer() {
        this.G();
        this.u_0 = class11524.N((class11512)this, (String)"walk", (boolean)true);
        this.u_1 = class11524.N((class11512)this, (String)"rotate", (boolean)true);
        this.u_2 = new class11046(this);
        this.u_4 = class06889.L;
        this.u_5 = class06889.L;
    }

    static {
        FakePlayer.T();
    }

    public boolean i() {
        this.d();
        return super.i();
    }

    private void l() {
        this.G();
        double d = ((class04453)((class06202)this.y_0).T_4).method_45325(class05298.u);
        int n = Math.max(1, (int)(d * 0.5));
        for (int i = 0; i < n; ++i) {
            ((class03448)((class06202)this.y_0).T_3).method_8406((class07126)class07107.B, ((class10401)this.u_3).method_23317(), ((class10401)this.u_3).method_23323(0.5), ((class10401)this.u_3).method_23321(), ((class03448)((class06202)this.y_0).T_3).field_9229.E() * 0.1, 0.0, ((class03448)((class06202)this.y_0).T_3).field_9229.E() * 0.1);
        }
    }

    private void d() {
        this.G();
        if ((class10401)this.u_3 == null) {
            return;
        }
        class07299 class072992 = ((class10401)this.u_3).method_73183();
        if (class072992 instanceof class03448) {
            ((class03448)class072992).N(((class10401)this.u_3).method_5628(), class07062.field_26999);
        }
        this.u_3 = null;
    }

    private void k() {
        double d;
        this.G();
        class06889 class068892 = (class06889)this.u_4;
        float f = ((Float)this.u_6).floatValue();
        float f2 = 0.0f;
        if (((Boolean)((class11507)this.u_0).i()).booleanValue()) {
            this.u_7 = Float.valueOf(((Float)this.u_7).floatValue() + 0.1f);
            class068892 = ((class06889)this.u_4).i(((class06889)this.u_5).L((double)(class04995.m((double)((Float)this.u_7).floatValue()) * 2.0f)));
            d = class04995.P((double)((Float)this.u_7).floatValue()) >= 0.0f ? 1.0 : -1.0;
            class06889 class068893 = ((class06889)this.u_5).L(d);
            f = class11908.y((double)class04995.u((double)(-class068893.M), (double)class068893.Z));
        }
        if (((Boolean)((class11507)this.u_1).i()).booleanValue()) {
            d = ((class04453)((class06202)this.y_0).T_4).method_23317() - ((class10401)this.u_3).method_23317();
            double d2 = ((class04453)((class06202)this.y_0).T_4).method_23320() - ((class10401)this.u_3).method_23320();
            double d3 = ((class04453)((class06202)this.y_0).T_4).method_23321() - ((class10401)this.u_3).method_23321();
            f = class11908.y((double)class04995.u((double)d3, (double)d)) - 90.0f;
            f2 = -class11908.y((double)class04995.u((double)d2, (double)Math.hypot(d, d3)));
        }
        ((class10401)this.u_3).method_66233().method_66267(class068892, f, f2);
        ((class10401)this.u_3).method_5683(f, 3);
    }

    void t() {
        boolean bl;
        this.G();
        if ((class10401)this.u_3 == null || (class04453)((class06202)this.y_0).T_4 == null) {
            return;
        }
        ((class10401)this.u_3).method_48922(((class10401)this.u_3).method_48923().N((class08036)((class04453)((class06202)this.y_0).T_4)));
        this.l();
        boolean bl2 = bl = ((class04453)((class06202)this.y_0).T_4).method_7261(0.5f) > 0.9f;
        if (bl && ((class04453)((class06202)this.y_0).T_4).method_5624()) {
            this.N(class04909.GX);
        }
        if (bl && this.j()) {
            this.N(class04909.Gc);
            ((class04453)((class06202)this.y_0).T_4).method_7277((class07049)((class10401)this.u_3));
        } else {
            this.N(bl ? class04909.Gp : class04909.GA);
        }
    }

    private boolean j() {
        return ((class04453)((class06202)this.y_0).T_4).field_6017 > 0.0 && !((class04453)((class06202)this.y_0).T_4).method_24828() && !((class04453)((class06202)this.y_0).T_4).method_6101() && !((class04453)((class06202)this.y_0).T_4).method_5799() && !((class04453)((class06202)this.y_0).T_4).method_74025() && !((class04453)((class06202)this.y_0).T_4).method_5765() && !((class04453)((class06202)this.y_0).T_4).method_5624();
    }

    @class11782
    public void N(class11380 class113802) {
        this.G();
        if ((class04453)((class06202)this.y_0).T_4 == null || (class03448)((class06202)this.y_0).T_3 == null) {
            this.u_3 = null;
            return;
        }
        if ((class10401)this.u_3 == null || ((class10401)this.u_3).method_31481() || ((class10401)this.u_3).method_73183() != (class03448)((class06202)this.y_0).T_3) {
            this.Q();
        }
        this.k();
    }

    private void N(class04891 class048912) {
        ((class03448)((class06202)this.y_0).T_3).method_43128((class07049)((class04453)((class06202)this.y_0).T_4), ((class04453)((class06202)this.y_0).T_4).method_23317(), ((class04453)((class06202)this.y_0).T_4).method_23318(), ((class04453)((class06202)this.y_0).T_4).method_23321(), class048912, class04911.field_15248, 1.0f, 1.0f);
    }

    @class11782
    public void N(class11382 class113822) {
        this.G();
        if ((class10401)this.u_3 == null || class113822.L() != (class10401)this.u_3) {
            return;
        }
        class113822.N();
        this.t();
        ((class04453)((class06202)this.y_0).T_4).method_7350();
    }

    @class11782
    public void N(class10965 class109652) {
        class00381 var3;
        this.G();
        if ((class10401)this.u_3 == null || !((var3 = class109652.L()) instanceof class00556)) {
            return;
        }
        class00556 class005562 = (class00556)var3;
        if (((class12025)class005562).N() != ((class10401)this.u_3).method_5628()) {
            return;
        }
        class109652.N();
        class005562.N((class00565)this.u_2);
    }

    private void G() {
        if (!this.u_init) {
            this.u_init = true;
            this.u_6 = Float.valueOf(0.0f);
            this.u_7 = Float.valueOf(0.0f);
        }
    }
}

