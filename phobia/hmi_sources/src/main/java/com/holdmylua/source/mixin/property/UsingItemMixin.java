/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_10468
 *  net.minecraft.class_1309
 *  net.minecraft.class_1799
 *  net.minecraft.class_638
 *  net.minecraft.class_811
 *  org.spongepowered.asm.mixin.Mixin
 *  org.spongepowered.asm.mixin.injection.At
 *  org.spongepowered.asm.mixin.injection.Inject
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable
 */
package com.holdmylua.source.mixin.property;

import com.holdmylua.source.global.GlobalsStorage;
import net.minecraft.class_10468;
import net.minecraft.class_1309;
import net.minecraft.class_1799;
import net.minecraft.class_638;
import net.minecraft.class_811;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(value={class_10468.class})
public class UsingItemMixin {
    @Inject(method={"method_65638"}, at={@At(value="RETURN")}, cancellable=true)
    private void swapProperty(class_1799 stack, class_638 world, class_1309 entity, int seed, class_811 displayContext, CallbackInfoReturnable<Boolean> cir) {
        if (entity != null && entity.method_6030() == stack && GlobalsStorage.usingItem.containsKey(stack.method_7909().toString())) {
            cir.setReturnValue((Object)GlobalsStorage.usingItem.get(stack.method_7909().toString()));
        }
    }
}

