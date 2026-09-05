/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.fabricmc.fabric.api.event.Event
 *  net.fabricmc.fabric.api.event.EventFactory
 */
package net.fabricmc.fabric.api.networking.v1;

import net.fabricmc.fabric.api.event.Event;
import net.fabricmc.fabric.api.event.EventFactory;
import net.fabricmc.fabric.api.networking.v1.EntityTrackingEvents$StartTracking;
import net.fabricmc.fabric.api.networking.v1.EntityTrackingEvents$StopTracking;

public final class EntityTrackingEvents {
    public static final Event<EntityTrackingEvents$StartTracking> START_TRACKING = EventFactory.createArrayBacked(EntityTrackingEvents$StartTracking.class, entityTrackingEvents$StartTrackingArray -> (class070492, class047702) -> {
        for (EntityTrackingEvents$StartTracking entityTrackingEvents$StartTracking : entityTrackingEvents$StartTrackingArray) {
            entityTrackingEvents$StartTracking.onStartTracking(class070492, class047702);
        }
    });
    public static final Event<EntityTrackingEvents$StopTracking> STOP_TRACKING = EventFactory.createArrayBacked(EntityTrackingEvents$StopTracking.class, entityTrackingEvents$StopTrackingArray -> (class070492, class047702) -> {
        for (EntityTrackingEvents$StopTracking entityTrackingEvents$StopTracking : entityTrackingEvents$StopTrackingArray) {
            entityTrackingEvents$StopTracking.onStopTracking(class070492, class047702);
        }
    });

    private EntityTrackingEvents() {
    }
}

