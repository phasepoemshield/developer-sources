/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.blaze3d.opengl.GlStateManager
 *  minecraft.class01894
 *  net.caffeinemc.mods.sodium.client.render.chunk.shader.ShaderBindingContext
 *  org.lwjgl.opengl.GL20C
 *  org.lwjgl.opengl.GL30C
 */
package net.caffeinemc.mods.sodium.client.gl.shader;

import com.mojang.blaze3d.opengl.GlStateManager;
import java.util.function.Function;
import minecraft.class01894;
import net.caffeinemc.mods.sodium.client.gl.shader.GlProgram;
import net.caffeinemc.mods.sodium.client.gl.shader.GlShader;
import net.caffeinemc.mods.sodium.client.render.chunk.shader.ShaderBindingContext;
import org.lwjgl.opengl.GL20C;
import org.lwjgl.opengl.GL30C;

public class GlProgram$Builder {
    private final class01894 name;
    private final int program;

    public GlProgram$Builder(class01894 class018942) {
        this.name = class018942;
        this.program = GL20C.glCreateProgram();
    }

    public <U> GlProgram<U> link(Function<ShaderBindingContext, U> function) {
        int n;
        GL20C.glLinkProgram((int)this.program);
        String string = GL20C.glGetProgramInfoLog((int)this.program);
        if (!string.isEmpty()) {
            GlProgram.LOGGER.warn("Program link log for " + String.valueOf(this.name) + ": " + string);
        }
        if ((n = GlStateManager.glGetProgrami((int)this.program, (int)35714)) != 1) {
            throw new RuntimeException("Shader program linking failed, see log for details");
        }
        return new GlProgram<U>(this.program, function);
    }

    public GlProgram$Builder attachShader(GlShader glShader) {
        GL20C.glAttachShader((int)this.program, (int)glShader.handle());
        return this;
    }

    public GlProgram$Builder bindAttribute(String string, int n) {
        GL20C.glBindAttribLocation((int)this.program, (int)n, (CharSequence)string);
        return this;
    }

    public GlProgram$Builder bindFragmentData(String string, int n) {
        GL30C.glBindFragDataLocation((int)this.program, (int)n, (CharSequence)string);
        return this;
    }
}

