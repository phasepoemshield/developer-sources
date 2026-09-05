/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Suppliers
 *  com.mojang.datafixers.util.Pair
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.MapCodec
 *  it.unimi.dsi.fastutil.ints.IntArraySet
 *  it.unimi.dsi.fastutil.ints.IntSet
 *  it.unimi.dsi.fastutil.longs.LongSet
 *  it.unimi.dsi.fastutil.objects.Object2ObjectArrayMap
 *  it.unimi.dsi.fastutil.objects.ObjectArraySet
 *  minecraft.class00529
 *  minecraft.class00549
 *  minecraft.class00554
 *  minecraft.class00751
 *  minecraft.class00753
 *  minecraft.class00765
 *  minecraft.class00780
 *  minecraft.class01016
 *  minecraft.class01029
 *  minecraft.class01042
 *  minecraft.class01224
 *  minecraft.class01296
 *  minecraft.class01376
 *  minecraft.class01607
 *  minecraft.class01905
 *  minecraft.class02045
 *  minecraft.class03001
 *  minecraft.class03167
 *  minecraft.class03528
 *  minecraft.class03532
 *  minecraft.class03543
 *  minecraft.class03548
 *  minecraft.class03556
 *  minecraft.class03923
 *  minecraft.class03929
 *  minecraft.class04042
 *  minecraft.class04043
 *  minecraft.class04084
 *  minecraft.class04206
 *  minecraft.class04227
 *  minecraft.class04320
 *  minecraft.class04330
 *  minecraft.class04336
 *  minecraft.class04412
 *  minecraft.class04419
 *  minecraft.class04426
 *  minecraft.class04436
 *  minecraft.class04540
 *  minecraft.class04748
 *  minecraft.class04782
 *  minecraft.class04932
 *  minecraft.class05163
 *  minecraft.class05324
 *  minecraft.class05474
 *  minecraft.class05487
 *  minecraft.class05517
 *  minecraft.class05946
 *  minecraft.class05974
 *  minecraft.class06069
 *  minecraft.class06075
 *  minecraft.class07074
 *  minecraft.class07080
 *  minecraft.class07209
 *  minecraft.class07218
 *  minecraft.class07299
 *  minecraft.class07321
 *  minecraft.class07428
 *  minecraft.class07529
 *  minecraft.class07536
 *  minecraft.class07830
 *  minecraft.class07836
 *  minecraft.class07852
 *  minecraft.class07878
 *  minecraft.class08050
 *  org.apache.commons.lang3.mutable.MutableBoolean
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import com.google.common.base.Suppliers;
import com.mojang.datafixers.util.Pair;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import it.unimi.dsi.fastutil.ints.IntArraySet;
import it.unimi.dsi.fastutil.ints.IntSet;
import it.unimi.dsi.fastutil.longs.LongSet;
import it.unimi.dsi.fastutil.objects.Object2ObjectArrayMap;
import it.unimi.dsi.fastutil.objects.ObjectArraySet;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.concurrent.CompletableFuture;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import minecraft.class00529;
import minecraft.class00549;
import minecraft.class00554;
import minecraft.class00751;
import minecraft.class00753;
import minecraft.class00765;
import minecraft.class00780;
import minecraft.class01016;
import minecraft.class01029;
import minecraft.class01042;
import minecraft.class01224;
import minecraft.class01296;
import minecraft.class01376;
import minecraft.class01607;
import minecraft.class01905;
import minecraft.class02045;
import minecraft.class03001;
import minecraft.class03167;
import minecraft.class03528;
import minecraft.class03532;
import minecraft.class03543;
import minecraft.class03548;
import minecraft.class03556;
import minecraft.class03923;
import minecraft.class03929;
import minecraft.class04042;
import minecraft.class04043;
import minecraft.class04084;
import minecraft.class04206;
import minecraft.class04227;
import minecraft.class04320;
import minecraft.class04330;
import minecraft.class04336;
import minecraft.class04412;
import minecraft.class04419;
import minecraft.class04426;
import minecraft.class04436;
import minecraft.class04540;
import minecraft.class04748;
import minecraft.class04782;
import minecraft.class04932;
import minecraft.class05163;
import minecraft.class05324;
import minecraft.class05474;
import minecraft.class05487;
import minecraft.class05517;
import minecraft.class05946;
import minecraft.class05974;
import minecraft.class06069;
import minecraft.class06075;
import minecraft.class07074;
import minecraft.class07080;
import minecraft.class07209;
import minecraft.class07218;
import minecraft.class07299;
import minecraft.class07321;
import minecraft.class07428;
import minecraft.class07529;
import minecraft.class07536;
import minecraft.class07830;
import minecraft.class07836;
import minecraft.class07852;
import minecraft.class07878;
import minecraft.class08050;
import org.apache.commons.lang3.mutable.MutableBoolean;
import org.jspecify.annotations.Nullable;

