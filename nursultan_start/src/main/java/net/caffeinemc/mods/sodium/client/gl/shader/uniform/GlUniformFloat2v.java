/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.lwjgl.opengl.GL30C
 */
package net.caffeinemc.mods.sodium.client.gl.shader.uniform;

import net.caffeinemc.mods.sodium.client.gl.shader.uniform.GlUniform;
import org.lwjgl.opengl.GL30C;

public class GlUniformFloat2v
extends GlUniform<float[]> {
    public GlUniformFloat2v(int n) {
        super(n);
    }

    public void set(float f, float f2) {
        GL30C.glUniform2f((int)this.index, (float)f, (float)f2);
    }

    @Override
    public void set(float[] fArray) {
        if (fArray.length != 2) {
            throw new IllegalArgumentException("value.length != 2");
        }
        GL30C.glUniform2fv((int)this.index, (float[])fArray);
    }
}

