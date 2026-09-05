/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.lwjgl.opengl.GL32C
 */
package net.caffeinemc.mods.sodium.client.gl.shader.uniform;

import net.caffeinemc.mods.sodium.client.gl.buffer.GlBuffer;
import org.lwjgl.opengl.GL32C;

public class GlUniformBlock {
    private final int binding;

    public GlUniformBlock(int n) {
        this.binding = n;
    }

    public void bindBuffer(GlBuffer glBuffer) {
        GL32C.glBindBufferBase((int)35345, (int)this.binding, (int)glBuffer.handle());
    }
}

