/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class04651
 *  minecraft.class06581
 *  minecraft.class07310
 *  net.fabricmc.fabric.api.transfer.v1.storage.base.InsertionOnlyStorage
 *  net.fabricmc.fabric.api.transfer.v1.transaction.TransactionContext
 */
package net.fabricmc.fabric.api.transfer.v1.fluid.base;

import java.util.Iterator;
import java.util.List;
import java.util.function.Function;
import minecraft.class04651;
import minecraft.class06581;
import minecraft.class07310;
import net.fabricmc.fabric.api.transfer.v1.context.ContainerItemContext;
import net.fabricmc.fabric.api.transfer.v1.fluid.FluidVariant;
import net.fabricmc.fabric.api.transfer.v1.item.ItemVariant;
import net.fabricmc.fabric.api.transfer.v1.storage.StoragePreconditions;
import net.fabricmc.fabric.api.transfer.v1.storage.StorageView;
import net.fabricmc.fabric.api.transfer.v1.storage.base.BlankVariantView;
import net.fabricmc.fabric.api.transfer.v1.storage.base.InsertionOnlyStorage;
import net.fabricmc.fabric.api.transfer.v1.transaction.TransactionContext;

public final class EmptyItemFluidStorage
implements InsertionOnlyStorage<FluidVariant> {
    private final ContainerItemContext context;
    private final class06581 emptyItem;
    private final Function<ItemVariant, ItemVariant> emptyToFullMapping;
    private final class04651 insertableFluid;
    private final long insertableAmount;
    private final List<StorageView<FluidVariant>> blankView;

    public EmptyItemFluidStorage(ContainerItemContext containerItemContext, class06581 class065812, class04651 class046512, long l) {
        this(containerItemContext, (ItemVariant itemVariant) -> ItemVariant.of((class07310)class065812, itemVariant.getComponents()), class046512, l);
    }

    public EmptyItemFluidStorage(ContainerItemContext containerItemContext, Function<ItemVariant, ItemVariant> function, class04651 class046512, long l) {
        StoragePreconditions.notNegative(l);
        this.context = containerItemContext;
        this.emptyItem = containerItemContext.getItemVariant().getItem();
        this.emptyToFullMapping = function;
        this.insertableFluid = class046512;
        this.insertableAmount = l;
        this.blankView = List.of(new BlankVariantView<FluidVariant>(FluidVariant.blank(), l));
    }

    public String toString() {
        return "EmptyItemFluidStorage[context=%s, insertableFluid=%s, insertableAmount=%d]".formatted(new Object[]{this.context, this.insertableFluid, this.insertableAmount});
    }

    public long insert(FluidVariant fluidVariant, long l, TransactionContext transactionContext) {
        ItemVariant itemVariant;
        StoragePreconditions.notBlankNotNegative(fluidVariant, l);
        if (!this.context.getItemVariant().isOf(this.emptyItem)) {
            return 0L;
        }
        if (fluidVariant.isOf(this.insertableFluid) && l >= this.insertableAmount && this.context.exchange(itemVariant = this.emptyToFullMapping.apply(this.context.getItemVariant()), 1L, transactionContext) == 1L) {
            return this.insertableAmount;
        }
        return 0L;
    }

    public Iterator<StorageView<FluidVariant>> iterator() {
        return this.blankView.iterator();
    }
}

