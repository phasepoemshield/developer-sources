/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.viaversion.api.connection.UserConnection
 *  com.viaversion.viaversion.api.data.FullMappings
 *  com.viaversion.viaversion.api.minecraft.item.Item
 *  com.viaversion.viaversion.api.protocol.Protocol
 *  com.viaversion.viaversion.api.protocol.packet.ClientboundPacketType
 *  com.viaversion.viaversion.api.protocol.packet.PacketWrapper
 *  com.viaversion.viaversion.api.type.Type
 *  com.viaversion.viaversion.api.type.Types
 *  org.checkerframework.checker.nullness.qual.Nullable
 */
package com.viaversion.viaversion.rewriter;

import com.viaversion.viaversion.api.connection.UserConnection;
import com.viaversion.viaversion.api.data.FullMappings;
import com.viaversion.viaversion.api.minecraft.item.Item;
import com.viaversion.viaversion.api.protocol.Protocol;
import com.viaversion.viaversion.api.protocol.packet.ClientboundPacketType;
import com.viaversion.viaversion.api.protocol.packet.PacketWrapper;
import com.viaversion.viaversion.api.type.Type;
import com.viaversion.viaversion.api.type.Types;
import com.viaversion.viaversion.util.Key;
import java.util.HashMap;
import java.util.Map;
import org.checkerframework.checker.nullness.qual.Nullable;

public class RecipeRewriter<C extends ClientboundPacketType> {
    protected final Protocol<C, ?, ?, ?> protocol;
    protected final Map<String, RecipeConsumer> recipeHandlers = new HashMap<String, RecipeConsumer>();

    public RecipeRewriter(Protocol<C, ?, ?, ?> protocol) {
        this.protocol = protocol;
        this.recipeHandlers.put("crafting_shapeless", this::handleCraftingShapeless);
        this.recipeHandlers.put("crafting_shaped", this::handleCraftingShaped);
        this.recipeHandlers.put("smelting", this::handleSmelting);
        this.recipeHandlers.put("blasting", this::handleSmelting);
        this.recipeHandlers.put("smoking", this::handleSmelting);
        this.recipeHandlers.put("campfire_cooking", this::handleSmelting);
        this.recipeHandlers.put("stonecutting", this::handleStonecutting);
        this.recipeHandlers.put("smithing", this::handleSmithing);
        this.recipeHandlers.put("smithing_transform", this::handleSmithingTransform);
        this.recipeHandlers.put("smithing_trim", this::handleSmithingTrim);
        this.recipeHandlers.put("crafting_decorated_pot", this::handleSimpleRecipe);
    }

    public void register(C packetType) {
        this.protocol.registerClientbound(packetType, wrapper -> {
            int size = (Integer)wrapper.passthrough((Type)Types.VAR_INT);
            for (int i = 0; i < size; ++i) {
                String type = (String)wrapper.passthrough(Types.STRING);
                wrapper.passthrough(Types.STRING);
                this.handleRecipeType(wrapper, type);
            }
        });
    }

    protected Type<Item[]> mappedItemArrayType() {
        return this.itemArrayType();
    }

    protected Type<Item[]> itemArrayType() {
        return Types.ITEM1_13_2_ARRAY;
    }

    protected Type<Item> mappedItemType() {
        return this.itemType();
    }

    protected int rewrite(int itemId) {
        if (this.protocol.getMappingData() != null && this.protocol.getItemRewriter() != null) {
            return this.protocol.getMappingData().getNewItemId(itemId);
        }
        return itemId;
    }

    protected @Nullable Item rewrite(UserConnection connection, @Nullable Item item) {
        if (this.protocol.getItemRewriter() != null) {
            return this.protocol.getItemRewriter().handleItemToClient(connection, item);
        }
        return item;
    }

    public void handleCraftingShaped(PacketWrapper wrapper) {
        int ingredientsNo = (Integer)wrapper.passthrough((Type)Types.VAR_INT) * (Integer)wrapper.passthrough((Type)Types.VAR_INT);
        wrapper.passthrough(Types.STRING);
        for (int i = 0; i < ingredientsNo; ++i) {
            this.handleIngredient(wrapper);
        }
        this.handleResult(wrapper);
    }

