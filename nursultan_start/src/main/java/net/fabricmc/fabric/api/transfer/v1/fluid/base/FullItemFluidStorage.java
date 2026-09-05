/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class06581
 *  minecraft.class07310
 *  net.fabricmc.fabric.api.transfer.v1.storage.base.ExtractionOnlyStorage
 *  net.fabricmc.fabric.api.transfer.v1.storage.base.SingleSlotStorage
 *  net.fabricmc.fabric.api.transfer.v1.transaction.TransactionContext
 */
package net.fabricmc.fabric.api.transfer.v1.fluid.base;

import java.util.function.Function;
import minecraft.class06581;
import minecraft.class07310;
import net.fabricmc.fabric.api.transfer.v1.context.ContainerItemContext;
import net.fabricmc.fabric.api.transfer.v1.fluid.FluidVariant;
import net.fabricmc.fabric.api.transfer.v1.item.ItemVariant;
import net.fabricmc.fabric.api.transfer.v1.storage.StoragePreconditions;
import net.fabricmc.fabric.api.transfer.v1.storage.base.ExtractionOnlyStorage;
import net.fabricmc.fabric.api.transfer.v1.storage.base.SingleSlotStorage;
import net.fabricmc.fabric.api.transfer.v1.transaction.TransactionContext;

public final class FullItemFluidStorage
implements ExtractionOnlyStorage<FluidVariant>,
SingleSlotStorage<FluidVariant> {
    private final ContainerItemContext context;
    private final class06581 fullItem;
    private final Function<ItemVariant, ItemVariant> fullToEmptyMapping;
    private final FluidVariant containedFluid;
    private final long containedAmount;

    public FullItemFluidStorage(ContainerItemContext containerItemContext, class06581 class065812, FluidVariant fluidVariant, long l) {
        this(containerItemContext, (ItemVariant itemVariant) -> ItemVariant.of((class07310)class065812, itemVariant.getComponents()), fluidVariant, l);
    }

    public FullItemFluidStorage(ContainerItemContext containerItemContext, Function<ItemVariant, ItemVariant> function, FluidVariant fluidVariant, long l) {
        StoragePreconditions.notBlankNotNegative(fluidVariant, l);
        this.context = containerItemContext;
        this.fullItem = containerItemContext.getItemVariant().getItem();
        this.fullToEmptyMapping = function;
        this.containedFluid = fluidVariant;
        this.containedAmount = l;
    }

    public String toString() {
        return "FullItemFluidStorage[context=%s, fluid=%s, amount=%d]".formatted(new Object[]{this.context, this.containedFluid, this.containedAmount});
    }

    public long extract(FluidVariant fluidVariant, long l, TransactionContext transactionContext) {
        ItemVariant itemVariant;
        StoragePreconditions.notBlankNotNegative(fluidVariant, l);
        if (!this.context.getItemVariant().isOf(this.fullItem)) {
            return 0L;
        }
        if (fluidVariant.equals(this.containedFluid) && l >= this.containedAmount && this.context.exchange(itemVariant = this.fullToEmptyMapping.apply(this.context.getItemVariant()), 1L, transactionContext) == 1L) {
            return this.containedAmount;
        }
        return 0L;
    }

    public FluidVariant getResource() {
        if (this.context.getItemVariant().isOf(this.fullItem)) {
            return this.containedFluid;
        }
        return FluidVariant.blank();
    }

    public long getCapacity() {
        return this.getAmount();
    }

    public long getAmount() {
        if (this.context.getItemVariant().isOf(this.fullItem)) {
            return this.containedAmount;
        }
        return 0L;
    }

    public boolean isResourceBlank() {
        return this.getResource().isBlank();
    }
}

