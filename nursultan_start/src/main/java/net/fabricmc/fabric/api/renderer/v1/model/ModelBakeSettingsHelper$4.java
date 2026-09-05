/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class01404
 *  minecraft.class04673
 *  minecraft.class07211
 *  net.fabricmc.api.EnvType
 *  net.fabricmc.api.Environment
 *  org.joml.Matrix4fc
 */
package net.fabricmc.fabric.api.renderer.v1.model;

import minecraft.class01404;
import minecraft.class04673;
import minecraft.class07211;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import org.joml.Matrix4fc;

@Environment(value=EnvType.CLIENT)
class ModelBakeSettingsHelper$4
implements class04673 {
    final /* synthetic */ class01404 val$transformation;
    final /* synthetic */ class04673 val$faceTransformDelegate;

    ModelBakeSettingsHelper$4() {
        this.val$transformation = var1_1;
        this.val$faceTransformDelegate = var2_2;
    }

    public Matrix4fc method_68011(class07211 class072112) {
        return this.val$faceTransformDelegate.method_68011(class072112);
    }

    public class01404 method_3509() {
        return this.val$transformation;
    }

    public Matrix4fc method_68012(class07211 class072112) {
        return this.val$faceTransformDelegate.method_68012(class072112);
    }
}

