/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class01894
 *  minecraft.class04176
 *  minecraft.class04188
 *  net.fabricmc.api.ModInitializer
 *  net.fabricmc.fabric.api.networking.v1.PayloadTypeRegistry
 *  net.fabricmc.fabric.api.networking.v1.ServerConfigurationConnectionEvents
 *  net.fabricmc.fabric.api.networking.v1.ServerConfigurationNetworking
 *  net.fabricmc.fabric.mixin.networking.accessor.ServerCommonPacketListenerImplAccessor
 */
package net.fabricmc.fabric.impl.recipe.ingredient;

import java.util.Set;
import minecraft.class01894;
import minecraft.class04176;
import minecraft.class04188;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.networking.v1.PayloadTypeRegistry;
import net.fabricmc.fabric.api.networking.v1.ServerConfigurationConnectionEvents;
import net.fabricmc.fabric.api.networking.v1.ServerConfigurationNetworking;
import net.fabricmc.fabric.impl.recipe.ingredient.CustomIngredientImpl;
import net.fabricmc.fabric.impl.recipe.ingredient.CustomIngredientPayloadC2S;
import net.fabricmc.fabric.impl.recipe.ingredient.CustomIngredientPayloadS2C;
import net.fabricmc.fabric.impl.recipe.ingredient.CustomIngredientSync$IngredientSyncTask;
import net.fabricmc.fabric.impl.recipe.ingredient.SupportedIngredientsClientConnection;
import net.fabricmc.fabric.mixin.networking.accessor.ServerCommonPacketListenerImplAccessor;

public class CustomIngredientSync
implements ModInitializer {
    public static final class01894 PACKET_ID = class01894.N((String)"fabric", (String)"custom_ingredient_sync");
    public static final int PROTOCOL_VERSION_1 = 1;
    public static final ThreadLocal<Set<class01894>> CURRENT_SUPPORTED_INGREDIENTS = new ThreadLocal();

    public static Set<class01894> decodeResponsePayload(CustomIngredientPayloadC2S customIngredientPayloadC2S) {
        int n = customIngredientPayloadC2S.protocolVersion();
        switch (n) {
            case 1: {
                Set<class01894> set = customIngredientPayloadC2S.registeredSerializers();
                set.removeIf(class018942 -> !CustomIngredientImpl.REGISTERED_SERIALIZERS.containsKey(class018942));
                return set;
            }
        }
        throw new IllegalArgumentException("Unknown ingredient sync protocol version: " + n);
    }

    public static CustomIngredientPayloadC2S createResponsePayload(int n) {
        if (n < 1) {
            return null;
        }
        return new CustomIngredientPayloadC2S(1, CustomIngredientImpl.REGISTERED_SERIALIZERS.keySet());
    }

    public void onInitialize() {
        PayloadTypeRegistry.configurationC2S().register(CustomIngredientPayloadC2S.ID, CustomIngredientPayloadC2S.CODEC);
        PayloadTypeRegistry.configurationS2C().register(CustomIngredientPayloadS2C.ID, CustomIngredientPayloadS2C.CODEC);
        ServerConfigurationConnectionEvents.CONFIGURE.register((class041762, class027962) -> {
            if (ServerConfigurationNetworking.canSend((class04176)class041762, (class01894)PACKET_ID)) {
                class041762.addTask((class04188)new CustomIngredientSync$IngredientSyncTask());
            }
        });
        ServerConfigurationNetworking.registerGlobalReceiver(CustomIngredientPayloadC2S.ID, (customIngredientPayloadC2S, context) -> {
            Set<class01894> set = CustomIngredientSync.decodeResponsePayload(customIngredientPayloadC2S);
            ((SupportedIngredientsClientConnection)((ServerCommonPacketListenerImplAccessor)context.networkHandler()).getConnection()).fabric_setSupportedCustomIngredients(set);
            context.networkHandler().completeTask(CustomIngredientSync$IngredientSyncTask.KEY);
        });
    }
}

