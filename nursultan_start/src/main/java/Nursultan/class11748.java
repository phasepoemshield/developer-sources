/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class09079
 *  Nursultan.class09181
 *  Nursultan.class09211
 *  Nursultan.class09221
 *  Nursultan.class09227
 *  Nursultan.class09692
 *  Nursultan.class09728
 *  Nursultan.class09743
 *  Nursultan.class09759
 *  Nursultan.class09778
 *  Nursultan.class09798
 *  Nursultan.class09801
 *  Nursultan.class09804
 *  Nursultan.class09809
 *  Nursultan.class09904
 *  Nursultan.class09962
 *  Nursultan.class09969
 *  Nursultan.class09975
 *  Nursultan.class09991
 *  Nursultan.class09994
 *  Nursultan.class12020
 *  org.joml.Vector4f
 */
package Nursultan;

import Nursultan.class09079;
import Nursultan.class09181;
import Nursultan.class09211;
import Nursultan.class09221;
import Nursultan.class09227;
import Nursultan.class09692;
import Nursultan.class09728;
import Nursultan.class09743;
import Nursultan.class09759;
import Nursultan.class09778;
import Nursultan.class09798;
import Nursultan.class09801;
import Nursultan.class09804;
import Nursultan.class09809;
import Nursultan.class09904;
import Nursultan.class09962;
import Nursultan.class09969;
import Nursultan.class09975;
import Nursultan.class09991;
import Nursultan.class09994;
import Nursultan.class11730;
import Nursultan.class11769;
import Nursultan.class12020;
import java.util.List;
import org.joml.Vector4f;

public class class11748 {
    private static String[] l;
    public static Object N_0;
    public static Object N_1;
    public static Object N_2;
    public static Object N_3;
    public static Object N_4;
    public static Object N_5;
    public static Object N_6;
    public static Object N_7;
    public static Object y_0;
    public static Object y_1;
    public static Object L_0;
    public static Object L_1;
    public static Object L_2;
    public static Object L_3;
    public static Object L_4;
    public static Object u_0;
    public static Object u_1;
    public static Object u_2;
    public static Object u_3;
    public static Object u_4;
    public static Object u_5;

    private class11748() {
    }

    static {
        class11748.N();
        class11748.u();
        class11748.y();
        u_0 = new String[][]{{l[0], l[1]}, {l[2], l[3]}, {l[4], l[5]}};
        u_1 = ((Object[])u_0).length;
        ((Integer)u_1).intValue();
        ((Integer)u_1).intValue();
        L_0 = Float.valueOf(3.0f);
        N_0 = class09991.N().N(class09969.FLOATING).N(class09962.N()).y(class09962.N()).N(class09975.COLUMN).B(3.0f).L(true);
        N_1 = class09991.N().N(class09962.N()).y(class09962.N()).N(class09975.ROW);
        N_2 = class11748.N(true, true);
        N_3 = class11748.N(true, false);
        N_4 = class11748.N(false, true);
        N_5 = class11748.N(false, false);
        N_6 = class09227.N(class092112 -> class09991.N((class09991[])new class09991[]{class09991.N().i(class092112.M()).N(1.5f, -1778384896), class09221.N((int)12, (class09079)class09079.REGULAR)}));
        class09991 class099912 = class09991.N();
        N_7 = class09991.N((class09991[])new class09991[]{class099912.i(((Integer)class09181.N_0).intValue()).N(1.5f, -1778384896), class09221.N((int)12, (class09079)class09079.REGULAR)});
    }

    private static void u() {
        l = new String[6];
        class11748.l[0] = "hud.hint.move.key";
        class11748.l[1] = "hud.hint.move.text";
        class11748.l[2] = "hud.hint.snap.key";
        class11748.l[3] = "hud.hint.snap.text";
        class11748.l[4] = "hud.hint.reset.key";
        class11748.l[5] = "hud.hint.reset.text";
    }

    private static void y() {
        u_1 = 3;
        u_2 = 12;
        u_3 = Float.valueOf(3.0f);
        u_4 = Float.valueOf(7.0f);
        u_5 = Float.valueOf(5.0f);
        y_0 = Float.valueOf(8.0f);
        y_1 = Float.valueOf(2.0f);
        L_0 = Float.valueOf(0.0f);
        L_1 = Float.valueOf(0.18f);
        L_2 = Float.valueOf(0.08f);
        L_3 = Float.valueOf(0.144f);
        L_4 = Float.valueOf(0.056f);
    }

