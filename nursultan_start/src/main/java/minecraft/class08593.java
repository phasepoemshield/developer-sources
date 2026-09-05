/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class11332
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.datafixers.util.Pair
 *  com.mojang.logging.LogUtils
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.MapCodec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  it.unimi.dsi.fastutil.longs.Long2ObjectMap$Entry
 *  it.unimi.dsi.fastutil.longs.Long2ObjectMaps
 *  it.unimi.dsi.fastutil.longs.Long2ObjectOpenHashMap
 *  it.unimi.dsi.fastutil.longs.LongOpenHashSet
 *  it.unimi.dsi.fastutil.longs.LongSet
 *  it.unimi.dsi.fastutil.objects.ObjectArrayList
 *  it.unimi.dsi.fastutil.objects.ObjectIterator
 *  minecraft.class01596
 *  minecraft.class01624
 *  minecraft.class03469
 *  minecraft.class04745
 *  minecraft.class04763
 *  minecraft.class05715
 *  minecraft.class06265
 *  minecraft.class06555
 *  minecraft.class07321
 *  minecraft.class07529
 *  minecraft.class08413
 *  org.jspecify.annotations.Nullable
 *  org.slf4j.Logger
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfo
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable
 */
package minecraft;

import Nursultan.class11332;
import com.mojang.datafixers.kinds.App;
import com.mojang.datafixers.util.Pair;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import it.unimi.dsi.fastutil.longs.Long2ObjectMap;
import it.unimi.dsi.fastutil.longs.Long2ObjectMaps;
import it.unimi.dsi.fastutil.longs.Long2ObjectOpenHashMap;
import it.unimi.dsi.fastutil.longs.LongOpenHashSet;
import it.unimi.dsi.fastutil.longs.LongSet;
import it.unimi.dsi.fastutil.objects.ObjectArrayList;
import it.unimi.dsi.fastutil.objects.ObjectIterator;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Predicate;
import minecraft.class01596;
import minecraft.class01624;
import minecraft.class03469;
import minecraft.class04745;
import minecraft.class04763;
import minecraft.class05715;
import minecraft.class06265;
import minecraft.class06555;
import minecraft.class07321;
import minecraft.class07529;
import minecraft.class08413;
import minecraft.class08617;
import org.jspecify.annotations.Nullable;
import org.slf4j.Logger;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

