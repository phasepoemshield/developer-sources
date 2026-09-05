/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class09063
 *  Nursultan.class09064
 *  Nursultan.class09079
 *  Nursultan.class09080
 *  Nursultan.class09087
 *  Nursultan.class09093
 *  Nursultan.class09097
 *  Nursultan.class09321
 *  Nursultan.class10967
 *  Nursultan.class10996
 *  Nursultan.class11174
 *  Nursultan.class11176
 *  Nursultan.class11190
 *  Nursultan.class11192
 *  Nursultan.class11213
 *  Nursultan.class11218
 *  Nursultan.class11300
 *  Nursultan.class11893
 *  Nursultan.class11903
 *  Nursultan.class11925
 *  Nursultan.class11934
 *  Nursultan.class12012
 *  Nursultan.class12036
 *  minecraft.class03386
 *  minecraft.class03448
 *  minecraft.class06202
 *  minecraft.class06889
 *  minecraft.class08066
 *  minecraft.class08844
 *  org.joml.Matrix4f
 *  org.joml.Vector2f
 *  org.lwjgl.BufferUtils
 */
package Nursultan;

import Nursultan.class09063;
import Nursultan.class09064;
import Nursultan.class09079;
import Nursultan.class09080;
import Nursultan.class09087;
import Nursultan.class09093;
import Nursultan.class09097;
import Nursultan.class09321;
import Nursultan.class10967;
import Nursultan.class10996;
import Nursultan.class11174;
import Nursultan.class11176;
import Nursultan.class11190;
import Nursultan.class11192;
import Nursultan.class11213;
import Nursultan.class11218;
import Nursultan.class11300;
import Nursultan.class11465;
import Nursultan.class11470;
import Nursultan.class11473;
import Nursultan.class11483;
import Nursultan.class11893;
import Nursultan.class11903;
import Nursultan.class11925;
import Nursultan.class11934;
import Nursultan.class12012;
import Nursultan.class12036;
import java.nio.FloatBuffer;
import java.util.List;
import minecraft.class03386;
import minecraft.class03448;
import minecraft.class06202;
import minecraft.class06889;
import minecraft.class08066;
import minecraft.class08844;
import org.joml.Matrix4f;
import org.joml.Vector2f;
import org.lwjgl.BufferUtils;

