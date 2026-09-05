/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class09440
 *  it.unimi.dsi.fastutil.longs.Long2ObjectFunction
 *  it.unimi.dsi.fastutil.longs.Long2ObjectMap
 *  it.unimi.dsi.fastutil.longs.Long2ObjectOpenHashMap
 *  it.unimi.dsi.fastutil.longs.LongAVLTreeSet
 *  it.unimi.dsi.fastutil.longs.LongBidirectionalIterator
 *  it.unimi.dsi.fastutil.longs.LongOpenHashSet
 *  it.unimi.dsi.fastutil.longs.LongSet
 *  it.unimi.dsi.fastutil.longs.LongSortedSet
 *  it.unimi.dsi.fastutil.objects.ObjectCollection
 *  it.unimi.dsi.fastutil.objects.ObjectIterator
 *  minecraft.class00734
 *  minecraft.class01101
 *  minecraft.class01102
 *  minecraft.class01296
 *  minecraft.class04197
 *  minecraft.class04218
 *  minecraft.class07321
 *  net.caffeinemc.mods.lithium.common.entity.PositionedEntityTrackingSection
 *  net.caffeinemc.mods.lithium.common.world.ChunkAwareEntityIterable
 *  org.jspecify.annotations.Nullable
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfo
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable
 */
package minecraft;

import Nursultan.class09440;
import it.unimi.dsi.fastutil.longs.Long2ObjectFunction;
import it.unimi.dsi.fastutil.longs.Long2ObjectMap;
import it.unimi.dsi.fastutil.longs.Long2ObjectOpenHashMap;
import it.unimi.dsi.fastutil.longs.LongAVLTreeSet;
import it.unimi.dsi.fastutil.longs.LongBidirectionalIterator;
import it.unimi.dsi.fastutil.longs.LongOpenHashSet;
import it.unimi.dsi.fastutil.longs.LongSet;
import it.unimi.dsi.fastutil.longs.LongSortedSet;
import it.unimi.dsi.fastutil.objects.ObjectCollection;
import it.unimi.dsi.fastutil.objects.ObjectIterator;
import java.util.Objects;
import java.util.PrimitiveIterator;
import java.util.Spliterators;
import java.util.stream.LongStream;
import java.util.stream.Stream;
import java.util.stream.StreamSupport;
import minecraft.class00734;
import minecraft.class01101;
import minecraft.class01102;
import minecraft.class01128;
import minecraft.class01135;
import minecraft.class01296;
import minecraft.class04197;
import minecraft.class04218;
import minecraft.class07321;
import net.caffeinemc.mods.lithium.common.entity.PositionedEntityTrackingSection;
import net.caffeinemc.mods.lithium.common.world.ChunkAwareEntityIterable;
import org.jspecify.annotations.Nullable;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

