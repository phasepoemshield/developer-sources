/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.viaversion.api.type.Type
 */
package com.viaversion.viaversion.api.minecraft.entitydata.types;

import com.viaversion.viaversion.api.minecraft.entitydata.EntityDataType;
import com.viaversion.viaversion.api.minecraft.entitydata.types.EntityDataTypes;
import com.viaversion.viaversion.api.type.Type;

public abstract class AbstractEntityDataTypes
implements EntityDataTypes {
    private final EntityDataType[] values;

    protected AbstractEntityDataTypes(int values) {
        this.values = new EntityDataType[values];
    }

    @Override
    public EntityDataType[] values() {
        return this.values;
    }

    protected EntityDataType add(int typeId, Type<?> type) {
        EntityDataType dataType;
        if (this.values[typeId] != null) {
            throw new IllegalArgumentException("Entity data type ID " + typeId + " is already registered as " + String.valueOf(this.values[typeId]));
        }
        this.values[typeId] = dataType = EntityDataType.create(typeId, type);
        return dataType;
    }

    @Override
    public EntityDataType byId(int id) {
        return this.values[id];
    }

    public Class<? extends EntityDataType> getDataTypeClass() {
        return this.byId(0).getClass();
    }
}

