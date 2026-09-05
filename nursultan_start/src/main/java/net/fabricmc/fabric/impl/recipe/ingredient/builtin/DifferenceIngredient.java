/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class03556
 *  minecraft.class06510
 *  minecraft.class06581
 *  minecraft.class06584
 *  net.fabricmc.fabric.api.recipe.v1.ingredient.CustomIngredient
 *  net.fabricmc.fabric.api.recipe.v1.ingredient.CustomIngredientSerializer
 */
package net.fabricmc.fabric.impl.recipe.ingredient.builtin;

import java.util.List;
import java.util.Objects;
import java.util.stream.Stream;
import minecraft.class03556;
import minecraft.class06510;
import minecraft.class06581;
import minecraft.class06584;
import net.fabricmc.fabric.api.recipe.v1.ingredient.CustomIngredient;
import net.fabricmc.fabric.api.recipe.v1.ingredient.CustomIngredientSerializer;
import net.fabricmc.fabric.impl.recipe.ingredient.builtin.DifferenceIngredient$Serializer;

public class DifferenceIngredient
implements CustomIngredient {
    public static final CustomIngredientSerializer<DifferenceIngredient> SERIALIZER = new DifferenceIngredient$Serializer();
    private final class06510 base;
    private final class06510 subtracted;

    private class06510 getBase() {
        return this.base;
    }

    public DifferenceIngredient(class06510 class065102, class06510 class065103) {
        this.base = class065102;
        this.subtracted = class065103;
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object == null || this.getClass() != object.getClass()) {
            return false;
        }
        DifferenceIngredient differenceIngredient = (DifferenceIngredient)object;
        return this.base.equals((Object)differenceIngredient.base) && this.subtracted.equals((Object)differenceIngredient.subtracted);
    }

    public int hashCode() {
        return Objects.hash(this.base, this.subtracted);
    }

    public boolean test(class06584 class065842) {
        return this.base.method_8093(class065842) && !this.subtracted.method_8093(class065842);
    }

    public boolean requiresTesting() {
        return this.base.requiresTesting() || this.subtracted.requiresTesting();
    }

    public Stream<class03556<class06581>> getMatchingItems() {
        List list = this.subtracted.method_8105().toList();
        return this.base.method_8105().filter(class035562 -> !list.contains(class035562));
    }

    public CustomIngredientSerializer<?> getSerializer() {
        return SERIALIZER;
    }

    private class06510 getSubtracted() {
        return this.subtracted;
    }
}

