/*
 * Decompiled with CFR 0.152.
 */
package oxxxde;

import java.awt.Color;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import oxxxde.\u0628\u062d;
import oxxxde.\u0637\u063a;

@Metadata(mv={2, 3, 0}, k=1, xi=48, d1={"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0014\b\u00c6\u0002\u0018\u00002\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u00a2\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\t\u001a\u00020\u00062\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u00a2\u0006\u0004\b\t\u0010\bJ\u0017\u0010\n\u001a\u00020\u00062\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u00a2\u0006\u0004\b\n\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00062\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u00a2\u0006\u0004\b\u000b\u0010\bJ\u0017\u0010\f\u001a\u00020\u00062\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u00a2\u0006\u0004\b\f\u0010\bR\u0014\u0010\r\u001a\u00020\u00048\u0006X\u0086T\u00a2\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0011\u0010\u0011\u001a\u00020\u00068F\u00a2\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0013\u001a\u00020\u00068F\u00a2\u0006\u0006\u001a\u0004\b\u0012\u0010\u0010R\u0011\u0010\u0015\u001a\u00020\u00068F\u00a2\u0006\u0006\u001a\u0004\b\u0014\u0010\u0010R\u0011\u0010\u0017\u001a\u00020\u00068F\u00a2\u0006\u0006\u001a\u0004\b\u0016\u0010\u0010R\u0011\u0010\u0019\u001a\u00020\u00068F\u00a2\u0006\u0006\u001a\u0004\b\u0018\u0010\u0010\u00a8\u0006\u001a"}, d2={"Loxxxde/\u062b\u0652;", "", "<init>", "()V", "", "alpha", "Ljava/awt/Color;", "panel", "(F)Ljava/awt/Color;", "surface", "title", "value", "icon", "BLUR_MIX", "F", "getPanelBase", "()Ljava/awt/Color;", "panelBase", "getSurfaceBase", "surfaceBase", "getTitleBase", "titleBase", "getValueBase", "valueBase", "getIconBase", "iconBase", "rain-visuals"})
public final class \u062b\u0652 {
    public static final float BLUR_MIX = 0.95f;
    @NotNull
    public static final \u062b\u0652 INSTANCE = new \u062b\u0652();

    @NotNull
    public final Color getTitleBase() {
        return \u0637\u063a.INSTANCE.getTITLE_COLOR();
    }

    @NotNull
    public final Color icon(float alpha) {
        return \u0628\u062d.INSTANCE.setAlpha(this.getIconBase(), alpha);
    }

    public static /* synthetic */ Color value$default(\u062b\u0652 \u062b\u06522, float f, int n, Object object) {
        if ((n & 1) != 0) {
            f = (float)\u062b\u06522.getValueBase().getAlpha() / 255.0f;
        }
        return \u062b\u06522.value(f);
    }

    @NotNull
    public final Color getSurfaceBase() {
        return \u0637\u063a.INSTANCE.getHEADER_COLOR();
    }

    @NotNull
    public final Color value(float alpha) {
        return \u0628\u062d.INSTANCE.setAlpha(this.getValueBase(), alpha);
    }

    public static /* synthetic */ Color surface$default(\u062b\u0652 \u062b\u06522, float f, int n, Object object) {
        if ((n & 1) != 0) {
            f = ((float)\u062b\u06522.getSurfaceBase().getAlpha() + 5.0f) / 255.0f;
        }
        return \u062b\u06522.surface(f);
    }

    @NotNull
    public final Color surface(float alpha) {
        return \u0628\u062d.INSTANCE.setAlpha(this.getSurfaceBase(), alpha);
    }

    @NotNull
    public final Color getIconBase() {
        return \u0637\u063a.INSTANCE.getICON_COLOR();
    }

    public static /* synthetic */ Color icon$default(\u062b\u0652 \u062b\u06522, float f, int n, Object object) {
        if ((n & 1) != 0) {
            f = (float)\u062b\u06522.getIconBase().getAlpha() / 255.0f;
        }
        return \u062b\u06522.icon(f);
    }

    public static /* synthetic */ Color panel$default(\u062b\u0652 \u062b\u06522, float f, int n, Object object) {
        if ((n & 1) != 0) {
            f = (float)\u062b\u06522.getPanelBase().getAlpha() / 255.0f;
        }
        return \u062b\u06522.panel(f);
    }

    @NotNull
    public final Color panel(float alpha) {
        return \u0628\u062d.INSTANCE.setAlpha(this.getPanelBase(), alpha);
    }

    @NotNull
    public final Color getPanelBase() {
        return \u0637\u063a.INSTANCE.getPANEL_COLOR();
    }

    private \u062b\u0652() {
    }

    @NotNull
    public final Color title(float alpha) {
        return \u0628\u062d.INSTANCE.setAlpha(this.getTitleBase(), alpha);
    }

    @NotNull
    public final Color getValueBase() {
        return \u0637\u063a.INSTANCE.getVALUE_COLOR();
    }

    public static /* synthetic */ Color title$default(\u062b\u0652 \u062b\u06522, float f, int n, Object object) {
        if ((n & 1) != 0) {
            f = (float)\u062b\u06522.getTitleBase().getAlpha() / 255.0f;
        }
        return \u062b\u06522.title(f);
    }
}

