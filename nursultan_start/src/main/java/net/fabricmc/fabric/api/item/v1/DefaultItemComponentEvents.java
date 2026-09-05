/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.fabricmc.fabric.api.event.Event
 *  net.fabricmc.fabric.api.event.EventFactory
 */
package net.fabricmc.fabric.api.item.v1;

import net.fabricmc.fabric.api.event.Event;
import net.fabricmc.fabric.api.event.EventFactory;
import net.fabricmc.fabric.api.item.v1.DefaultItemComponentEvents$ModifyCallback;

public final class DefaultItemComponentEvents {
    public static final Event<DefaultItemComponentEvents$ModifyCallback> MODIFY = EventFactory.createArrayBacked(DefaultItemComponentEvents$ModifyCallback.class, defaultItemComponentEvents$ModifyCallbackArray -> defaultItemComponentEvents$ModifyContext -> {
        for (DefaultItemComponentEvents$ModifyCallback defaultItemComponentEvents$ModifyCallback : defaultItemComponentEvents$ModifyCallbackArray) {
            defaultItemComponentEvents$ModifyCallback.modify(defaultItemComponentEvents$ModifyContext);
        }
    });

    private DefaultItemComponentEvents() {
    }
}

