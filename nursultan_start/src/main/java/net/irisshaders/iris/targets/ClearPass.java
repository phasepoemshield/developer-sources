/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.blaze3d.opengl.GlStateManager
 *  net.irisshaders.iris.gl.IrisRenderSystem
 *  net.irisshaders.iris.gl.framebuffer.GlFramebuffer
 *  org.joml.Vector4f
 */
package net.irisshaders.iris.targets;

import com.mojang.blaze3d.opengl.GlStateManager;
import java.util.Objects;
import java.util.function.IntSupplier;
import net.irisshaders.iris.gl.IrisRenderSystem;
import net.irisshaders.iris.gl.framebuffer.GlFramebuffer;
import org.joml.Vector4f;

public class ClearPass {
    private final Vector4f color;
    private final IntSupplier viewportX;
    private final IntSupplier viewportY;
    private final GlFramebuffer framebuffer;
    private final int clearFlags;

    public ClearPass(Vector4f vector4f, IntSupplier intSupplier, IntSupplier intSupplier2, GlFramebuffer glFramebuffer, int n) {
        this.color = vector4f;
        this.viewportX = intSupplier;
        this.viewportY = intSupplier2;
        this.framebuffer = glFramebuffer;
        this.clearFlags = n;
    }

    public void execute(Vector4f vector4f) {
        GlStateManager._viewport((int)0, (int)0, (int)this.viewportX.getAsInt(), (int)this.viewportY.getAsInt());
        this.framebuffer.bind();
        Vector4f vector4f2 = Objects.requireNonNull(vector4f);
        if (this.color != null) {
            vector4f2 = this.color;
        }
        IrisRenderSystem.clearColor((float)vector4f2.x, (float)vector4f2.y, (float)vector4f2.z, (float)vector4f2.w);
        GlStateManager._clear((int)this.clearFlags);
    }

    public GlFramebuffer getFramebuffer() {
        return this.framebuffer;
    }
}

