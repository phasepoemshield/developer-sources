/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class09455
 *  Nursultan.class09457
 *  com.mojang.datafixers.util.Pair
 *  com.mojang.serialization.DataResult
 *  com.mojang.serialization.DynamicOps
 *  com.mojang.serialization.ListBuilder
 *  com.mojang.serialization.MapLike
 *  com.mojang.serialization.RecordBuilder
 */
package minecraft;

import Nursultan.class09455;
import Nursultan.class09457;
import com.mojang.datafixers.util.Pair;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.DynamicOps;
import com.mojang.serialization.ListBuilder;
import com.mojang.serialization.MapLike;
import com.mojang.serialization.RecordBuilder;
import java.nio.ByteBuffer;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;

public abstract class class01278<T>
implements DynamicOps<T> {
    protected final DynamicOps<T> N;

    protected class01278(DynamicOps<T> dynamicOps) {
        this.N = dynamicOps;
    }

    public T remove(T t, String string) {
        return (T)this.N.remove(t, string);
    }

    public T empty() {
        return (T)this.N.empty();
    }

    public T emptyList() {
        return (T)this.N.emptyList();
    }

    public DataResult<ByteBuffer> getByteBuffer(T t) {
        return this.N.getByteBuffer(t);
    }

    public T emptyMap() {
        return (T)this.N.emptyMap();
    }

    public DataResult<MapLike<T>> getMap(T t) {
        return this.N.getMap(t);
    }

    public T createMap(Map<T, T> map) {
        return (T)this.N.createMap(map);
    }

    public T createMap(Stream<Pair<T, T>> stream) {
        return (T)this.N.createMap(stream);
    }

    public T createLong(long l) {
        return (T)this.N.createLong(l);
    }

    public T createString(String string) {
        return (T)this.N.createString(string);
    }

    public DataResult<Number> getNumberValue(T t) {
        return this.N.getNumberValue(t);
    }

    public DataResult<Boolean> getBooleanValue(T t) {
        return this.N.getBooleanValue(t);
    }

    public DataResult<T> mergeToList(T t, T t2) {
        return this.N.mergeToList(t, t2);
    }

    public DataResult<T> mergeToList(T t, List<T> list) {
        return this.N.mergeToList(t, list);
    }

    public DataResult<Stream<Pair<T, T>>> getMapValues(T t) {
        return this.N.getMapValues(t);
    }

    public DataResult<String> getStringValue(T t) {
        return this.N.getStringValue(t);
    }

    public T createNumeric(Number number) {
        return (T)this.N.createNumeric(number);
    }

    public T createShort(short s) {
        return (T)this.N.createShort(s);
    }

    public DataResult<LongStream> getLongStream(T t) {
        return this.N.getLongStream(t);
    }

    public T createFloat(float f) {
        return (T)this.N.createFloat(f);
    }

    public T createDouble(double d) {
        return (T)this.N.createDouble(d);
    }

    public T createLongList(LongStream longStream) {
        return (T)this.N.createLongList(longStream);
    }

    public DataResult<IntStream> getIntStream(T t) {
        return this.N.getIntStream(t);
    }

    public T createBoolean(boolean bl) {
        return (T)this.N.createBoolean(bl);
    }

    public T createByteList(ByteBuffer byteBuffer) {
        return (T)this.N.createByteList(byteBuffer);
    }

    public T createIntList(IntStream intStream) {
        return (T)this.N.createIntList(intStream);
    }

    public boolean compressMaps() {
        return this.N.compressMaps();
    }

    public DataResult<Consumer<Consumer<T>>> getList(T t) {
        return this.N.getList(t);
    }

    public RecordBuilder<T> mapBuilder() {
        return new class09457(this, this.N.mapBuilder());
    }

    public DataResult<Stream<T>> getStream(T t) {
        return this.N.getStream(t);
    }

    public DataResult<T> mergeToMap(T t, Map<T, T> map) {
        return this.N.mergeToMap(t, map);
    }

    public DataResult<T> mergeToMap(T t, T t2, T t3) {
        return this.N.mergeToMap(t, t2, t3);
    }

    public DataResult<T> mergeToMap(T t, MapLike<T> mapLike) {
        return this.N.mergeToMap(t, mapLike);
    }

    public T createByte(byte by) {
        return (T)this.N.createByte(by);
    }

    public T createInt(int n) {
        return (T)this.N.createInt(n);
    }

    public T createList(Stream<T> stream) {
        return (T)this.N.createList(stream);
    }

    public <U> U convertTo(DynamicOps<U> dynamicOps, T t) {
        if (Objects.equals(dynamicOps, this.N)) {
            return (U)t;
        }
        return (U)this.N.convertTo(dynamicOps, t);
    }

    public DataResult<T> mergeToPrimitive(T t, T t2) {
        return this.N.mergeToPrimitive(t, t2);
    }

    public ListBuilder<T> listBuilder() {
        return new class09455(this, this.N.listBuilder());
    }

    public DataResult<Consumer<BiConsumer<T, T>>> getMapEntries(T t) {
        return this.N.getMapEntries(t);
    }
}

