/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.viaversion.api.minecraft.item.Item
 *  com.viaversion.viaversion.api.protocol.Protocol
 *  com.viaversion.viaversion.api.protocol.packet.ClientboundPacketType
 *  com.viaversion.viaversion.api.protocol.packet.PacketWrapper
 *  com.viaversion.viaversion.api.protocol.remapper.PacketHandler
 *  com.viaversion.viaversion.api.protocol.remapper.PacketHandlers
 *  com.viaversion.viaversion.api.type.Type
 *  com.viaversion.viaversion.api.type.Types
 *  com.viaversion.viaversion.exception.InformativeException
 *  com.viaversion.viaversion.protocols.v1_12_2to1_13.packet.ClientboundPackets1_13
 *  com.viaversion.viaversion.protocols.v1_12_2to1_13.packet.ServerboundPackets1_13
 *  com.viaversion.viaversion.rewriter.ItemRewriter
 *  com.viaversion.viaversion.rewriter.RecipeRewriter
 *  com.viaversion.viaversion.util.Key
 */
package com.viaversion.viaversion.protocols.v1_13to1_13_1.rewriter;

import com.viaversion.viaversion.api.minecraft.item.Item;
import com.viaversion.viaversion.api.protocol.Protocol;
import com.viaversion.viaversion.api.protocol.packet.ClientboundPacketType;
import com.viaversion.viaversion.api.protocol.packet.PacketWrapper;
import com.viaversion.viaversion.api.protocol.remapper.PacketHandler;
import com.viaversion.viaversion.api.protocol.remapper.PacketHandlers;
import com.viaversion.viaversion.api.type.Type;
import com.viaversion.viaversion.api.type.Types;
import com.viaversion.viaversion.exception.InformativeException;
import com.viaversion.viaversion.protocols.v1_12_2to1_13.packet.ClientboundPackets1_13;
import com.viaversion.viaversion.protocols.v1_12_2to1_13.packet.ServerboundPackets1_13;
import com.viaversion.viaversion.protocols.v1_13to1_13_1.Protocol1_13To1_13_1;
import com.viaversion.viaversion.rewriter.ItemRewriter;
import com.viaversion.viaversion.rewriter.RecipeRewriter;
import com.viaversion.viaversion.util.Key;

public class ItemPacketRewriter1_13_1
extends ItemRewriter<ClientboundPackets1_13, ServerboundPackets1_13, Protocol1_13To1_13_1> {
    public ItemPacketRewriter1_13_1(Protocol1_13To1_13_1 protocol) {
        super((Protocol)protocol, Types.ITEM1_13, Types.ITEM1_13_SHORT_ARRAY);
    }

    private static /* synthetic */ void lambda$registerPackets$0(RecipeRewriter recipeRewriter, PacketWrapper wrapper) throws InformativeException {
        int size = (Integer)wrapper.passthrough((Type)Types.VAR_INT);
        for (int i = 0; i < size; ++i) {
            wrapper.passthrough(Types.STRING);
            String type = Key.stripMinecraftNamespace((String)((String)wrapper.passthrough(Types.STRING)));
            recipeRewriter.handleRecipeType(wrapper, type);
        }
    }

    public void registerPackets() {
        ((Protocol1_13To1_13_1)this.protocol).registerClientbound((ClientboundPacketType)ClientboundPackets1_13.CUSTOM_PAYLOAD, (PacketHandler)new PacketHandlers(){

            public void register() {
                this.map(Types.STRING);
                this.handlerSoftFail(wrapper -> {
                    String channel = Key.namespaced((String)((String)wrapper.get(Types.STRING, 0)));
                    if (channel.equals("minecraft:trader_list")) {
                        wrapper.passthrough((Type)Types.INT);
                        int size = ((Short)wrapper.passthrough((Type)Types.UNSIGNED_BYTE)).shortValue();
                        for (int i = 0; i < size; ++i) {
                            ItemPacketRewriter1_13_1.this.handleItemToClient(wrapper.user(), (Item)wrapper.passthrough(Types.ITEM1_13));
                            ItemPacketRewriter1_13_1.this.handleItemToClient(wrapper.user(), (Item)wrapper.passthrough(Types.ITEM1_13));
                            boolean secondItem = (Boolean)wrapper.passthrough((Type)Types.BOOLEAN);
                            if (secondItem) {
                                ItemPacketRewriter1_13_1.this.handleItemToClient(wrapper.user(), (Item)wrapper.passthrough(Types.ITEM1_13));
                            }
                            wrapper.passthrough((Type)Types.BOOLEAN);
                            wrapper.passthrough((Type)Types.INT);
                            wrapper.passthrough((Type)Types.INT);
                        }
                    }
                });
            }
        });
        RecipeRewriter<ClientboundPackets1_13> recipeRewriter = new RecipeRewriter<ClientboundPackets1_13>(this.protocol){

            protected Type<Item[]> itemArrayType() {
                return Types.ITEM1_13_ARRAY;
            }

            protected Type<Item> itemType() {
                return Types.ITEM1_13;
            }
        };
        ((Protocol1_13To1_13_1)this.protocol).registerClientbound((ClientboundPacketType)ClientboundPackets1_13.UPDATE_RECIPES, arg_0 -> ItemPacketRewriter1_13_1.lambda$registerPackets$0((RecipeRewriter)recipeRewriter, arg_0));
    }
}

