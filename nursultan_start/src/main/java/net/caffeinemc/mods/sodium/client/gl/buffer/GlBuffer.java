/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.caffeinemc.mods.sodium.client.gl.GlObject
 *  org.lwjgl.opengl.GL20C
 */
package net.caffeinemc.mods.sodium.client.gl.buffer;

import net.caffeinemc.mods.sodium.client.gl.GlObject;
import net.caffeinemc.mods.sodium.client.gl.buffer.GlBufferMapping;
import org.lwjgl.opengl.GL20C;

public abstract class GlBuffer
extends GlObject {
    private GlBufferMapping activeMapping;

    protected GlBuffer() {
        this.setHandle(GL20C.glGenBuffers());
    }

    public GlBufferMapping getActiveMapping() {
        return this.activeMapping;
    }

    public void setActiveMapping(GlBufferMapping glBufferMapping) {
        this.activeMapping = glBufferMapping;
    }
}

