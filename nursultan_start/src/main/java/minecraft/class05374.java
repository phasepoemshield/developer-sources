/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class10508
 *  com.google.common.collect.ImmutableMap
 *  com.google.common.collect.Maps
 *  com.mojang.logging.LogUtils
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.DataResult
 *  com.mojang.serialization.Dynamic
 *  com.mojang.serialization.DynamicOps
 *  it.unimi.dsi.fastutil.longs.Long2ObjectMap
 *  it.unimi.dsi.fastutil.longs.Long2ObjectMap$Entry
 *  it.unimi.dsi.fastutil.longs.Long2ObjectMaps
 *  it.unimi.dsi.fastutil.longs.Long2ObjectOpenHashMap
 *  it.unimi.dsi.fastutil.longs.LongLinkedOpenHashSet
 *  it.unimi.dsi.fastutil.longs.LongListIterator
 *  it.unimi.dsi.fastutil.longs.LongOpenHashSet
 *  it.unimi.dsi.fastutil.longs.LongSet
 *  it.unimi.dsi.fastutil.objects.ObjectIterator
 *  minecraft.class01042
 *  minecraft.class01296
 *  minecraft.class02599
 *  minecraft.class03519
 *  minecraft.class05474
 *  minecraft.class06172
 *  minecraft.class07001
 *  minecraft.class07209
 *  minecraft.class07321
 *  minecraft.class07529
 *  minecraft.class07536
 *  minecraft.class07709
 *  minecraft.class07713
 *  net.caffeinemc.mods.lithium.common.util.Distances
 *  net.caffeinemc.mods.lithium.common.util.Pos$SectionYCoord
 *  net.caffeinemc.mods.lithium.common.util.Pos$SectionYIndex
 *  net.caffeinemc.mods.lithium.common.util.collections.ListeningLong2ObjectOpenHashMap
 *  net.caffeinemc.mods.lithium.common.util.functions.FunLongAnd5
 *  net.caffeinemc.mods.lithium.common.world.interests.RegionBasedStorageSectionExtended
 *  org.jspecify.annotations.Nullable
 *  org.slf4j.Logger
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfo
 */
package minecraft;

import Nursultan.class10508;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.Dynamic;
import com.mojang.serialization.DynamicOps;
import it.unimi.dsi.fastutil.longs.Long2ObjectMap;
import it.unimi.dsi.fastutil.longs.Long2ObjectMaps;
import it.unimi.dsi.fastutil.longs.Long2ObjectOpenHashMap;
import it.unimi.dsi.fastutil.longs.LongLinkedOpenHashSet;
import it.unimi.dsi.fastutil.longs.LongListIterator;
import it.unimi.dsi.fastutil.longs.LongOpenHashSet;
import it.unimi.dsi.fastutil.longs.LongSet;
import it.unimi.dsi.fastutil.objects.ObjectIterator;
import java.io.IOException;
import java.util.BitSet;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.CompletionException;
import java.util.function.BiFunction;
import java.util.function.BooleanSupplier;
import java.util.function.Function;
import java.util.function.Predicate;
import minecraft.class01042;
import minecraft.class01296;
import minecraft.class02599;
import minecraft.class03519;
import minecraft.class05356;
import minecraft.class05474;
import minecraft.class06172;
import minecraft.class07001;
import minecraft.class07209;
import minecraft.class07321;
import minecraft.class07529;
import minecraft.class07536;
import minecraft.class07709;
import minecraft.class07713;
import net.caffeinemc.mods.lithium.common.util.Distances;
import net.caffeinemc.mods.lithium.common.util.Pos;
import net.caffeinemc.mods.lithium.common.util.collections.ListeningLong2ObjectOpenHashMap;
import net.caffeinemc.mods.lithium.common.util.functions.FunLongAnd5;
import net.caffeinemc.mods.lithium.common.world.interests.RegionBasedStorageSectionExtended;
import org.jspecify.annotations.Nullable;
import org.slf4j.Logger;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

