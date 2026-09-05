/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.fabricmc.fabric.api.transfer.v1.storage.Storage
 */
package net.fabricmc.fabric.api.transfer.v1.storage.base;

import net.fabricmc.fabric.api.transfer.v1.storage.Storage;
import net.fabricmc.fabric.api.transfer.v1.transaction.TransactionContext;

public interface ExtractionOnlyStorage<T>
extends Storage<T> {
    default public long insert(T t, long l, TransactionContext transactionContext) {
        return 0L;
    }

    default public boolean supportsInsertion() {
        return false;
    }
}

