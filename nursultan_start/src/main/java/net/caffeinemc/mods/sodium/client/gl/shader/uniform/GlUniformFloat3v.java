/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.lwjgl.opengl.GL30C
 */
package net.caffeinemc.mods.sodium.client.gl.shader.uniform;

import net.caffeinemc.mods.sodium.client.gl.shader.uniform.GlUniform;
import org.lwjgl.opengl.GL30C;

public class GlUniformFloat3v
extends GlUniform<float[]> {
    public GlUniformFloat3v(int n) {
        super(n);
    }

    public void set(float f, float f2, float f3) {
        GL30C.glUniform3f((int)this.index, (float)f, (float)f2, (float)f3);
    }

    @Override
    public void set(float[] fArray) {
        if (fArray.length != 3) {
            throw new IllegalArgumentException("value.length != 3");
        }
        GL30C.glUniform3fv((int)this.index, (float[])fArray);
    }
}

