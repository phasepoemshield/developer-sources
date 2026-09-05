/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.nbt.tag.CompoundTag
 *  com.viaversion.nbt.tag.ListTag
 *  com.viaversion.nbt.tag.StringTag
 *  com.viaversion.nbt.tag.Tag
 *  com.viaversion.viaversion.api.connection.UserConnection
 *  com.viaversion.viaversion.api.minecraft.item.HashedItem
 *  com.viaversion.viaversion.api.minecraft.item.Item
 *  com.viaversion.viaversion.api.protocol.Protocol
 *  com.viaversion.viaversion.api.protocol.packet.ClientboundPacketType
 *  com.viaversion.viaversion.api.protocol.packet.PacketWrapper
 *  com.viaversion.viaversion.api.protocol.packet.ServerboundPacketType
 *  com.viaversion.viaversion.api.protocol.remapper.PacketHandler
 *  com.viaversion.viaversion.api.protocol.remapper.PacketHandlers
 *  com.viaversion.viaversion.api.rewriter.ItemRewriter
 *  com.viaversion.viaversion.api.rewriter.RewriterBase
 *  com.viaversion.viaversion.api.type.Type
 *  com.viaversion.viaversion.api.type.Types
 *  com.viaversion.viaversion.libs.fastutil.objects.ObjectArrayList
 *  com.viaversion.viaversion.libs.fastutil.objects.ObjectList
 */
package net.raphimc.vialegacy.api.remapper;

import com.viaversion.nbt.tag.CompoundTag;
import com.viaversion.nbt.tag.ListTag;
import com.viaversion.nbt.tag.StringTag;
import com.viaversion.nbt.tag.Tag;
import com.viaversion.viaversion.api.connection.UserConnection;
import com.viaversion.viaversion.api.minecraft.item.HashedItem;
import com.viaversion.viaversion.api.minecraft.item.Item;
import com.viaversion.viaversion.api.protocol.Protocol;
import com.viaversion.viaversion.api.protocol.packet.ClientboundPacketType;
import com.viaversion.viaversion.api.protocol.packet.PacketWrapper;
import com.viaversion.viaversion.api.protocol.packet.ServerboundPacketType;
import com.viaversion.viaversion.api.protocol.remapper.PacketHandler;
import com.viaversion.viaversion.api.protocol.remapper.PacketHandlers;
import com.viaversion.viaversion.api.rewriter.ItemRewriter;
import com.viaversion.viaversion.api.rewriter.RewriterBase;
import com.viaversion.viaversion.api.type.Type;
import com.viaversion.viaversion.api.type.Types;
import com.viaversion.viaversion.libs.fastutil.objects.ObjectArrayList;
import com.viaversion.viaversion.libs.fastutil.objects.ObjectList;