public abstract class class08088 {
    public static final Codec<class08088> N = class04206.NN.T().dispatchStable(class08088::y, Function.identity());
    protected final class00765 y;
    public Supplier<List<class03923>> L;
    private final Function<class03556<class00780>, class01029> u;

    public Optional<class05946<MapCodec<? extends class08088>>> L() {
        return class04206.NN.u(this.y());
    }

    public int L(int n, int n2, class07830 class078302, class05474 class054742, class04084 class040842) {
        return this.N(n, n2, class078302, class054742, class040842) - 1;
    }

    public abstract int M();

    public class08088(class00765 class007652) {
        this(class007652, class035562 -> ((class00780)class035562.N()).L());
    }

    public class08088(class00765 class007652, Function<class03556<class00780>, class01029> function) {
        this.y = class007652;
        this.u = function;
        this.L = Suppliers.memoize(() -> class03929.N(List.copyOf(class007652.L()), (T class035562) -> ((class01029)function.apply((class03556<class00780>)class035562)).L(), (boolean)true));
    }

    public abstract int i();

    public class00765 u() {
        return this.y;
    }

    public int y(int n, int n2, class07830 class078302, class05474 class054742, class04084 class040842) {
        return this.N(n, n2, class078302, class054742, class040842);
    }

    protected abstract MapCodec<? extends class08088> y();

    public class02045 N(class01905<class04412> class019052, class04084 class040842, long l) {
        return class02045.N((class04084)class040842, (long)l, (class00765)this.y, class019052);
    }

    public abstract void N(List<String> var1, class04084 var2, class07209 var3);

    @Deprecated
    public class01029 N(class03556<class00780> class035562) {
        return this.u.apply(class035562);
    }

    private static /* synthetic */ void N(class05974 class059742, Set set, class07321 class073212) {
        class00554[] class00554Array = class059742.method_8392(class073212.B, class073212.Z).u();
        int n = class00554Array.length;
        for (int i = 0; i < n; ++i) {
            class00554Array[i].Z().N(set::add);
        }
    }

    private static /* synthetic */ void N(IntSet intSet, class03923 class039232, class04336 class043362) {
        intSet.add(class039232.y().applyAsInt(class043362));
    }

    private static /* synthetic */ String N(class00751 class007512, class04748 class047482) {
        return class007512.u((Object)class047482).map(Object::toString).orElseGet(class047482::toString);
    }

    private static @Nullable Pair<class07209, class03556<class04748>> N(Set<class03556<class04748>> set, class05487 class054872, class05324 class053242, boolean bl, class03532 class035322, class07321 class073212) {
        for (class03556<class04748> class035562 : set) {
            class03167 class031672 = class053242.N(class073212, (class04748)class035562.N(), class035322, bl);
            if (class031672 == class03167.field_36240) continue;
            if (!bl && class031672 == class03167.field_36239) {
                return Pair.of((Object)class035322.N(class073212), class035562);
            }
            class08050 class080502 = class054872.method_22342(class073212.B, class073212.Z, class00549.u);
            class04932 class049322 = class053242.N(class01296.N((class08050)class080502), (class04748)class035562.N(), (class00529)class080502);
            if (class049322 == null || !class049322.y() || bl && !class08088.N(class053242, class049322)) continue;
            return Pair.of((Object)class035322.N(class049322.L()), class035562);
        }
        return null;
    }

