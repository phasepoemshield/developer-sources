/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.caffeinemc.mods.sodium.client.gl.arena.GlBufferArena
 *  net.caffeinemc.mods.sodium.client.gl.arena.staging.StagingBuffer
 *  net.caffeinemc.mods.sodium.client.gl.buffer.GlBuffer
 *  net.caffeinemc.mods.sodium.client.gl.buffer.GlBufferStreamer
 *  net.caffeinemc.mods.sodium.client.gl.device.CommandList
 *  net.caffeinemc.mods.sodium.client.gl.tessellation.GlTessellation
 *  net.caffeinemc.mods.sodium.client.render.chunk.vertex.format.ChunkVertexType
 *  net.irisshaders.iris.shaderpack.materialmap.WorldRenderingSettings
 */
package net.caffeinemc.mods.sodium.client.render.chunk.region;

import net.caffeinemc.mods.sodium.client.gl.arena.GlBufferArena;
import net.caffeinemc.mods.sodium.client.gl.arena.staging.StagingBuffer;
import net.caffeinemc.mods.sodium.client.gl.buffer.GlBuffer;
import net.caffeinemc.mods.sodium.client.gl.buffer.GlBufferStreamer;
import net.caffeinemc.mods.sodium.client.gl.device.CommandList;
import net.caffeinemc.mods.sodium.client.gl.tessellation.GlTessellation;
import net.caffeinemc.mods.sodium.client.render.chunk.region.RenderRegion;
import net.caffeinemc.mods.sodium.client.render.chunk.vertex.format.ChunkVertexType;
import net.irisshaders.iris.shaderpack.materialmap.WorldRenderingSettings;

public class RenderRegion$DeviceResources {
    private final GlBufferArena geometryArena;
    private final GlBufferArena indexArena;
    private final GlBufferStreamer chunkFades;
    private GlTessellation tessellation;
    private GlTessellation indexedTessellation;

    public RenderRegion$DeviceResources(CommandList commandList, StagingBuffer stagingBuffer) {
        int n = this.redirect$bim000$iris$useExtendedStride().getVertexFormat().getStride();
        this.geometryArena = new GlBufferArena(commandList, 193536, n, stagingBuffer);
        this.chunkFades = new GlBufferStreamer(commandList, 256, 4);
        this.indexArena = new GlBufferArena(commandList, 256 * RenderRegion.SECTION_INDEX_COUNT_ESTIMATE, 4, stagingBuffer);
    }

    public void delete(CommandList commandList) {
        this.deleteTessellation(commandList);
        this.deleteIndexedTessellation(commandList);
        this.geometryArena.delete(commandList);
        this.indexArena.delete(commandList);
        this.chunkFades.delete(commandList);
    }

    private ChunkVertexType redirect$bim000$iris$useExtendedStride() {
        return WorldRenderingSettings.INSTANCE.getVertexFormat();
    }

    public GlBuffer prepareChunkData(CommandList commandList) {
        return this.chunkFades.prepare(commandList);
    }

    public GlTessellation getTessellation() {
        return this.tessellation;
    }

    public void updateTessellation(CommandList commandList, GlTessellation glTessellation) {
        if (this.tessellation != null) {
            this.tessellation.delete(commandList);
        }
        this.tessellation = glTessellation;
    }

    public GlBuffer getIndexBuffer() {
        return this.indexArena.getBufferObject();
    }

    public GlBuffer getGeometryBuffer() {
        return this.geometryArena.getBufferObject();
    }

    public GlBufferArena getIndexArena() {
        return this.indexArena;
    }

    public GlBufferArena getGeometryArena() {
        return this.geometryArena;
    }

    public void writeMeshTimes(int n, int n2) {
        this.chunkFades.writeData(n, n2);
    }

    public boolean shouldDelete() {
        return this.geometryArena.isEmpty() && this.indexArena.isEmpty();
    }

    public void updateIndexedTessellation(CommandList commandList, GlTessellation glTessellation) {
        if (this.indexedTessellation != null) {
            this.indexedTessellation.delete(commandList);
        }
        this.indexedTessellation = glTessellation;
    }

    public GlTessellation getIndexedTessellation() {
        return this.indexedTessellation;
    }

    public void deleteIndexedTessellation(CommandList commandList) {
        if (this.indexedTessellation != null) {
            this.indexedTessellation.delete(commandList);
            this.indexedTessellation = null;
        }
    }

    public void deleteTessellation(CommandList commandList) {
        if (this.tessellation != null) {
            this.tessellation.delete(commandList);
            this.tessellation = null;
        }
    }
}

