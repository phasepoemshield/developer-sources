/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.nbt.tag.CompoundTag
 *  com.viaversion.nbt.tag.Tag
 *  com.viaversion.viaversion.api.connection.UserConnection
 *  com.viaversion.viaversion.api.minecraft.RegistryEntry
 *  com.viaversion.viaversion.api.minecraft.entities.EntityType
 *  com.viaversion.viaversion.api.minecraft.entities.EntityTypes1_21_6
 *  com.viaversion.viaversion.api.minecraft.entitydata.types.EntityDataTypes1_21_5
 *  com.viaversion.viaversion.api.protocol.Protocol
 *  com.viaversion.viaversion.api.protocol.packet.PacketType
 *  com.viaversion.viaversion.api.protocol.packet.PacketWrapper
 *  com.viaversion.viaversion.api.type.Type
 *  com.viaversion.viaversion.api.type.Types
 *  com.viaversion.viaversion.api.type.types.version.VersionedTypes
 *  com.viaversion.viaversion.protocols.v1_21_5to1_21_6.storage.SneakStorage
 *  com.viaversion.viaversion.rewriter.EntityRewriter
 */
package com.viaversion.viaversion.protocols.v1_21_5to1_21_6.rewriter;

import com.viaversion.nbt.tag.CompoundTag;
import com.viaversion.nbt.tag.Tag;
import com.viaversion.viaversion.api.connection.UserConnection;
import com.viaversion.viaversion.api.minecraft.RegistryEntry;
import com.viaversion.viaversion.api.minecraft.entities.EntityType;
import com.viaversion.viaversion.api.minecraft.entities.EntityTypes1_21_6;
import com.viaversion.viaversion.api.minecraft.entitydata.types.EntityDataTypes1_21_5;
import com.viaversion.viaversion.api.protocol.Protocol;
import com.viaversion.viaversion.api.protocol.packet.PacketType;
import com.viaversion.viaversion.api.protocol.packet.PacketWrapper;
import com.viaversion.viaversion.api.type.Type;
import com.viaversion.viaversion.api.type.Types;
import com.viaversion.viaversion.api.type.types.version.VersionedTypes;
import com.viaversion.viaversion.protocols.v1_20_5to1_21.packet.ClientboundConfigurationPackets1_21;
import com.viaversion.viaversion.protocols.v1_21_4to1_21_5.packet.ClientboundPacket1_21_5;
import com.viaversion.viaversion.protocols.v1_21_4to1_21_5.packet.ClientboundPackets1_21_5;
import com.viaversion.viaversion.protocols.v1_21_4to1_21_5.packet.ServerboundPackets1_21_5;
import com.viaversion.viaversion.protocols.v1_21_5to1_21_6.Protocol1_21_5To1_21_6;
import com.viaversion.viaversion.protocols.v1_21_5to1_21_6.packet.ServerboundPackets1_21_6;
import com.viaversion.viaversion.protocols.v1_21_5to1_21_6.storage.SneakStorage;
import com.viaversion.viaversion.rewriter.EntityRewriter;

public final class EntityPacketRewriter1_21_6
extends EntityRewriter<ClientboundPacket1_21_5, Protocol1_21_5To1_21_6> {
    public EntityPacketRewriter1_21_6(Protocol1_21_5To1_21_6 protocol) {
        super((Protocol)protocol);
    }

    protected void registerRewrites() {
        EntityDataTypes1_21_5 entityDataTypes = (EntityDataTypes1_21_5)VersionedTypes.V1_21_6.entityDataTypes;
        this.dataTypeMapper().register();
        this.registerEntityDataTypeHandler(entityDataTypes.itemType, entityDataTypes.blockStateType, entityDataTypes.optionalBlockStateType, entityDataTypes.particleType, entityDataTypes.particlesType, entityDataTypes.componentType, entityDataTypes.optionalComponentType);
        this.filter().type((EntityType)EntityTypes1_21_6.HANGING_ENTITY).addIndex(8);
    }

    public void registerPackets() {
        ((Protocol1_21_5To1_21_6)this.protocol).appendClientbound(ClientboundConfigurationPackets1_21.FINISH_CONFIGURATION, wrapper -> {
            PacketWrapper dialogsPacket = PacketWrapper.create((PacketType)ClientboundConfigurationPackets1_21.REGISTRY_DATA, (UserConnection)wrapper.user());
            dialogsPacket.write(Types.STRING, (Object)"minecraft:dialog");
            dialogsPacket.write(Types.REGISTRY_ENTRY_ARRAY, (Object)new RegistryEntry[]{this.serverLinksDialog()});
            dialogsPacket.send(Protocol1_21_5To1_21_6.class);
        });
        ((Protocol1_21_5To1_21_6)this.protocol).appendClientbound(ClientboundPackets1_21_5.RESPAWN, wrapper -> ((SneakStorage)wrapper.user().get(SneakStorage.class)).setSneaking(false));
        ((Protocol1_21_5To1_21_6)this.protocol).registerServerbound(ServerboundPackets1_21_6.PLAYER_COMMAND, wrapper -> {
            wrapper.passthrough((Type)Types.VAR_INT);
            int action = (Integer)wrapper.read((Type)Types.VAR_INT);
            wrapper.write((Type)Types.VAR_INT, (Object)(action + 2));
        });
        ((Protocol1_21_5To1_21_6)this.protocol).registerServerbound(ServerboundPackets1_21_6.PLAYER_INPUT, wrapper -> {
            boolean pressingShift;
            byte flags = (Byte)wrapper.passthrough((Type)Types.BYTE);
            boolean bl = pressingShift = (flags & 0x20) != 0;
            if (((SneakStorage)wrapper.user().get(SneakStorage.class)).setSneaking(pressingShift)) {
                PacketWrapper playerCommandPacket = wrapper.create((PacketType)ServerboundPackets1_21_5.PLAYER_COMMAND);
                playerCommandPacket.write((Type)Types.VAR_INT, (Object)this.tracker(wrapper.user()).clientEntityId());
                playerCommandPacket.write((Type)Types.VAR_INT, (Object)(pressingShift ? 0 : 1));
                playerCommandPacket.write((Type)Types.VAR_INT, (Object)0);
                playerCommandPacket.sendToServer(Protocol1_21_5To1_21_6.class);
            }
        });
    }

    public EntityType typeFromId(int type) {
        return EntityTypes1_21_6.getTypeFromId((int)type);
    }

    private RegistryEntry serverLinksDialog() {
        CompoundTag serverLinksDialog = new CompoundTag();
        serverLinksDialog.putString("type", "minecraft:server_links");
        CompoundTag title = new CompoundTag();
        title.putString("translate", "menu.server_links.title");
        serverLinksDialog.put("title", (Tag)title);
        CompoundTag externalTitle = new CompoundTag();
        externalTitle.putString("translate", "menu.server_links");
        serverLinksDialog.put("external_title", (Tag)externalTitle);
        CompoundTag exitAction = new CompoundTag();
        exitAction.putInt("width", 200);
        CompoundTag exitActionLabel = new CompoundTag();
        exitActionLabel.putString("translate", "gui.back");
        exitAction.put("label", (Tag)exitActionLabel);
        serverLinksDialog.put("exit_action", (Tag)exitAction);
        serverLinksDialog.putInt("columns", 1);
        serverLinksDialog.putInt("button_width", 310);
        return new RegistryEntry("server_links", (Tag)serverLinksDialog);
    }
}

