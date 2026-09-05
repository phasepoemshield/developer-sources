/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00962
 *  minecraft.class01894
 *  minecraft.class04410
 *  minecraft.class06166
 *  net.fabricmc.api.EnvType
 *  net.fabricmc.api.Environment
 *  net.fabricmc.fabric.impl.client.particle.ParticleRendererRegistryImpl
 *  org.jspecify.annotations.Nullable
 */
package net.fabricmc.fabric.api.client.particle.v1;

import java.util.Locale;
import java.util.function.Function;
import minecraft.class00962;
import minecraft.class01894;
import minecraft.class04410;
import minecraft.class06166;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.impl.client.particle.ParticleRendererRegistryImpl;
import org.jspecify.annotations.Nullable;

@Environment(value=EnvType.CLIENT)
public final class ParticleRendererRegistry {
    private ParticleRendererRegistry() {
    }

    public static void register(class06166 class061662, Function<class04410, class00962<?>> function) {
        ParticleRendererRegistryImpl.INSTANCE.register(class061662, function);
    }

    public static class01894 getId(class06166 class061662) {
        if (class061662 == class06166.N || class061662 == class06166.u || class061662 == class06166.L || class061662 == class06166.y) {
            return class01894.y((String)class061662.N().toLowerCase(Locale.ROOT));
        }
        return class01894.N((String)class061662.N());
    }

    public static @Nullable class06166 getParticleTextureSheet(class01894 class018942) {
        return ParticleRendererRegistryImpl.INSTANCE.getParticleTextureSheet(class018942);
    }

    public static void registerOrdering(class01894 class018942, class01894 class018943) {
        ParticleRendererRegistryImpl.INSTANCE.registerOrdering(class018942, class018943);
    }

    public static void registerOrdering(class06166 class061662, class06166 class061663) {
        ParticleRendererRegistry.registerOrdering(ParticleRendererRegistry.getId(class061662), ParticleRendererRegistry.getId(class061663));
    }

    public static void registerOrdering(class06166 class061662, class01894 class018942) {
        ParticleRendererRegistry.registerOrdering(ParticleRendererRegistry.getId(class061662), class018942);
    }

    public static void registerOrdering(class01894 class018942, class06166 class061662) {
        ParticleRendererRegistry.registerOrdering(class018942, ParticleRendererRegistry.getId(class061662));
    }
}

