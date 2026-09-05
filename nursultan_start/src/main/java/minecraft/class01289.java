/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class09462
 *  Nursultan.class09464
 *  Nursultan.class10536
 *  com.google.common.collect.ImmutableList
 *  com.google.common.collect.ImmutableList$Builder
 *  com.google.common.collect.ImmutableSet
 *  com.google.common.collect.Maps
 *  com.google.common.collect.Sets
 *  com.google.common.collect.UnmodifiableIterator
 *  com.llamalad7.mixinextras.injector.wrapoperation.Operation
 *  com.llamalad7.mixinextras.injector.wrapoperation.WrapOperationRuntime
 *  com.mojang.datafixers.util.Pair
 *  com.mojang.logging.LogUtils
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.DataResult
 *  com.mojang.serialization.DynamicOps
 *  it.unimi.dsi.fastutil.objects.Object2ObjectOpenHashMap
 *  it.unimi.dsi.fastutil.objects.ObjectArrayList
 *  it.unimi.dsi.fastutil.objects.Reference2ObjectOpenHashMap
 *  it.unimi.dsi.fastutil.objects.Reference2ReferenceLinkedOpenHashMap
 *  minecraft.class00607
 *  minecraft.class00616
 *  minecraft.class01491
 *  minecraft.class04142
 *  minecraft.class04782
 *  minecraft.class05340
 *  minecraft.class05355
 *  minecraft.class05359
 *  minecraft.class05367
 *  minecraft.class05378
 *  minecraft.class05748
 *  minecraft.class05781
 *  minecraft.class06889
 *  minecraft.class07438
 *  net.caffeinemc.mods.lithium.common.ai.MemoryModificationCounter
 *  net.caffeinemc.mods.lithium.common.util.collections.MaskedList
 *  net.caffeinemc.mods.lithium.mixin.ai.useless_sensors.BrainAccessor
 *  org.apache.commons.lang3.mutable.MutableObject
 *  org.jspecify.annotations.Nullable
 *  org.slf4j.Logger
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfo
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable
 */
package minecraft;

import Nursultan.class09462;
import Nursultan.class09464;
import Nursultan.class10536;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Maps;
import com.google.common.collect.Sets;
import com.google.common.collect.UnmodifiableIterator;
import com.llamalad7.mixinextras.injector.wrapoperation.Operation;
import com.llamalad7.mixinextras.injector.wrapoperation.WrapOperationRuntime;
import com.mojang.datafixers.util.Pair;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.DynamicOps;
import it.unimi.dsi.fastutil.objects.Object2ObjectOpenHashMap;
import it.unimi.dsi.fastutil.objects.ObjectArrayList;
import it.unimi.dsi.fastutil.objects.Reference2ObjectOpenHashMap;
import it.unimi.dsi.fastutil.objects.Reference2ReferenceLinkedOpenHashMap;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.function.Supplier;
import java.util.stream.Stream;
import minecraft.class00607;
import minecraft.class00616;
import minecraft.class01491;
import minecraft.class04142;
import minecraft.class04782;
import minecraft.class05340;
import minecraft.class05355;
import minecraft.class05359;
import minecraft.class05367;
import minecraft.class05378;
import minecraft.class05748;
import minecraft.class05781;
import minecraft.class06889;
import minecraft.class07438;
import net.caffeinemc.mods.lithium.common.ai.MemoryModificationCounter;
import net.caffeinemc.mods.lithium.common.util.collections.MaskedList;
import net.caffeinemc.mods.lithium.mixin.ai.useless_sensors.BrainAccessor;
import org.apache.commons.lang3.mutable.MutableObject;
import org.jspecify.annotations.Nullable;
import org.slf4j.Logger;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

