/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.fabricmc.fabric.api.transfer.v1.storage.Storage
 */
package net.fabricmc.fabric.api.transfer.v1.storage.base;

import net.fabricmc.fabric.api.transfer.v1.storage.Storage;
import net.fabricmc.fabric.api.transfer.v1.storage.base.FilteringStorage;

class FilteringStorage$1
extends FilteringStorage<T> {
    final /* synthetic */ boolean val$allowInsert;
    final /* synthetic */ boolean val$allowExtract;

    FilteringStorage$1(Storage storage, boolean bl, boolean bl2) {
        this.val$allowInsert = bl;
        this.val$allowExtract = bl2;
        super(storage);
    }

    @Override
    protected boolean canInsert(T t) {
        return this.val$allowInsert;
    }

    @Override
    protected boolean canExtract(T t) {
        return this.val$allowExtract;
    }

    @Override
    public boolean supportsExtraction() {
        return this.val$allowExtract && super.supportsExtraction();
    }

    @Override
    public boolean supportsInsertion() {
        return this.val$allowInsert && super.supportsInsertion();
    }
}

