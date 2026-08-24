/*
 * Decompiled with CFR 0.152.
 */
package kotakbaz.rain.ui.menu.settings;

import java.awt.Color;
import kotakbaz.rain.client.util.animations.AnimationUtil;
import kotakbaz.rain.client.util.render.engine.controls.ClientRenderPipeline;
import kotakbaz.rain.module.setting.Setting;
import kotakbaz.rain.ui.api.PipelinedRender;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import oxxxde.\u0627\u0638;
import oxxxde.\u0628\u0641;
import oxxxde.\u062b\u0652;
import oxxxde.\u0634\u0628;
import oxxxde.\u0638\u0632;

@Metadata(mv={2, 3, 0}, k=1, xi=48, d1={"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0003\b&\u0018\u0000*\f\b\u0000\u0010\u0002*\u0006\u0012\u0002\b\u00030\u00012\u00020\u00032\u00020\u0004B\u000f\u0012\u0006\u0010\u0005\u001a\u00028\u0000\u00a2\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\f\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\bH\u0004\u00a2\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0010\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u000e\u00a2\u0006\u0004\b\u0010\u0010\u0011J\u001f\u0010\u0014\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\u000eH\u0004\u00a2\u0006\u0004\b\u0014\u0010\u0015J\u001f\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0012\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\u000eH\u0004\u00a2\u0006\u0004\b\u0017\u0010\u0018J\u001f\u0010\u0019\u001a\u00020\u00162\u0006\u0010\u0012\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\u000eH\u0004\u00a2\u0006\u0004\b\u0019\u0010\u0018J\u001f\u0010\u001a\u001a\u00020\u00162\u0006\u0010\u0012\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\u000eH\u0004\u00a2\u0006\u0004\b\u001a\u0010\u0018J\u001f\u0010\u001b\u001a\u00020\u00162\u0006\u0010\u0012\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\u000eH\u0004\u00a2\u0006\u0004\b\u001b\u0010\u0018J\u001f\u0010\u001c\u001a\u00020\u00162\u0006\u0010\u0012\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\u000eH\u0004\u00a2\u0006\u0004\b\u001c\u0010\u0018J\u000f\u0010\u001e\u001a\u00020\u001dH\u0016\u00a2\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010 \u001a\u00020\u001dH\u0016\u00a2\u0006\u0004\b \u0010\u001fJ\u000f\u0010!\u001a\u00020\u001dH\u0016\u00a2\u0006\u0004\b!\u0010\u001fR\u0017\u0010\u0005\u001a\u00028\u00008\u0006\u00a2\u0006\f\n\u0004\b\u0005\u0010\"\u001a\u0004\b#\u0010$R\u0014\u0010'\u001a\u00020\u000e8&X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b%\u0010&R\"\u0010(\u001a\u00020\u000e8\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\b(\u0010)\u001a\u0004\b*\u0010&\"\u0004\b+\u0010,R\"\u0010-\u001a\u00020\u000e8\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\b-\u0010)\u001a\u0004\b.\u0010&\"\u0004\b/\u0010,R\u0014\u00101\u001a\u0002008\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b1\u00102\u00a8\u00063"}, d2={"Loxxxde/\u0622;", "Loxxxde/\u0631\u0641;", "T", "Loxxxde/\u0627\u0638;", "Loxxxde/\u0627\u0633;", "setting", "<init>", "(Lkotakbaz/rain/module/setting/Setting;)V", "", "mouseX", "mouseY", "", "hovered", "(II)Z", "", "duration", "visibleProgress", "(F)F", "disabledAlpha", "enabledAlpha", "alphaByState", "(FF)F", "Ljava/awt/Color;", "themedSurface", "(FF)Ljava/awt/Color;", "themedBorder", "themedTitle", "themedValue", "themedIcon", "Loxxxde/\u0635\u0624;", "rectPipeline", "()Lkotakbaz/rain/client/util/render/engine/controls/ClientRenderPipeline;", "textPipeline", "iconsPipeline", "Loxxxde/\u0631\u0641;", "getSetting", "()Lkotakbaz/rain/module/setting/Setting;", "getComponentHeight", "()F", "componentHeight", "enableProgress", "F", "getEnableProgress", "setEnableProgress", "(F)V", "parentOpenProgress", "getParentOpenProgress", "setParentOpenProgress", "Loxxxde/\u0631\u064a;", "visibleAnimation", "Loxxxde/\u0631\u064a;", "rain-visuals"})
public abstract class ModuleSettingComponent<T extends Setting<?>>
extends \u0627\u0638
implements PipelinedRender {
    private float parentOpenProgress;
    @NotNull
    private final AnimationUtil visibleAnimation;
    @NotNull
    private final T setting;
    private float enableProgress;

    public abstract float getComponentHeight();

    @Override
    @NotNull
    public ClientRenderPipeline rectPipeline() {
        return ClientRenderPipeline.GUI_RECT;
    }

    public final float getParentOpenProgress() {
        return this.parentOpenProgress;
    }

    @NotNull
    protected final Color themedTitle(float disabledAlpha, float enabledAlpha) {
        return \u062b\u0652.INSTANCE.title(this.alphaByState(disabledAlpha, enabledAlpha));
    }

    @NotNull
    protected final Color themedBorder(float disabledAlpha, float enabledAlpha) {
        return \u062b\u0652.INSTANCE.title(this.alphaByState(disabledAlpha, enabledAlpha));
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    protected final boolean hovered(int mouseX, int mouseY) {
        if (!((float)mouseX >= this.getX())) return false;
        if (!((float)mouseX <= this.getX() + this.getWidth())) return false;
        if (!((float)mouseY >= this.getY())) return false;
        if (!((float)mouseY <= this.getY() + this.getComponentHeight())) return false;
        return true;
    }

    public ModuleSettingComponent(@NotNull T setting) {
        Intrinsics.checkNotNullParameter(setting, "setting");
        this.setting = setting;
        this.enableProgress = 1.0f;
        this.parentOpenProgress = 1.0f;
        this.visibleAnimation = new AnimationUtil(((Setting)this.setting).isVisible() ? 1.0f : 0.0f);
    }

    public final float getEnableProgress() {
        return this.enableProgress;
    }

    @Override
    @NotNull
    public ClientRenderPipeline textPipeline() {
        return ClientRenderPipeline.GUI_TEXT;
    }

    public static /* synthetic */ float visibleProgress$default(ModuleSettingComponent moduleSettingComponent, float f, int n, Object object) {
        if (object != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: visibleProgress");
        }
        if ((n & 1) != 0) {
            f = 170.0f;
        }
        return moduleSettingComponent.visibleProgress(f);
    }

    public final void setEnableProgress(float f) {
        this.enableProgress = f;
    }

    @NotNull
    protected final Color themedSurface(float disabledAlpha, float enabledAlpha) {
        return \u062b\u0652.INSTANCE.surface(this.alphaByState(disabledAlpha, enabledAlpha));
    }

    @Override
    @NotNull
    public ClientRenderPipeline iconsPipeline() {
        return ClientRenderPipeline.GUI_SPECIAL;
    }

    protected final float alphaByState(float disabledAlpha, float enabledAlpha) {
        return (disabledAlpha + (enabledAlpha - disabledAlpha) * this.enableProgress) * this.getAlpha();
    }

    public final float visibleProgress(float duration) {
        if (!((Setting)this.setting).isVisible()) {
            \u0628\u0641 \u0628\u06412 = \u0628\u0641.INSTANCE;
            return this.visibleAnimation.animate(0.0f, 0.0f, new \u0638\u0632(\u0628\u06412));
        }
        \u0628\u0641 \u0628\u06413 = \u0628\u0641.INSTANCE;
        return this.visibleAnimation.animate(1.0f, duration, new \u0634\u0628(\u0628\u06413));
    }

    @NotNull
    protected final Color themedIcon(float disabledAlpha, float enabledAlpha) {
        return \u062b\u0652.INSTANCE.icon(this.alphaByState(disabledAlpha, enabledAlpha));
    }

    @NotNull
    protected final Color themedValue(float disabledAlpha, float enabledAlpha) {
        return \u062b\u0652.INSTANCE.value(this.alphaByState(disabledAlpha, enabledAlpha));
    }

    public final void setParentOpenProgress(float f) {
        this.parentOpenProgress = f;
    }

    @NotNull
    public final T getSetting() {
        return this.setting;
    }
}

