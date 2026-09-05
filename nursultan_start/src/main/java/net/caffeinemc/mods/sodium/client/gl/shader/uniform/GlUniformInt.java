/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.lwjgl.opengl.GL30C
 */
package net.caffeinemc.mods.sodium.client.gl.shader.uniform;

import net.caffeinemc.mods.sodium.client.gl.shader.uniform.GlUniform;
import org.lwjgl.opengl.GL30C;

public class GlUniformInt
extends GlUniform<Integer> {
    public GlUniformInt(int n) {
        super(n);
    }

    @Override
    public void set(Integer n) {
        this.setInt(n);
    }

    public void setInt(int n) {
        GL30C.glUniform1i((int)this.index, (int)n);
    }
}

