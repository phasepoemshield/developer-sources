/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.viabackwards.protocol.v1_14to1_13_2.Protocol1_14To1_13_2
 *  com.viaversion.viaversion.api.data.entity.StoredEntityData
 *  com.viaversion.viaversion.api.protocol.Protocol
 *  com.viaversion.viaversion.api.protocol.packet.ClientboundPacketType
 *  com.viaversion.viaversion.api.protocol.packet.PacketType
 *  com.viaversion.viaversion.api.protocol.packet.PacketWrapper
 *  com.viaversion.viaversion.api.rewriter.RewriterBase
 *  com.viaversion.viaversion.api.type.Type
 *  com.viaversion.viaversion.api.type.Types
 *  com.viaversion.viaversion.protocols.v1_12_2to1_13.packet.ClientboundPackets1_13
 *  com.viaversion.viaversion.protocols.v1_13_2to1_14.packet.ClientboundPackets1_14
 */
package com.viaversion.viabackwards.protocol.v1_14to1_13_2.rewriter;

import com.viaversion.viabackwards.protocol.v1_14to1_13_2.Protocol1_14To1_13_2;
import com.viaversion.viabackwards.protocol.v1_14to1_13_2.storage.EntityPositionStorage1_14;
import com.viaversion.viaversion.api.data.entity.StoredEntityData;
import com.viaversion.viaversion.api.protocol.Protocol;
import com.viaversion.viaversion.api.protocol.packet.ClientboundPacketType;
import com.viaversion.viaversion.api.protocol.packet.PacketType;
import com.viaversion.viaversion.api.protocol.packet.PacketWrapper;
import com.viaversion.viaversion.api.rewriter.RewriterBase;
import com.viaversion.viaversion.api.type.Type;
import com.viaversion.viaversion.api.type.Types;
import com.viaversion.viaversion.protocols.v1_12_2to1_13.packet.ClientboundPackets1_13;
import com.viaversion.viaversion.protocols.v1_13_2to1_14.packet.ClientboundPackets1_14;

public class SoundPacketRewriter1_14
extends RewriterBase<Protocol1_14To1_13_2> {
    public SoundPacketRewriter1_14(Protocol1_14To1_13_2 protocol) {
        super((Protocol)protocol);
    }

    protected void registerPackets() {
        ((Protocol1_14To1_13_2)this.protocol).registerClientbound((ClientboundPacketType)ClientboundPackets1_14.SOUND_ENTITY, null, wrapper -> {
            EntityPositionStorage1_14 entityStorage;
            wrapper.cancel();
            int soundId = (Integer)wrapper.read((Type)Types.VAR_INT);
            int newId = ((Protocol1_14To1_13_2)this.protocol).getMappingData().getSoundMappings().getNewId(soundId);
            if (newId == -1) {
                return;
            }
            int category = (Integer)wrapper.read((Type)Types.VAR_INT);
            int entityId = (Integer)wrapper.read((Type)Types.VAR_INT);
            StoredEntityData storedEntity = wrapper.user().getEntityTracker(((Protocol1_14To1_13_2)this.protocol).getClass()).entityData(entityId);
            if (storedEntity == null || (entityStorage = (EntityPositionStorage1_14)((Object)((Object)storedEntity.get(EntityPositionStorage1_14.class)))) == null) {
                ((Protocol1_14To1_13_2)this.protocol).getLogger().warning("Untracked entity with id " + entityId);
                return;
            }
            float volume = ((Float)wrapper.read((Type)Types.FLOAT)).floatValue();
            float pitch = ((Float)wrapper.read((Type)Types.FLOAT)).floatValue();
            int x = (int)(entityStorage.x() * 8.0);
            int y = (int)(entityStorage.y() * 8.0);
            int z = (int)(entityStorage.z() * 8.0);
            PacketWrapper soundPacket = wrapper.create((PacketType)ClientboundPackets1_13.SOUND);
            soundPacket.write((Type)Types.VAR_INT, (Object)newId);
            soundPacket.write((Type)Types.VAR_INT, (Object)category);
            soundPacket.write((Type)Types.INT, (Object)x);
            soundPacket.write((Type)Types.INT, (Object)y);
            soundPacket.write((Type)Types.INT, (Object)z);
            soundPacket.write((Type)Types.FLOAT, (Object)Float.valueOf(volume));
            soundPacket.write((Type)Types.FLOAT, (Object)Float.valueOf(pitch));
            soundPacket.send(Protocol1_14To1_13_2.class);
        });
    }
}

