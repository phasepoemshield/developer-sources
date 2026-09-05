/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.MapCodec
 *  minecraft.class01894
 *  minecraft.class02362
 *  minecraft.class02389
 *  minecraft.class04247
 *  minecraft.class06510
 *  net.fabricmc.fabric.api.recipe.v1.ingredient.CustomIngredientSerializer
 */
package net.fabricmc.fabric.impl.recipe.ingredient.builtin;

import com.mojang.serialization.MapCodec;
import java.util.List;
import java.util.function.Function;
import minecraft.class01894;
import minecraft.class02362;
import minecraft.class02389;
import minecraft.class04247;
import minecraft.class06510;
import net.fabricmc.fabric.api.recipe.v1.ingredient.CustomIngredientSerializer;
import net.fabricmc.fabric.impl.recipe.ingredient.builtin.CombinedIngredient;

class CombinedIngredient$Serializer<I extends CombinedIngredient>
implements CustomIngredientSerializer<I> {
    private final class01894 identifier;
    private final MapCodec<I> codec;
    private final class02362<class04247, I> packetCodec;

    public class01894 getIdentifier() {
        return this.identifier;
    }

    CombinedIngredient$Serializer(class01894 class018942, Function<List<class06510>, I> function, MapCodec<I> mapCodec) {
        this.identifier = class018942;
        this.codec = mapCodec;
        this.packetCodec = class06510.field_48355.N_33(class02389.N()).N_10(function, CombinedIngredient::getIngredients);
    }

    public class02362<class04247, I> getPacketCodec() {
        return this.packetCodec;
    }

    public MapCodec<I> getCodec() {
        return this.codec;
    }
}