public class class05374<R, P>
implements AutoCloseable,
RegionBasedStorageSectionExtended {
    static final Logger L = LogUtils.getLogger();
    private static final String N = "Sections";
    private final class06172 y;
    private Long2ObjectMap<Optional<R>> i = new Long2ObjectOpenHashMap();
    private final LongLinkedOpenHashSet R = new LongLinkedOpenHashSet();
    private final Codec<P> M;
    private final Function<R, P> B;
    private final BiFunction<P, Runnable, R> Z;
    private final Function<Runnable, R> z;
    private final class01042 U;
    private final class02599 E;
    protected final class05474 u;
    private final LongSet W = new LongOpenHashSet();
    private final Long2ObjectMap<CompletableFuture<Optional<class05356<P>>>> m = new Long2ObjectOpenHashMap();
    private final Object P = new Object();
    private Long2ObjectOpenHashMap s;

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    private void L(class07321 class073212) {
        CompletableFuture completableFuture;
        long l2 = class073212.y();
        Object object = this.P;
        synchronized (object) {
            if (!this.W.add(l2)) {
                return;
            }
            completableFuture = (CompletableFuture)this.m.computeIfAbsent(l2, l -> this.u(class073212));
        }
        this.N(class073212, (class05356<P>)((Optional)completableFuture.join()).orElse(null));
        object = this.P;
        synchronized (object) {
            this.m.remove(l2);
        }
    }

    protected void L(long l) {
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    private void L() {
        Object object = this.P;
        synchronized (object) {
            ObjectIterator objectIterator = Long2ObjectMaps.fastIterator(this.m);
            while (objectIterator.hasNext()) {
                Long2ObjectMap.Entry entry = (Long2ObjectMap.Entry)objectIterator.next();
                Optional optional = ((CompletableFuture)entry.getValue()).getNow(null);
                if (optional == null) continue;
                long l = entry.getLongKey();
                this.N(new class07321(l), (class05356<P>)optional.orElse(null));
                objectIterator.remove();
                this.W.add(l);
            }
        }
    }

    protected R M(long l) {
        if (this.R(l)) {
            throw (IllegalArgumentException)class07536.y((Throwable)new IllegalArgumentException("sectionPos out of bounds"));
        }
        Optional<R> optional = this.i(l);
        if (optional.isPresent()) {
            return optional.get();
        }
        R r = this.z.apply(() -> this.y(l));
        this.i.put(l, Optional.of(r));
        return r;
    }

    public class05374(class06172 class061722, Codec<P> codec, Function<R, P> function, BiFunction<P, Runnable, R> biFunction, Function<Runnable, R> function2, class01042 class010422, class02599 class025992, class05474 class054742) {
        this.y = class061722;
        this.M = codec;
        this.B = function;
        this.Z = biFunction;
        this.z = function2;
        this.U = class010422;
        this.E = class025992;
        this.u = class054742;
        this.N(class061722, codec, function, biFunction, function2, class010422, class025992, class054742, null);
    }

    public Optional<R> i(long l) {
        if (this.R(l)) {
            return Optional.empty();
        }
        Optional<R> optional = this.u(l);
        if (optional != null) {
            return optional;
        }
        this.L(class01296.N((long)l).E());
        optional = this.u(l);
        if (optional == null) {
            throw (IllegalStateException)class07536.y((Throwable)new IllegalStateException());
        }
        return optional;
    }

    private void i(class07321 class073212) {
        class03519 class035192 = this.U.N((DynamicOps)class07713.N);
        class07709 class077092 = (class07709)this.N(class073212, (DynamicOps)class035192).getValue();
        if (class077092 instanceof class07001) {
            class07001 class070012 = (class07001)class077092;
            this.y.N(class073212, class070012).exceptionally(throwable -> {
                this.E.y(throwable, this.y.m(), class073212);
                return null;
            });
        } else {
            L.error("Expected compound tag, got {}", (Object)class077092);
        }
    }

    @Override
    public void close() throws IOException {
        this.y.close();
    }

    protected @Nullable Optional<R> u(long l) {
        return (Optional)this.i.get(l);
    }

    private CompletableFuture<Optional<class05356<P>>> u(class07321 class073212) {
        class03519 class035192 = this.U.N((DynamicOps)class07713.N);
        return ((CompletableFuture)this.y.u(class073212).thenApplyAsync(optional -> optional.map(class070012 -> class05356.N(this.M, (DynamicOps<class07709>)class035192, (class07709)class070012, this.y, this.u)), class07536.B().N("parseSection"))).exceptionally(throwable -> {
            if (throwable instanceof CompletionException) {
                throwable = throwable.getCause();
            }
            if (throwable instanceof IOException) {
                IOException iOException = (IOException)throwable;
                L.error("Error reading chunk {} data from disk", (Object)class073212, (Object)iOException);
                this.E.N((Throwable)iOException, this.y.m(), class073212);
                return Optional.empty();
            }
            throw new CompletionException((Throwable)throwable);
        });
    }

    public void y(class07321 class073212) {
        if (this.R.remove(class073212.y())) {
            this.i(class073212);
        }
    }

    protected void y(long l) {
        Optional optional = (Optional)this.i.get(l);
        if (optional == null || optional.isEmpty()) {
            L.warn("No data for position: {}", (Object)class01296.N((long)l));
            return;
        }
        this.R.add(class07321.u((int)class01296.y((long)l), (int)class01296.u((long)l)));
    }

    public boolean y() {
        return !this.R.isEmpty();
    }

    private void y(long l, Optional optional) {
        int n;
        int n2 = Pos.SectionYIndex.fromSectionCoord((class05474)this.u, (int)class01296.L((long)l));
        if (n2 < 0 || n2 >= Pos.SectionYIndex.getNumYSections((class05474)this.u)) {
            return;
        }
        int n3 = class01296.y((long)l);
        long l2 = class07321.u((int)n3, (int)(n = class01296.u((long)l)));
        BitSet bitSet = (BitSet)this.s.get(l2);
        if (bitSet == null) {
            bitSet = new BitSet(Pos.SectionYIndex.getNumYSections((class05474)this.u));
            this.s.put(l2, (Object)bitSet);
        }
        bitSet.set(n2, optional.isPresent());
    }

    private void N(class06172 class061722, Codec codec, Function function, BiFunction biFunction, Function function2, class01042 class010422, class02599 class025992, class05474 class054742, CallbackInfo callbackInfo) {
        this.s = new Long2ObjectOpenHashMap();
        this.i = new ListeningLong2ObjectOpenHashMap(this::y, this::N);
    }

    private void N(long l, Optional optional) {
        int n;
        int n2 = Pos.SectionYIndex.fromSectionCoord((class05474)this.u, (int)class01296.L((long)l));
        if (n2 < 0 || n2 >= Pos.SectionYIndex.getNumYSections((class05474)this.u)) {
            return;
        }
        int n3 = class01296.y((long)l);
        long l2 = class07321.u((int)n3, (int)(n = class01296.u((long)l)));
        BitSet bitSet = (BitSet)this.s.get(l2);
        if (bitSet != null) {
            bitSet.clear(n2);
            if (bitSet.isEmpty()) {
                this.s.remove(l2);
            }
        }
    }

    private static long N(class07321 class073212, int n) {
        return class01296.y((int)class073212.B, (int)n, (int)class073212.Z);
    }

    private <T> Dynamic<T> N(class07321 class073212, DynamicOps<T> dynamicOps) {
        HashMap hashMap = Maps.newHashMap();
        for (int i = this.u.method_32891(); i <= this.u.method_31597(); ++i) {
            long l = class05374.N(class073212, i);
            Optional optional = (Optional)this.i.get(l);
            if (optional == null || optional.isEmpty()) continue;
            DataResult dataResult = this.M.encodeStart(dynamicOps, this.B.apply(optional.get()));
            String string = Integer.toString(i);
            dataResult.resultOrPartial(arg_0 -> ((Logger)L).error(arg_0)).ifPresent(object -> hashMap.put(dynamicOps.createString(string), object));
        }
        return new Dynamic(dynamicOps, dynamicOps.createMap((Map)ImmutableMap.of((Object)dynamicOps.createString(N), (Object)dynamicOps.createMap((Map)hashMap), (Object)dynamicOps.createString("DataVersion"), (Object)dynamicOps.createInt(class07529.y().comp_4026().y()))));
    }

    private void N(class07321 class073212, @Nullable class05356<P> class053562) {
        if (class053562 == null) {
            for (int i = this.u.method_32891(); i <= this.u.method_31597(); ++i) {
                this.i.put(class05374.N(class073212, i), Optional.empty());
            }
        } else {
            boolean bl = class053562.y();
            for (int i = this.u.method_32891(); i <= this.u.method_31597(); ++i) {
                long l = class05374.N(class073212, i);
                Optional<Object> optional = Optional.ofNullable(class053562.N().get(i)).map(object -> this.Z.apply(object, () -> this.y(l)));
                this.i.put(l, optional);
                optional.ifPresent(object -> {
                    this.L(l);
                    if (bl) {
                        this.y(l);
                    }
                });
            }
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public CompletableFuture<?> N(class07321 class073212) {
        Object object = this.P;
        synchronized (object) {
            long l2 = class073212.y();
            if (this.W.contains(l2)) {
                return CompletableFuture.completedFuture(null);
            }
            return (CompletableFuture)this.m.computeIfAbsent(l2, l -> this.u(class073212));
        }
    }

    protected void N(BooleanSupplier booleanSupplier) {
        LongListIterator longListIterator = this.R.iterator();
        while (longListIterator.hasNext() && booleanSupplier.getAsBoolean()) {
            class07321 class073212 = new class07321(longListIterator.nextLong());
            longListIterator.remove();
            this.i(class073212);
        }
        this.L();
    }

    public void N() {
        if (!this.R.isEmpty()) {
            this.R.forEach(l -> this.i(new class07321(l)));
            this.R.clear();
        }
    }

    public BitSet lithium$getNonEmptyPOISections(int n, int n2) {
        long l = class07321.u((int)n, (int)n2);
        BitSet bitSet = (BitSet)this.s.get(l);
        if (bitSet != null) {
            return bitSet;
        }
        this.L(new class07321(l));
        return Objects.requireNonNull((BitSet)this.s.get(l), "Failed to load POI section data!");
    }

    public int lithium$getChunkYMaxInclusive() {
        return Pos.SectionYCoord.getMaxYSectionInclusive((class05474)this.u);
    }

    public Object lithium$getFirstInRangeInChunkColumn(int n, int n2, long l, class07209 class072092, long l2, FunLongAnd5 funLongAnd5, Predicate predicate, Predicate predicate2, Object object) {
        BitSet bitSet = this.lithium$getNonEmptyPOISections(n, n2);
        if (bitSet.isEmpty()) {
            return null;
        }
        int n3 = Pos.SectionYCoord.getMinYSection((class05474)this.u);
        int n4 = bitSet.nextSetBit(0);
        while (n4 != -1) {
            Object var18_15;
            Object object2;
            int n5 = n4 + n3;
            long l3 = Distances.getClosestBlockCoordInSection((int)class072092.method_10264(), (int)n5) - class072092.method_10264();
            if (l3 * l3 <= l && (object2 = funLongAnd5.apply(var18_15 = ((Optional)this.i.get(class01296.y((int)n, (int)n5, (int)n2))).orElse(null), (Object)class072092, (Object)predicate, (Object)predicate2, object, l2)) != null) {
                return object2;
            }
            n4 = bitSet.nextSetBit(n4 + 1);
        }
        return null;
    }

    protected boolean R(long l) {
        int n = class01296.L((int)class01296.L((long)l));
        return this.u.method_31601(n);
    }

    public Iterable lithium$getInChunkColumn(int n, int n2) {
        BitSet bitSet = this.lithium$getNonEmptyPOISections(n, n2);
        if (bitSet.isEmpty()) {
            return Collections::emptyIterator;
        }
        Long2ObjectMap<Optional<R>> long2ObjectMap = this.i;
        class05474 class054742 = this.u;
        return () -> new class10508(this, bitSet, long2ObjectMap, n, class054742, n2);
    }

    public int lithium$getChunkYMin() {
        return Pos.SectionYCoord.getMinYSection((class05474)this.u);
    }

    public Optional lithium$getElementAt(long l) {
        return (Optional)this.i.get(l);
    }
}

