/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.viaversion.api.minecraft.entitydata.EntityDataType
 *  com.viaversion.viaversion.api.type.Type
 *  com.viaversion.viaversion.api.type.Types
 */
package com.viaversion.viaversion.api.minecraft.entitydata.types;

import com.viaversion.viaversion.api.minecraft.entitydata.EntityDataType;
import com.viaversion.viaversion.api.type.Type;
import com.viaversion.viaversion.api.type.Types;

public enum EntityDataTypes1_9 implements EntityDataType
{
    BYTE((Type<?>)Types.BYTE),
    VAR_INT((Type<?>)Types.VAR_INT),
    FLOAT((Type<?>)Types.FLOAT),
    STRING(Types.STRING),
    COMPONENT(Types.COMPONENT),
    ITEM(Types.ITEM1_8),
    BOOLEAN((Type<?>)Types.BOOLEAN),
    ROTATIONS(Types.ROTATIONS),
    BLOCK_POSITION(Types.BLOCK_POSITION1_8),
    OPTIONAL_BLOCK_POSITION(Types.OPTIONAL_POSITION1_8),
    DIRECTION((Type<?>)Types.VAR_INT),
    OPTIONAL_UUID(Types.OPTIONAL_UUID),
    OPTIONAL_BLOCK_STATE((Type<?>)Types.VAR_INT);

    private final Type<?> type;

    private EntityDataTypes1_9(Type<?> type) {
        this.type = type;
    }

    public static EntityDataTypes1_9 byId(int id) {
        return EntityDataTypes1_9.values()[id];
    }

    public int typeId() {
        return this.ordinal();
    }

    public Type type() {
        return this.type;
    }
}

