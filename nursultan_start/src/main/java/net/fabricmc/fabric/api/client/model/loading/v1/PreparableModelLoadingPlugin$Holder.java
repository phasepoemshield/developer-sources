/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.fabricmc.api.EnvType
 *  net.fabricmc.api.Environment
 */
package net.fabricmc.fabric.api.client.model.loading.v1;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.client.model.loading.v1.PreparableModelLoadingPlugin;
import net.fabricmc.fabric.api.client.model.loading.v1.PreparableModelLoadingPlugin$DataLoader;

@Environment(value=EnvType.CLIENT)
public interface PreparableModelLoadingPlugin$Holder<T> {
    public PreparableModelLoadingPlugin<T> plugin();

    public PreparableModelLoadingPlugin$DataLoader<T> loader();
}

