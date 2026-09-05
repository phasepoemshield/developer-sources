/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.fabricmc.fabric.impl.recipe.sync.SynchronizedRecipesImpl
 */
package net.fabricmc.fabric.api.recipe.v1;

import net.fabricmc.fabric.api.recipe.v1.sync.SynchronizedRecipes;
import net.fabricmc.fabric.impl.recipe.sync.SynchronizedRecipesImpl;

public interface FabricRecipeManager {
    default public SynchronizedRecipes getSynchronizedRecipes() {
        return SynchronizedRecipesImpl.EMPTY;
    }
}

