/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_310
 *  net.minecraft.class_757
 *  net.minecraft.class_9779
 *  org.lwjgl.glfw.GLFW
 *  org.spongepowered.asm.mixin.Mixin
 *  org.spongepowered.asm.mixin.injection.At
 *  org.spongepowered.asm.mixin.injection.Inject
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfo
 */
package com.holdmylua.source.mixin.client;

import com.holdmylua.source.LuaTestHMI;
import net.minecraft.class_310;
import net.minecraft.class_757;
import net.minecraft.class_9779;
import org.lwjgl.glfw.GLFW;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(value={class_757.class})
public class GameRendererMixin {
    @Inject(method={"method_3192"}, at={@At(value="HEAD")})
    private void deltaTime(class_9779 tickCounter, boolean tick, CallbackInfo ci) {
        float currentTime = (float)GLFW.glfwGetTime();
        LuaTestHMI.deltaTime = currentTime - LuaTestHMI.prevTime;
        LuaTestHMI.prevTime = currentTime;
        LuaTestHMI.deltaTime = class_310.method_1551().method_1493() ? 0.0f : (float)Math.min(0.05, (double)LuaTestHMI.deltaTime);
    }
}