    private static boolean N(class05324 class053242, class04932 class049322) {
        if (class049322.u()) {
            class053242.N(class049322);
            return true;
        }
        return false;
    }

    public void N(class05974 class059742, class08050 class080502, class05324 class053242) {
        class07321 class073212 = class080502.R();
        if (class07529.N((class07321)class073212)) {
            return;
        }
        class01296 class012962 = class01296.N((class07321)class073212, (int)class059742.method_32891());
        class07209 class072092 = class012962.z();
        class00751 class007512 = class059742.method_30349().L(class04227.yj);
        Map<Integer, List<class04748>> map = class007512.j().collect(Collectors.groupingBy(class047482 -> class047482.u().ordinal()));
        List<class03923> list = this.L.get();
        class07836 class078362 = new class07836((class06069)new class04042(class04043.N()));
        long l = class078362.N(class059742.method_8412(), class072092.method_10263(), class072092.method_10260());
        ObjectArraySet objectArraySet = new ObjectArraySet();
        class07321.N((class07321)class012962.E(), (int)1).forEach(arg_0 -> class08088.N(class059742, (Set)objectArraySet, arg_0));
        objectArraySet.retainAll(this.y.L());
        int n = list.size();
        try {
            class00751 class007513 = class059742.method_30349().L(class04227.ys);
            int n2 = Math.max(class07852.values().length, n);
            for (int i = 0; i < n2; ++i) {
                Object object;
                Object object22;
                IntArraySet intArraySet;
                int n3 = 0;
                if (class053242.N()) {
                    intArraySet = map.getOrDefault(i, Collections.emptyList());
                    for (Object object22 : intArraySet) {
                        class078362.y(l, n3, i);
                        object = () -> class08088.N(class007512, (class04748)object22);
                        try {
                            class059742.N((Supplier)object);
                            class053242.N(class012962, object22).forEach(class049322 -> class049322.N(class059742, class053242, this, (class06069)class078362, class08088.N(class080502), class073212));
                        }
                        catch (Exception exception) {
                            class07080 class070802 = class07080.N((Throwable)exception, (String)"Feature placement");
                            class070802.N("Feature").N("Description", ((Supplier)object)::get);
                            throw new class07878(class070802);
                        }
                        ++n3;
                    }
                }
                if (i >= n) continue;
                intArraySet = new IntArraySet();
                for (Object object22 : objectArraySet) {
                    object = this.u.apply((class03556<class00780>)object22).L();
                    if (i >= object.size()) continue;
                    class03543 class035432 = (class03543)object.get(i);
                    class03923 class039232 = list.get(i);
                    class035432.N().map(class03556::N).forEach(arg_0 -> class08088.N((IntSet)intArraySet, class039232, arg_0));
                }
                int n4 = intArraySet.size();
                object22 = intArraySet.toIntArray();
                Arrays.sort((int[])object22);
                object = list.get(i);
                for (int j = 0; j < n4; ++j) {
                    class04748 class047483 = object22[j];
                    class04336 class043362 = (class04336)object.N().get((int)class047483);
                    Supplier<String> supplier = () -> class007513.u((Object)class043362).map(Object::toString).orElseGet(() -> ((class04336)class043362).toString());
                    class078362.y(l, (int)class047483, i);
                    try {
                        class059742.N(supplier);
                        class043362.y(class059742, this, (class06069)class078362, class072092);
                        continue;
                    }
                    catch (Exception exception) {
                        class07080 class070803 = class07080.N((Throwable)exception, (String)"Feature placement");
                        class070803.N("Feature").N("Description", supplier::get);
                        throw new class07878(class070803);
                    }
                }
            }
            class059742.N(null);
            if (class07529.Na) {
                class04320.N((class04782)class059742.method_8410());
            }
        }
        catch (Exception exception) {
            class07080 class070804 = class07080.N((Throwable)exception, (String)"Biome decoration");
            class070804.N("Generation").N("CenterX", (Object)class073212.B).N("CenterZ", (Object)class073212.Z).N("Decoration Seed", (Object)l);
            throw new class07878(class070804);
        }
    }

