/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class03729
 *  minecraft.class06514
 *  org.jspecify.annotations.Nullable
 */
package net.fabricmc.fabric.impl.recipe.sync;

import java.util.List;
import minecraft.class03729;
import minecraft.class06514;
import org.jspecify.annotations.Nullable;

public interface SyncedSerializerAwarePreparedRecipe {
    public @Nullable List<class03729<?>> fabric_getRecipesBySyncedSerializer(class06514<?> var1);
}

