/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.fabricmc.fabric.api.transfer.v1.transaction.Transaction
 *  net.fabricmc.fabric.api.transfer.v1.transaction.Transaction$Lifecycle
 *  net.fabricmc.fabric.api.transfer.v1.transaction.TransactionContext
 *  net.fabricmc.fabric.api.transfer.v1.transaction.TransactionContext$OuterCloseCallback
 *  org.jspecify.annotations.Nullable
 */
package net.fabricmc.fabric.impl.transfer.transaction;

import java.util.ArrayList;
import net.fabricmc.fabric.api.transfer.v1.transaction.Transaction;
import net.fabricmc.fabric.api.transfer.v1.transaction.TransactionContext;
import net.fabricmc.fabric.impl.transfer.transaction.TransactionManagerImpl$TransactionImpl;
import org.jspecify.annotations.Nullable;

public class TransactionManagerImpl {
    public static final ThreadLocal<TransactionManagerImpl> MANAGERS = ThreadLocal.withInitial(TransactionManagerImpl::new);
    final Thread thread = Thread.currentThread();
    final ArrayList<TransactionManagerImpl$TransactionImpl> stack = new ArrayList();
    final ArrayList<TransactionContext.OuterCloseCallback> outerCloseCallbacks = new ArrayList();
    int currentDepth = -1;

    public boolean isOpen() {
        return this.currentDepth > -1;
    }

    Transaction open() {
        ++this.currentDepth;
        if (this.stack.size() == this.currentDepth) {
            this.stack.add(new TransactionManagerImpl$TransactionImpl(this, this.currentDepth));
        }
        TransactionManagerImpl$TransactionImpl transactionManagerImpl$TransactionImpl = this.stack.get(this.currentDepth);
        transactionManagerImpl$TransactionImpl.lifecycle = Transaction.Lifecycle.OPEN;
        return transactionManagerImpl$TransactionImpl;
    }

    void validateCurrentThread() {
        if (Thread.currentThread() != this.thread) {
            String string = String.format("Attempted to access transaction state from thread %s, but this transaction is only valid on thread %s.", Thread.currentThread().getName(), this.thread.getName());
            throw new IllegalStateException(string);
        }
    }

    public Transaction openOuter() {
        if (this.isOpen()) {
            throw new IllegalStateException("An outer transaction is already active on this thread.");
        }
        return this.open();
    }

    public Transaction.Lifecycle getLifecycle() {
        if (this.currentDepth == -1) {
            return Transaction.Lifecycle.NONE;
        }
        return this.stack.get((int)this.currentDepth).lifecycle;
    }

    public @Nullable TransactionContext getCurrentUnsafe() {
        if (this.currentDepth == -1) {
            return null;
        }
        if (this.stack.get((int)this.currentDepth).lifecycle == Transaction.Lifecycle.OPEN) {
            return (TransactionContext)this.stack.get(this.currentDepth);
        }
        throw new IllegalStateException("May not call getCurrentUnsafe() from a close callback.");
    }
}

