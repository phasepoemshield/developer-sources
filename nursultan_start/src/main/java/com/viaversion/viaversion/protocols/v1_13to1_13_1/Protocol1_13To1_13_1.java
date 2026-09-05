/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.viaversion.api.connection.UserConnection
 *  com.viaversion.viaversion.api.data.MappingData
 *  com.viaversion.viaversion.api.data.MappingDataBase
 *  com.viaversion.viaversion.api.data.entity.EntityTracker
 *  com.viaversion.viaversion.api.minecraft.ClientWorld
 *  com.viaversion.viaversion.api.minecraft.RegistryType
 *  com.viaversion.viaversion.api.minecraft.entities.EntityType
 *  com.viaversion.viaversion.api.minecraft.entities.EntityTypes1_13$EntityType
 *  com.viaversion.viaversion.api.minecraft.item.Item
 *  com.viaversion.viaversion.api.protocol.AbstractProtocol
 *  com.viaversion.viaversion.api.protocol.Protocol
 *  com.viaversion.viaversion.api.protocol.packet.ClientboundPacketType
 *  com.viaversion.viaversion.api.protocol.packet.PacketWrapper
 *  com.viaversion.viaversion.api.protocol.packet.ServerboundPacketType
 *  com.viaversion.viaversion.api.protocol.remapper.PacketHandler
 *  com.viaversion.viaversion.api.protocol.remapper.PacketHandlers
 *  com.viaversion.viaversion.api.protocol.remapper.ValueTransformer
 *  com.viaversion.viaversion.api.type.Type
 *  com.viaversion.viaversion.api.type.Types
 *  com.viaversion.viaversion.data.entity.EntityTrackerBase
 *  com.viaversion.viaversion.protocols.v1_12_2to1_13.packet.ClientboundPackets1_13
 *  com.viaversion.viaversion.protocols.v1_12_2to1_13.packet.ServerboundPackets1_13
 *  com.viaversion.viaversion.rewriter.BlockRewriter
 *  com.viaversion.viaversion.rewriter.ParticleRewriter
 *  com.viaversion.viaversion.rewriter.TagRewriter
 */
package com.viaversion.viaversion.protocols.v1_13to1_13_1;

import com.viaversion.viaversion.api.connection.UserConnection;
import com.viaversion.viaversion.api.data.MappingData;
import com.viaversion.viaversion.api.data.MappingDataBase;
import com.viaversion.viaversion.api.data.entity.EntityTracker;
import com.viaversion.viaversion.api.minecraft.ClientWorld;
import com.viaversion.viaversion.api.minecraft.RegistryType;
import com.viaversion.viaversion.api.minecraft.entities.EntityType;
import com.viaversion.viaversion.api.minecraft.entities.EntityTypes1_13;
import com.viaversion.viaversion.api.minecraft.item.Item;
import com.viaversion.viaversion.api.protocol.AbstractProtocol;
import com.viaversion.viaversion.api.protocol.Protocol;
import com.viaversion.viaversion.api.protocol.packet.ClientboundPacketType;
import com.viaversion.viaversion.api.protocol.packet.PacketWrapper;
import com.viaversion.viaversion.api.protocol.packet.ServerboundPacketType;
import com.viaversion.viaversion.api.protocol.remapper.PacketHandler;
import com.viaversion.viaversion.api.protocol.remapper.PacketHandlers;
import com.viaversion.viaversion.api.protocol.remapper.ValueTransformer;
import com.viaversion.viaversion.api.type.Type;
import com.viaversion.viaversion.api.type.Types;
import com.viaversion.viaversion.data.entity.EntityTrackerBase;
import com.viaversion.viaversion.protocols.v1_12_2to1_13.packet.ClientboundPackets1_13;
import com.viaversion.viaversion.protocols.v1_12_2to1_13.packet.ServerboundPackets1_13;
import com.viaversion.viaversion.protocols.v1_13to1_13_1.rewriter.EntityPacketRewriter1_13_1;
import com.viaversion.viaversion.protocols.v1_13to1_13_1.rewriter.ItemPacketRewriter1_13_1;
import com.viaversion.viaversion.protocols.v1_13to1_13_1.rewriter.WorldPacketRewriter1_13_1;
import com.viaversion.viaversion.rewriter.BlockRewriter;
import com.viaversion.viaversion.rewriter.ParticleRewriter;
import com.viaversion.viaversion.rewriter.TagRewriter;

