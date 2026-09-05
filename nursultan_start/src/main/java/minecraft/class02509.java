/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  it.unimi.dsi.fastutil.objects.Reference2ObjectArrayMap
 *  it.unimi.dsi.fastutil.objects.Reference2ObjectMap
 *  it.unimi.dsi.fastutil.objects.Reference2ObjectMap$Entry
 *  it.unimi.dsi.fastutil.objects.Reference2ObjectMaps
 *  it.unimi.dsi.fastutil.objects.ReferenceArraySet
 *  minecraft.class02678
 *  minecraft.class02695
 *  net.caffeinemc.mods.lithium.common.util.change_tracking.ChangePublisher
 *  net.caffeinemc.mods.lithium.common.util.change_tracking.ChangeSubscriber
 *  org.jspecify.annotations.Nullable
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfo
 */
package minecraft;

import it.unimi.dsi.fastutil.objects.Reference2ObjectArrayMap;
import it.unimi.dsi.fastutil.objects.Reference2ObjectMap;
import it.unimi.dsi.fastutil.objects.Reference2ObjectMaps;
import it.unimi.dsi.fastutil.objects.ReferenceArraySet;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;
import minecraft.class02477;
import minecraft.class02480;
import minecraft.class02678;
import minecraft.class02695;
import net.caffeinemc.mods.lithium.common.util.change_tracking.ChangePublisher;
import net.caffeinemc.mods.lithium.common.util.change_tracking.ChangeSubscriber;
import org.jspecify.annotations.Nullable;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

