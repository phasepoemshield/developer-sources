/*
 * Decompiled with CFR 0.152.
 */
package oxxxde;

import kotakbaz.rain.client.util.render.font.Font;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import oxxxde.\u0630\u0628;
import oxxxde.\u0631\u064e;

@Metadata(mv={2, 3, 0}, k=1, xi=48, d1={"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u001a\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0016\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\b\u0002\u0010\u0003J%\u0010\b\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0004\u00a2\u0006\u0004\b\b\u0010\tJ\u001d\u0010\n\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004\u00a2\u0006\u0004\b\n\u0010\u000bR\"\u0010\f\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\"\u0010\u0012\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\b\u0012\u0010\r\u001a\u0004\b\u0013\u0010\u000f\"\u0004\b\u0014\u0010\u0011R\"\u0010\u0005\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\b\u0005\u0010\r\u001a\u0004\b\u0015\u0010\u000f\"\u0004\b\u0016\u0010\u0011R\"\u0010\u0017\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\b\u0017\u0010\r\u001a\u0004\b\u0018\u0010\u000f\"\u0004\b\u0019\u0010\u0011R\"\u0010\u0006\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\b\u0006\u0010\r\u001a\u0004\b\u001a\u0010\u000f\"\u0004\b\u001b\u0010\u0011R\"\u0010\u001c\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\b\u001c\u0010\r\u001a\u0004\b\u001d\u0010\u000f\"\u0004\b\u001e\u0010\u0011R\u0011\u0010\"\u001a\u00020\u001f8F\u00a2\u0006\u0006\u001a\u0004\b \u0010!R\u0011\u0010$\u001a\u00020\u001f8F\u00a2\u0006\u0006\u001a\u0004\b#\u0010!\u00a8\u0006%"}, d2={"Loxxxde/\u0627\u0638;", "Loxxxde/\u0630\u0628;", "<init>", "()V", "", "y", "height", "size", "calcMidY", "(FFF)F", "centerText", "(FF)F", "alpha", "F", "getAlpha", "()F", "setAlpha", "(F)V", "x", "getX", "setX", "getY", "setY", "width", "getWidth", "setWidth", "getHeight", "setHeight", "padding", "getPadding", "setPadding", "Loxxxde/\u062c\u064b;", "getDefaultFont", "()Lkotakbaz/rain/client/util/render/font/Font;", "defaultFont", "getIconFont", "iconFont", "rain-visuals"})
public class \u0627\u0638
implements \u0630\u0628 {
    private float padding = 5.0f;
    private float height;
    private float alpha = 1.0f;
    private float y;
    private float x;
    private float width;

    public final void setWidth(float f) {
        this.width = f;
    }

    @NotNull
    public final Font getDefaultFont() {
        return \u0631\u064e.INSTANCE.getGS_REGULAR();
    }

    @NotNull
    public final Font getIconFont() {
        return \u0631\u064e.INSTANCE.getICON();
    }

    public final void setX(float f) {
        this.x = f;
    }

    public final float calcMidY(float y, float height, float size) {
        return y + (height - size) / 2.0f;
    }

    public final void setY(float f) {
        this.y = f;
    }

    public final float getX() {
        return this.x;
    }

    public final void setHeight(float f) {
        this.height = f;
    }

    public final float getWidth() {
        return this.width;
    }

    public final float getY() {
        return this.y;
    }

    public final void setAlpha(float f) {
        this.alpha = f;
    }

    public final void setPadding(float f) {
        this.padding = f;
    }

    public final float getHeight() {
        return this.height;
    }

    public final float centerText(float size, float height) {
        return this.calcMidY(0.0f, height, size);
    }

    public final float getAlpha() {
        return this.alpha;
    }

    public final float getPadding() {
        return this.padding;
    }
}

