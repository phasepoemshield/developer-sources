/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.nbt.tag.ByteTag
 *  com.viaversion.nbt.tag.CompoundTag
 *  com.viaversion.nbt.tag.ListTag
 *  com.viaversion.nbt.tag.StringTag
 *  com.viaversion.nbt.tag.Tag
 *  com.viaversion.viaversion.api.connection.UserConnection
 *  com.viaversion.viaversion.api.minecraft.item.Item
 *  com.viaversion.viaversion.api.protocol.Protocol
 *  com.viaversion.viaversion.api.protocol.packet.ClientboundPacketType
 *  com.viaversion.viaversion.api.protocol.packet.ServerboundPacketType
 *  com.viaversion.viaversion.api.type.Type
 *  com.viaversion.viaversion.api.type.Types
 *  com.viaversion.viaversion.protocols.v1_16_4to1_17.packet.ClientboundPackets1_17
 *  com.viaversion.viaversion.protocols.v1_16_4to1_17.packet.ServerboundPackets1_17
 *  com.viaversion.viaversion.rewriter.ItemRewriter
 *  com.viaversion.viaversion.rewriter.RecipeRewriter
 *  com.viaversion.viaversion.util.Key
 *  com.viaversion.viaversion.util.Limit
 *  org.checkerframework.checker.nullness.qual.Nullable
 */
package com.viaversion.viaversion.protocols.v1_17to1_17_1.rewriter;

import com.viaversion.nbt.tag.ByteTag;
import com.viaversion.nbt.tag.CompoundTag;
import com.viaversion.nbt.tag.ListTag;
import com.viaversion.nbt.tag.StringTag;
import com.viaversion.nbt.tag.Tag;
import com.viaversion.viaversion.api.connection.UserConnection;
import com.viaversion.viaversion.api.minecraft.item.Item;
import com.viaversion.viaversion.api.protocol.Protocol;
import com.viaversion.viaversion.api.protocol.packet.ClientboundPacketType;
import com.viaversion.viaversion.api.protocol.packet.ServerboundPacketType;
import com.viaversion.viaversion.api.type.Type;
import com.viaversion.viaversion.api.type.Types;
import com.viaversion.viaversion.protocols.v1_16_4to1_17.packet.ClientboundPackets1_17;
import com.viaversion.viaversion.protocols.v1_16_4to1_17.packet.ServerboundPackets1_17;
import com.viaversion.viaversion.protocols.v1_17to1_17_1.Protocol1_17To1_17_1;
import com.viaversion.viaversion.rewriter.ItemRewriter;
import com.viaversion.viaversion.rewriter.RecipeRewriter;
import com.viaversion.viaversion.util.Key;
import com.viaversion.viaversion.util.Limit;
import org.checkerframework.checker.nullness.qual.Nullable;

