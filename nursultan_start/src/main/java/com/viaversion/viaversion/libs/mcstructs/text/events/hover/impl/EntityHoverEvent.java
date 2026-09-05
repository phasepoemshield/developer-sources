/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.viaversion.libs.mcstructs.core.utils.ToString
 *  com.viaversion.viaversion.libs.mcstructs.text.events.hover.impl.EntityHoverEvent$DataHolder
 *  com.viaversion.viaversion.libs.mcstructs.text.events.hover.impl.EntityHoverEvent$LegacyHolder
 *  com.viaversion.viaversion.libs.mcstructs.text.events.hover.impl.EntityHoverEvent$ModernHolder
 *  javax.annotation.Nullable
 */
package com.viaversion.viaversion.libs.mcstructs.text.events.hover.impl;

import com.viaversion.viaversion.libs.mcstructs.core.Identifier;
import com.viaversion.viaversion.libs.mcstructs.core.utils.ToString;
import com.viaversion.viaversion.libs.mcstructs.text.TextComponent;
import com.viaversion.viaversion.libs.mcstructs.text.events.hover.HoverEvent;
import com.viaversion.viaversion.libs.mcstructs.text.events.hover.HoverEventAction;
import com.viaversion.viaversion.libs.mcstructs.text.events.hover.impl.EntityHoverEvent;
import java.util.UUID;
import javax.annotation.Nullable;

public class EntityHoverEvent
extends HoverEvent {
    private DataHolder data;

    public EntityHoverEvent setData(DataHolder data) {
        this.data = data;
        return this;
    }

    public EntityHoverEvent(DataHolder data) {
        super(HoverEventAction.SHOW_ENTITY);
        this.data = data;
    }

    public EntityHoverEvent(Identifier type, UUID uuid, @Nullable TextComponent name) {
        super(HoverEventAction.SHOW_ENTITY);
        this.data = new ModernHolder(type, uuid, name);
    }

    public EntityHoverEvent(TextComponent legacyData) {
        super(HoverEventAction.SHOW_ENTITY);
        this.data = new LegacyHolder(legacyData);
    }

    @Override
    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof EntityHoverEvent)) {
            return false;
        }
        EntityHoverEvent other = (EntityHoverEvent)o;
        if (!other.canEqual(this)) {
            return false;
        }
        DataHolder this$data = this.getData();
        DataHolder other$data = other.getData();
        return !(this$data == null ? other$data != null : !this$data.equals(other$data));
    }

    @Override
    public String toString() {
        return ToString.of((Object)this).add("action", (Object)this.action).add("data", (Object)this.data).toString();
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
        throw new UnsupportedOperationException("Data holder is not a legacy string holder: " + this.data);
    }

    public boolean isLegacy() {
        return this.data instanceof LegacyHolder;
    }

    public EntityHoverEvent setLegacyData(TextComponent data) {
        this.data = new LegacyHolder(data);
        return this;
    }

    public EntityHoverEvent setModernData(Identifier type, UUID uuid, @Nullable TextComponent name) {
        this.data = new ModernHolder(type, uuid, name);
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
        return other instanceof EntityHoverEvent;
    }
}

