/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.client.sound.PositionedSoundInstance
 *  net.minecraft.client.sound.SoundInstance
 *  net.minecraft.sound.SoundEvent
 *  org.lwjgl.glfw.GLFW
 *  ru.ocz.protection.annotation.Compile
 *  ru.ocz.protection.virtualmachine.annotation.RecompileFormat
 */
package oxxxde;

import java.awt.Color;
import java.text.DecimalFormat;
import kotakbaz.rain.client.util.animations.AnimationUtil;
import kotakbaz.rain.client.util.render.font.Font;
import kotakbaz.rain.module.setting.Setting;
import kotakbaz.rain.module.setting.settings.SliderSetting;
import kotakbaz.rain.ui.menu.settings.ModuleSettingComponent;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import net.minecraft.client.sound.PositionedSoundInstance;
import net.minecraft.client.sound.SoundInstance;
import net.minecraft.sound.SoundEvent;
import org.jetbrains.annotations.NotNull;
import org.lwjgl.glfw.GLFW;
import oxxxde.\u0628\u0641;
import oxxxde.\u062d\u062f;
import oxxxde.\u0630\u0631;
import oxxxde.\u0632\u062f;
import oxxxde.\u0636\u0643;
import ru.ocz.protection.annotation.Compile;
import ru.ocz.protection.virtualmachine.annotation.RecompileFormat;

