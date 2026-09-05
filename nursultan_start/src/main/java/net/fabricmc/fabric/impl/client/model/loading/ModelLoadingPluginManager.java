/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class01073
 *  minecraft.class07536
 *  net.fabricmc.api.EnvType
 *  net.fabricmc.api.Environment
 *  net.fabricmc.fabric.api.client.model.loading.v1.ModelLoadingPlugin
 *  net.fabricmc.fabric.api.client.model.loading.v1.PreparableModelLoadingPlugin
 *  net.fabricmc.fabric.api.client.model.loading.v1.PreparableModelLoadingPlugin$DataLoader
 *  net.fabricmc.fabric.api.client.model.loading.v1.PreparableModelLoadingPlugin$Holder
 */
package net.fabricmc.fabric.impl.client.model.loading;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;
import minecraft.class01073;
import minecraft.class07536;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.client.model.loading.v1.ModelLoadingPlugin;
import net.fabricmc.fabric.api.client.model.loading.v1.PreparableModelLoadingPlugin;
import net.fabricmc.fabric.impl.client.model.loading.ModelLoadingPluginManager$HolderImpl;

@Environment(value=EnvType.CLIENT)
public final class ModelLoadingPluginManager {
    private static final List<ModelLoadingPlugin> PLUGINS = new ArrayList<ModelLoadingPlugin>();
    private static final List<ModelLoadingPluginManager$HolderImpl<?>> PREPARABLE_PLUGINS = new ArrayList();
    public static final List<ModelLoadingPlugin> PLUGINS_VIEW = Collections.unmodifiableList(PLUGINS);
    public static final List<PreparableModelLoadingPlugin.Holder<?>> PREPARABLE_PLUGINS_VIEW = Collections.unmodifiableList(PREPARABLE_PLUGINS);

    private ModelLoadingPluginManager() {
    }

    public static CompletableFuture<List<ModelLoadingPlugin>> preparePlugins(class01073 class010732, Executor executor) {
        ArrayList<CompletableFuture<ModelLoadingPlugin>> arrayList = new ArrayList<CompletableFuture<ModelLoadingPlugin>>();
        for (ModelLoadingPlugin object : PLUGINS) {
            arrayList.add(CompletableFuture.completedFuture(object));
        }
        for (ModelLoadingPluginManager$HolderImpl modelLoadingPluginManager$HolderImpl : PREPARABLE_PLUGINS) {
            arrayList.add(ModelLoadingPluginManager.preparePlugin(modelLoadingPluginManager$HolderImpl, class010732, executor));
        }
        return class07536.L(arrayList);
    }

    private static <T> CompletableFuture<ModelLoadingPlugin> preparePlugin(ModelLoadingPluginManager$HolderImpl<T> modelLoadingPluginManager$HolderImpl, class01073 class010732, Executor executor) {
        CompletableFuture completableFuture = modelLoadingPluginManager$HolderImpl.loader.load(class010732, executor);
        return completableFuture.thenApply(object -> context -> modelLoadingPluginManager$HolderImpl.plugin.initialize(object, context));
    }

    public static <T> void registerPlugin(PreparableModelLoadingPlugin.DataLoader<T> dataLoader, PreparableModelLoadingPlugin<T> preparableModelLoadingPlugin) {
        Objects.requireNonNull(dataLoader, "data loader must not be null");
        Objects.requireNonNull(preparableModelLoadingPlugin, "plugin must not be null");
        PREPARABLE_PLUGINS.add(new ModelLoadingPluginManager$HolderImpl<T>(dataLoader, preparableModelLoadingPlugin));
    }

    public static void registerPlugin(ModelLoadingPlugin modelLoadingPlugin) {
        Objects.requireNonNull(modelLoadingPlugin, "plugin must not be null");
        PLUGINS.add(modelLoadingPlugin);
    }
}

