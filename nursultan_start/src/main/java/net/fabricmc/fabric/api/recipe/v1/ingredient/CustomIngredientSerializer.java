/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.MapCodec
 *  minecraft.class01894
 *  minecraft.class02362
 *  minecraft.class04247
 *  net.fabricmc.fabric.impl.recipe.ingredient.CustomIngredientImpl
 *  org.jspecify.annotations.Nullable
 */
package net.fabricmc.fabric.api.recipe.v1.ingredient;

import com.mojang.serialization.MapCodec;
import minecraft.class01894;
import minecraft.class02362;
import minecraft.class04247;
import net.fabricmc.fabric.api.recipe.v1.ingredient.CustomIngredient;
import net.fabricmc.fabric.impl.recipe.ingredient.CustomIngredientImpl;
import org.jspecify.annotations.Nullable;

public interface CustomIngredientSerializer<T extends CustomIngredient> {
    public class01894 getIdentifier();

    public static @Nullable CustomIngredientSerializer<?> get(class01894 class018942) {
        return CustomIngredientImpl.getSerializer((class01894)class018942);
    }

    public static void register(CustomIngredientSerializer<?> customIngredientSerializer) {
        CustomIngredientImpl.registerSerializer(customIngredientSerializer);
    }

    public class02362<class04247, T> getPacketCodec();

    public MapCodec<T> getCodec();
}

