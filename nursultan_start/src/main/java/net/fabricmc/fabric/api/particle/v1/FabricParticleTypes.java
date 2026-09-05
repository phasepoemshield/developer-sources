/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.MapCodec
 *  minecraft.class02362
 *  minecraft.class04247
 *  minecraft.class07103
 *  minecraft.class07126
 *  minecraft.class07134
 */
package net.fabricmc.fabric.api.particle.v1;

import com.mojang.serialization.MapCodec;
import java.util.function.Function;
import minecraft.class02362;
import minecraft.class04247;
import minecraft.class07103;
import minecraft.class07126;
import minecraft.class07134;
import net.fabricmc.fabric.api.particle.v1.FabricParticleTypes$1;
import net.fabricmc.fabric.api.particle.v1.FabricParticleTypes$2;
import net.fabricmc.fabric.api.particle.v1.FabricParticleTypes$3;

public final class FabricParticleTypes {
    private FabricParticleTypes() {
    }

    public static class07134 simple(boolean bl) {
        return new FabricParticleTypes$1(bl);
    }

    public static class07134 simple() {
        return FabricParticleTypes.simple(false);
    }

    public static <T extends class07126> class07103<T> complex(boolean bl, Function<class07103<T>, MapCodec<T>> function, Function<class07103<T>, class02362<? super class04247, T>> function2) {
        return new FabricParticleTypes$3(bl, function, function2);
    }

    public static <T extends class07126> class07103<T> complex(Function<class07103<T>, MapCodec<T>> function, Function<class07103<T>, class02362<? super class04247, T>> function2) {
        return FabricParticleTypes.complex(false, function, function2);
    }

    public static <T extends class07126> class07103<T> complex(boolean bl, MapCodec<T> mapCodec, class02362<? super class04247, T> class023622) {
        return new FabricParticleTypes$2(bl, mapCodec, class023622);
    }

    public static <T extends class07126> class07103<T> complex(MapCodec<T> mapCodec, class02362<? super class04247, T> class023622) {
        return FabricParticleTypes.complex(false, mapCodec, class023622);
    }
}

