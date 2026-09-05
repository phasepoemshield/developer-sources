/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00283
 *  minecraft.class00299
 *  minecraft.class00302
 *  minecraft.class02484
 *  minecraft.class02837
 *  minecraft.class03556
 *  minecraft.class06510
 *  minecraft.class06581
 *  minecraft.class06584
 *  minecraft.class07001
 *  net.fabricmc.fabric.api.recipe.v1.ingredient.CustomIngredient
 *  net.fabricmc.fabric.api.recipe.v1.ingredient.CustomIngredientSerializer
 */
package net.fabricmc.fabric.impl.recipe.ingredient.builtin;

import java.util.Objects;
import java.util.stream.Stream;
import minecraft.class00283;
import minecraft.class00299;
import minecraft.class00302;
import minecraft.class02484;
import minecraft.class02837;
import minecraft.class03556;
import minecraft.class06510;
import minecraft.class06581;
import minecraft.class06584;
import minecraft.class07001;
import net.fabricmc.fabric.api.recipe.v1.ingredient.CustomIngredient;
import net.fabricmc.fabric.api.recipe.v1.ingredient.CustomIngredientSerializer;
import net.fabricmc.fabric.impl.recipe.ingredient.builtin.CustomDataIngredient$Serializer;

public class CustomDataIngredient
implements CustomIngredient {
    public static final CustomIngredientSerializer<CustomDataIngredient> SERIALIZER = new CustomDataIngredient$Serializer();
    private final class06510 base;
    private final class07001 nbt;

    private class06510 getBase() {
        return this.base;
    }

    public CustomDataIngredient(class06510 class065102, class07001 class070012) {
        if (class070012 == null || class070012.z()) {
            throw new IllegalArgumentException("NBT cannot be null; use components ingredient for strict matching");
        }
        this.base = class065102;
        this.nbt = class070012;
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object == null || this.getClass() != object.getClass()) {
            return false;
        }
        CustomDataIngredient customDataIngredient = (CustomDataIngredient)object;
        return this.base.equals((Object)customDataIngredient.base) && this.nbt.equals((Object)customDataIngredient.nbt);
    }

    public int hashCode() {
        return Objects.hash(this.base, this.nbt);
    }

    public boolean test(class06584 class065842) {
        if (!this.base.method_8093(class065842)) {
            return false;
        }
        class02837 class028372 = (class02837)class065842.method_58694(class02484.y);
        return class028372 != null && class028372.y(this.nbt);
    }

    private class07001 getNbt() {
        return this.nbt;
    }

    public boolean requiresTesting() {
        return true;
    }

    public Stream<class03556<class06581>> getMatchingItems() {
        return this.base.method_8105();
    }

    public CustomIngredientSerializer<?> getSerializer() {
        return SERIALIZER;
    }

    private class00299 createEntryDisplay(class03556<class06581> class035562) {
        class06584 class065842 = ((class06581)class035562.N()).E();
        class065842.N(class02484.y, (Object)class02837.N, class028372 -> class02837.N((class07001)class028372.y().N(this.nbt)));
        return new class00302(class065842);
    }

    public class00299 toDisplay() {
        return new class00283(this.base.method_8105().map(this::createEntryDisplay).toList());
    }
}

