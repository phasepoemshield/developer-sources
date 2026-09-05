/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.joml.Matrix4fc
 *  org.lwjgl.opengl.GL30C
 *  org.lwjgl.system.MemoryStack
 */
package net.caffeinemc.mods.sodium.client.gl.shader.uniform;

import java.nio.FloatBuffer;
import net.caffeinemc.mods.sodium.client.gl.shader.uniform.GlUniform;
import org.joml.Matrix4fc;
import org.lwjgl.opengl.GL30C;
import org.lwjgl.system.MemoryStack;

public class GlUniformMatrix4f
extends GlUniform<Matrix4fc> {
    public GlUniformMatrix4f(int n) {
        super(n);
    }

    @Override
    public void set(Matrix4fc matrix4fc) {
        try (MemoryStack memoryStack = MemoryStack.stackPush();){
            FloatBuffer floatBuffer = memoryStack.callocFloat(16);
            matrix4fc.get(floatBuffer);
            GL30C.glUniformMatrix4fv((int)this.index, (boolean)false, (FloatBuffer)floatBuffer);
        }
    }
}

