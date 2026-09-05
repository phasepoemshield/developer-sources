/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Preconditions
 *  com.viaversion.nbt.tag.CompoundTag
 *  com.viaversion.nbt.tag.IntArrayTag
 *  com.viaversion.nbt.tag.IntTag
 *  com.viaversion.nbt.tag.Tag
 *  com.viaversion.viaversion.api.connection.UserConnection
 *  com.viaversion.viaversion.api.data.FullMappings
 *  com.viaversion.viaversion.api.data.MappingData
 *  com.viaversion.viaversion.api.data.Mappings
 *  com.viaversion.viaversion.api.data.entity.EntityTracker
 *  com.viaversion.viaversion.api.data.item.ItemHasher
 *  com.viaversion.viaversion.api.minecraft.EitherHolder
 *  com.viaversion.viaversion.api.minecraft.Holder
 *  com.viaversion.viaversion.api.minecraft.data.StructuredData
 *  com.viaversion.viaversion.api.minecraft.data.StructuredDataContainer
 *  com.viaversion.viaversion.api.minecraft.data.StructuredDataKey
 *  com.viaversion.viaversion.api.minecraft.item.HashedItem
 *  com.viaversion.viaversion.api.minecraft.item.Item
 *  com.viaversion.viaversion.api.minecraft.item.data.FilterableComponent
 *  com.viaversion.viaversion.api.minecraft.item.data.WrittenBook
 *  com.viaversion.viaversion.api.protocol.Protocol
 *  com.viaversion.viaversion.api.protocol.packet.ClientboundPacketType
 *  com.viaversion.viaversion.api.protocol.packet.PacketWrapper
 *  com.viaversion.viaversion.api.protocol.packet.ServerboundPacketType
 *  com.viaversion.viaversion.api.type.Type
 *  com.viaversion.viaversion.api.type.Types
 *  com.viaversion.viaversion.api.type.types.version.VersionedTypesHolder
 *  com.viaversion.viaversion.data.item.ItemHasherBase
 *  com.viaversion.viaversion.data.item.OriginalHashedItem
 *  com.viaversion.viaversion.libs.fastutil.ints.Int2IntMap$Entry
 *  com.viaversion.viaversion.libs.fastutil.objects.ObjectIterator
 *  com.viaversion.viaversion.rewriter.ItemRewriter
 *  com.viaversion.viaversion.rewriter.StructuredItemRewriter$ItemHandler
 *  org.checkerframework.checker.nullness.qual.Nullable
 */
package com.viaversion.viaversion.rewriter;

import com.google.common.base.Preconditions;
import com.viaversion.nbt.tag.CompoundTag;
import com.viaversion.nbt.tag.IntArrayTag;
import com.viaversion.nbt.tag.IntTag;
import com.viaversion.nbt.tag.Tag;
import com.viaversion.viaversion.api.connection.UserConnection;
import com.viaversion.viaversion.api.data.FullMappings;
import com.viaversion.viaversion.api.data.MappingData;
import com.viaversion.viaversion.api.data.Mappings;
import com.viaversion.viaversion.api.data.entity.EntityTracker;
import com.viaversion.viaversion.api.data.item.ItemHasher;
import com.viaversion.viaversion.api.minecraft.EitherHolder;
import com.viaversion.viaversion.api.minecraft.Holder;
import com.viaversion.viaversion.api.minecraft.data.StructuredData;
import com.viaversion.viaversion.api.minecraft.data.StructuredDataContainer;
import com.viaversion.viaversion.api.minecraft.data.StructuredDataKey;
import com.viaversion.viaversion.api.minecraft.item.HashedItem;
import com.viaversion.viaversion.api.minecraft.item.Item;
import com.viaversion.viaversion.api.minecraft.item.data.FilterableComponent;
import com.viaversion.viaversion.api.minecraft.item.data.WrittenBook;
import com.viaversion.viaversion.api.protocol.Protocol;
import com.viaversion.viaversion.api.protocol.packet.ClientboundPacketType;
import com.viaversion.viaversion.api.protocol.packet.PacketWrapper;
import com.viaversion.viaversion.api.protocol.packet.ServerboundPacketType;
import com.viaversion.viaversion.api.type.Type;
import com.viaversion.viaversion.api.type.Types;
import com.viaversion.viaversion.api.type.types.version.VersionedTypesHolder;
import com.viaversion.viaversion.data.item.ItemHasherBase;
import com.viaversion.viaversion.data.item.OriginalHashedItem;
import com.viaversion.viaversion.libs.fastutil.ints.Int2IntMap;
import com.viaversion.viaversion.libs.fastutil.objects.ObjectIterator;
import com.viaversion.viaversion.rewriter.ItemRewriter;
import com.viaversion.viaversion.rewriter.StructuredItemRewriter;
import com.viaversion.viaversion.util.Rewritable;
import java.util.List;
import java.util.Map;
import org.checkerframework.checker.nullness.qual.Nullable;

