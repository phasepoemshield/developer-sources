/*
 * Decompiled with CFR 0.152.
 */
package de.maxhenkel.voicechat.api.audiochannel;

import de.maxhenkel.voicechat.api.audiochannel.ClientAudioChannel;
import java.util.UUID;

public interface ClientEntityAudioChannel
extends ClientAudioChannel {
    public boolean isWhispering();

    public float getDistance();

    public UUID getEntityId();

    public void setDistance(float var1);

    public void setWhispering(boolean var1);
}

