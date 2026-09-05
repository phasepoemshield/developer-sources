/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.viabackwards.api.BackwardsProtocol
 *  com.viaversion.viabackwards.api.rewriters.BackwardsItemRewriter
 *  com.viaversion.viaversion.api.data.ParticleMappings
 *  com.viaversion.viaversion.api.minecraft.item.Item
 *  com.viaversion.viaversion.api.protocol.packet.ClientboundPacketType
 *  com.viaversion.viaversion.api.protocol.packet.PacketWrapper
 *  com.viaversion.viaversion.api.protocol.remapper.PacketHandler
 *  com.viaversion.viaversion.api.protocol.remapper.PacketHandlers
 *  com.viaversion.viaversion.api.type.Type
 *  com.viaversion.viaversion.api.type.Types
 *  com.viaversion.viaversion.api.type.types.version.Types1_20_3
 *  com.viaversion.viaversion.protocols.v1_20_2to1_20_3.packet.ClientboundPacket1_20_3
 *  com.viaversion.viaversion.protocols.v1_20_2to1_20_3.packet.ClientboundPackets1_20_3
 *  com.viaversion.viaversion.protocols.v1_20_2to1_20_3.rewriter.RecipeRewriter1_20_3
 *  com.viaversion.viaversion.protocols.v1_20to1_20_2.packet.ServerboundPacket1_20_2
 */
package com.viaversion.viabackwards.protocol.v1_20_3to1_20_2.rewriter;

import com.viaversion.viabackwards.api.BackwardsProtocol;
import com.viaversion.viabackwards.api.rewriters.BackwardsItemRewriter;
import com.viaversion.viabackwards.protocol.v1_20_3to1_20_2.Protocol1_20_3To1_20_2;
import com.viaversion.viaversion.api.data.ParticleMappings;
import com.viaversion.viaversion.api.minecraft.item.Item;
import com.viaversion.viaversion.api.protocol.packet.ClientboundPacketType;
import com.viaversion.viaversion.api.protocol.packet.PacketWrapper;
import com.viaversion.viaversion.api.protocol.remapper.PacketHandler;
import com.viaversion.viaversion.api.protocol.remapper.PacketHandlers;
import com.viaversion.viaversion.api.type.Type;
import com.viaversion.viaversion.api.type.Types;
import com.viaversion.viaversion.api.type.types.version.Types1_20_3;
import com.viaversion.viaversion.protocols.v1_20_2to1_20_3.packet.ClientboundPacket1_20_3;
import com.viaversion.viaversion.protocols.v1_20_2to1_20_3.packet.ClientboundPackets1_20_3;
import com.viaversion.viaversion.protocols.v1_20_2to1_20_3.rewriter.RecipeRewriter1_20_3;
import com.viaversion.viaversion.protocols.v1_20to1_20_2.packet.ServerboundPacket1_20_2;

