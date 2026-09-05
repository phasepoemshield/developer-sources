/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class01894
 *  net.fabricmc.api.EnvType
 *  net.fabricmc.api.Environment
 *  net.fabricmc.fabric.api.client.model.loading.v1.ModelModifier$OnLoad$Context
 */
package net.fabricmc.fabric.impl.client.model.loading;

import minecraft.class01894;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.client.model.loading.v1.ModelModifier;

@Environment(value=EnvType.CLIENT)
class ModelLoadingEventDispatcher$OnLoadModifierContext
implements ModelModifier.OnLoad.Context {
    private class01894 id;

    void prepare(class01894 class018942) {
        this.id = class018942;
    }

    ModelLoadingEventDispatcher$OnLoadModifierContext() {
    }

    public class01894 id() {
        return this.id;
    }
}

