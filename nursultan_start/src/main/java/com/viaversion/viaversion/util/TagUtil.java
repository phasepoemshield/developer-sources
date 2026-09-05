/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.nbt.tag.CompoundTag
 *  com.viaversion.nbt.tag.ListTag
 *  com.viaversion.nbt.tag.NumberTag
 *  com.viaversion.nbt.tag.StringTag
 *  com.viaversion.nbt.tag.Tag
 *  com.viaversion.viaversion.util.TagUtil$TagUpdater
 *  org.checkerframework.checker.nullness.qual.Nullable
 */
package com.viaversion.viaversion.util;

import com.viaversion.nbt.tag.CompoundTag;
import com.viaversion.nbt.tag.ListTag;
import com.viaversion.nbt.tag.NumberTag;
import com.viaversion.nbt.tag.StringTag;
import com.viaversion.nbt.tag.Tag;
import com.viaversion.viaversion.util.Key;
import com.viaversion.viaversion.util.TagUtil;
import java.util.Map;
import org.checkerframework.checker.nullness.qual.Nullable;

public final class TagUtil {
    public static Tag handleDeep(Tag tag, TagUpdater consumer) {
        return TagUtil.handleDeep(null, tag, consumer);
    }

    private static Tag handleDeep(@Nullable String key, Tag tag, TagUpdater consumer) {
        if (tag instanceof CompoundTag) {
            CompoundTag compoundTag = (CompoundTag)tag;
            for (Map.Entry entry : compoundTag.entrySet()) {
                Tag updatedTag = TagUtil.handleDeep((String)entry.getKey(), (Tag)entry.getValue(), consumer);
                entry.setValue(updatedTag);
            }
        } else if (tag instanceof ListTag) {
            ListTag listTag = (ListTag)tag;
            TagUtil.handleListTag(listTag, consumer);
        }
        return consumer.update(key, tag);
    }

    public static @Nullable ListTag<? extends Tag> getNamespacedTagList(CompoundTag tag, String key) {
        ListTag listTag = tag.getListTag(Key.namespaced(key));
        return listTag != null ? listTag : tag.getListTag(Key.stripMinecraftNamespace(key));
    }

    public static @Nullable CompoundTag getNamespacedCompoundTag(CompoundTag tag, String key) {
        CompoundTag compoundTag = tag.getCompoundTag(Key.namespaced(key));
        return compoundTag != null ? compoundTag : tag.getCompoundTag(Key.stripMinecraftNamespace(key));
    }

    public static @Nullable ListTag<CompoundTag> getNamespacedCompoundTagList(CompoundTag tag, String key) {
        ListTag listTag = tag.getListTag(Key.namespaced(key), CompoundTag.class);
        return listTag != null ? listTag : tag.getListTag(Key.stripMinecraftNamespace(key), CompoundTag.class);
    }

    public static ListTag<CompoundTag> getRegistryEntries(CompoundTag tag, String key, @Nullable ListTag<CompoundTag> defaultValue) {
        CompoundTag registry = TagUtil.getNamespacedCompoundTag(tag, key);
        if (registry == null) {
            return defaultValue;
        }
        return registry.getListTag("value", CompoundTag.class);
    }

    public static ListTag<CompoundTag> getRegistryEntries(CompoundTag tag, String key) {
        return TagUtil.getRegistryEntries(tag, key, null);
    }

    public static boolean removeNamespaced(CompoundTag tag, String key) {
        return tag.remove(Key.namespaced(key)) != null || tag.remove(Key.stripMinecraftNamespace(key)) != null;
    }

    public static @Nullable Tag getNamespacedTag(CompoundTag tag, String key) {
        Tag value = tag.get(Key.namespaced(key));
        return value != null ? value : tag.get(Key.stripMinecraftNamespace(key));
    }

    public static @Nullable StringTag getNamespacedStringTag(CompoundTag tag, String key) {
        StringTag stringTag = tag.getStringTag(Key.namespaced(key));
        return stringTag != null ? stringTag : tag.getStringTag(Key.stripMinecraftNamespace(key));
    }

    public static String getNamespacedTagKey(CompoundTag tag, String name) {
        return tag.contains(Key.namespaced(name)) ? Key.namespaced(name) : Key.stripMinecraftNamespace(name);
    }

    public static ListTag<CompoundTag> removeRegistryEntries(CompoundTag tag, String key) {
        return TagUtil.removeRegistryEntries(tag, key, null);
    }

    public static ListTag<CompoundTag> removeRegistryEntries(CompoundTag tag, String key, @Nullable ListTag<CompoundTag> defaultValue) {
        String actualKey = TagUtil.getNamespacedTagKey(tag, key);
        CompoundTag registry = tag.getCompoundTag(actualKey);
        if (registry == null) {
            return defaultValue;
        }
        tag.remove(actualKey);
        return registry.getListTag("value", CompoundTag.class);
    }

    public static @Nullable NumberTag getNamespacedNumberTag(CompoundTag tag, String key) {
        NumberTag numberTag = tag.getNumberTag(Key.namespaced(key));
        return numberTag != null ? numberTag : tag.getNumberTag(Key.stripMinecraftNamespace(key));
    }

    private static <T extends Tag> void handleListTag(ListTag<T> listTag, TagUpdater consumer) {
        listTag.getValue().replaceAll(t -> TagUtil.handleDeep(null, t, consumer));
    }

    public static boolean containsNamespaced(CompoundTag tag, String key) {
        return tag.contains(Key.namespaced(key)) || tag.contains(Key.stripMinecraftNamespace(key));
    }
}

