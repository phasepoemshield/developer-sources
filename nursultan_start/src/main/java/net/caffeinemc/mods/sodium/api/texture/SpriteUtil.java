/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class08388
 *  org.jspecify.annotations.NonNull
 */
package net.caffeinemc.mods.sodium.api.texture;

import minecraft.class08388;
import net.caffeinemc.mods.sodium.api.internal.DependencyInjection;
import org.jspecify.annotations.NonNull;

public interface SpriteUtil {
    public static final SpriteUtil INSTANCE = DependencyInjection.load(SpriteUtil.class, "net.caffeinemc.mods.sodium.client.render.texture.SpriteUtilImpl");

    public boolean hasAnimation(@NonNull class08388 var1);

    public void markSpriteActive(@NonNull class08388 var1);
}

