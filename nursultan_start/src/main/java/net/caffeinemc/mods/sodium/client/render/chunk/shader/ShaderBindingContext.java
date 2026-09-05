/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.caffeinemc.mods.sodium.client.gl.shader.uniform.GlUniform
 *  net.caffeinemc.mods.sodium.client.gl.shader.uniform.GlUniformBlock
 *  org.jspecify.annotations.NonNull
 *  org.jspecify.annotations.Nullable
 */
package net.caffeinemc.mods.sodium.client.render.chunk.shader;

import java.util.function.IntFunction;
import net.caffeinemc.mods.sodium.client.gl.shader.uniform.GlUniform;
import net.caffeinemc.mods.sodium.client.gl.shader.uniform.GlUniformBlock;
import org.jspecify.annotations.NonNull;
import org.jspecify.annotations.Nullable;

public interface ShaderBindingContext {
    public @NonNull GlUniformBlock bindUniformBlock(String var1, int var2);

    public <U extends GlUniform<?>> @NonNull U bindUniform(String var1, IntFunction<U> var2);

    public <U extends GlUniform<?>> @Nullable U bindUniformOptional(String var1, IntFunction<U> var2);

    public @Nullable GlUniformBlock bindUniformBlockOptional(String var1, int var2);
}

