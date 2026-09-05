/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class01312
 *  minecraft.class05835
 *  minecraft.class05849
 *  minecraft.class05862
 *  minecraft.class06889
 *  minecraft.class07049
 *  minecraft.class07089
 */
package baritone.api.utils;

import baritone.api.utils.Rotation;
import baritone.api.utils.RotationUtils;
import minecraft.class01312;
import minecraft.class05835;
import minecraft.class05849;
import minecraft.class05862;
import minecraft.class06889;
import minecraft.class07049;
import minecraft.class07089;

public final class RayTraceUtils {
    private RayTraceUtils() {
    }

    public static class07089 rayTraceTowards(class07049 class070492, Rotation rotation, double d, boolean bl) {
        class06889 class068892 = bl ? RayTraceUtils.inferSneakingEyePosition(class070492) : class070492.method_5836(1.0f);
        class06889 class068893 = RotationUtils.calcLookDirectionFromRotation(rotation);
        class06889 class068894 = class068892.y(class068893.M * d, class068893.B * d, class068893.Z * d);
        return class070492.method_73183().N(new class05862(class068892, class068894, class05849.field_17559, class05835.field_1348, class070492));
    }

    public static class07089 rayTraceTowards(class07049 class070492, Rotation rotation, double d) {
        return RayTraceUtils.rayTraceTowards(class070492, rotation, d, false);
    }

    public static class06889 inferSneakingEyePosition(class07049 class070492) {
        return new class06889(class070492.method_23317(), class070492.method_23318() + (double)class070492.method_18381(class01312.field_18081), class070492.method_23321());
    }
}

