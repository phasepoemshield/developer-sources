/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.llamalad7.mixinextras.injector.ModifyExpressionValue
 *  com.llamalad7.mixinextras.sugar.Local
 *  net.minecraft.class_10042
 *  net.minecraft.class_10055
 *  net.minecraft.class_11659
 *  net.minecraft.class_12075
 *  net.minecraft.class_1309
 *  net.minecraft.class_1921
 *  net.minecraft.class_3532
 *  net.minecraft.class_4587
 *  net.minecraft.class_465
 *  net.minecraft.class_583
 *  net.minecraft.class_922
 *  org.jetbrains.annotations.Nullable
 *  org.spongepowered.asm.mixin.Mixin
 *  org.spongepowered.asm.mixin.Shadow
 *  org.spongepowered.asm.mixin.injection.At
 *  org.spongepowered.asm.mixin.injection.Inject
 *  org.spongepowered.asm.mixin.injection.ModifyArg
 *  org.spongepowered.asm.mixin.injection.Redirect
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfo
 */
package ruhack.phobia.a;

import com.llamalad7.mixinextras.injector.ModifyExpressionValue;
import com.llamalad7.mixinextras.sugar.Local;
import net.minecraft.class_10042;
import net.minecraft.class_10055;
import net.minecraft.class_11659;
import net.minecraft.class_12075;
import net.minecraft.class_1309;
import net.minecraft.class_1921;
import net.minecraft.class_3532;
import net.minecraft.class_4587;
import net.minecraft.class_465;
import net.minecraft.class_583;
import net.minecraft.class_922;
import org.jetbrains.annotations.Nullable;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.ModifyArg;
import org.spongepowered.asm.mixin.injection.Redirect;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import ruhack.phobia.ax;
import ruhack.phobia.bv;
import ruhack.phobia.c;
import ruhack.phobia.jc;
import ruhack.phobia.jg;
import ruhack.phobia.oo;
import ruhack.phobia.ot;

@Mixin(value={class_922.class})
public abstract class ba<S extends class_10042, M extends class_583<? super S>>
implements c {
    @Shadow
    @Nullable
    protected abstract class_1921 method_24302(S var1, boolean var2, boolean var3, boolean var4);

    @ModifyExpressionValue(method={"method_62355"}, at={@At(value="INVOKE", target="Lnet/minecraft/class_3532;method_17821(FFF)F")})
    private float lerpAngleDegreesHook(float original, @Local(ordinal=0, argsOnly=true) class_1309 entity, @Local(ordinal=0, argsOnly=true) float delta) {
        ot controller = ot.INSTANCE;
        if (entity.equals((Object)ba.mc.field_1724) && controller.getCurrentAngle() != null && !(ba.mc.field_1755 instanceof class_465)) {
            float prevYaw = controller.getPreviousRotation().getYaw();
            float currentYaw = controller.getRotation().getYaw();
            float effectiveDelta = delta;
            return class_3532.method_16439((float)effectiveDelta, (float)prevYaw, (float)currentYaw);
        }
        return original;
    }

    @ModifyExpressionValue(method={"method_62355"}, at={@At(value="INVOKE", target="Lnet/minecraft/class_1309;method_61414(F)F")})
    private float getLerpedPitchHook(float original, @Local(ordinal=0, argsOnly=true) class_1309 entity, @Local(ordinal=0, argsOnly=true) float delta) {
        ot controller = ot.INSTANCE;
        if (entity.equals((Object)ba.mc.field_1724) && controller.getCurrentAngle() != null && !(ba.mc.field_1755 instanceof class_465)) {
            float prevPitch = controller.getPreviousRotation().getPitch();
            float currentPitch = controller.getRotation().getPitch();
            float effectiveDelta = delta;
            return class_3532.method_16439((float)effectiveDelta, (float)prevPitch, (float)currentPitch);
        }
        return original;
    }

    @Redirect(method={"method_4054"}, at=@At(value="INVOKE", target="Lnet/minecraft/class_922;method_24302(Lnet/minecraft/class_10042;ZZZ)Lnet/minecraft/class_1921;"))
    private class_1921 renderLayerHook(class_922<?, ?, ?> instance, class_10042 state, boolean showBody, boolean translucent, boolean showOutline) {
        if (!translucent && state.field_53329 == 0.6f) {
            bv event = new bv(-1);
            ax.callEvent(event);
            if (event.isCancelled()) {
                translucent = true;
            }
        }
        return this.method_24302((S)state, showBody, translucent, showOutline);
    }

    @ModifyArg(method={"method_4054"}, at=@At(value="INVOKE", target="Lnet/minecraft/class_11659;method_73490(Lnet/minecraft/class_3879;Ljava/lang/Object;Lnet/minecraft/class_4587;Lnet/minecraft/class_1921;IIILnet/minecraft/class_1058;ILnet/minecraft/class_11683$class_11792;)V"), index=6)
    private int modifyColor(int color, @Local(argsOnly=true) S renderState) {
        if (((class_10042)renderState).field_53461) {
            bv event = new bv(color);
            ax.callEvent(event);
            return event.getColor();
        }
        return color;
    }

    /*
     * Unable to fully structure code
     */
    @Inject(method={"method_4054"}, at={@At(value="HEAD")})
    private void chamsContextStart(class_10042 state, class_4587 matrices, class_11659 queue, class_12075 cameraRenderState, CallbackInfo ci) {
        if (!jg.isGhostRenderPass() && state instanceof class_10055) {
            class_10055 playerState = (class_10055)state;
            jg.renderGhostCopies((class_922)(Object)this, playerState, matrices, queue, cameraRenderState);
        }
        boolean v0 = false;
        if (state instanceof class_10055) {
            class_10055 playerState = (class_10055)state;
            if (ba.mc.field_1724 != null && playerState.field_53528 == ba.mc.field_1724.method_5628()) {
                v0 = true;
            }
        }
        jc.renderingSelf = v0;
        jc chams = jc.getInstance();
        jc.renderContext = chams != null && chams.isState() && chams.shouldApply(state);
        jc.wallContext = jc.renderContext && chams.throughWalls.isValue();
        if (jc.renderContext) {
            jc.visibleLight = oo.packColorAlpha(chams.getPrimaryColor());
            jc.visibleOverlay = oo.packColorSpeedFill(chams.getSecondaryColor(), chams.speed.getValue(), chams.fillFraction());
            jc.wallLight = oo.packColorAlpha(chams.getPrimaryColor(), 0.45f);
            jc.wallOverlay = jc.visibleOverlay;
        }
    }

    @Inject(method={"method_4054"}, at={@At(value="RETURN")})
    private void chamsContextEnd(class_10042 state, class_4587 matrices, class_11659 queue, class_12075 cameraRenderState, CallbackInfo ci2) {
        jc.renderContext = false;
        jc.wallContext = false;
        jc.renderingSelf = false;
    }
}

