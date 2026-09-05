/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableList
 */
package net.caffeinemc.mods.sodium.client.render.chunk.shader;

import com.google.common.collect.ImmutableList;
import java.util.List;
import java.util.function.Function;
import net.caffeinemc.mods.sodium.client.render.chunk.shader.ChunkShaderFogComponent;
import net.caffeinemc.mods.sodium.client.render.chunk.shader.ChunkShaderFogComponent$None;
import net.caffeinemc.mods.sodium.client.render.chunk.shader.ChunkShaderFogComponent$Smooth;
import net.caffeinemc.mods.sodium.client.render.chunk.shader.ShaderBindingContext;

public enum ChunkFogMode {
    NONE(ChunkShaderFogComponent$None::new, (List<String>)ImmutableList.of()),
    SMOOTH(ChunkShaderFogComponent$Smooth::new, (List<String>)ImmutableList.of((Object)"USE_FOG", (Object)"USE_FOG_SMOOTH"));

    private final Function<ShaderBindingContext, ChunkShaderFogComponent> factory;
    private final List<String> defines;

    private ChunkFogMode(Function<ShaderBindingContext, ChunkShaderFogComponent> function, List<String> list) {
        this.factory = function;
        this.defines = list;
    }

    public Function<ShaderBindingContext, ChunkShaderFogComponent> getFactory() {
        return this.factory;
    }

    public List<String> getDefines() {
        return this.defines;
    }
}

