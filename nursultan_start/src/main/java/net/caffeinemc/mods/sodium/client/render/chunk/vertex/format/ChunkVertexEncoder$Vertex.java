/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.irisshaders.iris.vertices.sodium.terrain.ChunkVertexExtension
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfo
 */
package net.caffeinemc.mods.sodium.client.render.chunk.vertex.format;

import net.irisshaders.iris.vertices.sodium.terrain.ChunkVertexExtension;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

public class ChunkVertexEncoder$Vertex
implements ChunkVertexExtension {
    public float x;
    public float y;
    public float z;
    public int color;
    public float ao;
    public float u;
    public float v;
    public int light;
    private byte blockEmission;
    private int blockId;
    private byte renderType;
    private int localPosX;
    private int localPosY;
    private int localPosZ;
    private boolean ignoresMidBlock = false;

    public boolean ignoreMidBlock() {
        return this.ignoresMidBlock;
    }

    public int getBlockId() {
        return this.blockId;
    }

    private static void handler$bii000$iris$copyVertex(ChunkVertexEncoder$Vertex chunkVertexEncoder$Vertex, ChunkVertexEncoder$Vertex chunkVertexEncoder$Vertex2, CallbackInfo callbackInfo) {
        ((ChunkVertexExtension)chunkVertexEncoder$Vertex).iris$copyData((ChunkVertexExtension)chunkVertexEncoder$Vertex2);
    }

    public static ChunkVertexEncoder$Vertex[] uninitializedQuad() {
        ChunkVertexEncoder$Vertex[] chunkVertexEncoder$VertexArray = new ChunkVertexEncoder$Vertex[4];
        for (int i = 0; i < 4; ++i) {
            chunkVertexEncoder$VertexArray[i] = new ChunkVertexEncoder$Vertex();
        }
        return chunkVertexEncoder$VertexArray;
    }

    public void iris$setData(byte by, byte by2, int n, int n2, int n3, int n4) {
        this.blockEmission = by;
        this.renderType = by2;
        this.blockId = n;
        this.localPosX = n2;
        this.localPosY = n3;
        this.localPosZ = n4;
    }

    public static void copyVertexTo(ChunkVertexEncoder$Vertex chunkVertexEncoder$Vertex, ChunkVertexEncoder$Vertex chunkVertexEncoder$Vertex2) {
        ChunkVertexEncoder$Vertex.handler$bii000$iris$copyVertex(chunkVertexEncoder$Vertex, chunkVertexEncoder$Vertex2, null);
        chunkVertexEncoder$Vertex2.x = chunkVertexEncoder$Vertex.x;
        chunkVertexEncoder$Vertex2.y = chunkVertexEncoder$Vertex.y;
        chunkVertexEncoder$Vertex2.z = chunkVertexEncoder$Vertex.z;
        chunkVertexEncoder$Vertex2.color = chunkVertexEncoder$Vertex.color;
        chunkVertexEncoder$Vertex2.ao = chunkVertexEncoder$Vertex.ao;
        chunkVertexEncoder$Vertex2.u = chunkVertexEncoder$Vertex.u;
        chunkVertexEncoder$Vertex2.v = chunkVertexEncoder$Vertex.v;
        chunkVertexEncoder$Vertex2.light = chunkVertexEncoder$Vertex.light;
    }

    public static void writeVertex(ChunkVertexEncoder$Vertex chunkVertexEncoder$Vertex, float f, float f2, float f3, int n, float f4, float f5, float f6, int n2) {
        chunkVertexEncoder$Vertex.x = f;
        chunkVertexEncoder$Vertex.y = f2;
        chunkVertexEncoder$Vertex.z = f3;
        chunkVertexEncoder$Vertex.color = n;
        chunkVertexEncoder$Vertex.ao = f4;
        chunkVertexEncoder$Vertex.u = f5;
        chunkVertexEncoder$Vertex.v = f6;
        chunkVertexEncoder$Vertex.light = n2;
    }

    public byte getBlockEmission() {
        return this.blockEmission;
    }

    public int getLocalPosZ() {
        return this.localPosZ;
    }

    public void iris$copyData(ChunkVertexExtension chunkVertexExtension) {
        chunkVertexExtension.iris$setData(this.blockEmission, this.renderType, this.blockId, this.localPosX, this.localPosY, this.localPosZ);
    }

    public int getLocalPosY() {
        return this.localPosY;
    }

    public int getLocalPosX() {
        return this.localPosX;
    }

    public byte getRenderType() {
        return this.renderType;
    }

    public void iris$ignoresMidBlock(boolean bl) {
        this.ignoresMidBlock = bl;
    }
}

