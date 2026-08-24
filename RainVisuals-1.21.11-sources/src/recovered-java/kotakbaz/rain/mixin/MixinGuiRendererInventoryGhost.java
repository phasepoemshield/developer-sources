/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.client.gui.render.GuiRenderer
 *  net.minecraft.client.gui.render.state.ItemGuiElementRenderState
 *  org.spongepowered.asm.mixin.Mixin
 *  org.spongepowered.asm.mixin.Unique
 *  org.spongepowered.asm.mixin.injection.At
 *  org.spongepowered.asm.mixin.injection.Inject
 *  org.spongepowered.asm.mixin.injection.ModifyArg
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfo
 */
package kotakbaz.rain.mixin;

import net.minecraft.client.gui.render.GuiRenderer;
import net.minecraft.client.gui.render.state.ItemGuiElementRenderState;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.ModifyArg;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import oxxxde.\u062a\u062b;
import oxxxde.\u0638\u0638;

@Mixin(value={GuiRenderer.class})
public class MixinGuiRendererInventoryGhost {
    @Unique
    private float rain$targetHudItemAlpha = 1.0f;
    @Unique
    private static final int GHOST_COLOR = 0x66FFFFFF;
    @Unique
    private boolean rain$renderingGhostItem;

    @ModifyArg(method={"method_70887"}, at=@At(value="INVOKE", target="Lnet/minecraft/class_11241;<init>(Lcom/mojang/blaze3d/pipeline/RenderPipeline;Lnet/minecraft/class_11231;Lorg/joml/Matrix3x2f;IIIIFFFFILnet/minecraft/class_8030;Lnet/minecraft/class_8030;)V"), index=11)
    private int rain$applyItemAlpha(int original) {
        int color;
        int n = color = this.rain$renderingGhostItem ? 0x66FFFFFF : original;
        if (this.rain$targetHudItemAlpha >= 1.0f) {
            return color;
        }
        int alpha = Math.round((float)(color >>> 24 & 0xFF) * this.rain$targetHudItemAlpha);
        int red = Math.round((float)(color >>> 16 & 0xFF) * this.rain$targetHudItemAlpha);
        int green = Math.round((float)(color >>> 8 & 0xFF) * this.rain$targetHudItemAlpha);
        int blue = Math.round((float)(color & 0xFF) * this.rain$targetHudItemAlpha);
        return alpha << 24 | red << 16 | green << 8 | blue;
    }

    @Inject(method={"method_70887"}, at={@At(value="HEAD")})
    private void rain$identifyGhostItem(ItemGuiElementRenderState state, float u, float v, int size, int atlasSize, CallbackInfo ci) {
        float x = state.pose().m00() * (float)state.x() + state.pose().m10() * (float)state.y() + state.pose().m20();
        float y = state.pose().m01() * (float)state.x() + state.pose().m11() * (float)state.y() + state.pose().m21();
        this.rain$renderingGhostItem = \u0638\u0638.INSTANCE.isGhostPosition(Math.round(x), Math.round(y));
        this.rain$targetHudItemAlpha = ((\u062a\u062b)state).rain$getTargetHudAlpha();
    }

    @Inject(method={"method_70887"}, at={@At(value="RETURN")})
    private void rain$finishGhostItem(ItemGuiElementRenderState state, float u, float v, int size, int atlasSize, CallbackInfo ci) {
        this.rain$renderingGhostItem = false;
        this.rain$targetHudItemAlpha = 1.0f;
    }
}

