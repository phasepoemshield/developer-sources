/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  ru.ocz.protection.annotation.Compile
 *  ru.ocz.protection.virtualmachine.annotation.RecompileFormat
 */
package kotakbaz.rain.ui.menu.settings.impl;

import java.awt.Color;
import kotakbaz.rain.client.render.texture.texture.GLTexture;
import kotakbaz.rain.client.util.animations.AnimationUtil;
import kotakbaz.rain.client.util.render.display.TextureRectRenderer;
import kotakbaz.rain.client.util.render.font.Font;
import kotakbaz.rain.module.setting.Setting;
import kotakbaz.rain.module.setting.settings.ColorSetting;
import kotakbaz.rain.ui.menu.settings.ModuleSettingComponent;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.math.MathKt;
import kotlin.ranges.RangesKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import oxxxde.\u0628\u062d;
import oxxxde.\u0628\u0641;
import oxxxde.\u062b\u0652;
import oxxxde.\u062c\u064c;
import oxxxde.\u0630\u0631;
import oxxxde.\u0632\u0624;
import oxxxde.\u0634\u0633;
import oxxxde.\u0635;
import oxxxde.\u064f;
import ru.ocz.protection.annotation.Compile;
import ru.ocz.protection.virtualmachine.annotation.RecompileFormat;

