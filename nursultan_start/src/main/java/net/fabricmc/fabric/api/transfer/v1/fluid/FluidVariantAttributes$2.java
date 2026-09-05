/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00392
 *  minecraft.class00405
 *  minecraft.class00869
 *  minecraft.class04891
 *  minecraft.class04909
 *  minecraft.class06541
 */
package net.fabricmc.fabric.api.transfer.v1.fluid;

import java.util.Optional;
import minecraft.class00392;
import minecraft.class00405;
import minecraft.class00869;
import minecraft.class04891;
import minecraft.class04909;
import minecraft.class06541;
import net.fabricmc.fabric.api.transfer.v1.fluid.FluidVariant;
import net.fabricmc.fabric.api.transfer.v1.fluid.FluidVariantAttributeHandler;
import net.fabricmc.fabric.api.transfer.v1.fluid.FluidVariantAttributes;

class FluidVariantAttributes$2
implements FluidVariantAttributeHandler {
    FluidVariantAttributes$2() {
    }

    @Override
    public class00392 getName(FluidVariant fluidVariant) {
        if (FluidVariantAttributes.coloredVanillaFluidNames) {
            return class00869.K.M().y(class00405.N.N(class06541.field_1078));
        }
        return FluidVariantAttributeHandler.super.getName(fluidVariant);
    }

    @Override
    public Optional<class04891> getEmptySound(FluidVariant fluidVariant) {
        return Optional.of(class04909.us);
    }
}

