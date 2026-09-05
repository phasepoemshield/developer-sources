/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.fabricmc.fabric.api.transfer.v1.transaction.base.SnapshotParticipant
 */
package net.fabricmc.fabric.impl.transfer.item;

import net.fabricmc.fabric.api.transfer.v1.transaction.base.SnapshotParticipant;
import net.fabricmc.fabric.impl.transfer.item.InventoryStorageImpl;

class InventoryStorageImpl$MarkDirtyParticipant
extends SnapshotParticipant<Boolean> {
    final /* synthetic */ InventoryStorageImpl this$0;

    InventoryStorageImpl$MarkDirtyParticipant(InventoryStorageImpl inventoryStorageImpl) {
        this.this$0 = inventoryStorageImpl;
    }

    public void onFinalCommit() {
        this.this$0.inventory.method_5431();
    }

    protected void readSnapshot(Boolean bl) {
    }

    protected Boolean createSnapshot() {
        return Boolean.TRUE;
    }
}

