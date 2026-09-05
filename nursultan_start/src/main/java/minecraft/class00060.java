/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.blaze3d.buffers.GpuFence
 *  com.mojang.blaze3d.opengl.GlStateManager
 */
package minecraft;

import com.mojang.blaze3d.buffers.GpuFence;
import com.mojang.blaze3d.opengl.GlStateManager;

public class class00060
implements GpuFence {
    private long N = GlStateManager._glFenceSync((int)37143, (int)0);

    public void close() {
        if (this.N != 0L) {
            GlStateManager._glDeleteSync((long)this.N);
            this.N = 0L;
        }
    }

    public boolean awaitCompletion(long l) {
        if (this.N == 0L) {
            return true;
        }
        int n = GlStateManager._glClientWaitSync((long)this.N, (int)0, (long)l);
        if (n == 37147) {
            return false;
        }
        if (n == 37149) {
            throw new IllegalStateException("Failed to complete GPU fence: " + GlStateManager._getError());
        }
        return true;
    }
}

