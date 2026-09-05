/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  de.maxhenkel.voicechat.api.packets.EntitySoundPacket
 *  de.maxhenkel.voicechat.api.packets.EntitySoundPacket$Builder
 *  javax.annotation.Nullable
 */
package de.maxhenkel.voicechat.plugins.impl.packets;

import de.maxhenkel.voicechat.api.packets.EntitySoundPacket;
import de.maxhenkel.voicechat.plugins.impl.packets.EntitySoundPacketImpl;
import de.maxhenkel.voicechat.plugins.impl.packets.LocationalSoundPacketImpl;
import de.maxhenkel.voicechat.plugins.impl.packets.SoundPacketImpl;
import de.maxhenkel.voicechat.plugins.impl.packets.SoundPacketImpl$BuilderImpl;
import de.maxhenkel.voicechat.voice.common.PlayerSoundPacket;
import de.maxhenkel.voicechat.voice.common.Utils;
import java.util.UUID;
import javax.annotation.Nullable;

public class EntitySoundPacketImpl$BuilderImpl
extends SoundPacketImpl$BuilderImpl<EntitySoundPacketImpl$BuilderImpl, EntitySoundPacket>
implements EntitySoundPacket.Builder<EntitySoundPacketImpl$BuilderImpl> {
    protected UUID entityUuid;
    protected boolean whispering;
    protected float distance;

    public EntitySoundPacketImpl$BuilderImpl(SoundPacketImpl soundPacketImpl) {
        super(soundPacketImpl);
        if (soundPacketImpl instanceof EntitySoundPacketImpl) {
            EntitySoundPacketImpl entitySoundPacketImpl = (EntitySoundPacketImpl)soundPacketImpl;
            this.entityUuid = entitySoundPacketImpl.getEntityUuid();
            this.whispering = entitySoundPacketImpl.isWhispering();
            this.distance = entitySoundPacketImpl.getDistance();
        } else if (soundPacketImpl instanceof LocationalSoundPacketImpl) {
            LocationalSoundPacketImpl locationalSoundPacketImpl = (LocationalSoundPacketImpl)soundPacketImpl;
            this.distance = locationalSoundPacketImpl.getDistance();
        } else {
            this.distance = Utils.getDefaultDistanceServer();
        }
    }

    public EntitySoundPacketImpl$BuilderImpl(UUID uUID, UUID uUID2, byte[] byArray, long l, @Nullable String string) {
        super(uUID, uUID2, byArray, l, string);
        this.distance = Utils.getDefaultDistanceServer();
    }

    public EntitySoundPacketImpl$BuilderImpl distance(float f) {
        this.distance = f;
        return this;
    }

    public EntitySoundPacket build() {
        if (this.entityUuid == null) {
            throw new IllegalStateException("entityUuid missing");
        }
        return new EntitySoundPacketImpl(new PlayerSoundPacket(this.channelId, this.sender, this.opusEncodedData, this.sequenceNumber, this.whispering, this.distance, this.category));
    }

    public EntitySoundPacketImpl$BuilderImpl entityUuid(UUID uUID) {
        this.entityUuid = uUID;
        return this;
    }

    public EntitySoundPacketImpl$BuilderImpl whispering(boolean bl) {
        this.whispering = bl;
        return this;
    }
}

