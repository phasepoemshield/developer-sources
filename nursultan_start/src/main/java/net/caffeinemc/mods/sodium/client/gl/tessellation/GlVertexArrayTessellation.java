/*
 * Decompiled with CFR 0.152.
 */
package net.caffeinemc.mods.sodium.client.gl.tessellation;

import net.caffeinemc.mods.sodium.client.gl.array.GlVertexArray;
import net.caffeinemc.mods.sodium.client.gl.device.CommandList;
import net.caffeinemc.mods.sodium.client.gl.tessellation.GlAbstractTessellation;
import net.caffeinemc.mods.sodium.client.gl.tessellation.GlPrimitiveType;
import net.caffeinemc.mods.sodium.client.gl.tessellation.TessellationBinding;

public class GlVertexArrayTessellation
extends GlAbstractTessellation {
    private final GlVertexArray array;

    public GlVertexArrayTessellation(GlVertexArray glVertexArray, GlPrimitiveType glPrimitiveType, TessellationBinding[] tessellationBindingArray) {
        super(glPrimitiveType, tessellationBindingArray);
        this.array = glVertexArray;
    }

    public void init(CommandList commandList) {
        this.bind(commandList);
        this.bindAttributes(commandList);
        this.unbind(commandList);
    }

    @Override
    public void delete(CommandList commandList) {
        commandList.deleteVertexArray(this.array);
    }

    @Override
    public void bind(CommandList commandList) {
        commandList.bindVertexArray(this.array);
    }

    @Override
    public void unbind(CommandList commandList) {
        commandList.unbindVertexArray();
    }
}

