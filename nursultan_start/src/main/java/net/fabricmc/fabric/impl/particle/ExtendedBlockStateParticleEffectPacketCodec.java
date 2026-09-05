/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class02362
 *  minecraft.class04247
 *  minecraft.class07105
 *  minecraft.class07209
 */
package net.fabricmc.fabric.impl.particle;

import minecraft.class02362;
import minecraft.class04247;
import minecraft.class07105;
import minecraft.class07209;
import net.fabricmc.fabric.impl.particle.BlockStateParticleEffectExtension;
import net.fabricmc.fabric.impl.particle.ExtendedBlockStateParticleEffectSync;

public class ExtendedBlockStateParticleEffectPacketCodec
implements class02362<class04247, class07105> {
    private static final int PACKET_MARKER = -1;
    private final class02362<? super class04247, class07105> fallback;

    public ExtendedBlockStateParticleEffectPacketCodec(class02362<? super class04247, class07105> class023622) {
        this.fallback = class023622;
    }

    public class07105 decode(class04247 class042472) {
        int n = class042472.readerIndex();
        if (class042472.E() != -1) {
            class042472.readerIndex(n);
            return (class07105)this.fallback.decode((Object)class042472);
        }
        class07105 class071052 = (class07105)this.fallback.decode((Object)class042472);
        class07209 class072092 = (class07209)class07209.field_48404.decode((Object)class042472);
        ((BlockStateParticleEffectExtension)class071052).fabric_setBlockPos(class072092);
        return class071052;
    }

    public void encode(class04247 class042472, class07105 class071052) {
        class07209 class072092 = class071052.getBlockPos();
        if (class072092 == null || ExtendedBlockStateParticleEffectSync.shouldEncodeFallback(class042472)) {
            this.fallback.encode((Object)class042472, (Object)class071052);
            return;
        }
        class042472.L(-1);
        this.fallback.encode((Object)class042472, (Object)class071052);
        class07209.field_48404.encode((Object)class042472, (Object)class072092);
    }
}

