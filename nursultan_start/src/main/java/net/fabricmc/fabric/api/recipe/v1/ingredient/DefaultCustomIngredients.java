/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class02678
 *  minecraft.class02713
 *  minecraft.class06510
 *  minecraft.class06584
 *  minecraft.class07001
 *  minecraft.class07310
 *  net.fabricmc.fabric.impl.recipe.ingredient.builtin.AllIngredient
 *  net.fabricmc.fabric.impl.recipe.ingredient.builtin.AnyIngredient
 *  net.fabricmc.fabric.impl.recipe.ingredient.builtin.ComponentsIngredient
 *  net.fabricmc.fabric.impl.recipe.ingredient.builtin.CustomDataIngredient
 *  net.fabricmc.fabric.impl.recipe.ingredient.builtin.DifferenceIngredient
 */
package net.fabricmc.fabric.api.recipe.v1.ingredient;

import java.util.List;
import java.util.Objects;
import java.util.function.UnaryOperator;
import minecraft.class02678;
import minecraft.class02713;
import minecraft.class06510;
import minecraft.class06584;
import minecraft.class07001;
import minecraft.class07310;
import net.fabricmc.fabric.impl.recipe.ingredient.builtin.AllIngredient;
import net.fabricmc.fabric.impl.recipe.ingredient.builtin.AnyIngredient;
import net.fabricmc.fabric.impl.recipe.ingredient.builtin.ComponentsIngredient;
import net.fabricmc.fabric.impl.recipe.ingredient.builtin.CustomDataIngredient;
import net.fabricmc.fabric.impl.recipe.ingredient.builtin.DifferenceIngredient;

public final class DefaultCustomIngredients {
    public static class06510 components(class06510 class065102, UnaryOperator<class02713> unaryOperator) {
        return DefaultCustomIngredients.components(class065102, ((class02713)unaryOperator.apply(class02678.N())).N());
    }

    public static class06510 components(class06584 class065842) {
        Objects.requireNonNull(class065842, "Stack cannot be null");
        return DefaultCustomIngredients.components(class06510.method_8091((class07310[])new class07310[]{class065842.B()}), class065842.u());
    }

    public static class06510 components(class06510 class065102, class02678 class026782) {
        Objects.requireNonNull(class065102, "Base ingredient cannot be null");
        Objects.requireNonNull(class026782, "Component changes cannot be null");
        return new ComponentsIngredient(class065102, class026782).toVanilla();
    }

    public static class06510 difference(class06510 class065102, class06510 class065103) {
        Objects.requireNonNull(class065102, "Base ingredient cannot be null");
        Objects.requireNonNull(class065103, "Subtracted ingredient cannot be null");
        return new DifferenceIngredient(class065102, class065103).toVanilla();
    }

    private DefaultCustomIngredients() {
    }

    public static class06510 all(class06510 ... class06510Array) {
        for (class06510 class065102 : class06510Array) {
            Objects.requireNonNull(class065102, "Ingredient cannot be null");
        }
        return new AllIngredient(List.of(class06510Array)).toVanilla();
    }

    public static class06510 any(class06510 ... class06510Array) {
        for (class06510 class065102 : class06510Array) {
            Objects.requireNonNull(class065102, "Ingredient cannot be null");
        }
        return new AnyIngredient(List.of(class06510Array)).toVanilla();
    }

    public static class06510 customData(class06510 class065102, class07001 class070012) {
        return new CustomDataIngredient(class065102, class070012).toVanilla();
    }
}

