/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.lwjgl.opengl.GL30C
 */
package net.caffeinemc.mods.sodium.client.gl.shader.uniform;

import net.caffeinemc.mods.sodium.client.gl.shader.uniform.GlUniform;
import org.lwjgl.opengl.GL30C;

public class GlUniformBool
extends GlUniform<Boolean> {
    public GlUniformBool(int n) {
        super(n);
    }

    @Override
    public void set(Boolean bl) {
        this.setBool(bl);
    }

    public void setBool(boolean bl) {
        GL30C.glUniform1i((int)this.index, (int)(bl ? 1 : 0));
    }
}

