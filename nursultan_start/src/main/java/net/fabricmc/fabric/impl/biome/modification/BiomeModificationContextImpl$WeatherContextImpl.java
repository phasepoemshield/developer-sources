/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00777
 *  minecraft.class00785
 *  net.fabricmc.fabric.api.biome.v1.BiomeModificationContext$WeatherContext
 */
package net.fabricmc.fabric.impl.biome.modification;

import java.util.Objects;
import minecraft.class00777;
import minecraft.class00785;
import net.fabricmc.fabric.api.biome.v1.BiomeModificationContext;
import net.fabricmc.fabric.impl.biome.modification.BiomeModificationContextImpl;

class BiomeModificationContextImpl$WeatherContextImpl
implements BiomeModificationContext.WeatherContext {
    final /* synthetic */ BiomeModificationContextImpl this$0;

    BiomeModificationContextImpl$WeatherContextImpl(BiomeModificationContextImpl biomeModificationContextImpl) {
        this.this$0 = biomeModificationContextImpl;
    }

    public void setTemperatureModifier(class00785 class007852) {
        this.this$0.biome.M = new class00777(this.this$0.biome.M.N(), this.this$0.biome.M.y(), Objects.requireNonNull(class007852), this.this$0.biome.M.u());
    }

    public void setDownfall(float f) {
        this.this$0.biome.M = new class00777(this.this$0.biome.M.N(), this.this$0.biome.M.y(), this.this$0.biome.M.L(), f);
    }

    public void setTemperature(float f) {
        this.this$0.biome.M = new class00777(this.this$0.biome.M.N(), f, this.this$0.biome.M.L(), this.this$0.biome.M.u());
    }

    public void setPrecipitation(boolean bl) {
        this.this$0.biome.M = new class00777(bl, this.this$0.biome.M.y(), this.this$0.biome.M.L(), this.this$0.biome.M.u());
    }
}