    private static class09991[] N(boolean bl, boolean bl2) {
        class09991[] class09991Array = new class09991[((Integer)u_1).intValue()];
        for (int i = 0; i < (Integer)u_1; ++i) {
            int n = bl2 ? (Integer)u_1 - 1 - i : i;
            class09728 class097282 = bl ? new class09728(0.18f, class09759.EASE_OUT, (float)n * 0.08f) : new class09728(0.144f, class09759.EASE_OUT, (float)((Integer)u_1 - 1 - n) * 0.056f);
            class09991Array[i] = class09991.N((class09991[])new class09991[]{(class09991)N_1, class09991.N().l(bl ? 1.0f : 0.0f).m(bl ? 0.0f : (bl2 ? 5.0f : -5.0f)).N(class09692.N((class09994[])new class09994[]{class09994.s((class09743)class097282), class09994.Z((class09743)class097282)}))});
        }
        return class09991Array;
    }

    private static boolean N(class11769 class117692, float f, float f2, float f3, float f4) {
        if (f3 <= 0.0f || f4 <= 0.0f) {
            return false;
        }
        for (Object class117693_obj : (List)class11730.N_7) {
            class11769 class117693 = (class11769) class117693_obj;
            Vector4f vector4f;
            if (class117693 == class117692 || (vector4f = class117693.R()) == null || !(f < vector4f.x + vector4f.z) || !(f + f3 > vector4f.x) || !(f2 < vector4f.y + vector4f.w) || !(f2 + f4 > vector4f.y)) continue;
            return true;
        }
        return false;
    }

    private static void N() {
    }

    private static boolean N(class11769 class117692, Vector4f vector4f, float f, float f2, float f3) {
        if (vector4f == null) {
            return true;
        }
        float f4 = vector4f.y - 7.0f - f3;
        float f5 = vector4f.y + vector4f.w + 7.0f;
        if (f4 < 2.0f) {
            return false;
        }
        if (f5 + f3 > class11769.u() - 2.0f) {
            return true;
        }
        float f6 = vector4f.x + f;
        return !class11748.N(class117692, f6, f4, f2, f3) || class11748.N(class117692, f6, f5, f2, f3);
    }

    public static class09798 N(class09809 class098092, class11769 class117692) {
        float f;
        String string = class117692.E();
        class09211 class092112 = (class09211)class098092.N((class09804)class09211.N_6);
        boolean bl = (Boolean)class098092.L(string + "HintTargeted", class117692::W);
        Vector4f vector4f = class117692.R();
        class09904 class099042 = (class09904)class117692.i().N();
        boolean bl2 = class099042 != null && class099042.K() != null;
        float f2 = bl2 ? class099042.c().i() : ((Float)L_0).floatValue();
        float f3 = bl2 ? class099042.c().u() : 0.0f;
        float f4 = vector4f != null && f3 > 0.0f && vector4f.x + f3 > class11769.B() - 8.0f ? vector4f.z - f3 : 0.0f;
        boolean bl3 = class11748.N(class117692, vector4f, f4, f3, f2);
        float f5 = f = (bl3 || vector4f == null) ? -(f2 + 10.0f) : vector4f.w + 10.0f;
        class09991[] class09991Array = bl ? (bl3 ? (class09991[])N_2 : (class09991[])N_3) : (bl3 ? (class09991[])N_4 : (class09991[])N_5);
        return class09778.N((class09991)class09991.N((class09991[])new class09991[]{(class09991)N_0, class09991.N().U(f4).E(f)}), class097843 -> {
            class097843.N(string + "Hints");
            class097843.N(class117692.i());
            for (int i = 0; i < (Integer)u_1; ++i) {
                String string2 = string + "Hint" + i;
                String[] stringArray = ((String[][])u_0)[i];
                class09991 class099912 = class09991Array[i];
                class097843.N_3(class099912, class097842 -> {
                    class097842.N(string2);
                    class097842.y(class098012 -> ((class09801)class098012.N(string2 + "Key")).L(class12020.N((String)stringArray[0])).N(((class09227)N_6).N(class092112)));
                    class097842.y(class098012 -> ((class09801)class098012.N(string2 + "Body")).L(" \u2014 " + class12020.N((String)stringArray[1])).N((class09991)N_7));
                });
            }
        });
    }
}

