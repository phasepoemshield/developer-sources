/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00667
 *  minecraft.class01659
 *  minecraft.class01666
 *  minecraft.class01894
 *  minecraft.class02362
 *  minecraft.class02389
 */
package net.fabricmc.fabric.impl.recipe.ingredient;

import java.util.HashSet;
import java.util.Set;
import minecraft.class00667;
import minecraft.class01659;
import minecraft.class01666;
import minecraft.class01894;
import minecraft.class02362;
import minecraft.class02389;
import net.fabricmc.fabric.impl.recipe.ingredient.CustomIngredientSync;

public record CustomIngredientPayloadC2S(int protocolVersion, Set<class01894> registeredSerializers) implements class01659
{
    public static final class02362<class00667, CustomIngredientPayloadC2S> CODEC = class02362.N((class02362)class02389.B, CustomIngredientPayloadC2S::protocolVersion, (class02362)class02389.N(HashSet::new, (class02362)class01894.y), CustomIngredientPayloadC2S::registeredSerializers, CustomIngredientPayloadC2S::new);
    public static final class01666<CustomIngredientPayloadC2S> ID = new class01666(CustomIngredientSync.PACKET_ID);

    public class01666<? extends class01659> method_56479() {
        return ID;
    }
}