public final class BlockItemPacketRewriter1_20_3
extends BackwardsItemRewriter<ClientboundPacket1_20_3, ServerboundPacket1_20_2, Protocol1_20_3To1_20_2> {
    public BlockItemPacketRewriter1_20_3(Protocol1_20_3To1_20_2 protocol) {
        super((BackwardsProtocol)protocol, Types.ITEM1_20_2, Types.ITEM1_20_2_ARRAY);
    }

    public void registerPackets() {
        ((Protocol1_20_3To1_20_2)this.protocol).replaceClientbound((ClientboundPacketType)ClientboundPackets1_20_3.LEVEL_PARTICLES, (PacketHandler)new PacketHandlers(){

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
                this.handler(wrapper -> {
                    ParticleMappings particleMappings;
                    int id = (Integer)wrapper.get((Type)Types.VAR_INT, 0);
                    if (id == (particleMappings = ((Protocol1_20_3To1_20_2)BlockItemPacketRewriter1_20_3.this.protocol).getMappingData().getParticleMappings()).id("vibration")) {
                        int positionSourceType = (Integer)wrapper.read((Type)Types.VAR_INT);
                        if (positionSourceType == 0) {
                            wrapper.write(Types.STRING, (Object)"minecraft:block");
                        } else if (positionSourceType == 1) {
                            wrapper.write(Types.STRING, (Object)"minecraft:entity");
                        } else {
                            ((Protocol1_20_3To1_20_2)BlockItemPacketRewriter1_20_3.this.protocol).getLogger().warning("Unknown position source type: " + positionSourceType);
                            wrapper.cancel();
                        }
                    }
                });
                this.handler(((Protocol1_20_3To1_20_2)BlockItemPacketRewriter1_20_3.this.protocol).getParticleRewriter().levelParticlesHandler1_13((Type)Types.VAR_INT));
            }
        });
        new RecipeRewriter1_20_3<ClientboundPacket1_20_3>(this.protocol){

            public void handleCraftingShaped(PacketWrapper wrapper) {
                String group = (String)wrapper.read(Types.STRING);
                int craftingBookCategory = (Integer)wrapper.read((Type)Types.VAR_INT);
                int width = (Integer)wrapper.passthrough((Type)Types.VAR_INT);
                int height = (Integer)wrapper.passthrough((Type)Types.VAR_INT);
                wrapper.write(Types.STRING, (Object)group);
                wrapper.write((Type)Types.VAR_INT, (Object)craftingBookCategory);
                int ingredients = height * width;
                for (int i = 0; i < ingredients; ++i) {
                    this.handleIngredient(wrapper);
                }
                this.rewrite(wrapper.user(), (Item)wrapper.passthrough(this.itemType()));
                wrapper.passthrough((Type)Types.BOOLEAN);
            }
        }.register((ClientboundPacketType)ClientboundPackets1_20_3.UPDATE_RECIPES);
        ((Protocol1_20_3To1_20_2)this.protocol).registerClientbound((ClientboundPacketType)ClientboundPackets1_20_3.EXPLODE, wrapper -> {
            wrapper.passthrough((Type)Types.DOUBLE);
            wrapper.passthrough((Type)Types.DOUBLE);
            wrapper.passthrough((Type)Types.DOUBLE);
            wrapper.passthrough((Type)Types.FLOAT);
            int blocks = (Integer)wrapper.read((Type)Types.VAR_INT);
            byte[][] toBlow = new byte[blocks][3];
            for (int i = 0; i < blocks; ++i) {
                toBlow[i] = new byte[]{(Byte)wrapper.read((Type)Types.BYTE), (Byte)wrapper.read((Type)Types.BYTE), (Byte)wrapper.read((Type)Types.BYTE)};
            }
            float knockbackX = ((Float)wrapper.read((Type)Types.FLOAT)).floatValue();
            float knockbackY = ((Float)wrapper.read((Type)Types.FLOAT)).floatValue();
            float knockbackZ = ((Float)wrapper.read((Type)Types.FLOAT)).floatValue();
            int blockInteraction = (Integer)wrapper.read((Type)Types.VAR_INT);
            if (blockInteraction == 1 || blockInteraction == 2) {
                wrapper.write((Type)Types.VAR_INT, (Object)blocks);
                for (byte[] relativeXYZ : toBlow) {
                    wrapper.write((Type)Types.BYTE, (Object)relativeXYZ[0]);
                    wrapper.write((Type)Types.BYTE, (Object)relativeXYZ[1]);
                    wrapper.write((Type)Types.BYTE, (Object)relativeXYZ[2]);
                }
            } else {
                wrapper.write((Type)Types.VAR_INT, (Object)0);
            }
            wrapper.write((Type)Types.FLOAT, (Object)Float.valueOf(knockbackX));
            wrapper.write((Type)Types.FLOAT, (Object)Float.valueOf(knockbackY));
            wrapper.write((Type)Types.FLOAT, (Object)Float.valueOf(knockbackZ));
            wrapper.read((Type)Types1_20_3.PARTICLE);
            wrapper.read((Type)Types1_20_3.PARTICLE);
            wrapper.read(Types.STRING);
            wrapper.read((Type)Types.OPTIONAL_FLOAT);
        });
    }
}

