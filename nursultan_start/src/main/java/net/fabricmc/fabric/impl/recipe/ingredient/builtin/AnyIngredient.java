/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.MapCodec
 *  minecraft.class01894
 *  minecraft.class03556
 *  minecraft.class06510
 *  minecraft.class06581
 *  minecraft.class06584
 *  net.fabricmc.fabric.api.recipe.v1.ingredient.CustomIngredientSerializer
 */
package net.fabricmc.fabric.impl.recipe.ingredient.builtin;

import com.mojang.serialization.MapCodec;
import java.util.List;
import java.util.stream.Stream;
import minecraft.class01894;
import minecraft.class03556;
import minecraft.class06510;
import minecraft.class06581;
import minecraft.class06584;
import net.fabricmc.fabric.api.recipe.v1.ingredient.CustomIngredientSerializer;
import net.fabricmc.fabric.impl.recipe.ingredient.builtin.CombinedIngredient;
import net.fabricmc.fabric.impl.recipe.ingredient.builtin.CombinedIngredient$Serializer;

public class AnyIngredient
extends CombinedIngredient {
    private static final MapCodec<AnyIngredient> CODEC = class06510.field_46095.listOf().fieldOf("ingredients").xmap(AnyIngredient::new, CombinedIngredient::getIngredients);
    public static final CustomIngredientSerializer<AnyIngredient> SERIALIZER = new CombinedIngredient$Serializer<AnyIngredient>(class01894.N((String)"fabric", (String)"any"), AnyIngredient::new, CODEC);

    public AnyIngredient(List<class06510> list) {
        super(list);
    }

    public boolean test(class06584 class065842) {
        for (class06510 class065102 : this.ingredients) {
            if (!class065102.method_8093(class065842)) continue;
            return true;
        }
        return false;
    }

    public Stream<class03556<class06581>> getMatchingItems() {
        return this.ingredients.stream().flatMap(class06510::method_8105);
    }

    public CustomIngredientSerializer<?> getSerializer() {
        return SERIALIZER;
    }
}