@Metadata(mv={2, 3, 0}, k=1, xi=48, d1={"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\b\u0004\u0010\u0005J'\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0017\u00a2\u0006\u0004\b\f\u0010\rJ'\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u0006H\u0017\u00a2\u0006\u0004\b\u000f\u0010\u0010J'\u0010\u0011\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u0006H\u0016\u00a2\u0006\u0004\b\u0011\u0010\u0010J'\u0010\u0014\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\t2\u0006\u0010\u0013\u001a\u00020\tH\u0002\u00a2\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0017\u001a\u00020\u0016H\u0002\u00a2\u0006\u0004\b\u0017\u0010\u0018R\u001a\u0010\u0019\u001a\u00020\t8\u0016X\u0096D\u00a2\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0014\u0010\u001e\u001a\u00020\u001d8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0016\u0010 \u001a\u00020\u00168\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\b \u0010!R\u0014\u0010#\u001a\u00020\"8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b#\u0010$\u00a8\u0006%"}, d2={"Loxxxde/\u0637\u062e;", "Loxxxde/\u0622;", "Loxxxde/\u0637\u064f;", "setting", "<init>", "(Lkotakbaz/rain/module/setting/settings/SliderSetting;)V", "", "mouseX", "mouseY", "", "partialTicks", "", "render", "(IIF)V", "button", "onMouseClick", "(III)V", "onMouseRelease", "sliderX", "sliderWidth", "updateFromMouse", "(IFF)V", "", "isLeftMousePressed", "()Z", "componentHeight", "F", "getComponentHeight", "()F", "Ljava/text/DecimalFormat;", "valueFormat", "Ljava/text/DecimalFormat;", "dragging", "Z", "Loxxxde/\u0631\u064a;", "progressAnim", "Loxxxde/\u0631\u064a;", "rain-visuals"})
@RecompileFormat
public final class \u0637\u062e
extends ModuleSettingComponent<SliderSetting> {
    @NotNull
    private final DecimalFormat valueFormat;
    private final float componentHeight;
    private boolean dragging;
    @NotNull
    private final AnimationUtil progressAnim;

    private final boolean isLeftMousePressed() {
        return GLFW.glfwGetMouseButton((long)\u0636\u0643.getMc().getWindow().getHandle(), (int)0) == 1;
    }

    private final void updateFromMouse(int mouseX, float sliderX, float sliderWidth) {
        if (sliderWidth <= 0.0f) {
            return;
        }
        float progress = RangesKt.coerceIn(((float)mouseX - sliderX) / sliderWidth, 0.0f, 1.0f);
        float value = ((SliderSetting)this.getSetting()).getMin() + (((SliderSetting)this.getSetting()).getMax() - ((SliderSetting)this.getSetting()).getMin()) * progress;
        float previousValue = ((Number)((SliderSetting)this.getSetting()).getValue()).floatValue();
        ((SliderSetting)this.getSetting()).setClamped(value);
        if (!(((Number)((SliderSetting)this.getSetting()).getValue()).floatValue() == previousValue)) {
            \u0636\u0643.getMc().getSoundManager().play((SoundInstance)PositionedSoundInstance.ui((SoundEvent)\u0632\u062f.INSTANCE.getSLIDER(), (float)1.0f, (float)1.0f));
        }
    }

    @Override
    public float getComponentHeight() {
        return this.componentHeight;
    }

    @Override
    @Compile
    public void render(int n, int n2, float f) {
        super.render(n, n2, f);
        if (this.dragging && !this.isLeftMousePressed()) {
            this.dragging = false;
        }
        Color color = this.themedSurface(0.03f, 0.05f);
        Color color2 = this.themedBorder(0.05f, 0.08f);
        Color color3 = this.themedTitle(0.32f, 1.0f);
        Color color4 = this.themedValue(0.28f, 0.78f);
        Color color5 = this.themedValue(0.05f, 0.12f);
        Color color6 = this.themedTitle(0.18f, 0.44f);
        Color color7 = this.themedTitle(0.5f, 0.95f);
        \u0630\u0631.INSTANCE.getBLURRED_RECT().priority(this.rectPipeline()).color(color).round(3.0f).mix(0.95f).border(1.0f, color2).draw(this.getX(), this.getY(), this.getWidth(), this.getComponentHeight());
        float f2 = this.getY();
        Font.drawText$default(this.getDefaultFont().priority(this.textPipeline()), ((SliderSetting)this.getSetting()).getName(), this.getX() + this.getPadding(), f2 + 3.3f, 6.6f, color3, 0.0f, 0.0f, 0.0f, 0, 0.0f, 992, null);
        String string = this.valueFormat.format(((SliderSetting)this.getSetting()).getValue());
        float f3 = Font.getWidth$default(this.getDefaultFont(), string, 6.2f, 0.0f, 4, null);
        Font.drawText$default(this.getDefaultFont().priority(this.textPipeline()), string, this.getX() + this.getWidth() - this.getPadding() - f3, f2 + 3.3f, 6.2f, color4, 0.0f, 0.0f, 0.0f, 0, 0.0f, 992, null);
        float f4 = this.getX() + this.getPadding();
        float f5 = RangesKt.coerceAtLeast(this.getWidth() - this.getPadding() * 2.0f, 0.0f);
        float f6 = this.getY() + this.getComponentHeight() - 7.2f;
        float f7 = this.progressAnim.animate(((SliderSetting)this.getSetting()).progress(), 120.0f, new \u062d\u062f(\u0628\u0641.INSTANCE));
        \u0630\u0631.INSTANCE.getBASIC_RECT().priority(this.rectPipeline()).color(color5).round(0.5f).draw(f4, f6, f5, 3.0f);
        \u0630\u0631.INSTANCE.getBASIC_RECT().priority(this.rectPipeline()).color(color6).round(0.5f).draw(f4, f6, f5 * f7, 3.0f);
        float f8 = this.dragging ? 5.6f : 5.0f;
        float f9 = f8 / 2.0f;
        float f10 = RangesKt.coerceIn(f4 + f5 * f7 - f9, f4 - f9, f4 + f5 - f9);
        \u0630\u0631.INSTANCE.getBASIC_RECT().priority(this.rectPipeline()).color(color7).round(f8 / 3.0f).draw(f10, f6 - (f8 - 3.0f) / 2.0f, f8, f8);
        if (this.dragging) {
            this.updateFromMouse(n, f4, f5);
        }
    }

    public \u0637\u062e(@NotNull SliderSetting setting) {
        Intrinsics.checkNotNullParameter(setting, "setting");
        super((Setting)setting);
        this.componentHeight = 22.0f;
        this.valueFormat = new DecimalFormat("0.##");
        this.progressAnim = new AnimationUtil(setting.progress());
    }

    @Override
    @Compile
    public void onMouseClick(int n, int n2, int n3) {
        super.onMouseClick(n, n2, n3);
        if (n3 != 0) {
            return;
        }
        if (!this.hovered(n, n2)) {
            return;
        }
        float f = this.getX() + this.getPadding();
        float f2 = this.getWidth() - this.getPadding() * 2.0f;
        float f3 = this.getY() + this.getComponentHeight();
        if ((float)n2 >= f3 - 11.0f && (float)n2 < f3) {
            this.dragging = true;
            this.updateFromMouse(n, f, f2);
        }
    }

    @Override
    public void onMouseRelease(int mouseX, int mouseY, int button) {
        super.onMouseRelease(mouseX, mouseY, button);
        if (button == 0) {
            this.dragging = false;
        }
    }
}

