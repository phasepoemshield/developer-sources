/*
 * Decompiled with CFR 0.152.
 */
package de.maxhenkel.voicechat.api.audiochannel;

import de.maxhenkel.voicechat.api.Position;
import de.maxhenkel.voicechat.api.audiochannel.AudioChannel;

public interface LocationalAudioChannel
extends AudioChannel {
    public Position getLocation();

    public float getDistance();

    public void setDistance(float var1);

    public void updateLocation(Position var1);
}

