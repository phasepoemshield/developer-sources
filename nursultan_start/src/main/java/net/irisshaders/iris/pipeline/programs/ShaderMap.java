/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.blaze3d.opengl.GlStateManager
 *  minecraft.class02255
 *  net.irisshaders.iris.gl.shader.ShaderCompileException
 */
package net.irisshaders.iris.pipeline.programs;

import com.mojang.blaze3d.opengl.GlStateManager;
import java.util.function.Consumer;
import java.util.function.Function;
import minecraft.class02255;
import net.irisshaders.iris.gl.shader.ShaderCompileException;
import net.irisshaders.iris.pipeline.programs.ShaderKey;
import net.irisshaders.iris.pipeline.programs.ShaderLoadingMap;
import net.irisshaders.iris.pipeline.programs.ShaderSupplier;

public class ShaderMap {
    private final class02255[] shaders;

    public ShaderMap(ShaderLoadingMap shaderLoadingMap, Function<ShaderSupplier, Boolean> function, Consumer<class02255> consumer) {
        ShaderKey[] shaderKeyArray = ShaderKey.values();
        this.shaders = new class02255[shaderKeyArray.length];
        shaderLoadingMap.forAllShaders((shaderKey, shaderSupplier) -> {
            if (shaderSupplier != null) {
                class02255 class022552;
                if (((Boolean)function.apply((ShaderSupplier)((Object)shaderSupplier))).booleanValue()) {
                    GlStateManager.glDeleteProgram((int)shaderSupplier.id().program());
                    return;
                }
                this.checkLinkingState((ShaderKey)((Object)shaderKey), (ShaderSupplier)((Object)shaderSupplier));
                this.shaders[shaderKey.ordinal()] = class022552 = shaderSupplier.shader().get();
                consumer.accept(class022552);
            }
        });
    }

    public class02255 getShader(ShaderKey shaderKey) {
        return this.shaders[shaderKey.ordinal()];
    }

    private void checkLinkingState(ShaderKey shaderKey, ShaderSupplier shaderSupplier) {
        int n = shaderSupplier.id().program();
        int n2 = GlStateManager.glGetProgrami((int)n, (int)35714);
        if (n2 == 0) {
            String string = GlStateManager.glGetProgramInfoLog((int)n, (int)32768);
            throw new ShaderCompileException(shaderKey.name(), string);
        }
    }
}

