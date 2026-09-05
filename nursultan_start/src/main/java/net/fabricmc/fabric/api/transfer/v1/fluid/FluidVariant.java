/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.Codec
 *  minecraft.class02362
 *  minecraft.class02678
 *  minecraft.class03556
 *  minecraft.class04247
 *  minecraft.class04651
 *  minecraft.class04684
 *  net.fabricmc.fabric.impl.transfer.VariantCodecs
 *  net.fabricmc.fabric.impl.transfer.fluid.FluidVariantImpl
 */
package net.fabricmc.fabric.api.transfer.v1.fluid;

import com.mojang.serialization.Codec;
import minecraft.class02362;
import minecraft.class02678;
import minecraft.class03556;
import minecraft.class04247;
import minecraft.class04651;
import minecraft.class04684;
import net.fabricmc.fabric.api.transfer.v1.storage.TransferVariant;
import net.fabricmc.fabric.impl.transfer.VariantCodecs;
import net.fabricmc.fabric.impl.transfer.fluid.FluidVariantImpl;

public interface FluidVariant
extends TransferVariant<class04651> {
    public static final Codec<FluidVariant> CODEC = VariantCodecs.FLUID_CODEC;
    public static final class02362<class04247, FluidVariant> PACKET_CODEC = VariantCodecs.FLUID_PACKET_CODEC;

    public FluidVariant withComponentChanges(class02678 var1);

    public static FluidVariant of(class04651 class046512) {
        return FluidVariant.of(class046512, class02678.N);
    }

    public static FluidVariant of(class04651 class046512, class02678 class026782) {
        return FluidVariantImpl.of((class04651)class046512, (class02678)class026782);
    }

    default public class03556<class04651> getRegistryEntry() {
        return this.getFluid().U();
    }

    default public class04651 getFluid() {
        return (class04651)this.getObject();
    }

    public static FluidVariant blank() {
        return FluidVariant.of(class04684.N);
    }
}

