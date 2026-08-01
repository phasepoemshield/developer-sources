/*
 * Decompiled with CFR 0.152.
 */
package kotakbaz.rain.ui.menu.settings.impl;

import java.awt.Color;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.PBEKeySpec;
import javax.crypto.spec.SecretKeySpec;
import kotakbaz.rain.client.render.texture.texture.a;
import kotakbaz.rain.client.util.animations.AnimationUtil;
import kotakbaz.rain.client.util.animations.Easings;
import kotakbaz.rain.client.util.color.ColorUtil;
import kotakbaz.rain.client.util.render.RenderUtils;
import kotakbaz.rain.client.util.render.ScissorUtil;
import kotakbaz.rain.client.util.render.TextureLoader;
import kotakbaz.rain.client.util.render.display.TextureRectRenderer;
import kotakbaz.rain.client.util.render.font.E;
import kotakbaz.rain.module.setting.Setting;
import kotakbaz.rain.module.setting.settings.ColorSetting;
import kotakbaz.rain.ui.menu.MenuStyle;
import kotakbaz.rain.ui.menu.settings.ModuleSettingComponent;
import kotakbaz.rain.ui.menu.settings.impl.ColorSettingComponent;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.math.MathKt;
import kotlin.ranges.RangesKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mv={2, 3, 0}, k=1, xi=48, d1={"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0012\u0018\u0000 P2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0003PQRB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\b\u0004\u0010\u0005J'\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0016\u00a2\u0006\u0004\b\f\u0010\rJ'\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u0006H\u0016\u00a2\u0006\u0004\b\u000f\u0010\u0010J'\u0010\u0011\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u0006H\u0016\u00a2\u0006\u0004\b\u0011\u0010\u0010J'\u0010\u0016\u001a\u00020\u000b2\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\t2\u0006\u0010\u0015\u001a\u00020\tH\u0002\u00a2\u0006\u0004\b\u0016\u0010\u0017J'\u0010\u0018\u001a\u00020\u000b2\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\t2\u0006\u0010\u0015\u001a\u00020\tH\u0002\u00a2\u0006\u0004\b\u0018\u0010\u0017J'\u0010\u0019\u001a\u00020\u000b2\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\t2\u0006\u0010\u0015\u001a\u00020\tH\u0002\u00a2\u0006\u0004\b\u0019\u0010\u0017J/\u0010\u001e\u001a\u00020\u000b2\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0015\u001a\u00020\t2\u0006\u0010\u001d\u001a\u00020\u001cH\u0002\u00a2\u0006\u0004\b\u001e\u0010\u001fJ'\u0010 \u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\u0013\u001a\u00020\u0012H\u0002\u00a2\u0006\u0004\b \u0010!J\u001f\u0010\"\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\t2\u0006\u0010\u0013\u001a\u00020\u0012H\u0002\u00a2\u0006\u0004\b\"\u0010#J\u001f\u0010$\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\t2\u0006\u0010\u0013\u001a\u00020\u0012H\u0002\u00a2\u0006\u0004\b$\u0010#J\u000f\u0010%\u001a\u00020\u000bH\u0002\u00a2\u0006\u0004\b%\u0010&J\u000f\u0010'\u001a\u00020\u000bH\u0002\u00a2\u0006\u0004\b'\u0010&J\u0017\u0010*\u001a\u00020\u000b2\u0006\u0010)\u001a\u00020(H\u0002\u00a2\u0006\u0004\b*\u0010+J\u000f\u0010,\u001a\u00020\u0012H\u0002\u00a2\u0006\u0004\b,\u0010-J\u000f\u0010/\u001a\u00020.H\u0002\u00a2\u0006\u0004\b/\u00100J\u000f\u00101\u001a\u00020\tH\u0002\u00a2\u0006\u0004\b1\u00102J\u000f\u0010\u0015\u001a\u00020\tH\u0002\u00a2\u0006\u0004\b\u0015\u00102J\u000f\u00103\u001a\u00020\u000bH\u0002\u00a2\u0006\u0004\b3\u0010&J'\u00104\u001a\u00020\u001c2\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006H\u0002\u00a2\u0006\u0004\b4\u00105J\u001f\u00106\u001a\u00020(2\u0006\u0010)\u001a\u00020(2\u0006\u0010\u0014\u001a\u00020\tH\u0002\u00a2\u0006\u0004\b6\u00107R\u0014\u00108\u001a\u00020\t8\u0002X\u0082D\u00a2\u0006\u0006\n\u0004\b8\u00109R\u0014\u0010:\u001a\u00020\t8\u0002X\u0082D\u00a2\u0006\u0006\n\u0004\b:\u00109R\u0014\u0010;\u001a\u00020\t8\u0002X\u0082D\u00a2\u0006\u0006\n\u0004\b;\u00109R\u0014\u0010<\u001a\u00020\t8\u0002X\u0082D\u00a2\u0006\u0006\n\u0004\b<\u00109R\u0014\u0010=\u001a\u00020\t8\u0002X\u0082D\u00a2\u0006\u0006\n\u0004\b=\u00109R\u0014\u0010>\u001a\u00020\t8\u0002X\u0082D\u00a2\u0006\u0006\n\u0004\b>\u00109R\u0016\u0010?\u001a\u00020\u001c8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\b?\u0010@R\u0014\u0010B\u001a\u00020A8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\bB\u0010CR\u0016\u0010D\u001a\u00020\u001c8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\bD\u0010@R\u0016\u0010E\u001a\u00020\u001c8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\bE\u0010@R\u0016\u0010F\u001a\u00020\u001c8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\bF\u0010@R\u0016\u0010G\u001a\u00020\u001c8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\bG\u0010@R\u0016\u0010H\u001a\u00020\t8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\bH\u00109R\u0016\u0010I\u001a\u00020\t8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\bI\u00109R\u0016\u0010J\u001a\u00020\t8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\bJ\u00109R\u0016\u0010K\u001a\u00020\t8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\bK\u00109R\u0016\u0010L\u001a\u00020(8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\bL\u0010MR\u0014\u0010O\u001a\u00020\t8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\bN\u00102\u00a8\u0006S"}, d2={"Lkotakbaz/rain/ui/menu/settings/impl/ColorSettingComponent;", "Lkotakbaz/rain/ui/menu/settings/ModuleSettingComponent;", "Lkotakbaz/rain/module/setting/settings/ColorSetting;", "setting", "<init>", "(Lkotakbaz/rain/module/setting/settings/ColorSetting;)V", "", "mouseX", "mouseY", "", "partialTicks", "", "render", "(IIF)V", "button", "onMouseClick", "(III)V", "onMouseRelease", "Lkotakbaz/rain/ui/menu/settings/impl/ColorSettingComponent$Rect;", "rect", "uiAlpha", "openProgress", "drawPicker", "(Lkotakbaz/rain/ui/menu/settings/impl/ColorSettingComponent$Rect;FF)V", "drawHueBar", "drawAlphaBar", "", "text", "", "hovered", "drawButton", "(Lkotakbaz/rain/ui/menu/settings/impl/ColorSettingComponent$Rect;Ljava/lang/String;FZ)V", "updatePicker", "(FFLkotakbaz/rain/ui/menu/settings/impl/ColorSettingComponent$Rect;)V", "updateHue", "(FLkotakbaz/rain/ui/menu/settings/impl/ColorSettingComponent$Rect;)V", "updateAlpha", "applyCurrentHSB", "()V", "syncFromSetting", "Ljava/awt/Color;", "color", "applyColor", "(Ljava/awt/Color;)V", "previewRect", "()Lkotakbaz/rain/ui/menu/settings/impl/ColorSettingComponent$Rect;", "Lkotakbaz/rain/ui/menu/settings/impl/ColorSettingComponent$Layout;", "expandedLayout", "()Lkotakbaz/rain/ui/menu/settings/impl/ColorSettingComponent$Layout;", "expandedSectionHeight", "()F", "stopDragging", "contains", "(Lkotakbaz/rain/ui/menu/settings/impl/ColorSettingComponent$Rect;II)Z", "withUiAlpha", "(Ljava/awt/Color;F)Ljava/awt/Color;", "rowHeight", "F", "gap", "pickerHeight", "hueHeight", "alphaHeight", "buttonHeight", "open", "Z", "Lkotakbaz/rain/client/util/animations/AnimationUtil;", "openAnim", "Lkotakbaz/rain/client/util/animations/AnimationUtil;", "draggingPicker", "draggingHue", "draggingAlpha", "initialized", "hue", "saturation", "brightness", "alphaValue", "lastColor", "Ljava/awt/Color;", "getComponentHeight", "componentHeight", "Companion", "Rect", "Layout", "rain-visuals"})
@SourceDebugExtension(value={"SMAP\nColorSettingComponent.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ColorSettingComponent.kt\nkotakbaz/rain/ui/menu/settings/impl/ColorSettingComponent\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,331:1\n1#2:332\n*E\n"})
public final class ColorSettingComponent
extends ModuleSettingComponent<ColorSetting> {
    @NotNull
    public static final Companion Companion;
    private final float rowHeight;
    private final float gap;
    private final float pickerHeight;
    private final float hueHeight;
    private final float alphaHeight;
    private final float buttonHeight;
    private boolean open;
    @NotNull
    private final AnimationUtil openAnim;
    private boolean draggingPicker;
    private boolean draggingHue;
    private boolean draggingAlpha;
    private boolean initialized;
    private float hue;
    private float saturation;
    private float brightness;
    private float alphaValue;
    @NotNull
    private Color lastColor;
    @Nullable
    private static Color copiedColor;
    @NotNull
    private static final String HUE_TEXTURE_KEY = "interface_hue";
    private static Object[] a;
    private static Object b;
    private static Object[] B;
    private static Object[] A;
    private static Object[] c;
    public static int[] C;

    public ColorSettingComponent(@NotNull ColorSetting setting) {
        int n2 = C[0];
        n2 ^= C[1];
        Intrinsics.checkNotNullParameter(setting, (String)a[n2 += C[2]]);
        super((Setting)setting);
        this.rowHeight = 15.0f;
        this.gap = 2.0f;
        this.pickerHeight = 34.0f;
        this.hueHeight = 5.0f;
        this.alphaHeight = 5.0f;
        this.buttonHeight = 8.5f;
        int n3 = C[3];
        n3 += C[4];
        this.openAnim = new AnimationUtil(0.0f, n3 -= C[5], null);
        this.saturation = 1.0f;
        this.brightness = 1.0f;
        this.alphaValue = 1.0f;
        this.lastColor = (Color)setting.getValue();
    }

    @Override
    public float getComponentHeight() {
        return this.rowHeight + this.expandedSectionHeight() * this.openProgress();
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public void render(int mouseX, int mouseY, float partialTicks) {
        super.render(mouseX, mouseY, partialTicks);
        this.syncFromSetting();
        float f2 = this.openProgress();
        Color color = this.themedSurface(0.03f, 0.05f);
        Color color2 = this.themedBorder(0.05f, 0.08f);
        Color color3 = this.themedTitle(0.32f, 1.0f);
        RenderUtils.INSTANCE.getBLURRED_RECT().priority(this.rectPipeline()).color(color).round(3.0f).mix(0.95f).border(1.0f, color2).draw(this.getX(), this.getY(), this.getWidth(), this.getComponentHeight());
        int n2 = C[6];
        n2 += C[7];
        int n3 = C[9];
        n3 ^= C[10];
        E.drawText$default(this.getDefaultFont().priority(this.textPipeline()), ((ColorSetting)this.getSetting()).getName(), this.getX() + this.getPadding(), this.getY() + 3.3f, 6.6f, color3, 0.0f, 0.0f, 0.0f, n2 ^= C[8], 0.0f, n3 ^= C[11], null);
        Rect rect = this.previewRect();
        int n4 = C[12];
        n4 ^= C[13];
        int n5 = C[15];
        n5 ^= C[16];
        int n6 = C[18];
        n6 += C[19];
        Color color4 = ColorUtil.INSTANCE.setAlpha(new Color(n4 += C[14], n5 += C[17], n6 ^= C[20]), this.alphaByState(0.16f, 0.28f));
        int n7 = C[21];
        n7 -= C[22];
        int n8 = C[24];
        n8 ^= C[25];
        int n9 = C[27];
        n9 += C[28];
        Color color5 = ColorUtil.INSTANCE.setAlpha(new Color(n7 ^= C[23], n8 += C[26], n9 += C[29]), this.alphaByState(0.16f, 0.28f));
        RenderUtils.INSTANCE.getBASIC_RECT().priority(this.rectPipeline()).color(color4, color5, color4, color5).round(2.0f).draw(rect.getX(), rect.getY(), rect.getWidth(), rect.getHeight());
        RenderUtils.INSTANCE.getBASIC_RECT().priority(this.rectPipeline()).color(this.withUiAlpha((Color)((ColorSetting)this.getSetting()).getValue(), this.getAlpha())).round(2.0f).draw(rect.getX(), rect.getY(), rect.getWidth(), rect.getHeight());
        if (f2 <= 0.001f) {
            return;
        }
        RenderUtils.INSTANCE.getBASIC_RECT().priority(this.rectPipeline()).color(MenuStyle.INSTANCE.surface(this.alphaByState(0.05f, 0.12f) * f2)).round(0.5f).draw(this.getX() + this.getPadding() + this.getWidth() / 2.0f * (1.0f - f2), this.getY() + 13.5f, (this.getWidth() - this.getPadding() * 2.0f) * f2, 1.5f);
        Layout layout = this.expandedLayout();
        if (this.draggingPicker) {
            this.updatePicker(mouseX, mouseY, layout.getPicker());
        }
        if (this.draggingHue) {
            this.updateHue(mouseX, layout.getHue());
        }
        if (this.draggingAlpha) {
            this.updateAlpha(mouseX, layout.getAlpha());
        }
        float f3 = RangesKt.coerceIn(this.getAlpha() * f2, 0.0f, 1.0f);
        float f4 = this.getY() + this.rowHeight;
        float f5 = this.expandedSectionHeight() * f2;
        if (f5 > 0.0f) {
            ScissorUtil.INSTANCE.start(this.getX(), f4, this.getWidth(), f5);
        }
        try {
            this.drawPicker(layout.getPicker(), f3, f2);
            this.drawHueBar(layout.getHue(), f3, f2);
            this.drawAlphaBar(layout.getAlpha(), f3, f2);
            int n10 = C[30];
            n10 ^= C[31];
            this.drawButton(layout.getCopyButton(), (String)a[n10 += C[32]], f2, this.contains(layout.getCopyButton(), mouseX, mouseY));
            int n11 = C[33];
            n11 ^= C[34];
            this.drawButton(layout.getPasteButton(), (String)a[n11 -= C[35]], f2, this.contains(layout.getPasteButton(), mouseX, mouseY));
        }
        finally {
            if (f5 > 0.0f) {
                ScissorUtil.INSTANCE.end();
            }
        }
    }

    @Override
    public void onMouseClick(int mouseX, int mouseY, int button) {
        block8: {
            Layout layout;
            long l2;
            block11: {
                block10: {
                    block9: {
                        block7: {
                            l2 = -8372032477126327498L;
                            super.onMouseClick(mouseX, mouseY, button);
                            Rect rect = this.previewRect();
                            int n2 = C[36];
                            n2 ^= C[37];
                            if (button == (n2 -= C[38]) && this.contains(rect, mouseX, mouseY)) {
                                if (!this.open) {
                                    int n3 = C[39];
                                    n3 ^= C[40];
                                    v0 = n3 -= C[41];
                                } else {
                                    int n4 = C[42];
                                    n4 += C[43];
                                    this.open = n4 -= C[44];
                                    v0 = this.open ? 1 : 0;
                                }
                                if (!this.open) {
                                    this.stopDragging();
                                }
                                return;
                            }
                            if (button != 0) {
                                return;
                            }
                            if (this.openProgress() <= 0.01f) {
                                return;
                            }
                            layout = this.expandedLayout();
                            if (!this.contains(layout.getPicker(), mouseX, mouseY)) break block7;
                            int n5 = C[45];
                            n5 += C[46];
                            this.draggingPicker = n5 += C[47];
                            int n6 = C[48];
                            n6 ^= C[49];
                            this.draggingHue = n6 += C[50];
                            int n7 = C[51];
                            n7 ^= C[52];
                            this.draggingAlpha = n7 += C[53];
                            this.updatePicker(mouseX, mouseY, layout.getPicker());
                            break block8;
                        }
                        if (!this.contains(layout.getHue(), mouseX, mouseY)) break block9;
                        int n8 = C[54];
                        n8 -= C[55];
                        this.draggingPicker = n8 ^= C[56];
                        int n9 = C[57];
                        n9 ^= C[58];
                        this.draggingHue = n9 -= C[59];
                        int n10 = C[60];
                        n10 -= C[61];
                        this.draggingAlpha = n10 += C[62];
                        this.updateHue(mouseX, layout.getHue());
                        break block8;
                    }
                    if (!this.contains(layout.getAlpha(), mouseX, mouseY)) break block10;
                    int n11 = C[63];
                    n11 += C[64];
                    this.draggingPicker = n11 -= C[65];
                    int n12 = C[66];
                    n12 -= C[67];
                    this.draggingHue = n12 ^= C[68];
                    int n13 = C[69];
                    n13 += C[70];
                    this.draggingAlpha = n13 += C[71];
                    this.updateAlpha(mouseX, layout.getAlpha());
                    break block8;
                }
                if (!this.contains(layout.getCopyButton(), mouseX, mouseY)) break block11;
                copiedColor = (Color)((ColorSetting)this.getSetting()).getValue();
                break block8;
            }
            if (!this.contains(layout.getPasteButton(), mouseX, mouseY)) break block8;
            Color color = copiedColor;
            if (color != null) {
                Color color2 = color;
                long l3 = l2;
                int n14 = C[72];
                n14 -= C[73];
                l2 = l3 ^ (0L ^ l3) & -1L << (n14 -= C[74]);
                this.applyColor(color2);
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

    private final void drawPicker(Rect rect, float uiAlpha, float openProgress2) {
        Color color = Color.getHSBColor(this.hue, 1.0f, 1.0f);
        int n2 = C[75];
        n2 -= C[76];
        int n3 = C[78];
        n3 ^= C[79];
        Intrinsics.checkNotNullExpressionValue(color, (String)a[n2 -= C[77]] + (String)a[n3 ^= C[80]]);
        Color color2 = this.withUiAlpha(color, uiAlpha);
        int n4 = C[81];
        n4 ^= C[82];
        n4 -= C[83];
        int n5 = C[84];
        n5 += C[85];
        n5 -= C[86];
        int n6 = C[87];
        n6 += C[88];
        int n7 = C[90];
        n7 -= C[91];
        int n8 = C[93];
        n8 += C[94];
        Color color3 = new Color(n4, n5, n6 += C[89], RangesKt.coerceIn(MathKt.roundToInt(255.0f * uiAlpha), n7 ^= C[92], n8 ^= C[95]));
        int n9 = C[96];
        n9 ^= C[97];
        n9 += C[98];
        int n10 = C[99];
        n10 ^= C[100];
        n10 += C[101];
        int n11 = C[102];
        n11 -= C[103];
        int n12 = C[105];
        n12 -= C[106];
        int n13 = C[108];
        n13 ^= C[109];
        Color color4 = new Color(n9, n10, n11 ^= C[104], RangesKt.coerceIn(MathKt.roundToInt(255.0f * uiAlpha), n12 ^= C[107], n13 -= C[110]));
        RenderUtils.INSTANCE.getBASIC_RECT().priority(this.rectPipeline()).color(color2, color3, color4, color4).round(2.0f).draw(rect.getX(), rect.getY(), rect.getWidth(), rect.getHeight());
        float f2 = RangesKt.coerceIn(rect.getX() + this.saturation * rect.getWidth(), rect.getX(), rect.getX() + rect.getWidth());
        float f3 = RangesKt.coerceIn(rect.getY() + (1.0f - this.brightness) * rect.getHeight(), rect.getY(), rect.getY() + rect.getHeight());
        Color color5 = Color.WHITE;
        int n14 = C[111];
        n14 ^= C[112];
        Intrinsics.checkNotNullExpressionValue(color5, (String)a[n14 ^= C[113]]);
        Color color6 = ColorUtil.INSTANCE.setAlpha(color5, 0.96f * uiAlpha);
        RenderUtils.INSTANCE.getBASIC_RECT().priority(this.rectPipeline()).color(color6).round(1.5f).draw(f2 - 2.5f, f3 - 2.5f, 5.0f, 5.0f);
    }

    private final void drawHueBar(Rect rect, float uiAlpha, float openProgress2) {
        int n2 = C[114];
        n2 += C[115];
        a a2 = TextureLoader.INSTANCE.get((String)a[n2 += C[116]]);
        if (a2 != null) {
            TextureRectRenderer textureRectRenderer = RenderUtils.INSTANCE.getTEXTURE_RECT().priority(this.rectPipeline()).texture(a2);
            float f2 = rect.getX();
            float f3 = rect.getY();
            float f4 = rect.getWidth();
            float f5 = rect.getHeight();
            Color color = Color.WHITE;
            int n3 = C[117];
            n3 ^= C[118];
            Intrinsics.checkNotNullExpressionValue(color, (String)a[n3 -= C[119]]);
            int n4 = C[120];
            n4 ^= C[121];
            TextureRectRenderer.draw$default(textureRectRenderer, f2, f3, f4, f5, color, 1.4f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, uiAlpha, n4 ^= C[122], null);
        }
        float f6 = RangesKt.coerceIn(rect.getX() + this.hue * rect.getWidth(), rect.getX(), rect.getX() + rect.getWidth());
        Color color = Color.WHITE;
        int n5 = C[123];
        n5 ^= C[124];
        Intrinsics.checkNotNullExpressionValue(color, (String)a[n5 ^= C[125]]);
        Color color2 = ColorUtil.INSTANCE.setAlpha(color, 0.92f * uiAlpha);
        RenderUtils.INSTANCE.getBASIC_RECT().priority(this.rectPipeline()).color(color2).round(0.8f).draw(f6 - 1.0f, rect.getY() - 1.0f, 2.0f, rect.getHeight() + 2.0f);
    }

    private final void drawAlphaBar(Rect rect, float uiAlpha, float openProgress2) {
        int n2 = C[126];
        n2 ^= C[127];
        int n3 = C[129];
        n3 ^= C[130];
        int n4 = C[132];
        n4 -= C[133];
        Color color = ColorUtil.INSTANCE.setAlpha(new Color(n2 ^= C[128], n3 += C[131], n4 += C[134]), 0.32f * uiAlpha);
        int n5 = C[135];
        n5 += C[136];
        int n6 = C[138];
        n6 += C[139];
        int n7 = C[141];
        n7 += C[142];
        Color color2 = ColorUtil.INSTANCE.setAlpha(new Color(n5 += C[137], n6 ^= C[140], n7 ^= C[143]), 0.32f * uiAlpha);
        Color color3 = (Color)((ColorSetting)this.getSetting()).getValue();
        int n8 = C[144];
        n8 ^= C[145];
        Color color4 = new Color(color3.getRed(), color3.getGreen(), color3.getBlue(), n8 ^= C[146]);
        int n9 = C[147];
        n9 += C[148];
        Color color5 = this.withUiAlpha(new Color(color3.getRed(), color3.getGreen(), color3.getBlue(), n9 -= C[149]), uiAlpha);
        RenderUtils.INSTANCE.getBASIC_RECT().priority(this.rectPipeline()).color(color, color2, color, color2).round(1.4f).draw(rect.getX(), rect.getY(), rect.getWidth(), rect.getHeight());
        RenderUtils.INSTANCE.getBASIC_RECT().priority(this.rectPipeline()).color(color5, color4, color5, color4).round(1.4f).draw(rect.getX(), rect.getY(), rect.getWidth(), rect.getHeight());
        float f2 = RangesKt.coerceIn(rect.getX() + this.alphaValue * rect.getWidth(), rect.getX(), rect.getX() + rect.getWidth());
        Color color6 = Color.WHITE;
        int n10 = C[150];
        n10 ^= C[151];
        Intrinsics.checkNotNullExpressionValue(color6, (String)a[n10 -= C[152]]);
        Color color7 = ColorUtil.INSTANCE.setAlpha(color6, 0.92f * uiAlpha);
        RenderUtils.INSTANCE.getBASIC_RECT().priority(this.rectPipeline()).color(color7).round(0.8f).draw(f2 - 1.0f, rect.getY() - 1.0f, 2.0f, rect.getHeight() + 2.0f);
    }

    private final void drawButton(Rect rect, String text, float openProgress2, boolean hovered) {
        float f2 = hovered ? 0.05f : 0.0f;
        Color color = MenuStyle.INSTANCE.surface(this.alphaByState(0.04f + f2, 0.09f + f2) * openProgress2);
        Color color2 = MenuStyle.INSTANCE.title(this.alphaByState(0.06f + f2, 0.13f + f2) * openProgress2);
        Color color3 = MenuStyle.INSTANCE.title(this.alphaByState(0.24f + f2, 0.72f + f2) * openProgress2);
        float f3 = 5.6f;
        RenderUtils.INSTANCE.getBLURRED_RECT().priority(this.rectPipeline()).color(color).round(2.0f).mix(0.95f).border(1.0f, color2).draw(rect.getX(), rect.getY(), rect.getWidth(), rect.getHeight());
        int n2 = C[153];
        n2 += C[154];
        float f4 = E.getWidth$default(this.getDefaultFont(), text, f3, 0.0f, n2 -= C[155], null);
        float f5 = rect.getX() + (rect.getWidth() - f4) * 0.5f;
        float f6 = this.calcMidY(rect.getY(), rect.getHeight(), this.getDefaultFont().getHeight(f3)) - 0.7f;
        int n3 = C[156];
        n3 ^= C[157];
        int n4 = C[159];
        n4 += C[160];
        E.drawText$default(this.getDefaultFont().priority(this.textPipeline()), text, f5, f6, f3, color3, 0.0f, 0.0f, 0.0f, n3 ^= C[158], 0.0f, n4 ^= C[161], null);
    }

    private final void updatePicker(float mouseX, float mouseY, Rect rect) {
        if (rect.getWidth() <= 0.0f || rect.getHeight() <= 0.0f) {
            return;
        }
        this.saturation = RangesKt.coerceIn((mouseX - rect.getX()) / rect.getWidth(), 0.0f, 1.0f);
        this.brightness = RangesKt.coerceIn(1.0f - (mouseY - rect.getY()) / rect.getHeight(), 0.0f, 1.0f);
        this.applyCurrentHSB();
    }

    private final void updateHue(float mouseX, Rect rect) {
        if (rect.getWidth() <= 0.0f) {
            return;
        }
        this.hue = RangesKt.coerceIn((mouseX - rect.getX()) / rect.getWidth(), 0.0f, 1.0f);
        this.applyCurrentHSB();
    }

    private final void updateAlpha(float mouseX, Rect rect) {
        if (rect.getWidth() <= 0.0f) {
            return;
        }
        this.alphaValue = RangesKt.coerceIn((mouseX - rect.getX()) / rect.getWidth(), 0.0f, 1.0f);
        this.applyCurrentHSB();
    }

    private final void applyCurrentHSB() {
        long l2 = -2366826779514258160L;
        long l3 = 6229064758188024892L;
        long l4 = 1811856217929976862L;
        long l5 = -664104621526592025L;
        long l6 = -4994109068870623613L;
        long l7 = -7013125522652708803L;
        long l8 = l5;
        int n2 = C[162];
        n2 += C[163];
        l5 = l8 ^ ((long)Color.HSBtoRGB(this.hue, this.saturation, this.brightness) ^ l8) & -1L >>> (n2 -= C[164]);
        int n3 = C[165];
        n3 ^= C[166];
        n3 += C[167];
        int n4 = C[168];
        n4 -= C[169];
        n4 -= C[170];
        int n5 = C[171];
        n5 -= C[172];
        long l9 = l7;
        int n6 = C[174];
        n6 += C[175];
        l7 = l9 ^ ((long)((int)l5 >> n3 & n4) << (n5 -= C[173]) ^ l9) & -1L << (n6 ^= C[176]);
        int n7 = C[177];
        n7 += C[178];
        n7 -= C[179];
        int n8 = C[180];
        n8 ^= C[181];
        long l10 = l7;
        int n9 = C[183];
        n9 ^= C[184];
        l7 = l10 ^ ((long)((int)l5 >> n7 & (n8 += C[182])) ^ l10) & -1L >>> (n9 ^= C[185]);
        int n10 = C[186];
        n10 += C[187];
        n10 -= C[188];
        int n11 = C[189];
        n11 += C[190];
        long l11 = l6;
        int n12 = C[192];
        n12 += C[193];
        l6 = l11 ^ ((long)((int)l5 & n10) << (n11 += C[191]) ^ l11) & -1L << (n12 ^= C[194]);
        int n13 = C[195];
        n13 += C[196];
        n13 ^= C[197];
        int n14 = C[198];
        n14 += C[199];
        long l12 = l6;
        int n15 = C[201];
        n15 -= C[202];
        l6 = l12 ^ ((long)RangesKt.coerceIn(MathKt.roundToInt(this.alphaValue * 255.0f), n13, n14 += C[200]) ^ l12) & -1L >>> (n15 -= C[203]);
        int n16 = C[204];
        n16 += C[205];
        int n17 = C[207];
        n17 += C[208];
        Color color = new Color((int)(l7 >>> (n16 += C[206])), (int)l7, (int)(l6 >>> (n17 -= C[209])), (int)l6);
        ((ColorSetting)this.getSetting()).setColor(color);
        this.lastColor = color;
        int n18 = C[210];
        n18 -= C[211];
        this.initialized = n18 ^= C[212];
    }

    private final void syncFromSetting() {
        if (!this.initialized || !Intrinsics.areEqual(((ColorSetting)this.getSetting()).getValue(), this.lastColor)) {
            Color color = (Color)((ColorSetting)this.getSetting()).getValue();
            float[] fArray = Color.RGBtoHSB(color.getRed(), color.getGreen(), color.getBlue(), null);
            int n2 = C[213];
            n2 -= C[214];
            this.hue = fArray[n2 -= C[215]];
            int n3 = C[216];
            n3 -= C[217];
            this.saturation = fArray[n3 += C[218]];
            int n4 = C[219];
            n4 -= C[220];
            this.brightness = fArray[n4 -= C[221]];
            this.alphaValue = (float)color.getAlpha() / 255.0f;
            this.lastColor = color;
            int n5 = C[222];
            n5 -= C[223];
            this.initialized = n5 += C[224];
        }
    }

    private final void applyColor(Color color) {
        ((ColorSetting)this.getSetting()).setColor(color);
        this.lastColor = color;
        int n2 = C[225];
        n2 ^= C[226];
        this.initialized = n2 += C[227];
        this.syncFromSetting();
    }

    private final Rect previewRect() {
        float f2 = 16.0f;
        float f3 = 9.0f;
        float f4 = this.getX() + this.getWidth() - this.getPadding() - f2;
        float f5 = this.calcMidY(this.getY(), this.rowHeight, f3);
        return new Rect(f4, f5, f2, f3);
    }

    private final Layout expandedLayout() {
        float f2 = this.getX() + this.getPadding();
        float f3 = RangesKt.coerceAtLeast(this.getWidth() - this.getPadding() * 2.0f, 0.0f);
        float f4 = this.getY() + this.rowHeight + this.gap;
        float f5 = f4 + this.pickerHeight + this.gap;
        float f6 = f5 + this.hueHeight + this.gap;
        float f7 = f6 + this.alphaHeight + this.gap;
        float f8 = RangesKt.coerceAtLeast(f3 - this.gap, 0.0f) * 0.5f;
        return new Layout(new Rect(f2, f4, f3, this.pickerHeight), new Rect(f2, f5, f3, this.hueHeight), new Rect(f2, f6, f3, this.alphaHeight), new Rect(f2, f7, f8, this.buttonHeight), new Rect(f2 + f8 + this.gap, f7, f8, this.buttonHeight));
    }

    private final float expandedSectionHeight() {
        return this.gap + this.pickerHeight + this.gap + this.hueHeight + this.gap + this.alphaHeight + this.gap + this.buttonHeight + this.gap;
    }

    private final float openProgress() {
        return this.openAnim.animate(this.open ? 1.0f : 0.0f, 240.0f, (Function1<? super Float, Float>)new Function1<Float, Float>((Object)Easings.INSTANCE){
            private static Object[] a;
            private static Object b;
            private static Object[] B;
            private static Object[] A;
            private static Object[] c;
            public static int[] C;
            {
                int n2 = C[0];
                n2 += C[1];
                n2 -= C[2];
                int n3 = C[3];
                n3 -= C[4];
                n3 ^= C[5];
                int n4 = C[6];
                n4 -= C[7];
                n4 += C[8];
                int n5 = C[9];
                n5 ^= C[10];
                int n6 = C[12];
                n6 += C[13];
                int n7 = C[15];
                n7 += C[16];
                super(n2, receiver, Easings.class, (String)a[n3] + (String)a[n4], (String)a[n5 -= C[11]] + (String)a[n6 -= C[14]], n7 ^= C[17]);
            }

            public final Float invoke(float p0) {
                return Float.valueOf(((Easings)this.receiver).standardDecelerate(p0));
            }

            static {
                openProgress._1.b();
                long l2 = 389076175535550661L;
                long l3 = 2845188411381844227L;
                long l4 = -8268863919486501070L;
                long l5 = 5096960240446549416L;
                long l6 = -1140830833142798628L;
                long l7 = -2551498766985573296L;
                long l8 = -9045534273487838142L;
                long l9 = 7587408474767679530L;
                long l10 = 6651995042745510220L;
                long l11 = 4049693303031184870L;
                long l12 = 8824255166881136836L;
                long l13 = 1941307991767918147L;
                long l14 = -3971840325052123899L;
                long l15 = 6091585529423850981L;
                int n2 = C[18];
                n2 -= C[19];
                a = new Object[n2 ^= C[20]];
                long l16 = l15;
                int n3 = C[21];
                n3 += C[22];
                l15 = l16 ^ (0L ^ l16) & -1L << (n3 ^= C[23]);
                Object[] objectArray = new Object[C[24]];
                objectArray[openProgress._1.C[25]] = A;
                objectArray[openProgress._1.C[26]] = C[27];
                int n4 = C[28];
                Object object = openProgress._1.A()[C[29]];
                if (object == null) {
                    char[] cArray = "\u8629\u86ea\u8637\u869c\u86e5\u868a\u862c\u863b\u8604\u864a\u8635\u863f\u862c\u8699\u862b\u86ed\u863b\u869d\u8629\u863d\u8688\u86ea\u8636\u8601\u86e1\u863c\u863c\u8697\u862c\u863d\u86e0\u8603\u863a\u869a\u86de\u862c\u863d\u86e2\u8688\u8688\u8634\u869b\u86de\u869f\u86ea\u8626\u8637\u86e3\u8636\u8695\u863b\u86c5\u87cc\u86c2\u8629\u864a\u863b\u8638\u863d\u86e4\u86c3\u86e1\u863b\u86e1\u86e7\u869d\u8605\u8698\u86ff\u8629\u8626\u863a\u8695\u86ed\u86e4\u86c2\u869a\u863b\u86e5\u867e\u869d\u86ed\u86e7\u8601\u86e1\u863f\u869f\u8638\u868d\u86c5\u8607\u869c\u863a\u86e1\u863c\u8626\u8638\u86ea\u8628\u8688\u86c7\u8629\u8601\u87cc\u8629\u87c8\u869d\u8651".toCharArray();
                    for (int i2 = C[30]; i2 < C[31]; ++i2) {
                        int n5 = cArray[i2];
                        n5 ^= C[32];
                        n5 ^= C[33];
                        n5 -= C[34];
                        n5 -= C[35];
                        n5 ^= C[36];
                        n5 ^= C[37];
                        n5 += C[38];
                        n5 ^= C[39];
                        n5 ^= C[40];
                        n5 -= C[41];
                        n5 -= C[42];
                        n5 ^= C[43];
                        n5 ^= C[44];
                        n5 -= C[45];
                        n5 -= C[46];
                        cArray[i2] = (char)(n5 ^= C[47]);
                    }
                    object = openProgress._1.A()[openProgress._1.C[48]] = new String(cArray);
                }
                objectArray[n4] = (String)object;
                char[] cArray = ((String)openProgress._1.a(objectArray)).toCharArray();
                long l17 = l6;
                int n6 = C[49];
                n6 -= C[50];
                l6 = l17 ^ (0x3000000000L ^ l17) & -1L << (n6 -= C[51]);
                long l18 = l13;
                int n7 = C[52];
                n7 += C[53];
                l13 = l18 ^ (0L ^ l18) & -1L >>> (n7 ^= C[54]);
                while (true) {
                    int n8 = C[55];
                    n8 -= C[56];
                    if ((int)l13 >= (int)(l6 >>> (n8 ^= C[57]))) break;
                    int n9 = (int)l13;
                    long l19 = l13;
                    int n10 = C[58];
                    n10 -= C[59];
                    int n11 = C[61];
                    n11 ^= C[62];
                    l13 = l19 ^ (l19 ^ l19 + (long)(n10 -= C[60])) & -1L >>> (n11 ^= C[63]);
                    long l20 = l9;
                    int n12 = C[64];
                    n12 -= C[65];
                    l9 = l20 ^ ((long)cArray[n9] ^ l20) & -1L >>> (n12 += C[66]);
                    int n13 = (int)l13;
                    long l21 = l13;
                    int n14 = C[67];
                    n14 -= C[68];
                    int n15 = C[70];
                    n15 -= C[71];
                    l13 = l21 ^ (l21 ^ l21 + (long)(n14 -= C[69])) & -1L >>> (n15 += C[72]);
                    int n16 = C[73];
                    n16 ^= C[74];
                    long l22 = l10;
                    int n17 = C[76];
                    n17 += C[77];
                    l10 = l22 ^ ((long)cArray[n13] << (n16 += C[75]) ^ l22) & -1L << (n17 ^= C[78]);
                    int n18 = C[79];
                    n18 += C[80];
                    n18 ^= C[81];
                    int n19 = C[82];
                    n19 -= C[83];
                    long l23 = l12;
                    int n20 = C[85];
                    n20 ^= C[86];
                    l12 = l23 ^ ((long)((int)l9 << n18 | (int)(l10 >>> (n19 ^= C[84]))) ^ l23) & -1L >>> (n20 += C[87]);
                    char[] cArray2 = new char[(int)l12];
                    long l24 = l14;
                    int n21 = C[88];
                    n21 ^= C[89];
                    l14 = l24 ^ (0L ^ l24) & -1L << (n21 += C[90]);
                    while (true) {
                        int n22 = C[91];
                        n22 ^= C[92];
                        if ((int)(l14 >>> (n22 += C[93])) >= (int)l12) break;
                        int n23 = C[94];
                        n23 += C[95];
                        int n24 = C[97];
                        n24 ^= C[98];
                        cArray2[(int)(l14 >>> (n23 ^= openProgress._1.C[96]))] = cArray[(int)l13 + (int)(l14 >>> (n24 ^= C[99]))];
                        l14 += 0x100000000L;
                    }
                    int n25 = C[100];
                    n25 -= C[101];
                    int n26 = (int)(l15 >>> (n25 ^= C[102]));
                    l15 += 0x100000000L;
                    openProgress._1.a[n26] = new String(cArray2);
                    long l25 = l13;
                    int n27 = C[103];
                    n27 ^= C[104];
                    l13 = l25 ^ ((long)((int)l13 + (int)l12) ^ l25) & -1L >>> (n27 ^= C[105]);
                }
            }

            public static Object a(Object[] object) {
                Object object2;
                int n2 = (Integer)object[C[106]];
                String string = (String)object[C[107]];
                object = object[C[108]];
                Object[] objectArray = B;
                if (B == null) {
                    objectArray = B = new Object[C[109]];
                }
                if ((object2 = objectArray[n2]) == null) {
                    Object object3 = object;
                    if (object == null) {
                        Object[] objectArray2 = new Object[C[110]];
                        A = objectArray2;
                        object3 = objectArray2;
                        byte[] byArray = new byte[C[112] ^ C[113]];
                        byArray[openProgress._1.C[114] ^ openProgress._1.C[115]] = C[116] ^ C[117];
                        byArray[openProgress._1.C[118] ^ openProgress._1.C[119]] = C[120] ^ C[121];
                        byArray[openProgress._1.C[122] ^ openProgress._1.C[123]] = C[124] ^ C[125];
                        byArray[openProgress._1.C[126] ^ openProgress._1.C[127]] = C[128] ^ C[129];
                        byArray[openProgress._1.C[130] ^ openProgress._1.C[131]] = C[132] ^ C[133];
                        byArray[openProgress._1.C[134] ^ openProgress._1.C[135]] = C[136] ^ C[137];
                        byArray[openProgress._1.C[138] ^ openProgress._1.C[139]] = C[140] ^ C[141];
                        byArray[openProgress._1.C[142] ^ openProgress._1.C[143]] = C[144] ^ C[145];
                        byArray[openProgress._1.C[146] ^ openProgress._1.C[147]] = C[148] ^ C[149];
                        byArray[openProgress._1.C[150] ^ openProgress._1.C[151]] = C[152] ^ C[153];
                        byArray[openProgress._1.C[154] ^ openProgress._1.C[155]] = C[156] ^ C[157];
                        byArray[openProgress._1.C[158] ^ openProgress._1.C[159]] = C[160] ^ C[161];
                        byArray[openProgress._1.C[162] ^ openProgress._1.C[163]] = C[164] ^ C[165];
                        byArray[openProgress._1.C[166] ^ openProgress._1.C[167]] = C[168] ^ C[169];
                        byArray[openProgress._1.C[170] ^ openProgress._1.C[171]] = C[172] ^ C[173];
                        byArray[openProgress._1.C[174] ^ openProgress._1.C[175]] = C[176] ^ C[177];
                        objectArray2[openProgress._1.C[111]] = byArray;
                    }
                    byte[] byArray = (byte[])object3[C[178]];
                    if (b == null) {
                        byte[] byArray2 = new byte[C[179] ^ C[180]];
                        byArray2[openProgress._1.C[181] ^ openProgress._1.C[182]] = C[183] ^ C[184];
                        byArray2[openProgress._1.C[185] ^ openProgress._1.C[186]] = C[187] ^ C[188];
                        byArray2[openProgress._1.C[189] ^ openProgress._1.C[190]] = C[191] ^ C[192];
                        byArray2[openProgress._1.C[193] ^ openProgress._1.C[194]] = C[195] ^ C[196];
                        byArray2[openProgress._1.C[197] ^ openProgress._1.C[198]] = C[199] ^ C[200];
                        byArray2[openProgress._1.C[201] ^ openProgress._1.C[202]] = C[203] ^ C[204];
                        byArray2[openProgress._1.C[205] ^ openProgress._1.C[206]] = C[207] ^ C[208];
                        byArray2[openProgress._1.C[209] ^ openProgress._1.C[210]] = C[211] ^ C[212];
                        byArray2[openProgress._1.C[213] ^ openProgress._1.C[214]] = C[215] ^ C[216];
                        byArray2[openProgress._1.C[217] ^ openProgress._1.C[218]] = C[219] ^ C[220];
                        byArray2[openProgress._1.C[221] ^ openProgress._1.C[222]] = C[223] ^ C[224];
                        byArray2[openProgress._1.C[225] ^ openProgress._1.C[226]] = C[227] ^ C[228];
                        byArray2[openProgress._1.C[229] ^ openProgress._1.C[230]] = C[231] ^ C[232];
                        byArray2[openProgress._1.C[233] ^ openProgress._1.C[234]] = C[235] ^ C[236];
                        byArray2[openProgress._1.C[237] ^ openProgress._1.C[238]] = C[239] ^ C[240];
                        byArray2[openProgress._1.C[241] ^ openProgress._1.C[242]] = C[243] ^ C[244];
                        byArray2[openProgress._1.C[245] ^ openProgress._1.C[246]] = C[247] ^ C[248];
                        byArray2[openProgress._1.C[249] ^ openProgress._1.C[250]] = C[251] ^ C[252];
                        byArray2[openProgress._1.C[253] ^ openProgress._1.C[254]] = C[255] ^ C[256];
                        byArray2[openProgress._1.C[257] ^ openProgress._1.C[258]] = C[259] ^ C[260];
                        byArray2[openProgress._1.C[261] ^ openProgress._1.C[262]] = C[263] ^ C[264];
                        byArray2[openProgress._1.C[265] ^ openProgress._1.C[266]] = C[267] ^ C[268];
                        byArray2[openProgress._1.C[269] ^ openProgress._1.C[270]] = C[271] ^ C[272];
                        byArray2[openProgress._1.C[273] ^ openProgress._1.C[274]] = C[275] ^ C[276];
                        byArray2[openProgress._1.C[277] ^ openProgress._1.C[278]] = C[279] ^ C[280];
                        byArray2[openProgress._1.C[281] ^ openProgress._1.C[282]] = C[283] ^ C[284];
                        byArray2[openProgress._1.C[285] ^ openProgress._1.C[286]] = C[287] ^ C[288];
                        byArray2[openProgress._1.C[289] ^ openProgress._1.C[290]] = C[291] ^ C[292];
                        byArray2[openProgress._1.C[293] ^ openProgress._1.C[294]] = C[295] ^ C[296];
                        byArray2[openProgress._1.C[297] ^ openProgress._1.C[298]] = C[299] ^ C[300];
                        byArray2[openProgress._1.C[301] ^ openProgress._1.C[302]] = C[303] ^ C[304];
                        byArray2[openProgress._1.C[305] ^ openProgress._1.C[306]] = C[307] ^ C[308];
                        byte[] byArray3 = new byte[byArray.length + byArray2.length];
                        System.arraycopy(byArray, C[309], byArray3, C[310], byArray.length);
                        System.arraycopy(byArray2, C[311], byArray3, byArray.length, byArray2.length);
                        Object object4 = openProgress._1.A()[C[312]];
                        if (object4 == null) {
                            char[] cArray = "\ucdc6\uce34\ucdbd\ucdc2\ucdc0\uce64\ucd91\ucd9f\ucd72\ucd9e\ucdbe\ucd8b\ucd97\ucd95\ucdc5\ucdbe\uce37\uce67".toCharArray();
                            for (int i2 = C[313]; i2 < C[314]; ++i2) {
                                int n3 = cArray[i2];
                                n3 -= C[315];
                                n3 += C[316];
                                n3 -= C[317];
                                n3 += C[318];
                                n3 += C[319];
                                n3 += C[320];
                                n3 -= C[321];
                                n3 -= C[322];
                                n3 ^= C[323];
                                n3 -= C[324];
                                n3 ^= C[325];
                                n3 -= C[326];
                                cArray[i2] = (char)(n3 += C[327]);
                            }
                            object4 = openProgress._1.A()[openProgress._1.C[328]] = new String(cArray);
                        }
                        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance((String)object4);
                        byte[] byArray4 = new byte[C[329]];
                        byArray4[openProgress._1.C[330]] = C[331];
                        byArray4[openProgress._1.C[332]] = C[333];
                        byArray4[openProgress._1.C[334]] = C[335];
                        byArray4[openProgress._1.C[336]] = C[337];
                        byArray4[openProgress._1.C[338]] = C[339];
                        byArray4[openProgress._1.C[340]] = C[341];
                        byArray4[openProgress._1.C[342]] = C[343];
                        byArray4[openProgress._1.C[344]] = C[345];
                        byArray4[openProgress._1.C[346]] = C[347];
                        byArray4[openProgress._1.C[348]] = C[349];
                        byArray4[openProgress._1.C[350]] = C[351];
                        byArray4[openProgress._1.C[352]] = C[353];
                        byArray4[openProgress._1.C[354]] = C[355];
                        byArray4[openProgress._1.C[356]] = C[357];
                        byArray4[openProgress._1.C[358]] = C[359];
                        byArray4[openProgress._1.C[360]] = C[361];
                        PBEKeySpec pBEKeySpec = new PBEKeySpec(new String(byArray3, StandardCharsets.UTF_8).toCharArray(), byArray4, C[362], C[363]);
                        byte[] byArray5 = secretKeyFactory.generateSecret(pBEKeySpec).getEncoded();
                        Object object5 = openProgress._1.A()[C[364]];
                        if (object5 == null) {
                            char[] cArray = "\u2309\u230d\u231f".toCharArray();
                            for (int i3 = C[365]; i3 < C[366]; ++i3) {
                                int n4 = cArray[i3];
                                n4 += C[367];
                                n4 ^= C[368];
                                n4 -= C[369];
                                n4 -= C[370];
                                n4 += C[371];
                                n4 -= C[372];
                                n4 += C[373];
                                n4 ^= C[374];
                                n4 += C[375];
                                n4 += C[376];
                                n4 += C[377];
                                cArray[i3] = (char)(n4 += C[378]);
                            }
                            object5 = openProgress._1.A()[openProgress._1.C[379]] = new String(cArray);
                        }
                        b = new SecretKeySpec(byArray5, (String)object5);
                    }
                    byte[] byArray6 = Base64.getDecoder().decode(string);
                    byte[] byArray7 = Arrays.copyOfRange(byArray6, C[380], C[381]);
                    byte[] byArray8 = Arrays.copyOfRange(byArray6, C[382], byArray6.length);
                    Object object6 = openProgress._1.A()[C[383]];
                    if (object6 == null) {
                        char[] cArray = "\u3f71\u3f7d\u3f6f\u3f83\u3f7f\u3f70\u3f7f\u3f83\u3f62\u3f67\u3f7f\u3f6f\u3f8d\u3f62\u4051\u405e\u405e\u4059\u4044\u405b".toCharArray();
                        for (int i4 = C[384]; i4 < C[385]; ++i4) {
                            int n5 = cArray[i4];
                            n5 -= C[386];
                            n5 += C[387];
                            n5 ^= C[388];
                            n5 ^= C[389];
                            n5 -= C[390];
                            n5 -= C[391];
                            n5 += C[392];
                            n5 -= C[393];
                            n5 -= C[394];
                            n5 += C[395];
                            n5 += C[396];
                            n5 -= C[397];
                            cArray[i4] = (char)(n5 ^= C[398]);
                        }
                        object6 = openProgress._1.A()[openProgress._1.C[399]] = new String(cArray);
                    }
                    Cipher cipher = Cipher.getInstance((String)object6);
                    cipher.init(2, (Key)((SecretKey)b), new IvParameterSpec(byArray7));
                    byte[] byArray9 = cipher.doFinal(byArray8);
                    object2 = new String(byArray9, StandardCharsets.UTF_8);
                }
                return object2;
            }

            private static Object[] A() {
                Object[] objectArray = c;
                if (c == null) {
                    c = new Object[4];
                    objectArray = c;
                }
                return objectArray;
            }

            public static void b() {
                C = new int[0x1056F ^ 0x104FF];
                openProgress._1.C[0xD645 ^ 0xD67F] = 0xD62F ^ 0xD67F;
                openProgress._1.C[0xCECE ^ 0xCEE8] = 0x280 ^ 0xCEE8;
                openProgress._1.C[0xEBB7 ^ 0xEB0A] = 0x1EE55 ^ 0xEB0A;
                openProgress._1.C[0x8B8C ^ 0x8B95] = 0x8B95 ^ 0x8B95;
                openProgress._1.C[0xFB94 ^ 0xFBB5] = 0x2D74 ^ 0xFBB5;
                openProgress._1.C[0x1008 ^ 0x1186] = 0x82F9 ^ 0x1186;
                openProgress._1.C[0x21F1 ^ 0x2184] = 0xC7F9 ^ 0x2184;
                openProgress._1.C[0xC6CC ^ 0xC78D] = 0x2923 ^ 0xC78D;
                openProgress._1.C[0x1FE7 ^ 0x1FE3] = 0xFFFFE02D ^ 0x1FE3;
                openProgress._1.C[0x5990 ^ 0x58C6] = 0x58C9 ^ 0x58C6;
                openProgress._1.C[0x10A0C ^ 0x10AFE] = 0x1B14D ^ 0x10AFE;
                openProgress._1.C[0xD1F6 ^ 0xD07B] = 0x6467 ^ 0xD07B;
                openProgress._1.C[0xBF56 ^ 0xBE75] = 0xFFFE4A12 ^ 0xBE75;
                openProgress._1.C[0xF3FD ^ 0xF2F7] = 0x6813 ^ 0xF2F7;
                openProgress._1.C[0xC3A1 ^ 0xC303] = 0xB82 ^ 0xC303;
                openProgress._1.C[0x6F6A ^ 0x6F06] = 0x6F06 ^ 0x6F06;
                openProgress._1.C[0x9816 ^ 0x9929] = 0xF641 ^ 0x9929;
                openProgress._1.C[0x6063 ^ 0x61EF] = 0x7AD3 ^ 0x61EF;
                openProgress._1.C[0xC301 ^ 0xC328] = 0xD5F1 ^ 0xC328;
                openProgress._1.C[0x7195 ^ 0x711E] = 0x6525 ^ 0x711E;
                openProgress._1.C[0x2C63 ^ 0x2C9A] = 0x375 ^ 0x2C9A;
                openProgress._1.C[0xA50B ^ 0xA457] = 0xA45D ^ 0xA457;
                openProgress._1.C[0xDDDF ^ 0xDD29] = 0xE577 ^ 0xDD29;
                openProgress._1.C[0xF417 ^ 0xF493] = 0x28CB ^ 0xF493;
                openProgress._1.C[0x4A41 ^ 0x4A35] = 0xFFFF53B3 ^ 0x4A35;
                openProgress._1.C[0xEB0 ^ 0xEE5] = 0xEBF ^ 0xEE5;
                openProgress._1.C[0xEB ^ 0xA3] = 0xED ^ 0xA3;
                openProgress._1.C[0x6611 ^ 0x6791] = 0x6791 ^ 0x6791;
                openProgress._1.C[0x8360 ^ 0x8339] = 0x834E ^ 0x8339;
                openProgress._1.C[0x7369 ^ 0x73A1] = 0x5B4 ^ 0x73A1;
                openProgress._1.C[0x108F1 ^ 0x10893] = 0x108CA ^ 0x10893;
                openProgress._1.C[0x907F ^ 0x90CD] = 0x90CD ^ 0x90CD;
                openProgress._1.C[0x43B4 ^ 0x436F] = 0x97D7 ^ 0x436F;
                openProgress._1.C[0x1E3D ^ 0x1E3B] = 0xFFFFE173 ^ 0x1E3B;
                openProgress._1.C[0x45A8 ^ 0x4598] = 0x4598 ^ 0x4598;
                openProgress._1.C[0x8368 ^ 0x83FF] = 0x4897 ^ 0x83FF;
                openProgress._1.C[0xFFAE ^ 0xFFE5] = 0xFFFF0049 ^ 0xFFE5;
                openProgress._1.C[0x9124 ^ 0x91DE] = 0xBE34 ^ 0x91DE;
                openProgress._1.C[0xE326 ^ 0xE337] = 0xE350 ^ 0xE337;
                openProgress._1.C[0xCF18 ^ 0xCE69] = 0xD038 ^ 0xCE69;
                openProgress._1.C[0xA645 ^ 0xA765] = 0x5FF5 ^ 0xA765;
                openProgress._1.C[0xF90C ^ 0xF919] = 0xF932 ^ 0xF919;
                openProgress._1.C[0xDE22 ^ 0xDF6C] = 0xDF60 ^ 0xDF6C;
                openProgress._1.C[0xDAF1 ^ 0xDAF8] = 0xDABE ^ 0xDAF8;
                openProgress._1.C[0x7ABA ^ 0x7A44] = 0xE4CB ^ 0x7A44;
                openProgress._1.C[0x6FC4 ^ 0x6F39] = 0xF1B5 ^ 0x6F39;
                openProgress._1.C[0x71FF ^ 0x7091] = 0x7092 ^ 0x7091;
                openProgress._1.C[0xFFBF ^ 0xFEA2] = 0x624 ^ 0xFEA2;
                openProgress._1.C[0x10E2E ^ 0x10F02] = 0x684 ^ 0x10F02;
                openProgress._1.C[0x7CDD ^ 0x7C18] = 0xA0B ^ 0x7C18;
                openProgress._1.C[0x4834 ^ 0x4879] = 0xFFFFB791 ^ 0x4879;
                openProgress._1.C[0xF9CC ^ 0xF8C4] = 0x8CC5 ^ 0xF8C4;
                openProgress._1.C[0xC7AA ^ 0xC7D5] = 0x9F7 ^ 0xC7D5;
                openProgress._1.C[0xACF3 ^ 0xAD7B] = 0x7AC8 ^ 0xAD7B;
                openProgress._1.C[0xD670 ^ 0xD6CE] = 0x1D381 ^ 0xD6CE;
                openProgress._1.C[0xEA32 ^ 0xEB65] = 0xFFFF1486 ^ 0xEB65;
                openProgress._1.C[0x199E ^ 0x18F7] = 0xFFFFE748 ^ 0x18F7;
                openProgress._1.C[0xD4FC ^ 0xD5AF] = 0xD5CF ^ 0xD5AF;
                openProgress._1.C[0xA09 ^ 0xAA2] = 0x1EDE ^ 0xAA2;
                openProgress._1.C[0x5942 ^ 0x5911] = 0xFFFFA6E9 ^ 0x5911;
                openProgress._1.C[0x5FB2 ^ 0x5F99] = 0x4BE3 ^ 0x5F99;
                openProgress._1.C[0x22D0 ^ 0x238E] = 0x238B ^ 0x238E;
                openProgress._1.C[0xA711 ^ 0xA758] = 0xFFFF58D1 ^ 0xA758;
                openProgress._1.C[0xC98 ^ 0xDEF] = 0xFF34 ^ 0xDEF;
                openProgress._1.C[0xF15A ^ 0xF1B7] = 0x65E ^ 0xF1B7;
                openProgress._1.C[0x134D ^ 0x1241] = 0x88A5 ^ 0x1241;
                openProgress._1.C[0x10781 ^ 0x10684] = 0x1728D ^ 0x10684;
                openProgress._1.C[0xBA61 ^ 0xBAED] = 0xAEA4 ^ 0xBAED;
                openProgress._1.C[0x2B9A ^ 0x2B98] = 0xFFFFD42F ^ 0x2B98;
                openProgress._1.C[0x7B15 ^ 0x7B24] = 0xFFFF848E ^ 0x7B24;
                openProgress._1.C[0x5C2A ^ 0x5C15] = 0x5C0B ^ 0x5C15;
                openProgress._1.C[0x454C ^ 0x4587] = 0xFFFEB7F5 ^ 0x4587;
                openProgress._1.C[0xF8AD ^ 0xF836] = 0x39BD ^ 0xF836;
                openProgress._1.C[0x4670 ^ 0x473A] = 0x4738 ^ 0x473A;
                openProgress._1.C[0x8B98 ^ 0x8AD7] = 0x8AFE ^ 0x8AD7;
                openProgress._1.C[0x824C ^ 0x8261] = 0xD75C ^ 0x8261;
                openProgress._1.C[0x56FF ^ 0x56BA] = 0x56F1 ^ 0x56BA;
                openProgress._1.C[0x4685 ^ 0x4628] = 0x5254 ^ 0x4628;
                openProgress._1.C[0x7759 ^ 0x77F5] = 0x63CA ^ 0x77F5;
                openProgress._1.C[0x7DAB ^ 0x7CCE] = 0x7C94 ^ 0x7CCE;
                openProgress._1.C[0xB854 ^ 0xB95F] = 0x23A1 ^ 0xB95F;
                openProgress._1.C[0x2B73 ^ 0x2B21] = 0xFFFFD4CB ^ 0x2B21;
                openProgress._1.C[0x9C7C ^ 0x9C2B] = 0xFFFF638A ^ 0x9C2B;
                openProgress._1.C[0xF699 ^ 0xF7E1] = 0xEFBF ^ 0xF7E1;
                openProgress._1.C[0x4FD3 ^ 0x4E58] = 0x2EA3 ^ 0x4E58;
                openProgress._1.C[0x14AC ^ 0x14BB] = 0x14F7 ^ 0x14BB;
                openProgress._1.C[0x3EA8 ^ 0x3ED9] = 0xDD19 ^ 0x3ED9;
                openProgress._1.C[0x969C ^ 0x96D0] = 0x96F4 ^ 0x96D0;
                openProgress._1.C[0x1F36 ^ 0x1F6A] = 0xFFFFE093 ^ 0x1F6A;
                openProgress._1.C[0x2E70 ^ 0x2E03] = 0xC87E ^ 0x2E03;
                openProgress._1.C[0x2987 ^ 0x295B] = 0xFDA1 ^ 0x295B;
                openProgress._1.C[0x1D0A ^ 0x1C1A] = 0x90D0 ^ 0x1C1A;
                openProgress._1.C[0x8A9E ^ 0x8B8D] = 0x18B65 ^ 0x8B8D;
                openProgress._1.C[0x238B ^ 0x22D4] = 0x229E ^ 0x22D4;
                openProgress._1.C[0xE538 ^ 0xE540] = 0xFFFFC9F9 ^ 0xE540;
                openProgress._1.C[0x1675 ^ 0x166A] = 0x1606 ^ 0x166A;
                openProgress._1.C[0x68F9 ^ 0x69E8] = 0x1697C ^ 0x69E8;
                openProgress._1.C[0x4DFC ^ 0x4CBE] = 0x956F ^ 0x4CBE;
                openProgress._1.C[0x3EA8 ^ 0x3EAF] = 0xFFFFC138 ^ 0x3EAF;
                openProgress._1.C[0x21CB ^ 0x2134] = 0xBF9D ^ 0x2134;
                openProgress._1.C[0x2A9D ^ 0x2A49] = 0xF65C ^ 0x2A49;
                openProgress._1.C[0xCA5 ^ 0xC1D] = 0xCC31 ^ 0xC1D;
                openProgress._1.C[0x2B ^ 0x11A] = 0x8373 ^ 0x11A;
                openProgress._1.C[0x723E ^ 0x72A2] = 0xFFFF4CCD ^ 0x72A2;
                openProgress._1.C[0x989C ^ 0x998B] = 0x19C88 ^ 0x998B;
                openProgress._1.C[0xFD0B ^ 0xFDF8] = 0xFFFFB9CC ^ 0xFDF8;
                openProgress._1.C[0x75AB ^ 0x75C5] = 0x75C4 ^ 0x75C5;
                openProgress._1.C[0x50E1 ^ 0x500D] = 0x711B ^ 0x500D;
                openProgress._1.C[0xD45D ^ 0xD515] = 0xD514 ^ 0xD515;
                openProgress._1.C[0xED68 ^ 0xED80] = 0x89E ^ 0xED80;
                openProgress._1.C[0x1D63 ^ 0x1D98] = 0x3249 ^ 0x1D98;
                openProgress._1.C[0xC82F ^ 0xC9AE] = 0xC9BA ^ 0xC9AE;
                openProgress._1.C[0x9904 ^ 0x9887] = 0x1586 ^ 0x9887;
                openProgress._1.C[0x68EA ^ 0x68F0] = 0x68F1 ^ 0x68F0;
                openProgress._1.C[0x10456 ^ 0x1045C] = 0x1047A ^ 0x1045C;
                openProgress._1.C[0xDD60 ^ 0xDD1D] = 0x3F78 ^ 0xDD1D;
                openProgress._1.C[0x32E8 ^ 0x329E] = 0xE1C6 ^ 0x329E;
                openProgress._1.C[0xB874 ^ 0xB81E] = 0xB81F ^ 0xB81E;
                openProgress._1.C[0xD288 ^ 0xD3F7] = 0xD3F4 ^ 0xD3F7;
                openProgress._1.C[0x93A3 ^ 0x92C4] = 0xFFFF6D63 ^ 0x92C4;
                openProgress._1.C[0x8DA8 ^ 0x8CC5] = 0x8CC5 ^ 0x8CC5;
                openProgress._1.C[0xC50E ^ 0xC5DB] = 0xC668 ^ 0xC5DB;
                openProgress._1.C[0xCA00 ^ 0xCAB9] = 0x265F ^ 0xCAB9;
                openProgress._1.C[0x962B ^ 0x9608] = 0x546C ^ 0x9608;
                openProgress._1.C[0xBEC4 ^ 0xBE60] = 0x76C3 ^ 0xBE60;
                openProgress._1.C[0x5D04 ^ 0x5C74] = 0x42A4 ^ 0x5C74;
                openProgress._1.C[0x5FDF ^ 0x5F16] = 0x152C5 ^ 0x5F16;
                openProgress._1.C[0x8D0B ^ 0x8D25] = 0x9F18 ^ 0x8D25;
                openProgress._1.C[0x5F88 ^ 0x5F89] = 0xFFFFA027 ^ 0x5F89;
                openProgress._1.C[0x20B8 ^ 0x20CF] = 0xF397 ^ 0x20CF;
                openProgress._1.C[0xF133 ^ 0xF04E] = 0xF05E ^ 0xF04E;
                openProgress._1.C[0x50C9 ^ 0x50CA] = 0x5089 ^ 0x50CA;
                openProgress._1.C[0x9C0F ^ 0x9D28] = 0x19C74 ^ 0x9D28;
                openProgress._1.C[0xB882 ^ 0xB9AA] = 0x1B8FE ^ 0xB9AA;
                openProgress._1.C[0x60CE ^ 0x61A1] = 0xEAC1 ^ 0x61A1;
                openProgress._1.C[0x1718 ^ 0x1624] = 0xF7C6 ^ 0x1624;
                openProgress._1.C[0x6EFD ^ 0x6FA9] = 0x6FA2 ^ 0x6FA9;
                openProgress._1.C[0x5321 ^ 0x533D] = 0x533F ^ 0x533D;
                openProgress._1.C[0x9FF8 ^ 0x9FCE] = 0x9F95 ^ 0x9FCE;
                openProgress._1.C[0xBA14 ^ 0xBA1F] = 0xBA42 ^ 0xBA1F;
                openProgress._1.C[0xCBD7 ^ 0xCAF5] = 0x1C12B ^ 0xCAF5;
                openProgress._1.C[0x51CB ^ 0x50AF] = 0x50A7 ^ 0x50AF;
                openProgress._1.C[0x4F65 ^ 0x4FBC] = 0x9B54 ^ 0x4FBC;
                openProgress._1.C[0x129F ^ 0x12B3] = 0xFCA8 ^ 0x12B3;
                openProgress._1.C[0x2A3 ^ 0x294] = 0x2C6 ^ 0x294;
                openProgress._1.C[0xDABA ^ 0xDADE] = 0xFFFF2506 ^ 0xDADE;
                openProgress._1.C[0x7CBF ^ 0x7C83] = 0xFFFF837D ^ 0x7C83;
                openProgress._1.C[0x383D ^ 0x38F2] = 0x3F40 ^ 0x38F2;
                openProgress._1.C[0x6383 ^ 0x631A] = 0xA872 ^ 0x631A;
                openProgress._1.C[0x10288 ^ 0x102EB] = 0x102C4 ^ 0x102EB;
                openProgress._1.C[0x6569 ^ 0x6472] = 0xFFFF8A88 ^ 0x6472;
                openProgress._1.C[0x76D3 ^ 0x77DC] = 0xFB6E ^ 0x77DC;
                openProgress._1.C[0x1E0D ^ 0x1E56] = 0xFFFFE1F5 ^ 0x1E56;
                openProgress._1.C[0x6821 ^ 0x6966] = 0xF2DB ^ 0x6966;
                openProgress._1.C[0x4C8C ^ 0x4CED] = 0x4CBB ^ 0x4CED;
                openProgress._1.C[0xC039 ^ 0xC14B] = 0xD43A ^ 0xC14B;
                openProgress._1.C[0x10034 ^ 0x10075] = 0x10024 ^ 0x10075;
                openProgress._1.C[0x4EC9 ^ 0x4FE2] = 0xFFFEB9E9 ^ 0x4FE2;
                openProgress._1.C[0xF115 ^ 0xF1FC] = 0xD0E6 ^ 0xF1FC;
                openProgress._1.C[0xF2C2 ^ 0xF392] = 0xF396 ^ 0xF392;
                openProgress._1.C[0x145E ^ 0x14DB] = 0xC8B6 ^ 0x14DB;
                openProgress._1.C[0x70D0 ^ 0x7181] = 0xFFFF8E06 ^ 0x7181;
                openProgress._1.C[0xA733 ^ 0xA640] = 0xB448 ^ 0xA640;
                openProgress._1.C[0x2DA6 ^ 0x2CEA] = 0x2CE4 ^ 0x2CEA;
                openProgress._1.C[0xA834 ^ 0xA97D] = 0xA96D ^ 0xA97D;
                openProgress._1.C[0xF37 ^ 0xE22] = 0x10B67 ^ 0xE22;
                openProgress._1.C[0xD7BD ^ 0xD687] = 0xD695 ^ 0xD687;
                openProgress._1.C[0x4624 ^ 0x4767] = 0xA176 ^ 0x4767;
                openProgress._1.C[0x7D95 ^ 0x7DAE] = 0x7DFF ^ 0x7DAE;
                openProgress._1.C[0x6F9B ^ 0x6E89] = 0x16E03 ^ 0x6E89;
                openProgress._1.C[0x3071 ^ 0x30C6] = 0xF093 ^ 0x30C6;
                openProgress._1.C[0xE60D ^ 0xE755] = 0xE758 ^ 0xE755;
                openProgress._1.C[0xEB17 ^ 0xEB82] = 0x1EB1F ^ 0xEB82;
                openProgress._1.C[0x6E7E ^ 0x6E30] = 0x6E1C ^ 0x6E30;
                openProgress._1.C[0x69D5 ^ 0x69DD] = 0x6992 ^ 0x69DD;
                openProgress._1.C[0xD841 ^ 0xD922] = 0xD94A ^ 0xD922;
                openProgress._1.C[0x85F4 ^ 0x84F0] = 0x175A ^ 0x84F0;
                openProgress._1.C[0xDD6A ^ 0xDD8C] = 0x3892 ^ 0xDD8C;
                openProgress._1.C[0xC863 ^ 0xC80A] = 0xFFFF37AA ^ 0xC80A;
                openProgress._1.C[0x8A6C ^ 0x8B37] = 0xFFFF74F4 ^ 0x8B37;
                openProgress._1.C[0x4CA ^ 0x408] = 0x107AE ^ 0x408;
                openProgress._1.C[0x96FF ^ 0x9632] = 0x91CD ^ 0x9632;
                openProgress._1.C[0x6BC2 ^ 0x6BFF] = 0x6B9F ^ 0x6BFF;
                openProgress._1.C[0x9463 ^ 0x94A4] = 0xE28B ^ 0x94A4;
                openProgress._1.C[0x53DE ^ 0x53D0] = 0x538B ^ 0x53D0;
                openProgress._1.C[0xC4CA ^ 0xC5D2] = 0x1C097 ^ 0xC5D2;
                openProgress._1.C[0xBABF ^ 0xBA05] = 0x56EA ^ 0xBA05;
                openProgress._1.C[0x6ABF ^ 0x6BDE] = 0x6B86 ^ 0x6BDE;
                openProgress._1.C[0x9C78 ^ 0x9D14] = 0x9D16 ^ 0x9D14;
                openProgress._1.C[0xD025 ^ 0xD147] = 0xD144 ^ 0xD147;
                openProgress._1.C[0x942D ^ 0x9570] = 0x9501 ^ 0x9570;
                openProgress._1.C[0x10924 ^ 0x1093A] = 0x1093A ^ 0x1093A;
                openProgress._1.C[0x1333 ^ 0x13A9] = 0xD22C ^ 0x13A9;
                openProgress._1.C[0x3A89 ^ 0x3A01] = 0x42EE ^ 0x3A01;
                openProgress._1.C[0xB0CF ^ 0xB0F1] = 0xB0AF ^ 0xB0F1;
                openProgress._1.C[0x5551 ^ 0x55E7] = 0x95CB ^ 0x55E7;
                openProgress._1.C[0x8FEA ^ 0x8F00] = 0xAE16 ^ 0x8F00;
                openProgress._1.C[0xEC7 ^ 0xE04] = 0x10DCE ^ 0xE04;
                openProgress._1.C[0xB6FC ^ 0xB6D4] = 0xFDA3 ^ 0xB6D4;
                openProgress._1.C[0xBF3B ^ 0xBFBB] = 0xFFFF8E56 ^ 0xBFBB;
                openProgress._1.C[0x335B ^ 0x33BA] = 0x74E3 ^ 0x33BA;
                openProgress._1.C[0x3D6B ^ 0x3DC8] = 0xF546 ^ 0x3DC8;
                openProgress._1.C[0xCCC2 ^ 0xCD47] = 0xA22C ^ 0xCD47;
                openProgress._1.C[0x3918 ^ 0x387E] = 0x387E ^ 0x387E;
                openProgress._1.C[0x7FEA ^ 0x7FE7] = 0x7FCF ^ 0x7FE7;
                openProgress._1.C[0x5260 ^ 0x5284] = 0x15D7 ^ 0x5284;
                openProgress._1.C[0x1080F ^ 0x1091B] = 0x991 ^ 0x1091B;
                openProgress._1.C[0xDCEB ^ 0xDDDB] = 0xC74B ^ 0xDDDB;
                openProgress._1.C[0x2680 ^ 0x2706] = 0xDA6B ^ 0x2706;
                openProgress._1.C[0x1050D ^ 0x105AB] = 0x120E0 ^ 0x105AB;
                openProgress._1.C[0xE86D ^ 0xE955] = 0xE954 ^ 0xE955;
                openProgress._1.C[0x876D ^ 0x8626] = 0x862C ^ 0x8626;
                openProgress._1.C[0x4A5C ^ 0x4B09] = 0xFFFFB4B8 ^ 0x4B09;
                openProgress._1.C[0x3C8C ^ 0x3C69] = 0xD96D ^ 0x3C69;
                openProgress._1.C[0x926F ^ 0x927D] = 0xFFFF6D18 ^ 0x927D;
                openProgress._1.C[0x9FE4 ^ 0x9EDD] = 0x9EDD ^ 0x9EDD;
                openProgress._1.C[0x4EAE ^ 0x4EE4] = 0xFFFFB119 ^ 0x4EE4;
                openProgress._1.C[0xF69B ^ 0xF7EE] = 0x98A4 ^ 0xF7EE;
                openProgress._1.C[0x7C3D ^ 0x7C58] = 0x7C5D ^ 0x7C58;
                openProgress._1.C[0x53C3 ^ 0x52A3] = 0x52A2 ^ 0x52A3;
                openProgress._1.C[0x8AE8 ^ 0x8BCD] = 0x18A9E ^ 0x8BCD;
                openProgress._1.C[0x790C ^ 0x79E2] = 0x8E09 ^ 0x79E2;
                openProgress._1.C[0x96A9 ^ 0x96F4] = 0xFFFF6932 ^ 0x96F4;
                openProgress._1.C[0x1E4C ^ 0x1E9C] = 0x196E ^ 0x1E9C;
                openProgress._1.C[0x5ACE ^ 0x5AFC] = 0xFFFFA533 ^ 0x5AFC;
                openProgress._1.C[0xDEB6 ^ 0xDEA2] = 0xFFFF2172 ^ 0xDEA2;
                openProgress._1.C[0x5940 ^ 0x5992] = 0x8587 ^ 0x5992;
                openProgress._1.C[0x7854 ^ 0x792E] = 0x9C1 ^ 0x792E;
                openProgress._1.C[0x9B5E ^ 0x9A6D] = 0x1827 ^ 0x9A6D;
                openProgress._1.C[0xACBF ^ 0xADA6] = 0xBCB3 ^ 0xADA6;
                openProgress._1.C[0x3E22 ^ 0x3E7A] = 0xFFFFC1BA ^ 0x3E7A;
                openProgress._1.C[0xD32E ^ 0xD345] = 0xD347 ^ 0xD345;
                openProgress._1.C[0xBDE2 ^ 0xBD00] = 0xFA53 ^ 0xBD00;
                openProgress._1.C[0xC3D5 ^ 0xC38F] = 0xC3E6 ^ 0xC38F;
                openProgress._1.C[0x7A8D ^ 0x7ACA] = 0x7AAC ^ 0x7ACA;
                openProgress._1.C[0xCC34 ^ 0xCD19] = 0xD791 ^ 0xCD19;
                openProgress._1.C[0xA748 ^ 0xA7CF] = 0xDF74 ^ 0xA7CF;
                openProgress._1.C[0xDC6C ^ 0xDC0B] = 0xDC21 ^ 0xDC0B;
                openProgress._1.C[0x6B24 ^ 0x6B98] = 0x8777 ^ 0x6B98;
                openProgress._1.C[0x15E9 ^ 0x1492] = 0x1490 ^ 0x1492;
                openProgress._1.C[0xA45A ^ 0xA554] = 0x299E ^ 0xA554;
                openProgress._1.C[0x4BD8 ^ 0x4AE6] = 0xE6A3 ^ 0x4AE6;
                openProgress._1.C[0x489 ^ 0x458] = 0xD85A ^ 0x458;
                openProgress._1.C[0x3702 ^ 0x3603] = 0xA5B2 ^ 0x3603;
                openProgress._1.C[0x5D4F ^ 0x5C72] = 0x3BD7 ^ 0x5C72;
                openProgress._1.C[0xB531 ^ 0xB5A3] = 0x1B532 ^ 0xB5A3;
                openProgress._1.C[0xB82E ^ 0xB927] = 0x23DE ^ 0xB927;
                openProgress._1.C[0x36EC ^ 0x36CB] = 0xBC21 ^ 0x36CB;
                openProgress._1.C[0x9EEB ^ 0x9E44] = 0x25C4 ^ 0x9E44;
                openProgress._1.C[0x88B ^ 0x8AB] = 0xC42B ^ 0x8AB;
                openProgress._1.C[0x10A4 ^ 0x11BE] = 0xB4 ^ 0x11BE;
                openProgress._1.C[0x92AF ^ 0x92FF] = 0x928B ^ 0x92FF;
                openProgress._1.C[0x84E2 ^ 0x8445] = 0xA10D ^ 0x8445;
                openProgress._1.C[0xB9C9 ^ 0xB940] = 0xC1FB ^ 0xB940;
                openProgress._1.C[0x5184 ^ 0x5170] = 0xEAC3 ^ 0x5170;
                openProgress._1.C[0x3B66 ^ 0x3BF5] = 0x13B68 ^ 0x3BF5;
                openProgress._1.C[0x913F ^ 0x9145] = 0x732A ^ 0x9145;
                openProgress._1.C[0xDAFF ^ 0xDA99] = 0xFFFF256A ^ 0xDA99;
                openProgress._1.C[0xFF7 ^ 0xED8] = 0x141D ^ 0xED8;
                openProgress._1.C[0x4174 ^ 0x401F] = 0x411F ^ 0x401F;
                openProgress._1.C[0xAB6D ^ 0xABA3] = 0xAC51 ^ 0xABA3;
                openProgress._1.C[0x16E4 ^ 0x17E9] = 0x9B2D ^ 0x17E9;
                openProgress._1.C[0x40DE ^ 0x404E] = 0x2125 ^ 0x404E;
                openProgress._1.C[0xC607 ^ 0xC723] = 0x1CCFD ^ 0xC723;
                openProgress._1.C[0xC05A ^ 0xC087] = 0x5FF0 ^ 0xC087;
                openProgress._1.C[0x5928 ^ 0x5872] = 0x587B ^ 0x5872;
                openProgress._1.C[0x302F ^ 0x30A0] = 0x51A7 ^ 0x30A0;
                openProgress._1.C[0x272F ^ 0x2786] = 0x2CE ^ 0x2786;
                openProgress._1.C[0xFB9E ^ 0xFAE8] = 0x3313 ^ 0xFAE8;
                openProgress._1.C[0x2A89 ^ 0x2B8B] = 0xB821 ^ 0x2B8B;
                openProgress._1.C[0xBFD6 ^ 0xBF2A] = 0x90C0 ^ 0xBF2A;
                openProgress._1.C[0x4B69 ^ 0x4BC1] = 0xFFFF9141 ^ 0x4BC1;
                openProgress._1.C[0x988F ^ 0x9989] = 0xED88 ^ 0x9989;
                openProgress._1.C[0x558E ^ 0x55FE] = 0xB62E ^ 0x55FE;
                openProgress._1.C[0xA61D ^ 0xA606] = 0xA606 ^ 0xA606;
                openProgress._1.C[0x5237 ^ 0x5273] = 0xFFFFADC7 ^ 0x5273;
                openProgress._1.C[0x104E1 ^ 0x104E4] = 0x10490 ^ 0x104E4;
                openProgress._1.C[0x257 ^ 0x2D9] = 0x63DC ^ 0x2D9;
                openProgress._1.C[0xF681 ^ 0xF61E] = 0x9825 ^ 0xF61E;
                openProgress._1.C[0x10AAC ^ 0x10AFD] = 0xFFFEF524 ^ 0x10AFD;
                openProgress._1.C[0xFF55 ^ 0xFFBA] = 0xFFFFF7E8 ^ 0xFFBA;
                openProgress._1.C[0x3CAA ^ 0x3C75] = 0xFFFF5CFB ^ 0x3C75;
                openProgress._1.C[0xC822 ^ 0xC800] = 0x2183 ^ 0xC800;
                openProgress._1.C[0x1EFC ^ 0x1EC9] = 0x1EAC ^ 0x1EC9;
                openProgress._1.C[0x64D3 ^ 0x6463] = 0xFFFF206B ^ 0x6463;
                openProgress._1.C[0x4FDB ^ 0x4EC7] = 0x5FCD ^ 0x4EC7;
                openProgress._1.C[0x7DD4 ^ 0x7DD4] = 0x7DDE ^ 0x7DD4;
                openProgress._1.C[0x10DBD ^ 0x10D5E] = 0xFFFEB5E7 ^ 0x10D5E;
                openProgress._1.C[0xB4C5 ^ 0xB4AA] = 0xB4AA ^ 0xB4AA;
                openProgress._1.C[0xEF7E ^ 0xEFA6] = 0xEC04 ^ 0xEFA6;
                openProgress._1.C[0xAD92 ^ 0xACE6] = 0x8B8E ^ 0xACE6;
                openProgress._1.C[0x456C ^ 0x4429] = 0x439E ^ 0x4429;
                openProgress._1.C[0x361F ^ 0x36BF] = 0x58E8 ^ 0x36BF;
                openProgress._1.C[0x5564 ^ 0x5472] = 0x15137 ^ 0x5472;
                openProgress._1.C[0x93D1 ^ 0x93DE] = 0xFFFF6C28 ^ 0x93DE;
                openProgress._1.C[0xD364 ^ 0xD357] = 0xFFFF2CEC ^ 0xD357;
                openProgress._1.C[0x664C ^ 0x6669] = 0x78EE ^ 0x6669;
                openProgress._1.C[0x4FD8 ^ 0x4F67] = 0xFFFEB5E5 ^ 0x4F67;
                openProgress._1.C[0x6628 ^ 0x66AE] = 0x1E12 ^ 0x66AE;
                openProgress._1.C[0x8109 ^ 0x81BA] = 0x1894B ^ 0x81BA;
                openProgress._1.C[0x10C05 ^ 0x10D37] = 0x18F51 ^ 0x10D37;
                openProgress._1.C[0x9565 ^ 0x951E] = 0x777B ^ 0x951E;
                openProgress._1.C[0x1CCF ^ 0x1D4D] = 0xCF2C ^ 0x1D4D;
                openProgress._1.C[0x54D4 ^ 0x548B] = 0x54DB ^ 0x548B;
                openProgress._1.C[0xB11C ^ 0xB098] = 0x787B ^ 0xB098;
                openProgress._1.C[0xB7CF ^ 0xB728] = 0xFFFFADA6 ^ 0xB728;
                openProgress._1.C[0xE88A ^ 0xE8C5] = 0xFFFF1790 ^ 0xE8C5;
                openProgress._1.C[0x42AD ^ 0x4203] = 0xF986 ^ 0x4203;
                openProgress._1.C[0x6EB6 ^ 0x6E8E] = 0x6E8D ^ 0x6E8E;
                openProgress._1.C[0xB71B ^ 0xB61C] = 0xC275 ^ 0xB61C;
                openProgress._1.C[0x2FEC ^ 0x2F6F] = 0xF302 ^ 0x2F6F;
                openProgress._1.C[0xE23E ^ 0xE2FE] = 0x1E7B1 ^ 0xE2FE;
                openProgress._1.C[0xDC44 ^ 0xDD62] = 0x1DC36 ^ 0xDD62;
                openProgress._1.C[0x8CB9 ^ 0x8DD3] = 0x8DC3 ^ 0x8DD3;
                openProgress._1.C[0x6497 ^ 0x65FF] = 0x65F9 ^ 0x65FF;
                openProgress._1.C[0xE593 ^ 0xE4DE] = 0xE4BC ^ 0xE4DE;
                openProgress._1.C[0x215 ^ 0x2CF] = 0xD635 ^ 0x2CF;
                openProgress._1.C[0x66EF ^ 0x664E] = 0x875 ^ 0x664E;
                openProgress._1.C[0x395D ^ 0x39DF] = 0xE5BA ^ 0x39DF;
                openProgress._1.C[0x961D ^ 0x9761] = 0x9761 ^ 0x9761;
                openProgress._1.C[0xD7E9 ^ 0xD75C] = 0x177B ^ 0xD75C;
                openProgress._1.C[0x4805 ^ 0x4945] = 0x224E ^ 0x4945;
                openProgress._1.C[0x444C ^ 0x4463] = 0xA7FE ^ 0x4463;
                openProgress._1.C[0x1918 ^ 0x1905] = 0x1905 ^ 0x1905;
                openProgress._1.C[0xA287 ^ 0xA2AD] = 0xF9B4 ^ 0xA2AD;
                openProgress._1.C[0x1AB6 ^ 0x1BA8] = 0xE338 ^ 0x1BA8;
                openProgress._1.C[0x4501 ^ 0x4555] = 0xFFFFBA87 ^ 0x4555;
                openProgress._1.C[0x9F8B ^ 0x9F2E] = 0x57A0 ^ 0x9F2E;
                openProgress._1.C[0xF7AD ^ 0xF7ED] = 0xF7C9 ^ 0xF7ED;
                openProgress._1.C[0xF9A1 ^ 0xF9DD] = 0x1B9F ^ 0xF9DD;
                openProgress._1.C[0x6361 ^ 0x63F5] = 0xFFFE9CC1 ^ 0x63F5;
                openProgress._1.C[0x406B ^ 0x4168] = 0xFFFF2D0A ^ 0x4168;
                openProgress._1.C[0x5254 ^ 0x5310] = 0x5622 ^ 0x5310;
                openProgress._1.C[0xD92A ^ 0xD9E0] = 0x1D432 ^ 0xD9E0;
                openProgress._1.C[0x2E53 ^ 0x2E3E] = 0x2E3F ^ 0x2E3E;
                openProgress._1.C[0xEF93 ^ 0xEE8C] = 0xFFFFE9F4 ^ 0xEE8C;
                openProgress._1.C[0x3BDF ^ 0x3B49] = 0xF020 ^ 0x3B49;
                openProgress._1.C[0x42F4 ^ 0x42E4] = 0x4295 ^ 0x42E4;
                openProgress._1.C[0xFE7 ^ 0xE68] = 0xE6B ^ 0xE68;
                openProgress._1.C[0x3549 ^ 0x35BC] = 0xDFB ^ 0x35BC;
                openProgress._1.C[0x4231 ^ 0x42E6] = 0xFFFFBEF7 ^ 0x42E6;
                openProgress._1.C[0xFBF3 ^ 0xFB9B] = 0xFFFF0431 ^ 0xFB9B;
                openProgress._1.C[0x27DF ^ 0x27AD] = 0xC1D4 ^ 0x27AD;
                openProgress._1.C[0x3C7A ^ 0x3C24] = 0xFFFFC3AB ^ 0x3C24;
                openProgress._1.C[0x7E93 ^ 0x7FEA] = 0x1B15 ^ 0x7FEA;
                openProgress._1.C[0x72BC ^ 0x7208] = 0x17AD9 ^ 0x7208;
                openProgress._1.C[0x9635 ^ 0x96BF] = 0x828F ^ 0x96BF;
                openProgress._1.C[0xD098 ^ 0xD015] = 0xC42E ^ 0xD015;
                openProgress._1.C[0xF14D ^ 0xF063] = 0xEAF3 ^ 0xF063;
                openProgress._1.C[0x1414 ^ 0x152F] = 0xBAEF ^ 0x152F;
                openProgress._1.C[0x4149 ^ 0x41D8] = 0x20DF ^ 0x41D8;
                openProgress._1.C[0x4035 ^ 0x4135] = 0xDFBA ^ 0x4135;
                openProgress._1.C[0x6088 ^ 0x6068] = 0xFF03 ^ 0x6068;
                openProgress._1.C[0x151 ^ 0x1E0] = 0xBA60 ^ 0x1E0;
                openProgress._1.C[0xF5D5 ^ 0xF514] = 0x1F6B6 ^ 0xF514;
                openProgress._1.C[0xBF5A ^ 0xBEDD] = 0xF7EF ^ 0xBEDD;
                openProgress._1.C[0xD76E ^ 0xD7F3] = 0x1678 ^ 0xD7F3;
                openProgress._1.C[0xF640 ^ 0xF76A] = 0x1FEEC ^ 0xF76A;
                openProgress._1.C[0x10D4 ^ 0x11AA] = 0x11BA ^ 0x11AA;
                openProgress._1.C[0x7023 ^ 0x70E7] = 0x17341 ^ 0x70E7;
                openProgress._1.C[0xAF2A ^ 0xAF69] = 0xAF69 ^ 0xAF69;
                openProgress._1.C[0x881D ^ 0x885B] = 0x8863 ^ 0x885B;
                openProgress._1.C[0x64A9 ^ 0x64D7] = 0xAAF8 ^ 0x64D7;
                openProgress._1.C[0x96DE ^ 0x97EB] = 0x97EB ^ 0x97EB;
                openProgress._1.C[0x3918 ^ 0x382C] = 0xBA4A ^ 0x382C;
                openProgress._1.C[0x7086 ^ 0x7058] = 0xEF33 ^ 0x7058;
                openProgress._1.C[0x16AD ^ 0x162C] = 0xD80E ^ 0x162C;
                openProgress._1.C[0xCF50 ^ 0xCF12] = 0xCF5F ^ 0xCF12;
                openProgress._1.C[0x1AA6 ^ 0x1B2F] = 0x1E7A ^ 0x1B2F;
                openProgress._1.C[0x17A1 ^ 0x1750] = 0xACF6 ^ 0x1750;
                openProgress._1.C[0x7F77 ^ 0x7F9C] = 0xFFFFA13C ^ 0x7F9C;
                openProgress._1.C[0x504C ^ 0x517B] = 0x517B ^ 0x517B;
                openProgress._1.C[0x6540 ^ 0x6406] = 0x23FF ^ 0x6406;
                openProgress._1.C[0xC526 ^ 0xC5B8] = 0xAB85 ^ 0xC5B8;
                openProgress._1.C[0x2DA2 ^ 0x2D74] = 0x2ED6 ^ 0x2D74;
                openProgress._1.C[0x504C ^ 0x511E] = 0x5119 ^ 0x511E;
                openProgress._1.C[0x2143 ^ 0x213A] = 0xF262 ^ 0x213A;
                openProgress._1.C[0x10A26 ^ 0x10BAC] = 0x11599 ^ 0x10BAC;
                openProgress._1.C[0xDDEB ^ 0xDD2D] = 0xAB38 ^ 0xDD2D;
                openProgress._1.C[0x3206 ^ 0x32F6] = 0xC51D ^ 0x32F6;
                openProgress._1.C[0x15F3 ^ 0x15A5] = 0x1580 ^ 0x15A5;
                openProgress._1.C[0x8AC4 ^ 0x8AD2] = 0x8A93 ^ 0x8AD2;
                openProgress._1.C[0x10302 ^ 0x1030E] = 0x1033B ^ 0x1030E;
                openProgress._1.C[0xD097 ^ 0xD06F] = 0xE831 ^ 0xD06F;
                openProgress._1.C[0xD631 ^ 0xD6FD] = 0x1DB2F ^ 0xD6FD;
                openProgress._1.C[0x895F ^ 0x89E4] = 0xFFFF9AF9 ^ 0x89E4;
                openProgress._1.C[0x8242 ^ 0x82DA] = 0x4998 ^ 0x82DA;
                openProgress._1.C[0xEF97 ^ 0xEECE] = 0xFFFF113B ^ 0xEECE;
                openProgress._1.C[0x1001A ^ 0x1007A] = 0xFFFEFF85 ^ 0x1007A;
                openProgress._1.C[0x609 ^ 0x6FE] = 0xFFFFC116 ^ 0x6FE;
                openProgress._1.C[0x505A ^ 0x5089] = 0x8CD2 ^ 0x5089;
                openProgress._1.C[0xC2FE ^ 0xC2E6] = 0xC2E5 ^ 0xC2E6;
                openProgress._1.C[0xADF2 ^ 0xACD3] = 0x1A719 ^ 0xACD3;
                openProgress._1.C[0x10626 ^ 0x10602] = 0x1FE24 ^ 0x10602;
                openProgress._1.C[0xCC7E ^ 0xCC4A] = 0xCC5C ^ 0xCC4A;
                openProgress._1.C[0xC755 ^ 0xC67C] = 0x1CFE9 ^ 0xC67C;
                openProgress._1.C[0x69FE ^ 0x68C8] = 0x68C8 ^ 0x68C8;
                openProgress._1.C[0x8BA ^ 0x883] = 0x8EC ^ 0x883;
                openProgress._1.C[0xA22A ^ 0xA239] = 0xFFFF5DA8 ^ 0xA239;
                openProgress._1.C[0x4D3F ^ 0x4D95] = 0x59E0 ^ 0x4D95;
            }
        });
    }

    private final void stopDragging() {
        int n2 = C[228];
        n2 ^= C[229];
        this.draggingPicker = n2 ^= C[230];
        int n3 = C[231];
        n3 += C[232];
        this.draggingHue = n3 += C[233];
        int n4 = C[234];
        n4 -= C[235];
        this.draggingAlpha = n4 ^= C[236];
    }

    private final boolean contains(Rect rect, int mouseX, int mouseY) {
        int n2;
        if ((float)mouseX >= rect.getX() && (float)mouseX <= rect.getX() + rect.getWidth() && (float)mouseY >= rect.getY() && (float)mouseY <= rect.getY() + rect.getHeight()) {
            int n3 = C[237];
            n3 += C[238];
            n2 = n3 ^= C[239];
        } else {
            int n4 = C[240];
            n4 += C[241];
            n2 = n4 ^= C[242];
        }
        return n2 != 0;
    }

    private final Color withUiAlpha(Color color, float uiAlpha) {
        long l2 = 4763198750719071491L;
        float f2 = RangesKt.coerceIn(uiAlpha, 0.0f, 1.0f);
        int n2 = C[243];
        n2 += C[244];
        n2 ^= C[245];
        int n3 = C[246];
        n3 += C[247];
        n3 ^= C[248];
        int n4 = C[249];
        n4 -= C[250];
        long l3 = l2;
        int n5 = C[252];
        n5 += C[253];
        l2 = l3 ^ ((long)RangesKt.coerceIn(MathKt.roundToInt((float)color.getAlpha() * f2), n2, n3) << (n4 -= C[251]) ^ l3) & -1L << (n5 -= C[254]);
        int n6 = C[255];
        n6 ^= C[256];
        return new Color(color.getRed(), color.getGreen(), color.getBlue(), (int)(l2 >>> (n6 ^= C[257])));
    }

    static {
        ColorSettingComponent.b();
        long l2 = 2956986389359755687L;
        long l3 = -5682353906614993000L;
        long l4 = -284942750478505500L;
        long l5 = 3921379421672641413L;
        long l6 = 6106125620623011905L;
        long l7 = -7390823141417193814L;
        long l8 = -2801749255588652794L;
        long l9 = -871002046700717030L;
        long l10 = 7933544320572341811L;
        long l11 = -441028656835179030L;
        long l12 = 3771409525902045036L;
        long l13 = 6434317340070117451L;
        long l14 = -3890349552679690960L;
        long l15 = 4396922623091128795L;
        int n2 = C[258];
        n2 ^= C[259];
        a = new Object[n2 -= C[260]];
        long l16 = l15;
        int n3 = C[261];
        n3 ^= C[262];
        l15 = l16 ^ (0L ^ l16) & -1L << (n3 -= C[263]);
        Object[] objectArray = new Object[C[264]];
        objectArray[ColorSettingComponent.C[265]] = A;
        objectArray[ColorSettingComponent.C[266]] = C[267];
        int n4 = C[268];
        Object object = ColorSettingComponent.A()[C[269]];
        if (object == null) {
            char[] cArray = "\ube23\ube2d\ube19\ube4c\ube3e\ube3a\ube08\ube29\ube26\ube25\ube15\ube1c\ube3c\ube3b\ube40\ubdf7\ube12\ube4d\ube18\ube18\ube09\ube32\ube3d\ube16\ube32\ube05\ube1b\ube2a\ube1e\ube36\ube4d\ube08\ube35\ube18\ube3d\ube02\ube14\ube20\ube12\ube20\ube1a\ubdf8\ube26\ube3a\ube41\ube08\ube03\ube2d\ube41\ubdf3\ubdff\ube06\ube1c\ube19\ube39\ube3f\ubdf4\ube07\ube40\ube35\ube39\ube4c\ube4c\ube1a\ube05\ube33\ube3d\ube3b\ube1b\ube1d\ube0d\ube37\ube1b\ube20\ubdf7\ube08\ube09\ubdfb\ube09\ube38\ube17\ube4d\ube40\ubdf8\ubdff\ube4a\ube19\ube08\ubdf9\ube0d\ube22\ube26\ube07\ubdff\ubdff\ube41\ube27\ube21\ube29\ube4d\ubdfb\ube40\ubdf9\ube32\ube14\ube06\ube03\ube4a\ube09\ube1a\ube3d\ube0d\ube1f\ube36\ube07\ube3a\ube21\ube3b\ube38\ube14\ube36\ube25\ube23\ube35\ube02\ube18\ube19\ube36\ubdf8\ube1b\ube06\ubdf4\ube28\ube33\ubdf8\ube08\ube1a\ube08\ubdf8\ube1c\ube23\ube34\ubdff\ube07\ube06\ube4a\ube16\ube16\ube19\ube15\ube11\ube11".toCharArray();
            for (int i2 = C[270]; i2 < C[271]; ++i2) {
                int n5 = cArray[i2];
                n5 += C[272];
                n5 -= C[273];
                n5 -= C[274];
                n5 += C[275];
                n5 += C[276];
                n5 -= C[277];
                n5 ^= C[278];
                n5 += C[279];
                n5 += C[280];
                n5 -= C[281];
                n5 += C[282];
                cArray[i2] = (char)(n5 += C[283]);
            }
            object = ColorSettingComponent.A()[ColorSettingComponent.C[284]] = new String(cArray);
        }
        objectArray[n4] = (String)object;
        char[] cArray = ((String)ColorSettingComponent.a(objectArray)).toCharArray();
        long l17 = l6;
        int n6 = C[285];
        n6 += C[286];
        l6 = l17 ^ (0x5500000000L ^ l17) & -1L << (n6 += C[287]);
        long l18 = l13;
        int n7 = C[288];
        n7 ^= C[289];
        l13 = l18 ^ (0L ^ l18) & -1L >>> (n7 += C[290]);
        while (true) {
            int n8 = C[291];
            n8 -= C[292];
            if ((int)l13 >= (int)(l6 >>> (n8 += C[293]))) break;
            int n9 = (int)l13;
            long l19 = l13;
            int n10 = C[294];
            n10 ^= C[295];
            int n11 = C[297];
            n11 -= C[298];
            l13 = l19 ^ (l19 ^ l19 + (long)(n10 += C[296])) & -1L >>> (n11 ^= C[299]);
            long l20 = l9;
            int n12 = C[300];
            n12 += C[301];
            l9 = l20 ^ ((long)cArray[n9] ^ l20) & -1L >>> (n12 ^= C[302]);
            int n13 = (int)l13;
            long l21 = l13;
            int n14 = C[303];
            n14 -= C[304];
            int n15 = C[306];
            n15 ^= C[307];
            l13 = l21 ^ (l21 ^ l21 + (long)(n14 += C[305])) & -1L >>> (n15 -= C[308]);
            int n16 = C[309];
            n16 ^= C[310];
            long l22 = l10;
            int n17 = C[312];
            n17 += C[313];
            l10 = l22 ^ ((long)cArray[n13] << (n16 ^= C[311]) ^ l22) & -1L << (n17 += C[314]);
            int n18 = C[315];
            n18 += C[316];
            n18 ^= C[317];
            int n19 = C[318];
            n19 += C[319];
            long l23 = l12;
            int n20 = C[321];
            n20 += C[322];
            l12 = l23 ^ ((long)((int)l9 << n18 | (int)(l10 >>> (n19 ^= C[320]))) ^ l23) & -1L >>> (n20 += C[323]);
            char[] cArray2 = new char[(int)l12];
            long l24 = l14;
            int n21 = C[324];
            n21 ^= C[325];
            l14 = l24 ^ (0L ^ l24) & -1L << (n21 ^= C[326]);
            while (true) {
                int n22 = C[327];
                n22 += C[328];
                if ((int)(l14 >>> (n22 += C[329])) >= (int)l12) break;
                int n23 = C[330];
                n23 += C[331];
                int n24 = C[333];
                n24 ^= C[334];
                cArray2[(int)(l14 >>> (n23 += ColorSettingComponent.C[332]))] = cArray[(int)l13 + (int)(l14 >>> (n24 -= C[335]))];
                l14 += 0x100000000L;
            }
            int n25 = C[336];
            n25 -= C[337];
            int n26 = (int)(l15 >>> (n25 ^= C[338]));
            l15 += 0x100000000L;
            ColorSettingComponent.a[n26] = new String(cArray2);
            long l25 = l13;
            int n27 = C[339];
            n27 += C[340];
            l13 = l25 ^ ((long)((int)l13 + (int)l12) ^ l25) & -1L >>> (n27 ^= C[341]);
        }
        Companion = new Companion(null);
    }

    public static Object a(Object[] object) {
        Object object2;
        int n2 = (Integer)object[C[342]];
        String string = (String)object[C[343]];
        object = object[C[344]];
        Object[] objectArray = B;
        if (B == null) {
            objectArray = B = new Object[C[345]];
        }
        if ((object2 = objectArray[n2]) == null) {
            Object object3 = object;
            if (object == null) {
                Object[] objectArray2 = new Object[C[346]];
                A = objectArray2;
                object3 = objectArray2;
                byte[] byArray = new byte[C[348] ^ C[349]];
                byArray[ColorSettingComponent.C[350] ^ ColorSettingComponent.C[351]] = C[352] ^ C[353];
                byArray[ColorSettingComponent.C[354] ^ ColorSettingComponent.C[355]] = C[356] ^ C[357];
                byArray[ColorSettingComponent.C[358] ^ ColorSettingComponent.C[359]] = C[360] ^ C[361];
                byArray[ColorSettingComponent.C[362] ^ ColorSettingComponent.C[363]] = C[364] ^ C[365];
                byArray[ColorSettingComponent.C[366] ^ ColorSettingComponent.C[367]] = C[368] ^ C[369];
                byArray[ColorSettingComponent.C[370] ^ ColorSettingComponent.C[371]] = C[372] ^ C[373];
                byArray[ColorSettingComponent.C[374] ^ ColorSettingComponent.C[375]] = C[376] ^ C[377];
                byArray[ColorSettingComponent.C[378] ^ ColorSettingComponent.C[379]] = C[380] ^ C[381];
                byArray[ColorSettingComponent.C[382] ^ ColorSettingComponent.C[383]] = C[384] ^ C[385];
                byArray[ColorSettingComponent.C[386] ^ ColorSettingComponent.C[387]] = C[388] ^ C[389];
                byArray[ColorSettingComponent.C[390] ^ ColorSettingComponent.C[391]] = C[392] ^ C[393];
                byArray[ColorSettingComponent.C[394] ^ ColorSettingComponent.C[395]] = C[396] ^ C[397];
                byArray[ColorSettingComponent.C[398] ^ ColorSettingComponent.C[399]] = 0xFFFF6482 ^ 0x9B03;
                byArray[0x48D ^ 0x487] = 0x4B3 ^ 0x487;
                byArray[0x6B85 ^ 0x6B8A] = 0x6BB2 ^ 0x6B8A;
                byArray[0x387 ^ 0x386] = 0x3B2 ^ 0x386;
                objectArray2[ColorSettingComponent.C[347]] = byArray;
            }
            byte[] byArray = (byte[])object3[0];
            if (b == null) {
                byte[] byArray2 = new byte[0x64AB ^ 0x648B];
                byArray2[0x4D4D ^ 0x4D4C] = 0xFFFFB2B0 ^ 0x4D4C;
                byArray2[0xFE2F ^ 0xFE36] = 0xFFFF01E1 ^ 0xFE36;
                byArray2[0x859E ^ 0x858B] = 0xFFFF7A4A ^ 0x858B;
                byArray2[0xBA37 ^ 0xBA28] = 0xBA21 ^ 0xBA28;
                byArray2[0x10DB0 ^ 0x10DAE] = 0xFFFEF248 ^ 0x10DAE;
                byArray2[0xEADE ^ 0xEADC] = 0xFFFF155A ^ 0xEADC;
                byArray2[0xF575 ^ 0xF562] = 0xFFFF0AD8 ^ 0xF562;
                byArray2[0x101B7 ^ 0x101A7] = 0x1018F ^ 0x101A7;
                byArray2[0x10C2F ^ 0x10C2F] = 0xFFFEF3AC ^ 0x10C2F;
                byArray2[0xA2B4 ^ 0xA2BD] = 0xA287 ^ 0xA2BD;
                byArray2[0x2246 ^ 0x224B] = 0x224F ^ 0x224B;
                byArray2[0x99C7 ^ 0x99C0] = 0xFFFF667C ^ 0x99C0;
                byArray2[0xE4C6 ^ 0xE4CD] = 0xFFFF1B61 ^ 0xE4CD;
                byArray2[0x4F12 ^ 0x4F08] = 0xFFFFB0DC ^ 0x4F08;
                byArray2[0xC8C8 ^ 0xC8D4] = 0xC8BF ^ 0xC8D4;
                byArray2[0x10651 ^ 0x1064C] = 0xFFFEF9A3 ^ 0x1064C;
                byArray2[0x2B15 ^ 0x2B0D] = 0xFFFFD4FA ^ 0x2B0D;
                byArray2[0x7938 ^ 0x7929] = 0x7959 ^ 0x7929;
                byArray2[0xE937 ^ 0xE93F] = 0xFFFF16F9 ^ 0xE93F;
                byArray2[0xED5E ^ 0xED58] = 0xED53 ^ 0xED58;
                byArray2[0x96F5 ^ 0x96E6] = 0x96DB ^ 0x96E6;
                byArray2[0xF864 ^ 0xF861] = 0xFFFF07E1 ^ 0xF861;
                byArray2[0x743 ^ 0x747] = 0x723 ^ 0x747;
                byArray2[0x2A8C ^ 0x2A83] = 0x2AF7 ^ 0x2A83;
                byArray2[0x782C ^ 0x783A] = 0x7830 ^ 0x783A;
                byArray2[0xE1E3 ^ 0xE1E9] = 0xE1EB ^ 0xE1E9;
                byArray2[0x10917 ^ 0x10905] = 0xFFFEF697 ^ 0x10905;
                byArray2[0xDC2 ^ 0xDD9] = 0xD97 ^ 0xDD9;
                byArray2[0x4C77 ^ 0x4C63] = 0xFFFFB3C0 ^ 0x4C63;
                byArray2[0x8461 ^ 0x846F] = 0xFFFF7B98 ^ 0x846F;
                byArray2[0x7452 ^ 0x7451] = 0x7478 ^ 0x7451;
                byArray2[0x980B ^ 0x9807] = 0xFFFF6789 ^ 0x9807;
                byte[] byArray3 = new byte[byArray.length + byArray2.length];
                System.arraycopy(byArray, 0, byArray3, 0, byArray.length);
                System.arraycopy(byArray2, 0, byArray3, byArray.length, byArray2.length);
                Object object4 = ColorSettingComponent.A()[1];
                if (object4 == null) {
                    char[] cArray = "\uf413\uf405\uf3d8\uf40f\uf411\uf3f5\ufa5c\ufa6e\ufa3f\ufa6b\uf40b\ufa3a\ufa66\ufa70\ufa60\uf40b\uf406\uf3f6".toCharArray();
                    for (int i2 = 0; i2 < 18; ++i2) {
                        int n3 = cArray[i2];
                        n3 += 51136;
                        n3 -= 5875;
                        n3 += 46244;
                        n3 -= 61606;
                        n3 ^= 0x6F96;
                        n3 ^= 0xC88;
                        n3 -= 22202;
                        n3 ^= 0x833B;
                        n3 -= 34830;
                        cArray[i2] = (char)(n3 -= 44511);
                    }
                    object4 = ColorSettingComponent.A()[1] = new String(cArray);
                }
                SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance((String)object4);
                byte[] byArray4 = new byte[16];
                byArray4[4] = -13;
                byArray4[11] = -6;
                byArray4[9] = -25;
                byArray4[3] = 102;
                byArray4[14] = -127;
                byArray4[8] = 81;
                byArray4[13] = 75;
                byArray4[5] = 0;
                byArray4[7] = 80;
                byArray4[12] = -10;
                byArray4[2] = 74;
                byArray4[6] = -92;
                byArray4[15] = -68;
                byArray4[10] = -25;
                byArray4[1] = 109;
                byArray4[0] = 22;
                PBEKeySpec pBEKeySpec = new PBEKeySpec(new String(byArray3, StandardCharsets.UTF_8).toCharArray(), byArray4, 25, 256);
                byte[] byArray5 = secretKeyFactory.generateSecret(pBEKeySpec).getEncoded();
                Object object5 = ColorSettingComponent.A()[2];
                if (object5 == null) {
                    char[] cArray = "\ucd42\ucf9e\ucfb4".toCharArray();
                    for (int i3 = 0; i3 < 3; ++i3) {
                        int n4 = cArray[i3];
                        n4 -= 45185;
                        n4 ^= 0xE2C3;
                        n4 -= 57637;
                        n4 -= 12518;
                        n4 -= 15366;
                        n4 += 10253;
                        n4 -= 55470;
                        n4 ^= 0xC411;
                        n4 += 55285;
                        n4 += 3414;
                        n4 -= 22999;
                        n4 ^= 0x3797;
                        cArray[i3] = (char)(n4 += 3871);
                    }
                    object5 = ColorSettingComponent.A()[2] = new String(cArray);
                }
                b = new SecretKeySpec(byArray5, (String)object5);
            }
            byte[] byArray6 = Base64.getDecoder().decode(string);
            byte[] byArray7 = Arrays.copyOfRange(byArray6, 0, 16);
            byte[] byArray8 = Arrays.copyOfRange(byArray6, 16, byArray6.length);
            Object object6 = ColorSettingComponent.A()[3];
            if (object6 == null) {
                char[] cArray = "\u4c07\u4c0b\u4c35\u4be1\u4c05\u4c08\u4c05\u4be1\u4c02\u4bfd\u4c05\u4c35\u4c1b\u4c02\u4c27\u4c26\u4c26\u4c1f\u4c24\u4c29".toCharArray();
                for (int i4 = 0; i4 < 20; ++i4) {
                    int n5 = cArray[i4];
                    n5 -= 54177;
                    n5 += 4129;
                    n5 -= 56167;
                    n5 += 31562;
                    n5 ^= 0x4FEB;
                    n5 += 6448;
                    n5 ^= 0x7F71;
                    n5 -= 41142;
                    n5 -= 13432;
                    n5 += 28761;
                    n5 += 30746;
                    n5 += 23228;
                    n5 -= 27807;
                    cArray[i4] = (char)(n5 += 65311);
                }
                object6 = ColorSettingComponent.A()[3] = new String(cArray);
            }
            Cipher cipher = Cipher.getInstance((String)object6);
            cipher.init(2, (Key)((SecretKey)b), new IvParameterSpec(byArray7));
            byte[] byArray9 = cipher.doFinal(byArray8);
            object2 = new String(byArray9, StandardCharsets.UTF_8);
        }
        return object2;
    }

    private static Object[] A() {
        Object[] objectArray = c;
        if (c == null) {
            c = new Object[4];
            objectArray = c;
        }
        return objectArray;
    }

    public static void b() {
        C = new int[0x8142 ^ 0x80D2];
        ColorSettingComponent.C[0xDB86 ^ 0xDA8C] = 0xDA8D ^ 0xDA8C;
        ColorSettingComponent.C[0xE473 ^ 0xE403] = 0xFFFF1BCB ^ 0xE403;
        ColorSettingComponent.C[0x88D1 ^ 0x8863] = 0x8867 ^ 0x8863;
        ColorSettingComponent.C[0x2198 ^ 0x208F] = 0x4165 ^ 0x208F;
        ColorSettingComponent.C[0xC8C8 ^ 0xC8D8] = 0xC8FA ^ 0xC8D8;
        ColorSettingComponent.C[0x3896 ^ 0x39C4] = 0xFFFFC676 ^ 0x39C4;
        ColorSettingComponent.C[0x5D39 ^ 0x5D43] = 0xFFFFA2F0 ^ 0x5D43;
        ColorSettingComponent.C[0x289B ^ 0x29B0] = 0xFFFFD661 ^ 0x29B0;
        ColorSettingComponent.C[0x7A4D ^ 0x7AC2] = 0x7A9A ^ 0x7AC2;
        ColorSettingComponent.C[0x96A3 ^ 0x9671] = 0x9666 ^ 0x9671;
        ColorSettingComponent.C[0x3BF ^ 0x3C9] = 0xFFFFFC00 ^ 0x3C9;
        ColorSettingComponent.C[0x8AD0 ^ 0x8A1B] = 0x8A69 ^ 0x8A1B;
        ColorSettingComponent.C[0x3BC9 ^ 0x3BC8] = 0x3BD1 ^ 0x3BC8;
        ColorSettingComponent.C[0x65A9 ^ 0x64BD] = 0x3265 ^ 0x64BD;
        ColorSettingComponent.C[0x8C5D ^ 0x8D2D] = 0xFFFF87A5 ^ 0x8D2D;
        ColorSettingComponent.C[0xFD79 ^ 0xFC70] = 0xFC70 ^ 0xFC70;
        ColorSettingComponent.C[0x3DC4 ^ 0x3C94] = 0xFFFFC3DD ^ 0x3C94;
        ColorSettingComponent.C[0x270C ^ 0x2795] = 0xFFFFD828 ^ 0x2795;
        ColorSettingComponent.C[0x1329 ^ 0x1205] = 0x1246 ^ 0x1205;
        ColorSettingComponent.C[0xA98A ^ 0xA8C0] = 0xA84D ^ 0xA8C0;
        ColorSettingComponent.C[0xB36F ^ 0xB3F8] = 0xB39E ^ 0xB3F8;
        ColorSettingComponent.C[0x4538 ^ 0x453B] = 0x4506 ^ 0x453B;
        ColorSettingComponent.C[0xE09D ^ 0xE086] = 0xE0A6 ^ 0xE086;
        ColorSettingComponent.C[0xECF6 ^ 0xEC87] = 0xFFFF1374 ^ 0xEC87;
        ColorSettingComponent.C[0x9BB8 ^ 0x9B7E] = 0x9A6A ^ 0x9B7E;
        ColorSettingComponent.C[0xAF73 ^ 0xAFA7] = 0xFFFF5013 ^ 0xAFA7;
        ColorSettingComponent.C[0xAA07 ^ 0xAB07] = 0xFFFF54CB ^ 0xAB07;
        ColorSettingComponent.C[0xBFF2 ^ 0xBE75] = 0xB2BC ^ 0xBE75;
        ColorSettingComponent.C[0xD7C7 ^ 0xD721] = 0xD739 ^ 0xD721;
        ColorSettingComponent.C[0x8EC6 ^ 0x8E8E] = 0x8E45 ^ 0x8E8E;
        ColorSettingComponent.C[0x9F99 ^ 0x9ECE] = 0x9ECC ^ 0x9ECE;
        ColorSettingComponent.C[0x56FC ^ 0x5781] = 0x1222 ^ 0x5781;
        ColorSettingComponent.C[0x4E7A ^ 0x4F6F] = 0x7B76 ^ 0x4F6F;
        ColorSettingComponent.C[0x2ACD ^ 0x2B8F] = 0xFFFFD458 ^ 0x2B8F;
        ColorSettingComponent.C[0x82CB ^ 0x83AF] = 0xF49 ^ 0x83AF;
        ColorSettingComponent.C[0x7D4C ^ 0x7D1D] = 0xFFFF8390 ^ 0x7D1D;
        ColorSettingComponent.C[0xD395 ^ 0xD382] = 0xD3CF ^ 0xD382;
        ColorSettingComponent.C[0x76 ^ 0x1F3] = 0x102E3 ^ 0x1F3;
        ColorSettingComponent.C[0xD34B ^ 0xD200] = 0xFFFF2DAE ^ 0xD200;
        ColorSettingComponent.C[0xF3A6 ^ 0xF2D9] = 0x4745 ^ 0xF2D9;
        ColorSettingComponent.C[0x5BA7 ^ 0x5B4E] = 0xFFFFA48B ^ 0x5B4E;
        ColorSettingComponent.C[0xD3E9 ^ 0xD3BE] = 0xD36C ^ 0xD3BE;
        ColorSettingComponent.C[0xC7F9 ^ 0xC7A4] = 0xC76B ^ 0xC7A4;
        ColorSettingComponent.C[0x3DA0 ^ 0x3CC2] = 0xB037 ^ 0x3CC2;
        ColorSettingComponent.C[0xD498 ^ 0xD5C3] = 0xD5C3 ^ 0xD5C3;
        ColorSettingComponent.C[0xE728 ^ 0xE606] = 0xE61B ^ 0xE606;
        ColorSettingComponent.C[0xE240 ^ 0xE266] = 0xE20A ^ 0xE266;
        ColorSettingComponent.C[0x2954 ^ 0x280D] = 0x280C ^ 0x280D;
        ColorSettingComponent.C[0x1A6F ^ 0x1A21] = 0x1A21 ^ 0x1A21;
        ColorSettingComponent.C[0x3930 ^ 0x39C7] = 0xFFFFC642 ^ 0x39C7;
        ColorSettingComponent.C[0xAA6C ^ 0xAA09] = 0xFFFF5599 ^ 0xAA09;
        ColorSettingComponent.C[0x7CFC ^ 0x7C3C] = 0xFFFF8396 ^ 0x7C3C;
        ColorSettingComponent.C[0xFF07 ^ 0xFE4A] = 0xFFFF0190 ^ 0xFE4A;
        ColorSettingComponent.C[0x861E ^ 0x8606] = 0x86DD ^ 0x8606;
        ColorSettingComponent.C[0x52A9 ^ 0x52DD] = 0xFFFFAD58 ^ 0x52DD;
        ColorSettingComponent.C[0xE112 ^ 0xE16C] = 0xE152 ^ 0xE16C;
        ColorSettingComponent.C[0x99FF ^ 0x98F0] = 0x9868 ^ 0x98F0;
        ColorSettingComponent.C[0x1001B ^ 0x10126] = 0xFFFEFEAC ^ 0x10126;
        ColorSettingComponent.C[0x759C ^ 0x755F] = 0xFFFF8AD3 ^ 0x755F;
        ColorSettingComponent.C[0x5A27 ^ 0x5BA4] = 0x158B4 ^ 0x5BA4;
        ColorSettingComponent.C[0xB461 ^ 0xB48B] = 0xFFFF4B7D ^ 0xB48B;
        ColorSettingComponent.C[0x100FB ^ 0x10033] = 0xFFFEFFD7 ^ 0x10033;
        ColorSettingComponent.C[0x991F ^ 0x9933] = 0xFFFF6693 ^ 0x9933;
        ColorSettingComponent.C[0xB13E ^ 0xB146] = 0xB6D9 ^ 0xB146;
        ColorSettingComponent.C[0xA566 ^ 0xA54F] = 0xFFFF5ABC ^ 0xA54F;
        ColorSettingComponent.C[0x3B45 ^ 0x3BAE] = 0xFFFFC432 ^ 0x3BAE;
        ColorSettingComponent.C[0x7246 ^ 0x7379] = 0xFFFF8CC4 ^ 0x7379;
        ColorSettingComponent.C[0x8B9E ^ 0x8A90] = 0x8A90 ^ 0x8A90;
        ColorSettingComponent.C[0x79CA ^ 0x78BB] = 0x8D8B ^ 0x78BB;
        ColorSettingComponent.C[0x6934 ^ 0x6956] = 0x6920 ^ 0x6956;
        ColorSettingComponent.C[0x2AA0 ^ 0x2A71] = 0xFFFFD5E8 ^ 0x2A71;
        ColorSettingComponent.C[0x1619 ^ 0x1641] = 0x1624 ^ 0x1641;
        ColorSettingComponent.C[0xAC1A ^ 0xAC06] = 0xAC76 ^ 0xAC06;
        ColorSettingComponent.C[0x5CF2 ^ 0x5C7B] = 0x5C41 ^ 0x5C7B;
        ColorSettingComponent.C[0x7BFB ^ 0x7B1E] = 0x7B4B ^ 0x7B1E;
        ColorSettingComponent.C[0x10694 ^ 0x10680] = 0x1069F ^ 0x10680;
        ColorSettingComponent.C[0xFBF0 ^ 0xFBD0] = 0xFBAE ^ 0xFBD0;
        ColorSettingComponent.C[0x3A69 ^ 0x3AD5] = 0x3AF8 ^ 0x3AD5;
        ColorSettingComponent.C[0x85D7 ^ 0x85BF] = 0x85F0 ^ 0x85BF;
        ColorSettingComponent.C[0x46F6 ^ 0x47B8] = 0x4791 ^ 0x47B8;
        ColorSettingComponent.C[0x84A7 ^ 0x8521] = 0x89ED ^ 0x8521;
        ColorSettingComponent.C[0xA476 ^ 0xA484] = 0xFFFF5B77 ^ 0xA484;
        ColorSettingComponent.C[0x1E85 ^ 0x1E82] = 0x1EB4 ^ 0x1E82;
        ColorSettingComponent.C[0x76B2 ^ 0x7651] = 0xFFFF89D3 ^ 0x7651;
        ColorSettingComponent.C[0x7B6D ^ 0x7B1A] = 0xFFFF849F ^ 0x7B1A;
        ColorSettingComponent.C[0x10C3 ^ 0x109F] = 0xFFFFEF7F ^ 0x109F;
        ColorSettingComponent.C[0x529F ^ 0x5271] = 0x5220 ^ 0x5271;
        ColorSettingComponent.C[0x9084 ^ 0x9019] = 0xFFFF6FA4 ^ 0x9019;
        ColorSettingComponent.C[0x9E2 ^ 0x923] = 0x96B ^ 0x923;
        ColorSettingComponent.C[0xAD53 ^ 0xAC29] = 0xE98E ^ 0xAC29;
        ColorSettingComponent.C[0x10200 ^ 0x10351] = 0xFFFEFCE6 ^ 0x10351;
        ColorSettingComponent.C[0xDFC4 ^ 0xDEAD] = 0xC7CC ^ 0xDEAD;
        ColorSettingComponent.C[0x4267 ^ 0x42CF] = 0x4375 ^ 0x42CF;
        ColorSettingComponent.C[0xE188 ^ 0xE165] = 0xE146 ^ 0xE165;
        ColorSettingComponent.C[0x93AF ^ 0x93F4] = 0x93B1 ^ 0x93F4;
        ColorSettingComponent.C[0xB7DA ^ 0xB6D1] = 0xB6D1 ^ 0xB6D1;
        ColorSettingComponent.C[0xF265 ^ 0xF29A] = 0xFFFF0D53 ^ 0xF29A;
        ColorSettingComponent.C[0xAB11 ^ 0xAA27] = 0xAA67 ^ 0xAA27;
        ColorSettingComponent.C[0xC64E ^ 0xC676] = 0xC63E ^ 0xC676;
        ColorSettingComponent.C[0xAEAE ^ 0xAFBF] = 0x876B ^ 0xAFBF;
        ColorSettingComponent.C[0x62A0 ^ 0x63A7] = 0x63CB ^ 0x63A7;
        ColorSettingComponent.C[0x366B ^ 0x36D8] = 0x36F1 ^ 0x36D8;
        ColorSettingComponent.C[0x9F56 ^ 0x9E0E] = 0x9E0E ^ 0x9E0E;
        ColorSettingComponent.C[0x1B7A ^ 0x1A27] = 0x78B4 ^ 0x1A27;
        ColorSettingComponent.C[0x698B ^ 0x69E0] = 0xFFFF9655 ^ 0x69E0;
        ColorSettingComponent.C[0xD8F ^ 0xCE8] = 0x1589 ^ 0xCE8;
        ColorSettingComponent.C[0x10687 ^ 0x107C3] = 0x107DC ^ 0x107C3;
        ColorSettingComponent.C[0x6AAD ^ 0x6BA9] = 0x6BAB ^ 0x6BA9;
        ColorSettingComponent.C[0x80AE ^ 0x809E] = 0xFFFF7F32 ^ 0x809E;
        ColorSettingComponent.C[0xAFA ^ 0xBCD] = 0xFFFFF439 ^ 0xBCD;
        ColorSettingComponent.C[0x97ED ^ 0x96CF] = 0xFFFF6919 ^ 0x96CF;
        ColorSettingComponent.C[0x937F ^ 0x932C] = 0x9373 ^ 0x932C;
        ColorSettingComponent.C[0xD696 ^ 0xD66F] = 0xD63F ^ 0xD66F;
        ColorSettingComponent.C[0xAF8F ^ 0xAF25] = 0xAF7D ^ 0xAF25;
        ColorSettingComponent.C[0x2C30 ^ 0x2DB1] = 0x982D ^ 0x2DB1;
        ColorSettingComponent.C[0xEC4 ^ 0xE1E] = 0xE20 ^ 0xE1E;
        ColorSettingComponent.C[0xC073 ^ 0xC0B7] = 0xFFFF3F49 ^ 0xC0B7;
        ColorSettingComponent.C[0x9BAB ^ 0x9AA8] = 0xFFFF6565 ^ 0x9AA8;
        ColorSettingComponent.C[0x100E4 ^ 0x101FA] = 0x101FB ^ 0x101FA;
        ColorSettingComponent.C[0xF210 ^ 0xF355] = 0xFFFF0CCD ^ 0xF355;
        ColorSettingComponent.C[0xFCE3 ^ 0xFCFC] = 0xFCAD ^ 0xFCFC;
        ColorSettingComponent.C[0xE884 ^ 0xE8D4] = 0xE8AF ^ 0xE8D4;
        ColorSettingComponent.C[0xD0EE ^ 0xD0CF] = 0xFFFF2F05 ^ 0xD0CF;
        ColorSettingComponent.C[0x7738 ^ 0x7798] = 0xFFFF882F ^ 0x7798;
        ColorSettingComponent.C[0xF277 ^ 0xF3F3] = 0x1F0A4 ^ 0xF3F3;
        ColorSettingComponent.C[0x41FA ^ 0x41FF] = 0x41D0 ^ 0x41FF;
        ColorSettingComponent.C[0x46B5 ^ 0x4645] = 0x4610 ^ 0x4645;
        ColorSettingComponent.C[0x10A39 ^ 0x10A1C] = 0xFFFEF599 ^ 0x10A1C;
        ColorSettingComponent.C[0xF7C ^ 0xE71] = 0xE71 ^ 0xE71;
        ColorSettingComponent.C[0x1008B ^ 0x101A2] = 0xFFFEFE5B ^ 0x101A2;
        ColorSettingComponent.C[0x2919 ^ 0x2965] = 0xFFFFD6BA ^ 0x2965;
        ColorSettingComponent.C[0x8D7B ^ 0x8C6D] = 0x7AE7 ^ 0x8C6D;
        ColorSettingComponent.C[0x4877 ^ 0x4937] = 0xFFFFB6DF ^ 0x4937;
        ColorSettingComponent.C[0x32A ^ 0x2AA] = 0xFFFF48F7 ^ 0x2AA;
        ColorSettingComponent.C[0xEA17 ^ 0xEA7B] = 0xEB1A ^ 0xEA7B;
        ColorSettingComponent.C[0x6BE9 ^ 0x6BD7] = 0x6B9D ^ 0x6BD7;
        ColorSettingComponent.C[0xC82A ^ 0xC840] = 0xC816 ^ 0xC840;
        ColorSettingComponent.C[0x88DE ^ 0x8825] = 0x8848 ^ 0x8825;
        ColorSettingComponent.C[0xBE72 ^ 0xBF7E] = 0xBF7C ^ 0xBF7E;
        ColorSettingComponent.C[0xB714 ^ 0xB791] = 0xFFFF4869 ^ 0xB791;
        ColorSettingComponent.C[0x762C ^ 0x7624] = 0xFFFF89A3 ^ 0x7624;
        ColorSettingComponent.C[0x917E ^ 0x9120] = 0xFFFF6E94 ^ 0x9120;
        ColorSettingComponent.C[0x747E ^ 0x7477] = 0x77DE ^ 0x7477;
        ColorSettingComponent.C[0x32B5 ^ 0x33AC] = 0x50A6 ^ 0x33AC;
        ColorSettingComponent.C[0x5780 ^ 0x5692] = 0xE1E7 ^ 0x5692;
        ColorSettingComponent.C[0x8011 ^ 0x819C] = 0x47EC ^ 0x819C;
        ColorSettingComponent.C[0x5DBD ^ 0x5D72] = 0x5D79 ^ 0x5D72;
        ColorSettingComponent.C[0xA3F3 ^ 0xA284] = 0x89FF ^ 0xA284;
        ColorSettingComponent.C[0xA71E ^ 0xA7D3] = 0xFFFF581E ^ 0xA7D3;
        ColorSettingComponent.C[0x71CB ^ 0x7135] = 0x716B ^ 0x7135;
        ColorSettingComponent.C[0x238F ^ 0x237C] = 0xFFFFDCFA ^ 0x237C;
        ColorSettingComponent.C[0x2F24 ^ 0x2F60] = 0x2F7C ^ 0x2F60;
        ColorSettingComponent.C[0x6390 ^ 0x62FA] = 0xED75 ^ 0x62FA;
        ColorSettingComponent.C[0x70CE ^ 0x7051] = 0x7384 ^ 0x7051;
        ColorSettingComponent.C[0x7D1D ^ 0x7C61] = 0xFFFFC636 ^ 0x7C61;
        ColorSettingComponent.C[0x109C8 ^ 0x10966] = 0xFFFEF6C0 ^ 0x10966;
        ColorSettingComponent.C[0x10267 ^ 0x1028F] = 0x102C9 ^ 0x1028F;
        ColorSettingComponent.C[0x1752 ^ 0x1719] = 0x1751 ^ 0x1719;
        ColorSettingComponent.C[0xA633 ^ 0xA698] = 0xA690 ^ 0xA698;
        ColorSettingComponent.C[0x849A ^ 0x85F5] = 0x70C5 ^ 0x85F5;
        ColorSettingComponent.C[0x2D0C ^ 0x2D53] = 0x2D2F ^ 0x2D53;
        ColorSettingComponent.C[0x68DB ^ 0x6981] = 0x6980 ^ 0x6981;
        ColorSettingComponent.C[0x1BBE ^ 0x1A31] = 0x8132 ^ 0x1A31;
        ColorSettingComponent.C[0x8F31 ^ 0x8FE6] = 0x8FAA ^ 0x8FE6;
        ColorSettingComponent.C[0x10519 ^ 0x1043E] = 0xFFFEFBF1 ^ 0x1043E;
        ColorSettingComponent.C[0x1E5 ^ 0x1CF] = 0xFFFFFE87 ^ 0x1CF;
        ColorSettingComponent.C[0xFE85 ^ 0xFFCD] = 0xFFFC ^ 0xFFCD;
        ColorSettingComponent.C[0xEC42 ^ 0xECD7] = 0xFFFF130E ^ 0xECD7;
        ColorSettingComponent.C[0x71F3 ^ 0x7090] = 0xFC62 ^ 0x7090;
        ColorSettingComponent.C[0x5F43 ^ 0x5FAF] = 0x5FF5 ^ 0x5FAF;
        ColorSettingComponent.C[0x219F ^ 0x20E1] = 0x9574 ^ 0x20E1;
        ColorSettingComponent.C[0x744E ^ 0x7536] = 0x5E62 ^ 0x7536;
        ColorSettingComponent.C[0xA54B ^ 0xA47A] = 0xFFFF5B99 ^ 0xA47A;
        ColorSettingComponent.C[0xD92F ^ 0xD81A] = 0xFFFF278E ^ 0xD81A;
        ColorSettingComponent.C[0x2504 ^ 0x25F2] = 0xFFFFDA7B ^ 0x25F2;
        ColorSettingComponent.C[0x55A9 ^ 0x54C5] = 0xFFFF24B0 ^ 0x54C5;
        ColorSettingComponent.C[0xA088 ^ 0xA01E] = 0xA029 ^ 0xA01E;
        ColorSettingComponent.C[0xDF1A ^ 0xDE24] = 0xDE2F ^ 0xDE24;
        ColorSettingComponent.C[0x105E8 ^ 0x105A8] = 0x10598 ^ 0x105A8;
        ColorSettingComponent.C[0x23FE ^ 0x2357] = 0x2334 ^ 0x2357;
        ColorSettingComponent.C[0x7D7B ^ 0x7D37] = 0x7D63 ^ 0x7D37;
        ColorSettingComponent.C[0x73CF ^ 0x7395] = 0x73B0 ^ 0x7395;
        ColorSettingComponent.C[0x8127 ^ 0x8125] = 0xFFFF7E84 ^ 0x8125;
        ColorSettingComponent.C[0xA76D ^ 0xA7F6] = 0xFFFF5871 ^ 0xA7F6;
        ColorSettingComponent.C[0x3220 ^ 0x3219] = 0xFFFFCDD7 ^ 0x3219;
        ColorSettingComponent.C[0xD3B8 ^ 0xD3F1] = 0xD385 ^ 0xD3F1;
        ColorSettingComponent.C[0x374A ^ 0x3784] = 0x37D7 ^ 0x3784;
        ColorSettingComponent.C[0x5DDF ^ 0x5DB9] = 0x5D1E ^ 0x5DB9;
        ColorSettingComponent.C[0x782B ^ 0x795F] = 0xFFFF2316 ^ 0x795F;
        ColorSettingComponent.C[0xC42E ^ 0xC40A] = 0xFFFF3BE2 ^ 0xC40A;
        ColorSettingComponent.C[0xFE3A ^ 0xFF0E] = 0xFFFF009D ^ 0xFF0E;
        ColorSettingComponent.C[0x94C8 ^ 0x9445] = 0xFFFF6B92 ^ 0x9445;
        ColorSettingComponent.C[0x61C8 ^ 0x6041] = 0x6C88 ^ 0x6041;
        ColorSettingComponent.C[0x1A4E ^ 0x1B52] = 0x1B52 ^ 0x1B52;
        ColorSettingComponent.C[0xF1DF ^ 0xF1EA] = 0xFFFF0E48 ^ 0xF1EA;
        ColorSettingComponent.C[0xC5A3 ^ 0xC487] = 0xC4D2 ^ 0xC487;
        ColorSettingComponent.C[0x10B56 ^ 0x10B15] = 0xFFFEF4E3 ^ 0x10B15;
        ColorSettingComponent.C[0xAB96 ^ 0xAB29] = 0xAB2C ^ 0xAB29;
        ColorSettingComponent.C[0x22C4 ^ 0x2279] = 0x2204 ^ 0x2279;
        ColorSettingComponent.C[0x48E ^ 0x4AC] = 0x4A5 ^ 0x4AC;
        ColorSettingComponent.C[0x9BF8 ^ 0x9B76] = 0x9B13 ^ 0x9B76;
        ColorSettingComponent.C[0xAF0A ^ 0xAF8B] = 0xFFFF5057 ^ 0xAF8B;
        ColorSettingComponent.C[0x11F7 ^ 0x11C8] = 0x11CB ^ 0x11C8;
        ColorSettingComponent.C[0x9C18 ^ 0x9C6A] = 0x9C91 ^ 0x9C6A;
        ColorSettingComponent.C[0x32CE ^ 0x3275] = 0x3275 ^ 0x3275;
        ColorSettingComponent.C[0x74D0 ^ 0x743F] = 0x744A ^ 0x743F;
        ColorSettingComponent.C[0x3040 ^ 0x3007] = 0xFFFFCFE6 ^ 0x3007;
        ColorSettingComponent.C[0x5A75 ^ 0x5AF7] = 0xFFFFA561 ^ 0x5AF7;
        ColorSettingComponent.C[0xF23E ^ 0xF231] = 0xF27A ^ 0xF231;
        ColorSettingComponent.C[0xE529 ^ 0xE406] = 0xE432 ^ 0xE406;
        ColorSettingComponent.C[0x1BBE ^ 0x1B93] = 0x1BDD ^ 0x1B93;
        ColorSettingComponent.C[0x90E5 ^ 0x906D] = 0xFFFF6F83 ^ 0x906D;
        ColorSettingComponent.C[0x85D7 ^ 0x84E4] = 0x8491 ^ 0x84E4;
        ColorSettingComponent.C[0x5AA1 ^ 0x5B84] = 0xFFFFA41D ^ 0x5B84;
        ColorSettingComponent.C[0x5B47 ^ 0x5B38] = 0xFFFFA4A5 ^ 0x5B38;
        ColorSettingComponent.C[0x89B0 ^ 0x890A] = 0x8826 ^ 0x890A;
        ColorSettingComponent.C[0xC6DF ^ 0xC6EE] = 0xC6D6 ^ 0xC6EE;
        ColorSettingComponent.C[0x23B4 ^ 0x22FD] = 0xFFFFDD07 ^ 0x22FD;
        ColorSettingComponent.C[0xD49F ^ 0xD4DD] = 0xD4CF ^ 0xD4DD;
        ColorSettingComponent.C[0x1037D ^ 0x10399] = 0x103D4 ^ 0x10399;
        ColorSettingComponent.C[0x47A8 ^ 0x4698] = 0x468E ^ 0x4698;
        ColorSettingComponent.C[0xD7A ^ 0xD28] = 0xFFFFF2FB ^ 0xD28;
        ColorSettingComponent.C[0x73B2 ^ 0x73BC] = 0xFFFF8C51 ^ 0x73BC;
        ColorSettingComponent.C[0xFF7C ^ 0xFE23] = 0x42B6 ^ 0xFE23;
        ColorSettingComponent.C[0x2D22 ^ 0x2DC5] = 0xFFFFD230 ^ 0x2DC5;
        ColorSettingComponent.C[0x6311 ^ 0x6380] = 0xFFFF9C06 ^ 0x6380;
        ColorSettingComponent.C[0xEA4D ^ 0xEA22] = 0xEA1F ^ 0xEA22;
        ColorSettingComponent.C[0x15C0 ^ 0x1578] = 0xFFFFEA9D ^ 0x1578;
        ColorSettingComponent.C[0x4785 ^ 0x47FE] = 0x47D4 ^ 0x47FE;
        ColorSettingComponent.C[0x47A2 ^ 0x47A2] = 0x47DA ^ 0x47A2;
        ColorSettingComponent.C[0x7FD ^ 0x7F7] = 0x7B0 ^ 0x7F7;
        ColorSettingComponent.C[0x67FB ^ 0x66B4] = 0xFFFF9967 ^ 0x66B4;
        ColorSettingComponent.C[0xCF2D ^ 0xCE6B] = 0xFFFF31CC ^ 0xCE6B;
        ColorSettingComponent.C[0x2670 ^ 0x2624] = 0x271E ^ 0x2624;
        ColorSettingComponent.C[0x37FD ^ 0x368B] = 0x1DFE ^ 0x368B;
        ColorSettingComponent.C[0x5112 ^ 0x5061] = 0xF585 ^ 0x5061;
        ColorSettingComponent.C[0xEC84 ^ 0xED9C] = 0xDC76 ^ 0xED9C;
        ColorSettingComponent.C[0xD10A ^ 0xD1D9] = 0xD1BB ^ 0xD1D9;
        ColorSettingComponent.C[0x74DE ^ 0x759D] = 0xFFFF8A6C ^ 0x759D;
        ColorSettingComponent.C[0x66A2 ^ 0x6617] = 0x6603 ^ 0x6617;
        ColorSettingComponent.C[0x506E ^ 0x505C] = 0x5030 ^ 0x505C;
        ColorSettingComponent.C[0xFF20 ^ 0xFE73] = 0xFEF7 ^ 0xFE73;
        ColorSettingComponent.C[0x919D ^ 0x9154] = 0x91C6 ^ 0x9154;
        ColorSettingComponent.C[0x9955 ^ 0x997A] = 0x9961 ^ 0x997A;
        ColorSettingComponent.C[0xC21F ^ 0xC28D] = 0xFFFF3D1B ^ 0xC28D;
        ColorSettingComponent.C[0x10E8B ^ 0x10EA8] = 0xFFFEF168 ^ 0x10EA8;
        ColorSettingComponent.C[0x6777 ^ 0x6676] = 0x6653 ^ 0x6676;
        ColorSettingComponent.C[0x3320 ^ 0x3314] = 0x3375 ^ 0x3314;
        ColorSettingComponent.C[0x7C82 ^ 0x7DE7] = 0xF115 ^ 0x7DE7;
        ColorSettingComponent.C[0xAC79 ^ 0xAD53] = 0xAD5B ^ 0xAD53;
        ColorSettingComponent.C[0x5E2C ^ 0x5E9C] = 0xFFFFA16D ^ 0x5E9C;
        ColorSettingComponent.C[0xE5C2 ^ 0xE5F1] = 0xE5CE ^ 0xE5F1;
        ColorSettingComponent.C[0xECD0 ^ 0xEC44] = 0xFFFF13F9 ^ 0xEC44;
        ColorSettingComponent.C[0x3A07 ^ 0x3A42] = 0xFFFFC5EB ^ 0x3A42;
        ColorSettingComponent.C[0x9D7 ^ 0x991] = 0x9E6 ^ 0x991;
        ColorSettingComponent.C[0xA31B ^ 0xA30A] = 0xFFFF5CB9 ^ 0xA30A;
        ColorSettingComponent.C[0x1563 ^ 0x155E] = 0xFFFFEAA3 ^ 0x155E;
        ColorSettingComponent.C[0x11D6 ^ 0x1168] = 0xFFFFEEF6 ^ 0x1168;
        ColorSettingComponent.C[0x4C62 ^ 0x4D34] = 0x4D35 ^ 0x4D34;
        ColorSettingComponent.C[0xE411 ^ 0xE4F1] = 0xE4C7 ^ 0xE4F1;
        ColorSettingComponent.C[0xB0DB ^ 0xB1E2] = 0xB1D6 ^ 0xB1E2;
        ColorSettingComponent.C[0xFE00 ^ 0xFE8C] = 0xFFFF0108 ^ 0xFE8C;
        ColorSettingComponent.C[0x382A ^ 0x38F2] = 0x38F7 ^ 0x38F2;
        ColorSettingComponent.C[0xC6A0 ^ 0xC7B0] = 0x73C2 ^ 0xC7B0;
        ColorSettingComponent.C[0x83B4 ^ 0x82DF] = 0xD5B ^ 0x82DF;
        ColorSettingComponent.C[0x448C ^ 0x4435] = 0x445E ^ 0x4435;
        ColorSettingComponent.C[0x7326 ^ 0x7206] = 0x720D ^ 0x7206;
        ColorSettingComponent.C[0xC3DB ^ 0xC255] = 0x595A ^ 0xC255;
        ColorSettingComponent.C[0xAE2F ^ 0xAEDB] = 0xAEE8 ^ 0xAEDB;
        ColorSettingComponent.C[0x5F47 ^ 0x5F55] = 0x5FD5 ^ 0x5F55;
        ColorSettingComponent.C[0x4A0D ^ 0x4A6E] = 0x4A00 ^ 0x4A6E;
        ColorSettingComponent.C[0x1A66 ^ 0x1A30] = 0xFFFFE5D1 ^ 0x1A30;
        ColorSettingComponent.C[0x100F0 ^ 0x1009D] = 0x100B6 ^ 0x1009D;
        ColorSettingComponent.C[0x105B9 ^ 0x10539] = 0xFFFEFA84 ^ 0x10539;
        ColorSettingComponent.C[0xD39E ^ 0xD281] = 0xD283 ^ 0xD281;
        ColorSettingComponent.C[0xB261 ^ 0xB2B1] = 0xFFFF4D1F ^ 0xB2B1;
        ColorSettingComponent.C[0xDADD ^ 0xDA28] = 0xFFFF2591 ^ 0xDA28;
        ColorSettingComponent.C[0xD761 ^ 0xD663] = 0xFFFF29A2 ^ 0xD663;
        ColorSettingComponent.C[0x10CCC ^ 0x10DCA] = 0xFFFEF277 ^ 0x10DCA;
        ColorSettingComponent.C[0x4D55 ^ 0x4D31] = 0x4D2F ^ 0x4D31;
        ColorSettingComponent.C[0x45BF ^ 0x45D6] = 0x45DD ^ 0x45D6;
        ColorSettingComponent.C[0xCD0C ^ 0xCD8F] = 0xFFFF325B ^ 0xCD8F;
        ColorSettingComponent.C[0xE97C ^ 0xE9DE] = 0xE9F1 ^ 0xE9DE;
        ColorSettingComponent.C[0x35D7 ^ 0x3483] = 0xFFFFCB0D ^ 0x3483;
        ColorSettingComponent.C[0x6F5F ^ 0x6F83] = 0x6FC3 ^ 0x6F83;
        ColorSettingComponent.C[0x5278 ^ 0x52E8] = 0x52F8 ^ 0x52E8;
        ColorSettingComponent.C[0xFEF3 ^ 0xFE60] = 0xFF7B ^ 0xFE60;
        ColorSettingComponent.C[0x4809 ^ 0x483E] = 0xFFFFB7A7 ^ 0x483E;
        ColorSettingComponent.C[0xCBFB ^ 0xCB25] = 0xFFFF34BD ^ 0xCB25;
        ColorSettingComponent.C[0xEDCF ^ 0xED8E] = 0xEDBD ^ 0xED8E;
        ColorSettingComponent.C[0xB41D ^ 0xB4C4] = 0xB486 ^ 0xB4C4;
        ColorSettingComponent.C[0xCE94 ^ 0xCED9] = 0xFFFF3129 ^ 0xCED9;
        ColorSettingComponent.C[0xD541 ^ 0xD5BC] = 0xD5C8 ^ 0xD5BC;
        ColorSettingComponent.C[0x8A5C ^ 0x8BDE] = 0x188CC ^ 0x8BDE;
        ColorSettingComponent.C[0x72AD ^ 0x7231] = 0x7220 ^ 0x7231;
        ColorSettingComponent.C[0x6FE1 ^ 0x6E98] = 0x45E3 ^ 0x6E98;
        ColorSettingComponent.C[0x9F0B ^ 0x9E55] = 0x22C8 ^ 0x9E55;
        ColorSettingComponent.C[0x21C4 ^ 0x20FE] = 0x20A1 ^ 0x20FE;
        ColorSettingComponent.C[0xEF75 ^ 0xEE70] = 0xFFFF1141 ^ 0xEE70;
        ColorSettingComponent.C[0x10121 ^ 0x10074] = 0x10046 ^ 0x10074;
        ColorSettingComponent.C[0x354A ^ 0x343F] = 0x91DB ^ 0x343F;
        ColorSettingComponent.C[0x51C7 ^ 0x509B] = 0x3218 ^ 0x509B;
        ColorSettingComponent.C[0x5EBA ^ 0x5F82] = 0xFFFFA00F ^ 0x5F82;
        ColorSettingComponent.C[0x1460 ^ 0x1464] = 0xFFFFEB97 ^ 0x1464;
        ColorSettingComponent.C[0xCA15 ^ 0xCA8D] = 0xCAC5 ^ 0xCA8D;
        ColorSettingComponent.C[0xD39B ^ 0xD396] = 0xD396 ^ 0xD396;
        ColorSettingComponent.C[0xD167 ^ 0xD109] = 0xD142 ^ 0xD109;
        ColorSettingComponent.C[0x98F9 ^ 0x9863] = 0xFFFF67AD ^ 0x9863;
        ColorSettingComponent.C[0xB304 ^ 0xB22C] = 0xFFFF4D88 ^ 0xB22C;
        ColorSettingComponent.C[0x367C ^ 0x3652] = 0xFFFFC9CA ^ 0x3652;
        ColorSettingComponent.C[0xF7B8 ^ 0xF6A5] = 0xF6B8 ^ 0xF6A5;
        ColorSettingComponent.C[0xDF18 ^ 0xDE24] = 0xDE54 ^ 0xDE24;
        ColorSettingComponent.C[0xFF09 ^ 0xFFAA] = 0xFFFF0060 ^ 0xFFAA;
        ColorSettingComponent.C[0x3FEA ^ 0x3F45] = 0x3F6E ^ 0x3F45;
        ColorSettingComponent.C[0x3422 ^ 0x34EE] = 0x34EE ^ 0x34EE;
        ColorSettingComponent.C[0xCEA7 ^ 0xCEB2] = 0xCEEB ^ 0xCEB2;
        ColorSettingComponent.C[0x111E ^ 0x1198] = 0xFFFFEE1E ^ 0x1198;
        ColorSettingComponent.C[0x900A ^ 0x9014] = 0xFFFF6FC7 ^ 0x9014;
        ColorSettingComponent.C[0x1379 ^ 0x1262] = 0xB77D ^ 0x1262;
        ColorSettingComponent.C[0x2E3E ^ 0x2E5E] = 0xFFFFD191 ^ 0x2E5E;
        ColorSettingComponent.C[0xA18E ^ 0xA1A5] = 0xA1FD ^ 0xA1A5;
        ColorSettingComponent.C[0x468D ^ 0x4675] = 0xFFFFB984 ^ 0x4675;
        ColorSettingComponent.C[0x10C02 ^ 0x10CAE] = 0x10CA9 ^ 0x10CAE;
        ColorSettingComponent.C[0x8BFB ^ 0x8B5D] = 0x8B18 ^ 0x8B5D;
        ColorSettingComponent.C[0x4E4F ^ 0x4E32] = 0xFFFFB1C2 ^ 0x4E32;
        ColorSettingComponent.C[0x1B79 ^ 0x1B4F] = 0xFFFFE4AE ^ 0x1B4F;
        ColorSettingComponent.C[0x57CA ^ 0x56AB] = 0xEA3E ^ 0x56AB;
        ColorSettingComponent.C[0x63F1 ^ 0x62D7] = 0xFFFF9D45 ^ 0x62D7;
        ColorSettingComponent.C[0xFD54 ^ 0xFD82] = 0xFDF0 ^ 0xFD82;
        ColorSettingComponent.C[0xF5D2 ^ 0xF5F5] = 0xFFFF0A77 ^ 0xF5F5;
        ColorSettingComponent.C[0x37C2 ^ 0x36CA] = 0x36C9 ^ 0x36CA;
        ColorSettingComponent.C[0x696E ^ 0x69E4] = 0xFFFF964A ^ 0x69E4;
        ColorSettingComponent.C[0xEF6B ^ 0xEF50] = 0xEF44 ^ 0xEF50;
        ColorSettingComponent.C[0x1FEA ^ 0x1FE6] = 0x1FC9 ^ 0x1FE6;
        ColorSettingComponent.C[0xC3E0 ^ 0xC351] = 0xC37C ^ 0xC351;
        ColorSettingComponent.C[0x77A4 ^ 0x7779] = 0xFFFF88EB ^ 0x7779;
        ColorSettingComponent.C[0x66DE ^ 0x67F3] = 0xFFFF9809 ^ 0x67F3;
        ColorSettingComponent.C[0x6CA3 ^ 0x6C04] = 0x6C4F ^ 0x6C04;
        ColorSettingComponent.C[0x505F ^ 0x50D4] = 0x50E6 ^ 0x50D4;
        ColorSettingComponent.C[0x52EE ^ 0x52BB] = 0xFFFFAD1D ^ 0x52BB;
        ColorSettingComponent.C[0x1C44 ^ 0x1D67] = 0x1DBB ^ 0x1D67;
        ColorSettingComponent.C[0xAD22 ^ 0xADE7] = 0xFFFF526D ^ 0xADE7;
        ColorSettingComponent.C[0x5517 ^ 0x547F] = 0xFFFFB2DF ^ 0x547F;
        ColorSettingComponent.C[0x4AF9 ^ 0x4BB5] = 0xFFFFB450 ^ 0x4BB5;
        ColorSettingComponent.C[0x92BF ^ 0x939E] = 0x93DF ^ 0x939E;
        ColorSettingComponent.C[0xDDF5 ^ 0xDD41] = 0xDDB4 ^ 0xDD41;
        ColorSettingComponent.C[0xE0B6 ^ 0xE1F7] = 0xE1AF ^ 0xE1F7;
        ColorSettingComponent.C[0x10A44 ^ 0x10AB5] = 0xFFFEF52B ^ 0x10AB5;
        ColorSettingComponent.C[0xF2CD ^ 0xF2C6] = 0xF2C8 ^ 0xF2C6;
        ColorSettingComponent.C[0xF3F3 ^ 0xF3E5] = 0xF3A4 ^ 0xF3E5;
        ColorSettingComponent.C[0x915C ^ 0x906E] = 0xFFFF6FA8 ^ 0x906E;
        ColorSettingComponent.C[0x350 ^ 0x36C] = 0xFFFFFCDF ^ 0x36C;
        ColorSettingComponent.C[0x867C ^ 0x8686] = 0xFFFF7945 ^ 0x8686;
        ColorSettingComponent.C[0x10408 ^ 0x1048F] = 0x104B3 ^ 0x1048F;
        ColorSettingComponent.C[0x10788 ^ 0x10795] = 0xFFFEF850 ^ 0x10795;
        ColorSettingComponent.C[0xB128 ^ 0xB1F7] = 0xFFFF4E3A ^ 0xB1F7;
        ColorSettingComponent.C[0x1FF6 ^ 0x1F5B] = 0xFFFFE0BA ^ 0x1F5B;
        ColorSettingComponent.C[0xBB9 ^ 0xAD4] = 0x8550 ^ 0xAD4;
        ColorSettingComponent.C[0xA8B0 ^ 0xA8FF] = 0xA88C ^ 0xA8FF;
        ColorSettingComponent.C[0x421A ^ 0x427B] = 0x423E ^ 0x427B;
        ColorSettingComponent.C[0x5209 ^ 0x52AD] = 0xFFFFAD74 ^ 0x52AD;
        ColorSettingComponent.C[0xC4A2 ^ 0xC415] = 0xFFFF3BBB ^ 0xC415;
        ColorSettingComponent.C[0x7973 ^ 0x796A] = 0x792F ^ 0x796A;
        ColorSettingComponent.C[0xB8D4 ^ 0xB993] = 0xFFFF4666 ^ 0xB993;
        ColorSettingComponent.C[0x2E18 ^ 0x2EC3] = 0xFFFFD117 ^ 0x2EC3;
        ColorSettingComponent.C[0x238 ^ 0x28E] = 0x290 ^ 0x28E;
        ColorSettingComponent.C[0x29F2 ^ 0x2913] = 0xFFFFD692 ^ 0x2913;
        ColorSettingComponent.C[0xEC50 ^ 0xEDDA] = 0x2BAA ^ 0xEDDA;
        ColorSettingComponent.C[0xE874 ^ 0xE896] = 0xFFFF1769 ^ 0xE896;
        ColorSettingComponent.C[0x7404 ^ 0x742C] = 0x745A ^ 0x742C;
        ColorSettingComponent.C[0x9AE4 ^ 0x9A91] = 0x9ADE ^ 0x9A91;
        ColorSettingComponent.C[0xAFAD ^ 0xAF97] = 0xFFFF504C ^ 0xAF97;
        ColorSettingComponent.C[0x1173 ^ 0x11ED] = 0xFFFFEE41 ^ 0x11ED;
        ColorSettingComponent.C[0xC834 ^ 0xC8E1] = 0xC85F ^ 0xC8E1;
        ColorSettingComponent.C[0xFDAF ^ 0xFD68] = 0xFD6F ^ 0xFD68;
        ColorSettingComponent.C[0x3863 ^ 0x390D] = 0xCC3B ^ 0x390D;
        ColorSettingComponent.C[0x9BD7 ^ 0x9BD1] = 0xFFFF6480 ^ 0x9BD1;
        ColorSettingComponent.C[0xCA31 ^ 0xCBBD] = 0xD81 ^ 0xCBBD;
        ColorSettingComponent.C[0x39FC ^ 0x389C] = 0xFFFF7BDA ^ 0x389C;
        ColorSettingComponent.C[0x1C41 ^ 0x1CBD] = 0x1CB7 ^ 0x1CBD;
        ColorSettingComponent.C[0xC057 ^ 0xC0F6] = 0xC09A ^ 0xC0F6;
        ColorSettingComponent.C[0xCE71 ^ 0xCF6B] = 0xC174 ^ 0xCF6B;
        ColorSettingComponent.C[0xFBF9 ^ 0xFB5C] = 0xFFFF04DC ^ 0xFB5C;
        ColorSettingComponent.C[0x1FD2 ^ 0x1EE9] = 0xFFFFE1C3 ^ 0x1EE9;
        ColorSettingComponent.C[0xDFE ^ 0xC75] = 0xCA05 ^ 0xC75;
        ColorSettingComponent.C[0x3BB8 ^ 0x3B7A] = 0xFFFFC4A8 ^ 0x3B7A;
        ColorSettingComponent.C[0x1A6B ^ 0x1A21] = 0x1A16 ^ 0x1A21;
        ColorSettingComponent.C[0xB4C ^ 0xB5F] = 0xFFFFF4DC ^ 0xB5F;
        ColorSettingComponent.C[0x2731 ^ 0x2657] = 0x3F35 ^ 0x2657;
        ColorSettingComponent.C[0xF1B6 ^ 0xF1AC] = 0xFFFF0E1B ^ 0xF1AC;
        ColorSettingComponent.C[0xD4E9 ^ 0xD48E] = 0xD4D6 ^ 0xD48E;
        ColorSettingComponent.C[0x3F5E ^ 0x3E25] = 0x7B86 ^ 0x3E25;
        ColorSettingComponent.C[0x8D02 ^ 0x8D7B] = 0xFFFF72D7 ^ 0x8D7B;
        ColorSettingComponent.C[0xB10F ^ 0xB1C5] = 0xB1C5 ^ 0xB1C5;
        ColorSettingComponent.C[0x4BAA ^ 0x4BD9] = 0xFFFFB45E ^ 0x4BD9;
        ColorSettingComponent.C[0x10064 ^ 0x100E0] = 0x10070 ^ 0x100E0;
        ColorSettingComponent.C[0xB63C ^ 0xB7B4] = 0xFFFF44AB ^ 0xB7B4;
        ColorSettingComponent.C[0x9EB7 ^ 0x9EEE] = 0xFFFF6126 ^ 0x9EEE;
        ColorSettingComponent.C[0x10BB4 ^ 0x10AA7] = 0x13F61 ^ 0x10AA7;
        ColorSettingComponent.C[0x8A4B ^ 0x8B39] = 0x2ED0 ^ 0x8B39;
    }

    @Metadata(mv={2, 3, 0}, k=1, xi=48, d1={"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003R\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\b\b\u0010\t\u00a8\u0006\n"}, d2={"Lkotakbaz/rain/ui/menu/settings/impl/ColorSettingComponent$Companion;", "", "<init>", "()V", "Ljava/awt/Color;", "copiedColor", "Ljava/awt/Color;", "", "HUE_TEXTURE_KEY", "Ljava/lang/String;", "rain-visuals"})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker $constructor_marker) {
            this();
        }
    }

    @Metadata(mv={2, 3, 0}, k=1, xi=48, d1={"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\t\b\u0082\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u00a2\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\b\f\u0010\u000bJ\u0010\u0010\r\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\b\r\u0010\u000bJ\u0010\u0010\u000e\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\b\u000e\u0010\u000bJ\u0010\u0010\u000f\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\b\u000f\u0010\u000bJB\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u0002H\u00c6\u0001\u00a2\u0006\u0004\b\u0010\u0010\u0011J\u001b\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001H\u00d6\u0083\u0004\u00a2\u0006\u0004\b\u0014\u0010\u0015J\u0011\u0010\u0017\u001a\u00020\u0016H\u00d6\u0081\u0004\u00a2\u0006\u0004\b\u0017\u0010\u0018J\u0011\u0010\u001a\u001a\u00020\u0019H\u00d6\u0081\u0004\u00a2\u0006\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006\u00a2\u0006\f\n\u0004\b\u0003\u0010\u001c\u001a\u0004\b\u001d\u0010\u000bR\u0017\u0010\u0004\u001a\u00020\u00028\u0006\u00a2\u0006\f\n\u0004\b\u0004\u0010\u001c\u001a\u0004\b\u001e\u0010\u000bR\u0017\u0010\u0005\u001a\u00020\u00028\u0006\u00a2\u0006\f\n\u0004\b\u0005\u0010\u001c\u001a\u0004\b\u001f\u0010\u000bR\u0017\u0010\u0006\u001a\u00020\u00028\u0006\u00a2\u0006\f\n\u0004\b\u0006\u0010\u001c\u001a\u0004\b \u0010\u000bR\u0017\u0010\u0007\u001a\u00020\u00028\u0006\u00a2\u0006\f\n\u0004\b\u0007\u0010\u001c\u001a\u0004\b!\u0010\u000b\u00a8\u0006\""}, d2={"Lkotakbaz/rain/ui/menu/settings/impl/ColorSettingComponent$Layout;", "", "Lkotakbaz/rain/ui/menu/settings/impl/ColorSettingComponent$Rect;", "picker", "hue", "alpha", "copyButton", "pasteButton", "<init>", "(Lkotakbaz/rain/ui/menu/settings/impl/ColorSettingComponent$Rect;Lkotakbaz/rain/ui/menu/settings/impl/ColorSettingComponent$Rect;Lkotakbaz/rain/ui/menu/settings/impl/ColorSettingComponent$Rect;Lkotakbaz/rain/ui/menu/settings/impl/ColorSettingComponent$Rect;Lkotakbaz/rain/ui/menu/settings/impl/ColorSettingComponent$Rect;)V", "component1", "()Lkotakbaz/rain/ui/menu/settings/impl/ColorSettingComponent$Rect;", "component2", "component3", "component4", "component5", "copy", "(Lkotakbaz/rain/ui/menu/settings/impl/ColorSettingComponent$Rect;Lkotakbaz/rain/ui/menu/settings/impl/ColorSettingComponent$Rect;Lkotakbaz/rain/ui/menu/settings/impl/ColorSettingComponent$Rect;Lkotakbaz/rain/ui/menu/settings/impl/ColorSettingComponent$Rect;Lkotakbaz/rain/ui/menu/settings/impl/ColorSettingComponent$Rect;)Lkotakbaz/rain/ui/menu/settings/impl/ColorSettingComponent$Layout;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lkotakbaz/rain/ui/menu/settings/impl/ColorSettingComponent$Rect;", "getPicker", "getHue", "getAlpha", "getCopyButton", "getPasteButton", "rain-visuals"})
    private static final class Layout {
        @NotNull
        private final Rect picker;
        @NotNull
        private final Rect hue;
        @NotNull
        private final Rect alpha;
        @NotNull
        private final Rect copyButton;
        @NotNull
        private final Rect pasteButton;
        private static Object[] a;
        private static Object b;
        private static Object[] B;
        private static Object[] A;
        private static Object[] c;
        public static int[] C;

        public Layout(@NotNull Rect picker, @NotNull Rect hue, @NotNull Rect alpha2, @NotNull Rect copyButton, @NotNull Rect pasteButton) {
            int n2 = C[0];
            n2 ^= C[1];
            Intrinsics.checkNotNullParameter(picker, (String)a[n2 ^= C[2]]);
            int n3 = C[3];
            n3 ^= C[4];
            Intrinsics.checkNotNullParameter(hue, (String)a[n3 -= C[5]]);
            int n4 = C[6];
            n4 -= C[7];
            Intrinsics.checkNotNullParameter(alpha2, (String)a[n4 -= C[8]]);
            int n5 = C[9];
            n5 += C[10];
            Intrinsics.checkNotNullParameter(copyButton, (String)a[n5 ^= C[11]]);
            int n6 = C[12];
            n6 -= C[13];
            Intrinsics.checkNotNullParameter(pasteButton, (String)a[n6 += C[14]]);
            this.picker = picker;
            this.hue = hue;
            this.alpha = alpha2;
            this.copyButton = copyButton;
            this.pasteButton = pasteButton;
        }

        @NotNull
        public final Rect getPicker() {
            return this.picker;
        }

        @NotNull
        public final Rect getHue() {
            return this.hue;
        }

        @NotNull
        public final Rect getAlpha() {
            return this.alpha;
        }

        @NotNull
        public final Rect getCopyButton() {
            return this.copyButton;
        }

        @NotNull
        public final Rect getPasteButton() {
            return this.pasteButton;
        }

        @NotNull
        public final Rect component1() {
            return this.picker;
        }

        @NotNull
        public final Rect component2() {
            return this.hue;
        }

        @NotNull
        public final Rect component3() {
            return this.alpha;
        }

        @NotNull
        public final Rect component4() {
            return this.copyButton;
        }

        @NotNull
        public final Rect component5() {
            return this.pasteButton;
        }

        @NotNull
        public final Layout copy(@NotNull Rect picker, @NotNull Rect hue, @NotNull Rect alpha2, @NotNull Rect copyButton, @NotNull Rect pasteButton) {
            int n2 = C[15];
            n2 += C[16];
            Intrinsics.checkNotNullParameter(picker, (String)a[n2 -= C[17]]);
            int n3 = C[18];
            n3 += C[19];
            Intrinsics.checkNotNullParameter(hue, (String)a[n3 ^= C[20]]);
            int n4 = C[21];
            n4 -= C[22];
            Intrinsics.checkNotNullParameter(alpha2, (String)a[n4 ^= C[23]]);
            int n5 = C[24];
            n5 -= C[25];
            Intrinsics.checkNotNullParameter(copyButton, (String)a[n5 -= C[26]]);
            int n6 = C[27];
            n6 ^= C[28];
            Intrinsics.checkNotNullParameter(pasteButton, (String)a[n6 += C[29]]);
            return new Layout(picker, hue, alpha2, copyButton, pasteButton);
        }

        public static /* synthetic */ Layout copy$default(Layout layout, Rect rect, Rect rect2, Rect rect3, Rect rect4, Rect rect5, int n2, Object object) {
            int n3 = C[30];
            n3 ^= C[31];
            if ((n2 & (n3 ^= C[32])) != 0) {
                rect = layout.picker;
            }
            int n4 = C[33];
            n4 += C[34];
            if ((n2 & (n4 ^= C[35])) != 0) {
                rect2 = layout.hue;
            }
            int n5 = C[36];
            n5 ^= C[37];
            if ((n2 & (n5 ^= C[38])) != 0) {
                rect3 = layout.alpha;
            }
            int n6 = C[39];
            n6 -= C[40];
            if ((n2 & (n6 ^= C[41])) != 0) {
                rect4 = layout.copyButton;
            }
            int n7 = C[42];
            n7 ^= C[43];
            if ((n2 & (n7 ^= C[44])) != 0) {
                rect5 = layout.pasteButton;
            }
            return layout.copy(rect, rect2, rect3, rect4, rect5);
        }

        @NotNull
        public String toString() {
            Rect rect = this.pasteButton;
            Rect rect2 = this.copyButton;
            Rect rect3 = this.alpha;
            Rect rect4 = this.hue;
            Rect rect5 = this.picker;
            int n2 = C[45];
            n2 ^= C[46];
            n2 ^= C[47];
            int n3 = C[48];
            n3 += C[49];
            n3 += C[50];
            int n4 = C[51];
            n4 -= C[52];
            n4 -= C[53];
            int n5 = C[54];
            n5 -= C[55];
            int n6 = C[57];
            n6 -= C[58];
            int n7 = C[60];
            n7 ^= C[61];
            return (String)a[n2] + rect5 + (String)a[n3] + rect4 + (String)a[n4] + rect3 + (String)a[n5 += C[56]] + rect2 + (String)a[n6 -= C[59]] + rect + (String)a[n7 ^= C[62]];
        }

        public int hashCode() {
            long l2 = 3446643155238497879L;
            long l3 = 2155395670994349744L;
            long l4 = 2580136372449688085L;
            long l5 = 5519232513772840744L;
            long l6 = 9126112140889879566L;
            int n2 = C[63];
            n2 += C[64];
            long l7 = l6;
            int n3 = C[66];
            n3 ^= C[67];
            l6 = l7 ^ ((long)this.picker.hashCode() << (n2 ^= C[65]) ^ l7) & -1L << (n3 -= C[68]);
            int n4 = C[69];
            n4 ^= C[70];
            n4 -= C[71];
            int n5 = C[72];
            n5 ^= C[73];
            n5 += C[74];
            int n6 = C[75];
            n6 ^= C[76];
            long l8 = l6;
            int n7 = C[78];
            n7 ^= C[79];
            l6 = l8 ^ ((long)((int)(l6 >>> n4) * n5 + this.hue.hashCode()) << (n6 ^= C[77]) ^ l8) & -1L << (n7 += C[80]);
            int n8 = C[81];
            n8 += C[82];
            n8 -= C[83];
            int n9 = C[84];
            n9 ^= C[85];
            n9 ^= C[86];
            int n10 = C[87];
            n10 += C[88];
            long l9 = l6;
            int n11 = C[90];
            n11 ^= C[91];
            l6 = l9 ^ ((long)((int)(l6 >>> n8) * n9 + this.alpha.hashCode()) << (n10 -= C[89]) ^ l9) & -1L << (n11 += C[92]);
            int n12 = C[93];
            n12 -= C[94];
            n12 ^= C[95];
            int n13 = C[96];
            n13 += C[97];
            n13 -= C[98];
            int n14 = C[99];
            n14 -= C[100];
            long l10 = l6;
            int n15 = C[102];
            n15 += C[103];
            l6 = l10 ^ ((long)((int)(l6 >>> n12) * n13 + this.copyButton.hashCode()) << (n14 -= C[101]) ^ l10) & -1L << (n15 ^= C[104]);
            int n16 = C[105];
            n16 ^= C[106];
            n16 += C[107];
            int n17 = C[108];
            n17 += C[109];
            n17 += C[110];
            int n18 = C[111];
            n18 -= C[112];
            long l11 = l6;
            int n19 = C[114];
            n19 += C[115];
            l6 = l11 ^ ((long)((int)(l6 >>> n16) * n17 + this.pasteButton.hashCode()) << (n18 -= C[113]) ^ l11) & -1L << (n19 += C[116]);
            int n20 = C[117];
            n20 -= C[118];
            return (int)(l6 >>> (n20 -= C[119]));
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                boolean bl = C[120];
                bl ^= C[121];
                return bl += C[122];
            }
            if (!(other instanceof Layout)) {
                boolean bl = C[123];
                bl += C[124];
                return bl -= C[125];
            }
            Layout layout = (Layout)other;
            if (!Intrinsics.areEqual(this.picker, layout.picker)) {
                boolean bl = C[126];
                bl ^= C[127];
                return bl ^= C[128];
            }
            if (!Intrinsics.areEqual(this.hue, layout.hue)) {
                boolean bl = C[129];
                bl ^= C[130];
                return bl ^= C[131];
            }
            if (!Intrinsics.areEqual(this.alpha, layout.alpha)) {
                boolean bl = C[132];
                bl ^= C[133];
                return bl ^= C[134];
            }
            if (!Intrinsics.areEqual(this.copyButton, layout.copyButton)) {
                boolean bl = C[135];
                bl -= C[136];
                return bl ^= C[137];
            }
            if (!Intrinsics.areEqual(this.pasteButton, layout.pasteButton)) {
                boolean bl = C[138];
                bl -= C[139];
                return bl ^= C[140];
            }
            boolean bl = C[141];
            bl ^= C[142];
            return bl += C[143];
        }

        static {
            Layout.b();
            long l2 = -1919204647589883133L;
            long l3 = 531546344755647349L;
            long l4 = 1941553805072209480L;
            long l5 = 7833280613153059579L;
            long l6 = 1769533125986573490L;
            long l7 = 2436070825782198662L;
            long l8 = -4013136770668766336L;
            long l9 = 8911572189576383012L;
            long l10 = 7831423015849122953L;
            long l11 = 3016770434995619645L;
            long l12 = -239940704494557550L;
            long l13 = 5374945118947996936L;
            long l14 = 8251970639005325027L;
            long l15 = 691678413044012864L;
            int n2 = C[144];
            n2 += C[145];
            a = new Object[n2 ^= C[146]];
            long l16 = l15;
            int n3 = C[147];
            n3 ^= C[148];
            l15 = l16 ^ (0L ^ l16) & -1L << (n3 ^= C[149]);
            Object[] objectArray = new Object[C[150]];
            objectArray[Layout.C[151]] = A;
            objectArray[Layout.C[152]] = C[153];
            int n4 = C[154];
            Object object = Layout.A()[C[155]];
            if (object == null) {
                char[] cArray = "\u6efe\u6ef1\u6efb\u6eff\u6edb\u6eaf\u6edf\u6ea9\u6eb1\u6ecb\u6ee4\u6eb2\u6ef1\u6eb6\u6eb5\u6895\u6eb1\u6ea0\u6ec4\u6ed5\u6edc\u6efa\u6eb3\u6ecb\u6893\u6ea1\u6ed3\u6edd\u6ec5\u6ebd\u6eca\u6eb2\u6eb1\u6ee5\u6edb\u6ea1\u6ed6\u6eb5\u6edf\u6ef0\u6ebb\u6ea9\u6efa\u6eca\u6ea9\u6ee4\u6eb6\u6efc\u6eba\u6eba\u6ecb\u6ecb\u6edd\u6ebb\u6ec0\u6edb\u6eda\u6897\u6ed0\u6ec8\u6ebe\u6894\u6eb0\u6efc\u6eb5\u6edf\u6ec1\u6eb5\u6ed0\u6ead\u6ecb\u6894\u6897\u6eba\u6ed0\u6ebb\u6897\u6ed4\u6ebb\u6eb4\u6ec0\u6ec0\u6eab\u6ea8\u6eba\u6eb5\u6ea1\u6eb4\u6ec4\u6ecb\u6eb3\u6eba\u6ec9\u6895\u6893\u6efc\u6ec0\u6eba\u6ec4\u6ea1\u6ed6\u6ef1\u6efc\u6ecf\u6ed1\u6ebc\u6ec4\u6ec9\u6ed1\u6ead\u6ec1\u6ed0\u6edf\u6ec0\u6897\u6ec8\u6ebf\u6eb6\u6893\u6896\u6ecd\u6eb1\u6ef0\u6ebd\u6eb4\u6eb1\u6ec8\u6ecd\u6ef1\u6ecb\u6ebb\u6eda\u6ebe\u6eff\u6ee5\u6ecc\u6897\u6eab\u6ec4\u6edc\u6ea1\u6892\u6ebd\u6ec9\u6ecc\u6eb1\u6eb1\u6895\u6eaf\u6ea0\u6892\u6ed1\u6ed6\u6ef0\u6ea8\u6eda\u6ed6\u6eb3\u6ed4\u6ead\u6eaa\u6ec8\u6efc\u6ede\u6eb5\u6ef1\u6ea8\u6ef1\u6ed6\u6897\u6ebe\u6ecd\u6efe\u6ec1\u6ed6\u6eab\u6eb4\u6ed2\u6eb5\u6ead\u6ed4\u6ebd\u6ed0\u6ee4\u6ec4\u6ed1\u6ea8\u6ebd\u6ebf\u6edf\u6892\u6ea9\u6eb4\u6ed4\u6ebc\u6eab\u6ead\u6897\u6ebd\u6efe\u6ea0\u6efa\u6ef1\u6eb7\u6ed1\u6ed6\u6eca\u6ed3\u6ebf\u6eba\u6ed3\u6eca\u6ebc\u6eac\u6eaa\u6ed4\u6ed3\u6ef0\u6ee4\u6eca\u6897\u6ed6\u6eb6\u6eb4\u6eb2\u6ed0\u6ed6\u6edb\u6ebb\u6ed5\u6ebf\u6eca\u6ec4\u6ed2\u6ed3\u6ef8".toCharArray();
                for (int i2 = C[156]; i2 < C[157]; ++i2) {
                    int n5 = cArray[i2];
                    n5 += C[158];
                    n5 -= C[159];
                    n5 -= C[160];
                    n5 -= C[161];
                    n5 += C[162];
                    n5 ^= C[163];
                    n5 -= C[164];
                    n5 += C[165];
                    n5 -= C[166];
                    n5 ^= C[167];
                    n5 -= C[168];
                    cArray[i2] = (char)(n5 -= C[169]);
                }
                object = Layout.A()[Layout.C[170]] = new String(cArray);
            }
            objectArray[n4] = (String)object;
            char[] cArray = ((String)Layout.a(objectArray)).toCharArray();
            long l17 = l6;
            int n6 = C[171];
            n6 ^= C[172];
            l6 = l17 ^ (0x9E00000000L ^ l17) & -1L << (n6 -= C[173]);
            long l18 = l13;
            int n7 = C[174];
            n7 -= C[175];
            l13 = l18 ^ (0L ^ l18) & -1L >>> (n7 += C[176]);
            while (true) {
                int n8 = C[177];
                n8 -= C[178];
                if ((int)l13 >= (int)(l6 >>> (n8 ^= C[179]))) break;
                int n9 = (int)l13;
                long l19 = l13;
                int n10 = C[180];
                n10 -= C[181];
                int n11 = C[183];
                n11 += C[184];
                l13 = l19 ^ (l19 ^ l19 + (long)(n10 += C[182])) & -1L >>> (n11 -= C[185]);
                long l20 = l9;
                int n12 = C[186];
                n12 ^= C[187];
                l9 = l20 ^ ((long)cArray[n9] ^ l20) & -1L >>> (n12 ^= C[188]);
                int n13 = (int)l13;
                long l21 = l13;
                int n14 = C[189];
                n14 -= C[190];
                int n15 = C[192];
                n15 += C[193];
                l13 = l21 ^ (l21 ^ l21 + (long)(n14 ^= C[191])) & -1L >>> (n15 ^= C[194]);
                int n16 = C[195];
                n16 -= C[196];
                long l22 = l10;
                int n17 = C[198];
                n17 -= C[199];
                l10 = l22 ^ ((long)cArray[n13] << (n16 -= C[197]) ^ l22) & -1L << (n17 -= C[200]);
                int n18 = C[201];
                n18 -= C[202];
                n18 += C[203];
                int n19 = C[204];
                n19 += C[205];
                long l23 = l12;
                int n20 = C[207];
                n20 ^= C[208];
                l12 = l23 ^ ((long)((int)l9 << n18 | (int)(l10 >>> (n19 += C[206]))) ^ l23) & -1L >>> (n20 += C[209]);
                char[] cArray2 = new char[(int)l12];
                long l24 = l14;
                int n21 = C[210];
                n21 += C[211];
                l14 = l24 ^ (0L ^ l24) & -1L << (n21 -= C[212]);
                while (true) {
                    int n22 = C[213];
                    n22 ^= C[214];
                    if ((int)(l14 >>> (n22 -= C[215])) >= (int)l12) break;
                    int n23 = C[216];
                    n23 -= C[217];
                    int n24 = C[219];
                    n24 ^= C[220];
                    cArray2[(int)(l14 >>> (n23 ^= Layout.C[218]))] = cArray[(int)l13 + (int)(l14 >>> (n24 ^= C[221]))];
                    l14 += 0x100000000L;
                }
                int n25 = C[222];
                n25 += C[223];
                int n26 = (int)(l15 >>> (n25 -= C[224]));
                l15 += 0x100000000L;
                Layout.a[n26] = new String(cArray2);
                long l25 = l13;
                int n27 = C[225];
                n27 -= C[226];
                l13 = l25 ^ ((long)((int)l13 + (int)l12) ^ l25) & -1L >>> (n27 ^= C[227]);
            }
        }

        public static Object a(Object[] object) {
            Object object2;
            int n2 = (Integer)object[C[228]];
            String string = (String)object[C[229]];
            object = object[C[230]];
            Object[] objectArray = B;
            if (B == null) {
                objectArray = B = new Object[C[231]];
            }
            if ((object2 = objectArray[n2]) == null) {
                Object object3 = object;
                if (object == null) {
                    Object[] objectArray2 = new Object[C[232]];
                    A = objectArray2;
                    object3 = objectArray2;
                    byte[] byArray = new byte[C[234] ^ C[235]];
                    byArray[Layout.C[236] ^ Layout.C[237]] = C[238] ^ C[239];
                    byArray[Layout.C[240] ^ Layout.C[241]] = C[242] ^ C[243];
                    byArray[Layout.C[244] ^ Layout.C[245]] = C[246] ^ C[247];
                    byArray[Layout.C[248] ^ Layout.C[249]] = C[250] ^ C[251];
                    byArray[Layout.C[252] ^ Layout.C[253]] = C[254] ^ C[255];
                    byArray[Layout.C[256] ^ Layout.C[257]] = C[258] ^ C[259];
                    byArray[Layout.C[260] ^ Layout.C[261]] = C[262] ^ C[263];
                    byArray[Layout.C[264] ^ Layout.C[265]] = C[266] ^ C[267];
                    byArray[Layout.C[268] ^ Layout.C[269]] = C[270] ^ C[271];
                    byArray[Layout.C[272] ^ Layout.C[273]] = C[274] ^ C[275];
                    byArray[Layout.C[276] ^ Layout.C[277]] = C[278] ^ C[279];
                    byArray[Layout.C[280] ^ Layout.C[281]] = C[282] ^ C[283];
                    byArray[Layout.C[284] ^ Layout.C[285]] = C[286] ^ C[287];
                    byArray[Layout.C[288] ^ Layout.C[289]] = C[290] ^ C[291];
                    byArray[Layout.C[292] ^ Layout.C[293]] = C[294] ^ C[295];
                    byArray[Layout.C[296] ^ Layout.C[297]] = C[298] ^ C[299];
                    objectArray2[Layout.C[233]] = byArray;
                }
                byte[] byArray = (byte[])object3[C[300]];
                if (b == null) {
                    byte[] byArray2 = new byte[C[301] ^ C[302]];
                    byArray2[Layout.C[303] ^ Layout.C[304]] = C[305] ^ C[306];
                    byArray2[Layout.C[307] ^ Layout.C[308]] = C[309] ^ C[310];
                    byArray2[Layout.C[311] ^ Layout.C[312]] = C[313] ^ C[314];
                    byArray2[Layout.C[315] ^ Layout.C[316]] = C[317] ^ C[318];
                    byArray2[Layout.C[319] ^ Layout.C[320]] = C[321] ^ C[322];
                    byArray2[Layout.C[323] ^ Layout.C[324]] = C[325] ^ C[326];
                    byArray2[Layout.C[327] ^ Layout.C[328]] = C[329] ^ C[330];
                    byArray2[Layout.C[331] ^ Layout.C[332]] = C[333] ^ C[334];
                    byArray2[Layout.C[335] ^ Layout.C[336]] = C[337] ^ C[338];
                    byArray2[Layout.C[339] ^ Layout.C[340]] = C[341] ^ C[342];
                    byArray2[Layout.C[343] ^ Layout.C[344]] = C[345] ^ C[346];
                    byArray2[Layout.C[347] ^ Layout.C[348]] = C[349] ^ C[350];
                    byArray2[Layout.C[351] ^ Layout.C[352]] = C[353] ^ C[354];
                    byArray2[Layout.C[355] ^ Layout.C[356]] = C[357] ^ C[358];
                    byArray2[Layout.C[359] ^ Layout.C[360]] = C[361] ^ C[362];
                    byArray2[Layout.C[363] ^ Layout.C[364]] = C[365] ^ C[366];
                    byArray2[Layout.C[367] ^ Layout.C[368]] = C[369] ^ C[370];
                    byArray2[Layout.C[371] ^ Layout.C[372]] = C[373] ^ C[374];
                    byArray2[Layout.C[375] ^ Layout.C[376]] = C[377] ^ C[378];
                    byArray2[Layout.C[379] ^ Layout.C[380]] = C[381] ^ C[382];
                    byArray2[Layout.C[383] ^ Layout.C[384]] = C[385] ^ C[386];
                    byArray2[Layout.C[387] ^ Layout.C[388]] = C[389] ^ C[390];
                    byArray2[Layout.C[391] ^ Layout.C[392]] = C[393] ^ C[394];
                    byArray2[Layout.C[395] ^ Layout.C[396]] = C[397] ^ C[398];
                    byArray2[Layout.C[399] ^ 0x2DF3] = 0xFFFFD25C ^ 0x2DF3;
                    byArray2[0xDE28 ^ 0xDE33] = 0xFFFF21CC ^ 0xDE33;
                    byArray2[0x99A2 ^ 0x99B2] = 0x998D ^ 0x99B2;
                    byArray2[0x53AF ^ 0x53A2] = 0xFFFFAC2B ^ 0x53A2;
                    byArray2[0x10DAD ^ 0x10DBE] = 0xFFFEF258 ^ 0x10DBE;
                    byArray2[0x85B7 ^ 0x85B2] = 0x85D8 ^ 0x85B2;
                    byArray2[0x57A4 ^ 0x57B6] = 0xFFFFA834 ^ 0x57B6;
                    byArray2[0x674D ^ 0x6744] = 0xFFFF9897 ^ 0x6744;
                    byte[] byArray3 = new byte[byArray.length + byArray2.length];
                    System.arraycopy(byArray, 0, byArray3, 0, byArray.length);
                    System.arraycopy(byArray2, 0, byArray3, byArray.length, byArray2.length);
                    Object object4 = Layout.A()[1];
                    if (object4 == null) {
                        char[] cArray = "\ud895\ud87b\ud87e\ud879\ud87f\ud94b\ud8aa\ud950\ud889\ud95d\ud87d\ud954\ud878\ud886\ud896\ud87d\ud898\ud928".toCharArray();
                        for (int i2 = 0; i2 < 18; ++i2) {
                            int n3 = cArray[i2];
                            n3 -= 56784;
                            n3 ^= 0x9B07;
                            n3 -= 45369;
                            n3 += 5195;
                            n3 += 51179;
                            n3 -= 16156;
                            n3 ^= 0x8F6D;
                            n3 -= 52685;
                            n3 ^= 0x7CBE;
                            cArray[i2] = (char)(n3 ^= 0x89EF);
                        }
                        object4 = Layout.A()[1] = new String(cArray);
                    }
                    SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance((String)object4);
                    byte[] byArray4 = new byte[16];
                    byArray4[10] = 127;
                    byArray4[12] = 33;
                    byArray4[14] = -78;
                    byArray4[7] = 123;
                    byArray4[2] = 14;
                    byArray4[5] = -109;
                    byArray4[9] = 13;
                    byArray4[1] = -14;
                    byArray4[6] = -29;
                    byArray4[0] = 20;
                    byArray4[11] = 121;
                    byArray4[3] = -84;
                    byArray4[15] = -20;
                    byArray4[4] = -68;
                    byArray4[13] = -106;
                    byArray4[8] = -31;
                    PBEKeySpec pBEKeySpec = new PBEKeySpec(new String(byArray3, StandardCharsets.UTF_8).toCharArray(), byArray4, 12, 256);
                    byte[] byArray5 = secretKeyFactory.generateSecret(pBEKeySpec).getEncoded();
                    Object object5 = Layout.A()[2];
                    if (object5 == null) {
                        char[] cArray = "\ud134\ud140\ud152".toCharArray();
                        for (int i3 = 0; i3 < 3; ++i3) {
                            int n4 = cArray[i3];
                            n4 += 60290;
                            n4 += 10692;
                            n4 += 27751;
                            n4 ^= 0x3B88;
                            n4 -= 61225;
                            n4 += 10445;
                            n4 ^= 0x18EF;
                            n4 += 33263;
                            n4 -= 16946;
                            n4 ^= 0x5555;
                            n4 ^= 0x3555;
                            n4 -= 20538;
                            cArray[i3] = (char)(n4 += 46300);
                        }
                        object5 = Layout.A()[2] = new String(cArray);
                    }
                    b = new SecretKeySpec(byArray5, (String)object5);
                }
                byte[] byArray6 = Base64.getDecoder().decode(string);
                byte[] byArray7 = Arrays.copyOfRange(byArray6, 0, 16);
                byte[] byArray8 = Arrays.copyOfRange(byArray6, 16, byArray6.length);
                Object object6 = Layout.A()[3];
                if (object6 == null) {
                    char[] cArray = "\u1942\u1946\u1954\u1930\u1944\u1943\u1944\u1930\u1951\u194c\u1944\u1954\u1936\u1951\u1962\u1965\u1965\u196a\u196f\u1968".toCharArray();
                    for (int i4 = 0; i4 < 20; ++i4) {
                        int n5 = cArray[i4];
                        n5 -= 57184;
                        n5 -= 57761;
                        n5 += 12418;
                        n5 -= 21507;
                        n5 -= 45252;
                        n5 += 52236;
                        n5 -= 52272;
                        n5 -= 45235;
                        n5 -= 29080;
                        n5 += 442;
                        n5 += 39293;
                        n5 += 15966;
                        n5 += 18206;
                        cArray[i4] = (char)(n5 -= 33279);
                    }
                    object6 = Layout.A()[3] = new String(cArray);
                }
                Cipher cipher = Cipher.getInstance((String)object6);
                cipher.init(2, (Key)((SecretKey)b), new IvParameterSpec(byArray7));
                byte[] byArray9 = cipher.doFinal(byArray8);
                object2 = new String(byArray9, StandardCharsets.UTF_8);
            }
            return object2;
        }

        private static Object[] A() {
            Object[] objectArray = c;
            if (c == null) {
                c = new Object[4];
                objectArray = c;
            }
            return objectArray;
        }

        public static void b() {
            C = new int[0xE2C7 ^ 0xE357];
            Layout.C[0x7B12 ^ 0x7BAA] = 0xFFFF8405 ^ 0x7BAA;
            Layout.C[0x106A7 ^ 0x1078B] = 0x1078B ^ 0x1078B;
            Layout.C[0x10DDA ^ 0x10C8C] = 0x1E383 ^ 0x10C8C;
            Layout.C[0xF349 ^ 0xF3C3] = 0xF3CD ^ 0xF3C3;
            Layout.C[0xD467 ^ 0xD4F5] = 0xD4B4 ^ 0xD4F5;
            Layout.C[0xA98C ^ 0xA9E4] = 0xFFFF5636 ^ 0xA9E4;
            Layout.C[0x7EDA ^ 0x7E78] = 0xB0F0 ^ 0x7E78;
            Layout.C[0x41DE ^ 0x41E9] = 0xFFFFBE54 ^ 0x41E9;
            Layout.C[0x109BF ^ 0x10955] = 0x18330 ^ 0x10955;
            Layout.C[0x894C ^ 0x895B] = 0xFFFF76A2 ^ 0x895B;
            Layout.C[0xB82B ^ 0xB9A5] = 0x3D05 ^ 0xB9A5;
            Layout.C[0x1CFB ^ 0x1C4F] = 0x1C09 ^ 0x1C4F;
            Layout.C[0x5CF5 ^ 0x5DE8] = 0x71A ^ 0x5DE8;
            Layout.C[0x45CF ^ 0x4485] = 0x49B ^ 0x4485;
            Layout.C[0x9489 ^ 0x94A3] = 0x94CA ^ 0x94A3;
            Layout.C[0x9E7D ^ 0x9F3D] = 0x5D14 ^ 0x9F3D;
            Layout.C[0xC866 ^ 0xC92A] = 0xD988 ^ 0xC92A;
            Layout.C[0x98BB ^ 0x9884] = 0x98AC ^ 0x9884;
            Layout.C[0x75B8 ^ 0x75A9] = 0xFFFF8A6A ^ 0x75A9;
            Layout.C[0x45F3 ^ 0x4532] = 0xFFFFBAC4 ^ 0x4532;
            Layout.C[0x5799 ^ 0x5753] = 0xFFFFA8CB ^ 0x5753;
            Layout.C[0xE227 ^ 0xE27A] = 0xFFFF1D34 ^ 0xE27A;
            Layout.C[0xACFF ^ 0xAC91] = 0xFFFF5373 ^ 0xAC91;
            Layout.C[0xBBE8 ^ 0xBBA0] = 0xBBA2 ^ 0xBBA0;
            Layout.C[0xAFB2 ^ 0xAFA8] = 0xAFA4 ^ 0xAFA8;
            Layout.C[0xD9C7 ^ 0xD920] = 0xD921 ^ 0xD920;
            Layout.C[0xF1EA ^ 0xF1BC] = 0xF1F5 ^ 0xF1BC;
            Layout.C[0x48C7 ^ 0x4988] = 0x41BF ^ 0x4988;
            Layout.C[0x90DD ^ 0x91FD] = 0xFC28 ^ 0x91FD;
            Layout.C[0x1DB1 ^ 0x1CF3] = 0xDEDA ^ 0x1CF3;
            Layout.C[0x4279 ^ 0x42B4] = 0xFFFFBD42 ^ 0x42B4;
            Layout.C[0xC559 ^ 0xC429] = 0x94BB ^ 0xC429;
            Layout.C[0xDCE9 ^ 0xDC2E] = 0xFFFF2392 ^ 0xDC2E;
            Layout.C[0x860D ^ 0x86D2] = 0xFFFF790D ^ 0x86D2;
            Layout.C[0x59F4 ^ 0x590B] = 0x5531 ^ 0x590B;
            Layout.C[0x3B77 ^ 0x3BED] = 0x3BEF ^ 0x3BED;
            Layout.C[0x9CDD ^ 0x9C9A] = 0x9CB4 ^ 0x9C9A;
            Layout.C[0xFAE8 ^ 0xFA47] = 0xFA7F ^ 0xFA47;
            Layout.C[0x3D94 ^ 0x3DF3] = 0x3DDA ^ 0x3DF3;
            Layout.C[0x74AD ^ 0x7425] = 0xFFFF8B97 ^ 0x7425;
            Layout.C[0x9BC8 ^ 0x9BAA] = 0x9BB0 ^ 0x9BAA;
            Layout.C[0x253C ^ 0x25CE] = 0x8026 ^ 0x25CE;
            Layout.C[0xA319 ^ 0xA313] = 0xFFFF5CE6 ^ 0xA313;
            Layout.C[0x48CD ^ 0x49F7] = 0x29E5 ^ 0x49F7;
            Layout.C[0x4385 ^ 0x42C2] = 0x2C6 ^ 0x42C2;
            Layout.C[0xBB09 ^ 0xBBD9] = 0xFFFF4454 ^ 0xBBD9;
            Layout.C[0x988C ^ 0x982B] = 0xADC6 ^ 0x982B;
            Layout.C[0x96A4 ^ 0x963D] = 0x963D ^ 0x963D;
            Layout.C[0x7C50 ^ 0x7D57] = 0xE0FE ^ 0x7D57;
            Layout.C[0x7A61 ^ 0x7B6E] = 0xDE58 ^ 0x7B6E;
            Layout.C[0x3F8E ^ 0x3EE9] = 0xACFB ^ 0x3EE9;
            Layout.C[0xE40E ^ 0xE49F] = 0xE4EE ^ 0xE49F;
            Layout.C[0x10A57 ^ 0x10B40] = 0x1490E ^ 0x10B40;
            Layout.C[0x10A37 ^ 0x10B39] = 0x1AE16 ^ 0x10B39;
            Layout.C[0x5E54 ^ 0x5E60] = 0x5E51 ^ 0x5E60;
            Layout.C[0x9F9D ^ 0x9F0B] = 0x9F08 ^ 0x9F0B;
            Layout.C[0x4496 ^ 0x4432] = 0x88F8 ^ 0x4432;
            Layout.C[0xD5B9 ^ 0xD560] = 0xFFFF2AB7 ^ 0xD560;
            Layout.C[0x4CF4 ^ 0x4CB5] = 0x4CDB ^ 0x4CB5;
            Layout.C[0x8318 ^ 0x8367] = 0xFFFF7CBC ^ 0x8367;
            Layout.C[0x72D9 ^ 0x72EB] = 0xFFFF8D4C ^ 0x72EB;
            Layout.C[0xCDD0 ^ 0xCD4D] = 0xCDA1 ^ 0xCD4D;
            Layout.C[0x40FB ^ 0x40EF] = 0xFFFFBF5F ^ 0x40EF;
            Layout.C[0x9B73 ^ 0x9B4E] = 0x9B7C ^ 0x9B4E;
            Layout.C[0x152D ^ 0x1463] = 0x4C1 ^ 0x1463;
            Layout.C[0x5C06 ^ 0x5D3E] = 0x3D2C ^ 0x5D3E;
            Layout.C[0x622D ^ 0x633E] = 0xCA0F ^ 0x633E;
            Layout.C[0x10BB ^ 0x1041] = 0x8756 ^ 0x1041;
            Layout.C[0x9F0F ^ 0x9FF9] = 0xFFFE6A0F ^ 0x9FF9;
            Layout.C[0x93F8 ^ 0x9356] = 0x9369 ^ 0x9356;
            Layout.C[0x9417 ^ 0x94BC] = 0x949D ^ 0x94BC;
            Layout.C[0xEA97 ^ 0xEB10] = 0xF824 ^ 0xEB10;
            Layout.C[0xF0AE ^ 0xF1DB] = 0xFFFFB87A ^ 0xF1DB;
            Layout.C[0x6385 ^ 0x6304] = 0x632B ^ 0x6304;
            Layout.C[0x173C ^ 0x17C8] = 0x11DCF ^ 0x17C8;
            Layout.C[0xCC71 ^ 0xCD54] = 0x800F ^ 0xCD54;
            Layout.C[0x9700 ^ 0x97D2] = 0xFFFF683E ^ 0x97D2;
            Layout.C[0x3046 ^ 0x31C4] = 0x1339 ^ 0x31C4;
            Layout.C[0xD40D ^ 0xD4FD] = 0x7179 ^ 0xD4FD;
            Layout.C[0xD631 ^ 0xD713] = 0xFFFF4540 ^ 0xD713;
            Layout.C[0xD39C ^ 0xD2B2] = 0x5AF0 ^ 0xD2B2;
            Layout.C[0xADBC ^ 0xACF7] = 0xBC55 ^ 0xACF7;
            Layout.C[0x4D5 ^ 0x5CA] = 0x5F38 ^ 0x5CA;
            Layout.C[0x10399 ^ 0x10214] = 0x186C6 ^ 0x10214;
            Layout.C[0x7FE5 ^ 0x7FF7] = 0xFFFF809E ^ 0x7FF7;
            Layout.C[0xEA17 ^ 0xEB6C] = 0xA138 ^ 0xEB6C;
            Layout.C[0xFBAF ^ 0xFAB9] = 0xB8EC ^ 0xFAB9;
            Layout.C[0x3BE9 ^ 0x3BDC] = 0x3BE4 ^ 0x3BDC;
            Layout.C[0x6393 ^ 0x632E] = 0x6321 ^ 0x632E;
            Layout.C[0x7618 ^ 0x769A] = 0xFFFF8973 ^ 0x769A;
            Layout.C[0xF2B1 ^ 0xF260] = 0xF228 ^ 0xF260;
            Layout.C[0x9956 ^ 0x99C2] = 0x99F3 ^ 0x99C2;
            Layout.C[0x4EE2 ^ 0x4FDB] = 0xFFFFD04A ^ 0x4FDB;
            Layout.C[0xCA22 ^ 0xCAF7] = 0xFFFF3532 ^ 0xCAF7;
            Layout.C[0x92FB ^ 0x9393] = 0x196 ^ 0x9393;
            Layout.C[0x3B99 ^ 0x3BC7] = 0xFFFFC46D ^ 0x3BC7;
            Layout.C[0x50D3 ^ 0x508A] = 0xFFFFAF69 ^ 0x508A;
            Layout.C[0x638 ^ 0x754] = 0xF40B ^ 0x754;
            Layout.C[0x1430 ^ 0x1506] = 0xA418 ^ 0x1506;
            Layout.C[0x901A ^ 0x9094] = 0xFFFF6F59 ^ 0x9094;
            Layout.C[0x9310 ^ 0x9334] = 0x9343 ^ 0x9334;
            Layout.C[0xC44E ^ 0xC568] = 0xFFFF77B7 ^ 0xC568;
            Layout.C[0x2FD7 ^ 0x2F62] = 0xFFFFD0AD ^ 0x2F62;
            Layout.C[0xF3A5 ^ 0xF290] = 0xFFFFBC56 ^ 0xF290;
            Layout.C[0xF5C5 ^ 0xF54E] = 0xFFFF0A91 ^ 0xF54E;
            Layout.C[0xD669 ^ 0xD6C9] = 0x5A0A ^ 0xD6C9;
            Layout.C[0x3DC0 ^ 0x3DF8] = 0xFFFFC264 ^ 0x3DF8;
            Layout.C[0xE978 ^ 0xE91E] = 0xFFFF16D7 ^ 0xE91E;
            Layout.C[0x7315 ^ 0x729D] = 0x61BF ^ 0x729D;
            Layout.C[0x79BB ^ 0x793F] = 0x7927 ^ 0x793F;
            Layout.C[0xA670 ^ 0xA672] = 0xA668 ^ 0xA672;
            Layout.C[0xAED8 ^ 0xAFF3] = 0x46D8 ^ 0xAFF3;
            Layout.C[0xE65F ^ 0xE600] = 0xFFFF1984 ^ 0xE600;
            Layout.C[0xEFA ^ 0xE99] = 0xEC0 ^ 0xE99;
            Layout.C[0x82BD ^ 0x8261] = 0xFFFF7DA9 ^ 0x8261;
            Layout.C[0x7FD7 ^ 0x7E89] = 0xEF68 ^ 0x7E89;
            Layout.C[0xF9AB ^ 0xF9C1] = 0xF985 ^ 0xF9C1;
            Layout.C[0x6A0B ^ 0x6B5E] = 0xFFFF7BF0 ^ 0x6B5E;
            Layout.C[0x47E2 ^ 0x4794] = 0xFFFFB850 ^ 0x4794;
            Layout.C[0x77C5 ^ 0x77A4] = 0xFFFF881D ^ 0x77A4;
            Layout.C[0x3AC6 ^ 0x3A10] = 0x3A04 ^ 0x3A10;
            Layout.C[0xE01E ^ 0xE042] = 0xFFFF1FDF ^ 0xE042;
            Layout.C[0x53ED ^ 0x5303] = 0x69FF ^ 0x5303;
            Layout.C[0x651D ^ 0x6501] = 0xFFFF9AA4 ^ 0x6501;
            Layout.C[0x8DCD ^ 0x8DCC] = 0x8DB8 ^ 0x8DCC;
            Layout.C[0x800C ^ 0x8118] = 0xC35E ^ 0x8118;
            Layout.C[0xA945 ^ 0xA938] = 0xFFFF56F9 ^ 0xA938;
            Layout.C[0x8B6D ^ 0x8B19] = 0xFFFF74D1 ^ 0x8B19;
            Layout.C[0xF664 ^ 0xF627] = 0xFFFF0990 ^ 0xF627;
            Layout.C[0x87E9 ^ 0x87E7] = 0xFFFF781F ^ 0x87E7;
            Layout.C[0x2832 ^ 0x292C] = 0xFFFF8C7C ^ 0x292C;
            Layout.C[0xC2D0 ^ 0xC2A7] = 0xFFFF3D35 ^ 0xC2A7;
            Layout.C[0xD08D ^ 0xD0D7] = 0xFFFF2FEB ^ 0xD0D7;
            Layout.C[0x2EDE ^ 0x2E61] = 0x2E08 ^ 0x2E61;
            Layout.C[0x2F2C ^ 0x2F50] = 0xFFFFD082 ^ 0x2F50;
            Layout.C[0xBEDC ^ 0xBFD6] = 0xFFFF6BC0 ^ 0xBFD6;
            Layout.C[0x2FB1 ^ 0x2FD4] = 0xFFFFD024 ^ 0x2FD4;
            Layout.C[0xA31E ^ 0xA216] = 0x89F7 ^ 0xA216;
            Layout.C[0x7ECC ^ 0x7FDD] = 0xD6EC ^ 0x7FDD;
            Layout.C[0xE6AF ^ 0xE62F] = 0xFFFF198B ^ 0xE62F;
            Layout.C[0x50FF ^ 0x505C] = 0xCB55 ^ 0x505C;
            Layout.C[0xE74E ^ 0xE7A5] = 0x6DD0 ^ 0xE7A5;
            Layout.C[0xE0FC ^ 0xE090] = 0xE0FB ^ 0xE090;
            Layout.C[0xF9EB ^ 0xF907] = 0xC3A1 ^ 0xF907;
            Layout.C[0x7D9D ^ 0x7D6C] = 0xD8E9 ^ 0x7D6C;
            Layout.C[0xFEC8 ^ 0xFFE9] = 0x923F ^ 0xFFE9;
            Layout.C[0x51CA ^ 0x5186] = 0xFFFFAE18 ^ 0x5186;
            Layout.C[0xCEFD ^ 0xCFEF] = 0x669A ^ 0xCFEF;
            Layout.C[0x2427 ^ 0x2421] = 0x241F ^ 0x2421;
            Layout.C[0xE282 ^ 0xE3C1] = 0x3F03 ^ 0xE3C1;
            Layout.C[0x3E78 ^ 0x3F7C] = 0xA2DC ^ 0x3F7C;
            Layout.C[0x126B ^ 0x1282] = 0x1282 ^ 0x1282;
            Layout.C[0x519B ^ 0x51E9] = 0x5127 ^ 0x51E9;
            Layout.C[0x4D99 ^ 0x4CFD] = 0x478C ^ 0x4CFD;
            Layout.C[0x9CA0 ^ 0x9C19] = 0x9C45 ^ 0x9C19;
            Layout.C[0x7245 ^ 0x7345] = 0x17DEE ^ 0x7345;
            Layout.C[0x5466 ^ 0x543D] = 0xFFFFAB82 ^ 0x543D;
            Layout.C[0x2F6 ^ 0x2F3] = 0x2CD ^ 0x2F3;
            Layout.C[0x2F9E ^ 0x2F51] = 0x2F04 ^ 0x2F51;
            Layout.C[0x67D9 ^ 0x66A8] = 0x3624 ^ 0x66A8;
            Layout.C[0x7D68 ^ 0x7CEE] = 0x7ED2 ^ 0x7CEE;
            Layout.C[0x5EF9 ^ 0x5FFA] = 0x15151 ^ 0x5FFA;
            Layout.C[0x35F9 ^ 0x352E] = 0xFFFFCA9F ^ 0x352E;
            Layout.C[0x786 ^ 0x767] = 0xFFFFF853 ^ 0x767;
            Layout.C[0x8103 ^ 0x81AB] = 0x8A05 ^ 0x81AB;
            Layout.C[0x6D3C ^ 0x6C79] = 0xFFFF4F66 ^ 0x6C79;
            Layout.C[0xAA4E ^ 0xAB7F] = 0x7DD1 ^ 0xAB7F;
            Layout.C[0x10B44 ^ 0x10AC0] = 0x108FC ^ 0x10AC0;
            Layout.C[0x2535 ^ 0x25B6] = 0xFFFFDA70 ^ 0x25B6;
            Layout.C[0x7818 ^ 0x7849] = 0x786C ^ 0x7849;
            Layout.C[0xC364 ^ 0xC256] = 0x14A7 ^ 0xC256;
            Layout.C[0x9FCB ^ 0x9F2F] = 0x9F2E ^ 0x9F2F;
            Layout.C[0x66A1 ^ 0x67C4] = 0x6CEC ^ 0x67C4;
            Layout.C[0x6C8C ^ 0x6C91] = 0xFFFF9362 ^ 0x6C91;
            Layout.C[0xDDC0 ^ 0xDDAF] = 0xDD3B ^ 0xDDAF;
            Layout.C[0x5C41 ^ 0x5C71] = 0x5CC9 ^ 0x5C71;
            Layout.C[0x1580 ^ 0x1573] = 0xB0F6 ^ 0x1573;
            Layout.C[0x5517 ^ 0x543F] = 0xBD13 ^ 0x543F;
            Layout.C[0x373D ^ 0x37C1] = 0x3BF9 ^ 0x37C1;
            Layout.C[0x9DB9 ^ 0x9DD0] = 0x9D81 ^ 0x9DD0;
            Layout.C[0xCF15 ^ 0xCE46] = 0x2143 ^ 0xCE46;
            Layout.C[0xDEFC ^ 0xDFD8] = 0x928F ^ 0xDFD8;
            Layout.C[0x4295 ^ 0x42A3] = 0x4284 ^ 0x42A3;
            Layout.C[0x58CD ^ 0x59FE] = 0xE8E1 ^ 0x59FE;
            Layout.C[0xCCE9 ^ 0xCDE0] = 0xE605 ^ 0xCDE0;
            Layout.C[0xE63D ^ 0xE6D2] = 0xDC71 ^ 0xE6D2;
            Layout.C[0x2C7 ^ 0x204] = 0x205 ^ 0x204;
            Layout.C[0x233F ^ 0x2251] = 0xD10E ^ 0x2251;
            Layout.C[0x7FB6 ^ 0x7EBB] = 0xDB8D ^ 0x7EBB;
            Layout.C[0x37D4 ^ 0x36BE] = 0xA4BB ^ 0x36BE;
            Layout.C[0xC042 ^ 0xC11F] = 0xFFFFAF2F ^ 0xC11F;
            Layout.C[0xF49E ^ 0xF517] = 0xFFFF19EF ^ 0xF517;
            Layout.C[0x3BE ^ 0x353] = 0x39F0 ^ 0x353;
            Layout.C[0x4CB4 ^ 0x4DDF] = 0xBE9E ^ 0x4DDF;
            Layout.C[0xF8C5 ^ 0xF850] = 0xF81E ^ 0xF850;
            Layout.C[0x3553 ^ 0x35E8] = 0xFFFFCA56 ^ 0x35E8;
            Layout.C[0x6F09 ^ 0x6FAC] = 0x3160 ^ 0x6FAC;
            Layout.C[0xB7A ^ 0xB49] = 0xB3D ^ 0xB49;
            Layout.C[0xEA79 ^ 0xEA9B] = 0xFFFF1514 ^ 0xEA9B;
            Layout.C[0x5A75 ^ 0x5A5E] = 0x5A4E ^ 0x5A5E;
            Layout.C[0xB48A ^ 0xB5E7] = 0xFFFFB910 ^ 0xB5E7;
            Layout.C[0xDE11 ^ 0xDEEC] = 0xD2D6 ^ 0xDEEC;
            Layout.C[0x745C ^ 0x7533] = 0x25B4 ^ 0x7533;
            Layout.C[0x9ED1 ^ 0x9F89] = 0x5941 ^ 0x9F89;
            Layout.C[0x524 ^ 0x446] = 0x8AF ^ 0x446;
            Layout.C[0xFC98 ^ 0xFCD5] = 0xFFFF033C ^ 0xFCD5;
            Layout.C[0x1068E ^ 0x1064B] = 0x1066C ^ 0x1064B;
            Layout.C[0xBE37 ^ 0xBE1F] = 0xBE5F ^ 0xBE1F;
            Layout.C[0x1F4F ^ 0x1FAA] = 0x1FA8 ^ 0x1FAA;
            Layout.C[0xE986 ^ 0xE8D4] = 0xE0E7 ^ 0xE8D4;
            Layout.C[0x904D ^ 0x906E] = 0x9055 ^ 0x906E;
            Layout.C[0xF40D ^ 0xF42C] = 0xF412 ^ 0xF42C;
            Layout.C[0x956E ^ 0x9417] = 0xFFFF4343 ^ 0x9417;
            Layout.C[0x854B ^ 0x8477] = 0x7031 ^ 0x8477;
            Layout.C[0x52BB ^ 0x52EC] = 0x5282 ^ 0x52EC;
            Layout.C[0x9C70 ^ 0x9CB9] = 0xFFFF63D6 ^ 0x9CB9;
            Layout.C[0x6460 ^ 0x64BE] = 0xFFFF9B46 ^ 0x64BE;
            Layout.C[0x163C ^ 0x1631] = 0xFFFFE9E8 ^ 0x1631;
            Layout.C[0xC453 ^ 0xC428] = 0xFFFF3BC7 ^ 0xC428;
            Layout.C[0x10EB3 ^ 0x10E95] = 0xFFFEF158 ^ 0x10E95;
            Layout.C[0x5629 ^ 0x5657] = 0x5628 ^ 0x5657;
            Layout.C[0x85C7 ^ 0x856B] = 0x8507 ^ 0x856B;
            Layout.C[0x4C2B ^ 0x4C23] = 0x4C7C ^ 0x4C23;
            Layout.C[0x9814 ^ 0x9847] = 0xFFFF6797 ^ 0x9847;
            Layout.C[0x2CC6 ^ 0x2C12] = 0xFFFFD3D6 ^ 0x2C12;
            Layout.C[0x894A ^ 0x89CF] = 0x89D9 ^ 0x89CF;
            Layout.C[0xC518 ^ 0xC53F] = 0xFFFF3AEB ^ 0xC53F;
            Layout.C[0xE0BA ^ 0xE0B1] = 0xE0BA ^ 0xE0B1;
            Layout.C[0x7AC0 ^ 0x7A5E] = 0x2ABE ^ 0x7A5E;
            Layout.C[0x5835 ^ 0x5973] = 0x85BE ^ 0x5973;
            Layout.C[0x1FCA ^ 0x1F29] = 0xFFFFE0AC ^ 0x1F29;
            Layout.C[0x2B8D ^ 0x2B89] = 0xFFFFD402 ^ 0x2B89;
            Layout.C[0xAFC9 ^ 0xAFDA] = 0xAF9D ^ 0xAFDA;
            Layout.C[0x20CF ^ 0x21D3] = 0x7B2A ^ 0x21D3;
            Layout.C[0xEF5F ^ 0xEE03] = 0x7FE2 ^ 0xEE03;
            Layout.C[0x7F1E ^ 0x7E5A] = 0xA297 ^ 0x7E5A;
            Layout.C[0xF2D6 ^ 0xF2EF] = 0xF2E4 ^ 0xF2EF;
            Layout.C[0x84C9 ^ 0x85F4] = 0x7199 ^ 0x85F4;
            Layout.C[0xB955 ^ 0xB978] = 0xB94D ^ 0xB978;
            Layout.C[0x101D0 ^ 0x10138] = 0x10139 ^ 0x10138;
            Layout.C[0xFF37 ^ 0xFE67] = 0xF654 ^ 0xFE67;
            Layout.C[0x51D5 ^ 0x50B6] = 0x5BD6 ^ 0x50B6;
            Layout.C[0x634B ^ 0x6309] = 0xFFFF9CF4 ^ 0x6309;
            Layout.C[0x9663 ^ 0x9663] = 0x9603 ^ 0x9663;
            Layout.C[0x7B20 ^ 0x7B50] = 0x7B00 ^ 0x7B50;
            Layout.C[0xA10 ^ 0xB90] = 0x296D ^ 0xB90;
            Layout.C[0xE1D3 ^ 0xE0FC] = 0x360A ^ 0xE0FC;
            Layout.C[0x57DE ^ 0x5794] = 0x57C6 ^ 0x5794;
            Layout.C[0xE622 ^ 0xE739] = 0x34DC ^ 0xE739;
            Layout.C[0x2710 ^ 0x27A0] = 0x27B9 ^ 0x27A0;
            Layout.C[0xF386 ^ 0xF2B1] = 0x92A0 ^ 0xF2B1;
            Layout.C[0xCF22 ^ 0xCE56] = 0x7851 ^ 0xCE56;
            Layout.C[0xDC61 ^ 0xDC77] = 0xDC53 ^ 0xDC77;
            Layout.C[0xD41A ^ 0xD51B] = 0x1DBB0 ^ 0xD51B;
            Layout.C[0xEE99 ^ 0xEF95] = 0x4AA5 ^ 0xEF95;
            Layout.C[0x30AA ^ 0x301C] = 0xFFFFCF96 ^ 0x301C;
            Layout.C[0x833D ^ 0x82BE] = 0x8084 ^ 0x82BE;
            Layout.C[0x639 ^ 0x690] = 0xC8DF ^ 0x690;
            Layout.C[0xF611 ^ 0xF6D3] = 0xF698 ^ 0xF6D3;
            Layout.C[0xB73D ^ 0xB666] = 0x278F ^ 0xB666;
            Layout.C[0x3646 ^ 0x3731] = 0x1FE6 ^ 0x3731;
            Layout.C[0xE396 ^ 0xE39A] = 0xFFFF1C7E ^ 0xE39A;
            Layout.C[0x98A ^ 0x8D0] = 0xCE18 ^ 0x8D0;
            Layout.C[0xA63D ^ 0xA76C] = 0xAF17 ^ 0xA76C;
            Layout.C[0xD0D9 ^ 0xD1DC] = 0x4C75 ^ 0xD1DC;
            Layout.C[0x3DD5 ^ 0x3D5A] = 0x3D4D ^ 0x3D5A;
            Layout.C[0x6AA3 ^ 0x6A12] = 0x6A08 ^ 0x6A12;
            Layout.C[0x2212 ^ 0x223B] = 0xFFFFDDA7 ^ 0x223B;
            Layout.C[0xAE78 ^ 0xAE6D] = 0xAE75 ^ 0xAE6D;
            Layout.C[0x64B3 ^ 0x64F8] = 0x64AF ^ 0x64F8;
            Layout.C[0xFCA ^ 0xE9E] = 0xE191 ^ 0xE9E;
            Layout.C[0xB3F7 ^ 0xB2F5] = 0xFFFE43BE ^ 0xB2F5;
            Layout.C[0x1987 ^ 0x19EC] = 0x19E7 ^ 0x19EC;
            Layout.C[0x18A0 ^ 0x185B] = 0x8F69 ^ 0x185B;
            Layout.C[0xDF88 ^ 0xDEBC] = 0x6FA2 ^ 0xDEBC;
            Layout.C[0x87CE ^ 0x864F] = 0xA49F ^ 0x864F;
            Layout.C[0xEF97 ^ 0xEFB9] = 0xEF9E ^ 0xEFB9;
            Layout.C[0x5D33 ^ 0x5C7A] = 0x1C1D ^ 0x5C7A;
            Layout.C[0x5D54 ^ 0x5D12] = 0xFFFFA2DB ^ 0x5D12;
            Layout.C[0x9872 ^ 0x98DF] = 0x98F2 ^ 0x98DF;
            Layout.C[0x96E ^ 0x8E2] = 0x8C42 ^ 0x8E2;
            Layout.C[0x7D60 ^ 0x7D13] = 0xFFFF8299 ^ 0x7D13;
            Layout.C[0x7871 ^ 0x7851] = 0xFFFF8786 ^ 0x7851;
            Layout.C[0x79DA ^ 0x79BE] = 0x79F7 ^ 0x79BE;
            Layout.C[0xD4B4 ^ 0xD5ED] = 0x132D ^ 0xD5ED;
            Layout.C[0x98CA ^ 0x9802] = 0x9851 ^ 0x9802;
            Layout.C[0x565 ^ 0x45E] = 0xF016 ^ 0x45E;
            Layout.C[0x4ED2 ^ 0x4E9B] = 0xFFFFB154 ^ 0x4E9B;
            Layout.C[0x8C82 ^ 0x8CEF] = 0xFFFF733D ^ 0x8CEF;
            Layout.C[0x742F ^ 0x74F4] = 0x74E9 ^ 0x74F4;
            Layout.C[0xE85 ^ 0xED5] = 0xEB2 ^ 0xED5;
            Layout.C[0xC497 ^ 0xC5DF] = 0x85C1 ^ 0xC5DF;
            Layout.C[0x61D4 ^ 0x6153] = 0xFFFF9EC0 ^ 0x6153;
            Layout.C[0x29E5 ^ 0x296C] = 0xFFFFD68D ^ 0x296C;
            Layout.C[0x806C ^ 0x817C] = 0x2842 ^ 0x817C;
            Layout.C[0xF9A8 ^ 0xF9C8] = 0xF948 ^ 0xF9C8;
            Layout.C[0xD637 ^ 0xD72E] = 0x4CB ^ 0xD72E;
            Layout.C[0x5030 ^ 0x5065] = 0xFFFFAFE3 ^ 0x5065;
            Layout.C[0x2F86 ^ 0x2F40] = 0x2F6F ^ 0x2F40;
            Layout.C[0x8CEC ^ 0x8CF4] = 0xFFFF730A ^ 0x8CF4;
            Layout.C[0x2A11 ^ 0x2A33] = 0xFFFFD5C8 ^ 0x2A33;
            Layout.C[0x837C ^ 0x8373] = 0xFFFF7C15 ^ 0x8373;
            Layout.C[0x7C8F ^ 0x7DEE] = 0xFFFF8EE8 ^ 0x7DEE;
            Layout.C[0x24DA ^ 0x25A7] = 0x6F91 ^ 0x25A7;
            Layout.C[0xA467 ^ 0xA492] = 0x1AE9B ^ 0xA492;
            Layout.C[0x92D5 ^ 0x92E4] = 0xFFFF6D4C ^ 0x92E4;
            Layout.C[0x9125 ^ 0x9165] = 0x9143 ^ 0x9165;
            Layout.C[0x7CE5 ^ 0x7C2E] = 0x7C17 ^ 0x7C2E;
            Layout.C[0x2E48 ^ 0x2E57] = 0x2E47 ^ 0x2E57;
            Layout.C[0xD3BC ^ 0xD2C3] = 0xF026 ^ 0xD2C3;
            Layout.C[0x10BE2 ^ 0x10A67] = 0xFFFEF7A4 ^ 0x10A67;
            Layout.C[0x107CD ^ 0x10741] = 0x1076E ^ 0x10741;
            Layout.C[0x76B3 ^ 0x77CD] = 0x3D84 ^ 0x77CD;
            Layout.C[0xB637 ^ 0xB6ED] = 0xB6E0 ^ 0xB6ED;
            Layout.C[0x889E ^ 0x885A] = 0xFFFF77E0 ^ 0x885A;
            Layout.C[0x76A ^ 0x712] = 0x760 ^ 0x712;
            Layout.C[0x4EAE ^ 0x4E82] = 0x4EEB ^ 0x4E82;
            Layout.C[0xFA8 ^ 0xF93] = 0xFFFFF073 ^ 0xF93;
            Layout.C[0xF043 ^ 0xF114] = 0x37D7 ^ 0xF114;
            Layout.C[0xF918 ^ 0xF95D] = 0xFFFF06DA ^ 0xF95D;
            Layout.C[0xCA61 ^ 0xCB01] = 0xC7E8 ^ 0xCB01;
            Layout.C[0x7B72 ^ 0x7BF4] = 0x7BFA ^ 0x7BF4;
            Layout.C[0xFD0A ^ 0xFD92] = 0xFD93 ^ 0xFD92;
            Layout.C[0x6796 ^ 0x66A8] = 0x92EE ^ 0x66A8;
            Layout.C[0xB2EA ^ 0xB226] = 0xFFFF4DFD ^ 0xB226;
            Layout.C[0x1E43 ^ 0x1ED3] = 0xFFFFE133 ^ 0x1ED3;
            Layout.C[0x6453 ^ 0x646F] = 0x6465 ^ 0x646F;
            Layout.C[0x5119 ^ 0x516C] = 0xFFFFAE1A ^ 0x516C;
            Layout.C[0xECCB ^ 0xECBA] = 0xEC9E ^ 0xECBA;
            Layout.C[0xCF9F ^ 0xCF67] = 0x585F ^ 0xCF67;
            Layout.C[0x860D ^ 0x8642] = 0x8661 ^ 0x8642;
            Layout.C[0xF5CA ^ 0xF512] = 0xF516 ^ 0xF512;
            Layout.C[0x29EC ^ 0x293F] = 0xFFFFD6C7 ^ 0x293F;
            Layout.C[0x89AD ^ 0x8963] = 0x892C ^ 0x8963;
            Layout.C[0x571F ^ 0x574D] = 0xFFFFA886 ^ 0x574D;
            Layout.C[0x92C0 ^ 0x92DE] = 0xFFFF6D18 ^ 0x92DE;
            Layout.C[0x3331 ^ 0x33CF] = 0x3FA3 ^ 0x33CF;
            Layout.C[0x865B ^ 0x87D4] = 0xAA2B ^ 0x87D4;
            Layout.C[0x3A9E ^ 0x3BB9] = 0x76E2 ^ 0x3BB9;
            Layout.C[0x102C3 ^ 0x10279] = 0x10255 ^ 0x10279;
            Layout.C[0xB735 ^ 0xB70B] = 0xB731 ^ 0xB70B;
            Layout.C[0x2504 ^ 0x2402] = 0xFFFF464B ^ 0x2402;
            Layout.C[0xF7D1 ^ 0xF7AB] = 0xFFFF0811 ^ 0xF7AB;
            Layout.C[0x24BC ^ 0x245A] = 0x245A ^ 0x245A;
            Layout.C[0xF4CA ^ 0xF48E] = 0xF4A4 ^ 0xF48E;
            Layout.C[0xC095 ^ 0xC018] = 0xC03F ^ 0xC018;
            Layout.C[0x7993 ^ 0x796A] = 0xEE58 ^ 0x796A;
            Layout.C[0x1C92 ^ 0x1D88] = 0xFFFF31B8 ^ 0x1D88;
            Layout.C[0x3D86 ^ 0x3D85] = 0xFFFFC24D ^ 0x3D85;
            Layout.C[0xC532 ^ 0xC522] = 0xC547 ^ 0xC522;
            Layout.C[0x104DC ^ 0x10492] = 0xFFFEFB08 ^ 0x10492;
            Layout.C[0x10A8C ^ 0x10A8B] = 0xFFFEF55E ^ 0x10A8B;
            Layout.C[0x1086D ^ 0x10978] = 0x14B36 ^ 0x10978;
            Layout.C[0xA68F ^ 0xA7FD] = 0xF76F ^ 0xA7FD;
            Layout.C[0x81AE ^ 0x81B5] = 0xFFFF7E01 ^ 0x81B5;
            Layout.C[0x6BD7 ^ 0x6AAB] = 0x20E2 ^ 0x6AAB;
            Layout.C[0x10902 ^ 0x109B5] = 0x10978 ^ 0x109B5;
            Layout.C[0x827D ^ 0x835E] = 0xEE88 ^ 0x835E;
            Layout.C[0xADD5 ^ 0xAD7F] = 0xAD7F ^ 0xAD7F;
            Layout.C[0x100F5 ^ 0x100EC] = 0xFFFEFF0A ^ 0x100EC;
            Layout.C[0xEB92 ^ 0xEB52] = 0xEB27 ^ 0xEB52;
            Layout.C[0xF03D ^ 0xF1B6] = 0x750F ^ 0xF1B6;
            Layout.C[0x695E ^ 0x69F8] = 0xE784 ^ 0x69F8;
            Layout.C[0xC823 ^ 0xC91C] = 0xB29 ^ 0xC91C;
            Layout.C[0x8EBC ^ 0x8E4B] = 0x18442 ^ 0x8E4B;
            Layout.C[0x3B8F ^ 0x3BB5] = 0x3B9F ^ 0x3BB5;
            Layout.C[0x6612 ^ 0x6738] = 0xFFFF719E ^ 0x6738;
            Layout.C[0x5CF4 ^ 0x5CD1] = 0xFFFFA36F ^ 0x5CD1;
            Layout.C[0x37A3 ^ 0x36CA] = 0xFFFF5B5A ^ 0x36CA;
            Layout.C[0x3BA0 ^ 0x3AC6] = 0x31B7 ^ 0x3AC6;
            Layout.C[0x10DD7 ^ 0x10C5D] = 0x11F7F ^ 0x10C5D;
            Layout.C[0x86EA ^ 0x8799] = 0x3181 ^ 0x8799;
            Layout.C[0x838A ^ 0x836A] = 0xFFFF7CDD ^ 0x836A;
            Layout.C[0xEF30 ^ 0xEFA7] = 0xEFA7 ^ 0xEFA7;
            Layout.C[0xF8E5 ^ 0xF9C8] = 0x71AA ^ 0xF9C8;
            Layout.C[0x41F1 ^ 0x4150] = 0x4F45 ^ 0x4150;
            Layout.C[0xDC8D ^ 0xDC12] = 0xA022 ^ 0xDC12;
            Layout.C[0xE9A0 ^ 0xE91E] = 0xFFFF16B9 ^ 0xE91E;
            Layout.C[0xA43E ^ 0xA466] = 0xFFFF5BF3 ^ 0xA466;
            Layout.C[0x4F4E ^ 0x4E36] = 0x66E3 ^ 0x4E36;
            Layout.C[0x5474 ^ 0x547D] = 0x5472 ^ 0x547D;
            Layout.C[0x98A3 ^ 0x98DA] = 0x98EF ^ 0x98DA;
            Layout.C[0x64E5 ^ 0x65A4] = 0xA794 ^ 0x65A4;
            Layout.C[0xF55E ^ 0xF413] = 0xE4E2 ^ 0xF413;
            Layout.C[0x9E4F ^ 0x9EFC] = 0x9E97 ^ 0x9EFC;
            Layout.C[0x8B62 ^ 0x8BD0] = 0xFFFF741F ^ 0x8BD0;
            Layout.C[0x227F ^ 0x22E3] = 0x22E3 ^ 0x22E3;
            Layout.C[0xF9FC ^ 0xF921] = 0xFFFF06D4 ^ 0xF921;
            Layout.C[0xB7A ^ 0xBE1] = 0xBE1 ^ 0xBE1;
            Layout.C[0x101C1 ^ 0x1009E] = 0x10C63 ^ 0x1009E;
            Layout.C[0x22B7 ^ 0x23AF] = 0xF047 ^ 0x23AF;
            Layout.C[0x98C0 ^ 0x99BA] = 0xB16F ^ 0x99BA;
            Layout.C[0xB32C ^ 0xB378] = 0xFFFF4CA8 ^ 0xB378;
            Layout.C[0x2368 ^ 0x2241] = 0xCB6A ^ 0x2241;
            Layout.C[0x2552 ^ 0x2459] = 0xFBC ^ 0x2459;
            Layout.C[0x10D02 ^ 0x10C74] = 0x1BA73 ^ 0x10C74;
            Layout.C[0xA183 ^ 0xA0B3] = 0x7642 ^ 0xA0B3;
            Layout.C[0x592C ^ 0x59BF] = 0x59E0 ^ 0x59BF;
            Layout.C[0x1056F ^ 0x10540] = 0x1055B ^ 0x10540;
            Layout.C[0xE02E ^ 0xE092] = 0xFFFF1F20 ^ 0xE092;
        }
    }

    @Metadata(mv={2, 3, 0}, k=1, xi=48, d1={"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0007\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\b\u0082\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u00a2\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\b\u000b\u0010\nJ\u0010\u0010\f\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\b\f\u0010\nJ\u0010\u0010\r\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\b\r\u0010\nJ8\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0002H\u00c6\u0001\u00a2\u0006\u0004\b\u000e\u0010\u000fJ\u001b\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001H\u00d6\u0083\u0004\u00a2\u0006\u0004\b\u0012\u0010\u0013J\u0011\u0010\u0015\u001a\u00020\u0014H\u00d6\u0081\u0004\u00a2\u0006\u0004\b\u0015\u0010\u0016J\u0011\u0010\u0018\u001a\u00020\u0017H\u00d6\u0081\u0004\u00a2\u0006\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0003\u001a\u00020\u00028\u0006\u00a2\u0006\f\n\u0004\b\u0003\u0010\u001a\u001a\u0004\b\u001b\u0010\nR\u0017\u0010\u0004\u001a\u00020\u00028\u0006\u00a2\u0006\f\n\u0004\b\u0004\u0010\u001a\u001a\u0004\b\u001c\u0010\nR\u0017\u0010\u0005\u001a\u00020\u00028\u0006\u00a2\u0006\f\n\u0004\b\u0005\u0010\u001a\u001a\u0004\b\u001d\u0010\nR\u0017\u0010\u0006\u001a\u00020\u00028\u0006\u00a2\u0006\f\n\u0004\b\u0006\u0010\u001a\u001a\u0004\b\u001e\u0010\n\u00a8\u0006\u001f"}, d2={"Lkotakbaz/rain/ui/menu/settings/impl/ColorSettingComponent$Rect;", "", "", "x", "y", "width", "height", "<init>", "(FFFF)V", "component1", "()F", "component2", "component3", "component4", "copy", "(FFFF)Lkotakbaz/rain/ui/menu/settings/impl/ColorSettingComponent$Rect;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "F", "getX", "getY", "getWidth", "getHeight", "rain-visuals"})
    private static final class Rect {
        private final float x;
        private final float y;
        private final float width;
        private final float height;
        private static Object[] a;
        private static Object b;
        private static Object[] B;
        private static Object[] A;
        private static Object[] c;
        public static int[] C;

        public Rect(float x2, float y, float width2, float height) {
            this.x = x2;
            this.y = y;
            this.width = width2;
            this.height = height;
        }

        public final float getX() {
            return this.x;
        }

        public final float getY() {
            return this.y;
        }

        public final float getWidth() {
            return this.width;
        }

        public final float getHeight() {
            return this.height;
        }

        public final float component1() {
            return this.x;
        }

        public final float component2() {
            return this.y;
        }

        public final float component3() {
            return this.width;
        }

        public final float component4() {
            return this.height;
        }

        @NotNull
        public final Rect copy(float x2, float y, float width2, float height) {
            return new Rect(x2, y, width2, height);
        }

        public static /* synthetic */ Rect copy$default(Rect rect, float f2, float f3, float f4, float f5, int n2, Object object) {
            int n3 = C[0];
            n3 += C[1];
            if ((n2 & (n3 ^= C[2])) != 0) {
                f2 = rect.x;
            }
            int n4 = C[3];
            n4 -= C[4];
            if ((n2 & (n4 += C[5])) != 0) {
                f3 = rect.y;
            }
            int n5 = C[6];
            n5 += C[7];
            if ((n2 & (n5 -= C[8])) != 0) {
                f4 = rect.width;
            }
            int n6 = C[9];
            n6 ^= C[10];
            if ((n2 & (n6 -= C[11])) != 0) {
                f5 = rect.height;
            }
            return rect.copy(f2, f3, f4, f5);
        }

        @NotNull
        public String toString() {
            float f2 = this.height;
            float f3 = this.width;
            float f4 = this.y;
            float f5 = this.x;
            int n2 = C[12];
            n2 -= C[13];
            n2 += C[14];
            int n3 = C[15];
            n3 += C[16];
            n3 ^= C[17];
            int n4 = C[18];
            n4 += C[19];
            int n5 = C[21];
            n5 += C[22];
            int n6 = C[24];
            n6 += C[25];
            return (String)a[n2] + f5 + (String)a[n3] + f4 + (String)a[n4 ^= C[20]] + f3 + (String)a[n5 ^= C[23]] + f2 + (String)a[n6 ^= C[26]];
        }

        public int hashCode() {
            long l2 = 5078727161023471302L;
            long l3 = -4550760943887229659L;
            long l4 = -8726132930218422735L;
            long l5 = 8660701268955735430L;
            int n2 = C[27];
            n2 -= C[28];
            long l6 = l5;
            int n3 = C[30];
            n3 += C[31];
            l5 = l6 ^ ((long)Float.hashCode(this.x) << (n2 -= C[29]) ^ l6) & -1L << (n3 ^= C[32]);
            int n4 = C[33];
            n4 -= C[34];
            n4 -= C[35];
            int n5 = C[36];
            n5 -= C[37];
            n5 += C[38];
            int n6 = C[39];
            n6 += C[40];
            long l7 = l5;
            int n7 = C[42];
            n7 -= C[43];
            l5 = l7 ^ ((long)((int)(l5 >>> n4) * n5 + Float.hashCode(this.y)) << (n6 += C[41]) ^ l7) & -1L << (n7 ^= C[44]);
            int n8 = C[45];
            n8 ^= C[46];
            n8 += C[47];
            int n9 = C[48];
            n9 ^= C[49];
            n9 += C[50];
            int n10 = C[51];
            n10 -= C[52];
            long l8 = l5;
            int n11 = C[54];
            n11 -= C[55];
            l5 = l8 ^ ((long)((int)(l5 >>> n8) * n9 + Float.hashCode(this.width)) << (n10 -= C[53]) ^ l8) & -1L << (n11 += C[56]);
            int n12 = C[57];
            n12 += C[58];
            n12 += C[59];
            int n13 = C[60];
            n13 -= C[61];
            n13 ^= C[62];
            int n14 = C[63];
            n14 -= C[64];
            long l9 = l5;
            int n15 = C[66];
            n15 += C[67];
            l5 = l9 ^ ((long)((int)(l5 >>> n12) * n13 + Float.hashCode(this.height)) << (n14 -= C[65]) ^ l9) & -1L << (n15 -= C[68]);
            int n16 = C[69];
            n16 ^= C[70];
            return (int)(l5 >>> (n16 += C[71]));
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                boolean bl = C[72];
                bl += C[73];
                return bl -= C[74];
            }
            if (!(other instanceof Rect)) {
                boolean bl = C[75];
                bl ^= C[76];
                return bl += C[77];
            }
            Rect rect = (Rect)other;
            if (Float.compare(this.x, rect.x) != 0) {
                boolean bl = C[78];
                bl += C[79];
                return bl ^= C[80];
            }
            if (Float.compare(this.y, rect.y) != 0) {
                boolean bl = C[81];
                bl += C[82];
                return bl ^= C[83];
            }
            if (Float.compare(this.width, rect.width) != 0) {
                boolean bl = C[84];
                bl ^= C[85];
                return bl -= C[86];
            }
            if (Float.compare(this.height, rect.height) != 0) {
                boolean bl = C[87];
                bl -= C[88];
                return bl -= C[89];
            }
            boolean bl = C[90];
            bl ^= C[91];
            return bl ^= C[92];
        }

        static {
            Rect.b();
            long l2 = -7984666116545553740L;
            long l3 = 2669729391377399517L;
            long l4 = 3478986578536752910L;
            long l5 = -1708259728101234991L;
            long l6 = 8651526864674575814L;
            long l7 = -7884634310561739707L;
            long l8 = 6267659000211011166L;
            long l9 = -7884569277037092439L;
            long l10 = -7727705092300189240L;
            long l11 = -4104915286397222771L;
            long l12 = -3729388531433928167L;
            long l13 = -9204714157966101897L;
            long l14 = 7648181213707731324L;
            long l15 = -4750246704192507147L;
            int n2 = C[93];
            n2 ^= C[94];
            a = new Object[n2 -= C[95]];
            long l16 = l15;
            int n3 = C[96];
            n3 += C[97];
            l15 = l16 ^ (0L ^ l16) & -1L << (n3 += C[98]);
            Object[] objectArray = new Object[C[99]];
            objectArray[Rect.C[100]] = A;
            objectArray[Rect.C[101]] = C[102];
            int n4 = C[103];
            Object object = Rect.A()[C[104]];
            if (object == null) {
                char[] cArray = "\ub320\ub977\ub2ca\ub9a6\ub2ea\ub2b6\ub9a6\ub2d8\ub30d\ub2bd\ub97f\ub976\ub2b3\ub30c\ub320\ub2bd\ub979\ub2c2\ub97a\ub2d8\ub978\ub1e2\ub2d6\ub320\ub2e9\ub30d\ub2b7\ub992\ub1e1\ub30c\ub322\ub30e\ub9ae\ub2da\ub9af\ub2b7\ub2f1\ub2c1\ub9ad\ub9a4\ub2b7\ub2bf\ub2d5\ub97f\ub304\ub2d5\ub2c0\ub303\ub2ba\ub2bd\ub2d5\ub2d6\ub2d4\ub2e9\ub2da\ub306\ub304\ub2f1\ub2ca\ub2ec\ub2d3\ub2c0\ub97a\ub2d9\ub321\ub30d\ub977\ub2f2\ub2df\ub2d4\ub2d3\ub9ad\ub2da\ub2d7\ub2d5\ub2ca\ub97a\ub2e9\ub2c2\ub2d6\ub2f0\ub2d3\ub9a3\ub2d7\ub2e9\ub990\ub2be\ub2be".toCharArray();
                for (int i2 = C[105]; i2 < C[106]; ++i2) {
                    int n5 = cArray[i2];
                    n5 -= C[107];
                    n5 ^= C[108];
                    n5 ^= C[109];
                    n5 += C[110];
                    n5 -= C[111];
                    n5 ^= C[112];
                    n5 ^= C[113];
                    n5 ^= C[114];
                    n5 -= C[115];
                    n5 ^= C[116];
                    cArray[i2] = (char)(n5 -= C[117]);
                }
                object = Rect.A()[Rect.C[118]] = new String(cArray);
            }
            objectArray[n4] = (String)object;
            char[] cArray = ((String)Rect.a(objectArray)).toCharArray();
            long l17 = l6;
            int n6 = C[119];
            n6 ^= C[120];
            l6 = l17 ^ (0x2700000000L ^ l17) & -1L << (n6 += C[121]);
            long l18 = l13;
            int n7 = C[122];
            n7 ^= C[123];
            l13 = l18 ^ (0L ^ l18) & -1L >>> (n7 += C[124]);
            while (true) {
                int n8 = C[125];
                n8 += C[126];
                if ((int)l13 >= (int)(l6 >>> (n8 -= C[127]))) break;
                int n9 = (int)l13;
                long l19 = l13;
                int n10 = C[128];
                n10 -= C[129];
                int n11 = C[131];
                n11 ^= C[132];
                l13 = l19 ^ (l19 ^ l19 + (long)(n10 -= C[130])) & -1L >>> (n11 += C[133]);
                long l20 = l9;
                int n12 = C[134];
                n12 ^= C[135];
                l9 = l20 ^ ((long)cArray[n9] ^ l20) & -1L >>> (n12 -= C[136]);
                int n13 = (int)l13;
                long l21 = l13;
                int n14 = C[137];
                n14 -= C[138];
                int n15 = C[140];
                n15 -= C[141];
                l13 = l21 ^ (l21 ^ l21 + (long)(n14 ^= C[139])) & -1L >>> (n15 ^= C[142]);
                int n16 = C[143];
                n16 ^= C[144];
                long l22 = l10;
                int n17 = C[146];
                n17 -= C[147];
                l10 = l22 ^ ((long)cArray[n13] << (n16 ^= C[145]) ^ l22) & -1L << (n17 += C[148]);
                int n18 = C[149];
                n18 -= C[150];
                n18 -= C[151];
                int n19 = C[152];
                n19 ^= C[153];
                long l23 = l12;
                int n20 = C[155];
                n20 += C[156];
                l12 = l23 ^ ((long)((int)l9 << n18 | (int)(l10 >>> (n19 ^= C[154]))) ^ l23) & -1L >>> (n20 += C[157]);
                char[] cArray2 = new char[(int)l12];
                long l24 = l14;
                int n21 = C[158];
                n21 -= C[159];
                l14 = l24 ^ (0L ^ l24) & -1L << (n21 -= C[160]);
                while (true) {
                    int n22 = C[161];
                    n22 ^= C[162];
                    if ((int)(l14 >>> (n22 -= C[163])) >= (int)l12) break;
                    int n23 = C[164];
                    n23 -= C[165];
                    int n24 = C[167];
                    n24 += C[168];
                    cArray2[(int)(l14 >>> (n23 ^= Rect.C[166]))] = cArray[(int)l13 + (int)(l14 >>> (n24 ^= C[169]))];
                    l14 += 0x100000000L;
                }
                int n25 = C[170];
                n25 -= C[171];
                int n26 = (int)(l15 >>> (n25 -= C[172]));
                l15 += 0x100000000L;
                Rect.a[n26] = new String(cArray2);
                long l25 = l13;
                int n27 = C[173];
                n27 += C[174];
                l13 = l25 ^ ((long)((int)l13 + (int)l12) ^ l25) & -1L >>> (n27 -= C[175]);
            }
        }

        public static Object a(Object[] object) {
            Object object2;
            int n2 = (Integer)object[C[176]];
            String string = (String)object[C[177]];
            object = object[C[178]];
            Object[] objectArray = B;
            if (B == null) {
                objectArray = B = new Object[C[179]];
            }
            if ((object2 = objectArray[n2]) == null) {
                Object object3 = object;
                if (object == null) {
                    Object[] objectArray2 = new Object[C[180]];
                    A = objectArray2;
                    object3 = objectArray2;
                    byte[] byArray = new byte[C[182] ^ C[183]];
                    byArray[Rect.C[184] ^ Rect.C[185]] = C[186] ^ C[187];
                    byArray[Rect.C[188] ^ Rect.C[189]] = C[190] ^ C[191];
                    byArray[Rect.C[192] ^ Rect.C[193]] = C[194] ^ C[195];
                    byArray[Rect.C[196] ^ Rect.C[197]] = C[198] ^ C[199];
                    byArray[Rect.C[200] ^ Rect.C[201]] = C[202] ^ C[203];
                    byArray[Rect.C[204] ^ Rect.C[205]] = C[206] ^ C[207];
                    byArray[Rect.C[208] ^ Rect.C[209]] = C[210] ^ C[211];
                    byArray[Rect.C[212] ^ Rect.C[213]] = C[214] ^ C[215];
                    byArray[Rect.C[216] ^ Rect.C[217]] = C[218] ^ C[219];
                    byArray[Rect.C[220] ^ Rect.C[221]] = C[222] ^ C[223];
                    byArray[Rect.C[224] ^ Rect.C[225]] = C[226] ^ C[227];
                    byArray[Rect.C[228] ^ Rect.C[229]] = C[230] ^ C[231];
                    byArray[Rect.C[232] ^ Rect.C[233]] = C[234] ^ C[235];
                    byArray[Rect.C[236] ^ Rect.C[237]] = C[238] ^ C[239];
                    byArray[Rect.C[240] ^ Rect.C[241]] = C[242] ^ C[243];
                    byArray[Rect.C[244] ^ Rect.C[245]] = C[246] ^ C[247];
                    objectArray2[Rect.C[181]] = byArray;
                }
                byte[] byArray = (byte[])object3[C[248]];
                if (b == null) {
                    byte[] byArray2 = new byte[C[249] ^ C[250]];
                    byArray2[Rect.C[251] ^ Rect.C[252]] = C[253] ^ C[254];
                    byArray2[Rect.C[255] ^ Rect.C[256]] = C[257] ^ C[258];
                    byArray2[Rect.C[259] ^ Rect.C[260]] = C[261] ^ C[262];
                    byArray2[Rect.C[263] ^ Rect.C[264]] = C[265] ^ C[266];
                    byArray2[Rect.C[267] ^ Rect.C[268]] = C[269] ^ C[270];
                    byArray2[Rect.C[271] ^ Rect.C[272]] = C[273] ^ C[274];
                    byArray2[Rect.C[275] ^ Rect.C[276]] = C[277] ^ C[278];
                    byArray2[Rect.C[279] ^ Rect.C[280]] = C[281] ^ C[282];
                    byArray2[Rect.C[283] ^ Rect.C[284]] = C[285] ^ C[286];
                    byArray2[Rect.C[287] ^ Rect.C[288]] = C[289] ^ C[290];
                    byArray2[Rect.C[291] ^ Rect.C[292]] = C[293] ^ C[294];
                    byArray2[Rect.C[295] ^ Rect.C[296]] = C[297] ^ C[298];
                    byArray2[Rect.C[299] ^ Rect.C[300]] = C[301] ^ C[302];
                    byArray2[Rect.C[303] ^ Rect.C[304]] = C[305] ^ C[306];
                    byArray2[Rect.C[307] ^ Rect.C[308]] = C[309] ^ C[310];
                    byArray2[Rect.C[311] ^ Rect.C[312]] = C[313] ^ C[314];
                    byArray2[Rect.C[315] ^ Rect.C[316]] = C[317] ^ C[318];
                    byArray2[Rect.C[319] ^ Rect.C[320]] = C[321] ^ C[322];
                    byArray2[Rect.C[323] ^ Rect.C[324]] = C[325] ^ C[326];
                    byArray2[Rect.C[327] ^ Rect.C[328]] = C[329] ^ C[330];
                    byArray2[Rect.C[331] ^ Rect.C[332]] = C[333] ^ C[334];
                    byArray2[Rect.C[335] ^ Rect.C[336]] = C[337] ^ C[338];
                    byArray2[Rect.C[339] ^ Rect.C[340]] = C[341] ^ C[342];
                    byArray2[Rect.C[343] ^ Rect.C[344]] = C[345] ^ C[346];
                    byArray2[Rect.C[347] ^ Rect.C[348]] = C[349] ^ C[350];
                    byArray2[Rect.C[351] ^ Rect.C[352]] = C[353] ^ C[354];
                    byArray2[Rect.C[355] ^ Rect.C[356]] = C[357] ^ C[358];
                    byArray2[Rect.C[359] ^ Rect.C[360]] = C[361] ^ C[362];
                    byArray2[Rect.C[363] ^ Rect.C[364]] = C[365] ^ C[366];
                    byArray2[Rect.C[367] ^ Rect.C[368]] = C[369] ^ C[370];
                    byArray2[Rect.C[371] ^ Rect.C[372]] = C[373] ^ C[374];
                    byArray2[Rect.C[375] ^ Rect.C[376]] = C[377] ^ C[378];
                    byte[] byArray3 = new byte[byArray.length + byArray2.length];
                    System.arraycopy(byArray, C[379], byArray3, C[380], byArray.length);
                    System.arraycopy(byArray2, C[381], byArray3, byArray.length, byArray2.length);
                    Object object4 = Rect.A()[C[382]];
                    if (object4 == null) {
                        char[] cArray = "\u7aa9\u7ad7\u7a3e\u7ac5\u7ac3\u7ac7\u7ad2\u7aa0\u7ab5\u7aa1\u7ac1\u7a8c\u7ab8\u7ab6\u7aa6\u7ac1\u7ad8\u7ac8".toCharArray();
                        for (int i2 = C[383]; i2 < C[384]; ++i2) {
                            int n3 = cArray[i2];
                            n3 ^= C[385];
                            n3 += C[386];
                            n3 += C[387];
                            n3 += C[388];
                            n3 ^= C[389];
                            n3 += C[390];
                            n3 += C[391];
                            n3 -= C[392];
                            n3 ^= C[393];
                            n3 ^= C[394];
                            n3 += C[395];
                            cArray[i2] = (char)(n3 -= C[396]);
                        }
                        object4 = Rect.A()[Rect.C[397]] = new String(cArray);
                    }
                    SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance((String)object4);
                    byte[] byArray4 = new byte[C[398]];
                    byArray4[Rect.C[399]] = 119;
                    byArray4[4] = 101;
                    byArray4[2] = 63;
                    byArray4[14] = -122;
                    byArray4[7] = -59;
                    byArray4[11] = 59;
                    byArray4[6] = -125;
                    byArray4[8] = -78;
                    byArray4[9] = -12;
                    byArray4[15] = -90;
                    byArray4[3] = 118;
                    byArray4[1] = 72;
                    byArray4[13] = -112;
                    byArray4[10] = 24;
                    byArray4[5] = -107;
                    byArray4[12] = 69;
                    PBEKeySpec pBEKeySpec = new PBEKeySpec(new String(byArray3, StandardCharsets.UTF_8).toCharArray(), byArray4, 1, 256);
                    byte[] byArray5 = secretKeyFactory.generateSecret(pBEKeySpec).getEncoded();
                    Object object5 = Rect.A()[2];
                    if (object5 == null) {
                        char[] cArray = "\udb57\udb63\udb6d".toCharArray();
                        for (int i3 = 0; i3 < 3; ++i3) {
                            int n4 = cArray[i3];
                            n4 ^= 0xBF50;
                            n4 += 42657;
                            n4 ^= 0x6821;
                            n4 ^= 0x2321;
                            n4 ^= 0xE894;
                            n4 += 51142;
                            n4 -= 40760;
                            n4 ^= 0xADF8;
                            n4 ^= 0x5559;
                            n4 ^= 0x689A;
                            n4 ^= 0x21BC;
                            cArray[i3] = (char)(n4 ^= 0x600C);
                        }
                        object5 = Rect.A()[2] = new String(cArray);
                    }
                    b = new SecretKeySpec(byArray5, (String)object5);
                }
                byte[] byArray6 = Base64.getDecoder().decode(string);
                byte[] byArray7 = Arrays.copyOfRange(byArray6, 0, 16);
                byte[] byArray8 = Arrays.copyOfRange(byArray6, 16, byArray6.length);
                Object object6 = Rect.A()[3];
                if (object6 == null) {
                    char[] cArray = "\ue977\ue94b\ue941\ue97d\ue971\ue97a\ue971\ue97d\ue940\ue949\ue971\ue941\ue97b\ue940\ued17\ued64\ued64\ued6f\ued66\ued65".toCharArray();
                    for (int i4 = 0; i4 < 20; ++i4) {
                        int n5 = cArray[i4];
                        n5 ^= 0xC523;
                        n5 += 23494;
                        n5 += 18184;
                        n5 ^= 0xBEC;
                        n5 += 28206;
                        n5 -= 13903;
                        n5 += 34259;
                        n5 -= 26100;
                        n5 -= 14772;
                        n5 -= 15093;
                        n5 ^= 0xEA18;
                        n5 -= 8378;
                        n5 += 30366;
                        cArray[i4] = (char)(n5 ^= 0xA39E);
                    }
                    object6 = Rect.A()[3] = new String(cArray);
                }
                Cipher cipher = Cipher.getInstance((String)object6);
                cipher.init(2, (Key)((SecretKey)b), new IvParameterSpec(byArray7));
                byte[] byArray9 = cipher.doFinal(byArray8);
                object2 = new String(byArray9, StandardCharsets.UTF_8);
            }
            return object2;
        }

        private static Object[] A() {
            Object[] objectArray = c;
            if (c == null) {
                c = new Object[4];
                objectArray = c;
            }
            return objectArray;
        }

        public static void b() {
            C = new int[0x50C8 ^ 0x5158];
            Rect.C[0xEA3D ^ 0xEA0D] = 0xFFFF15B1 ^ 0xEA0D;
            Rect.C[0x3162 ^ 0x300E] = 0xD4AE ^ 0x300E;
            Rect.C[0x5F86 ^ 0x5EFF] = 0xFFFFD4B9 ^ 0x5EFF;
            Rect.C[0x43B4 ^ 0x4331] = 0x4326 ^ 0x4331;
            Rect.C[0xDC5A ^ 0xDD72] = 0x6835 ^ 0xDD72;
            Rect.C[0x8B7D ^ 0x8B1B] = 0x8B1B ^ 0x8B1B;
            Rect.C[0x6511 ^ 0x6514] = 0xFFFF9AB8 ^ 0x6514;
            Rect.C[0xA657 ^ 0xA64F] = 0xA659 ^ 0xA64F;
            Rect.C[0x3F01 ^ 0x3E38] = 0x39BB ^ 0x3E38;
            Rect.C[0xB5AE ^ 0xB49C] = 0x94F9 ^ 0xB49C;
            Rect.C[0x4B48 ^ 0x4A13] = 0xE7CE ^ 0x4A13;
            Rect.C[0x9E0B ^ 0x9E56] = 0x9E3B ^ 0x9E56;
            Rect.C[0xA0D9 ^ 0xA1A6] = 0xA1A6 ^ 0xA1A6;
            Rect.C[0x3967 ^ 0x390D] = 0x3955 ^ 0x390D;
            Rect.C[0xB56C ^ 0xB50E] = 0xB558 ^ 0xB50E;
            Rect.C[0xB4F0 ^ 0xB4EF] = 0xB4CE ^ 0xB4EF;
            Rect.C[0xA9EE ^ 0xA95C] = 0xA95C ^ 0xA95C;
            Rect.C[0xEE99 ^ 0xEF94] = 0xFFFF2780 ^ 0xEF94;
            Rect.C[0x5526 ^ 0x5556] = 0x1F2E ^ 0x5556;
            Rect.C[0xD756 ^ 0xD7BD] = 0x93CF ^ 0xD7BD;
            Rect.C[0x707A ^ 0x7080] = 0x16E3 ^ 0x7080;
            Rect.C[0x7A8F ^ 0x7BB9] = 0x9CD ^ 0x7BB9;
            Rect.C[0x81B1 ^ 0x812A] = 0x8100 ^ 0x812A;
            Rect.C[0x65E2 ^ 0x6563] = 0xFFFF9AED ^ 0x6563;
            Rect.C[0xD572 ^ 0xD454] = 0xD962 ^ 0xD454;
            Rect.C[0x996E ^ 0x983A] = 0xAA7E ^ 0x983A;
            Rect.C[0x105C6 ^ 0x10571] = 0x17430 ^ 0x10571;
            Rect.C[0xFA15 ^ 0xFB48] = 0xFFFFA955 ^ 0xFB48;
            Rect.C[0x55DE ^ 0x54FA] = 0x59CC ^ 0x54FA;
            Rect.C[0x5E75 ^ 0x5E4D] = 0xFFFFA1BE ^ 0x5E4D;
            Rect.C[0xDE27 ^ 0xDE07] = 0xDE6F ^ 0xDE07;
            Rect.C[0x3F75 ^ 0x3E4F] = 0x39E1 ^ 0x3E4F;
            Rect.C[0x482C ^ 0x48BE] = 0x48C1 ^ 0x48BE;
            Rect.C[0xCE31 ^ 0xCF77] = 0x30FC ^ 0xCF77;
            Rect.C[0xA8A5 ^ 0xA98A] = 0x89E4 ^ 0xA98A;
            Rect.C[0x6272 ^ 0x6224] = 0x6271 ^ 0x6224;
            Rect.C[0x6BD5 ^ 0x6B0B] = 0x305 ^ 0x6B0B;
            Rect.C[0x43A0 ^ 0x43D2] = 0xD41B ^ 0x43D2;
            Rect.C[0xB02E ^ 0xB13C] = 0xCA73 ^ 0xB13C;
            Rect.C[0x9F50 ^ 0x9F77] = 0x9F61 ^ 0x9F77;
            Rect.C[0xC4D6 ^ 0xC4EA] = 0xC49A ^ 0xC4EA;
            Rect.C[0x880D ^ 0x8964] = 0xA94C ^ 0x8964;
            Rect.C[0x345A ^ 0x341D] = 0xFFFFCBA9 ^ 0x341D;
            Rect.C[0x1BFA ^ 0x1B8F] = 0xE2D1 ^ 0x1B8F;
            Rect.C[0x33AC ^ 0x3351] = 0xEF90 ^ 0x3351;
            Rect.C[0x1D16 ^ 0x1D2F] = 0x1D66 ^ 0x1D2F;
            Rect.C[0xD7F1 ^ 0xD7A6] = 0xFFFF2813 ^ 0xD7A6;
            Rect.C[0x7B79 ^ 0x7B22] = 0x7B3A ^ 0x7B22;
            Rect.C[0x1361 ^ 0x13F2] = 0x139C ^ 0x13F2;
            Rect.C[0xB0DA ^ 0xB00B] = 0xB404 ^ 0xB00B;
            Rect.C[0xE3E6 ^ 0xE36E] = 0xFFFF1C9B ^ 0xE36E;
            Rect.C[0xC433 ^ 0xC528] = 0xFFC7 ^ 0xC528;
            Rect.C[0x5E78 ^ 0x5EE5] = 0xFFFFA164 ^ 0x5EE5;
            Rect.C[0xEEC4 ^ 0xEED3] = 0xEEE7 ^ 0xEED3;
            Rect.C[0xAF11 ^ 0xAE13] = 0xDF7A ^ 0xAE13;
            Rect.C[0x10847 ^ 0x10914] = 0x13B53 ^ 0x10914;
            Rect.C[0xCE56 ^ 0xCEF4] = 0xCECC ^ 0xCEF4;
            Rect.C[0x1B78 ^ 0x1A1B] = 0xF7A9 ^ 0x1A1B;
            Rect.C[0xECC4 ^ 0xED8F] = 0x594B ^ 0xED8F;
            Rect.C[0x1ED ^ 0x8C] = 0xFFFF3E88 ^ 0x8C;
            Rect.C[0x5D5C ^ 0x5DBE] = 0xADE8 ^ 0x5DBE;
            Rect.C[0x6EF9 ^ 0x6EF6] = 0xFFFF915F ^ 0x6EF6;
            Rect.C[0x8071 ^ 0x8078] = 0xFFFF7FDF ^ 0x8078;
            Rect.C[0xA6A2 ^ 0xA795] = 0xA033 ^ 0xA795;
            Rect.C[0xCFAA ^ 0xCFEF] = 0xFFFF307F ^ 0xCFEF;
            Rect.C[0x3D28 ^ 0x3D33] = 0x3D2C ^ 0x3D33;
            Rect.C[0x7389 ^ 0x72AA] = 0x7F9A ^ 0x72AA;
            Rect.C[0x284D ^ 0x2833] = 0xFFFFD7CB ^ 0x2833;
            Rect.C[0xC584 ^ 0xC511] = 0xFFFF3A89 ^ 0xC511;
            Rect.C[0x6366 ^ 0x6364] = 0x6343 ^ 0x6364;
            Rect.C[0x3865 ^ 0x381F] = 0x3884 ^ 0x381F;
            Rect.C[0xABB2 ^ 0xABB3] = 0xFFFF540C ^ 0xABB3;
            Rect.C[0xD205 ^ 0xD353] = 0xE117 ^ 0xD353;
            Rect.C[0x71C ^ 0x772] = 0x9FA6 ^ 0x772;
            Rect.C[0xBAE ^ 0xB15] = 0x74AF ^ 0xB15;
            Rect.C[0xDF81 ^ 0xDE97] = 0x20D1 ^ 0xDE97;
            Rect.C[0x51E6 ^ 0x51E6] = 0x5181 ^ 0x51E6;
            Rect.C[0x73C5 ^ 0x72E7] = 0x61D6 ^ 0x72E7;
            Rect.C[0xD425 ^ 0xD433] = 0xD457 ^ 0xD433;
            Rect.C[0x25AB ^ 0x25E5] = 0x25B6 ^ 0x25E5;
            Rect.C[0x1BB8 ^ 0x1B77] = 0x36C6 ^ 0x1B77;
            Rect.C[0xB8BB ^ 0xB8C0] = 0xB8D2 ^ 0xB8C0;
            Rect.C[0xE4C3 ^ 0xE596] = 0xD7AB ^ 0xE596;
            Rect.C[0xF050 ^ 0xF0B8] = 0xB4CC ^ 0xF0B8;
            Rect.C[0x66D4 ^ 0x6759] = 0x6758 ^ 0x6759;
            Rect.C[0x1C5B ^ 0x1D0A] = 0xFFFFF8B2 ^ 0x1D0A;
            Rect.C[0x654A ^ 0x641D] = 0xBF3 ^ 0x641D;
            Rect.C[0x4A45 ^ 0x4B64] = 0xFFFFA7C5 ^ 0x4B64;
            Rect.C[0xAE93 ^ 0xAFC3] = 0xB5DB ^ 0xAFC3;
            Rect.C[0x1687 ^ 0x168F] = 0xFFFFE91C ^ 0x168F;
            Rect.C[0xDD13 ^ 0xDC59] = 0x901F ^ 0xDC59;
            Rect.C[0x5413 ^ 0x54D3] = 0xDE6A ^ 0x54D3;
            Rect.C[0x7B97 ^ 0x7AA2] = 0x899 ^ 0x7AA2;
            Rect.C[0xA50C ^ 0xA5F7] = 0x794B ^ 0xA5F7;
            Rect.C[0x974E ^ 0x9635] = 0x9635 ^ 0x9635;
            Rect.C[0xC2C ^ 0xC09] = 0xC31 ^ 0xC09;
            Rect.C[0x7AE7 ^ 0x7A64] = 0xFFFF85C6 ^ 0x7A64;
            Rect.C[0x8D02 ^ 0x8DCB] = 0xA1F8 ^ 0x8DCB;
            Rect.C[0x5F91 ^ 0x5F44] = 0x82A8 ^ 0x5F44;
            Rect.C[0x4795 ^ 0x4798] = 0xFFFFB824 ^ 0x4798;
            Rect.C[0x85B6 ^ 0x8536] = 0xFFFF7ADE ^ 0x8536;
            Rect.C[0x5FEF ^ 0x5F83] = 0x59E0 ^ 0x5F83;
            Rect.C[0xAF98 ^ 0xAE93] = 0x9923 ^ 0xAE93;
            Rect.C[0xA587 ^ 0xA539] = 0xFFFFFDC2 ^ 0xA539;
            Rect.C[0x33B ^ 0x3A2] = 0xFFFFFC4C ^ 0x3A2;
            Rect.C[0x656 ^ 0x767] = 0xFFFFD886 ^ 0x767;
            Rect.C[0x10118 ^ 0x1017D] = 0x1017C ^ 0x1017D;
            Rect.C[0x44B7 ^ 0x45F6] = 0x21C ^ 0x45F6;
            Rect.C[0xD78F ^ 0xD6F7] = 0xA350 ^ 0xD6F7;
            Rect.C[0x6C87 ^ 0x6DA2] = 0xFFFF9F47 ^ 0x6DA2;
            Rect.C[0x5FE2 ^ 0x5F05] = 0xE703 ^ 0x5F05;
            Rect.C[0xACA5 ^ 0xAC3B] = 0xFFFF5392 ^ 0xAC3B;
            Rect.C[0x3649 ^ 0x3751] = 0x6E3E ^ 0x3751;
            Rect.C[0xA75 ^ 0xA73] = 0xFFFFF5F7 ^ 0xA73;
            Rect.C[0xD01 ^ 0xDC3] = 0xFFFF78B6 ^ 0xDC3;
            Rect.C[0x3A20 ^ 0x3A96] = 0x4BC7 ^ 0x3A96;
            Rect.C[0x276E ^ 0x260C] = 0xE793 ^ 0x260C;
            Rect.C[0x112C ^ 0x1135] = 0xFFFFEECB ^ 0x1135;
            Rect.C[0x525C ^ 0x5209] = 0x520D ^ 0x5209;
            Rect.C[0xACF8 ^ 0xAC8B] = 0xF40 ^ 0xAC8B;
            Rect.C[0x3BF8 ^ 0x3BB3] = 0x3BCC ^ 0x3BB3;
            Rect.C[0x79D2 ^ 0x79F0] = 0x79F8 ^ 0x79F0;
            Rect.C[0xCC85 ^ 0xCC2F] = 0xCC2F ^ 0xCC2F;
            Rect.C[0x30D8 ^ 0x3068] = 0x3069 ^ 0x3068;
            Rect.C[0x603B ^ 0x6047] = 0xFFFF9FD0 ^ 0x6047;
            Rect.C[0xBE89 ^ 0xBE3D] = 0xBE3C ^ 0xBE3D;
            Rect.C[0x56CE ^ 0x56E6] = 0xFFFFA949 ^ 0x56E6;
            Rect.C[0xC17B ^ 0xC00B] = 0x95AD ^ 0xC00B;
            Rect.C[0xE042 ^ 0xE0A4] = 0x58DF ^ 0xE0A4;
            Rect.C[0x8D58 ^ 0x8D5C] = 0x8D7C ^ 0x8D5C;
            Rect.C[0xD357 ^ 0xD21A] = 0xFFFF9972 ^ 0xD21A;
            Rect.C[0xA4C0 ^ 0xA450] = 0xA431 ^ 0xA450;
            Rect.C[0xE602 ^ 0xE739] = 0x430E ^ 0xE739;
            Rect.C[0x6A0B ^ 0x6AF5] = 0xB654 ^ 0x6AF5;
            Rect.C[0x8558 ^ 0x8447] = 0x9766 ^ 0x8447;
            Rect.C[0xE78 ^ 0xEA0] = 0xEA6E ^ 0xEA0;
            Rect.C[0xDA6A ^ 0xDA9B] = 0x7FA7 ^ 0xDA9B;
            Rect.C[0xFBC4 ^ 0xFBBD] = 0xFB89 ^ 0xFBBD;
            Rect.C[0xECC9 ^ 0xED96] = 0x2C0C ^ 0xED96;
            Rect.C[0x97B2 ^ 0x9787] = 0x97EE ^ 0x9787;
            Rect.C[0x87FC ^ 0x87ED] = 0x87E2 ^ 0x87ED;
            Rect.C[0x9296 ^ 0x923F] = 0xFFFF6DCE ^ 0x923F;
            Rect.C[0x39FF ^ 0x3968] = 0xFFFFC6F2 ^ 0x3968;
            Rect.C[0xFAF8 ^ 0xFABC] = 0xFA90 ^ 0xFABC;
            Rect.C[0xF3BC ^ 0xF2D8] = 0x1F72 ^ 0xF2D8;
            Rect.C[0x26F5 ^ 0x26C1] = 0xFFFFD96F ^ 0x26C1;
            Rect.C[0x9E06 ^ 0x9E30] = 0x9EB6 ^ 0x9E30;
            Rect.C[0xF7E8 ^ 0xF71E] = 0x8666 ^ 0xF71E;
            Rect.C[0xAD9F ^ 0xAD34] = 0xFFFF52A5 ^ 0xAD34;
            Rect.C[0x2340 ^ 0x23CE] = 0x23C5 ^ 0x23CE;
            Rect.C[0x598C ^ 0x59CD] = 0xFFFFA64C ^ 0x59CD;
            Rect.C[0xA76C ^ 0xA672] = 0x9C91 ^ 0xA672;
            Rect.C[0x3BB5 ^ 0x3B6E] = 0xDFA4 ^ 0x3B6E;
            Rect.C[0x84A9 ^ 0x8464] = 0xA9D5 ^ 0x8464;
            Rect.C[0x2181 ^ 0x219B] = 0x218F ^ 0x219B;
            Rect.C[0x98DD ^ 0x982A] = 0xE97C ^ 0x982A;
            Rect.C[0x7FE2 ^ 0x7FB3] = 0x7F85 ^ 0x7FB3;
            Rect.C[0x55CD ^ 0x54F2] = 0x1359 ^ 0x54F2;
            Rect.C[0x7C32 ^ 0x7CE0] = 0x78EA ^ 0x7CE0;
            Rect.C[0xB89 ^ 0xB70] = 0x6D33 ^ 0xB70;
            Rect.C[0x3D8C ^ 0x3D01] = 0x3D6A ^ 0x3D01;
            Rect.C[0xFA71 ^ 0xFAB4] = 0xE49A ^ 0xFAB4;
            Rect.C[0x6155 ^ 0x610F] = 0xFFFF9EA3 ^ 0x610F;
            Rect.C[0x5BC7 ^ 0x5BBA] = 0x5BE9 ^ 0x5BBA;
            Rect.C[0x6997 ^ 0x6897] = 0x19FE ^ 0x6897;
            Rect.C[0xE921 ^ 0xE9CF] = 0xFFFFE6D4 ^ 0xE9CF;
            Rect.C[0x2FAD ^ 0x2FD2] = 0x2FF9 ^ 0x2FD2;
            Rect.C[0xAA4C ^ 0xAA91] = 0xC280 ^ 0xAA91;
            Rect.C[0x98AD ^ 0x9882] = 0x98FF ^ 0x9882;
            Rect.C[0x5B ^ 0x130] = 0xE59A ^ 0x130;
            Rect.C[0xDCB ^ 0xD98] = 0xDD0 ^ 0xD98;
            Rect.C[0xC862 ^ 0xC83B] = 0xC82C ^ 0xC83B;
            Rect.C[0x9B81 ^ 0x9A82] = 0x85DC ^ 0x9A82;
            Rect.C[0x15AB ^ 0x14F1] = 0x7B04 ^ 0x14F1;
            Rect.C[0x8EE8 ^ 0x8EB6] = 0x8E85 ^ 0x8EB6;
            Rect.C[0xF014 ^ 0xF025] = 0xF074 ^ 0xF025;
            Rect.C[0xC1DE ^ 0xC0F4] = 0x75B3 ^ 0xC0F4;
            Rect.C[0xEAFB ^ 0xEB74] = 0xEB74 ^ 0xEB74;
            Rect.C[0xD074 ^ 0xD097] = 0x20B2 ^ 0xD097;
            Rect.C[0xEC11 ^ 0xED9D] = 0x9E72 ^ 0xED9D;
            Rect.C[0xDA5C ^ 0xDAA4] = 0xDAA4 ^ 0xDAA4;
            Rect.C[0x8060 ^ 0x800D] = 0x6A5E ^ 0x800D;
            Rect.C[0x7811 ^ 0x781A] = 0x781E ^ 0x781A;
            Rect.C[0xB3E7 ^ 0xB2E1] = 0xADAD ^ 0xB2E1;
            Rect.C[0x999 ^ 0x995] = 0xFFFFF648 ^ 0x995;
            Rect.C[0xA471 ^ 0xA43D] = 0xA43D ^ 0xA43D;
            Rect.C[0x9D09 ^ 0x9D23] = 0x9D57 ^ 0x9D23;
            Rect.C[0x5053 ^ 0x5068] = 0xFFFFAF99 ^ 0x5068;
            Rect.C[0x17C6 ^ 0x16F8] = 0xB2CF ^ 0x16F8;
            Rect.C[0x408D ^ 0x41E3] = 0xA543 ^ 0x41E3;
            Rect.C[0xE108 ^ 0xE06F] = 0xC00A ^ 0xE06F;
            Rect.C[0x109D0 ^ 0x108F7] = 0x1BDA1 ^ 0x108F7;
            Rect.C[0xC113 ^ 0xC1C0] = 0xC5CF ^ 0xC1C0;
            Rect.C[0x5A28 ^ 0x5A26] = 0xFFFFA5C7 ^ 0x5A26;
            Rect.C[0x3708 ^ 0x3769] = 0xFFFFC8C7 ^ 0x3769;
            Rect.C[0x50CC ^ 0x501A] = 0xFFFF7237 ^ 0x501A;
            Rect.C[0xC574 ^ 0xC5AE] = 0x2162 ^ 0xC5AE;
            Rect.C[0x2184 ^ 0x20E9] = 0xFFFF3BAF ^ 0x20E9;
            Rect.C[0xA7E5 ^ 0xA7B1] = 0xA7E0 ^ 0xA7B1;
            Rect.C[0x4786 ^ 0x4792] = 0x47C5 ^ 0x4792;
            Rect.C[0x3C55 ^ 0x3C67] = 0x3C55 ^ 0x3C67;
            Rect.C[0x9AEC ^ 0x9B67] = 0x3EEB ^ 0x9B67;
            Rect.C[0xB080 ^ 0xB0AB] = 0xB0FB ^ 0xB0AB;
            Rect.C[0x16D9 ^ 0x1605] = 0x7E18 ^ 0x1605;
            Rect.C[0xA639 ^ 0xA6B3] = 0xA6EB ^ 0xA6B3;
            Rect.C[0x7023 ^ 0x709F] = 0xD7D2 ^ 0x709F;
            Rect.C[0x7D89 ^ 0x7CE6] = 0x2949 ^ 0x7CE6;
            Rect.C[0x10651 ^ 0x1063A] = 0x10F8A ^ 0x1063A;
            Rect.C[0xED5 ^ 0xF5D] = 0xF456 ^ 0xF5D;
            Rect.C[0x55D7 ^ 0x5492] = 0xAB22 ^ 0x5492;
            Rect.C[0xB34D ^ 0xB3B2] = 0xC2C1 ^ 0xB3B2;
            Rect.C[0xAC ^ 0x1EE] = 0x465A ^ 0x1EE;
            Rect.C[0xB5C6 ^ 0xB4CE] = 0x81A8 ^ 0xB4CE;
            Rect.C[0x1074B ^ 0x1063D] = 0x15DDC ^ 0x1063D;
            Rect.C[0x8CD ^ 0x981] = 0xBD48 ^ 0x981;
            Rect.C[0xE304 ^ 0xE3C8] = 0xCE7B ^ 0xE3C8;
            Rect.C[0x10385 ^ 0x102BD] = 0x10513 ^ 0x102BD;
            Rect.C[0x2E96 ^ 0x2ECE] = 0xFFFFD150 ^ 0x2ECE;
            Rect.C[0x7D55 ^ 0x7D71] = 0x7D7F ^ 0x7D71;
            Rect.C[0xF208 ^ 0xF2A9] = 0xF2A8 ^ 0xF2A9;
            Rect.C[0xED67 ^ 0xEDE5] = 0xEDBC ^ 0xEDE5;
            Rect.C[0x8A9C ^ 0x8B86] = 0xD2E9 ^ 0x8B86;
            Rect.C[0x26E7 ^ 0x267F] = 0x2662 ^ 0x267F;
            Rect.C[0xE3EC ^ 0xE2A2] = 0x566B ^ 0xE2A2;
            Rect.C[0x2EAB ^ 0x2FB7] = 0x1554 ^ 0x2FB7;
            Rect.C[0xFFBD ^ 0xFEB4] = 0xFFFF347E ^ 0xFEB4;
            Rect.C[0x10D07 ^ 0x10D57] = 0x10D46 ^ 0x10D57;
            Rect.C[0x1C04 ^ 0x1D64] = 0xDCFB ^ 0x1D64;
            Rect.C[0x141D ^ 0x146A] = 0x143B ^ 0x146A;
            Rect.C[0x14C ^ 0x1DA] = 0xFFFFFE34 ^ 0x1DA;
            Rect.C[0x305C ^ 0x3085] = 0xD44F ^ 0x3085;
            Rect.C[0x244A ^ 0x2464] = 0xFFFFDBA3 ^ 0x2464;
            Rect.C[0x6D53 ^ 0x6DE9] = 0x1216 ^ 0x6DE9;
            Rect.C[0xE701 ^ 0xE702] = 0xE774 ^ 0xE702;
            Rect.C[0x3266 ^ 0x3377] = 0x483E ^ 0x3377;
            Rect.C[0xB0CA ^ 0xB1F6] = 0x15C1 ^ 0xB1F6;
            Rect.C[0x362C ^ 0x3700] = 0x1367F ^ 0x3700;
            Rect.C[0xDF96 ^ 0xDFFE] = 0xDFFE ^ 0xDFFE;
            Rect.C[0xB85 ^ 0xB6C] = 0x4F1E ^ 0xB6C;
            Rect.C[0x1086F ^ 0x108A7] = 0x12495 ^ 0x108A7;
            Rect.C[0xA394 ^ 0xA2E9] = 0xA2E9 ^ 0xA2E9;
            Rect.C[0x694A ^ 0x6966] = 0x6962 ^ 0x6966;
            Rect.C[0x40D3 ^ 0x4062] = 0x4060 ^ 0x4062;
            Rect.C[0x5282 ^ 0x5386] = 0x4CCA ^ 0x5386;
            Rect.C[0x10936 ^ 0x10843] = 0xFFFEAC62 ^ 0x10843;
            Rect.C[0x3827 ^ 0x38CD] = 0xFFFF8338 ^ 0x38CD;
            Rect.C[0x7CED ^ 0x7D6E] = 0xBA48 ^ 0x7D6E;
            Rect.C[0x4B9A ^ 0x4BBB] = 0xFFFFB403 ^ 0x4BBB;
            Rect.C[0xFB5 ^ 0xF58] = 0xFFB5 ^ 0xF58;
            Rect.C[0x2BBC ^ 0x2B03] = 0x8C47 ^ 0x2B03;
            Rect.C[0x10093 ^ 0x101D4] = 0x14D9D ^ 0x101D4;
            Rect.C[0x54B9 ^ 0x5419] = 0xFFFFAB9A ^ 0x5419;
            Rect.C[0xDBE5 ^ 0xDAEF] = 0xEF89 ^ 0xDAEF;
            Rect.C[0xF7D7 ^ 0xF6F9] = 0x1F786 ^ 0xF6F9;
            Rect.C[0x10585 ^ 0x10542] = 0x11B6C ^ 0x10542;
            Rect.C[0xAAAC ^ 0xABF5] = 0xFFFF3BF9 ^ 0xABF5;
            Rect.C[0xB98C ^ 0xB9CE] = 0xB979 ^ 0xB9CE;
            Rect.C[0x7734 ^ 0x7799] = 0x7711 ^ 0x7799;
            Rect.C[0x38F7 ^ 0x384E] = 0x47F4 ^ 0x384E;
            Rect.C[0xD4AA ^ 0xD5F2] = 0xBA07 ^ 0xD5F2;
            Rect.C[0xB39D ^ 0xB3BE] = 0xFFFF4C2E ^ 0xB3BE;
            Rect.C[0x10230 ^ 0x1020A] = 0xFFFEFDEC ^ 0x1020A;
            Rect.C[0x456C ^ 0x45F8] = 0x45F7 ^ 0x45F8;
            Rect.C[0xCEE5 ^ 0xCEF8] = 0xCEA9 ^ 0xCEF8;
            Rect.C[0xB962 ^ 0xB928] = 0xFFFF46DD ^ 0xB928;
            Rect.C[0x9678 ^ 0x971D] = 0x7AF4 ^ 0x971D;
            Rect.C[0xE597 ^ 0xE5C5] = 0xE5D7 ^ 0xE5C5;
            Rect.C[0xBC07 ^ 0xBC7F] = 0xFFFF43C2 ^ 0xBC7F;
            Rect.C[0x565A ^ 0x5635] = 0xD662 ^ 0x5635;
            Rect.C[0xA7CE ^ 0xA73E] = 0x201 ^ 0xA73E;
            Rect.C[0xD14A ^ 0xD022] = 0xF050 ^ 0xD022;
            Rect.C[0x8CC3 ^ 0x8DEE] = 0xFFFE7363 ^ 0x8DEE;
            Rect.C[0x357F ^ 0x35EE] = 0xFFFFCA44 ^ 0x35EE;
            Rect.C[0x10351 ^ 0x103DE] = 0xFFFEFC35 ^ 0x103DE;
            Rect.C[0x4E2B ^ 0x4F68] = 0xB0F0 ^ 0x4F68;
            Rect.C[0x5D7 ^ 0x5C2] = 0xFFFFFA13 ^ 0x5C2;
            Rect.C[0x26F8 ^ 0x265F] = 0x264A ^ 0x265F;
            Rect.C[0x27EA ^ 0x27A7] = 0xFFFFD826 ^ 0x27A7;
            Rect.C[0x10F1B ^ 0x10E9D] = 0x19304 ^ 0x10E9D;
            Rect.C[0xF447 ^ 0xF539] = 0xF538 ^ 0xF539;
            Rect.C[0xBAB3 ^ 0xBBC0] = 0xE038 ^ 0xBBC0;
            Rect.C[0xA0AE ^ 0xA0C9] = 0xA0CB ^ 0xA0C9;
            Rect.C[0xDCA ^ 0xCBD] = 0x791B ^ 0xCBD;
            Rect.C[0x5FE2 ^ 0x5ECB] = 0xFFFF144A ^ 0x5ECB;
            Rect.C[0xD407 ^ 0xD589] = 0xD599 ^ 0xD589;
            Rect.C[0x238F ^ 0x220B] = 0x93EC ^ 0x220B;
            Rect.C[0xCA60 ^ 0xCBE9] = 0x7265 ^ 0xCBE9;
            Rect.C[0xDA9F ^ 0xDA13] = 0xDA85 ^ 0xDA13;
            Rect.C[0x47F1 ^ 0x46E1] = 0x3DAE ^ 0x46E1;
            Rect.C[0x2E95 ^ 0x2EDC] = 0xFFFFD130 ^ 0x2EDC;
            Rect.C[0x4F2A ^ 0x4F39] = 0xFFFFB0E7 ^ 0x4F39;
            Rect.C[0x78F3 ^ 0x78D5] = 0x789C ^ 0x78D5;
            Rect.C[0x1E42 ^ 0x1F76] = 0x6D02 ^ 0x1F76;
            Rect.C[0x42C7 ^ 0x43CB] = 0x7479 ^ 0x43CB;
            Rect.C[0xAD56 ^ 0xAC1F] = 0xE027 ^ 0xAC1F;
            Rect.C[0x10414 ^ 0x10462] = 0x10462 ^ 0x10462;
            Rect.C[0x508E ^ 0x5061] = 0xA08C ^ 0x5061;
            Rect.C[0xFD91 ^ 0xFC90] = 0x8DF1 ^ 0xFC90;
            Rect.C[0xAA33 ^ 0xABB6] = 0x8C61 ^ 0xABB6;
            Rect.C[0x106E7 ^ 0x106FB] = 0xFFFEF955 ^ 0x106FB;
            Rect.C[0xC315 ^ 0xC3D4] = 0x4960 ^ 0xC3D4;
            Rect.C[0x1BE7 ^ 0x1B13] = 0x6A40 ^ 0x1B13;
            Rect.C[0x1F94 ^ 0x1F21] = 0x1F21 ^ 0x1F21;
            Rect.C[0xF59A ^ 0xF536] = 0xF579 ^ 0xF536;
            Rect.C[0x91B2 ^ 0x918D] = 0xFFFF6EDF ^ 0x918D;
            Rect.C[0x5218 ^ 0x530F] = 0xA64 ^ 0x530F;
            Rect.C[0x3718 ^ 0x37BE] = 0xFFFFC86C ^ 0x37BE;
            Rect.C[0xBD97 ^ 0xBD87] = 0xBDE5 ^ 0xBD87;
            Rect.C[0xCFC9 ^ 0xCF96] = 0xCFCF ^ 0xCF96;
            Rect.C[0xEA8F ^ 0xEAC7] = 0xEACD ^ 0xEAC7;
            Rect.C[0x4C64 ^ 0x4CFE] = 0xFFFFB32D ^ 0x4CFE;
            Rect.C[0x7BB5 ^ 0x7B9C] = 0x7BC7 ^ 0x7B9C;
            Rect.C[0xCCC2 ^ 0xCC66] = 0xFFFF33A6 ^ 0xCC66;
            Rect.C[0x48CD ^ 0x48C7] = 0xFFFFB76C ^ 0x48C7;
            Rect.C[0x1C0D ^ 0x1C64] = 0x1C64 ^ 0x1C64;
            Rect.C[0x27ED ^ 0x27AB] = 0xFFFFD857 ^ 0x27AB;
            Rect.C[0x1453 ^ 0x14D8] = 0x14A3 ^ 0x14D8;
            Rect.C[0xF77B ^ 0xF748] = 0xF77F ^ 0xF748;
            Rect.C[0xD4DD ^ 0xD5E0] = 0xFFFF8E39 ^ 0xD5E0;
            Rect.C[0x3D63 ^ 0x3DD0] = 0x3DD1 ^ 0x3DD0;
            Rect.C[0x64E7 ^ 0x64BB] = 0xFFFF9B0E ^ 0x64BB;
            Rect.C[0x33C ^ 0x399] = 0xFFFFFC57 ^ 0x399;
            Rect.C[0xF26A ^ 0xF36F] = 0xFFFF13BF ^ 0xF36F;
            Rect.C[0x13D3 ^ 0x12A7] = 0x4946 ^ 0x12A7;
            Rect.C[0xE8C3 ^ 0xE943] = 0xE951 ^ 0xE943;
            Rect.C[0x7E28 ^ 0x7FA2] = 0xB3DE ^ 0x7FA2;
            Rect.C[0xDC84 ^ 0xDDE2] = 0x3048 ^ 0xDDE2;
            Rect.C[0xDEE2 ^ 0xDFF6] = 0x21B0 ^ 0xDFF6;
            Rect.C[0x92D4 ^ 0x92E9] = 0x929B ^ 0x92E9;
            Rect.C[0x8DEF ^ 0x8DFD] = 0x8D8B ^ 0x8DFD;
            Rect.C[0xE2A7 ^ 0xE28A] = 0xE2EE ^ 0xE28A;
            Rect.C[0x3AE3 ^ 0x3ADD] = 0xFFFFC53C ^ 0x3ADD;
            Rect.C[0x5E95 ^ 0x5E12] = 0x5E28 ^ 0x5E12;
            Rect.C[0x6C0D ^ 0x6CC6] = 0x40F5 ^ 0x6CC6;
            Rect.C[0x12EA ^ 0x13F3] = 0x4A8C ^ 0x13F3;
            Rect.C[0xA80F ^ 0xA8AC] = 0xA8B5 ^ 0xA8AC;
            Rect.C[0xAE7C ^ 0xAE8E] = 0xBF5 ^ 0xAE8E;
            Rect.C[0xA5AD ^ 0xA549] = 0x1D47 ^ 0xA549;
            Rect.C[0xBAE1 ^ 0xBB9B] = 0xCE3C ^ 0xBB9B;
            Rect.C[0x3833 ^ 0x392E] = 0xFFFFFC2C ^ 0x392E;
            Rect.C[0xDFB8 ^ 0xDF6C] = 0x280 ^ 0xDF6C;
            Rect.C[0xB8F6 ^ 0xB9B6] = 0xFE02 ^ 0xB9B6;
            Rect.C[0x1FF2 ^ 0x1FF5] = 0x1FE6 ^ 0x1FF5;
            Rect.C[0x10B6F ^ 0x10B0B] = 0x10B0B ^ 0x10B0B;
            Rect.C[0x9041 ^ 0x913D] = 0x913D ^ 0x913D;
            Rect.C[0xC562 ^ 0xC522] = 0xFFFF3A93 ^ 0xC522;
            Rect.C[0x10BEB ^ 0x10B53] = 0x174E7 ^ 0x10B53;
            Rect.C[0xA5D5 ^ 0xA535] = 0x551F ^ 0xA535;
            Rect.C[0x1A8A ^ 0x1B84] = 0x2C36 ^ 0x1B84;
            Rect.C[0x38B1 ^ 0x39A2] = 0xC7F2 ^ 0x39A2;
            Rect.C[0xA243 ^ 0xA2B6] = 0xD3E0 ^ 0xA2B6;
            Rect.C[0xD27A ^ 0xD2BC] = 0xCCB7 ^ 0xD2BC;
            Rect.C[0xB883 ^ 0xB98C] = 0xC2DD ^ 0xB98C;
            Rect.C[0xCAEF ^ 0xCB9D] = 0x9E3B ^ 0xCB9D;
            Rect.C[0x714B ^ 0x707B] = 0x501E ^ 0x707B;
            Rect.C[0x38 ^ 0x1BF] = 0x6A46 ^ 0x1BF;
            Rect.C[0x1FD8 ^ 0x1F08] = 0x1B00 ^ 0x1F08;
            Rect.C[0x7E5 ^ 0x74A] = 0x730 ^ 0x74A;
            Rect.C[0x6E70 ^ 0x6E3F] = 0xFFFF9181 ^ 0x6E3F;
            Rect.C[0x8611 ^ 0x8743] = 0x9D5B ^ 0x8743;
            Rect.C[0x2CC ^ 0x2D2] = 0x2F5 ^ 0x2D2;
            Rect.C[0x1573 ^ 0x15AC] = 0x7DBD ^ 0x15AC;
            Rect.C[0x9C18 ^ 0x9CD6] = 0xB115 ^ 0x9CD6;
            Rect.C[0xBD54 ^ 0xBDD2] = 0xBDFD ^ 0xBDD2;
            Rect.C[0x817A ^ 0x8010] = 0xA062 ^ 0x8010;
            Rect.C[0xA78E ^ 0xA6A5] = 0x1A7C6 ^ 0xA6A5;
            Rect.C[0xF17F ^ 0xF10B] = 0xD9D7 ^ 0xF10B;
            Rect.C[0xE656 ^ 0xE6C9] = 0xE6CF ^ 0xE6C9;
            Rect.C[0xCFBA ^ 0xCEAF] = 0xFFFFCF4D ^ 0xCEAF;
            Rect.C[0x1D67 ^ 0x1C54] = 0x6E2E ^ 0x1C54;
            Rect.C[0x25EF ^ 0x24E8] = 0x119A ^ 0x24E8;
            Rect.C[0xCD55 ^ 0xCDB4] = 0x3D91 ^ 0xCDB4;
            Rect.C[0xEC7E ^ 0xED20] = 0x40FA ^ 0xED20;
            Rect.C[0xBE72 ^ 0xBF03] = 0xEAD1 ^ 0xBF03;
            Rect.C[0x8058 ^ 0x803B] = 0x8038 ^ 0x803B;
            Rect.C[0x13AB ^ 0x12E4] = 0x8E9 ^ 0x12E4;
            Rect.C[0x74C1 ^ 0x74B0] = 0x81A8 ^ 0x74B0;
            Rect.C[0x81E7 ^ 0x817B] = 0x810E ^ 0x817B;
            Rect.C[0xE276 ^ 0xE3F7] = 0xEAB7 ^ 0xE3F7;
            Rect.C[0x634E ^ 0x62CC] = 0xFCB9 ^ 0x62CC;
            Rect.C[0x49DB ^ 0x495F] = 0xFFFFB6F4 ^ 0x495F;
            Rect.C[0x753A ^ 0x75C9] = 0xD0F5 ^ 0x75C9;
            Rect.C[0x15BF ^ 0x157B] = 0xB5F ^ 0x157B;
            Rect.C[0xF64D ^ 0xF6A8] = 0x4EAE ^ 0xF6A8;
            Rect.C[0xDCE9 ^ 0xDC89] = 0xDC95 ^ 0xDC89;
            Rect.C[0x1745 ^ 0x1772] = 0x172B ^ 0x1772;
            Rect.C[0xA76A ^ 0xA7A9] = 0x2D1D ^ 0xA7A9;
            Rect.C[0xF09B ^ 0xF0D8] = 0xFFFF0F4D ^ 0xF0D8;
            Rect.C[0xD451 ^ 0xD4AD] = 0x80C ^ 0xD4AD;
            Rect.C[0xF7C9 ^ 0xF681] = 0xBAC7 ^ 0xF681;
            Rect.C[0x2E94 ^ 0x2FB4] = 0x3C85 ^ 0x2FB4;
            Rect.C[0x6DF5 ^ 0x6D22] = 0xB0CE ^ 0x6D22;
            Rect.C[0xA1A6 ^ 0xA0FA] = 0xD20 ^ 0xA0FA;
            Rect.C[0x72C0 ^ 0x720A] = 0xFFFFA1D4 ^ 0x720A;
            Rect.C[0x1CC ^ 0x145] = 0x197 ^ 0x145;
            Rect.C[0x9251 ^ 0x92F9] = 0xFFFF6D45 ^ 0x92F9;
            Rect.C[0xBBE8 ^ 0xBB04] = 0x4BE2 ^ 0xBB04;
            Rect.C[0x746D ^ 0x74D0] = 0xD394 ^ 0x74D0;
            Rect.C[0xCFEB ^ 0xCEAF] = 0x3124 ^ 0xCEAF;
            Rect.C[0xDA0E ^ 0xDAA0] = 0xDAB2 ^ 0xDAA0;
        }
    }
}

