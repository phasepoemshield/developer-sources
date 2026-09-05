/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class02950
 *  minecraft.class03729
 *  minecraft.class05838
 *  minecraft.class05946
 *  minecraft.class06521
 *  minecraft.class07299
 *  org.jspecify.annotations.Nullable
 */
package net.fabricmc.fabric.api.recipe.v1.sync;

import java.util.Collection;
import java.util.Optional;
import java.util.stream.Stream;
import minecraft.class02950;
import minecraft.class03729;
import minecraft.class05838;
import minecraft.class05946;
import minecraft.class06521;
import minecraft.class07299;
import org.jspecify.annotations.Nullable;

public interface SynchronizedRecipes {
    default public <T extends class06521<?>> @Nullable class03729<T> get(class05838<T> class058382, class05946<class06521<?>> class059462) {
        class03729<?> class037292 = this.get(class059462);
        return class037292 != null && class037292.y().u().equals(class058382) ? class037292 : null;
    }

    public @Nullable class03729<?> get(class05946<class06521<?>> var1);

    public <I extends class02950, T extends class06521<I>> Collection<class03729<T>> getAllOfType(class05838<T> var1);

    public <I extends class02950, T extends class06521<I>> Stream<class03729<T>> getAllMatches(class05838<T> var1, I var2, class07299 var3);

    public Collection<class03729<?>> recipes();

    default public <I extends class02950, T extends class06521<I>> Optional<class03729<T>> getFirstMatch(class05838<T> class058382, I i, class07299 class072992, @Nullable class03729<T> class037292) {
        return class037292 != null && class037292.y().method_8115(i, class072992) ? Optional.of(class037292) : this.getFirstMatch(class058382, i, class072992);
    }

    default public <I extends class02950, T extends class06521<I>> Optional<class03729<T>> getFirstMatch(class05838<T> class058382, I i, class07299 class072992, @Nullable class05946<class06521<?>> class059462) {
        class03729<T> class037292 = class059462 != null ? this.get(class058382, class059462) : null;
        return this.getFirstMatch(class058382, i, class072992, class037292);
    }

    public <I extends class02950, T extends class06521<I>> Optional<class03729<T>> getFirstMatch(class05838<T> var1, I var2, class07299 var3);
}

