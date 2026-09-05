/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  de.maxhenkel.voicechat.api.Position
 */
package de.maxhenkel.voicechat.api.packets;

import de.maxhenkel.voicechat.api.Position;
import de.maxhenkel.voicechat.api.packets.LocationalSoundPacket;
import de.maxhenkel.voicechat.api.packets.SoundPacket$Builder;

public interface LocationalSoundPacket$Builder<T extends LocationalSoundPacket$Builder<T>>
extends SoundPacket$Builder<T, LocationalSoundPacket> {
    public T position(Position var1);

    public T distance(float var1);
}

