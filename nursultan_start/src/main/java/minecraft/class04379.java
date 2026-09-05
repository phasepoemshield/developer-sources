/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.blaze3d.systems.GpuQuery
 *  com.mojang.blaze3d.systems.RenderSystem
 */
package minecraft;

import com.mojang.blaze3d.systems.GpuQuery;
import com.mojang.blaze3d.systems.RenderSystem;
import java.util.OptionalLong;

public class class04379 {
    private static final long N = 0L;
    private static final long y = -1L;
    private final GpuQuery L;
    private long u = 0L;

    public long L() {
        OptionalLong optionalLong;
        RenderSystem.assertOnRenderThread();
        if (this.u == 0L && (optionalLong = this.L.getValue()).isPresent()) {
            this.u = optionalLong.getAsLong();
            this.L.close();
        }
        return this.u;
    }

    class04379(GpuQuery gpuQuery) {
        this.L = gpuQuery;
    }

    public boolean y() {
        RenderSystem.assertOnRenderThread();
        if (this.u != 0L) {
            return true;
        }
        OptionalLong optionalLong = this.L.getValue();
        if (optionalLong.isPresent()) {
            this.u = optionalLong.getAsLong();
            this.L.close();
            return true;
        }
        return false;
    }

    public void N() {
        RenderSystem.assertOnRenderThread();
        if (this.u != 0L) {
            return;
        }
        this.u = -1L;
        this.L.close();
    }
}

