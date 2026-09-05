/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.fabricmc.fabric.api.transfer.v1.storage.base.SingleSlotStorage
 *  net.fabricmc.fabric.impl.transfer.TransferApiImpl
 */
package net.fabricmc.fabric.api.transfer.v1.storage;

import java.util.List;
import net.fabricmc.fabric.api.transfer.v1.storage.Storage;
import net.fabricmc.fabric.api.transfer.v1.storage.base.SingleSlotStorage;
import net.fabricmc.fabric.impl.transfer.TransferApiImpl;

public interface SlottedStorage<T>
extends Storage<T> {
    public SingleSlotStorage<T> getSlot(int var1);

    default public List<SingleSlotStorage<T>> getSlots() {
        return TransferApiImpl.makeListView((SlottedStorage)this);
    }

    public int getSlotCount();
}

