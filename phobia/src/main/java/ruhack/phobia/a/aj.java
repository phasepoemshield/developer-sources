/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.llamalad7.mixinextras.injector.wrapoperation.Operation
 *  com.llamalad7.mixinextras.injector.wrapoperation.WrapOperation
 *  com.llamalad7.mixinextras.sugar.Local
 *  net.minecraft.class_11659
 *  net.minecraft.class_1268
 *  net.minecraft.class_1306
 *  net.minecraft.class_1309
 *  net.minecraft.class_1799
 *  net.minecraft.class_4587
 *  net.minecraft.class_742
 *  net.minecraft.class_759
 *  net.minecraft.class_811
 *  org.spongepowered.asm.mixin.Mixin
 *  org.spongepowered.asm.mixin.Shadow
 *  org.spongepowered.asm.mixin.Unique
 *  org.spongepowered.asm.mixin.injection.At
 *  org.spongepowered.asm.mixin.injection.At$Shift
 *  org.spongepowered.asm.mixin.injection.Inject
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfo
 */
package ruhack.phobia.a;

import com.llamalad7.mixinextras.injector.wrapoperation.Operation;
import com.llamalad7.mixinextras.injector.wrapoperation.WrapOperation;
import com.llamalad7.mixinextras.sugar.Local;
import net.minecraft.class_11659;
import net.minecraft.class_1268;
import net.minecraft.class_1306;
import net.minecraft.class_1309;
import net.minecraft.class_1799;
import net.minecraft.class_4587;
import net.minecraft.class_742;
import net.minecraft.class_759;
import net.minecraft.class_811;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import ruhack.phobia.ax;
import ruhack.phobia.cc;
import ruhack.phobia.cd;
import ruhack.phobia.cf;
import ruhack.phobia.cl;
import ruhack.phobia.jn;
import ruhack.phobia.jq;

@Mixin(value={class_759.class})
public abstract class aj {
    @Shadow
    private class_1799 field_4047;
    @Shadow
    private class_1799 field_4048;
    @Unique
    private boolean richCustomAnimation = false;

    @Shadow
    protected abstract void method_3219(class_4587 var1, class_11659 var2, int var3, float var4, float var5, class_1306 var6);

    @Shadow
    protected abstract void method_3233(class_1309 var1, class_1799 var2, class_811 var3, class_4587 var4, class_11659 var5, int var6);

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Inject(method={"method_3228"}, at={@At(value="HEAD")}, cancellable=true)
    private void phobia$renderHoldMyItems(class_742 player, float tickDelta, float pitch, class_1268 hand, float swingProgress, class_1799 stack, float equipProgress, class_4587 matrices, class_11659 orderedRenderCommandQueue, int light, CallbackInfo ci2) {
        jq animation = jq.getInstance();
        if (animation == null || !animation.shouldRenderHoldMyItems(player, hand, stack)) {
            return;
        }
        class_1306 arm = hand == class_1268.field_5808 ? player.method_6068() : player.method_6068().method_5928();
        matrices.method_22903();
        cd offsetEvent = new cd(matrices, stack, hand);
        ax.callEvent(offsetEvent);
        float scale = offsetEvent.getScale();
        if (scale != 1.0f) {
            matrices.method_22905(scale, scale, scale);
        }
        animation.applyHoldMyItemsHand(matrices, player, hand, stack, equipProgress, swingProgress, tickDelta);
        this.method_3219(matrices, orderedRenderCommandQueue, light, 0.0f, 0.0f, arm);
        if (!stack.method_7960()) {
            animation.applyHoldMyItemsItem(matrices, player, hand, stack, swingProgress);
            jn.firstPersonItemContext = true;
            try {
                this.method_3233((class_1309)player, stack, arm == class_1306.field_6183 ? class_811.field_4322 : class_811.field_4321, matrices, orderedRenderCommandQueue, light);
            }
            finally {
                jn.firstPersonItemContext = false;
            }
        }
        matrices.method_22909();
        jn.firstPersonArmContext = false;
        jn.firstPersonItemContext = false;
        ci2.cancel();
    }

    @Inject(method={"method_3216", "method_3219"}, at={@At(value="HEAD")})
    private void phobia$beginShaderArmContext(CallbackInfo ci2) {
        jn.firstPersonArmContext = true;
    }

    @Inject(method={"method_3216", "method_3219"}, at={@At(value="RETURN")})
    private void phobia$endShaderArmContext(CallbackInfo ci2) {
        jn.firstPersonArmContext = false;
    }

