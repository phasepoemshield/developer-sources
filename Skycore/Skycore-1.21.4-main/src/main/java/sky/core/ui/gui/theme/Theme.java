package sky.core.ui.gui.theme;

import java.awt.Color;
import sky.core.ui.gui.click.ClickGuiTheme;

public final class Theme {
    private final String id;
    private final Color accent;
    private final Color panelTop;
    private final Color panelBottom;
    private final Color cardTop;
    private final Color cardBottom;
    private final Color cardActiveTop;
    private final Color cardActiveBottom;
    private final Color modeOff;
    private final Color sliderTrack;
    private final Color hudTop;
    private final Color hudBottom;

    public Theme(
            String id,
            Color accent,
            Color panelTop,
            Color panelBottom,
            Color cardTop,
            Color cardBottom,
            Color cardActiveTop,
            Color cardActiveBottom,
            Color modeOff,
            Color sliderTrack,
            Color hudTop,
            Color hudBottom
    ) {
        this.id = id;
        this.accent = accent;
        this.panelTop = panelTop;
        this.panelBottom = panelBottom;
        this.cardTop = cardTop;
        this.cardBottom = cardBottom;
        this.cardActiveTop = cardActiveTop;
        this.cardActiveBottom = cardActiveBottom;
        this.modeOff = modeOff;
        this.sliderTrack = sliderTrack;
        this.hudTop = hudTop;
        this.hudBottom = hudBottom;
    }

    public String getId() {
        return this.id;
    }

    public Color getAccent() {
        return this.accent;
    }

    public void apply() {
        ClickGuiTheme theme = ClickGuiTheme.theme;
        theme.setPanelTop(this.panelTop);
        theme.setPanelBottom(this.panelBottom);
        theme.setCardTop(this.cardTop);
        theme.setCardBottom(this.cardBottom);
        theme.setCardActiveTop(this.cardActiveTop);
        theme.setCardActiveBottom(this.cardActiveBottom);
        theme.setAccent(this.accent);
        theme.setToggleOn(this.accent);
        theme.setModeOn(this.accent);
        theme.setSliderFill(this.accent);

        theme.setModeOff(this.modeOff);
        theme.setSliderTrack(this.sliderTrack);
    }
}
