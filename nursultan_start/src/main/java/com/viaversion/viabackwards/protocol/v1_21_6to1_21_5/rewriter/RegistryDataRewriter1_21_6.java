/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.nbt.tag.CompoundTag
 *  com.viaversion.nbt.tag.Tag
 *  com.viaversion.viabackwards.api.BackwardsProtocol
 *  com.viaversion.viabackwards.api.rewriters.BackwardsRegistryRewriter
 *  com.viaversion.viabackwards.protocol.v1_21_6to1_21_5.storage.RegistryAndTags
 *  com.viaversion.viaversion.api.connection.UserConnection
 *  com.viaversion.viaversion.api.minecraft.RegistryEntry
 *  com.viaversion.viaversion.libs.fastutil.objects.Object2ObjectArrayMap
 *  com.viaversion.viaversion.libs.fastutil.objects.Object2ObjectMap
 *  com.viaversion.viaversion.util.Key
 *  com.viaversion.viaversion.util.KeyMappings
 */
package com.viaversion.viabackwards.protocol.v1_21_6to1_21_5.rewriter;

import com.viaversion.nbt.tag.CompoundTag;
import com.viaversion.nbt.tag.Tag;
import com.viaversion.viabackwards.api.BackwardsProtocol;
import com.viaversion.viabackwards.api.rewriters.BackwardsRegistryRewriter;
import com.viaversion.viabackwards.protocol.v1_21_6to1_21_5.storage.RegistryAndTags;
import com.viaversion.viaversion.api.connection.UserConnection;
import com.viaversion.viaversion.api.minecraft.RegistryEntry;
import com.viaversion.viaversion.libs.fastutil.objects.Object2ObjectArrayMap;
import com.viaversion.viaversion.libs.fastutil.objects.Object2ObjectMap;
import com.viaversion.viaversion.util.Key;
import com.viaversion.viaversion.util.KeyMappings;

public final class RegistryDataRewriter1_21_6
extends BackwardsRegistryRewriter {
    public RegistryDataRewriter1_21_6(BackwardsProtocol<?, ?, ?, ?> protocol) {
        super(protocol);
        this.remove("dialog");
    }

    public RegistryEntry[] handle(UserConnection connection, String key, RegistryEntry[] entries) {
        if (Key.stripMinecraftNamespace((String)key).equals("dialog")) {
            String[] keys = new String[entries.length];
            for (int i = 0; i < entries.length; ++i) {
                keys[i] = Key.stripMinecraftNamespace((String)entries[i].key());
            }
            Object2ObjectArrayMap dialogs = new Object2ObjectArrayMap();
            for (RegistryEntry entry : entries) {
                Tag tag = entry.tag();
                if (!(tag instanceof CompoundTag)) continue;
                CompoundTag tag2 = (CompoundTag)tag;
                dialogs.put((Object)Key.stripMinecraftNamespace((String)entry.key()), (Object)tag2);
            }
            RegistryAndTags registryAndTags = (RegistryAndTags)connection.get(RegistryAndTags.class);
            registryAndTags.storeRegistry(new KeyMappings(keys), (Object2ObjectMap)dialogs);
        }
        return super.handle(connection, key, entries);
    }
}

