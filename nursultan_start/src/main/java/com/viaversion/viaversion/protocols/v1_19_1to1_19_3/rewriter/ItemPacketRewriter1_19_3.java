/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.viaversion.api.minecraft.item.Item
 *  com.viaversion.viaversion.api.protocol.Protocol
 *  com.viaversion.viaversion.api.protocol.remapper.PacketHandler
 *  com.viaversion.viaversion.api.protocol.remapper.PacketHandlers
 *  com.viaversion.viaversion.api.type.Type
 *  com.viaversion.viaversion.api.type.Types
 *  com.viaversion.viaversion.rewriter.ItemRewriter
 *  com.viaversion.viaversion.rewriter.RecipeRewriter
 *  com.viaversion.viaversion.util.Key
 */
package com.viaversion.viaversion.protocols.v1_19_1to1_19_3.rewriter;

import com.viaversion.viaversion.api.minecraft.item.Item;
import com.viaversion.viaversion.api.protocol.Protocol;
import com.viaversion.viaversion.api.protocol.remapper.PacketHandler;
import com.viaversion.viaversion.api.protocol.remapper.PacketHandlers;
import com.viaversion.viaversion.api.type.Type;
import com.viaversion.viaversion.api.type.Types;
import com.viaversion.viaversion.protocols.v1_19_1to1_19_3.Protocol1_19_1To1_19_3;
import com.viaversion.viaversion.protocols.v1_19_1to1_19_3.packet.ServerboundPackets1_19_3;
import com.viaversion.viaversion.protocols.v1_19to1_19_1.packet.ClientboundPackets1_19_1;
import com.viaversion.viaversion.rewriter.ItemRewriter;
import com.viaversion.viaversion.rewriter.RecipeRewriter;
import com.viaversion.viaversion.util.Key;

public final class ItemPacketRewriter1_19_3
extends ItemRewriter<ClientboundPackets1_19_1, ServerboundPackets1_19_3, Protocol1_19_1To1_19_3> {
    private static final int MISC_CRAFTING_BOOK_CATEGORY = 0;

    public ItemPacketRewriter1_19_3(Protocol1_19_1To1_19_3 protocol) {
        super((Protocol)protocol, Types.ITEM1_13_2, Types.ITEM1_13_2_ARRAY);
    }

    public void registerPackets() {
        RecipeRewriter recipeRewriter = new RecipeRewriter(this.protocol);
        ((Protocol1_19_1To1_19_3)this.protocol).registerClientbound(ClientboundPackets1_19_1.UPDATE_RECIPES, wrapper -> {
            int size = (Integer)wrapper.passthrough((Type)Types.VAR_INT);
            block27: for (int i = 0; i < size; ++i) {
                String type = Key.stripMinecraftNamespace((String)((String)wrapper.passthrough(Types.STRING)));
                wrapper.passthrough(Types.STRING);
                switch (type) {
                    case "crafting_shapeless": {
                        wrapper.passthrough(Types.STRING);
                        wrapper.write((Type)Types.VAR_INT, (Object)0);
                        int ingredients = (Integer)wrapper.passthrough((Type)Types.VAR_INT);
                        for (int j = 0; j < ingredients; ++j) {
                            Item[] items;
                            for (Item item : items = (Item[])wrapper.passthrough(Types.ITEM1_13_2_ARRAY)) {
                                this.handleItemToClient(wrapper.user(), item);
                            }
                        }
                        this.handleItemToClient(wrapper.user(), (Item)wrapper.passthrough(Types.ITEM1_13_2));
                        continue block27;
                    }
                    case "crafting_shaped": {
                        int ingredients = (Integer)wrapper.passthrough((Type)Types.VAR_INT) * (Integer)wrapper.passthrough((Type)Types.VAR_INT);
                        wrapper.passthrough(Types.STRING);
                        wrapper.write((Type)Types.VAR_INT, (Object)0);
                        for (int j = 0; j < ingredients; ++j) {
                            Item[] items;
                            for (Item item : items = (Item[])wrapper.passthrough(Types.ITEM1_13_2_ARRAY)) {
                                this.handleItemToClient(wrapper.user(), item);
                            }
                        }
                        this.handleItemToClient(wrapper.user(), (Item)wrapper.passthrough(Types.ITEM1_13_2));
                        continue block27;
                    }
                    case "smelting": 
                    case "campfire_cooking": 
                    case "blasting": 
                    case "smoking": {
                        Item[] items;
                        wrapper.passthrough(Types.STRING);
                        wrapper.write((Type)Types.VAR_INT, (Object)0);
                        for (Item item : items = (Item[])wrapper.passthrough(Types.ITEM1_13_2_ARRAY)) {
                            this.handleItemToClient(wrapper.user(), item);
                        }
                        this.handleItemToClient(wrapper.user(), (Item)wrapper.passthrough(Types.ITEM1_13_2));
                        wrapper.passthrough((Type)Types.FLOAT);
                        wrapper.passthrough((Type)Types.VAR_INT);
                        continue block27;
                    }
                    case "crafting_special_armordye": 
                    case "crafting_special_bookcloning": 
                    case "crafting_special_mapcloning": 
                    case "crafting_special_mapextending": 
                    case "crafting_special_firework_rocket": 
                    case "crafting_special_firework_star": 
                    case "crafting_special_firework_star_fade": 
                    case "crafting_special_tippedarrow": 
                    case "crafting_special_bannerduplicate": 
                    case "crafting_special_shielddecoration": 
                    case "crafting_special_shulkerboxcoloring": 
                    case "crafting_special_suspiciousstew": 
                    case "crafting_special_repairitem": {
                        wrapper.write((Type)Types.VAR_INT, (Object)0);
                        continue block27;
                    }
                    default: {
                        recipeRewriter.handleRecipeType(wrapper, type);
                    }
                }
            }
        });
        ((Protocol1_19_1To1_19_3)this.protocol).registerClientbound(ClientboundPackets1_19_1.EXPLODE, (PacketHandler)new PacketHandlers(){

            public void register() {
                this.map((Type)Types.FLOAT, (Type)Types.DOUBLE);
                this.map((Type)Types.FLOAT, (Type)Types.DOUBLE);
                this.map((Type)Types.FLOAT, (Type)Types.DOUBLE);
            }
        });
    }
}

