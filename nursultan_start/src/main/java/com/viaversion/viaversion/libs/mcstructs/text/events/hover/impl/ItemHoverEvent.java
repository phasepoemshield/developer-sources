/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.nbt.tag.CompoundTag
 *  com.viaversion.viaversion.libs.mcstructs.core.utils.ToString
 *  com.viaversion.viaversion.libs.mcstructs.text.events.hover.impl.ItemHoverEvent$DataHolder
 *  com.viaversion.viaversion.libs.mcstructs.text.events.hover.impl.ItemHoverEvent$LegacyHolder
 *  com.viaversion.viaversion.libs.mcstructs.text.events.hover.impl.ItemHoverEvent$ModernHolder
 *  javax.annotation.Nullable
 */
package com.viaversion.viaversion.libs.mcstructs.text.events.hover.impl;

import com.viaversion.nbt.tag.CompoundTag;
import com.viaversion.viaversion.libs.mcstructs.core.Identifier;
import com.viaversion.viaversion.libs.mcstructs.core.utils.ToString;
import com.viaversion.viaversion.libs.mcstructs.text.events.hover.HoverEvent;
import com.viaversion.viaversion.libs.mcstructs.text.events.hover.HoverEventAction;
import com.viaversion.viaversion.libs.mcstructs.text.events.hover.impl.ItemHoverEvent;
import javax.annotation.Nullable;

public class ItemHoverEvent
extends HoverEvent {
    private DataHolder data;

    public ItemHoverEvent setData(String data) {
        this.data = new LegacyHolder(data);
        return this;
    }

    public ItemHoverEvent(DataHolder data) {
        super(HoverEventAction.SHOW_ITEM);
        this.data = data;
    }

    public ItemHoverEvent(Identifier id, int count, @Nullable CompoundTag tag) {
        super(HoverEventAction.SHOW_ITEM);
        this.data = new ModernHolder(id, count, tag);
    }

    public ItemHoverEvent(String legacyData) {
        super(HoverEventAction.SHOW_ITEM);
        this.data = new LegacyHolder(legacyData);
    }

    @Override
    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof ItemHoverEvent)) {
            return false;
        }
        ItemHoverEvent other = (ItemHoverEvent)o;
        if (!other.canEqual(this)) {
            return false;
        }
        DataHolder this$data = this.getData();
        DataHolder other$data = other.getData();
        return !(this$data == null ? other$data != null : !this$data.equals(other$data));
    }

    @Override
    public String toString() {
        return ToString.of((Object)this).put("action", (Object)this.action).put("data", (Object)this.data).toString();
    }

    @Override
    public int hashCode() {
        int PRIME = 59;
        int result = 1;
        DataHolder $data = this.getData();
        result = result * 59 + ($data == null ? 43 : $data.hashCode());
        return result;
    }

    public DataHolder getData() {
        return this.data;
    }

    public LegacyHolder asLegacy() {
        if (this.data instanceof LegacyHolder) {
            return (LegacyHolder)this.data;
        }
        throw new UnsupportedOperationException("Data holder is not a legacy raw holder: " + this.data);
    }

    public boolean isLegacy() {
        return this.data instanceof LegacyHolder;
    }

    public ItemHoverEvent setLegacyData(String data) {
        this.data = new LegacyHolder(data);
        return this;
    }

    public ItemHoverEvent setModernData(Identifier id, int count, @Nullable CompoundTag tag) {
        this.data = new ModernHolder(id, count, tag);
        return this;
    }

    public boolean isModern() {
        return this.data instanceof ModernHolder;
    }

    public ModernHolder asModern() {
        if (this.data instanceof ModernHolder) {
            return (ModernHolder)this.data;
        }
        throw new UnsupportedOperationException("Data holder is not a modern holder: " + this.data);
    }

    protected boolean canEqual(Object other) {
        return other instanceof ItemHoverEvent;
    }
}

