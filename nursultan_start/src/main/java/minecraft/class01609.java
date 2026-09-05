/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00578
 *  minecraft.class00941
 *  minecraft.class01407
 *  minecraft.class01583
 *  minecraft.class07915
 *  org.joml.Matrix4f
 */
package minecraft;

import minecraft.class00578;
import minecraft.class00941;
import minecraft.class01407;
import minecraft.class01583;
import minecraft.class01605;
import minecraft.class07915;
import org.joml.Matrix4f;

public interface class01609 {
    default public void N(class00578 class005782) {
    }

    default public void N(class00941 class009412) {
    }

    default public void N(class07915 class079152) {
    }

    public static class01609 N(class01407 class014072, Matrix4f matrix4f, class01583 class015832, int n) {
        return new class01605(class014072, class015832, matrix4f, n);
    }
}

