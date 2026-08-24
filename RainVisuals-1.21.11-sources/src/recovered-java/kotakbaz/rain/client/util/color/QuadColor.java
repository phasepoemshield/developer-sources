/*
 * Decompiled with CFR 0.152.
 */
package kotakbaz.rain.client.util.color;

import java.awt.Color;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(mv={2, 3, 0}, k=1, xi=48, d1={"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0002\n\u0002\b\u0010\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u00a2\u0006\u0004\b\u0007\u0010\bB\u0011\b\u0016\u0012\u0006\u0010\t\u001a\u00020\u0002\u00a2\u0006\u0004\b\u0007\u0010\nJ\u0015\u0010\f\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\u0002\u00a2\u0006\u0004\b\f\u0010\nJ-\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u0002\u00a2\u0006\u0004\b\f\u0010\bR\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\nR\"\u0010\u0004\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\b\u0004\u0010\u0011\u001a\u0004\b\u0015\u0010\u0013\"\u0004\b\u0016\u0010\nR\"\u0010\u0005\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\b\u0005\u0010\u0011\u001a\u0004\b\u0017\u0010\u0013\"\u0004\b\u0018\u0010\nR\"\u0010\u0006\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\b\u0006\u0010\u0011\u001a\u0004\b\u0019\u0010\u0013\"\u0004\b\u001a\u0010\n\u00a8\u0006\u001b"}, d2={"Loxxxde/\u0633\u0629;", "", "Ljava/awt/Color;", "color1", "color2", "color3", "color4", "<init>", "(Ljava/awt/Color;Ljava/awt/Color;Ljava/awt/Color;Ljava/awt/Color;)V", "color", "(Ljava/awt/Color;)V", "", "set", "c1", "c2", "c3", "c4", "Ljava/awt/Color;", "getColor1", "()Ljava/awt/Color;", "setColor1", "getColor2", "setColor2", "getColor3", "setColor3", "getColor4", "setColor4", "rain-visuals"})
public final class QuadColor {
    @NotNull
    private Color color1;
    @NotNull
    private Color color2;
    @NotNull
    private Color color4;
    @NotNull
    private Color color3;

    public QuadColor(@NotNull Color color1, @NotNull Color color2, @NotNull Color color3, @NotNull Color color4) {
        Intrinsics.checkNotNullParameter(color1, "color1");
        Intrinsics.checkNotNullParameter(color2, "color2");
        Intrinsics.checkNotNullParameter(color3, "color3");
        Intrinsics.checkNotNullParameter(color4, "color4");
        this.color1 = color1;
        this.color2 = color2;
        this.color3 = color3;
        this.color4 = color4;
    }

    @NotNull
    public final Color getColor1() {
        return this.color1;
    }

    public final void setColor2(@NotNull Color color) {
        Intrinsics.checkNotNullParameter(color, "<set-?>");
        this.color2 = color;
    }

    public final void setColor3(@NotNull Color color) {
        Intrinsics.checkNotNullParameter(color, "<set-?>");
        this.color3 = color;
    }

    @NotNull
    public final Color getColor3() {
        return this.color3;
    }

    @NotNull
    public final Color getColor4() {
        return this.color4;
    }

    public QuadColor(@NotNull Color color) {
        Intrinsics.checkNotNullParameter(color, "color");
        this(color, color, color, color);
    }

    public final void setColor4(@NotNull Color color) {
        Intrinsics.checkNotNullParameter(color, "<set-?>");
        this.color4 = color;
    }

    @NotNull
    public final Color getColor2() {
        return this.color2;
    }

    public final void set(@NotNull Color color) {
        Intrinsics.checkNotNullParameter(color, "color");
        this.color1 = color;
        this.color2 = color;
        this.color3 = color;
        this.color4 = color;
    }

    public final void setColor1(@NotNull Color color) {
        Intrinsics.checkNotNullParameter(color, "<set-?>");
        this.color1 = color;
    }

    public final void set(@NotNull Color c1, @NotNull Color c2, @NotNull Color c3, @NotNull Color c4) {
        Intrinsics.checkNotNullParameter(c1, "c1");
        Intrinsics.checkNotNullParameter(c2, "c2");
        Intrinsics.checkNotNullParameter(c3, "c3");
        Intrinsics.checkNotNullParameter(c4, "c4");
        this.color1 = c1;
        this.color2 = c2;
        this.color3 = c3;
        this.color4 = c4;
    }
}

