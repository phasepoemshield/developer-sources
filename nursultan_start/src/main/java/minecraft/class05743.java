/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.llamalad7.mixinextras.sugar.impl.ref.generated.LocalLongRefImpl
 *  com.llamalad7.mixinextras.sugar.impl.ref.generated.LocalRefImpl
 *  com.llamalad7.mixinextras.sugar.ref.LocalLongRef
 *  com.llamalad7.mixinextras.sugar.ref.LocalRef
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.datafixers.kinds.Applicative
 *  com.mojang.datafixers.util.Pair
 *  it.unimi.dsi.fastutil.longs.Long2ObjectMap
 *  it.unimi.dsi.fastutil.longs.Long2ObjectOpenHashMap
 *  minecraft.class00143
 *  minecraft.class03556
 *  minecraft.class04119
 *  minecraft.class04128
 *  minecraft.class04137
 *  minecraft.class04142
 *  minecraft.class04782
 *  minecraft.class05368
 *  minecraft.class05369
 *  minecraft.class05372
 *  minecraft.class05378
 *  minecraft.class05946
 *  minecraft.class06289
 *  minecraft.class07049
 *  minecraft.class07079
 *  minecraft.class07209
 *  minecraft.class07475
 *  net.caffeinemc.mods.lithium.common.util.Distances
 *  net.caffeinemc.mods.lithium.common.util.tuples.Tuple5Obj1I
 *  net.caffeinemc.mods.lithium.common.world.interests.PointOfInterestStorageExtended
 *  org.apache.commons.lang3.mutable.MutableLong
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import com.llamalad7.mixinextras.sugar.impl.ref.generated.LocalLongRefImpl;
import com.llamalad7.mixinextras.sugar.impl.ref.generated.LocalRefImpl;
import com.llamalad7.mixinextras.sugar.ref.LocalLongRef;
import com.llamalad7.mixinextras.sugar.ref.LocalRef;
import com.mojang.datafixers.kinds.App;
import com.mojang.datafixers.kinds.Applicative;
import com.mojang.datafixers.util.Pair;
import it.unimi.dsi.fastutil.longs.Long2ObjectMap;
import it.unimi.dsi.fastutil.longs.Long2ObjectOpenHashMap;
import java.util.Collection;
import java.util.HashSet;
import java.util.Optional;
import java.util.Set;
import java.util.function.BiPredicate;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import minecraft.class00143;
import minecraft.class03556;
import minecraft.class04119;
import minecraft.class04128;
import minecraft.class04137;
import minecraft.class04142;
import minecraft.class04782;
import minecraft.class05368;
import minecraft.class05369;
import minecraft.class05372;
import minecraft.class05378;
import minecraft.class05777;
import minecraft.class05946;
import minecraft.class06289;
import minecraft.class07049;
import minecraft.class07079;
import minecraft.class07209;
import minecraft.class07475;
import net.caffeinemc.mods.lithium.common.util.Distances;
import net.caffeinemc.mods.lithium.common.util.tuples.Tuple5Obj1I;
import net.caffeinemc.mods.lithium.common.world.interests.PointOfInterestStorageExtended;
import org.apache.commons.lang3.mutable.MutableLong;
import org.jspecify.annotations.Nullable;

public class class05743 {
    public static final int N = 48;

    private static Stream N(Stream stream, long l, LocalRef localRef, LocalLongRef localLongRef, LocalRef localRef2) {
        return class05743.N(stream, l, (Long2ObjectMap)localRef.get(), localLongRef.get(), localRef2);
    }

    private static Stream N(Stream stream, long l, Long2ObjectMap long2ObjectMap, long l3, LocalRef localRef) {
        if (stream == null && localRef != null) {
            Tuple5Obj1I tuple5Obj1I = (Tuple5Obj1I)localRef.get();
            class05368 class053682 = (class05368)tuple5Obj1I.a();
            Predicate predicate = (Predicate)tuple5Obj1I.b();
            Predicate predicate2 = (Predicate)tuple5Obj1I.c();
            Predicate<class07209> predicate3 = class072092 -> {
                class05777 class057772 = (class05777)long2ObjectMap.get(class072092.method_10063());
                return class057772 == null || class057772.L(l3);
            };
            class07209 class072093 = (class07209)tuple5Obj1I.d();
            class05372 class053722 = (class05372)tuple5Obj1I.e();
            int n = tuple5Obj1I.f();
            Collection var15 = ((PointOfInterestStorageExtended)class053682).lithium$getNClosestFirstWithType(predicate, predicate3, class072093, n, class053722, l);
            if (!long2ObjectMap.isEmpty()) {
                long l4 = (long)n * (long)n;
                long2ObjectMap.forEach((l2, class057772) -> {
                    class07209 class072093 = class07209.method_10092((long)l2);
                    if (Distances.distanceSq((class07209)class072093, (class07209)class072093) <= l4 && class053682.N(class072093, predicate)) {
                        predicate2.test(class072093);
                    }
                });
            }
            return var15.stream();
        }
        return stream;
    }

    private static Stream N(class05368 class053682, Predicate predicate, Predicate predicate2, class07209 class072092, int n, class05372 class053722, LocalRef localRef) {
        localRef.set((Object)new Tuple5Obj1I((Object)class053682, (Object)predicate, (Object)predicate2, (Object)class072092, (Object)class053722, n));
        return null;
    }

