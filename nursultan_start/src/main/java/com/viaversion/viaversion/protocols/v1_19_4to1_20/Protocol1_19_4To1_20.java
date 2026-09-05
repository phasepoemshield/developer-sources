/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.viaversion.api.connection.UserConnection
 *  com.viaversion.viaversion.api.data.MappingData
 *  com.viaversion.viaversion.api.data.MappingDataBase
 *  com.viaversion.viaversion.api.data.entity.EntityTracker
 *  com.viaversion.viaversion.api.minecraft.RegistryType
 *  com.viaversion.viaversion.api.minecraft.entities.EntityType
 *  com.viaversion.viaversion.api.minecraft.entities.EntityTypes1_19_4
 *  com.viaversion.viaversion.api.protocol.AbstractProtocol
 *  com.viaversion.viaversion.api.protocol.Protocol
 *  com.viaversion.viaversion.api.type.Type
 *  com.viaversion.viaversion.api.type.Types
 *  com.viaversion.viaversion.api.type.types.misc.ParticleType
 *  com.viaversion.viaversion.api.type.types.misc.ParticleType$Fillers
 *  com.viaversion.viaversion.api.type.types.version.Types1_20
 *  com.viaversion.viaversion.data.entity.EntityTrackerBase
 *  com.viaversion.viaversion.rewriter.BlockRewriter
 *  com.viaversion.viaversion.rewriter.ParticleRewriter
 *  com.viaversion.viaversion.rewriter.TagRewriter
 */
package com.viaversion.viaversion.protocols.v1_19_4to1_20;

import com.viaversion.viaversion.api.connection.UserConnection;
import com.viaversion.viaversion.api.data.MappingData;
import com.viaversion.viaversion.api.data.MappingDataBase;
import com.viaversion.viaversion.api.data.entity.EntityTracker;
import com.viaversion.viaversion.api.minecraft.RegistryType;
import com.viaversion.viaversion.api.minecraft.entities.EntityType;
import com.viaversion.viaversion.api.minecraft.entities.EntityTypes1_19_4;
import com.viaversion.viaversion.api.protocol.AbstractProtocol;
import com.viaversion.viaversion.api.protocol.Protocol;
import com.viaversion.viaversion.api.type.Type;
import com.viaversion.viaversion.api.type.Types;
import com.viaversion.viaversion.api.type.types.misc.ParticleType;
import com.viaversion.viaversion.api.type.types.version.Types1_20;
import com.viaversion.viaversion.data.entity.EntityTrackerBase;
import com.viaversion.viaversion.protocols.v1_19_3to1_19_4.packet.ClientboundPackets1_19_4;
import com.viaversion.viaversion.protocols.v1_19_3to1_19_4.packet.ServerboundPackets1_19_4;
import com.viaversion.viaversion.protocols.v1_19_4to1_20.rewriter.BlockPacketRewriter1_20;
import com.viaversion.viaversion.protocols.v1_19_4to1_20.rewriter.EntityPacketRewriter1_20;
import com.viaversion.viaversion.protocols.v1_19_4to1_20.rewriter.ItemPacketRewriter1_20;
import com.viaversion.viaversion.rewriter.BlockRewriter;
import com.viaversion.viaversion.rewriter.ParticleRewriter;
import com.viaversion.viaversion.rewriter.TagRewriter;

public final class Protocol1_19_4To1_20
extends AbstractProtocol<ClientboundPackets1_19_4, ClientboundPackets1_19_4, ServerboundPackets1_19_4, ServerboundPackets1_19_4> {
    public static final MappingData MAPPINGS = new MappingDataBase("1.19.4", "1.20");
    private final EntityPacketRewriter1_20 entityRewriter = new EntityPacketRewriter1_20(this);
    private final ItemPacketRewriter1_20 itemRewriter = new ItemPacketRewriter1_20(this);
    private final ParticleRewriter<ClientboundPackets1_19_4> particleRewriter = new ParticleRewriter((Protocol)this);
    private final TagRewriter<ClientboundPackets1_19_4> tagRewriter = new TagRewriter((Protocol)this);
    private final BlockRewriter<ClientboundPackets1_19_4> blockRewriter = new BlockPacketRewriter1_20(this);

    public Protocol1_19_4To1_20() {
        super(ClientboundPackets1_19_4.class, ClientboundPackets1_19_4.class, ServerboundPackets1_19_4.class, ServerboundPackets1_19_4.class);
    }

    protected void registerPackets() {
        super.registerPackets();
        this.registerClientbound(ClientboundPackets1_19_4.PLAYER_COMBAT_END, wrapper -> {
            wrapper.passthrough((Type)Types.VAR_INT);
            wrapper.read((Type)Types.INT);
        });
        this.registerClientbound(ClientboundPackets1_19_4.PLAYER_COMBAT_KILL, wrapper -> {
            wrapper.passthrough((Type)Types.VAR_INT);
            wrapper.read((Type)Types.INT);
        });
    }

    protected void onMappingDataLoaded() {
        ParticleType.Fillers.fill1_19((Protocol)this, (ParticleType)Types1_20.PARTICLE);
        this.tagRewriter.removeTag(RegistryType.BLOCK, "minecraft:replaceable_plants");
        this.tagRewriter.addEmptyTags(RegistryType.ITEM, new String[]{"minecraft:decorated_pot_ingredients", "minecraft:decorated_pot_sherds"});
        this.tagRewriter.addEmptyTag(RegistryType.BLOCK, "minecraft:trail_ruins_replaceable");
        super.onMappingDataLoaded();
    }

    public void init(UserConnection user) {
        this.addEntityTracker(user, (EntityTracker)new EntityTrackerBase(user, (EntityType)EntityTypes1_19_4.PLAYER));
    }

    public MappingData getMappingData() {
        return MAPPINGS;
    }

    public EntityPacketRewriter1_20 getEntityRewriter() {
        return this.entityRewriter;
    }

    public ItemPacketRewriter1_20 getItemRewriter() {
        return this.itemRewriter;
    }

    public BlockRewriter<ClientboundPackets1_19_4> getBlockRewriter() {
        return this.blockRewriter;
    }

    public ParticleRewriter<ClientboundPackets1_19_4> getParticleRewriter() {
        return this.particleRewriter;
    }

    public TagRewriter<ClientboundPackets1_19_4> getTagRewriter() {
        return this.tagRewriter;
    }
}