@Metadata(mv={2, 3, 0}, k=1, xi=48, d1={"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0014\b\u0007\u0018\u0000 R2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0003RSTB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\b\u0004\u0010\u0005J'\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0017\u00a2\u0006\u0004\b\f\u0010\rJ'\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u0006H\u0017\u00a2\u0006\u0004\b\u000f\u0010\u0010J'\u0010\u0011\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u0006H\u0016\u00a2\u0006\u0004\b\u0011\u0010\u0010J'\u0010\u0016\u001a\u00020\u000b2\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\t2\u0006\u0010\u0015\u001a\u00020\tH\u0002\u00a2\u0006\u0004\b\u0016\u0010\u0017J'\u0010\u0018\u001a\u00020\u000b2\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\t2\u0006\u0010\u0015\u001a\u00020\tH\u0002\u00a2\u0006\u0004\b\u0018\u0010\u0017J'\u0010\u0019\u001a\u00020\u000b2\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\t2\u0006\u0010\u0015\u001a\u00020\tH\u0002\u00a2\u0006\u0004\b\u0019\u0010\u0017J/\u0010\u001d\u001a\u00020\u000b2\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0015\u001a\u00020\t2\u0006\u0010\u001c\u001a\u00020\tH\u0002\u00a2\u0006\u0004\b\u001d\u0010\u001eJ'\u0010\u001f\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\u0013\u001a\u00020\u0012H\u0002\u00a2\u0006\u0004\b\u001f\u0010 J\u001f\u0010!\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\t2\u0006\u0010\u0013\u001a\u00020\u0012H\u0002\u00a2\u0006\u0004\b!\u0010\"J\u001f\u0010#\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\t2\u0006\u0010\u0013\u001a\u00020\u0012H\u0002\u00a2\u0006\u0004\b#\u0010\"J\u000f\u0010$\u001a\u00020\u000bH\u0002\u00a2\u0006\u0004\b$\u0010%J\u000f\u0010&\u001a\u00020\u000bH\u0002\u00a2\u0006\u0004\b&\u0010%J\u0017\u0010)\u001a\u00020\u000b2\u0006\u0010(\u001a\u00020'H\u0002\u00a2\u0006\u0004\b)\u0010*J\u000f\u0010+\u001a\u00020\u0012H\u0002\u00a2\u0006\u0004\b+\u0010,J\u000f\u0010.\u001a\u00020-H\u0002\u00a2\u0006\u0004\b.\u0010/J\u000f\u00100\u001a\u00020\tH\u0002\u00a2\u0006\u0004\b0\u00101J\u000f\u0010\u0015\u001a\u00020\tH\u0002\u00a2\u0006\u0004\b\u0015\u00101J\u000f\u00102\u001a\u00020\u000bH\u0002\u00a2\u0006\u0004\b2\u0010%J'\u00104\u001a\u0002032\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006H\u0002\u00a2\u0006\u0004\b4\u00105J\u001f\u00106\u001a\u00020'2\u0006\u0010(\u001a\u00020'2\u0006\u0010\u0014\u001a\u00020\tH\u0002\u00a2\u0006\u0004\b6\u00107R\u0014\u00108\u001a\u00020\t8\u0002X\u0082D\u00a2\u0006\u0006\n\u0004\b8\u00109R\u0014\u0010:\u001a\u00020\t8\u0002X\u0082D\u00a2\u0006\u0006\n\u0004\b:\u00109R\u0014\u0010;\u001a\u00020\t8\u0002X\u0082D\u00a2\u0006\u0006\n\u0004\b;\u00109R\u0014\u0010<\u001a\u00020\t8\u0002X\u0082D\u00a2\u0006\u0006\n\u0004\b<\u00109R\u0014\u0010=\u001a\u00020\t8\u0002X\u0082D\u00a2\u0006\u0006\n\u0004\b=\u00109R\u0014\u0010>\u001a\u00020\t8\u0002X\u0082D\u00a2\u0006\u0006\n\u0004\b>\u00109R\u0016\u0010?\u001a\u0002038\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\b?\u0010@R\u0014\u0010B\u001a\u00020A8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\bB\u0010CR\u0014\u0010D\u001a\u00020A8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\bD\u0010CR\u0014\u0010E\u001a\u00020A8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\bE\u0010CR\u0016\u0010F\u001a\u0002038\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\bF\u0010@R\u0016\u0010G\u001a\u0002038\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\bG\u0010@R\u0016\u0010H\u001a\u0002038\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\bH\u0010@R\u0016\u0010I\u001a\u0002038\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\bI\u0010@R\u0016\u0010J\u001a\u00020\t8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\bJ\u00109R\u0016\u0010K\u001a\u00020\t8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\bK\u00109R\u0016\u0010L\u001a\u00020\t8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\bL\u00109R\u0016\u0010M\u001a\u00020\t8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\bM\u00109R\u0016\u0010N\u001a\u00020'8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\bN\u0010OR\u0014\u0010Q\u001a\u00020\t8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\bP\u00101\u00a8\u0006U"}, d2={"Loxxxde/\u062b\u064d;", "Loxxxde/\u0622;", "Loxxxde/\u0631\u062a;", "setting", "<init>", "(Lkotakbaz/rain/module/setting/settings/ColorSetting;)V", "", "mouseX", "mouseY", "", "partialTicks", "", "render", "(IIF)V", "button", "onMouseClick", "(III)V", "onMouseRelease", "Loxxxde/\u0637\u064b;", "rect", "uiAlpha", "openProgress", "drawPicker", "(Lkotakbaz/rain/ui/menu/settings/impl/ColorSettingComponent$Rect;FF)V", "drawHueBar", "drawAlphaBar", "", "text", "hoverProgress", "drawButton", "(Lkotakbaz/rain/ui/menu/settings/impl/ColorSettingComponent$Rect;Ljava/lang/String;FF)V", "updatePicker", "(FFLkotakbaz/rain/ui/menu/settings/impl/ColorSettingComponent$Rect;)V", "updateHue", "(FLkotakbaz/rain/ui/menu/settings/impl/ColorSettingComponent$Rect;)V", "updateAlpha", "applyCurrentHSB", "()V", "syncFromSetting", "Ljava/awt/Color;", "color", "applyColor", "(Ljava/awt/Color;)V", "previewRect", "()Lkotakbaz/rain/ui/menu/settings/impl/ColorSettingComponent$Rect;", "Loxxxde/\u0631\u0630;", "expandedLayout", "()Lkotakbaz/rain/ui/menu/settings/impl/ColorSettingComponent$Layout;", "expandedSectionHeight", "()F", "stopDragging", "", "contains", "(Lkotakbaz/rain/ui/menu/settings/impl/ColorSettingComponent$Rect;II)Z", "withUiAlpha", "(Ljava/awt/Color;F)Ljava/awt/Color;", "rowHeight", "F", "gap", "pickerHeight", "hueHeight", "alphaHeight", "buttonHeight", "open", "Z", "Loxxxde/\u0631\u064a;", "openAnim", "Loxxxde/\u0631\u064a;", "copyHoverAnim", "pasteHoverAnim", "draggingPicker", "draggingHue", "draggingAlpha", "initialized", "hue", "saturation", "brightness", "alphaValue", "lastColor", "Ljava/awt/Color;", "getComponentHeight", "componentHeight", "Companion", "Rect", "Layout", "rain-visuals"})
@RecompileFormat
public final class ColorSettingComponent
extends ModuleSettingComponent<ColorSetting> {
    @NotNull
    public static final \u064f Companion = new \u064f(null);
    private float brightness;
    private final float alphaHeight;
    private float saturation;
    private boolean initialized;
    private final float gap;
    @NotNull
    private final AnimationUtil openAnim;
    private boolean draggingHue;
    private float alphaValue;
    private float hue;
    private final float hueHeight;
    private final float rowHeight;
    @NotNull
    private final AnimationUtil pasteHoverAnim;
    private final float pickerHeight;
    @NotNull
    private static final String HUE_TEXTURE_KEY = "interface_hue";
    private boolean draggingAlpha;
    @NotNull
    private Color lastColor;
    @Nullable
    private static Color copiedColor;
    private boolean open;
    private final float buttonHeight;
    private boolean draggingPicker;
    @NotNull
    private final AnimationUtil copyHoverAnim;

    private final void updatePicker(float mouseX, float mouseY, Rect rect) {
        block3: {
            block2: {
                if (rect.getWidth() <= 0.0f) break block2;
                if (!(rect.getHeight() <= 0.0f)) break block3;
            }
            return;
        }
        this.saturation = RangesKt.coerceIn((mouseX - rect.getX()) / rect.getWidth(), 0.0f, 1.0f);
        this.brightness = RangesKt.coerceIn(1.0f - (mouseY - rect.getY()) / rect.getHeight(), 0.0f, 1.0f);
        this.applyCurrentHSB();
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private final boolean contains(Rect rect, int mouseX, int mouseY) {
        if (!((float)mouseX >= rect.getX())) return false;
        if (!((float)mouseX <= rect.getX() + rect.getWidth())) return false;
        if (!((float)mouseY >= rect.getY())) return false;
        if (!((float)mouseY <= rect.getY() + rect.getHeight())) return false;
        return true;
    }

    @Override
    @Compile
    public void onMouseClick(int n, int n2, int n3) {
        super.onMouseClick(n, n2, n3);
        Rect rect = this.previewRect();
        if (n3 == 1) {
            if (this.contains(rect, n, n2)) {
                this.open ^= true;
                if (!this.open) {
                    this.stopDragging();
                }
            }
        } else if (n3 == 0 && !(this.openProgress() <= 0.01f)) {
            Color color;
            Layout layout = this.expandedLayout();
            if (this.contains(layout.getPicker(), n, n2)) {
                this.draggingPicker = true;
                this.draggingHue = false;
                this.draggingAlpha = false;
                this.updatePicker(n, n2, layout.getPicker());
                return;
            }
            if (this.contains(layout.getHue(), n, n2)) {
                this.draggingPicker = false;
                this.draggingHue = true;
                this.draggingAlpha = false;
                this.updateHue(n, layout.getHue());
                return;
            }
            if (this.contains(layout.getAlpha(), n, n2)) {
                this.draggingPicker = false;
                this.draggingHue = false;
                this.draggingAlpha = true;
                this.updateAlpha(n, layout.getAlpha());
                return;
            }
            if (this.contains(layout.getCopyButton(), n, n2)) {
                copiedColor = (Color)((ColorSetting)this.getSetting()).getValue();
                return;
            }
            if (this.contains(layout.getPasteButton(), n, n2) && (color = copiedColor) != null) {
                this.applyColor(color);
            }
        }
    }

    @Override
    public void onMouseRelease(int mouseX, int mouseY, int button) {
        super.onMouseRelease(mouseX, mouseY, button);
        if (button == 0) {
            this.stopDragging();
        }
    }

    private final void applyColor(Color color) {
        ((ColorSetting)this.getSetting()).setColor(color);
        this.lastColor = color;
        this.initialized = false;
        this.syncFromSetting();
    }

    private final Layout expandedLayout() {
        float controlsX = this.getX() + this.getPadding();
        float controlsW = RangesKt.coerceAtLeast(this.getWidth() - this.getPadding() * 2.0f, 0.0f);
        float pickerY = this.getY() + this.rowHeight + this.gap;
        float hueY = pickerY + this.pickerHeight + this.gap;
        float alphaY = hueY + this.hueHeight + this.gap;
        float buttonY = alphaY + this.alphaHeight + this.gap;
        float buttonWidth = RangesKt.coerceAtLeast(controlsW - this.gap, 0.0f) * 0.5f;
        return new Layout(new Rect(controlsX, pickerY, controlsW, this.pickerHeight), new Rect(controlsX, hueY, controlsW, this.hueHeight), new Rect(controlsX, alphaY, controlsW, this.alphaHeight), new Rect(controlsX, buttonY, buttonWidth, this.buttonHeight), new Rect(controlsX + buttonWidth + this.gap, buttonY, buttonWidth, this.buttonHeight));
    }

    private final void applyCurrentHSB() {
        int rgb = Color.HSBtoRGB(this.hue, this.saturation, this.brightness);
        int red = rgb >> 16 & 0xFF;
        int green = rgb >> 8 & 0xFF;
        int blue = rgb & 0xFF;
        int alpha = RangesKt.coerceIn(MathKt.roundToInt(this.alphaValue * 255.0f), 0, 255);
        Color updated = new Color(red, green, blue, alpha);
        ((ColorSetting)this.getSetting()).setColor(updated);
        this.lastColor = updated;
        this.initialized = true;
    }

    private final void stopDragging() {
        this.draggingPicker = false;
        this.draggingHue = false;
        this.draggingAlpha = false;
    }

    /*
     * WARNING - void declaration
     */
    private final void drawHueBar(Rect rect, float uiAlpha, float openProgress) {
        void var1_1;
        GLTexture hueTexture = \u0634\u0633.INSTANCE.get(HUE_TEXTURE_KEY);
        if (hueTexture != null) {
            TextureRectRenderer textureRectRenderer = \u0630\u0631.INSTANCE.getTEXTURE_RECT().priority(this.rectPipeline()).texture(hueTexture);
            float f = rect.getX();
            float f2 = rect.getY();
            float f3 = rect.getWidth();
            float f4 = rect.getHeight();
            Color color = Color.WHITE;
            Intrinsics.checkNotNullExpressionValue(color, "WHITE");
            TextureRectRenderer.draw$default(textureRectRenderer, f, f2, f3, f4, color, 1.4f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, uiAlpha, 1920, null);
        }
        float markerX = RangesKt.coerceIn(rect.getX() + this.hue * rect.getWidth(), rect.getX(), rect.getX() + rect.getWidth());
        Color color = Color.WHITE;
        Intrinsics.checkNotNullExpressionValue(color, "WHITE");
        Color marker = \u0628\u062d.INSTANCE.setAlpha(color, 0.92f * uiAlpha);
        \u0630\u0631.INSTANCE.getBASIC_RECT().priority(this.rectPipeline()).color(marker).round(0.8f).draw(markerX - 1.0f, rect.getY() - 1.0f, 2.0f, var1_1.getHeight() + 2.0f);
    }

    private final void drawButton(Rect rect, String text, float openProgress, float hoverProgress) {
        float hoverBoost = 0.05f * RangesKt.coerceIn(hoverProgress, 0.0f, 1.0f);
        Color bg = \u062b\u0652.INSTANCE.surface(this.alphaByState(0.04f + hoverBoost, 0.09f + hoverBoost) * openProgress);
        Color border = \u062b\u0652.INSTANCE.title(this.alphaByState(0.06f + hoverBoost, 0.13f + hoverBoost) * openProgress);
        Color textColor = \u062b\u0652.INSTANCE.title(this.alphaByState(0.24f + hoverBoost, 0.72f + hoverBoost) * openProgress);
        float textSize = 5.6f;
        \u0630\u0631.INSTANCE.getBLURRED_RECT().priority(this.rectPipeline()).color(bg).round(2.0f).mix(0.95f).border(1.0f, border).draw(rect.getX(), rect.getY(), rect.getWidth(), rect.getHeight());
        float textWidth = Font.getWidth$default(this.getDefaultFont(), text, textSize, 0.0f, 4, null);
        float textX = rect.getX() + (rect.getWidth() - textWidth) * 0.5f;
        float textY = this.calcMidY(rect.getY(), rect.getHeight(), this.getDefaultFont().getHeight(textSize)) - 0.7f;
        Font.drawText$default(this.getDefaultFont().priority(this.textPipeline()), text, textX, textY, textSize, textColor, 0.0f, 0.0f, 0.0f, 0, 0.0f, 992, null);
    }

    private final void drawPicker(Rect rect, float uiAlpha, float openProgress) {
        Color color = Color.getHSBColor(this.hue, 1.0f, 1.0f);
        Intrinsics.checkNotNullExpressionValue(color, "getHSBColor(...)");
        Color hueColor = this.withUiAlpha(color, uiAlpha);
        Color white = new Color(255, 255, 255, RangesKt.coerceIn(MathKt.roundToInt(255.0f * uiAlpha), 0, 255));
        Color black = new Color(0, 0, 0, RangesKt.coerceIn(MathKt.roundToInt(255.0f * uiAlpha), 0, 255));
        \u0630\u0631.INSTANCE.getBASIC_RECT().priority(this.rectPipeline()).color(hueColor, white, black, black).round(2.0f).draw(rect.getX(), rect.getY(), rect.getWidth(), rect.getHeight());
        float markerX = RangesKt.coerceIn(rect.getX() + this.saturation * rect.getWidth(), rect.getX(), rect.getX() + rect.getWidth());
        float markerY = RangesKt.coerceIn(rect.getY() + (1.0f - this.brightness) * rect.getHeight(), rect.getY(), rect.getY() + rect.getHeight());
        Color color2 = Color.WHITE;
        Intrinsics.checkNotNullExpressionValue(color2, "WHITE");
        Color markerInner = \u0628\u062d.INSTANCE.setAlpha(color2, 0.96f * uiAlpha);
        \u0630\u0631.INSTANCE.getBASIC_RECT().priority(this.rectPipeline()).color(markerInner).round(1.5f).draw(markerX - 2.5f, markerY - 2.5f, 5.0f, 5.0f);
    }

    private final void drawAlphaBar(Rect rect, float uiAlpha, float openProgress) {
        Color checkerLow = \u0628\u062d.INSTANCE.setAlpha(new Color(30, 30, 30), 0.32f * uiAlpha);
        Color checkerHigh = \u0628\u062d.INSTANCE.setAlpha(new Color(100, 100, 100), 0.32f * uiAlpha);
        Color current = (Color)((ColorSetting)this.getSetting()).getValue();
        Color transparent = new Color(current.getRed(), current.getGreen(), current.getBlue(), 0);
        Color opaque = this.withUiAlpha(new Color(current.getRed(), current.getGreen(), current.getBlue(), 255), uiAlpha);
        \u0630\u0631.INSTANCE.getBASIC_RECT().priority(this.rectPipeline()).color(checkerLow, checkerHigh, checkerLow, checkerHigh).round(1.4f).draw(rect.getX(), rect.getY(), rect.getWidth(), rect.getHeight());
        \u0630\u0631.INSTANCE.getBASIC_RECT().priority(this.rectPipeline()).color(opaque, transparent, opaque, transparent).round(1.4f).draw(rect.getX(), rect.getY(), rect.getWidth(), rect.getHeight());
        float markerX = RangesKt.coerceIn(rect.getX() + this.alphaValue * rect.getWidth(), rect.getX(), rect.getX() + rect.getWidth());
        Color color = Color.WHITE;
        Intrinsics.checkNotNullExpressionValue(color, "WHITE");
        Color marker = \u0628\u062d.INSTANCE.setAlpha(color, 0.92f * uiAlpha);
        \u0630\u0631.INSTANCE.getBASIC_RECT().priority(this.rectPipeline()).color(marker).round(0.8f).draw(markerX - 1.0f, rect.getY() - 1.0f, 2.0f, rect.getHeight() + 2.0f);
    }

    private final void updateHue(float mouseX, Rect rect) {
        if (rect.getWidth() <= 0.0f) {
            return;
        }
        this.hue = RangesKt.coerceIn((mouseX - rect.getX()) / rect.getWidth(), 0.0f, 1.0f);
        this.applyCurrentHSB();
    }

    @Override
    @Compile
    public void render(int n, int n2, float f) {
        super.render(n, n2, f);
        this.syncFromSetting();
        float f2 = this.openProgress();
        Color color = this.themedSurface(0.03f, 0.05f);
        Color color2 = this.themedBorder(0.05f, 0.08f);
        Color color3 = this.themedTitle(0.32f, 1.0f);
        \u0630\u0631.INSTANCE.getBLURRED_RECT().priority(this.rectPipeline()).color(color).round(3.0f).mix(0.95f).border(1.0f, color2).draw(this.getX(), this.getY(), this.getWidth(), this.getComponentHeight());
        Font.drawText$default(this.getDefaultFont().priority(this.textPipeline()), ((ColorSetting)this.getSetting()).getName(), this.getX() + this.getPadding(), this.getY() + 3.3f, 6.6f, color3, 0.0f, 0.0f, 0.0f, 0, 0.0f, 992, null);
        Rect rect = this.previewRect();
        Color color4 = \u0628\u062d.INSTANCE.setAlpha(new Color(28, 28, 28), this.alphaByState(0.16f, 0.28f));
        Color color5 = \u0628\u062d.INSTANCE.setAlpha(new Color(85, 85, 85), this.alphaByState(0.16f, 0.28f));
        \u0630\u0631.INSTANCE.getBASIC_RECT().priority(this.rectPipeline()).color(color4, color5, color4, color5).round(2.0f).draw(rect.getX(), rect.getY(), rect.getWidth(), rect.getHeight());
        \u0630\u0631.INSTANCE.getBASIC_RECT().priority(this.rectPipeline()).color(this.withUiAlpha((Color)((ColorSetting)this.getSetting()).getValue(), this.getAlpha())).round(2.0f).draw(rect.getX(), rect.getY(), rect.getWidth(), rect.getHeight());
        if (f2 > 0.001f) {
            \u0630\u0631.INSTANCE.getBASIC_RECT().priority(this.rectPipeline()).color(\u062b\u0652.INSTANCE.surface(this.alphaByState(0.05f, 0.12f))).round(0.5f).draw(this.getX() + this.getPadding(), this.getY() + 13.5f, this.getWidth() - this.getPadding() * 2.0f, 1.5f);
            Layout layout = this.expandedLayout();
            if (this.draggingPicker) {
                this.updatePicker(n, n2, layout.getPicker());
            }
            if (this.draggingHue) {
                this.updateHue(n, layout.getHue());
            }
            if (this.draggingAlpha) {
                this.updateAlpha(n, layout.getAlpha());
            }
            float f3 = RangesKt.coerceIn(this.getAlpha() * f2, 0.0f, 1.0f);
            float f4 = this.getY() + this.rowHeight;
            float f5 = this.expandedSectionHeight() * f2;
            this.drawPicker(layout.getPicker(), f3, f2);
            this.drawHueBar(layout.getHue(), f3, f2);
            this.drawAlphaBar(layout.getAlpha(), f3, f2);
            float f6 = this.copyHoverAnim.animate((float)this.contains(layout.getCopyButton(), n, n2), 170.0f, new \u0635(\u0628\u0641.INSTANCE));
            float f7 = this.pasteHoverAnim.animate((float)this.contains(layout.getPasteButton(), n, n2), 170.0f, new \u062c\u064c(\u0628\u0641.INSTANCE));
            this.drawButton(layout.getCopyButton(), "\u041a\u043e\u043f\u0438\u0440\u043e\u0432\u0430\u0442\u044c", f2, f6);
            this.drawButton(layout.getPasteButton(), "\u0412\u0441\u0442\u0430\u0432\u0438\u0442\u044c", f2, f7);
            return;
        }
    }

    private final Rect previewRect() {
        float previewWidth = 16.0f;
        float previewHeight = 9.0f;
        float previewX = this.getX() + this.getWidth() - this.getPadding() - previewWidth;
        float previewY = this.calcMidY(this.getY(), this.rowHeight, previewHeight);
        return new Rect(previewX, previewY, previewWidth, previewHeight);
    }

    @Override
    public float getComponentHeight() {
        return this.rowHeight + this.expandedSectionHeight() * this.openProgress();
    }

    private final float openProgress() {
        \u0628\u0641 \u0628\u06412 = \u0628\u0641.INSTANCE;
        return this.openAnim.animate(this.open ? 1.0f : 0.0f, 240.0f, new \u0632\u0624(\u0628\u06412));
    }

    /*
     * WARNING - void declaration
     */
    public ColorSettingComponent(@NotNull ColorSetting setting) {
        void var1_1;
        Intrinsics.checkNotNullParameter(setting, "setting");
        super((Setting)setting);
        this.rowHeight = 15.0f;
        this.gap = 2.0f;
        this.pickerHeight = 34.0f;
        this.hueHeight = 5.0f;
        this.alphaHeight = 5.0f;
        this.buttonHeight = 8.5f;
        this.openAnim = new AnimationUtil(0.0f, 1, null);
        this.copyHoverAnim = new AnimationUtil(0.0f, 1, null);
        this.pasteHoverAnim = new AnimationUtil(0.0f, 1, null);
        this.saturation = 1.0f;
        this.brightness = 1.0f;
        this.alphaValue = 1.0f;
        this.lastColor = (Color)var1_1.getValue();
    }

    private final float expandedSectionHeight() {
        return this.gap + this.pickerHeight + this.gap + this.hueHeight + this.gap + this.alphaHeight + this.gap + this.buttonHeight + this.gap;
    }

    private final Color withUiAlpha(Color color, float uiAlpha) {
        float scale = RangesKt.coerceIn(uiAlpha, 0.0f, 1.0f);
        int alpha = RangesKt.coerceIn(MathKt.roundToInt((float)color.getAlpha() * scale), 0, 255);
        return new Color(color.getRed(), color.getGreen(), color.getBlue(), alpha);
    }

    /*
     * WARNING - void declaration
     */
    private final void syncFromSetting() {
        if (!this.initialized || !Intrinsics.areEqual(((ColorSetting)this.getSetting()).getValue(), this.lastColor)) {
            void var1_1;
            Color current = (Color)((ColorSetting)this.getSetting()).getValue();
            float[] hsb = Color.RGBtoHSB(current.getRed(), current.getGreen(), current.getBlue(), null);
            this.hue = hsb[0];
            this.saturation = hsb[1];
            this.brightness = hsb[2];
            this.alphaValue = (float)current.getAlpha() / 255.0f;
            this.lastColor = var1_1;
            this.initialized = true;
        }
    }

    private final void updateAlpha(float mouseX, Rect rect) {
        if (rect.getWidth() <= 0.0f) {
            return;
        }
        this.alphaValue = RangesKt.coerceIn((mouseX - rect.getX()) / rect.getWidth(), 0.0f, 1.0f);
        this.applyCurrentHSB();
    }

    @Metadata(mv={2, 3, 0}, k=1, xi=48, d1={"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\t\b\u0082\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u00a2\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\b\f\u0010\u000bJ\u0010\u0010\r\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\b\r\u0010\u000bJ\u0010\u0010\u000e\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\b\u000e\u0010\u000bJ\u0010\u0010\u000f\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\b\u000f\u0010\u000bJB\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u0002H\u00c6\u0001\u00a2\u0006\u0004\b\u0010\u0010\u0011J\u001b\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001H\u00d6\u0083\u0004\u00a2\u0006\u0004\b\u0014\u0010\u0015J\u0011\u0010\u0017\u001a\u00020\u0016H\u00d6\u0081\u0004\u00a2\u0006\u0004\b\u0017\u0010\u0018J\u0011\u0010\u001a\u001a\u00020\u0019H\u00d6\u0081\u0004\u00a2\u0006\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006\u00a2\u0006\f\n\u0004\b\u0003\u0010\u001c\u001a\u0004\b\u001d\u0010\u000bR\u0017\u0010\u0004\u001a\u00020\u00028\u0006\u00a2\u0006\f\n\u0004\b\u0004\u0010\u001c\u001a\u0004\b\u001e\u0010\u000bR\u0017\u0010\u0005\u001a\u00020\u00028\u0006\u00a2\u0006\f\n\u0004\b\u0005\u0010\u001c\u001a\u0004\b\u001f\u0010\u000bR\u0017\u0010\u0006\u001a\u00020\u00028\u0006\u00a2\u0006\f\n\u0004\b\u0006\u0010\u001c\u001a\u0004\b \u0010\u000bR\u0017\u0010\u0007\u001a\u00020\u00028\u0006\u00a2\u0006\f\n\u0004\b\u0007\u0010\u001c\u001a\u0004\b!\u0010\u000b\u00a8\u0006\""}, d2={"Loxxxde/\u0631\u0630;", "", "Loxxxde/\u0637\u064b;", "picker", "hue", "alpha", "copyButton", "pasteButton", "<init>", "(Lkotakbaz/rain/ui/menu/settings/impl/ColorSettingComponent$Rect;Lkotakbaz/rain/ui/menu/settings/impl/ColorSettingComponent$Rect;Lkotakbaz/rain/ui/menu/settings/impl/ColorSettingComponent$Rect;Lkotakbaz/rain/ui/menu/settings/impl/ColorSettingComponent$Rect;Lkotakbaz/rain/ui/menu/settings/impl/ColorSettingComponent$Rect;)V", "component1", "()Lkotakbaz/rain/ui/menu/settings/impl/ColorSettingComponent$Rect;", "component2", "component3", "component4", "component5", "copy", "(Lkotakbaz/rain/ui/menu/settings/impl/ColorSettingComponent$Rect;Lkotakbaz/rain/ui/menu/settings/impl/ColorSettingComponent$Rect;Lkotakbaz/rain/ui/menu/settings/impl/ColorSettingComponent$Rect;Lkotakbaz/rain/ui/menu/settings/impl/ColorSettingComponent$Rect;Lkotakbaz/rain/ui/menu/settings/impl/ColorSettingComponent$Rect;)Lkotakbaz/rain/ui/menu/settings/impl/ColorSettingComponent$Layout;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Loxxxde/\u0637\u064b;", "getPicker", "getHue", "getAlpha", "getCopyButton", "getPasteButton", "rain-visuals"})
    private static final class Layout {
        @NotNull
        private final Rect pasteButton;
        @NotNull
        private final Rect picker;
        @NotNull
        private final Rect hue;
        @NotNull
        private final Rect alpha;
        @NotNull
        private final Rect copyButton;

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Layout)) {
                return false;
            }
            Layout layout = (Layout)other;
            if (!Intrinsics.areEqual(this.picker, layout.picker)) {
                return false;
            }
            if (!Intrinsics.areEqual(this.hue, layout.hue)) {
                return false;
            }
            if (!Intrinsics.areEqual(this.alpha, layout.alpha)) {
                return false;
            }
            if (!Intrinsics.areEqual(this.copyButton, layout.copyButton)) {
                return false;
            }
            if (!Intrinsics.areEqual(this.pasteButton, layout.pasteButton)) {
                return false;
            }
            return true;
        }

        @NotNull
        public final Rect getAlpha() {
            return this.alpha;
        }

        @NotNull
        public String toString() {
            return "Layout(picker=" + this.picker + ", hue=" + this.hue + ", alpha=" + this.alpha + ", copyButton=" + this.copyButton + ", pasteButton=" + this.pasteButton + ")";
        }

        @NotNull
        public final Rect component4() {
            return this.copyButton;
        }

        public int hashCode() {
            int result = this.picker.hashCode();
            result = result * 31 + this.hue.hashCode();
            result = result * 31 + this.alpha.hashCode();
            result = result * 31 + this.copyButton.hashCode();
            result = result * 31 + this.pasteButton.hashCode();
            return result;
        }

        @NotNull
        public final Rect component3() {
            return this.alpha;
        }

        public Layout(@NotNull Rect picker, @NotNull Rect hue, @NotNull Rect alpha, @NotNull Rect copyButton, @NotNull Rect pasteButton) {
            Intrinsics.checkNotNullParameter(picker, "picker");
            Intrinsics.checkNotNullParameter(hue, "hue");
            Intrinsics.checkNotNullParameter(alpha, "alpha");
            Intrinsics.checkNotNullParameter(copyButton, "copyButton");
            Intrinsics.checkNotNullParameter(pasteButton, "pasteButton");
            this.picker = picker;
            this.hue = hue;
            this.alpha = alpha;
            this.copyButton = copyButton;
            this.pasteButton = pasteButton;
        }

        public static /* synthetic */ Layout copy$default(Layout layout, Rect rect, Rect rect2, Rect rect3, Rect rect4, Rect rect5, int n, Object object) {
            if ((n & 1) != 0) {
                rect = layout.picker;
            }
            if ((n & 2) != 0) {
                rect2 = layout.hue;
            }
            if ((n & 4) != 0) {
                rect3 = layout.alpha;
            }
            if ((n & 8) != 0) {
                rect4 = layout.copyButton;
            }
            if ((n & 0x10) != 0) {
                rect5 = layout.pasteButton;
            }
            return layout.copy(rect, rect2, rect3, rect4, rect5);
        }

        @NotNull
        public final Rect getPicker() {
            return this.picker;
        }

        @NotNull
        public final Rect getPasteButton() {
            return this.pasteButton;
        }

        @NotNull
        public final Rect component5() {
            return this.pasteButton;
        }

        @NotNull
        public final Layout copy(@NotNull Rect picker, @NotNull Rect hue, @NotNull Rect alpha, @NotNull Rect copyButton, @NotNull Rect pasteButton) {
            Intrinsics.checkNotNullParameter(picker, "picker");
            Intrinsics.checkNotNullParameter(hue, "hue");
            Intrinsics.checkNotNullParameter(alpha, "alpha");
            Intrinsics.checkNotNullParameter(copyButton, "copyButton");
            Intrinsics.checkNotNullParameter(pasteButton, "pasteButton");
            return new Layout(picker, hue, alpha, copyButton, pasteButton);
        }

        @NotNull
        public final Rect getCopyButton() {
            return this.copyButton;
        }

        @NotNull
        public final Rect component2() {
            return this.hue;
        }

        @NotNull
        public final Rect getHue() {
            return this.hue;
        }

        @NotNull
        public final Rect component1() {
            return this.picker;
        }
    }

    @Metadata(mv={2, 3, 0}, k=1, xi=48, d1={"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0007\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\b\u0082\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u00a2\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\b\u000b\u0010\nJ\u0010\u0010\f\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\b\f\u0010\nJ\u0010\u0010\r\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\b\r\u0010\nJ8\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0002H\u00c6\u0001\u00a2\u0006\u0004\b\u000e\u0010\u000fJ\u001b\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001H\u00d6\u0083\u0004\u00a2\u0006\u0004\b\u0012\u0010\u0013J\u0011\u0010\u0015\u001a\u00020\u0014H\u00d6\u0081\u0004\u00a2\u0006\u0004\b\u0015\u0010\u0016J\u0011\u0010\u0018\u001a\u00020\u0017H\u00d6\u0081\u0004\u00a2\u0006\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0003\u001a\u00020\u00028\u0006\u00a2\u0006\f\n\u0004\b\u0003\u0010\u001a\u001a\u0004\b\u001b\u0010\nR\u0017\u0010\u0004\u001a\u00020\u00028\u0006\u00a2\u0006\f\n\u0004\b\u0004\u0010\u001a\u001a\u0004\b\u001c\u0010\nR\u0017\u0010\u0005\u001a\u00020\u00028\u0006\u00a2\u0006\f\n\u0004\b\u0005\u0010\u001a\u001a\u0004\b\u001d\u0010\nR\u0017\u0010\u0006\u001a\u00020\u00028\u0006\u00a2\u0006\f\n\u0004\b\u0006\u0010\u001a\u001a\u0004\b\u001e\u0010\n\u00a8\u0006\u001f"}, d2={"Loxxxde/\u0637\u064b;", "", "", "x", "y", "width", "height", "<init>", "(FFFF)V", "component1", "()F", "component2", "component3", "component4", "copy", "(FFFF)Lkotakbaz/rain/ui/menu/settings/impl/ColorSettingComponent$Rect;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "F", "getX", "getY", "getWidth", "getHeight", "rain-visuals"})
    private static final class Rect {
        private final float y;
        private final float width;
        private final float height;
        private final float x;

        @NotNull
        public String toString() {
            return "Rect(x=" + this.x + ", y=" + this.y + ", width=" + this.width + ", height=" + this.height + ")";
        }

        public final float getY() {
            return this.y;
        }

        public final float component4() {
            return this.height;
        }

        public static /* synthetic */ Rect copy$default(Rect rect, float f, float f2, float f3, float f4, int n, Object object) {
            if ((n & 1) != 0) {
                f = rect.x;
            }
            if ((n & 2) != 0) {
                f2 = rect.y;
            }
            if ((n & 4) != 0) {
                f3 = rect.width;
            }
            if ((n & 8) != 0) {
                f4 = rect.height;
            }
            return rect.copy(f, f2, f3, f4);
        }

        public final float getX() {
            return this.x;
        }

        public int hashCode() {
            int result = Float.hashCode(this.x);
            result = result * 31 + Float.hashCode(this.y);
            result = result * 31 + Float.hashCode(this.width);
            result = result * 31 + Float.hashCode(this.height);
            return result;
        }

        public final float component1() {
            return this.x;
        }

        public final float getWidth() {
            return this.width;
        }

        public Rect(float x, float y, float width, float height) {
            this.x = x;
            this.y = y;
            this.width = width;
            this.height = height;
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Rect)) {
                return false;
            }
            Rect rect = (Rect)other;
            if (Float.compare(this.x, rect.x) != 0) {
                return false;
            }
            if (Float.compare(this.y, rect.y) != 0) {
                return false;
            }
            if (Float.compare(this.width, rect.width) != 0) {
                return false;
            }
            if (Float.compare(this.height, rect.height) != 0) {
                return false;
            }
            return true;
        }

        public final float component2() {
            return this.y;
        }

        public final float getHeight() {
            return this.height;
        }

        @NotNull
        public final Rect copy(float x, float y, float width, float height) {
            return new Rect(x, y, width, height);
        }

        public final float component3() {
            return this.width;
        }
    }
}

