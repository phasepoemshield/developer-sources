/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableMap
 *  com.google.common.collect.ImmutableMap$Builder
 *  com.google.common.collect.ImmutableMultimap
 *  com.google.common.collect.ImmutableMultimap$Builder
 *  com.google.common.collect.Multimap
 *  com.llamalad7.mixinextras.sugar.impl.ref.generated.LocalRefImpl
 *  com.llamalad7.mixinextras.sugar.ref.LocalRef
 *  minecraft.class02950
 *  minecraft.class03729
 *  minecraft.class05838
 *  minecraft.class05946
 *  minecraft.class06514
 *  minecraft.class06521
 *  minecraft.class07299
 *  net.fabricmc.fabric.impl.recipe.sync.RecipeSyncImpl
 *  net.fabricmc.fabric.impl.recipe.sync.SyncedSerializerAwarePreparedRecipe
 *  org.jspecify.annotations.Nullable
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable
 */
package minecraft;

import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableMultimap;
import com.google.common.collect.Multimap;
import com.llamalad7.mixinextras.sugar.impl.ref.generated.LocalRefImpl;
import com.llamalad7.mixinextras.sugar.ref.LocalRef;
import java.util.ArrayList;
import java.util.Collection;
import java.util.IdentityHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Stream;
import minecraft.class02950;
import minecraft.class03729;
import minecraft.class05838;
import minecraft.class05946;
import minecraft.class06514;
import minecraft.class06521;
import minecraft.class07299;
import net.fabricmc.fabric.impl.recipe.sync.RecipeSyncImpl;
import net.fabricmc.fabric.impl.recipe.sync.SyncedSerializerAwarePreparedRecipe;
import org.jspecify.annotations.Nullable;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

public class class00237
implements SyncedSerializerAwarePreparedRecipe {
    public static final class00237 N = new class00237((Multimap<class05838<?>, class03729<?>>)ImmutableMultimap.of(), Map.of());
    private final Multimap<class05838<?>, class03729<?>> y;
    private final Map<class05946<class06521<?>>, class03729<?>> L;
    private Map u;

    private class00237(Multimap<class05838<?>, class03729<?>> multimap, Map<class05946<class06521<?>>, class03729<?>> map) {
        this.y = multimap;
        this.L = map;
    }

    private static void N(Iterable iterable, CallbackInfoReturnable callbackInfoReturnable, LocalRef localRef) {
        IdentityHashMap identityHashMap = new IdentityHashMap();
        for (class06514 var5 : RecipeSyncImpl.getSyncedSerializers()) {
            identityHashMap.put(var5, new ArrayList());
        }
        localRef.set(identityHashMap);
    }

    private static void N(Iterable iterable, CallbackInfoReturnable callbackInfoReturnable, class03729 class037292, LocalRef localRef) {
        List list = (List)((IdentityHashMap)localRef.get()).get(class037292.y().method_8119());
        if (list != null) {
            list.add(class037292);
        }
    }

    private static class00237 N(class00237 class002372, LocalRef localRef) {
        class002372.u = (Map)localRef.get();
        return class002372;
    }

    public static class00237 N(Iterable<class03729<?>> iterable) {
        LocalRefImpl localRefImpl = new LocalRefImpl();
        localRefImpl.init(null);
        class00237.N(iterable, null, (LocalRef)localRefImpl);
        ImmutableMultimap.Builder builder = ImmutableMultimap.builder();
        ImmutableMap.Builder builder2 = ImmutableMap.builder();
        for (class03729<?> class037292 : iterable) {
            builder.put((Object)class037292.y().u(), class037292);
            class05946 class059462 = class037292.N();
            class00237.N(iterable, null, class037292, (LocalRef)localRefImpl);
            builder2.put((Object)class059462, class037292);
        }
        return class00237.N(new class00237((Multimap<class05838<?>, class03729<?>>)builder.build(), (Map<class05946<class06521<?>>, class03729<?>>)builder2.build()), (LocalRef)localRefImpl);
    }

    public <I extends class02950, T extends class06521<I>> Collection<class03729<T>> N(class05838<T> class058382) {
        return this.y.get(class058382);
    }

    public Collection<class03729<?>> N() {
        return this.L.values();
    }

    public @Nullable class03729<?> N(class05946<class06521<?>> class059462) {
        return this.L.get(class059462);
    }

    public <I extends class02950, T extends class06521<I>> Stream<class03729<T>> N(class05838<T> class058382, I i, class07299 class072992) {
        if (i.y()) {
            return Stream.empty();
        }
        return this.N(class058382).stream().filter(class037292 -> class037292.y().method_8115(i, class072992));
    }

    public @Nullable List fabric_getRecipesBySyncedSerializer(class06514 class065142) {
        return (List)this.u.get(class065142);
    }
}

