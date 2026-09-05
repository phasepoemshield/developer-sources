/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.viaversion.api.data.ParticleMappings
 *  com.viaversion.viaversion.api.minecraft.item.Item
 *  com.viaversion.viaversion.api.protocol.Protocol
 *  com.viaversion.viaversion.api.protocol.packet.ClientboundPacketType
 *  com.viaversion.viaversion.api.protocol.remapper.PacketHandler
 *  com.viaversion.viaversion.api.protocol.remapper.PacketHandlers
 *  com.viaversion.viaversion.api.type.Type
 *  com.viaversion.viaversion.api.type.Types
 *  com.viaversion.viaversion.protocols.v1_16_4to1_17.packet.ServerboundPackets1_17
 *  com.viaversion.viaversion.rewriter.ItemRewriter
 *  com.viaversion.viaversion.rewriter.RecipeRewriter
 */
package com.viaversion.viaversion.protocols.v1_17_1to1_18.rewriter;

import com.viaversion.viaversion.api.data.ParticleMappings;
import com.viaversion.viaversion.api.minecraft.item.Item;
import com.viaversion.viaversion.api.protocol.Protocol;
import com.viaversion.viaversion.api.protocol.packet.ClientboundPacketType;
import com.viaversion.viaversion.api.protocol.remapper.PacketHandler;
import com.viaversion.viaversion.api.protocol.remapper.PacketHandlers;
import com.viaversion.viaversion.api.type.Type;
import com.viaversion.viaversion.api.type.Types;
import com.viaversion.viaversion.protocols.v1_16_4to1_17.packet.ServerboundPackets1_17;
import com.viaversion.viaversion.protocols.v1_17_1to1_18.Protocol1_17_1To1_18;
import com.viaversion.viaversion.protocols.v1_17to1_17_1.packet.ClientboundPackets1_17_1;
import com.viaversion.viaversion.rewriter.ItemRewriter;
import com.viaversion.viaversion.rewriter.RecipeRewriter;

public final class ItemPacketRewriter1_18
extends ItemRewriter<ClientboundPackets1_17_1, ServerboundPackets1_17, Protocol1_17_1To1_18> {
    public ItemPacketRewriter1_18(Protocol1_17_1To1_18 protocol) {
        super((Protocol)protocol, Types.ITEM1_13_2, Types.ITEM1_13_2_ARRAY);
    }

    public void registerPackets() {
        ((Protocol1_17_1To1_18)this.protocol).replaceClientbound(ClientboundPackets1_17_1.LEVEL_PARTICLES, (PacketHandler)new PacketHandlers(){

            public void register() {
                this.map((Type)Types.INT);
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
                    int id = (Integer)wrapper.get((Type)Types.INT, 0);
                    if (id == 2) {
                        wrapper.set((Type)Types.INT, 0, (Object)3);
                        wrapper.write((Type)Types.VAR_INT, (Object)7754);
                        return;
                    }
                    if (id == 3) {
                        wrapper.write((Type)Types.VAR_INT, (Object)7786);
                        return;
                    }
                    ParticleMappings mappings = ((Protocol1_17_1To1_18)ItemPacketRewriter1_18.this.protocol).getMappingData().getParticleMappings();
                    if (mappings.isBlockParticle(id)) {
                        int data = (Integer)wrapper.passthrough((Type)Types.VAR_INT);
                        wrapper.set((Type)Types.VAR_INT, 0, (Object)((Protocol1_17_1To1_18)ItemPacketRewriter1_18.this.protocol).getMappingData().getNewBlockStateId(data));
                    } else if (mappings.isItemParticle(id)) {
                        ItemPacketRewriter1_18.this.handleItemToClient(wrapper.user(), (Item)wrapper.passthrough(Types.ITEM1_13_2));
                    }
                    int newId = ((Protocol1_17_1To1_18)ItemPacketRewriter1_18.this.protocol).getMappingData().getNewParticleId(id);
                    if (newId != id) {
                        wrapper.set((Type)Types.INT, 0, (Object)newId);
                    }
                });
            }
        });
        new RecipeRewriter(this.protocol).register((ClientboundPacketType)ClientboundPackets1_17_1.UPDATE_RECIPES);
    }
}

