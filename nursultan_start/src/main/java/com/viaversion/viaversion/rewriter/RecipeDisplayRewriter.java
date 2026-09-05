/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.viaversion.api.data.FullMappings
 *  com.viaversion.viaversion.api.data.MappingData
 *  com.viaversion.viaversion.api.minecraft.HolderSet
 *  com.viaversion.viaversion.api.minecraft.item.Item
 *  com.viaversion.viaversion.api.protocol.Protocol
 *  com.viaversion.viaversion.api.protocol.packet.ClientboundPacketType
 *  com.viaversion.viaversion.api.protocol.packet.PacketWrapper
 *  com.viaversion.viaversion.api.rewriter.ItemRewriter
 *  com.viaversion.viaversion.api.type.Type
 *  com.viaversion.viaversion.api.type.Types
 *  com.viaversion.viaversion.rewriter.RecipeDisplayRewriter$SlotDisplayConsumer
 */
package com.viaversion.viaversion.rewriter;

import com.viaversion.viaversion.api.data.FullMappings;
import com.viaversion.viaversion.api.data.MappingData;
import com.viaversion.viaversion.api.minecraft.HolderSet;
import com.viaversion.viaversion.api.minecraft.item.Item;
import com.viaversion.viaversion.api.protocol.Protocol;
import com.viaversion.viaversion.api.protocol.packet.ClientboundPacketType;
import com.viaversion.viaversion.api.protocol.packet.PacketWrapper;
import com.viaversion.viaversion.api.rewriter.ItemRewriter;
import com.viaversion.viaversion.api.type.Type;
import com.viaversion.viaversion.api.type.Types;
import com.viaversion.viaversion.rewriter.RecipeDisplayRewriter;
import com.viaversion.viaversion.util.Key;
import java.util.HashMap;
import java.util.Map;

public class RecipeDisplayRewriter<C extends ClientboundPacketType> {
    protected final Map<String, SlotDisplayConsumer> slotDisplayHandlers = new HashMap<String, SlotDisplayConsumer>();
    protected final Protocol<C, ?, ?, ?> protocol;

    public RecipeDisplayRewriter(Protocol<C, ?, ?, ?> protocol) {
        this.protocol = protocol;
        this.slotDisplayHandlers.put("with_any_potion", this::handleSlotDisplay);
        this.slotDisplayHandlers.put("only_with_component", this::handleOnlyWithComponentSlotDisplay);
        this.slotDisplayHandlers.put("item", this::handleItemId);
        this.slotDisplayHandlers.put("item_stack", this::handleItem);
        this.slotDisplayHandlers.put("tag", wrapper -> wrapper.passthrough(Types.STRING));
        this.slotDisplayHandlers.put("dyed", this::handleDyedSlotDisplay);
        this.slotDisplayHandlers.put("smithing_trim", this::handleSmithingTrimSlotDisplay);
        this.slotDisplayHandlers.put("with_remainder", this::handleWithRemainderSlotDisplay);
        this.slotDisplayHandlers.put("composite", this::handleSlotDisplayList);
    }

    public void registerPlaceGhostRecipe(C packetType) {
        this.protocol.registerClientbound(packetType, wrapper -> {
            wrapper.passthrough((Type)Types.VAR_INT);
            this.handleRecipeDisplay(wrapper);
        });
    }

    public void registerRecipeBookAdd(C packetType) {
        this.protocol.registerClientbound(packetType, wrapper -> {
            int size = (Integer)wrapper.passthrough((Type)Types.VAR_INT);
            for (int i = 0; i < size; ++i) {
                wrapper.passthrough((Type)Types.VAR_INT);
                this.handleRecipeDisplay(wrapper);
                wrapper.passthrough((Type)Types.OPTIONAL_VAR_INT);
                wrapper.passthrough((Type)Types.VAR_INT);
                if (((Boolean)wrapper.passthrough((Type)Types.BOOLEAN)).booleanValue()) {
                    int ingredientsSize = (Integer)wrapper.passthrough((Type)Types.VAR_INT);
                    for (int j = 0; j < ingredientsSize; ++j) {
                        this.handleIngredient(wrapper);
                    }
                }
                wrapper.passthrough((Type)Types.BYTE);
            }
        });
    }

    public void registerUpdateRecipes(C packetType) {
        this.protocol.registerClientbound(packetType, wrapper -> {
            int size = (Integer)wrapper.passthrough((Type)Types.VAR_INT);
            for (int i = 0; i < size; ++i) {
                wrapper.passthrough(Types.STRING);
                this.rewriteItemIds((int[])wrapper.passthrough(Types.VAR_INT_ARRAY_PRIMITIVE));
            }
            int stonecutterRecipesSize = (Integer)wrapper.passthrough((Type)Types.VAR_INT);
            for (int i = 0; i < stonecutterRecipesSize; ++i) {
                this.handleIngredient(wrapper);
                this.handleSlotDisplay(wrapper);
            }
        });
    }

    protected void handleSmithingTrimSlotDisplay(PacketWrapper wrapper) {
        this.handleSlotDisplay(wrapper);
        this.handleSlotDisplay(wrapper);
        this.handleSlotDisplay(wrapper);
    }

