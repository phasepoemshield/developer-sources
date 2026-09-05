/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.viabackwards.api.BackwardsProtocol
 *  com.viaversion.viabackwards.api.rewriters.BackwardsItemRewriter
 *  com.viaversion.viaversion.api.minecraft.item.Item
 *  com.viaversion.viaversion.api.protocol.packet.ClientboundPacketType
 *  com.viaversion.viaversion.api.protocol.remapper.PacketHandler
 *  com.viaversion.viaversion.api.protocol.remapper.PacketHandlers
 *  com.viaversion.viaversion.api.type.Type
 *  com.viaversion.viaversion.api.type.Types
 *  com.viaversion.viaversion.protocols.v1_19_1to1_19_3.packet.ClientboundPackets1_19_3
 *  com.viaversion.viaversion.protocols.v1_19to1_19_1.packet.ServerboundPackets1_19_1
 *  com.viaversion.viaversion.rewriter.RecipeRewriter
 *  com.viaversion.viaversion.util.Key
 */
package com.viaversion.viabackwards.protocol.v1_19_3to1_19_1.rewriter;

import com.viaversion.viabackwards.api.BackwardsProtocol;
import com.viaversion.viabackwards.api.rewriters.BackwardsItemRewriter;
import com.viaversion.viabackwards.protocol.v1_19_3to1_19_1.Protocol1_19_3To1_19_1;
import com.viaversion.viaversion.api.minecraft.item.Item;
import com.viaversion.viaversion.api.protocol.packet.ClientboundPacketType;
import com.viaversion.viaversion.api.protocol.remapper.PacketHandler;
import com.viaversion.viaversion.api.protocol.remapper.PacketHandlers;
import com.viaversion.viaversion.api.type.Type;
import com.viaversion.viaversion.api.type.Types;
import com.viaversion.viaversion.protocols.v1_19_1to1_19_3.packet.ClientboundPackets1_19_3;
import com.viaversion.viaversion.protocols.v1_19to1_19_1.packet.ServerboundPackets1_19_1;
import com.viaversion.viaversion.rewriter.RecipeRewriter;
import com.viaversion.viaversion.util.Key;

public final class BlockItemPacketRewriter1_19_3
extends BackwardsItemRewriter<ClientboundPackets1_19_3, ServerboundPackets1_19_1, Protocol1_19_3To1_19_1> {
    public BlockItemPacketRewriter1_19_3(Protocol1_19_3To1_19_1 protocol) {
        super((BackwardsProtocol)protocol, Types.ITEM1_13_2, Types.ITEM1_13_2_ARRAY);
    }

    protected void registerPackets() {
        ((Protocol1_19_3To1_19_1)this.protocol).registerClientbound((ClientboundPacketType)ClientboundPackets1_19_3.EXPLODE, (PacketHandler)new PacketHandlers(){

            public void register() {
                this.map((Type)Types.DOUBLE, (Type)Types.FLOAT);
                this.map((Type)Types.DOUBLE, (Type)Types.FLOAT);
                this.map((Type)Types.DOUBLE, (Type)Types.FLOAT);
            }
        });
        RecipeRewriter recipeRewriter = new RecipeRewriter(this.protocol);
        ((Protocol1_19_3To1_19_1)this.protocol).registerClientbound((ClientboundPacketType)ClientboundPackets1_19_3.UPDATE_RECIPES, wrapper -> {
            int size = (Integer)wrapper.passthrough((Type)Types.VAR_INT);
            block27: for (int i = 0; i < size; ++i) {
                String type = Key.stripMinecraftNamespace((String)((String)wrapper.passthrough(Types.STRING)));
                wrapper.passthrough(Types.STRING);
                switch (type) {
                    case "crafting_shapeless": {
                        int k;
                        Item[] items;
                        int j;
                        wrapper.passthrough(Types.STRING);
                        wrapper.read((Type)Types.VAR_INT);
                        int ingredients = (Integer)wrapper.passthrough((Type)Types.VAR_INT);
                        for (j = 0; j < ingredients; ++j) {
                            items = (Item[])wrapper.passthrough(Types.ITEM1_13_2_ARRAY);
                            for (k = 0; k < items.length; ++k) {
                                items[k] = this.handleItemToClient(wrapper.user(), items[k]);
                            }
                        }
                        this.passthroughClientboundItem(wrapper);
                        continue block27;
                    }
                    case "crafting_shaped": {
                        int k;
                        Item[] items;
                        int j;
                        int ingredients = (Integer)wrapper.passthrough((Type)Types.VAR_INT) * (Integer)wrapper.passthrough((Type)Types.VAR_INT);
                        wrapper.passthrough(Types.STRING);
                        wrapper.read((Type)Types.VAR_INT);
                        for (j = 0; j < ingredients; ++j) {
                            items = (Item[])wrapper.passthrough(Types.ITEM1_13_2_ARRAY);
                            for (k = 0; k < items.length; ++k) {
                                items[k] = this.handleItemToClient(wrapper.user(), items[k]);
                            }
                        }
                        this.passthroughClientboundItem(wrapper);
                        continue block27;
                    }
                    case "smelting": 
                    case "campfire_cooking": 
                    case "blasting": 
                    case "smoking": {
                        int j;
                        wrapper.passthrough(Types.STRING);
                        wrapper.read((Type)Types.VAR_INT);
                        Item[] items = (Item[])wrapper.passthrough(Types.ITEM1_13_2_ARRAY);
                        for (j = 0; j < items.length; ++j) {
                            items[j] = this.handleItemToClient(wrapper.user(), items[j]);
                        }
                        this.passthroughClientboundItem(wrapper);
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
                        wrapper.read((Type)Types.VAR_INT);
                        continue block27;
                    }
                    default: {
                        recipeRewriter.handleRecipeType(wrapper, type);
                    }
                }
            }
        });
    }
}

