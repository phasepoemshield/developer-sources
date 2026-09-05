/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class03556
 *  minecraft.class03767
 *  minecraft.class06510
 *  minecraft.class06525
 *  minecraft.class06581
 *  net.fabricmc.fabric.api.event.Event
 *  net.fabricmc.fabric.api.event.EventFactory
 */
package net.fabricmc.fabric.api.registry;

import minecraft.class03556;
import minecraft.class03767;
import minecraft.class06510;
import minecraft.class06525;
import minecraft.class06581;
import net.fabricmc.fabric.api.event.Event;
import net.fabricmc.fabric.api.event.EventFactory;
import net.fabricmc.fabric.api.registry.FabricBrewingRecipeRegistryBuilder$BuildCallback;

public interface FabricBrewingRecipeRegistryBuilder {
    public static final Event<FabricBrewingRecipeRegistryBuilder$BuildCallback> BUILD = EventFactory.createArrayBacked(FabricBrewingRecipeRegistryBuilder$BuildCallback.class, fabricBrewingRecipeRegistryBuilder$BuildCallbackArray -> class105822 -> {
        for (FabricBrewingRecipeRegistryBuilder$BuildCallback fabricBrewingRecipeRegistryBuilder$BuildCallback : fabricBrewingRecipeRegistryBuilder$BuildCallbackArray) {
            fabricBrewingRecipeRegistryBuilder$BuildCallback.build(class105822);
        }
    });

    default public void registerPotionRecipe(class03556<class06525> class035562, class06510 class065102, class03556<class06525> class035563) {
        throw new AssertionError((Object)"Must be implemented via interface injection");
    }

    default public void registerItemRecipe(class06581 class065812, class06510 class065102, class06581 class065813) {
        throw new AssertionError((Object)"Must be implemented via interface injection");
    }

    default public void registerRecipes(class06510 class065102, class03556<class06525> class035562) {
        throw new AssertionError((Object)"Must be implemented via interface injection");
    }

    default public class03767 getEnabledFeatures() {
        throw new AssertionError((Object)"Must be implemented via interface injection");
    }
}

