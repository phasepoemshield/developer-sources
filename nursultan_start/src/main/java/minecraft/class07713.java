/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.util.Pair
 *  com.mojang.serialization.DataResult
 *  com.mojang.serialization.DynamicOps
 *  com.mojang.serialization.MapLike
 *  com.mojang.serialization.RecordBuilder
 *  java.lang.MatchException
 *  java.lang.runtime.SwitchBootstraps
 *  minecraft.class06995
 *  minecraft.class06997
 *  minecraft.class07001
 *  minecraft.class07009
 *  minecraft.class07019
 *  minecraft.class07023
 *  minecraft.class07029
 *  minecraft.class07037
 *  minecraft.class07536
 */
package minecraft;

import com.mojang.datafixers.util.Pair;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.DynamicOps;
import com.mojang.serialization.MapLike;
import com.mojang.serialization.RecordBuilder;
import java.lang.runtime.SwitchBootstraps;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;
import minecraft.class06995;
import minecraft.class06997;
import minecraft.class07001;
import minecraft.class07009;
import minecraft.class07019;
import minecraft.class07023;
import minecraft.class07029;
import minecraft.class07037;
import minecraft.class07536;
import minecraft.class07707;
import minecraft.class07709;
import minecraft.class07720;
import minecraft.class07721;
import minecraft.class07723;
import minecraft.class07729;
import minecraft.class07730;
import minecraft.class07731;
import minecraft.class07736;
import minecraft.class07741;
import minecraft.class07743;
import minecraft.class07744;
import minecraft.class07754;
import minecraft.class07757;