    public void handleSmithingTransform(PacketWrapper wrapper) {
        this.handleIngredient(wrapper);
        this.handleIngredient(wrapper);
        this.handleIngredient(wrapper);
        this.handleResult(wrapper);
    }

    public void handleCraftingShapeless(PacketWrapper wrapper) {
        wrapper.passthrough(Types.STRING);
        this.handleIngredients(wrapper);
        this.handleResult(wrapper);
    }

    protected Type<Item> itemType() {
        return Types.ITEM1_13_2;
    }

    public void handleRecipeType(PacketWrapper wrapper, String type) {
        RecipeConsumer handler = this.recipeHandlers.get(Key.stripMinecraftNamespace(type));
        if (handler != null) {
            handler.accept(wrapper);
        }
    }

    public void handleSmithingTrim(PacketWrapper wrapper) {
        this.handleIngredient(wrapper);
        this.handleIngredient(wrapper);
        this.handleIngredient(wrapper);
    }

    public void handleSmelting(PacketWrapper wrapper) {
        wrapper.passthrough(Types.STRING);
        this.handleIngredient(wrapper);
        this.handleResult(wrapper);
        wrapper.passthrough((Type)Types.FLOAT);
        wrapper.passthrough((Type)Types.VAR_INT);
    }

    protected void handleIngredient(PacketWrapper wrapper) {
        Item[] items = (Item[])wrapper.passthroughAndMap(this.itemArrayType(), this.mappedItemArrayType());
        for (int i = 0; i < items.length; ++i) {
            Item item = items[i];
            items[i] = this.rewrite(wrapper.user(), item);
        }
    }

    public void register1_20_5(C packetType) {
        this.protocol.registerClientbound(packetType, wrapper -> {
            int size;
            int newSize = size = ((Integer)wrapper.passthrough((Type)Types.VAR_INT)).intValue();
            for (int i = 0; i < size; ++i) {
                int typeId;
                String recipeIdentifier = (String)wrapper.read(Types.STRING);
                FullMappings recipeSerializerMappings = this.protocol.getMappingData().getRecipeSerializerMappings();
                int mappedId = recipeSerializerMappings.getNewId(typeId = ((Integer)wrapper.read((Type)Types.VAR_INT)).intValue());
                if (mappedId != -1) {
                    wrapper.write(Types.STRING, (Object)recipeIdentifier);
                    wrapper.write((Type)Types.VAR_INT, (Object)mappedId);
                } else {
                    wrapper.set((Type)Types.VAR_INT, 0, (Object)(--newSize));
                }
                this.handleRecipeType(wrapper, Key.stripMinecraftNamespace(recipeSerializerMappings.identifier(typeId)));
            }
        });
    }

    public void handleStonecutting(PacketWrapper wrapper) {
        wrapper.passthrough(Types.STRING);
        this.handleIngredient(wrapper);
        this.handleResult(wrapper);
    }

    protected void handleResult(PacketWrapper wrapper) {
        Item result = this.rewrite(wrapper.user(), (Item)wrapper.read(this.itemType()));
        wrapper.write(this.mappedItemType(), (Object)result);
    }

    protected void handleIngredients(PacketWrapper wrapper) {
        int ingredients = (Integer)wrapper.passthrough((Type)Types.VAR_INT);
        for (int i = 0; i < ingredients; ++i) {
            this.handleIngredient(wrapper);
        }
    }

    public void handleSmithing(PacketWrapper wrapper) {
        this.handleIngredient(wrapper);
        this.handleIngredient(wrapper);
        this.handleResult(wrapper);
    }

    public void handleSimpleRecipe(PacketWrapper wrapper) {
        wrapper.passthrough((Type)Types.VAR_INT);
    }

    @FunctionalInterface
    public static interface RecipeConsumer {
        public void accept(PacketWrapper var1);
    }
}

