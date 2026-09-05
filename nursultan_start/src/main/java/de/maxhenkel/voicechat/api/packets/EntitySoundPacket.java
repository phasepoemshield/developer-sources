/*
 * Decompiled with CFR 0.152.
 */
package de.maxhenkel.voicechat.api.packets;

import de.maxhenkel.voicechat.api.packets.SoundPacket;
import java.util.UUID;

public interface EntitySoundPacket
extends SoundPacket {
    public boolean isWhispering();

    public float getDistance();

    public UUID getEntityUuid();
}

