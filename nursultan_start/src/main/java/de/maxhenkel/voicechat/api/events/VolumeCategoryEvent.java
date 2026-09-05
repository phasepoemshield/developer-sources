/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  de.maxhenkel.voicechat.api.VolumeCategory
 */
package de.maxhenkel.voicechat.api.events;

import de.maxhenkel.voicechat.api.VolumeCategory;
import de.maxhenkel.voicechat.api.events.ServerEvent;

public interface VolumeCategoryEvent
extends ServerEvent {
    public VolumeCategory getVolumeCategory();
}

