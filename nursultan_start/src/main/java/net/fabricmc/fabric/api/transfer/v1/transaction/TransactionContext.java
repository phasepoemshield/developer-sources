/*
 * Decompiled with CFR 0.152.
 */
package net.fabricmc.fabric.api.transfer.v1.transaction;

import net.fabricmc.fabric.api.transfer.v1.transaction.Transaction;
import net.fabricmc.fabric.api.transfer.v1.transaction.TransactionContext$CloseCallback;
import net.fabricmc.fabric.api.transfer.v1.transaction.TransactionContext$OuterCloseCallback;

public interface TransactionContext {
    public int nestingDepth();

    public void addCloseCallback(TransactionContext$CloseCallback var1);

    public Transaction getOpenTransaction(int var1);

    public void addOuterCloseCallback(TransactionContext$OuterCloseCallback var1);

    public Transaction openNested();
}

