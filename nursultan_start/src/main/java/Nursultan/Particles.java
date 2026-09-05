/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class09321
 *  Nursultan.class10990
 *  Nursultan.class10996
 *  Nursultan.class11067
 *  Nursultan.class11072
 *  Nursultan.class11080
 *  Nursultan.class11106
 *  Nursultan.class11168
 *  Nursultan.class11179
 *  Nursultan.class11230
 *  Nursultan.class11244
 *  Nursultan.class11246
 *  Nursultan.class11251
 *  Nursultan.class11253
 *  Nursultan.class11494
 *  Nursultan.class11504
 *  Nursultan.class11512
 *  Nursultan.class11515
 *  Nursultan.class11523
 *  Nursultan.class11524
 *  Nursultan.class11525
 *  Nursultan.class11535
 *  Nursultan.class11782
 *  Nursultan.class11908
 *  minecraft.class04995
 *  minecraft.class06202
 */
package Nursultan;

import Nursultan.class09321;
import Nursultan.class10990;
import Nursultan.class10996;
import Nursultan.class11067;
import Nursultan.class11072;
import Nursultan.class11080;
import Nursultan.class11106;
import Nursultan.class11168;
import Nursultan.class11179;
import Nursultan.class11230;
import Nursultan.class11244;
import Nursultan.class11246;
import Nursultan.class11251;
import Nursultan.class11253;
import Nursultan.class11494;
import Nursultan.class11504;
import Nursultan.class11512;
import Nursultan.class11515;
import Nursultan.class11523;
import Nursultan.class11524;
import Nursultan.class11525;
import Nursultan.class11535;
import Nursultan.class11782;
import Nursultan.class11908;
import java.util.List;
import minecraft.class04995;
import minecraft.class06202;

@class11080(L="Particles", y=class11072.VISUAL, N=class11106.WORLD)
public class Particles
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
    public Object i_0;
    public Object i_1;
    public Object i_2;
    public Object i_3;
    public Object i_4;
    public Object i_5;
    public Object i_6;

    public Particles() {
        this.j();
        this.u_0 = new class11246(this, "totem-popping", true);
        this.u_1 = new class11244(this, "ambience", true);
        this.u_2 = new class11251(this, "thrown-item", false);
        this.u_3 = new class11253(this, "critical-hit", true);
        this.u_4 = class11524.y((class11512)this, (String)"emitters", (class11535[])new class11230[]{(class11230)this.u_0, (class11230)this.u_1, (class11230)this.u_2, (class11230)this.u_3});
        this.u_5 = (class11504)class11524.N((class11512)this, (String)"pinch", (float)10.0f, (float)0.0f, (float)100.0f, (float)1.0f).N_6((class115362, f) -> this.s());
        this.i_0 = (class11504)class11524.N((class11512)this, (String)"size", (float)100.0f, (float)0.0f, (float)100.0f, (float)1.0f).N_6((class115362, f) -> this.s());
        this.i_1 = new class11535("hsv", true);
        this.i_2 = new class11535("custom", false);
        this.i_3 = class11524.N((class11512)this, (String)"color-selectable", (class11535[])new class11535[]{(class11535)this.i_1, (class11535)this.i_2});
        this.i_4 = (class11525)class11524.N((class11512)this, (String)"color-range", (class11494)new class11494(0.0f, 1.0f), (class11494)new class11494(0.5f, 0.85f), (float)0.01f).N(class115362 -> {
            this.j();
            return ((class11535)this.i_1).U();
        });
        this.i_5 = (class11515)class11524.N((class11512)this, (String)"color", (int)-11104513).N(class115362 -> {
            this.j();
            return ((class11535)this.i_2).U();
        });
        this.i_6 = new class11168(65536, this.b(), this.t());
    }

    static {
        Particles.n();
    }

    private float b() {
        this.j();
        return class04995.B((float)(((Float)((class11504)this.i_0).i()).floatValue() / ((class11504)this.i_0).R()), (float)0.1f, (float)0.44f);
    }

    private void s() {
        this.j();
        ((class11168)this.i_6).N(this.b(), this.t());
    }

    private static void n() {
        L_0 = Float.valueOf(0.6f);
        L_1 = Float.valueOf(2.5f);
        L_2 = Float.valueOf(0.1f);
        L_3 = Float.valueOf(0.44f);
    }

    public int m() {
        this.j();
        if (((class11535)this.i_1).U()) {
            return class04995.M((float)class11908.y((float)((class11494)((class11525)this.i_4).i()).N(), (float)((class11494)((class11525)this.i_4).i()).L()), (float)1.0f, (float)1.0f);
        }
        return (Integer)((class11515)this.i_5).i();
    }

    private float t() {
        this.j();
        return class04995.B((float)(((Float)((class11504)this.u_5).i()).floatValue() / ((class11504)this.u_5).R()), (float)0.6f, (float)2.5f);
    }

    private void j() {
    }

    @class11782
    public void N(class09321 class093212) {
        this.j();
        ((class11168)this.i_6).N(class093212);
    }

    @class11782
    public void N(class10990 class109902) {
        class06202.Nq().execute(() -> {
            this.j();
            ((List)((class11523)this.u_4).i()).forEach(class112302 -> class112302.y((Object)class109902));
        });
    }

    @class11782
    public void N(class10996 class109962) {
        this.j();
        ((List)((class11523)this.u_4).i()).forEach(class112302 -> class112302.y((Object)class109962));
        ((class11168)this.i_6).N();
    }

    public void N(class11179 class111792) {
        this.j();
        ((class11168)this.i_6).N(class111792);
    }
}