public class class01289<E extends class07438>
implements MemoryModificationCounter,
BrainAccessor {
    public static final Logger N = LogUtils.getLogger();
    private final Supplier<Codec<class01289<E>>> y;
    private static final int L = 20;
    private Map<class05378<?>, Optional<? extends class01491<?>>> u = Maps.newHashMap();
    private Map<class05340<? extends class05355<? super E>>, class05355<? super E>> i = Maps.newLinkedHashMap();
    private final Map<Integer, Map<class05359, Set<class04142<? super E>>>> R = Maps.newTreeMap();
    private @Nullable class00607<class05359> M;
    private Map<class05359, Set<Pair<class05378<?>, class05367>>> B = Maps.newHashMap();
    private final Map<class05359, Set<class05378<?>>> Z = Maps.newHashMap();
    private Set<class05359> z = Sets.newHashSet();
    private final Set<class05359> U = Sets.newHashSet();
    private class05359 E = class05359.y;
    private long W = -9999L;
    private ArrayList m;
    private MaskedList P;
    private long s = 1L;

    private void L(class04782 class047822, E e) {
        Iterator<class05355<E>> iterator = this.i.values().iterator();
        while (iterator.hasNext()) {
            iterator.next().y(class047822, e);
        }
    }

    @Deprecated
    public Map<class05378<?>, Optional<? extends class01491<?>>> L() {
        return this.u;
    }

    public boolean L(class05359 class053592) {
        return this.U.contains(class053592);
    }

    public <U> Optional<U> L(class05378<U> class053782) {
        Optional<class01491<?>> var2 = this.u.get(class053782);
        if (var2 == null) {
            throw new IllegalStateException("Unregistered memory fetched: " + String.valueOf(class053782));
        }
        return var2.map(class01491::L);
    }

    public void M() {
        this.R.clear();
        this.N((CallbackInfo)null);
    }

    private ArrayList P() {
        if (this.m == null) {
            this.m();
        }
        return this.m;
    }

    private void T() {
        MaskedList maskedList = new MaskedList(new ObjectArrayList(), false);
        Iterator<Map<class05359, Set<class04142<E>>>> iterator = this.R.values().iterator();
        while (iterator.hasNext()) {
            Iterator<Set<class04142<E>>> iterator2 = iterator.next().values().iterator();
            while (iterator2.hasNext()) {
                for (class04142<? super E> class041422 : iterator2.next()) {
                    maskedList.addOrSet(class041422, class041422.method_18921() == class05748.field_18338);
                }
            }
        }
        this.P = maskedList;
    }

    public class01289(Collection<? extends class05378<?>> collection, Collection<? extends class05340<? extends class05355<? super E>>> collection2, ImmutableList<class10536<?>> immutableList, Supplier<Codec<class01289<E>>> supplier) {
        this.y = supplier;
        for (class05378<?> class053782 : collection) {
            this.u.put(class053782, Optional.empty());
        }
        for (class05340 class053402 : collection2) {
            this.i.put(class053402, class053402.N());
        }
        for (class05355 class053552 : this.i.values()) {
            for (class05378 var8 : class053552.N()) {
                this.u.put(var8, Optional.empty());
            }
        }
        for (class10536 class105362 : immutableList) {
            class105362.N(this);
        }
        this.N(collection, collection2, immutableList, supplier, null);
        this.y(collection, collection2, immutableList, supplier, null);
    }

    public class01289<E> B() {
        class01289<E> class012892 = new class01289<E>(this.u.keySet(), this.i.keySet(), ImmutableList.of(), this.y);
        for (Map.Entry<class05378<?>, Optional<class01491<?>>> entry : this.u.entrySet()) {
            class05378<?> var4 = entry.getKey();
            if (!entry.getValue().isPresent()) continue;
            class012892.u.put(var4, entry.getValue());
        }
        class01289<E> class012893 = class012892;
        this.N(new CallbackInfoReturnable("", false, class012893));
        return class012893;
    }

    public boolean Z() {
        return this.u.isEmpty() && this.i.isEmpty() && this.R.isEmpty();
    }

    public <U> long i(class05378<U> class053782) {
        return this.u.get(class053782).map(class01491::y).orElse(0L);
    }

    private void i(class05359 class053592) {
        for (class05359 class053593 : this.U) {
            Set<class05378<?>> var4;
            if (class053593 == class053592 || (var4 = this.Z.get(class053593)) == null) continue;
            for (class05378<?> var6 : var4) {
                this.y(var6);
            }
        }
    }

    public void i() {
        this.u(this.E);
    }

    private void i(class04782 class047822, class07438 class074382) {
        long l = class047822.N();
        for (class04142 class041422 : this.P()) {
            if (class041422.method_18921() != class05748.field_18337) continue;
            class041422.method_18922(class047822, class074382, l);
            class041422 = this.N(class041422);
        }
    }

    private MaskedList z() {
        if (this.P == null) {
            this.T();
        }
        return this.P;
    }

    private void m() {
        this.m = new ArrayList();
        Iterator<Map<class05359, Set<class04142<E>>>> iterator = this.R.values().iterator();
        while (iterator.hasNext()) {
            for (Map.Entry<class05359, Set<class04142<E>>> entry : iterator.next().entrySet()) {
                class05359 class053592 = entry.getKey();
                if (!this.U.contains(class053592)) continue;
                for (class04142<? super E> class041422 : entry.getValue()) {
                    this.m.add(class041422);
                }
            }
        }
    }

    private void U() {
        Map<class05378<?>, Optional<? extends class01491<?>>> var4 = this.u;
        Set set = this.N(var4);
        Iterator iterator = this.y(set);
        while (iterator.hasNext()) {
            Map.Entry entry = (Map.Entry)iterator.next();
            if (!((Optional)entry.getValue()).isPresent()) continue;
            class01491 class014912 = (class01491)((Optional)entry.getValue()).get();
            if (class014912.u()) {
                this.y((class05378)entry.getKey());
            }
            class014912.N();
        }
    }

    private void u(class04782 class047822, E e) {
        long l = class047822.N();
        Iterator iterator = this.z().iterator();
        while (iterator.hasNext()) {
            class04142 class041422 = (class04142)iterator.next();
            class041422.method_18923(class047822, e, l);
            this.y(class047822, (class07438)e, null, l, iterator, class041422);
        }
    }

    private void u(class05359 class053592) {
        if (this.L(class053592)) {
            return;
        }
        this.i(class053592);
        this.U.clear();
        this.U.addAll(this.z);
        this.U.add(class053592);
        this.N(class053592, (CallbackInfo)null);
    }

    public <U> @Nullable Optional<U> u(class05378<U> class053782) {
        Optional<class01491<?>> var2 = this.u.get(class053782);
        if (var2 == null) {
            return null;
        }
        return var2.map(class01491::L);
    }

    @Deprecated
    public Set<class05359> u() {
        return this.U;
    }

    public <U> boolean y(class05378<U> class053782, U u) {
        if (!this.N(class053782)) {
            return false;
        }
        return this.L(class053782).filter(object2 -> object2.equals(u)).isPresent();
    }

    private void y(Collection collection, Collection collection2, ImmutableList immutableList, Supplier supplier, CallbackInfo callbackInfo) {
        this.u = new Reference2ObjectOpenHashMap(this.u);
        this.i = new Reference2ReferenceLinkedOpenHashMap(this.i);
        this.B = new Object2ObjectOpenHashMap(this.B);
    }

    private Iterator y(Set set) {
        Map<class05378<?>, Optional<? extends class01491<?>>> var3 = this.u;
        if (var3 instanceof Reference2ObjectOpenHashMap) {
            return ((Reference2ObjectOpenHashMap)var3).reference2ObjectEntrySet().fastIterator();
        }
        return this.u.entrySet().iterator();
    }

    public static <E extends class07438> Codec<class01289<E>> y(Collection<? extends class05378<?>> collection, Collection<? extends class05340<? extends class05355<? super E>>> collection2) {
        MutableObject mutableObject = new MutableObject();
        mutableObject.setValue((Object)new class09462(collection, collection2, mutableObject).fieldOf("memories").codec());
        return (Codec)mutableObject.get();
    }

    public <U> void y(class05378<U> class053782, Optional<? extends class01491<?>> optional) {
        if (this.u.containsKey(class053782)) {
            if (optional.isPresent() && this.N(optional.get().L())) {
                this.y(class053782);
            } else {
                Optional<class01491<?>> optional2 = optional;
                class05378<U> class053783 = class053782;
                Map<class05378<?>, Optional<? extends class01491<?>>> var3 = this.u;
                this.N(var3, class053783, optional2);
            }
        }
    }

    private void y(class04782 class047822, class07438 class074382, CallbackInfo callbackInfo, long l, Iterator iterator, class04142 class041422) {
        if (this.P != null && class041422.method_18921() != class05748.field_18338) {
            this.P.setVisible((Object)class041422, false);
        }
    }

    public <U> void y(class05378<U> class053782) {
        this.N(class053782, (U)Optional.empty());
    }

    public void y() {
        this.u.keySet().forEach(class053782 -> this.u.put((class05378<?>)class053782, Optional.empty()));
    }

    public void y(class04782 class047822, E e) {
        long l = e.method_73183().N();
        Iterator iterator = this.z().iterator();
        while (iterator.hasNext()) {
            class04142 class041422 = (class04142)iterator.next();
            this.N(class047822, (class07438)e, null, l, iterator, class041422);
            class041422.method_18925(class047822, e, l);
        }
    }

    public void y(class05359 class053592) {
        this.E = class053592;
    }

    private void E() {
        this.P = null;
        this.W();
    }

    private void N(class04782 class047822, class07438 class074382, CallbackInfo callbackInfo, long l, Iterator iterator, class04142 class041422) {
        if (this.P != null) {
            this.P.setVisible((Object)class041422, false);
        }
    }

    private class04142 N(class04142 class041422) {
        if (this.P != null && class041422.method_18921() == class05748.field_18338) {
            this.P.setVisible((Object)class041422, true);
        }
        return class041422;
    }

    private Object N(Map map, Object object, Object object2) {
        Object object3 = map.put(object, object2);
        if (object3 == null || ((Optional)object3).isPresent() != ((Optional)object2).isPresent()) {
            ++this.s;
        }
        return object3;
    }

    private void N(CallbackInfoReturnable callbackInfoReturnable) {
        ((class01289)callbackInfoReturnable.getReturnValue()).s = this.s + 1L;
    }

    private UnmodifiableIterator N(ImmutableList immutableList, Operation operation) {
        Iterator iterator = (Iterator)operation.call(new Object[]{immutableList});
        return new class09464(this, iterator);
    }

    private Set N(Map map) {
        return null;
    }

    private void N(Collection collection, Collection collection2, ImmutableList immutableList, Supplier supplier, CallbackInfo callbackInfo) {
        this.E();
    }

    private void N(class05359 class053592, ImmutableList immutableList, Set set, Set set2, CallbackInfo callbackInfo) {
        this.E();
    }

    private void N(CallbackInfo callbackInfo) {
        this.E();
    }

    private void N(class05359 class053592, CallbackInfo callbackInfo) {
        this.W();
    }

    public void N(Set<class05359> set) {
        this.z = set;
    }

    public void N(class00607<class05359> class006072) {
        this.M = class006072;
    }

    public boolean N_22(class05378<?> class053782, class05367 class053672) {
        Optional<class01491<?>> var3 = this.u.get(class053782);
        if (var3 == null) {
            return false;
        }
        return class053672 == class05367.field_18458 || class053672 == class05367.field_18456 && var3.isPresent() || class053672 == class05367.field_18457 && var3.isEmpty();
    }

    public <U> void N(class05378<U> class053782, Optional<? extends U> optional) {
        this.y(class053782, optional.map(class01491::N));
    }

    public void N(class05359 class053592) {
        if (this.R(class053592)) {
            this.u(class053592);
        } else {
            this.i();
        }
    }

    public void N(class00616 class006162, long l, class06889 class068892) {
        if (l - this.W > 20L) {
            class05359 class053592;
            this.W = l;
            class05359 class053593 = class053592 = this.M != null ? (class05359)class006162.N(this.M, class068892) : class05359.y;
            if (!this.U.contains(class053592)) {
                this.N(class053592);
            }
        }
    }

    public void N(List<class05359> list) {
        for (class05359 class053592 : list) {
            if (!this.R(class053592)) continue;
            this.u(class053592);
            break;
        }
    }

    public static <E extends class07438> class05781<E> N(Collection<? extends class05378<?>> collection, Collection<? extends class05340<? extends class05355<? super E>>> collection2) {
        return new class05781(collection, collection2);
    }

    public <T> DataResult<T> N(DynamicOps<T> dynamicOps) {
        return this.y.get().encodeStart(dynamicOps, (Object)this);
    }

    public Stream<class10536<?>> N() {
        return this.u.entrySet().stream().map(entry -> class10536.N((class05378)((class05378)entry.getKey()), (Optional)((Optional)entry.getValue())));
    }

    public boolean N(class05378<?> class053782) {
        return this.N_22(class053782, class05367.field_18456);
    }

    public <U> void N(class05378<U> class053782, @Nullable U u) {
        this.N(class053782, (U)Optional.ofNullable(u));
    }

    public <U> void N(class05378<U> class053782, U u, long l) {
        this.y(class053782, Optional.of(class01491.N(u, (long)l)));
    }

    public void N(class05359 class053592, ImmutableList<? extends Pair<Integer, ? extends class04142<? super E>>> immutableList, Set<Pair<class05378<?>, class05367>> set) {
        this.N(class053592, immutableList, set, Sets.newHashSet());
    }

    public void N(class05359 class053593, ImmutableList<? extends Pair<Integer, ? extends class04142<? super E>>> immutableList, Set<Pair<class05378<?>, class05367>> set, Set<class05378<?>> set2) {
        this.B.put(class053593, set);
        if (!set2.isEmpty()) {
            this.Z.put(class053593, set2);
        }
        ImmutableList<? extends Pair<Integer, ? extends class04142<? super E>>> immutableList2 = immutableList;
        UnmodifiableIterator unmodifiableIterator = this.N(immutableList2, objectArray -> {
            WrapOperationRuntime.checkArgumentCount((Object[])objectArray, (int)1, (String)"[com.google.common.collect.ImmutableList]");
            return ((ImmutableList)objectArray[0]).iterator();
        });
        while (unmodifiableIterator.hasNext()) {
            Pair pair = (Pair)unmodifiableIterator.next();
            this.R.computeIfAbsent((Integer)pair.getFirst(), n -> Maps.newHashMap()).computeIfAbsent(class053593, class053592 -> Sets.newLinkedHashSet()).add((class04142)pair.getSecond());
        }
        this.N(class053593, immutableList, set, set2, null);
    }

    ImmutableList<? extends Pair<Integer, ? extends class04142<? super E>>> N(int n, ImmutableList<? extends class04142<? super E>> immutableList) {
        int n2 = n;
        ImmutableList.Builder builder = ImmutableList.builder();
        for (class04142 class041422 : immutableList) {
            builder.add((Object)Pair.of((Object)n2++, (Object)class041422));
        }
        return builder.build();
    }

    public void N(class04782 class047822, E e) {
        this.U();
        this.L(class047822, e);
        this.i(class047822, (class07438)e);
        this.u(class047822, e);
    }

    private boolean N(Object object) {
        return object instanceof Collection && ((Collection)object).isEmpty();
    }

    public void N(class05359 class053592, int n, ImmutableList<? extends class04142<? super E>> immutableList, class05378<?> class053782) {
        ImmutableSet immutableSet = ImmutableSet.of((Object)Pair.of(class053782, (Object)class05367.field_18456));
        ImmutableSet immutableSet2 = ImmutableSet.of(class053782);
        this.N(class053592, (ImmutableList<? extends Pair<Integer, ? extends class04142<? super E>>>)this.N(n, immutableList), (Set<Pair<class05378<?>, class05367>>)immutableSet, (Set<class05378<?>>)immutableSet2);
    }

    public void N(class05359 class053592, int n, ImmutableList<? extends class04142<? super E>> immutableList) {
        this.N(class053592, this.N(n, immutableList));
    }

    public void N(class05359 class053592, int n, ImmutableList<? extends class04142<? super E>> immutableList, Set<Pair<class05378<?>, class05367>> set) {
        this.N(class053592, this.N(n, immutableList), set);
    }

    public void N(class05359 class053592, ImmutableList<? extends Pair<Integer, ? extends class04142<? super E>>> immutableList) {
        this.N(class053592, immutableList, (Set<Pair<class05378<?>, class05367>>)ImmutableSet.of(), Sets.newHashSet());
    }

    private void W() {
        this.m = null;
    }

    private boolean R(class05359 class053592) {
        if (!this.B.containsKey(class053592)) {
            return false;
        }
        for (Pair<class05378<?>, class05367> var3 : this.B.get(class053592)) {
            class05367 class053672;
            class05378 var4 = (class05378)var3.getFirst();
            if (this.N_22(var4, class053672 = (class05367)var3.getSecond())) continue;
            return false;
        }
        return true;
    }

    public Optional<class05359> R() {
        for (class05359 class053592 : this.U) {
            if (this.z.contains(class053592)) continue;
            return Optional.of(class053592);
        }
        return Optional.empty();
    }

    public long lithium$getModCount() {
        return this.s;
    }

    public /* synthetic */ Map getSensors() {
        return this.i;
    }
}

