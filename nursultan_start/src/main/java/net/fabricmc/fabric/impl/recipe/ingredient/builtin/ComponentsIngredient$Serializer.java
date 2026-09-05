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
 *  minecraft.class02678
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
import minecraft.class02678;
import minecraft.class04247;
import minecraft.class06510;
import net.fabricmc.fabric.api.recipe.v1.ingredient.CustomIngredientSerializer;
import net.fabricmc.fabric.impl.recipe.ingredient.builtin.ComponentsIngredient;

class ComponentsIngredient$Serializer
implements CustomIngredientSerializer<ComponentsIngredient> {
    private static final class01894 ID = class01894.N((String)"fabric", (String)"components");
    private static final MapCodec<ComponentsIngredient> CODEC = RecordCodecBuilder.mapCodec(instance -> instance.group((App)class06510.field_46095.fieldOf("base").forGetter(ComponentsIngredient::getBase), (App)class02678.y.fieldOf("components").forGetter(ComponentsIngredient::getComponents)).apply((Applicative)instance, ComponentsIngredient::new));
    private static final class02362<class04247, ComponentsIngredient> PACKET_CODEC = class02362.N((class02362)class06510.field_48355, ComponentsIngredient::getBase, (class02362)class02678.L, ComponentsIngredient::getComponents, ComponentsIngredient::new);

    public class01894 getIdentifier() {
        return ID;
    }

    ComponentsIngredient$Serializer() {
    }

    public class02362<class04247, ComponentsIngredient> getPacketCodec() {
        return PACKET_CODEC;
    }

    public MapCodec<ComponentsIngredient> getCodec() {
        return CODEC;
    }
}

