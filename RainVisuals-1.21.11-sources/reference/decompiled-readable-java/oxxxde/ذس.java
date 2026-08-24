/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  ru.ocz.protection.annotation.Compile
 *  ru.ocz.protection.virtualmachine.annotation.RecompileFormat
 */
package oxxxde;

import java.awt.Color;
import kotakbaz.rain.client.util.animations.AnimationUtil;
import kotakbaz.rain.client.util.render.font.Font;
import kotakbaz.rain.module.setting.Setting;
import kotakbaz.rain.module.setting.settings.BooleanSetting;
import kotakbaz.rain.ui.menu.settings.ModuleSettingComponent;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import oxxxde.\u0628\u0641;
import oxxxde.\u0630\u0631;
import oxxxde.\u0633\u0623;
import oxxxde.\u0635\u0651;
import ru.ocz.protection.annotation.Compile;
import ru.ocz.protection.virtualmachine.annotation.RecompileFormat;

@Metadata(mv={2, 3, 0}, k=1, xi=48, d1={"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\b\u0004\u0010\u0005J'\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0017\u00a2\u0006\u0004\b\f\u0010\rJ'\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u0006H\u0017\u00a2\u0006\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0011\u001a\u00020\t8\u0016X\u0096D\u00a2\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0016\u001a\u00020\u00158\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b\u0016\u0010\u0017\u00a8\u0006\u0018"}, d2={"Loxxxde/\u0630\u0633;", "Loxxxde/\u0622;", "Loxxxde/\u062e\u0630;", "setting", "<init>", "(Lkotakbaz/rain/module/setting/settings/BooleanSetting;)V", "", "mouseX", "mouseY", "", "partialTicks", "", "render", "(IIF)V", "button", "onMouseClick", "(III)V", "componentHeight", "F", "getComponentHeight", "()F", "Loxxxde/\u0631\u064a;", "toggleAnim", "Loxxxde/\u0631\u064a;", "rain-visuals"})
@RecompileFormat
public final class \u0630\u0633
extends ModuleSettingComponent<BooleanSetting> {
    @NotNull
    private final AnimationUtil toggleAnim;
    private final float componentHeight;

    public \u0630\u0633(@NotNull BooleanSetting setting) {
        Intrinsics.checkNotNullParameter(setting, "setting");
        super((Setting)setting);
        this.componentHeight = 15.0f;
        this.toggleAnim = new AnimationUtil(((Boolean)setting.getValue()).booleanValue() ? 1.0f : 0.0f);
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
        ((BooleanSetting)this.getSetting()).toggle();
    }

    @Override
    public float getComponentHeight() {
        return this.componentHeight;
    }

    @Override
    @Compile
    public void render(int n, int n2, float f) {
        super.render(n, n2, f);
        Color color = this.themedSurface(0.03f, 0.05f);
        Color color2 = this.themedBorder(0.05f, 0.08f);
        Color color3 = this.themedTitle(0.32f, 1.0f);
        \u0630\u0631.INSTANCE.getBLURRED_RECT().priority(this.rectPipeline()).color(color).round(3.0f).mix(0.95f).border(1.0f, color2).draw(this.getX(), this.getY(), this.getWidth(), this.getComponentHeight());
        Font.drawText$default(this.getDefaultFont().priority(this.textPipeline()), ((BooleanSetting)this.getSetting()).getName(), this.getX() + this.getPadding(), this.getY() + 3.3f, 6.6f, color3, 0.0f, 0.0f, 0.0f, 0, 0.0f, 992, null);
        float f2 = this.toggleAnim.animate((float)((Boolean)((BooleanSetting)this.getSetting()).getValue()).booleanValue(), 180.0f, new \u0635\u0651(\u0628\u0641.INSTANCE));
        \u0633\u0623.INSTANCE.render(this.getX(), this.getY(), this.getWidth(), this.getComponentHeight(), this.getPadding(), f2, this.getAlpha(), this.getEnableProgress(), this.rectPipeline());
    }
}

