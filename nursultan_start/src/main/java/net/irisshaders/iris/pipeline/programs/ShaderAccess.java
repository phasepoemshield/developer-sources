/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.blaze3d.vertex.VertexFormat
 *  com.mojang.blaze3d.vertex.VertexFormatElement
 */
package net.irisshaders.iris.pipeline.programs;

import com.mojang.blaze3d.vertex.VertexFormat;
import com.mojang.blaze3d.vertex.VertexFormatElement;

public class ShaderAccess {
    public static final VertexFormat IE_FORMAT = VertexFormat.builder().add("Position", VertexFormatElement.POSITION).add("Color", VertexFormatElement.COLOR).add("UV0", VertexFormatElement.UV0).add("Normal", VertexFormatElement.NORMAL).padding(1).build();
}

