/*
 * Decompiled with CFR 0.152.
 */
package de.maxhenkel.voicechat.api.audiochannel;

import de.maxhenkel.voicechat.api.Entity;
import de.maxhenkel.voicechat.api.audiochannel.AudioChannel;

public interface EntityAudioChannel
extends AudioChannel {
    public boolean isWhispering();

    public Entity getEntity();

    public float getDistance();

    public void updateEntity(Entity var1);

    public void setDistance(float var1);

    public void setWhispering(boolean var1);
}

