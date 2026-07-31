package sky.core.ui.gui.click.theme;

import java.awt.Color;
import sky.core.ui.gui.click.ClickGuiTheme;

public final class Theme {
    private final String id;
    private final String name;
    private final Color accent;
    private final Color panelTop;
    private final Color panelBottom;
    private final Color cardTop;
    private final Color cardBottom;
    private final Color cardActiveTop;
    private final Color cardActiveBottom;
    private final Color modeOff;
    private final Color sliderTrack;
    private final Color toggleOff;
    private final Color hudSeparator;
    private final boolean animated;

    public Theme(
            String id,
            String name,
            Color accent,
            Color panelTop,
            Color panelBottom,
            Color cardTop,
            Color cardBottom,
            Color cardActiveTop,
            Color cardActiveBottom,
            Color modeOff,
            Color sliderTrack,
            Color toggleOff,
            Color hudSeparator
    ) {
        this(id, name, accent, panelTop, panelBottom, cardTop, cardBottom, cardActiveTop, cardActiveBottom, modeOff, sliderTrack, toggleOff, hudSeparator, false);
    }

    public Theme(
            String id,
            String name,
            Color accent,
            Color panelTop,
            Color panelBottom,
            Color cardTop,
            Color cardBottom,
            Color cardActiveTop,
            Color cardActiveBottom,
            Color modeOff,
            Color sliderTrack,
            Color toggleOff,
            Color hudSeparator,
            boolean animated
    ) {
        this.id = id;
        this.name = name;
        this.accent = accent;
        this.panelTop = panelTop;
        this.panelBottom = panelBottom;
        this.cardTop = cardTop;
        this.cardBottom = cardBottom;
        this.cardActiveTop = cardActiveTop;
        this.cardActiveBottom = cardActiveBottom;
        this.modeOff = modeOff;
        this.sliderTrack = sliderTrack;
        this.toggleOff = toggleOff;
        this.hudSeparator = hudSeparator;
        this.animated = animated;
    }

    public String getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public Color getAccent() {
        return this.accent;
    }

    public boolean isAnimated() {
        return this.animated;
    }

    public Color getSwatchColor() {
        if (this.animated) {
            return Themes.getRainbowColor();
        }
        return this.accent;
    }

    public void apply() {
        if (this.animated) {
            Themes.applyRainbowTheme();
            return;
        }
        this.applyStatic(this.accent);
    }

    public void applyAccent(Color accentColor) {
        if (this.animated) {
            Themes.applyRainbowTheme();
            return;
        }
        this.applyStatic(accentColor);
    }

    private void applyStatic(Color accentColor) {
        ClickGuiTheme target = ClickGuiTheme.theme;
        target.setPanelTop(this.panelTop);
        target.setPanelBottom(this.panelBottom);
        target.setCardTop(this.cardTop);
        target.setCardBottom(this.cardBottom);
        target.setCardActiveTop(this.cardActiveTop);
        target.setCardActiveBottom(this.cardActiveBottom);
        target.setAccent(accentColor);
        target.setToggleOn(accentColor);
        target.setModeOn(accentColor);
        target.setSliderFill(accentColor);
        target.setModeOff(this.modeOff);
        target.setSliderTrack(this.sliderTrack);
        target.setToggleOff(this.toggleOff);
        target.setHudSeparator(this.hudSeparator);
    }
}
