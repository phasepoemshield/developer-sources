package fun.nexisdlc.mixins.render;

import com.mojang.blaze3d.pipeline.RenderPipeline;
import fun.nexisdlc.client.utils.client.tweaks.crosshair.DrawContextFloatDrawTexture;
import fun.nexisdlc.client.utils.client.tweaks.crosshair.SubpixelPositionedTexturedQuadGuiElementRenderState;
import fun.nexisdlc.client.utils.render.main.core.Renderer2D;
import fun.nexisdlc.modules.impl.render.Beautifully;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.font.TextRenderer;
import net.minecraft.client.gui.DrawContext;
import net.minecraft.client.gui.render.state.GuiRenderState;
import net.minecraft.client.texture.Sprite;
import net.minecraft.client.texture.SpriteAtlasTexture;
import net.minecraft.client.texture.TextureSetup;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import org.joml.Matrix3x2f;
import org.joml.Matrix3x2fStack;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(DrawContext.class)
public class DrawContextMixin implements DrawContextFloatDrawTexture {
    @Shadow
    @Final
    private SpriteAtlasTexture spriteAtlasTexture;
    @Shadow
    @Final
    public GuiRenderState state;
    @Shadow
    @Final
    private MinecraftClient client;
    @Shadow
    @Final
    private Matrix3x2fStack matrices;
    @Shadow
    @Final
    public DrawContext.ScissorStack scissorStack;

    @Inject(method = "drawText(Lnet/minecraft/client/font/TextRenderer;Ljava/lang/String;IIIZ)V", at = @At("HEAD"), cancellable = true)
    private void nexis$drawCustomStringText(TextRenderer textRenderer, String text, int x, int y, int color, boolean shadow, CallbackInfo ci) {
        if (Beautifully.shouldRenderCustomMenuText()) {
            Beautifully.queueMenuText(text, x, y, color, false);
            ci.cancel();
        }
    }

    @Inject(method = "drawTextWithShadow(Lnet/minecraft/client/font/TextRenderer;Ljava/lang/String;III)V", at = @At("HEAD"), cancellable = true)
    private void nexis$drawCustomStringTextShadow(TextRenderer textRenderer, String text, int x, int y, int color, CallbackInfo ci) {
        if (Beautifully.shouldRenderCustomMenuText()) {
            Beautifully.queueMenuText(text, x, y, color, false);
            ci.cancel();
        }
    }

    @Inject(method = "drawText(Lnet/minecraft/client/font/TextRenderer;Lnet/minecraft/text/Text;IIIZ)V", at = @At("HEAD"), cancellable = true)
    private void nexis$drawCustomText(TextRenderer textRenderer, Text text, int x, int y, int color, boolean shadow, CallbackInfo ci) {
        if (Beautifully.shouldRenderCustomMenuText()) {
            Beautifully.queueMenuText(text.getString(), x, y, color, false);
            ci.cancel();
        }
    }

    @Inject(method = "drawTextWithShadow(Lnet/minecraft/client/font/TextRenderer;Lnet/minecraft/text/Text;III)V", at = @At("HEAD"), cancellable = true)
    private void nexis$drawCustomTextShadow(TextRenderer textRenderer, Text text, int x, int y, int color, CallbackInfo ci) {
        if (Beautifully.shouldRenderCustomMenuText()) {
            Beautifully.queueMenuText(text.getString(), x, y, color, false);
            ci.cancel();
        }
    }

    @Inject(method = "drawCenteredTextWithShadow(Lnet/minecraft/client/font/TextRenderer;Ljava/lang/String;III)V", at = @At("HEAD"), cancellable = true)
    private void nexis$drawCustomCenteredStringText(TextRenderer textRenderer, String text, int centerX, int y, int color, CallbackInfo ci) {
        if (Beautifully.shouldRenderCustomMenuText()) {
            Beautifully.queueMenuText(text, centerX, y, color, true);
            ci.cancel();
        }
    }

    @Inject(method = "drawCenteredTextWithShadow(Lnet/minecraft/client/font/TextRenderer;Lnet/minecraft/text/Text;III)V", at = @At("HEAD"), cancellable = true)
    private void nexis$drawCustomCenteredText(TextRenderer textRenderer, Text text, int centerX, int y, int color, CallbackInfo ci) {
        if (Beautifully.shouldRenderCustomMenuText()) {
            Beautifully.queueMenuText(text.getString(), centerX, y, color, true);
            ci.cancel();
        }
    }

    @Unique
    public void nexis$drawGuiTexture(RenderPipeline pipeline, Identifier texture, float x, float y, int width, int height) {
        nexis$drawGuiTexture(pipeline, texture, x, y, width, height, false);
    }

    @Unique
    public void nexis$drawGuiTexture(RenderPipeline pipeline, Identifier texture, float x, float y, int width, int height, boolean customRenderCulling) {
        if (width == 0 || height == 0) return;
        this.state.createNewRootLayer();

        Sprite sprite = this.spriteAtlasTexture.getSprite(texture);
        this.drawTexturedQuad(
                pipeline,
                sprite.getAtlasId(),
                x,
                x + width,
                y,
                y + height,
                sprite.getMinU() + (0b1 / 32768f),
                sprite.getMaxU() + (0b1 / 32768f),
                sprite.getMinV() - (0b1 / 32768f),
                sprite.getMaxV() - (0b1 / 32768f),
                -1,
                customRenderCulling
        );
    }

