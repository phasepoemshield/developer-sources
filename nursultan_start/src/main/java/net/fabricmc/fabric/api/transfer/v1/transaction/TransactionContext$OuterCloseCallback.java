/*
 * Decompiled with CFR 0.152.
 */
package net.fabricmc.fabric.api.transfer.v1.transaction;

import net.fabricmc.fabric.api.transfer.v1.transaction.TransactionContext$Result;

@FunctionalInterface
public interface TransactionContext$OuterCloseCallback {
    public void afterOuterClose(TransactionContext$Result var1);
}

