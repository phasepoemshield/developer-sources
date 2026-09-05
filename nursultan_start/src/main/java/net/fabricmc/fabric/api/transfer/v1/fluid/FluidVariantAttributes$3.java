/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00392
 *  minecraft.class00405
 *  minecraft.class00608
 *  minecraft.class00869
 *  minecraft.class04891
 *  minecraft.class04909
 *  minecraft.class06541
 *  minecraft.class07299
 *  org.jspecify.annotations.Nullable
 */
package net.fabricmc.fabric.api.transfer.v1.fluid;

import java.util.Optional;
import minecraft.class00392;
import minecraft.class00405;
import minecraft.class00608;
import minecraft.class00869;
import minecraft.class04891;
import minecraft.class04909;
import minecraft.class06541;
import minecraft.class07299;
import net.fabricmc.fabric.api.transfer.v1.fluid.FluidVariant;
import net.fabricmc.fabric.api.transfer.v1.fluid.FluidVariantAttributeHandler;
import net.fabricmc.fabric.api.transfer.v1.fluid.FluidVariantAttributes;
import org.jspecify.annotations.Nullable;

class FluidVariantAttributes$3
implements FluidVariantAttributeHandler {
    FluidVariantAttributes$3() {
    }

    @Override
    public class00392 getName(FluidVariant fluidVariant) {
        if (FluidVariantAttributes.coloredVanillaFluidNames) {
            return class00869.V.M().y(class00405.N.N(class06541.field_1061));
        }
        return FluidVariantAttributeHandler.super.getName(fluidVariant);
    }

    @Override
    public Optional<class04891> getEmptySound(FluidVariant fluidVariant) {
        return Optional.of(class04909.uj);
    }

    @Override
    public Optional<class04891> getFillSound(FluidVariant fluidVariant) {
        return Optional.of(class04909.ud);
    }

    @Override
    public int getTemperature(FluidVariant fluidVariant) {
        return 1300;
    }

    @Override
    public int getViscosity(FluidVariant fluidVariant, @Nullable class07299 class072992) {
        if (class072992 != null && ((Boolean)class072992.method_75728().N(class00608.I)).booleanValue()) {
            return 2000;
        }
        return 6000;
    }
}

