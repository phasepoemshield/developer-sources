/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.fabricmc.fabric.api.transfer.v1.transaction.Transaction
 *  net.fabricmc.fabric.api.transfer.v1.transaction.Transaction$Lifecycle
 *  net.fabricmc.fabric.api.transfer.v1.transaction.TransactionContext
 *  net.fabricmc.fabric.api.transfer.v1.transaction.TransactionContext$CloseCallback
 *  net.fabricmc.fabric.api.transfer.v1.transaction.TransactionContext$OuterCloseCallback
 *  net.fabricmc.fabric.api.transfer.v1.transaction.TransactionContext$Result
 */
package net.fabricmc.fabric.impl.transfer.transaction;

import java.util.ArrayList;
import net.fabricmc.fabric.api.transfer.v1.transaction.Transaction;
import net.fabricmc.fabric.api.transfer.v1.transaction.TransactionContext;
import net.fabricmc.fabric.impl.transfer.transaction.TransactionManagerImpl;

class TransactionManagerImpl$TransactionImpl
implements Transaction {
    final int nestingDepth;
    final ArrayList<TransactionContext.CloseCallback> closeCallbacks = new ArrayList();
    Transaction.Lifecycle lifecycle = Transaction.Lifecycle.NONE;
    final /* synthetic */ TransactionManagerImpl this$0;

    TransactionManagerImpl$TransactionImpl(TransactionManagerImpl transactionManagerImpl, int n) {
        this.this$0 = transactionManagerImpl;
        this.nestingDepth = n;
    }

    public String toString() {
        return "Transaction[depth=%d, lifecycle=%s, thread=%s]".formatted(new Object[]{this.nestingDepth, this.lifecycle.name(), this.this$0.thread.getName()});
    }

    public void commit() {
        this.close(TransactionContext.Result.COMMITTED);
    }

    public void close() {
        if (this.this$0.isOpen() && this.lifecycle == Transaction.Lifecycle.OPEN) {
            this.abort();
        }
    }

    private void close(TransactionContext.Result result) {
        int n;
        this.validateCurrentTransaction();
        this.validateOpen();
        this.lifecycle = Transaction.Lifecycle.CLOSING;
        Throwable throwable = null;
        for (n = this.closeCallbacks.size() - 1; n >= 0; --n) {
            try {
                this.closeCallbacks.get(n).onClose((TransactionContext)this, result);
                continue;
            }
            catch (Exception exception) {
                if (throwable == null) {
                    throwable = new RuntimeException("Encountered an exception while invoking a transaction close callback.", exception);
                    continue;
                }
                throwable.addSuppressed(exception);
            }
        }
        this.closeCallbacks.clear();
        if (this.this$0.currentDepth == 0) {
            this.lifecycle = Transaction.Lifecycle.OUTER_CLOSING;
            for (n = this.this$0.outerCloseCallbacks.size() - 1; n >= 0; --n) {
                try {
                    this.this$0.outerCloseCallbacks.get(n).afterOuterClose(result);
                    continue;
                }
                catch (Exception exception) {
                    if (throwable == null) {
                        throwable = new RuntimeException("Encountered an exception while invoking a transaction outer close callback.", exception);
                        continue;
                    }
                    throwable.addSuppressed(exception);
                }
            }
            this.this$0.outerCloseCallbacks.clear();
        }
        --this.this$0.currentDepth;
        this.lifecycle = Transaction.Lifecycle.NONE;
        if (throwable != null) {
            throw throwable;
        }
    }

    public int nestingDepth() {
        this.this$0.validateCurrentThread();
        return this.nestingDepth;
    }

    public void abort() {
        this.close(TransactionContext.Result.ABORTED);
    }

    void validateCurrentTransaction() {
        this.this$0.validateCurrentThread();
        if (this.this$0.currentDepth == -1 || this.this$0.stack.get(this.this$0.currentDepth) != this) {
            String string = String.format("Transaction function was called on a transaction with depth %d, but the current transaction has depth %d.", this.nestingDepth, this.this$0.currentDepth);
            throw new IllegalStateException(string);
        }
    }

    public void addCloseCallback(TransactionContext.CloseCallback closeCallback) {
        this.this$0.validateCurrentThread();
        this.validateOpen();
        this.closeCallbacks.add(closeCallback);
    }

    public Transaction getOpenTransaction(int n) {
        this.this$0.validateCurrentThread();
        if (n < 0) {
            throw new IndexOutOfBoundsException("Nesting depth may not be negative.");
        }
        if (n > this.this$0.currentDepth) {
            throw new IndexOutOfBoundsException("There is no open transaction for nesting depth " + n);
        }
        TransactionManagerImpl$TransactionImpl transactionManagerImpl$TransactionImpl = this.this$0.stack.get(n);
        transactionManagerImpl$TransactionImpl.validateOpen();
        return transactionManagerImpl$TransactionImpl;
    }

    public void addOuterCloseCallback(TransactionContext.OuterCloseCallback outerCloseCallback) {
        this.this$0.validateCurrentThread();
        if (this.this$0.currentDepth == -1) {
            throw new IllegalStateException("There is no open transaction on this thread.");
        }
        this.this$0.outerCloseCallbacks.add(outerCloseCallback);
    }

    public Transaction openNested() {
        this.validateCurrentTransaction();
        this.validateOpen();
        return this.this$0.open();
    }

    private void validateOpen() {
        if (this.lifecycle != Transaction.Lifecycle.OPEN) {
            throw new IllegalStateException("Transaction operation cannot be applied to a closed transaction.");
        }
    }
}

