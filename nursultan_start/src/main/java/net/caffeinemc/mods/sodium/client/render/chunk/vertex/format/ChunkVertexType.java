/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.caffeinemc.mods.sodium.client.gl.attribute.GlVertexFormat
 */
package net.caffeinemc.mods.sodium.client.render.chunk.vertex.format;

import net.caffeinemc.mods.sodium.client.gl.attribute.GlVertexFormat;
import net.caffeinemc.mods.sodium.client.render.chunk.vertex.format.ChunkVertexEncoder;

public interface ChunkVertexType {
    public GlVertexFormat getVertexFormat();

    public ChunkVertexEncoder getEncoder();
}

