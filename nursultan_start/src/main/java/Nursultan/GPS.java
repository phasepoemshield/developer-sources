/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class09063
 *  Nursultan.class09079
 *  Nursultan.class09080
 *  Nursultan.class09087
 *  Nursultan.class09093
 *  Nursultan.class09322
 *  Nursultan.class10705
 *  Nursultan.class10967
 *  Nursultan.class11067
 *  Nursultan.class11072
 *  Nursultan.class11080
 *  Nursultan.class11106
 *  Nursultan.class11174
 *  Nursultan.class11176
 *  Nursultan.class11185
 *  Nursultan.class11204
 *  Nursultan.class11213
 *  Nursultan.class11300
 *  Nursultan.class11499
 *  Nursultan.class11505
 *  Nursultan.class11512
 *  Nursultan.class11524
 *  Nursultan.class11533
 *  Nursultan.class11782
 *  Nursultan.class11908
 *  Nursultan.class11925
 *  Nursultan.class11938
 *  Nursultan.class11998
 *  Nursultan.class12019
 *  Nursultan.class12026
 *  Nursultan.class12031
 *  Nursultan.class12036
 *  Nursultan.class12038
 *  com.mojang.blaze3d.systems.RenderSystem
 *  minecraft.class03448
 *  minecraft.class04453
 *  minecraft.class04995
 *  minecraft.class06202
 *  minecraft.class06889
 *  minecraft.class08066
 *  minecraft.class08844
 *  org.joml.Matrix4f
 *  org.joml.Vector2dc
 */
package Nursultan;

import Nursultan.class09063;
import Nursultan.class09079;
import Nursultan.class09080;
import Nursultan.class09087;
import Nursultan.class09093;
import Nursultan.class09322;
import Nursultan.class10705;
import Nursultan.class10967;
import Nursultan.class11067;
import Nursultan.class11072;
import Nursultan.class11080;
import Nursultan.class11106;
import Nursultan.class11174;
import Nursultan.class11176;
import Nursultan.class11185;
import Nursultan.class11204;
import Nursultan.class11213;
import Nursultan.class11300;
import Nursultan.class11499;
import Nursultan.class11505;
import Nursultan.class11512;
import Nursultan.class11524;
import Nursultan.class11533;
import Nursultan.class11782;
import Nursultan.class11908;
import Nursultan.class11925;
import Nursultan.class11938;
import Nursultan.class11998;
import Nursultan.class12019;
import Nursultan.class12026;
import Nursultan.class12031;
import Nursultan.class12036;
import Nursultan.class12038;
import com.mojang.blaze3d.systems.RenderSystem;
import java.util.regex.Pattern;
import minecraft.class03448;
import minecraft.class04453;
import minecraft.class04995;
import minecraft.class06202;
import minecraft.class06889;
import minecraft.class08066;
import minecraft.class08844;
import org.joml.Matrix4f;
import org.joml.Vector2dc;

