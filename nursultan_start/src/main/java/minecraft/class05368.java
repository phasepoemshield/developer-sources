/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.DataFixer
 *  com.mojang.datafixers.util.Pair
 *  it.unimi.dsi.fastutil.longs.LongArrays
 *  it.unimi.dsi.fastutil.longs.LongOpenHashSet
 *  it.unimi.dsi.fastutil.longs.LongSet
 *  minecraft.class00465
 *  minecraft.class00500
 *  minecraft.class00549
 *  minecraft.class00554
 *  minecraft.class00753
 *  minecraft.class01042
 *  minecraft.class01296
 *  minecraft.class02277
 *  minecraft.class02599
 *  minecraft.class03556
 *  minecraft.class03927
 *  minecraft.class03949
 *  minecraft.class05474
 *  minecraft.class05487
 *  minecraft.class05715
 *  minecraft.class05946
 *  minecraft.class06069
 *  minecraft.class06172
 *  minecraft.class07209
 *  minecraft.class07321
 *  minecraft.class07536
 *  minecraft.class08057
 *  net.caffeinemc.mods.lithium.common.util.Distances
 *  net.caffeinemc.mods.lithium.common.util.Pos$SectionYCoord
 *  net.caffeinemc.mods.lithium.common.util.Pos$SectionYIndex
 *  net.caffeinemc.mods.lithium.common.world.interests.PointOfInterestSetExtended
 *  net.caffeinemc.mods.lithium.common.world.interests.PointOfInterestStorageExtended
 *  net.caffeinemc.mods.lithium.common.world.interests.RegionBasedStorageSectionExtended
 *  net.caffeinemc.mods.lithium.common.world.interests.iterator.NearbyPointOfInterestStream
 *  net.caffeinemc.mods.lithium.common.world.interests.iterator.SinglePointOfInterestTypeFilter
 *  net.caffeinemc.mods.lithium.common.world.interests.iterator.SphereChunkOrderedPoiSetSpliterator
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import com.mojang.datafixers.DataFixer;
import com.mojang.datafixers.util.Pair;
import it.unimi.dsi.fastutil.longs.LongArrays;
import it.unimi.dsi.fastutil.longs.LongOpenHashSet;
import it.unimi.dsi.fastutil.longs.LongSet;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Optional;
import java.util.function.BiConsumer;
import java.util.function.BiPredicate;
import java.util.function.BooleanSupplier;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.IntStream;
import java.util.stream.Stream;
import java.util.stream.StreamSupport;
import minecraft.class00465;
import minecraft.class00500;
import minecraft.class00549;
import minecraft.class00554;
import minecraft.class00753;
import minecraft.class01042;
import minecraft.class01296;
import minecraft.class02277;
import minecraft.class02599;
import minecraft.class03556;
import minecraft.class03927;
import minecraft.class03949;
import minecraft.class05369;
import minecraft.class05370;
import minecraft.class05372;
import minecraft.class05374;
import minecraft.class05377;
import minecraft.class05379;
import minecraft.class05380;
import minecraft.class05474;
import minecraft.class05487;
import minecraft.class05715;
import minecraft.class05946;
import minecraft.class06069;
import minecraft.class06172;
import minecraft.class07209;
import minecraft.class07321;
import minecraft.class07536;
import minecraft.class08057;
import net.caffeinemc.mods.lithium.common.util.Distances;
import net.caffeinemc.mods.lithium.common.util.Pos;
import net.caffeinemc.mods.lithium.common.world.interests.PointOfInterestSetExtended;
import net.caffeinemc.mods.lithium.common.world.interests.PointOfInterestStorageExtended;
import net.caffeinemc.mods.lithium.common.world.interests.RegionBasedStorageSectionExtended;
import net.caffeinemc.mods.lithium.common.world.interests.iterator.NearbyPointOfInterestStream;
import net.caffeinemc.mods.lithium.common.world.interests.iterator.SinglePointOfInterestTypeFilter;
import net.caffeinemc.mods.lithium.common.world.interests.iterator.SphereChunkOrderedPoiSetSpliterator;
import org.jspecify.annotations.Nullable;