public abstract class LegacyItemRewriter<C extends ClientboundPacketType, S extends ServerboundPacketType, P extends Protocol<C, ?, ?, S>>
extends RewriterBase<P>
implements ItemRewriter<P> {
    private final ObjectList<RewriteEntry> rewriteEntries = new ObjectArrayList();
    private final ObjectList<NonExistentEntry> nonExistentItems = new ObjectArrayList();
    protected final String protocolName;
    private final Type<Item> itemType;
    private final Type<Item> mappedItemType;
    private final Type<Item[]> itemArrayType;
    private final Type<Item[]> mappedItemArrayType;

    public LegacyItemRewriter(P protocol, String protocolName, Type<Item> itemType, Type<Item[]> itemArrayType) {
        this(protocol, protocolName, itemType, itemArrayType, itemType, itemArrayType);
    }

    public LegacyItemRewriter(P protocol, String protocolName, Type<Item> itemType, Type<Item[]> itemArrayType, Type<Item> mappedItemType, Type<Item[]> mappedItemArrayType) {
        super(protocol);
        this.protocolName = protocolName;
        this.itemType = itemType;
        this.itemArrayType = itemArrayType;
        this.mappedItemType = mappedItemType;
        this.mappedItemArrayType = mappedItemArrayType;
    }

    public Type<Item[]> mappedItemArrayType() {
        return this.mappedItemArrayType;
    }

    public Item handleItemToClient(UserConnection user, Item item) {
        if (item == null) {
            return null;
        }
        for (RewriteEntry rewriteEntry : this.rewriteEntries) {
            if (!rewriteEntry.rewrites(item)) continue;
            this.setRemappedNameRead(item, rewriteEntry.newItemName);
            if (rewriteEntry.newItemMeta != -1) {
                item.setData(rewriteEntry.newItemMeta);
            }
            item.setIdentifier(rewriteEntry.newItemID);
        }
        return item;
    }

    public HashedItem handleHashedItem(UserConnection connection, HashedItem item) {
        throw new UnsupportedOperationException();
    }

    public Type<Item[]> itemArrayType() {
        return this.itemArrayType;
    }

    public Type<Item> mappedItemType() {
        return this.mappedItemType;
    }

    public Item handleItemToServer(UserConnection user, Item item) {
        if (item == null) {
            return null;
        }
        for (NonExistentEntry nonExistentEntry : this.nonExistentItems) {
            if (!nonExistentEntry.rewrites(item)) continue;
            item.setIdentifier(1);
            item.setData((short)0);
            return item;
        }
        this.setRemappedTagWrite(item);
        return item;
    }

    public void registerCreativeInventoryAction(S packetType) {
        this.protocol.registerServerbound(packetType, (PacketHandler)new PacketHandlers(){

            public void register() {
                this.map((Type)Types.SHORT);
                this.handler(wrapper -> LegacyItemRewriter.this.handleServerboundItem(wrapper));
            }
        });
    }

    public Type<Item> itemType() {
        return this.itemType;
    }

    public String nbtTagName() {
        return "VL|" + this.protocol.getClass().getSimpleName();
    }

    protected void addRemappedItem(int oldItemId, int newItemId, int newItemMeta, String newItemName) {
        this.addRemappedItem(oldItemId, -1, newItemId, newItemMeta, newItemName);
    }

    protected void addRemappedItem(int oldItemId, int oldItemMeta, int newItemId, int newItemMeta, String newItemName) {
        this.rewriteEntries.add((Object)new RewriteEntry(oldItemId, (short)oldItemMeta, newItemId, (short)newItemMeta, newItemName));
    }

    protected void addRemappedItem(int oldItemId, int newItemId, String newItemName) {
        this.addRemappedItem(oldItemId, newItemId, -1, newItemName);
    }

    protected void addNonExistentItem(int itemId, int startItemMeta, int endItemMeta) {
        for (int i = startItemMeta; i <= endItemMeta; ++i) {
            this.nonExistentItems.add((Object)new NonExistentEntry(itemId, (short)i));
        }
    }

    protected void addNonExistentItem(int itemId, int itemMeta) {
        this.nonExistentItems.add((Object)new NonExistentEntry(itemId, (short)itemMeta));
    }

    protected void addNonExistentItems(int ... itemIds) {
        for (int itemId : itemIds) {
            this.nonExistentItems.add((Object)new NonExistentEntry(itemId, -1));
        }
    }

    private void handleServerboundItem(PacketWrapper wrapper) {
        Item item = this.handleItemToServer(wrapper.user(), (Item)wrapper.read(this.mappedItemType));
        wrapper.write(this.itemType, (Object)item);
    }

    private void setRemappedNameRead(Item item, String name) {
        CompoundTag viaLegacyTag = new CompoundTag();
        viaLegacyTag.putInt("Id", item.identifier());
        viaLegacyTag.putShort("Meta", item.data());
        CompoundTag tag = item.tag();
        if (tag == null) {
            tag = new CompoundTag();
            item.setTag(tag);
            viaLegacyTag.putBoolean("RemoveTag", true);
        }
        tag.put(this.nbtTagName(), (Tag)viaLegacyTag);
        CompoundTag display = tag.getCompoundTag("display");
        if (display == null) {
            display = new CompoundTag();
            tag.put("display", (Tag)display);
            viaLegacyTag.putBoolean("RemoveDisplayTag", true);
        }
        if (display.contains("Name")) {
            ListTag lore = display.getListTag("Lore", StringTag.class);
            if (lore == null) {
                lore = new ListTag(StringTag.class);
                display.put("Lore", (Tag)lore);
                viaLegacyTag.putBoolean("RemoveLore", true);
            }
            lore.add((Tag)new StringTag("\u00a7r " + this.protocolName + " Item ID: " + item.identifier() + " (" + name + ")"));
            viaLegacyTag.putBoolean("RemoveLastLore", true);
        } else {
            display.putString("Name", "\u00a7r" + this.protocolName + " " + name);
            viaLegacyTag.putBoolean("RemoveDisplayName", true);
        }
    }

    protected void addNonExistentItemRange(int startItemId, int endItemId) {
        for (int i = startItemId; i <= endItemId; ++i) {
            this.nonExistentItems.add((Object)new NonExistentEntry(i, -1));
        }
    }

    private void handleClientboundItem(PacketWrapper wrapper) {
        Item item = this.handleItemToClient(wrapper.user(), (Item)wrapper.read(this.itemType));
        wrapper.write(this.mappedItemType, (Object)item);
    }

    private void setRemappedTagWrite(Item item) {
        CompoundTag tag = item.tag();
        if (tag == null) {
            return;
        }
        CompoundTag viaLegacyTag = (CompoundTag)tag.removeUnchecked(this.nbtTagName());
        if (viaLegacyTag == null) {
            return;
        }
        item.setIdentifier(viaLegacyTag.getNumberTag("Id").asInt());
        item.setData(viaLegacyTag.getNumberTag("Meta").asShort());
        if (viaLegacyTag.contains("RemoveLastLore")) {
            ListTag lore = tag.getCompoundTag("display").getListTag("Lore", StringTag.class);
            lore.remove(lore.size() - 1);
        }
        if (viaLegacyTag.contains("RemoveLore")) {
            tag.getCompoundTag("display").remove("Lore");
        }
        if (viaLegacyTag.contains("RemoveDisplayName")) {
            tag.getCompoundTag("display").remove("Name");
        }
        if (viaLegacyTag.contains("RemoveDisplayTag")) {
            tag.remove("display");
        }
        if (viaLegacyTag.contains("RemoveTag")) {
            item.setTag(null);
        }
    }

    private record RewriteEntry(int oldItemID, short oldItemMeta, int newItemID, short newItemMeta, String newItemName) {
        public boolean rewrites(Item item) {
            return item.identifier() == this.oldItemID && (this.oldItemMeta == -1 || this.oldItemMeta == item.data());
        }
    }

    private record NonExistentEntry(int itemId, short itemMeta) {
        public boolean rewrites(Item item) {
            return item.identifier() == this.itemId && (this.itemMeta == -1 || this.itemMeta == item.data());
        }
    }
}