    protected void handleOnlyWithComponentSlotDisplay(PacketWrapper wrapper) {
        this.handleSlotDisplay(wrapper);
        int mappedDataComponentType = this.protocol.getMappingData().getDataComponentSerializerMappings().getNewIdOrDefault(((Integer)wrapper.read((Type)Types.VAR_INT)).intValue(), 0);
        wrapper.write((Type)Types.VAR_INT, (Object)mappedDataComponentType);
    }

    protected void handleWithRemainderSlotDisplay(PacketWrapper wrapper) {
        this.handleSlotDisplay(wrapper);
        this.handleSlotDisplay(wrapper);
    }

    protected void handleShapeless(PacketWrapper wrapper) {
        this.handleSlotDisplayList(wrapper);
        this.handleSlotDisplay(wrapper);
        this.handleSlotDisplay(wrapper);
    }

    protected void handleStoneCutter(PacketWrapper wrapper) {
        this.handleSlotDisplay(wrapper);
        this.handleSlotDisplay(wrapper);
        this.handleSlotDisplay(wrapper);
    }

    protected void handleSlotDisplay(PacketWrapper wrapper) {
        int type;
        FullMappings mappings = this.protocol.getMappingData().getSlotDisplayMappings();
        int mappedType = mappings.getNewId(type = ((Integer)wrapper.read((Type)Types.VAR_INT)).intValue());
        if (mappedType != -1) {
            wrapper.write((Type)Types.VAR_INT, (Object)mappedType);
            this.runSlotDisplayHandler(wrapper, mappings, type);
        } else {
            wrapper.write((Type)Types.VAR_INT, (Object)0);
            wrapper.consumeReadsOnly(() -> this.runSlotDisplayHandler(wrapper, mappings, type));
        }
    }

    protected int rewriteItemId(int id) {
        MappingData mappingData = this.protocol.getMappingData();
        if (mappingData != null && mappingData.getItemMappings() != null) {
            return mappingData.getItemMappings().getNewIdOrDefault(id, id);
        }
        return id;
    }

    protected void rewriteItemIds(int[] ids) {
        for (int i = 0; i < ids.length; ++i) {
            int id = ids[i];
            ids[i] = this.rewriteItemId(id);
        }
    }

    protected void handleFurnace(PacketWrapper wrapper) {
        this.handleSlotDisplay(wrapper);
        this.handleSlotDisplay(wrapper);
        this.handleSlotDisplay(wrapper);
        this.handleSlotDisplay(wrapper);
        wrapper.passthrough((Type)Types.VAR_INT);
        wrapper.passthrough((Type)Types.FLOAT);
    }

    protected void handleShaped(PacketWrapper wrapper) {
        wrapper.passthrough((Type)Types.VAR_INT);
        wrapper.passthrough((Type)Types.VAR_INT);
        this.handleSlotDisplayList(wrapper);
        this.handleSlotDisplay(wrapper);
        this.handleSlotDisplay(wrapper);
    }

    protected void handleItemId(PacketWrapper wrapper) {
        int id = (Integer)wrapper.read((Type)Types.VAR_INT);
        wrapper.write((Type)Types.VAR_INT, (Object)this.rewriteItemId(id));
    }

    protected void handleIngredient(PacketWrapper wrapper) {
        HolderSet items = (HolderSet)wrapper.passthrough(Types.HOLDER_SET);
        if (items.hasTagKey()) {
            return;
        }
        int[] ids = items.ids();
        for (int i = 0; i < ids.length; ++i) {
            ids[i] = this.rewriteItemId(ids[i]);
        }
    }

    protected void handleSmithing(PacketWrapper wrapper) {
        this.handleSlotDisplay(wrapper);
        this.handleSlotDisplay(wrapper);
        this.handleSlotDisplay(wrapper);
        this.handleSlotDisplay(wrapper);
        this.handleSlotDisplay(wrapper);
    }

    private void runSlotDisplayHandler(PacketWrapper wrapper, FullMappings mappings, int type) {
        String identifier = mappings.identifier(type);
        SlotDisplayConsumer handler = this.slotDisplayHandlers.get(Key.stripMinecraftNamespace(identifier));
        if (handler != null) {
            handler.accept(wrapper);
        }
    }

    protected void handleSlotDisplayList(PacketWrapper wrapper) {
        int size = (Integer)wrapper.passthrough((Type)Types.VAR_INT);
        for (int i = 0; i < size; ++i) {
            this.handleSlotDisplay(wrapper);
        }
    }

    protected void handleRecipeDisplay(PacketWrapper wrapper) {
        int type = (Integer)wrapper.passthrough((Type)Types.VAR_INT);
        switch (type) {
            case 0: {
                this.handleShapeless(wrapper);
                break;
            }
            case 1: {
                this.handleShaped(wrapper);
                break;
            }
            case 2: {
                this.handleFurnace(wrapper);
                break;
            }
            case 3: {
                this.handleStoneCutter(wrapper);
                break;
            }
            case 4: {
                this.handleSmithing(wrapper);
            }
        }
    }

    protected void handleDyedSlotDisplay(PacketWrapper wrapper) {
        this.handleSlotDisplay(wrapper);
        this.handleSlotDisplay(wrapper);
    }

    protected void handleItem(PacketWrapper wrapper) {
        ItemRewriter itemRewriter = this.protocol.getItemRewriter();
        Item item = (Item)wrapper.read(itemRewriter.itemTemplateType());
        itemRewriter.handleItemToClient(wrapper.user(), item);
        wrapper.write(itemRewriter.mappedItemTemplateType(), (Object)item);
    }
}

