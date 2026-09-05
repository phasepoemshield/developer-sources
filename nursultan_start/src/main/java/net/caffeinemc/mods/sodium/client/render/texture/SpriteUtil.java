/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class08388
 *  net.caffeinemc.mods.sodium.api.texture.SpriteUtil
 *  org.jspecify.annotations.Nullable
 */
package net.caffeinemc.mods.sodium.client.render.texture;

import minecraft.class08388;
import org.jspecify.annotations.Nullable;

@Deprecated(forRemoval=true)
public class SpriteUtil {
    @Deprecated(forRemoval=true)
    public static boolean hasAnimation(@Nullable class08388 class083882) {
        if (class083882 != null) {
            return net.caffeinemc.mods.sodium.api.texture.SpriteUtil.INSTANCE.hasAnimation(class083882);
        }
        return false;
    }

    @Deprecated(forRemoval=true)
    public static void markSpriteActive(@Nullable class08388 class083882) {
        if (class083882 != null) {
            net.caffeinemc.mods.sodium.api.texture.SpriteUtil.INSTANCE.markSpriteActive(class083882);
        }
    }
}

