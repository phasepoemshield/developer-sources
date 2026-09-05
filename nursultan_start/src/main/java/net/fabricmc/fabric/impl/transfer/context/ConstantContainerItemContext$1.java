/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.fabricmc.fabric.api.transfer.v1.item.ItemVariant
 *  net.fabricmc.fabric.api.transfer.v1.storage.StoragePreconditions
 *  net.fabricmc.fabric.api.transfer.v1.storage.TransferVariant
 *  net.fabricmc.fabric.api.transfer.v1.storage.base.SingleVariantStorage
 *  net.fabricmc.fabric.api.transfer.v1.transaction.TransactionContext
 */
package net.fabricmc.fabric.impl.transfer.context;

import net.fabricmc.fabric.api.transfer.v1.item.ItemVariant;
import net.fabricmc.fabric.api.transfer.v1.storage.StoragePreconditions;
import net.fabricmc.fabric.api.transfer.v1.storage.TransferVariant;
import net.fabricmc.fabric.api.transfer.v1.storage.base.SingleVariantStorage;
import net.fabricmc.fabric.api.transfer.v1.transaction.TransactionContext;
import net.fabricmc.fabric.impl.transfer.context.ConstantContainerItemContext;

class ConstantContainerItemContext$1
extends SingleVariantStorage<ItemVariant> {
    ConstantContainerItemContext$1(ConstantContainerItemContext constantContainerItemContext) {
    }

    public long extract(ItemVariant itemVariant, long l, TransactionContext transactionContext) {
        StoragePreconditions.notBlankNotNegative((TransferVariant)itemVariant, (long)l);
        return l;
    }

    public long insert(ItemVariant itemVariant, long l, TransactionContext transactionContext) {
        StoragePreconditions.notBlankNotNegative((TransferVariant)itemVariant, (long)l);
        return 0L;
    }

    protected long getCapacity(ItemVariant itemVariant) {
        return Long.MAX_VALUE;
    }

    protected ItemVariant getBlankVariant() {
        return ItemVariant.blank();
    }
}

