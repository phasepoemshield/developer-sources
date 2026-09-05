/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.nbt.tag.CompoundTag
 *  com.viaversion.nbt.tag.ListTag
 *  com.viaversion.nbt.tag.StringTag
 *  com.viaversion.nbt.tag.Tag
 *  com.viaversion.viabackwards.api.BackwardsProtocol
 *  com.viaversion.viabackwards.api.rewriters.BackwardsRegistryRewriter
 *  com.viaversion.viaversion.api.connection.UserConnection
 *  com.viaversion.viaversion.api.minecraft.RegistryEntry
 */
package com.viaversion.viabackwards.protocol.v1_21_5to1_21_4.rewriter;

import com.viaversion.nbt.tag.CompoundTag;
import com.viaversion.nbt.tag.ListTag;
import com.viaversion.nbt.tag.StringTag;
import com.viaversion.nbt.tag.Tag;
import com.viaversion.viabackwards.api.BackwardsProtocol;
import com.viaversion.viabackwards.api.rewriters.BackwardsRegistryRewriter;
import com.viaversion.viaversion.api.connection.UserConnection;
import com.viaversion.viaversion.api.minecraft.RegistryEntry;
import java.util.List;

public final class RegistryDataRewriter1_21_5
extends BackwardsRegistryRewriter {
    public RegistryDataRewriter1_21_5(BackwardsProtocol<?, ?, ?, ?> protocol) {
        super(protocol);
        List<String> newRegistries = List.of("pig_variant", "cow_variant", "frog_variant", "cat_variant", "chicken_variant", "test_environment", "test_instance", "wolf_sound_variant");
        for (String registry : newRegistries) {
            this.remove(registry);
        }
    }

    public RegistryEntry[] handle(UserConnection connection, String key, RegistryEntry[] entries) {
        boolean trimPatternRegistry = key.equals("trim_pattern");
        if (trimPatternRegistry || key.equals("trim_material")) {
            this.updateTrim(entries, trimPatternRegistry ? "template_item" : "ingredient");
        } else if (key.equals("enchantment")) {
            this.updateEnchantment(entries);
        } else if (key.equals("wolf_variant")) {
            for (RegistryEntry entry : entries) {
                if (entry.tag() == null) continue;
                CompoundTag variant = (CompoundTag)entry.tag();
                CompoundTag assets = (CompoundTag)variant.remove("assets");
                variant.put("wild_texture", assets.get("wild"));
                variant.put("tame_texture", assets.get("tame"));
                variant.put("angry_texture", assets.get("angry"));
                variant.put("biomes", (Tag)new ListTag(StringTag.class));
            }
        }
        return super.handle(connection, key, entries);
    }

    private void updateEnchantment(RegistryEntry[] entries) {
        for (RegistryEntry entry : entries) {
            CompoundTag enchantment;
            ListTag slots;
            if (entry.tag() == null || (slots = (enchantment = (CompoundTag)entry.tag()).getListTag("slots", StringTag.class)) == null) continue;
            slots.getValue().removeIf(tag -> tag.getValue().equals("saddle"));
        }
    }

    private void updateTrim(RegistryEntry[] entries, String itemKey) {
        for (RegistryEntry entry : entries) {
            if (entry.tag() == null) continue;
            CompoundTag tag = (CompoundTag)entry.tag();
            tag.putString(itemKey, "stone");
        }
    }
}

