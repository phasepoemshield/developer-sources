/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class01894
 *  minecraft.class04995
 *  minecraft.class06563
 *  minecraft.class06584
 *  minecraft.class08476
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import minecraft.class01894;
import minecraft.class04995;
import minecraft.class06563;
import minecraft.class06584;
import minecraft.class08476;
import org.jspecify.annotations.Nullable;

public class class08285
extends class08476 {
    private static final class01894 g = class01894.y((String)"textures/entity/wolf/wolf.png");
    public boolean N;
    public boolean y;
    public float L = 0.62831855f;
    public float u;
    public float i;
    public float R = 1.0f;
    public class01894 M = g;
    public @Nullable class06563 B;
    public class06584 Z = class06584.E;

    public float N(float f) {
        float f2 = (this.i + f) / 1.8f;
        if (f2 < 0.0f) {
            f2 = 0.0f;
        } else if (f2 > 1.0f) {
            f2 = 1.0f;
        }
        return class04995.m((double)(f2 * (float)Math.PI)) * class04995.m((double)(f2 * (float)Math.PI * 11.0f)) * 0.15f * (float)Math.PI;
    }
}

