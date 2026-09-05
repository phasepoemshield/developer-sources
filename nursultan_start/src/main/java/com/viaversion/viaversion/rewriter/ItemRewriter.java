/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.nbt.tag.Tag
 *  com.viaversion.viaversion.api.connection.UserConnection
 *  com.viaversion.viaversion.api.data.FullMappings
 *  com.viaversion.viaversion.api.data.MappingData
 *  com.viaversion.viaversion.api.data.Mappings
 *  com.viaversion.viaversion.api.data.item.ItemHasher
 *  com.viaversion.viaversion.api.minecraft.item.HashedItem
 *  com.viaversion.viaversion.api.minecraft.item.Item
 *  com.viaversion.viaversion.api.protocol.Protocol
 *  com.viaversion.viaversion.api.protocol.packet.ClientboundPacketType
 *  com.viaversion.viaversion.api.protocol.packet.PacketWrapper
 *  com.viaversion.viaversion.api.protocol.packet.ServerboundPacketType
 *  com.viaversion.viaversion.api.protocol.remapper.PacketHandler
 *  com.viaversion.viaversion.api.protocol.remapper.PacketHandlers
 *  com.viaversion.viaversion.api.rewriter.ComponentRewriter
 *  com.viaversion.viaversion.api.rewriter.ItemRewriter
 *  com.viaversion.viaversion.api.rewriter.RewriterBase
 *  com.viaversion.viaversion.api.type.Type
 *  com.viaversion.viaversion.api.type.Types
 *  com.viaversion.viaversion.api.type.types.version.VersionedTypesHolder
 *  com.viaversion.viaversion.data.item.ItemHasherBase
 *  com.viaversion.viaversion.data.item.OriginalHashedItem
 *  com.viaversion.viaversion.libs.fastutil.ints.Int2IntMap
 *  com.viaversion.viaversion.libs.fastutil.ints.IntSet
 *  com.viaversion.viaversion.libs.gson.JsonElement
 *  com.viaversion.viaversion.util.Limit
 *  com.viaversion.viaversion.util.Rewritable
 *  org.checkerframework.checker.nullness.qual.Nullable
 */
package com.viaversion.viaversion.rewriter;

import com.viaversion.nbt.tag.Tag;
import com.viaversion.viaversion.api.connection.UserConnection;
import com.viaversion.viaversion.api.data.FullMappings;
import com.viaversion.viaversion.api.data.MappingData;
import com.viaversion.viaversion.api.data.Mappings;
import com.viaversion.viaversion.api.data.item.ItemHasher;
import com.viaversion.viaversion.api.minecraft.item.HashedItem;
import com.viaversion.viaversion.api.minecraft.item.Item;
import com.viaversion.viaversion.api.protocol.Protocol;
import com.viaversion.viaversion.api.protocol.packet.ClientboundPacketType;
import com.viaversion.viaversion.api.protocol.packet.PacketWrapper;
import com.viaversion.viaversion.api.protocol.packet.ServerboundPacketType;
import com.viaversion.viaversion.api.protocol.remapper.PacketHandler;
import com.viaversion.viaversion.api.protocol.remapper.PacketHandlers;
import com.viaversion.viaversion.api.rewriter.ComponentRewriter;
import com.viaversion.viaversion.api.rewriter.RewriterBase;
import com.viaversion.viaversion.api.type.Type;
import com.viaversion.viaversion.api.type.Types;
import com.viaversion.viaversion.api.type.types.version.VersionedTypesHolder;
import com.viaversion.viaversion.data.item.ItemHasherBase;
import com.viaversion.viaversion.data.item.OriginalHashedItem;
import com.viaversion.viaversion.libs.fastutil.ints.Int2IntMap;
import com.viaversion.viaversion.libs.fastutil.ints.IntSet;
import com.viaversion.viaversion.libs.gson.JsonElement;
import com.viaversion.viaversion.util.Limit;
import com.viaversion.viaversion.util.Rewritable;
import org.checkerframework.checker.nullness.qual.Nullable;

