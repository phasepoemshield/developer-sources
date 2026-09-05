/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.blaze3d.opengl.GlStateManager
 *  org.lwjgl.system.MemoryUtil
 */
package net.irisshaders.iris.gl.buffer;

import com.mojang.blaze3d.opengl.GlStateManager;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import net.irisshaders.iris.gl.GLDebug;
import net.irisshaders.iris.gl.IrisRenderSystem;
import net.irisshaders.iris.gl.buffer.BuiltShaderStorageInfo;
import org.lwjgl.system.MemoryUtil;

public class ShaderStorageBuffer {
    protected final int index;
    protected final BuiltShaderStorageInfo info;
    protected final ByteBuffer content;
    protected int id = IrisRenderSystem.createBuffers();

    public final long getSize() {
        return this.info.size();
    }

    public ShaderStorageBuffer(int n, BuiltShaderStorageInfo builtShaderStorageInfo) {
        if (builtShaderStorageInfo.content() != null) {
            this.content = MemoryUtil.memAlloc((int)builtShaderStorageInfo.content().length);
            this.content.put(builtShaderStorageInfo.content());
            this.content.flip();
        } else {
            this.content = null;
        }
        GLDebug.nameObject(33504, this.id, "SSBO " + n);
        this.index = n;
        this.info = builtShaderStorageInfo;
    }

    public int getId() {
        return this.id;
    }

    protected void destroy() {
        IrisRenderSystem.bindBufferBase(37074, this.index, 0);
        IrisRenderSystem.deleteBuffers(this.id);
        MemoryUtil.memFree((Buffer)this.content);
    }

    public final int getIndex() {
        return this.index;
    }

    public void bind() {
        IrisRenderSystem.bindBufferBase(37074, this.index, this.id);
    }

    public void createStatic() {
        GlStateManager._glBindBuffer((int)37074, (int)this.getId());
        IrisRenderSystem.bufferStorage(37074, this.info.size(), this.content == null ? 0 : 256);
        if (this.content != null) {
            GlStateManager._glBufferSubData((int)37074, (long)0L, (ByteBuffer)this.content);
        } else {
            IrisRenderSystem.clearBufferSubData(37074, 33321, 0L, this.info.size(), 6403, 5120, new int[]{0});
        }
        this.bind();
    }

    public void resizeIfRelative(int n, int n2) {
        if (!this.info.relative()) {
            return;
        }
        IrisRenderSystem.deleteBuffers(this.id);
        int n3 = GlStateManager._glGenBuffers();
        GlStateManager._glBindBuffer((int)37074, (int)n3);
        long l = (long)((float)n * this.info.scaleX());
        long l2 = (long)((float)n2 * this.info.scaleY());
        long l3 = l2 * l * this.info.size();
        IrisRenderSystem.bufferStorage(37074, l3, 0);
        IrisRenderSystem.clearBufferSubData(37074, 33321, 0L, l3, 6403, 5120, new int[]{0});
        IrisRenderSystem.bindBufferBase(37074, this.index, n3);
        this.id = n3;
    }
}

