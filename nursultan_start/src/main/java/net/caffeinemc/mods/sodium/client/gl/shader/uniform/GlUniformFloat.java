/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.lwjgl.opengl.GL30C
 */
package net.caffeinemc.mods.sodium.client.gl.shader.uniform;

import net.caffeinemc.mods.sodium.client.gl.shader.uniform.GlUniform;
import org.lwjgl.opengl.GL30C;

public class GlUniformFloat
extends GlUniform<Float> {
    public GlUniformFloat(int n) {
        super(n);
    }

    @Override
    public void set(Float f) {
        this.setFloat(f.floatValue());
    }

    public void setFloat(float f) {
        GL30C.glUniform1f((int)this.index, (float)f);
    }
}

