/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_757
 *  net.minecraft.class_9779
 *  org.spongepowered.asm.mixin.Mixin
 *  org.spongepowered.asm.mixin.injection.At
 *  org.spongepowered.asm.mixin.injection.At$Shift
 *  org.spongepowered.asm.mixin.injection.Inject
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfo
 */
package kotakbaz.rain.mixin;

import kotakbaz.rain.client.listener.listeners.a_0;
import kotakbaz.rain.client.util.render.engine.controls.ClientRenderPipeline;
import net.minecraft.class_757;
import net.minecraft.class_9779;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(value={class_757.class})
public class MixinGameRenderer {
    public MixinGameRenderer() {
        super();
    }

    @Inject(method={"method_3192"}, at={@At(value="INVOKE", target="Lnet/minecraft/class_11228;method_70890(Lcom/mojang/blaze3d/buffers/GpuBufferSlice;)V", shift=At.Shift.BEFORE)})
    public void renderHudAndBelow(class_9779 tickCounter, boolean tick, CallbackInfo ci) {
        a_0.INSTANCE.hookRender(tickCounter.method_60637(false), ClientRenderPipeline.LOW, ClientRenderPipeline.MEDIUM, ClientRenderPipeline.HIGH, ClientRenderPipeline.HUD_RECT, ClientRenderPipeline.HUD_SPECIAL, ClientRenderPipeline.HUD_TEXT);
    }

    @Inject(method={"method_3192"}, at={@At(value="INVOKE", target="Lnet/minecraft/class_11228;method_70890(Lcom/mojang/blaze3d/buffers/GpuBufferSlice;)V", shift=At.Shift.AFTER)})
    public void renderGuiOnly(class_9779 tickCounter, boolean tick, CallbackInfo ci) {
        a_0.INSTANCE.hookRender(tickCounter.method_60637(false), ClientRenderPipeline.GUI_RECT, ClientRenderPipeline.GUI_SPECIAL, ClientRenderPipeline.GUI_TEXT, ClientRenderPipeline.WINDOW_RECT, ClientRenderPipeline.WINDOW_SPECIAL, ClientRenderPipeline.WINDOW_TEXT);
    }
}

