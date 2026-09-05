/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class10510
 *  com.google.common.collect.ImmutableList
 *  com.google.common.collect.Maps
 *  com.google.common.collect.Sets
 *  com.mojang.logging.LogUtils
 *  it.unimi.dsi.fastutil.shorts.Short2ObjectMap
 *  it.unimi.dsi.fastutil.shorts.Short2ObjectOpenHashMap
 *  minecraft.class00465
 *  minecraft.class01296
 *  minecraft.class03556
 *  minecraft.class07209
 *  minecraft.class07536
 *  net.caffeinemc.mods.lithium.common.util.Distances
 *  net.caffeinemc.mods.lithium.common.world.interests.PointOfInterestSetExtended
 *  net.caffeinemc.mods.lithium.common.world.interests.iterator.SinglePointOfInterestTypeFilter
 *  org.jspecify.annotations.Nullable
 *  org.slf4j.Logger
 */
package minecraft;

import Nursultan.class10510;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.Maps;
import com.google.common.collect.Sets;
import com.mojang.logging.LogUtils;
import it.unimi.dsi.fastutil.shorts.Short2ObjectMap;
import it.unimi.dsi.fastutil.shorts.Short2ObjectOpenHashMap;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Stream;
import minecraft.class00465;
import minecraft.class01296;
import minecraft.class03556;
import minecraft.class05369;
import minecraft.class05372;
import minecraft.class05377;
import minecraft.class05380;
import minecraft.class07209;
import minecraft.class07536;
import net.caffeinemc.mods.lithium.common.util.Distances;
import net.caffeinemc.mods.lithium.common.world.interests.PointOfInterestSetExtended;
import net.caffeinemc.mods.lithium.common.world.interests.iterator.SinglePointOfInterestTypeFilter;
import org.jspecify.annotations.Nullable;
import org.slf4j.Logger;