    private static Optional N(class05368 class053682, Predicate predicate, BiPredicate biPredicate, class07209 class072092, int n) {
        return ((PointOfInterestStorageExtended)class053682).lithium$takeAt(predicate, biPredicate, class072092);
    }

    public static @Nullable class00143 N(class07079 class070792, Set<Pair<class03556<class05369>, class07209>> set) {
        if (set.isEmpty()) {
            return null;
        }
        HashSet<class07209> hashSet = new HashSet<class07209>();
        int n = 1;
        for (Pair<class03556<class05369>, class07209> pair : set) {
            n = Math.max(n, ((class05369)((class03556)pair.getFirst()).N()).L());
            hashSet.add((class07209)pair.getSecond());
        }
        return class070792.f().N(hashSet, n);
    }

    public static class04142<class07475> N(Predicate<class03556<class05369>> predicate, class05378<class06289> class053782, class05378<class06289> class053783, boolean bl, Optional<Byte> optional, BiPredicate<class04782, class07209> biPredicate) {
        int n = 5;
        int n2 = 20;
        MutableLong mutableLong = new MutableLong(0L);
        Long2ObjectOpenHashMap long2ObjectOpenHashMap = new Long2ObjectOpenHashMap();
        class04119 class041192 = class04137.N_42(arg_0 -> class05743.N(class053783, bl, mutableLong, (Long2ObjectMap)long2ObjectOpenHashMap, predicate, biPredicate, optional, arg_0));
        if (class053783 == class053782) {
            return class041192;
        }
        return class04137.N_42(class041282 -> class041282.group((App)class041282.L(class053782)).apply((Applicative)class041282, class041392 -> class041192));
    }

    public static class04142<class07475> N(Predicate<class03556<class05369>> predicate, class05378<class06289> class053782, boolean bl, Optional<Byte> optional) {
        return class05743.N(predicate, class053782, class053782, bl, optional, (class047822, class072092) -> true);
    }

    public static class04142<class07475> N(Predicate<class03556<class05369>> predicate, class05378<class06289> class053782, boolean bl, Optional<Byte> optional, BiPredicate<class04782, class07209> biPredicate) {
        return class05743.N(predicate, class053782, class053782, bl, optional, biPredicate);
    }

    private static /* synthetic */ App N(class05378 class053782, boolean bl, MutableLong mutableLong, Long2ObjectMap long2ObjectMap, Predicate predicate, BiPredicate biPredicate, Optional optional, class04128 class041282) {
        return class041282.group((App)class041282.L(class053782)).apply((Applicative)class041282, class041392 -> (class047822, class074752, l) -> {
            LocalRefImpl localRefImpl = new LocalRefImpl();
            localRefImpl.init(null);
            if (bl && class074752.method_6109()) {
                return false;
            }
            if (mutableLong.longValue() == 0L) {
                mutableLong.setValue(class047822.N() + (long)class047822.field_9229.y(20));
                return false;
            }
            if (class047822.N() < mutableLong.longValue()) {
                return false;
            }
            mutableLong.setValue(l + 20L + (long)class047822.method_8409().y(20));
            class05368 class053682 = class047822.method_19494();
            long2ObjectMap.long2ObjectEntrySet().removeIf(entry -> !((class05777)entry.getValue()).y(l));
            Predicate<class07209> predicate2 = class072092 -> {
                class05777 class057772 = (class05777)long2ObjectMap.get(class072092.method_10063());
                if (class057772 == null) {
                    return true;
                }
                if (!class057772.L(l)) {
                    return false;
                }
                class057772.N(l);
                return true;
            };
            class05372 class053722 = class05372.field_18487;
            int n = 48;
            class07209 class072093 = class074752.method_24515();
            Predicate<class07209> predicate3 = predicate2;
            Predicate predicate4 = predicate;
            Object object = class053682;
            long l3 = 5L;
            object = class05743.N(object, predicate4, predicate3, class072093, n, class053722, (LocalRef)localRefImpl);
            LocalRefImpl localRefImpl2 = new LocalRefImpl();
            LocalLongRefImpl localLongRefImpl = new LocalLongRefImpl();
            localRefImpl2.init((Object)long2ObjectMap);
            localLongRefImpl.init(l);
            l = localLongRefImpl.dispose();
            long2ObjectMap = (Long2ObjectMap)localRefImpl2.dispose();
            Set<Pair<class03556<class05369>, class07209>> set = class05743.N((Stream)object, l3, (LocalRef)localRefImpl2, (LocalLongRef)localLongRefImpl, (LocalRef)localRefImpl).filter(pair -> biPredicate.test(class047822, (class07209)pair.getSecond())).collect(Collectors.toSet());
            class00143 class001432 = class05743.N((class07079)class074752, set);
            if (class001432 != null && class001432.z()) {
                class07209 class072094 = class001432.E();
                class053682.L(class072094).ifPresent(class035563 -> {
                    class05743.N(class053682, predicate, (T class035562, U class072093) -> class072093.equals((Object)class072094), class072094, 1);
                    class041392.N((Object)class06289.N((class05946)class047822.method_27983(), (class07209)class072094));
                    optional.ifPresent(by -> class047822.method_8421((class07049)class074752, by.byteValue()));
                    long2ObjectMap.clear();
                    class047822.method_74535().y(class072094);
                });
            } else {
                for (Pair<class03556<class05369>, class07209> pair2 : set) {
                    long2ObjectMap.computeIfAbsent(((class07209)pair2.getSecond()).method_10063(), l2 -> new class05777(class047822.field_9229, l));
                }
            }
            return true;
        });
    }
}