public final class ItemPacketRewriter1_17_1
extends ItemRewriter<ClientboundPackets1_17, ServerboundPackets1_17, Protocol1_17To1_17_1> {
    public ItemPacketRewriter1_17_1(Protocol1_17To1_17_1 protocol) {
        super((Protocol)protocol, Types.ITEM1_13_2, Types.ITEM1_13_2_SHORT_ARRAY);
    }

    public Item handleItemToClient(UserConnection connection, Item item) {
        if (item == null) {
            return null;
        }
        CompoundTag tag = item.tag();
        if (tag == null) {
            return item;
        }
        int hideFlags = tag.getInt("HideFlags");
        if ((hideFlags & 1) == 0) {
            this.replaceInvalidEnchantments(tag, "Enchantments");
        }
        if ((hideFlags & 0x20) == 0) {
            this.replaceInvalidEnchantments(tag, "StoredEnchantments");
        }
        return item;
    }

    public @Nullable Item handleItemToServer(UserConnection connection, @Nullable Item item) {
        if (item == null) {
            return null;
        }
        CompoundTag tag = item.tag();
        if (tag == null) {
            return item;
        }
        this.restoreInvalidEnchantments(tag, "Enchantments");
        this.restoreInvalidEnchantments(tag, "StoredEnchantments");
        return item;
    }

    public void registerPackets() {
        new RecipeRewriter(this.protocol).register((ClientboundPacketType)ClientboundPackets1_17.UPDATE_RECIPES);
        ((Protocol1_17To1_17_1)this.protocol).replaceClientbound((ClientboundPacketType)ClientboundPackets1_17.CONTAINER_SET_SLOT, wrapper -> {
            wrapper.passthrough((Type)Types.BYTE);
            wrapper.write((Type)Types.VAR_INT, (Object)0);
            wrapper.passthrough((Type)Types.SHORT);
            this.passthroughClientboundItem(wrapper);
        });
        ((Protocol1_17To1_17_1)this.protocol).replaceClientbound((ClientboundPacketType)ClientboundPackets1_17.CONTAINER_SET_CONTENT, wrapper -> {
            wrapper.passthrough((Type)Types.UNSIGNED_BYTE);
            wrapper.write((Type)Types.VAR_INT, (Object)0);
            Item[] items = (Item[])wrapper.passthroughAndMap(Types.ITEM1_13_2_SHORT_ARRAY, Types.ITEM1_13_2_ARRAY);
            for (int i = 0; i < items.length; ++i) {
                items[i] = this.handleItemToClient(wrapper.user(), items[i]);
            }
            wrapper.write(Types.ITEM1_13_2, null);
        });
        ((Protocol1_17To1_17_1)this.protocol).replaceServerbound((ServerboundPacketType)ServerboundPackets1_17.CONTAINER_CLICK, wrapper -> {
            wrapper.passthrough((Type)Types.BYTE);
            wrapper.read((Type)Types.VAR_INT);
            wrapper.passthrough((Type)Types.SHORT);
            wrapper.passthrough((Type)Types.BYTE);
            wrapper.passthrough((Type)Types.VAR_INT);
            int length = Limit.max((int)((Integer)wrapper.passthrough((Type)Types.VAR_INT)), (int)128);
            for (int i = 0; i < length; ++i) {
                wrapper.passthrough((Type)Types.SHORT);
                wrapper.write(Types.ITEM1_13_2, (Object)this.handleItemToServer(wrapper.user(), (Item)wrapper.read(Types.ITEM1_13_2)));
            }
            wrapper.write(Types.ITEM1_13_2, (Object)this.handleItemToServer(wrapper.user(), (Item)wrapper.read(Types.ITEM1_13_2)));
        });
    }

    private void restoreInvalidEnchantments(CompoundTag tag, String tagName) {
        Tag display;
        Tag marker = tag.remove(this.nbtTagName(tagName));
        if (marker == null) {
            return;
        }
        Tag hideFlags = tag.remove(this.nbtTagName("HideFlags"));
        if (hideFlags != null) {
            if (((ByteTag)hideFlags).asByte() == 0) {
                tag.remove("HideFlags");
            } else {
                tag.put("HideFlags", hideFlags);
            }
        }
        if ((display = tag.remove(this.nbtTagName("display"))) != null) {
            tag.put("display", display);
        } else {
            tag.remove("display");
        }
    }

    private void replaceInvalidEnchantments(CompoundTag tag, String tagName) {
        ListTag enchantments = tag.getListTag(tagName, CompoundTag.class);
        if (enchantments == null) {
            return;
        }
        boolean hasInvalidLevel = false;
        for (CompoundTag enchantment : enchantments.getValue()) {
            short lvl = enchantment.getShort("lvl");
            if (lvl >= 0 && lvl <= 255) continue;
            hasInvalidLevel = true;
            break;
        }
        if (!hasInvalidLevel) {
            return;
        }
        tag.put(this.nbtTagName(tagName), (Tag)new ByteTag(true));
        int originalHideFlags = tag.getInt("HideFlags");
        tag.put(this.nbtTagName("HideFlags"), (Tag)new ByteTag((byte)originalHideFlags));
        int hideBit = tagName.equals("Enchantments") ? 1 : 32;
        tag.put("HideFlags", (Tag)new ByteTag((byte)(originalHideFlags | hideBit)));
        CompoundTag display = tag.getCompoundTag("display");
        if (display != null) {
            tag.put(this.nbtTagName("display"), (Tag)display.copy());
        } else {
            display = new CompoundTag();
            tag.put("display", (Tag)display);
        }
        ListTag lore = display.getListTag("Lore", StringTag.class);
        if (lore == null) {
            lore = new ListTag(StringTag.class);
            display.put("Lore", (Tag)lore);
        }
        for (int i = enchantments.size() - 1; i >= 0; --i) {
            CompoundTag enchantment = (CompoundTag)enchantments.get(i);
            String id = enchantment.getString("id");
            if (id == null) continue;
            short lvl = enchantment.getShort("lvl");
            Key key = Key.of((String)id);
            lore.getValue().add(0, new StringTag("{\"italic\":false,\"color\":\"gray\",\"translate\":\"enchantment." + key.namespace() + "." + key.path() + "\",\"extra\":[\" \",{\"translate\":\"enchantment.level." + lvl + "\"}]}"));
        }
    }
}

