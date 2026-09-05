/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Preconditions
 *  com.viaversion.nbt.tag.ListTag
 *  com.viaversion.nbt.tag.StringTag
 *  com.viaversion.nbt.tag.Tag
 *  com.viaversion.viaversion.api.minecraft.HolderSetImpl$Tag
 *  com.viaversion.viaversion.libs.fastutil.ints.Int2IntFunction
 */
package com.viaversion.viaversion.api.minecraft;

import com.google.common.base.Preconditions;
import com.viaversion.nbt.tag.ListTag;
import com.viaversion.nbt.tag.StringTag;
import com.viaversion.nbt.tag.Tag;
import com.viaversion.viaversion.api.minecraft.HolderSetImpl;
import com.viaversion.viaversion.libs.fastutil.ints.Int2IntFunction;
import java.util.function.ToIntFunction;

public interface HolderSet {
    public int[] ids();

    public String tagKey();

    public static HolderSet fromTag(Tag tag, ToIntFunction<String> mappingFunction) {
        if (tag instanceof StringTag) {
            StringTag stringTag = (StringTag)tag;
            if (stringTag.getValue().startsWith("#")) {
                return HolderSet.of(stringTag.getValue().substring(1));
            }
            int id = mappingFunction.applyAsInt(stringTag.getValue());
            return HolderSet.of(new int[]{id});
        }
        if (tag instanceof ListTag) {
            ListTag listTag = (ListTag)tag;
            int[] ids = new int[listTag.size()];
            for (int i = 0; i < listTag.size(); ++i) {
                String value = ((StringTag)listTag.get(i)).getValue();
                ids[i] = mappingFunction.applyAsInt(value);
            }
            return HolderSet.of(ids);
        }
        throw new IllegalArgumentException();
    }

    public boolean hasTagKey();

    public boolean hasIds();

    public static HolderSet of(String tagKey) {
        Preconditions.checkNotNull((Object)tagKey);
        return new HolderSetImpl.Tag(tagKey);
    }

    public static HolderSet of(int[] ids) {
        Preconditions.checkNotNull((Object)ids);
        return new HolderSetImpl.Ids(ids);
    }

    public HolderSet rewrite(Int2IntFunction var1);
}

