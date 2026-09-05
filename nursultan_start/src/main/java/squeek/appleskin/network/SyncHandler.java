/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class01659
 *  minecraft.class04770
 *  minecraft.class04782
 *  minecraft.class07305
 *  minecraft.class08036
 *  net.fabricmc.fabric.api.event.lifecycle.v1.ServerTickEvents
 *  net.fabricmc.fabric.api.networking.v1.PayloadTypeRegistry
 *  net.fabricmc.fabric.api.networking.v1.ServerPlayNetworking
 */
package squeek.appleskin.network;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import minecraft.class01659;
import minecraft.class04770;
import minecraft.class04782;
import minecraft.class07305;
import minecraft.class08036;
import net.fabricmc.fabric.api.event.lifecycle.v1.ServerTickEvents;
import net.fabricmc.fabric.api.networking.v1.PayloadTypeRegistry;
import net.fabricmc.fabric.api.networking.v1.ServerPlayNetworking;
import squeek.appleskin.helpers.ExhaustionHelper;
import squeek.appleskin.network.ExhaustionSyncPayload;
import squeek.appleskin.network.NaturalRegenerationSyncPayload;
import squeek.appleskin.network.SaturationSyncPayload;

public class SyncHandler {
    private static final Map<UUID, Float> lastSaturationLevels = new HashMap<UUID, Float>();
    private static final Map<UUID, Float> lastExhaustionLevels = new HashMap<UUID, Float>();
    private static boolean naturalRegeneration = true;

    public static void init() {
        PayloadTypeRegistry.playS2C().register(ExhaustionSyncPayload.ID, ExhaustionSyncPayload.CODEC);
        PayloadTypeRegistry.playS2C().register(SaturationSyncPayload.ID, SaturationSyncPayload.CODEC);
        PayloadTypeRegistry.playS2C().register(NaturalRegenerationSyncPayload.ID, NaturalRegenerationSyncPayload.CODEC);
        ServerTickEvents.END_WORLD_TICK.register(SyncHandler::onServerWorldTick);
    }

    public static void onPlayerUpdate(class04770 class047702) {
        Float f = lastSaturationLevels.get(class047702.method_5667());
        Float f2 = lastExhaustionLevels.get(class047702.method_5667());
        float f3 = class047702.method_7344().u();
        if (f == null || f.floatValue() != f3) {
            ServerPlayNetworking.send((class04770)class047702, (class01659)new SaturationSyncPayload(f3));
            lastSaturationLevels.put(class047702.method_5667(), Float.valueOf(f3));
        }
        float f4 = ExhaustionHelper.getExhaustion((class08036)class047702);
        if (f2 == null || Math.abs(f2.floatValue() - f4) >= 0.01f) {
            ServerPlayNetworking.send((class04770)class047702, (class01659)new ExhaustionSyncPayload(f4));
            lastExhaustionLevels.put(class047702.method_5667(), Float.valueOf(f4));
        }
    }

    public static void onPlayerLoggedIn(class04770 class047702) {
        lastSaturationLevels.remove(class047702.method_5667());
        lastExhaustionLevels.remove(class047702.method_5667());
        if (!naturalRegeneration) {
            ServerPlayNetworking.send((class04770)class047702, (class01659)new NaturalRegenerationSyncPayload(false));
        }
    }

    public static void onServerWorldTick(class04782 class047822) {
        Boolean bl = (Boolean)class047822.method_64395().N(class07305.J);
        if (naturalRegeneration != bl) {
            for (class04770 class047702 : class047822.method_18456()) {
                ServerPlayNetworking.send((class04770)class047702, (class01659)new NaturalRegenerationSyncPayload(bl));
            }
            naturalRegeneration = bl;
        }
    }
}