@class11080(L="GPS", y=class11072.VISUAL, N=class11106.INTERFACE)
public class GPS
extends class11067 {
    public Object L_0;
    public Object L_1;
    public Object L_2;
    public Object L_3;
    public Object L_4;
    public Object L_5;
    public Object L_6;
    public Object L_7;
    public static Object u_0;
    public static Object u_1;
    public static Object u_2;
    public static Object u_3;

    private static void P() {
        u_0 = null;
        u_1 = Float.valueOf(32.0f);
        u_2 = Float.valueOf(60.0f);
        u_3 = -1;
    }

    private void T() {
    }

    public GPS() {
        this.T();
        this.L_0 = (class11533)class11524.N((class11512)this, (String)"target-x", (String)"", (Pattern)((Pattern)u_0)).N_6((class115362, string) -> this.s());
        this.L_1 = (class11533)class11524.N((class11512)this, (String)"target-z", (String)"", (Pattern)((Pattern)u_0)).N_6((class115362, string) -> this.s());
        this.L_2 = class11524.N((class11512)this, (String)"clear-target", this::m);
        this.L_3 = class11174.N().N(class11204.L().N((class12036)class12019.N_0).N((class09322)class11185.Z_1).N(4).N()).N(class11213.N((class09087)((class09087)class09063.N_2), (int)256, (int)64)).N();
        this.L_4 = ((class09322)class11185.Z_1).z("u_projection");
        this.L_5 = ((class09322)class11185.Z_1).z("u_view");
        this.L_6 = ((class09322)class11185.Z_1).M("texture_in");
        this.L_7 = new Matrix4f();
    }

    static {
        GPS.P();
        u_0 = Pattern.compile("^-?\\d*\\.?\\d*$");
    }

    private static Double B(String string) {
        try {
            return Double.parseDouble(string);
        }
        catch (NumberFormatException numberFormatException) {
            return null;
        }
    }

    private void s() {
        this.T();
        class11938.Q().N(GPS.B(((class11533)this.L_0).i()), GPS.B(((class11533)this.L_1).i()));
    }

    public void m() {
        this.T();
        ((class11533)this.L_0).N("");
        ((class11533)this.L_1).N("");
    }

    private static String N(double d) {
        if (!Double.isInfinite(d) && d == Math.rint(d)) {
            return Long.toString((long)d);
        }
        return Double.toString(d);
    }

    public void N(double d, double d2) {
        this.T();
        ((class11533)this.L_0).N(GPS.N(d));
        ((class11533)this.L_1).N(GPS.N(d2));
    }

    @class11782
    public void N(class10967 class109672) {
        this.T();
        class10705 class107052 = class11938.Q();
        if ((class04453)((class06202)this.y_0).T_4 == null || (class03448)((class06202)this.y_0).T_3 == null || !class107052.L()) {
            return;
        }
        Vector2dc vector2dc = class107052.u();
        class06889 class068892 = class11925.y();
        class08844 class088442 = ((class06202)this.y_0).Nt();
        float f = class11938.i().u();
        float f2 = (float)class088442.U() / 2.0f;
        float f3 = (float)class088442.E() / 4.0f;
        class11499 class114992 = class11505.y();
        float f4 = class11908.N((float)class114992.y());
        float f5 = class04995.P((double)f4);
        float f6 = class04995.m((double)f4);
        double d = vector2dc.x() - class068892.M;
        double d2 = vector2dc.y() - class068892.Z;
        double d3 = -(d2 * (double)f5 - d * (double)f6);
        double d4 = -(d * (double)f5 + d2 * (double)f6);
        float f7 = class11908.N((float)((float)class04995.u((double)d3, (double)d4) * 180.0f / (float)Math.PI));
        String string = "GPS: " + (int)Math.hypot(vector2dc.x() - ((class04453)((class06202)this.y_0).T_4).method_23317(), vector2dc.y() - ((class04453)((class06202)this.y_0).T_4).method_23321()) + "m";
        class09093 class090932 = class09080.u();
        float f8 = 16.0f * f;
        float f9 = class090932.y(string, f8, class09079.REGULAR, false);
        float f10 = class090932.N(f8, class09079.REGULAR, false);
        float f11 = 100.0f * f;
        float f12 = class11908.N((float)(60.0f * (1.0f - Math.clamp((float)class114992.R(), (float)0.0f, (float)90.0f) / 90.0f)));
        float f13 = f11 * class04995.P((double)f7);
        float f14 = f11 * class04995.m((double)f7);
        float f15 = 32.0f * f;
        ((Matrix4f)this.L_7).identity().translate(f2, f3, 0.0f).rotateX(f12).translate(f13, f14, 0.0f).rotateZ(f7);
        class11176.y((class11213)((class11174)this.L_3).u(), (Matrix4f)((Matrix4f)this.L_7), (float)(-f15 / 2.0f), (float)(-f15 / 2.0f), (float)0.0f, (float)f15, (float)f15, (int)-1);
        class090932.y(string).N(f2 - f9 / 2.0f, f3 - f10 / 2.0f).N(f8).N(class09079.REGULAR).N(class11300.L((int)0, (float)50.0f)).i(-1).L();
        class11925.N((class08066)((class06202)this.y_0).e(), (boolean)true);
        ((class11174)this.L_3).N(class093222 -> {
            this.T();
            ((class12038)this.L_4).N(class11925.L());
            ((class12038)this.L_5).N(RenderSystem.getModelViewMatrix());
            ((class12026)this.L_6).N(((class12031)class11998.N_2).N());
        });
    }
}

