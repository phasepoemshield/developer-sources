/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00283
 *  minecraft.class00299
 *  minecraft.class03556
 *  minecraft.class06510
 *  minecraft.class06581
 *  minecraft.class06584
 *  net.fabricmc.fabric.impl.recipe.ingredient.CustomIngredientImpl
 */
package net.fabricmc.fabric.api.recipe.v1.ingredient;

import java.util.stream.Stream;
import minecraft.class00283;
import minecraft.class00299;
import minecraft.class03556;
import minecraft.class06510;
import minecraft.class06581;
import minecraft.class06584;
import net.fabricmc.fabric.api.recipe.v1.ingredient.CustomIngredientSerializer;
import net.fabricmc.fabric.impl.recipe.ingredient.CustomIngredientImpl;

public interface CustomIngredient {
    public boolean test(class06584 var1);

    public boolean requiresTesting();

    public Stream<class03556<class06581>> getMatchingItems();

    public CustomIngredientSerializer<?> getSerializer();

    default public class00299 toDisplay() {
        return new class00283(this.getMatchingItems().map(class06510::method_64981).toList());
    }

    default public class06510 toVanilla() {
        return new CustomIngredientImpl(this);
    }
}

