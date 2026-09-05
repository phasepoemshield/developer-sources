/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Maps
 *  com.mojang.logging.LogUtils
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.DataResult
 *  com.mojang.serialization.Dynamic
 *  com.mojang.serialization.DynamicOps
 *  com.mojang.serialization.MapCodec
 *  com.mojang.serialization.MapLike
 *  it.unimi.dsi.fastutil.objects.Object2ObjectOpenHashMap
 *  java.lang.MatchException
 *  minecraft.class01424
 *  minecraft.class03103
 *  minecraft.class03153
 *  minecraft.class03154
 *  minecraft.class03175
 *  minecraft.class04818
 *  minecraft.class04836
 *  minecraft.class07707
 *  minecraft.class07709
 *  minecraft.class07713
 *  minecraft.class07720
 *  minecraft.class07726
 *  minecraft.class07729
 *  minecraft.class07730
 *  minecraft.class07737
 *  minecraft.class07741
 *  minecraft.class07757
 *  org.jspecify.annotations.Nullable
 *  org.slf4j.Logger
 */
package minecraft;

import com.google.common.collect.Maps;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.Dynamic;
import com.mojang.serialization.DynamicOps;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.MapLike;
import it.unimi.dsi.fastutil.objects.Object2ObjectOpenHashMap;
import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;
import java.util.function.BiConsumer;
import minecraft.class01424;
import minecraft.class03103;
import minecraft.class03153;
import minecraft.class03154;
import minecraft.class03175;
import minecraft.class04818;
import minecraft.class04836;
import minecraft.class06995;
import minecraft.class07009;
import minecraft.class07012;
import minecraft.class07019;
import minecraft.class07029;
import minecraft.class07037;
import minecraft.class07074;
import minecraft.class07080;
import minecraft.class07707;
import minecraft.class07709;
import minecraft.class07713;
import minecraft.class07720;
import minecraft.class07726;
import minecraft.class07729;
import minecraft.class07730;
import minecraft.class07737;
import minecraft.class07741;
import minecraft.class07757;
import org.jspecify.annotations.Nullable;
import org.slf4j.Logger;

