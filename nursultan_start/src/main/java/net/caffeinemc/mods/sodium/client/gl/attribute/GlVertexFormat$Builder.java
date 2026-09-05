/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  it.unimi.dsi.fastutil.objects.Object2IntArrayMap
 *  it.unimi.dsi.fastutil.objects.Object2IntMap
 *  it.unimi.dsi.fastutil.objects.Object2ObjectArrayMap
 *  net.caffeinemc.mods.sodium.client.render.vertex.VertexFormatAttribute
 */
package net.caffeinemc.mods.sodium.client.gl.attribute;

import it.unimi.dsi.fastutil.objects.Object2IntArrayMap;
import it.unimi.dsi.fastutil.objects.Object2IntMap;
import it.unimi.dsi.fastutil.objects.Object2ObjectArrayMap;
import java.util.Map;
import net.caffeinemc.mods.sodium.client.gl.attribute.GlVertexAttribute;
import net.caffeinemc.mods.sodium.client.gl.attribute.GlVertexAttributeBinding;
import net.caffeinemc.mods.sodium.client.gl.attribute.GlVertexFormat;
import net.caffeinemc.mods.sodium.client.render.vertex.VertexFormatAttribute;

public class GlVertexFormat$Builder {
    private final Map<VertexFormatAttribute, GlVertexAttribute> attributes = new Object2ObjectArrayMap();
    private final Object2IntMap<GlVertexAttribute> bindings = new Object2IntArrayMap();
    private final int stride;

    public GlVertexFormat$Builder(int n) {
        this.stride = n;
    }

    public GlVertexFormat build() {
        int n = 0;
        for (GlVertexAttribute glVertexAttribute : this.attributes.values()) {
            n = Math.max(n, glVertexAttribute.getPointer() + glVertexAttribute.getSize());
        }
        if (this.stride < n) {
            throw new IllegalArgumentException("Stride is too small");
        }
        GlVertexAttributeBinding[] glVertexAttributeBindingArray = (GlVertexAttributeBinding[])this.bindings.object2IntEntrySet().stream().map(entry -> new GlVertexAttributeBinding(entry.getIntValue(), (GlVertexAttribute)entry.getKey())).toArray(GlVertexAttributeBinding[]::new);
        return new GlVertexFormat(this.attributes, glVertexAttributeBindingArray, this.stride);
    }

    private GlVertexFormat$Builder addElement(VertexFormatAttribute vertexFormatAttribute, int n, GlVertexAttribute glVertexAttribute) {
        if (glVertexAttribute.getPointer() >= this.stride) {
            throw new IllegalArgumentException("Element starts outside vertex format");
        }
        if (glVertexAttribute.getPointer() + glVertexAttribute.getSize() > this.stride) {
            throw new IllegalArgumentException("Element extends outside vertex format");
        }
        if (this.attributes.put(vertexFormatAttribute, glVertexAttribute) != null) {
            throw new IllegalStateException("Generic attribute " + vertexFormatAttribute.name() + " already defined in vertex format");
        }
        if (n != -1) {
            this.bindings.put((Object)glVertexAttribute, n);
        }
        return this;
    }

    public GlVertexFormat$Builder addElement(VertexFormatAttribute vertexFormatAttribute, int n, int n2) {
        return this.addElement(vertexFormatAttribute, n, new GlVertexAttribute(vertexFormatAttribute.format(), vertexFormatAttribute.count(), vertexFormatAttribute.normalized(), n2, this.stride, vertexFormatAttribute.intType()));
    }
}

