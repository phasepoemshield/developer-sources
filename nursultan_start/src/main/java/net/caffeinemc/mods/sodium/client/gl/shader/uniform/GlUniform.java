/*
 * Decompiled with CFR 0.152.
 */
package net.caffeinemc.mods.sodium.client.gl.shader.uniform;

public abstract class GlUniform<T> {
    protected final int index;

    public GlUniform(int n) {
        this.index = n;
    }

    public abstract void set(T var1);
}