public class StructuredItemRewriter<C extends ClientboundPacketType, S extends ServerboundPacketType, T extends Protocol<C, ?, ?, S>>
extends ItemRewriter<C, S, T> {
    public static final String MARKER_KEY = "VV|custom_data";
    private static final String ORIGINAL_HASHES_KEY = "VV|original_hashes";

    public StructuredItemRewriter(T t) {
        super(t);
    }

    public void registerShowDialogDirect(C c) {
        this.protocol.registerClientbound(c, packetWrapper -> {
            CompoundTag compoundTag = (CompoundTag)packetWrapper.passthrough(Types.TRUSTED_COMPOUND_TAG);
            this.protocol.getRegistryDataRewriter().updateDialog(packetWrapper.user(), compoundTag);
        });
    }

    protected @Nullable OriginalHashedItem backedUpOriginalHashes(CompoundTag compoundTag, Item item) {
        IntTag intTag = compoundTag.getIntTag("id");
        String string = compoundTag.getString("backup_tag");
        if (intTag == null || string == null) {
            return null;
        }
        OriginalHashedItem originalHashedItem = new OriginalHashedItem(intTag.asInt(), item.amount(), string);
        try {
            for (Object object : compoundTag.entrySet()) {
                Object object2 = object.getValue();
                if (!(object2 instanceof IntTag)) continue;
                IntTag intTag2 = (IntTag)object2;
                object2 = (String)object.getKey();
                if (((String)object2).equals("id")) continue;
                originalHashedItem.dataHashesById().put(Integer.parseInt((String)object2), intTag2.asInt());
            }
        }
        catch (NumberFormatException numberFormatException) {
            return null;
        }
        IntArrayTag intArrayTag = compoundTag.getIntArrayTag("removed");
        if (intArrayTag != null) {
            for (Object object : (Object)intArrayTag.getValue()) {
                originalHashedItem.removedDataIds().add((int)object);
            }
        }
        return originalHashedItem;
    }

    protected void updateTextComponent(UserConnection userConnection, Item item, StructuredDataKey<Tag> structuredDataKey, String string) {
        Tag tag = (Tag)item.dataContainer().get(structuredDataKey);
        if (tag == null) {
            return;
        }
        Tag tag2 = tag.copy();
        this.protocol.getComponentRewriter().processTag(userConnection, tag);
        if (!tag.equals(tag2)) {
            this.saveTag(this.createCustomTag(item), tag2, string);
        }
    }

    private static <T> void replaceKeyUnchecked(StructuredDataContainer structuredDataContainer, StructuredDataKey<T> structuredDataKey, StructuredDataKey<?> structuredDataKey2) {
        Preconditions.checkArgument((structuredDataKey.type().getOutputClass() == structuredDataKey2.type().getOutputClass() ? 1 : 0) != 0, (String)"Type mismatch: %s vs %s", (Object[])new Object[]{structuredDataKey, structuredDataKey2});
        structuredDataContainer.replaceKey(structuredDataKey, structuredDataKey2);
    }

    private void replaceAnnoyingKeys(StructuredDataContainer structuredDataContainer, VersionedTypesHolder versionedTypesHolder, VersionedTypesHolder versionedTypesHolder2) {
        List list = versionedTypesHolder.structuredDataKeys().keys();
        List list2 = versionedTypesHolder2.structuredDataKeys().keys();
        int n = Math.min(list.size(), list2.size());
        for (int i = 0; i < n; ++i) {
            StructuredDataKey structuredDataKey = (StructuredDataKey)list.get(i);
            StructuredDataKey structuredDataKey2 = (StructuredDataKey)list2.get(i);
            StructuredItemRewriter.replaceKeyUnchecked(structuredDataContainer, structuredDataKey, structuredDataKey2);
        }
    }

    protected void handleRewritablesToServer(UserConnection userConnection, StructuredDataContainer structuredDataContainer) {
        this.handleRewritables(userConnection, false, structuredDataContainer, this::handleItemToServer);
    }

    protected void storeOriginalHashedItem(UserConnection userConnection, Item item, ItemHasherBase itemHasherBase, HashedItem hashedItem) {
        if (hashedItem == null || hashedItem.dataHashesById().isEmpty() && hashedItem.removedDataIds().isEmpty()) {
            return;
        }
        if (hashedItem instanceof OriginalHashedItem) {
            OriginalHashedItem originalHashedItem = (OriginalHashedItem)hashedItem;
            itemHasherBase.trackOriginalHashedItem((CompoundTag)item.dataContainer().get(StructuredDataKey.CUSTOM_DATA), hashedItem, originalHashedItem.backupTagName());
            return;
        }
        HashedItem hashedItem2 = itemHasherBase.toHashedItem(item, true);
        this.normalizeHashedItemToServer(hashedItem2);
        if (hashedItem2.dataHashesById().equals(hashedItem.dataHashesById()) && hashedItem2.removedDataIds().equals(hashedItem.removedDataIds())) {
            return;
        }
        CompoundTag compoundTag = new CompoundTag();
        compoundTag.putInt("id", hashedItem.identifier());
        compoundTag.putString("backup_tag", this.nbtTagName());
        for (Int2IntMap.Entry entry : hashedItem.dataHashesById().int2IntEntrySet()) {
            compoundTag.putInt(Integer.toString(entry.getIntKey()), entry.getIntValue());
        }
        compoundTag.put("removed", (Tag)new IntArrayTag(hashedItem.removedDataIds().toIntArray()));
        ObjectIterator objectIterator = this.createCustomTag(item);
        objectIterator.put(ORIGINAL_HASHES_KEY, (Tag)compoundTag);
        if (this.isFirstServerbound(userConnection)) {
            itemHasherBase.trackOriginalHashedItem((CompoundTag)objectIterator, hashedItem, this.nbtTagName());
        }
    }

    private <V> Holder<V> updateHolderUnchecked(Holder<V> holder, UserConnection userConnection, boolean bl) {
        return holder.updateValue(object -> {
            Object object2;
            if (object instanceof Rewritable) {
                Rewritable rewritable = (Rewritable)object;
                object2 = rewritable.rewrite(userConnection, this.protocol, bl);
            } else {
                object2 = object;
            }
            return object2;
        });
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    protected void handleRewritablesToClient(UserConnection userConnection, StructuredDataContainer structuredDataContainer, @Nullable ItemHasher itemHasher) {
        if (itemHasher == null || !itemHasher.isProcessingClientboundInventoryPacket()) {
            this.handleRewritables(userConnection, true, structuredDataContainer, this::handleItemToClient);
            return;
        }
        itemHasher.setProcessingClientboundInventoryPacket(false);
        try {
            this.handleRewritables(userConnection, true, structuredDataContainer, this::handleItemToClient);
        }
        finally {
            itemHasher.setProcessingClientboundInventoryPacket(true);
        }
    }

    protected void backupInconvertibleData(UserConnection userConnection, Item item, StructuredDataContainer structuredDataContainer, CompoundTag compoundTag) {
    }

    public void handleItemDataComponentsToServer(UserConnection userConnection, Item item, StructuredDataContainer structuredDataContainer) {
        this.replaceAnnoyingKeys(structuredDataContainer, this.protocol.mappedTypes(), this.protocol.types());
    }

    protected void passthroughLengthPrefixedItem(PacketWrapper packetWrapper) {
        Item item = this.handleItemToServer(packetWrapper.user(), (Item)packetWrapper.read(this.protocol.mappedTypes().lengthPrefixedItem()));
        packetWrapper.write(this.protocol.types().lengthPrefixedItem(), (Object)item);
    }

    protected void updateItemDataComponentTypeIds(StructuredDataContainer structuredDataContainer, boolean bl) {
        MappingData mappingData = this.protocol.getMappingData();
        if (mappingData == null) {
            return;
        }
        FullMappings fullMappings = mappingData.getDataComponentSerializerMappings();
        if (fullMappings == null) {
            return;
        }
        if (!bl) {
            fullMappings = fullMappings.inverse();
        }
        structuredDataContainer.setIdLookup(this.protocol, bl);
        structuredDataContainer.updateIds(this.protocol, arg_0 -> ((FullMappings)fullMappings).getNewId(arg_0));
    }

    protected void handleItemDataComponentsToClient(UserConnection userConnection, Item item, StructuredDataContainer structuredDataContainer) {
        if (this.protocol.getComponentRewriter() != null) {
            WrittenBook writtenBook;
            this.updateTextComponent(userConnection, item, (StructuredDataKey<Tag>)StructuredDataKey.ITEM_NAME, "item_name");
            this.updateTextComponent(userConnection, item, (StructuredDataKey<Tag>)StructuredDataKey.CUSTOM_NAME, "custom_name");
            WrittenBook writtenBook2 = (WrittenBook)structuredDataContainer.get(StructuredDataKey.LORE);
            if (writtenBook2 != null) {
                writtenBook = writtenBook2;
                int n = ((Tag[])writtenBook).length;
                for (int i = 0; i < n; ++i) {
                    WrittenBook writtenBook3 = writtenBook[i];
                    this.protocol.getComponentRewriter().processTag(userConnection, (Tag)writtenBook3);
                }
            }
            if ((writtenBook = (WrittenBook)structuredDataContainer.get(StructuredDataKey.WRITTEN_BOOK_CONTENT)) != null) {
                for (FilterableComponent filterableComponent : writtenBook.pages()) {
                    this.protocol.getComponentRewriter().processTag(userConnection, (Tag)filterableComponent.raw());
                    if (!filterableComponent.isFiltered()) continue;
                    this.protocol.getComponentRewriter().processTag(userConnection, (Tag)filterableComponent.filtered());
                }
            }
        }
        this.replaceAnnoyingKeys(structuredDataContainer, this.protocol.types(), this.protocol.mappedTypes());
    }

    private void normalizeHashedItemToServer(HashedItem hashedItem) {
        MappingData mappingData = this.protocol.getMappingData();
        if (mappingData == null || Mappings.isIntIdIdentity((Mappings)mappingData.getDataComponentSerializerMappings())) {
            return;
        }
        this.updateHashedItemDataComponentIds(hashedItem, mappingData.getDataComponentSerializerMappings().inverse());
    }

    public Item handleItemToClient(UserConnection userConnection, Item item) {
        MappingData mappingData;
        if (Item.isEmpty((Item)item)) {
            return item;
        }
        ItemHasherBase itemHasherBase = (ItemHasherBase)this.itemHasher(userConnection);
        HashedItem hashedItem = this.hashItemIfNeeded(userConnection, item, itemHasherBase);
        StructuredDataContainer structuredDataContainer = item.dataContainer();
        this.updateItemDataComponentTypeIds(structuredDataContainer, true);
        CompoundTag compoundTag = new CompoundTag();
        this.backupInconvertibleData(userConnection, item, structuredDataContainer, compoundTag);
        if (!compoundTag.isEmpty()) {
            this.saveTag(this.createCustomTag(item), (Tag)compoundTag, "backup");
        }
        if ((mappingData = this.protocol.getMappingData()) != null && mappingData.getItemMappings() != null) {
            item.setIdentifier(mappingData.getNewItemId(item.identifier()));
        }
        this.handleRewritablesToClient(userConnection, structuredDataContainer, (ItemHasher)itemHasherBase);
        this.handleItemDataComponentsToClient(userConnection, item, structuredDataContainer);
        if (hashedItem != null) {
            this.storeOriginalHashedItem(userConnection, item, itemHasherBase, hashedItem);
        }
        return item;
    }

    public void registerShowDialog(C c) {
        this.protocol.registerClientbound(c, packetWrapper -> {
            Holder holder = (Holder)packetWrapper.passthrough((Type)Types.TRUSTED_COMPOUND_TAG_HOLDER);
            if (holder.isDirect()) {
                this.protocol.getRegistryDataRewriter().updateDialog(packetWrapper.user(), (CompoundTag)holder.value());
            }
        });
    }

    public Item handleItemToServer(UserConnection userConnection, Item item) {
        if (Item.isEmpty((Item)item)) {
            return item;
        }
        MappingData mappingData = this.protocol.getMappingData();
        if (mappingData != null && mappingData.getItemMappings() != null) {
            item.setIdentifier(mappingData.getOldItemId(item.identifier()));
        }
        this.updateItemDataComponentTypeIds(item.dataContainer(), false);
        this.handleRewritablesToServer(userConnection, item.dataContainer());
        this.restoreBackupData(item);
        this.handleItemDataComponentsToServer(userConnection, item, item.dataContainer());
        return item;
    }

    protected @Nullable Tag removeBackupTag(CompoundTag compoundTag, String string) {
        return compoundTag.remove(this.nbtTagName(string));
    }

    protected CompoundTag createCustomTag(Item item) {
        StructuredDataContainer structuredDataContainer = item.dataContainer();
        CompoundTag compoundTag = (CompoundTag)structuredDataContainer.get(StructuredDataKey.CUSTOM_DATA);
        if (compoundTag == null) {
            compoundTag = new CompoundTag();
            compoundTag.putBoolean(MARKER_KEY, true);
            structuredDataContainer.set(StructuredDataKey.CUSTOM_DATA, (Object)compoundTag);
        }
        return compoundTag;
    }

    protected @Nullable HashedItem hashItemIfNeeded(UserConnection userConnection, Item item, @Nullable ItemHasherBase itemHasherBase) {
        CompoundTag compoundTag;
        if (itemHasherBase == null || !itemHasherBase.isProcessingClientboundInventoryPacket()) {
            return null;
        }
        CompoundTag compoundTag2 = (CompoundTag)item.dataContainer().get(StructuredDataKey.CUSTOM_DATA);
        if (compoundTag2 != null && (compoundTag = compoundTag2.getCompoundTag(ORIGINAL_HASHES_KEY)) != null) {
            if (this.isFirstServerbound(userConnection)) {
                return this.backedUpOriginalHashes(compoundTag, item);
            }
            return null;
        }
        return itemHasherBase.toHashedItem(item, false);
    }

    protected void removeCustomTag(StructuredDataContainer structuredDataContainer, CompoundTag compoundTag) {
        if (compoundTag.size() == 1 && compoundTag.contains(MARKER_KEY)) {
            structuredDataContainer.remove(StructuredDataKey.CUSTOM_DATA);
        }
    }

    private void handleRewritables(UserConnection userConnection, boolean bl, StructuredDataContainer structuredDataContainer, ItemHandler itemHandler) {
        for (Map.Entry entry : structuredDataContainer.data().entrySet()) {
            StructuredData structuredData;
            StructuredData structuredData2 = (StructuredData)entry.getValue();
            if (structuredData2.isEmpty()) continue;
            Object object = structuredData2.value();
            if (object instanceof Item) {
                Item item = (Item)object;
                structuredData = structuredData2;
                structuredData.setValue((Object)itemHandler.rewrite(userConnection, item));
                continue;
            }
            if (object instanceof Item[]) {
                Item[] itemArray = (Item[])object;
                for (int i = 0; i < itemArray.length; ++i) {
                    itemArray[i] = itemHandler.rewrite(userConnection, itemArray[i]);
                }
                continue;
            }
            if (object instanceof Rewritable) {
                Rewritable rewritable = (Rewritable)object;
                this.setDataUnchecked(structuredData2, rewritable.rewrite(userConnection, this.protocol, bl));
                continue;
            }
            if (object instanceof Holder) {
                Holder holder = (Holder)object;
                structuredData = structuredData2;
                if (!holder.isDirect() || !(holder.value() instanceof Rewritable)) continue;
                structuredData.setValue(this.updateHolderUnchecked(holder, userConnection, bl));
                continue;
            }
            if (!(object instanceof EitherHolder)) continue;
            EitherHolder eitherHolder = (EitherHolder)object;
            structuredData = structuredData2;
            if (!eitherHolder.hasHolder() || !eitherHolder.holder().isDirect() || !(eitherHolder.holder().value() instanceof Rewritable)) continue;
            structuredData.setValue((Object)EitherHolder.of(this.updateHolderUnchecked(eitherHolder.holder(), userConnection, bl)));
        }
    }

    private <V> void setDataUnchecked(StructuredData<V> structuredData, Object object) {
        structuredData.setValue(object);
    }

    private boolean isFirstServerbound(UserConnection userConnection) {
        for (Protocol protocol : userConnection.getProtocolInfo().getPipeline().pipes()) {
            if (!(userConnection.getItemHasher(protocol.getClass()) instanceof ItemHasherBase)) continue;
            return protocol.getClass() == this.protocol.getClass();
        }
        return false;
    }

    protected void restoreBackupData(Item item) {
        StructuredDataContainer structuredDataContainer = item.dataContainer();
        CompoundTag compoundTag = (CompoundTag)structuredDataContainer.get(StructuredDataKey.CUSTOM_DATA);
        if (compoundTag != null) {
            this.restoreBackupData(item, structuredDataContainer, compoundTag);
            this.removeCustomTag(structuredDataContainer, compoundTag);
        }
    }

    protected void restoreBackupData(Item item, StructuredDataContainer structuredDataContainer, CompoundTag compoundTag) {
        compoundTag.remove(ORIGINAL_HASHES_KEY);
        if (this.removeBackupTag(compoundTag, "added_custom_name") != null) {
            structuredDataContainer.remove(StructuredDataKey.CUSTOM_NAME);
        } else {
            Tag tag;
            Tag tag2 = this.removeBackupTag(compoundTag, "custom_name");
            if (tag2 != null) {
                structuredDataContainer.set(StructuredDataKey.CUSTOM_NAME, (Object)tag2);
            }
            if ((tag = this.removeBackupTag(compoundTag, "item_name")) != null) {
                structuredDataContainer.set(StructuredDataKey.ITEM_NAME, (Object)tag);
            }
        }
    }

    private boolean redirect$djc000$viafabricplus$dontCancelPackets(EntityTracker entityTracker) {
        return true;
    }

    protected void saveTag(CompoundTag compoundTag, Tag tag, String string) {
        String string2 = this.nbtTagName(string);
        if (!compoundTag.contains(string2)) {
            compoundTag.put(string2, tag);
        }
    }

    public void registerSetCreativeModeSlot1_21_5(S s) {
        this.protocol.registerServerbound(s, packetWrapper -> {
            EntityTracker entityTracker = this.protocol.getEntityRewriter().tracker(packetWrapper.user());
            if (!this.redirect$djc000$viafabricplus$dontCancelPackets(entityTracker)) {
                packetWrapper.cancel();
                return;
            }
            packetWrapper.passthrough((Type)Types.SHORT);
            this.passthroughLengthPrefixedItem(packetWrapper);
        });
    }
}

