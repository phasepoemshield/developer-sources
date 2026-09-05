/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.viaversion.api.minecraft.Vector
 *  com.viaversion.viaversion.api.type.Type
 *  com.viaversion.viaversion.api.type.Types
 *  io.netty.buffer.ByteBuf
 */
package com.viaversion.viaversion.api.type.types.math;

import com.viaversion.viaversion.api.minecraft.Vector;
import com.viaversion.viaversion.api.type.Type;
import com.viaversion.viaversion.api.type.Types;
import io.netty.buffer.ByteBuf;

public class VectorType
extends Type<Vector> {
    public VectorType() {
        super(Vector.class);
    }

    public void write(ByteBuf buffer, Vector object) {
        Types.INT.write(buffer, Integer.valueOf(object.blockX()));
        Types.INT.write(buffer, Integer.valueOf(object.blockY()));
        Types.INT.write(buffer, Integer.valueOf(object.blockZ()));
    }

    public Vector read(ByteBuf buffer) {
        int x = Types.INT.read(buffer);
        int y = Types.INT.read(buffer);
        int z = Types.INT.read(buffer);
        return new Vector(x, y, z);
    }
}

