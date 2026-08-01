/*
 * Decompiled with CFR 0.152.
 */
package kotakbaz.rain.mixin;

import kotakbaz.rain.module.modules.render.ZoomModule;
import net.minecraft.client.gui.DrawContext;
import org.joml.Matrix3x2fStack;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(value={DrawContext.class})
public class MixinZoomDrawContext {
    @Shadow
    @Final
    private Matrix3x2fStack field_44657;

    @Inject(method={"method_44379"}, at={@At(value="HEAD")})
    private void rain$pushZoomTransform(int x1, int y1, int x2, int y2, CallbackInfo ci) {
        this.field_44657.pushMatrix();
        this.field_44657.mul(ZoomModule.INSTANCE.getRenderTransform());
    }

    @Inject(method={"method_44379"}, at={@At(value="RETURN")})
    private void rain$popZoomTransform(int x1, int y1, int x2, int y2, CallbackInfo ci) {
        this.field_44657.popMatrix();
    }
}

