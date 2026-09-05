/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.fabricmc.api.ModInitializer
 *  net.fabricmc.fabric.api.event.lifecycle.v1.ServerLifecycleEvents
 */
package net.fabricmc.fabric.impl.lookup;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.event.lifecycle.v1.ServerLifecycleEvents;
import net.fabricmc.fabric.impl.lookup.entity.EntityApiLookupImpl;

public class ApiLookupImpl
implements ModInitializer {
    public void onInitialize() {
        ServerLifecycleEvents.SERVER_STARTED.register(EntityApiLookupImpl::checkSelfImplementingTypes);
    }
}

