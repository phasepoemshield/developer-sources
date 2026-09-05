/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class06009
 */
package net.fabricmc.fabric.api.biome.v1;

import java.util.Optional;
import java.util.OptionalInt;
import minecraft.class06009;

public interface BiomeModificationContext$EffectsContext {
    @Deprecated
    public void setFogColor(int var1);

    default public void clearDryFoliageColor() {
        this.setDryFoliageColor(Optional.empty());
    }

    public void setGrassColorModifier(class06009 var1);

    default public void clearGrassColor() {
        this.setGrassColor(Optional.empty());
    }

    default public void setGrassColor(OptionalInt optionalInt) {
        optionalInt.ifPresentOrElse(this::setGrassColor, this::clearGrassColor);
    }

    public void setGrassColor(Optional<Integer> var1);

    default public void setGrassColor(int n) {
        this.setGrassColor(Optional.of(n));
    }

    @Deprecated
    public void setSkyColor(int var1);

    @Deprecated
    public void setWaterFogColor(int var1);

    default public void clearFoliageColor() {
        this.setFoliageColor(Optional.empty());
    }

    @Deprecated
    public void setMusicVolume(float var1);

    default public void setFoliageColor(OptionalInt optionalInt) {
        optionalInt.ifPresentOrElse(this::setFoliageColor, this::clearFoliageColor);
    }

    public void setFoliageColor(Optional<Integer> var1);

    default public void setFoliageColor(int n) {
        this.setFoliageColor(Optional.of(n));
    }

    default public void setDryFoliageColor(int n) {
        this.setDryFoliageColor(Optional.of(n));
    }

    default public void setDryFoliageColor(OptionalInt optionalInt) {
        optionalInt.ifPresentOrElse(this::setDryFoliageColor, this::clearDryFoliageColor);
    }

    public void setDryFoliageColor(Optional<Integer> var1);

    public void setWaterColor(int var1);
}

