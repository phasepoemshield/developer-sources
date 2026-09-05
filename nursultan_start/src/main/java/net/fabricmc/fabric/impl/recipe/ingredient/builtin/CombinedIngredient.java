/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00283
 *  minecraft.class00299
 *  minecraft.class06510
 *  net.fabricmc.fabric.api.recipe.v1.ingredient.CustomIngredient
 */
package net.fabricmc.fabric.impl.recipe.ingredient.builtin;

import java.util.List;
import minecraft.class00283;
import minecraft.class00299;
import minecraft.class06510;
import net.fabricmc.fabric.api.recipe.v1.ingredient.CustomIngredient;

abstract class CombinedIngredient
implements CustomIngredient {
    protected final List<class06510> ingredients;

    protected CombinedIngredient(List<class06510> list) {
        if (list.isEmpty()) {
            throw new IllegalArgumentException("ALL or ANY ingredient must have at least one sub-ingredient");
        }
        this.ingredients = list;
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (!(object instanceof CombinedIngredient)) {
            return false;
        }
        CombinedIngredient combinedIngredient = (CombinedIngredient)object;
        return this.ingredients.equals(combinedIngredient.ingredients);
    }

    public int hashCode() {
        return this.ingredients.hashCode();
    }

    public boolean requiresTesting() {
        for (class06510 class065102 : this.ingredients) {
            if (!class065102.requiresTesting()) continue;
            return true;
        }
        return false;
    }

    List<class06510> getIngredients() {
        return this.ingredients;
    }

    public class00299 toDisplay() {
        return new class00283(this.ingredients.stream().map(class06510::method_64673).toList());
    }
}