    private static class05163 N(class08050 class080502) {
        class07321 class073212 = class080502.R();
        int n = class073212.i();
        int n2 = class073212.R();
        class05474 class054742 = class080502.w();
        int n3 = class054742.method_31607() + 1;
        int n4 = class054742.method_31600();
        return new class05163(n, n3, n2, n + 15, n4, n2 + 15);
    }

    public abstract void N(class01607 var1, class05324 var2, class04084 var3, class08050 var4);

    public abstract void N(class01607 var1);

    public CompletableFuture<class08050> N(class04084 class040842, class03001 class030012, class05324 class053242, class08050 class080502) {
        return CompletableFuture.supplyAsync(() -> {
            class080502.N((class04330)this.y, class040842.y());
            return class080502;
        }, class07536.B().N("init_biomes"));
    }

    public abstract void N(class01607 var1, long var2, class04084 var4, class05517 var5, class05324 var6, class08050 var7);

    public @Nullable Pair<class07209, class03556<class04748>> N(class04782 class047822, class03543<class04748> class035432, class07209 class072092, int n, boolean bl) {
        class05324 class0532422;
        if (class07529.NO) {
            return null;
        }
        class02045 class020452 = class047822.method_14178().E();
        Object2ObjectArrayMap object2ObjectArrayMap = new Object2ObjectArrayMap();
        for (class03556 class035562 : class035432) {
            for (class05324 class0532422 : class020452.N(class035562)) {
                object2ObjectArrayMap.computeIfAbsent(class0532422, class035322 -> new ObjectArraySet()).add(class035562);
            }
        }
        if (object2ObjectArrayMap.isEmpty()) {
            return null;
        }
        Iterator iterator = null;
        double d = Double.MAX_VALUE;
        class0532422 = class047822.method_27056();
        ArrayList arrayList = new ArrayList(object2ObjectArrayMap.size());
        for (Map.Entry entry : object2ObjectArrayMap.entrySet()) {
            class03532 class035323 = (class03532)entry.getKey();
            if (class035323 instanceof class03548) {
                Map.Entry entry2;
                double d2;
                class03548 class035482 = (class03548)class035323;
                Iterator iterator2 = this.N((Set)entry.getValue(), class047822, class0532422, class072092, bl, class035482);
                if (iterator2 == null || !((d2 = class072092.method_10262((class00753)(entry2 = (class07209)iterator2.getFirst()))) < d)) continue;
                d = d2;
                iterator = iterator2;
                continue;
            }
            if (!(class035323 instanceof class03528)) continue;
            arrayList.add(entry);
        }
        if (!arrayList.isEmpty()) {
            int n2 = class01296.N((int)class072092.method_10263());
            int n3 = class01296.N((int)class072092.method_10260());
            for (int i = 0; i <= n; ++i) {
                boolean bl2 = false;
                for (Map.Entry entry2 : arrayList) {
                    class03528 class035282 = (class03528)entry2.getKey();
                    Pair<class07209, class03556<class04748>> pair = class08088.N((Set)entry2.getValue(), (class05487)class047822, class0532422, n2, n3, i, bl, class020452.u(), class035282);
                    if (pair == null) continue;
                    bl2 = true;
                    double d3 = class072092.method_10262((class00753)pair.getFirst());
                    if (!(d3 < d)) continue;
                    d = d3;
                    iterator = pair;
                }
                if (!bl2) continue;
                return iterator;
            }
        }
        return iterator;
    }

