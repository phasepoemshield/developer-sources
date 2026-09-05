/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.nbt.tag.CompoundTag
 *  com.viaversion.nbt.tag.ListTag
 *  com.viaversion.nbt.tag.NumberTag
 *  com.viaversion.viabackwards.ViaBackwards
 *  com.viaversion.viabackwards.api.data.BackwardsMappingData
 *  com.viaversion.viabackwards.api.data.BackwardsMappingDataLoader
 *  com.viaversion.viaversion.libs.fastutil.ints.Int2ObjectMap
 *  com.viaversion.viaversion.libs.fastutil.ints.Int2ObjectOpenHashMap
 *  com.viaversion.viaversion.protocols.v1_18_2to1_19.Protocol1_18_2To1_19
 *  org.checkerframework.checker.nullness.qual.Nullable
 */
package com.viaversion.viabackwards.protocol.v1_19to1_18_2.data;

import com.viaversion.nbt.tag.CompoundTag;
import com.viaversion.nbt.tag.ListTag;
import com.viaversion.nbt.tag.NumberTag;
import com.viaversion.viabackwards.ViaBackwards;
import com.viaversion.viabackwards.api.data.BackwardsMappingData;
import com.viaversion.viabackwards.api.data.BackwardsMappingDataLoader;
import com.viaversion.viaversion.libs.fastutil.ints.Int2ObjectMap;
import com.viaversion.viaversion.libs.fastutil.ints.Int2ObjectOpenHashMap;
import com.viaversion.viaversion.protocols.v1_18_2to1_19.Protocol1_18_2To1_19;
import org.checkerframework.checker.nullness.qual.Nullable;

public final class BackwardsMappingData1_19
extends BackwardsMappingData {
    private final Int2ObjectMap<CompoundTag> defaultChatTypes = new Int2ObjectOpenHashMap();

    protected void loadExtras(CompoundTag data) {
        if (ViaBackwards.getConfig().sculkShriekerToCryingObsidian()) {
            for (int i = 18900; i <= 18907; ++i) {
                this.blockStateMappings.setNewId(i, 16082);
            }
            this.itemMappings.setNewId(329, 1065);
        }
        super.loadExtras(data);
        ListTag chatTypes = BackwardsMappingDataLoader.INSTANCE.loadNBT("chat-types-1.19.1.nbt").getListTag("values", CompoundTag.class);
        for (CompoundTag chatType : chatTypes) {
            NumberTag idTag = chatType.getNumberTag("id");
            this.defaultChatTypes.put(idTag.asInt(), (Object)chatType);
        }
    }

    public @Nullable CompoundTag chatType(int id) {
        return (CompoundTag)this.defaultChatTypes.get(id);
    }

    public BackwardsMappingData1_19() {
        super("1.19", "1.18", Protocol1_18_2To1_19.class);
    }
}

