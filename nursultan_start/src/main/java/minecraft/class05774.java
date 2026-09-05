/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Maps
 *  com.google.common.collect.Sets
 *  com.mojang.serialization.Codec
 *  it.unimi.dsi.fastutil.objects.Object2IntMap
 *  minecraft.class05346
 *  minecraft.class05348
 *  minecraft.class05382
 *  minecraft.class06069
 */
package minecraft;

import com.google.common.collect.Maps;
import com.google.common.collect.Sets;
import com.mojang.serialization.Codec;
import it.unimi.dsi.fastutil.objects.Object2IntMap;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import java.util.function.DoublePredicate;
import java.util.function.Predicate;
import java.util.stream.Stream;
import minecraft.class05346;
import minecraft.class05348;
import minecraft.class05382;
import minecraft.class06069;

public class class05774 {
    public static final Codec<class05774> N = class05382.u.listOf().xmap(class05774::new, class057742 -> class057742.i().toList());
    public static final int y = 2;
    private final Map<UUID, class05348> L = new HashMap<UUID, class05348>();

    public void L() {
        this.L.clear();
    }

    public class05774() {
    }

    private class05774(List<class05382> list) {
        list.forEach(class053822 -> this.N((UUID)class053822.y()).N.put((Object)class053822.L(), class053822.u()));
    }

    private Stream<class05382> i() {
        return this.L.entrySet().stream().flatMap(entry -> ((class05348)entry.getValue()).N((UUID)entry.getKey()));
    }

    public class05774 u() {
        class05774 class057742 = new class05774();
        class057742.N(this);
        return class057742;
    }

    public void y(UUID uUID, class05346 class053462, int n) {
        this.N(uUID, class053462, -n);
    }

    public void y() {
        Iterator<class05348> var1 = this.L.values().iterator();
        while (var1.hasNext()) {
            class05348 class053482 = var1.next();
            class053482.N();
            if (!class053482.y()) continue;
            var1.remove();
        }
    }

    public Map<UUID, Object2IntMap<class05346>> N() {
        HashMap hashMap = Maps.newHashMap();
        this.L.keySet().forEach(uUID -> {
            class05348 class053482 = this.L.get(uUID);
            hashMap.put(uUID, class053482.N);
        });
        return hashMap;
    }

    public void N(UUID uUID, class05346 class053462, int n3) {
        class05348 class053482 = this.N(uUID);
        class053482.N.mergeInt((Object)class053462, n3, (n, n2) -> this.N(class053462, n, n2));
        class053482.N(class053462);
        if (class053482.y()) {
            this.L.remove(uUID);
        }
    }

    public long N(class05346 class053462, DoublePredicate doublePredicate) {
        return this.L.values().stream().filter(class053482 -> doublePredicate.test(class053482.N.getOrDefault((Object)class053462, 0) * class053462.field_18431)).count();
    }

    public int N(UUID uUID, Predicate<class05346> predicate) {
        class05348 class053482 = this.L.get(uUID);
        return class053482 != null ? class053482.N(predicate) : 0;
    }

    public void N(class05774 class057742, class06069 class060692, int n) {
        class057742.N(class060692, n).forEach(class053822 -> {
            int n = class053822.u() - class053822.L().field_18434;
            if (n >= 2) {
                this.N((UUID)class053822.y()).N.mergeInt((Object)class053822.L(), n, class05774::N);
            }
        });
    }

    private class05348 N(UUID uUID2) {
        return this.L.computeIfAbsent(uUID2, uUID -> new class05348());
    }

    private Collection<class05382> N(class06069 class060692, int n) {
        List var3 = this.i().toList();
        if (var3.isEmpty()) {
            return Collections.emptyList();
        }
        int[] nArray = new int[var3.size()];
        int n2 = 0;
        for (int i = 0; i < var3.size(); ++i) {
            class05382 class053822 = (class05382)var3.get(i);
            nArray[i] = (n2 += Math.abs(class053822.N())) - 1;
        }
        Set set = Sets.newIdentityHashSet();
        for (int i = 0; i < n; ++i) {
            int n3 = class060692.y(n2);
            int n4 = Arrays.binarySearch(nArray, n3);
            set.add((class05382)var3.get(n4 < 0 ? -n4 - 1 : n4));
        }
        return set;
    }

    private int N(class05346 class053462, int n, int n2) {
        int n3 = n + n2;
        return n3 > class053462.field_18432 ? Math.max(class053462.field_18432, n) : n3;
    }

    private static int N(int n, int n2) {
        return Math.max(n, n2);
    }

    public void N(class05774 class057742) {
        class057742.L.forEach((uUID, class053482) -> this.N((UUID)uUID).N.putAll((Map)class053482.N));
    }

    public void N(class05346 class053462) {
        Iterator<class05348> var2 = this.L.values().iterator();
        while (var2.hasNext()) {
            class05348 class053482 = var2.next();
            class053482.y(class053462);
            if (!class053482.y()) continue;
            var2.remove();
        }
    }

    public void N(UUID uUID, class05346 class053462) {
        class05348 class053482 = this.L.get(uUID);
        if (class053482 != null) {
            class053482.y(class053462);
            if (class053482.y()) {
                this.L.remove(uUID);
            }
        }
    }
}

