/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  de.maxhenkel.voicechat.Voicechat
 *  minecraft.class04995
 *  minecraft.class07109
 */
package de.maxhenkel.voicechat.voice.common;

import de.maxhenkel.voicechat.Voicechat;
import minecraft.class04995;
import minecraft.class07109;

public class Utils {
    public static void sleep(int n) {
        try {
            Thread.sleep(n);
        }
        catch (InterruptedException interruptedException) {
            // empty catch block
        }
    }

    private static float multiply(class07109 class071092, class07109 class071093) {
        return class071092.z * class071093.z + class071092.U * class071093.U;
    }

    private static double magnitude(class07109 class071092) {
        return Math.sqrt(Math.pow(class071092.z, 2.0) + Math.pow(class071092.U, 2.0));
    }

    private static class07109 rotate(class07109 class071092, float f) {
        return new class07109(class071092.z * class04995.P((double)f) - class071092.U * class04995.m((double)f), class071092.z * class04995.m((double)f) + class071092.U * class04995.P((double)f));
    }

    public static float angle(class07109 class071092, class07109 class071093) {
        return (float)Math.toDegrees(Math.atan2(class071092.z * class071093.z + class071092.U * class071093.U, class071092.z * class071093.U - class071092.U * class071093.z));
    }

    public static float normalizeAngle(float f) {
        if ((f %= 360.0f) <= -180.0f) {
            f += 360.0f;
        } else if (f > 180.0f) {
            f -= 360.0f;
        }
        return f;
    }

    public static float getDefaultDistanceServer() {
        return ((Double)Voicechat.SERVER_CONFIG.voiceChatDistance.get()).floatValue();
    }
}

