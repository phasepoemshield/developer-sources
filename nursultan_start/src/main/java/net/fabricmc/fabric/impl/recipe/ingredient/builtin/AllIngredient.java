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
import java.util.ArrayList;
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

public class AllIngredient
extends CombinedIngredient {
    private static final MapCodec<AllIngredient> CODEC = class06510.field_46095.listOf().fieldOf("ingredients").xmap(AllIngredient::new, CombinedIngredient::getIngredients);
    public static final CustomIngredientSerializer<AllIngredient> SERIALIZER = new CombinedIngredient$Serializer<AllIngredient>(class01894.N((String)"fabric", (String)"all"), AllIngredient::new, CODEC);

    public AllIngredient(List<class06510> list) {
        super(list);
    }

    public boolean test(class06584 class065842) {
        for (class06510 class065102 : this.ingredients) {
            if (class065102.method_8093(class065842)) continue;
            return false;
        }
        return true;
    }

    public Stream<class03556<class06581>> getMatchingItems() {
        ArrayList<class03556> arrayList = new ArrayList<class03556>(((class06510)this.ingredients.getFirst()).method_8105().toList());
        for (int i = 1; i < this.ingredients.size(); ++i) {
            class06510 class065102 = (class06510)this.ingredients.get(i);
            arrayList.removeIf(class035562 -> !class065102.method_8093(((class06581)class035562.N()).E()));
        }
        return arrayList.stream();
    }

    public CustomIngredientSerializer<?> getSerializer() {
        return SERIALIZER;
    }
}

