/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class06202
 *  net.fabricmc.api.EnvType
 *  net.fabricmc.api.Environment
 *  net.fabricmc.fabric.api.event.Event
 *  net.fabricmc.fabric.api.event.EventFactory
 *  net.fabricmc.fabric.api.recipe.v1.sync.SynchronizedRecipes
 */
package net.fabricmc.fabric.api.client.recipe.v1.sync;

import minecraft.class06202;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.event.Event;
import net.fabricmc.fabric.api.event.EventFactory;
import net.fabricmc.fabric.api.recipe.v1.sync.SynchronizedRecipes;

@Environment(value=EnvType.CLIENT)
public interface ClientRecipeSynchronizedEvent {
    public static final Event<ClientRecipeSynchronizedEvent> EVENT = EventFactory.createArrayBacked(ClientRecipeSynchronizedEvent.class, clientRecipeSynchronizedEventArray -> (class062022, synchronizedRecipes) -> {
        for (ClientRecipeSynchronizedEvent clientRecipeSynchronizedEvent : clientRecipeSynchronizedEventArray) {
            clientRecipeSynchronizedEvent.onRecipesSynchronized(class062022, synchronizedRecipes);
        }
    });

    public void onRecipesSynchronized(class06202 var1, SynchronizedRecipes var2);
}

