/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.datafixers.kinds.Applicative
 *  com.mojang.serialization.MapCodec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  minecraft.class01894
 *  minecraft.class02362
 *  minecraft.class04247
 *  minecraft.class06510
 *  net.fabricmc.fabric.api.recipe.v1.ingredient.CustomIngredientSerializer
 */
package net.fabricmc.fabric.impl.recipe.ingredient.builtin;

import com.mojang.datafixers.kinds.App;
import com.mojang.datafixers.kinds.Applicative;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import minecraft.class01894;
import minecraft.class02362;
import minecraft.class04247;
import minecraft.class06510;
import net.fabricmc.fabric.api.recipe.v1.ingredient.CustomIngredientSerializer;
import net.fabricmc.fabric.impl.recipe.ingredient.builtin.DifferenceIngredient;

class DifferenceIngredient$Serializer
implements CustomIngredientSerializer<DifferenceIngredient> {
    private static final class01894 ID = class01894.N((String)"fabric", (String)"difference");
    private static final MapCodec<DifferenceIngredient> CODEC = RecordCodecBuilder.mapCodec(instance -> instance.group((App)class06510.field_46095.fieldOf("base").forGetter(DifferenceIngredient::getBase), (App)class06510.field_46095.fieldOf("subtracted").forGetter(DifferenceIngredient::getSubtracted)).apply((Applicative)instance, DifferenceIngredient::new));
    private static final class02362<class04247, DifferenceIngredient> PACKET_CODEC = class02362.N((class02362)class06510.field_48355, DifferenceIngredient::getBase, (class02362)class06510.field_48355, DifferenceIngredient::getSubtracted, DifferenceIngredient::new);

    public class01894 getIdentifier() {
        return ID;
    }

    DifferenceIngredient$Serializer() {
    }

    public class02362<class04247, DifferenceIngredient> getPacketCodec() {
        return PACKET_CODEC;
    }

    public MapCodec<DifferenceIngredient> getCodec() {
        return CODEC;
    }
}

