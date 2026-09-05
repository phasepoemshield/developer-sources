/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.fabricmc.loader.api.FabricLoader
 *  net.minecraft.class_243
 *  net.minecraft.class_4184
 *  net.minecraft.class_7833
 *  org.joml.Quaternionf
 *  org.joml.Quaternionfc
 *  org.joml.Vector3f
 *  org.spongepowered.asm.mixin.Final
 *  org.spongepowered.asm.mixin.Mixin
 *  org.spongepowered.asm.mixin.Shadow
 *  org.spongepowered.asm.mixin.Unique
 *  org.spongepowered.asm.mixin.injection.At
 *  org.spongepowered.asm.mixin.injection.Inject
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfo
 */
package com.holdmylua.source.mixin.player;

import com.holdmylua.source.access.CameraAccessor;
import net.fabricmc.loader.api.FabricLoader;
import net.minecraft.class_243;
import net.minecraft.class_4184;
import net.minecraft.class_7833;
import org.joml.Quaternionf;
import org.joml.Quaternionfc;
import org.joml.Vector3f;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(value={class_4184.class})
public abstract class CameraMixin
implements CameraAccessor {
    @Shadow
    @Final
    private Quaternionf field_21518;
    @Shadow
    private float field_18717;
    @Shadow
    private float field_18718;
    @Shadow
    @Final
    private static Vector3f field_52123;
    @Shadow
    @Final
    private static Vector3f field_52124;
    @Shadow
    @Final
    private static Vector3f field_52125;
    @Shadow
    @Final
    private Vector3f field_18714;
    @Shadow
    @Final
    private Vector3f field_18715;
    @Shadow
    @Final
    private Vector3f field_18716;
    @Shadow
    private class_243 field_18712;
    @Unique
    private float pitchM = 0.0f;
    @Unique
    private float yawM = 0.0f;
    @Unique
    private float rollM = 0.0f;
    @Unique
    private float xM = 0.0f;
    @Unique
    private float yM = 0.0f;
    @Unique
    private float zM = 0.0f;

    @Shadow
    protected abstract void method_19322(class_243 var1);

    @Override
    public void hMI5_0$applyRotation() {
        this.field_21518.add((Quaternionfc)class_7833.field_40714.rotationDegrees(this.pitchM));
        this.field_21518.add((Quaternionfc)class_7833.field_40716.rotationDegrees(this.yawM));
        this.field_21518.add((Quaternionfc)class_7833.field_40718.rotationDegrees(this.rollM));
    }

    @Override
    public void hMI5_0$setRotationValues(float pitch, float yaw, float roll) {
        this.pitchM = pitch;
        this.yawM = yaw;
        this.rollM = roll;
    }

    @Override
    public void hMI5_0$setPosValues(float x, float y, float z) {
        this.xM = x;
        this.yM = y;
        this.zM = z;
    }

    @Inject(method={"method_19325"}, at={@At(value="HEAD")}, cancellable=true)
    public void setRotationMixin(float yaw, float pitch, CallbackInfo ci) {
        if (!FabricLoader.getInstance().isModLoaded("do_a_barrel_roll")) {
            this.field_18717 = pitch;
            this.field_18718 = yaw;
            this.field_21518.rotationYXZ((float)Math.PI - (yaw + this.yawM) * ((float)Math.PI / 180), (-pitch + this.pitchM) * ((float)Math.PI / 180), this.rollM * ((float)Math.PI / 180));
            field_52123.rotate((Quaternionfc)this.field_21518, this.field_18714);
            field_52124.rotate((Quaternionfc)this.field_21518, this.field_18715);
            field_52125.rotate((Quaternionfc)this.field_21518, this.field_18716);
            ci.cancel();
        }
    }

    @Inject(method={"method_19327(DDD)V"}, at={@At(value="HEAD")}, cancellable=true)
    public void setRotationMixin(double x, double y, double z, CallbackInfo ci) {
        if (!FabricLoader.getInstance().isModLoaded("do_a_barrel_roll")) {
            this.method_19322(new class_243(x += (double)this.xM, y += (double)this.yM, z += (double)this.zM));
            ci.cancel();
        }
    }
}

