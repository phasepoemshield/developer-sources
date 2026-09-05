/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.nbt.tag.CompoundTag
 *  com.viaversion.nbt.tag.ListTag
 *  com.viaversion.nbt.tag.StringTag
 *  com.viaversion.viabackwards.api.BackwardsProtocol
 *  com.viaversion.viaversion.api.Via
 *  com.viaversion.viaversion.api.protocol.packet.ClientboundPacketType
 *  com.viaversion.viaversion.api.protocol.remapper.PacketHandler
 *  com.viaversion.viaversion.api.protocol.remapper.PacketHandlers
 *  com.viaversion.viaversion.api.type.Type
 *  com.viaversion.viaversion.api.type.Types
 *  com.viaversion.viaversion.protocols.v1_16_4to1_17.packet.ServerboundPackets1_17
 *  com.viaversion.viaversion.protocols.v1_17_1to1_18.packet.ClientboundPackets1_18
 *  com.viaversion.viaversion.util.TagUtil
 */
package com.viaversion.viabackwards.protocol.v1_18_2to1_18;

import com.viaversion.nbt.tag.CompoundTag;
import com.viaversion.nbt.tag.ListTag;
import com.viaversion.nbt.tag.StringTag;
import com.viaversion.viabackwards.api.BackwardsProtocol;
import com.viaversion.viabackwards.protocol.v1_18_2to1_18.rewriter.CommandRewriter1_18_2;
import com.viaversion.viaversion.api.Via;
import com.viaversion.viaversion.api.protocol.packet.ClientboundPacketType;
import com.viaversion.viaversion.api.protocol.remapper.PacketHandler;
import com.viaversion.viaversion.api.protocol.remapper.PacketHandlers;
import com.viaversion.viaversion.api.type.Type;
import com.viaversion.viaversion.api.type.Types;
import com.viaversion.viaversion.protocols.v1_16_4to1_17.packet.ServerboundPackets1_17;
import com.viaversion.viaversion.protocols.v1_17_1to1_18.packet.ClientboundPackets1_18;
import com.viaversion.viaversion.util.TagUtil;

public final class Protocol1_18_2To1_18
extends BackwardsProtocol<ClientboundPackets1_18, ClientboundPackets1_18, ServerboundPackets1_17, ServerboundPackets1_17> {
    public Protocol1_18_2To1_18() {
        super(ClientboundPackets1_18.class, ClientboundPackets1_18.class, ServerboundPackets1_17.class, ServerboundPackets1_17.class);
    }

    protected void registerPackets() {
        new CommandRewriter1_18_2(this).registerDeclareCommands((ClientboundPacketType)ClientboundPackets1_18.COMMANDS);
        final PacketHandler entityEffectIdHandler = wrapper -> {
            int id = (Integer)wrapper.read((Type)Types.VAR_INT);
            if ((byte)id != id) {
                if (Via.getConfig().logOtherConversionWarnings()) {
                    this.getLogger().warning("Cannot send entity effect id " + id + " to old client");
                }
                wrapper.cancel();
                return;
            }
            wrapper.write((Type)Types.BYTE, (Object)((byte)id));
        };
        this.registerClientbound((ClientboundPacketType)ClientboundPackets1_18.UPDATE_MOB_EFFECT, (PacketHandler)new PacketHandlers(){

            public void register() {
                this.map((Type)Types.VAR_INT);
                this.handler(entityEffectIdHandler);
            }
        });
        this.registerClientbound((ClientboundPacketType)ClientboundPackets1_18.REMOVE_MOB_EFFECT, (PacketHandler)new PacketHandlers(){

            public void register() {
                this.map((Type)Types.VAR_INT);
                this.handler(entityEffectIdHandler);
            }
        });
        this.registerClientbound((ClientboundPacketType)ClientboundPackets1_18.LOGIN, (PacketHandler)new PacketHandlers(){

            public void register() {
                this.map((Type)Types.INT);
                this.map((Type)Types.BOOLEAN);
                this.map((Type)Types.BYTE);
                this.map((Type)Types.BYTE);
                this.map(Types.STRING_ARRAY);
                this.map(Types.NAMED_COMPOUND_TAG);
                this.map(Types.NAMED_COMPOUND_TAG);
                this.handler(wrapper -> {
                    CompoundTag registry = (CompoundTag)wrapper.get(Types.NAMED_COMPOUND_TAG, 0);
                    ListTag dimensions = TagUtil.getRegistryEntries((CompoundTag)registry, (String)"dimension_type");
                    for (CompoundTag dimension : dimensions) {
                        Protocol1_18_2To1_18.this.removeTagPrefix(dimension.getCompoundTag("element"));
                    }
                    Protocol1_18_2To1_18.this.removeTagPrefix((CompoundTag)wrapper.get(Types.NAMED_COMPOUND_TAG, 1));
                });
            }
        });
        this.registerClientbound((ClientboundPacketType)ClientboundPackets1_18.RESPAWN, wrapper -> this.removeTagPrefix((CompoundTag)wrapper.passthrough(Types.NAMED_COMPOUND_TAG)));
    }

    private void removeTagPrefix(CompoundTag tag) {
        StringTag infiniburnTag = tag.getStringTag("infiniburn");
        if (infiniburnTag != null) {
            infiniburnTag.setValue(infiniburnTag.getValue().substring(1));
        }
    }
}

