/*
 * Decompiled with CFR 0.152.
 */
package net.fabricmc.fabric.api.transfer.v1.transaction;

public enum TransactionContext$Result {
    ABORTED,
    COMMITTED;


    public boolean wasAborted() {
        return this == ABORTED;
    }

    public boolean wasCommitted() {
        return this == COMMITTED;
    }
}

