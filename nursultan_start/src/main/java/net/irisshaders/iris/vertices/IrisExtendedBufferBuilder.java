/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.blaze3d.vertex.VertexFormat
 *  com.mojang.blaze3d.vertex.VertexFormat$class_5596
 */
package net.irisshaders.iris.vertices;

import com.mojang.blaze3d.vertex.VertexFormat;

public interface IrisExtendedBufferBuilder {
    public int iris$currentLocalPosZ();

    public short iris$currentRenderType();

    public boolean iris$injectNormalAndUV1();

    public void iris$incrementVertexCount();

    public int iris$currentLocalPosX();

    public void iris$resetVertexCount();

    public int iris$currentLocalPosY();

    public boolean iris$isTerrain();

    public boolean iris$extending();

    public int iris$vertexCount();

    public short iris$currentBlock();

    public VertexFormat iris$format();

    public VertexFormat.class_5596 iris$mode();
}

