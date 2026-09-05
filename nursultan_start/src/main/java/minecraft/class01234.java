/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableList
 *  com.google.common.collect.Iterators
 *  com.google.common.collect.Lists
 *  com.google.common.collect.Maps
 *  it.unimi.dsi.fastutil.objects.ObjectIterator
 *  it.unimi.dsi.fastutil.objects.Reference2ReferenceArrayMap
 *  it.unimi.dsi.fastutil.objects.Reference2ReferenceOpenHashMap
 *  it.unimi.dsi.fastutil.objects.ReferenceLinkedOpenHashSet
 *  minecraft.class07049
 *  minecraft.class07536
 *  net.caffeinemc.mods.lithium.common.entity.EntityClassGroup
 *  net.caffeinemc.mods.lithium.common.entity.TypeFilterableListInternalAccess
 *  net.caffeinemc.mods.lithium.common.world.chunk.ClassGroupFilterableList
 *  net.caffeinemc.mods.lithium.mixin.alloc.entity_iteration.ClassInstanceMultiMapAccessor
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfo
 */
package minecraft;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.Iterators;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import it.unimi.dsi.fastutil.objects.ObjectIterator;
import it.unimi.dsi.fastutil.objects.Reference2ReferenceArrayMap;
import it.unimi.dsi.fastutil.objects.Reference2ReferenceOpenHashMap;
import it.unimi.dsi.fastutil.objects.ReferenceLinkedOpenHashSet;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import minecraft.class07049;
import minecraft.class07536;
import net.caffeinemc.mods.lithium.common.entity.EntityClassGroup;
import net.caffeinemc.mods.lithium.common.entity.TypeFilterableListInternalAccess;
import net.caffeinemc.mods.lithium.common.world.chunk.ClassGroupFilterableList;
import net.caffeinemc.mods.lithium.mixin.alloc.entity_iteration.ClassInstanceMultiMapAccessor;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

public class class01234<T>
extends AbstractCollection<T>
implements TypeFilterableListInternalAccess,
ClassGroupFilterableList,
ClassInstanceMultiMapAccessor {
    private Map<Class<?>, List<T>> N;
    private final Class<T> y;
    private final List<T> L;
    private final Reference2ReferenceArrayMap u = new Reference2ReferenceArrayMap();

    private Collection L(Class clazz) {
        ArrayList<T> arrayList = new ArrayList<T>();
        for (T t : this.L) {
            if (!clazz.isInstance(t)) continue;
            arrayList.add(t);
        }
        this.N.put(clazz, arrayList);
        return arrayList;
    }

    public class01234(Class<T> clazz) {
        this.N = Maps.newHashMap();
        this.L = Lists.newArrayList();
        this.y = clazz;
        this.N.put(clazz, this.L);
        this.N((Class)clazz, (CallbackInfo)null);
    }

    @Override
    public boolean remove(Object object) {
        object = this.y(object);
        boolean bl = false;
        for (Map.Entry<Class<?>, List<T>> entry : this.N.entrySet()) {
            if (!entry.getKey().isInstance(object)) continue;
            List<T> list = entry.getValue();
            bl |= list.remove(object);
        }
        return bl;
    }

    @Override
    public int size() {
        return this.L.size();
    }

    @Override
    public boolean add(T object) {
        object = this.N(object);
        boolean bl = false;
        for (Map.Entry<Class<?>, List<T>> entry : this.N.entrySet()) {
            if (!entry.getKey().isInstance(object)) continue;
            bl |= entry.getValue().add(object);
        }
        return bl;
    }

    @Override
    public Iterator<T> iterator() {
        if (this.L.isEmpty()) {
            return Collections.emptyIterator();
        }
        return Iterators.unmodifiableIterator(this.L.iterator());
    }

    @Override
    public boolean contains(Object object) {
        return this.N(object.getClass()).contains(object);
    }

    private /* synthetic */ List y(Class clazz) {
        return (List)this.L.stream().filter(clazz::isInstance).collect(class07536.y());
    }

    public Object y(Object object) {
        ObjectIterator objectIterator = this.u.values().iterator();
        while (objectIterator.hasNext()) {
            ((ReferenceLinkedOpenHashSet)objectIterator.next()).remove(object);
        }
        return object;
    }

    public Object N(Object object) {
        for (Map.Entry entry : this.u.entrySet()) {
            if (!((EntityClassGroup)entry.getKey()).contains((class07049)object)) continue;
            ((ReferenceLinkedOpenHashSet)entry.getValue()).add(object);
        }
        return object;
    }

    public Collection N(Class clazz) {
        Collection collection = this.N.get(clazz);
        if (collection == null) {
            collection = this.L(clazz);
        }
        return Collections.unmodifiableCollection(collection);
    }

    private void N(Class clazz, CallbackInfo callbackInfo) {
        this.N = new Reference2ReferenceOpenHashMap(this.N);
    }

    private Collection N(EntityClassGroup entityClassGroup) {
        ReferenceLinkedOpenHashSet referenceLinkedOpenHashSet = new ReferenceLinkedOpenHashSet();
        for (T t : this.L) {
            if (!entityClassGroup.contains((class07049)t)) continue;
            referenceLinkedOpenHashSet.add(t);
        }
        this.u.put((Object)entityClassGroup, (Object)referenceLinkedOpenHashSet);
        return referenceLinkedOpenHashSet;
    }

    private boolean N(Class clazz, Class clazz2) {
        return true;
    }

    public List<T> N() {
        return ImmutableList.copyOf(this.L);
    }

    public /* synthetic */ List getAllInstances() {
        return this.L;
    }

    public List lithium$getOrCreateAllOfTypeRaw(Class clazz) {
        List<T> list = this.N.get(clazz);
        if (list == null) {
            this.N(clazz);
            list = this.N.get(clazz);
        }
        return list;
    }

    public List lithium$replaceCollectionAndGet(Class clazz, ArrayList arrayList) {
        this.N.put(clazz, arrayList);
        return arrayList;
    }

    public List lithium$replaceCollectionAndGet(Class clazz, Function function) {
        List<T> list = this.N.get(clazz);
        List list2 = (List)function.apply((ArrayList)list);
        this.N.put(clazz, list2);
        return list2;
    }

    public Collection lithium$getAllOfGroupType(EntityClassGroup entityClassGroup) {
        Collection collection = (Collection)this.u.get((Object)entityClassGroup);
        if (collection == null) {
            collection = this.N(entityClassGroup);
        }
        return collection;
    }
}

