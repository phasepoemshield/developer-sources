/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  com.google.common.collect.Maps
 *  com.google.gson.Gson
 *  com.google.gson.JsonElement
 *  com.mojang.datafixers.util.Either
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.DataResult
 *  com.mojang.serialization.DynamicOps
 *  com.mojang.serialization.JsonOps
 *  io.netty.buffer.ByteBuf
 *  io.netty.buffer.ByteBufAllocator
 *  io.netty.buffer.ByteBufInputStream
 *  io.netty.buffer.ByteBufOutputStream
 *  io.netty.handler.codec.DecoderException
 *  io.netty.handler.codec.EncoderException
 *  io.netty.util.ByteProcessor
 *  it.unimi.dsi.fastutil.ints.IntArrayList
 *  it.unimi.dsi.fastutil.ints.IntList
 *  minecraft.class00751
 *  minecraft.class00928
 *  minecraft.class01222
 *  minecraft.class01657
 *  minecraft.class01663
 *  minecraft.class01674
 *  minecraft.class01894
 *  minecraft.class02874
 *  minecraft.class02895
 *  minecraft.class04227
 *  minecraft.class04995
 *  minecraft.class05449
 *  minecraft.class05946
 *  minecraft.class06183
 *  minecraft.class06289
 *  minecraft.class06889
 *  minecraft.class06997
 *  minecraft.class07001
 *  minecraft.class07209
 *  minecraft.class07211
 *  minecraft.class07321
 *  minecraft.class07709
 *  minecraft.class07726
 *  minecraft.class07742
 *  minecraft.class08314
 *  org.joml.Quaternionf
 *  org.joml.Quaternionfc
 *  org.joml.Vector3f
 *  org.joml.Vector3fc
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.DynamicOps;
import com.mojang.serialization.JsonOps;
import io.netty.buffer.ByteBuf;
import io.netty.buffer.ByteBufAllocator;
import io.netty.buffer.ByteBufInputStream;
import io.netty.buffer.ByteBufOutputStream;
import io.netty.handler.codec.DecoderException;
import io.netty.handler.codec.EncoderException;
import io.netty.util.ByteProcessor;
import it.unimi.dsi.fastutil.ints.IntArrayList;
import it.unimi.dsi.fastutil.ints.IntList;
import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.channels.FileChannel;
import java.nio.channels.GatheringByteChannel;
import java.nio.channels.ScatteringByteChannel;
import java.nio.charset.Charset;
import java.security.PublicKey;
import java.time.Instant;
import java.util.Arrays;
import java.util.BitSet;
import java.util.Collection;
import java.util.EnumSet;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.UUID;
import java.util.function.Consumer;
import java.util.function.IntFunction;
import java.util.function.ToIntFunction;
import minecraft.class00751;
import minecraft.class00928;
import minecraft.class01222;
import minecraft.class01657;
import minecraft.class01663;
import minecraft.class01674;
import minecraft.class01894;
import minecraft.class02874;
import minecraft.class02895;
import minecraft.class04227;
import minecraft.class04995;
import minecraft.class05449;
import minecraft.class05946;
import minecraft.class06183;
import minecraft.class06289;
import minecraft.class06889;
import minecraft.class06997;
import minecraft.class07001;
import minecraft.class07209;
import minecraft.class07211;
import minecraft.class07321;
import minecraft.class07709;
import minecraft.class07726;
import minecraft.class07742;
import minecraft.class08314;
import org.joml.Quaternionf;
import org.joml.Quaternionfc;
import org.joml.Vector3f;
import org.joml.Vector3fc;
import org.jspecify.annotations.Nullable;

