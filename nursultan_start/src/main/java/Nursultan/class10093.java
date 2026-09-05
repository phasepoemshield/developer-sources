/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00500
 *  minecraft.class03448
 *  minecraft.class03770
 *  minecraft.class05846
 *  minecraft.class05848
 *  minecraft.class05885
 *  minecraft.class06202
 *  minecraft.class07209
 *  minecraft.class07295
 *  minecraft.class08388
 *  minecraft.class08626
 *  minecraft.class08743
 *  net.fabricmc.api.EnvType
 *  net.fabricmc.api.Environment
 *  net.irisshaders.iris.fantastic.IrisParticleRenderTypes
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfo
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable
 */
package Nursultan;

import minecraft.class00500;
import minecraft.class03448;
import minecraft.class03770;
import minecraft.class05846;
import minecraft.class05848;
import minecraft.class05885;
import minecraft.class06202;
import minecraft.class07209;
import minecraft.class07295;
import minecraft.class08388;
import minecraft.class08626;
import minecraft.class08743;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.irisshaders.iris.fantastic.IrisParticleRenderTypes;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Environment(value=EnvType.CLIENT)
public class class10093
extends class05848 {
    private final class05846 N;
    private boolean y;

    public class10093(class03448 class034482, double d, double d2, double d3, class00500 class005002) {
        super(class034482, d, d2, d3, class10093.N(class06202.Nq().yU().N(), class005002, class034482, d, d2, d3, class005002));
        this.field_3844 = 0.0f;
        this.field_3847 = 80;
        this.field_3862 = false;
        this.N = this.field_62632.method_45852().equals((Object)class08626.N) ? class05846.N : class05846.y;
        this.N(class034482, d, d2, d3, class005002, null);
    }

    private static class08388 N(class03770 class037702, class00500 class005002, class03448 class034482, double d, double d2, double d3, class00500 class005003) {
        return class037702.getModelParticleSprite(class005002, (class07295)class034482, class07209.method_49637((double)d, (double)d2, (double)d3));
    }

    private void N(class03448 class034482, double d, double d2, double d3, class00500 class005002, CallbackInfo callbackInfo) {
        class08743 class087432 = class05885.N((class00500)class005002);
        if (class087432 == class08743.field_60923 || class087432 == class08743.field_60925) {
            this.y = true;
        }
    }

    private void N(CallbackInfoReturnable callbackInfoReturnable) {
        if (this.y && callbackInfoReturnable.getReturnValue() == class05846.N) {
            callbackInfoReturnable.setReturnValue((Object)IrisParticleRenderTypes.TERRAIN_OPAQUE);
        }
    }

    public class05846 method_74255() {
        class05846 class058462 = this.N;
        class05846 class058463 = class058462;
        class058463 = new CallbackInfoReturnable("", true, (Object)class058463);
        this.N((CallbackInfoReturnable)class058463);
        if (class058463.isCancelled()) {
            return (class05846)class058463.getReturnValue();
        }
        return class058462;
    }

    public float method_18132(float f) {
        return 0.5f;
    }
}