public class Protocol1_13To1_13_1
extends AbstractProtocol<ClientboundPackets1_13, ClientboundPackets1_13, ServerboundPackets1_13, ServerboundPackets1_13> {
    public static final MappingData MAPPINGS = new MappingDataBase("1.13", "1.13.2");
    private final EntityPacketRewriter1_13_1 entityRewriter = new EntityPacketRewriter1_13_1(this);
    private final ItemPacketRewriter1_13_1 itemRewriter = new ItemPacketRewriter1_13_1(this);
    private final ParticleRewriter<ClientboundPackets1_13> particleRewriter = new ParticleRewriter((Protocol)this);
    private final TagRewriter<ClientboundPackets1_13> tagRewriter = new TagRewriter((Protocol)this);
    private final BlockRewriter<ClientboundPackets1_13> blockRewriter = BlockRewriter.legacy((Protocol)this);

    public Protocol1_13To1_13_1() {
        super(ClientboundPackets1_13.class, ClientboundPackets1_13.class, ServerboundPackets1_13.class, ServerboundPackets1_13.class);
    }

    public void init(UserConnection userConnection) {
        userConnection.addEntityTracker(((Object)((Object)this)).getClass(), (EntityTracker)new EntityTrackerBase(userConnection, (EntityType)EntityTypes1_13.EntityType.PLAYER));
        userConnection.addClientWorld(((Object)((Object)this)).getClass(), new ClientWorld());
    }

    public ParticleRewriter<ClientboundPackets1_13> getParticleRewriter() {
        return this.particleRewriter;
    }

    protected void registerPackets() {
        super.registerPackets();
        WorldPacketRewriter1_13_1.register(this);
        this.registerServerbound((ServerboundPacketType)ServerboundPackets1_13.COMMAND_SUGGESTION, (PacketHandler)new PacketHandlers(){

            public void register() {
                this.map((Type)Types.VAR_INT);
                this.map(Types.STRING, (ValueTransformer)new ValueTransformer<String, String>(Types.STRING){

                    public String transform(PacketWrapper wrapper, String inputValue) {
                        return inputValue.startsWith("/") ? inputValue.substring(1) : inputValue;
                    }
                });
            }
        });
        this.registerServerbound((ServerboundPacketType)ServerboundPackets1_13.EDIT_BOOK, (PacketHandler)new PacketHandlers(){

            public void register() {
                this.map(Types.ITEM1_13);
                this.map((Type)Types.BOOLEAN);
                this.handler(wrapper -> {
                    Item item = (Item)wrapper.get(Types.ITEM1_13, 0);
                    Protocol1_13To1_13_1.this.itemRewriter.handleItemToServer(wrapper.user(), item);
                });
                this.handler(wrapper -> {
                    int hand = (Integer)wrapper.read((Type)Types.VAR_INT);
                    if (hand == 1) {
                        wrapper.cancel();
                    }
                });
            }
        });
        this.registerClientbound((ClientboundPacketType)ClientboundPackets1_13.COMMAND_SUGGESTIONS, (PacketHandler)new PacketHandlers(){

            public void register() {
                this.map((Type)Types.VAR_INT);
                this.map((Type)Types.VAR_INT);
                this.map((Type)Types.VAR_INT);
                this.map((Type)Types.VAR_INT);
                this.handler(wrapper -> {
                    int start = (Integer)wrapper.get((Type)Types.VAR_INT, 1);
                    wrapper.set((Type)Types.VAR_INT, 1, (Object)(start + 1));
                    int count = (Integer)wrapper.get((Type)Types.VAR_INT, 3);
                    for (int i = 0; i < count; ++i) {
                        wrapper.passthrough(Types.STRING);
                        wrapper.passthrough(Types.OPTIONAL_COMPONENT);
                    }
                });
            }
        });
        this.registerClientbound((ClientboundPacketType)ClientboundPackets1_13.BOSS_EVENT, (PacketHandler)new PacketHandlers(){

            public void register() {
                this.map(Types.UUID);
                this.map((Type)Types.VAR_INT);
                this.handler(wrapper -> {
                    int action = (Integer)wrapper.get((Type)Types.VAR_INT, 0);
                    if (action == 0) {
                        wrapper.passthrough(Types.COMPONENT);
                        wrapper.passthrough((Type)Types.FLOAT);
                        wrapper.passthrough((Type)Types.VAR_INT);
                        wrapper.passthrough((Type)Types.VAR_INT);
                        short flags = ((Byte)wrapper.read((Type)Types.BYTE)).byteValue();
                        if ((flags & 2) != 0) {
                            flags = (short)(flags | 4);
                        }
                        wrapper.write((Type)Types.UNSIGNED_BYTE, (Object)flags);
                    }
                });
            }
        });
        this.tagRewriter.register((ClientboundPacketType)ClientboundPackets1_13.UPDATE_TAGS, RegistryType.ITEM);
    }

    public TagRewriter<ClientboundPackets1_13> getTagRewriter() {
        return this.tagRewriter;
    }

    public BlockRewriter<ClientboundPackets1_13> getBlockRewriter() {
        return this.blockRewriter;
    }

    public MappingData getMappingData() {
        return MAPPINGS;
    }

    public ItemPacketRewriter1_13_1 getItemRewriter() {
        return this.itemRewriter;
    }

    public EntityPacketRewriter1_13_1 getEntityRewriter() {
        return this.entityRewriter;
    }
}

