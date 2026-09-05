/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class06584
 *  net.fabricmc.fabric.api.transfer.v1.transaction.TransactionContext
 */
package net.fabricmc.fabric.impl.transfer.item;

import minecraft.class06584;
import net.fabricmc.fabric.api.transfer.v1.transaction.TransactionContext;

public interface SpecialLogicInventory {
    public void fabric_onFinalCommit(int var1, class06584 var2, class06584 var3);

    default public void fabric_onTransfer(int n, TransactionContext transactionContext) {
    }

    public void fabric_setSuppress(boolean var1);
}

