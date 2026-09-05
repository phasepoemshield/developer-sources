/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.viaversion.api.minecraft.entities.EntityType
 *  com.viaversion.viaversion.api.minecraft.entities.EntityTypes1_19_3
 *  com.viaversion.viaversion.api.protocol.Protocol
 *  com.viaversion.viaversion.api.protocol.packet.PacketType
 *  com.viaversion.viaversion.api.protocol.packet.PacketWrapper
 *  com.viaversion.viaversion.api.protocol.remapper.PacketHandler
 *  com.viaversion.viaversion.api.protocol.remapper.PacketHandlers
 *  com.viaversion.viaversion.api.protocol.version.ProtocolVersion
 *  com.viaversion.viaversion.api.type.Type
 *  com.viaversion.viaversion.api.type.Types
 *  com.viaversion.viaversion.api.type.types.version.Types1_19
 *  com.viaversion.viaversion.api.type.types.version.Types1_19_3
 *  com.viaversion.viaversion.libs.gson.JsonElement
 *  com.viaversion.viaversion.rewriter.EntityRewriter
 */
package com.viaversion.viaversion.protocols.v1_19_1to1_19_3.rewriter;

import com.viaversion.viaversion.api.minecraft.entities.EntityType;
import com.viaversion.viaversion.api.minecraft.entities.EntityTypes1_19_3;
import com.viaversion.viaversion.api.protocol.Protocol;
import com.viaversion.viaversion.api.protocol.packet.PacketType;
import com.viaversion.viaversion.api.protocol.packet.PacketWrapper;
import com.viaversion.viaversion.api.protocol.remapper.PacketHandler;
import com.viaversion.viaversion.api.protocol.remapper.PacketHandlers;
import com.viaversion.viaversion.api.protocol.version.ProtocolVersion;
import com.viaversion.viaversion.api.type.Type;
import com.viaversion.viaversion.api.type.Types;
import com.viaversion.viaversion.api.type.types.version.Types1_19;
import com.viaversion.viaversion.api.type.types.version.Types1_19_3;
import com.viaversion.viaversion.libs.gson.JsonElement;
import com.viaversion.viaversion.protocols.v1_19_1to1_19_3.Protocol1_19_1To1_19_3;
import com.viaversion.viaversion.protocols.v1_19_1to1_19_3.packet.ClientboundPackets1_19_3;
import com.viaversion.viaversion.protocols.v1_19to1_19_1.packet.ClientboundPackets1_19_1;
import com.viaversion.viaversion.rewriter.EntityRewriter;
import java.util.BitSet;
import java.util.UUID;

