/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00500
 *  minecraft.class07103
 *  minecraft.class07105
 *  minecraft.class07209
 *  net.fabricmc.fabric.impl.particle.BlockStateParticleEffectFactoryImpl
 *  org.jspecify.annotations.Nullable
 */
package net.fabricmc.fabric.api.particle.v1;

import minecraft.class00500;
import minecraft.class07103;
import minecraft.class07105;
import minecraft.class07209;
import net.fabricmc.fabric.impl.particle.BlockStateParticleEffectFactoryImpl;
import org.jspecify.annotations.Nullable;

public interface FabricBlockStateParticleEffect {
    public static class07105 create(class07103<class07105> class071032, class00500 class005002, @Nullable class07209 class072092) {
        return BlockStateParticleEffectFactoryImpl.create(class071032, (class00500)class005002, (class07209)class072092);
    }

    default public @Nullable class07209 getBlockPos() {
        throw new AssertionError((Object)"Implemented in Mixin");
    }
}

