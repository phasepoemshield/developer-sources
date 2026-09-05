/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  baritone.api.event.events.TickEvent
 *  baritone.api.event.events.TickEvent$Type
 *  baritone.api.event.listener.AbstractGameEventListener
 */
package baritone.utils;

import baritone.api.event.events.TickEvent;
import baritone.api.event.listener.AbstractGameEventListener;
import baritone.utils.PathingControlManager;

class PathingControlManager$1
implements AbstractGameEventListener {
    final /* synthetic */ PathingControlManager this$0;

    PathingControlManager$1(PathingControlManager pathingControlManager) {
        this.this$0 = pathingControlManager;
    }

    public void onTick(TickEvent tickEvent) {
        if (tickEvent.getType() == TickEvent.Type.IN) {
            this.this$0.postTick();
        }
    }
}

