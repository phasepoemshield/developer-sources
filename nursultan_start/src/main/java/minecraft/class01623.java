/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableList
 *  com.google.common.collect.ImmutableMap
 *  com.google.common.collect.ImmutableSet
 *  com.google.common.collect.Lists
 *  com.google.common.collect.Maps
 *  de.maxhenkel.voicechat.resourcepacks.IPackRepository
 *  minecraft.class01055
 *  minecraft.class01057
 *  minecraft.class01283
 *  minecraft.class03767
 *  minecraft.class07536
 *  net.fabricmc.fabric.impl.resource.pack.FabricPack
 *  net.fabricmc.fabric.impl.resource.pack.ModPackResourcesUtil
 *  net.fabricmc.fabric.impl.resource.pack.ModResourcePackCreator
 *  org.jspecify.annotations.Nullable
 *  org.slf4j.Logger
 *  org.slf4j.LoggerFactory
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfo
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable
 */
package minecraft;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import de.maxhenkel.voicechat.resourcepacks.IPackRepository;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.TreeMap;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import minecraft.class01055;
import minecraft.class01057;
import minecraft.class01283;
import minecraft.class01603;
import minecraft.class01622;
import minecraft.class01626;
import minecraft.class03767;
import minecraft.class07536;
import net.fabricmc.fabric.impl.resource.pack.FabricPack;
import net.fabricmc.fabric.impl.resource.pack.ModPackResourcesUtil;
import net.fabricmc.fabric.impl.resource.pack.ModResourcePackCreator;
import org.jspecify.annotations.Nullable;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

public class class01623
implements IPackRepository {
    public Set<class01057> N;
    private Map<String, class01055> y = ImmutableMap.of();
    private List<class01055> L = ImmutableList.of();
    private static final Logger u = LoggerFactory.getLogger((String)"PackRepositoryMixin");

    public Collection<String> L() {
        return this.y.keySet();
    }

    public @Nullable class01055 L(String string) {
        return this.y.get(string);
    }

    private List<class01055> L(Collection<String> collection) {
        List list = (List)this.u(collection).collect(class07536.y());
        for (class01055 class010552 : this.y.values()) {
            if (!class010552.Z() || list.contains(class010552)) continue;
            class010552.U().N(list, (Object)class010552, class01055::B, false);
        }
        this.N(collection, null, list);
        return ImmutableList.copyOf((Collection)list);
    }

    public Collection<class01055> M() {
        return this.L;
    }

    public class01623(class01057 ... class01057Array) {
        this.N = ImmutableSet.copyOf((Object[])class01057Array);
        this.N(class01057Array, null);
    }

    public List<class01622> B() {
        return (List)this.L.stream().map(class01055::R).collect(ImmutableList.toImmutableList());
    }

    private Map<String, class01055> Z() {
        TreeMap treeMap = Maps.newTreeMap();
        Iterator<class01057> iterator = this.N.iterator();
        while (iterator.hasNext()) {
            iterator.next().method_14453(class010552 -> treeMap.put(class010552.M(), class010552));
        }
        return ImmutableMap.copyOf((Map)treeMap);
    }

    public Collection<String> i() {
        return (Collection)this.L.stream().map(class01055::M).collect(ImmutableSet.toImmutableSet());
    }

    public Collection<class01055> u() {
        return this.y.values();
    }

    public boolean u(String string) {
        return this.y.containsKey(string);
    }

    private Stream<class01055> u(Collection<String> collection) {
        return collection.stream().map(this.y::get).filter(Objects::nonNull);
    }

    public boolean y(String string) {
        class01055 class010552 = this.y.get(string);
        if (class010552 != null && this.L.contains(class010552)) {
            ArrayList arrayList = Lists.newArrayList(this.L);
            this.y(string, null, arrayList);
            arrayList.remove(class010552);
            this.L = arrayList;
            return true;
        }
        return false;
    }

    private void y(String string, CallbackInfoReturnable callbackInfoReturnable, List list) {
        if (ModResourcePackCreator.POST_CHANGE_HANDLE_REQUIRED.contains(string)) {
            Set set = list.stream().map(class01055::M).collect(Collectors.toSet());
            list.removeIf(class010552 -> !((FabricPack)class010552).fabric$parentsEnabled(set));
            u.debug("[Fabric] Internal pack auto-removed upon disabling {}, result: {}", (Object)string, (Object)list.stream().map(class01055::M).toList());
        }
    }

    public boolean y() {
        List<class01055> list = this.L(List.of());
        return !this.L.equals(list);
    }

    public void y(Collection<String> collection) {
        this.L = this.L(collection);
    }

    private void N(Collection collection, CallbackInfoReturnable callbackInfoReturnable, List list) {
        ModPackResourcesUtil.refreshAutoEnabledPacks((List)list, this.y);
    }

    public void N(class01057[] class01057Array, CallbackInfo callbackInfo) {
        this.N = new LinkedHashSet<class01057>(this.N);
        boolean bl = false;
        for (class01057 class010572 : this.N) {
            if (!(class010572 instanceof class01626) || ((class01626)class010572).y != class01283.i && ((class01626)class010572).y != class01283.R) continue;
            bl = true;
            break;
        }
        if (bl) {
            this.N.add((class01057)new ModResourcePackCreator(class01603.field_14190));
        }
    }

    private void N(String string, CallbackInfoReturnable callbackInfoReturnable, List list) {
        if (ModResourcePackCreator.POST_CHANGE_HANDLE_REQUIRED.contains(string)) {
            ModPackResourcesUtil.refreshAutoEnabledPacks((List)list, this.y);
        }
    }

    public static String N(Collection<class01055> collection) {
        return collection.stream().map(class010552 -> class010552.M() + (class010552.u().N() ? "" : " (incompatible)")).collect(Collectors.joining(", "));
    }

    public void N() {
        List list = (List)this.L.stream().map(class01055::M).collect(ImmutableList.toImmutableList());
        this.y = this.Z();
        this.L = this.L(list);
    }

    public boolean N(String string) {
        class01055 class010552 = this.y.get(string);
        if (class010552 != null && !this.L.contains(class010552)) {
            ArrayList arrayList = Lists.newArrayList(this.L);
            arrayList.add(class010552);
            this.N(string, null, (List)arrayList);
            this.L = arrayList;
            return true;
        }
        return false;
    }

    public void voicechat$addSource(class01057 class010572) {
        HashSet<class01057> hashSet = new HashSet<class01057>(this.N);
        hashSet.add(class010572);
        this.N = hashSet;
    }

    public class03767 R() {
        return this.M().stream().map(class01055::i).reduce(class03767::L).orElse(class03767.N());
    }
}

