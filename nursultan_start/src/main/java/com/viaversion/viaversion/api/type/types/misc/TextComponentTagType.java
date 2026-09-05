/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.nbt.tag.ByteTag
 *  com.viaversion.nbt.tag.CompoundTag
 *  com.viaversion.nbt.tag.Tag
 *  com.viaversion.viaversion.api.minecraft.codec.Ops
 *  com.viaversion.viaversion.api.minecraft.codec.Ops$MapSerializer
 *  com.viaversion.viaversion.api.type.Type
 *  com.viaversion.viaversion.api.type.Types
 */
package com.viaversion.viaversion.api.type.types.misc;

import com.viaversion.nbt.tag.ByteTag;
import com.viaversion.nbt.tag.CompoundTag;
import com.viaversion.nbt.tag.Tag;
import com.viaversion.viaversion.api.minecraft.codec.Ops;
import com.viaversion.viaversion.api.type.Type;
import com.viaversion.viaversion.api.type.Types;
import com.viaversion.viaversion.api.type.types.misc.TagType;
import java.util.Map;
import java.util.Set;

public class TextComponentTagType
extends TagType {
    private static final Set<String> BOOLEAN_KEYS = Set.of("bold", "italic", "underlined", "strikethrough", "obfuscated", "interpret");

    @Override
    public void write(Ops ops, Tag value) {
        if (value instanceof CompoundTag) {
            CompoundTag compoundTag = (CompoundTag)value;
            ops.writeMap(map -> {
                for (Map.Entry entry : compoundTag.entrySet()) {
                    this.write((Ops.MapSerializer)map, (String)entry.getKey(), (Tag)entry.getValue());
                }
            });
        } else {
            super.write(ops, value);
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    private void write(Ops.MapSerializer map, String key, Tag value) {
        if (value instanceof ByteTag) {
            ByteTag byteTag = (ByteTag)value;
            if (BOOLEAN_KEYS.contains(key)) {
                map.write(key, (Type)Types.BOOLEAN, (Object)byteTag.asBoolean());
                return;
            }
        }
        map.write(key, (Type)this, (Object)value);
    }
}

