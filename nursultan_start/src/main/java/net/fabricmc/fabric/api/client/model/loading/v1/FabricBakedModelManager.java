/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.fabricmc.api.EnvType
 *  net.fabricmc.api.Environment
 *  org.jspecify.annotations.Nullable
 */
package net.fabricmc.fabric.api.client.model.loading.v1;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.client.model.loading.v1.ExtraModelKey;
import org.jspecify.annotations.Nullable;

@Environment(value=EnvType.CLIENT)
public interface FabricBakedModelManager {
    default public <T> @Nullable T getModel(ExtraModelKey<T> extraModelKey) {
        throw new UnsupportedOperationException("Implemented via mixin.");
    }
}

