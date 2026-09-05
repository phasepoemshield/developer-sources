/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00494
 *  minecraft.class01391
 *  minecraft.class01421
 *  minecraft.class01423
 *  org.joml.Vector3f
 */
package minecraft;

import minecraft.class00494;
import minecraft.class01391;
import minecraft.class01421;
import minecraft.class01423;
import org.joml.Vector3f;

public class class02438 {
    public static void N(class01421 class014212, class01391 class013912, class00494 class004942, double d, double d2, double d3, int n, float f) {
        class01423 class014232 = class014212.L();
        class004942.method_1104((d4, d5, d6, d7, d8, d9) -> {
            Vector3f vector3f = new Vector3f((float)(d7 - d4), (float)(d8 - d5), (float)(d9 - d6)).normalize();
            class013912.N(class014232, (float)(d4 + d), (float)(d5 + d2), (float)(d6 + d3)).method_39415(n).y(class014232, vector3f).method_75298(f);
            class013912.N(class014232, (float)(d7 + d), (float)(d8 + d2), (float)(d9 + d3)).method_39415(n).y(class014232, vector3f).method_75298(f);
        });
    }
}