public class class05370
implements PointOfInterestSetExtended {
    private static final Logger N = LogUtils.getLogger();
    private final Short2ObjectMap<class05377> y = new Short2ObjectOpenHashMap();
    private Map<class03556<class05369>, Set<class05377>> L = Maps.newHashMap();
    private final Runnable u;
    private boolean i;

    public boolean L(class07209 class072092) {
        class05377 class053772 = (class05377)this.y.get(class01296.y((class07209)class072092));
        if (class053772 == null) {
            throw (IllegalStateException)class07536.y((Throwable)new IllegalStateException("POI never registered at " + String.valueOf(class072092)));
        }
        boolean bl = class053772.u();
        this.u.run();
        return bl;
    }

    private void L() {
        this.y.clear();
        this.L.clear();
    }

    public class05370(Runnable runnable) {
        this(runnable, true, (List<class05377>)ImmutableList.of());
    }

    class05370(Runnable runnable, boolean bl, List<class05377> list) {
        this.u = runnable;
        this.i = bl;
        list.forEach(this::N);
    }

    public Optional<class00465> i(class07209 class072092) {
        return this.R(class072092).map(class00465::new);
    }

    public Optional<class03556<class05369>> u(class07209 class072092) {
        return this.R(class072092).map(class05377::B);
    }

    public boolean y() {
        return this.i;
    }

    private Iterator y(class03556 class035562) {
        Set<class05377> var2 = this.L.get(class035562);
        if (var2 == null || var2.isEmpty()) {
            return Collections.emptyIterator();
        }
        return var2.iterator();
    }

    @Deprecated
    public int y(class07209 class072092) {
        return this.R(class072092).map(class05377::y).orElse(0);
    }

    private class05377 N(class07209 class072092, class03556 class035562, Predicate predicate) {
        Set<class05377> var4 = this.L.get(class035562);
        if (var4 == null || var4.isEmpty()) {
            return null;
        }
        class05377 class053772 = null;
        long l = Long.MAX_VALUE;
        for (class05377 class053773 : var4) {
            long l2 = Distances.distanceSq((class07209)class072092, (class07209)class053773.M());
            if (l2 >= l || !predicate.test(class053773)) continue;
            l = l2;
            class053772 = class053773;
        }
        return class053772;
    }

    private class05377 N(class07209 class072092, Predicate predicate, Predicate predicate2) {
        class05377 class053772 = null;
        long l = Long.MAX_VALUE;
        for (Map.Entry<class03556<class05369>, Set<class05377>> entry : this.L.entrySet()) {
            if (!predicate.test(entry.getKey()) || entry.getValue().isEmpty()) continue;
            for (class05377 class053773 : entry.getValue()) {
                long l2 = Distances.distanceSq((class07209)class072092, (class07209)class053773.M());
                if (l2 >= l || !predicate2.test(class053773)) continue;
                l = l2;
                class053772 = class053773;
            }
        }
        return class053772;
    }

    private Iterator N(Predicate predicate) {
        Iterator<Map.Entry<class03556<class05369>, Set<class05377>>> var2 = this.L.entrySet().iterator();
        return new class10510(this, var2, predicate);
    }

    private class05377 N(class07209 class072092, long l, Predicate predicate, Predicate predicate2, class05372 class053722) {
        Predicate<? super class05377> var7 = class053722.N();
        for (Map.Entry<class03556<class05369>, Set<class05377>> entry : this.L.entrySet()) {
            if (!predicate.test(entry.getKey()) || entry.getValue().isEmpty()) continue;
            for (class05377 class053772 : entry.getValue()) {
                if (Distances.distanceSq((class07209)class072092, (class07209)class053772.M()) > l || !predicate2.test(class053772.M()) || !var7.test(class053772)) continue;
                return class053772;
            }
        }
        return null;
    }

    private class05377 N(class07209 class072092, long l, class03556 class035562, Predicate predicate, class05372 class053722) {
        Set<class05377> var7 = this.L.get(class035562);
        if (var7 == null || var7.isEmpty()) {
            return null;
        }
        Predicate<? super class05377> var8 = class053722.N();
        for (class05377 class053772 : var7) {
            if (Distances.distanceSq((class07209)class072092, (class07209)class053772.M()) > l || !predicate.test(class053772.M()) || !var8.test(class053772)) continue;
            return class053772;
        }
        return null;
    }

    private void N(Predicate predicate, class05372 class053722, Consumer consumer) {
        for (Map.Entry<class03556<class05369>, Set<class05377>> entry : this.L.entrySet()) {
            if (!predicate.test(entry.getKey()) || entry.getValue().isEmpty()) continue;
            for (class05377 class053772 : entry.getValue()) {
                if (!class053722.N().test(class053772)) continue;
                consumer.accept(class053772);
            }
        }
    }

    private void N(class07209 class072092, long l, Predicate predicate, Predicate predicate2, Consumer consumer, int n) {
        for (Map.Entry<class03556<class05369>, Set<class05377>> entry : this.L.entrySet()) {
            if (!predicate.test(entry.getKey()) || entry.getValue().isEmpty()) continue;
            for (class05377 class053772 : entry.getValue()) {
                if (Distances.distanceSq((class07209)class072092, (class07209)class053772.M()) > l || !predicate2.test(class053772)) continue;
                consumer.accept(class053772);
                if (--n != 0) continue;
                return;
            }
        }
    }

    private void N(class03556 class035562, class05372 class053722, Consumer consumer) {
        Set<class05377> var4 = this.L.get(class035562);
        if (var4 == null || var4.isEmpty()) {
            return;
        }
        for (class05377 class053772 : var4) {
            if (!class053722.N().test(class053772)) continue;
            consumer.accept(class053772);
        }
    }

    private void N(class07209 class072092, long l, class03556 class035562, Predicate predicate, Consumer consumer, int n) {
        Set<class05377> var8 = this.L.get(class035562);
        if (var8 == null || var8.isEmpty()) {
            return;
        }
        for (class05377 class053772 : var8) {
            if (Distances.distanceSq((class07209)class072092, (class07209)class053772.M()) > l || !predicate.test(class053772)) continue;
            consumer.accept(class053772);
            if (--n != 0) continue;
            return;
        }
    }

    public void N(class07209 class072092) {
        class05377 class053772 = (class05377)this.y.remove(class01296.y((class07209)class072092));
        if (class053772 == null) {
            N.error("POI data mismatch: never registered at {}", (Object)class072092);
            return;
        }
        this.L.get(class053772.B()).remove(class053772);
        N.debug("Removed POI of type {} @ {}", LogUtils.defer(class053772::B), LogUtils.defer(class053772::M));
        this.u.run();
    }

    public boolean N(class07209 class072092, Predicate<class03556<class05369>> predicate) {
        return this.u(class072092).filter(predicate).isPresent();
    }

    public class05380 N() {
        return new class05380(this.i, this.y.values().stream().map(class05377::N).toList());
    }

    public void N(Consumer<BiConsumer<class07209, class03556<class05369>>> consumer) {
        if (!this.i) {
            Short2ObjectOpenHashMap short2ObjectOpenHashMap = new Short2ObjectOpenHashMap(this.y);
            this.L();
            consumer.accept((arg_0, arg_1) -> this.N((Short2ObjectMap)short2ObjectOpenHashMap, arg_0, arg_1));
            this.i = true;
            this.u.run();
        }
    }

    private boolean N(class05377 class053772) {
        class07209 class072092 = class053772.M();
        class03556<class05369> var3 = class053772.B();
        short s = class01296.y((class07209)class072092);
        class05377 class053773 = (class05377)this.y.get(s);
        if (class053773 != null) {
            if (var3.equals(class053773.B())) {
                return false;
            }
            class07536.y((String)("POI data mismatch: already registered at " + String.valueOf(class072092)));
        }
        this.y.put(s, (Object)class053772);
        this.L.computeIfAbsent(var3, class035562 -> Sets.newHashSet()).add(class053772);
        return true;
    }

    public @Nullable class05377 N(class07209 class072092, class03556<class05369> class035562) {
        class05377 class053772 = new class05377(class072092, class035562, this.u);
        if (this.N(class053772)) {
            N.debug("Added POI of type {} @ {}", (Object)class035562.M(), (Object)class072092);
            this.u.run();
            return class053772;
        }
        return null;
    }

    public Stream<class05377> N(Predicate<class03556<class05369>> predicate, class05372 class053722) {
        return this.L.entrySet().stream().filter(entry -> predicate.test((class03556)entry.getKey())).flatMap(entry -> ((Set)entry.getValue()).stream()).filter(class053722.N());
    }

    private /* synthetic */ void N(Short2ObjectMap short2ObjectMap, class07209 class072092, class03556 class035562) {
        short s2 = class01296.y((class07209)class072092);
        class05377 class053772 = (class05377)short2ObjectMap.computeIfAbsent(s2, s -> new class05377(class072092, (class03556<class05369>)class035562, this.u));
        this.N(class053772);
    }

    public Iterator lithium$iterate(Predicate predicate) {
        if (predicate instanceof SinglePointOfInterestTypeFilter) {
            SinglePointOfInterestTypeFilter singlePointOfInterestTypeFilter = (SinglePointOfInterestTypeFilter)predicate;
            return this.y(singlePointOfInterestTypeFilter.getType());
        }
        return this.N(predicate);
    }

    public class05377 lithium$getFirstMatchingPoint(class07209 class072092, long l, Predicate predicate, Predicate predicate2, class05372 class053722) {
        if (predicate instanceof SinglePointOfInterestTypeFilter) {
            SinglePointOfInterestTypeFilter singlePointOfInterestTypeFilter = (SinglePointOfInterestTypeFilter)predicate;
            return this.N(class072092, l, singlePointOfInterestTypeFilter.getType(), predicate2, class053722);
        }
        return this.N(class072092, l, predicate, predicate2, class053722);
    }

    public void lithium$collectMatchingPoints(Predicate predicate, class05372 class053722, Consumer consumer) {
        if (predicate instanceof SinglePointOfInterestTypeFilter) {
            this.N(((SinglePointOfInterestTypeFilter)predicate).getType(), class053722, consumer);
        } else {
            this.N(predicate, class053722, consumer);
        }
    }

    private Optional<class05377> R(class07209 class072092) {
        return Optional.ofNullable((class05377)this.y.get(class01296.y((class07209)class072092)));
    }

    public class05377 lithium$getL2ClosestMatchingPoint(class07209 class072092, Predicate predicate, Predicate predicate2) {
        if (predicate instanceof SinglePointOfInterestTypeFilter) {
            SinglePointOfInterestTypeFilter singlePointOfInterestTypeFilter = (SinglePointOfInterestTypeFilter)predicate;
            return this.N(class072092, singlePointOfInterestTypeFilter.getType(), predicate2);
        }
        return this.N(class072092, predicate, predicate2);
    }

    public class05377 lithium$getAt(class07209 class072092) {
        return this.R(class072092).orElse(null);
    }

    public void lithium$collectMatchingPointsL2Limited(class07209 class072092, long l, Predicate predicate, Predicate predicate2, Consumer consumer, int n) {
        if (predicate instanceof SinglePointOfInterestTypeFilter) {
            SinglePointOfInterestTypeFilter singlePointOfInterestTypeFilter = (SinglePointOfInterestTypeFilter)predicate;
            this.N(class072092, l, singlePointOfInterestTypeFilter.getType(), predicate2, consumer, n);
        } else {
            this.N(class072092, l, predicate, predicate2, consumer, n);
        }
    }
}

