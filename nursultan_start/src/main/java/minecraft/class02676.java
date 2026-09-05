/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class09825
 *  it.unimi.dsi.fastutil.objects.Reference2ObjectArrayMap
 *  it.unimi.dsi.fastutil.objects.Reference2ObjectMap
 *  it.unimi.dsi.fastutil.objects.Reference2ObjectOpenHashMap
 *  minecraft.class02477
 *  minecraft.class02480
 *  net.fabricmc.fabric.api.item.v1.FabricComponentMapBuilder
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import Nursultan.class09825;
import it.unimi.dsi.fastutil.objects.Reference2ObjectArrayMap;
import it.unimi.dsi.fastutil.objects.Reference2ObjectMap;
import it.unimi.dsi.fastutil.objects.Reference2ObjectOpenHashMap;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Supplier;
import minecraft.class02477;
import minecraft.class02480;
import minecraft.class02695;
import net.fabricmc.fabric.api.item.v1.FabricComponentMapBuilder;
import org.jspecify.annotations.Nullable;

public class class02676
implements FabricComponentMapBuilder {
    private final Reference2ObjectMap<class02477<?>, Object> N = new Reference2ObjectArrayMap();

    public Object getOrCreate(class02477 class024772, Supplier supplier) {
        if (!this.N.containsKey((Object)class024772)) {
            Object t = supplier.get();
            Objects.requireNonNull(t, "Cannot insert null values to component map builder");
            this.N(class024772, t);
        }
        return this.N.get((Object)class024772);
    }

    class02676() {
    }

    public boolean contains(class02477 class024772) {
        return this.N.containsKey((Object)class024772);
    }

    <T> void y(class02477<T> class024772, @Nullable Object object) {
        if (object != null) {
            this.N.put(class024772, object);
        } else {
            this.N.remove(class024772);
        }
    }

    public class02695 N() {
        return class02676.N(this.N);
    }

    public <T> class02676 N(class02477<T> class024772, @Nullable T t) {
        this.y(class024772, t);
        return this;
    }

    public static class02695 N(Map<class02477<?>, Object> map) {
        if (map.isEmpty()) {
            return class02695.N;
        }
        if (map.size() < 8) {
            return new class09825((Reference2ObjectMap)new Reference2ObjectArrayMap(map));
        }
        return new class09825((Reference2ObjectMap)new Reference2ObjectOpenHashMap(map));
    }

    public class02676 N(class02695 class026952) {
        for (class02480<?> var3 : class026952) {
            this.N.put((Object)var3.N(), var3.y());
        }
        return this;
    }

    public List getOrEmpty(class02477 class024772) {
        ArrayList arrayList = new ArrayList((Collection)this.getOrCreate(class024772, Collections::emptyList));
        this.N(class024772, arrayList);
        return arrayList;
    }
}

