/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class09821
 *  com.google.common.collect.Sets
 *  com.mojang.serialization.Codec
 *  it.unimi.dsi.fastutil.objects.Reference2ObjectArrayMap
 *  it.unimi.dsi.fastutil.objects.Reference2ObjectMap
 *  it.unimi.dsi.fastutil.objects.Reference2ObjectMaps
 *  minecraft.class02362
 *  minecraft.class02473
 *  minecraft.class02477
 *  minecraft.class02508
 *  minecraft.class04247
 *  minecraft.class06244
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import Nursultan.class09821;
import com.google.common.collect.Sets;
import com.mojang.serialization.Codec;
import it.unimi.dsi.fastutil.objects.Reference2ObjectArrayMap;
import it.unimi.dsi.fastutil.objects.Reference2ObjectMap;
import it.unimi.dsi.fastutil.objects.Reference2ObjectMaps;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.function.Predicate;
import minecraft.class02362;
import minecraft.class02473;
import minecraft.class02477;
import minecraft.class02508;
import minecraft.class02676;
import minecraft.class02690;
import minecraft.class02695;
import minecraft.class02704;
import minecraft.class02713;
import minecraft.class02718;
import minecraft.class04247;
import minecraft.class06244;
import org.jspecify.annotations.Nullable;

public final class class02678 {
    public static final class02678 N = new class02678(Reference2ObjectMaps.emptyMap());
    public static final Codec<class02678> y = Codec.dispatchedMap((Codec)class02473.N, class02473::N).xmap(map -> {
        if (map.isEmpty()) {
            return N;
        }
        Reference2ObjectArrayMap reference2ObjectArrayMap = new Reference2ObjectArrayMap(map.size());
        for (Map.Entry entry : map.entrySet()) {
            class02473 class024732 = (class02473)entry.getKey();
            if (class024732.L()) {
                reference2ObjectArrayMap.put((Object)class024732.y(), Optional.empty());
                continue;
            }
            reference2ObjectArrayMap.put((Object)class024732.y(), Optional.of(entry.getValue()));
        }
        return new class02678((Reference2ObjectMap<class02477<?>, Optional<?>>)reference2ObjectArrayMap);
    }, class026782 -> {
        Reference2ObjectArrayMap reference2ObjectArrayMap = new Reference2ObjectArrayMap(class026782.i.size());
        for (Map.Entry entry : Reference2ObjectMaps.fastIterable(class026782.i)) {
            class02477 var4 = (class02477)entry.getKey();
            if (var4.u()) continue;
            Optional var5 = (Optional)entry.getValue();
            if (var5.isPresent()) {
                reference2ObjectArrayMap.put((Object)new class02473(var4, false), var5.get());
                continue;
            }
            reference2ObjectArrayMap.put((Object)new class02473(var4, true), (Object)class06244.field_17274);
        }
        return reference2ObjectArrayMap;
    });
    public static final class02362<class04247, class02678> L = class02678.N(new class02690());
    public static final class02362<class04247, class02678> u = class02678.N(new class02718());
    private static final String R = "!";
    public final Reference2ObjectMap<class02477<?>, Optional<?>> i;

    public int L() {
        return this.i.size();
    }

    public class02678(Reference2ObjectMap<class02477<?>, Optional<?>> reference2ObjectMap) {
        this.i = reference2ObjectMap;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (!(object instanceof class02678)) return false;
        class02678 class026782 = (class02678)object;
        if (!this.i.equals(class026782.i)) return false;
        return true;
    }

    public String toString() {
        return class02678.N(this.i);
    }

    public int hashCode() {
        return this.i.hashCode();
    }

    public class02508 i() {
        if (this.u()) {
            return class02508.N;
        }
        class02676 class026762 = class02695.N();
        Set set = Sets.newIdentityHashSet();
        this.i.forEach((class024772, optional) -> {
            if (optional.isPresent()) {
                class026762.y(class024772, optional.get());
            } else {
                set.add(class024772);
            }
        });
        return new class02508(class026762.N(), set);
    }

    public boolean u() {
        return this.i.isEmpty();
    }

    public Set<Map.Entry<class02477<?>, Optional<?>>> y() {
        return this.i.entrySet();
    }

    private static class02362<class04247, class02678> N(class02704 class027042) {
        return new class09821(class027042);
    }

    public class02678 N(Predicate<class02477<?>> predicate) {
        if (this.u()) {
            return N;
        }
        Reference2ObjectArrayMap reference2ObjectArrayMap = new Reference2ObjectArrayMap(this.i);
        reference2ObjectArrayMap.keySet().removeIf(predicate);
        if (reference2ObjectArrayMap.isEmpty()) {
            return N;
        }
        return new class02678((Reference2ObjectMap<class02477<?>, Optional<?>>)reference2ObjectArrayMap);
    }

    public <T> @Nullable Optional<? extends T> N(class02477<? extends T> class024772) {
        return (Optional)this.i.get(class024772);
    }

    public static class02713 N() {
        return new class02713();
    }

    static String N(Reference2ObjectMap<class02477<?>, Optional<?>> reference2ObjectMap) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append('{');
        boolean bl = true;
        for (Map.Entry entry : Reference2ObjectMaps.fastIterable(reference2ObjectMap)) {
            if (bl) {
                bl = false;
            } else {
                stringBuilder.append(", ");
            }
            Optional optional = (Optional)entry.getValue();
            if (optional.isPresent()) {
                stringBuilder.append(entry.getKey());
                stringBuilder.append("=>");
                stringBuilder.append(optional.get());
                continue;
            }
            stringBuilder.append(R);
            stringBuilder.append(entry.getKey());
        }
        stringBuilder.append('}');
        return stringBuilder.toString();
    }
}