    @Inject(method={"method_3228"}, at={@At(value="HEAD")})
    private void phobia$beginShaderItemContext(class_742 player, float tickDelta, float pitch, class_1268 hand, float swingProgress, class_1799 stack, float equipProgress, class_4587 matrices, class_11659 orderedRenderCommandQueue, int light, CallbackInfo ci2) {
        jn.firstPersonItemContext = !stack.method_7960();
    }

    @Inject(method={"method_3228"}, at={@At(value="RETURN")})
    private void phobia$endShaderItemContext(class_742 player, float tickDelta, float pitch, class_1268 hand, float swingProgress, class_1799 stack, float equipProgress, class_4587 matrices, class_11659 orderedRenderCommandQueue, int light, CallbackInfo ci2) {
        jn.firstPersonItemContext = false;
    }

    @Inject(method={"method_3220"}, at={@At(value="TAIL")})
    private void onUpdateHeldItems(CallbackInfo ci2) {
        cf event = new cf(this.field_4047, this.field_4048);
        ax.callEvent(event);
        if (event.getMainHand() != this.field_4047) {
            this.field_4047 = event.getMainHand();
        }
        if (event.getOffHand() != this.field_4048) {
            this.field_4048 = event.getOffHand();
        }
    }

    @WrapOperation(method={"method_22976(FLnet/minecraft/class_4587;Lnet/minecraft/class_11659;Lnet/minecraft/class_742;I)V"}, at={@At(value="INVOKE", target="Lnet/minecraft/class_759;method_3228(Lnet/minecraft/class_742;FFLnet/minecraft/class_1268;FLnet/minecraft/class_1799;FLnet/minecraft/class_4587;Lnet/minecraft/class_11659;I)V")})
    private void itemRenderHook(class_759 instance, class_742 player, float tickDelta, float pitch, class_1268 hand, float swingProgress, class_1799 item, float equipProgress, class_4587 matrices, class_11659 orderedRenderCommandQueue, int light, Operation<Void> original) {
        cl event = new cl(player, item, hand);
        ax.callEvent(event);
        original.call(new Object[]{instance, event.getPlayer(), Float.valueOf(tickDelta), Float.valueOf(pitch), event.getHand(), Float.valueOf(swingProgress), event.getStack(), Float.valueOf(equipProgress), matrices, orderedRenderCommandQueue, light});
    }

    @Inject(method={"method_3228"}, at={@At(value="INVOKE", target="Lnet/minecraft/class_4587;method_22903()V", shift=At.Shift.AFTER)})
    private void renderFirstPersonItemHook(class_742 player, float tickDelta, float pitch, class_1268 hand, float swingProgress, class_1799 stack, float equipProgress, class_4587 matrices, class_11659 orderedRenderCommandQueue, int light, CallbackInfo ci2) {
        cd event = new cd(matrices, stack, hand);
        ax.callEvent(event);
        float scale = event.getScale();
        if (scale != 1.0f) {
            matrices.method_22905(scale, scale, scale);
        }
    }

    @WrapOperation(method={"method_3228"}, at={@At(value="INVOKE", target="Lnet/minecraft/class_759;method_3224(Lnet/minecraft/class_4587;Lnet/minecraft/class_1306;F)V")})
    private void wrapApplyEquipOffset(class_759 instance, class_4587 matrices, class_1306 arm, float equipProgress, Operation<Void> original, @Local(ordinal=0, argsOnly=true) class_742 player, @Local(ordinal=0, argsOnly=true) class_1268 hand, @Local(ordinal=2, argsOnly=true) float swingProgress, @Local(ordinal=0, argsOnly=true) class_1799 stack) {
        boolean isUsingItem;
        boolean bl2 = isUsingItem = player.method_6115() && player.method_6058() == hand;
        if (isUsingItem) {
            this.richCustomAnimation = false;
            original.call(new Object[]{instance, matrices, arm, Float.valueOf(equipProgress)});
            return;
        }
        cc event = new cc(matrices, hand, swingProgress);
        ax.callEvent(event);
        if (event.isCancelled()) {
            this.richCustomAnimation = true;
            return;
        }
        this.richCustomAnimation = false;
        original.call(new Object[]{instance, matrices, arm, Float.valueOf(equipProgress)});
    }

    @WrapOperation(method={"method_3228"}, at={@At(value="INVOKE", target="Lnet/minecraft/class_759;method_65816(FLnet/minecraft/class_4587;ILnet/minecraft/class_1306;)V")})
    private void wrapSwingArm(class_759 instance, float swingProgress, class_4587 matrices, int armX, class_1306 arm, Operation<Void> original) {
        if (this.richCustomAnimation) {
            return;
        }
        original.call(new Object[]{instance, Float.valueOf(swingProgress), matrices, armX, arm});
    }
}
