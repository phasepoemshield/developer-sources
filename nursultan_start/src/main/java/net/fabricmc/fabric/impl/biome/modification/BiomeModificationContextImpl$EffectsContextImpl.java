/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00608
 *  minecraft.class05987
 *  minecraft.class06009
 *  net.fabricmc.fabric.api.biome.v1.BiomeModificationContext$EffectsContext
 */
package net.fabricmc.fabric.impl.biome.modification;

import java.util.Objects;
import java.util.Optional;
import minecraft.class00608;
import minecraft.class05987;
import minecraft.class06009;
import net.fabricmc.fabric.api.biome.v1.BiomeModificationContext;
import net.fabricmc.fabric.impl.biome.modification.BiomeModificationContextImpl;

class BiomeModificationContextImpl$EffectsContextImpl
implements BiomeModificationContext.EffectsContext {
    private final class05987 effects;
    final /* synthetic */ BiomeModificationContextImpl this$0;

    BiomeModificationContextImpl$EffectsContextImpl(BiomeModificationContextImpl biomeModificationContextImpl) {
        this.this$0 = biomeModificationContextImpl;
        this.effects = this.this$0.biome.M();
    }

    public void setFogColor(int n) {
        this.this$0.attributes.set(class00608.N, (Object)n);
    }

    public void setGrassColorModifier(class06009 class060092) {
        this.effects.i = Objects.requireNonNull(class060092);
    }

    public void setGrassColor(Optional<Integer> optional) {
        this.effects.u = Objects.requireNonNull(optional);
    }

    public void setSkyColor(int n) {
        this.this$0.attributes.set(class00608.Z, (Object)n);
    }

    public void setWaterFogColor(int n) {
        this.this$0.attributes.set(class00608.R, (Object)n);
    }

    public void setMusicVolume(float f) {
        this.this$0.attributes.set(class00608.G, (Object)Float.valueOf(f));
    }

    public void setFoliageColor(Optional<Integer> optional) {
        this.effects.y = Objects.requireNonNull(optional);
    }

    public void setDryFoliageColor(Optional<Integer> optional) {
        this.effects.L = Objects.requireNonNull(optional);
    }

    public void setWaterColor(int n) {
        this.effects.N = n;
    }
}

