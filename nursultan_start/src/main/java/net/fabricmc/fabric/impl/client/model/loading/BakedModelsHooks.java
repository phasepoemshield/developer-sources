/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.fabricmc.api.EnvType
 *  net.fabricmc.api.Environment
 *  net.fabricmc.fabric.api.client.model.loading.v1.ExtraModelKey
 *  org.jspecify.annotations.Nullable
 */
package net.fabricmc.fabric.impl.client.model.loading;

import java.util.Map;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.client.model.loading.v1.ExtraModelKey;
import org.jspecify.annotations.Nullable;

@Environment(value=EnvType.CLIENT)
public interface BakedModelsHooks {
    public void fabric_setExtraModels(@Nullable Map<ExtraModelKey<?>, ?> var1);

    public @Nullable Map<ExtraModelKey<?>, ?> fabric_getExtraModels();
}

