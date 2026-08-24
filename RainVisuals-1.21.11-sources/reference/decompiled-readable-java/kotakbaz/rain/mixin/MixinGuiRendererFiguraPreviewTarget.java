/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.llamalad7.mixinextras.injector.ModifyExpressionValue
 *  net.minecraft.client.gl.Framebuffer
 *  net.minecraft.client.gui.render.GuiRenderer
 *  org.spongepowered.asm.mixin.Mixin
 *  org.spongepowered.asm.mixin.injection.At
 */
package kotakbaz.rain.mixin;

import com.llamalad7.mixinextras.injector.ModifyExpressionValue;
import net.minecraft.client.gl.Framebuffer;
import net.minecraft.client.gui.render.GuiRenderer;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import oxxxde.\u0627\u0626;

@Mixin(value={GuiRenderer.class})
public class MixinGuiRendererFiguraPreviewTarget {
    @ModifyExpressionValue(method={"method_71291"}, at={@At(value="INVOKE", target="Lnet/minecraft/class_1041;method_4489()I")})
    private int rain$useFiguraPreviewWidth(int original) {
        return \u0627\u0626.physicalWidthOr(original);
    }

    @ModifyExpressionValue(method={"method_70893", "method_71291"}, at={@At(value="INVOKE", target="Lnet/minecraft/class_1041;method_4495()I")})
    private int rain$useFiguraPreviewGuiScale(int original) {
        return \u0627\u0626.guiScaleOr(original);
    }

    @ModifyExpressionValue(method={"method_71291"}, at={@At(value="INVOKE", target="Lnet/minecraft/class_1041;method_4506()I")})
    private int rain$useFiguraPreviewHeight(int original) {
        return \u0627\u0626.physicalHeightOr(original);
    }

    @ModifyExpressionValue(method={"method_71291"}, at={@At(value="INVOKE", target="Lnet/minecraft/class_310;method_1522()Lnet/minecraft/class_276;")})
    private Framebuffer rain$useFiguraPreviewTarget(Framebuffer original) {
        return \u0627\u0626.targetOr(original);
    }
}