public class class00667
extends ByteBuf {
    private final ByteBuf L;
    public static final short N = Short.MAX_VALUE;
    public static final int y = 262144;
    private static final int u = 256;
    private static final int i = 256;
    private static final int R = 512;
    private static final Gson M = new Gson();

    public class00667 resetReaderIndex() {
        this.L.resetReaderIndex();
        return this;
    }

    public ByteBuf unwrap() {
        return this.L;
    }

    public class00667 setShort(int n, int n2) {
        this.L.setShort(n, n2);
        return this;
    }

    public static class07209 L(ByteBuf byteBuf) {
        return class07209.method_10092((long)byteBuf.readLong());
    }

    public <T> @Nullable T L(class02895<? super class00667, T> class028952) {
        return class00667.N(this, class028952);
    }

    public static long[] L(ByteBuf byteBuf, long[] lArray) {
        for (int i = 0; i < lArray.length; ++i) {
            lArray[i] = byteBuf.readLong();
        }
        return lArray;
    }

    public class00667 writeBytes(byte[] byArray) {
        this.L.writeBytes(byArray);
        return this;
    }

    public class00667 writeLongLE(long l) {
        this.L.writeLongLE(l);
        return this;
    }

    public class00667 readBytes(ByteBuf byteBuf, int n) {
        this.L.readBytes(byteBuf, n);
        return this;
    }

    public int[] L() {
        return this.y(this.readableBytes());
    }

    public class00667 L(int n) {
        class01657.N((ByteBuf)this.L, (int)n);
        return this;
    }

    public long[] L(long[] lArray) {
        return class00667.L(this, lArray);
    }

    public class00667 setInt(int n, int n2) {
        this.L.setInt(n, n2);
        return this;
    }

    public class00667 capacity(int n) {
        this.L.capacity(n);
        return this;
    }

    public static class06889 M(ByteBuf byteBuf) {
        return new class06889(byteBuf.readDouble(), byteBuf.readDouble(), byteBuf.readDouble());
    }

    public class06289 M() {
        class05946 class059462 = this.N(class04227.yg);
        class07209 class072092 = this.i();
        return class06289.N(class059462, (class07209)class072092);
    }

    public class00667 writeMedium(int n) {
        this.L.writeMedium(n);
        return this;
    }

    public @Nullable class07001 P() {
        return class00667.Z(this);
    }

    public class01894 T() {
        return class01894.N((String)this.u(Short.MAX_VALUE));
    }

    public class00667 writeInt(int n) {
        this.L.writeInt(n);
        return this;
    }

    public class00667 discardReadBytes() {
        this.L.discardReadBytes();
        return this;
    }

    public class00667(ByteBuf byteBuf) {
        this.L = byteBuf;
    }

    public boolean equals(Object object) {
        return this.L.equals(object);
    }

    public String toString(Charset charset) {
        return this.L.toString(charset);
    }

    public String toString() {
        return this.L.toString();
    }

    public String toString(int n, int n2, Charset charset) {
        return this.L.toString(n, n2, charset);
    }

    public int hashCode() {
        return this.L.hashCode();
    }

    public int compareTo(ByteBuf byteBuf) {
        return this.L.compareTo(byteBuf);
    }

    public int indexOf(int n, int n2, byte by) {
        return this.L.indexOf(n, n2, by);
    }

    public boolean getBoolean(int n) {
        return this.L.getBoolean(n);
    }

    public byte getByte(int n) {
        return this.L.getByte(n);
    }

    public short getShort(int n) {
        return this.L.getShort(n);
    }

    public char getChar(int n) {
        return this.L.getChar(n);
    }

    public int getInt(int n) {
        return this.L.getInt(n);
    }

    public long getLong(int n) {
        return this.L.getLong(n);
    }

    public float getFloat(int n) {
        return this.L.getFloat(n);
    }

    public double getDouble(int n) {
        return this.L.getDouble(n);
    }

    public class00667 setIntLE(int n, int n2) {
        this.L.setIntLE(n, n2);
        return this;
    }

    public class00667 readerIndex(int n) {
        this.L.readerIndex(n);
        return this;
    }

    public Vector3f B() {
        return class00667.i(this);
    }

    public static UUID B(ByteBuf byteBuf) {
        return new UUID(byteBuf.readLong(), byteBuf.readLong());
    }

    public class00667 I() {
        this.L.touch();
        return this;
    }

    public class00667 setChar(int n, int n2) {
        this.L.setChar(n, n2);
        return this;
    }

    public static @Nullable class07001 Z(ByteBuf byteBuf) {
        class07709 class077092 = class00667.N(byteBuf, class07726.N());
        if (class077092 == null || class077092 instanceof class07001) {
            return (class07001)class077092;
        }
        throw new DecoderException("Not a compound tag: " + String.valueOf(class077092));
    }

    public Quaternionf Z() {
        return class00667.R(this);
    }

    public class00667 writerIndex(int n) {
        this.L.writerIndex(n);
        return this;
    }

    public int getBytes(int n, GatheringByteChannel gatheringByteChannel, int n2) throws IOException {
        return this.L.getBytes(n, gatheringByteChannel, n2);
    }

    public int getBytes(int n, FileChannel fileChannel, long l, int n2) throws IOException {
        return this.L.getBytes(n, fileChannel, l, n2);
    }

    public BitSet i(int n) {
        byte[] byArray = new byte[class04995.R((int)n, (int)8)];
        this.readBytes(byArray);
        return BitSet.valueOf(byArray);
    }

    public class00667 setMedium(int n, int n2) {
        this.L.setMedium(n, n2);
        return this;
    }

    public class07209 i() {
        return class00667.L(this);
    }

    public static Vector3f i(ByteBuf byteBuf) {
        return new Vector3f(byteBuf.readFloat(), byteBuf.readFloat(), byteBuf.readFloat());
    }

    public class00667 writeIntLE(int n) {
        this.L.writeIntLE(n);
        return this;
    }

    public <T> class05946<? extends class00751<T>> b() {
        return class05946.N((class01894)this.T());
    }

    public String s() {
        return this.u(Short.MAX_VALUE);
    }

    public class00667 writeMediumLE(int n) {
        this.L.writeMediumLE(n);
        return this;
    }

    public class06183 n() {
        class07209 class072092 = this.i();
        class07211 class072112 = this.y(class07211.class);
        float f = this.readFloat();
        float f2 = this.readFloat();
        float f3 = this.readFloat();
        boolean bl = this.readBoolean();
        boolean bl2 = this.readBoolean();
        return new class06183(new class06889((double)class072092.method_10263() + (double)f, (double)class072092.method_10264() + (double)f2, (double)class072092.method_10260() + (double)f3), class072112, class072092, bl, bl2);
    }

    public class00667 n(int n) {
        this.L.retain(n);
        return this;
    }

    public class00667 clear() {
        this.L.clear();
        return this;
    }

    public class00667 markReaderIndex() {
        this.L.markReaderIndex();
        return this;
    }

    public class00667 writeShortLE(int n) {
        this.L.writeShortLE(n);
        return this;
    }

    public UUID m() {
        return class00667.B(this);
    }

    public boolean isDirect() {
        return this.L.isDirect();
    }

    public boolean hasArray() {
        return this.L.hasArray();
    }

    public byte[] array() {
        return this.L.array();
    }

    public int arrayOffset() {
        return this.L.arrayOffset();
    }

    public class00667 markWriterIndex() {
        this.L.markWriterIndex();
        return this;
    }

    private int t(int n) {
        return Math.min(n, 65536);
    }

    public BitSet t() {
        return BitSet.valueOf(this.u());
    }

    public class00667 g() {
        this.L.retain();
        return this;
    }

    public class00667 writeZero(int n) {
        this.L.writeZero(n);
        return this;
    }

    public PublicKey v() {
        try {
            return class01222.N((byte[])this.N(512));
        }
        catch (class05449 class054492) {
            throw new DecoderException("Malformed public key bytes", (Throwable)class054492);
        }
    }

    public Instant j() {
        return Instant.ofEpochMilli(this.readLong());
    }

    public class00667 writeChar(int n) {
        this.L.writeChar(n);
        return this;
    }

    public class00667 skipBytes(int n) {
        this.L.skipBytes(n);
        return this;
    }

    public class00667 readBytes(ByteBuf byteBuf) {
        this.L.readBytes(byteBuf);
        return this;
    }

    public class06889 U() {
        return class00928.N((ByteBuf)this);
    }

    public int readInt() {
        return this.L.readInt();
    }

    public ByteBuf copy(int n, int n2) {
        return this.L.copy(n, n2);
    }

    public ByteBuf copy() {
        return this.L.copy();
    }

    public class06889 z() {
        return class00667.M(this);
    }

    public static int z(ByteBuf byteBuf) {
        return class01657.N((ByteBuf)byteBuf);
    }

    public class00667 ensureWritable(int n) {
        this.L.ensureWritable(n);
        return this;
    }

    public class00667 setZero(int n, int n2) {
        this.L.setZero(n, n2);
        return this;
    }

    public int capacity() {
        return this.L.capacity();
    }

    public boolean isReadOnly() {
        return this.L.isReadOnly();
    }

    public ByteBuf slice(int n, int n2) {
        return this.L.slice(n, n2);
    }

    public ByteBuf slice() {
        return this.L.slice();
    }

    public ByteBuf duplicate() {
        return this.L.duplicate();
    }

    public boolean release(int n) {
        return this.L.release(n);
    }

    public boolean release() {
        return this.L.release();
    }

    public class00667 writeBytes(ByteBuf byteBuf, int n) {
        this.L.writeBytes(byteBuf, n);
        return this;
    }

    public class00667 setShortLE(int n, int n2) {
        this.L.setShortLE(n, n2);
        return this;
    }

    public static class07321 u(ByteBuf byteBuf) {
        return new class07321(byteBuf.readLong());
    }

    public long[] u() {
        return class00667.y(this);
    }

    public String u(int n) {
        return class01663.N((ByteBuf)this.L, (int)n);
    }

    public <L, R> Either<L, R> y(class02895<? super class00667, L> class028952, class02895<? super class00667, R> class028953) {
        if (this.readBoolean()) {
            return Either.left((Object)class028952.decode((Object)this));
        }
        return Either.right((Object)class028953.decode((Object)this));
    }

    public class00667 writeLong(long l) {
        this.L.writeLong(l);
        return this;
    }

    public <T> Optional<T> y(class02895<? super class00667, T> class028952) {
        if (this.readBoolean()) {
            return Optional.of(class028952.decode((Object)this));
        }
        return Optional.empty();
    }

    public byte[] y() {
        return class00667.N(this);
    }

    public class00667 setBytes(int n, byte[] byArray, int n2, int n3) {
        this.L.setBytes(n, byArray, n2, n3);
        return this;
    }

    public class00667 setBytes(int n, byte[] byArray) {
        this.L.setBytes(n, byArray);
        return this;
    }

    public class00667 readBytes(byte[] byArray) {
        this.L.readBytes(byArray);
        return this;
    }

    public class00667 setBytes(int n, ByteBuf byteBuf, int n2, int n3) {
        this.L.setBytes(n, byteBuf, n2, n3);
        return this;
    }

    public class00667 setBytes(int n, ByteBuf byteBuf, int n2) {
        this.L.setBytes(n, byteBuf, n2);
        return this;
    }

    public class00667 setBytes(int n, ByteBuffer byteBuffer) {
        this.L.setBytes(n, byteBuffer);
        return this;
    }

    public class00667 setBytes(int n, ByteBuf byteBuf) {
        this.L.setBytes(n, byteBuf);
        return this;
    }

    public class00667 writeBytes(ByteBuffer byteBuffer) {
        this.L.writeBytes(byteBuffer);
        return this;
    }

    public void y(class06889 class068892) {
        class00928.N((ByteBuf)this, (class06889)class068892);
    }

    public class00667 writeBytes(ByteBuf byteBuf, int n, int n2) {
        this.L.writeBytes(byteBuf, n, n2);
        return this;
    }

    public class00667 setLongLE(int n, long l) {
        this.L.setLongLE(n, l);
        return this;
    }

    public static void y(ByteBuf byteBuf, int n) {
        class01657.N((ByteBuf)byteBuf, (int)n);
    }

    public <T extends Enum<T>> T y(Class<T> clazz) {
        return (T)((Enum[])clazz.getEnumConstants())[this.E()];
    }

    public class00667 writeBytes(byte[] byArray, int n, int n2) {
        this.L.writeBytes(byArray, n, n2);
        return this;
    }

    public static long[] y(ByteBuf byteBuf) {
        int n;
        int n2 = class01657.N((ByteBuf)byteBuf);
        if (n2 > (n = byteBuf.readableBytes() / 8)) {
            throw new DecoderException("LongArray with size " + n2 + " is bigger than allowed " + n);
        }
        return class00667.L(byteBuf, new long[n2]);
    }

    public int[] y(int n) {
        int n2 = this.E();
        if (n2 > n) {
            throw new DecoderException("VarIntArray with size " + n2 + " is bigger than allowed " + n);
        }
        int[] nArray = new int[n2];
        for (int i = 0; i < nArray.length; ++i) {
            nArray[i] = this.E();
        }
        return nArray;
    }

    public class00667 y(long[] lArray) {
        class00667.y((ByteBuf)this, lArray);
        return this;
    }

    public void y(class05946<?> class059462) {
        this.N(class059462.N());
    }

    public class00667 setByte(int n, int n2) {
        this.L.setByte(n, n2);
        return this;
    }

    public static void y(ByteBuf byteBuf, long[] lArray) {
        for (long l : lArray) {
            byteBuf.writeLong(l);
        }
    }

    public class00667 writeBytes(ByteBuf byteBuf) {
        this.L.writeBytes(byteBuf);
        return this;
    }

    public int E() {
        return class01657.N((ByteBuf)this.L);
    }

    public class00667 writeByte(int n) {
        this.L.writeByte(n);
        return this;
    }

    public int readBytes(FileChannel fileChannel, long l, int n) throws IOException {
        return this.L.readBytes(fileChannel, l, n);
    }

    public ByteBuf readBytes(int n) {
        return this.L.readBytes(n);
    }

    public int readBytes(GatheringByteChannel gatheringByteChannel, int n) throws IOException {
        return this.L.readBytes(gatheringByteChannel, n);
    }

    public int writeBytes(InputStream inputStream, int n) throws IOException {
        return this.L.writeBytes(inputStream, n);
    }

    public int writeBytes(ScatteringByteChannel scatteringByteChannel, int n) throws IOException {
        return this.L.writeBytes(scatteringByteChannel, n);
    }

    public int writeBytes(FileChannel fileChannel, long l, int n) throws IOException {
        return this.L.writeBytes(fileChannel, l, n);
    }

    public ByteBuf order(ByteOrder byteOrder) {
        return this.L.order(byteOrder);
    }

    public ByteOrder order() {
        return this.L.order();
    }

    public String readString(int n, Charset charset) {
        return this.L.readString(n, charset);
    }

    public boolean isReadable(int n) {
        return this.L.isReadable(n);
    }

    public boolean isReadable() {
        return this.L.isReadable();
    }

    public boolean isWritable() {
        return this.L.isWritable();
    }

    public boolean isWritable(int n) {
        return this.L.isWritable(n);
    }

    public char readChar() {
        return this.L.readChar();
    }

    public float readFloat() {
        return this.L.readFloat();
    }

    public int getUnsignedShort(int n) {
        return this.L.getUnsignedShort(n);
    }

    public class00667 writeFloat(float f) {
        this.L.writeFloat(f);
        return this;
    }

    public class00667 N(@Nullable class07709 class077092) {
        class00667.N((ByteBuf)this, class077092);
        return this;
    }

    public class00667 writeBoolean(boolean bl) {
        this.L.writeBoolean(bl);
        return this;
    }

    public byte[] N(int n) {
        return class00667.N((ByteBuf)this, n);
    }

    public static void N(ByteBuf byteBuf, byte[] byArray) {
        class01657.N((ByteBuf)byteBuf, (int)byArray.length);
        byteBuf.writeBytes(byArray);
    }

    public class00667 readBytes(byte[] byArray, int n, int n2) {
        this.L.readBytes(byArray, n, n2);
        return this;
    }

    public class00667 readBytes(ByteBuffer byteBuffer) {
        this.L.readBytes(byteBuffer);
        return this;
    }

    public class00667 readBytes(OutputStream outputStream, int n) throws IOException {
        this.L.readBytes(outputStream, n);
        return this;
    }

    @Deprecated
    public <T> T N(DynamicOps<class07709> dynamicOps, Codec<T> codec) {
        return this.N(dynamicOps, codec, class07726.L());
    }

    public static byte[] N(ByteBuf byteBuf, int n) {
        int n2 = class01657.N((ByteBuf)byteBuf);
        if (n2 > n) {
            throw new DecoderException("ByteArray with size " + n2 + " is bigger than allowed " + n);
        }
        byte[] byArray = new byte[n2];
        byteBuf.readBytes(byArray);
        return byArray;
    }

    public static <T, B extends ByteBuf> void N(B b, @Nullable T t, class02874<? super B, T> class028742) {
        if (t != null) {
            b.writeBoolean(true);
            class028742.encode(b, t);
        } else {
            b.writeBoolean(false);
        }
    }

    public class00667 readBytes(ByteBuf byteBuf, int n, int n2) {
        this.L.readBytes(byteBuf, n, n2);
        return this;
    }

    public static byte[] N(ByteBuf byteBuf) {
        return class00667.N(byteBuf, byteBuf.readableBytes());
    }

    public class00667 N(byte[] byArray) {
        class00667.N((ByteBuf)this, byArray);
        return this;
    }

    public <T> List<T> N_16(class02895<? super class00667, T> class028952) {
        return this.N_15(Lists::newArrayListWithCapacity, class028952);
    }

    public <T> void N_12(Collection<T> collection, class02874<? super class00667, T> class028742) {
        this.L(collection.size());
        for (T t : collection) {
            class028742.encode((Object)this, t);
        }
    }

    public <T, C extends Collection<T>> C N_15(IntFunction<C> intFunction, class02895<? super class00667, T> class028952) {
        int n;
        int n2 = n = this.E();
        Collection collection = (Collection)intFunction.apply(this.t(n2));
        for (int i = 0; i < n; ++i) {
            collection.add(class028952.decode((Object)this));
        }
        return (C)collection;
    }

    public static <T> IntFunction<T> N(IntFunction<T> intFunction, int n) {
        return n2 -> {
            if (n2 > n) {
                throw new DecoderException("Value " + n2 + " is larger than limit " + n);
            }
            return intFunction.apply(n2);
        };
    }

    public IntList N() {
        int n = this.E();
        IntArrayList intArrayList = new IntArrayList();
        for (int i = 0; i < n; ++i) {
            intArrayList.add(this.E());
        }
        return intArrayList;
    }

    public class00667 N(Object object) {
        this.L.touch(object);
        return this;
    }

    @Deprecated
    public <T> T N(DynamicOps<class07709> dynamicOps, Codec<T> codec, class07726 class077262) {
        class07709 class077092 = this.N(class077262);
        return (T)codec.parse(dynamicOps, (Object)class077092).getOrThrow(string -> new DecoderException("Failed to decode: " + string + " " + String.valueOf(class077092)));
    }

    @Deprecated
    public <T> class00667 N(DynamicOps<class07709> dynamicOps, Codec<T> codec, T t) {
        class07709 class077092 = (class07709)codec.encodeStart(dynamicOps, t).getOrThrow(string -> new EncoderException("Failed to encode: " + string + " " + String.valueOf(t)));
        this.N(class077092);
        return this;
    }

    public <T> T N(Codec<T> codec) {
        JsonElement jsonElement = class08314.N((String)this.s());
        return (T)codec.parse((DynamicOps)JsonOps.INSTANCE, (Object)jsonElement).getOrThrow(string -> new DecoderException("Failed to decode JSON: " + string));
    }

    public <T> void N(Codec<T> codec, T t) {
        DataResult dataResult = codec.encodeStart((DynamicOps)JsonOps.INSTANCE, t);
        this.N(M.toJson((JsonElement)dataResult.getOrThrow(string -> new EncoderException("Failed to encode: " + string + " " + String.valueOf(t)))));
    }

    public <L, R> void N(Either<L, R> either, class02874<? super class00667, L> class028742, class02874<? super class00667, R> class028743) {
        either.ifLeft(object -> {
            this.writeBoolean(true);
            class028742.encode((Object)this, object);
        }).ifRight(object -> {
            this.writeBoolean(false);
            class028743.encode((Object)this, object);
        });
    }

    public <T> void N_13(Optional<T> optional, class02874<? super class00667, T> class028742) {
        if (optional.isPresent()) {
            this.writeBoolean(true);
            class028742.encode((Object)this, optional.get());
        } else {
            this.writeBoolean(false);
        }
    }

    public <E extends Enum<E>> EnumSet<E> N(Class<E> clazz) {
        Enum[] enumArray = (Enum[])clazz.getEnumConstants();
        BitSet bitSet = this.i(enumArray.length);
        EnumSet<Enum> enumSet = EnumSet.noneOf(clazz);
        for (int i = 0; i < enumArray.length; ++i) {
            if (!bitSet.get(i)) continue;
            enumSet.add(enumArray[i]);
        }
        return enumSet;
    }

    public <E extends Enum<E>> void N(EnumSet<E> enumSet, Class<E> clazz) {
        Enum[] enumArray = (Enum[])clazz.getEnumConstants();
        BitSet bitSet = new BitSet(enumArray.length);
        for (int i = 0; i < enumArray.length; ++i) {
            bitSet.set(i, enumSet.contains(enumArray[i]));
        }
        this.N(bitSet, enumArray.length);
    }

    public static <T, B extends ByteBuf> @Nullable T N(B b, class02895<? super B, T> class028952) {
        if (b.readBoolean()) {
            return (T)class028952.decode(b);
        }
        return null;
    }

    public <T> void N(@Nullable T t, class02874<? super class00667, T> class028742) {
        class00667.N(this, t, class028742);
    }

    public class00667 writeDouble(double d) {
        this.L.writeDouble(d);
        return this;
    }

    public void N(IntList intList) {
        this.L(intList.size());
        intList.forEach(this::L);
    }

    public <K, V, M extends Map<K, V>> M N(IntFunction<M> intFunction, class02895<? super class00667, K> class028952, class02895<? super class00667, V> class028953) {
        int n;
        int n2 = n = this.E();
        Map map = (Map)intFunction.apply(this.t(n2));
        for (int i = 0; i < n; ++i) {
            Object object = class028952.decode((Object)this);
            Object object2 = class028953.decode((Object)this);
            map.put(object, object2);
        }
        return (M)map;
    }

    public <K, V> Map<K, V> N_17(class02895<? super class00667, K> class028952, class02895<? super class00667, V> class028953) {
        return this.N(Maps::newHashMapWithExpectedSize, class028952, class028953);
    }

    public <K, V> void N(Map<K, V> map, class02874<? super class00667, K> class028742, class02874<? super class00667, V> class028743) {
        this.L(map.size());
        map.forEach((object, object2) -> {
            class028742.encode((Object)this, object);
            class028743.encode((Object)this, object2);
        });
    }

    public void N_14(Consumer<class00667> consumer) {
        int n = this.E();
        for (int i = 0; i < n; ++i) {
            consumer.accept(this);
        }
    }

    public void N(BitSet bitSet) {
        this.N(bitSet.toLongArray());
    }

    public <T> T N(IntFunction<T> intFunction) {
        int n = this.E();
        return intFunction.apply(n);
    }

    public class00667 getBytes(int n, byte[] byArray, int n2, int n3) {
        this.L.getBytes(n, byArray, n2, n3);
        return this;
    }

    public void N(class06183 class061832) {
        class07209 class072092 = class061832.u();
        this.N(class072092);
        this.N((Enum<?>)class061832.i());
        class06889 class068892 = class061832.y();
        this.writeFloat((float)(class068892.M - (double)class072092.method_10263()));
        this.writeFloat((float)(class068892.B - (double)class072092.method_10264()));
        this.writeFloat((float)(class068892.Z - (double)class072092.method_10260()));
        this.writeBoolean(class061832.R());
        this.writeBoolean(class061832.M());
    }

    public class00667 N(Enum<?> enum_) {
        return this.L(enum_.ordinal());
    }

    public void N(BitSet bitSet, int n) {
        if (bitSet.length() > n) {
            throw new EncoderException("BitSet is larger than expected size (" + bitSet.length() + ">" + n + ")");
        }
        byte[] byArray = bitSet.toByteArray();
        this.writeBytes(Arrays.copyOf(byArray, class04995.R((int)n, (int)8)));
    }

    public class00667 getBytes(int n, byte[] byArray) {
        this.L.getBytes(n, byArray);
        return this;
    }

    public class00667 setBoolean(int n, boolean bl) {
        this.L.setBoolean(n, bl);
        return this;
    }

    public class00667 N(PublicKey publicKey) {
        this.N(publicKey.getEncoded());
        return this;
    }

    public static void N(ByteBuf byteBuf, long[] lArray) {
        class01657.N((ByteBuf)byteBuf, (int)lArray.length);
        class00667.y(byteBuf, lArray);
    }

    public class00667 N(long[] lArray) {
        class00667.N((ByteBuf)this, lArray);
        return this;
    }

    public <T> class00667 N(ToIntFunction<T> toIntFunction, T t) {
        int n = toIntFunction.applyAsInt(t);
        return this.L(n);
    }

    public class00667 getBytes(int n, OutputStream outputStream, int n2) throws IOException {
        this.L.getBytes(n, outputStream, n2);
        return this;
    }

    public class00667 getBytes(int n, ByteBuffer byteBuffer) {
        this.L.getBytes(n, byteBuffer);
        return this;
    }

    public class00667 N(class07321 class073212) {
        this.writeLong(class073212.y());
        return this;
    }

    public void N(Quaternionf quaternionf) {
        class00667.N((ByteBuf)this, (Quaternionfc)quaternionf);
    }

    public static void N(ByteBuf byteBuf, Quaternionfc quaternionfc) {
        byteBuf.writeFloat(quaternionfc.x());
        byteBuf.writeFloat(quaternionfc.y());
        byteBuf.writeFloat(quaternionfc.z());
        byteBuf.writeFloat(quaternionfc.w());
    }

    public static void N(ByteBuf byteBuf, class07209 class072092) {
        byteBuf.writeLong(class072092.method_10063());
    }

    public static void N(ByteBuf byteBuf, Vector3fc vector3fc) {
        byteBuf.writeFloat(vector3fc.x());
        byteBuf.writeFloat(vector3fc.y());
        byteBuf.writeFloat(vector3fc.z());
    }

    public void N(Vector3f vector3f) {
        class00667.N((ByteBuf)this, (Vector3fc)vector3f);
    }

    public static void N(ByteBuf byteBuf, class07321 class073212) {
        byteBuf.writeLong(class073212.y());
    }

    public void N(class06889 class068892) {
        class00667.N((ByteBuf)this, class068892);
    }

    public class00667 getBytes(int n, ByteBuf byteBuf) {
        this.L.getBytes(n, byteBuf);
        return this;
    }

    public class00667 getBytes(int n, ByteBuf byteBuf, int n2) {
        this.L.getBytes(n, byteBuf, n2);
        return this;
    }

    public class00667 getBytes(int n, ByteBuf byteBuf, int n2, int n3) {
        this.L.getBytes(n, byteBuf, n2, n3);
        return this;
    }

    public class00667 N(class07209 class072092) {
        class00667.N((ByteBuf)this, class072092);
        return this;
    }

    public static void N(ByteBuf byteBuf, class06889 class068892) {
        byteBuf.writeDouble(class068892.N());
        byteBuf.writeDouble(class068892.y());
        byteBuf.writeDouble(class068892.L());
    }

    public class00667 setIndex(int n, int n2) {
        this.L.setIndex(n, n2);
        return this;
    }

    public class00667 N(UUID uUID) {
        class00667.N((ByteBuf)this, uUID);
        return this;
    }

    public void N(class06289 class062892) {
        this.y(class062892.N());
        this.N(class062892.y());
    }

    public class00667 N(String string) {
        return this.N(string, Short.MAX_VALUE);
    }

    public class00667 N(String string, int n) {
        class01663.N((ByteBuf)this.L, (CharSequence)string, (int)n);
        return this;
    }

    public class00667 N(class01894 class018942) {
        this.N(class018942.toString());
        return this;
    }

    public <T> class05946<T> N(class05946<? extends class00751<T>> class059462) {
        class01894 class018942 = this.T();
        return class05946.N(class059462, (class01894)class018942);
    }

    public static void N(ByteBuf byteBuf, @Nullable class07709 class077092) {
        if (class077092 == null) {
            class077092 = class06997.y;
        }
        try {
            class07742.N_83((class07709)class077092, (DataOutput)new ByteBufOutputStream(byteBuf));
        }
        catch (IOException iOException) {
            throw new EncoderException((Throwable)iOException);
        }
    }

    public class00667 N(long l) {
        class01674.N((ByteBuf)this.L, (long)l);
        return this;
    }

    public static void N(ByteBuf byteBuf, UUID uUID) {
        byteBuf.writeLong(uUID.getMostSignificantBits());
        byteBuf.writeLong(uUID.getLeastSignificantBits());
    }

    public static @Nullable class07709 N(ByteBuf byteBuf, class07726 class077262) {
        try {
            class07709 class077092 = class07742.y((DataInput)new ByteBufInputStream(byteBuf), (class07726)class077262);
            if (class077092.L() == 0) {
                return null;
            }
            return class077092;
        }
        catch (IOException iOException) {
            throw new EncoderException((Throwable)iOException);
        }
    }

    public @Nullable class07709 N(class07726 class077262) {
        return class00667.N((ByteBuf)this, class077262);
    }

    public class00667 N(int[] nArray) {
        this.L(nArray.length);
        for (int n : nArray) {
            this.L(n);
        }
        return this;
    }

    public class00667 setFloat(int n, float f) {
        this.L.setFloat(n, f);
        return this;
    }

    public void N(Instant instant) {
        this.writeLong(instant.toEpochMilli());
    }

    public class00667 setDouble(int n, double d) {
        this.L.setDouble(n, d);
        return this;
    }

    public class00667 setLong(int n, long l) {
        this.L.setLong(n, l);
        return this;
    }

    public short readUnsignedByte() {
        return this.L.readUnsignedByte();
    }

    public int readUnsignedShort() {
        return this.L.readUnsignedShort();
    }

    public boolean readBoolean() {
        return this.L.readBoolean();
    }

    public byte readByte() {
        return this.L.readByte();
    }

    public short readShort() {
        return this.L.readShort();
    }

    public long readLong() {
        return this.L.readLong();
    }

    public double readDouble() {
        return this.L.readDouble();
    }

    public ByteBuf asReadOnly() {
        return this.L.asReadOnly();
    }

    public int readUnsignedMediumLE() {
        return this.L.readUnsignedMediumLE();
    }

    public int getUnsignedMediumLE(int n) {
        return this.L.getUnsignedMediumLE(n);
    }

    public int readUnsignedShortLE() {
        return this.L.readUnsignedShortLE();
    }

    public int maxFastWritableBytes() {
        return this.L.maxFastWritableBytes();
    }

    public int readableBytes() {
        return this.L.readableBytes();
    }

    public short getUnsignedByte(int n) {
        return this.L.getUnsignedByte(n);
    }

    public int getUnsignedShortLE(int n) {
        return this.L.getUnsignedShortLE(n);
    }

    public int setCharSequence(int n, CharSequence charSequence, Charset charset) {
        return this.L.setCharSequence(n, charSequence, charset);
    }

    public long getUnsignedInt(int n) {
        return this.L.getUnsignedInt(n);
    }

    public int getUnsignedMedium(int n) {
        return this.L.getUnsignedMedium(n);
    }

    public int readMediumLE() {
        return this.L.readMediumLE();
    }

    public int maxCapacity() {
        return this.L.maxCapacity();
    }

    public ByteBuf readRetainedSlice(int n) {
        return this.L.readRetainedSlice(n);
    }

    public int readUnsignedMedium() {
        return this.L.readUnsignedMedium();
    }

    public int getMediumLE(int n) {
        return this.L.getMediumLE(n);
    }

    public int bytesBefore(int n, int n2, byte by) {
        return this.L.bytesBefore(n, n2, by);
    }

    public int bytesBefore(int n, byte by) {
        return this.L.bytesBefore(n, by);
    }

    public int bytesBefore(byte by) {
        return this.L.bytesBefore(by);
    }

    public long readUnsignedInt() {
        return this.L.readUnsignedInt();
    }

    public ByteBuffer internalNioBuffer(int n, int n2) {
        return this.L.internalNioBuffer(n, n2);
    }

    public int ensureWritable(int n, boolean bl) {
        return this.L.ensureWritable(n, bl);
    }

    public boolean isContiguous() {
        return this.L.isContiguous();
    }

    public CharSequence readCharSequence(int n, Charset charset) {
        return this.L.readCharSequence(n, charset);
    }

    public int writeCharSequence(CharSequence charSequence, Charset charset) {
        return this.L.writeCharSequence(charSequence, charset);
    }

    public long memoryAddress() {
        return this.L.memoryAddress();
    }

    public boolean hasMemoryAddress() {
        return this.L.hasMemoryAddress();
    }

    public long getUnsignedIntLE(int n) {
        return this.L.getUnsignedIntLE(n);
    }

    public int writableBytes() {
        return this.L.writableBytes();
    }

    public int writerIndex() {
        return this.L.writerIndex();
    }

    public ByteBuf retainedSlice() {
        return this.L.retainedSlice();
    }

    public ByteBuf retainedSlice(int n, int n2) {
        return this.L.retainedSlice(n, n2);
    }

    public int nioBufferCount() {
        return this.L.nioBufferCount();
    }

    public int maxWritableBytes() {
        return this.L.maxWritableBytes();
    }

    public short readShortLE() {
        return this.L.readShortLE();
    }

    public ByteBuf retainedDuplicate() {
        return this.L.retainedDuplicate();
    }

    public int readerIndex() {
        return this.L.readerIndex();
    }

    public CharSequence getCharSequence(int n, int n2, Charset charset) {
        return this.L.getCharSequence(n, n2, charset);
    }

    public long readUnsignedIntLE() {
        return this.L.readUnsignedIntLE();
    }

    public int readMedium() {
        return this.L.readMedium();
    }

    public ByteBuffer nioBuffer() {
        return this.L.nioBuffer();
    }

    public ByteBuffer nioBuffer(int n, int n2) {
        return this.L.nioBuffer(n, n2);
    }

    public int setBytes(int n, ScatteringByteChannel scatteringByteChannel, int n2) throws IOException {
        return this.L.setBytes(n, scatteringByteChannel, n2);
    }

    public int setBytes(int n, FileChannel fileChannel, long l, int n2) throws IOException {
        return this.L.setBytes(n, fileChannel, l, n2);
    }

    public int setBytes(int n, InputStream inputStream, int n2) throws IOException {
        return this.L.setBytes(n, inputStream, n2);
    }

    public long getLongLE(int n) {
        return this.L.getLongLE(n);
    }

    public int getMedium(int n) {
        return this.L.getMedium(n);
    }

    public short getShortLE(int n) {
        return this.L.getShortLE(n);
    }

    public long readLongLE() {
        return this.L.readLongLE();
    }

    public int getIntLE(int n) {
        return this.L.getIntLE(n);
    }

    public int readIntLE() {
        return this.L.readIntLE();
    }

    public ByteBuf readSlice(int n) {
        return this.L.readSlice(n);
    }

    public ByteBuffer[] nioBuffers() {
        return this.L.nioBuffers();
    }

    public ByteBuffer[] nioBuffers(int n, int n2) {
        return this.L.nioBuffers(n, n2);
    }

    public int refCnt() {
        return this.L.refCnt();
    }

    public ByteBufAllocator alloc() {
        return this.L.alloc();
    }

    public class00667 writeShort(int n) {
        this.L.writeShort(n);
        return this;
    }

    public long W() {
        return class01674.N((ByteBuf)this.L);
    }

    public class07321 R() {
        return new class07321(this.readLong());
    }

    public static Quaternionf R(ByteBuf byteBuf) {
        return new Quaternionf(byteBuf.readFloat(), byteBuf.readFloat(), byteBuf.readFloat(), byteBuf.readFloat());
    }

    public void R(int n) {
        class00667.y(this.L, n);
    }

    public class00667 setMediumLE(int n, int n2) {
        this.L.setMediumLE(n, n2);
        return this;
    }

    public class00667 discardSomeReadBytes() {
        this.L.discardSomeReadBytes();
        return this;
    }

    public int G() {
        return class00667.z(this.L);
    }

    public class00667 resetWriterIndex() {
        this.L.resetWriterIndex();
        return this;
    }

    public int forEachByte(ByteProcessor byteProcessor) {
        return this.L.forEachByte(byteProcessor);
    }

    public int forEachByte(int n, int n2, ByteProcessor byteProcessor) {
        return this.L.forEachByte(n, n2, byteProcessor);
    }

    public int forEachByteDesc(int n, int n2, ByteProcessor byteProcessor) {
        return this.L.forEachByteDesc(n, n2, byteProcessor);
    }

    public int forEachByteDesc(ByteProcessor byteProcessor) {
        return this.L.forEachByteDesc(byteProcessor);
    }
}

