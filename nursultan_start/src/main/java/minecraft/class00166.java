/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.hash.HashCode
 *  com.google.common.hash.HashFunction
 *  com.google.common.hash.Hasher
 *  com.google.common.hash.Hashing
 *  com.mojang.datafixers.util.Pair
 *  com.mojang.serialization.DataResult
 *  com.mojang.serialization.DynamicOps
 *  com.mojang.serialization.ListBuilder
 *  com.mojang.serialization.MapLike
 *  com.mojang.serialization.RecordBuilder
 *  java.lang.runtime.SwitchBootstraps
 */
package minecraft;

import com.google.common.hash.HashCode;
import com.google.common.hash.HashFunction;
import com.google.common.hash.Hasher;
import com.google.common.hash.Hashing;
import com.mojang.datafixers.util.Pair;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.DynamicOps;
import com.mojang.serialization.ListBuilder;
import com.mojang.serialization.MapLike;
import com.mojang.serialization.RecordBuilder;
import java.lang.runtime.SwitchBootstraps;
import java.nio.ByteBuffer;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;
import minecraft.class00172;
import minecraft.class00184;

public class class00166
implements DynamicOps<HashCode> {
    private static final byte R = 1;
    private static final byte M = 2;
    private static final byte B = 3;
    private static final byte Z = 4;
    private static final byte z = 5;
    private static final byte U = 6;
    private static final byte E = 7;
    private static final byte W = 8;
    private static final byte m = 9;
    private static final byte P = 10;
    private static final byte s = 11;
    private static final byte T = 12;
    private static final byte b = 13;
    private static final byte j = 14;
    private static final byte v = 15;
    private static final byte n = 16;
    private static final byte t = 17;
    private static final byte G = 18;
    private static final byte l = 19;
    private static final byte[] d = new byte[]{1};
    private static final byte[] w = new byte[]{13, 0};
    private static final byte[] k = new byte[]{13, 1};
    public static final byte[] N = new byte[]{2, 3};
    public static final byte[] y = new byte[]{4, 5};
    private static final DataResult<Object> Y = DataResult.error(() -> "Unsupported operation");
    private static final Comparator<HashCode> Q = Comparator.comparingLong(HashCode::padToLong);
    private static final Comparator<Map.Entry<HashCode, HashCode>> O = Map.Entry.comparingByKey(Q).thenComparing(Map.Entry.comparingByValue(Q));
    private static final Comparator<Pair<HashCode, HashCode>> g = Comparator.comparing(Pair::getFirst, Q).thenComparing(Pair::getSecond, Q);
    public static final class00166 L = new class00166(Hashing.crc32c());
    final HashFunction u;
    final HashCode i;
    private final HashCode I;
    private final HashCode J;
    private final HashCode o;
    private final HashCode q;

    public DataResult<String> getStringValue(HashCode hashCode) {
        return class00166.u();
    }

    public HashCode emptyList() {
        return this.J;
    }

    public DataResult<Stream<HashCode>> getStream(HashCode hashCode) {
        return class00166.u();
    }

    public class00166(HashFunction hashFunction) {
        this.u = hashFunction;
        this.i = hashFunction.hashBytes(d);
        this.I = hashFunction.hashBytes(N);
        this.J = hashFunction.hashBytes(y);
        this.q = hashFunction.hashBytes(w);
        this.o = hashFunction.hashBytes(k);
    }

    public String toString() {
        return "Hash " + String.valueOf(this.u);
    }

    public DataResult<Consumer<Consumer<HashCode>>> getList(HashCode hashCode) {
        return class00166.u();
    }

    public DataResult<MapLike<HashCode>> getMap(HashCode hashCode) {
        return class00166.u();
    }

    public DataResult<Stream<Pair<HashCode, HashCode>>> getMapValues(HashCode hashCode) {
        return class00166.u();
    }

    public DataResult<IntStream> getIntStream(HashCode hashCode) {
        return class00166.u();
    }

    public DataResult<ByteBuffer> getByteBuffer(HashCode hashCode) {
        return class00166.u();
    }

    boolean u(HashCode hashCode) {
        return hashCode.equals((Object)this.i);
    }

    private static <T> DataResult<T> u() {
        return Y;
    }

    public HashCode emptyMap() {
        return this.I;
    }

    public DataResult<HashCode> get(HashCode hashCode, String string) {
        return class00166.u();
    }

    public DataResult<Boolean> getBooleanValue(HashCode hashCode) {
        return class00166.u();
    }

    public DataResult<HashCode> mergeToList(HashCode hashCode, HashCode hashCode2) {
        if (this.u(hashCode)) {
            return DataResult.success((Object)this.createList(Stream.of(hashCode2)));
        }
        return class00166.u();
    }

    public HashCode createList(Stream<HashCode> stream) {
        Hasher hasher = this.u.newHasher();
        hasher.putByte((byte)4);
        stream.forEach(hashCode -> hasher.putBytes(hashCode.asBytes()));
        hasher.putByte((byte)5);
        return hasher.hash();
    }

    public DataResult<LongStream> getLongStream(HashCode hashCode) {
        return class00166.u();
    }

    public HashCode empty() {
        return this.i;
    }

    public HashCode createBoolean(boolean bl) {
        return bl ? this.o : this.q;
    }

    public HashCode createString(String string) {
        return this.u.newHasher().putByte((byte)12).putInt(string.length()).putUnencodedChars((CharSequence)string).hash();
    }

    static Hasher N(Hasher hasher, Stream<Pair<HashCode, HashCode>> stream) {
        hasher.putByte((byte)2);
        stream.sorted(g).forEach(pair -> hasher.putBytes(((HashCode)pair.getFirst()).asBytes()).putBytes(((HashCode)pair.getSecond()).asBytes()));
        hasher.putByte((byte)3);
        return hasher;
    }

    private static Hasher N(Hasher hasher, Map<HashCode, HashCode> map) {
        hasher.putByte((byte)2);
        map.entrySet().stream().sorted(O).forEach(entry -> hasher.putBytes(((HashCode)entry.getKey()).asBytes()).putBytes(((HashCode)entry.getValue()).asBytes()));
        hasher.putByte((byte)3);
        return hasher;
    }

    public HashCode createShort(short s) {
        return this.u.newHasher(3).putByte((byte)7).putShort(s).hash();
    }

    public HashCode createDouble(double d) {
        return this.u.newHasher(9).putByte((byte)11).putDouble(d).hash();
    }

    public HashCode createFloat(float f) {
        return this.u.newHasher(5).putByte((byte)10).putFloat(f).hash();
    }

    public HashCode createInt(int n) {
        return this.u.newHasher(5).putByte((byte)8).putInt(n).hash();
    }

    public HashCode createByte(byte by) {
        return this.u.newHasher(2).putByte((byte)6).putByte(by).hash();
    }

    public HashCode createLong(long l) {
        return this.u.newHasher(9).putByte((byte)9).putLong(l).hash();
    }

    public HashCode remove(HashCode hashCode, String string) {
        return hashCode;
    }

    public HashCode updateGeneric(HashCode hashCode, HashCode hashCode2, Function<HashCode, HashCode> function) {
        return hashCode;
    }

    public HashCode createLongList(LongStream longStream) {
        Hasher hasher = this.u.newHasher();
        hasher.putByte((byte)18);
        longStream.forEach(arg_0 -> ((Hasher)hasher).putLong(arg_0));
        hasher.putByte((byte)19);
        return hasher.hash();
    }

    public HashCode set(HashCode hashCode, String string, HashCode hashCode2) {
        return hashCode;
    }

    public DataResult<Number> getNumberValue(HashCode hashCode) {
        return class00166.u();
    }

    public Number getNumberValue(HashCode hashCode, Number number) {
        return number;
    }

    public <U> U convertTo(DynamicOps<U> dynamicOps, HashCode hashCode) {
        throw new UnsupportedOperationException("Can't convert from this type");
    }

    public HashCode update(HashCode hashCode, String string, Function<HashCode, HashCode> function) {
        return hashCode;
    }

    public HashCode createMap(Map<HashCode, HashCode> map) {
        return class00166.N(this.u.newHasher(), map).hash();
    }

    public DataResult<HashCode> mergeToMap(HashCode hashCode, HashCode hashCode2, HashCode hashCode3) {
        if (this.u(hashCode)) {
            return DataResult.success((Object)this.createMap(Map.of(hashCode2, hashCode3)));
        }
        return class00166.u();
    }

    public DataResult<HashCode> mergeToMap(HashCode hashCode, Map<HashCode, HashCode> map) {
        if (this.u(hashCode)) {
            return DataResult.success((Object)this.createMap(map));
        }
        return class00166.u();
    }

    public DataResult<HashCode> getGeneric(HashCode hashCode, HashCode hashCode2) {
        return class00166.u();
    }

    public DataResult<HashCode> mergeToMap(HashCode hashCode, MapLike<HashCode> mapLike) {
        if (this.u(hashCode)) {
            return DataResult.success((Object)this.createMap((Stream<Pair<HashCode, HashCode>>)mapLike.entries()));
        }
        return class00166.u();
    }

    public HashCode createMap(Stream<Pair<HashCode, HashCode>> stream) {
        return class00166.N(this.u.newHasher(), stream).hash();
    }

    public HashCode createIntList(IntStream intStream) {
        Hasher hasher = this.u.newHasher();
        hasher.putByte((byte)16);
        intStream.forEach(arg_0 -> ((Hasher)hasher).putInt(arg_0));
        hasher.putByte((byte)17);
        return hasher.hash();
    }

    public HashCode createNumeric(Number number) {
        Number number2 = number;
        Objects.requireNonNull(number2);
        Number number3 = number2;
        int n = 0;
        return switch (SwitchBootstraps.typeSwitch("typeSwitch", new Object[]{Byte.class, Short.class, Integer.class, Long.class, Double.class, Float.class}, (Object)number3, (int)n)) {
            case 0 -> {
                Byte var4_4 = (Byte)number3;
                yield this.createByte(var4_4);
            }
            case 1 -> {
                Short var5_5 = (Short)number3;
                yield this.createShort(var5_5);
            }
            case 2 -> {
                Integer var6_6 = (Integer)number3;
                yield this.createInt(var6_6);
            }
            case 3 -> {
                Long var7_7 = (Long)number3;
                yield this.createLong(var7_7);
            }
            case 4 -> {
                Double var8_8 = (Double)number3;
                yield this.createDouble(var8_8);
            }
            case 5 -> {
                Float var9_9 = (Float)number3;
                yield this.createFloat(var9_9.floatValue());
            }
            default -> this.createDouble(number.doubleValue());
        };
    }

    public DataResult<HashCode> mergeToList(HashCode hashCode, List<HashCode> list) {
        if (this.u(hashCode)) {
            return DataResult.success((Object)this.createList(list.stream()));
        }
        return class00166.u();
    }

    public HashCode createByteList(ByteBuffer byteBuffer) {
        Hasher hasher = this.u.newHasher();
        hasher.putByte((byte)14);
        hasher.putBytes(byteBuffer);
        hasher.putByte((byte)15);
        return hasher.hash();
    }

    public DataResult<Consumer<BiConsumer<HashCode, HashCode>>> getMapEntries(HashCode hashCode) {
        return class00166.u();
    }

    public RecordBuilder<HashCode> mapBuilder() {
        return new class00172(this);
    }

    public ListBuilder<HashCode> listBuilder() {
        return new class00184(this);
    }
}

