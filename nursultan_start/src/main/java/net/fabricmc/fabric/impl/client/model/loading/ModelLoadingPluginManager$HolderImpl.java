/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  net.fabricmc.api.EnvType
 *  net.fabricmc.api.Environment
 *  net.fabricmc.fabric.api.client.model.loading.v1.PreparableModelLoadingPlugin
 *  net.fabricmc.fabric.api.client.model.loading.v1.PreparableModelLoadingPlugin$DataLoader
 *  net.fabricmc.fabric.api.client.model.loading.v1.PreparableModelLoadingPlugin$Holder
 */
package net.fabricmc.fabric.impl.client.model.loading;

import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.client.model.loading.v1.PreparableModelLoadingPlugin;

@Environment(value=EnvType.CLIENT)
final class ModelLoadingPluginManager$HolderImpl<T>
extends Record
implements PreparableModelLoadingPlugin.Holder<T> {
    final PreparableModelLoadingPlugin.DataLoader<T> loader;
    final PreparableModelLoadingPlugin<T> plugin;

    public PreparableModelLoadingPlugin<T> plugin() {
        return this.plugin;
    }

    ModelLoadingPluginManager$HolderImpl(PreparableModelLoadingPlugin.DataLoader<T> dataLoader, PreparableModelLoadingPlugin<T> preparableModelLoadingPlugin) {
        this.loader = dataLoader;
        this.plugin = preparableModelLoadingPlugin;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{ModelLoadingPluginManager$HolderImpl.class, "loader;plugin", "loader", "plugin"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{ModelLoadingPluginManager$HolderImpl.class, "loader;plugin", "loader", "plugin"}, this);
    }

    public PreparableModelLoadingPlugin.DataLoader<T> loader() {
        return this.loader;
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{ModelLoadingPluginManager$HolderImpl.class, "loader;plugin", "loader", "plugin"}, this);
    }
}

