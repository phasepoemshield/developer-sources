/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  de.maxhenkel.voicechat.api.Position
 */
package de.maxhenkel.voicechat.api.packets;

import de.maxhenkel.voicechat.api.Position;
import de.maxhenkel.voicechat.api.packets.EntitySoundPacket;
import de.maxhenkel.voicechat.api.packets.EntitySoundPacket$Builder;
import de.maxhenkel.voicechat.api.packets.LocationalSoundPacket;
import de.maxhenkel.voicechat.api.packets.LocationalSoundPacket$Builder;
import de.maxhenkel.voicechat.api.packets.StaticSoundPacket;
import de.maxhenkel.voicechat.api.packets.StaticSoundPacket$Builder;
import java.util.UUID;

public interface ConvertablePacket {
    public LocationalSoundPacket.Builder<?> locationalSoundPacketBuilder();

    @Deprecated
    public LocationalSoundPacket toLocationalSoundPacket(Position var1);

    @Deprecated
    public StaticSoundPacket toStaticSoundPacket();

    public StaticSoundPacket.Builder<?> staticSoundPacketBuilder();

    public EntitySoundPacket.Builder<?> entitySoundPacketBuilder();

    @Deprecated
    public EntitySoundPacket toEntitySoundPacket(UUID var1, boolean var2);
}

