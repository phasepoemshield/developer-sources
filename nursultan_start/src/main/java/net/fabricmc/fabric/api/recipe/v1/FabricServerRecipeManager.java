/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class02950
 *  minecraft.class03729
 *  minecraft.class05838
 *  minecraft.class06521
 *  minecraft.class07299
 */
package net.fabricmc.fabric.api.recipe.v1;

import java.util.Collection;
import java.util.stream.Stream;
import minecraft.class02950;
import minecraft.class03729;
import minecraft.class05838;
import minecraft.class06521;
import minecraft.class07299;
import net.fabricmc.fabric.api.recipe.v1.FabricRecipeManager;

public interface FabricServerRecipeManager
extends FabricRecipeManager {
    default public <I extends class02950, T extends class06521<I>> Collection<class03729<T>> getAllOfType(class05838<T> class058382) {
        throw new AssertionError((Object)"Implemented in Mixin");
    }

    default public <I extends class02950, T extends class06521<I>> Stream<class03729<T>> getAllMatches(class05838<T> class058382, I i, class07299 class072992) {
        throw new AssertionError((Object)"Implemented in Mixin");
    }
}

