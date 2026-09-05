/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.Codec
 *  minecraft.class08299
 *  minecraft.class08329
 *  net.fabricmc.fabric.api.transfer.v1.storage.StoragePreconditions
 *  net.fabricmc.fabric.api.transfer.v1.storage.TransferVariant
 */
package net.fabricmc.fabric.api.transfer.v1.storage.base;

import com.mojang.serialization.Codec;
import java.util.function.Supplier;
import minecraft.class08299;
import minecraft.class08329;
import net.fabricmc.fabric.api.transfer.v1.storage.StoragePreconditions;
import net.fabricmc.fabric.api.transfer.v1.storage.TransferVariant;
import net.fabricmc.fabric.api.transfer.v1.storage.base.ResourceAmount;
import net.fabricmc.fabric.api.transfer.v1.storage.base.SingleSlotStorage;
import net.fabricmc.fabric.api.transfer.v1.transaction.TransactionContext;
import net.fabricmc.fabric.api.transfer.v1.transaction.base.SnapshotParticipant;

public abstract class SingleVariantStorage<T extends TransferVariant<?>>
extends SnapshotParticipant<ResourceAmount<T>>
implements SingleSlotStorage<T> {
    public T variant = this.getBlankVariant();
    public long amount = 0L;

    public String toString() {
        return "SingleVariantStorage[%d %s]".formatted(new Object[]{this.amount, this.variant});
    }

    public long extract(T t, long l, TransactionContext transactionContext) {
        long l2;
        StoragePreconditions.notBlankNotNegative(t, (long)l);
        if (t.equals(this.variant) && this.canExtract(t) && (l2 = Math.min(l, this.amount)) > 0L) {
            this.updateSnapshots(transactionContext);
            this.amount -= l2;
            if (this.amount == 0L) {
                this.variant = this.getBlankVariant();
            }
            return l2;
        }
        return 0L;
    }

    public long insert(T t, long l, TransactionContext transactionContext) {
        long l2;
        StoragePreconditions.notBlankNotNegative(t, (long)l);
        if ((t.equals(this.variant) || this.variant.isBlank()) && this.canInsert(t) && (l2 = Math.min(l, this.getCapacity(t) - this.amount)) > 0L) {
            this.updateSnapshots(transactionContext);
            if (this.variant.isBlank()) {
                this.variant = t;
                this.amount = l2;
            } else {
                this.amount += l2;
            }
            return l2;
        }
        return 0L;
    }

    public T getResource() {
        return this.variant;
    }

    public long getCapacity() {
        return this.getCapacity(this.variant);
    }

    protected abstract long getCapacity(T var1);

    public static <T extends TransferVariant<?>> void readData(SingleVariantStorage<T> singleVariantStorage, Codec<T> codec, Supplier<T> supplier, class08299 class082992) {
        singleVariantStorage.variant = (TransferVariant)class082992.N("variant", codec).orElseGet(supplier);
        singleVariantStorage.amount = class082992.N("amount", 0L);
    }

    @Override
    protected void readSnapshot(ResourceAmount<T> resourceAmount) {
        this.variant = (TransferVariant)resourceAmount.resource();
        this.amount = resourceAmount.amount();
    }

    @Override
    protected ResourceAmount<T> createSnapshot() {
        return new ResourceAmount<T>(this.variant, this.amount);
    }

    protected boolean canInsert(T t) {
        return true;
    }

    protected boolean canExtract(T t) {
        return true;
    }

    public long getAmount() {
        return this.amount;
    }

    public static <T extends TransferVariant<?>> void writeData(SingleVariantStorage<T> singleVariantStorage, Codec<T> codec, class08329 class083292) {
        class083292.N("variant", codec, singleVariantStorage.variant);
        class083292.N("amount", singleVariantStorage.amount);
    }

    public boolean isResourceBlank() {
        return this.variant.isBlank();
    }

    protected abstract T getBlankVariant();
}

