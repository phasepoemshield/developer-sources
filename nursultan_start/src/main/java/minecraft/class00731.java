/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class09397
 *  com.google.common.collect.BiMap
 *  com.google.common.collect.HashBiMap
 *  com.google.common.collect.ImmutableMap
 *  com.google.common.collect.ImmutableMap$Builder
 *  com.google.common.collect.Iterators
 *  com.google.common.collect.Sets
 *  com.mojang.serialization.Lifecycle
 *  it.unimi.dsi.fastutil.ints.Int2IntMap
 *  it.unimi.dsi.fastutil.ints.Int2IntOpenHashMap
 *  it.unimi.dsi.fastutil.ints.Int2ObjectMap
 *  it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap
 *  it.unimi.dsi.fastutil.objects.Object2IntMap
 *  it.unimi.dsi.fastutil.objects.Object2IntOpenHashMap
 *  it.unimi.dsi.fastutil.objects.ObjectArrayList
 *  it.unimi.dsi.fastutil.objects.ObjectList
 *  it.unimi.dsi.fastutil.objects.Reference2IntMap
 *  it.unimi.dsi.fastutil.objects.Reference2IntOpenHashMap
 *  minecraft.class00745
 *  minecraft.class00751
 *  minecraft.class00752
 *  minecraft.class01196
 *  minecraft.class01894
 *  minecraft.class01921
 *  minecraft.class02042
 *  minecraft.class02055
 *  minecraft.class02819
 *  minecraft.class03529
 *  minecraft.class03530
 *  minecraft.class03552
 *  minecraft.class03556
 *  minecraft.class05946
 *  minecraft.class06069
 *  minecraft.class07099
 *  minecraft.class07536
 *  net.fabricmc.fabric.api.event.Event
 *  net.fabricmc.fabric.api.event.EventFactory
 *  net.fabricmc.fabric.api.event.registry.FabricRegistry
 *  net.fabricmc.fabric.api.event.registry.RegistryAttribute
 *  net.fabricmc.fabric.api.event.registry.RegistryAttributeHolder
 *  net.fabricmc.fabric.api.event.registry.RegistryEntryAddedCallback
 *  net.fabricmc.fabric.api.event.registry.RegistryIdRemapCallback
 *  net.fabricmc.fabric.api.event.registry.RegistryIdRemapCallback$RemapState
 *  net.fabricmc.fabric.impl.registry.sync.ListenableRegistry
 *  net.fabricmc.fabric.impl.registry.sync.RegistrySyncManager
 *  net.fabricmc.fabric.impl.registry.sync.RemapException
 *  net.fabricmc.fabric.impl.registry.sync.RemapStateImpl
 *  net.fabricmc.fabric.impl.registry.sync.RemappableRegistry
 *  net.fabricmc.fabric.impl.registry.sync.RemappableRegistry$RemapMode
 *  net.fabricmc.fabric.impl.tag.SimpleRegistryExtension
 *  net.fabricmc.fabric.impl.tag.TagAliasEnabledRegistryWrapper
 *  net.fabricmc.fabric.mixin.registry.sync.MappedRegistryAccessor
 *  net.fabricmc.fabric.mixin.tag.SimpleRegistryTagLookup2Accessor
 *  org.jspecify.annotations.Nullable
 *  org.slf4j.Logger
 *  org.slf4j.LoggerFactory
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfo
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable
 */
package minecraft;

