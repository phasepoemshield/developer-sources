/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00094
 *  minecraft.class01686
 *  minecraft.class04792
 *  minecraft.class04806
 *  minecraft.class04822
 *  minecraft.class04834
 *  minecraft.class04838
 *  minecraft.class04839
 *  minecraft.class06078
 *  minecraft.class06851
 *  minecraft.class08797
 */
package minecraft;

import java.util.Set;
import minecraft.class00094;
import minecraft.class01686;
import minecraft.class01769;
import minecraft.class04792;
import minecraft.class04806;
import minecraft.class04822;
import minecraft.class04834;
import minecraft.class04838;
import minecraft.class04839;
import minecraft.class06078;
import minecraft.class06851;
import minecraft.class08797;

public class class01803
extends class06078<class08797> {
    private static final float N = 0.6f;
    private static final float y = 0.8f;
    private static final float L = 1.0f;
    private final class01686 u;
    private final class01686 i;
    private final class01686 R;
    private final class01686 M;
    private final class01686 B;
    private final class01686 Z;
    private final class01686 z;
    private final class00094 U;
    private final class00094 E;
    private final class00094 W;
    private final class00094 m;
    private final class00094 P;
    private final class00094 s;

    public static class04806 L() {
        class04792 class047922 = class01803.B();
        class047922.N().N(Set.of("eyes"));
        return class04806.N((class04792)class047922, (int)32, (int)32);
    }

    public class01686 M() {
        return this.R;
    }

    public class01803(class01686 class016862) {
        super(class016862, class06851::z);
        this.R = class016862.y("wind_body");
        this.Z = this.R.y("wind_bottom");
        this.B = this.Z.y("wind_mid");
        this.M = this.B.y("wind_top");
        this.u = class016862.y("body").y("head");
        this.i = this.u.y("eyes");
        this.z = class016862.y("body").y("rods");
        this.U = class01769.N.N(class016862);
        this.E = class01769.y.N(class016862);
        this.W = class01769.i.N(class016862);
        this.m = class01769.R.N(class016862);
        this.P = class01769.u.N(class016862);
        this.s = class01769.L.N(class016862);
    }

    private static class04792 B() {
        class04792 class047922 = new class04792();
        class04839 class048392 = class047922.N();
        class04839 class048393 = class048392.N("body", class04822.L(), class04838.N((float)0.0f, (float)0.0f, (float)0.0f));
        class04839 class048394 = class048393.N("rods", class04822.L(), class04838.N((float)0.0f, (float)8.0f, (float)0.0f));
        class048394.N("rod_1", class04822.L().N(0, 17).N(-1.0f, 0.0f, -3.0f, 2.0f, 8.0f, 2.0f, new class04834(0.0f)), class04838.N((float)2.5981f, (float)-3.0f, (float)1.5f, (float)-2.7489f, (float)-1.0472f, (float)3.1416f));
        class048394.N("rod_2", class04822.L().N(0, 17).N(-1.0f, 0.0f, -3.0f, 2.0f, 8.0f, 2.0f, new class04834(0.0f)), class04838.N((float)-2.5981f, (float)-3.0f, (float)1.5f, (float)-2.7489f, (float)1.0472f, (float)3.1416f));
        class048394.N("rod_3", class04822.L().N(0, 17).N(-1.0f, 0.0f, -3.0f, 2.0f, 8.0f, 2.0f, new class04834(0.0f)), class04838.N((float)0.0f, (float)-3.0f, (float)-3.0f, (float)0.3927f, (float)0.0f, (float)0.0f));
        class048393.N("head", class04822.L().N(4, 24).N(-5.0f, -5.0f, -4.2f, 10.0f, 3.0f, 4.0f, new class04834(0.0f)).N(0, 0).N(-4.0f, -8.0f, -4.0f, 8.0f, 8.0f, 8.0f, new class04834(0.0f)), class04838.N((float)0.0f, (float)4.0f, (float)0.0f)).N("eyes", class04822.L().N(4, 24).N(-5.0f, -5.0f, -4.2f, 10.0f, 3.0f, 4.0f, new class04834(0.0f)).N(0, 0).N(-4.0f, -8.0f, -4.0f, 8.0f, 8.0f, 8.0f, new class04834(0.0f)), class04838.N((float)0.0f, (float)0.0f, (float)0.0f));
        class048392.N("wind_body", class04822.L(), class04838.N((float)0.0f, (float)0.0f, (float)0.0f)).N("wind_bottom", class04822.L().N(1, 83).N(-2.5f, -7.0f, -2.5f, 5.0f, 7.0f, 5.0f, new class04834(0.0f)), class04838.N((float)0.0f, (float)24.0f, (float)0.0f)).N("wind_mid", class04822.L().N(74, 28).N(-6.0f, -6.0f, -6.0f, 12.0f, 6.0f, 12.0f, new class04834(0.0f)).N(78, 32).N(-4.0f, -6.0f, -4.0f, 8.0f, 6.0f, 8.0f, new class04834(0.0f)).N(49, 71).N(-2.5f, -6.0f, -2.5f, 5.0f, 6.0f, 5.0f, new class04834(0.0f)), class04838.N((float)0.0f, (float)-7.0f, (float)0.0f)).N("wind_top", class04822.L().N(0, 0).N(-9.0f, -8.0f, -9.0f, 18.0f, 8.0f, 18.0f, new class04834(0.0f)).N(6, 6).N(-6.0f, -8.0f, -6.0f, 12.0f, 8.0f, 12.0f, new class04834(0.0f)).N(105, 57).N(-2.5f, -8.0f, -2.5f, 5.0f, 8.0f, 5.0f, new class04834(0.0f)), class04838.N((float)0.0f, (float)-6.0f, (float)0.0f));
        return class047922;
    }

    public class01686 i() {
        return this.i;
    }

    public class01686 u() {
        return this.u;
    }

    public static class04806 y() {
        class04792 class047922 = class01803.B();
        class047922.N().N(Set.of("wind_body"));
        return class04806.N((class04792)class047922, (int)128, (int)128);
    }

    public static class04806 N() {
        class04792 class047922 = class01803.B();
        class047922.N().N(Set.of("head", "rods"));
        return class04806.N((class04792)class047922, (int)32, (int)32);
    }

    public void method_2819(class08797 class087972) {
        super.method_2819((Object)class087972);
        this.U.N(class087972.N, class087972.P);
        this.E.N(class087972.y, class087972.P);
        this.W.N(class087972.L, class087972.P);
        this.m.N(class087972.u, class087972.P);
        this.P.N(class087972.i, class087972.P);
        this.s.N(class087972.R, class087972.P);
    }

    public class01686 R() {
        return this.z;
    }
}

