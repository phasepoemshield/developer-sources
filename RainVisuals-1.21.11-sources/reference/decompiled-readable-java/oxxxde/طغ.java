/*
 * Decompiled with CFR 0.152.
 */
package oxxxde;

import java.awt.Color;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import oxxxde.\u0633\u0631;

@Metadata(mv={2, 3, 0}, k=1, xi=48, d1={"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\r\b\u00c6\u0002\u0018\u00002\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004\u00a2\u0006\u0004\b\u0005\u0010\u0006J\u0015\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0004\u00a2\u0006\u0004\b\b\u0010\tJ\r\u0010\n\u001a\u00020\u0004\u00a2\u0006\u0004\b\n\u0010\u0006J\r\u0010\u000b\u001a\u00020\u0004\u00a2\u0006\u0004\b\u000b\u0010\u0006J\r\u0010\f\u001a\u00020\u0004\u00a2\u0006\u0004\b\f\u0010\u0006J\r\u0010\r\u001a\u00020\u0004\u00a2\u0006\u0004\b\r\u0010\u0006J\r\u0010\u000e\u001a\u00020\u0004\u00a2\u0006\u0004\b\u000e\u0010\u0006J\u0015\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u0004\u00a2\u0006\u0004\b\u0010\u0010\tR\u0014\u0010\u0011\u001a\u00020\u00048\u0006X\u0086T\u00a2\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0013\u001a\u00020\u00048\u0006X\u0086T\u00a2\u0006\u0006\n\u0004\b\u0013\u0010\u0012R\u0014\u0010\u0014\u001a\u00020\u00048\u0006X\u0086T\u00a2\u0006\u0006\n\u0004\b\u0014\u0010\u0012R\u0014\u0010\u0015\u001a\u00020\u00048\u0006X\u0086T\u00a2\u0006\u0006\n\u0004\b\u0015\u0010\u0012R\u0014\u0010\u0016\u001a\u00020\u00048\u0006X\u0086T\u00a2\u0006\u0006\n\u0004\b\u0016\u0010\u0012R\u0014\u0010\u0017\u001a\u00020\u00048\u0006X\u0086T\u00a2\u0006\u0006\n\u0004\b\u0017\u0010\u0012R\u0014\u0010\u0018\u001a\u00020\u00048\u0006X\u0086T\u00a2\u0006\u0006\n\u0004\b\u0018\u0010\u0012R\u0017\u0010\u001a\u001a\u00020\u00198\u0006\u00a2\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0017\u0010\u001e\u001a\u00020\u00198\u0006\u00a2\u0006\f\n\u0004\b\u001e\u0010\u001b\u001a\u0004\b\u001f\u0010\u001dR\u0017\u0010 \u001a\u00020\u00198\u0006\u00a2\u0006\f\n\u0004\b \u0010\u001b\u001a\u0004\b!\u0010\u001dR\u0017\u0010\"\u001a\u00020\u00198\u0006\u00a2\u0006\f\n\u0004\b\"\u0010\u001b\u001a\u0004\b#\u0010\u001dR\u0017\u0010$\u001a\u00020\u00198\u0006\u00a2\u0006\f\n\u0004\b$\u0010\u001b\u001a\u0004\b%\u0010\u001d\u00a8\u0006&"}, d2={"Loxxxde/\u0637\u063a;", "", "<init>", "()V", "", "scale", "()F", "value", "scaled", "(F)F", "margin", "headerTextSize", "rowTextSize", "rowLeadingGap", "rowDividerWidth", "textSize", "rowLeadingSize", "MARGIN", "F", "HEADER_TEXT_SIZE", "ROW_TEXT_SIZE", "ROW_LEADING_GAP", "ROW_DIVIDER_WIDTH", "CONTAINER_ANIMATION_DURATION", "ELEMENT_ANIMATION_DURATION", "Ljava/awt/Color;", "PANEL_COLOR", "Ljava/awt/Color;", "getPANEL_COLOR", "()Ljava/awt/Color;", "HEADER_COLOR", "getHEADER_COLOR", "TITLE_COLOR", "getTITLE_COLOR", "VALUE_COLOR", "getVALUE_COLOR", "ICON_COLOR", "getICON_COLOR", "rain-visuals"})
public final class \u0637\u063a {
    public static final float ROW_LEADING_GAP = 6.0f;
    public static final float ROW_DIVIDER_WIDTH = 1.2f;
    public static final float ELEMENT_ANIMATION_DURATION = 80.0f;
    @NotNull
    private static final Color HEADER_COLOR;
    @NotNull
    private static final Color VALUE_COLOR;
    public static final float ROW_TEXT_SIZE = 7.0f;
    @NotNull
    private static final Color ICON_COLOR;
    @NotNull
    private static final Color PANEL_COLOR;
    public static final float MARGIN = 6.0f;
    public static final float CONTAINER_ANIMATION_DURATION = 80.0f;
    @NotNull
    private static final Color TITLE_COLOR;
    public static final float HEADER_TEXT_SIZE = 9.0f;
    @NotNull
    public static final \u0637\u063a INSTANCE;

    static {
        INSTANCE = new \u0637\u063a();
        PANEL_COLOR = new Color(8, 8, 8, 255);
        HEADER_COLOR = new Color(255, 255, 255, 25);
        TITLE_COLOR = new Color(236, 236, 240, 255);
        VALUE_COLOR = new Color(128, 128, 128, 255);
        ICON_COLOR = new Color(128, 128, 128, 255);
    }

    public final float rowDividerWidth() {
        return this.scaled(1.2f);
    }

    @NotNull
    public final Color getTITLE_COLOR() {
        return TITLE_COLOR;
    }

    public final float scaled(float value) {
        return value * this.scale();
    }

    @NotNull
    public final Color getHEADER_COLOR() {
        return HEADER_COLOR;
    }

    @NotNull
    public final Color getPANEL_COLOR() {
        return PANEL_COLOR;
    }

    public final float rowTextSize() {
        return this.scaled(7.0f);
    }

    public final float margin() {
        return this.scaled(6.0f);
    }

    @NotNull
    public final Color getVALUE_COLOR() {
        return VALUE_COLOR;
    }

    public final float scale() {
        return \u0633\u0631.INSTANCE.hudScale();
    }

    @NotNull
    public final Color getICON_COLOR() {
        return ICON_COLOR;
    }

    private \u0637\u063a() {
    }

    public final float rowLeadingSize(float textSize) {
        return textSize + this.scaled(1.0f);
    }

    public final float headerTextSize() {
        return this.scaled(9.0f);
    }

    public final float rowLeadingGap() {
        return this.scaled(6.0f);
    }
}

