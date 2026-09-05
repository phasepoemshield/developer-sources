/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  de.maxhenkel.voicechat.api.Entity
 *  de.maxhenkel.voicechat.api.Position
 *  de.maxhenkel.voicechat.intercompatibility.CommonCompatibilityManager
 *  minecraft.class07049
 */
package de.maxhenkel.voicechat.plugins.impl;

import de.maxhenkel.voicechat.api.Entity;
import de.maxhenkel.voicechat.api.Position;
import de.maxhenkel.voicechat.intercompatibility.CommonCompatibilityManager;
import de.maxhenkel.voicechat.plugins.impl.PositionImpl;
import java.util.Objects;
import java.util.UUID;
import minecraft.class07049;

public class EntityImpl
implements Entity {
    protected class07049 entity;

    public EntityImpl(class07049 class070492) {
        this.entity = class070492;
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object == null || this.getClass() != object.getClass()) {
            return false;
        }
        EntityImpl entityImpl = (EntityImpl)object;
        return Objects.equals(this.entity, entityImpl.entity);
    }

    public int hashCode() {
        return this.entity != null ? this.entity.hashCode() : 0;
    }

    public Position getPosition() {
        return new PositionImpl(this.entity.method_73189());
    }

    public Object getEntity() {
        return CommonCompatibilityManager.INSTANCE.createRawApiEntity(this.entity);
    }

    public UUID getUuid() {
        return this.entity.method_5667();
    }

    public class07049 getRealEntity() {
        return this.entity;
    }
}

