/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.nbt.tag.CompoundTag
 *  com.viaversion.nbt.tag.ListTag
 *  com.viaversion.nbt.tag.NumberTag
 *  com.viaversion.viaversion.api.data.MappingDataBase
 *  com.viaversion.viaversion.api.data.MappingDataLoader
 *  com.viaversion.viaversion.libs.fastutil.ints.Int2ObjectMap
 *  com.viaversion.viaversion.libs.fastutil.ints.Int2ObjectOpenHashMap
 *  org.checkerframework.checker.nullness.qual.Nullable
 */
package com.viaversion.viaversion.protocols.v1_18_2to1_19.data;

import com.viaversion.nbt.tag.CompoundTag;
import com.viaversion.nbt.tag.ListTag;
import com.viaversion.nbt.tag.NumberTag;
import com.viaversion.viaversion.api.data.MappingDataBase;
import com.viaversion.viaversion.api.data.MappingDataLoader;
import com.viaversion.viaversion.libs.fastutil.ints.Int2ObjectMap;
import com.viaversion.viaversion.libs.fastutil.ints.Int2ObjectOpenHashMap;
import org.checkerframework.checker.nullness.qual.Nullable;

public final class MappingData1_19
extends MappingDataBase {
    private final Int2ObjectMap<CompoundTag> defaultChatTypes = new Int2ObjectOpenHashMap();
    private CompoundTag chatRegistry;

    protected void loadExtras(CompoundTag daata) {
        ListTag chatTypes = MappingDataLoader.INSTANCE.loadNBTFromFile("chat-types-1.19.nbt").getListTag("values", CompoundTag.class);
        for (CompoundTag chatType : chatTypes) {
            NumberTag idTag = chatType.getNumberTag("id");
            this.defaultChatTypes.put(idTag.asInt(), (Object)chatType);
        }
        this.chatRegistry = MappingDataLoader.INSTANCE.loadNBTFromFile("chat-registry-1.19.nbt");
    }

    public @Nullable CompoundTag chatType(int id) {
        return (CompoundTag)this.defaultChatTypes.get(id);
    }

    public MappingData1_19() {
        super("1.18", "1.19");
    }

    public CompoundTag chatRegistry() {
        return this.chatRegistry.copy();
    }
}

