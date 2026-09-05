/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  de.maxhenkel.voicechat.api.Position
 */
package de.maxhenkel.voicechat.api.packets;

import de.maxhenkel.voicechat.api.Position;
import de.maxhenkel.voicechat.api.packets.SoundPacket;

public interface LocationalSoundPacket
extends SoundPacket {
    public Position getPosition();

    public float getDistance();
}

