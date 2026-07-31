/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.llamalad7.mixinextras.injector.wrapoperation.Operation
 *  com.llamalad7.mixinextras.injector.wrapoperation.WrapOperation
 *  net.minecraft.class_10017
 *  net.minecraft.class_10042
 *  net.minecraft.class_1309
 *  net.minecraft.class_3887
 *  net.minecraft.class_4587
 *  net.minecraft.class_4597
 *  net.minecraft.class_922
 *  org.spongepowered.asm.mixin.Mixin
 *  org.spongepowered.asm.mixin.Shadow
 *  org.spongepowered.asm.mixin.Unique
 *  org.spongepowered.asm.mixin.injection.At
 *  org.spongepowered.asm.mixin.injection.Inject
 *  org.spongepowered.asm.mixin.injection.ModifyArg
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfo
 */
package kotakbaz.rain.mixin;

import com.llamalad7.mixinextras.injector.wrapoperation.Operation;
import com.llamalad7.mixinextras.injector.wrapoperation.WrapOperation;
import kotakbaz.rain.client.render.hitcolor.A;
import kotakbaz.rain.client.render.hitcolor.a_0;
import kotakbaz.rain.module.modules.render.X;
import net.minecraft.class_10017;
import net.minecraft.class_10042;
import net.minecraft.class_1309;
import net.minecraft.class_3887;
import net.minecraft.class_4587;
import net.minecraft.class_4597;
import net.minecraft.class_922;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.ModifyArg;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(value={class_922.class})
public abstract class MixinLivingEntityRendererHitColor {
    @Unique
    private int rain$currentEntityId = Integer.MIN_VALUE;

    public MixinLivingEntityRendererHitColor() {
        super();
    }

    @Shadow
    protected abstract float method_23185(class_10042 var1);

    @Shadow
    public static int method_23622(class_10042 state2, float whiteOverlayProgress) {
        throw new AssertionError();
    }

    @Inject(method={"method_62355"}, at={@At(value="TAIL")})
    private void rain$captureEntityId(class_1309 entity, class_10042 state2, float tickProgress, CallbackInfo ci) {
        ((a_0)state2).rain$setEntityId(entity.method_5628());
    }

    @Inject(method={"method_4054"}, at={@At(value="HEAD")})
    private void rain$beginRender(class_10042 state2, class_4587 matrices, class_4597 vertexConsumers, int light, CallbackInfo ci) {
        this.rain$currentEntityId = ((a_0)state2).rain$getEntityId();
    }

    @Inject(method={"method_4054"}, at={@At(value="RETURN")})
    private void rain$endRender(class_10042 state2, class_4587 matrices, class_4597 vertexConsumers, int light, CallbackInfo ci) {
        this.rain$currentEntityId = Integer.MIN_VALUE;
    }

    @ModifyArg(method={"method_4054"}, at=@At(value="INVOKE", target="Lnet/minecraft/class_583;method_62100(Lnet/minecraft/class_4587;Lnet/minecraft/class_4588;III)V"), index=3)
    private int rain$replaceEntityOverlay(int overlay) {
        return X.INSTANCE.resolveOverlay(this.rain$currentEntityId, overlay);
    }

    @WrapOperation(method={"method_4054"}, at={@At(value="INVOKE", target="Lnet/minecraft/class_3887;method_4199(Lnet/minecraft/class_4587;Lnet/minecraft/class_4597;ILnet/minecraft/class_10017;FF)V")})
    private void rain$passOverlayToEveryFeature(class_3887<?, ?> instance, class_4587 matrices, class_4597 vertexConsumers, int light, class_10017 state2, float relativeHeadYaw, float pitch, Operation<Void> original, class_10042 livingState) {
        if (instance instanceof A) {
            A overlayAware = (A)instance;
            int overlay = MixinLivingEntityRendererHitColor.method_23622(livingState, this.method_23185(livingState));
            overlayAware.rain$setOverlayCoords(X.INSTANCE.resolveOverlay(this.rain$currentEntityId, overlay));
        }
        original.call(new Object[]{instance, matrices, vertexConsumers, light, state2, Float.valueOf(relativeHeadYaw), Float.valueOf(pitch)});
    }
}

