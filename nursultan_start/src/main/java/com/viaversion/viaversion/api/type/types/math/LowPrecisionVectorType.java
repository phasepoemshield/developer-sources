/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.viaversion.api.minecraft.Vector3d
 *  com.viaversion.viaversion.api.type.Type
 *  com.viaversion.viaversion.api.type.Types
 *  com.viaversion.viaversion.util.MathUtil
 *  io.netty.buffer.ByteBuf
 */
package com.viaversion.viaversion.api.type.types.math;

import com.viaversion.viaversion.api.minecraft.Vector3d;
import com.viaversion.viaversion.api.type.Type;
import com.viaversion.viaversion.api.type.Types;
import com.viaversion.viaversion.util.MathUtil;
import io.netty.buffer.ByteBuf;

public class LowPrecisionVectorType
extends Type<Vector3d> {
    private static final double MAX_QUANTIZED_VALUE = 32766.0;
    private static final int SCALE_BITS = 2;
    private static final int SCALE_BITS_MASK = 3;
    private static final int CONTINUATION_FLAG = 4;
    private static final double ABS_MAX_VALUE = 1.7179869183E10;
    private static final double ABS_MIN_VALUE = 3.051944088384301E-5;

    private long pack(double value) {
        double shifted = value * 0.5 + 0.5;
        return Math.round(shifted * 32766.0);
    }

    private double sanitize(double value) {
        return Double.isNaN(value) ? 0.0 : MathUtil.clamp((double)value, (double)-1.7179869183E10, (double)1.7179869183E10);
    }

    private double unpack(long value) {
        double clamped = Math.min((double)(value & 0x7FFFL), 32766.0);
        return clamped * 2.0 / 32766.0 - 1.0;
    }

    public LowPrecisionVectorType() {
        super(Vector3d.class);
    }

    public void write(ByteBuf buffer, Vector3d vec) {
        double x = this.sanitize(vec.x());
        double y = this.sanitize(vec.y());
        double z = this.sanitize(vec.z());
        double maxPart = Math.max(Math.abs(x), Math.max(Math.abs(y), Math.abs(z)));
        if (maxPart < 3.051944088384301E-5) {
            buffer.writeByte(0);
            return;
        }
        long scale = MathUtil.ceilLong((double)maxPart);
        boolean scaleTooLargeForBits = (scale & 3L) != scale;
        long scaleBits = scaleTooLargeForBits ? scale & 3L | 4L : scale;
        long packed = scaleBits | this.pack(x / (double)scale) << 3 | this.pack(y / (double)scale) << 18 | this.pack(z / (double)scale) << 33;
        buffer.writeByte((int)((byte)packed));
        buffer.writeByte((int)((byte)(packed >> 8)));
        buffer.writeInt((int)(packed >> 16));
        if (scaleTooLargeForBits) {
            Types.VAR_INT.writePrimitive(buffer, (int)(scale >> 2));
        }
    }

    public Vector3d read(ByteBuf buffer) {
        short first = Types.UNSIGNED_BYTE.read(buffer);
        if (first == 0) {
            return Vector3d.ZERO;
        }
        short second = Types.UNSIGNED_BYTE.read(buffer);
        long remaining = (Long)Types.UNSIGNED_INT.read(buffer);
        long packed = remaining << 16 | (long)(second << 8) | (long)first;
        long scale = first & 3;
        if ((first & 4) != 0) {
            scale |= ((long)Types.VAR_INT.readPrimitive(buffer) & 0xFFFFFFFFL) << 2;
        }
        return new Vector3d(this.unpack(packed >> 3) * (double)scale, this.unpack(packed >> 18) * (double)scale, this.unpack(packed >> 33) * (double)scale);
    }
}

