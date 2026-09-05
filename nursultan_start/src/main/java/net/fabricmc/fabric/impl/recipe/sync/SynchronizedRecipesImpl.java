/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00237
 *  minecraft.class02950
 *  minecraft.class03729
 *  minecraft.class05838
 *  minecraft.class05946
 *  minecraft.class06521
 *  minecraft.class07299
 *  net.fabricmc.fabric.api.recipe.v1.sync.SynchronizedRecipes
 *  org.jspecify.annotations.Nullable
 */
package net.fabricmc.fabric.impl.recipe.sync;

import java.util.Collection;
import java.util.Optional;
import java.util.stream.Stream;
import minecraft.class00237;
import minecraft.class02950;
import minecraft.class03729;
import minecraft.class05838;
import minecraft.class05946;
import minecraft.class06521;
import minecraft.class07299;
import net.fabricmc.fabric.api.recipe.v1.sync.SynchronizedRecipes;
import org.jspecify.annotations.Nullable;

public record SynchronizedRecipesImpl(class00237 preparedRecipes) implements SynchronizedRecipes
{
    public static final SynchronizedRecipesImpl EMPTY = new SynchronizedRecipesImpl(class00237.N);

    public @Nullable class03729<?> get(class05946<class06521<?>> class059462) {
        return this.preparedRecipes.N(class059462);
    }

    public static SynchronizedRecipesImpl of(Iterable<class03729<?>> iterable) {
        return new SynchronizedRecipesImpl(class00237.N(iterable));
    }

    public <I extends class02950, T extends class06521<I>> Collection<class03729<T>> getAllOfType(class05838<T> class058382) {
        return this.preparedRecipes.N(class058382);
    }

    public <I extends class02950, T extends class06521<I>> Stream<class03729<T>> getAllMatches(class05838<T> class058382, I i, class07299 class072992) {
        return this.preparedRecipes.N(class058382, i, class072992);
    }

    public Collection<class03729<?>> recipes() {
        return this.preparedRecipes.N();
    }

    public <I extends class02950, T extends class06521<I>> Optional<class03729<T>> getFirstMatch(class05838<T> class058382, I i, class07299 class072992) {
        return this.preparedRecipes.N(class058382, i, class072992).findFirst();
    }
}

