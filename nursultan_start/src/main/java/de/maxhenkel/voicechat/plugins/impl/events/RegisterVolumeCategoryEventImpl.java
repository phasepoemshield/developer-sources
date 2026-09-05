/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  de.maxhenkel.voicechat.api.VolumeCategory
 *  de.maxhenkel.voicechat.api.events.RegisterVolumeCategoryEvent
 */
package de.maxhenkel.voicechat.plugins.impl.events;

import de.maxhenkel.voicechat.api.VolumeCategory;
import de.maxhenkel.voicechat.api.events.RegisterVolumeCategoryEvent;
import de.maxhenkel.voicechat.plugins.impl.events.VolumeCategoryEventImpl;

public class RegisterVolumeCategoryEventImpl
extends VolumeCategoryEventImpl
implements RegisterVolumeCategoryEvent {
    public RegisterVolumeCategoryEventImpl(VolumeCategory volumeCategory) {
        super(volumeCategory);
    }
}

