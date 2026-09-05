/*
 * Decompiled with CFR 0.152.
 */
package net.fabricmc.fabric.api.transfer.v1.transaction.base;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import net.fabricmc.fabric.api.transfer.v1.transaction.TransactionContext;
import net.fabricmc.fabric.api.transfer.v1.transaction.TransactionContext$CloseCallback;
import net.fabricmc.fabric.api.transfer.v1.transaction.TransactionContext$OuterCloseCallback;
import net.fabricmc.fabric.api.transfer.v1.transaction.TransactionContext$Result;

public abstract class SnapshotParticipant<T>
implements TransactionContext$CloseCallback,
TransactionContext$OuterCloseCallback {
    private final List<T> snapshots = new ArrayList<T>();

    @Override
    public void onClose(TransactionContext transactionContext, TransactionContext$Result transactionContext$Result) {
        Object e = this.snapshots.set(transactionContext.nestingDepth(), null);
        if (transactionContext$Result.wasAborted()) {
            this.readSnapshot(e);
            this.releaseSnapshot(e);
        } else if (transactionContext.nestingDepth() > 0) {
            if (this.snapshots.get(transactionContext.nestingDepth() - 1) == null) {
                this.snapshots.set(transactionContext.nestingDepth() - 1, e);
                transactionContext.getOpenTransaction(transactionContext.nestingDepth() - 1).addCloseCallback(this);
            } else {
                this.releaseSnapshot(e);
            }
        } else {
            this.releaseSnapshot(e);
            transactionContext.addOuterCloseCallback(this);
        }
    }

    public void updateSnapshots(TransactionContext transactionContext) {
        while (this.snapshots.size() <= transactionContext.nestingDepth()) {
            this.snapshots.add(null);
        }
        if (this.snapshots.get(transactionContext.nestingDepth()) == null) {
            T t = this.createSnapshot();
            Objects.requireNonNull(t, "Snapshot may not be null!");
            this.snapshots.set(transactionContext.nestingDepth(), t);
            transactionContext.addCloseCallback(this);
        }
    }

    protected void onFinalCommit() {
    }

    protected abstract void readSnapshot(T var1);

    protected abstract T createSnapshot();

    protected void releaseSnapshot(T t) {
    }

    @Override
    public void afterOuterClose(TransactionContext$Result transactionContext$Result) {
        this.onFinalCommit();
    }
}

