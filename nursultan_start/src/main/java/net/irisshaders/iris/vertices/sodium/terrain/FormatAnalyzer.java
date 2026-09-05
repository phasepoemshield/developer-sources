/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  it.unimi.dsi.fastutil.bytes.Byte2ObjectMap
 *  it.unimi.dsi.fastutil.bytes.Byte2ObjectOpenHashMap
 *  net.caffeinemc.mods.sodium.client.gl.attribute.GlVertexFormat
 *  net.caffeinemc.mods.sodium.client.gl.attribute.GlVertexFormat$Builder
 *  net.caffeinemc.mods.sodium.client.render.chunk.vertex.format.ChunkMeshFormats
 *  net.caffeinemc.mods.sodium.client.render.chunk.vertex.format.ChunkVertexType
 *  net.caffeinemc.mods.sodium.client.render.chunk.vertex.format.impl.DefaultChunkMeshAttributes
 */
package net.irisshaders.iris.vertices.sodium.terrain;

import it.unimi.dsi.fastutil.bytes.Byte2ObjectMap;
import it.unimi.dsi.fastutil.bytes.Byte2ObjectOpenHashMap;
import net.caffeinemc.mods.sodium.client.gl.attribute.GlVertexFormat;
import net.caffeinemc.mods.sodium.client.render.chunk.vertex.format.ChunkMeshFormats;
import net.caffeinemc.mods.sodium.client.render.chunk.vertex.format.ChunkVertexType;
import net.caffeinemc.mods.sodium.client.render.chunk.vertex.format.impl.DefaultChunkMeshAttributes;
import net.irisshaders.iris.vertices.sodium.terrain.IrisChunkMeshAttributes;
import net.irisshaders.iris.vertices.sodium.terrain.XHFPModelVertexType;

public class FormatAnalyzer {
    private static final Byte2ObjectMap<ChunkVertexType> classMap = new Byte2ObjectOpenHashMap();

    public static ChunkVertexType createFormat(boolean bl, boolean bl2, boolean bl3, boolean bl4) {
        int n;
        int n2;
        int n3;
        int n4;
        byte by2 = 0;
        if (bl) {
            by2 = (byte)(by2 | 1);
        }
        if (bl2) {
            by2 = (byte)(by2 | 2);
        }
        if (bl3) {
            by2 = (byte)(by2 | 4);
        }
        if (bl4) {
            by2 = (byte)(by2 | 8);
        }
        if (classMap.containsKey(by2)) {
            return (ChunkVertexType)classMap.get(by2);
        }
        int n5 = 20;
        if (bl) {
            n4 = n5;
            n5 += 4;
        } else {
            n4 = 0;
        }
        if (bl2) {
            n3 = n5;
            n5 += 4;
        } else {
            n3 = 0;
        }
        if (bl3) {
            n2 = n5;
            n5 += 4;
        } else {
            n2 = 0;
        }
        if (bl4) {
            n = n5;
            n5 += 4;
        } else {
            n = 0;
        }
        GlVertexFormat.Builder builder = GlVertexFormat.builder((int)n5).addElement(DefaultChunkMeshAttributes.POSITION, 0, 0).addElement(DefaultChunkMeshAttributes.COLOR, 1, 8).addElement(DefaultChunkMeshAttributes.TEXTURE, 2, 12).addElement(DefaultChunkMeshAttributes.LIGHT_MATERIAL_INDEX, 3, 16);
        if (bl) {
            builder.addElement(IrisChunkMeshAttributes.BLOCK_ID, 11, n4);
        }
        if (bl2) {
            builder.addElement(IrisChunkMeshAttributes.NORMAL, 10, n3);
        }
        if (bl3) {
            builder.addElement(IrisChunkMeshAttributes.MID_TEX_COORD, 12, n2);
        }
        if (bl4) {
            builder.addElement(IrisChunkMeshAttributes.MID_BLOCK, 14, n);
        }
        return (ChunkVertexType)classMap.computeIfAbsent(by2, by -> new XHFPModelVertexType(builder.build(), n4, n3, n2, n));
    }

    static {
        classMap.put((byte)0, (Object)ChunkMeshFormats.COMPACT);
    }
}

