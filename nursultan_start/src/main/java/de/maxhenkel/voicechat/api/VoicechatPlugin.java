/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  de.maxhenkel.voicechat.api.events.EventRegistration
 */
package de.maxhenkel.voicechat.api;

import de.maxhenkel.voicechat.api.VoicechatApi;
import de.maxhenkel.voicechat.api.events.EventRegistration;

public interface VoicechatPlugin {
    default public void initialize(VoicechatApi voicechatApi) {
    }

    default public void registerEvents(EventRegistration eventRegistration) {
    }

    public String getPluginId();
}

