/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.viaversion.api.connection.UserConnection
 *  com.viaversion.viaversion.api.data.ParticleMappings
 *  com.viaversion.viaversion.api.minecraft.Particle
 *  com.viaversion.viaversion.api.minecraft.Particle$ParticleData
 *  com.viaversion.viaversion.api.minecraft.item.Item
 *  com.viaversion.viaversion.api.protocol.Protocol
 *  com.viaversion.viaversion.api.protocol.packet.ClientboundPacketType
 *  com.viaversion.viaversion.api.protocol.packet.PacketWrapper
 *  com.viaversion.viaversion.api.protocol.remapper.PacketHandler
 *  com.viaversion.viaversion.api.protocol.remapper.PacketHandlers
 *  com.viaversion.viaversion.api.rewriter.ItemRewriter
 *  com.viaversion.viaversion.api.rewriter.ParticleRewriter
 *  com.viaversion.viaversion.api.type.Type
 *  com.viaversion.viaversion.api.type.Types
 *  com.viaversion.viaversion.rewriter.SoundRewriter
 */
package com.viaversion.viaversion.rewriter;

import com.viaversion.viaversion.api.connection.UserConnection;
import com.viaversion.viaversion.api.data.ParticleMappings;
import com.viaversion.viaversion.api.minecraft.Particle;
import com.viaversion.viaversion.api.minecraft.item.Item;
import com.viaversion.viaversion.api.protocol.Protocol;
import com.viaversion.viaversion.api.protocol.packet.ClientboundPacketType;
import com.viaversion.viaversion.api.protocol.packet.PacketWrapper;
import com.viaversion.viaversion.api.protocol.remapper.PacketHandler;
import com.viaversion.viaversion.api.protocol.remapper.PacketHandlers;
import com.viaversion.viaversion.api.rewriter.ItemRewriter;
import com.viaversion.viaversion.api.type.Type;
import com.viaversion.viaversion.api.type.Types;
import com.viaversion.viaversion.rewriter.SoundRewriter;

