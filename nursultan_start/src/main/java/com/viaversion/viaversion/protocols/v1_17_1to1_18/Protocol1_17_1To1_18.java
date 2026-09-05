/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.viaversion.api.connection.StorableObject
 *  com.viaversion.viaversion.api.connection.UserConnection
 *  com.viaversion.viaversion.api.data.MappingData
 *  com.viaversion.viaversion.api.data.MappingDataBase
 *  com.viaversion.viaversion.api.data.entity.EntityTracker
 *  com.viaversion.viaversion.api.minecraft.RegistryType
 *  com.viaversion.viaversion.api.minecraft.entities.EntityType
 *  com.viaversion.viaversion.api.minecraft.entities.EntityTypes1_17
 *  com.viaversion.viaversion.api.protocol.AbstractProtocol
 *  com.viaversion.viaversion.api.protocol.Protocol
 *  com.viaversion.viaversion.api.protocol.packet.ServerboundPacketType
 *  com.viaversion.viaversion.api.protocol.remapper.PacketHandler
 *  com.viaversion.viaversion.api.protocol.remapper.PacketHandlers
 *  com.viaversion.viaversion.api.type.Type
 *  com.viaversion.viaversion.api.type.Types
 *  com.viaversion.viaversion.api.type.types.misc.ParticleType
 *  com.viaversion.viaversion.api.type.types.misc.ParticleType$Fillers
 *  com.viaversion.viaversion.api.type.types.version.Types1_18
 *  com.viaversion.viaversion.data.entity.EntityTrackerBase
 *  com.viaversion.viaversion.protocols.v1_16_4to1_17.packet.ServerboundPackets1_17
 *  com.viaversion.viaversion.protocols.v1_17_1to1_18.storage.ChunkLightStorage
 *  com.viaversion.viaversion.rewriter.ParticleRewriter
 *  com.viaversion.viaversion.rewriter.TagRewriter
 *  com.viaversion.viaversion.util.ProtocolLogger
 */
package com.viaversion.viaversion.protocols.v1_17_1to1_18;

import com.viaversion.viaversion.api.connection.StorableObject;
import com.viaversion.viaversion.api.connection.UserConnection;
import com.viaversion.viaversion.api.data.MappingData;
import com.viaversion.viaversion.api.data.MappingDataBase;
import com.viaversion.viaversion.api.data.entity.EntityTracker;
import com.viaversion.viaversion.api.minecraft.RegistryType;
import com.viaversion.viaversion.api.minecraft.entities.EntityType;
import com.viaversion.viaversion.api.minecraft.entities.EntityTypes1_17;
import com.viaversion.viaversion.api.protocol.AbstractProtocol;
import com.viaversion.viaversion.api.protocol.Protocol;
import com.viaversion.viaversion.api.protocol.packet.ServerboundPacketType;
import com.viaversion.viaversion.api.protocol.remapper.PacketHandler;
import com.viaversion.viaversion.api.protocol.remapper.PacketHandlers;
import com.viaversion.viaversion.api.type.Type;
import com.viaversion.viaversion.api.type.Types;
import com.viaversion.viaversion.api.type.types.misc.ParticleType;
import com.viaversion.viaversion.api.type.types.version.Types1_18;
import com.viaversion.viaversion.data.entity.EntityTrackerBase;
import com.viaversion.viaversion.protocols.v1_16_4to1_17.packet.ServerboundPackets1_17;
import com.viaversion.viaversion.protocols.v1_17_1to1_18.packet.ClientboundPackets1_18;
import com.viaversion.viaversion.protocols.v1_17_1to1_18.rewriter.ComponentRewriter1_18;
import com.viaversion.viaversion.protocols.v1_17_1to1_18.rewriter.EntityPacketRewriter1_18;
import com.viaversion.viaversion.protocols.v1_17_1to1_18.rewriter.ItemPacketRewriter1_18;
import com.viaversion.viaversion.protocols.v1_17_1to1_18.rewriter.WorldPacketRewriter1_18;
import com.viaversion.viaversion.protocols.v1_17_1to1_18.storage.ChunkLightStorage;
import com.viaversion.viaversion.protocols.v1_17to1_17_1.packet.ClientboundPackets1_17_1;
import com.viaversion.viaversion.rewriter.ParticleRewriter;
import com.viaversion.viaversion.rewriter.TagRewriter;
import com.viaversion.viaversion.util.ProtocolLogger;

public final class Protocol1_17_1To1_18
extends AbstractProtocol<ClientboundPackets1_17_1, ClientboundPackets1_18, ServerboundPackets1_17, ServerboundPackets1_17> {
    public static final MappingData MAPPINGS = new MappingDataBase("1.17", "1.18");
    public static final ProtocolLogger LOGGER = new ProtocolLogger(Protocol1_17_1To1_18.class);
    private final EntityPacketRewriter1_18 entityRewriter = new EntityPacketRewriter1_18(this);
    private final ItemPacketRewriter1_18 itemRewriter = new ItemPacketRewriter1_18(this);
    private final ParticleRewriter<ClientboundPackets1_17_1> particleRewriter = new ParticleRewriter((Protocol)this);
    private final ComponentRewriter1_18 componentRewriter = new ComponentRewriter1_18((Protocol<ClientboundPackets1_17_1, ?, ?, ?>)this);
    private final TagRewriter<ClientboundPackets1_17_1> tagRewriter = new TagRewriter((Protocol)this);

    public Protocol1_17_1To1_18() {
        super(ClientboundPackets1_17_1.class, ClientboundPackets1_18.class, ServerboundPackets1_17.class, ServerboundPackets1_17.class);
    }

    public void init(UserConnection connection) {
        this.addEntityTracker(connection, (EntityTracker)new EntityTrackerBase(connection, (EntityType)EntityTypes1_17.PLAYER));
        connection.put((StorableObject)new ChunkLightStorage());
    }

    public ProtocolLogger getLogger() {
        return LOGGER;
    }

    public ComponentRewriter1_18 getComponentRewriter() {
        return this.componentRewriter;
    }

    protected void onMappingDataLoaded() {
        ParticleType.Fillers.fill1_18((Protocol)this, (ParticleType)Types1_18.PARTICLE);
        this.tagRewriter.renameTag(RegistryType.BLOCK, "minecraft:lava_pool_stone_replaceables", "minecraft:lava_pool_stone_cannot_replace");
        super.onMappingDataLoaded();
    }

    public ParticleRewriter<ClientboundPackets1_17_1> getParticleRewriter() {
        return this.particleRewriter;
    }

    protected void registerPackets() {
        this.entityRewriter.register();
        this.itemRewriter.register();
        WorldPacketRewriter1_18.register(this);
        this.registerServerbound((ServerboundPacketType)ServerboundPackets1_17.CLIENT_INFORMATION, (PacketHandler)new PacketHandlers(){

            public void register() {
                this.map(Types.STRING);
                this.map((Type)Types.BYTE);
                this.map((Type)Types.VAR_INT);
                this.map((Type)Types.BOOLEAN);
                this.map((Type)Types.UNSIGNED_BYTE);
                this.map((Type)Types.VAR_INT);
                this.map((Type)Types.BOOLEAN);
                this.read((Type)Types.BOOLEAN);
            }
        });
    }

    public TagRewriter<ClientboundPackets1_17_1> getTagRewriter() {
        return this.tagRewriter;
    }

    public MappingData getMappingData() {
        return MAPPINGS;
    }

    public ItemPacketRewriter1_18 getItemRewriter() {
        return this.itemRewriter;
    }

    public EntityPacketRewriter1_18 getEntityRewriter() {
        return this.entityRewriter;
    }
}

