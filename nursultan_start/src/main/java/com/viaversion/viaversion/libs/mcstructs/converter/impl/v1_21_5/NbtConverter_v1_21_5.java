/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.nbt.tag.ByteArrayTag
 *  com.viaversion.nbt.tag.ByteTag
 *  com.viaversion.nbt.tag.CompoundTag
 *  com.viaversion.nbt.tag.IntArrayTag
 *  com.viaversion.nbt.tag.IntTag
 *  com.viaversion.nbt.tag.ListTag
 *  com.viaversion.nbt.tag.LongArrayTag
 *  com.viaversion.nbt.tag.LongTag
 *  com.viaversion.nbt.tag.Tag
 *  com.viaversion.viaversion.libs.mcstructs.converter.impl.v1_21_5.NbtConverter_v1_21_5$ListType
 *  javax.annotation.Nullable
 */
package com.viaversion.viaversion.libs.mcstructs.converter.impl.v1_21_5;

import com.viaversion.nbt.tag.ByteArrayTag;
import com.viaversion.nbt.tag.ByteTag;
import com.viaversion.nbt.tag.CompoundTag;
import com.viaversion.nbt.tag.IntArrayTag;
import com.viaversion.nbt.tag.IntTag;
import com.viaversion.nbt.tag.ListTag;
import com.viaversion.nbt.tag.LongArrayTag;
import com.viaversion.nbt.tag.LongTag;
import com.viaversion.nbt.tag.Tag;
import com.viaversion.viaversion.libs.mcstructs.converter.DataConverter;
import com.viaversion.viaversion.libs.mcstructs.converter.impl.v1_20_3.NbtConverter_v1_20_3;
import com.viaversion.viaversion.libs.mcstructs.converter.impl.v1_21_5.NbtConverter_v1_21_5;
import com.viaversion.viaversion.libs.mcstructs.converter.model.Result;
import com.viaversion.viaversion.libs.mcstructs.snbt.SNbt;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Nullable;

public class NbtConverter_v1_21_5
extends NbtConverter_v1_20_3 {
    public static final NbtConverter_v1_21_5 INSTANCE = new NbtConverter_v1_21_5();

    @Override
    public DataConverter<Tag> forkIfDefault() {
        return this == INSTANCE ? new NbtConverter_v1_21_5() : this;
    }

    public NbtConverter_v1_21_5() {
        this(SNbt.V1_21_5);
    }

    protected NbtConverter_v1_21_5(SNbt<CompoundTag> sNbt) {
        super(sNbt);
    }

    @Override
    public Result<Tag> mergeList(@Nullable Tag list, List<Tag> values) {
        Result<List<Tag>> listResult;
        ListType listType;
        if (list == null) {
            listType = ListType.LIST;
        } else if (list instanceof ByteArrayTag) {
            listType = ((ByteArrayTag)list).length() == 0 ? ListType.LIST : ListType.BYTE;
        } else if (list instanceof IntArrayTag) {
            listType = ((IntArrayTag)list).length() == 0 ? ListType.LIST : ListType.INT;
        } else if (list instanceof LongArrayTag) {
            listType = ((LongArrayTag)list).length() == 0 ? ListType.LIST : ListType.LONG;
        } else if (list instanceof ListTag) {
            ListTag listTag = (ListTag)list;
            listType = CompoundTag.class == listTag.getElementType() ? ListType.MIXED_LIST : ListType.LIST;
        } else {
            return Result.error("Invalid list tag: " + list);
        }
        Result<List<Object>> result = listResult = list == null ? Result.success(new ArrayList()) : this.asList(list);
        if (listResult.isError()) {
            return listResult.mapError();
        }
        List<Tag> tags = listResult.get();
        tags.addAll(values);
        if (tags.isEmpty()) {
            return Result.success(new ListTag());
        }
        if (listType.equals((Object)ListType.BYTE)) {
            if (tags.stream().allMatch(tag -> tag instanceof ByteTag)) {
                byte[] bytes = new byte[tags.size()];
                for (int i = 0; i < tags.size(); ++i) {
                    bytes[i] = ((ByteTag)tags.get(i)).getValue();
                }
                return Result.success(new ByteArrayTag(bytes));
            }
        } else if (listType.equals((Object)ListType.INT)) {
            if (tags.stream().allMatch(tag -> tag instanceof IntTag)) {
                int[] ints = new int[tags.size()];
                for (int i = 0; i < tags.size(); ++i) {
                    ints[i] = ((IntTag)tags.get(i)).getValue();
                }
                return Result.success(new IntArrayTag(ints));
            }
        } else if (listType.equals((Object)ListType.LONG)) {
            if (tags.stream().allMatch(tag -> tag instanceof LongTag)) {
                long[] longs = new long[tags.size()];
                for (int i = 0; i < tags.size(); ++i) {
                    longs[i] = ((LongTag)tags.get(i)).getValue();
                }
                return Result.success(new LongArrayTag(longs));
            }
        } else if (listType.equals((Object)ListType.LIST)) {
            Tag type = null;
            for (Tag tag2 : tags) {
                if (type == null) {
                    type = tag2;
                    continue;
                }
                if (type.equals(tag2)) continue;
                type = null;
                break;
            }
            if (type != null) {
                return Result.success(new ListTag(tags));
            }
        }
        ListTag out = new ListTag();
        for (Tag tag2 : tags) {
            boolean isMarker;
            boolean bl = isMarker = tag2 instanceof CompoundTag && ((CompoundTag)tag2).size() == 1 && ((CompoundTag)tag2).contains("");
            if (tag2 instanceof CompoundTag && !isMarker) {
                out.add(tag2);
                continue;
            }
            CompoundTag compoundTag = new CompoundTag();
            compoundTag.put("", tag2);
            out.add((Tag)compoundTag);
        }
        return Result.success(out);
    }
}

