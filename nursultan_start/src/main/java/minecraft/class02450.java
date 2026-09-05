/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class01188
 *  minecraft.class01686
 *  minecraft.class02721
 *  minecraft.class04792
 *  minecraft.class04822
 *  minecraft.class04834
 *  minecraft.class04838
 *  minecraft.class04839
 *  minecraft.class04995
 *  minecraft.class06851
 *  minecraft.class08118
 *  minecraft.class08467
 */
package minecraft;

import minecraft.class01188;
import minecraft.class01686;
import minecraft.class02721;
import minecraft.class04792;
import minecraft.class04822;
import minecraft.class04834;
import minecraft.class04838;
import minecraft.class04839;
import minecraft.class04995;
import minecraft.class06851;
import minecraft.class08118;
import minecraft.class08467;

public class class02450<S extends class08467>
extends class01188<S> {
    private static final String n = "left_sleeve";
    private static final String t = "right_sleeve";
    private static final String G = "left_pants";
    private static final String l = "right_pants";
    public final class01686 m;
    public final class01686 P;
    public final class01686 s;
    public final class01686 T;
    public final class01686 b;
    public final class01686 j;
    public final class01686 v;

    public class02450(class01686 class016862) {
        super(class016862, class06851::z);
        this.m = this.U.y(n);
        this.P = this.z.y(t);
        this.s = this.W.y(G);
        this.T = this.E.y(l);
        this.b = this.Z.y("jacket");
        this.j = this.M.y("right_ear");
        this.v = this.M.y("left_ear");
    }

    public void method_2819(S s) {
        super.method_2819(s);
        float f = ((class08467)s).NN;
        float f2 = ((class08467)s).Ny;
        float f3 = 0.5235988f;
        float f4 = ((class08467)s).P * 0.1f + f * 0.5f;
        float f5 = 0.08f + f2 * 0.4f;
        this.v.M = -0.5235988f - class04995.P((double)(f4 * 1.2f)) * f5;
        this.j.M = 0.5235988f + class04995.P((double)f4) * f5;
    }

    public void N(boolean bl) {
        super.N(bl);
        this.m.U = bl;
        this.P.U = bl;
        this.s.U = bl;
        this.T.U = bl;
        this.b.U = bl;
    }

    public static class04792 N(class04834 class048342) {
        class04792 class047922 = class02721.N((class04834)class048342, (boolean)false);
        class047922.N().N("body", class04822.L().N(16, 16).N(-4.0f, 0.0f, -2.0f, 8.0f, 12.0f, 4.0f, class048342), class04838.N);
        class02450.N(class048342, class047922).N("hat");
        return class047922;
    }

    public static class08118<class04792> N(class04834 class048342, class04834 class048343) {
        return class02721.N((class04834)class048342, (class04834)class048343).N((T class047922) -> {
            class04839 class048392 = class047922.N().y("head");
            class048392.N("left_ear", class04822.L(), class04838.N);
            class048392.N("right_ear", class04822.L(), class04838.N);
            return class047922;
        });
    }

    public static class04839 N(class04834 class048342, class04792 class047922) {
        class04839 class048392 = class047922.N().N("head", class04822.L().N(0, 0).N(-5.0f, -8.0f, -4.0f, 10.0f, 8.0f, 8.0f, class048342).N(31, 1).N(-2.0f, -4.0f, -5.0f, 4.0f, 4.0f, 1.0f, class048342).N(2, 4).N(2.0f, -2.0f, -5.0f, 1.0f, 2.0f, 1.0f, class048342).N(2, 0).N(-3.0f, -2.0f, -5.0f, 1.0f, 2.0f, 1.0f, class048342), class04838.N);
        class048392.N("left_ear", class04822.L().N(51, 6).N(0.0f, 0.0f, -2.0f, 1.0f, 5.0f, 4.0f, class048342), class04838.N((float)4.5f, (float)-6.0f, (float)0.0f, (float)0.0f, (float)0.0f, (float)-0.5235988f));
        class048392.N("right_ear", class04822.L().N(39, 6).N(-1.0f, 0.0f, -2.0f, 1.0f, 5.0f, 4.0f, class048342), class04838.N((float)-4.5f, (float)-6.0f, (float)0.0f, (float)0.0f, (float)0.0f, (float)0.5235988f));
        return class048392;
    }
}

