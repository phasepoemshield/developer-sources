/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.viaversion.util.Copyable
 */
package com.viaversion.viaversion.api.minecraft.item;

import com.viaversion.viaversion.util.Copyable;

public interface ItemBase
extends Copyable {
    public int amount();

    public void setAmount(int var1);

    default public boolean isEmpty() {
        return this.identifier() == 0 || this.amount() <= 0;
    }

    public ItemBase copy();

    public void setIdentifier(int var1);

    public int identifier();
}

