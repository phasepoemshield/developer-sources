/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class05836
 *  minecraft.class08092
 *  net.fabricmc.fabric.api.transfer.v1.item.ItemVariant
 *  net.fabricmc.fabric.api.transfer.v1.storage.StoragePreconditions
 *  net.fabricmc.fabric.api.transfer.v1.storage.TransferVariant
 *  net.fabricmc.fabric.api.transfer.v1.storage.base.InsertionOnlyStorage
 *  net.fabricmc.fabric.api.transfer.v1.transaction.TransactionContext
 */
package net.fabricmc.fabric.impl.transfer.item;

import minecraft.class05836;
import minecraft.class08092;
import net.fabricmc.fabric.api.transfer.v1.item.ItemVariant;
import net.fabricmc.fabric.api.transfer.v1.storage.StoragePreconditions;
import net.fabricmc.fabric.api.transfer.v1.storage.TransferVariant;
import net.fabricmc.fabric.api.transfer.v1.storage.base.InsertionOnlyStorage;
import net.fabricmc.fabric.api.transfer.v1.transaction.TransactionContext;
import net.fabricmc.fabric.impl.transfer.item.ComposterWrapper;

class ComposterWrapper$TopStorage
implements InsertionOnlyStorage<ItemVariant> {
    final /* synthetic */ ComposterWrapper this$0;

    ComposterWrapper$TopStorage(ComposterWrapper composterWrapper) {
        this.this$0 = composterWrapper;
    }

    public String toString() {
        return "ComposterWrapper[" + String.valueOf((Object)this.this$0.location) + "/top]";
    }

    public long insert(ItemVariant itemVariant, long l, TransactionContext transactionContext) {
        StoragePreconditions.notBlankNotNegative((TransferVariant)itemVariant, (long)l);
        if (l < 1L) {
            return 0L;
        }
        if (this.this$0.increaseProbability.floatValue() != 0.0f) {
            return 0L;
        }
        if ((Integer)this.this$0.location.getBlockState().L((class08092)class05836.i) >= 7) {
            return 0L;
        }
        float f = class05836.R.getFloat((Object)itemVariant.getItem());
        if (f <= 0.0f) {
            return 0L;
        }
        this.this$0.updateSnapshots(transactionContext);
        this.this$0.increaseProbability = Float.valueOf(f);
        return 1L;
    }
}