public final class class07001
implements class07709 {
    private static final Logger L = LogUtils.getLogger();
    public static final Codec<class07001> N = Codec.PASSTHROUGH.comapFlatMap(dynamic -> {
        class07709 class077092 = (class07709)dynamic.convert((DynamicOps)class07713.N).getValue();
        if (class077092 instanceof class07001) {
            class07001 class070012 = (class07001)class077092;
            return DataResult.success((Object)(class070012 == dynamic.getValue() ? class070012.N() : class070012));
        }
        return DataResult.error(() -> "Not a compound tag: " + String.valueOf(class077092));
    }, class070012 -> new Dynamic((DynamicOps)class07713.N, (Object)class070012.N()));
    private static final int t = 48;
    private static final int G = 32;
    public static final class01424<class07001> y = new class07012();
    private final Map<String, class07709> l;
    private static final HashMap d = new HashMap();

    public Optional<Byte> L(String string) {
        return this.j(string).flatMap(class07709::s);
    }

    public byte L() {
        return 10;
    }

    public Optional<Float> M(String string) {
        return this.j(string).flatMap(class07709::v);
    }

    public Set<Map.Entry<String, class07709>> M() {
        return this.l.entrySet();
    }

    public Optional<class07741> P(String string) {
        class07709 class077092 = this.l.get(string);
        if (class077092 instanceof class07741) {
            return Optional.of((class07741)class077092);
        }
        return Optional.empty();
    }

    public Optional<Boolean> T(String string) {
        return this.j(string).flatMap(class07709::t);
    }

    public class07001() {
        HashMap hashMap = class07001.m();
        if (hashMap == null) {
            throw new NullPointerException("@Redirect constructor handler net/minecraft/class_2487::removeOldMapAlloc returned null for java.util.HashMap");
        }
        this(class07001.N(hashMap));
    }

    public class07001(Map<String, class07709> map) {
        this.l = map;
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        return object instanceof class07001 && Objects.equals(this.l, ((class07001)object).l);
    }

    public String toString() {
        class04818 class048182 = new class04818();
        class048182.N(this);
        return class048182.N();
    }

    public int hashCode() {
        return this.l.hashCode();
    }

    public Optional<Double> B(String string) {
        return this.j(string).flatMap(class07709::n);
    }

    public Collection<class07709> B() {
        return this.l.values();
    }

    public Optional<String> Z(String string) {
        return this.j(string).flatMap(class07709::ah_);
    }

    public int Z() {
        return this.l.size();
    }

    public Set<String> i() {
        return this.l.keySet();
    }

    public Optional<Integer> i(String string) {
        return this.j(string).flatMap(class07709::b);
    }

    public @Nullable class07709 b(String string) {
        return this.l.remove(string);
    }

    public class07741 s(String string) {
        return this.P(string).orElseGet(class07741::new);
    }

    private static HashMap m() {
        return d;
    }

    public class07001 m(String string) {
        return this.W(string).orElseGet(class07001::new);
    }

    private Optional<class07709> j(String string) {
        return Optional.ofNullable(this.l.get(string));
    }

    public class07001 U() {
        return new class07001(new HashMap<String, class07709>(this.l));
    }

    public Optional<int[]> U(String string) {
        class07709 class077092 = this.l.get(string);
        if (class077092 instanceof class06995) {
            return Optional.of(((class06995)class077092).M());
        }
        return Optional.empty();
    }

    public boolean z() {
        return this.l.isEmpty();
    }

    public Optional<byte[]> z(String string) {
        class07709 class077092 = this.l.get(string);
        if (class077092 instanceof class07029) {
            return Optional.of(((class07029)class077092).i());
        }
        return Optional.empty();
    }

    public class01424<class07001> u() {
        return y;
    }

    public Optional<Short> u(String string) {
        return this.j(string).flatMap(class07709::T);
    }

    public double y(String string, double d) {
        class07709 class077092 = this.l.get(string);
        if (class077092 instanceof class07737) {
            return ((class07737)class077092).U();
        }
        return d;
    }

    public boolean y(String string, boolean bl) {
        return this.y(string, bl ? (byte)1 : 0) != 0;
    }

    public <T> void y(String string, Codec<T> codec, @Nullable T t) {
        if (t != null) {
            this.N(string, codec, t);
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public String y(String string, String string2) {
        class07709 class077092 = this.l.get(string);
        if (!(class077092 instanceof class07707)) return string2;
        class07707 class077072 = (class07707)class077092;
        try {
            return class077072.U();
        }
        catch (Throwable throwable) {
            throw new MatchException(throwable.toString(), throwable);
        }
    }

    public <T> void y(String string, Codec<T> codec, DynamicOps<class07709> dynamicOps, @Nullable T t) {
        if (t != null) {
            this.N(string, codec, dynamicOps, t);
        }
    }

    public int y(String string, int n) {
        class07709 class077092 = this.l.get(string);
        if (class077092 instanceof class07737) {
            return ((class07737)class077092).B();
        }
        return n;
    }

    public short y(String string, short s) {
        class07709 class077092 = this.l.get(string);
        if (class077092 instanceof class07737) {
            return ((class07737)class077092).Z();
        }
        return s;
    }

    public byte y(String string, byte by) {
        class07709 class077092 = this.l.get(string);
        if (class077092 instanceof class07737) {
            return ((class07737)class077092).z();
        }
        return by;
    }

    public boolean y(String string) {
        return this.l.containsKey(string);
    }

    public float y(String string, float f) {
        class07709 class077092 = this.l.get(string);
        if (class077092 instanceof class07737) {
            return ((class07737)class077092).E();
        }
        return f;
    }

    public long y(String string, long l) {
        class07709 class077092 = this.l.get(string);
        if (class077092 instanceof class07737) {
            return ((class07737)class077092).M();
        }
        return l;
    }

    public int y() {
        int n = 48;
        for (Map.Entry<String, class07709> entry : this.l.entrySet()) {
            n += 28 + 2 * entry.getKey().length();
            n += 36;
            n += entry.getValue().y();
        }
        return n;
    }

    public Optional<long[]> E(String string) {
        class07709 class077092 = this.l.get(string);
        if (class077092 instanceof class07757) {
            return Optional.of(((class07757)class077092).M());
        }
        return Optional.empty();
    }

    public <T> Optional<T> N_15(String string, Codec<T> codec) {
        return this.N(string, codec, (DynamicOps<class07709>)class07713.N);
    }

    public <T> void N(MapCodec<T> mapCodec, DynamicOps<class07709> dynamicOps, T t) {
        this.N((class07001)mapCodec.encoder().encodeStart(dynamicOps, t).getOrThrow());
    }

    public <T> Optional<T> N(String string, Codec<T> codec, DynamicOps<class07709> dynamicOps) {
        class07709 class077092 = this.N(string);
        if (class077092 == null) {
            return Optional.empty();
        }
        return codec.parse(dynamicOps, (Object)class077092).resultOrPartial(string2 -> L.error("Failed to read field ({}={}): {}", new Object[]{string, class077092, string2}));
    }

    public class03154 N(class03175 class031752) {
        block14: for (Map.Entry<String, class07709> entry : this.l.entrySet()) {
            class07709 class077092 = entry.getValue();
            class01424 var5 = class077092.u();
            class03153 class031532 = class031752.N(var5);
            switch (class031532) {
                case field_36251: {
                    return class03154.field_36255;
                }
                case field_36250: {
                    return class031752.y();
                }
                case field_36249: {
                    continue block14;
                }
            }
            class031532 = class031752.N(var5, entry.getKey());
            switch (class031532) {
                case field_36251: {
                    return class03154.field_36255;
                }
                case field_36250: {
                    return class031752.y();
                }
                case field_36249: {
                    continue block14;
                }
            }
            class03154 class031542 = class077092.N(class031752);
            switch (class031542) {
                case field_36255: {
                    return class03154.field_36255;
                }
                case field_36254: {
                    return class031752.y();
                }
            }
        }
        return class031752.y();
    }

    public <T> void N(String string, Codec<T> codec, T t) {
        this.N(string, codec, (DynamicOps<class07709>)class07713.N, t);
    }

    public <T> void N(String string, Codec<T> codec, DynamicOps<class07709> dynamicOps, T t) {
        this.N(string, (class07709)codec.encodeStart(dynamicOps, t).getOrThrow());
    }

    public <T> void N(MapCodec<T> mapCodec, T t) {
        this.N(mapCodec, (DynamicOps<class07709>)class07713.N, t);
    }

    private static /* synthetic */ void N(HashMap hashMap, String string, class07709 class077092) {
        hashMap.put(string, class077092.N());
    }

    private static Map N(Map map) {
        return new Object2ObjectOpenHashMap();
    }

    public void N(DataOutput dataOutput) throws IOException {
        for (String string : this.l.keySet()) {
            class07709 class077092 = this.l.get(string);
            class07001.N(string, class077092, dataOutput);
        }
        dataOutput.writeByte(0);
    }

    public <T> Optional<T> N(MapCodec<T> mapCodec) {
        return this.N(mapCodec, (DynamicOps<class07709>)class07713.N);
    }

    public <T> Optional<T> N(MapCodec<T> mapCodec, DynamicOps<class07709> dynamicOps) {
        return mapCodec.decode(dynamicOps, (MapLike)dynamicOps.getMap((Object)this).getOrThrow()).resultOrPartial(string -> L.error("Failed to read value ({}): {}", (Object)this, string));
    }

    public void N(BiConsumer<String, class07709> biConsumer) {
        this.l.forEach(biConsumer);
    }

    public void N(String string, byte[] byArray) {
        this.l.put(string, new class07029(byArray));
    }

    public void N_67(String string, String string2) {
        this.l.put(string, (class07709)class07707.N((String)string2));
    }

    public void N(String string, double d) {
        this.l.put(string, (class07709)class07019.N(d));
    }

    public void N(String string, float f) {
        this.l.put(string, (class07709)class07009.N(f));
    }

    public void N(String string, long l) {
        this.l.put(string, (class07709)class07729.N((long)l));
    }

    public @Nullable class07709 N(String string) {
        return this.l.get(string);
    }

    public void N(String string, boolean bl) {
        this.l.put(string, (class07709)class07037.N(bl));
    }

    public void N(String string, long[] lArray) {
        this.l.put(string, (class07709)new class07757(lArray));
    }

    public void N(String string, int[] nArray) {
        this.l.put(string, new class06995(nArray));
    }

    public @Nullable class07709 N(String string, class07709 class077092) {
        return this.l.put(string, class077092);
    }

    private static void N(String string, class07709 class077092, DataOutput dataOutput) throws IOException {
        dataOutput.writeByte(class077092.L());
        if (class077092.L() == 0) {
            return;
        }
        dataOutput.writeUTF(string);
        class077092.N(dataOutput);
    }

    static class07709 N(class01424<?> class014242, String string, DataInput dataInput, class07726 class077262) {
        try {
            return class014242.L(dataInput, class077262);
        }
        catch (IOException iOException) {
            class07080 class070802 = class07080.N(iOException, "Loading NBT data");
            class07074 class070742 = class070802.N("NBT Tag");
            class070742.N("Tag name", string);
            class070742.N("Tag type", class014242.N());
            throw new class03103(class070802);
        }
    }

    public class07001 N(class07001 class070012) {
        for (String string : class070012.l.keySet()) {
            class07709 class077092 = class070012.l.get(string);
            if (class077092 instanceof class07001) {
                class07001 class070013 = (class07001)class077092;
                class07709 class077093 = this.l.get(string);
                if (class077093 instanceof class07001) {
                    ((class07001)class077093).N(class070013);
                    continue;
                }
            }
            this.N(string, class077092.N());
        }
        return this;
    }

    public void N(class04836 class048362) {
        class048362.N(this);
    }

    public void N(String string, int n) {
        this.l.put(string, (class07709)class07720.N((int)n));
    }

    public void N(String string, byte by) {
        this.l.put(string, (class07709)class07037.N(by));
    }

    public void N(String string, short s) {
        this.l.put(string, (class07709)class07730.N((short)s));
    }

    public class07001 N() {
        Object2ObjectOpenHashMap object2ObjectOpenHashMap = new Object2ObjectOpenHashMap(Maps.transformValues(this.l, class07709::N));
        return new class07001((Map<String, class07709>)object2ObjectOpenHashMap);
    }

    public Optional<class07001> W(String string) {
        class07709 class077092 = this.l.get(string);
        if (class077092 instanceof class07001) {
            return Optional.of((class07001)class077092);
        }
        return Optional.empty();
    }

    public Optional<Long> R(String string) {
        return this.j(string).flatMap(class07709::j);
    }

    public Optional<class07001> ak_() {
        return Optional.of(this);
    }
}

