/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.client.gui.DrawContext
 *  net.minecraft.client.gui.render.state.ItemGuiElementRenderState
 *  org.joml.Matrix3x2fStack
 *  org.spongepowered.asm.mixin.Final
 *  org.spongepowered.asm.mixin.Mixin
 *  org.spongepowered.asm.mixin.Shadow
 *  org.spongepowered.asm.mixin.injection.At
 *  org.spongepowered.asm.mixin.injection.Inject
 *  org.spongepowered.asm.mixin.injection.ModifyArg
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfo
 */
package kotakbaz.rain.mixin;

import net.minecraft.client.gui.DrawContext;
import net.minecraft.client.gui.render.state.ItemGuiElementRenderState;
import org.joml.Matrix3x2fStack;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.ModifyArg;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import oxxxde.\u062a\u062b;
import oxxxde.\u062c\u0625;
import oxxxde.\u0634\u0632;

@Mixin(value={DrawContext.class})
public class MixinZoomDrawContext {
    @Shadow
    @Final
    private Matrix3x2fStack matrices;

    @Inject(method={"method_44379"}, at={@At(value="HEAD")})
    private void rain$pushZoomTransform(int x1, int y1, int x2, int y2, CallbackInfo ci) {
        this.matrices.pushMatrix();
        this.matrices.mul(\u0634\u0632.INSTANCE.getRenderTransform());
    }

    @ModifyArg(method={"method_51425"}, at=@At(value="INVOKE", target="Lnet/minecraft/class_11246;method_70920(Lnet/minecraft/class_11245;)V"))
    private ItemGuiElementRenderState rain$captureTargetHudItemAlpha(ItemGuiElementRenderState state) {
        ((\u062a\u062b)state).rain$setTargetHudAlpha(\u062c\u0625.currentAlpha());
        return state;
    }

    @Inject(method={"method_44379"}, at={@At(value="RETURN")})
    private void rain$popZoomTransform(int x1, int y1, int x2, int y2, CallbackInfo ci) {
        this.matrices.popMatrix();
    }
}

