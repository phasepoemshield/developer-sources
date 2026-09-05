/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class01894
 *  minecraft.class06514
 *  net.fabricmc.fabric.impl.recipe.sync.RecipeSyncImpl
 */
package net.fabricmc.fabric.api.recipe.v1.sync;

import java.util.Objects;
import minecraft.class01894;
import minecraft.class06514;
import net.fabricmc.fabric.impl.recipe.sync.RecipeSyncImpl;

public final class RecipeSynchronization {
    public static final class01894 RECIPE_SYNC_EVENT_PHASE = RecipeSyncImpl.RECIPE_SYNC_EVENT_PHASE;

    private RecipeSynchronization() {
    }

    public static void synchronizeRecipeSerializer(class06514<?> class065142) {
        Objects.requireNonNull(class065142, "serializer can't be null!");
        Objects.requireNonNull(class065142.y(), "PacketCodec can't be null!");
        RecipeSyncImpl.addSynchronizedSerializer(class065142);
    }
}

