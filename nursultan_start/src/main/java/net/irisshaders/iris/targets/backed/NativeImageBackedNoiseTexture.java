/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.blaze3d.systems.RenderSystem
 *  com.mojang.blaze3d.textures.GpuTexture
 *  minecraft.class08247
 *  minecraft.class08280
 *  minecraft.class08829
 *  net.irisshaders.iris.gl.sampler.GlSampler
 *  net.irisshaders.iris.gl.texture.TextureAccess
 *  net.irisshaders.iris.gl.texture.TextureType
 */
package net.irisshaders.iris.targets.backed;

import com.mojang.blaze3d.systems.RenderSystem;
import com.mojang.blaze3d.textures.GpuTexture;
import java.util.Objects;
import java.util.Random;
import java.util.function.IntSupplier;
import minecraft.class08247;
import minecraft.class08280;
import minecraft.class08829;
import net.irisshaders.iris.gl.sampler.GlSampler;
import net.irisshaders.iris.gl.texture.TextureAccess;
import net.irisshaders.iris.gl.texture.TextureType;

public class NativeImageBackedNoiseTexture
extends class08829
implements TextureAccess {
    private static class08280 create(int n) {
        class08280 class082802 = new class08280(class08247.field_4997, n, n, false);
        Random random = new Random(0L);
        for (int i = 0; i < n; ++i) {
            for (int j = 0; j < n; ++j) {
                int n2 = random.nextInt() | 0xFF000000;
                class082802.y(i, j, n2);
            }
        }
        return class082802;
    }

    public NativeImageBackedNoiseTexture(int n) {
        super(() -> "Noise / " + n, NativeImageBackedNoiseTexture.create(n));
    }

    public TextureType getType() {
        return TextureType.TEXTURE_2D;
    }

    public IntSupplier getTextureId() {
        return () -> ((GpuTexture)this.method_68004()).iris$getGlId();
    }

    public GlSampler getSampling() {
        return GlSampler.LINEAR_REPEAT;
    }

    public void method_4524() {
        class08280 class082802 = Objects.requireNonNull(this.method_4525());
        RenderSystem.getDevice().createCommandEncoder().writeToTexture(this.field_56974, class082802);
    }
}

