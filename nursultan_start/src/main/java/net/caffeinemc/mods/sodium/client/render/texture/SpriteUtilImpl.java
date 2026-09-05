/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class08388
 *  net.caffeinemc.mods.sodium.api.texture.SpriteUtil
 *  org.jspecify.annotations.NonNull
 */
package net.caffeinemc.mods.sodium.client.render.texture;

import java.util.Objects;
import minecraft.class08388;
import net.caffeinemc.mods.sodium.api.texture.SpriteUtil;
import net.caffeinemc.mods.sodium.client.render.texture.SpriteContentsExtension;
import org.jspecify.annotations.NonNull;

public class SpriteUtilImpl
implements SpriteUtil {
    public boolean hasAnimation(@NonNull class08388 class083882) {
        Objects.requireNonNull(class083882);
        return ((SpriteContentsExtension)class083882.method_45851()).sodium$hasAnimation();
    }

    public void markSpriteActive(@NonNull class08388 class083882) {
        Objects.requireNonNull(class083882);
        ((SpriteContentsExtension)class083882.method_45851()).sodium$setActive(true);
    }
}

