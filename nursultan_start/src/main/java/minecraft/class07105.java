/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.MapCodec
 *  minecraft.class00500
 *  minecraft.class00750
 *  minecraft.class00891
 *  minecraft.class02362
 *  minecraft.class02389
 *  minecraft.class04206
 *  minecraft.class04247
 *  minecraft.class07103
 *  net.fabricmc.fabric.api.particle.v1.FabricBlockStateParticleEffect
 *  net.fabricmc.fabric.impl.particle.BlockStateParticleEffectExtension
 *  net.fabricmc.fabric.impl.particle.ExtendedBlockStateParticleEffectPacketCodec
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import minecraft.class00500;
import minecraft.class00750;
import minecraft.class00891;
import minecraft.class02362;
import minecraft.class02389;
import minecraft.class04206;
import minecraft.class04247;
import minecraft.class07103;
import minecraft.class07126;
import minecraft.class07209;
import net.fabricmc.fabric.api.particle.v1.FabricBlockStateParticleEffect;
import net.fabricmc.fabric.impl.particle.BlockStateParticleEffectExtension;
import net.fabricmc.fabric.impl.particle.ExtendedBlockStateParticleEffectPacketCodec;
import org.jspecify.annotations.Nullable;

public class class07105
implements class07126,
FabricBlockStateParticleEffect,
BlockStateParticleEffectExtension {
    private static final Codec<class00500> N = Codec.withAlternative((Codec)class00500.N, (Codec)class04206.i.T(), class00891::W);
    private final class07103<class07105> y;
    private final class00500 L;
    private @Nullable class07209 u;

    public class07105(class07103<class07105> class071032, class00500 class005002) {
        this.y = class071032;
        this.L = class005002;
    }

    public static class02362<? super class04247, class07105> y(class07103<class07105> class071032) {
        return class07105.N(class02389.N((class00750)class00891.U).N_10(class005002 -> new class07105(class071032, (class00500)class005002), class071052 -> class071052.L));
    }

    private static class02362 N(class02362 class023622) {
        return new ExtendedBlockStateParticleEffectPacketCodec(class023622);
    }

    public static MapCodec<class07105> N(class07103<class07105> class071032) {
        return N.xmap(class005002 -> new class07105(class071032, (class00500)class005002), class071052 -> class071052.L).fieldOf("block_state");
    }

    public class00500 N() {
        return this.L;
    }

    public void fabric_setBlockPos(@Nullable class07209 class072092) {
        this.u = class072092;
    }

    public @Nullable class07209 getBlockPos() {
        return this.u;
    }

    public class07103<class07105> method_10295() {
        return this.y;
    }
}

