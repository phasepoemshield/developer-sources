/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.viaversion.api.minecraft.codec.Ops
 *  com.viaversion.viaversion.api.type.Type
 *  com.viaversion.viaversion.api.type.TypeConverter
 *  com.viaversion.viaversion.api.type.Types
 *  io.netty.buffer.ByteBuf
 */
package com.viaversion.viaversion.api.type.types;

import com.viaversion.viaversion.api.minecraft.codec.Ops;
import com.viaversion.viaversion.api.type.Type;
import com.viaversion.viaversion.api.type.TypeConverter;
import com.viaversion.viaversion.api.type.Types;
import io.netty.buffer.ByteBuf;

public class VarIntType
extends Type<Integer>
implements TypeConverter<Integer> {
    private static final int CONTINUE_BIT = 128;
    private static final int VALUE_BITS = 127;
    private static final int MULTI_BYTE_BITS = -128;
    private static final int MAX_BYTES = 5;
    private static final int[] VAR_INT_LENGTHS = new int[65];

    public VarIntType() {
        super("VarInt", Integer.class);
    }

    public Integer from(Object object) {
        if (object instanceof Number) {
            Number number = (Number)object;
            return number.intValue();
        }
        if (object instanceof Boolean) {
            Boolean bl = (Boolean)object;
            return bl != false ? 1 : 0;
        }
        throw new UnsupportedOperationException();
    }

    public void write(Ops ops, Integer n) {
        Types.INT.write(ops, n);
    }

    @Deprecated
    public void write(ByteBuf byteBuf, Integer n) {
        this.writePrimitive(byteBuf, n);
    }

    @Deprecated
    public Integer read(ByteBuf byteBuf) {
        return this.readPrimitive(byteBuf);
    }

    public int readPrimitive(ByteBuf byteBuf) {
        byte by;
        int n = 0;
        int n2 = 0;
        do {
            by = byteBuf.readByte();
            n |= (by & 0x7F) << n2++ * 7;
            if (n2 <= 5) continue;
            throw new RuntimeException("VarInt too big");
        } while ((by & 0x80) == 128);
        return n;
    }

    public void writePrimitive(ByteBuf byteBuf, int n) {
        while ((n & 0xFFFFFF80) != 0) {
            byteBuf.writeByte(n & 0x7F | 0x80);
            n >>>= 7;
        }
        byteBuf.writeByte(n);
    }

    public static int varIntLength(int n) {
        return VAR_INT_LENGTHS[Integer.numberOfLeadingZeros(n)];
    }

    static {
        for (int i = 0; i <= 32; ++i) {
            VarIntType.VAR_INT_LENGTHS[i] = (int)Math.ceil((31.0 - (double)(i - 1)) / 7.0);
        }
        VarIntType.VAR_INT_LENGTHS[32] = 1;
    }
}

