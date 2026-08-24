/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.joml.Matrix4f
 *  org.joml.Matrix4fc
 *  org.lwjgl.opengl.GL20
 *  org.lwjgl.system.MemoryUtil
 */
package oxxxde;

import java.nio.Buffer;
import java.nio.FloatBuffer;
import kotakbaz.rain.client.render.main.program.GlProgram;
import org.joml.Matrix4f;
import org.joml.Matrix4fc;
import org.lwjgl.opengl.GL20;
import org.lwjgl.system.MemoryUtil;
import oxxxde.\u0637\u064a;

public class \u0636\u0626
extends \u0637\u064a {
    private boolean closed = false;
    private boolean initialized = false;
    private final FloatBuffer buffer = MemoryUtil.memAllocFloat((int)16);
    private final Matrix4f cachedValue = new Matrix4f();

    public void set(Matrix4f matrix4f) {
        if (this.initialized && this.cachedValue.equals((Object)matrix4f)) {
            return;
        }
        this.cachedValue.set((Matrix4fc)matrix4f);
        this.initialized = true;
        matrix4f.get(this.buffer);
        this.program.addUpdatedUniform(this);
    }

    @Override
    public void close() {
        if (!this.closed) {
            MemoryUtil.memFree((Buffer)this.buffer);
            this.closed = true;
        }
    }

    public \u0636\u0626(String name, int location, GlProgram glProgram) {
        super(name, location, glProgram);
    }

    @Override
    public void upload() {
        GL20.glUniformMatrix4fv((int)this.getLocation(), (boolean)false, (FloatBuffer)this.buffer);
    }
}

