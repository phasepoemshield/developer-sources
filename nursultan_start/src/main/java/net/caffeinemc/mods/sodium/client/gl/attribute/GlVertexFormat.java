/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.caffeinemc.mods.sodium.client.render.vertex.VertexFormatAttribute
 */
package net.caffeinemc.mods.sodium.client.gl.attribute;

import java.util.Map;
import net.caffeinemc.mods.sodium.client.gl.attribute.GlVertexAttribute;
import net.caffeinemc.mods.sodium.client.gl.attribute.GlVertexAttributeBinding;
import net.caffeinemc.mods.sodium.client.gl.attribute.GlVertexFormat$Builder;
import net.caffeinemc.mods.sodium.client.render.vertex.VertexFormatAttribute;

public class GlVertexFormat {
    private final Map<VertexFormatAttribute, GlVertexAttribute> attributesKeyed;
    private final int stride;
    private final GlVertexAttributeBinding[] bindings;

    public GlVertexAttributeBinding[] getShaderBindings() {
        return this.bindings;
    }

    public GlVertexFormat(Map<VertexFormatAttribute, GlVertexAttribute> map, GlVertexAttributeBinding[] glVertexAttributeBindingArray, int n) {
        this.attributesKeyed = map;
        this.bindings = glVertexAttributeBindingArray;
        this.stride = n;
    }

    public String toString() {
        return String.format("GlVertexFormat{attributes=%d,stride=%d}", this.attributesKeyed.size(), this.stride);
    }

    public static GlVertexFormat$Builder builder(int n) {
        return new GlVertexFormat$Builder(n);
    }

    public GlVertexAttribute getAttribute(VertexFormatAttribute vertexFormatAttribute) {
        GlVertexAttribute glVertexAttribute = this.attributesKeyed.get(vertexFormatAttribute);
        if (glVertexAttribute == null) {
            throw new NullPointerException("No attribute exists for " + vertexFormatAttribute.toString());
        }
        return glVertexAttribute;
    }

    public int getStride() {
        return this.stride;
    }
}

