/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_327
 *  net.minecraft.class_329
 *  net.minecraft.class_332
 *  net.minecraft.class_9779
 *  org.spongepowered.asm.mixin.Mixin
 *  org.spongepowered.asm.mixin.Shadow
 *  org.spongepowered.asm.mixin.injection.At
 *  org.spongepowered.asm.mixin.injection.Inject
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfo
 */
package com.holdmylua.source.mixin.render;

import com.holdmylua.source.global.GlobalsStorage;
import net.minecraft.class_327;
import net.minecraft.class_329;
import net.minecraft.class_332;
import net.minecraft.class_9779;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(value={class_329.class})
public abstract class InGameHudMixin {
    @Shadow
    public abstract class_327 method_1756();

    @Inject(method={"method_1753"}, at={@At(value="HEAD")})
    private void debugText(class_332 context, class_9779 tickCounter, CallbackInfo ci) {
        if (!GlobalsStorage.debugTextRenderer.get().isEmpty()) {
            int y = 10;
            for (String s : GlobalsStorage.debugTextRenderer.get()) {
                context.method_25300(this.method_1756(), s, 10, y, 255);
                y += 10;
            }
            GlobalsStorage.debugTextRenderer.clear();
        }
    }
}

