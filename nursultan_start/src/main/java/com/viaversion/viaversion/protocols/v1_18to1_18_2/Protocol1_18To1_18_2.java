/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.nbt.tag.CompoundTag
 *  com.viaversion.nbt.tag.ListTag
 *  com.viaversion.nbt.tag.StringTag
 *  com.viaversion.nbt.tag.Tag
 *  com.viaversion.viaversion.api.minecraft.RegistryType
 *  com.viaversion.viaversion.api.protocol.AbstractProtocol
 *  com.viaversion.viaversion.api.protocol.Protocol
 *  com.viaversion.viaversion.api.protocol.packet.ClientboundPacketType
 *  com.viaversion.viaversion.api.protocol.remapper.PacketHandler
 *  com.viaversion.viaversion.api.protocol.remapper.PacketHandlers
 *  com.viaversion.viaversion.api.type.Type
 *  com.viaversion.viaversion.api.type.Types
 *  com.viaversion.viaversion.protocols.v1_16_4to1_17.packet.ServerboundPackets1_17
 *  com.viaversion.viaversion.rewriter.TagRewriter
 *  com.viaversion.viaversion.util.TagUtil
 */
package com.viaversion.viaversion.protocols.v1_18to1_18_2;

import com.viaversion.nbt.tag.CompoundTag;
import com.viaversion.nbt.tag.ListTag;
import com.viaversion.nbt.tag.StringTag;
import com.viaversion.nbt.tag.Tag;
import com.viaversion.viaversion.api.minecraft.RegistryType;
import com.viaversion.viaversion.api.protocol.AbstractProtocol;
import com.viaversion.viaversion.api.protocol.Protocol;
import com.viaversion.viaversion.api.protocol.packet.ClientboundPacketType;
import com.viaversion.viaversion.api.protocol.remapper.PacketHandler;
import com.viaversion.viaversion.api.protocol.remapper.PacketHandlers;
import com.viaversion.viaversion.api.type.Type;
import com.viaversion.viaversion.api.type.Types;
import com.viaversion.viaversion.protocols.v1_16_4to1_17.packet.ServerboundPackets1_17;
import com.viaversion.viaversion.protocols.v1_17_1to1_18.packet.ClientboundPackets1_18;
import com.viaversion.viaversion.rewriter.TagRewriter;
import com.viaversion.viaversion.util.TagUtil;

public final class Protocol1_18To1_18_2
extends AbstractProtocol<ClientboundPackets1_18, ClientboundPackets1_18, ServerboundPackets1_17, ServerboundPackets1_17> {
    public Protocol1_18To1_18_2() {
        super(ClientboundPackets1_18.class, ClientboundPackets1_18.class, ServerboundPackets1_17.class, ServerboundPackets1_17.class);
    }

    protected void registerPackets() {
        TagRewriter tagRewriter = new TagRewriter((Protocol)this);
        tagRewriter.addTagRaw(RegistryType.BLOCK, "minecraft:fall_damage_resetting", new int[]{169, 257, 680, 713, 714, 715, 716, 859, 860, 696, 100});
        tagRewriter.registerGeneric((ClientboundPacketType)ClientboundPackets1_18.UPDATE_TAGS);
        this.registerClientbound(ClientboundPackets1_18.UPDATE_MOB_EFFECT, (PacketHandler)new PacketHandlers(){

            public void register() {
                this.map((Type)Types.VAR_INT);
                this.map((Type)Types.BYTE, (Type)Types.VAR_INT);
            }
        });
        this.registerClientbound(ClientboundPackets1_18.REMOVE_MOB_EFFECT, (PacketHandler)new PacketHandlers(){

            public void register() {
                this.map((Type)Types.VAR_INT);
                this.map((Type)Types.BYTE, (Type)Types.VAR_INT);
            }
        });
        this.registerClientbound(ClientboundPackets1_18.LOGIN, (PacketHandler)new PacketHandlers(){

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
                        Protocol1_18To1_18_2.this.addTagPrefix(dimension.getCompoundTag("element"));
                    }
                    Protocol1_18To1_18_2.this.addTagPrefix((CompoundTag)wrapper.get(Types.NAMED_COMPOUND_TAG, 1));
                });
            }
        });
        this.registerClientbound(ClientboundPackets1_18.RESPAWN, wrapper -> this.addTagPrefix((CompoundTag)wrapper.passthrough(Types.NAMED_COMPOUND_TAG)));
    }

    private void addTagPrefix(CompoundTag tag) {
        Tag infiniburnTag = tag.get("infiniburn");
        if (infiniburnTag instanceof StringTag) {
            StringTag infiniburn = (StringTag)infiniburnTag;
            infiniburn.setValue("#" + infiniburn.getValue());
        }
    }
}

