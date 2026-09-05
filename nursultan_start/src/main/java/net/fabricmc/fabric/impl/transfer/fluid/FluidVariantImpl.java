/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class01894
 *  minecraft.class02509
 *  minecraft.class02678
 *  minecraft.class02695
 *  minecraft.class03556
 *  minecraft.class04206
 *  minecraft.class04651
 *  minecraft.class04684
 *  minecraft.class05787
 *  net.fabricmc.fabric.api.transfer.v1.fluid.FluidVariant
 *  org.jspecify.annotations.Nullable
 */
package net.fabricmc.fabric.impl.transfer.fluid;

import java.util.Objects;
import minecraft.class01894;
import minecraft.class02509;
import minecraft.class02678;
import minecraft.class02695;
import minecraft.class03556;
import minecraft.class04206;
import minecraft.class04651;
import minecraft.class04684;
import minecraft.class05787;
import net.fabricmc.fabric.api.transfer.v1.fluid.FluidVariant;
import net.fabricmc.fabric.impl.transfer.TransferApiImpl;
import net.fabricmc.fabric.impl.transfer.fluid.FluidVariantCache;
import org.jspecify.annotations.Nullable;

public class FluidVariantImpl
implements FluidVariant {
    private final class04651 fluid;
    private final class02678 components;
    private final class02695 componentMap;
    private final int hashCode;

    public FluidVariant withComponentChanges(class02678 class026782) {
        return FluidVariantImpl.of(this.fluid, TransferApiImpl.mergeChanges(this.getComponents(), class026782));
    }

    public FluidVariantImpl(class04651 class046512, class02678 class026782) {
        this.fluid = class046512;
        this.components = class026782;
        this.componentMap = class026782 == class02678.N ? class02695.N : class02509.N((class02695)class02695.N, (class02678)class026782);
        this.hashCode = Objects.hash(class046512, class026782);
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object == null || this.getClass() != object.getClass()) {
            return false;
        }
        FluidVariantImpl fluidVariantImpl = (FluidVariantImpl)object;
        return this.hashCode == fluidVariantImpl.hashCode && this.fluid == fluidVariantImpl.fluid && this.componentsMatch(fluidVariantImpl.components);
    }

    public String toString() {
        return "FluidVariant{fluid=" + String.valueOf(this.fluid) + ", components=" + String.valueOf(this.components) + "}";
    }

    public int hashCode() {
        return this.hashCode;
    }

    public boolean isBlank() {
        return this.fluid == class04684.N;
    }

    public static FluidVariant of(class04651 class046512, class02678 class026782) {
        Objects.requireNonNull(class046512, "Fluid may not be null.");
        Objects.requireNonNull(class026782, "Components may not be null.");
        if (!class046512.L(class046512.M()) && class046512 != class04684.N) {
            if (class046512 instanceof class05787) {
                class05787 class057872 = (class05787)class046512;
                class046512 = class057872.i();
            } else {
                class01894 class018942 = class04206.L.y((Object)class046512);
                throw new IllegalArgumentException("Cannot convert flowing fluid %s (%s) into a still fluid.".formatted(new Object[]{class018942, class046512}));
            }
        }
        if (class026782.u() || class046512 == class04684.N) {
            return ((FluidVariantCache)class046512).fabric_getCachedFluidVariant();
        }
        return new FluidVariantImpl(class046512, class026782);
    }

    public static FluidVariant of(class03556<class04651> class035562, class02678 class026782) {
        return FluidVariantImpl.of((class04651)class035562.N(), class026782);
    }

    public class04651 getObject() {
        return this.fluid;
    }

    public class02695 getComponentMap() {
        return this.componentMap;
    }

    public @Nullable class02678 getComponents() {
        return this.components;
    }
}