import Nursultan.class09397;
import com.google.common.collect.BiMap;
import com.google.common.collect.HashBiMap;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Iterators;
import com.google.common.collect.Sets;
import com.mojang.serialization.Lifecycle;
import it.unimi.dsi.fastutil.ints.Int2IntMap;
import it.unimi.dsi.fastutil.ints.Int2IntOpenHashMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;
import it.unimi.dsi.fastutil.objects.Object2IntMap;
import it.unimi.dsi.fastutil.objects.Object2IntOpenHashMap;
import it.unimi.dsi.fastutil.objects.ObjectArrayList;
import it.unimi.dsi.fastutil.objects.ObjectList;
import it.unimi.dsi.fastutil.objects.Reference2IntMap;
import it.unimi.dsi.fastutil.objects.Reference2IntOpenHashMap;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Stream;
import minecraft.class00720;
import minecraft.class00726;
import minecraft.class00727;
import minecraft.class00745;
import minecraft.class00751;
import minecraft.class00752;
import minecraft.class01196;
import minecraft.class01894;
import minecraft.class01921;
import minecraft.class02042;
import minecraft.class02055;
import minecraft.class02819;
import minecraft.class03529;
import minecraft.class03530;
import minecraft.class03552;
import minecraft.class03556;
import minecraft.class05946;
import minecraft.class06069;
import minecraft.class07099;
import minecraft.class07536;
import net.fabricmc.fabric.api.event.Event;
import net.fabricmc.fabric.api.event.EventFactory;
import net.fabricmc.fabric.api.event.registry.FabricRegistry;
import net.fabricmc.fabric.api.event.registry.RegistryAttribute;
import net.fabricmc.fabric.api.event.registry.RegistryAttributeHolder;
import net.fabricmc.fabric.api.event.registry.RegistryEntryAddedCallback;
import net.fabricmc.fabric.api.event.registry.RegistryIdRemapCallback;
import net.fabricmc.fabric.impl.registry.sync.ListenableRegistry;
import net.fabricmc.fabric.impl.registry.sync.RegistrySyncManager;
import net.fabricmc.fabric.impl.registry.sync.RemapException;
import net.fabricmc.fabric.impl.registry.sync.RemapStateImpl;
import net.fabricmc.fabric.impl.registry.sync.RemappableRegistry;
import net.fabricmc.fabric.impl.tag.SimpleRegistryExtension;
import net.fabricmc.fabric.impl.tag.TagAliasEnabledRegistryWrapper;
import net.fabricmc.fabric.mixin.registry.sync.MappedRegistryAccessor;
import net.fabricmc.fabric.mixin.tag.SimpleRegistryTagLookup2Accessor;
import org.jspecify.annotations.Nullable;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