public class class07713
implements DynamicOps<class07709> {
    public static final class07713 N = new class07713();

    public DataResult<Stream<Pair<class07709, class07709>>> getMapValues(class07709 class077092) {
        if (class077092 instanceof class07001) {
            return DataResult.success(((class07001)class077092).M().stream().map(entry -> Pair.of((Object)this.createString((String)entry.getKey()), (Object)((class07709)entry.getValue()))));
        }
        return DataResult.error(() -> "Not a map: " + String.valueOf(class077092));
    }

    public class07709 emptyMap() {
        return new class07001();
    }

    public DataResult<Consumer<Consumer<class07709>>> getList(class07709 class077092) {
        if (class077092 instanceof class07023) {
            return DataResult.success(arg_0 -> ((class07023)class077092).forEach(arg_0));
        }
        return DataResult.error(() -> "Not a list: " + String.valueOf(class077092));
    }

    private class07713() {
    }

    public String toString() {
        return "NBT";
    }

    public DataResult<ByteBuffer> getByteBuffer(class07709 class077092) {
        if (class077092 instanceof class07029) {
            return DataResult.success((Object)ByteBuffer.wrap(((class07029)class077092).i()));
        }
        return super.getByteBuffer((Object)class077092);
    }

    public DataResult<IntStream> getIntStream(class07709 class077092) {
        if (class077092 instanceof class06995) {
            return DataResult.success((Object)Arrays.stream(((class06995)class077092).M()));
        }
        return super.getIntStream((Object)class077092);
    }

    public DataResult<MapLike<class07709>> getMap(class07709 class077092) {
        if (class077092 instanceof class07001) {
            class07001 class070012 = (class07001)class077092;
            return DataResult.success((Object)new class07744(this, class070012));
        }
        return DataResult.error(() -> "Not a map: " + String.valueOf(class077092));
    }

    private static Optional<class07723> U(class07709 class077092) {
        if (class077092 instanceof class06997) {
            return Optional.of(new class07743());
        }
        if (class077092 instanceof class07023) {
            class07023 class070232 = (class07023)class077092;
            if (class070232.isEmpty()) {
                return Optional.of(new class07743());
            }
            class07023 class070233 = class070232;
            Objects.requireNonNull(class070233);
            class07023 class070234 = class070233;
            int n = 0;
            return switch (SwitchBootstraps.typeSwitch("typeSwitch", new Object[]{class07741.class, class07029.class, class06995.class, class07757.class}, (Object)class070234, (int)n)) {
                default -> throw new MatchException(null, null);
                case 0 -> {
                    class07741 var4_4 = (class07741)class070234;
                    yield Optional.of(new class07743(var4_4));
                }
                case 1 -> {
                    class07029 var5_5 = (class07029)class070234;
                    yield Optional.of(new class07754(var5_5.i()));
                }
                case 2 -> {
                    class06995 var6_6 = (class06995)class070234;
                    yield Optional.of(new class07731(var6_6.M()));
                }
                case 3 -> {
                    class07757 var7_7 = (class07757)class070234;
                    yield Optional.of(new class07721(var7_7.M()));
                }
            };
        }
        return Optional.empty();
    }

    public DataResult<LongStream> getLongStream(class07709 class077092) {
        if (class077092 instanceof class07757) {
            return DataResult.success((Object)Arrays.stream(((class07757)((Object)class077092)).M()));
        }
        return super.getLongStream((Object)class077092);
    }

    public DataResult<Consumer<BiConsumer<class07709, class07709>>> getMapEntries(class07709 class077092) {
        if (class077092 instanceof class07001) {
            class07001 class070012 = (class07001)class077092;
            return DataResult.success(biConsumer -> {
                for (Map.Entry entry : class070012.M()) {
                    biConsumer.accept(this.createString((String)entry.getKey()), (class07709)entry.getValue());
                }
            });
        }
        return DataResult.error(() -> "Not a map: " + String.valueOf(class077092));
    }

    public class07709 createList(Stream<class07709> stream) {
        return new class07741((List)stream.collect(class07536.y()));
    }

    public class07709 emptyList() {
        return new class07741();
    }

    private static /* synthetic */ String y(List list) {
        return "some keys are not strings: " + String.valueOf(list);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public DataResult<String> getStringValue(class07709 class077092) {
        if (!(class077092 instanceof class07707)) return DataResult.error(() -> "Not a string");
        class07707 class077072 = (class07707)((Object)class077092);
        try {
            return DataResult.success((Object)class077072.U());
        }
        catch (Throwable throwable) {
            throw new MatchException(throwable.toString(), throwable);
        }
    }

    public class07709 createShort(short s) {
        return class07730.N(s);
    }

    public DataResult<Number> getNumberValue(class07709 class077092) {
        return class077092.P().map(DataResult::success).orElseGet(() -> DataResult.error(() -> "Not a number"));
    }

    public class07709 empty() {
        return class06997.y;
    }

    /*
     * Loose catch block
     */
    public <U> U convertTo(DynamicOps<U> dynamicOps, class07709 class077092) {
        class07709 class077093 = class077092;
        Objects.requireNonNull(class077093);
        class07709 class077094 = class077093;
        int n = 0;
        return (U)(switch (SwitchBootstraps.typeSwitch("typeSwitch", new Object[]{class06997.class, class07037.class, class07730.class, class07720.class, class07729.class, class07009.class, class07019.class, class07029.class, class07707.class, class07741.class, class07001.class, class06995.class, class07757.class}, (Object)class077094, (int)n)) {
            default -> throw new MatchException(null, null);
            case 0 -> {
                class06997 class069972 = (class06997)class077094;
                yield dynamicOps.empty();
            }
            case 1 -> {
                byte by;
                byte by2 = by = ((class07037)class077094).m();
                yield dynamicOps.createByte(by2);
            }
            case 2 -> {
                short s;
                class07730 class077302 = (class07730)((Object)class077094);
                short s2 = s = class077302.m();
                yield dynamicOps.createShort(s2);
            }
            case 3 -> {
                int n2;
                class07720 class077202 = (class07720)((Object)class077094);
                int n3 = n2 = class077202.m();
                yield dynamicOps.createInt(n3);
            }
            case 4 -> {
                long l;
                class07729 class077292 = (class07729)((Object)class077094);
                long l2 = l = class077292.m();
                yield dynamicOps.createLong(l2);
            }
            case 5 -> {
                float f;
                class07009 class070092 = (class07009)class077094;
                float f2 = f = class070092.m();
                yield dynamicOps.createFloat(f2);
            }
            case 6 -> {
                double d;
                class07019 class070192 = (class07019)class077094;
                double d2 = d = class070192.m();
                yield dynamicOps.createDouble(d2);
            }
            case 7 -> {
                class07029 class070292 = (class07029)class077094;
                yield dynamicOps.createByteList(ByteBuffer.wrap(class070292.i()));
            }
            case 8 -> {
                String string;
                String string2 = string = ((class07707)((Object)class077094)).U();
                yield dynamicOps.createString(string2);
            }
            case 9 -> {
                class07741 class077412 = (class07741)((Object)class077094);
                yield this.convertList(dynamicOps, class077412);
            }
            case 10 -> {
                class07001 class070012 = (class07001)class077094;
                yield this.convertMap(dynamicOps, class070012);
            }
            case 11 -> {
                class06995 class069952 = (class06995)class077094;
                yield dynamicOps.createIntList(Arrays.stream(class069952.M()));
            }
            case 12 -> {
                class07757 class077572 = (class07757)((Object)class077094);
                yield dynamicOps.createLongList(Arrays.stream(class077572.M()));
            }
        });
        catch (Throwable throwable) {
            throw new MatchException(throwable.toString(), throwable);
        }
    }

    private static /* synthetic */ String N(List list) {
        return "some keys are not strings: " + String.valueOf(list);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private static /* synthetic */ void N(List list, class07001 class070012, Pair pair) {
        String string;
        class07709 class077092 = (class07709)pair.getFirst();
        if (!(class077092 instanceof class07707)) {
            list.add(class077092);
            return;
        }
        class07707 class077072 = (class07707)((Object)class077092);
        try {
            string = class077072.U();
        }
        catch (Throwable throwable) {
            throw new MatchException(throwable.toString(), throwable);
        }
        class070012.N(string, (class07709)pair.getSecond());
    }

    public class07709 createByteList(ByteBuffer byteBuffer) {
        ByteBuffer byteBuffer2 = byteBuffer.duplicate().clear();
        byte[] byArray = new byte[byteBuffer.capacity()];
        byteBuffer2.get(0, byArray, 0, byArray.length);
        return new class07029(byArray);
    }

    public class07709 createNumeric(Number number) {
        return class07019.N((double)number.doubleValue());
    }

    public class07709 createString(String string) {
        return class07707.N(string);
    }

    public class07709 createMap(Stream<Pair<class07709, class07709>> stream) {
        class07001 class070012 = new class07001();
        stream.forEach(pair -> {
            String string;
            class07709 class077092 = (class07709)pair.getFirst();
            class07709 class077093 = (class07709)pair.getSecond();
            if (!(class077092 instanceof class07707)) throw new UnsupportedOperationException("Cannot create map with non-string key: " + String.valueOf(class077092));
            class07707 class077072 = (class07707)((Object)((Object)class077092));
            try {
                string = class077072.U();
            }
            catch (Throwable throwable) {
                throw new MatchException(throwable.toString(), throwable);
            }
            class070012.N(string, class077093);
        });
        return class070012;
    }

    public class07709 createByte(byte by) {
        return class07037.N((byte)by);
    }

    public class07709 remove(class07709 class077092, String string) {
        if (class077092 instanceof class07001) {
            class07001 class070012 = ((class07001)class077092).U();
            class070012.b(string);
            return class070012;
        }
        return class077092;
    }

    public class07709 createBoolean(boolean bl) {
        return class07037.N((boolean)bl);
    }

    public class07709 createLongList(LongStream longStream) {
        return new class07757(longStream.toArray());
    }

    public class07709 createDouble(double d) {
        return class07019.N((double)d);
    }

    public class07709 createIntList(IntStream intStream) {
        return new class06995(intStream.toArray());
    }

    public DataResult<class07709> mergeToMap(class07709 class077092, MapLike<class07709> mapLike) {
        class07001 class070012;
        Object object;
        if (!(class077092 instanceof class07001) && !(class077092 instanceof class06997)) {
            return DataResult.error(() -> "mergeToMap called with not a map: " + String.valueOf(class077092), (Object)class077092);
        }
        Iterator iterator = mapLike.entries().iterator();
        if (!iterator.hasNext()) {
            if (class077092 == this.empty()) {
                return DataResult.success((Object)this.emptyMap());
            }
            return DataResult.success((Object)class077092);
        }
        if (class077092 instanceof class07001) {
            object = (class07001)class077092;
            class070012 = object.U();
        } else {
            class070012 = new class07001();
        }
        class07001 class070013 = class070012;
        object = new ArrayList();
        iterator.forEachRemaining(arg_0 -> class07713.N((List)object, class070013, arg_0));
        if (!object.isEmpty()) {
            return DataResult.error(() -> class07713.y((List)object), (Object)class070013);
        }
        return DataResult.success((Object)class070013);
    }

    public DataResult<class07709> mergeToList(class07709 class077092, class07709 class077093) {
        return class07713.U(class077092).map(class077232 -> DataResult.success((Object)class077232.N(class077093).N())).orElseGet(() -> DataResult.error(() -> "mergeToList called with not a list: " + String.valueOf(class077092), (Object)class077092));
    }

    public DataResult<class07709> mergeToList(class07709 class077092, List<class07709> list) {
        return class07713.U(class077092).map(class077232 -> DataResult.success((Object)class077232.N(list).N())).orElseGet(() -> DataResult.error(() -> "mergeToList called with not a list: " + String.valueOf(class077092), (Object)class077092));
    }

    public class07709 createInt(int n) {
        return class07720.N(n);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public DataResult<class07709> mergeToMap(class07709 class077092, class07709 class077093, class07709 class077094) {
        class07001 class070012;
        String string;
        String string2;
        if (!(class077092 instanceof class07001) && !(class077092 instanceof class06997)) {
            return DataResult.error(() -> "mergeToMap called with not a map: " + String.valueOf(class077092), (Object)class077092);
        }
        if (!(class077093 instanceof class07707)) return DataResult.error(() -> "key is not a string: " + String.valueOf(class077093), (Object)class077092);
        class07707 class077072 = (class07707)((Object)class077093);
        try {
            string = string2 = class077072.U();
        }
        catch (Throwable throwable) {
            throw new MatchException(throwable.toString(), throwable);
        }
        if (class077092 instanceof class07001) {
            string2 = (class07001)class077092;
            class070012 = string2.U();
        } else {
            class070012 = new class07001();
        }
        class077072 = class070012;
        class077072.N(string, class077094);
        return DataResult.success((Object)((Object)class077072));
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public DataResult<class07709> mergeToMap(class07709 class077092, Map<class07709, class07709> map) {
        class07001 class070012;
        Object object;
        if (!(class077092 instanceof class07001) && !(class077092 instanceof class06997)) {
            return DataResult.error(() -> "mergeToMap called with not a map: " + String.valueOf(class077092), (Object)class077092);
        }
        if (map.isEmpty()) {
            if (class077092 == this.empty()) {
                return DataResult.success((Object)this.emptyMap());
            }
            return DataResult.success((Object)class077092);
        }
        if (class077092 instanceof class07001) {
            object = (class07001)class077092;
            class070012 = object.U();
        } else {
            class070012 = new class07001();
        }
        class07001 class070013 = class070012;
        object = new ArrayList();
        for (Map.Entry<class07709, class07709> entry : map.entrySet()) {
            class07709 class077093 = entry.getKey();
            if (class077093 instanceof class07707) {
                String string;
                try {
                    string = ((class07707)((Object)class077093)).U();
                }
                catch (Throwable throwable) {
                    throw new MatchException(throwable.toString(), throwable);
                }
                class070013.N(string, entry.getValue());
                continue;
            }
            object.add(class077093);
        }
        if (!object.isEmpty()) {
            return DataResult.error(() -> class07713.N((List)object), (Object)class070013);
        }
        return DataResult.success((Object)class070013);
    }

    public class07709 createFloat(float f) {
        return class07009.N((float)f);
    }

    public class07709 createLong(long l) {
        return class07729.N(l);
    }

    public DataResult<Stream<class07709>> getStream(class07709 class077092) {
        if (class077092 instanceof class07023) {
            return DataResult.success((Object)((class07023)class077092).stream());
        }
        return DataResult.error(() -> "Not a list");
    }

    public RecordBuilder<class07709> mapBuilder() {
        return new class07736(this);
    }
}

