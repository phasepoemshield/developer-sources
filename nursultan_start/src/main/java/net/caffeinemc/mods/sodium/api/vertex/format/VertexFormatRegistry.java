/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.blaze3d.vertex.VertexFormat
 */
package net.caffeinemc.mods.sodium.api.vertex.format;

import com.mojang.blaze3d.vertex.VertexFormat;
import net.caffeinemc.mods.sodium.api.internal.DependencyInjection;

public interface VertexFormatRegistry {
    public static final VertexFormatRegistry INSTANCE = DependencyInjection.load(VertexFormatRegistry.class, "net.caffeinemc.mods.sodium.client.render.vertex.VertexFormatRegistryImpl");

    public static VertexFormatRegistry instance() {
        return INSTANCE;
    }

    public int allocateGlobalId(VertexFormat var1);
}