    private @Nullable Pair<class07209, class03556<class04748>> N(Set<class03556<class04748>> set, class04782 class047822, class05324 class053242, class07209 class072092, boolean bl, class03548 class035482) {
        List list = class047822.method_14178().E().N(class035482);
        if (list == null) {
            throw new IllegalStateException("Somehow tried to find structures for a placement that doesn't exist");
        }
        Pair<class07209, class03556<class04748>> pair = null;
        double d = Double.MAX_VALUE;
        class07218 class072182 = new class07218();
        for (class07321 class073212 : list) {
            Pair<class07209, class03556<class04748>> pair2;
            class072182.N(class01296.N((int)class073212.B, (int)8), 32, class01296.N((int)class073212.Z, (int)8));
            double d2 = class072182.method_10262((class00753)class072092);
            if (!(pair == null || d2 < d) || (pair2 = class08088.N(set, (class05487)class047822, class053242, bl, (class03532)class035482, class073212)) == null) continue;
            pair = pair2;
            d = d2;
        }
        return pair;
    }

    private static @Nullable Pair<class07209, class03556<class04748>> N(Set<class03556<class04748>> set, class05487 class054872, class05324 class053242, int n, int n2, int n3, boolean bl, long l, class03528 class035282) {
        int n4 = class035282.N();
        for (int i = -n3; i <= n3; ++i) {
            boolean bl2 = i == -n3 || i == n3;
            for (int j = -n3; j <= n3; ++j) {
                int n5;
                int n6;
                class07321 class073212;
                Pair<class07209, class03556<class04748>> pair;
                boolean bl3;
                boolean bl4 = bl3 = j == -n3 || j == n3;
                if (!bl2 && !bl3 || (pair = class08088.N(set, class054872, class053242, bl, (class03532)class035282, class073212 = class035282.N(l, n6 = n + n4 * i, n5 = n2 + n4 * j))) == null) continue;
                return pair;
            }
        }
        return null;
    }

    public void N(class05974 class059742, class05324 class053242, class08050 class080502) {
        int n = 8;
        class07321 class073212 = class080502.R();
        int n2 = class073212.B;
        int n3 = class073212.Z;
        int n4 = class073212.i();
        int n5 = class073212.R();
        class01296 class012962 = class01296.N((class08050)class080502);
        for (int i = n2 - 8; i <= n2 + 8; ++i) {
            for (int j = n3 - 8; j <= n3 + 8; ++j) {
                long l = class07321.u((int)i, (int)j);
                for (class04932 class049322 : class059742.method_8392(i, j).M().values()) {
                    try {
                        if (!class049322.y() || !class049322.N().N(n4, n5, n4 + 15, n5 + 15)) continue;
                        class053242.N(class012962, class049322.B(), l, (class00529)class080502);
                    }
                    catch (Exception exception) {
                        class07080 class070802 = class07080.N((Throwable)exception, (String)"Generating structure reference");
                        class07074 class070742 = class070802.N("Structure");
                        Optional optional = class059742.method_30349().method_46759(class04227.yj);
                        class070742.N("Id", () -> optional.map(class007512 -> class007512.y((Object)class049322.B()).toString()).orElse("UNKNOWN"));
                        class070742.N("Name", () -> class04206.F.y((Object)class049322.B().N()).toString());
                        class070742.N("Class", () -> class049322.B().getClass().getCanonicalName());
                        throw new class07878(class070802);
                    }
                }
            }
        }
    }

    public abstract CompletableFuture<class08050> N(class03001 var1, class04084 var2, class05324 var3, class08050 var4);

    public void N() {
        this.L.get();
    }

    public abstract int N(int var1, int var2, class07830 var3, class05474 var4, class04084 var5);

    public abstract class01376 N(int var1, int var2, class05474 var3, class04084 var4);

    public int N(class05474 class054742) {
        return 64;
    }

