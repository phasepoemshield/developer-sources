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
import kotakbaz.rain.client.util.animations.AnimationUtil;
import kotakbaz.rain.client.util.other.KeyMappings;
import kotakbaz.rain.client.util.render.font.Font;
import kotakbaz.rain.module.setting.Setting;
import kotakbaz.rain.module.setting.settings.BindSetting;
import kotakbaz.rain.ui.menu.settings.ModuleSettingComponent;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import org.jetbrains.annotations.NotNull;
import org.joml.Vector4f;
import oxxxde.\u0628\u062b;
import oxxxde.\u0628\u0641;
import oxxxde.\u0630\u0631;
import oxxxde.\u0645;
import oxxxde.\u064e;
import ru.ocz.protection.annotation.Compile;
import ru.ocz.protection.virtualmachine.annotation.RecompileFormat;

@Metadata(mv={2, 3, 0}, k=1, xi=48, d1={"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\b\u0004\u0010\u0005J'\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0017\u00a2\u0006\u0004\b\f\u0010\rJ'\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u0006H\u0017\u00a2\u0006\u0004\b\u000f\u0010\u0010J'\u0010\u0011\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u0006H\u0016\u00a2\u0006\u0004\b\u0011\u0010\u0010J\u0017\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00020\u0012H\u0002\u00a2\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0013\u001a\u00020\u0012H\u0002\u00a2\u0006\u0004\b\u0013\u0010\u0017J\u0017\u0010\u0019\u001a\u00020\u00122\u0006\u0010\u0018\u001a\u00020\u0006H\u0002\u00a2\u0006\u0004\b\u0019\u0010\u001aR\u001a\u0010\u001b\u001a\u00020\t8\u0016X\u0096D\u00a2\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0014\u0010\u001f\u001a\u00020\t8\u0002X\u0082D\u00a2\u0006\u0006\n\u0004\b\u001f\u0010\u001cR\u0014\u0010 \u001a\u00020\t8\u0002X\u0082D\u00a2\u0006\u0006\n\u0004\b \u0010\u001cR\u0014\u0010!\u001a\u00020\t8\u0002X\u0082D\u00a2\u0006\u0006\n\u0004\b!\u0010\u001cR\u0014\u0010\"\u001a\u00020\t8\u0002X\u0082D\u00a2\u0006\u0006\n\u0004\b\"\u0010\u001cR\u0014\u0010#\u001a\u00020\t8\u0002X\u0082D\u00a2\u0006\u0006\n\u0004\b#\u0010\u001cR\u0016\u0010%\u001a\u00020$8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\b%\u0010&R\u0014\u0010(\u001a\u00020'8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b(\u0010)R\u0014\u0010*\u001a\u00020'8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b*\u0010)R\u0014\u0010+\u001a\u00020'8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b+\u0010)\u00a8\u0006,"}, d2={"Loxxxde/\u0630;", "Loxxxde/\u0622;", "Loxxxde/\u0630\u064f;", "setting", "<init>", "(Lkotakbaz/rain/module/setting/settings/BindSetting;)V", "", "mouseX", "mouseY", "", "partialTicks", "", "render", "(IIF)V", "button", "onMouseClick", "(III)V", "onKeyPress", "", "bindText", "Lorg/joml/Vector4f;", "bindRect", "(Ljava/lang/String;)Lorg/joml/Vector4f;", "()Ljava/lang/String;", "key", "keyName", "(I)Ljava/lang/String;", "componentHeight", "F", "getComponentHeight", "()F", "titleSize", "bindTextSize", "boxTextPadding", "selectedExpand", "minBindWidth", "", "listening", "Z", "Loxxxde/\u0631\u064a;", "widthAnim", "Loxxxde/\u0631\u064a;", "focusAnim", "textShiftAnim", "rain-visuals"})
@RecompileFormat
public final class \u0630
extends ModuleSettingComponent<BindSetting> {
    private final float componentHeight;
    private final float boxTextPadding;
    private final float bindTextSize;
    private final float titleSize;
    private final float selectedExpand;
    private boolean listening;
    @NotNull
    private final AnimationUtil focusAnim;
    @NotNull
    private final AnimationUtil textShiftAnim;
    private final float minBindWidth;
    @NotNull
    private final AnimationUtil widthAnim;

    @Override
    public void onKeyPress(int mouseX, int mouseY, int button) {
        super.onKeyPress(mouseX, mouseY, button);
        if (!this.listening) {
            return;
        }
        switch (button) {
            case 256: 
            case 259: 
            case 261: {
                ((BindSetting)this.getSetting()).clear();
                break;
            }
            default: {
                ((BindSetting)this.getSetting()).setKey(button);
            }
        }
        this.listening = false;
    }

    private final String bindText() {
        return this.listening ? "\u041d\u0430\u0436\u043c\u0438\u0442\u0435.." : (((BindSetting)this.getSetting()).hasBind() ? this.keyName(((Number)((BindSetting)this.getSetting()).getValue()).intValue()) : "\u041d\u0435\u0442\u0443");
    }

    @Override
    @Compile
    public void onMouseClick(int n, int n2, int n3) {
        Vector4f vector4f = null;
        super.onMouseClick(n, n2, n3);
        if (n3 != 0) {
            return;
        }
        vector4f = this.bindRect(this.bindText());
        if (vector4f == null) {
            throw new NullPointerException("Null pointer access [field:25]");
        }
        this.listening = (float)n >= vector4f.x && (float)n <= vector4f.x + vector4f.z && (float)n2 >= vector4f.y && (float)n2 <= vector4f.y + vector4f.w;
    }

    @Override
    @Compile
    public void render(int n, int n2, float f) {
        super.render(n, n2, f);
        float f2 = this.focusAnim.animate((float)this.listening, 220.0f, new \u064e(\u0628\u0641.INSTANCE));
        float f3 = this.textShiftAnim.animate((float)this.listening, 220.0f, new \u0628\u062b(\u0628\u0641.INSTANCE));
        Color color = this.themedSurface(0.03f, 0.05f);
        Color color2 = this.themedBorder(0.05f, 0.08f);
        Color color3 = this.themedTitle(0.32f, 1.0f);
        Color color4 = this.themedValue(0.28f, 0.82f + f2 * 0.14f);
        \u0630\u0631.INSTANCE.getBLURRED_RECT().priority(this.rectPipeline()).color(color).round(3.0f).mix(0.95f).border(1.0f, color2).draw(this.getX(), this.getY(), this.getWidth(), this.getComponentHeight());
        Font.drawText$default(this.getDefaultFont().priority(this.textPipeline()), ((BindSetting)this.getSetting()).getName(), this.getX() + this.getPadding(), this.getY() + 3.3f, this.titleSize, color3, 0.0f, 0.0f, 0.0f, 0, 0.0f, 992, null);
        String string = this.bindText();
        Vector4f vector4f = this.bindRect(string);
        \u0630\u0631.INSTANCE.getBLURRED_RECT().priority(this.rectPipeline()).color(color).round(2.2f).mix(0.95f).border(1.0f, color2).draw(vector4f.x, vector4f.y, vector4f.z, vector4f.w);
        float f4 = Font.getWidth$default(this.getDefaultFont(), string, this.bindTextSize, 0.0f, 4, null);
        float f5 = vector4f.x + vector4f.z / 2.0f - f4 / 2.0f + f3 * 0.8f;
        Font.drawText$default(this.getDefaultFont().priority(this.textPipeline()), string, f5, vector4f.y + 1.8f, this.bindTextSize, color4, 0.0f, 0.0f, 0.0f, 0, 0.0f, 992, null);
    }

    public \u0630(@NotNull BindSetting setting) {
        Intrinsics.checkNotNullParameter(setting, "setting");
        super((Setting)setting);
        this.componentHeight = 15.0f;
        this.titleSize = 6.6f;
        this.bindTextSize = 5.8f;
        this.boxTextPadding = 4.0f;
        this.selectedExpand = 6.0f;
        this.minBindWidth = 15.0f;
        this.widthAnim = new AnimationUtil(0.0f, 1, null);
        this.focusAnim = new AnimationUtil(0.0f, 1, null);
        this.textShiftAnim = new AnimationUtil(0.0f, 1, null);
    }

    /*
     * WARNING - void declaration
     */
    private final Vector4f bindRect(String bindText) {
        void var11_11;
        void var10_12;
        void var13_14;
        void var12_13;
        float hardMax = RangesKt.coerceAtLeast(this.getWidth() - this.getPadding() * 2.0f, 0.0f);
        float titleWidth = Font.getWidth$default(this.getDefaultFont(), ((BindSetting)this.getSetting()).getName(), this.titleSize, 0.0f, 4, null);
        float maxAllowed = RangesKt.coerceIn(this.getWidth() - (this.getPadding() * 3.0f + titleWidth + 8.0f), 0.0f, hardMax);
        float contentWidth = Font.getWidth$default(this.getDefaultFont(), bindText, this.bindTextSize, 0.0f, 4, null);
        float baseWidth = contentWidth + this.boxTextPadding * 2.0f;
        float desiredWidth = baseWidth + (this.listening ? this.selectedExpand : 0.0f);
        float minAllowed = RangesKt.coerceAtMost(this.minBindWidth, maxAllowed);
        float targetWidth = maxAllowed <= 0.0f ? 0.0f : RangesKt.coerceIn(desiredWidth, minAllowed, maxAllowed);
        \u0628\u0641 \u0628\u06412 = \u0628\u0641.INSTANCE;
        float bindWidth = this.widthAnim.animate(targetWidth, 230.0f, new \u0645(\u0628\u06412));
        float bindHeight = this.getComponentHeight() * 0.72f;
        float bindX = this.getX() + this.getWidth() - this.getPadding() - bindWidth;
        float bindY = this.calcMidY(this.getY(), this.getComponentHeight(), bindHeight);
        return new Vector4f((float)var12_13, (float)var13_14, (float)var10_12, (float)var11_11);
    }

    @Override
    public float getComponentHeight() {
        return this.componentHeight;
    }

    private final String keyName(int key) {
        return KeyMappings.INSTANCE.getKey(key);
    }
}

