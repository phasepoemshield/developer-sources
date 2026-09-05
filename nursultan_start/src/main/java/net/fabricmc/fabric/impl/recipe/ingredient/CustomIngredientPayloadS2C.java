/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00667
 *  minecraft.class01659
 *  minecraft.class01666
 *  minecraft.class02362
 *  minecraft.class02389
 */
package net.fabricmc.fabric.impl.recipe.ingredient;

import minecraft.class00667;
import minecraft.class01659;
import minecraft.class01666;
import minecraft.class02362;
import minecraft.class02389;
import net.fabricmc.fabric.impl.recipe.ingredient.CustomIngredientSync;

public record CustomIngredientPayloadS2C(int protocolVersion) implements class01659
{
    public static final class02362<class00667, CustomIngredientPayloadS2C> CODEC = class02362.N((class02362)class02389.B, CustomIngredientPayloadS2C::protocolVersion, CustomIngredientPayloadS2C::new);
    public static final class01666<CustomIngredientPayloadS2C> ID = new class01666(CustomIngredientSync.PACKET_ID);

    public class01666<? extends class01659> method_56479() {
        return ID;
    }
}

