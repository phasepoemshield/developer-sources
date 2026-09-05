/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.caffeinemc.mods.sodium.client.gl.shader.uniform.GlUniform
 *  net.irisshaders.iris.gl.IrisRenderSystem
 *  org.joml.Matrix3fc
 *  org.lwjgl.system.MemoryStack
 */
package net.irisshaders.iris.pipeline.programs;

import java.nio.FloatBuffer;
import net.caffeinemc.mods.sodium.client.gl.shader.uniform.GlUniform;
import net.irisshaders.iris.gl.IrisRenderSystem;
import org.joml.Matrix3fc;
import org.lwjgl.system.MemoryStack;

public class GlUniformMatrix3f
extends GlUniform<Matrix3fc> {
    public GlUniformMatrix3f(int n) {
        super(n);
    }

    public void set(Matrix3fc matrix3fc) {
        try (MemoryStack memoryStack = MemoryStack.stackPush();){
            FloatBuffer floatBuffer = memoryStack.callocFloat(9);
            matrix3fc.get(floatBuffer);
            IrisRenderSystem.uniformMatrix3fv((int)this.index, (boolean)false, (FloatBuffer)floatBuffer);
        }
    }
}

