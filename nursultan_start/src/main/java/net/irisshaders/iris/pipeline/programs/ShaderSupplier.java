/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class02255
 */
package net.irisshaders.iris.pipeline.programs;

import java.util.function.Supplier;
import minecraft.class02255;
import net.irisshaders.iris.pipeline.programs.PartialShader;
import net.irisshaders.iris.pipeline.programs.ShaderKey;

public record ShaderSupplier(ShaderKey key, PartialShader id, Supplier<class02255> shader) {
}

