/*
 * Decompiled with CFR 0.152.
 */
package net.irisshaders.iris.vertices.sodium.terrain;

public interface ChunkVertexExtension {
    public boolean ignoreMidBlock();

    public int getBlockId();

    public void iris$setData(byte var1, byte var2, int var3, int var4, int var5, int var6);

    public byte getBlockEmission();

    public int getLocalPosZ();

    public void iris$copyData(ChunkVertexExtension var1);

    public int getLocalPosY();

    public int getLocalPosX();

    public byte getRenderType();

    public void iris$ignoresMidBlock(boolean var1);
}

