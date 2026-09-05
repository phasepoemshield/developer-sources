/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class09080
 *  Nursultan.class09093
 *  Nursultan.class09321
 *  Nursultan.class10967
 *  Nursultan.class10996
 *  Nursultan.class11067
 *  Nursultan.class11072
 *  Nursultan.class11080
 *  Nursultan.class11106
 *  Nursultan.class11174
 *  Nursultan.class11190
 *  Nursultan.class11213
 *  Nursultan.class11225
 *  Nursultan.class11226
 *  Nursultan.class11228
 *  Nursultan.class11241
 *  Nursultan.class11249
 *  Nursultan.class11254
 *  Nursultan.class11300
 *  Nursultan.class11512
 *  Nursultan.class11515
 *  Nursultan.class11524
 *  Nursultan.class11535
 *  Nursultan.class11782
 *  Nursultan.class11925
 *  minecraft.class01421
 *  minecraft.class03386
 *  minecraft.class03448
 *  minecraft.class04499
 *  minecraft.class06202
 *  minecraft.class06570
 *  minecraft.class06584
 *  minecraft.class06889
 *  minecraft.class07049
 *  minecraft.class07488
 *  minecraft.class07517
 *  minecraft.class08007
 *  minecraft.class08045
 *  minecraft.class08591
 *  org.joml.Matrix4f
 *  org.joml.Matrix4fStack
 *  org.joml.Vector2f
 */
package Nursultan;

import Nursultan.class09080;
import Nursultan.class09093;
import Nursultan.class09321;
import Nursultan.class10967;
import Nursultan.class10996;
import Nursultan.class11067;
import Nursultan.class11072;
import Nursultan.class11080;
import Nursultan.class11106;
import Nursultan.class11174;
import Nursultan.class11190;
import Nursultan.class11213;
import Nursultan.class11225;
import Nursultan.class11226;
import Nursultan.class11228;
import Nursultan.class11241;
import Nursultan.class11249;
import Nursultan.class11254;
import Nursultan.class11300;
import Nursultan.class11512;
import Nursultan.class11515;
import Nursultan.class11524;
import Nursultan.class11535;
import Nursultan.class11782;
import Nursultan.class11925;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import minecraft.class01421;
import minecraft.class03386;
import minecraft.class03448;
import minecraft.class04499;
import minecraft.class06202;
import minecraft.class06570;
import minecraft.class06584;
import minecraft.class06889;
import minecraft.class07049;
import minecraft.class07488;
import minecraft.class07517;
import minecraft.class08007;
import minecraft.class08045;
import minecraft.class08591;
import org.joml.Matrix4f;
import org.joml.Matrix4fStack;
import org.joml.Vector2f;