public class class08593
extends class06555 {
    private static final int L = 4;
    private static final Logger u = LogUtils.getLogger();
    private static final Codec<Pair<class07321, class01596>> i = Codec.mapPair((MapCodec)class07321.N.fieldOf("chunk_pos"), (MapCodec)class01596.N).codec();
    public static final Codec<class08593> N = RecordCodecBuilder.create(instance -> instance.group((App)i.listOf().optionalFieldOf("tickets", List.of()).forGetter(class08593::R)).apply(instance, class08593::N));
    public static final class08413<class08593> y = new class08413("chunks", class08593::new, N, class05715.field_45078);
    private final Long2ObjectOpenHashMap<List<class01596>> R;
    private final Long2ObjectOpenHashMap<List<class01596>> M;
    private LongSet B;
    private @Nullable class08617 Z;
    private @Nullable class08617 z;
    private final Long2ObjectOpenHashMap U = new Long2ObjectOpenHashMap();

    public boolean L() {
        ObjectIterator var1 = this.R.values().iterator();
        while (var1.hasNext()) {
            Iterator var3 = ((List)var1.next()).iterator();
            while (var3.hasNext()) {
                if (!((class01596)var3.next()).N().u()) continue;
                return true;
            }
        }
        return false;
    }

    private void M() {
        this.B = this.N((class01596 class015962) -> class015962.N().equals((Object)class01624.E));
    }

    private class08593(Long2ObjectOpenHashMap<List<class01596>> long2ObjectOpenHashMap, Long2ObjectOpenHashMap<List<class01596>> long2ObjectOpenHashMap2) {
        this.B = new LongOpenHashSet();
        this.R = long2ObjectOpenHashMap;
        this.M = long2ObjectOpenHashMap2;
        this.M();
    }

    public class08593() {
        this((Long2ObjectOpenHashMap<List<class01596>>)new Long2ObjectOpenHashMap(4), (Long2ObjectOpenHashMap<List<class01596>>)new Long2ObjectOpenHashMap());
    }

    public LongSet i() {
        return this.B;
    }

    public void u() {
        this.N((class015962, l) -> class015962.N() != class01624.P, this.M);
    }

    public void y(class01596 class015962, class07321 class073212) {
        this.y(class073212.y(), class015962);
    }

    public boolean y(long l, class01596 class015962) {
        List var4 = (List)this.R.get(l);
        if (var4 == null) {
            return false;
        }
        boolean bl = false;
        Iterator var6 = var4.iterator();
        while (var6.hasNext()) {
            class01596 class015963 = (class01596)var6.next();
            if (!class08593.N(class015962, class015963)) continue;
            var6.remove();
            if (class07529.H) {
                u.debug("RTI {} {}", (Object)new class07321(l), (Object)class015963);
            }
            bl = true;
            break;
        }
        if (!bl) {
            return false;
        }
        this.y(l, class015962, null, var4);
        if (var4.isEmpty()) {
            this.R.remove(l);
        }
        if (class015962.N().L() && this.z != null) {
            this.z.update(l, class08593.N(var4, true), false);
        }
        if (class015962.N().y() && this.Z != null) {
            this.Z.update(l, class08593.N(var4, false), false);
        }
        if (class015962.N().equals((Object)class01624.E)) {
            this.M();
        }
        this.method_80();
        return true;
    }

    public void y(class01624 class016242, class07321 class073212, int n) {
        class01596 class015962 = new class01596(class016242, class03469.N((class04763)class04763.field_44855) - n);
        this.y(class073212.y(), class015962);
    }

    private static @Nullable class01596 y(@Nullable List<class01596> list, boolean bl) {
        if (list == null) {
            return null;
        }
        class01596 class015962 = null;
        for (class01596 class015963 : list) {
            if (class015962 != null && class015963.y() >= class015962.y()) continue;
            if (bl && class015963.N().L()) {
                class015962 = class015963;
                continue;
            }
            if (bl || !class015963.N().y()) continue;
            class015962 = class015963;
        }
        return class015962;
    }

    private static boolean y(List list) {
        if (!list.isEmpty()) {
            Iterator iterator = list.iterator();
            while (iterator.hasNext()) {
                if (!((class01596)iterator.next()).N().R()) continue;
                return false;
            }
        }
        return true;
    }

    public String y(long l, boolean bl) {
        class01596 class015962 = class08593.y(this.N(l), bl);
        return class015962 == null ? "no_ticket" : class015962.toString();
    }

    private void y(long l, class01596 class015962, CallbackInfoReturnable callbackInfoReturnable, List list) {
        if (class015962.N().R() && class08593.y(list)) {
            this.U.remove(l);
        }
    }

    private List<class01596> y(long l2) {
        return (List)this.R.computeIfAbsent(l2, l -> new ObjectArrayList(4));
    }

    public boolean y() {
        return !this.R.isEmpty();
    }

    public void y(@Nullable class08617 class086172) {
        this.z = class086172;
    }

    public void N() {
        for (Long2ObjectMap.Entry entry : Long2ObjectMaps.fastIterable(this.M)) {
            for (class01596 class015962 : (List)entry.getValue()) {
                this.N(entry.getLongKey(), class015962);
            }
        }
        this.M.clear();
    }

    public void N(@Nullable class08617 class086172) {
        this.Z = class086172;
    }

    private static class08593 N(List<Pair<class07321, class01596>> list) {
        Long2ObjectOpenHashMap long2ObjectOpenHashMap = new Long2ObjectOpenHashMap();
        for (Pair<class07321, class01596> pair : list) {
            class07321 class073212 = (class07321)pair.getFirst();
            ((List)long2ObjectOpenHashMap.computeIfAbsent(class073212.y(), l -> new ObjectArrayList(4))).add((class01596)pair.getSecond());
        }
        return new class08593((Long2ObjectOpenHashMap<List<class01596>>)new Long2ObjectOpenHashMap(4), (Long2ObjectOpenHashMap<List<class01596>>)long2ObjectOpenHashMap);
    }

    private Long2ObjectOpenHashMap N(Long2ObjectOpenHashMap long2ObjectOpenHashMap, Long2ObjectOpenHashMap long2ObjectOpenHashMap2) {
        return long2ObjectOpenHashMap2 == null ? this.U : long2ObjectOpenHashMap;
    }

    private boolean N(boolean bl, Long2ObjectMap.Entry entry, Long2ObjectOpenHashMap long2ObjectOpenHashMap, ObjectIterator objectIterator) {
        if (!bl && class08593.y((List)entry.getValue())) {
            if (long2ObjectOpenHashMap == null) {
                objectIterator.remove();
            } else {
                this.U.remove(entry.getLongKey());
            }
        }
        return bl;
    }

    private void N(CallbackInfo callbackInfo, Long2ObjectMap.Entry entry, Long2ObjectOpenHashMap long2ObjectOpenHashMap) {
        if (long2ObjectOpenHashMap == null) {
            this.R.remove(entry.getLongKey());
        } else {
            this.U.remove(entry.getLongKey());
        }
    }

    private static void N(BiConsumer<class07321, class01596> biConsumer, Long2ObjectOpenHashMap<List<class01596>> long2ObjectOpenHashMap) {
        for (Long2ObjectMap.Entry entry : Long2ObjectMaps.fastIterable(long2ObjectOpenHashMap)) {
            class07321 class073212 = new class07321(entry.getLongKey());
            for (class01596 class015962 : (List)entry.getValue()) {
                biConsumer.accept(class073212, class015962);
            }
        }
    }

    private void N(BiConsumer<class07321, class01596> biConsumer) {
        class08593.N(biConsumer, this.R);
        class08593.N(biConsumer, this.M);
    }

    private void N(long l, class01596 class015962, CallbackInfoReturnable callbackInfoReturnable, List list) {
        if (class015962.N().R()) {
            this.U.put(l, (Object)list);
        }
    }

    public boolean N(long l, class01596 class015962) {
        List<class01596> var4 = this.y(l);
        for (class01596 class015963 : var4) {
            if (!class08593.N(class015962, class015963)) continue;
            class015963.L();
            this.method_80();
            return false;
        }
        int n = class08593.N(var4, true);
        int n2 = class08593.N(var4, false);
        this.N(l, class015962, null, var4);
        var4.add(class015962);
        if (class07529.H) {
            u.debug("ATI {} {}", (Object)new class07321(l), (Object)class015962);
        }
        if (class015962.N().L() && class015962.y() < n && this.z != null) {
            this.z.update(l, class015962.y(), true);
        }
        if (class015962.N().y() && class015962.y() < n2 && this.Z != null) {
            this.Z.update(l, class015962.y(), true);
        }
        if (class015962.N().equals((Object)class01624.E)) {
            this.B.add(l);
        }
        this.method_80();
        return true;
    }

    public void N(class01596 class015962, class07321 class073212) {
        this.N(class073212.y(), class015962);
    }

    public void N(class01624 class016242, class07321 class073212, int n) {
        class01596 class015962 = new class01596(class016242, class03469.N((class04763)class04763.field_44855) - n);
        this.N(class073212.y(), class015962);
    }

    public List<class01596> N(long l) {
        return (List)this.R.getOrDefault(l, List.of());
    }

    private static boolean N(class01596 class015962, class01596 class015963) {
        return class015963.N() == class015962.N() && class015963.y() == class015962.y();
    }

    private static int N(List<class01596> list, boolean bl) {
        class01596 class015962 = class08593.y(list, bl);
        return class015962 == null ? class03469.y + 1 : class015962.y();
    }

    public int N(long l, boolean bl) {
        return class08593.N(this.N(l), bl);
    }

    public void N(class11332 class113322, @Nullable Long2ObjectOpenHashMap<List<class01596>> long2ObjectOpenHashMap) {
        Long2ObjectOpenHashMap<List<class01596>> var13 = this.R;
        ObjectIterator objectIterator = this.N(var13, long2ObjectOpenHashMap).long2ObjectEntrySet().fastIterator();
        boolean bl = false;
        while (objectIterator.hasNext()) {
            Long2ObjectMap.Entry entry = (Long2ObjectMap.Entry)objectIterator.next();
            Iterator iterator = ((List)entry.getValue()).iterator();
            long l2 = entry.getLongKey();
            boolean bl2 = false;
            boolean bl3 = false;
            while (iterator.hasNext()) {
                class01596 class015962 = (class01596)iterator.next();
                if (!class113322.test(class015962, l2)) continue;
                if (long2ObjectOpenHashMap != null) {
                    ((List)long2ObjectOpenHashMap.computeIfAbsent(l2, l -> new ObjectArrayList(((List)entry.getValue()).size()))).add(class015962);
                }
                iterator.remove();
                if (class015962.N().y()) {
                    bl3 = true;
                }
                if (class015962.N().L()) {
                    bl2 = true;
                }
                if (!class015962.N().equals((Object)class01624.E)) continue;
                bl = true;
            }
            if (!bl3 && !bl2) continue;
            if (bl3 && this.Z != null) {
                this.Z.update(l2, class08593.N((List)entry.getValue(), false), false);
            }
            if (bl2 && this.z != null) {
                this.z.update(l2, class08593.N((List)entry.getValue(), true), false);
            }
            this.method_80();
            if (!this.N(((List)entry.getValue()).isEmpty(), entry, long2ObjectOpenHashMap, objectIterator)) continue;
            this.N(null, entry, long2ObjectOpenHashMap);
            objectIterator.remove();
        }
        if (bl) {
            this.M();
        }
    }

    public void N(int n, class01624 class016242) {
        ArrayList<Pair> arrayList = new ArrayList<Pair>();
        for (Long2ObjectMap.Entry entry : this.R.long2ObjectEntrySet()) {
            for (class01596 class015962 : (List)entry.getValue()) {
                if (class015962.N() != class016242) continue;
                arrayList.add(Pair.of((Object)class015962, (Object)entry.getLongKey()));
            }
        }
        for (Pair pair : arrayList) {
            class01596 class015962;
            Long l = (Long)pair.getSecond();
            class015962 = (class01596)pair.getFirst();
            this.y((long)l, class015962);
            class01624 class016243 = class015962.N();
            this.N((long)l, new class01596(class016243, n));
        }
    }

    public boolean N(class07321 class073212, boolean bl) {
        class01596 class015962 = new class01596(class01624.E, class06265.L);
        if (bl) {
            return this.N(class073212.y(), class015962);
        }
        return this.y(class073212.y(), class015962);
    }

    private LongSet N(Predicate<class01596> predicate) {
        LongOpenHashSet longOpenHashSet = new LongOpenHashSet();
        block0: for (Long2ObjectMap.Entry entry : Long2ObjectMaps.fastIterable(this.R)) {
            for (class01596 class015962 : (List)entry.getValue()) {
                if (!predicate.test(class015962)) continue;
                longOpenHashSet.add(entry.getLongKey());
                continue block0;
            }
        }
        return longOpenHashSet;
    }

    private boolean N(class06265 class062652, class01596 class015962, long l) {
        if (!class015962.N().R()) {
            return false;
        }
        if (class015962.N().i()) {
            return true;
        }
        class04745 class047452 = class062652.N(l);
        return class047452 == null || class047452.B();
    }

    public void N(class06265 class062652) {
        this.N((class015962, l) -> {
            if (this.N(class062652, class015962, l)) {
                class015962.u();
                return class015962.i();
            }
            return false;
        }, null);
        this.method_80();
    }

    private List<Pair<class07321, class01596>> R() {
        ArrayList<Pair<class07321, class01596>> arrayList = new ArrayList<Pair<class07321, class01596>>();
        this.N((class07321 class073212, class01596 class015962) -> {
            if (class015962.N().N()) {
                arrayList.add(new Pair(class073212, class015962));
            }
        });
        return arrayList;
    }
}

