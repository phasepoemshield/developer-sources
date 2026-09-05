/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.nbt.tag.CompoundTag
 *  com.viaversion.nbt.tag.Tag
 *  com.viaversion.viaversion.api.connection.UserConnection
 *  com.viaversion.viaversion.api.minecraft.RegistryEntry
 *  com.viaversion.viaversion.util.ArrayUtil
 *  com.viaversion.viaversion.util.Key
 */
package com.viaversion.viaaprilfools.protocol.s25w14craftminetov1_21_5.rewriter;

import com.viaversion.nbt.tag.CompoundTag;
import com.viaversion.nbt.tag.Tag;
import com.viaversion.viabackwards.api.BackwardsProtocol;
import com.viaversion.viabackwards.api.rewriters.BackwardsRegistryRewriter;
import com.viaversion.viaversion.api.connection.UserConnection;
import com.viaversion.viaversion.api.minecraft.RegistryEntry;
import com.viaversion.viaversion.util.ArrayUtil;
import com.viaversion.viaversion.util.Key;

public final class RegistryDataRewriter25w14craftmine
extends BackwardsRegistryRewriter {
    public RegistryDataRewriter25w14craftmine(BackwardsProtocol<?, ?, ?, ?> protocol) {
        super(protocol);
        this.addHandler("dimension_type", (key, compoundTag) -> compoundTag.putString("effects", Key.namespaced((String)key)));
    }

    @Override
    public RegistryEntry[] handle(UserConnection connection, String key, RegistryEntry[] entries) {
        for (int i = 0; i < entries.length; ++i) {
            CompoundTag tag;
            String soundEvent;
            RegistryEntry entry = entries[i];
            if (Key.equals((String)key, (String)"dimension_type") && Key.equals((String)entry.key(), (String)"generated")) {
                entries = (RegistryEntry[])ArrayUtil.remove((Object[])entries, (int)i--);
                continue;
            }
            Tag tag2 = entry.tag();
            if (!(tag2 instanceof CompoundTag) || (soundEvent = (tag = (CompoundTag)tag2).getString("sound_event")) == null || !Key.namespace((String)soundEvent).equals("nothingtoseehere")) continue;
            tag.putString("sound_event", "intentionally_empty");
        }
        return super.handle(connection, key, entries);
    }
}

