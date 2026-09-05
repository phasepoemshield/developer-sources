/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.fabricmc.fabric.impl.transfer.transaction.TransactionManagerImpl
 *  org.jspecify.annotations.Nullable
 */
package net.fabricmc.fabric.api.transfer.v1.transaction;

import net.fabricmc.fabric.api.transfer.v1.transaction.Transaction$Lifecycle;
import net.fabricmc.fabric.api.transfer.v1.transaction.TransactionContext;
import net.fabricmc.fabric.impl.transfer.transaction.TransactionManagerImpl;
import org.jspecify.annotations.Nullable;

public interface Transaction
extends AutoCloseable,
TransactionContext {
    public static boolean isOpen() {
        return Transaction.getLifecycle() != Transaction$Lifecycle.NONE;
    }

    public void commit();

    @Override
    public void close();

    public void abort();

    public static Transaction openOuter() {
        return ((TransactionManagerImpl)TransactionManagerImpl.MANAGERS.get()).openOuter();
    }

    public static Transaction openNested(@Nullable TransactionContext transactionContext) {
        return transactionContext == null ? Transaction.openOuter() : transactionContext.openNested();
    }

    public static Transaction$Lifecycle getLifecycle() {
        return ((TransactionManagerImpl)TransactionManagerImpl.MANAGERS.get()).getLifecycle();
    }

    @Deprecated
    public static @Nullable TransactionContext getCurrentUnsafe() {
        return ((TransactionManagerImpl)TransactionManagerImpl.MANAGERS.get()).getCurrentUnsafe();
    }
}

