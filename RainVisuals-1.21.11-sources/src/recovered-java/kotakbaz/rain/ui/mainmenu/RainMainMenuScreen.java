/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.joml.Vector4f
 */
package kotakbaz.rain.ui.mainmenu;

import java.awt.Color;
import kotakbaz.rain.client.render.texture.texture.GLTexture;
import kotakbaz.rain.client.util.render.display.TextureRectRenderer;
import kotakbaz.rain.client.util.render.font.Font;
import kotakbaz.rain.ui.api.PipelinedRender;
import kotakbaz.rain.ui.menu.layout.MenuLayout;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.math.MathKt;
import kotlin.ranges.RangesKt;
import org.jetbrains.annotations.NotNull;
import org.joml.Vector4f;
import oxxxde.\u0628\u062f;
import oxxxde.\u062b\u0652;
import oxxxde.\u0630\u0631;
import oxxxde.\u0631\u064e;
import oxxxde.\u0634\u0633;

@Metadata(mv={2, 3, 0}, k=1, xi=48, d1={"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\b\u0004\u0010\u0005J-\u0010\r\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\b\u00a2\u0006\u0004\b\r\u0010\u000eJ/\u0010\u0011\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\bH\u0002\u00a2\u0006\u0004\b\u0011\u0010\u000eR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b\u0003\u0010\u0012\u00a8\u0006\u0013"}, d2={"Loxxxde/\u062c\u062e;", "", "Loxxxde/\u0627\u0633;", "pipelines", "<init>", "(Lkotakbaz/rain/ui/api/PipelinedRender;)V", "Loxxxde/\u0632\u0652;", "layout", "", "alpha", "avatarHoverProgress", "avatarPopupProgress", "", "render", "(Lkotakbaz/rain/ui/menu/layout/MenuLayout;FFF)V", "hoverProgress", "popupProgress", "renderAvatar", "Loxxxde/\u0627\u0633;", "rain-visuals"})
public final class RainMainMenuScreen {
    @NotNull
    private final PipelinedRender pipelines;

    public RainMainMenuScreen(@NotNull PipelinedRender pipelines) {
        Intrinsics.checkNotNullParameter(pipelines, "pipelines");
        this.pipelines = pipelines;
    }

    /*
     * WARNING - void declaration
     */
    private final void renderAvatar(MenuLayout layout, float alpha, float hoverProgress, float popupProgress) {
        void var23_23;
        GLTexture gLTexture = \u0634\u0633.INSTANCE.get("interface_avatar");
        if (gLTexture == null) {
            return;
        }
        GLTexture avatarTexture = gLTexture;
        if (layout.getAvatarSize() <= 0.0f) {
            return;
        }
        float baseSize = RangesKt.coerceAtLeast(MathKt.roundToInt(layout.getAvatarSize()), 1);
        float size = baseSize * (1.0f + RangesKt.coerceIn(hoverProgress, 0.0f, 1.0f) * 0.06f);
        float centerX = layout.getAvatarX() + layout.getAvatarSize() * 0.5f;
        float centerY = layout.getAvatarY() + layout.getAvatarSize() * 0.5f;
        float avatarX = centerX - size * 0.5f;
        float avatarY = centerY - size * 0.5f;
        float radius = RangesKt.coerceAtLeast(size * 0.5f - 1.0f, 0.0f);
        TextureRectRenderer textureRectRenderer = \u0630\u0631.INSTANCE.getTEXTURE_RECT().priority(this.pipelines.iconsPipeline()).texture(avatarTexture.getTexId());
        Color color = Color.WHITE;
        Intrinsics.checkNotNullExpressionValue(color, "WHITE");
        textureRectRenderer.draw(avatarX, avatarY, size, size, color, radius, 0.0f, 0.0f, 1.0f, 1.0f, -1.0f, alpha);
        String gearText = "f";
        float gearSize = RangesKt.coerceAtLeast(baseSize * 0.34f, 5.0f);
        float gearWidth = Font.getWidth$default(\u0631\u064e.INSTANCE.getICON(), gearText, gearSize, 0.0f, 4, null);
        float gearHeight = \u0631\u064e.INSTANCE.getICON().getHeight(gearSize);
        float gearCenterX = avatarX + size * 0.78f;
        float gearCenterY = avatarY + size * 0.78f;
        float gearX = gearCenterX - gearWidth * 0.5f;
        float gearY = gearCenterY - gearHeight * 0.5f;
        float gearRotation = RangesKt.coerceIn(popupProgress, 0.0f, 1.0f) * (float)Math.PI;
        int shadowAlpha = RangesKt.coerceIn(MathKt.roundToInt(alpha * 0.58f * 255.0f), 0, 255);
        int iconAlpha = RangesKt.coerceIn(MathKt.roundToInt(alpha * 255.0f), 0, 255);
        \u0628\u062f.INSTANCE.pushMatrix();
        \u0628\u062f.matrix4fStack.translate(gearCenterX, gearCenterY, 0.0f);
        \u0628\u062f.matrix4fStack.rotateZ(gearRotation);
        \u0628\u062f.matrix4fStack.translate(-gearCenterX, -gearCenterY, 0.0f);
        Font.drawText$default(\u0631\u064e.INSTANCE.getICON().priority(this.pipelines.iconsPipeline()), gearText, gearX + 0.35f, gearY + 0.35f, gearSize, new Color(0, 0, 0, shadowAlpha), 0.0f, 0.0f, 0.0f, 0, 0.0f, 992, null);
        Font.drawText$default(\u0631\u064e.INSTANCE.getICON().priority(this.pipelines.iconsPipeline()), gearText, gearX, gearY, gearSize, new Color(205, 205, 205, (int)var23_23), 0.0f, 0.0f, 0.0f, 0, 0.0f, 992, null);
        \u0628\u062f.INSTANCE.popMatrix();
    }

