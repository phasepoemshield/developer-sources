/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.viaversion.api.minecraft.Quaternion
 *  com.viaversion.viaversion.api.type.Type
 *  io.netty.buffer.ByteBuf
 */
package com.viaversion.viaversion.api.type.types.math;

import com.viaversion.viaversion.api.minecraft.Quaternion;
import com.viaversion.viaversion.api.type.Type;
import io.netty.buffer.ByteBuf;

public class QuaternionType
extends Type<Quaternion> {
    public QuaternionType() {
        super(Quaternion.class);
    }

    public void write(ByteBuf buffer, Quaternion object) {
        buffer.writeFloat(object.x());
        buffer.writeFloat(object.y());
        buffer.writeFloat(object.z());
        buffer.writeFloat(object.w());
    }

    public Quaternion read(ByteBuf buffer) {
        float x = buffer.readFloat();
        float y = buffer.readFloat();
        float z = buffer.readFloat();
        float w = buffer.readFloat();
        return new Quaternion(x, y, z, w);
    }
}

