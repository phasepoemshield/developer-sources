/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  it.unimi.dsi.fastutil.objects.ReferenceOpenHashSet
 *  minecraft.class01659
 *  minecraft.class01894
 *  minecraft.class03729
 *  minecraft.class04206
 *  minecraft.class04770
 *  minecraft.class06514
 *  net.fabricmc.api.ModInitializer
 *  net.fabricmc.fabric.api.event.Event
 *  net.fabricmc.fabric.api.event.lifecycle.v1.ServerLifecycleEvents
 *  net.fabricmc.fabric.api.networking.v1.PayloadTypeRegistry
 *  net.fabricmc.fabric.api.networking.v1.ServerConfigurationNetworking
 *  net.fabricmc.fabric.api.networking.v1.ServerConfigurationNetworking$Context
 *  net.fabricmc.fabric.api.networking.v1.ServerPlayNetworking
 *  net.fabricmc.fabric.mixin.recipe.sync.RecipeManagerAccessor
 *  net.fabricmc.fabric.mixin.recipe.sync.ServerCommonPacketListenerImplAccessor
 */
package net.fabricmc.fabric.impl.recipe.sync;

import it.unimi.dsi.fastutil.objects.ReferenceOpenHashSet;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import minecraft.class01659;
import minecraft.class01894;
import minecraft.class03729;
import minecraft.class04206;
import minecraft.class04770;
import minecraft.class06514;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.event.Event;
import net.fabricmc.fabric.api.event.lifecycle.v1.ServerLifecycleEvents;
import net.fabricmc.fabric.api.networking.v1.PayloadTypeRegistry;
import net.fabricmc.fabric.api.networking.v1.ServerConfigurationNetworking;
import net.fabricmc.fabric.api.networking.v1.ServerPlayNetworking;
import net.fabricmc.fabric.impl.recipe.sync.RecipeSyncPayloadS2C;
import net.fabricmc.fabric.impl.recipe.sync.RecipeSyncPayloadS2C$Entry;
import net.fabricmc.fabric.impl.recipe.sync.SupportedRecipeSerializersPayloadC2S;
import net.fabricmc.fabric.impl.recipe.sync.SyncedSerializerAwareClientConnection;
import net.fabricmc.fabric.impl.recipe.sync.SyncedSerializerAwarePreparedRecipe;
import net.fabricmc.fabric.mixin.recipe.sync.RecipeManagerAccessor;
import net.fabricmc.fabric.mixin.recipe.sync.ServerCommonPacketListenerImplAccessor;

public class RecipeSyncImpl
implements ModInitializer {
    private static final int RECIPE_PAYLOAD_MAX_SIZE = 0x4000000;
    private static final Set<class06514<?>> SYNCED_SERIALIZERS = new ReferenceOpenHashSet();
    public static final class01894 RECIPE_SYNC_EVENT_PHASE = class01894.N((String)"fabric", (String)"recipe_sync");

    public static void addSynchronizedSerializer(class06514<?> class065142) {
        SYNCED_SERIALIZERS.add(class065142);
    }

    public static Set<class06514<?>> getSyncedSerializers() {
        return Collections.unmodifiableSet(SYNCED_SERIALIZERS);
    }

    private static void onRecipeSyncRequest(SupportedRecipeSerializersPayloadC2S supportedRecipeSerializersPayloadC2S, ServerConfigurationNetworking.Context context) {
        ReferenceOpenHashSet referenceOpenHashSet = new ReferenceOpenHashSet();
        for (class01894 class018942 : supportedRecipeSerializersPayloadC2S.synchronizedSerializers()) {
            class04206.j.y(class018942).ifPresent(arg_0 -> ((ReferenceOpenHashSet)referenceOpenHashSet).add(arg_0));
        }
        ((SyncedSerializerAwareClientConnection)((ServerCommonPacketListenerImplAccessor)context.networkHandler()).getConnection()).fabric_setSyncedRecipeSerializers((Set<class06514<?>>)referenceOpenHashSet);
    }

    public static boolean isSynced(class06514<?> class065142) {
        return SYNCED_SERIALIZERS.contains(class065142);
    }

    private static void sendRecipes(class04770 class047702, boolean bl) {
        if (!ServerPlayNetworking.canSend((class04770)class047702, RecipeSyncPayloadS2C.ID)) {
            return;
        }
        Set<class06514<?>> set = ((SyncedSerializerAwareClientConnection)((ServerCommonPacketListenerImplAccessor)class047702.field_13987).getConnection()).fabric_getSyncedRecipeSerializers();
        SyncedSerializerAwarePreparedRecipe syncedSerializerAwarePreparedRecipe = (SyncedSerializerAwarePreparedRecipe)((RecipeManagerAccessor)class047702.method_51469().method_64577()).getPreparedRecipes();
        ArrayList<RecipeSyncPayloadS2C$Entry> arrayList = new ArrayList<RecipeSyncPayloadS2C$Entry>();
        for (class06514<?> class065142 : set) {
            List<class03729<?>> list = syncedSerializerAwarePreparedRecipe.fabric_getRecipesBySyncedSerializer(class065142);
            if (list == null || list.isEmpty()) continue;
            arrayList.add(new RecipeSyncPayloadS2C$Entry(class065142, list));
        }
        if (arrayList.isEmpty()) {
            return;
        }
        ServerPlayNetworking.send((class04770)class047702, (class01659)new RecipeSyncPayloadS2C(arrayList));
    }

    public void onInitialize() {
        PayloadTypeRegistry.configurationC2S().register(SupportedRecipeSerializersPayloadC2S.ID, SupportedRecipeSerializersPayloadC2S.CODEC);
        PayloadTypeRegistry.playS2C().registerLarge(RecipeSyncPayloadS2C.ID, RecipeSyncPayloadS2C.CODEC, 0x4000000);
        ServerConfigurationNetworking.registerGlobalReceiver(SupportedRecipeSerializersPayloadC2S.ID, RecipeSyncImpl::onRecipeSyncRequest);
        ServerLifecycleEvents.SYNC_DATA_PACK_CONTENTS.addPhaseOrdering(Event.DEFAULT_PHASE, RECIPE_SYNC_EVENT_PHASE);
        ServerLifecycleEvents.SYNC_DATA_PACK_CONTENTS.register(RECIPE_SYNC_EVENT_PHASE, RecipeSyncImpl::sendRecipes);
    }
}

