/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.nbt.tag.ByteTag
 *  com.viaversion.nbt.tag.CompoundTag
 *  com.viaversion.nbt.tag.ListTag
 *  com.viaversion.nbt.tag.NumberTag
 *  com.viaversion.nbt.tag.Tag
 *  com.viaversion.viabackwards.api.rewriters.StructuredEnchantmentRewriter$DescriptionSupplier
 *  com.viaversion.viabackwards.api.rewriters.StructuredEnchantmentRewriter$PendingIdChange
 *  com.viaversion.viabackwards.utils.ChatUtil
 *  com.viaversion.viaversion.api.data.Mappings
 *  com.viaversion.viaversion.api.minecraft.data.StructuredDataContainer
 *  com.viaversion.viaversion.api.minecraft.data.StructuredDataKey
 *  com.viaversion.viaversion.api.minecraft.item.Item
 *  com.viaversion.viaversion.api.minecraft.item.data.Enchantments
 *  com.viaversion.viaversion.libs.fastutil.ints.Int2IntMap$Entry
 *  com.viaversion.viaversion.libs.fastutil.objects.ObjectIterator
 *  com.viaversion.viaversion.rewriter.IdRewriteFunction
 *  com.viaversion.viaversion.util.ComponentUtil
 */
package com.viaversion.viabackwards.api.rewriters;

