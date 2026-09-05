/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00392
 *  minecraft.class00869
 *  minecraft.class00891
 *  minecraft.class01894
 *  minecraft.class04206
 *  minecraft.class04891
 *  minecraft.class07299
 *  minecraft.class07536
 *  org.jspecify.annotations.Nullable
 */
package net.fabricmc.fabric.api.transfer.v1.fluid;

import java.util.Optional;
import minecraft.class00392;
import minecraft.class00869;
import minecraft.class00891;
import minecraft.class01894;
import minecraft.class04206;
import minecraft.class04891;
import minecraft.class07299;
import minecraft.class07536;
import net.fabricmc.fabric.api.transfer.v1.fluid.FluidVariant;
import org.jspecify.annotations.Nullable;

public interface FluidVariantAttributeHandler {
    default public class00392 getName(FluidVariant fluidVariant) {
        class00891 class008912 = fluidVariant.getFluid().M().B().i();
        if (!fluidVariant.isBlank() && class008912 == class00869.N) {
            return class00392.L((String)class07536.N((String)"block", (class01894)class04206.L.y((Object)fluidVariant.getFluid())));
        }
        return class008912.M();
    }

    default public Optional<class04891> getEmptySound(FluidVariant fluidVariant) {
        return Optional.empty();
    }

    default public Optional<class04891> getFillSound(FluidVariant fluidVariant) {
        return Optional.empty();
    }

    default public int getTemperature(FluidVariant fluidVariant) {
        return 300;
    }

    default public int getViscosity(FluidVariant fluidVariant, @Nullable class07299 class072992) {
        return 1000;
    }

    default public int getLuminance(FluidVariant fluidVariant) {
        return fluidVariant.getFluid().M().B().m();
    }

    default public boolean isLighterThanAir(FluidVariant fluidVariant) {
        return false;
    }
}

