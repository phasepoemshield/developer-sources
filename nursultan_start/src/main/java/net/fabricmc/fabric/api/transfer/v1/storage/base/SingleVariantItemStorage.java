/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class06581
 *  net.fabricmc.fabric.api.transfer.v1.context.ContainerItemContext
 *  net.fabricmc.fabric.api.transfer.v1.item.ItemVariant
 *  net.fabricmc.fabric.api.transfer.v1.storage.StoragePreconditions
 *  net.fabricmc.fabric.api.transfer.v1.storage.TransferVariant
 */
package net.fabricmc.fabric.api.transfer.v1.storage.base;

import minecraft.class06581;
import net.fabricmc.fabric.api.transfer.v1.context.ContainerItemContext;
import net.fabricmc.fabric.api.transfer.v1.item.ItemVariant;
import net.fabricmc.fabric.api.transfer.v1.storage.StoragePreconditions;
import net.fabricmc.fabric.api.transfer.v1.storage.TransferVariant;
import net.fabricmc.fabric.api.transfer.v1.storage.base.SingleSlotStorage;
import net.fabricmc.fabric.api.transfer.v1.transaction.TransactionContext;

public abstract class SingleVariantItemStorage<T extends TransferVariant<?>>
implements SingleSlotStorage<T> {
    private final ContainerItemContext context;
    private final class06581 item;

    public SingleVariantItemStorage(ContainerItemContext containerItemContext) {
        this.context = containerItemContext;
        this.item = containerItemContext.getItemVariant().getItem();
    }

    public String toString() {
        return "SingleVariantItemStorage[" + String.valueOf(this.context) + "/" + String.valueOf(this.item) + "]";
    }

    public long extract(T t, long l, TransactionContext transactionContext) {
        StoragePreconditions.notBlankNotNegative(t, (long)l);
        if (!this.canExtract(t)) {
            return 0L;
        }
        if (!this.context.getItemVariant().isOf((Object)this.item)) {
            return 0L;
        }
        long l2 = this.getAmount(this.context.getItemVariant());
        T t2 = this.getResource(this.context.getItemVariant());
        long l3 = 0L;
        if (t2.equals(t)) {
            l3 = Math.min(l, l2);
        }
        if (l3 > 0L && this.tryUpdateStorage(t2, l2 - l3, transactionContext)) {
            return l3;
        }
        return 0L;
    }

    public long insert(T t, long l, TransactionContext transactionContext) {
        StoragePreconditions.notBlankNotNegative(t, (long)l);
        if (!this.canInsert(t)) {
            return 0L;
        }
        if (!this.context.getItemVariant().isOf((Object)this.item)) {
            return 0L;
        }
        long l2 = this.getAmount(this.context.getItemVariant());
        T t2 = this.getResource(this.context.getItemVariant());
        long l3 = 0L;
        if (t2.isBlank() || l2 == 0L) {
            l3 = Math.min(this.getCapacity(t), l);
        } else if (t2.equals(t)) {
            l3 = Math.min(this.getCapacity(t) - l2, l);
        }
        if (l3 > 0L && this.tryUpdateStorage(t, l2 + l3, transactionContext)) {
            return l3;
        }
        return 0L;
    }

    public T getResource() {
        if (this.context.getItemVariant().isOf((Object)this.item)) {
            return this.getResource(this.context.getItemVariant());
        }
        return this.getBlankResource();
    }

    protected abstract T getResource(ItemVariant var1);

    protected abstract long getCapacity(T var1);

    public long getCapacity() {
        if (this.context.getItemVariant().isOf((Object)this.item)) {
            return this.getCapacity(this.getResource());
        }
        return 0L;
    }

    protected boolean canInsert(T t) {
        return true;
    }

    protected boolean canExtract(T t) {
        return true;
    }

    protected abstract long getAmount(ItemVariant var1);

    public long getAmount() {
        if (this.context.getItemVariant().isOf((Object)this.item)) {
            return this.getAmount(this.context.getItemVariant());
        }
        return 0L;
    }

    public boolean isResourceBlank() {
        return this.getResource().isBlank();
    }

    public boolean supportsExtraction() {
        return this.context.getItemVariant().isOf((Object)this.item);
    }

    public boolean supportsInsertion() {
        return this.context.getItemVariant().isOf((Object)this.item);
    }

    protected abstract T getBlankResource();

    protected abstract ItemVariant getUpdatedVariant(ItemVariant var1, T var2, long var3);

    private boolean tryUpdateStorage(T t, long l, TransactionContext transactionContext) {
        return this.context.exchange(this.getUpdatedVariant(this.context.getItemVariant(), t, l), 1L, transactionContext) == 1L;
    }
}

