/*
 * Decompiled with CFR 0.152.
 */
package net.caffeinemc.mods.sodium.client.gl.tessellation;

import net.caffeinemc.mods.sodium.client.gl.attribute.GlVertexAttributeBinding;
import net.caffeinemc.mods.sodium.client.gl.buffer.GlBuffer;
import net.caffeinemc.mods.sodium.client.gl.buffer.GlBufferTarget;

public record TessellationBinding(GlBufferTarget target, GlBuffer buffer, GlVertexAttributeBinding[] attributeBindings) {
    public static TessellationBinding forElementBuffer(GlBuffer glBuffer) {
        return new TessellationBinding(GlBufferTarget.ELEMENT_BUFFER, glBuffer, new GlVertexAttributeBinding[0]);
    }

    public static TessellationBinding forVertexBuffer(GlBuffer glBuffer, GlVertexAttributeBinding[] glVertexAttributeBindingArray) {
        return new TessellationBinding(GlBufferTarget.ARRAY_BUFFER, glBuffer, glVertexAttributeBindingArray);
    }
}

