/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.viaversion.api.type.Type
 *  com.viaversion.viaversion.api.type.Types
 *  com.viaversion.viaversion.api.type.types.misc.ParticleType
 */
package com.viaversion.viaversion.api.minecraft.entitydata.types;

import com.viaversion.viaversion.api.minecraft.entitydata.EntityDataType;
import com.viaversion.viaversion.api.minecraft.entitydata.types.AbstractEntityDataTypes;
import com.viaversion.viaversion.api.type.Type;
import com.viaversion.viaversion.api.type.Types;
import com.viaversion.viaversion.api.type.types.misc.ParticleType;

public final class EntityDataTypes1_13
extends AbstractEntityDataTypes {
    public final EntityDataType byteType = this.add(0, (Type<?>)Types.BYTE);
    public final EntityDataType varIntType = this.add(1, (Type<?>)Types.VAR_INT);
    public final EntityDataType floatType = this.add(2, (Type<?>)Types.FLOAT);
    public final EntityDataType stringType = this.add(3, Types.STRING);
    public final EntityDataType componentType = this.add(4, Types.COMPONENT);
    public final EntityDataType optionalComponentType = this.add(5, Types.OPTIONAL_COMPONENT);
    public final EntityDataType itemType = this.add(6, Types.ITEM1_13);
    public final EntityDataType booleanType = this.add(7, (Type<?>)Types.BOOLEAN);
    public final EntityDataType rotationsType = this.add(8, Types.ROTATIONS);
    public final EntityDataType blockPositionType = this.add(9, Types.BLOCK_POSITION1_8);
    public final EntityDataType optionalBlockPositionType = this.add(10, Types.OPTIONAL_POSITION1_8);
    public final EntityDataType directionType = this.add(11, (Type<?>)Types.VAR_INT);
    public final EntityDataType optionalUUIDType = this.add(12, Types.OPTIONAL_UUID);
    public final EntityDataType optionalBlockStateType = this.add(13, (Type<?>)Types.VAR_INT);
    public final EntityDataType compoundTagType = this.add(14, Types.NAMED_COMPOUND_TAG);
    public final EntityDataType particleType;

    public EntityDataTypes1_13(ParticleType particleType) {
        super(16);
        this.particleType = this.add(15, (Type<?>)particleType);
    }
}

