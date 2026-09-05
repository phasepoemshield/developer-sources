/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class11781
 *  com.mojang.authlib.GameProfile
 *  minecraft.class03448
 *  minecraft.class04474
 *  minecraft.class04891
 *  minecraft.class04995
 *  minecraft.class05298
 *  minecraft.class06889
 *  minecraft.class07065
 *  minecraft.class07109
 *  minecraft.class07282
 *  minecraft.class07299
 *  minecraft.class07438
 *  minecraft.class08036
 */
package Nursultan;

import Nursultan.class11781;
import com.mojang.authlib.GameProfile;
import java.util.UUID;
import minecraft.class03448;
import minecraft.class04474;
import minecraft.class04891;
import minecraft.class04995;
import minecraft.class05298;
import minecraft.class06889;
import minecraft.class07065;
import minecraft.class07109;
import minecraft.class07282;
import minecraft.class07299;
import minecraft.class07438;
import minecraft.class08036;

public class class11897
extends class08036
implements class11781 {
    private static String[] W;
    private static double[] m;
    public Object N_0;
    public Object N_1;
    public Object N_2;
    public Object N_3;
    public Object N_4;
    public Object N_5;
    public Object N_6;
    public Object N_7;
    public Object y_0;

    private static class07109 L(class07109 class071092) {
        float f = class071092.y();
        if (f <= 0.0f) {
            return class071092;
        }
        class07109 class071093 = class071092.N(1.0f / f);
        return class071093.N(Math.min(f * class11897.N(class071093), 1.0f));
    }

    public boolean L() {
        return this.method_24828();
    }

    public double M() {
        return this.method_23318();
    }

    private void P() {
        this.N_1 = false;
        this.y_0 = false;
        this.N_2 = false;
        this.N_3 = false;
        this.N_4 = Float.valueOf(0.0f);
        this.N_5 = false;
        this.N_6 = m[3];
    }

    public boolean method_7325() {
        return false;
    }

    public boolean method_66249() {
        return true;
    }

    public class07065 method_33570() {
        return class07065.field_28630;
    }

    public boolean method_5624() {
        this.P();
        return (Boolean)this.N_3;
    }

    public void method_5783(class04891 class048912, float f, float f2) {
    }

    public boolean method_68878() {
        return false;
    }

    public boolean method_5715() {
        this.P();
        return (Boolean)this.N_2;
    }

    public class11897(class03448 class034482) {
        super((class07299)class034482, new GameProfile(UUID.randomUUID(), W[0]));
        this.P();
        this.N_0 = new class04474();
        this.N_4 = Float.valueOf(1.0f);
        this.N_7 = new class06889(m[0], m[1], m[2]);
    }

    static {
        class11897.z();
        class11897.m();
    }

    public void B() {
        this.method_5876();
        this.method_5630();
        this.method_7295();
        this.method_5790();
    }

    public class07438 i() {
        return this;
    }

    private static void m() {
        W = new String[1];
        class11897.W[0] = "mock-player";
    }

    private static void z() {
        m = new double[4];
        class11897.m[0] = Double.longBitsToDouble(0L);
        class11897.m[1] = Double.longBitsToDouble(0L);
        class11897.m[2] = Double.longBitsToDouble(0L);
        class11897.m[3] = Double.longBitsToDouble(0L);
    }

    public double u() {
        this.P();
        return (Double)this.N_6;
    }

    private class07109 y(class07109 class071092) {
        this.P();
        if (class071092.L() == 0.0f) {
            return class071092;
        }
        class07109 class071093 = class071092.N(0.98f).N(((Float)this.N_4).floatValue());
        if (this.method_5715() || this.method_20448()) {
            class071093 = class071093.N((float)this.method_45325(class05298.Y));
        }
        return class11897.L(class071093);
    }

    public boolean y() {
        this.P();
        return (Boolean)this.N_5;
    }

    public class06889 N() {
        this.P();
        return (class06889)this.N_7;
    }

    public void N(boolean bl) {
        this.P();
        this.y_0 = bl;
    }

    private static float N(class07109 class071092) {
        float f = Math.abs(class071092.z);
        float f2 = Math.abs(class071092.U);
        float f3 = f2 > f ? f / f2 : f2 / f;
        return class04995.N((float)(1.0f + class04995.z((float)f3)));
    }

    public void N(class06889 class068892) {
        this.P();
        this.N_7 = class068892;
    }

    public boolean R() {
        this.P();
        return (Boolean)this.y_0;
    }

    public void method_66282() {
        this.P();
        class07109 class071092 = this.y(((class04474)this.N_0).method_3128());
        ((class07438)this).fields_7212a028292fd3c078969e3ee4c71d9e8_0 = Float.valueOf(class071092.z);
        ((class07438)this).fields_7212a028292fd3c078969e3ee4c71d9e8_2 = Float.valueOf(class071092.U);
        ((class07438)this).fields_6212a028292fd3c078969e3ee4c71d9e8_4 = (boolean)((Boolean)this.N_1);
    }

    public void method_6070() {
    }

    public void method_29242(boolean bl) {
    }

    public class07282 method_68876() {
        return class07282.field_9215;
    }

    public boolean method_7340() {
        return true;
    }
}