import com.viaversion.nbt.tag.ByteTag;
import com.viaversion.nbt.tag.CompoundTag;
import com.viaversion.nbt.tag.ListTag;
import com.viaversion.nbt.tag.NumberTag;
import com.viaversion.nbt.tag.Tag;
import com.viaversion.viabackwards.api.BackwardsProtocol;
import com.viaversion.viabackwards.api.data.BackwardsMappingData;
import com.viaversion.viabackwards.api.rewriters.BackwardsStructuredItemRewriter;
import com.viaversion.viabackwards.api.rewriters.StructuredEnchantmentRewriter;
import com.viaversion.viabackwards.utils.ChatUtil;
import com.viaversion.viaversion.api.data.Mappings;
import com.viaversion.viaversion.api.minecraft.data.StructuredDataContainer;
import com.viaversion.viaversion.api.minecraft.data.StructuredDataKey;
import com.viaversion.viaversion.api.minecraft.item.Item;
import com.viaversion.viaversion.api.minecraft.item.data.Enchantments;
import com.viaversion.viaversion.libs.fastutil.ints.Int2IntMap;
import com.viaversion.viaversion.libs.fastutil.objects.ObjectIterator;
import com.viaversion.viaversion.rewriter.IdRewriteFunction;
import com.viaversion.viaversion.util.ComponentUtil;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StructuredEnchantmentRewriter {
    protected final BackwardsStructuredItemRewriter<?, ?, ?> itemRewriter;
    private boolean rewriteIds = true;

    private ListTag<CompoundTag> asTag(Enchantments enchantments) {
        ListTag listTag = new ListTag(CompoundTag.class);
        for (Int2IntMap.Entry entry : enchantments.enchantments().int2IntEntrySet()) {
            CompoundTag enchantment = new CompoundTag();
            enchantment.putInt("id", entry.getIntKey());
            enchantment.putInt("lvl", entry.getIntValue());
            listTag.add((Tag)enchantment);
        }
        return listTag;
    }

    public StructuredEnchantmentRewriter(BackwardsStructuredItemRewriter<?, ?, ?> itemRewriter) {
        this.itemRewriter = itemRewriter;
    }

    public void rewriteEnchantmentsToClient(StructuredDataContainer data, StructuredDataKey<Enchantments> key, IdRewriteFunction rewriteFunction, DescriptionSupplier descriptionSupplier, boolean storedEnchant) {
        CompoundTag tag;
        Enchantments enchantments = (Enchantments)data.get(key);
        if (enchantments == null || enchantments.size() == 0) {
            return;
        }
        ArrayList<Tag> loreToAdd = new ArrayList<Tag>();
        boolean removedEnchantments = false;
        boolean updatedLore = false;
        ObjectIterator iterator = enchantments.enchantments().int2IntEntrySet().iterator();
        ArrayList<PendingIdChange> updatedIds = new ArrayList<PendingIdChange>();
        while (iterator.hasNext()) {
            Tag description;
            Int2IntMap.Entry entry = (Int2IntMap.Entry)iterator.next();
            int id = entry.getIntKey();
            int mappedId = rewriteFunction.rewrite(id);
            int level = entry.getIntValue();
            if (mappedId != -1) {
                if (!this.rewriteIds) continue;
                updatedIds.add(new PendingIdChange(id, mappedId, level));
                continue;
            }
            if (!removedEnchantments) {
                CompoundTag customData = this.customData(data);
                this.itemRewriter.saveListTag(customData, this.asTag(enchantments), key.identifier());
                removedEnchantments = true;
            }
            if ((description = descriptionSupplier.get(id, level)) != null && enchantments.showInTooltip()) {
                loreToAdd.add(description);
                updatedLore = true;
            }
            iterator.remove();
        }
        for (PendingIdChange change : updatedIds) {
            enchantments.remove(change.id());
        }
        for (PendingIdChange change : updatedIds) {
            enchantments.add(change.mappedId(), change.level());
        }
        if (removedEnchantments) {
            tag = this.customData(data);
            if (!storedEnchant && enchantments.size() == 0) {
                Boolean glintOverride = (Boolean)data.get(StructuredDataKey.ENCHANTMENT_GLINT_OVERRIDE);
                if (glintOverride != null) {
                    tag.putBoolean(this.itemRewriter.nbtTagName("glint"), glintOverride.booleanValue());
                } else {
                    tag.putBoolean(this.itemRewriter.nbtTagName("noglint"), true);
                }
                data.set(StructuredDataKey.ENCHANTMENT_GLINT_OVERRIDE, (Object)true);
            }
            if (enchantments.showInTooltip()) {
                tag.putBoolean(this.itemRewriter.nbtTagName("show_" + key.identifier()), true);
            }
        }
        if (updatedLore) {
            tag = this.customData(data);
            Tag[] lore = (Tag[])data.get(StructuredDataKey.LORE);
            if (lore != null) {
                List<Tag> loreList = Arrays.asList(lore);
                this.itemRewriter.saveGenericTagList(tag, loreList, "lore");
                loreToAdd.addAll(loreList);
            } else {
                tag.putBoolean(this.itemRewriter.nbtTagName("nolore"), true);
            }
            data.set(StructuredDataKey.LORE, (Object)loreToAdd.toArray(new Tag[0]));
        }
    }

    public void rewriteEnchantmentsToServer(StructuredDataContainer data, CompoundTag tag, StructuredDataKey<Enchantments> key) {
        ListTag<CompoundTag> enchantmentsTag = this.itemRewriter.removeListTag(tag, key.identifier(), CompoundTag.class);
        if (enchantmentsTag == null) {
            return;
        }
        Tag glintTag = tag.remove(this.itemRewriter.nbtTagName("glint"));
        if (glintTag instanceof ByteTag) {
            data.set(StructuredDataKey.ENCHANTMENT_GLINT_OVERRIDE, (Object)((NumberTag)glintTag).asBoolean());
        } else if (tag.remove(this.itemRewriter.nbtTagName("noglint")) != null) {
            data.remove(StructuredDataKey.ENCHANTMENT_GLINT_OVERRIDE);
        }
        List<Tag> lore = this.itemRewriter.removeGenericTagList(tag, "lore");
        if (lore != null) {
            data.set(StructuredDataKey.LORE, (Object)lore.toArray(new Tag[0]));
        } else if (tag.remove(this.itemRewriter.nbtTagName("nolore")) != null) {
            data.remove(StructuredDataKey.LORE);
        }
        Enchantments enchantments = new Enchantments(tag.remove(this.itemRewriter.nbtTagName("show_" + key.identifier())) != null);
        for (CompoundTag enchantment : enchantmentsTag) {
            enchantments.add(enchantment.getInt("id"), enchantment.getInt("lvl"));
        }
        data.set(key, (Object)enchantments);
    }

    private CompoundTag customData(StructuredDataContainer data) {
        CompoundTag tag = (CompoundTag)data.get(StructuredDataKey.CUSTOM_DATA);
        if (tag == null) {
            tag = new CompoundTag();
            data.set(StructuredDataKey.CUSTOM_DATA, (Object)tag);
        }
        return tag;
    }

    public void handleToClient(Item item) {
        StructuredDataContainer data = item.dataContainer();
        BackwardsMappingData mappingData = ((BackwardsProtocol)this.itemRewriter.protocol()).getMappingData();
        IdRewriteFunction idRewriteFunction = id -> {
            Mappings mappings = mappingData.getEnchantmentMappings();
            return mappings.getNewId(id);
        };
        DescriptionSupplier descriptionSupplier = (id, level) -> {
            String remappedName = mappingData.mappedEnchantmentName(id);
            return ComponentUtil.jsonStringToTag((String)ChatUtil.legacyToJsonString((String)("\u00a77" + remappedName), (String)"enchantment.level.%s".formatted(new Object[]{level}), (boolean)true));
        };
        this.rewriteEnchantmentsToClient(data, (StructuredDataKey<Enchantments>)StructuredDataKey.ENCHANTMENTS1_20_5, idRewriteFunction, descriptionSupplier, false);
        this.rewriteEnchantmentsToClient(data, (StructuredDataKey<Enchantments>)StructuredDataKey.STORED_ENCHANTMENTS1_20_5, idRewriteFunction, descriptionSupplier, true);
    }

    public void handleToServer(Item item) {
        StructuredDataContainer data = item.dataContainer();
        CompoundTag customData = (CompoundTag)data.get(StructuredDataKey.CUSTOM_DATA);
        if (customData != null) {
            this.rewriteEnchantmentsToServer(data, customData, (StructuredDataKey<Enchantments>)StructuredDataKey.ENCHANTMENTS1_20_5);
            this.rewriteEnchantmentsToServer(data, customData, (StructuredDataKey<Enchantments>)StructuredDataKey.STORED_ENCHANTMENTS1_20_5);
        }
    }

    public void setRewriteIds(boolean rewriteIds) {
        this.rewriteIds = rewriteIds;
    }
}

