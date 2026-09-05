/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.blaze3d.textures.TextureFormat
 *  minecraft.class08419
 *  org.jspecify.annotations.Nullable
 */
package com.mojang.blaze3d.pipeline;

import com.mojang.blaze3d.textures.TextureFormat;
import minecraft.class08419;
import org.jspecify.annotations.Nullable;

public record RenderPipeline$UniformDescription(String name, class08419 type, @Nullable TextureFormat textureFormat) {
    public RenderPipeline$UniformDescription(String string, TextureFormat textureFormat) {
        this(string, class08419.field_60032, textureFormat);
    }

    public RenderPipeline$UniformDescription(String string, class08419 class084192) {
        this(string, class084192, null);
        if (class084192 == class08419.field_60032) {
            throw new IllegalArgumentException("Texel buffer needs a texture format");
        }
    }
}

