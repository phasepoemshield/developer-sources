/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.lwjgl.opengl.GL20C
 *  org.lwjgl.opengl.GL30C
 */
package net.caffeinemc.mods.sodium.client.gl.tessellation;

import net.caffeinemc.mods.sodium.client.gl.attribute.GlVertexAttributeBinding;
import net.caffeinemc.mods.sodium.client.gl.device.CommandList;
import net.caffeinemc.mods.sodium.client.gl.tessellation.GlPrimitiveType;
import net.caffeinemc.mods.sodium.client.gl.tessellation.GlTessellation;
import net.caffeinemc.mods.sodium.client.gl.tessellation.TessellationBinding;
import org.lwjgl.opengl.GL20C;
import org.lwjgl.opengl.GL30C;

public abstract class GlAbstractTessellation
implements GlTessellation {
    protected final GlPrimitiveType primitiveType;
    protected final TessellationBinding[] bindings;

    protected GlAbstractTessellation(GlPrimitiveType glPrimitiveType, TessellationBinding[] tessellationBindingArray) {
        this.primitiveType = glPrimitiveType;
        this.bindings = tessellationBindingArray;
    }

    protected void bindAttributes(CommandList commandList) {
        for (TessellationBinding tessellationBinding : this.bindings) {
            commandList.bindBuffer(tessellationBinding.target(), tessellationBinding.buffer());
            for (GlVertexAttributeBinding glVertexAttributeBinding : tessellationBinding.attributeBindings()) {
                if (glVertexAttributeBinding.isIntType()) {
                    GL30C.glVertexAttribIPointer((int)glVertexAttributeBinding.getIndex(), (int)glVertexAttributeBinding.getCount(), (int)glVertexAttributeBinding.getFormat(), (int)glVertexAttributeBinding.getStride(), (long)glVertexAttributeBinding.getPointer());
                } else {
                    GL20C.glVertexAttribPointer((int)glVertexAttributeBinding.getIndex(), (int)glVertexAttributeBinding.getCount(), (int)glVertexAttributeBinding.getFormat(), (boolean)glVertexAttributeBinding.isNormalized(), (int)glVertexAttributeBinding.getStride(), (long)glVertexAttributeBinding.getPointer());
                }
                GL20C.glEnableVertexAttribArray((int)glVertexAttributeBinding.getIndex());
            }
        }
    }

    @Override
    public GlPrimitiveType getPrimitiveType() {
        return this.primitiveType;
    }
}

