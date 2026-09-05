/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class01404
 *  minecraft.class04673
 *  net.fabricmc.api.EnvType
 *  net.fabricmc.api.Environment
 */
package net.fabricmc.fabric.api.renderer.v1.model;

import minecraft.class01404;
import minecraft.class04673;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(value=EnvType.CLIENT)
class ModelBakeSettingsHelper$1
implements class04673 {
    final /* synthetic */ class01404 val$transformation;

    ModelBakeSettingsHelper$1(class01404 class014042) {
        this.val$transformation = class014042;
    }

    public class01404 method_3509() {
        return this.val$transformation;
    }
}

