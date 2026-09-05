/*
 * Decompiled with CFR 0.152.
 */
package net.irisshaders.iris.pipeline.programs;

import java.util.function.BiConsumer;
import java.util.function.Function;
import net.irisshaders.iris.pipeline.programs.ShaderKey;
import net.irisshaders.iris.pipeline.programs.ShaderSupplier;

public class ShaderLoadingMap {
    private final ShaderSupplier[] shaders;

    public ShaderLoadingMap(Function<ShaderKey, ShaderSupplier> function) {
        ShaderKey[] shaderKeyArray = ShaderKey.values();
        this.shaders = new ShaderSupplier[shaderKeyArray.length];
        for (int i = 0; i < shaderKeyArray.length; ++i) {
            this.shaders[i] = function.apply(shaderKeyArray[i]);
        }
    }

    public void forAllShaders(BiConsumer<ShaderKey, ShaderSupplier> biConsumer) {
        for (int i = 0; i < ShaderKey.values().length; ++i) {
            biConsumer.accept(ShaderKey.values()[i], this.shaders[i]);
        }
    }
}

