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
 *  com.viaversion.viaversion.api.minecraft.entities.EntityTypes1_15
 *  com.viaversion.viaversion.api.minecraft.item.Item
 *  com.viaversion.viaversion.api.protocol.AbstractProtocol
 *  com.viaversion.viaversion.api.protocol.Protocol
 *  com.viaversion.viaversion.api.protocol.packet.ClientboundPacketType
 *  com.viaversion.viaversion.api.type.Types
 *  com.viaversion.viaversion.data.entity.EntityTrackerBase
 *  com.viaversion.viaversion.rewriter.BlockRewriter
 *  com.viaversion.viaversion.rewriter.ParticleRewriter
 *  com.viaversion.viaversion.rewriter.TagRewriter
 */
package com.viaversion.viaversion.protocols.v1_14_4to1_15;

import com.viaversion.viaversion.api.connection.UserConnection;
import com.viaversion.viaversion.api.data.MappingData;
import com.viaversion.viaversion.api.data.MappingDataBase;
import com.viaversion.viaversion.api.data.entity.EntityTracker;
import com.viaversion.viaversion.api.minecraft.ClientWorld;
import com.viaversion.viaversion.api.minecraft.RegistryType;
import com.viaversion.viaversion.api.minecraft.entities.EntityType;
import com.viaversion.viaversion.api.minecraft.entities.EntityTypes1_15;
import com.viaversion.viaversion.api.minecraft.item.Item;
import com.viaversion.viaversion.api.protocol.AbstractProtocol;
import com.viaversion.viaversion.api.protocol.Protocol;
import com.viaversion.viaversion.api.protocol.packet.ClientboundPacketType;
import com.viaversion.viaversion.api.type.Types;
import com.viaversion.viaversion.data.entity.EntityTrackerBase;
import com.viaversion.viaversion.protocols.v1_13_2to1_14.packet.ServerboundPackets1_14;
import com.viaversion.viaversion.protocols.v1_14_3to1_14_4.packet.ClientboundPackets1_14_4;
import com.viaversion.viaversion.protocols.v1_14_4to1_15.packet.ClientboundPackets1_15;
import com.viaversion.viaversion.protocols.v1_14_4to1_15.rewriter.EntityPacketRewriter1_15;
import com.viaversion.viaversion.protocols.v1_14_4to1_15.rewriter.ItemPacketRewriter1_15;
import com.viaversion.viaversion.protocols.v1_14_4to1_15.rewriter.WorldPacketRewriter1_15;
import com.viaversion.viaversion.rewriter.BlockRewriter;
import com.viaversion.viaversion.rewriter.ParticleRewriter;
import com.viaversion.viaversion.rewriter.TagRewriter;

public class Protocol1_14_4To1_15
extends AbstractProtocol<ClientboundPackets1_14_4, ClientboundPackets1_15, ServerboundPackets1_14, ServerboundPackets1_14> {
    public static final MappingData MAPPINGS = new MappingDataBase("1.14", "1.15");
    private final EntityPacketRewriter1_15 entityRewriter = new EntityPacketRewriter1_15(this);
    private final ItemPacketRewriter1_15 itemRewriter = new ItemPacketRewriter1_15(this);
    private final ParticleRewriter<ClientboundPackets1_14_4> particleRewriter = new ParticleRewriter((Protocol)this);
    private final TagRewriter<ClientboundPackets1_14_4> tagRewriter = new TagRewriter((Protocol)this);
    private final BlockRewriter<ClientboundPackets1_14_4> blockRewriter = BlockRewriter.for1_14((Protocol)this);

    public Protocol1_14_4To1_15() {
        super(ClientboundPackets1_14_4.class, ClientboundPackets1_15.class, ServerboundPackets1_14.class, ServerboundPackets1_14.class);
    }

    public void init(UserConnection connection) {
        this.addEntityTracker(connection, (EntityTracker)new EntityTrackerBase(connection, (EntityType)EntityTypes1_15.PLAYER));
        connection.addClientWorld(((Object)((Object)this)).getClass(), new ClientWorld());
    }

    protected void onMappingDataLoaded() {
        EntityTypes1_15.initialize((Protocol)this);
        this.tagRewriter.removeTag(RegistryType.BLOCK, "minecraft:dirt_like");
        this.tagRewriter.addEmptyTag(RegistryType.ITEM, "minecraft:lectern_books");
        this.tagRewriter.addEmptyTags(RegistryType.BLOCK, new String[]{"minecraft:bee_growables", "minecraft:beehives"});
        this.tagRewriter.addEmptyTag(RegistryType.ENTITY, "minecraft:beehive_inhabitors");
        super.onMappingDataLoaded();
    }

    public ParticleRewriter<ClientboundPackets1_14_4> getParticleRewriter() {
        return this.particleRewriter;
    }

    protected void registerPackets() {
        super.registerPackets();
        WorldPacketRewriter1_15.register(this);
        this.registerServerbound(ServerboundPackets1_14.EDIT_BOOK, wrapper -> this.itemRewriter.handleItemToServer(wrapper.user(), (Item)wrapper.passthrough(Types.ITEM1_13_2)));
        this.tagRewriter.register((ClientboundPacketType)ClientboundPackets1_14_4.UPDATE_TAGS, RegistryType.ENTITY);
    }

    public TagRewriter<ClientboundPackets1_14_4> getTagRewriter() {
        return this.tagRewriter;
    }

    public BlockRewriter<ClientboundPackets1_14_4> getBlockRewriter() {
        return this.blockRewriter;
    }

    public MappingData getMappingData() {
        return MAPPINGS;
    }

    public ItemPacketRewriter1_15 getItemRewriter() {
        return this.itemRewriter;
    }

    public EntityPacketRewriter1_15 getEntityRewriter() {
        return this.entityRewriter;
    }
}

