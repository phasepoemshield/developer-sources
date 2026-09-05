/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class09063
 *  Nursultan.class09064
 *  Nursultan.class09087
 *  Nursultan.class09097
 *  Nursultan.class09317
 *  Nursultan.class10996
 *  Nursultan.class11067
 *  Nursultan.class11072
 *  Nursultan.class11080
 *  Nursultan.class11106
 *  Nursultan.class11192
 *  Nursultan.class11213
 *  Nursultan.class11218
 *  Nursultan.class11409
 *  Nursultan.class11420
 *  Nursultan.class11425
 *  Nursultan.class11430
 *  Nursultan.class11443
 *  Nursultan.class11456
 *  Nursultan.class11504
 *  Nursultan.class11512
 *  Nursultan.class11515
 *  Nursultan.class11517
 *  Nursultan.class11524
 *  Nursultan.class11535
 *  Nursultan.class11782
 *  minecraft.class06202
 */
package Nursultan;

import Nursultan.class09063;
import Nursultan.class09064;
import Nursultan.class09087;
import Nursultan.class09097;
import Nursultan.class09317;
import Nursultan.class10996;
import Nursultan.class11067;
import Nursultan.class11072;
import Nursultan.class11080;
import Nursultan.class11106;
import Nursultan.class11192;
import Nursultan.class11213;
import Nursultan.class11218;
import Nursultan.class11409;
import Nursultan.class11420;
import Nursultan.class11425;
import Nursultan.class11430;
import Nursultan.class11443;
import Nursultan.class11456;
import Nursultan.class11504;
import Nursultan.class11512;
import Nursultan.class11515;
import Nursultan.class11517;
import Nursultan.class11524;
import Nursultan.class11535;
import Nursultan.class11782;
import minecraft.class06202;

@class11080(L="SkyCustomization", y=class11072.VISUAL, N=class11106.WORLD)
public class SkyCustomization
extends class11067 {
    public Object L_0;
    public Object L_1;
    public Object L_2;
    public Object L_3;
    public Object L_4;
    public Object L_5;
    public Object u_0;
    public Object u_1;
    public Object u_2;
    public Object u_3;
    public Object u_4;
    public Object u_5;
    public Object u_6;
    public Object u_7;
    public boolean u_init;
    public static Object i_0;
    public static Object i_1;

    public class11504 P() {
        this.J();
        return (class11504)this.L_5;
    }

    public class11504 T() {
        this.J();
        return (class11504)this.L_4;
    }

    public SkyCustomization() {
        this.J();
        this.L_0 = class11524.N((class11512)this, (String)"mode", (class11535[])new class11420[]{new class11420("chroma", true, true), new class11420("borealis", false, false)});
        this.L_1 = class11524.N((class11512)this, (String)"aurora-first", (int)-14425478);
        this.L_2 = class11524.N((class11512)this, (String)"aurora-second", (int)-8766209);
        this.L_3 = (class11504)class11524.N((class11512)this, (String)"intensity", (float)1.5f, (float)0.0f, (float)3.0f, (float)0.05f).N(class115362 -> {
            this.J();
            return ((class11420)((class11517)this.L_0).i()).N();
        });
        this.L_4 = (class11504)class11524.N((class11512)this, (String)"softness", (float)0.4f, (float)0.0f, (float)1.0f, (float)0.01f).N(class115362 -> {
            this.J();
            return ((class11420)((class11517)this.L_0).i()).N();
        });
        this.L_5 = (class11504)class11524.N((class11512)this, (String)"coverage", (float)0.5f, (float)0.0f, (float)0.67f, (float)0.01f).N(class115362 -> {
            this.J();
            return ((class11420)((class11517)this.L_0).i()).N();
        });
        this.u_0 = class11524.N((class11512)this, (String)"speed", (float)1.0f, (float)0.0f, (float)5.0f, (float)0.05f);
        this.u_1 = class11524.N((class11512)this, (String)"downscale", (class11535[])new class11443[]{new class11443("_1x", 1, true), new class11443("_2x", 2, false), new class11443("_4x", 4, false), new class11443("_8x", 8, false)});
        this.u_2 = class11213.N((class09087)((class09087)class09063.N_2), (int)4096, (int)1024);
        this.u_3 = class09097.i(() -> {
            this.J();
            return ((class06202)this.y_0).e().N / ((class11443)((class11517)this.u_1).i()).N();
        }, () -> {
            this.J();
            return ((class06202)this.y_0).e().y / ((class11443)((class11517)this.u_1).i()).N();
        });
        this.u_4 = class09097.i(() -> {
            this.J();
            return ((class06202)this.y_0).e().N / (((class11443)((class11517)this.u_1).i()).N() * 3);
        }, () -> {
            this.J();
            return ((class06202)this.y_0).e().y / (((class11443)((class11517)this.u_1).i()).N() * 3);
        });
        this.u_5 = class11218.N().N((class11192)new class11425(this, (class11213)this.u_2)).N((class09064)this.u_3).N((class11192)new class11409((class11213)this.u_2)).L(() -> ((class06202)((class06202)this.y_0)).e()).L((class09064)this.u_3).N();
        this.u_6 = class11218.N().N((class11192)new class11430(this, (class11213)this.u_2)).N((class09064)this.u_4).N((class11192)new class11456((class11213)this.u_2)).L(() -> ((class06202)((class06202)this.y_0)).e()).L((class09064)this.u_4).N();
    }

    static {
        SkyCustomization.Y();
    }

    private void J() {
        if (!this.u_init) {
            this.u_init = true;
            this.u_7 = Float.valueOf(0.0f);
        }
    }

    public class09064 b() {
        this.J();
        return (class09064)this.u_3;
    }

    public class11504 s() {
        this.J();
        return (class11504)this.u_0;
    }

    public class11515 n() {
        this.J();
        return (class11515)this.L_1;
    }

    public class11504 m() {
        this.J();
        return (class11504)this.L_3;
    }

    public class11515 t() {
        this.J();
        return (class11515)this.L_2;
    }

    public class09064 v() {
        this.J();
        return (class09064)this.u_4;
    }

    public class11517<class11420> j() {
        this.J();
        return (class11517)this.L_0;
    }

    @class11782
    public void N(class10996 class109962) {
        this.J();
        this.u_7 = Float.valueOf((((Float)this.u_7).floatValue() + 0.05f * ((Float)((class11504)this.u_0).i()).floatValue()) % 100000.0f);
    }

    public float N(float f) {
        this.J();
        return ((Float)this.u_7).floatValue() + f * 0.05f * ((Float)((class11504)this.u_0).i()).floatValue();
    }

    @class11782
    public void N(class09317 class093172) {
        this.J();
        if (((class11420)((class11517)this.L_0).i()).N()) {
            ((class11218)this.u_5).execute((Object)class093172);
        } else {
            ((class11218)this.u_6).execute((Object)class093172);
        }
    }

    private static void Y() {
        i_0 = 3;
        i_1 = Float.valueOf(0.05f);
    }
}

