/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00500
 *  minecraft.class07103
 *  minecraft.class07105
 *  minecraft.class07209
 *  org.jspecify.annotations.Nullable
 */
package net.fabricmc.fabric.impl.particle;

import minecraft.class00500;
import minecraft.class07103;
import minecraft.class07105;
import minecraft.class07209;
import net.fabricmc.fabric.impl.particle.BlockStateParticleEffectExtension;
import org.jspecify.annotations.Nullable;

public final class BlockStateParticleEffectFactoryImpl {
    public static class07105 create(class07103<class07105> class071032, class00500 class005002, @Nullable class07209 class072092) {
        class07105 class071052 = new class07105(class071032, class005002);
        ((BlockStateParticleEffectExtension)class071052).fabric_setBlockPos(class072092);
        return class071052;
    }

    private BlockStateParticleEffectFactoryImpl() {
    }
}

