/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class01659
 *  net.fabricmc.api.ClientModInitializer
 *  net.fabricmc.api.EnvType
 *  net.fabricmc.api.Environment
 *  net.fabricmc.fabric.api.client.networking.v1.ClientConfigurationNetworking
 */
package net.fabricmc.fabric.impl.recipe.ingredient.client;

import minecraft.class01659;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.client.networking.v1.ClientConfigurationNetworking;
import net.fabricmc.fabric.impl.recipe.ingredient.CustomIngredientPayloadS2C;
import net.fabricmc.fabric.impl.recipe.ingredient.CustomIngredientSync;

@Environment(value=EnvType.CLIENT)
public class CustomIngredientSyncClient
implements ClientModInitializer {
    public void onInitializeClient() {
        ClientConfigurationNetworking.registerGlobalReceiver(CustomIngredientPayloadS2C.ID, (customIngredientPayloadS2C, context) -> context.responseSender().sendPacket((class01659)CustomIngredientSync.createResponsePayload(customIngredientPayloadS2C.protocolVersion())));
    }
}

