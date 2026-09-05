/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.blaze3d.opengl.GlStateManager
 *  com.mojang.blaze3d.shaders.ShaderType
 *  com.mojang.blaze3d.systems.RenderSystem
 *  minecraft.class01894
 */
package minecraft;

import com.mojang.blaze3d.opengl.GlStateManager;
import com.mojang.blaze3d.shaders.ShaderType;
import com.mojang.blaze3d.systems.RenderSystem;
import minecraft.class01894;

public class class08238
implements AutoCloseable {
    private static final int y = -1;
    public static final class08238 N = new class08238(-1, class01894.y((String)"invalid"), ShaderType.VERTEX);
    private final class01894 L;
    private int u;
    private final ShaderType i;

    public String L() {
        return this.i.idConverter().N(this.L).toString();
    }

    public class08238(int n, class01894 class018942, ShaderType shaderType) {
        this.L = class018942;
        this.u = n;
        this.i = shaderType;
    }

    @Override
    public void close() {
        if (this.u == -1) {
            throw new IllegalStateException("Already closed");
        }
        RenderSystem.assertOnRenderThread();
        GlStateManager.glDeleteShader((int)this.u);
        this.u = -1;
    }

    public int y() {
        return this.u;
    }

    public class01894 N() {
        return this.L;
    }
}

