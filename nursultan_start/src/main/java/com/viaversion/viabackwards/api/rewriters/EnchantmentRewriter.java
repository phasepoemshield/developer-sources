/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.nbt.tag.CompoundTag
 *  com.viaversion.nbt.tag.ListTag
 *  com.viaversion.nbt.tag.NumberTag
 *  com.viaversion.nbt.tag.StringTag
 *  com.viaversion.nbt.tag.Tag
 *  com.viaversion.viabackwards.utils.ChatUtil
 *  com.viaversion.viaversion.api.minecraft.item.Item
 *  com.viaversion.viaversion.util.Key
 */
package com.viaversion.viabackwards.api.rewriters;

import com.viaversion.nbt.tag.CompoundTag;
import com.viaversion.nbt.tag.ListTag;
import com.viaversion.nbt.tag.NumberTag;
import com.viaversion.nbt.tag.StringTag;
import com.viaversion.nbt.tag.Tag;
import com.viaversion.viabackwards.api.rewriters.BackwardsItemRewriter;
import com.viaversion.viabackwards.utils.ChatUtil;
import com.viaversion.viaversion.api.minecraft.item.Item;
import com.viaversion.viaversion.util.Key;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class EnchantmentRewriter {
    public static final String ENCHANTMENT_LEVEL_TRANSLATION = "enchantment.level.%s";
    protected final Map<String, String> enchantmentMappings = new HashMap<String, String>();
    protected final BackwardsItemRewriter<?, ?, ?> itemRewriter;
    private final boolean jsonFormat;

    public EnchantmentRewriter(BackwardsItemRewriter<?, ?, ?> itemRewriter, boolean jsonFormat) {
        this.itemRewriter = itemRewriter;
        this.jsonFormat = jsonFormat;
    }

    public EnchantmentRewriter(BackwardsItemRewriter<?, ?, ?> itemRewriter) {
        this(itemRewriter, true);
    }

    public void rewriteEnchantmentsToClient(CompoundTag tag, boolean storedEnchant) {
        String key = storedEnchant ? "StoredEnchantments" : "Enchantments";
        ListTag enchantments = tag.getListTag(key, CompoundTag.class);
        ArrayList<StringTag> loreToAdd = new ArrayList<StringTag>();
        boolean changed = false;
        Iterator iterator = enchantments.iterator();
        while (iterator.hasNext()) {
            String enchantmentId;
            String remappedName;
            CompoundTag enchantmentEntry = (CompoundTag)iterator.next();
            StringTag idTag = enchantmentEntry.getStringTag("id");
            if (idTag == null || (remappedName = this.enchantmentMappings.get(enchantmentId = Key.stripMinecraftNamespace((String)idTag.getValue()))) == null) continue;
            if (!changed) {
                this.itemRewriter.saveListTag(tag, enchantments, key);
                changed = true;
            }
            iterator.remove();
            NumberTag levelTag = enchantmentEntry.getNumberTag("lvl");
            int level = levelTag != null ? levelTag.asInt() : 1;
            Object loreValue = this.jsonFormat ? ChatUtil.legacyToJsonString((String)remappedName, (String)ENCHANTMENT_LEVEL_TRANSLATION.formatted(new Object[]{level}), (boolean)true) : remappedName + " " + EnchantmentRewriter.getRomanNumber(level);
            loreToAdd.add(new StringTag((String)loreValue));
        }
        if (!loreToAdd.isEmpty()) {
            ListTag loreTag;
            CompoundTag display;
            if (!storedEnchant && enchantments.isEmpty()) {
                CompoundTag dummyEnchantment = new CompoundTag();
                dummyEnchantment.putString("id", "");
                dummyEnchantment.putShort("lvl", (short)0);
                enchantments.add((Tag)dummyEnchantment);
            }
            if ((display = tag.getCompoundTag("display")) == null) {
                display = new CompoundTag();
                tag.put("display", (Tag)display);
            }
            if ((loreTag = display.getListTag("Lore", StringTag.class)) == null) {
                loreTag = new ListTag(StringTag.class);
                display.put("Lore", (Tag)loreTag);
            } else {
                this.itemRewriter.saveListTag(display, loreTag, "Lore");
            }
            loreToAdd.addAll(loreTag.getValue());
            loreTag.setValue(loreToAdd);
        }
    }

    public void rewriteEnchantmentsToServer(CompoundTag tag, boolean storedEnchant) {
        String key = storedEnchant ? "StoredEnchantments" : "Enchantments";
        this.itemRewriter.restoreListTag(tag, key);
    }

    public static String getRomanNumber(int number) {
        return switch (number) {
            case 1 -> "I";
            case 2 -> "II";
            case 3 -> "III";
            case 4 -> "IV";
            case 5 -> "V";
            case 6 -> "VI";
            case 7 -> "VII";
            case 8 -> "VIII";
            case 9 -> "IX";
            case 10 -> "X";
            default -> ENCHANTMENT_LEVEL_TRANSLATION.formatted(new Object[]{number});
        };
    }

    public void handleToClient(Item item) {
        CompoundTag tag = item.tag();
        if (tag == null) {
            return;
        }
        if (tag.getListTag("Enchantments") != null) {
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
        if (tag.contains(this.itemRewriter.nbtTagName("Enchantments"))) {
            this.rewriteEnchantmentsToServer(tag, false);
        }
        if (tag.contains(this.itemRewriter.nbtTagName("StoredEnchantments"))) {
            this.rewriteEnchantmentsToServer(tag, true);
        }
    }

    public void registerEnchantment(String key, String replacementLore) {
        this.enchantmentMappings.put(Key.stripMinecraftNamespace((String)key), replacementLore);
    }
}

