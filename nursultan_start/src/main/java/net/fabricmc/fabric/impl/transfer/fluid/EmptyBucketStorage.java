/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class02678
 *  minecraft.class06570
 *  minecraft.class06581
 *  minecraft.class07310
 *  net.fabricmc.fabric.api.transfer.v1.context.ContainerItemContext
 *  net.fabricmc.fabric.api.transfer.v1.fluid.FluidVariant
 *  net.fabricmc.fabric.api.transfer.v1.item.ItemVariant
 *  net.fabricmc.fabric.api.transfer.v1.storage.StoragePreconditions
 *  net.fabricmc.fabric.api.transfer.v1.storage.StorageView
 *  net.fabricmc.fabric.api.transfer.v1.storage.TransferVariant
 *  net.fabricmc.fabric.api.transfer.v1.storage.base.BlankVariantView
 *  net.fabricmc.fabric.api.transfer.v1.storage.base.InsertionOnlyStorage
 *  net.fabricmc.fabric.api.transfer.v1.transaction.TransactionContext
 *  net.fabricmc.fabric.mixin.transfer.BucketItemAccessor
 */
package net.fabricmc.fabric.impl.transfer.fluid;

import java.util.Iterator;
import java.util.List;
import minecraft.class02678;
import minecraft.class06570;
import minecraft.class06581;
import minecraft.class07310;
import net.fabricmc.fabric.api.transfer.v1.context.ContainerItemContext;
import net.fabricmc.fabric.api.transfer.v1.fluid.FluidVariant;
import net.fabricmc.fabric.api.transfer.v1.item.ItemVariant;
import net.fabricmc.fabric.api.transfer.v1.storage.StoragePreconditions;
import net.fabricmc.fabric.api.transfer.v1.storage.StorageView;
import net.fabricmc.fabric.api.transfer.v1.storage.TransferVariant;
import net.fabricmc.fabric.api.transfer.v1.storage.base.BlankVariantView;
import net.fabricmc.fabric.api.transfer.v1.storage.base.InsertionOnlyStorage;
import net.fabricmc.fabric.api.transfer.v1.transaction.TransactionContext;
import net.fabricmc.fabric.mixin.transfer.BucketItemAccessor;

public class EmptyBucketStorage
implements InsertionOnlyStorage<FluidVariant> {
    private final ContainerItemContext context;
    private final List<StorageView<FluidVariant>> blankView = List.of(new BlankVariantView((TransferVariant)FluidVariant.blank(), 81000L));

    public EmptyBucketStorage(ContainerItemContext containerItemContext) {
        this.context = containerItemContext;
    }

    public String toString() {
        return "EmptyBucketStorage[" + String.valueOf(this.context) + "]";
    }

    public long insert(FluidVariant fluidVariant, long l, TransactionContext transactionContext) {
        ItemVariant itemVariant;
        BucketItemAccessor bucketItemAccessor;
        StoragePreconditions.notBlankNotNegative((TransferVariant)fluidVariant, (long)l);
        if (!this.context.getItemVariant().isOf((Object)class06570.jU)) {
            return 0L;
        }
        class06581 class065812 = fluidVariant.getFluid().N();
        if (class065812 instanceof BucketItemAccessor && fluidVariant.isOf((Object)(bucketItemAccessor = (BucketItemAccessor)class065812).fabric_getFluid()) && l >= 81000L && this.context.exchange(itemVariant = ItemVariant.of((class07310)class065812, (class02678)this.context.getItemVariant().getComponents()), 1L, transactionContext) == 1L) {
            return 81000L;
        }
        return 0L;
    }

    public Iterator<StorageView<FluidVariant>> iterator() {
        return this.blankView.iterator();
    }
}

