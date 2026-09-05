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

import java.util.Map;
import minecraft.class01404;
import minecraft.class04673;
import minecraft.class07211;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import org.joml.Matrix4fc;

@Environment(value=EnvType.CLIENT)
class ModelBakeSettingsHelper$2
implements class04673 {
    final /* synthetic */ class01404 val$transformation;
    final /* synthetic */ Map val$faceTransformations;
    final /* synthetic */ Map val$inverseFaceTransformations;

    ModelBakeSettingsHelper$2() {
        this.val$transformation = var1_1;
        this.val$faceTransformations = var2_2;
        this.val$inverseFaceTransformations = var3_3;
    }

    public Matrix4fc method_68011(class07211 class072112) {
        return (Matrix4fc)this.val$faceTransformations.get(class072112);
    }

    public class01404 method_3509() {
        return this.val$transformation;
    }

    public Matrix4fc method_68012(class07211 class072112) {
        return (Matrix4fc)this.val$inverseFaceTransformations.get(class072112);
    }
}

