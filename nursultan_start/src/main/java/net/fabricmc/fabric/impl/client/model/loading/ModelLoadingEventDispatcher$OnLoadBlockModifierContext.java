/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00500
 *  net.fabricmc.api.EnvType
 *  net.fabricmc.api.Environment
 *  net.fabricmc.fabric.api.client.model.loading.v1.ModelModifier$OnLoadBlock$Context
 */
package net.fabricmc.fabric.impl.client.model.loading;

import minecraft.class00500;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.client.model.loading.v1.ModelModifier;

@Environment(value=EnvType.CLIENT)
class ModelLoadingEventDispatcher$OnLoadBlockModifierContext
implements ModelModifier.OnLoadBlock.Context {
    private class00500 state;

    void prepare(class00500 class005002) {
        this.state = class005002;
    }

    ModelLoadingEventDispatcher$OnLoadBlockModifierContext() {
    }

    public class00500 state() {
        return this.state;
    }
}

