/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.blaze3d.buffers.GpuBufferSlice
 *  lombok.Generated
 *  net.minecraft.client.gl.GlGpuBuffer
 *  org.lwjgl.opengl.GL31
 */
package oxxxde;

import com.mojang.blaze3d.buffers.GpuBufferSlice;
import kotakbaz.rain.client.render.main.program.GlProgram;
import kotakbaz.rain.client.render.main.program.uniform.uniforms.buffer.A;
import lombok.Generated;
import net.minecraft.client.gl.GlGpuBuffer;
import org.lwjgl.opengl.GL31;
import oxxxde.\u062a\u0638;
import oxxxde.\u062b\u064e;
import oxxxde.\u062f\u0646;
import oxxxde.\u0637\u064a;

public class \u062f\u0642
extends \u0637\u064a {
    private final int bufferIndex;
    private Object buffer = null;
    private A<Object> uploader = null;

    public void set(\u062a\u0638 gpuBuffer) {
        this.setUnchecked(A.GPU_BUFFER, gpuBuffer);
    }

    public void set(GpuBufferSlice gpuBufferSlice) {
        this.setUnchecked(A.GPU_BUFFER_SLICE, gpuBufferSlice);
    }

    public <T> void set(A<T> uploader, T buffer) {
        this.setUnchecked(uploader, buffer);
    }

    private <T> void setUnchecked(A<T> uploader, T buffer) {
        this.uploader = uploader;
        this.buffer = buffer;
        this.program.addUpdatedUniform(this);
    }

    public void set(GlGpuBuffer glGpuBuffer) {
        this.setUnchecked(A.GL_GPU_BUFFER, glGpuBuffer);
    }

    @Override
    public void upload() {
        if (this.uploader != null) {
            this.uploader.uploadConsumer().accept(this, this.buffer);
        }
    }

    /*
     * WARNING - void declaration
     */
    public \u062f\u0642(String name, int location, GlProgram glProgram) {
        super(name, location, glProgram);
        int index = GL31.glGetUniformBlockIndex((int)glProgram.getId(), (CharSequence)name);
        if (index == -1) {
            \u062f\u0646.printAndExit(new \u062b\u064e(name, glProgram.getName()));
            this.bufferIndex = -1;
        } else {
            void var4_4;
            this.bufferIndex = glProgram.getBuffersIndexAmount() + 1;
            glProgram.setBuffersIndexAmount(this.bufferIndex);
            GL31.glUniformBlockBinding((int)glProgram.getId(), (int)var4_4, (int)this.bufferIndex);
        }
    }

    @Generated
    public int getBufferIndex() {
        return this.bufferIndex;
    }
}

