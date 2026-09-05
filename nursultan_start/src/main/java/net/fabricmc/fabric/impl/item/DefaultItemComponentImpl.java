/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.fabricmc.fabric.api.item.v1.DefaultItemComponentEvents
 *  net.fabricmc.fabric.api.item.v1.DefaultItemComponentEvents$ModifyCallback
 *  net.fabricmc.fabric.api.item.v1.DefaultItemComponentEvents$ModifyContext
 */
package net.fabricmc.fabric.impl.item;

import net.fabricmc.fabric.api.item.v1.DefaultItemComponentEvents;
import net.fabricmc.fabric.impl.item.DefaultItemComponentImpl$ModifyContextImpl;

public class DefaultItemComponentImpl {
    public static void modifyItemComponents() {
        ((DefaultItemComponentEvents.ModifyCallback)DefaultItemComponentEvents.MODIFY.invoker()).modify((DefaultItemComponentEvents.ModifyContext)DefaultItemComponentImpl$ModifyContextImpl.INSTANCE);
    }
}

