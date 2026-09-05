/*
 * Decompiled with CFR 0.152.
 */
package de.maxhenkel.voicechat.api.audiochannel;

import de.maxhenkel.voicechat.api.VoicechatConnection;
import de.maxhenkel.voicechat.api.audiochannel.AudioChannel;

public interface StaticAudioChannel
extends AudioChannel {
    public void addTarget(VoicechatConnection var1);

    public void removeTarget(VoicechatConnection var1);

    public void clearTargets();

    public boolean bypassesGroupIsolation();

    public void setBypassGroupIsolation(boolean var1);
}

