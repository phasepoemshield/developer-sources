/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableMap
 *  com.google.common.collect.ImmutableMap$Builder
 *  com.google.common.collect.ImmutableMultimap
 *  com.google.common.collect.ImmutableMultimap$Builder
 *  com.google.common.collect.Multimap
 *  minecraft.class02950
 *  minecraft.class03729
 *  minecraft.class05838
 *  minecraft.class05946
 *  minecraft.class06521
 *  minecraft.class07299
 */
package com.viaversion.viafabricplus.features.recipe;

import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableMultimap;
import com.google.common.collect.Multimap;
import java.util.Collection;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Stream;
import minecraft.class02950;
import minecraft.class03729;
import minecraft.class05838;
import minecraft.class05946;
import minecraft.class06521;
import minecraft.class07299;

public final class RecipeManager1_11_2 {
    private final Multimap<class05838<?>, class03729<?>> recipesByType;
    private final Map<class05946<class06521<?>>, class03729<?>> recipesById;

    public RecipeManager1_11_2(Iterable<class03729<?>> iterable) {
        ImmutableMultimap.Builder builder = ImmutableMultimap.builder();
        ImmutableMap.Builder builder2 = ImmutableMap.builder();
        for (class03729<?> class037292 : iterable) {
            class05838 class058382 = class037292.y().u();
            builder.put((Object)class058382, class037292);
            builder2.put((Object)class037292.N(), class037292);
        }
        this.recipesByType = builder.build();
        this.recipesById = builder2.build();
    }

    public Optional<class03729<?>> get(class05946<class06521<?>> class059462) {
        return Optional.ofNullable(this.recipesById.get(class059462));
    }

    public Collection<class03729<?>> values() {
        return this.recipesById.values();
    }

    public Stream<class05946<class06521<?>>> keys() {
        return this.recipesById.keySet().stream();
    }

    public <I extends class02950, T extends class06521<I>> Optional<class03729<T>> getFirstMatch(class05838<T> class058382, I i, class07299 class072992) {
        if (i.y()) {
            return Optional.empty();
        }
        return this.recipesByType.get(class058382).stream().map(class037292 -> class037292).filter(class037292 -> class037292.y().method_8115(i, class072992)).findFirst();
    }
}

