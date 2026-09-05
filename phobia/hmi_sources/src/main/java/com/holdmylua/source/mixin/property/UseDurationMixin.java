/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_10485
 *  net.minecraft.class_11566
 *  net.minecraft.class_1799
 *  net.minecraft.class_310
 *  net.minecraft.class_638
 *  org.spongepowered.asm.mixin.Mixin
 *  org.spongepowered.asm.mixin.injection.At
 *  org.spongepowered.asm.mixin.injection.Inject
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable
 */
package com.holdmylua.source.mixin.property;

import com.holdmylua.source.global.GlobalsStorage;
import net.minecraft.class_10485;
import net.minecraft.class_11566;
import net.minecraft.class_1799;
import net.minecraft.class_310;
import net.minecraft.class_638;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(value={class_10485.class})
public class UseDurationMixin {
    @Inject(method={"method_65644"}, at={@At(value="RETURN")}, cancellable=true)
    private void swapProperty(class_1799 stack, class_638 world, class_11566 context, int seed, CallbackInfoReturnable<Float> cir) {
        if (class_310.method_1551().field_1724 != null && class_310.method_1551().field_1724.method_6030() == stack && GlobalsStorage.useDuration.containsKey(stack.method_7909().toString())) {
            cir.setReturnValue((Object)Float.valueOf(Float.parseFloat(GlobalsStorage.useDuration.get(stack.method_7909().toString()).toString())));
        }
    }
}

