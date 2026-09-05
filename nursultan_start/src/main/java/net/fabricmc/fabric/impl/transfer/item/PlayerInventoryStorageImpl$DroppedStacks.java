/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.fabricmc.fabric.api.transfer.v1.item.ItemVariant
 *  net.fabricmc.fabric.api.transfer.v1.transaction.TransactionContext
 *  net.fabricmc.fabric.api.transfer.v1.transaction.base.SnapshotParticipant
 */
package net.fabricmc.fabric.impl.transfer.item;

import java.util.ArrayList;
import java.util.List;
import net.fabricmc.fabric.api.transfer.v1.item.ItemVariant;
import net.fabricmc.fabric.api.transfer.v1.transaction.TransactionContext;
import net.fabricmc.fabric.api.transfer.v1.transaction.base.SnapshotParticipant;
import net.fabricmc.fabric.impl.transfer.item.PlayerInventoryStorageImpl;
import net.fabricmc.fabric.impl.transfer.item.PlayerInventoryStorageImpl$DroppedStacks$Entry;

class PlayerInventoryStorageImpl$DroppedStacks
extends SnapshotParticipant<Integer> {
    final List<PlayerInventoryStorageImpl$DroppedStacks$Entry> entries = new ArrayList<PlayerInventoryStorageImpl$DroppedStacks$Entry>();
    final /* synthetic */ PlayerInventoryStorageImpl this$0;

    PlayerInventoryStorageImpl$DroppedStacks(PlayerInventoryStorageImpl playerInventoryStorageImpl) {
        this.this$0 = playerInventoryStorageImpl;
    }

    void addDrop(ItemVariant itemVariant, long l, boolean bl, boolean bl2, TransactionContext transactionContext) {
        this.updateSnapshots(transactionContext);
        this.entries.add(new PlayerInventoryStorageImpl$DroppedStacks$Entry(itemVariant, l, bl, bl2));
    }

    public void onFinalCommit() {
        for (PlayerInventoryStorageImpl$DroppedStacks$Entry playerInventoryStorageImpl$DroppedStacks$Entry : this.entries) {
            int n;
            for (long i = playerInventoryStorageImpl$DroppedStacks$Entry.amount; i > 0L; i -= (long)n) {
                n = (int)Math.min((long)playerInventoryStorageImpl$DroppedStacks$Entry.key.getItem().M(), i);
                this.this$0.playerInventory.z.method_7329(playerInventoryStorageImpl$DroppedStacks$Entry.key.toStack(n), playerInventoryStorageImpl$DroppedStacks$Entry.throwRandomly, playerInventoryStorageImpl$DroppedStacks$Entry.retainOwnership);
            }
        }
        this.entries.clear();
    }

    protected void readSnapshot(Integer n) {
        int n2 = n;
        while (this.entries.size() > n2) {
            this.entries.remove(this.entries.size() - 1);
        }
    }

    protected Integer createSnapshot() {
        return this.entries.size();
    }
}

