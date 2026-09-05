/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.viaversion.api.connection.UserConnection
 *  com.viaversion.viaversion.api.data.entity.EntityTracker
 *  com.viaversion.viaversion.api.minecraft.ClientWorld
 *  com.viaversion.viaversion.api.minecraft.entities.EntityType
 *  com.viaversion.viaversion.api.minecraft.entities.EntityTypes1_10$EntityType
 *  com.viaversion.viaversion.api.protocol.packet.ClientboundPacketType
 *  com.viaversion.viaversion.api.protocol.packet.PacketWrapper
 *  com.viaversion.viaversion.api.protocol.packet.ServerboundPacketType
 *  com.viaversion.viaversion.api.protocol.remapper.PacketHandler
 *  com.viaversion.viaversion.api.protocol.remapper.PacketHandlers
 *  com.viaversion.viaversion.api.protocol.remapper.ValueTransformer
 *  com.viaversion.viaversion.api.type.Type
 *  com.viaversion.viaversion.api.type.Types
 *  com.viaversion.viaversion.data.entity.EntityTrackerBase
 *  com.viaversion.viaversion.protocols.v1_9_1to1_9_3.packet.ClientboundPackets1_9_3
 *  com.viaversion.viaversion.protocols.v1_9_1to1_9_3.packet.ServerboundPackets1_9_3
 *  com.viaversion.viaversion.rewriter.text.ComponentRewriterBase$ReadType
 */
package com.viaversion.viabackwards.protocol.v1_10to1_9_3;

import com.viaversion.viabackwards.api.BackwardsProtocol;
import com.viaversion.viabackwards.api.data.BackwardsMappingData;
import com.viaversion.viabackwards.api.rewriters.SoundRewriter;
import com.viaversion.viabackwards.api.rewriters.text.JsonNBTComponentRewriter;
import com.viaversion.viabackwards.protocol.v1_10to1_9_3.rewriter.BlockItemPacketRewriter1_10;
import com.viaversion.viabackwards.protocol.v1_10to1_9_3.rewriter.EntityPacketRewriter1_10;
import com.viaversion.viaversion.api.connection.UserConnection;
import com.viaversion.viaversion.api.data.entity.EntityTracker;
import com.viaversion.viaversion.api.minecraft.ClientWorld;
import com.viaversion.viaversion.api.minecraft.entities.EntityType;
import com.viaversion.viaversion.api.minecraft.entities.EntityTypes1_10;
import com.viaversion.viaversion.api.protocol.packet.ClientboundPacketType;
import com.viaversion.viaversion.api.protocol.packet.PacketWrapper;
import com.viaversion.viaversion.api.protocol.packet.ServerboundPacketType;
import com.viaversion.viaversion.api.protocol.remapper.PacketHandler;
import com.viaversion.viaversion.api.protocol.remapper.PacketHandlers;
import com.viaversion.viaversion.api.protocol.remapper.ValueTransformer;
import com.viaversion.viaversion.api.type.Type;
import com.viaversion.viaversion.api.type.Types;
import com.viaversion.viaversion.data.entity.EntityTrackerBase;
import com.viaversion.viaversion.protocols.v1_9_1to1_9_3.packet.ClientboundPackets1_9_3;
import com.viaversion.viaversion.protocols.v1_9_1to1_9_3.packet.ServerboundPackets1_9_3;
import com.viaversion.viaversion.rewriter.text.ComponentRewriterBase;

public class Protocol1_10To1_9_3
extends BackwardsProtocol<ClientboundPackets1_9_3, ClientboundPackets1_9_3, ServerboundPackets1_9_3, ServerboundPackets1_9_3> {
    public static final BackwardsMappingData MAPPINGS = new BackwardsMappingData("1.10", "1.9.4");
    private static final ValueTransformer<Float, Short> TO_OLD_PITCH = new ValueTransformer<Float, Short>((Type)Types.UNSIGNED_BYTE){

        public Short transform(PacketWrapper packetWrapper, Float inputValue) {
            return (short)Math.round(inputValue.floatValue() * 63.5f);
        }
    };
    private final EntityPacketRewriter1_10 entityRewriter = new EntityPacketRewriter1_10(this);
    private final BlockItemPacketRewriter1_10 itemRewriter = new BlockItemPacketRewriter1_10(this);

    public Protocol1_10To1_9_3() {
        super(ClientboundPackets1_9_3.class, ClientboundPackets1_9_3.class, ServerboundPackets1_9_3.class, ServerboundPackets1_9_3.class);
    }

    public void init(UserConnection user) {
        user.addEntityTracker(((Object)((Object)this)).getClass(), (EntityTracker)new EntityTrackerBase(user, (EntityType)EntityTypes1_10.EntityType.PLAYER));
        user.addClientWorld(((Object)((Object)this)).getClass(), new ClientWorld());
    }

    protected void registerPackets() {
        this.entityRewriter.register();
        this.itemRewriter.register();
        final SoundRewriter<ClientboundPackets1_9_3> soundRewriter = new SoundRewriter<ClientboundPackets1_9_3>(this);
        this.replaceClientbound((ClientboundPacketType)ClientboundPackets1_9_3.CUSTOM_SOUND, (PacketHandler)new PacketHandlers(){

            public void register() {
                this.map(Types.STRING);
                this.map((Type)Types.VAR_INT);
                this.map((Type)Types.INT);
                this.map((Type)Types.INT);
                this.map((Type)Types.INT);
                this.map((Type)Types.FLOAT);
                this.map((Type)Types.FLOAT, TO_OLD_PITCH);
                this.handler(soundRewriter.getNamedSoundHandler());
            }
        });
        this.replaceClientbound((ClientboundPacketType)ClientboundPackets1_9_3.SOUND, (PacketHandler)new PacketHandlers(){

            public void register() {
                this.map((Type)Types.VAR_INT);
                this.map((Type)Types.VAR_INT);
                this.map((Type)Types.INT);
                this.map((Type)Types.INT);
                this.map((Type)Types.INT);
                this.map((Type)Types.FLOAT);
                this.map((Type)Types.FLOAT, TO_OLD_PITCH);
                this.handler(soundRewriter.getSoundHandler());
            }
        });
        this.registerServerbound((ServerboundPacketType)ServerboundPackets1_9_3.RESOURCE_PACK, (PacketHandler)new PacketHandlers(){

            public void register() {
                this.read(Types.STRING);
                this.map((Type)Types.VAR_INT);
            }
        });
        JsonNBTComponentRewriter<ClientboundPackets1_9_3> componentRewriter = new JsonNBTComponentRewriter<ClientboundPackets1_9_3>(this, ComponentRewriterBase.ReadType.JSON);
        componentRewriter.registerComponentPacket((ClientboundPacketType)ClientboundPackets1_9_3.CHAT);
    }

    @Override
    public BackwardsMappingData getMappingData() {
        return MAPPINGS;
    }

    public BlockItemPacketRewriter1_10 getItemRewriter() {
        return this.itemRewriter;
    }

    public EntityPacketRewriter1_10 getEntityRewriter() {
        return this.entityRewriter;
    }
}

