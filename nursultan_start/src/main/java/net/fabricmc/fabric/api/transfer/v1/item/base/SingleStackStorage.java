/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class06584
 *  net.fabricmc.fabric.api.transfer.v1.storage.base.SingleSlotStorage
 *  net.fabricmc.fabric.api.transfer.v1.transaction.TransactionContext
 *  net.fabricmc.fabric.api.transfer.v1.transaction.base.SnapshotParticipant
 */
package net.fabricmc.fabric.api.transfer.v1.item.base;

import minecraft.class06584;
import net.fabricmc.fabric.api.transfer.v1.item.ItemVariant;
import net.fabricmc.fabric.api.transfer.v1.storage.StoragePreconditions;
import net.fabricmc.fabric.api.transfer.v1.storage.base.SingleSlotStorage;
import net.fabricmc.fabric.api.transfer.v1.transaction.TransactionContext;
import net.fabricmc.fabric.api.transfer.v1.transaction.base.SnapshotParticipant;

public abstract class SingleStackStorage
extends SnapshotParticipant<class06584>
implements SingleSlotStorage<ItemVariant> {
    protected abstract void setStack(class06584 var1);

    public String toString() {
        return "SingleStackStorage[" + String.valueOf(this.getStack()) + "]";
    }

    public long extract(ItemVariant itemVariant, long l, TransactionContext transactionContext) {
        int n;
        StoragePreconditions.notBlankNotNegative(itemVariant, l);
        class06584 class065842 = this.getStack();
        if (itemVariant.matches(class065842) && this.canExtract(itemVariant) && (n = (int)Math.min((long)class065842.c(), l)) > 0) {
            this.updateSnapshots(transactionContext);
            class065842 = this.getStack();
            class065842.B(n);
            this.setStack(class065842);
            return n;
        }
        return 0L;
    }

    public long insert(ItemVariant itemVariant, long l, TransactionContext transactionContext) {
        int n;
        StoragePreconditions.notBlankNotNegative(itemVariant, l);
        class06584 class065842 = this.getStack();
        if ((itemVariant.matches(class065842) || class065842.R()) && this.canInsert(itemVariant) && (n = (int)Math.min(l, (long)(this.getCapacity(itemVariant) - class065842.c()))) > 0) {
            this.updateSnapshots(transactionContext);
            class065842 = this.getStack();
            if (class065842.R()) {
                class065842 = itemVariant.toStack(n);
            } else {
                class065842.M(n);
            }
            this.setStack(class065842);
            return n;
        }
        return 0L;
    }

    public ItemVariant getResource() {
        return ItemVariant.of(this.getStack());
    }

    protected abstract class06584 getStack();

    public long getCapacity() {
        return this.getCapacity((ItemVariant)this.getResource());
    }

    protected int getCapacity(ItemVariant itemVariant) {
        return itemVariant.getItem().M();
    }

    protected void readSnapshot(class06584 class065842) {
        this.setStack(class065842);
    }

    protected class06584 createSnapshot() {
        class06584 class065842 = this.getStack();
        this.setStack(class065842.t());
        return class065842;
    }

    protected boolean canInsert(ItemVariant itemVariant) {
        return true;
    }

    protected boolean canExtract(ItemVariant itemVariant) {
        return true;
    }

    public long getAmount() {
        return this.getStack().c();
    }

    public boolean isResourceBlank() {
        return this.getStack().R();
    }
}

