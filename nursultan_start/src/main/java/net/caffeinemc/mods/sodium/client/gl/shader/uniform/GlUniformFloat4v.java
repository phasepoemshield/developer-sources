/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.lwjgl.opengl.GL30C
 */
package net.caffeinemc.mods.sodium.client.gl.shader.uniform;

import net.caffeinemc.mods.sodium.client.gl.shader.uniform.GlUniform;
import org.lwjgl.opengl.GL30C;

public class GlUniformFloat4v
extends GlUniform<float[]> {
    public GlUniformFloat4v(int n) {
        super(n);
    }

    public void set(float f, float f2, float f3, float f4) {
        GL30C.glUniform4f((int)this.index, (float)f, (float)f2, (float)f3, (float)f4);
    }

    @Override
    public void set(float[] fArray) {
        if (fArray.length != 4) {
            throw new IllegalArgumentException("value.length != 4");
        }
        GL30C.glUniform4fv((int)this.index, (float[])fArray);
    }
}

