/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.MapCodec
 *  minecraft.class01894
 *  minecraft.class04223
 *  minecraft.class04233
 *  minecraft.class06333
 *  net.fabricmc.api.EnvType
 *  net.fabricmc.api.Environment
 */
package net.fabricmc.fabric.mixin.client.rendering;

import com.mojang.serialization.MapCodec;
import minecraft.class01894;
import minecraft.class04223;
import minecraft.class04233;
import minecraft.class06333;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(value=EnvType.CLIENT)
public interface SpriteSourcesAccessor {
    public static /* synthetic */ class06333<class01894, MapCodec<? extends class04233>> getAtlasSourceCodecs() {
        return class04223.y();
    }
}

