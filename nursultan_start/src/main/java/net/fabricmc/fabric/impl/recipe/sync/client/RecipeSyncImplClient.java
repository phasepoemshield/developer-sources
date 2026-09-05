/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class01683
 *  net.fabricmc.api.ClientModInitializer
 *  net.fabricmc.api.EnvType
 *  net.fabricmc.api.Environment
 *  net.fabricmc.fabric.api.client.networking.v1.ClientPlayNetworking
 *  net.fabricmc.fabric.api.client.networking.v1.ClientPlayNetworking$Context
 *  net.fabricmc.fabric.api.client.recipe.v1.sync.ClientRecipeSynchronizedEvent
 *  net.fabricmc.fabric.api.recipe.v1.sync.SynchronizedRecipes
 */
package net.fabricmc.fabric.impl.recipe.sync.client;

import java.util.ArrayList;
import java.util.Comparator;
import minecraft.class01683;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.client.networking.v1.ClientPlayNetworking;
import net.fabricmc.fabric.api.client.recipe.v1.sync.ClientRecipeSynchronizedEvent;
import net.fabricmc.fabric.api.recipe.v1.sync.SynchronizedRecipes;
import net.fabricmc.fabric.impl.recipe.sync.RecipeSyncPayloadS2C;
import net.fabricmc.fabric.impl.recipe.sync.RecipeSyncPayloadS2C$Entry;
import net.fabricmc.fabric.impl.recipe.sync.SynchronizedRecipesImpl;
import net.fabricmc.fabric.impl.recipe.sync.client.SynchronizedClientRecipesSetter;

@Environment(value=EnvType.CLIENT)
public class RecipeSyncImplClient
implements ClientModInitializer {
    public void onInitializeClient() {
        ClientPlayNetworking.registerGlobalReceiver(RecipeSyncPayloadS2C.ID, RecipeSyncImplClient::onRecipeSyncPacket);
    }

    private static void onRecipeSyncPacket(RecipeSyncPayloadS2C recipeSyncPayloadS2C, ClientPlayNetworking.Context context) {
        SynchronizedRecipesImpl synchronizedRecipesImpl;
        if (!recipeSyncPayloadS2C.entries().isEmpty()) {
            ArrayList arrayList = new ArrayList();
            for (RecipeSyncPayloadS2C$Entry recipeSyncPayloadS2C$Entry : recipeSyncPayloadS2C.entries()) {
                arrayList.addAll(recipeSyncPayloadS2C$Entry.recipes());
            }
            arrayList.sort(Comparator.comparing(class037292 -> class037292.N().N()));
            synchronizedRecipesImpl = SynchronizedRecipesImpl.of(arrayList);
        } else {
            synchronizedRecipesImpl = SynchronizedRecipesImpl.EMPTY;
        }
        ((SynchronizedClientRecipesSetter)((class01683)context.player().y_0).R()).fabric_setSynchronizedClientRecipes(synchronizedRecipesImpl);
        ((ClientRecipeSynchronizedEvent)ClientRecipeSynchronizedEvent.EVENT.invoker()).onRecipesSynchronized(context.client(), (SynchronizedRecipes)synchronizedRecipesImpl);
    }
}