public final class EntityPacketRewriter1_19_3
extends EntityRewriter<ClientboundPackets1_19_1, Protocol1_19_1To1_19_3> {
    public EntityPacketRewriter1_19_3(Protocol1_19_1To1_19_3 protocol) {
        super((Protocol)protocol);
    }

    protected void registerRewrites() {
        this.filter().mapDataType(typeId -> Types1_19_3.ENTITY_DATA_TYPES.byId(typeId >= 2 ? typeId + 1 : typeId));
        this.registerEntityDataTypeHandler(Types1_19_3.ENTITY_DATA_TYPES.itemType, Types1_19_3.ENTITY_DATA_TYPES.optionalBlockStateType, Types1_19_3.ENTITY_DATA_TYPES.particleType);
        this.registerBlockStateHandler((EntityType)EntityTypes1_19_3.ABSTRACT_MINECART, 11);
        this.filter().type((EntityType)EntityTypes1_19_3.ENTITY).index(6).handler((event, data) -> {
            int pose = (Integer)data.value();
            if (pose >= 10) {
                data.setValue((Object)(pose + 1));
            }
        });
    }

    public void registerPackets() {
        this.registerTracker(ClientboundPackets1_19_1.ADD_EXPERIENCE_ORB, (EntityType)EntityTypes1_19_3.EXPERIENCE_ORB);
        this.registerTracker(ClientboundPackets1_19_1.ADD_PLAYER, (EntityType)EntityTypes1_19_3.PLAYER);
        this.registerSetEntityData(ClientboundPackets1_19_1.SET_ENTITY_DATA, Types1_19.ENTITY_DATA_LIST, Types1_19_3.ENTITY_DATA_LIST);
        ((Protocol1_19_1To1_19_3)this.protocol).registerClientbound(ClientboundPackets1_19_1.LOGIN, (PacketHandler)new PacketHandlers(){

            public void register() {
                this.map((Type)Types.INT);
                this.map((Type)Types.BOOLEAN);
                this.map((Type)Types.BYTE);
                this.map((Type)Types.BYTE);
                this.map(Types.STRING_ARRAY);
                this.map(Types.NAMED_COMPOUND_TAG);
                this.map(Types.STRING);
                this.map(Types.STRING);
                this.handler(EntityPacketRewriter1_19_3.this.dimensionDataHandler());
                this.handler(EntityPacketRewriter1_19_3.this.biomeSizeTracker());
                this.handler(EntityPacketRewriter1_19_3.this.worldDataTrackerHandlerByKey());
                this.handler(EntityPacketRewriter1_19_3.this.playerTrackerHandler());
                this.handler(wrapper -> {
                    PacketWrapper enableFeaturesPacket = wrapper.create((PacketType)ClientboundPackets1_19_3.UPDATE_ENABLED_FEATURES);
                    enableFeaturesPacket.write(Types.STRING_ARRAY, (Object)new String[]{"minecraft:vanilla"});
                    if (wrapper.user().getProtocolInfo().protocolVersion().newerThanOrEqualTo(ProtocolVersion.v1_20_2)) {
                        enableFeaturesPacket.send(Protocol1_19_1To1_19_3.class);
                    } else {
                        enableFeaturesPacket.scheduleSend(Protocol1_19_1To1_19_3.class);
                    }
                });
            }
        });
        ((Protocol1_19_1To1_19_3)this.protocol).registerClientbound(ClientboundPackets1_19_1.RESPAWN, (PacketHandler)new PacketHandlers(){

            public void register() {
                this.map(Types.STRING);
                this.map(Types.STRING);
                this.map((Type)Types.LONG);
                this.map((Type)Types.UNSIGNED_BYTE);
                this.map((Type)Types.BYTE);
                this.map((Type)Types.BOOLEAN);
                this.map((Type)Types.BOOLEAN);
                this.handler(EntityPacketRewriter1_19_3.this.worldDataTrackerHandlerByKey());
                this.handler(wrapper -> {
                    boolean keepAttributes = (Boolean)wrapper.read((Type)Types.BOOLEAN);
                    byte keepDataMask = 2;
                    if (keepAttributes) {
                        keepDataMask = (byte)(keepDataMask | 1);
                    }
                    wrapper.write((Type)Types.BYTE, (Object)keepDataMask);
                });
            }
        });
        ((Protocol1_19_1To1_19_3)this.protocol).registerClientbound(ClientboundPackets1_19_1.PLAYER_INFO, ClientboundPackets1_19_3.PLAYER_INFO_UPDATE, wrapper -> {
            int action = (Integer)wrapper.read((Type)Types.VAR_INT);
            if (action == 4) {
                int entries = (Integer)wrapper.read((Type)Types.VAR_INT);
                UUID[] uuidsToRemove = new UUID[entries];
                for (int i = 0; i < entries; ++i) {
                    uuidsToRemove[i] = (UUID)wrapper.read(Types.UUID);
                }
                wrapper.write(Types.UUID_ARRAY, (Object)uuidsToRemove);
                wrapper.setPacketType((PacketType)ClientboundPackets1_19_3.PLAYER_INFO_REMOVE);
                return;
            }
            BitSet set = new BitSet(6);
            if (action == 0) {
                set.set(0, 6);
            } else {
                set.set(action == 1 ? action + 1 : action + 2);
            }
            wrapper.write((Type)Types.PROFILE_ACTIONS_ENUM1_19_3, (Object)set);
            int entries = (Integer)wrapper.passthrough((Type)Types.VAR_INT);
            for (int i = 0; i < entries; ++i) {
                JsonElement displayName;
                wrapper.passthrough(Types.UUID);
                if (action == 0) {
                    wrapper.passthrough(Types.STRING);
                    wrapper.passthrough(Types.PROFILE_PROPERTY_ARRAY);
                    int gamemode = (Integer)wrapper.read((Type)Types.VAR_INT);
                    int ping = (Integer)wrapper.read((Type)Types.VAR_INT);
                    JsonElement displayName2 = (JsonElement)wrapper.read(Types.OPTIONAL_COMPONENT);
                    if (displayName2 != null) {
                        ((Protocol1_19_1To1_19_3)this.protocol).getComponentRewriter().processText(wrapper.user(), displayName2);
                    }
                    wrapper.read(Types.OPTIONAL_PROFILE_KEY);
                    wrapper.write((Type)Types.BOOLEAN, (Object)false);
                    wrapper.write((Type)Types.VAR_INT, (Object)gamemode);
                    wrapper.write((Type)Types.BOOLEAN, (Object)true);
                    wrapper.write((Type)Types.VAR_INT, (Object)ping);
                    wrapper.write(Types.OPTIONAL_COMPONENT, (Object)displayName2);
                    continue;
                }
                if (action == 1 || action == 2) {
                    wrapper.passthrough((Type)Types.VAR_INT);
                    continue;
                }
                if (action != 3 || (displayName = (JsonElement)wrapper.passthrough(Types.OPTIONAL_COMPONENT)) == null) continue;
                ((Protocol1_19_1To1_19_3)this.protocol).getComponentRewriter().processText(wrapper.user(), displayName);
            }
        });
    }

    public EntityType typeFromId(int type) {
        return EntityTypes1_19_3.getTypeFromId((int)type);
    }
}

