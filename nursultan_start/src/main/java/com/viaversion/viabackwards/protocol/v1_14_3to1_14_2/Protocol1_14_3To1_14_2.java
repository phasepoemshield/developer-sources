/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.viabackwards.api.BackwardsProtocol
 *  com.viaversion.viaversion.api.protocol.Protocol
 *  com.viaversion.viaversion.api.protocol.packet.ClientboundPacketType
 *  com.viaversion.viaversion.api.type.Type
 *  com.viaversion.viaversion.api.type.Types
 *  com.viaversion.viaversion.protocols.v1_13_2to1_14.packet.ClientboundPackets1_14
 *  com.viaversion.viaversion.protocols.v1_13_2to1_14.packet.ServerboundPackets1_14
 *  com.viaversion.viaversion.rewriter.RecipeRewriter
 *  com.viaversion.viaversion.util.Key
 */
package com.viaversion.viabackwards.protocol.v1_14_3to1_14_2;

import com.viaversion.viabackwards.api.BackwardsProtocol;
import com.viaversion.viaversion.api.protocol.Protocol;
import com.viaversion.viaversion.api.protocol.packet.ClientboundPacketType;
import com.viaversion.viaversion.api.type.Type;
import com.viaversion.viaversion.api.type.Types;
import com.viaversion.viaversion.protocols.v1_13_2to1_14.packet.ClientboundPackets1_14;
import com.viaversion.viaversion.protocols.v1_13_2to1_14.packet.ServerboundPackets1_14;
import com.viaversion.viaversion.rewriter.RecipeRewriter;
import com.viaversion.viaversion.util.Key;

public class Protocol1_14_3To1_14_2
extends BackwardsProtocol<ClientboundPackets1_14, ClientboundPackets1_14, ServerboundPackets1_14, ServerboundPackets1_14> {
    public Protocol1_14_3To1_14_2() {
        super(ClientboundPackets1_14.class, ClientboundPackets1_14.class, ServerboundPackets1_14.class, ServerboundPackets1_14.class);
    }

    protected void registerPackets() {
        this.registerClientbound((ClientboundPacketType)ClientboundPackets1_14.MERCHANT_OFFERS, wrapper -> {
            wrapper.passthrough((Type)Types.VAR_INT);
            int size = ((Short)wrapper.passthrough((Type)Types.UNSIGNED_BYTE)).shortValue();
            for (int i = 0; i < size; ++i) {
                wrapper.passthrough(Types.ITEM1_13_2);
                wrapper.passthrough(Types.ITEM1_13_2);
                if (((Boolean)wrapper.passthrough((Type)Types.BOOLEAN)).booleanValue()) {
                    wrapper.passthrough(Types.ITEM1_13_2);
                }
                wrapper.passthrough((Type)Types.BOOLEAN);
                wrapper.passthrough((Type)Types.INT);
                wrapper.passthrough((Type)Types.INT);
                wrapper.passthrough((Type)Types.INT);
                wrapper.passthrough((Type)Types.INT);
                wrapper.passthrough((Type)Types.FLOAT);
            }
            wrapper.passthrough((Type)Types.VAR_INT);
            wrapper.passthrough((Type)Types.VAR_INT);
            wrapper.passthrough((Type)Types.BOOLEAN);
            wrapper.read((Type)Types.BOOLEAN);
        });
        RecipeRewriter recipeHandler = new RecipeRewriter((Protocol)this);
        this.registerClientbound((ClientboundPacketType)ClientboundPackets1_14.UPDATE_RECIPES, wrapper -> {
            int size = (Integer)wrapper.passthrough((Type)Types.VAR_INT);
            int deleted = 0;
            for (int i = 0; i < size; ++i) {
                String fullType = (String)wrapper.read(Types.STRING);
                String type = Key.stripMinecraftNamespace((String)fullType);
                String id = (String)wrapper.read(Types.STRING);
                if (type.equals("crafting_special_repairitem")) {
                    ++deleted;
                    continue;
                }
                wrapper.write(Types.STRING, (Object)fullType);
                wrapper.write(Types.STRING, (Object)id);
                recipeHandler.handleRecipeType(wrapper, type);
            }
            wrapper.set((Type)Types.VAR_INT, 0, (Object)(size - deleted));
        });
    }
}

