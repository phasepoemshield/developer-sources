/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00392
 *  minecraft.class04651
 *  minecraft.class04684
 *  minecraft.class04891
 *  minecraft.class04909
 *  minecraft.class07299
 *  net.fabricmc.fabric.api.lookup.v1.custom.ApiProviderMap
 *  net.fabricmc.fabric.impl.transfer.TransferApiImpl
 *  org.jspecify.annotations.Nullable
 */
package net.fabricmc.fabric.api.transfer.v1.fluid;

import minecraft.class00392;
import minecraft.class04651;
import minecraft.class04684;
import minecraft.class04891;
import minecraft.class04909;
import minecraft.class07299;
import net.fabricmc.fabric.api.lookup.v1.custom.ApiProviderMap;
import net.fabricmc.fabric.api.transfer.v1.fluid.FluidVariant;
import net.fabricmc.fabric.api.transfer.v1.fluid.FluidVariantAttributeHandler;
import net.fabricmc.fabric.api.transfer.v1.fluid.FluidVariantAttributes$1;
import net.fabricmc.fabric.api.transfer.v1.fluid.FluidVariantAttributes$2;
import net.fabricmc.fabric.api.transfer.v1.fluid.FluidVariantAttributes$3;
import net.fabricmc.fabric.impl.transfer.TransferApiImpl;
import org.jspecify.annotations.Nullable;

public final class FluidVariantAttributes {
    private static final ApiProviderMap<class04651, FluidVariantAttributeHandler> HANDLERS = ApiProviderMap.create();
    private static final FluidVariantAttributeHandler DEFAULT_HANDLER = new FluidVariantAttributes$1();
    static volatile boolean coloredVanillaFluidNames = false;

    private FluidVariantAttributes() {
    }

    static {
        FluidVariantAttributes.register((class04651)class04684.L, new FluidVariantAttributes$2());
        FluidVariantAttributes.register((class04651)class04684.i, new FluidVariantAttributes$3());
    }

    public static class00392 getName(FluidVariant fluidVariant) {
        return FluidVariantAttributes.getHandlerOrDefault(fluidVariant.getFluid()).getName(fluidVariant);
    }

    public static void register(class04651 class046512, FluidVariantAttributeHandler fluidVariantAttributeHandler) {
        if (HANDLERS.putIfAbsent((Object)class046512, (Object)fluidVariantAttributeHandler) != null) {
            throw new IllegalArgumentException("Duplicate handler registration for fluid " + String.valueOf(class046512));
        }
    }

    public static @Nullable FluidVariantAttributeHandler getHandler(class04651 class046512) {
        return (FluidVariantAttributeHandler)HANDLERS.get((Object)class046512);
    }

    public static class04891 getEmptySound(FluidVariant fluidVariant) {
        return FluidVariantAttributes.getHandlerOrDefault(fluidVariant.getFluid()).getEmptySound(fluidVariant).orElse(class04909.us);
    }

    public static FluidVariantAttributeHandler getHandlerOrDefault(class04651 class046512) {
        FluidVariantAttributeHandler fluidVariantAttributeHandler = (FluidVariantAttributeHandler)HANDLERS.get((Object)class046512);
        return fluidVariantAttributeHandler == null ? DEFAULT_HANDLER : fluidVariantAttributeHandler;
    }

    public static class04891 getFillSound(FluidVariant fluidVariant) {
        return FluidVariantAttributes.getHandlerOrDefault(fluidVariant.getFluid()).getFillSound(fluidVariant).or(() -> fluidVariant.getFluid().z()).orElse(class04909.ut);
    }

    public static void enableColoredVanillaFluidNames() {
        coloredVanillaFluidNames = true;
    }

    public static int getTemperature(FluidVariant fluidVariant) {
        int n = FluidVariantAttributes.getHandlerOrDefault(fluidVariant.getFluid()).getTemperature(fluidVariant);
        if (n < 0) {
            TransferApiImpl.LOGGER.warn("Broken FluidVariantAttributeHandler. Invalid temperature %d for fluid variant %s".formatted(new Object[]{n, fluidVariant}));
            return DEFAULT_HANDLER.getTemperature(fluidVariant);
        }
        return n;
    }

    public static int getViscosity(FluidVariant fluidVariant, @Nullable class07299 class072992) {
        int n = FluidVariantAttributes.getHandlerOrDefault(fluidVariant.getFluid()).getViscosity(fluidVariant, class072992);
        if (n <= 0) {
            TransferApiImpl.LOGGER.warn("Broken FluidVariantAttributeHandler. Invalid viscosity %d for fluid variant %s".formatted(new Object[]{n, fluidVariant}));
            return DEFAULT_HANDLER.getViscosity(fluidVariant, class072992);
        }
        return n;
    }

    public static int getLuminance(FluidVariant fluidVariant) {
        int n = FluidVariantAttributes.getHandlerOrDefault(fluidVariant.getFluid()).getLuminance(fluidVariant);
        if (n < 0 || n > 15) {
            TransferApiImpl.LOGGER.warn("Broken FluidVariantAttributeHandler. Invalid luminance %d for fluid variant %s".formatted(new Object[]{n, fluidVariant}));
            return DEFAULT_HANDLER.getLuminance(fluidVariant);
        }
        return n;
    }

    public static boolean isLighterThanAir(FluidVariant fluidVariant) {
        return FluidVariantAttributes.getHandlerOrDefault(fluidVariant.getFluid()).isLighterThanAir(fluidVariant);
    }
}

