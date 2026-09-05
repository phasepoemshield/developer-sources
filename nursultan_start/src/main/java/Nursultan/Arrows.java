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
 *  Nursultan.class10967
 *  Nursultan.class11010
 *  Nursultan.class11011
 *  Nursultan.class11012
 *  Nursultan.class11016
 *  Nursultan.class11023
 *  Nursultan.class11032
 *  Nursultan.class11034
 *  Nursultan.class11044
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
 *  Nursultan.class11505
 *  Nursultan.class11512
 *  Nursultan.class11523
 *  Nursultan.class11524
 *  Nursultan.class11535
 *  Nursultan.class11782
 *  Nursultan.class11801
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
 *  minecraft.class07049
 *  minecraft.class08066
 *  minecraft.class08844
 *  org.joml.Matrix4f
 */
package Nursultan;

import Nursultan.class09063;
import Nursultan.class09079;
import Nursultan.class09080;
import Nursultan.class09087;
import Nursultan.class09093;
import Nursultan.class09322;
import Nursultan.class10967;
import Nursultan.class11010;
import Nursultan.class11011;
import Nursultan.class11012;
import Nursultan.class11016;
import Nursultan.class11023;
import Nursultan.class11032;
import Nursultan.class11034;
import Nursultan.class11044;
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
import Nursultan.class11505;
import Nursultan.class11512;
import Nursultan.class11523;
import Nursultan.class11524;
import Nursultan.class11535;
import Nursultan.class11782;
import Nursultan.class11801;
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
import java.util.List;
import minecraft.class03448;
import minecraft.class04453;
import minecraft.class04995;
import minecraft.class06202;
import minecraft.class06889;
import minecraft.class07049;
import minecraft.class08066;
import minecraft.class08844;
import org.joml.Matrix4f;

@class11080(L="Arrows", y=class11072.VISUAL, N=class11106.SCREEN)
public class Arrows
extends class11067 {
    public Object L_0;
    public Object L_1;
    public Object L_2;
    public Object L_3;
    public Object L_4;
    public Object u_0;
    public Object u_1;
    public Object u_2;
    public Object u_3;
    public Object u_4;
    public Object u_5;
    public Object u_6;
    public Object u_7;
    public static Object i_0;

    public Arrows() {
        this.m();
        this.u_0 = new class11023(this, "players", true);
        this.u_1 = new class11010(this, "friends", true);
        this.u_2 = new class11032(this, "villagers", true);
        this.u_3 = new class11044(this, "monsters", true);
        this.u_4 = new class11016(this, "animals", true);
        this.u_5 = new class11011(this, "items", true);
        this.u_6 = new class11012(this, "party", true);
        this.u_7 = class11524.y((class11512)this, (String)"entities", (class11535[])new class11034[]{(class11023)this.u_0, (class11012)this.u_6, (class11010)this.u_1, (class11032)this.u_2, (class11011)this.u_5, (class11044)this.u_3, (class11016)this.u_4});
        for (class11034 class110342 : ((class11523)this.u_7).L()) {
            if (!(class110342 instanceof class11801)) continue;
            class110342.N((Object)this);
        }
        this.L_0 = class11174.N().N(class11204.L().N((class12036)class12019.N_0).N((class09322)class11185.Z_1).N(4).N()).N(class11213.N((class09087)((class09087)class09063.N_2), (int)4096, (int)1024)).N();
        this.L_1 = ((class09322)class11185.Z_1).z("u_projection");
        this.L_2 = ((class09322)class11185.Z_1).z("u_view");
        this.L_3 = ((class09322)class11185.Z_1).M("texture_in");
        this.L_4 = new Matrix4f();
    }

    static {
        Arrows.s();
    }

    private static void s() {
        i_0 = Float.valueOf(32.0f);
    }

    private void m() {
    }

    @class11782
    public void N(class10967 class109672) {
        this.m();
        class06889 class068892 = class11925.y();
        class08844 class088442 = ((class06202)this.y_0).Nt();
        float f = (float)class088442.U() / 2.0f;
        float f2 = (float)class088442.E() / 2.0f;
        float f3 = class11908.N((float)class11505.y().y());
        float f4 = class04995.P((double)f3);
        float f5 = class04995.m((double)f3);
        for (class07049 class070492 : ((class03448)((class06202)this.y_0).T_3).M()) {
            for (class11034 class110342 : (List)((class11523)this.u_7).i()) {
                if (!class110342.test((Object)class070492)) continue;
                double d = class11925.i((class07049)class070492);
                double d2 = class11925.L((class07049)class070492);
                double d3 = ((class04453)((class06202)this.y_0).T_4).method_5858(class070492);
                this.N(class110342, null, d, class068892, d2, f4, f5, f, f2, d3);
            }
        }
        if (((class11012)this.u_6).U()) {
            for (class07049 class070492 : class11938.N().N()) {
                float f6 = (float)(System.currentTimeMillis() - class070492.y()) / 1000.0f;
                double d = class070492.i().x();
                double d4 = class070492.i().z();
                double d5 = class04995.u((double)f6, (double)class070492.N().x(), (double)d);
                double d6 = class04995.u((double)f6, (double)class070492.N().z(), (double)d4);
                String string = class070492.L() + " " + (int)Math.hypot(((class04453)((class06202)this.y_0).T_4).method_23317() - d, ((class04453)((class06202)this.y_0).T_4).method_23321() - d4) + "m";
                this.N((class11034)((class11012)this.u_6), string, d5, class068892, d6, f4, f5, f, f2, class070492.i().distanceSquared(class068892.M, class068892.B, class068892.Z));
            }
        }
        class11925.N((class08066)((class06202)this.y_0).e(), (boolean)true);
        ((class11174)this.L_0).N(class093222 -> {
            this.m();
            ((class12038)this.L_1).N(class11925.L());
            ((class12038)this.L_2).N(RenderSystem.getModelViewMatrix());
            ((class12026)this.L_3).N(((class12031)class11998.N_2).N());
        });
    }

    private int N(double d, int n) {
        d = Math.clamp((double)(d / 512.0), (double)0.5, (double)1.0);
        return class11300.N((int)n, (int)((int)((double)class11300.y((int)n) * d)));
    }

    private void N(class11034 class110342, String string, double d, class06889 class068892, double d2, float f, float f2, float f3, float f4, double d3) {
        this.m();
        double d4 = d - class068892.M;
        double d5 = d2 - class068892.Z;
        double d6 = -(d5 * (double)f - d4 * (double)f2);
        double d7 = -(d4 * (double)f + d5 * (double)f2);
        float f5 = class11908.N((float)((float)class04995.u((double)d6, (double)d7) * 180.0f / (float)Math.PI));
        float f6 = f3 + class110342.N() * class04995.P((double)f5);
        float f7 = f4 + class110342.N() * class04995.m((double)f5);
        if (string != null) {
            class09093 class090932 = class09080.u();
            float f8 = 12.0f;
            class11176.N((class09093)class090932, (String)string, (float)(f6 - class090932.y(string, f8, class09079.REGULAR, false) / 2.0f), (float)(f7 - 32.0f), (float)f8, (int)class110342.L(), (int)-16777216);
        }
        ((Matrix4f)this.L_4).identity().translate(f6, f7, 0.0f).rotate(f5, 0.0f, 0.0f, 1.0f);
        class11176.y((class11213)((class11174)this.L_0).u(), (Matrix4f)((Matrix4f)this.L_4), (float)-16.0f, (float)-16.0f, (float)0.0f, (float)32.0f, (float)32.0f, (int)this.N(d3, class110342.L()));
    }
}

