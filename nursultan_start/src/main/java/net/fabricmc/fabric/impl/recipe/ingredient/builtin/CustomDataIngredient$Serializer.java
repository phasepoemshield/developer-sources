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
 *  minecraft.class02389
 *  minecraft.class04247
 *  minecraft.class06510
 *  minecraft.class07755
 *  net.fabricmc.fabric.api.recipe.v1.ingredient.CustomIngredientSerializer
 */
package net.fabricmc.fabric.impl.recipe.ingredient.builtin;

import com.mojang.datafixers.kinds.App;
import com.mojang.datafixers.kinds.Applicative;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import minecraft.class01894;
import minecraft.class02362;
import minecraft.class02389;
import minecraft.class04247;
import minecraft.class06510;
import minecraft.class07755;
import net.fabricmc.fabric.api.recipe.v1.ingredient.CustomIngredientSerializer;
import net.fabricmc.fabric.impl.recipe.ingredient.builtin.CustomDataIngredient;

class CustomDataIngredient$Serializer
implements CustomIngredientSerializer<CustomDataIngredient> {
    private static final class01894 ID = class01894.N((String)"fabric", (String)"custom_data");
    private static final MapCodec<CustomDataIngredient> CODEC = RecordCodecBuilder.mapCodec(instance -> instance.group((App)class06510.field_46095.fieldOf("base").forGetter(CustomDataIngredient::getBase), (App)class07755.R.fieldOf("nbt").forGetter(CustomDataIngredient::getNbt)).apply((Applicative)instance, CustomDataIngredient::new));
    private static final class02362<class04247, CustomDataIngredient> PACKET_CODEC = class02362.N((class02362)class06510.field_48355, CustomDataIngredient::getBase, (class02362)class02389.j, CustomDataIngredient::getNbt, CustomDataIngredient::new);

    public class01894 getIdentifier() {
        return ID;
    }

    CustomDataIngredient$Serializer() {
    }

    public class02362<class04247, CustomDataIngredient> getPacketCodec() {
        return PACKET_CODEC;
    }

    public MapCodec<CustomDataIngredient> getCodec() {
        return CODEC;
    }
}

