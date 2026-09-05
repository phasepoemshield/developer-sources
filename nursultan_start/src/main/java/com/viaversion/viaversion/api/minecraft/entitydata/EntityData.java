/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Preconditions
 *  org.checkerframework.checker.nullness.qual.Nullable
 */
package com.viaversion.viaversion.api.minecraft.entitydata;

import com.google.common.base.Preconditions;
import com.viaversion.viaversion.api.minecraft.entitydata.EntityDataType;
import java.util.Objects;
import org.checkerframework.checker.nullness.qual.Nullable;

public final class EntityData {
    private int id;
    private EntityDataType dataType;
    private Object value;

    public void setId(int id) {
        this.id = id;
    }

    public EntityData(int id, EntityDataType dataType, @Nullable Object value) {
        this.id = id;
        this.dataType = dataType;
        this.value = this.checkValue(dataType, value);
    }

    public <T> @Nullable T value() {
        return (T)this.value;
    }

    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || this.getClass() != o.getClass()) {
            return false;
        }
        EntityData entityData = (EntityData)o;
        if (this.id != entityData.id) {
            return false;
        }
        if (this.dataType != entityData.dataType) {
            return false;
        }
        return Objects.equals(this.value, entityData.value);
    }

    public String toString() {
        return "EntityData{id=" + this.id + ", dataType=" + String.valueOf(this.dataType) + ", value=" + String.valueOf(this.value) + "}";
    }

    public int hashCode() {
        int result = this.id;
        result = 31 * result + this.dataType.hashCode();
        result = 31 * result + (this.value != null ? this.value.hashCode() : 0);
        return result;
    }

    public @Nullable Object getValue() {
        return this.value;
    }

    public int id() {
        return this.id;
    }

    public void setValue(@Nullable Object value) {
        this.value = this.checkValue(this.dataType, value);
    }

    private Object checkValue(EntityDataType dataType, @Nullable Object value) {
        Preconditions.checkNotNull((Object)dataType);
        if (value != null && !dataType.type().getOutputClass().isAssignableFrom(value.getClass())) {
            throw new IllegalArgumentException("Entity data value and dataType are incompatible. Type=" + String.valueOf(dataType) + ", value=" + String.valueOf(value) + " (" + value.getClass().getSimpleName() + ")");
        }
        return value;
    }

    public EntityDataType dataType() {
        return this.dataType;
    }

    public void setTypeAndValue(EntityDataType dataType, @Nullable Object value) {
        this.value = this.checkValue(dataType, value);
        this.dataType = dataType;
    }

    @Deprecated
    public void setDataTypeUnsafe(EntityDataType type) {
        this.dataType = type;
    }

    public void setDataType(EntityDataType dataType) {
        this.checkValue(dataType, this.value);
        this.dataType = dataType;
    }
}

