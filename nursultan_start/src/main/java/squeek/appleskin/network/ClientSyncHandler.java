/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class04453
 *  minecraft.class08036
 *  net.fabricmc.fabric.api.client.networking.v1.ClientPlayNetworking
 */
package squeek.appleskin.network;

import minecraft.class04453;
import minecraft.class08036;
import net.fabricmc.fabric.api.client.networking.v1.ClientPlayNetworking;
import squeek.appleskin.helpers.ExhaustionHelper;
import squeek.appleskin.network.ExhaustionSyncPayload;
import squeek.appleskin.network.NaturalRegenerationSyncPayload;
import squeek.appleskin.network.SaturationSyncPayload;

public class ClientSyncHandler {
    public static boolean naturalRegeneration = true;

    public static void init() {
        ClientPlayNetworking.registerGlobalReceiver(ExhaustionSyncPayload.ID, (exhaustionSyncPayload, context) -> context.client().execute(() -> ExhaustionHelper.setExhaustion((class08036)((class04453)context.client().T_4), exhaustionSyncPayload.getExhaustion())));
        ClientPlayNetworking.registerGlobalReceiver(SaturationSyncPayload.ID, (saturationSyncPayload, context) -> context.client().execute(() -> ((class04453)context.client().T_4).method_7344().y(saturationSyncPayload.getSaturation())));
        ClientPlayNetworking.registerGlobalReceiver(NaturalRegenerationSyncPayload.ID, (naturalRegenerationSyncPayload, context) -> {
            naturalRegeneration = naturalRegenerationSyncPayload.naturalRegeneration();
        });
    }
}

