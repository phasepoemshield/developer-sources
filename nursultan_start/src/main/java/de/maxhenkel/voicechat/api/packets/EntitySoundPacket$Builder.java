/*
 * Decompiled with CFR 0.152.
 */
package de.maxhenkel.voicechat.api.packets;

import de.maxhenkel.voicechat.api.packets.EntitySoundPacket;
import de.maxhenkel.voicechat.api.packets.SoundPacket$Builder;
import java.util.UUID;

public interface EntitySoundPacket$Builder<T extends EntitySoundPacket$Builder<T>>
extends SoundPacket$Builder<T, EntitySoundPacket> {
    public T distance(float var1);

    public T entityUuid(UUID var1);

    public T whispering(boolean var1);
}