public class ParticleRewriter<C extends ClientboundPacketType>
implements com.viaversion.viaversion.api.rewriter.ParticleRewriter {
    protected final Protocol<C, ?, ?, ?> protocol;
    private final Type<Particle> particleType;
    private final Type<Particle> mappedParticleType;

    public ParticleRewriter(Protocol<C, ?, ?, ?> protocol) {
        this.protocol = protocol;
        this.particleType = protocol.types() != null ? protocol.types().particle() : null;
        this.mappedParticleType = protocol.mappedTypes() != null ? protocol.mappedTypes().particle() : null;
    }

    public void registerLevelParticles1_13(C packetType, final Type<?> coordType) {
        this.protocol.registerClientbound(packetType, (PacketHandler)new PacketHandlers(){

            public void register() {
                this.map((Type)Types.INT);
                this.map((Type)Types.BOOLEAN);
                this.map(coordType);
                this.map(coordType);
                this.map(coordType);
                this.map((Type)Types.FLOAT);
                this.map((Type)Types.FLOAT);
                this.map((Type)Types.FLOAT);
                this.map((Type)Types.FLOAT);
                this.map((Type)Types.INT);
                this.handler(ParticleRewriter.this.levelParticlesHandler1_13((Type<Integer>)Types.INT));
            }
        });
    }

    public Particle passthroughParticle(PacketWrapper wrapper) {
        Particle particle = (Particle)wrapper.read(this.particleType);
        wrapper.write(this.mappedParticleType, (Object)particle);
        this.rewriteParticle(wrapper.user(), particle);
        return particle;
    }

    public void registerLevelParticles1_19(C packetType) {
        this.protocol.registerClientbound(packetType, (PacketHandler)new PacketHandlers(){

            public void register() {
                this.map((Type)Types.VAR_INT);
                this.map((Type)Types.BOOLEAN);
                this.map((Type)Types.DOUBLE);
                this.map((Type)Types.DOUBLE);
                this.map((Type)Types.DOUBLE);
                this.map((Type)Types.FLOAT);
                this.map((Type)Types.FLOAT);
                this.map((Type)Types.FLOAT);
                this.map((Type)Types.FLOAT);
                this.map((Type)Types.INT);
                this.handler(ParticleRewriter.this.levelParticlesHandler1_13((Type<Integer>)Types.VAR_INT));
            }
        });
    }

    public void registerExplode1_20_5(C packetType) {
        SoundRewriter soundRewriter = new SoundRewriter(this.protocol);
        this.protocol.registerClientbound(packetType, wrapper -> {
            wrapper.passthrough((Type)Types.DOUBLE);
            wrapper.passthrough((Type)Types.DOUBLE);
            wrapper.passthrough((Type)Types.DOUBLE);
            wrapper.passthrough((Type)Types.FLOAT);
            int blocks = (Integer)wrapper.passthrough((Type)Types.VAR_INT);
            for (int i = 0; i < blocks; ++i) {
                wrapper.passthrough((Type)Types.BYTE);
                wrapper.passthrough((Type)Types.BYTE);
                wrapper.passthrough((Type)Types.BYTE);
            }
            wrapper.passthrough((Type)Types.FLOAT);
            wrapper.passthrough((Type)Types.FLOAT);
            wrapper.passthrough((Type)Types.FLOAT);
            wrapper.passthrough((Type)Types.VAR_INT);
            Particle smallExplosionParticle = (Particle)wrapper.passthroughAndMap(this.particleType, this.mappedParticleType);
            Particle largeExplosionParticle = (Particle)wrapper.passthroughAndMap(this.particleType, this.mappedParticleType);
            this.rewriteParticle(wrapper.user(), smallExplosionParticle);
            this.rewriteParticle(wrapper.user(), largeExplosionParticle);
            soundRewriter.soundHolderHandler().handle(wrapper);
        });
    }

    public void registerExplode1_21_9(C packetType) {
        SoundRewriter soundRewriter = new SoundRewriter(this.protocol);
        this.protocol.registerClientbound(packetType, wrapper -> {
            wrapper.passthrough((Type)Types.DOUBLE);
            wrapper.passthrough((Type)Types.DOUBLE);
            wrapper.passthrough((Type)Types.DOUBLE);
            wrapper.passthrough((Type)Types.FLOAT);
            wrapper.passthrough((Type)Types.INT);
            if (((Boolean)wrapper.passthrough((Type)Types.BOOLEAN)).booleanValue()) {
                wrapper.passthrough((Type)Types.DOUBLE);
                wrapper.passthrough((Type)Types.DOUBLE);
                wrapper.passthrough((Type)Types.DOUBLE);
            }
            this.passthroughParticle(wrapper);
            soundRewriter.soundHolderHandler().handle(wrapper);
            int blockParticles = (Integer)wrapper.passthrough((Type)Types.VAR_INT);
            for (int i = 0; i < blockParticles; ++i) {
                this.passthroughParticle(wrapper);
                wrapper.passthrough((Type)Types.FLOAT);
                wrapper.passthrough((Type)Types.FLOAT);
                wrapper.passthrough((Type)Types.VAR_INT);
            }
        });
    }

    public void registerExplode1_21_2(C packetType) {
        SoundRewriter soundRewriter = new SoundRewriter(this.protocol);
        this.protocol.registerClientbound(packetType, wrapper -> {
            wrapper.passthrough((Type)Types.DOUBLE);
            wrapper.passthrough((Type)Types.DOUBLE);
            wrapper.passthrough((Type)Types.DOUBLE);
            if (((Boolean)wrapper.passthrough((Type)Types.BOOLEAN)).booleanValue()) {
                wrapper.passthrough((Type)Types.DOUBLE);
                wrapper.passthrough((Type)Types.DOUBLE);
                wrapper.passthrough((Type)Types.DOUBLE);
            }
            this.passthroughParticle(wrapper);
            soundRewriter.soundHolderHandler().handle(wrapper);
        });
    }

    public PacketHandler levelParticlesHandler1_13(Type<Integer> idType) {
        return wrapper -> {
            int id = (Integer)wrapper.get(idType, 0);
            if (id == -1) {
                return;
            }
            ParticleMappings mappings = this.protocol.getMappingData().getParticleMappings();
            if (mappings.isBlockParticle(id)) {
                int data = (Integer)wrapper.read((Type)Types.VAR_INT);
                wrapper.write((Type)Types.VAR_INT, (Object)this.protocol.getMappingData().getNewBlockStateId(data));
            } else if (mappings.isItemParticle(id)) {
                ItemRewriter itemRewriter = this.protocol.getItemRewriter();
                Item item = (Item)wrapper.read(itemRewriter.itemType());
                wrapper.write(itemRewriter.mappedItemType(), (Object)itemRewriter.handleItemToClient(wrapper.user(), item));
            }
            int mappedId = this.protocol.getMappingData().getNewParticleId(id);
            if (mappedId != id) {
                wrapper.set(idType, 0, (Object)mappedId);
            }
        };
    }

    public void registerLevelParticles1_21_4(C packetType) {
        this.protocol.registerClientbound(packetType, wrapper -> {
            wrapper.passthrough((Type)Types.BOOLEAN);
            wrapper.passthrough((Type)Types.BOOLEAN);
            wrapper.passthrough((Type)Types.DOUBLE);
            wrapper.passthrough((Type)Types.DOUBLE);
            wrapper.passthrough((Type)Types.DOUBLE);
            wrapper.passthrough((Type)Types.FLOAT);
            wrapper.passthrough((Type)Types.FLOAT);
            wrapper.passthrough((Type)Types.FLOAT);
            wrapper.passthrough((Type)Types.FLOAT);
            wrapper.passthrough((Type)Types.INT);
            Particle particle = (Particle)wrapper.passthroughAndMap(this.particleType, this.mappedParticleType);
            this.rewriteParticle(wrapper.user(), particle);
        });
    }

    public void registerLevelParticles1_20_5(C packetType) {
        this.protocol.registerClientbound(packetType, wrapper -> {
            wrapper.passthrough((Type)Types.BOOLEAN);
            wrapper.passthrough((Type)Types.DOUBLE);
            wrapper.passthrough((Type)Types.DOUBLE);
            wrapper.passthrough((Type)Types.DOUBLE);
            wrapper.passthrough((Type)Types.FLOAT);
            wrapper.passthrough((Type)Types.FLOAT);
            wrapper.passthrough((Type)Types.FLOAT);
            wrapper.passthrough((Type)Types.FLOAT);
            wrapper.passthrough((Type)Types.INT);
            Particle particle = (Particle)wrapper.passthroughAndMap(this.particleType, this.mappedParticleType);
            this.rewriteParticle(wrapper.user(), particle);
        });
    }

    public void rewriteParticle(UserConnection connection, Particle particle) {
        ParticleMappings mappings = this.protocol.getMappingData().getParticleMappings();
        ItemRewriter itemRewriter = this.protocol.getItemRewriter();
        int id = particle.id();
        if (mappings.isBlockParticle(id)) {
            Particle.ParticleData data = particle.getArgument(0);
            data.setValue((Object)this.protocol.getMappingData().getNewBlockStateId(((Integer)data.getValue()).intValue()));
        } else if (mappings.isItemParticle(id) && itemRewriter != null) {
            Particle.ParticleData data = particle.getArgument(0);
            Item item = itemRewriter.handleItemToClient(connection, (Item)data.getValue());
            if (itemRewriter.mappedItemTemplateType() != null && itemRewriter.itemTemplateType() != itemRewriter.mappedItemTemplateType()) {
                particle.set(0, itemRewriter.mappedItemTemplateType(), (Object)item);
            } else {
                data.setValue((Object)item);
            }
        }
        particle.setId(this.protocol.getMappingData().getNewParticleId(id));
    }

    public Type<Particle> particleType() {
        return this.particleType;
    }

    public Type<Particle> mappedParticleType() {
        return this.mappedParticleType;
    }
}

