/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  de.maxhenkel.voicechat.api.VolumeCategory
 *  de.maxhenkel.voicechat.api.events.VolumeCategoryEvent
 */
package de.maxhenkel.voicechat.plugins.impl.events;

import de.maxhenkel.voicechat.api.VolumeCategory;
import de.maxhenkel.voicechat.api.events.VolumeCategoryEvent;
import de.maxhenkel.voicechat.plugins.impl.events.ServerEventImpl;

public class VolumeCategoryEventImpl
extends ServerEventImpl
implements VolumeCategoryEvent {
    private final VolumeCategory category;

    public VolumeCategoryEventImpl(VolumeCategory volumeCategory) {
        this.category = volumeCategory;
    }

    public boolean isCancellable() {
        return false;
    }

    public VolumeCategory getVolumeCategory() {
        return this.category;
    }
}

