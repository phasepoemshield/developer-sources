/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.viaversion.api.minecraft.entitydata.EntityData
 *  com.viaversion.viaversion.api.minecraft.entitydata.EntityDataType
 *  com.viaversion.viaversion.api.type.Types
 *  io.netty.buffer.ByteBuf
 */
package com.viaversion.viaversion.api.type.types.entitydata;

import com.viaversion.viaversion.api.minecraft.entitydata.EntityData;
import com.viaversion.viaversion.api.minecraft.entitydata.EntityDataType;
import com.viaversion.viaversion.api.type.Types;
import com.viaversion.viaversion.api.type.types.entitydata.EntityDataTypeTemplate;
import io.netty.buffer.ByteBuf;

public abstract class ModernEntityDataType
extends EntityDataTypeTemplate {
    private static final int END = 255;

    public void write(ByteBuf buffer, EntityData object) {
        if (object == null) {
            buffer.writeByte(255);
        } else {
            buffer.writeByte(object.id());
            EntityDataType type = object.dataType();
            Types.VAR_INT.writePrimitive(buffer, type.typeId());
            type.type().write(buffer, object.getValue());
        }
    }

    public EntityData read(ByteBuf buffer) {
        short index = buffer.readUnsignedByte();
        if (index == 255) {
            return null;
        }
        EntityDataType type = this.getType(Types.VAR_INT.readPrimitive(buffer));
        return new EntityData((int)index, type, type.type().read(buffer));
    }

    protected abstract EntityDataType getType(int var1);
}

