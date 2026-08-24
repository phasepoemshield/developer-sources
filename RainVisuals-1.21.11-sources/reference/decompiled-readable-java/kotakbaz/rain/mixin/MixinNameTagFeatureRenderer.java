/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.client.font.TextRenderer
 *  net.minecraft.client.font.TextRenderer$TextLayerType
 *  net.minecraft.client.render.VertexConsumerProvider
 *  net.minecraft.client.render.VertexConsumerProvider$Immediate
 *  net.minecraft.client.render.command.BatchingRenderCommandQueue
 *  net.minecraft.client.render.command.LabelCommandRenderer
 *  net.minecraft.text.Text
 *  org.joml.Matrix4f
 *  org.joml.Matrix4fc
 *  org.spongepowered.asm.mixin.Mixin
 *  org.spongepowered.asm.mixin.Unique
 *  org.spongepowered.asm.mixin.injection.At
 *  org.spongepowered.asm.mixin.injection.Inject
 *  org.spongepowered.asm.mixin.injection.Redirect
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfo
 */
package kotakbaz.rain.mixin;

import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.ArrayList;
import java.util.List;
import net.minecraft.client.font.TextRenderer;
import net.minecraft.client.render.VertexConsumerProvider;
import net.minecraft.client.render.command.BatchingRenderCommandQueue;
import net.minecraft.client.render.command.LabelCommandRenderer;
import net.minecraft.text.Text;
import org.joml.Matrix4f;
import org.joml.Matrix4fc;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.Redirect;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import oxxxde.\u0631\u0627;
import oxxxde.\u0632\u062a;

@Mixin(value={LabelCommandRenderer.class})
public class MixinNameTagFeatureRenderer {
    @Unique
    private final List<RainSocialOverlay> rain$socialOverlays = new ArrayList<RainSocialOverlay>();

    @Inject(method={"method_73014"}, at={@At(value="TAIL")})
    private void rain$finishNameTagRender(BatchingRenderCommandQueue nodes, VertexConsumerProvider.Immediate buffers, TextRenderer font, CallbackInfo ci) {
        if (this.rain$socialOverlays.isEmpty()) {
            return;
        }
        buffers.draw();
        Text icon = \u0631\u0627.icon();
        for (RainSocialOverlay overlay : this.rain$socialOverlays) {
            font.draw(icon, overlay.x, overlay.y, -1, false, overlay.pose, (VertexConsumerProvider)buffers, TextRenderer.TextLayerType.NORMAL, 0, overlay.light);
        }
        buffers.draw();
        this.rain$socialOverlays.clear();
    }

    @Inject(method={"method_73014"}, at={@At(value="HEAD")})
    private void rain$beginNameTagRender(BatchingRenderCommandQueue nodes, VertexConsumerProvider.Immediate buffers, TextRenderer font, CallbackInfo ci) {
        this.rain$socialOverlays.clear();
    }

    @Redirect(method={"method_73014"}, at=@At(value="INVOKE", target="Lnet/minecraft/class_327;method_27522(Lnet/minecraft/class_2561;FFIZLorg/joml/Matrix4f;Lnet/minecraft/class_4597;Lnet/minecraft/class_327$class_6415;II)V"))
    private void rain$renderNameTag(TextRenderer font, Text text, float x, float y, int color, boolean shadow, Matrix4f pose, VertexConsumerProvider buffers, TextRenderer.TextLayerType displayMode, int backgroundColor, int light) {
        boolean renderedShadow = \u0632\u062a.INSTANCE.isEnabled() && (Boolean)\u0632\u062a.INSTANCE.getAddShadow().getValue() != false || shadow;
        int renderedBackground = \u0632\u062a.INSTANCE.isEnabled() && (Boolean)\u0632\u062a.INSTANCE.getRemoveBackground().getValue() != false ? 0 : backgroundColor;
        font.draw(text, x, y, color, renderedShadow, pose, buffers, displayMode, renderedBackground, light);
        if (\u0631\u0627.isMarked(text) && displayMode == TextRenderer.TextLayerType.NORMAL) {
            this.rain$socialOverlays.add(new RainSocialOverlay(x, y, new Matrix4f((Matrix4fc)pose), light));
        }
    }

    @Unique
    private record RainSocialOverlay(float y, float x, Matrix4f pose, int light) {
        @Override
        public final String toString() {
            return ObjectMethods.bootstrap("toString", new MethodHandle[]{RainSocialOverlay.class, "x;y;pose;light", "x", "y", "pose", "light"}, this);
        }

        private RainSocialOverlay(float x, float y, Matrix4f pose, int light) {
            this.x = x;
            this.y = y;
            this.pose = pose;
            this.light = light;
        }

        @Override
        public final boolean equals(Object o) {
            return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{RainSocialOverlay.class, "x;y;pose;light", "x", "y", "pose", "light"}, this, o);
        }

        @Override
        public final int hashCode() {
            return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{RainSocialOverlay.class, "x;y;pose;light", "x", "y", "pose", "light"}, this);
        }
    }
}