@class11080(L="Predictions", y=class11072.VISUAL, N=class11106.WORLD)
public class Predictions
extends class11067 {
    public static Object L_0;
    public Object u_0;
    public Object u_1;
    public Object u_2;
    public Object u_3;
    public Object u_4;
    public Object u_5;
    public Object u_6;
    public Object i_0;
    public Object i_1;

    private boolean L(class07049 class070492) {
        if (class070492.method_24828()) {
            return false;
        }
        if (class070492.field_6014 == class070492.method_23317() && class070492.field_5969 == class070492.method_23321()) {
            return false;
        }
        if (class070492.field_5960) {
            return false;
        }
        if (!class070492.method_5805()) {
            return false;
        }
        if (class070492 instanceof class07517) {
            return !((class03448)((class06202)this.y_0).T_3).method_8600(class070492, class070492.method_5829()).iterator().hasNext();
        }
        return true;
    }

    public Predictions() {
        this.v();
        this.i_0 = new class11254("pearl", true, new class11228((class11225)class11225.L_2));
        this.i_1 = new class11254("trident", true, (class11228)new class11249((class11225)class11225.L_1));
        this.u_0 = new class11254("arrow", true, (class11228)new class11249((class11225)class11225.L_0));
        this.u_1 = new class11254("potions", true, new class11228((class11225)class11225.L_3));
        this.u_2 = new class11254("snowball", true, new class11228((class11225)class11225.L_4));
        this.u_3 = new class11254("windcharge", true, new class11228((class11225)class11225.L_5));
        this.u_4 = class11524.y((class11512)this, (String)"predict-entity", (class11535[])new class11254[]{(class11254)this.i_1, (class11254)this.i_0, (class11254)this.u_0, (class11254)this.u_1, (class11254)this.u_2, (class11254)this.u_3});
        this.u_5 = class11524.N((class11512)this, (String)"line-color", (int)-11104513);
        this.u_6 = new ArrayList();
    }

    static {
        Predictions.n();
    }

    private static void n() {
        L_0 = Float.valueOf(4.0f);
    }

    private void v() {
    }

    private class06584 y(class07049 class070492) {
        if (class070492 instanceof class07488) {
            return class06570.nz.E();
        }
        if (class070492 instanceof class07517) {
            return class06570.db.E();
        }
        if (class070492 instanceof class08007) {
            class08007 class080072 = (class08007)class070492;
            return class080072.B();
        }
        if (class070492 instanceof class08591) {
            class08591 class085912 = (class08591)class070492;
            return class085912.L();
        }
        if (class070492 instanceof class08045) {
            return class06570.jP.E();
        }
        if (class070492 instanceof class04499) {
            return class06570.Gz.E();
        }
        return class06584.E;
    }

    private class11254 N(class07049 class070492) {
        this.v();
        if (class070492 instanceof class07488) {
            return (class11254)this.i_0;
        }
        if (class070492 instanceof class07517) {
            return (class11254)this.i_1;
        }
        if (class070492 instanceof class08007) {
            return (class11254)this.u_0;
        }
        if (class070492 instanceof class08591) {
            return (class11254)this.u_1;
        }
        if (class070492 instanceof class08045) {
            return (class11254)this.u_2;
        }
        if (class070492 instanceof class04499) {
            return (class11254)this.u_3;
        }
        return null;
    }

    @class11782
    public void N(class10996 class109962) {
        this.v();
        ((List)this.u_6).clear();
        for (class07049 class070492 : ((class03448)((class06202)this.y_0).T_3).M()) {
            class11254 class112542 = this.N(class070492);
            if (class112542 == null || !class112542.U() || !this.L(class070492)) continue;
            ((List)this.u_6).add(class112542.N().N(class070492, class070492.method_73189(), class070492.method_18798()));
        }
    }

    @class11782
    public void N(class09321 class093212) {
        this.v();
        if (((List)this.u_6).isEmpty()) {
            return;
        }
        class11174 class111742 = (class11174)class11190.N_2;
        class01421 class014212 = class093212.L();
        class014212.N();
        class06889 class068892 = class093212.y().y();
        Matrix4fStack matrix4fStack = class093212.R();
        int n = (Integer)((class11515)this.u_5).i();
        int n2 = class11300.y((int)n);
        for (class11241 class112412 : (List)this.u_6) {
            class112412.N().ifPresent(class112232 -> {
                if (class112232.u() instanceof class08591) {
                    class11226.N((class06889)class068892, (class06889)class112232.N(), (float)4.0f, (int)n);
                }
            });
            List var10 = class112412.y();
            if (var10.isEmpty()) continue;
            class06889 class068893 = (class06889)var10.getFirst();
            for (int i = 1; i < var10.size(); ++i) {
                class06889 class068894 = (class06889)var10.get(i);
                class06889 class068895 = class068893.u(class068892);
                class06889 class068896 = class068894.u(class068892);
                class111742.R().N((Matrix4f)matrix4fStack, (float)class068895.M, (float)class068895.B, (float)class068895.Z).N((Matrix4f)matrix4fStack, (float)class068896.M, (float)class068896.B, (float)class068896.Z).y(class11300.N((int)n, (int)((int)(Math.min(1.0f, (float)(i - 1) / 5.0f) * (float)n2)))).y(class11300.N((int)n, (int)((int)(Math.min(1.0f, (float)i / 5.0f) * (float)n2)))).N(0.0f).y();
                class068893 = class068894;
            }
        }
        class014212.y();
        class11226.N((class09321)class093212);
    }

    @class11782
    public void N(class10967 class109672) {
        this.v();
        if (((List)this.u_6).isEmpty()) {
            return;
        }
        class11174 class111742 = (class11174)class11190.y_3;
        class09093 class090932 = class09080.u();
        Iterator iterator = ((List)this.u_6).iterator();
        while (iterator.hasNext()) {
            ((class11241)iterator.next()).N().ifPresent(class112232 -> {
                class06889 class068892 = class112232.N().u(((class03386)((class06202)this.y_0).i_5).s().y());
                Vector2f vector2f = class11925.N((float)((float)class068892.M), (float)((float)class068892.B), (float)((float)class068892.Z));
                if (vector2f != null) {
                    vector2f = vector2f.round();
                    int n = class112232.L();
                    float f = n <= 0 ? 0.0f : (float)n / (float)(class112232.u().field_6012 + n);
                    class11925.N((class09093)class090932, (class11213)class111742.u(), (String)"", (int)16, (float)vector2f.x, (float)vector2f.y, (class06584)this.y(class112232.u()), (int)n, (float)f);
                }
            });
        }
    }
}

