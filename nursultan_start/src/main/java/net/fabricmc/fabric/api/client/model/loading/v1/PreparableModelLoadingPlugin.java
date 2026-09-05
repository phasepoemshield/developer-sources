/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.fabricmc.api.EnvType
 *  net.fabricmc.api.Environment
 *  net.fabricmc.fabric.impl.client.model.loading.ModelLoadingPluginManager
 */
package net.fabricmc.fabric.api.client.model.loading.v1;

import java.util.List;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.client.model.loading.v1.ModelLoadingPlugin$Context;
import net.fabricmc.fabric.api.client.model.loading.v1.PreparableModelLoadingPlugin$DataLoader;
import net.fabricmc.fabric.api.client.model.loading.v1.PreparableModelLoadingPlugin$Holder;
import net.fabricmc.fabric.impl.client.model.loading.ModelLoadingPluginManager;

@FunctionalInterface
@Environment(value=EnvType.CLIENT)
public interface PreparableModelLoadingPlugin<T> {
    public static List<PreparableModelLoadingPlugin$Holder<?>> getAll() {
        return ModelLoadingPluginManager.PREPARABLE_PLUGINS_VIEW;
    }

    public void initialize(T var1, ModelLoadingPlugin$Context var2);

    public static <T> void register(PreparableModelLoadingPlugin$DataLoader<T> preparableModelLoadingPlugin$DataLoader, PreparableModelLoadingPlugin<T> preparableModelLoadingPlugin) {
        ModelLoadingPluginManager.registerPlugin(preparableModelLoadingPlugin$DataLoader, preparableModelLoadingPlugin);
    }
}

