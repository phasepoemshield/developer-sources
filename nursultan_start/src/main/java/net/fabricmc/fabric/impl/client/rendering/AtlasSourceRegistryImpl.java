/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.MapCodec
 *  minecraft.class01894
 *  minecraft.class04233
 *  net.fabricmc.api.EnvType
 *  net.fabricmc.api.Environment
 *  net.fabricmc.fabric.mixin.client.rendering.SpriteSourcesAccessor
 */
package net.fabricmc.fabric.impl.client.rendering;

import com.mojang.serialization.MapCodec;
import java.util.Objects;
import minecraft.class01894;
import minecraft.class04233;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.mixin.client.rendering.SpriteSourcesAccessor;

@Environment(value=EnvType.CLIENT)
public final class AtlasSourceRegistryImpl {
    private AtlasSourceRegistryImpl() {
    }

    public static void register(class01894 class018942, MapCodec<? extends class04233> mapCodec) {
        Objects.requireNonNull(class018942, "id must not be null!");
        Objects.requireNonNull(mapCodec, "codec must not be null!");
        SpriteSourcesAccessor.getAtlasSourceCodecs().N((Object)class018942, mapCodec);
    }
}

