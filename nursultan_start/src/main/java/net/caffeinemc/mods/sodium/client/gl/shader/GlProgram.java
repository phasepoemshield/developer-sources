/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class01894
 *  net.caffeinemc.mods.sodium.client.gl.GlObject
 *  net.caffeinemc.mods.sodium.client.render.chunk.shader.ShaderBindingContext
 *  org.apache.logging.log4j.LogManager
 *  org.apache.logging.log4j.Logger
 *  org.jspecify.annotations.NonNull
 *  org.lwjgl.opengl.GL20C
 *  org.lwjgl.opengl.GL32C
 */
package net.caffeinemc.mods.sodium.client.gl.shader;

import java.util.function.Function;
import java.util.function.IntFunction;
import minecraft.class01894;
import net.caffeinemc.mods.sodium.client.gl.GlObject;
import net.caffeinemc.mods.sodium.client.gl.shader.GlProgram$Builder;
import net.caffeinemc.mods.sodium.client.gl.shader.uniform.GlUniform;
import net.caffeinemc.mods.sodium.client.gl.shader.uniform.GlUniformBlock;
import net.caffeinemc.mods.sodium.client.render.chunk.shader.ShaderBindingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.jspecify.annotations.NonNull;
import org.lwjgl.opengl.GL20C;
import org.lwjgl.opengl.GL32C;

public class GlProgram<T>
extends GlObject
implements ShaderBindingContext {
    static final Logger LOGGER = LogManager.getLogger(GlProgram.class);
    private final T shaderInterface;

    protected GlProgram(int n, Function<ShaderBindingContext, T> function) {
        this.setHandle(n);
        this.shaderInterface = function.apply(this);
    }

    public static GlProgram$Builder builder(class01894 class018942) {
        return new GlProgram$Builder(class018942);
    }

    public void delete() {
        GL20C.glDeleteProgram((int)this.handle());
        this.invalidateHandle();
    }

    public void bind() {
        GL20C.glUseProgram((int)this.handle());
    }

    public @NonNull GlUniformBlock bindUniformBlock(String string, int n) {
        int n2 = GL32C.glGetUniformBlockIndex((int)this.handle(), (CharSequence)string);
        if (n2 < 0) {
            throw new NullPointerException("No uniform block exists with name: " + string);
        }
        GL32C.glUniformBlockBinding((int)this.handle(), (int)n2, (int)n);
        return new GlUniformBlock(n);
    }

    public T getInterface() {
        return this.shaderInterface;
    }

    public <U extends GlUniform<?>> @NonNull U bindUniform(String string, IntFunction<U> intFunction) {
        int n = GL20C.glGetUniformLocation((int)this.handle(), (CharSequence)string);
        if (n < 0) {
            throw new NullPointerException("No uniform exists with name: " + string);
        }
        return (U)((GlUniform)intFunction.apply(n));
    }

    public <U extends GlUniform<?>> U bindUniformOptional(String string, IntFunction<U> intFunction) {
        int n = GL20C.glGetUniformLocation((int)this.handle(), (CharSequence)string);
        if (n < 0) {
            return null;
        }
        return (U)((GlUniform)intFunction.apply(n));
    }

    public GlUniformBlock bindUniformBlockOptional(String string, int n) {
        int n2 = GL32C.glGetUniformBlockIndex((int)this.handle(), (CharSequence)string);
        if (n2 < 0) {
            return null;
        }
        GL32C.glUniformBlockBinding((int)this.handle(), (int)n2, (int)n);
        return new GlUniformBlock(n);
    }

    public void unbind() {
        GL20C.glUseProgram((int)0);
    }
}

