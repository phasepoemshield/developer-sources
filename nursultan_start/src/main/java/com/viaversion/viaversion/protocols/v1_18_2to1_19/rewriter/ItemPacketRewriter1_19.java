/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.viaversion.api.Via
 *  com.viaversion.viaversion.api.data.ParticleMappings
 *  com.viaversion.viaversion.api.minecraft.item.Item
 *  com.viaversion.viaversion.api.protocol.Protocol
 *  com.viaversion.viaversion.api.protocol.packet.ClientboundPacketType
 *  com.viaversion.viaversion.api.protocol.remapper.PacketHandler
 *  com.viaversion.viaversion.api.protocol.remapper.PacketHandlers
 *  com.viaversion.viaversion.api.type.Type
 *  com.viaversion.viaversion.api.type.Types
 *  com.viaversion.viaversion.rewriter.ItemRewriter
 *  com.viaversion.viaversion.rewriter.RecipeRewriter
 *  com.viaversion.viaversion.util.Key
 */
package com.viaversion.viaversion.protocols.v1_18_2to1_19.rewriter;

import com.viaversion.viaversion.api.Via;
import com.viaversion.viaversion.api.data.ParticleMappings;
import com.viaversion.viaversion.api.minecraft.item.Item;
import com.viaversion.viaversion.api.protocol.Protocol;
import com.viaversion.viaversion.api.protocol.packet.ClientboundPacketType;
import com.viaversion.viaversion.api.protocol.remapper.PacketHandler;
import com.viaversion.viaversion.api.protocol.remapper.PacketHandlers;
import com.viaversion.viaversion.api.type.Type;
import com.viaversion.viaversion.api.type.Types;
import com.viaversion.viaversion.protocols.v1_17_1to1_18.packet.ClientboundPackets1_18;
import com.viaversion.viaversion.protocols.v1_18_2to1_19.Protocol1_18_2To1_19;
import com.viaversion.viaversion.protocols.v1_18_2to1_19.packet.ServerboundPackets1_19;
import com.viaversion.viaversion.protocols.v1_18_2to1_19.provider.AckSequenceProvider;
import com.viaversion.viaversion.rewriter.ItemRewriter;
import com.viaversion.viaversion.rewriter.RecipeRewriter;
import com.viaversion.viaversion.util.Key;

public final class ItemPacketRewriter1_19
extends ItemRewriter<ClientboundPackets1_18, ServerboundPackets1_19, Protocol1_18_2To1_19> {
    public ItemPacketRewriter1_19(Protocol1_18_2To1_19 protocol) {
        super((Protocol)protocol, Types.ITEM1_13_2, Types.ITEM1_13_2_ARRAY);
    }

    public void registerPackets() {
        ((Protocol1_18_2To1_19)this.protocol).replaceClientbound(ClientboundPackets1_18.LEVEL_PARTICLES, (PacketHandler)new PacketHandlers(){

            public void register() {
                this.map((Type)Types.INT, (Type)Types.VAR_INT);
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
                    if (id == (particleMappings = ((Protocol1_18_2To1_19)ItemPacketRewriter1_19.this.protocol).getMappingData().getParticleMappings()).id("vibration")) {
                        wrapper.read(Types.BLOCK_POSITION1_14);
                        String resourceLocation = Key.stripMinecraftNamespace((String)((String)wrapper.passthrough(Types.STRING)));
                        if (resourceLocation.equals("entity")) {
                            wrapper.passthrough((Type)Types.VAR_INT);
                            wrapper.write((Type)Types.FLOAT, (Object)Float.valueOf(0.0f));
                        }
                    }
                });
                this.handler(((Protocol1_18_2To1_19)ItemPacketRewriter1_19.this.protocol).getParticleRewriter().levelParticlesHandler1_13((Type)Types.VAR_INT));
            }
        });
        ((Protocol1_18_2To1_19)this.protocol).replaceClientbound(ClientboundPackets1_18.MERCHANT_OFFERS, (PacketHandler)new PacketHandlers(){

            public void register() {
                this.map((Type)Types.VAR_INT);
                this.handler(wrapper -> {
                    int size = ((Short)wrapper.read((Type)Types.UNSIGNED_BYTE)).shortValue();
                    wrapper.write((Type)Types.VAR_INT, (Object)size);
                    for (int i = 0; i < size; ++i) {
                        ItemPacketRewriter1_19.this.handleItemToClient(wrapper.user(), (Item)wrapper.passthrough(Types.ITEM1_13_2));
                        ItemPacketRewriter1_19.this.handleItemToClient(wrapper.user(), (Item)wrapper.passthrough(Types.ITEM1_13_2));
                        if (((Boolean)wrapper.read((Type)Types.BOOLEAN)).booleanValue()) {
                            ItemPacketRewriter1_19.this.handleItemToClient(wrapper.user(), (Item)wrapper.passthrough(Types.ITEM1_13_2));
                        } else {
                            wrapper.write(Types.ITEM1_13_2, null);
                        }
                        wrapper.passthrough((Type)Types.BOOLEAN);
                        wrapper.passthrough((Type)Types.INT);
                        wrapper.passthrough((Type)Types.INT);
                        wrapper.passthrough((Type)Types.INT);
                        wrapper.passthrough((Type)Types.INT);
                        wrapper.passthrough((Type)Types.FLOAT);
                        wrapper.passthrough((Type)Types.INT);
                    }
                });
            }
        });
        ((Protocol1_18_2To1_19)this.protocol).registerServerbound(ServerboundPackets1_19.PLAYER_ACTION, (PacketHandler)new PacketHandlers(){

            public void register() {
                this.map((Type)Types.VAR_INT);
                this.map(Types.BLOCK_POSITION1_14);
                this.map((Type)Types.UNSIGNED_BYTE);
                this.handler(ItemPacketRewriter1_19.this.sequenceHandler());
            }
        });
        ((Protocol1_18_2To1_19)this.protocol).registerServerbound(ServerboundPackets1_19.USE_ITEM_ON, (PacketHandler)new PacketHandlers(){

            public void register() {
                this.map((Type)Types.VAR_INT);
                this.map(Types.BLOCK_POSITION1_14);
                this.map((Type)Types.VAR_INT);
                this.map((Type)Types.FLOAT);
                this.map((Type)Types.FLOAT);
                this.map((Type)Types.FLOAT);
                this.map((Type)Types.BOOLEAN);
                this.handler(ItemPacketRewriter1_19.this.sequenceHandler());
            }
        });
        ((Protocol1_18_2To1_19)this.protocol).registerServerbound(ServerboundPackets1_19.USE_ITEM, (PacketHandler)new PacketHandlers(){

            public void register() {
                this.map((Type)Types.VAR_INT);
                this.handler(ItemPacketRewriter1_19.this.sequenceHandler());
            }
        });
        new RecipeRewriter(this.protocol).register((ClientboundPacketType)ClientboundPackets1_18.UPDATE_RECIPES);
    }

    private PacketHandler sequenceHandler() {
        return wrapper -> {
            int sequence = (Integer)wrapper.read((Type)Types.VAR_INT);
            AckSequenceProvider provider = (AckSequenceProvider)Via.getManager().getProviders().get(AckSequenceProvider.class);
            provider.handleSequence(wrapper.user(), sequence);
        };
    }
}

