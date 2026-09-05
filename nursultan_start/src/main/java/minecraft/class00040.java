/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00018
 *  minecraft.class00185
 *  minecraft.class01894
 *  minecraft.class03556
 *  minecraft.class04891
 *  minecraft.class04911
 *  minecraft.class06069
 *  minecraft.class06889
 *  minecraft.class07209
 */
package minecraft;

import minecraft.class00018;
import minecraft.class00044;
import minecraft.class00185;
import minecraft.class01894;
import minecraft.class03556;
import minecraft.class04891;
import minecraft.class04911;
import minecraft.class06069;
import minecraft.class06889;
import minecraft.class07209;

public class class00040
extends class00185 {
    private class00040(class04891 class048912, class04911 class049112, float f, float f2, class06069 class060692, boolean bl, int n, class00018 class000182, double d, double d2, double d3) {
        this(class048912.N(), class049112, f, f2, class060692, bl, n, class000182, d, d2, d3, false);
    }

    public class00040(class04891 class048912, class04911 class049112, float f, float f2, class06069 class060692, double d, double d2, double d3) {
        this(class048912, class049112, f, f2, class060692, false, 0, class00018.field_5476, d, d2, d3);
    }

    public class00040(class01894 class018942, class04911 class049112, float f, float f2, class06069 class060692, boolean bl, int n, class00018 class000182, double d, double d2, double d3, boolean bl2) {
        super(class018942, class049112, class060692);
        this.u = f;
        this.i = f2;
        this.R = d;
        this.M = d2;
        this.B = d3;
        this.Z = bl;
        this.z = n;
        this.U = class000182;
        this.E = bl2;
    }

    public class00040(class04891 class048912, class04911 class049112, float f, float f2, class06069 class060692, class07209 class072092) {
        this(class048912, class049112, f, f2, class060692, (double)class072092.method_10263() + 0.5, (double)class072092.method_10264() + 0.5, (double)class072092.method_10260() + 0.5);
    }

    public static class00040 y(class04891 class048912, float f, float f2) {
        return new class00040(class048912.N(), class04911.field_15256, f2, f, class00044.v(), false, 0, class00018.field_5478, 0.0, 0.0, 0.0, true);
    }

    public static class00040 y(class04891 class048912) {
        return class00040.y(class048912, 1.0f, 1.0f);
    }

    public static class00040 N(class04891 class048912, class06069 class060692, double d, double d2, double d3) {
        return new class00040(class048912, class04911.field_15256, 1.0f, 1.0f, class060692, false, 0, class00018.field_5476, d, d2, d3);
    }

    public static class00040 N(class04891 class048912, float f) {
        return class00040.N(class048912, f, 0.25f);
    }

    public static class00040 N(class04891 class048912, float f, float f2) {
        return new class00040(class048912.N(), class04911.field_61058, f2, f, class00044.v(), false, 0, class00018.field_5478, 0.0, 0.0, 0.0, true);
    }

    public static class00040 N(class04891 class048912) {
        return new class00040(class048912.N(), class04911.field_15253, 1.0f, 1.0f, class00044.v(), false, 0, class00018.field_5478, 0.0, 0.0, 0.0, true);
    }

    public static class00040 N(class03556<class04891> class035562, float f) {
        return class00040.N((class04891)class035562.N(), f);
    }

    public static class00040 N(class04891 class048912, class06889 class068892) {
        return new class00040(class048912, class04911.field_15247, 4.0f, 1.0f, class00044.v(), false, 0, class00018.field_5476, class068892.M, class068892.B, class068892.Z);
    }
}

