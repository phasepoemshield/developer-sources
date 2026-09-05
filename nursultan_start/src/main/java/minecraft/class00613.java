/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.blaze3d.systems.GpuQuery
 *  com.mojang.blaze3d.systems.RenderSystem
 *  org.lwjgl.opengl.ARBTimerQuery
 *  org.lwjgl.opengl.GL32C
 */
package minecraft;

import com.mojang.blaze3d.systems.GpuQuery;
import com.mojang.blaze3d.systems.RenderSystem;
import java.util.OptionalLong;
import org.lwjgl.opengl.ARBTimerQuery;
import org.lwjgl.opengl.GL32C;

public class class00613
implements GpuQuery {
    private final int N;
    private boolean y;
    private OptionalLong L = OptionalLong.empty();

    class00613(int n) {
        this.N = n;
    }

    public OptionalLong getValue() {
        RenderSystem.assertOnRenderThread();
        if (this.y) {
            throw new IllegalStateException("GlTimerQuery is closed");
        }
        if (this.L.isPresent()) {
            return this.L;
        }
        if (GL32C.glGetQueryObjecti((int)this.N, (int)34919) == 1) {
            this.L = OptionalLong.of(ARBTimerQuery.glGetQueryObjecti64((int)this.N, (int)34918));
            return this.L;
        }
        return OptionalLong.empty();
    }

    public void close() {
        RenderSystem.assertOnRenderThread();
        if (this.y) {
            return;
        }
        this.y = true;
        GL32C.glDeleteQueries((int)this.N);
    }
}

