/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class08299
 *  minecraft.class08329
 *  net.fabricmc.fabric.api.transfer.v1.storage.base.SingleVariantStorage
 */
package net.fabricmc.fabric.api.transfer.v1.fluid.base;

import java.util.Objects;
import minecraft.class08299;
import minecraft.class08329;
import net.fabricmc.fabric.api.transfer.v1.fluid.FluidVariant;
import net.fabricmc.fabric.api.transfer.v1.fluid.base.SingleFluidStorage$1;
import net.fabricmc.fabric.api.transfer.v1.storage.StoragePreconditions;
import net.fabricmc.fabric.api.transfer.v1.storage.base.SingleVariantStorage;

public abstract class SingleFluidStorage
extends SingleVariantStorage<FluidVariant> {
    public void readData(class08299 class082992) {
        SingleVariantStorage.readData((SingleVariantStorage)this, FluidVariant.CODEC, FluidVariant::blank, (class08299)class082992);
    }

    public void writeData(class08329 class083292) {
        SingleVariantStorage.writeData((SingleVariantStorage)this, FluidVariant.CODEC, (class08329)class083292);
    }

    public static SingleFluidStorage withFixedCapacity(long l, Runnable runnable) {
        StoragePreconditions.notNegative(l);
        Objects.requireNonNull(runnable, "onChange may not be null");
        return new SingleFluidStorage$1(l, runnable);
    }

    protected final FluidVariant getBlankVariant() {
        return FluidVariant.blank();
    }
}

