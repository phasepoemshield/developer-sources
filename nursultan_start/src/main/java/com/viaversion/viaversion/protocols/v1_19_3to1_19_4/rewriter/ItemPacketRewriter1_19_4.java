/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.viaversion.api.protocol.Protocol
 *  com.viaversion.viaversion.api.protocol.packet.PacketWrapper
 *  com.viaversion.viaversion.api.protocol.remapper.PacketHandler
 *  com.viaversion.viaversion.api.protocol.remapper.PacketHandlers
 *  com.viaversion.viaversion.api.type.Type
 *  com.viaversion.viaversion.api.type.Types
 *  com.viaversion.viaversion.rewriter.ItemRewriter
 */
package com.viaversion.viaversion.protocols.v1_19_3to1_19_4.rewriter;

import com.viaversion.viaversion.api.protocol.Protocol;
import com.viaversion.viaversion.api.protocol.packet.PacketWrapper;
import com.viaversion.viaversion.api.protocol.remapper.PacketHandler;
import com.viaversion.viaversion.api.protocol.remapper.PacketHandlers;
import com.viaversion.viaversion.api.type.Type;
import com.viaversion.viaversion.api.type.Types;
import com.viaversion.viaversion.protocols.v1_19_1to1_19_3.packet.ClientboundPackets1_19_3;
import com.viaversion.viaversion.protocols.v1_19_1to1_19_3.rewriter.RecipeRewriter1_19_3;
import com.viaversion.viaversion.protocols.v1_19_3to1_19_4.Protocol1_19_3To1_19_4;
import com.viaversion.viaversion.protocols.v1_19_3to1_19_4.packet.ServerboundPackets1_19_4;
import com.viaversion.viaversion.rewriter.ItemRewriter;

public final class ItemPacketRewriter1_19_4
extends ItemRewriter<ClientboundPackets1_19_3, ServerboundPackets1_19_4, Protocol1_19_3To1_19_4> {
    public ItemPacketRewriter1_19_4(Protocol1_19_3To1_19_4 protocol) {
        super((Protocol)protocol, Types.ITEM1_13_2, Types.ITEM1_13_2_ARRAY);
    }

    public void registerPackets() {
        ((Protocol1_19_3To1_19_4)this.protocol).replaceClientbound(ClientboundPackets1_19_3.LEVEL_EVENT, (PacketHandler)new PacketHandlers(){

            public void register() {
                this.map((Type)Types.INT);
                this.map(Types.BLOCK_POSITION1_14);
                this.map((Type)Types.INT);
                this.handler(wrapper -> {
                    int id = (Integer)wrapper.get((Type)Types.INT, 0);
                    int data = (Integer)wrapper.get((Type)Types.INT, 1);
                    if (id == 1010) {
                        if (data >= 1092 && data <= 1106) {
                            wrapper.set((Type)Types.INT, 1, (Object)((Protocol1_19_3To1_19_4)ItemPacketRewriter1_19_4.this.protocol).getMappingData().getNewItemId(data));
                        } else {
                            wrapper.set((Type)Types.INT, 0, (Object)1011);
                            wrapper.set((Type)Types.INT, 1, (Object)0);
                        }
                    } else if (id == 2001) {
                        wrapper.set((Type)Types.INT, 1, (Object)((Protocol1_19_3To1_19_4)ItemPacketRewriter1_19_4.this.protocol).getMappingData().getNewBlockStateId(data));
                    }
                });
            }
        });
        ((Protocol1_19_3To1_19_4)this.protocol).registerClientbound(ClientboundPackets1_19_3.OPEN_SCREEN, (PacketHandler)new PacketHandlers(){

            public void register() {
                this.map((Type)Types.VAR_INT);
                this.map((Type)Types.VAR_INT);
                this.map(Types.COMPONENT);
                this.handler(wrapper -> {
                    int windowType = (Integer)wrapper.get((Type)Types.VAR_INT, 1);
                    if (windowType >= 21) {
                        wrapper.set((Type)Types.VAR_INT, 1, (Object)(windowType + 1));
                    }
                });
            }
        });
        new RecipeRewriter1_19_3<ClientboundPackets1_19_3>(this.protocol){

            @Override
            public void handleCraftingShaped(PacketWrapper wrapper) {
                super.handleCraftingShaped(wrapper);
                wrapper.write((Type)Types.BOOLEAN, (Object)true);
            }
        }.register(ClientboundPackets1_19_3.UPDATE_RECIPES);
    }
}

