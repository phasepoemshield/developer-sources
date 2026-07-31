package sky.core.ui.gui.click;

import java.awt.Color;

public class ClickGuiTheme {
    private Color panelTop = new Color(32, 24, 41, 255);
    private Color panelBottom = new Color(9, 9, 18, 255);
    private Color cardTop = new Color(28, 24, 42, 255);
    private Color cardBottom = new Color(14, 12, 22, 255);
    private Color cardActiveTop = new Color(31, 25, 50, 255);
    private Color cardActiveBottom = new Color(22, 16, 36, 255);
    private Color text = new Color(255, 255, 255, 255);
    private Color textDim = new Color(150, 150, 160, 255);
    private Color accent = new Color(130, 105, 255, 255);
    private Color toggleOff = new Color(55, 55, 65, 255);
    private Color toggleOn = new Color(130, 105, 255, 255);
    private Color modeOff = new Color(45, 42, 58, 180);
    private Color modeOn = new Color(130, 105, 255, 255);
    private Color sliderTrack = new Color(40, 38, 52, 255);
    private Color sliderFill = new Color(130, 105, 255, 255);
    private Color overlay = new Color(0, 0, 0, 120);
    private Color footerLine = new Color(255, 255, 255, 50);
    private Color footerText = new Color(140, 140, 140, 255);
    private Color hudSeparator = new Color(28, 28, 28, 255);

    private float panelRadius = 18.0F;
    private float cardRadius = 12.0F;
    private float footerLineHeight = 0.5F;
    private float footerTextHeight = 14.0F;
    private float moduleTop = 12.0F;
    private int fontIcon = 14;
    private int fontModule = 16;
    private int fontSetting = 14;
    private int fontFooter = 12;

    public static ClickGuiTheme theme = new ClickGuiTheme();

    public Color getPanelTop() { return panelTop; }
    public void setPanelTop(Color panelTop) { this.panelTop = panelTop; }
    public Color getPanelBottom() { return panelBottom; }
    public void setPanelBottom(Color panelBottom) { this.panelBottom = panelBottom; }
    public Color getCardTop() { return cardTop; }
    public void setCardTop(Color cardTop) { this.cardTop = cardTop; }
    public Color getCardBottom() { return cardBottom; }
    public void setCardBottom(Color cardBottom) { this.cardBottom = cardBottom; }
    public Color getCardActiveTop() { return cardActiveTop; }
    public void setCardActiveTop(Color cardActiveTop) { this.cardActiveTop = cardActiveTop; }
    public Color getCardActiveBottom() { return cardActiveBottom; }
    public void setCardActiveBottom(Color cardActiveBottom) { this.cardActiveBottom = cardActiveBottom; }
    public Color getText() { return text; }
    public Color getTextDim() { return textDim; }
    public Color getAccent() { return accent; }
    public void setAccent(Color accent) { this.accent = accent; }
    public Color getToggleOff() { return toggleOff; }
    public void setToggleOff(Color toggleOff) { this.toggleOff = toggleOff; }
    public Color getToggleOn() { return toggleOn; }
    public void setToggleOn(Color toggleOn) { this.toggleOn = toggleOn; }
    public Color getModeOff() { return modeOff; }
    public void setModeOff(Color modeOff) { this.modeOff = modeOff; }
    public Color getModeOn() { return modeOn; }
    public void setModeOn(Color modeOn) { this.modeOn = modeOn; }
    public Color getSliderTrack() { return sliderTrack; }
    public void setSliderTrack(Color sliderTrack) { this.sliderTrack = sliderTrack; }
    public Color getSliderFill() { return sliderFill; }
    public void setSliderFill(Color sliderFill) { this.sliderFill = sliderFill; }
    public Color getOverlay() { return overlay; }
    public Color getFooterText() { return footerText; }
    public Color getHudSeparator() { return hudSeparator; }
    public void setHudSeparator(Color hudSeparator) { this.hudSeparator = hudSeparator; }
    public float getPanelRadius() { return panelRadius; }
    public float getCardRadius() { return cardRadius; }
    public float getModuleTop() { return moduleTop; }
    public void setModuleTop(float moduleTop) { this.moduleTop = moduleTop; }
    public int getFontModule() { return fontModule; }
    public int getFontSetting() { return fontSetting; }
    public int getFontFooter() { return fontFooter; }
}