    public class04540<class01016> N(class03556<class00780> class035562, class05324 class053242, class07428 class074282, class07209 class072092) {
        for (Map.Entry entry : class053242.y(class072092).entrySet()) {
            class04748 class047482 = (class04748)entry.getKey();
            class04426 class044262 = (class04426)class047482.L().get(class074282);
            if (class044262 == null) continue;
            MutableBoolean mutableBoolean = new MutableBoolean(false);
            Predicate<class04932> predicate = class044262.N() == class04436.field_37199 ? class049322 -> class053242.N(class072092, class049322) : class049322 -> class049322.N().y((class00753)class072092);
            class053242.N(class047482, (LongSet)entry.getValue(), (T class049322) -> {
                if (mutableBoolean.isFalse() && predicate.test((class04932)class049322)) {
                    mutableBoolean.setTrue();
                }
            });
            if (!mutableBoolean.isTrue()) continue;
            return class044262.y();
        }
        return ((class00780)class035562.N()).N().N(class074282);
    }

    public void N(class01042 class010422, class02045 class020452, class05324 class053242, class08050 class080502, class01224 class012242, class05946<class07299> class059462) {
        if (class07529.NQ) {
            return;
        }
        class07321 class073212 = class080502.R();
        class01296 class012962 = class01296.N((class08050)class080502);
        class04084 class040842 = class020452.L();
        class020452.N().forEach(class035562 -> {
            class04419 class0441922;
            class03532 class035322 = ((class04412)class035562.N()).y();
            List list = ((class04412)class035562.N()).N();
            for (class04419 class0441922 : list) {
                class04932 class049322 = class053242.N(class012962, (class04748)class0441922.N().N(), (class00529)class080502);
                if (class049322 == null || !class049322.y()) continue;
                return;
            }
            if (!class035322.y(class020452, class073212.B, class073212.Z)) {
                return;
            }
            if (list.size() == 1) {
                this.N((class04419)list.get(0), class053242, class010422, class040842, class012242, class020452.u(), class080502, class073212, class012962, class059462);
                return;
            }
            ArrayList arrayList = new ArrayList(list.size());
            arrayList.addAll(list);
            class0441922 = new class07836((class06069)new class06075(0L));
            class0441922.L(class020452.u(), class073212.B, class073212.Z);
            int n = 0;
            Iterator iterator = arrayList.iterator();
            while (iterator.hasNext()) {
                class04419 class044193 = (class04419)iterator.next();
                n += class044193.y();
            }
            while (!arrayList.isEmpty()) {
                class04419 class044194;
                int n2 = class0441922.y(n);
                int n3 = 0;
                class04419 class044195 = arrayList.iterator();
                while (class044195.hasNext() && (n2 -= (class044194 = (class04419)class044195.next()).y()) >= 0) {
                    ++n3;
                }
                class044195 = (class04419)arrayList.get(n3);
                if (this.N(class044195, class053242, class010422, class040842, class012242, class020452.u(), class080502, class073212, class012962, class059462)) {
                    return;
                }
                arrayList.remove(n3);
                n -= class044195.y();
            }
        });
    }

    private boolean N(class04419 class044192, class05324 class053242, class01042 class010422, class04084 class040842, class01224 class012242, long l, class08050 class080502, class07321 class073212, class01296 class012962, class05946<class07299> class059462) {
        class04748 class047482 = (class04748)class044192.N().N();
        int n = class08088.N(class053242, class080502, class012962, class047482);
        Predicate<class03556> predicate = arg_0 -> ((class03543)class047482.y()).N(arg_0);
        class04932 class049322 = class047482.N(class044192.N(), class059462, class010422, this, this.y, class040842, class012242, l, class073212, n, (class05474)class080502, predicate);
        if (class049322.y()) {
            class053242.N(class012962, class047482, class049322, (class00529)class080502);
            return true;
        }
        return false;
    }

    private static int N(class05324 class053242, class08050 class080502, class01296 class012962, class04748 class047482) {
        class04932 class049322 = class053242.N(class012962, class047482, (class00529)class080502);
        return class049322 != null ? class049322.R() : 0;
    }

    public abstract int R();
}

