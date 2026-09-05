/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.viaversion.api.type.Type
 *  io.netty.buffer.ByteBuf
 */
package net.raphimc.viabedrock.protocol.types.primitive;

import com.viaversion.viaversion.api.type.Type;
import io.netty.buffer.ByteBuf;
import java.math.BigInteger;

public class UnsignedVarBigIntegerType
extends Type<BigInteger> {
    private static final BigInteger BIG_INTEGER_7F = BigInteger.valueOf(127L);
    private static final BigInteger BIG_INTEGER_80 = BigInteger.valueOf(128L);

    public UnsignedVarBigIntegerType() {
        super("UnsignedVarBigInteger", BigInteger.class);
    }

    public BigInteger read(ByteBuf buffer) {
        byte in;
        BigInteger val = BigInteger.ZERO;
        int shift = 0;
        do {
            in = buffer.readByte();
            val = val.or(BigInteger.valueOf(in & 0x7F).shiftLeft(shift));
            shift += 7;
        } while ((in & 0x80) != 0);
        return val;
    }

    public void write(ByteBuf buffer, BigInteger value) {
        while (value.compareTo(BIG_INTEGER_7F) > 0) {
            buffer.writeByte((int)value.and(BIG_INTEGER_7F).or(BIG_INTEGER_80).byteValue());
            value = value.shiftRight(7);
        }
        buffer.writeByte((int)value.byteValue());
    }
}

