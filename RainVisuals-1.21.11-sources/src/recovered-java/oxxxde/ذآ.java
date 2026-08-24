/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.joml.Vector4f
 *  org.lwjgl.glfw.GLFW
 *  ru.ocz.protection.annotation.Compile
 *  ru.ocz.protection.virtualmachine.annotation.RecompileFormat
 */
package oxxxde;

import java.awt.Color;
import java.util.Locale;
import kotakbaz.rain.client.util.animations.AnimationUtil;
import kotakbaz.rain.client.util.render.font.Font;
import kotakbaz.rain.module.setting.Setting;
import kotakbaz.rain.module.setting.settings.TextSetting;
import kotakbaz.rain.ui.menu.settings.ModuleSettingComponent;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.joml.Vector4f;
import org.lwjgl.glfw.GLFW;
import oxxxde.\u0628\u0641;
import oxxxde.\u062d\u064e;
import oxxxde.\u062f\u0630;
import oxxxde.\u0630\u0631;
import ru.ocz.protection.annotation.Compile;
import ru.ocz.protection.virtualmachine.annotation.RecompileFormat;

@Metadata(mv={2, 3, 0}, k=1, xi=48, d1={"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\b\u0004\u0010\u0005J'\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0017\u00a2\u0006\u0004\b\f\u0010\rJ'\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u0006H\u0017\u00a2\u0006\u0004\b\u000f\u0010\u0010J'\u0010\u0011\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u0006H\u0016\u00a2\u0006\u0004\b\u0011\u0010\u0010J\u0017\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00020\u0012H\u0002\u00a2\u0006\u0004\b\u0015\u0010\u0016J'\u0010\u001a\u001a\u00020\u00122\u0006\u0010\u0017\u001a\u00020\u00122\u0006\u0010\u0018\u001a\u00020\t2\u0006\u0010\u0019\u001a\u00020\tH\u0002\u00a2\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001c\u001a\u00020\u0012H\u0002\u00a2\u0006\u0004\b\u001c\u0010\u001dR\u001a\u0010\u001e\u001a\u00020\t8\u0016X\u0096D\u00a2\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R\u0014\u0010\"\u001a\u00020\t8\u0002X\u0082D\u00a2\u0006\u0006\n\u0004\b\"\u0010\u001fR\u0014\u0010#\u001a\u00020\t8\u0002X\u0082D\u00a2\u0006\u0006\n\u0004\b#\u0010\u001fR\u0014\u0010$\u001a\u00020\t8\u0002X\u0082D\u00a2\u0006\u0006\n\u0004\b$\u0010\u001fR\u0014\u0010%\u001a\u00020\t8\u0002X\u0082D\u00a2\u0006\u0006\n\u0004\b%\u0010\u001fR\u0014\u0010&\u001a\u00020\t8\u0002X\u0082D\u00a2\u0006\u0006\n\u0004\b&\u0010\u001fR\u0016\u0010(\u001a\u00020'8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\b(\u0010)R\u0014\u0010+\u001a\u00020*8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b+\u0010,R\u0014\u0010-\u001a\u00020*8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b-\u0010,R\u0016\u0010.\u001a\u00020\t8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\b.\u0010\u001fR\u0016\u0010/\u001a\u00020\t8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\b/\u0010\u001f\u00a8\u00060"}, d2={"Loxxxde/\u0630\u0622;", "Loxxxde/\u0622;", "Loxxxde/\u0639\u062a;", "setting", "<init>", "(Lkotakbaz/rain/module/setting/settings/TextSetting;)V", "", "mouseX", "mouseY", "", "partialTicks", "", "render", "(IIF)V", "button", "onMouseClick", "(III)V", "onKeyPress", "", "displayText", "Lorg/joml/Vector4f;", "inputRect", "(Ljava/lang/String;)Lorg/joml/Vector4f;", "text", "maxWidth", "size", "trimToFit", "(Ljava/lang/String;FF)Ljava/lang/String;", "displayTextForSizing", "()Ljava/lang/String;", "componentHeight", "F", "getComponentHeight", "()F", "titleSize", "inputTextSize", "boxTextPadding", "selectedExpand", "minInputWidth", "", "editing", "Z", "Loxxxde/\u0631\u064a;", "widthAnim", "Loxxxde/\u0631\u064a;", "focusAnim", "lastInputWidth", "lastMaxInputWidth", "rain-visuals"})
@RecompileFormat
public final class \u0630\u0622
extends ModuleSettingComponent<TextSetting> {
    private float lastInputWidth;
    private final float boxTextPadding;
    private float lastMaxInputWidth;
    private final float inputTextSize;
    private final float componentHeight;
    @NotNull
    private final AnimationUtil widthAnim;
    @NotNull
    private final AnimationUtil focusAnim;
    private boolean editing;
    private final float selectedExpand;
    private final float minInputWidth;
    private final float titleSize;

    @Override
    @Compile
    public void render(int n, int n2, float f) {
        float f2;
        super.render(n, n2, f);
        float f3 = this.focusAnim.animate((float)this.editing, 220.0f, new \u062f\u0630(\u0628\u0641.INSTANCE));
        Color color = this.themedSurface(0.03f, 0.05f);
        Color color2 = this.themedBorder(0.05f, 0.08f);
        Color color3 = this.themedTitle(0.32f, 1.0f);
        Color color4 = this.themedValue(0.3f, 0.82f + f3 * 0.1f);
        Color color5 = this.themedValue(0.18f, 0.42f);
        \u0630\u0631.INSTANCE.getBLURRED_RECT().priority(this.rectPipeline()).color(color).round(3.0f).mix(0.95f).border(1.0f, color2).draw(this.getX(), this.getY(), this.getWidth(), this.getComponentHeight());
        Font.drawText$default(this.getDefaultFont().priority(this.textPipeline()), ((TextSetting)this.getSetting()).getName(), this.getX() + this.getPadding(), this.getY() + 3.3f, this.titleSize, color3, 0.0f, 0.0f, 0.0f, 0, 0.0f, 992, null);
        String string = this.displayTextForSizing();
        Vector4f vector4f = this.inputRect(string);
        \u0630\u0631.INSTANCE.getBLURRED_RECT().priority(this.rectPipeline()).color(color).round(2.2f).mix(0.95f).border(1.0f, color2).draw(vector4f.x, vector4f.y, vector4f.z, vector4f.w);
        String string2 = (String)((TextSetting)this.getSetting()).getValue();
        String string3 = string2.length() == 0 ? (this.editing ? "" : "Text..") : (String)((TextSetting)this.getSetting()).getValue();
        float f4 = RangesKt.coerceAtLeast(vector4f.z - this.boxTextPadding * 2.0f - 1.0f, 0.0f);
        String string4 = vector4f.z >= this.lastMaxInputWidth ? this.trimToFit(string3, f4, this.inputTextSize) : string3;
        boolean bl = false;
        if (this.editing && System.currentTimeMillis() / 450L % 2L == 0L) {
            bl = true;
        }
        Color color6 = ((String)((TextSetting)this.getSetting()).getValue()).length() == 0 && !this.editing ? color5 : color4;
        if (this.editing) {
            float f5 = Font.getWidth$default(this.getDefaultFont(), "|", this.inputTextSize, 0.0f, 4, null);
            f2 = f5 + 0.5f;
        } else {
            float f6 = 0.0f;
            f2 = 0.0f;
        }
        float f7 = Font.getWidth$default(this.getDefaultFont(), string4, this.inputTextSize, 0.0f, 4, null);
        float f8 = vector4f.x + vector4f.z / 2.0f - (f7 + f2) / 2.0f;
        Font.drawText$default(this.getDefaultFont().priority(this.textPipeline()), string4, f8, vector4f.y + 1.8f, this.inputTextSize, color6, 0.0f, 0.0f, 0.0f, 0, 0.0f, 992, null);
        if (this.editing && bl) {
            Font.drawText$default(this.getDefaultFont().priority(this.textPipeline()), "|", f8 + f7 + 0.5f, vector4f.y + 1.8f, this.inputTextSize, color4, 0.0f, 0.0f, 0.0f, 0, 0.0f, 992, null);
        }
    }

    /*
     * WARNING - void declaration
     */
    private final Vector4f inputRect(String displayText) {
        void var12_12;
        void var11_13;
        void var14_15;
        void var13_14;
        float inputWidth;
        float hardMax = RangesKt.coerceAtLeast(this.getWidth() - this.getPadding() * 2.0f, 0.0f);
        float titleWidth = Font.getWidth$default(this.getDefaultFont(), ((TextSetting)this.getSetting()).getName(), this.titleSize, 0.0f, 4, null);
        float maxAllowed = RangesKt.coerceIn(this.getWidth() - (this.getPadding() * 3.0f + titleWidth + 2.0f), 0.0f, hardMax);
        float contentWidth = Font.getWidth$default(this.getDefaultFont(), displayText, this.inputTextSize, 0.0f, 4, null);
        float baseWidth = contentWidth + this.boxTextPadding * 2.0f;
        float desiredWidth = baseWidth + (this.editing ? this.selectedExpand : 0.0f);
        float minAllowed = RangesKt.coerceAtMost(this.minInputWidth, maxAllowed);
        float targetWidth = maxAllowed <= 0.0f ? 0.0f : RangesKt.coerceIn(desiredWidth, minAllowed, maxAllowed);
        float duration = targetWidth > this.lastInputWidth ? 70.0f : 240.0f;
        \u0628\u0641 \u0628\u06412 = \u0628\u0641.INSTANCE;
        this.lastInputWidth = inputWidth = this.widthAnim.animate(targetWidth, duration, new \u062d\u064e(\u0628\u06412));
        this.lastMaxInputWidth = maxAllowed;
        float inputHeight = this.getComponentHeight() * 0.72f;
        float inputX = this.getX() + this.getWidth() - this.getPadding() - inputWidth;
        float inputY = this.calcMidY(this.getY(), this.getComponentHeight(), inputHeight);
        return new Vector4f((float)var13_14, (float)var14_15, (float)var11_13, (float)var12_12);
    }

    @Override
    public float getComponentHeight() {
        return this.componentHeight;
    }

    /*
     * WARNING - void declaration
     */
    private final String trimToFit(String text, float maxWidth, float size) {
        void var4_4;
        if (maxWidth <= 0.0f) {
            return "";
        }
        String candidate = text;
        while (true) {
            boolean bl = ((CharSequence)candidate).length() > 0;
            if (!bl) break;
            if (!(Font.getWidth$default(this.getDefaultFont(), candidate, size, 0.0f, 4, null) > maxWidth)) break;
            candidate = StringsKt.dropLast(candidate, 1);
        }
        return var4_4;
    }

    public \u0630\u0622(@NotNull TextSetting setting) {
        Intrinsics.checkNotNullParameter(setting, "setting");
        super((Setting)setting);
        this.componentHeight = 15.0f;
        this.titleSize = 6.6f;
        this.inputTextSize = 5.9f;
        this.boxTextPadding = 4.0f;
        this.selectedExpand = 6.0f;
        this.minInputWidth = 26.0f;
        this.widthAnim = new AnimationUtil(0.0f, 1, null);
        this.focusAnim = new AnimationUtil(0.0f, 1, null);
        this.lastInputWidth = this.minInputWidth;
        this.lastMaxInputWidth = this.minInputWidth;
    }

    private final String displayTextForSizing() {
        CharSequence charSequence;
        CharSequence charSequence2 = (CharSequence)((TextSetting)this.getSetting()).getValue();
        boolean bl = charSequence2.length() == 0;
        if (bl) {
            boolean bl2 = false;
            charSequence = "Text..";
        } else {
            charSequence = charSequence2;
        }
        return (String)charSequence;
    }

    @Override
    public void onKeyPress(int mouseX, int mouseY, int button) {
        super.onKeyPress(mouseX, mouseY, button);
        if (!this.editing) {
            return;
        }
        switch (button) {
            case 256: 
            case 257: 
            case 335: {
                this.editing = false;
                return;
            }
            case 259: {
                if (((CharSequence)((TextSetting)this.getSetting()).getValue()).length() > 0) {
                    ((TextSetting)this.getSetting()).setText(StringsKt.dropLast((String)((TextSetting)this.getSetting()).getValue(), 1));
                }
                return;
            }
            case 261: {
                ((TextSetting)this.getSetting()).setText("");
                return;
            }
            case 32: {
                ((TextSetting)this.getSetting()).setText(((TextSetting)this.getSetting()).getValue() + " ");
                return;
            }
        }
        String string = GLFW.glfwGetKeyName((int)button, (int)0);
        if (string == null) {
            return;
        }
        String keyName = string;
        if (keyName.length() != 1 || ((String)((TextSetting)this.getSetting()).getValue()).length() > ((TextSetting)this.getSetting()).getMaxLength()) {
            return;
        }
        TextSetting textSetting = (TextSetting)this.getSetting();
        Object t = ((TextSetting)this.getSetting()).getValue();
        String string2 = keyName.toLowerCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(string2, "toLowerCase(...)");
        textSetting.setText(t + string2);
    }

    @Override
    @Compile
    public void onMouseClick(int n, int n2, int n3) {
        super.onMouseClick(n, n2, n3);
        if (n3 != 0) {
            return;
        }
        Vector4f vector4f = this.inputRect(this.displayTextForSizing());
        this.editing = (float)n >= vector4f.x && (float)n <= vector4f.x + vector4f.z && (float)n2 >= vector4f.y && (float)n2 <= vector4f.y + vector4f.w;
    }
}

