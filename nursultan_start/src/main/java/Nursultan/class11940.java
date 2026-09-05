/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class10792
 *  io.netty.buffer.ByteBuf
 *  io.netty.handler.codec.DecoderException
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 */
package Nursultan;

import Nursultan.class10792;
import io.netty.buffer.ByteBuf;
import io.netty.handler.codec.DecoderException;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.UUID;

public class class11940
extends Record {
    public ByteBuf parent;
    public short protocolVersion;
    public static Object L_0;

    public void L(int n) {
        this.parent.writeByte(n);
    }

    public short L() {
        return this.parent.readShort();
    }

    public long M() {
        return this.parent.readLong();
    }

    public String P() {
        return this.i(Short.MAX_VALUE);
    }

    private static void T() {
        L_0 = Short.MAX_VALUE;
    }

    public class11940(ByteBuf byteBuf) {
        this(byteBuf, 16);
    }

    public class11940(ByteBuf byteBuf, short s) {
        this.parent = byteBuf;
        this.protocolVersion = s;
    }

    static {
        class11940.T();
    }

    public boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class11940.class, "parent;protocolVersion", "parent", "protocolVersion"}, this, object);
    }

    public String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class11940.class, "parent;protocolVersion", "parent", "protocolVersion"}, this);
    }

    public int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class11940.class, "parent;protocolVersion", "parent", "protocolVersion"}, this);
    }

    public boolean B() {
        return this.parent.readBoolean();
    }

    public float Z() {
        return this.parent.readFloat();
    }

    public String i(int n) {
        return class10792.N((ByteBuf)this.parent, (int)n);
    }

    public double i() {
        return this.parent.readDouble();
    }

    public void s() {
        this.parent.release();
    }

    public byte[] m() {
        byte[] byArray = new byte[this.R()];
        this.parent.readBytes(byArray);
        return byArray;
    }

    public UUID U() {
        long l = this.M();
        long l2 = this.M();
        return new UUID(l, l2);
    }

    public short z() {
        return this.protocolVersion;
    }

    public byte[] u(int n) {
        int n2 = this.R();
        if (n2 < 0) {
            throw new DecoderException("The received byte array length is less than zero! Weird length!");
        }
        if (n2 > n) {
            throw new DecoderException("The received byte array length is longer than maximum allowed (" + n2 + " > " + n + ")");
        }
        int n3 = this.parent.readableBytes();
        if (n2 > n3) {
            throw new DecoderException("Not enough bytes in buffer, expected " + n2 + ", but got " + n3);
        }
        byte[] byArray = new byte[n2];
        this.parent.readBytes(byArray);
        return byArray;
    }

    public char u() {
        return this.parent.readChar();
    }

    public int y() {
        return this.parent.readableBytes();
    }

    public class11940 y(ByteBuf byteBuf) {
        return this.parent == byteBuf ? this : new class11940(byteBuf, this.protocolVersion);
    }

    public void y(int n) {
        this.parent.writeInt(n);
    }

    public byte E() {
        return this.parent.readByte();
    }

    public void N(ByteBuf byteBuf) {
        this.parent.writeBytes(byteBuf);
    }

    public void N(boolean bl) {
        this.parent.writeBoolean(bl);
    }

    public void N(float f) {
        this.parent.writeFloat(f);
    }

    public void N(short s) {
        this.parent.writeShort((int)s);
    }

    public void N(ByteBuf byteBuf, int n, int n2) {
        this.parent.writeBytes(byteBuf, n, n2);
    }

    public class11940 N(String string) {
        class10792.N((ByteBuf)this.parent, (CharSequence)string, (int)Short.MAX_VALUE);
        return this;
    }

    public ByteBuf N(int n) {
        return this.parent.readBytes(n);
    }

    public void N(byte[] byArray) {
        this.y(byArray.length);
        this.parent.writeBytes(byArray);
    }

    public String[] N() {
        int n = this.R();
        String[] stringArray = new String[n];
        for (int i = 0; i < n; ++i) {
            stringArray[i] = this.P();
        }
        return stringArray;
    }

    public void N(UUID uUID) {
        this.N(uUID.getMostSignificantBits());
        this.N(uUID.getLeastSignificantBits());
    }

    public void N(Enum<?> enum_) {
        this.y(enum_.ordinal());
    }

    public void N(String[] stringArray) {
        this.y(stringArray.length);
        for (String string : stringArray) {
            this.N(string);
        }
    }

    public void N(long l) {
        this.parent.writeLong(l);
    }

    public void N(char c) {
        this.parent.writeChar((int)c);
    }

    public <T extends Enum<T>> T N(Class<T> clazz) {
        int n = this.R();
        return (T)((Enum[])clazz.getEnumConstants())[n];
    }

    public void N(double d) {
        this.parent.writeDouble(d);
    }

    public ByteBuf W() {
        return this.parent;
    }

    public int R() {
        return this.parent.readInt();
    }
}