public final class class02509
implements class02695,
ChangePublisher {
    private final class02695 L;
    private Reference2ObjectMap<class02477<?>, Optional<?>> u;
    private boolean i;
    private ChangeSubscriber R;

    public <T> @Nullable T L(class02477<? extends T> class024772) {
        Optional optional;
        this.z();
        Object object = this.L.method_58694(class024772);
        if (object != null) {
            Optional var3 = (Optional)this.u.put(class024772, Optional.empty());
        } else {
            optional = (Optional)this.u.remove(class024772);
        }
        if (optional != null) {
            return optional.orElse(null);
        }
        return (T)object;
    }

    public class02678 M() {
        if (this.u.isEmpty()) {
            return class02678.N;
        }
        this.i = true;
        return new class02678(this.u);
    }

    public <T> @Nullable T method_58694(class02477<? extends T> class024772) {
        Optional var2 = (Optional)this.u.get(class024772);
        if (var2 != null) {
            return var2.orElse(null);
        }
        return (T)this.L.method_58694(class024772);
    }

    public class02509(class02695 class026952) {
        this(class026952, Reference2ObjectMaps.emptyMap(), true);
    }

    private class02509(class02695 class026952, Reference2ObjectMap<class02477<?>, Optional<?>> reference2ObjectMap, boolean bl) {
        this.L = class026952;
        this.u = reference2ObjectMap;
        this.i = bl;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (!(object instanceof class02509)) return false;
        class02509 class025092 = (class02509)object;
        if (!this.L.equals((Object)class025092.L)) return false;
        if (!this.u.equals(class025092.u)) return false;
        return true;
    }

    public String toString() {
        return "{" + this.L().map(class02480::toString).collect(Collectors.joining(", ")) + "}";
    }

    public int hashCode() {
        return this.L.hashCode() + this.u.hashCode() * 31;
    }

    public class02509 B() {
        this.i = true;
        return new class02509(this.L, this.u, true);
    }

    public class02695 Z() {
        if (this.u.isEmpty()) {
            return this.L;
        }
        return this.B();
    }

    public Iterator<class02480<?>> iterator() {
        if (this.u.isEmpty()) {
            return this.L.iterator();
        }
        ArrayList<Object> arrayList = new ArrayList<Object>(this.u.size() + this.L.u());
        for (Object object : Reference2ObjectMaps.fastIterable(this.u)) {
            if (!((Optional)object.getValue()).isPresent()) continue;
            arrayList.add((Object)class02480.N((class02477)object.getKey(), ((Optional)object.getValue()).get()));
        }
        for (Object object : this.L) {
            if (this.u.containsKey(object.N())) continue;
            arrayList.add(object);
        }
        return arrayList.iterator();
    }

    private void z() {
        this.N((CallbackInfo)null);
        if (this.i) {
            this.u = new Reference2ObjectArrayMap(this.u);
            this.i = false;
        }
    }

    public int u() {
        int n = this.L.u();
        for (Reference2ObjectMap.Entry entry : Reference2ObjectMaps.fastIterable(this.u)) {
            boolean bl;
            boolean bl2 = ((Optional)entry.getValue()).isPresent();
            if (bl2 == (bl = this.L.N((class02477)entry.getKey()))) continue;
            n += bl2 ? 1 : -1;
        }
        return n;
    }

    public boolean y(class02477<?> class024772) {
        return this.u.containsKey(class024772);
    }

    public <T> @Nullable T y(class02477<T> class024772, @Nullable T t) {
        Optional optional;
        this.z();
        Object object = this.L.method_58694(class024772);
        if (Objects.equals(t, object)) {
            Optional var4 = (Optional)this.u.remove(class024772);
        } else {
            optional = (Optional)this.u.put(class024772, Optional.ofNullable(t));
        }
        if (optional != null) {
            return (T)optional.orElse(object);
        }
        return (T)object;
    }

    public void y(class02678 class026782) {
        this.z();
        this.u.clear();
        this.u.putAll((Map)class026782.i);
    }

    public Set<class02477<?>> y() {
        if (this.u.isEmpty()) {
            return this.L.y();
        }
        ReferenceArraySet referenceArraySet = new ReferenceArraySet(this.L.y());
        for (Reference2ObjectMap.Entry entry : Reference2ObjectMaps.fastIterable(this.u)) {
            if (((Optional)entry.getValue()).isPresent()) {
                referenceArraySet.add((class02477)entry.getKey());
                continue;
            }
            referenceArraySet.remove(entry.getKey());
        }
        return referenceArraySet;
    }

    private void N(CallbackInfo callbackInfo) {
        if (this.R != null) {
            this.R.lithium$notify((Object)this, 0);
        }
    }

    public void N(class02678 class026782) {
        this.z();
        for (Map.Entry entry : Reference2ObjectMaps.fastIterable((Reference2ObjectMap)class026782.i)) {
            this.N((class02477)entry.getKey(), (Optional)entry.getValue());
        }
    }

    public <T> @Nullable T N(class02480<T> class024802) {
        return this.y(class024802.N(), class024802.y());
    }

    private static boolean N(class02695 class026952, Reference2ObjectMap<class02477<?>, Optional<?>> reference2ObjectMap) {
        for (Map.Entry entry : Reference2ObjectMaps.fastIterable(reference2ObjectMap)) {
            Object object = class026952.method_58694((class02477)entry.getKey());
            Optional optional = (Optional)entry.getValue();
            if (optional.isPresent() && optional.get().equals(object)) {
                return false;
            }
            if (!optional.isEmpty() || object != null) continue;
            return false;
        }
        return true;
    }

    public static class02509 N(class02695 class026952, class02678 class026782) {
        if (class02509.N(class026952, class026782.i)) {
            return new class02509(class026952, class026782.i, true);
        }
        class02509 class025092 = new class02509(class026952);
        class025092.N(class026782);
        return class025092;
    }

    public void N(class02695 class026952) {
        Iterator var2 = class026952.iterator();
        while (var2.hasNext()) {
            ((class02480)((Object)var2.next())).N(this);
        }
    }

    private void N(class02477<?> class024772, Optional<?> optional) {
        Object object = this.L.method_58694(class024772);
        if (optional.isPresent()) {
            if (optional.get().equals(object)) {
                this.u.remove(class024772);
            } else {
                this.u.put(class024772, optional);
            }
        } else if (object != null) {
            this.u.put(class024772, Optional.empty());
        } else {
            this.u.remove(class024772);
        }
    }

    public void R() {
        this.z();
        this.u.clear();
    }

    public int lithium$unsubscribe(ChangeSubscriber changeSubscriber) {
        this.R = ChangeSubscriber.without((ChangeSubscriber)this.R, (ChangeSubscriber)changeSubscriber);
        return 0;
    }

    public void lithium$subscribe(ChangeSubscriber changeSubscriber, int n) {
        if (n != 0) {
            throw new UnsupportedOperationException("ComponentMapImpl does not support subscriber data");
        }
        this.R = ChangeSubscriber.combine((ChangeSubscriber)this.R, (int)0, (ChangeSubscriber)changeSubscriber, (int)0);
    }
}

