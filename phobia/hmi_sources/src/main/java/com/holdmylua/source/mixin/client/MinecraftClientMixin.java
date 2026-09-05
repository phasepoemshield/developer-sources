/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_1268
 *  net.minecraft.class_239
 *  net.minecraft.class_310
 *  net.minecraft.class_636
 *  net.minecraft.class_638
 *  net.minecraft.class_746
 *  net.minecraft.class_757
 *  org.jetbrains.annotations.Nullable
 *  org.slf4j.Logger
 *  org.spongepowered.asm.mixin.Final
 *  org.spongepowered.asm.mixin.Mixin
 *  org.spongepowered.asm.mixin.Shadow
 *  org.spongepowered.asm.mixin.injection.At
 *  org.spongepowered.asm.mixin.injection.Inject
 *  org.spongepowered.asm.mixin.injection.Redirect
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable
 */
package com.holdmylua.source.mixin.client;

import com.holdmylua.source.access.LivingEntityAccessor;
import net.minecraft.class_1268;
import net.minecraft.class_239;
import net.minecraft.class_310;
import net.minecraft.class_636;
import net.minecraft.class_638;
import net.minecraft.class_746;
import net.minecraft.class_757;
import org.jetbrains.annotations.Nullable;
import org.slf4j.Logger;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.Redirect;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(value={class_310.class})
public class MinecraftClientMixin {
    @Shadow
    @Nullable
    public class_746 field_1724;
    @Shadow
    @Nullable
    public class_638 field_1687;
    @Shadow
    @Final
    public class_757 field_1773;
    @Shadow
    @Nullable
    public class_636 field_1761;
    @Shadow
    private int field_1752;
    @Shadow
    @Nullable
    public class_239 field_1765;
    @Shadow
    @Final
    private static Logger field_1762;

    @Inject(method={"method_1536"}, at={@At(value="INVOKE", target="Lnet/minecraft/class_746;method_6104(Lnet/minecraft/class_1268;)V")})
    public void doAttackMix(CallbackInfoReturnable<Boolean> cir) {
        class_746 class_7462 = this.field_1724;
        if (class_7462 instanceof LivingEntityAccessor) {
            LivingEntityAccessor mixin = (LivingEntityAccessor)class_7462;
            mixin.hMI5_0$resetMainHandSwing(false);
        }
    }

    @Redirect(method={"method_1583"}, at=@At(value="INVOKE", target="Lnet/minecraft/class_746;method_6104(Lnet/minecraft/class_1268;)V"))
    private void doItemUse(class_746 instance, class_1268 hand) {
        if (instance instanceof LivingEntityAccessor) {
            LivingEntityAccessor accessor = (LivingEntityAccessor)instance;
            if (hand == class_1268.field_5808) {
                accessor.hMI5_0$resetMainHandSwing(true);
            } else {
                accessor.hMI5_0$resetOffHandSwing(true);
            }
        }
        instance.method_6104(hand);
    }
}