public class class00731<T>
implements class07099<T>,
FabricRegistry,
ListenableRegistry,
RemappableRegistry,
SimpleRegistryExtension,
TagAliasEnabledRegistryWrapper,
MappedRegistryAccessor {
    private final class05946<? extends class00751<T>> i;
    private final ObjectList<class03529<T>> R;
    private final Reference2IntMap<T> M;
    private final Map<class01894, class03529<T>> B;
    private final Map<class05946<T>, class03529<T>> Z;
    private final Map<T, class03529<T>> z;
    public final Map<class05946<T>, class02819> y;
    private Lifecycle U;
    private final Map<class03530<T>, class03552<T>> E;
    class00752<T> L;
    public boolean u;
    private @Nullable Map<T, class03529<T>> W;
    private static final Set m = Set.of("minecraft", "brigadier");
    private static final Logger P = LoggerFactory.getLogger(class00731.class);
    private Event s;
    private Event T;
    private Object2IntMap b;
    private BiMap j;
    private Map v = new HashMap();
    private static final Logger n = LoggerFactory.getLogger((String)"fabric-tag-api-v1");
    private Map t;

    public void fabric_refreshTags() {
        this.m();
    }

    public Optional<class03529<T>> L(int n) {
        if (n < 0 || n >= this.R.size()) {
            return Optional.empty();
        }
        return Optional.ofNullable((class03529)this.R.get(n));
    }

    public @Nullable T L(@Nullable class05946<T> class059462) {
        class059462 = this.W(class059462);
        return class00731.N(this.Z.get(class059462));
    }

    public Optional<class03529<T>> L(class01894 class018942) {
        class018942 = this.i(class018942);
        return Optional.ofNullable(this.B.get(class018942));
    }

    public int L() {
        return this.Z.size();
    }

    class03552<T> L(class03530<T> class035302) {
        return (class03552)this.E.computeIfAbsent(class035302, this::i);
    }

    public Set<class01894> M() {
        return Collections.unmodifiableSet(this.B.keySet());
    }

    public void P() {
        this.y();
        this.E.values().forEach(class035522 -> class035522.y(List.of()));
    }

    public class00731(class05946<? extends class00751<T>> class059462, Lifecycle lifecycle) {
        this(class059462, lifecycle, false);
    }

    public class00731(class05946<? extends class00751<T>> class059462, Lifecycle lifecycle, boolean bl) {
        this.R = new ObjectArrayList(256);
        this.M = (Reference2IntMap)class07536.N((Object)new Reference2IntOpenHashMap(), (T reference2IntOpenHashMap) -> reference2IntOpenHashMap.defaultReturnValue(-1));
        this.B = new HashMap<class01894, class03529<T>>();
        this.Z = new HashMap<class05946<T>, class03529<T>>();
        this.z = new IdentityHashMap<T, class03529<T>>();
        this.y = new IdentityHashMap<class05946<T>, class02819>();
        this.E = new IdentityHashMap<class03530<T>, class03552<T>>();
        this.L = class00752.N();
        this.i = class059462;
        this.U = lifecycle;
        if (bl) {
            this.W = new IdentityHashMap<T, class03529<T>>();
        }
        this.N(class059462, lifecycle, bl, null);
    }

    public String toString() {
        return "Registry[" + String.valueOf(this.i) + " (" + String.valueOf(this.U) + ")]";
    }

    public Set<class05946<T>> B() {
        return Collections.unmodifiableSet(this.Z.keySet());
    }

    public Set<Map.Entry<class05946<T>, T>> Z() {
        return Collections.unmodifiableSet(class07536.N(this.Z, class03556::N).entrySet());
    }

    private void Z(class05946<T> class059462) {
        if (this.u) {
            throw new IllegalStateException("Registry is already frozen (trying to add key " + String.valueOf(class059462) + ")");
        }
    }

    public Iterator<T> iterator() {
        return Iterators.transform((Iterator)this.R.iterator(), class03556::N);
    }

    public Optional<class02819> i(class05946<T> class059462) {
        class059462 = this.W(class059462);
        return Optional.ofNullable(this.y.get(class059462));
    }

    private class01894 i(class01894 class018942) {
        return this.v.getOrDefault(class018942, class018942);
    }

    private class03552<T> i(class03530<T> class035302) {
        return new class03552((class02042)this, class035302);
    }

    public class05946<? extends class00751<T>> i() {
        return this.i;
    }

    public class03556<T> i(T t) {
        class03556 class035562 = this.z.get(t);
        return class035562 != null ? class035562 : class03556.N(t);
    }

    public class02055<T> s() {
        this.y();
        return new class00745(this);
    }

    void m() {
        IdentityHashMap<class03529, List> identityHashMap = new IdentityHashMap<class03529, List>();
        this.Z.values().forEach(class035292 -> identityHashMap.put((class03529)class035292, new ArrayList()));
        this.L.N((T class035302, U class035522) -> {
            for (class03556 class035562 : class035522) {
                class03529<T> class035292 = this.N((class03530<T>)class035302, (class03556<T>)class035562);
                ((List)identityHashMap.get(class035292)).add(class035302);
            }
        });
        identityHashMap.forEach(class03529::N);
    }

    public Stream<class03552<T>> U() {
        return this.L.L();
    }

    public Stream<class03529<T>> z() {
        return this.R.stream();
    }

    public /* synthetic */ boolean isFrozen() {
        return this.u;
    }

    public boolean u(class01894 class018942) {
        class018942 = this.i(class018942);
        return this.B.containsKey(class018942);
    }

    public Stream<class03552<T>> u() {
        return this.U();
    }

    class03529<T> u(class05946<T> class059463) {
        class059463 = this.W(class059463);
        return this.Z.computeIfAbsent(class059463, class059462 -> {
            if (this.W != null) {
                throw new IllegalStateException("This registry can't create new holders without value");
            }
            this.Z((class05946<T>)class059462);
            return class03529.N_40((class02042)this, (class05946)class059462);
        });
    }

    public Optional<class05946<T>> u(T t) {
        return Optional.ofNullable(this.z.get(t)).map(class03529::B);
    }

    public @Nullable class01894 y(T t) {
        class03529<T> class035292 = this.z.get(t);
        return class035292 != null ? class035292.B().N() : null;
    }

    private void y() {
        if (this.u) {
            throw new IllegalStateException("Registry is already frozen");
        }
    }

    public boolean E() {
        return this.Z.isEmpty();
    }

    private void E(class05946 class059462) {
        if (!(!RegistrySyncManager.postBootstrap && m.contains(class059462.N().y()) || RegistryAttributeHolder.get(this.i()).hasAttribute(RegistryAttribute.MODDED))) {
            class01894 class018942 = this.i().N();
            P.debug("Registry {} has been marked as modded, registry entry {} was changed", (Object)class018942, (Object)class059462.N());
            RegistryAttributeHolder.get(this.i()).addAttribute(RegistryAttribute.MODDED);
        }
    }

    public int N(@Nullable T t) {
        return this.M.getInt(t);
    }

    public Optional<class03529<T>> N(class06069 class060692) {
        return class07536.y_9(this.R, (class06069)class060692);
    }

    private void N(class05946 class059462, Lifecycle lifecycle, boolean bl, CallbackInfo callbackInfo) {
        this.s = EventFactory.createArrayBacked(RegistryEntryAddedCallback.class, registryEntryAddedCallbackArray -> (n, class018942, object) -> {
            RegistryEntryAddedCallback[] registryEntryAddedCallbackArray2 = registryEntryAddedCallbackArray;
            int n2 = registryEntryAddedCallbackArray2.length;
            for (int i = 0; i < n2; ++i) {
                registryEntryAddedCallbackArray2[i].onEntryAdded(n, class018942, object);
            }
        });
        this.s.register((n, class018942, object) -> {
            if (this.v.containsKey(class018942)) {
                throw new IllegalArgumentException("Tried registering %s to registry %s, but it is already an alias (for %s)".formatted(new Object[]{class018942, this.i, this.v.get(class018942)}));
            }
        });
        this.T = EventFactory.createArrayBacked(RegistryIdRemapCallback.class, registryIdRemapCallbackArray -> remapState -> {
            RegistryIdRemapCallback[] registryIdRemapCallbackArray2 = registryIdRemapCallbackArray;
            int n = registryIdRemapCallbackArray2.length;
            for (int i = 0; i < n; ++i) {
                registryIdRemapCallbackArray2[i].onRemap(remapState);
            }
        });
    }

    private class03529<T> N(class03530<T> class035302, class03556<T> class035562) {
        if (!class035562.N((class02042)this)) {
            throw new IllegalStateException("Can't create named set " + String.valueOf(class035302) + " containing value " + String.valueOf(class035562) + " from outside registry " + String.valueOf(this));
        }
        if (class035562 instanceof class03529) {
            return (class03529)class035562;
        }
        throw new IllegalStateException("Found direct holder " + String.valueOf(class035562) + " value in tag " + String.valueOf(class035302));
    }

    public @Nullable T N(int n) {
        if (n < 0 || n >= this.R.size()) {
            return null;
        }
        return (T)((class03529)this.R.get(n)).N();
    }

    private void N(class05946 class059462, Object object, class02819 class028192, CallbackInfoReturnable callbackInfoReturnable) {
        ((class03529)callbackInfoReturnable.getReturnValue()).y(object);
        ((RegistryEntryAddedCallback)this.s.invoker()).onEntryAdded(this.M.getInt(object), class059462.N(), object);
        this.E(class059462);
    }

    public class03529<T> N(class05946<T> class059463, T t, class02819 class028192) {
        class03529 class035292;
        this.Z(class059463);
        Objects.requireNonNull(class059463);
        Objects.requireNonNull(t);
        if (this.B.containsKey(class059463.N())) {
            throw (IllegalStateException)class07536.y((Throwable)new IllegalStateException("Adding duplicate key '" + String.valueOf(class059463) + "' to registry"));
        }
        if (this.z.containsKey(t)) {
            throw (IllegalStateException)class07536.y((Throwable)new IllegalStateException("Adding duplicate value '" + String.valueOf(t) + "' to registry"));
        }
        if (this.W != null) {
            class035292 = this.W.remove(t);
            if (class035292 == null) {
                throw new AssertionError((Object)("Missing intrusive holder for " + String.valueOf(class059463) + ":" + String.valueOf(t)));
            }
            class035292.y(class059463);
        } else {
            class035292 = (class03529)this.Z.computeIfAbsent(class059463, class059462 -> class03529.N_40((class02042)this, (class05946)class059462));
        }
        this.Z.put(class059463, class035292);
        this.B.put(class059463.N(), class035292);
        this.z.put(t, class035292);
        int n = this.R.size();
        this.R.add((Object)class035292);
        this.M.put(t, n);
        this.y.put(class059463, class028192);
        this.U = this.U.add(class028192.y());
        class03529 class035293 = class035292;
        this.N(class059463, t, class028192, new CallbackInfoReturnable("", false, (Object)class035293));
        return class035293;
    }

    public @Nullable T N(@Nullable class01894 class018942) {
        class018942 = this.i(class018942);
        return class00731.N(this.B.get(class018942));
    }

    public class00720<T> N(class01196<T> class011962) {
        if (!this.u) {
            throw new IllegalStateException("Invalid method used for tag loading");
        }
        ImmutableMap.Builder builder = ImmutableMap.builder();
        HashMap hashMap = new HashMap();
        class011962.y().forEach((class035302, list) -> {
            class03552<T> class035522 = this.E.get(class035302);
            if (class035522 == null) {
                class035522 = this.i((class03530<T>)class035302);
            }
            builder.put(class035302, class035522);
            hashMap.put(class035302, List.copyOf(list));
        });
        ImmutableMap immutableMap = builder.build();
        class00726 class007262 = new class00726(this, immutableMap);
        return new class00727(this, hashMap, (class01921)class007262, immutableMap);
    }

    public void N(class03530<T> class035302, List<class03556<T>> list) {
        this.y();
        this.L(class035302).y(list);
    }

    private static <T> @Nullable T N(@Nullable class03529<T> class035292) {
        return (T)(class035292 != null ? class035292.N() : null);
    }

    public Optional<class03552<T>> N(class03530<T> class035302) {
        return this.L.N(class035302);
    }

    public Optional<class03529<T>> N() {
        return this.R.isEmpty() ? Optional.empty() : Optional.of((class03529)this.R.getFirst());
    }

    public Optional<class03529<T>> N(class05946<T> class059462) {
        class059462 = this.W(class059462);
        return Optional.ofNullable(this.Z.get(class059462));
    }

    public void addAlias(class01894 class018942, class01894 class018943) {
        Objects.requireNonNull(class018942, "alias cannot be null");
        Objects.requireNonNull(class018943, "aliased id cannot be null");
        if (this.v.containsKey(class018942)) {
            throw new IllegalArgumentException("Tried adding %s as an alias for %s, but it is already an alias (for %s) in registry %s".formatted(new Object[]{class018942, class018943, this.v.get(class018942), this.i}));
        }
        if (this.B.containsKey(class018942)) {
            throw new IllegalArgumentException("Tried adding %s as an alias, but it is already present in registry %s".formatted(new Object[]{class018942, this.i}));
        }
        if (class018942.equals(this.v.get(class018943))) {
            throw new IllegalArgumentException("Making %1$s an alias of %2$s would create a cycle, as %2$s is already an alias of %1$s (registry %3$s)".formatted(new Object[]{class018942, class018943, this.i}));
        }
        if (!this.B.containsKey(class018943)) {
            P.warn("Adding {} as an alias for {}, but the latter doesn't exist in registry {}", new Object[]{class018942, class018943, this.i});
        }
        this.y();
        class01894 class018944 = this.v.getOrDefault(class018943, class018943);
        for (Map.Entry entry : this.v.entrySet()) {
            if (!class018942.equals(entry.getValue())) continue;
            entry.setValue(class018944);
        }
        this.v.put(class018942, class018944);
        P.debug("Adding alias {} for {} in registry {}", new Object[]{class018942, class018943, this.i});
    }

    public class00751<T> W() {
        if (this.u) {
            return this;
        }
        this.u = true;
        this.z.forEach((object, class035292) -> class035292.y(object));
        List list = this.Z.entrySet().stream().filter(entry -> !((class03529)entry.getValue()).y()).map(entry -> ((class05946)entry.getKey()).N()).sorted().toList();
        if (!list.isEmpty()) {
            throw new IllegalStateException("Unbound values in registry " + String.valueOf(this.i()) + ": " + String.valueOf(list));
        }
        if (this.W != null) {
            if (!this.W.isEmpty()) {
                throw new IllegalStateException("Some intrusive holders were not registered: " + String.valueOf(this.W.values()));
            }
            this.W = null;
        }
        if (this.L.y()) {
            throw new IllegalStateException("Tags already present before freezing");
        }
        List list2 = this.E.entrySet().stream().filter(entry -> !((class03552)entry.getValue()).L()).map(entry -> ((class03530)entry.getKey()).y()).sorted().toList();
        if (!list2.isEmpty()) {
            throw new IllegalStateException("Unbound tags in registry " + String.valueOf(this.i()) + ": " + String.valueOf(list2));
        }
        this.L = class00752.N(this.E);
        this.m();
        return this;
    }

    private class05946 W(class05946 class059462) {
        if (class059462 == null) {
            return null;
        }
        class01894 class018942 = (class01894)this.v.get(class059462.N());
        return class018942 == null ? class059462 : class05946.N((class05946)class059462.L(), (class01894)class018942);
    }

    public boolean R(class05946<T> class059462) {
        class059462 = this.W(class059462);
        return this.Z.containsKey(class059462);
    }

    public class03529<T> R(T t) {
        if (this.W == null) {
            throw new IllegalStateException("This registry can't create intrusive holders");
        }
        this.y();
        return (class03529)this.W.computeIfAbsent(t, object -> class03529.N((class02042)this, (Object)object));
    }

    public Lifecycle R() {
        return this.U;
    }

    public void unmap() throws RemapException {
        if (this.b != null) {
            ArrayList<class01894> arrayList = new ArrayList<class01894>();
            for (class01894 object : this.j.keySet()) {
                if (this.B.containsKey(object)) continue;
                if (!this.b.containsKey((Object)object)) {
                    throw new IllegalStateException("id missing from previous indexed entries");
                }
                arrayList.add(object);
            }
            this.B.clear();
            this.Z.clear();
            this.B.putAll((Map<class01894, class03529<T>>)this.j);
            for (Map.Entry entry : this.j.entrySet()) {
                class05946 class059462 = class05946.N(this.i(), (class01894)((class01894)entry.getKey()));
                this.Z.put(class059462, (class03529)entry.getValue());
            }
            this.remap(this.b, RemappableRegistry.RemapMode.AUTHORITATIVE);
            for (class01894 class018942 : arrayList) {
                ((RegistryEntryAddedCallback)this.fabric_getAddObjectEvent().invoker()).onEntryAdded(this.M.getInt(this.B.get(class018942)), class018942, this.N(class018942));
            }
            this.b = null;
            this.j = null;
        }
    }

    public void remap(Object2IntMap object2IntMap, RemappableRegistry.RemapMode remapMode) throws RemapException {
        int n;
        Object object;
        Object object222;
        Object object3;
        switch (class09397.N[remapMode.ordinal()]) {
            case 1: {
                break;
            }
            case 2: {
                object3 = null;
                for (Object object222 : object2IntMap.keySet()) {
                    if (this.u((class01894)object222)) continue;
                    if (object3 == null) {
                        object3 = new ArrayList();
                    }
                    object3.add(" - " + String.valueOf(object222));
                }
                if (object3 == null) break;
                object = new StringBuilder("Received ID map for " + String.valueOf(this.i()) + " contains IDs unknown to the receiver!");
                object222 = object3.iterator();
                while (object222.hasNext()) {
                    String string = (String)object222.next();
                    ((StringBuilder)object).append('\n').append(string);
                }
                throw new RemapException(((StringBuilder)object).toString());
            }
        }
        if (this.b == null) {
            this.b = new Object2IntOpenHashMap();
            this.j = HashBiMap.create(this.B);
            object3 = this.iterator();
            while (object3.hasNext()) {
                object = object3.next();
                this.b.put((Object)this.y(object), this.N(object));
            }
        }
        object3 = new Int2ObjectOpenHashMap();
        object = this.iterator();
        while (object.hasNext()) {
            object222 = object.next();
            object3.put(this.N(object222), (Object)this.y(object222));
        }
        switch (class09397.N[remapMode.ordinal()]) {
            case 1: {
                int n2 = 0;
                object222 = object2IntMap;
                object2IntMap = new Object2IntOpenHashMap();
                for (class01894 class018942 : object222.keySet()) {
                    n = object222.getInt((Object)class018942);
                    object2IntMap.put((Object)class018942, n);
                    if (n <= n2) continue;
                    n2 = n;
                }
                for (class01894 class018942 : this.M()) {
                    if (object2IntMap.containsKey((Object)class018942)) continue;
                    P.warn("Adding " + String.valueOf(class018942) + " to saved/remote registry.");
                    object2IntMap.put((Object)class018942, ++n2);
                }
                break;
            }
            case 2: {
                int n3 = -1;
                for (class01894 class018943 : this.M()) {
                    if (object2IntMap.containsKey((Object)class018943)) continue;
                    if (n3 < 0) {
                        n3 = object2IntMap.values().intStream().max().orElseThrow(() -> new RemapException("Failed to assign new id to client only registry entry"));
                    }
                    P.debug("An ID for {} was not sent by the server, assuming client only registry entry and assigning a new id ({}) in {}", new Object[]{class018943.toString(), ++n3, this.i().N().toString()});
                    object2IntMap.put((Object)class018943, n3);
                }
                break;
            }
        }
        Int2IntOpenHashMap int2IntOpenHashMap = new Int2IntOpenHashMap();
        for (int i = 0; i < this.R.size(); ++i) {
            class01894 class018942;
            class03529 class035292 = (class03529)this.R.get(i);
            if (class035292 == null) {
                throw new RemapException("Unused id " + i + " in registry " + String.valueOf(this.i().N()));
            }
            class018942 = class035292.B().N();
            if (!object2IntMap.containsKey((Object)class018942)) continue;
            int2IntOpenHashMap.put(i, object2IntMap.getInt((Object)class018942));
        }
        this.R.clear();
        this.M.clear();
        ArrayList<class01894> arrayList = new ArrayList<class01894>((Collection<class01894>)object2IntMap.keySet());
        arrayList.sort(Comparator.comparingInt(arg_0 -> ((Object2IntMap)object2IntMap).getInt(arg_0)));
        for (class01894 class018942 : arrayList) {
            n = object2IntMap.getInt((Object)class018942);
            class03529<T> class035293 = this.B.get(class018942);
            if (class035293 == null) {
                if (remapMode != RemappableRegistry.RemapMode.AUTHORITATIVE) {
                    throw new RemapException(String.valueOf(class018942) + " missing from registry, but requested!");
                }
                P.warn(String.valueOf(class018942) + " missing from registry, but requested!");
                continue;
            }
            this.R.size(Math.max(this.R.size(), n + 1));
            if (this.R.get(n) != null) {
                throw new IllegalStateException("Raw ID already populated");
            }
            this.R.set(n, class035293);
            this.M.put(class035293.N(), n);
        }
        ((RegistryIdRemapCallback)this.fabric_getRemapEvent().invoker()).onRemap((RegistryIdRemapCallback.RemapState)new RemapStateImpl((class00751)this, (Int2ObjectMap)object3, (Int2IntMap)int2IntOpenHashMap));
    }

    public void fabric_applyPendingTagAliases() {
        if (this.t == null) {
            return;
        }
        Set set = Sets.newIdentityHashSet();
        set.addAll(this.t.values());
        for (Set set2 : set) {
            Object object;
            class03552 class035522;
            Object object22;
            Set set3 = Sets.newIdentityHashSet();
            for (Object object22 : set2) {
                class035522 = this.L.N((class03530)object22).orElse(null);
                if (class035522 != null) {
                    set3.addAll(class035522.N);
                    continue;
                }
                n.info("[Fabric] Creating a new empty tag {} for unknown tag used in a tag alias group in {}", (Object)object22.y(), (Object)object22.N().N());
                object = ((SimpleRegistryTagLookup2Accessor)this.L).fabric_getTagMap();
                if (!(object instanceof HashMap)) {
                    object = new HashMap(object);
                    ((SimpleRegistryTagLookup2Accessor)this.L).fabric_setTagMap((Map)object);
                }
                object.put(object22, this.i((class03530<T>)object22));
            }
            List list = List.copyOf(set3);
            object22 = set2.iterator();
            while (object22.hasNext()) {
                class035522 = (class03530)object22.next();
                object = (class03552)this.L.N((class03530)class035522).orElseThrow();
                object.N = list;
            }
        }
        n.debug("[Fabric] Loaded {} tag alias groups for {}", (Object)set.size(), (Object)this.i.N());
        this.t = null;
    }

    public Event fabric_getRemapEvent() {
        return this.T;
    }

    public Event fabric_getAddObjectEvent() {
        return this.s;
    }

    public void fabric_loadTagAliases(Map map) {
        this.t = map;
    }
}

