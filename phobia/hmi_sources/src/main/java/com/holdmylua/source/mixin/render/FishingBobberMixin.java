/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_1306
 *  net.minecraft.class_1657
 *  net.minecraft.class_243
 *  net.minecraft.class_310
 *  net.minecraft.class_898
 *  net.minecraft.class_906
 *  org.joml.Matrix4f
 *  org.joml.Matrix4fc
 *  org.joml.Vector4f
 *  org.spongepowered.asm.mixin.Mixin
 *  org.spongepowered.asm.mixin.injection.At
 *  org.spongepowered.asm.mixin.injection.Inject
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable
 */
package com.holdmylua.source.mixin.render;

import com.holdmylua.source.LuaTestHMI;
import net.minecraft.class_1306;
import net.minecraft.class_1657;
import net.minecraft.class_243;
import net.minecraft.class_310;
import net.minecraft.class_898;
import net.minecraft.class_906;
import org.joml.Matrix4f;
import org.joml.Matrix4fc;
import org.joml.Vector4f;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(value={class_906.class})
public abstract class FishingBobberMixin {
    private class_898 dispatcher = class_310.method_1551().method_1561();
    float DEG_TO_RAD = (float)Math.PI / 180;

    @Inject(method={"method_59755"}, at={@At(value="HEAD")}, cancellable=true)
    private void getHandPos(class_1657 player, float f, float tickProgress, CallbackInfoReturnable<class_243> cir) {
        float m = 960.0f / (float)((Integer)this.dispatcher.field_4692.method_41808().method_41753()).intValue();
        int i = class_906.method_65567((class_1657)player) == class_1306.field_6183 ? 1 : -1;
        Matrix4f matrix = class_906.method_65567((class_1657)player) == class_1306.field_6183 ? LuaTestHMI.matricesMain : LuaTestHMI.matricesOff;
        matrix.translate(0.0f, 0.0f, 0.0f);
        Vector4f tipPos = new Vector4f(0.0f, 0.0f, 0.0f, 1.0f);
        tipPos.mul((Matrix4fc)matrix);
        class_243 worldPos = new class_243((double)tipPos.x(), (double)tipPos.y(), (double)tipPos.z());
        worldPos.method_1021((double)m);
        if (this.dispatcher.field_4692.method_31044().method_31034() && player == class_310.method_1551().field_1724) {
            class_243 vec3d = this.dispatcher.field_4686.method_36425().method_36427(0.7f, 0.0f).method_1021((double)m).method_1019(worldPos);
            cir.setReturnValue((Object)this.dispatcher.field_4686.method_71156().method_1019(vec3d));
        }
    }

    private void getHandPose(class_1657 player, float f, float tickProgress, CallbackInfoReturnable<class_243> cir) {
        float m = 960.0f / (float)((Integer)this.dispatcher.field_4692.method_41808().method_41753()).intValue();
        int i = class_906.method_65567((class_1657)player) == class_1306.field_6183 ? 1 : -1;
        Matrix4f matrix = class_906.method_65567((class_1657)player) == class_1306.field_6183 ? LuaTestHMI.matricesMain : LuaTestHMI.matricesOff;
        matrix.translate(0.0f, 0.0f, 0.0f);
        Vector4f tipPos = new Vector4f(0.0f, 0.0f, 0.0f, 1.0f);
        tipPos.mul((Matrix4fc)matrix);
        class_243 worldPos = new class_243((double)tipPos.x(), (double)tipPos.y(), (double)tipPos.z());
        worldPos.method_1021((double)m);
        if (this.dispatcher.field_4692.method_31044().method_31034() && player == class_310.method_1551().field_1724) {
            class_243 vec3d = this.dispatcher.field_4686.method_36425().method_36427(0.7f, 0.0f).method_1021((double)m).method_1019(worldPos);
            cir.setReturnValue((Object)this.dispatcher.field_4686.method_71156().method_1019(vec3d));
        }
    }
}

