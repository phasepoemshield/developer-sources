/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Preconditions
 *  com.viaversion.viaversion.api.type.Type
 */
package com.viaversion.viaversion.api.minecraft.entitydata;

import com.google.common.base.Preconditions;
import com.viaversion.viaversion.api.type.Type;

public interface EntityDataType {
    public static EntityDataType create(int typeId, Type<?> type) {
        return new EntityDataTypeImpl(typeId, type);
    }

    public Type type();

    public int typeId();

    public static final class EntityDataTypeImpl
    implements EntityDataType {
        private final int typeId;
        private final Type<?> type;

        EntityDataTypeImpl(int typeId, Type<?> type) {
            Preconditions.checkNotNull(type);
            this.typeId = typeId;
            this.type = type;
        }

        public Type<?> type() {
            return this.type;
        }

        public boolean equals(Object o) {
            if (this == o) {
                return true;
            }
            if (o == null || this.getClass() != o.getClass()) {
                return false;
            }
            EntityDataTypeImpl dataType = (EntityDataTypeImpl)o;
            if (this.typeId != dataType.typeId) {
                return false;
            }
            return this.type.equals(dataType.type);
        }

        public String toString() {
            return "EntityDataTypeImpl{typeId=" + this.typeId + ", type=" + String.valueOf(this.type) + "}";
        }

        public int hashCode() {
            int result = this.typeId;
            result = 31 * result + this.type.hashCode();
            return result;
        }

        @Override
        public int typeId() {
            return this.typeId;
        }
    }
}

