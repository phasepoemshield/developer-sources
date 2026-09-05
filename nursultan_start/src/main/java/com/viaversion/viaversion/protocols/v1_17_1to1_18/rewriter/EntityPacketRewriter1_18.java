/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.viaversion.api.data.entity.EntityTracker
 *  com.viaversion.viaversion.api.minecraft.Particle
 *  com.viaversion.viaversion.api.minecraft.entities.EntityType
 *  com.viaversion.viaversion.api.minecraft.entities.EntityTypes1_17
 *  com.viaversion.viaversion.api.minecraft.entitydata.types.EntityDataTypes1_14
 *  com.viaversion.viaversion.api.protocol.Protocol
 *  com.viaversion.viaversion.api.protocol.remapper.PacketHandler
 *  com.viaversion.viaversion.api.protocol.remapper.PacketHandlers
 *  com.viaversion.viaversion.api.type.Type
 *  com.viaversion.viaversion.api.type.Types
 *  com.viaversion.viaversion.api.type.types.version.Types1_17
 *  com.viaversion.viaversion.api.type.types.version.Types1_18
 *  com.viaversion.viaversion.protocols.v1_17_1to1_18.storage.ChunkLightStorage
 *  com.viaversion.viaversion.rewriter.EntityRewriter
 */
package com.viaversion.viaversion.protocols.v1_17_1to1_18.rewriter;

import com.viaversion.viaversion.api.data.entity.EntityTracker;
import com.viaversion.viaversion.api.minecraft.Particle;
import com.viaversion.viaversion.api.minecraft.entities.EntityType;
import com.viaversion.viaversion.api.minecraft.entities.EntityTypes1_17;
import com.viaversion.viaversion.api.minecraft.entitydata.types.EntityDataTypes1_14;
import com.viaversion.viaversion.api.protocol.Protocol;
import com.viaversion.viaversion.api.protocol.remapper.PacketHandler;
import com.viaversion.viaversion.api.protocol.remapper.PacketHandlers;
import com.viaversion.viaversion.api.type.Type;
import com.viaversion.viaversion.api.type.Types;
import com.viaversion.viaversion.api.type.types.version.Types1_17;
import com.viaversion.viaversion.api.type.types.version.Types1_18;
import com.viaversion.viaversion.protocols.v1_17_1to1_18.Protocol1_17_1To1_18;
import com.viaversion.viaversion.protocols.v1_17_1to1_18.storage.ChunkLightStorage;
import com.viaversion.viaversion.protocols.v1_17to1_17_1.packet.ClientboundPackets1_17_1;
import com.viaversion.viaversion.rewriter.EntityRewriter;

public final class EntityPacketRewriter1_18
extends EntityRewriter<ClientboundPackets1_17_1, Protocol1_17_1To1_18> {
    public EntityPacketRewriter1_18(Protocol1_17_1To1_18 protocol) {
        super((Protocol)protocol);
    }

    protected void registerRewrites() {
        this.filter().mapDataType(arg_0 -> ((EntityDataTypes1_14)Types1_18.ENTITY_DATA_TYPES).byId(arg_0));
        this.filter().dataType(Types1_18.ENTITY_DATA_TYPES.particleType).handler((event, data) -> {
            Particle particle = (Particle)data.getValue();
            if (particle.id() == 2) {
                particle.setId(3);
                particle.add((Type)Types.VAR_INT, (Object)7754);
            } else if (particle.id() == 3) {
                particle.add((Type)Types.VAR_INT, (Object)7786);
            } else {
                ((Protocol1_17_1To1_18)this.protocol).getParticleRewriter().rewriteParticle(event.user(), particle);
            }
        });
        this.registerEntityDataTypeHandler(Types1_18.ENTITY_DATA_TYPES.itemType, null, null);
    }

    public void registerPackets() {
        this.registerSetEntityData(ClientboundPackets1_17_1.SET_ENTITY_DATA, Types1_17.ENTITY_DATA_LIST, Types1_18.ENTITY_DATA_LIST);
        ((Protocol1_17_1To1_18)this.protocol).registerClientbound(ClientboundPackets1_17_1.LOGIN, (PacketHandler)new PacketHandlers(){

            public void register() {
                this.map((Type)Types.INT);
                this.map((Type)Types.BOOLEAN);
                this.map((Type)Types.BYTE);
                this.map((Type)Types.BYTE);
                this.map(Types.STRING_ARRAY);
                this.map(Types.NAMED_COMPOUND_TAG);
                this.map(Types.NAMED_COMPOUND_TAG);
                this.map(Types.STRING);
                this.map((Type)Types.LONG);
                this.map((Type)Types.VAR_INT);
                this.handler(wrapper -> {
                    int chunkRadius = (Integer)wrapper.passthrough((Type)Types.VAR_INT);
                    wrapper.write((Type)Types.VAR_INT, (Object)chunkRadius);
                });
                this.handler(EntityPacketRewriter1_18.this.worldDataTrackerHandler(1));
                this.handler(EntityPacketRewriter1_18.this.biomeSizeTracker());
            }
        });
        ((Protocol1_17_1To1_18)this.protocol).registerClientbound(ClientboundPackets1_17_1.RESPAWN, (PacketHandler)new PacketHandlers(){

            public void register() {
                this.map(Types.NAMED_COMPOUND_TAG);
                this.map(Types.STRING);
                this.handler(wrapper -> {
                    EntityTracker tracker;
                    String world = (String)wrapper.get(Types.STRING, 0);
                    if (!world.equals((tracker = EntityPacketRewriter1_18.this.tracker(wrapper.user())).currentWorld())) {
                        ((ChunkLightStorage)wrapper.user().get(ChunkLightStorage.class)).clear();
                    }
                });
                this.handler(EntityPacketRewriter1_18.this.worldDataTrackerHandler(0));
            }
        });
    }

    public EntityType typeFromId(int type) {
        return EntityTypes1_17.getTypeFromId((int)type);
    }
}

