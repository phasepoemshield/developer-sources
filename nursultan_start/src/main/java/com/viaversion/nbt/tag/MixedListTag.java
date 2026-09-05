/*
 * Decompiled with CFR 0.152.
 */
package com.viaversion.nbt.tag;

import com.viaversion.nbt.tag.CompoundTag;
import com.viaversion.nbt.tag.ListTag;
import com.viaversion.nbt.tag.Tag;
import java.io.DataOutput;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;

public final class MixedListTag
extends ListTag<Tag> {
    public MixedListTag() {
    }

    public MixedListTag(List<Tag> value) {
        super(value);
    }

    private static Tag wrap(Tag tag) {
        if (tag instanceof CompoundTag) {
            return tag;
        }
        CompoundTag wrapper = new CompoundTag(new LinkedHashMap<String, Tag>(1, 1.0f));
        wrapper.put("", tag);
        return wrapper;
    }

    @Override
    public void write(DataOutput out) throws IOException {
        if (this.value.isEmpty()) {
            out.writeByte(0);
        } else {
            out.writeByte(10);
        }
        out.writeInt(this.value.size());
        for (Tag tag : this.value) {
            MixedListTag.wrap(tag).write(out);
        }
    }

    @Override
    public void setValue(List<Tag> value) {
        this.value = new ArrayList<Tag>(value);
    }

    @Override
    public MixedListTag copy() {
        MixedListTag copy = new MixedListTag();
        copy.value = new ArrayList(this.value.size());
        for (Tag tag : this.value) {
            copy.add(tag.copy());
        }
        return copy;
    }

    @Override
    public Class<? extends Tag> getElementType() {
        return null;
    }

    @Override
    protected void checkAddedTag(Tag tag) {
    }
}