public class class11476
extends class11473<class11483> {
    public static Object y_0;
    public static Object y_1;
    public static Object y_2;
    public static Object y_3;
    public static Object y_4;
    public static Object y_5;
    public Object L_0;
    public Object L_1;
    public Object L_2;
    public Object L_3;
    public Object L_4;

    public class11476() {
        this.B();
        this.L_0 = class06202.Nq();
        this.L_1 = BufferUtils.createFloatBuffer((int)40);
        this.L_2 = class11213.N((class09087)((class09087)class09063.N_2), (int)4096, (int)1024);
        this.L_3 = class09097.i(() -> {
            this.B();
            return ((class06202)this.L_0).e().N;
        }, () -> {
            this.B();
            return ((class06202)this.L_0).e().y;
        });
        this.L_4 = class11218.N().N((class11192)new class11465(this, (class11213)this.L_2)).y((class09064)this.L_3).N(33990, () -> {
            this.B();
            return class11925.y((class08066)((class06202)this.L_0).e());
        }).N((class11192)new class11470(this, (class11213)this.L_2)).L(() -> ((class06202)((class06202)this.L_0)).e()).L((class09064)this.L_3).N();
    }

    static {
        class11476.U();
        y_4 = new class12012(true, 1, 1, 1, 1);
        y_5 = class12036.u().N((class12012)y_4).N();
    }

    private void B() {
    }

    private static void U() {
        y_0 = 5;
        y_1 = Float.valueOf(40.0f);
        y_2 = Float.valueOf(500.0f);
        y_3 = Math.PI * 10;
        y_4 = null;
        y_5 = null;
    }

    private boolean N(List<class11483> list, class06889 class068892) {
        this.B();
        ((FloatBuffer)this.L_1).clear();
        int n = 0;
        for (class11483 class114832 : list) {
            float f;
            float f2;
            if (n >= 5) break;
            class11934 class119342 = class114832.M();
            if (this.N(class114832, class119342, class068892) || (f2 = 40.0f * (f = class119342.E().floatValue())) < 0.1f) continue;
            class06889 class068893 = class114832.B();
            int n2 = class114832.i();
            long l = (System.nanoTime() - class119342.z()) / 1000000L;
            float f3 = Math.clamp((float)((float)(class119342.y().toMillis() - l) / 500.0f), (float)0.0f, (float)1.0f) * (float)class11300.y((int)n2) / 255.0f;
            ((FloatBuffer)this.L_1).put((float)(class068893.M - class068892.M));
            ((FloatBuffer)this.L_1).put((float)(class068893.B - class068892.B));
            ((FloatBuffer)this.L_1).put((float)(class068893.Z - class068892.Z));
            ((FloatBuffer)this.L_1).put(f2);
            ((FloatBuffer)this.L_1).put(f3);
            ((FloatBuffer)this.L_1).put((float)class11300.u((int)n2) / 255.0f);
            ((FloatBuffer)this.L_1).put((float)class11300.N((int)n2) / 255.0f);
            ((FloatBuffer)this.L_1).put((float)class11300.i((int)n2) / 255.0f);
            ++n;
        }
        for (int i = n; i < 5; ++i) {
            ((FloatBuffer)this.L_1).put(0.0f).put(0.0f).put(0.0f).put(0.0f).put(0.0f).put(0.0f).put(0.0f).put(0.0f);
        }
        return n > 0;
    }

    @Override
    public void N(class09321 class093212) {
        this.B();
        List<class11483> var2 = this.N();
        if (var2.isEmpty()) {
            return;
        }
        if (!this.N(var2, class093212.y().y())) {
            return;
        }
        ((class11218)this.L_4).execute((Object)class093212);
    }

    @Override
    public void N(class10967 class109672) {
        this.B();
        List var2 = this.N();
        if (var2.isEmpty()) {
            return;
        }
        int n = 16;
        int n2 = 14;
        float f = 8.0f;
        class08844 class088442 = ((class06202)this.L_0).Nt();
        float f2 = class088442.U();
        float f3 = class088442.E();
        float f4 = 0.15f;
        float f5 = Math.min(f2, f3) * 0.15f;
        class09093 class090932 = class09080.u();
        class06889 class068892 = ((class03386)((class06202)this.L_0).i_5).s().y();
        for (class11483 class114832 : var2) {
            class06889 class068893;
            class114832.L().N();
            class114832.M().N();
            class06889 class068894 = class114832.W();
            boolean bl = false;
            if (class114832.R() && (class068893 = ((class03448)((class06202)this.L_0).T_3).method_8469(class114832.y())) != null) {
                class068894 = new class06889(class068893.field_6014, class068893.field_6036 + (double)class068893.method_17682(), class068893.field_5969).N(class068893.method_73189().y(0.0, (double)class068893.method_17682(), 0.0), (double)class109672.y().N(true));
                class114832.N(class068894);
                bl = true;
            }
            class068893 = class068894.u(class068892);
            class06889 class068895 = class068894.y(0.0, bl ? 1.0 : 2.0, 0.0).u(class068892);
            class11893 class118932 = class11925.y((float)((float)class068893.M), (float)((float)class068893.B), (float)((float)class068893.Z));
            class11893 class118933 = class11925.y((float)((float)class068895.M), (float)((float)class068895.B), (float)((float)class068895.Z));
            if (class118932 == null || class118933 == null) continue;
            Vector2f vector2f = class118932.N().round();
            Vector2f vector2f2 = class118933.N().round();
            boolean bl2 = class118932.y() && vector2f.x >= f5 && vector2f.x <= f2 - f5 && vector2f.y >= f5 && vector2f.y <= f3 - f5;
            int n3 = class114832.i();
            Object object = class114832.E() + " m";
            float f6 = class114832.L().E().floatValue();
            float f7 = (vector2f.y - vector2f2.y) * f6;
            float f8 = (vector2f2.y - vector2f.y) * f6;
            float f9 = vector2f.y + f8;
            float f10 = vector2f.x;
            float f11 = f9;
            if (bl2) {
                class11176.N((class11213)((class11174)class11190.y_3).u(), (Matrix4f)((Matrix4f)class11925.y_3), (float)vector2f.x, (float)f9, (float)2.0f, (float)f7, (int)n3, (int)class11300.N((int)n3, (int)0));
            } else {
                Vector2f vector2f3 = class11925.N((Vector2f)vector2f, (float)f2, (float)f3, (float)f5);
                f10 = vector2f3.x;
                f11 = vector2f3.y;
            }
            float f12 = f10 - class090932.y((String)object, 14.0f, class09079.REGULAR, false) / 2.0f;
            float f13 = f11 - 28.0f;
            class11176.N((class09093)class090932, (String)object, (float)f12, (float)f13, (float)14.0f, (int)n3, (int)-16777216);
            object = class114832.m();
            float f14 = f10 - class090932.y((String)object, 16.0f, class09079.REGULAR, false) / 2.0f;
            float f15 = f11 - 48.0f;
            class11176.N((class09093)class090932, (String)object, (float)f14, (float)f15, (float)16.0f, (int)n3, (int)-16777216);
            float f16 = f10;
            class11176.N((class11213)((class11174)class11190.y_3).u(), (Matrix4f)((Matrix4f)class11925.y_3), (float)(f16 + 1.0f), (float)f11, (float)8.0f, (int)n3);
        }
    }

    private boolean N(class11483 class114832, class11934 class119342, class06889 class068892) {
        if (class119342.N(class11903.FORWARDS)) {
            return true;
        }
        return class068892.R(class114832.u()) > 200.0;
    }

    @Override
    public void N(class10996 class109962) {
        this.B();
        List var2 = this.N();
        if (var2.isEmpty()) {
            return;
        }
        class06889 class068892 = ((class03386)((class06202)this.L_0).i_5).s().y();
        for (class11483 class114832 : var2) {
            class114832.N((int)class068892.R(class114832.W()));
        }
    }
}

