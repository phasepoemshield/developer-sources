/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.viabackwards.api.BackwardsProtocol
 *  com.viaversion.viabackwards.api.rewriters.BackwardsItemRewriter
 *  com.viaversion.viaversion.api.minecraft.item.Item
 *  com.viaversion.viaversion.api.protocol.packet.ClientboundPacketType
 *  com.viaversion.viaversion.api.protocol.packet.PacketWrapper
 *  com.viaversion.viaversion.api.protocol.remapper.PacketHandler
 *  com.viaversion.viaversion.api.protocol.remapper.PacketHandlers
 *  com.viaversion.viaversion.api.type.Type
 *  com.viaversion.viaversion.api.type.Types
 *  com.viaversion.viaversion.exception.InformativeException
 *  com.viaversion.viaversion.libs.gson.JsonElement
 *  com.viaversion.viaversion.protocols.v1_19_1to1_19_3.packet.ServerboundPackets1_19_3
 *  com.viaversion.viaversion.protocols.v1_19_1to1_19_3.rewriter.RecipeRewriter1_19_3
 *  com.viaversion.viaversion.protocols.v1_19_3to1_19_4.packet.ClientboundPackets1_19_4
 *  com.viaversion.viaversion.util.Key
 */
package com.viaversion.viabackwards.protocol.v1_19_4to1_19_3.rewriter;

import com.viaversion.viabackwards.api.BackwardsProtocol;
import com.viaversion.viabackwards.api.rewriters.BackwardsItemRewriter;
import com.viaversion.viabackwards.protocol.v1_19_4to1_19_3.Protocol1_19_4To1_19_3;
import com.viaversion.viaversion.api.minecraft.item.Item;
import com.viaversion.viaversion.api.protocol.packet.ClientboundPacketType;
import com.viaversion.viaversion.api.protocol.packet.PacketWrapper;
import com.viaversion.viaversion.api.protocol.remapper.PacketHandler;
import com.viaversion.viaversion.api.protocol.remapper.PacketHandlers;
import com.viaversion.viaversion.api.type.Type;
import com.viaversion.viaversion.api.type.Types;
import com.viaversion.viaversion.exception.InformativeException;
import com.viaversion.viaversion.libs.gson.JsonElement;
import com.viaversion.viaversion.protocols.v1_19_1to1_19_3.packet.ServerboundPackets1_19_3;
import com.viaversion.viaversion.protocols.v1_19_1to1_19_3.rewriter.RecipeRewriter1_19_3;
import com.viaversion.viaversion.protocols.v1_19_3to1_19_4.packet.ClientboundPackets1_19_4;
import com.viaversion.viaversion.util.Key;

public final class BlockItemPacketRewriter1_19_4
extends BackwardsItemRewriter<ClientboundPackets1_19_4, ServerboundPackets1_19_3, Protocol1_19_4To1_19_3> {
    public BlockItemPacketRewriter1_19_4(Protocol1_19_4To1_19_3 protocol) {
        super((BackwardsProtocol)protocol, Types.ITEM1_13_2, Types.ITEM1_13_2_ARRAY);
    }

    private static /* synthetic */ void lambda$registerPackets$0(RecipeRewriter1_19_3 recipeRewriter, PacketWrapper wrapper) throws InformativeException {
        int size;
        int newSize = size = ((Integer)wrapper.passthrough((Type)Types.VAR_INT)).intValue();
        for (int i = 0; i < size; ++i) {
            String type = (String)wrapper.read(Types.STRING);
            String cutType = Key.stripMinecraftNamespace((String)type);
            if (cutType.equals("smithing_transform") || cutType.equals("smithing_trim")) {
                --newSize;
                wrapper.read(Types.STRING);
                wrapper.read(Types.ITEM1_13_2_ARRAY);
                wrapper.read(Types.ITEM1_13_2_ARRAY);
                wrapper.read(Types.ITEM1_13_2_ARRAY);
                if (!cutType.equals("smithing_transform")) continue;
                wrapper.read(Types.ITEM1_13_2);
                continue;
            }
            if (cutType.equals("crafting_decorated_pot")) {
                --newSize;
                wrapper.read(Types.STRING);
                wrapper.read((Type)Types.VAR_INT);
                continue;
            }
            wrapper.write(Types.STRING, (Object)type);
            wrapper.passthrough(Types.STRING);
            recipeRewriter.handleRecipeType(wrapper, cutType);
        }
        wrapper.set((Type)Types.VAR_INT, 0, (Object)newSize);
    }

    public void registerPackets() {
        ((Protocol1_19_4To1_19_3)this.protocol).replaceClientbound((ClientboundPacketType)ClientboundPackets1_19_4.OPEN_SCREEN, (PacketHandler)new PacketHandlers(){

            public void register() {
                this.map((Type)Types.VAR_INT);
                this.map((Type)Types.VAR_INT);
                this.map(Types.COMPONENT);
                this.handler(wrapper -> {
                    int windowType = (Integer)wrapper.get((Type)Types.VAR_INT, 1);
                    if (windowType == 21) {
                        wrapper.cancel();
                    } else if (windowType > 21) {
                        wrapper.set((Type)Types.VAR_INT, 1, (Object)(windowType - 1));
                    }
                    ((Protocol1_19_4To1_19_3)BlockItemPacketRewriter1_19_4.this.protocol).getComponentRewriter().processText(wrapper.user(), (JsonElement)wrapper.get(Types.COMPONENT, 0));
                });
            }
        });
        RecipeRewriter1_19_3<ClientboundPackets1_19_4> recipeRewriter = new RecipeRewriter1_19_3<ClientboundPackets1_19_4>(this.protocol){

            public void handleCraftingShaped(PacketWrapper wrapper) {
                int ingredients = (Integer)wrapper.passthrough((Type)Types.VAR_INT) * (Integer)wrapper.passthrough((Type)Types.VAR_INT);
                wrapper.passthrough(Types.STRING);
                wrapper.passthrough((Type)Types.VAR_INT);
                for (int i = 0; i < ingredients; ++i) {
                    this.handleIngredient(wrapper);
                }
                this.rewrite(wrapper.user(), (Item)wrapper.passthrough(Types.ITEM1_13_2));
                wrapper.read((Type)Types.BOOLEAN);
            }
        };
        ((Protocol1_19_4To1_19_3)this.protocol).registerClientbound((ClientboundPacketType)ClientboundPackets1_19_4.UPDATE_RECIPES, arg_0 -> BlockItemPacketRewriter1_19_4.lambda$registerPackets$0((RecipeRewriter1_19_3)recipeRewriter, arg_0));
    }
}

