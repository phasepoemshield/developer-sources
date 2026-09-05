/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.viaversion.api.connection.UserConnection
 *  com.viaversion.viaversion.api.data.entity.EntityTracker
 *  com.viaversion.viaversion.api.minecraft.RegistryType
 *  com.viaversion.viaversion.api.minecraft.entities.EntityType
 *  com.viaversion.viaversion.api.minecraft.entities.EntityTypes1_16_2
 *  com.viaversion.viaversion.api.protocol.AbstractProtocol
 *  com.viaversion.viaversion.api.protocol.Protocol
 *  com.viaversion.viaversion.api.protocol.packet.ClientboundPacketType
 *  com.viaversion.viaversion.api.type.Type
 *  com.viaversion.viaversion.api.type.Types
 *  com.viaversion.viaversion.data.entity.EntityTrackerBase
 *  com.viaversion.viaversion.rewriter.BlockRewriter
 *  com.viaversion.viaversion.rewriter.ParticleRewriter
 *  com.viaversion.viaversion.rewriter.TagRewriter
 */
package com.viaversion.viaversion.protocols.v1_16_1to1_16_2;

import com.viaversion.viaversion.api.connection.UserConnection;
import com.viaversion.viaversion.api.data.entity.EntityTracker;
import com.viaversion.viaversion.api.minecraft.RegistryType;
import com.viaversion.viaversion.api.minecraft.entities.EntityType;
import com.viaversion.viaversion.api.minecraft.entities.EntityTypes1_16_2;
import com.viaversion.viaversion.api.protocol.AbstractProtocol;
import com.viaversion.viaversion.api.protocol.Protocol;
import com.viaversion.viaversion.api.protocol.packet.ClientboundPacketType;
import com.viaversion.viaversion.api.type.Type;
import com.viaversion.viaversion.api.type.Types;
import com.viaversion.viaversion.data.entity.EntityTrackerBase;
import com.viaversion.viaversion.protocols.v1_15_2to1_16.packet.ClientboundPackets1_16;
import com.viaversion.viaversion.protocols.v1_15_2to1_16.packet.ServerboundPackets1_16;
import com.viaversion.viaversion.protocols.v1_16_1to1_16_2.data.MappingData1_16_2;
import com.viaversion.viaversion.protocols.v1_16_1to1_16_2.packet.ClientboundPackets1_16_2;
import com.viaversion.viaversion.protocols.v1_16_1to1_16_2.packet.ServerboundPackets1_16_2;
import com.viaversion.viaversion.protocols.v1_16_1to1_16_2.rewriter.EntityPacketRewriter1_16_2;
import com.viaversion.viaversion.protocols.v1_16_1to1_16_2.rewriter.ItemPacketRewriter1_16_2;
import com.viaversion.viaversion.protocols.v1_16_1to1_16_2.rewriter.WorldPacketRewriter1_16_2;
import com.viaversion.viaversion.rewriter.BlockRewriter;
import com.viaversion.viaversion.rewriter.ParticleRewriter;
import com.viaversion.viaversion.rewriter.TagRewriter;

public class Protocol1_16_1To1_16_2
extends AbstractProtocol<ClientboundPackets1_16, ClientboundPackets1_16_2, ServerboundPackets1_16, ServerboundPackets1_16_2> {
    public static final MappingData1_16_2 MAPPINGS = new MappingData1_16_2();
    private final EntityPacketRewriter1_16_2 entityRewriter = new EntityPacketRewriter1_16_2(this);
    private final ItemPacketRewriter1_16_2 itemRewriter = new ItemPacketRewriter1_16_2(this);
    private final ParticleRewriter<ClientboundPackets1_16> particleRewriter = new ParticleRewriter((Protocol)this);
    private final TagRewriter<ClientboundPackets1_16> tagRewriter = new TagRewriter((Protocol)this);
    private final BlockRewriter<ClientboundPackets1_16> blockRewriter = BlockRewriter.for1_14((Protocol)this);

    public Protocol1_16_1To1_16_2() {
        super(ClientboundPackets1_16.class, ClientboundPackets1_16_2.class, ServerboundPackets1_16.class, ServerboundPackets1_16_2.class);
    }

    public void init(UserConnection userConnection) {
        userConnection.addEntityTracker(((Object)((Object)this)).getClass(), (EntityTracker)new EntityTrackerBase(userConnection, (EntityType)EntityTypes1_16_2.PLAYER));
    }

    protected void onMappingDataLoaded() {
        EntityTypes1_16_2.initialize((Protocol)this);
        this.tagRewriter.removeTag(RegistryType.ITEM, "minecraft:furnace_materials");
        super.onMappingDataLoaded();
    }

    public ParticleRewriter<ClientboundPackets1_16> getParticleRewriter() {
        return this.particleRewriter;
    }

    protected void registerPackets() {
        super.registerPackets();
        WorldPacketRewriter1_16_2.register(this);
        this.tagRewriter.register((ClientboundPacketType)ClientboundPackets1_16.UPDATE_TAGS, RegistryType.ENTITY);
        this.registerServerbound(ServerboundPackets1_16_2.RECIPE_BOOK_CHANGE_SETTINGS, ServerboundPackets1_16.RECIPE_BOOK_UPDATE, wrapper -> {
            int recipeType = (Integer)wrapper.read((Type)Types.VAR_INT);
            boolean open = (Boolean)wrapper.read((Type)Types.BOOLEAN);
            boolean filter = (Boolean)wrapper.read((Type)Types.BOOLEAN);
            wrapper.write((Type)Types.VAR_INT, (Object)1);
            wrapper.write((Type)Types.BOOLEAN, (Object)(recipeType == 0 && open ? 1 : 0));
            wrapper.write((Type)Types.BOOLEAN, (Object)filter);
            wrapper.write((Type)Types.BOOLEAN, (Object)(recipeType == 1 && open ? 1 : 0));
            wrapper.write((Type)Types.BOOLEAN, (Object)filter);
            wrapper.write((Type)Types.BOOLEAN, (Object)(recipeType == 2 && open ? 1 : 0));
            wrapper.write((Type)Types.BOOLEAN, (Object)filter);
            wrapper.write((Type)Types.BOOLEAN, (Object)(recipeType == 3 && open ? 1 : 0));
            wrapper.write((Type)Types.BOOLEAN, (Object)filter);
        });
        this.registerServerbound(ServerboundPackets1_16_2.RECIPE_BOOK_SEEN_RECIPE, ServerboundPackets1_16.RECIPE_BOOK_UPDATE, wrapper -> {
            String recipe = (String)wrapper.read(Types.STRING);
            wrapper.write((Type)Types.VAR_INT, (Object)0);
            wrapper.write(Types.STRING, (Object)recipe);
        });
    }

    public TagRewriter<ClientboundPackets1_16> getTagRewriter() {
        return this.tagRewriter;
    }

    public BlockRewriter<ClientboundPackets1_16> getBlockRewriter() {
        return this.blockRewriter;
    }

    public MappingData1_16_2 getMappingData() {
        return MAPPINGS;
    }

    public ItemPacketRewriter1_16_2 getItemRewriter() {
        return this.itemRewriter;
    }

    public EntityPacketRewriter1_16_2 getEntityRewriter() {
        return this.entityRewriter;
    }
}

