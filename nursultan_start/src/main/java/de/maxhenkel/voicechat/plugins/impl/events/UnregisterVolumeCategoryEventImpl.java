/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  de.maxhenkel.voicechat.api.VolumeCategory
 *  de.maxhenkel.voicechat.api.events.UnregisterVolumeCategoryEvent
 */
package de.maxhenkel.voicechat.plugins.impl.events;

import de.maxhenkel.voicechat.api.VolumeCategory;
import de.maxhenkel.voicechat.api.events.UnregisterVolumeCategoryEvent;
import de.maxhenkel.voicechat.plugins.impl.events.VolumeCategoryEventImpl;

public class UnregisterVolumeCategoryEventImpl
extends VolumeCategoryEventImpl
implements UnregisterVolumeCategoryEvent {
    public UnregisterVolumeCategoryEventImpl(VolumeCategory volumeCategory) {
        super(volumeCategory);
    }
}

