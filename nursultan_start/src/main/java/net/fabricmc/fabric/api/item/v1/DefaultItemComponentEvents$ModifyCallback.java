/*
 * Decompiled with CFR 0.152.
 */
package net.fabricmc.fabric.api.item.v1;

import net.fabricmc.fabric.api.item.v1.DefaultItemComponentEvents$ModifyContext;

@FunctionalInterface
public interface DefaultItemComponentEvents$ModifyCallback {
    public void modify(DefaultItemComponentEvents.ModifyContext var1);
}

