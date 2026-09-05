/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.nbt.tag.ByteTag
 *  com.viaversion.nbt.tag.CompoundTag
 *  com.viaversion.nbt.tag.IntTag
 *  com.viaversion.nbt.tag.ListTag
 *  com.viaversion.nbt.tag.NumberTag
 *  com.viaversion.nbt.tag.StringTag
 *  com.viaversion.nbt.tag.Tag
 *  com.viaversion.viaversion.api.minecraft.item.Item
 */
package com.viaversion.viabackwards.api.rewriters;

import com.viaversion.nbt.tag.ByteTag;
import com.viaversion.nbt.tag.CompoundTag;
import com.viaversion.nbt.tag.IntTag;
import com.viaversion.nbt.tag.ListTag;
import com.viaversion.nbt.tag.NumberTag;
import com.viaversion.nbt.tag.StringTag;
import com.viaversion.nbt.tag.Tag;
import com.viaversion.viabackwards.api.rewriters.EnchantmentRewriter;
import com.viaversion.viaversion.api.minecraft.item.Item;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class LegacyEnchantmentRewriter {
    private final Map<Short, String> enchantmentMappings = new HashMap<Short, String>();
    private final String nbtTagName;
    private final boolean dummyEnchantment;
    private Set<Short> hideLevelForEnchants;

    public LegacyEnchantmentRewriter(String nbtTagName) {
        this(nbtTagName, true);
    }

    public LegacyEnchantmentRewriter(String nbtTagName, boolean dummyEnchantment) {
        this.nbtTagName = nbtTagName;
        this.dummyEnchantment = dummyEnchantment;
    }

    public void rewriteEnchantmentsToClient(CompoundTag tag, boolean storedEnchant) {
        String key = storedEnchant ? "StoredEnchantments" : "ench";
        ListTag enchantments = tag.getListTag(key, CompoundTag.class);
        ListTag remappedEnchantments = new ListTag(CompoundTag.class);
        ArrayList<StringTag> lore = new ArrayList<StringTag>();
        for (CompoundTag enchantmentEntry : enchantments.copy()) {
            short level;
            short newId;
            String enchantmentName;
            NumberTag idTag = enchantmentEntry.getNumberTag("id");
            if (idTag == null || (enchantmentName = this.enchantmentMappings.get(newId = idTag.asShort())) == null) continue;
            enchantments.remove((Tag)enchantmentEntry);
            NumberTag levelTag = enchantmentEntry.getNumberTag("lvl");
            short s = level = levelTag != null ? levelTag.asShort() : (short)1;
            if (this.hideLevelForEnchants != null && this.hideLevelForEnchants.contains(newId)) {
                lore.add(new StringTag(enchantmentName));
            } else {
                lore.add(new StringTag(enchantmentName + " " + EnchantmentRewriter.getRomanNumber(level)));
            }
            remappedEnchantments.add((Tag)enchantmentEntry);
        }
        if (!lore.isEmpty()) {
            ListTag loreTag;
            if (this.dummyEnchantment && !storedEnchant && enchantments.isEmpty()) {
                CompoundTag dummyEnchantment = new CompoundTag();
                dummyEnchantment.putShort("id", (short)0);
                dummyEnchantment.putShort("lvl", (short)0);
                enchantments.add((Tag)dummyEnchantment);
                tag.put(this.nbtTagName + "|dummyEnchant", (Tag)new ByteTag(false));
                NumberTag hideFlags = tag.getNumberTag("HideFlags");
                if (hideFlags == null) {
                    hideFlags = new IntTag();
                } else {
                    tag.putInt(this.nbtTagName + "|oldHideFlags", (int)hideFlags.asByte());
                }
                int flags = hideFlags.asByte() | 1;
                tag.putInt("HideFlags", flags);
            }
            tag.put(this.nbtTagName + "|" + key, (Tag)remappedEnchantments);
            CompoundTag display = tag.getCompoundTag("display");
            if (display == null) {
                display = new CompoundTag();
                tag.put("display", (Tag)display);
            }
            if ((loreTag = display.getListTag("Lore", StringTag.class)) == null) {
                loreTag = new ListTag(StringTag.class);
                display.put("Lore", (Tag)loreTag);
            }
            lore.addAll(loreTag.getValue());
            loreTag.setValue(lore);
        }
    }

    public void rewriteEnchantmentsToServer(CompoundTag tag, boolean storedEnchant) {
        CompoundTag display;
        String key = storedEnchant ? "StoredEnchantments" : "ench";
        ListTag enchantments = tag.getListTag(key, CompoundTag.class);
        if (enchantments == null) {
            enchantments = new ListTag(CompoundTag.class);
        }
        if (!storedEnchant && tag.remove(this.nbtTagName + "|dummyEnchant") != null) {
            for (CompoundTag enchantment : enchantments.copy()) {
                short level;
                NumberTag idTag = enchantment.getNumberTag("id");
                NumberTag levelTag = enchantment.getNumberTag("lvl");
                short id = idTag != null ? idTag.asShort() : (short)0;
                short s = level = levelTag != null ? levelTag.asShort() : (short)0;
                if (id != 0 || level != 0) continue;
                enchantments.remove((Tag)enchantment);
            }
            Tag hideFlags = tag.remove(this.nbtTagName + "|oldHideFlags");
            if (hideFlags instanceof IntTag) {
                IntTag intTag = (IntTag)hideFlags;
                tag.putInt("HideFlags", (int)intTag.asByte());
            } else {
                tag.remove("HideFlags");
            }
        }
        ListTag lore = (display = tag.getCompoundTag("display")) != null ? display.getListTag("Lore", StringTag.class) : null;
        ListTag remappedEnchantments = (ListTag)tag.remove(this.nbtTagName + "|" + key);
        for (CompoundTag enchantment : remappedEnchantments.copy()) {
            enchantments.add((Tag)enchantment);
            if (lore == null || lore.isEmpty()) continue;
            lore.remove((Tag)((StringTag)lore.get(0)));
        }
        if (lore != null && lore.isEmpty()) {
            display.remove("Lore");
            if (display.isEmpty()) {
                tag.remove("display");
            }
        }
        tag.put(key, (Tag)enchantments);
    }

    public void handleToClient(Item item) {
        CompoundTag tag = item.tag();
        if (tag == null) {
            return;
        }
        if (tag.getListTag("ench") != null) {
            this.rewriteEnchantmentsToClient(tag, false);
        }
        if (tag.getListTag("StoredEnchantments") != null) {
            this.rewriteEnchantmentsToClient(tag, true);
        }
    }

    public void handleToServer(Item item) {
        CompoundTag tag = item.tag();
        if (tag == null) {
            return;
        }
        if (tag.getListTag(this.nbtTagName + "|ench", CompoundTag.class) != null) {
            this.rewriteEnchantmentsToServer(tag, false);
        }
        if (tag.getListTag(this.nbtTagName + "|StoredEnchantments", CompoundTag.class) != null) {
            this.rewriteEnchantmentsToServer(tag, true);
        }
    }

    public void registerEnchantment(int id, String replacementLore) {
        this.enchantmentMappings.put((short)id, replacementLore);
    }

    public void setHideLevelForEnchants(int ... enchants) {
        this.hideLevelForEnchants = new HashSet<Short>();
        for (int enchant : enchants) {
            this.hideLevelForEnchants.add((short)enchant);
        }
    }
}

