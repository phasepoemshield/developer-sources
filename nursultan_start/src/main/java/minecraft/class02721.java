/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class01188
 *  minecraft.class01421
 *  minecraft.class01686
 *  minecraft.class04792
 *  minecraft.class04822
 *  minecraft.class04834
 *  minecraft.class04838
 *  minecraft.class04839
 *  minecraft.class06069
 *  minecraft.class06851
 *  minecraft.class07070
 *  minecraft.class07536
 *  minecraft.class08118
 *  minecraft.class08467
 *  minecraft.class08468
 */
package minecraft;

import java.util.List;
import minecraft.class01188;
import minecraft.class01421;
import minecraft.class01686;
import minecraft.class04792;
import minecraft.class04822;
import minecraft.class04834;
import minecraft.class04838;
import minecraft.class04839;
import minecraft.class06069;
import minecraft.class06851;
import minecraft.class07070;
import minecraft.class07536;
import minecraft.class08118;
import minecraft.class08467;
import minecraft.class08468;

public class class02721
extends class01188<class08468> {
    protected static final String m = "left_sleeve";
    protected static final String P = "right_sleeve";
    protected static final String s = "left_pants";
    protected static final String T = "right_pants";
    private final List<class01686> G;
    public final class01686 b;
    public final class01686 j;
    public final class01686 v;
    public final class01686 n;
    public final class01686 t;
    private final boolean l;

    public class02721(class01686 class016862, boolean bl) {
        super(class016862, class06851::z);
        this.l = bl;
        this.b = this.U.y(m);
        this.j = this.z.y(P);
        this.v = this.W.y(s);
        this.n = this.E.y(T);
        this.t = this.Z.y("jacket");
        this.G = List.of(this.M, this.Z, this.U, this.z, this.W, this.E);
    }

    public class01686 N(class06069 class060692) {
        return (class01686)class07536.N_77(this.G, (class06069)class060692);
    }

    public void N(class08468 class084682, class07070 class070702, class01421 class014212) {
        this.method_63512().N(class014212);
        class01686 class016862 = this.N(class070702);
        if (this.l) {
            float f = 0.5f * (float)(class070702 == class07070.field_6183 ? 1 : -1);
            class016862.y += f;
            class016862.N(class014212);
            class016862.y -= f;
        } else {
            class016862.N(class014212);
        }
    }

    public static class04792 N(class04834 class048342, boolean bl) {
        class04839 class048392;
        class04839 class048393;
        class04792 class047922 = class01188.N((class04834)class048342, (float)0.0f);
        class04839 class048394 = class047922.N();
        float f = 0.25f;
        if (bl) {
            class048393 = class048394.N("left_arm", class04822.L().N(32, 48).N(-1.0f, -2.0f, -2.0f, 3.0f, 12.0f, 4.0f, class048342), class04838.N((float)5.0f, (float)2.0f, (float)0.0f));
            class048392 = class048394.N("right_arm", class04822.L().N(40, 16).N(-2.0f, -2.0f, -2.0f, 3.0f, 12.0f, 4.0f, class048342), class04838.N((float)-5.0f, (float)2.0f, (float)0.0f));
            class048393.N(m, class04822.L().N(48, 48).N(-1.0f, -2.0f, -2.0f, 3.0f, 12.0f, 4.0f, class048342.N(0.25f)), class04838.N);
            class048392.N(P, class04822.L().N(40, 32).N(-2.0f, -2.0f, -2.0f, 3.0f, 12.0f, 4.0f, class048342.N(0.25f)), class04838.N);
        } else {
            class048393 = class048394.N("left_arm", class04822.L().N(32, 48).N(-1.0f, -2.0f, -2.0f, 4.0f, 12.0f, 4.0f, class048342), class04838.N((float)5.0f, (float)2.0f, (float)0.0f));
            class048392 = class048394.y("right_arm");
            class048393.N(m, class04822.L().N(48, 48).N(-1.0f, -2.0f, -2.0f, 4.0f, 12.0f, 4.0f, class048342.N(0.25f)), class04838.N);
            class048392.N(P, class04822.L().N(40, 32).N(-3.0f, -2.0f, -2.0f, 4.0f, 12.0f, 4.0f, class048342.N(0.25f)), class04838.N);
        }
        class048393 = class048394.N("left_leg", class04822.L().N(16, 48).N(-2.0f, 0.0f, -2.0f, 4.0f, 12.0f, 4.0f, class048342), class04838.N((float)1.9f, (float)12.0f, (float)0.0f));
        class048392 = class048394.y("right_leg");
        class048393.N(s, class04822.L().N(0, 48).N(-2.0f, 0.0f, -2.0f, 4.0f, 12.0f, 4.0f, class048342.N(0.25f)), class04838.N);
        class048392.N(T, class04822.L().N(0, 32).N(-2.0f, 0.0f, -2.0f, 4.0f, 12.0f, 4.0f, class048342.N(0.25f)), class04838.N);
        class048394.y("body").N("jacket", class04822.L().N(16, 32).N(-4.0f, 0.0f, -2.0f, 8.0f, 12.0f, 4.0f, class048342.N(0.25f)), class04838.N);
        return class047922;
    }

    public static class08118<class04792> N(class04834 class048342, class04834 class048343) {
        return class01188.y((class04834)class048342, (class04834)class048343).N((T class047922) -> {
            class04839 class048392 = class047922.N();
            class04839 class048393 = class048392.y("left_arm");
            class04839 class048394 = class048392.y("right_arm");
            class048393.N(m, class04822.L(), class04838.N);
            class048394.N(P, class04822.L(), class04838.N);
            class04839 class048395 = class048392.y("left_leg");
            class04839 class048396 = class048392.y("right_leg");
            class048395.N(s, class04822.L(), class04838.N);
            class048396.N(T, class04822.L(), class04838.N);
            class048392.y("body").N("jacket", class04822.L(), class04838.N);
            return class047922;
        });
    }

    public void method_2819(class08468 class084682) {
        boolean bl;
        this.Z.U = bl = !class084682.f;
        this.z.U = bl;
        this.U.U = bl;
        this.E.U = bl;
        this.W.U = bl;
        this.B.U = class084682.C;
        this.t.U = class084682.S;
        this.v.U = class084682.Nj;
        this.n.U = class084682.Nv;
        this.b.U = class084682.Nn;
        this.j.U = class084682.Nt;
        super.method_2819((class08467)class084682);
    }

    public void N(boolean bl) {
        super.N(bl);
        this.b.U = bl;
        this.j.U = bl;
        this.v.U = bl;
        this.n.U = bl;
        this.t.U = bl;
    }
}

