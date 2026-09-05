/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class01894
 *  minecraft.class08626
 *  net.fabricmc.api.EnvType
 *  net.fabricmc.api.Environment
 *  org.jspecify.annotations.Nullable
 */
package net.fabricmc.fabric.api.renderer.v1.mesh;

import minecraft.class01894;
import minecraft.class08626;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import org.jspecify.annotations.Nullable;

@Environment(value=EnvType.CLIENT)
public enum QuadAtlas {
    BLOCK(class08626.N),
    ITEM(class08626.y);

    private final class01894 textureId;

    private QuadAtlas(class01894 class018942) {
        this.textureId = class018942;
    }

    public static @Nullable QuadAtlas of(class01894 class018942) {
        if (class018942.equals((Object)class08626.N)) {
            return BLOCK;
        }
        if (class018942.equals((Object)class08626.y)) {
            return ITEM;
        }
        return null;
    }

    public class01894 getTextureId() {
        return this.textureId;
    }
}

