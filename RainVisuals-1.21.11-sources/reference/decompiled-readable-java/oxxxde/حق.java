/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.joml.Vector4f
 *  ru.ocz.protection.annotation.Compile
 *  ru.ocz.protection.virtualmachine.annotation.RecompileFormat
 */
package oxxxde;

import java.awt.Color;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import kotakbaz.rain.client.util.animations.AnimationUtil;
import kotakbaz.rain.client.util.render.font.Font;
import kotakbaz.rain.module.setting.ModeSetting;
import kotakbaz.rain.module.setting.Setting;
import kotakbaz.rain.ui.menu.settings.ModuleSettingComponent;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import kotlin.text.StringsKt__StringsJVMKt;
import org.jetbrains.annotations.NotNull;
import org.joml.Vector4f;
import oxxxde.\u0628\u0641;
import oxxxde.\u062b\u0645;
import oxxxde.\u062b\u0652;
import oxxxde.\u062c\u0626;
import oxxxde.\u0630\u0631;
import oxxxde.\u0631\u064e;
import oxxxde.\u0637\u0637;
import oxxxde.\u0637\u0652;
import ru.ocz.protection.annotation.Compile;
import ru.ocz.protection.virtualmachine.annotation.RecompileFormat;

@Metadata(mv={2, 3, 0}, k=1, xi=48, d1={"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\b\u0004\u0010\u0005J'\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0017\u00a2\u0006\u0004\b\f\u0010\rJ'\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u0006H\u0017\u00a2\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\tH\u0002\u00a2\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0011\u001a\u00020\tH\u0002\u00a2\u0006\u0004\b\u0011\u0010\u0015R\u0014\u0010\u0016\u001a\u00020\t8\u0002X\u0082D\u00a2\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0018\u001a\u00020\t8\u0002X\u0082D\u00a2\u0006\u0006\n\u0004\b\u0018\u0010\u0017R\u0014\u0010\u0019\u001a\u00020\t8\u0002X\u0082D\u00a2\u0006\u0006\n\u0004\b\u0019\u0010\u0017R\u0014\u0010\u001a\u001a\u00020\t8\u0002X\u0082D\u00a2\u0006\u0006\n\u0004\b\u001a\u0010\u0017R\u0014\u0010\u001b\u001a\u00020\t8\u0002X\u0082D\u00a2\u0006\u0006\n\u0004\b\u001b\u0010\u0017R\u0014\u0010\u001c\u001a\u00020\t8\u0002X\u0082D\u00a2\u0006\u0006\n\u0004\b\u001c\u0010\u0017R\u0014\u0010\u001d\u001a\u00020\t8\u0002X\u0082D\u00a2\u0006\u0006\n\u0004\b\u001d\u0010\u0017R\u0014\u0010\u001e\u001a\u00020\t8\u0002X\u0082D\u00a2\u0006\u0006\n\u0004\b\u001e\u0010\u0017R\u0014\u0010\u001f\u001a\u00020\t8\u0002X\u0082D\u00a2\u0006\u0006\n\u0004\b\u001f\u0010\u0017R\u0016\u0010!\u001a\u00020 8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\b!\u0010\"R\u0014\u0010$\u001a\u00020#8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b$\u0010%R \u0010(\u001a\u000e\u0012\u0004\u0012\u00020'\u0012\u0004\u0012\u00020#0&8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b(\u0010)R \u0010*\u001a\u000e\u0012\u0004\u0012\u00020'\u0012\u0004\u0012\u00020#0&8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b*\u0010)R\u0014\u0010+\u001a\u00020#8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b+\u0010%R\u0014\u0010-\u001a\u00020\t8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b,\u0010\u0015\u00a8\u0006."}, d2={"Loxxxde/\u062d\u0642;", "Loxxxde/\u0622;", "Loxxxde/\u0638\u064a;", "setting", "<init>", "(Lkotakbaz/rain/module/setting/ModeSetting;)V", "", "mouseX", "mouseY", "", "partialTicks", "", "render", "(IIF)V", "button", "onMouseClick", "(III)V", "openProgress", "Lorg/joml/Vector4f;", "selectorRect", "(F)Lorg/joml/Vector4f;", "()F", "baseHeight", "F", "optionHeight", "optionGap", "optionTextSize", "optionTextLeftPadding", "optionTextToIconGap", "iconRightOffsetExtra", "openDuration", "optionDuration", "", "open", "Z", "Loxxxde/\u0631\u064a;", "openAnim", "Loxxxde/\u0631\u064a;", "Ljava/util/HashMap;", "", "optionAnims", "Ljava/util/HashMap;", "optionHoverAnims", "selectorHoverAnim", "getComponentHeight", "componentHeight", "rain-visuals"})
@RecompileFormat
public final class \u062d\u0642
extends ModuleSettingComponent<ModeSetting> {
    private final float optionTextToIconGap;
    @NotNull
    private final AnimationUtil openAnim;
    private final float optionGap;
    @NotNull
    private final HashMap<String, AnimationUtil> optionHoverAnims;
    private final float optionTextLeftPadding;
    private final float optionDuration;
    private boolean open;
    @NotNull
    private final AnimationUtil selectorHoverAnim;
    private final float optionHeight;
    private final float baseHeight;
    private final float iconRightOffsetExtra;
    private final float optionTextSize;
    @NotNull
    private final HashMap<String, AnimationUtil> optionAnims;
    private final float openDuration;

    @Override
    @Compile
    public void render(int n, int n2, float f) {
        super.render(n, n2, f);
        float f2 = this.openProgress();
        Color color = this.themedSurface(0.03f, 0.05f);
        Color color2 = this.themedBorder(0.05f, 0.08f);
        Color color3 = this.themedTitle(0.32f, 1.0f);
        Color color4 = this.themedValue(0.28f, 0.78f);
        Vector4f vector4f = this.selectorRect(f2);
        float f3 = vector4f.x;
        float f4 = vector4f.y;
        float f5 = vector4f.z;
        float f6 = vector4f.w;
        float f7 = !((float)n < f3 || (float)n > f3 + f5 || (float)n2 < f4 || (float)n2 > f4 + f6) ? 1.0f : 0.0f;
        \u0628\u0641 \u0628\u06412 = \u0628\u0641.INSTANCE;
        f7 = RangesKt.coerceIn(this.selectorHoverAnim.animate(f7, 170.0f, new \u0637\u0652(\u0628\u06412)), 0.0f, 1.0f);
        float f8 = RangesKt.coerceAtLeast((float)((ModeSetting)this.getSetting()).getModes().size() * (this.optionHeight + this.optionGap) - this.optionGap + 4.0f, 0.0f);
        float f9 = this.getY();
        \u0630\u0631.INSTANCE.getBLURRED_RECT().priority(this.rectPipeline()).color(color).round(3.0f).mix(0.95f).border(1.0f, color2).draw(this.getX(), this.getY(), this.getWidth(), this.getComponentHeight());
        float f10 = this.baseHeight;
        Font font = this.getDefaultFont().priority(this.textPipeline());
        String string = ((ModeSetting)this.getSetting()).getName();
        Font.drawText$default(font, string, this.getX() + this.getPadding(), f9 + 3.3f, f10 * 0.42f, color3, 0.0f, 0.0f, 0.0f, 0, 0.0f, 992, null);
        Color color5 = \u062b\u0652.INSTANCE.surface(this.alphaByState(0.03f + f7 * 0.025f, 0.05f + f7 * 0.025f));
        Color color6 = \u062b\u0652.INSTANCE.title(this.alphaByState(0.05f + f7 * 0.05f, 0.08f + f7 * 0.05f));
        \u0630\u0631.INSTANCE.getBLURRED_RECT().priority(this.rectPipeline()).color(color5).round(2.2f).mix(0.95f).border(1.0f, color6).draw(f3, f4, f5, f6);
        RangesKt.coerceAtLeast(f5 - 1.5f, 0.0f);
        RangesKt.coerceAtLeast(f6 - 1.5f, 0.0f);
        this.getParentOpenProgress();
        string = ((ModeSetting)this.getSetting()).getDisplayValue();
        float f11 = f6 * 0.58f;
        float f12 = Font.getWidth$default(this.getDefaultFont(), string, f11, 0.0f, 4, null);
        font = this.getDefaultFont().priority(this.textPipeline());
        this.getPadding();
        Font.drawText$default(font, string, f3 + f5 / 2.0f - f12 / 2.0f, f9 + 3.8f, f11, color4, 0.0f, 0.0f, 0.0f, 0, 0.0f, 992, null);
        if (!(f2 > 0.01f)) {
            return;
        }
        float f13 = this.getPadding();
        float f14 = RangesKt.coerceAtLeast(f5 - f13, 0.0f);
        f13 = this.getPadding();
        \u0630\u0631.INSTANCE.getBASIC_RECT().priority(this.rectPipeline()).color(\u062b\u0652.INSTANCE.surface(this.alphaByState(0.05f, 0.12f))).round(0.5f).draw(f3 + f13 * 0.5f, f4 + 10.0f, f14, 1.5f);
        float f15 = f4 + f6 + 2.0f;
        for (String string2 : (Iterable)((ModeSetting)this.getSetting()).getModes()) {
            String string3 = ((ModeSetting)this.getSetting()).displayNameFor(string2);
            AnimationUtil animationUtil = (AnimationUtil)((Map)this.optionAnims).get(string2);
            float f16 = StringsKt__StringsJVMKt.equals(string2, (String)((ModeSetting)this.getSetting()).getValue(), true) ? 1.0f : 0.0f;
            \u0628\u06412 = \u0628\u0641.INSTANCE;
            f16 = animationUtil.animate(f16, this.optionDuration, new \u062c\u0626(\u0628\u06412));
            float f17 = !((float)n < f3 + 2.0f || (float)n > f3 + f5 - 2.0f || (float)n2 < f15 || (float)n2 > f15 + this.optionHeight) ? 1.0f : 0.0f;
            animationUtil = (AnimationUtil)((Map)this.optionHoverAnims).get(string2);
            \u0628\u06412 = \u0628\u0641.INSTANCE;
            f17 = animationUtil.animate(f17, 170.0f, new \u062b\u0645(\u0628\u06412));
            float f18 = RangesKt.coerceIn(f17, 0.0f, 1.0f);
            float f19 = this.alphaByState(0.26f, 0.62f);
            float f20 = this.alphaByState(0.4f, 0.9f);
            float f21 = Math.max(f16, f18 * 0.72f);
            color5 = \u062b\u0652.INSTANCE.title(f19 + f20 * f21);
            f14 = this.iconRightOffsetExtra;
            f13 = this.getPadding();
            font = this.getDefaultFont().priority(this.textPipeline());
            float f22 = this.optionTextLeftPadding;
            f11 = this.optionTextSize;
            Font.drawText$default(font, string3, f3 + f22 + f21 * 2.0f, f15 + 2.0f, f11, color5, 0.0f, 0.0f, 0.0f, 0, 0.0f, 992, null);
            font = \u0631\u064e.INSTANCE.getICON().priority(this.textPipeline());
            f11 = this.optionTextSize;
            color5 = \u062b\u0652.INSTANCE.icon(f19 * f16);
            Font.drawText$default(font, "h", f3 + f5 + 2.0f - f14 - f13 - f16 * 2.0f, f15 + 3.0f, f11, color5, 0.0f, 0.0f, 0.0f, 0, 0.0f, 992, null);
            f15 += this.optionHeight + this.optionGap;
        }
    }

    /*
     * WARNING - void declaration
     */
    private final Vector4f selectorRect(float openProgress) {
        void var16_22;
        void var17_23;
        void var2_2;
        Float f;
        float selectorHeight = this.baseHeight * 0.7f;
        float valueSize = selectorHeight * 0.58f;
        float currentModeWidth = Font.getWidth$default(this.getDefaultFont(), ((ModeSetting)this.getSetting()).getDisplayValue(), valueSize, 0.0f, 4, null);
        Iterator iterator2 = ((Iterable)((ModeSetting)this.getSetting()).getModes()).iterator();
        if (!iterator2.hasNext()) {
            f = null;
        } else {
            String mode22 = (String)iterator2.next();
            boolean bl = false;
            float mode22 = Font.getWidth$default(this.getDefaultFont(), ((ModeSetting)this.getSetting()).displayNameFor(mode22), this.optionTextSize, 0.0f, 4, null);
            while (iterator2.hasNext()) {
                String mode32 = (String)iterator2.next();
                $i$a$-maxOfOrNull-ModeSettingComponent$selectorRect$longestModeWidth$1 = false;
                float mode32 = Font.getWidth$default(this.getDefaultFont(), ((ModeSetting)this.getSetting()).displayNameFor(mode32), this.optionTextSize, 0.0f, 4, null);
                mode22 = Math.max(mode22, mode32);
            }
            f = Float.valueOf(mode22);
        }
        float longestModeWidth = f != null ? f.floatValue() : 0.0f;
        float iconWidth = Font.getWidth$default(\u0631\u064e.INSTANCE.getICON(), "h", this.optionTextSize, 0.0f, 4, null);
        float iconRightOffset = this.iconRightOffsetExtra + this.getPadding();
        float closedTargetWidth = currentModeWidth + this.getPadding() * 2.0f;
        float openTargetWidth = this.optionTextLeftPadding + longestModeWidth + this.optionTextToIconGap + iconWidth + iconRightOffset;
        float targetWidth = closedTargetWidth + (openTargetWidth - closedTargetWidth) * openProgress;
        float titleSize = this.baseHeight * 0.42f;
        float titleWidth = Font.getWidth$default(this.getDefaultFont(), ((ModeSetting)this.getSetting()).getName(), titleSize, 0.0f, 4, null);
        float hardMax = RangesKt.coerceAtLeast(this.getWidth() - this.getPadding() * 2.0f, 0.0f);
        float closedWidth = RangesKt.coerceAtMost(closedTargetWidth, hardMax);
        float preferredOpenMax = RangesKt.coerceAtLeast(Math.min(hardMax, this.getWidth() - (this.getPadding() * 3.0f + titleWidth + 6.0f)), closedWidth);
        float selectorWidth = openProgress <= 0.001f ? closedWidth : RangesKt.coerceIn(targetWidth, closedWidth, preferredOpenMax);
        float selectorX = this.getX() + this.getWidth() - this.getPadding() - selectorWidth;
        float f2 = this.calcMidY(this.getY(), this.baseHeight, (float)var2_2);
        return new Vector4f((float)var17_23, f2, (float)var16_22, (float)var2_2);
    }

    @Override
    public float getComponentHeight() {
        float openProgress = this.openProgress();
        float optionsArea = RangesKt.coerceAtLeast((float)((ModeSetting)this.getSetting()).getModes().size() * (this.optionHeight + this.optionGap) - this.optionGap, 0.0f);
        return this.baseHeight + (optionsArea + 4.0f) * openProgress;
    }

    public \u062d\u0642(@NotNull ModeSetting setting) {
        Intrinsics.checkNotNullParameter(setting, "setting");
        super((Setting)setting);
        this.baseHeight = 15.0f;
        this.optionHeight = 11.0f;
        this.optionGap = 2.0f;
        this.optionTextSize = 5.8f;
        this.optionTextLeftPadding = 5.0f;
        this.optionTextToIconGap = 4.0f;
        this.iconRightOffsetExtra = 5.0f;
        this.openDuration = 320.0f;
        this.optionDuration = 240.0f;
        this.openAnim = new AnimationUtil(0.0f, 1, null);
        this.optionAnims = new HashMap();
        this.optionHoverAnims = new HashMap();
        this.selectorHoverAnim = new AnimationUtil(0.0f, 1, null);
    }

    @Override
    @Compile
    public void onMouseClick(int n, int n2, int n3) {
        super.onMouseClick(n, n2, n3);
        if (!this.hovered(n, n2)) {
            this.open = false;
            return;
        }
        if (n3 == 2) {
            return;
        }
        float f = this.openProgress();
        Vector4f vector4f = this.selectorRect(f);
        if ((float)n >= vector4f.x && (float)n <= vector4f.x + vector4f.z && (float)n2 >= vector4f.y && (float)n2 <= vector4f.y + vector4f.w) {
            this.open ^= true;
            return;
        }
        if (!this.open) {
            return;
        }
        float f2 = vector4f.y + vector4f.w + 2.0f;
        for (String string : ((ModeSetting)this.getSetting()).getModes()) {
            if ((float)n >= vector4f.x + 2.0f && (float)n <= vector4f.x + vector4f.z - 2.0f && (float)n2 >= f2 && (float)n2 <= f2 + this.optionHeight) {
                ((ModeSetting)this.getSetting()).setMode(string);
                return;
            }
            f2 += this.optionHeight + this.optionGap;
        }
        this.open = false;
    }

    private final float openProgress() {
        \u0628\u0641 \u0628\u06412 = \u0628\u0641.INSTANCE;
        return this.openAnim.animate(this.open ? 1.0f : 0.0f, this.openDuration, new \u0637\u0637(\u0628\u06412));
    }
}

