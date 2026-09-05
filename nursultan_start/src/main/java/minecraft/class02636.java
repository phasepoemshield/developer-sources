/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.util.Pair
 *  com.mojang.serialization.DataResult
 *  com.mojang.serialization.DynamicOps
 *  com.mojang.serialization.ListBuilder
 *  com.mojang.serialization.MapLike
 *  com.mojang.serialization.RecordBuilder
 *  minecraft.class06244
 */
package minecraft;

import com.mojang.datafixers.util.Pair;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.DynamicOps;
import com.mojang.serialization.ListBuilder;
import com.mojang.serialization.MapLike;
import com.mojang.serialization.RecordBuilder;
import java.nio.ByteBuffer;
import java.util.List;
import java.util.Map;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;
import minecraft.class02623;
import minecraft.class02643;
import minecraft.class02645;
import minecraft.class06244;

public class class02636
implements DynamicOps<class06244> {
    public static final class02636 N = new class02636();
    private static final MapLike<class06244> y = new class02645();

    public class06244 emptyList() {
        return class06244.field_17274;
    }

    public DataResult<String> getStringValue(class06244 class062442) {
        return DataResult.success((Object)"");
    }

    public DataResult<Stream<class06244>> getStream(class06244 class062442) {
        return DataResult.success(Stream.empty());
    }

    private class02636() {
    }

    public String toString() {
        return "Null";
    }

    public DataResult<Consumer<Consumer<class06244>>> getList(class06244 class062442) {
        return DataResult.success(consumer -> {});
    }

    public DataResult<ByteBuffer> getByteBuffer(class06244 class062442) {
        return DataResult.success((Object)ByteBuffer.wrap(new byte[0]));
    }

    public DataResult<Consumer<BiConsumer<class06244, class06244>>> getMapEntries(class06244 class062442) {
        return DataResult.success(biConsumer -> {});
    }

    public DataResult<LongStream> getLongStream(class06244 class062442) {
        return DataResult.success((Object)LongStream.empty());
    }

    public DataResult<IntStream> getIntStream(class06244 class062442) {
        return DataResult.success((Object)IntStream.empty());
    }

    public DataResult<Stream<Pair<class06244, class06244>>> getMapValues(class06244 class062442) {
        return DataResult.success(Stream.empty());
    }

    public class06244 emptyMap() {
        return class06244.field_17274;
    }

    public class06244 createList(Stream<class06244> stream) {
        return class06244.field_17274;
    }

    public DataResult<Boolean> getBooleanValue(class06244 class062442) {
        return DataResult.success((Object)false);
    }

    public class06244 createByteList(ByteBuffer byteBuffer) {
        return class06244.field_17274;
    }

    public class06244 createMap(Map<class06244, class06244> map) {
        return class06244.field_17274;
    }

    public <U> U convertTo(DynamicOps<U> dynamicOps, class06244 class062442) {
        return (U)dynamicOps.empty();
    }

    public class06244 createNumeric(Number number) {
        return class06244.field_17274;
    }

    public class06244 remove(class06244 class062442, String string) {
        return class062442;
    }

    public class06244 createLongList(LongStream longStream) {
        return class06244.field_17274;
    }

    public class06244 createIntList(IntStream intStream) {
        return class06244.field_17274;
    }

    public class06244 createFloat(float f) {
        return class06244.field_17274;
    }

    public class06244 createLong(long l) {
        return class06244.field_17274;
    }

    public DataResult<class06244> mergeToList(class06244 class062442, class06244 class062443) {
        return DataResult.success((Object)class06244.field_17274);
    }

    public class06244 createInt(int n) {
        return class06244.field_17274;
    }

    public DataResult<class06244> mergeToList(class06244 class062442, List<class06244> list) {
        return DataResult.success((Object)class06244.field_17274);
    }

    public class06244 createString(String string) {
        return class06244.field_17274;
    }

    public class06244 createBoolean(boolean bl) {
        return class06244.field_17274;
    }

    public class06244 createDouble(double d) {
        return class06244.field_17274;
    }

    public DataResult<Number> getNumberValue(class06244 class062442) {
        return DataResult.success((Object)0);
    }

    public DataResult<class06244> mergeToMap(class06244 class062442, Map<class06244, class06244> map) {
        return DataResult.success((Object)class06244.field_17274);
    }

    public DataResult<class06244> mergeToMap(class06244 class062442, MapLike<class06244> mapLike) {
        return DataResult.success((Object)class06244.field_17274);
    }

    public class06244 empty() {
        return class06244.field_17274;
    }

    public class06244 createMap(Stream<Pair<class06244, class06244>> stream) {
        return class06244.field_17274;
    }

    public DataResult<class06244> mergeToMap(class06244 class062442, class06244 class062443, class06244 class062444) {
        return DataResult.success((Object)class06244.field_17274);
    }

    public class06244 createByte(byte by) {
        return class06244.field_17274;
    }

    public class06244 createShort(short s) {
        return class06244.field_17274;
    }

    public DataResult<MapLike<class06244>> getMap(class06244 class062442) {
        return DataResult.success(y);
    }

    public RecordBuilder<class06244> mapBuilder() {
        return new class02643(this);
    }

    public ListBuilder<class06244> listBuilder() {
        return new class02623(this);
    }
}