public class class05368
extends class05374<class05370, class05380>
implements PointOfInterestStorageExtended,
RegionBasedStorageSectionExtended {
    public static final int N = 6;
    public static final int y = 1;
    private final class05379 i;
    private final LongSet R;
    private final LongSet M = new LongOpenHashSet();
    private int B = 0;

    public Optional<class03556<class05369>> L(class07209 class072092) {
        return this.i(class01296.L((class07209)class072092)).flatMap(class053702 -> class053702.u(class072092));
    }

    public Stream<Pair<class03556<class05369>, class07209>> L(Predicate<class03556<class05369>> predicate, Predicate<class07209> predicate2, class07209 class072092, int n, class05372 class053722) {
        return this.y(predicate, predicate2, class072092, n, class053722).sorted(Comparator.comparingDouble(pair -> ((class07209)pair.getSecond()).method_10262((class00753)class072092)));
    }

    public Optional L(Predicate predicate, class07209 class072092, int n, class05372 class053722) {
        return this.i(predicate, null, class072092, n, class053722);
    }

    @Override
    protected void L(long l) {
        this.i.y(l, this.i.y(l), false);
    }

    private /* synthetic */ boolean L(class07321 class073212) {
        return this.R.add(class073212.y());
    }

    public class05368(class02277 class022772, Path path, DataFixer dataFixer, boolean bl, class01042 class010422, class02599 class025992, class05474 class054742) {
        super(new class06172(class022772, path, dataFixer, bl, class05715.field_19221), class05380.N, class05370::N, class05380::N, class05370::new, class010422, class025992, class054742);
        this.R = new LongOpenHashSet();
        this.i = new class05379(this);
    }

    private static int B(long l) {
        return (int)((l & 0xFFFFFFFFL) + Integer.MIN_VALUE);
    }

    public Stream i(Predicate predicate, class07209 class072092, int n, class05372 class053722) {
        return StreamSupport.stream(new SphereChunkOrderedPoiSetSpliterator(n, class072092, (RegionBasedStorageSectionExtended)this, predicate, class053722), false);
    }

    public Optional i(Predicate predicate, Predicate predicate2, class07209 class072094, int n, class05372 class053722) {
        int n2 = n * n;
        class05377 class053773 = new NearbyPointOfInterestStream(predicate, class053722, predicate2 == null ? null : class053772 -> predicate2.test(class053772.M()), class072094, n, (RegionBasedStorageSectionExtended)this, (class072092, class072093) -> Distances.isWithinSphereRadius((class07209)class072092, (long)n2, (class07209)class072093), NearbyPointOfInterestStream.POINT_COMPARATOR).getFirst();
        return class053773 == null ? Optional.empty() : Optional.of(class053773.M());
    }

    public @Nullable class00465 u(class07209 class072092) {
        return this.i(class01296.L((class07209)class072092)).flatMap(class053702 -> class053702.i(class072092)).orElse(null);
    }

    public long u(Predicate predicate, class07209 class072092, int n, class05372 class053722) {
        return this.R(predicate, class072092, n, class053722).size();
    }

    public Optional u(Predicate predicate3, Predicate predicate4, class07209 class072093, int n, class05372 class053723) {
        long l2 = (long)n * (long)n;
        int n2 = class072093.method_10263() - n - 1 >> 4;
        int n3 = class072093.method_10263() + n + 1 >> 4;
        int n4 = class072093.method_10260() - n - 1 >> 4;
        int n5 = class072093.method_10260() + n + 1 >> 4;
        int n6 = n2;
        int n7 = n4;
        while (n7 <= n5) {
            long l3;
            class05377 class053772;
            long l4 = Distances.getMinChunkToBlockDistanceL2Sq((class07209)class072093, (int)n6, (int)n7);
            if (l4 <= l2 && (class053772 = (class05377)this.lithium$getFirstInRangeInChunkColumn(n6, n7, l3 = l2 - l4, class072093, l2, (class053702, class072092, predicate, predicate2, class053722, l) -> ((PointOfInterestSetExtended)class053702).lithium$getFirstMatchingPoint(class072092, l, predicate, predicate2, class053722), predicate3, predicate4, (Object)class053723)) != null) {
                return Optional.of(class053772.M());
            }
            if (++n6 <= n3) continue;
            ++n7;
            n6 = n2;
        }
        return Optional.empty();
    }

    public Stream<Pair<class03556<class05369>, class07209>> y(Predicate<class03556<class05369>> predicate, Predicate<class07209> predicate2, class07209 class072092, int n, class05372 class053722) {
        return this.i(predicate, class072092, n, class053722).filter(class053772 -> predicate2.test(class053772.M())).map(class053772 -> Pair.of(class053772.B(), (Object)class053772.M()));
    }

    public boolean y(class07209 class072092) {
        return this.i(class01296.L((class07209)class072092)).map(class053702 -> class053702.L(class072092)).orElseThrow(() -> (IllegalStateException)class07536.y((Throwable)new IllegalStateException("POI never registered at " + String.valueOf(class072092))));
    }

    public Optional y(Predicate predicate, class07209 class072094, int n, class05372 class053722) {
        int n2 = n * n;
        class05377 class053772 = new NearbyPointOfInterestStream(predicate, class053722, null, class072094, n, (RegionBasedStorageSectionExtended)this, (class072092, class072093) -> Distances.isWithinSphereRadius((class07209)class072092, (long)n2, (class07209)class072093), NearbyPointOfInterestStream.POINT_COMPARATOR).getFirst();
        return class053772 == null ? Optional.empty() : Optional.of(Pair.of(class053772.B(), (Object)class053772.M()));
    }

    private static /* synthetic */ double y(class07209 class072092, class07209 class072093) {
        return class072093.method_10262((class00753)class072092);
    }

    private static /* synthetic */ Pair y(class05377 class053772) {
        return Pair.of(class053772.B(), (Object)class053772.M());
    }

    private /* synthetic */ Pair y(class01296 class012962) {
        return Pair.of((Object)class012962, this.i(class012962.W()));
    }

    private static /* synthetic */ boolean y(Pair pair) {
        return ((Optional)pair.getSecond()).map(class05370::y).orElse(false) == false;
    }

    @Override
    protected void y(long l) {
        super.y(l);
        this.i.y(l, this.i.y(l), false);
    }

    private static long N(long l, long l2) {
        return l << 32 | l2 - Integer.MIN_VALUE;
    }

    private static /* synthetic */ boolean N(class07209 class072092, int n, class05377 class053772) {
        return class053772.M().method_10262((class00753)class072092) <= (double)n;
    }

    public Optional N(Predicate predicate, Predicate predicate2, class05372 class053722, class07209 class072092, int n, class06069 class060692) {
        ArrayList arrayList = this.R(predicate, class072092, n, class053722);
        for (int i = arrayList.size() - 1; i >= 0; --i) {
            class05377 class053772 = arrayList.set(class060692.y(i + 1), (class05377)arrayList.get(i));
            arrayList.set(i, class053772);
            if (!predicate2.test(class053772.M())) continue;
            return Optional.of(class053772.M());
        }
        return Optional.empty();
    }

    public void N(class05487 class054872, class07209 class072092, int n) {
        long l;
        if (this.B != n) {
            this.M.clear();
            this.B = n;
        }
        if (this.M.contains(l = class07321.N((class07209)class072092))) {
            return;
        }
        int n2 = class01296.N((int)class072092.method_10263());
        int n3 = class01296.N((int)class072092.method_10260());
        int n4 = Math.floorDiv(n, 16);
        long[] lArray = new long[2 * n4 + 1];
        int n5 = Pos.SectionYIndex.getMaxYSectionIndexExclusive((class05474)class054872);
        int n6 = n3 + n4;
        for (int i = n3 - n4; i <= n6; ++i) {
            int n7;
            int n8 = 0;
            int n9 = n2 + n4;
            for (n7 = n2 - n4; n7 <= n9; ++n7) {
                int n10 = this.N(class054872, n7, i);
                if (n10 >= n5 || !this.R.add(class07321.u((int)n7, (int)i))) continue;
                lArray[n8++] = class05368.N(n10, n7);
            }
            LongArrays.quickSort((long[])lArray, (int)0, (int)n8);
            for (n7 = 0; n7 < n8; ++n7) {
                long l2 = lArray[n7];
                class054872.method_22342(class05368.B(l2), i, class00549.L);
            }
        }
        this.M.add(l);
    }

    private int N(class05487 class054872, int n, int n2) {
        BitSet bitSet = this.lithium$getNonEmptyPOISections(n, n2);
        int n3 = bitSet.nextClearBit(0);
        int n4 = -1;
        while ((n4 = bitSet.nextSetBit(n4 + 1)) != -1 && n4 < n3) {
            Optional optional = this.lithium$getElementAt(class01296.y((int)n, (int)Pos.SectionYCoord.fromSectionIndex((class05474)class054872, (int)n4), (int)n2));
            if (!optional.isPresent() || ((class05370)optional.get()).y()) continue;
            return n4;
        }
        return n3;
    }

    public void N(class01296 class012962, class00554 class005542) {
        class07536.N(this.i(class012962.W()), (T class053702) -> class053702.N((BiConsumer<class07209, class03556<class05369>> biConsumer) -> {
            if (class05368.N(class005542)) {
                this.N(class005542, class012962, (BiConsumer<class07209, class03556<class05369>>)biConsumer);
            }
        }), () -> {
            if (class05368.N(class005542)) {
                class05370 class053702 = (class05370)this.M(class012962.W());
                this.N(class005542, class012962, class053702::N);
            }
        });
    }

    @Override
    public void N(BooleanSupplier booleanSupplier) {
        super.N(booleanSupplier);
        this.i.N();
    }

    boolean N(long l) {
        Optional var3 = this.u(l);
        if (var3 == null) {
            return false;
        }
        return var3.map(class053702 -> class053702.N((class03556<class05369> class035562) -> class035562.N(class03949.y), class05372.field_18488).findAny().isPresent()).orElse(false);
    }

    public int N(class01296 class012962) {
        this.i.N();
        return this.i.L(class012962.W());
    }

    private static /* synthetic */ class07321 N(Pair pair) {
        return ((class01296)pair.getFirst()).E();
    }

    private static /* synthetic */ void N(class05487 class054872, class07321 class073212) {
        class054872.method_22342(class073212.B, class073212.Z, class00549.L);
    }

    private void N(class00554 class005542, class01296 class012962, BiConsumer<class07209, class03556<class05369>> biConsumer) {
        class012962.m().forEach(class072092 -> class03927.N((class00500)class005542.N(class01296.y((int)class072092.method_10263()), class01296.y((int)class072092.method_10264()), class01296.y((int)class072092.method_10260()))).ifPresent(class035562 -> biConsumer.accept((class07209)class072092, (class03556<class05369>)class035562)));
    }

    private static boolean N(class00554 class005542) {
        return class005542.N(class03927::y);
    }

    public Stream<class05377> N(Predicate<class03556<class05369>> predicate, class07209 class072092, int n, class05372 class053722) {
        int n2 = Math.floorDiv(n, 16) + 1;
        return class07321.N((class07321)new class07321(class072092), (int)n2).flatMap(class073212 -> this.N(predicate, (class07321)class073212, class053722)).filter(class053772 -> {
            class07209 class072093 = class053772.M();
            return Math.abs(class072093.method_10263() - class072092.method_10263()) <= n && Math.abs(class072093.method_10260() - class072092.method_10260()) <= n;
        });
    }

    public boolean N(class05946<class05369> class059462, class07209 class072092) {
        return this.N(class072092, (class03556<class05369> class035562) -> class035562.N(class059462));
    }

    public void N(class07209 class072092) {
        this.i(class01296.L((class07209)class072092)).ifPresent(class053702 -> class053702.N(class072092));
    }

    public @Nullable class05377 N(class07209 class072092, class03556<class05369> class035562) {
        return ((class05370)this.M(class01296.L((class07209)class072092))).N(class072092, class035562);
    }

    public boolean N(class07209 class072092, Predicate<class03556<class05369>> predicate) {
        return this.i(class01296.L((class07209)class072092)).map(class053702 -> class053702.N(class072092, predicate)).orElse(false);
    }

    public Optional<class07209> N(Predicate<class03556<class05369>> predicate, BiPredicate<class03556<class05369>, class07209> biPredicate, class07209 class072092, int n) {
        return this.i(predicate, class072092, n, class05372.field_18487).filter(class053772 -> biPredicate.test(class053772.B(), class053772.M())).findFirst().map(class053772 -> {
            class053772.L();
            return class053772.M();
        });
    }

    public Stream<class07209> N(Predicate<class03556<class05369>> predicate, Predicate<class07209> predicate2, class07209 class072092, int n, class05372 class053722) {
        return this.i(predicate, class072092, n, class053722).map(class05377::M).filter(predicate2);
    }

    public Stream<class05377> N(Predicate<class03556<class05369>> predicate, class07321 class073212, class05372 class053722) {
        return IntStream.rangeClosed(this.u.method_32891(), this.u.method_31597()).boxed().map(n -> this.i(class01296.N((class07321)class073212, (int)n).W())).filter(Optional::isPresent).flatMap(optional -> ((class05370)optional.get()).N(predicate, class053722));
    }

    private static /* synthetic */ boolean N(Predicate predicate, class05377 class053772) {
        return predicate.test(class053772.M());
    }

    private static /* synthetic */ double N(class07209 class072092, class05377 class053772) {
        return class053772.M().method_10262((class00753)class072092);
    }

    private static /* synthetic */ double N(class07209 class072092, class07209 class072093) {
        return class072093.method_10262((class00753)class072092);
    }

    public Collection lithium$getNClosestFirstWithType(Predicate predicate, Predicate predicate2, class07209 class072094, int n, class05372 class053722, long l) {
        int n2 = n * n;
        NearbyPointOfInterestStream nearbyPointOfInterestStream = new NearbyPointOfInterestStream(predicate, class053722, class053772 -> predicate2.test(class053772.M()), class072094, n, (RegionBasedStorageSectionExtended)this, (class072092, class072093) -> Distances.isWithinSphereRadius((class07209)class072092, (long)n2, (class07209)class072093), NearbyPointOfInterestStream.POINT_COMPARATOR);
        ArrayList arrayList = new ArrayList();
        int n3 = 0;
        while ((long)n3 < l && nearbyPointOfInterestStream.tryAdvance(class053772 -> arrayList.add(Pair.of(class053772.B(), (Object)class053772.M())))) {
            ++n3;
        }
        return arrayList;
    }

    public Optional lithium$findNearestForPortalLogic(class07209 class072094, int n, class03556 class035562, class05372 class053722, Predicate predicate, class08057 class080572) {
        Predicate<class05377> predicate2 = class080572 == null || class080572.y((double)class072094.method_10263(), (double)class072094.method_10260()) > (double)(n + 3) ? predicate : class053772 -> class080572.N(class053772.M()) && predicate.test((class05377)class053772);
        SinglePointOfInterestTypeFilter singlePointOfInterestTypeFilter = new SinglePointOfInterestTypeFilter(class035562);
        class05377 class053773 = new NearbyPointOfInterestStream((Predicate)singlePointOfInterestTypeFilter, class053722, predicate2, class072094, n, (RegionBasedStorageSectionExtended)this, (class072092, class072093) -> Distances.isWithinCubeRadius((class07209)class072092, (int)n, (class07209)class072093), NearbyPointOfInterestStream.NEGATIVE_Y_POINT_COMPARATOR).getFirst();
        return class053773 == null ? Optional.empty() : Optional.of(class053773);
    }

    private ArrayList R(Predicate predicate, class07209 class072092, int n, class05372 class053722) {
        int n2 = Math.multiplyExact(n, n);
        int n3 = class072092.method_10263() - n - 1 >> 4;
        int n4 = class072092.method_10260() - n - 1 >> 4;
        int n5 = class072092.method_10263() + n + 1 >> 4;
        int n6 = class072092.method_10260() + n + 1 >> 4;
        ArrayList arrayList = new ArrayList();
        Consumer<class05377> consumer = class053772 -> {
            if (Distances.isWithinSphereRadius((class07209)class072092, (long)n2, (class07209)class053772.M())) {
                arrayList.add(class053772);
            }
        };
        for (int i = n3; i <= n5; ++i) {
            for (int j = n4; j <= n6; ++j) {
                Iterator iterator = this.lithium$getInChunkColumn(i, j).iterator();
                while (iterator.hasNext()) {
                    ((PointOfInterestSetExtended)((class05370)iterator.next())).lithium$collectMatchingPoints(predicate, class053722, consumer);
                }
            }
        }
        return arrayList;
    }

    public Optional lithium$takeAt(Predicate predicate, BiPredicate biPredicate, class07209 class072092) {
        class05377 class053772;
        Optional var4 = this.i(class01296.L((class07209)class072092));
        if (var4.isPresent() && (class053772 = ((PointOfInterestSetExtended)var4.get()).lithium$getAt(class072092)) != null && predicate.test(class053772.B())) {
            class053772.L();
            return Optional.of(class053772.M());
        }
        return Optional.empty();
    }
}

