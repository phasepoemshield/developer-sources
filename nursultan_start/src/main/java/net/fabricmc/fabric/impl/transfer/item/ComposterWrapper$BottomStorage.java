/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class05836
 *  minecraft.class06570
 *  minecraft.class07310
 *  minecraft.class08092
 *  net.fabricmc.fabric.api.transfer.v1.item.ItemVariant
 *  net.fabricmc.fabric.api.transfer.v1.storage.StoragePreconditions
 *  net.fabricmc.fabric.api.transfer.v1.storage.TransferVariant
 *  net.fabricmc.fabric.api.transfer.v1.storage.base.ExtractionOnlyStorage
 *  net.fabricmc.fabric.api.transfer.v1.storage.base.SingleSlotStorage
 *  net.fabricmc.fabric.api.transfer.v1.transaction.TransactionContext
 */
package net.fabricmc.fabric.impl.transfer.item;

import minecraft.class05836;
import minecraft.class06570;
import minecraft.class07310;
import minecraft.class08092;
import net.fabricmc.fabric.api.transfer.v1.item.ItemVariant;
import net.fabricmc.fabric.api.transfer.v1.storage.StoragePreconditions;
import net.fabricmc.fabric.api.transfer.v1.storage.TransferVariant;
import net.fabricmc.fabric.api.transfer.v1.storage.base.ExtractionOnlyStorage;
import net.fabricmc.fabric.api.transfer.v1.storage.base.SingleSlotStorage;
import net.fabricmc.fabric.api.transfer.v1.transaction.TransactionContext;
import net.fabricmc.fabric.impl.transfer.item.ComposterWrapper;

class ComposterWrapper$BottomStorage
implements ExtractionOnlyStorage<ItemVariant>,
SingleSlotStorage<ItemVariant> {
    private static final ItemVariant BONE_MEAL = ItemVariant.of((class07310)class06570.vQ);
    final /* synthetic */ ComposterWrapper this$0;

    ComposterWrapper$BottomStorage(ComposterWrapper composterWrapper) {
        this.this$0 = composterWrapper;
    }

    public String toString() {
        return "ComposterWrapper[" + String.valueOf((Object)this.this$0.location) + "/bottom]";
    }

    public long extract(ItemVariant itemVariant, long l, TransactionContext transactionContext) {
        StoragePreconditions.notBlankNotNegative((TransferVariant)itemVariant, (long)l);
        if (l < 1L) {
            return 0L;
        }
        if (!BONE_MEAL.equals((Object)itemVariant)) {
            return 0L;
        }
        if (!this.hasBoneMeal()) {
            return 0L;
        }
        this.this$0.updateSnapshots(transactionContext);
        this.this$0.increaseProbability = Float.valueOf(-1.0f);
        return 1L;
    }

    public ItemVariant getResource() {
        return BONE_MEAL;
    }

    public long getCapacity() {
        return 1L;
    }

    public long getAmount() {
        return this.hasBoneMeal() ? 1L : 0L;
    }

    private boolean hasBoneMeal() {
        return this.this$0.increaseProbability.floatValue() == 0.0f && (Integer)this.this$0.location.getBlockState().L((class08092)class05836.i) == 8;
    }

    public boolean isResourceBlank() {
        return this.getResource().isBlank();
    }
}

