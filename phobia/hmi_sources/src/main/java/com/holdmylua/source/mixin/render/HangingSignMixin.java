/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_11659
 *  net.minecraft.class_11683$class_11792
 *  net.minecraft.class_11701
 *  net.minecraft.class_3879
 *  net.minecraft.class_3879$class_9948
 *  net.minecraft.class_3902
 *  net.minecraft.class_4587
 *  net.minecraft.class_4608
 *  net.minecraft.class_4730
 *  net.minecraft.class_7761
 *  org.spongepowered.asm.mixin.Mixin
 *  org.spongepowered.asm.mixin.injection.At
 *  org.spongepowered.asm.mixin.injection.Inject
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfo
 */
package com.holdmylua.source.mixin.render;

import java.util.Objects;
import net.minecraft.class_11659;
import net.minecraft.class_11683;
import net.minecraft.class_11701;
import net.minecraft.class_3879;
import net.minecraft.class_3902;
import net.minecraft.class_4587;
import net.minecraft.class_4608;
import net.minecraft.class_4730;
import net.minecraft.class_7761;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(value={class_7761.class})
public abstract class HangingSignMixin {
    @Inject(method={"method_65829"}, at={@At(value="HEAD")}, cancellable=true)
    private static void render(class_11701 spriteHolder, class_4587 matrixStack, class_11659 orderedRenderCommandQueue, int i, int j, class_3879.class_9948 singlePartModel, class_4730 spriteIdentifier, CallbackInfo ci) {
        matrixStack.method_22903();
        class_7761.method_49918((class_4587)matrixStack, (float)0.0f);
        matrixStack.method_22905(1.0f, -1.0f, -1.0f);
        class_3902 var10002 = class_3902.field_17274;
        Objects.requireNonNull(singlePartModel);
        orderedRenderCommandQueue.method_73490((class_3879)singlePartModel, (Object)var10002, matrixStack, spriteIdentifier.method_24146(arg_0 -> ((class_3879.class_9948)singlePartModel).method_23500(arg_0)), i, class_4608.field_21444, -1, spriteHolder.method_73030(spriteIdentifier), 0, (class_11683.class_11792)null);
        matrixStack.method_22909();
        ci.cancel();
    }
}

