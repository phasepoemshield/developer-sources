/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.lwjgl.opengl.GL32C
 *  org.lwjgl.system.MemoryStack
 */
package net.caffeinemc.mods.sodium.client.gl.sync;

import java.nio.IntBuffer;
import org.lwjgl.opengl.GL32C;
import org.lwjgl.system.MemoryStack;

public class GlFence {
    private final long id;
    private boolean disposed;

    public boolean isCompleted() {
        int n;
        this.checkDisposed();
        try (MemoryStack memoryStack = MemoryStack.stackPush();){
            IntBuffer intBuffer = memoryStack.callocInt(1);
            n = GL32C.glGetSynci((long)this.id, (int)37140, (IntBuffer)intBuffer);
            if (intBuffer.get(0) != 1) {
                throw new RuntimeException("glGetSync returned more than one value");
            }
        }
        return n == 37145;
    }

    public GlFence(long l) {
        this.id = l;
    }

    public void delete() {
        GL32C.glDeleteSync((long)this.id);
        this.disposed = true;
    }

    public void sync(long l) {
        this.checkDisposed();
        GL32C.glClientWaitSync((long)this.id, (int)1, (long)l);
    }

    public void sync() {
        this.checkDisposed();
        this.sync(Long.MAX_VALUE);
    }

    private void checkDisposed() {
        if (this.disposed) {
            throw new IllegalStateException("Fence object has been disposed");
        }
    }
}

