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
import net.fabricmc.fabric.impl.client.model.loading.ModelLoadingPluginManager;

@FunctionalInterface
@Environment(value=EnvType.CLIENT)
public interface ModelLoadingPlugin {
    public static List<ModelLoadingPlugin> getAll() {
        return ModelLoadingPluginManager.PLUGINS_VIEW;
    }

    public void initialize(ModelLoadingPlugin$Context var1);

    public static void register(ModelLoadingPlugin modelLoadingPlugin) {
        ModelLoadingPluginManager.registerPlugin((ModelLoadingPlugin)modelLoadingPlugin);
    }
}