public class ItemRewriter<C extends ClientboundPacketType, S extends ServerboundPacketType, T extends Protocol<C, ?, ?, S>>
extends RewriterBase<T>
implements com.viaversion.viaversion.api.rewriter.ItemRewriter<T> {
    private final Type<Item> itemType;
    private final Type<Item> mappedItemType;
    private final Type<Item[]> itemArrayType;
    private final Type<Item[]> mappedItemArrayType;
    private final Type<Item> itemCostType;
    private final Type<Item> itemTemplateType;
    private final Type<Item> mappedItemTemplateType;
    private final Type<Item> mappedItemCostType;
    private final Type<Item> optionalItemCostType;
    private final Type<Item> mappedOptionalItemCostType;

    public ItemRewriter(T protocol, Type<Item> itemType, Type<Item[]> itemArrayType) {
        this(protocol, itemType, itemArrayType, itemType, itemArrayType);
    }

    public ItemRewriter(T protocol, Type<Item> itemType, Type<Item[]> itemArrayType, Type<Item> mappedItemType, Type<Item[]> mappedItemArrayType) {
        super(protocol);
        this.itemType = itemType;
        this.itemArrayType = itemArrayType;
        this.mappedItemType = mappedItemType;
        this.mappedItemArrayType = mappedItemArrayType;
        this.itemTemplateType = null;
        this.mappedItemTemplateType = null;
        this.itemCostType = null;
        this.mappedItemCostType = null;
        this.optionalItemCostType = null;
        this.mappedOptionalItemCostType = null;
    }

    public ItemRewriter(T protocol) {
        super(protocol);
        VersionedTypesHolder types = protocol.types();
        VersionedTypesHolder mappedTypes = protocol.mappedTypes();
        this.itemType = types.item();
        this.itemArrayType = types.itemArray();
        this.mappedItemType = mappedTypes.item();
        this.mappedItemArrayType = mappedTypes.itemArray();
        this.itemTemplateType = types.itemTemplate();
        this.mappedItemTemplateType = mappedTypes.itemTemplate();
        this.itemCostType = types.itemCost();
        this.mappedItemCostType = mappedTypes.itemCost();
        this.optionalItemCostType = types.optionalItemCost();
        this.mappedOptionalItemCostType = mappedTypes.optionalItemCost();
    }

    public void registerSetSlot1_21_2(C packetType) {
        this.registerSetSlot1_17_1(packetType, (Type<Number>)Types.VAR_INT);
    }

    private void registerSetContent1_17_1(C packetType, Type<? extends Number> containerIdType) {
        this.protocol.registerClientbound(packetType, wrapper -> {
            wrapper.passthrough(containerIdType);
            wrapper.passthrough((Type)Types.VAR_INT);
            Item[] items = (Item[])wrapper.passthroughAndMap(this.itemArrayType, this.mappedItemArrayType);
            for (int i = 0; i < items.length; ++i) {
                items[i] = this.handleItemToClientAndTrackHash(wrapper.user(), items[i]);
            }
            this.passthroughClientboundItemAndTrackHash(wrapper);
        });
    }

    public void registerSetContent1_17_1(C packetType) {
        this.registerSetContent1_17_1(packetType, (Type<Number>)Types.UNSIGNED_BYTE);
    }

    public void registerSetContent1_21_2(C packetType) {
        this.registerSetContent1_17_1(packetType, (Type<Number>)Types.VAR_INT);
    }

    private void registerSetSlot1_17_1(C packetType, Type<? extends Number> containerIdType) {
        this.protocol.registerClientbound(packetType, wrapper -> {
            wrapper.passthrough(containerIdType);
            wrapper.passthrough((Type)Types.VAR_INT);
            wrapper.passthrough((Type)Types.SHORT);
            this.passthroughClientboundItemAndTrackHash(wrapper);
        });
    }

    public void registerSetSlot1_17_1(C packetType) {
        this.registerSetSlot1_17_1(packetType, (Type<Number>)Types.BYTE);
    }

    public void registerSetPlayerInventory(C packetType) {
        this.protocol.registerClientbound(packetType, wrapper -> {
            wrapper.passthrough((Type)Types.VAR_INT);
            this.passthroughClientboundItemAndTrackHash(wrapper);
        });
    }

    public void registerSetCursorItem(C packetType) {
        this.protocol.registerClientbound(packetType, this::passthroughClientboundItemAndTrackHash);
    }

    public Type<Item[]> mappedItemArrayType() {
        return this.mappedItemArrayType;
    }

    public Type<Item> mappedItemTemplateType() {
        return this.mappedItemTemplateType;
    }

    public void registerMerchantOffers1_19(C packetType) {
        this.protocol.registerClientbound(packetType, wrapper -> {
            wrapper.passthrough((Type)Types.VAR_INT);
            int size = (Integer)wrapper.passthrough((Type)Types.VAR_INT);
            for (int i = 0; i < size; ++i) {
                this.passthroughClientboundItem(wrapper);
                this.passthroughClientboundItem(wrapper);
                this.passthroughClientboundItem(wrapper);
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

    public void registerSetEquipment(C packetType) {
        this.protocol.registerClientbound(packetType, wrapper -> {
            byte slot;
            wrapper.passthrough((Type)Types.VAR_INT);
            do {
                slot = (Byte)wrapper.passthrough((Type)Types.BYTE);
                this.passthroughClientboundItem(wrapper);
            } while (slot < 0);
        });
    }

    public void registerContainerSetData(C packetType) {
        if (this.protocol.getMappingData() == null || Mappings.isIntIdIdentity((Mappings)this.protocol.getMappingData().getEnchantmentMappings())) {
            return;
        }
        this.protocol.registerClientbound(packetType, wrapper -> {
            wrapper.passthrough((Type)Types.UNSIGNED_BYTE);
            short property = (Short)wrapper.passthrough((Type)Types.SHORT);
            if (property >= 4 && property <= 6) {
                short enchantmentId = (short)this.protocol.getMappingData().getEnchantmentMappings().getNewId((int)((Short)wrapper.read((Type)Types.SHORT)).shortValue());
                wrapper.write((Type)Types.SHORT, (Object)enchantmentId);
            }
        });
    }

    public void registerCooldown1_21_2(C packetType) {
        if (this.protocol.getMappingData() == null || Mappings.isFullIdentity((Mappings)this.protocol.getMappingData().getFullItemMappings())) {
            return;
        }
        this.protocol.registerClientbound(packetType, wrapper -> {
            String itemIdentifier = (String)wrapper.read(Types.STRING);
            if (itemIdentifier != null) {
                itemIdentifier = Rewritable.mappedIdentifier((FullMappings)this.protocol.getMappingData().getFullItemMappings(), (String)itemIdentifier);
            }
            wrapper.write(Types.STRING, (Object)itemIdentifier);
        });
    }

    public void registerAdvancements1_20_3(C packetType) {
        this.protocol.registerClientbound(packetType, wrapper -> {
            wrapper.passthrough((Type)Types.BOOLEAN);
            int size = (Integer)wrapper.passthrough((Type)Types.VAR_INT);
            for (int i = 0; i < size; ++i) {
                wrapper.passthrough(Types.STRING);
                wrapper.passthrough(Types.OPTIONAL_STRING);
                if (((Boolean)wrapper.passthrough((Type)Types.BOOLEAN)).booleanValue()) {
                    Tag title = (Tag)wrapper.passthrough(Types.TRUSTED_TAG);
                    Tag description = (Tag)wrapper.passthrough(Types.TRUSTED_TAG);
                    ComponentRewriter componentRewriter = this.protocol.getComponentRewriter();
                    if (componentRewriter != null) {
                        componentRewriter.processTag(wrapper.user(), title);
                        componentRewriter.processTag(wrapper.user(), description);
                    }
                    this.passthroughClientboundItemTemplate(wrapper);
                    wrapper.passthrough((Type)Types.VAR_INT);
                    int flags = (Integer)wrapper.passthrough((Type)Types.INT);
                    if ((flags & 1) != 0) {
                        wrapper.passthrough(Types.STRING);
                    }
                    wrapper.passthrough((Type)Types.FLOAT);
                    wrapper.passthrough((Type)Types.FLOAT);
                }
                int requirements = (Integer)wrapper.passthrough((Type)Types.VAR_INT);
                for (int array = 0; array < requirements; ++array) {
                    wrapper.passthrough(Types.STRING_ARRAY);
                }
                wrapper.passthrough((Type)Types.BOOLEAN);
            }
        });
    }

    public void registerSetEquippedItem(C packetType) {
        this.protocol.registerClientbound(packetType, wrapper -> {
            wrapper.passthrough((Type)Types.VAR_INT);
            wrapper.passthrough((Type)Types.VAR_INT);
            this.passthroughClientboundItem(wrapper);
        });
    }

    public void registerAdvancements(C packetType) {
        this.protocol.registerClientbound(packetType, wrapper -> {
            wrapper.passthrough((Type)Types.BOOLEAN);
            int size = (Integer)wrapper.passthrough((Type)Types.VAR_INT);
            for (int i = 0; i < size; ++i) {
                wrapper.passthrough(Types.STRING);
                wrapper.passthrough(Types.OPTIONAL_STRING);
                if (((Boolean)wrapper.passthrough((Type)Types.BOOLEAN)).booleanValue()) {
                    JsonElement title = (JsonElement)wrapper.passthrough(Types.COMPONENT);
                    JsonElement description = (JsonElement)wrapper.passthrough(Types.COMPONENT);
                    ComponentRewriter componentRewriter = this.protocol.getComponentRewriter();
                    if (componentRewriter != null) {
                        componentRewriter.processText(wrapper.user(), title);
                        componentRewriter.processText(wrapper.user(), description);
                    }
                    this.passthroughClientboundItem(wrapper);
                    wrapper.passthrough((Type)Types.VAR_INT);
                    int flags = (Integer)wrapper.passthrough((Type)Types.INT);
                    if ((flags & 1) != 0) {
                        wrapper.passthrough(Types.STRING);
                    }
                    wrapper.passthrough((Type)Types.FLOAT);
                    wrapper.passthrough((Type)Types.FLOAT);
                }
                wrapper.passthrough(Types.STRING_ARRAY);
                int arrayLength = (Integer)wrapper.passthrough((Type)Types.VAR_INT);
                for (int array = 0; array < arrayLength; ++array) {
                    wrapper.passthrough(Types.STRING_ARRAY);
                }
            }
        });
    }

    public void registerContainerClick(S packetType) {
        this.protocol.registerServerbound(packetType, wrapper -> {
            wrapper.passthrough((Type)Types.BYTE);
            wrapper.passthrough((Type)Types.SHORT);
            wrapper.passthrough((Type)Types.BYTE);
            wrapper.passthrough((Type)Types.SHORT);
            wrapper.passthrough((Type)Types.VAR_INT);
            wrapper.write(this.itemType, (Object)this.handleItemToServer(wrapper.user(), (Item)wrapper.read(this.mappedItemType)));
        });
    }

    protected void passthroughClientboundItem(PacketWrapper wrapper) {
        Item item = this.handleItemToClient(wrapper.user(), (Item)wrapper.read(this.itemType));
        wrapper.write(this.mappedItemType, (Object)item);
    }

    protected void passthroughHashedItem(PacketWrapper wrapper) {
        HashedItem item = this.handleHashedItem(wrapper.user(), (HashedItem)wrapper.read(Types.HASHED_ITEM));
        wrapper.write(Types.HASHED_ITEM, (Object)item);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    protected @Nullable Item handleItemToClientAndTrackHash(UserConnection connection, @Nullable Item item) {
        T itemHasher = this.itemHasher(connection);
        if (itemHasher == null) {
            return this.handleItemToClient(connection, item);
        }
        itemHasher.setProcessingClientboundInventoryPacket(true);
        try {
            Item item2 = this.handleItemToClient(connection, item);
            return item2;
        }
        finally {
            itemHasher.setProcessingClientboundInventoryPacket(false);
        }
    }

    public void registerCustomPayloadTradeList(C packetType) {
        this.protocol.registerClientbound(packetType, (PacketHandler)new PacketHandlers(){

            protected void register() {
                this.map(Types.STRING);
                this.handlerSoftFail(wrapper -> {
                    String channel = (String)wrapper.get(Types.STRING, 0);
                    if (channel.equals("MC|TrList")) {
                        ItemRewriter.this.handleTradeList(wrapper);
                    }
                });
            }
        });
    }

    protected void passthroughClientboundItemTemplate(PacketWrapper wrapper) {
        Item item = this.handleItemToClient(wrapper.user(), (Item)wrapper.read(this.itemTemplateType()));
        wrapper.write(this.mappedItemTemplateType(), (Object)item);
    }

    public @Nullable Item handleItemToClient(UserConnection connection, @Nullable Item item) {
        if (item == null) {
            return null;
        }
        if (this.protocol.getMappingData() != null && !Mappings.isIntIdIdentity((Mappings)this.protocol.getMappingData().getItemMappings())) {
            item.setIdentifier(this.protocol.getMappingData().getNewItemId(item.identifier()));
        }
        return item;
    }

    public void registerSetContent(C packetType) {
        this.protocol.registerClientbound(packetType, wrapper -> {
            wrapper.passthrough((Type)Types.UNSIGNED_BYTE);
            Item[] items = (Item[])wrapper.passthroughAndMap(this.itemArrayType, this.mappedItemArrayType);
            for (int i = 0; i < items.length; ++i) {
                items[i] = this.handleItemToClient(wrapper.user(), items[i]);
            }
        });
    }

    public HashedItem handleHashedItem(UserConnection connection, HashedItem item) {
        if (item instanceof OriginalHashedItem) {
            OriginalHashedItem restoredItem = (OriginalHashedItem)item;
            return restoredItem.backupTagName().equals(this.nbtTagName()) ? restoredItem.asRegularItem() : item;
        }
        MappingData mappingData = this.protocol.getMappingData();
        if (mappingData == null) {
            return item;
        }
        FullMappings dataComponentMappings = mappingData.getDataComponentSerializerMappings();
        if (dataComponentMappings != null) {
            if (!dataComponentMappings.isIdentity()) {
                this.updateHashedItemDataComponentIds(item, dataComponentMappings.inverse());
            }
            int customDataId = dataComponentMappings.id("custom_data");
            if (item.dataHashesById().containsKey(customDataId)) {
                int customDataHash = item.dataHashesById().get(customDataId);
                ItemHasherBase itemHasher = (ItemHasherBase)this.itemHasher(connection);
                OriginalHashedItem originalHashedItem = itemHasher.originalHashedItem(customDataHash, item);
                if (originalHashedItem != null) {
                    return originalHashedItem.backupTagName().equals(this.nbtTagName()) ? originalHashedItem.asRegularItem() : originalHashedItem;
                }
            }
        }
        if (mappingData.getItemMappings() != null) {
            item.setIdentifier(mappingData.getOldItemId(item.identifier()));
        }
        return item;
    }

    public void registerSetSlot(C packetType) {
        this.protocol.registerClientbound(packetType, wrapper -> {
            wrapper.passthrough((Type)Types.BYTE);
            wrapper.passthrough((Type)Types.SHORT);
            this.passthroughClientboundItem(wrapper);
        });
    }

    public Type<Item[]> itemArrayType() {
        return this.itemArrayType;
    }

    public void handleTradeList(PacketWrapper wrapper) {
        wrapper.passthrough((Type)Types.INT);
        int size = ((Short)wrapper.passthrough((Type)Types.UNSIGNED_BYTE)).shortValue();
        for (int i = 0; i < size; ++i) {
            this.passthroughClientboundItem(wrapper);
            this.passthroughClientboundItem(wrapper);
            if (((Boolean)wrapper.passthrough((Type)Types.BOOLEAN)).booleanValue()) {
                this.passthroughClientboundItem(wrapper);
            }
            wrapper.passthrough((Type)Types.BOOLEAN);
            wrapper.passthrough((Type)Types.INT);
            wrapper.passthrough((Type)Types.INT);
        }
    }

    public void registerCooldown(C packetType) {
        if (this.protocol.getMappingData() == null || Mappings.isIntIdIdentity((Mappings)this.protocol.getMappingData().getItemMappings())) {
            return;
        }
        this.protocol.registerClientbound(packetType, wrapper -> {
            int itemId = (Integer)wrapper.read((Type)Types.VAR_INT);
            wrapper.write((Type)Types.VAR_INT, (Object)this.protocol.getMappingData().getNewItemId(itemId));
        });
    }

    public Type<Item> mappedItemType() {
        return this.mappedItemType;
    }

    public void registerOpenScreen(C packetType) {
        if ((this.protocol.getMappingData() == null || Mappings.isIntIdIdentity((Mappings)this.protocol.getMappingData().getMenuMappings())) && this.protocol.getComponentRewriter() == null) {
            return;
        }
        this.protocol.registerClientbound(packetType, wrapper -> {
            wrapper.passthrough((Type)Types.VAR_INT);
            int windowType = (Integer)wrapper.read((Type)Types.VAR_INT);
            if (this.protocol.getMappingData() != null && this.protocol.getMappingData().getMenuMappings() != null && (windowType = this.protocol.getMappingData().getMenuMappings().getNewId(windowType)) == -1) {
                wrapper.cancel();
                return;
            }
            wrapper.write((Type)Types.VAR_INT, (Object)windowType);
            if (this.protocol.getComponentRewriter() != null) {
                this.protocol.getComponentRewriter().passthroughAndProcess(wrapper);
            }
        });
    }

    public Type<Item> itemTemplateType() {
        return this.itemTemplateType;
    }

    public @Nullable Item handleItemToServer(UserConnection connection, @Nullable Item item) {
        if (item == null) {
            return null;
        }
        if (this.protocol.getMappingData() != null && !Mappings.isIntIdIdentity((Mappings)this.protocol.getMappingData().getItemMappings())) {
            item.setIdentifier(this.protocol.getMappingData().getOldItemId(item.identifier()));
        }
        return item;
    }

    public Type<Item> itemType() {
        return this.itemType;
    }

    protected <T extends ItemHasher> @Nullable T itemHasher(UserConnection connection) {
        return (T)connection.getItemHasher(this.protocol.getClass());
    }

    protected void updateHashedItemDataComponentIds(HashedItem item, FullMappings mappings) {
        IntSet removedData;
        Int2IntMap addedData = item.dataHashesById();
        if (!addedData.isEmpty()) {
            for (int id : addedData.keySet().toIntArray()) {
                int mappedId = mappings.getNewId(id);
                if (mappedId == id) continue;
                int hash = addedData.remove(id);
                if (mappedId == -1) continue;
                addedData.put(mappedId, hash);
            }
        }
        if (!(removedData = item.removedDataIds()).isEmpty()) {
            for (int id : removedData.toIntArray()) {
                int mappedId = mappings.getNewId(id);
                if (mappedId == id) continue;
                removedData.remove(id);
                if (mappedId == -1) continue;
                removedData.add(mappedId);
            }
        }
    }

    public void registerMerchantOffers1_14_4(C packetType) {
        this.protocol.registerClientbound(packetType, wrapper -> {
            wrapper.passthrough((Type)Types.VAR_INT);
            int size = ((Short)wrapper.passthrough((Type)Types.UNSIGNED_BYTE)).shortValue();
            for (int i = 0; i < size; ++i) {
                this.passthroughClientboundItem(wrapper);
                this.passthroughClientboundItem(wrapper);
                if (((Boolean)wrapper.passthrough((Type)Types.BOOLEAN)).booleanValue()) {
                    this.passthroughClientboundItem(wrapper);
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

    public void registerMerchantOffers1_20_5(C packetType) {
        this.protocol.registerClientbound(packetType, wrapper -> {
            wrapper.passthrough((Type)Types.VAR_INT);
            int size = (Integer)wrapper.passthrough((Type)Types.VAR_INT);
            for (int i = 0; i < size; ++i) {
                Item input = (Item)wrapper.read(this.itemCostType);
                wrapper.write(this.mappedItemCostType, (Object)this.handleItemToClientAndTrackHash(wrapper.user(), input));
                this.passthroughClientboundItem(wrapper);
                Item secondInput = (Item)wrapper.read(this.optionalItemCostType);
                if (secondInput != null) {
                    this.handleItemToClientAndTrackHash(wrapper.user(), secondInput);
                }
                wrapper.write(this.mappedOptionalItemCostType, (Object)secondInput);
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

    public void registerContainerClick1_21_2(S packetType) {
        this.registerContainerClick1_17_1(packetType, (Type<Number>)Types.VAR_INT);
    }

    public void registerContainerClick1_21_5(S packetType) {
        this.protocol.registerServerbound(packetType, wrapper -> {
            wrapper.passthrough((Type)Types.VAR_INT);
            wrapper.passthrough((Type)Types.VAR_INT);
            wrapper.passthrough((Type)Types.SHORT);
            wrapper.passthrough((Type)Types.BYTE);
            wrapper.passthrough((Type)Types.VAR_INT);
            int affectedItems = Limit.max((int)((Integer)wrapper.passthrough((Type)Types.VAR_INT)), (int)128);
            for (int i = 0; i < affectedItems; ++i) {
                wrapper.passthrough((Type)Types.SHORT);
                this.passthroughHashedItem(wrapper);
            }
            this.passthroughHashedItem(wrapper);
        });
    }

    public void registerSetCreativeModeSlot(S packetType) {
        this.protocol.registerServerbound(packetType, wrapper -> {
            wrapper.passthrough((Type)Types.SHORT);
            wrapper.write(this.itemType, (Object)this.handleItemToServer(wrapper.user(), (Item)wrapper.read(this.mappedItemType)));
        });
    }

    public void registerContainerClick1_17_1(S packetType, Type<? extends Number> containerIdType) {
        this.protocol.registerServerbound(packetType, wrapper -> {
            wrapper.passthrough(containerIdType);
            wrapper.passthrough((Type)Types.VAR_INT);
            wrapper.passthrough((Type)Types.SHORT);
            wrapper.passthrough((Type)Types.BYTE);
            wrapper.passthrough((Type)Types.VAR_INT);
            int length = Limit.max((int)((Integer)wrapper.passthrough((Type)Types.VAR_INT)), (int)128);
            for (int i = 0; i < length; ++i) {
                wrapper.passthrough((Type)Types.SHORT);
                wrapper.write(this.itemType, (Object)this.handleItemToServer(wrapper.user(), (Item)wrapper.read(this.mappedItemType)));
            }
            wrapper.write(this.itemType, (Object)this.handleItemToServer(wrapper.user(), (Item)wrapper.read(this.mappedItemType)));
        });
    }

    public void registerContainerClick1_17_1(S packetType) {
        this.registerContainerClick1_17_1(packetType, (Type<Number>)Types.BYTE);
    }

    public void registerSetCreativeModeSlot1_20_5(S packetType) {
        this.protocol.registerServerbound(packetType, wrapper -> {
            if (this.protocol.getEntityRewriter() != null && !this.protocol.getEntityRewriter().tracker(wrapper.user()).canInstaBuild()) {
                wrapper.cancel();
                return;
            }
            wrapper.passthrough((Type)Types.SHORT);
            wrapper.write(this.itemType, (Object)this.handleItemToServer(wrapper.user(), (Item)wrapper.read(this.mappedItemType)));
        });
    }

    protected void passthroughClientboundItemAndTrackHash(PacketWrapper wrapper) {
        T itemHasher = this.itemHasher(wrapper.user());
        if (itemHasher == null) {
            this.passthroughClientboundItem(wrapper);
            return;
        }
        itemHasher.setProcessingClientboundInventoryPacket(true);
        try {
            this.passthroughClientboundItem(wrapper);
        }
        finally {
            itemHasher.setProcessingClientboundInventoryPacket(false);
        }
    }
}

