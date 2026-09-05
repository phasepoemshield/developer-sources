/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  de.maxhenkel.voicechat.api.Group
 *  de.maxhenkel.voicechat.api.events.RemoveGroupEvent
 *  de.maxhenkel.voicechat.plugins.impl.events.GroupEventImpl
 */
package de.maxhenkel.voicechat.plugins.impl.events;

import de.maxhenkel.voicechat.api.Group;
import de.maxhenkel.voicechat.api.events.RemoveGroupEvent;
import de.maxhenkel.voicechat.plugins.impl.events.GroupEventImpl;

public class RemoveGroupEventImpl
extends GroupEventImpl
implements RemoveGroupEvent {
    public RemoveGroupEventImpl(Group group) {
        super(group, null);
    }

    public boolean isCancellable() {
        return super.isCancellable() && this.group.isPersistent();
    }
}

