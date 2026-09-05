/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.fabricmc.api.EnvType
 *  net.fabricmc.api.Environment
 *  net.fabricmc.fabric.api.recipe.v1.sync.SynchronizedRecipes
 */
package net.fabricmc.fabric.impl.recipe.sync.client;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.recipe.v1.sync.SynchronizedRecipes;

@Environment(value=EnvType.CLIENT)
public interface SynchronizedClientRecipesSetter {
    public void fabric_setSynchronizedClientRecipes(SynchronizedRecipes var1);
}

