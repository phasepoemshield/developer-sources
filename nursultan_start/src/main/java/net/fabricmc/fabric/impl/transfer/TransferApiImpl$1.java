/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.fabricmc.fabric.api.transfer.v1.storage.Storage
 *  net.fabricmc.fabric.api.transfer.v1.storage.StorageView
 *  net.fabricmc.fabric.api.transfer.v1.transaction.TransactionContext
 */
package net.fabricmc.fabric.impl.transfer;

import java.util.Collections;
import java.util.Iterator;
import net.fabricmc.fabric.api.transfer.v1.storage.Storage;
import net.fabricmc.fabric.api.transfer.v1.storage.StorageView;
import net.fabricmc.fabric.api.transfer.v1.transaction.TransactionContext;

class TransferApiImpl$1
implements Storage {
    TransferApiImpl$1() {
    }

    public String toString() {
        return "EmptyStorage";
    }

    public long extract(Object object, long l, TransactionContext transactionContext) {
        return 0L;
    }

    public long insert(Object object, long l, TransactionContext transactionContext) {
        return 0L;
    }

    public Iterator<StorageView> iterator() {
        return Collections.emptyIterator();
    }

    public long getVersion() {
        return 0L;
    }

    public boolean supportsExtraction() {
        return false;
    }

    public boolean supportsInsertion() {
        return false;
    }
}