    /*
     * WARNING - void declaration
     */
    public final void render(@NotNull MenuLayout layout, float alpha, float avatarHoverProgress, float avatarPopupProgress) {
        void var4_4;
        void var3_3;
        void var2_2;
        void var1_1;
        Intrinsics.checkNotNullParameter(layout, "layout");
        \u0630\u0631.INSTANCE.getBLURRED_RECT().priority(this.pipelines.rectPipeline()).round(layout.getRadius()).color(\u062b\u0652.INSTANCE.panel((float)\u062b\u0652.INSTANCE.getPanelBase().getAlpha() / 255.0f * alpha)).mix(0.95f).draw(layout.getX(), layout.getY(), layout.getWidth(), layout.getHeight());
        \u0630\u0631.INSTANCE.getBLURRED_RECT().priority(this.pipelines.rectPipeline()).round(new Vector4f(layout.getRadius(), 0.0f, layout.getRadius(), 0.0f)).color(\u062b\u0652.INSTANCE.surface(((float)\u062b\u0652.INSTANCE.getSurfaceBase().getAlpha() + 5.0f) / 255.0f * alpha)).mix(0.95f).draw(layout.getX(), layout.getY(), layout.getPanelWidth(), layout.getHeight());
        Font.drawCenteredText$default(\u0631\u064e.INSTANCE.getLOGO().priority(this.pipelines.iconsPipeline()).smoothness(0.5f).spacing(0.0f).resetFade(), "a", layout.getX() + layout.getPanelWidth() * 0.56f, layout.getLogoY(), layout.getLogoSize(), \u062b\u0652.INSTANCE.title(0.9f * alpha), 0.0f, 32, null);
        \u0630\u0631.INSTANCE.getBLURRED_RECT().priority(this.pipelines.rectPipeline()).round(1.0f).color(\u062b\u0652.INSTANCE.title(0.45f * alpha)).mix(0.95f).draw(layout.getX() + layout.getUiPadding() * 2.0f, layout.getY() + layout.getHeaderHeight() * 0.9f, layout.getPanelWidth() - layout.getUiPadding() * 4.0f, 1.0f);
        this.renderAvatar((MenuLayout)var1_1, (float)var2_2, (float)var3_3, (float)var4_4);
    }
}