    @Unique
    public void nexis$drawGuiTextureColored(RenderPipeline pipeline, Identifier texture, float x, float y, int width, int height, int color, boolean customRenderCulling) {
        if (width == 0 || height == 0) return;
        this.state.createNewRootLayer();

        Sprite sprite = this.spriteAtlasTexture.getSprite(texture);
        this.drawTexturedQuad(
                pipeline,
                sprite.getAtlasId(),
                x,
                x + width,
                y,
                y + height,
                sprite.getMinU() + (0b1 / 32768f),
                sprite.getMaxU() + (0b1 / 32768f),
                sprite.getMinV() - (0b1 / 32768f),
                sprite.getMaxV() - (0b1 / 32768f),
                color,
                customRenderCulling
        );
    }

    @Unique
    public void nexis$drawTextureDirect(RenderPipeline pipeline, Identifier texture, float x, float y, int width, int height, int color, boolean customRenderCulling) {
        if (width == 0 || height == 0 || texture == null) return;
        this.state.createNewRootLayer();
        this.drawTexturedQuad(
                pipeline,
                texture,
                x,
                x + width,
                y,
                y + height,
                0f,
                1f,
                0f,
                1f,
                color,
                customRenderCulling
        );
    }

    @Unique
    void drawTexturedQuad(RenderPipeline pipeline, Identifier sprite, float x1, float x2, float y1, float y2, float u1, float u2, float v1, float v2, int color, boolean customRenderCulling) {
        float left = Math.min(x1, x2);
        float right = Math.max(x1, x2);
        float top = Math.min(y1, y2);
        float bottom = Math.max(y1, y2);
        Matrix3x2f matrix = new Matrix3x2f(this.matrices);
        if (customRenderCulling && intersectsRendererRegion(matrix, left, top, right - left, bottom - top)) {
            return;
        }
        var texture = this.client.getTextureManager().getTexture(sprite);
        this.state.addSimpleElement(new SubpixelPositionedTexturedQuadGuiElementRenderState(
                pipeline,
                TextureSetup.of(texture.getGlTextureView(), texture.getSampler()),
                matrix,
                left,
                top,
                right,
                bottom,
                u1,
                u2,
                v1,
                v2,
                color,
                this.scissorStack.peekLast()
        ));
    }

    @Unique
    public void nexis$drawItem(ItemStack stack, int x, int y, boolean customRenderCulling) {
        nexis$drawItem(stack, x, y, customRenderCulling, null);
    }

    @Unique
    public void nexis$drawItem(ItemStack stack, int x, int y, boolean customRenderCulling, String ignoredCullingOwnerKey) {
        if (stack == null || stack.isEmpty()) return;
        if (customRenderCulling && intersectsRendererRegion(new Matrix3x2f(this.matrices), x, y, 16f, 16f, ignoredCullingOwnerKey))
            return;
        this.state.createNewRootLayer();
        ((DrawContext) (Object) this).drawItem(stack, x, y);
    }

    @Unique
    private boolean intersectsRendererRegion(Matrix3x2f matrix, float x, float y, float w, float h) {
        return intersectsRendererRegion(matrix, x, y, w, h, null);
    }

    @Unique
    private boolean intersectsRendererRegion(Matrix3x2f matrix, float x, float y, float w, float h, String ignoredCullingOwnerKey) {
        float x0 = x;
        float y0 = y;
        float x1 = x + w;
        float y1 = y + h;

        float p0x = transformX(matrix, x0, y0);
        float p0y = transformY(matrix, x0, y0);
        float p1x = transformX(matrix, x1, y0);
        float p1y = transformY(matrix, x1, y0);
        float p2x = transformX(matrix, x1, y1);
        float p2y = transformY(matrix, x1, y1);
        float p3x = transformX(matrix, x0, y1);
        float p3y = transformY(matrix, x0, y1);

        float minX = Math.min(Math.min(p0x, p1x), Math.min(p2x, p3x));
        float maxX = Math.max(Math.max(p0x, p1x), Math.max(p2x, p3x));
        float minY = Math.min(Math.min(p0y, p1y), Math.min(p2y, p3y));
        float maxY = Math.max(Math.max(p0y, p1y), Math.max(p2y, p3y));

        if (!Float.isFinite(minX) || !Float.isFinite(maxX) || !Float.isFinite(minY) || !Float.isFinite(maxY)) {
            return false;
        }

        double scaleFactor = this.client.getWindow().getScaleFactor();
        if (!Double.isFinite(scaleFactor) || scaleFactor <= 0.0) {
            scaleFactor = 1.0;
        }

        float fbMinX = (float) (minX * scaleFactor);
        float fbMinY = (float) (minY * scaleFactor);
        float fbWidth = (float) ((maxX - minX) * scaleFactor);
        float fbHeight = (float) ((maxY - minY) * scaleFactor);
        return Renderer2D.intersectsItemCullingRegion(fbMinX, fbMinY, fbWidth, fbHeight, ignoredCullingOwnerKey);
    }

    @Unique
    private float transformX(Matrix3x2f matrix, float x, float y) {
        return matrix.m00() * x + matrix.m10() * y + matrix.m20();
    }

    @Unique
    private float transformY(Matrix3x2f matrix, float x, float y) {
        return matrix.m01() * x + matrix.m11() * y + matrix.m21();
    }
}
