/*
 * Decompiled with CFR 0.152.
 */
package de.maxhenkel.voicechat.api.audiochannel;

import de.maxhenkel.voicechat.api.Position;
import de.maxhenkel.voicechat.api.audiochannel.ClientAudioChannel;

public interface ClientLocationalAudioChannel
extends ClientAudioChannel {
    public Position getLocation();

    public void setLocation(Position var1);

    public float getDistance();

    public void setDistance(float var1);
}

