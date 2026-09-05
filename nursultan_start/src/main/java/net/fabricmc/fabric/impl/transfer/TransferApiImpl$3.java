/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.fabricmc.fabric.api.transfer.v1.storage.SlottedStorage
 *  net.fabricmc.fabric.api.transfer.v1.storage.base.SingleSlotStorage
 */
package net.fabricmc.fabric.impl.transfer;

import java.util.AbstractList;
import net.fabricmc.fabric.api.transfer.v1.storage.SlottedStorage;
import net.fabricmc.fabric.api.transfer.v1.storage.base.SingleSlotStorage;

class TransferApiImpl$3
extends AbstractList<SingleSlotStorage<T>> {
    final /* synthetic */ SlottedStorage val$storage;

    TransferApiImpl$3(SlottedStorage slottedStorage) {
        this.val$storage = slottedStorage;
    }

    @Override
    public int size() {
        return this.val$storage.getSlotCount();
    }

    @Override
    public SingleSlotStorage<T> get(int n) {
        return this.val$storage.getSlot(n);
    }
}