public class class01129<T extends class01135>
implements ChunkAwareEntityIterable {
    public static final int N = 2;
    public static final int y = 4;
    private final Class<T> L;
    private final Long2ObjectFunction<class01102> u;
    private final Long2ObjectMap<class01101<T>> i = new Long2ObjectOpenHashMap();
    private final LongSortedSet R = new LongAVLTreeSet();

    public class01101<T> L(long l) {
        return (class01101)this.i.computeIfAbsent(l, this::M);
    }

    private class01101<T> M(long l) {
        long l2 = class01129.R(l);
        class01102 class011022 = (class01102)this.u.get(l2);
        this.R.add(l);
        class01101 class011012 = new class01101(this.L, class011022);
        this.N(l, new CallbackInfoReturnable("", false, (Object)class011012));
        return class011012;
    }

    public class01129(Class<T> clazz, Long2ObjectFunction<class01102> long2ObjectFunction) {
        this.L = clazz;
        this.u = long2ObjectFunction;
    }

    public void i(long l) {
        this.i.remove(l);
        this.R.remove(l);
    }

    public @Nullable class01101<T> u(long l) {
        return (class01101)this.i.get(l);
    }

    public int y() {
        return this.R.size();
    }

    public Stream<class01101<T>> y(long l) {
        return this.N(l).mapToObj(arg_0 -> this.i.get(arg_0)).filter(Objects::nonNull);
    }

    public void y(class00734 class007342, class04197<T> class041972) {
        this.N(class007342, class011012 -> class011012.N(class007342, class041972));
    }

    private static /* synthetic */ void N(LongSet longSet, long l) {
        longSet.add(class01129.R(l));
    }

    private void N(long l, CallbackInfoReturnable callbackInfoReturnable) {
        ((PositionedEntityTrackingSection)callbackInfoReturnable.getReturnValue()).lithium$setPos(l);
    }

    private class04218 N(long l, class04197 class041972) {
        class01101<T> class011012 = this.u(l);
        if (class011012 != null && 0 != class011012.u() && class011012.L().y()) {
            return class041972.accept(class011012);
        }
        return class04218.field_41283;
    }

    public void N(class00734 class007342, class04197 class041972, CallbackInfo callbackInfo, int n, int n2, int n3, int n4, int n5, int n6) {
        if (n4 >= n + 4 || n6 >= n3 + 4) {
            return;
        }
        callbackInfo.cancel();
        for (int i = n; i <= n4; ++i) {
            int n7;
            for (n7 = Math.max(n3, 0); n7 <= n6; ++n7) {
                if (!this.N(i, n2, n5, n7, class041972).N()) continue;
                return;
            }
            n7 = Math.min(-1, n6);
            for (int j = n3; j <= n7; ++j) {
                if (!this.N(i, n2, n5, j, class041972).N()) continue;
                return;
            }
        }
    }

    private class04218 N(int n, int n2, int n3, int n4, class04197 class041972) {
        int n5;
        class04218 class042182 = class04218.field_41283;
        for (n5 = Math.max(n2, 0); n5 <= n3; ++n5) {
            class042182 = this.N(class01296.y((int)n, (int)n5, (int)n4), class041972);
            if (!class042182.N()) continue;
            return class042182;
        }
        n5 = Math.min(-1, n3);
        for (int i = n2; i <= n5; ++i) {
            class042182 = this.N(class01296.y((int)n, (int)i, (int)n4), class041972);
            if (!class042182.N()) continue;
            return class042182;
        }
        return class042182;
    }

    public void N(class00734 class007342, class04197<class01101<T>> class041972) {
        int n = class01296.N((double)(class007342.N - 2.0));
        int n2 = class01296.N((double)(class007342.y - 4.0));
        int n3 = class01296.N((double)(class007342.L - 2.0));
        int n4 = class01296.N((double)(class007342.u + 2.0));
        int n5 = class01296.N((double)(class007342.i + 0.0));
        int n6 = class01296.N((double)(class007342.R + 2.0));
        CallbackInfo callbackInfo = new CallbackInfo("", true);
        this.N(class007342, class041972, callbackInfo, n, n2, n3, n4, n5, n6);
        if (callbackInfo.isCancelled()) {
            return;
        }
        for (int i = n; i <= n4; ++i) {
            long l = class01296.y((int)i, (int)0, (int)0);
            long l2 = class01296.y((int)i, (int)-1, (int)-1);
            LongBidirectionalIterator longBidirectionalIterator = this.R.subSet(l, l2 + 1L).iterator();
            while (longBidirectionalIterator.hasNext()) {
                class01101 class011012;
                long l3 = longBidirectionalIterator.nextLong();
                int n7 = class01296.L((long)l3);
                int n8 = class01296.u((long)l3);
                if (n7 < n2 || n7 > n5 || n8 < n3 || n8 > n6 || (class011012 = (class01101)this.i.get(l3)) == null || class011012.N() || !class011012.L().y() || !class041972.accept((Object)class011012).N()) continue;
                return;
            }
        }
    }

    public LongStream N(long l) {
        int n;
        int n2 = class07321.N((long)l);
        LongSortedSet longSortedSet = this.N(n2, n = class07321.y((long)l));
        if (longSortedSet.isEmpty()) {
            return LongStream.empty();
        }
        return StreamSupport.longStream(Spliterators.spliteratorUnknownSize((PrimitiveIterator.OfLong)longSortedSet.iterator(), 1301), false);
    }

    private LongSortedSet N(int n, int n2) {
        long l = class01296.y((int)n, (int)0, (int)n2);
        long l2 = class01296.y((int)n, (int)-1, (int)n2);
        return this.R.subSet(l, l2 + 1L);
    }

    public LongSet N() {
        LongOpenHashSet longOpenHashSet = new LongOpenHashSet();
        this.i.keySet().forEach(arg_0 -> class01129.N((LongSet)longOpenHashSet, arg_0));
        return longOpenHashSet;
    }

    public <U extends T> void N(class01128<T, U> class011282, class00734 class007342, class04197<U> class041972) {
        this.N(class007342, class011012 -> class011012.N(class011282, class007342, class041972));
    }

    private static long R(long l) {
        return class07321.u((int)class01296.y((long)l), (int)class01296.u((long)l));
    }

    public Iterable lithium$IterateEntitiesInTrackedSections() {
        ObjectCollection objectCollection = this.i.values();
        return () -> {
            ObjectIterator objectIterator = objectCollection.iterator();
            return new class09440(this, objectIterator);
        };
    }
}

