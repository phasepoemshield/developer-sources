package fun.wonderful.client.ui.clickgui;

import fun.wonderful.api.utils.color.ColorUtils;
import fun.wonderful.api.utils.input.KeyBoardUtils;
import fun.wonderful.api.utils.math.HoveringUtils;
import fun.wonderful.api.utils.render.RenderUtils;
import fun.wonderful.api.utils.render.fonts.msdf.Font;
import fun.wonderful.api.utils.render.fonts.msdf.Fonts;
import fun.wonderful.api.utils.scissor.ScissorUtils;
import fun.wonderful.client.modules.Module;
import fun.wonderful.client.modules.settings.Setting;
import fun.wonderful.client.ui.clickgui.ClickGuiLayout;
import fun.wonderful.client.ui.clickgui.ClickGuiSettingRenderer;
import fun.wonderful.client.ui.clickgui.ClickGuiState;
import fun.wonderful.client.ui.clickgui.ClickGuiThemeSelector;
import java.util.ArrayList;
import java.util.List;
import net.minecraft.client.util.Window;
import net.minecraft.client.gui.DrawContext;
import net.minecraft.util.math.MathHelper;

public class ClickGuiRenderer {
    private static final String ICON_ENABLED = "";
    private final ClickGuiState state;
    private float keybindPopupPanelX;
    private float keybindPopupModuleY;
    private float keybindPopupProgress = 0.0f;
    private float[] categoryBlurRects = new float[0];
    private final ClickGuiSettingRenderer settingRenderer;
    private final ClickGuiThemeSelector themeSelector;

    public ClickGuiRenderer(ClickGuiState state, ClickGuiSettingRenderer settingRenderer, ClickGuiThemeSelector themeSelector) {
        this.state = state;
        this.settingRenderer = settingRenderer;
        this.themeSelector = themeSelector;
    }

    public void render(DrawContext context, int mouseX, int mouseY, Window window, float animationProgress) {
        int i2;
        if (window == null) {
            return;
        }
        float alphaMul = MathHelper.clamp((float)animationProgress, (float)0.0f, (float)1.0f);
        int shadeColor = this.getFadeShadeColor(alphaMul, 120);
        int colorTheme = this.getThemeColor();
        Module hoveredModule = null;
        Module.ModuleCategory[] categories = Module.ModuleCategory.values();
        float panelY = this.state.getY() + this.state.getRenderOffsetY();
        int blurRectValues = categories.length * 2;
        if (this.categoryBlurRects.length < blurRectValues) {
            this.categoryBlurRects = new float[blurRectValues];
        }
        for (i2 = 0; i2 < categories.length; ++i2) {
            float panelX = ClickGuiLayout.getCategoryPanelX(this.state.getX(), i2);
            this.drawHudRectBase(context, panelX, panelY, 110.0f, 254.0f, 8.0f, colorTheme, alphaMul);
            this.categoryBlurRects[i2 * 2] = panelX;
            this.categoryBlurRects[i2 * 2 + 1] = panelY;
        }
        RenderUtils.drawHudBlurBatchSameShape(context.getMatrices(), this.categoryBlurRects, categories.length, 110.0f, 254.0f, 8.0f, alphaMul * 0.45f);
        for (i2 = 0; i2 < categories.length; ++i2) {
            Module.ModuleCategory category = categories[i2];
            float panelX = ClickGuiLayout.getCategoryPanelX(this.state.getX(), i2);
            Module categoryHoveredModule = this.renderCategoryPanel(context, mouseX, mouseY, panelX, category, colorTheme, alphaMul, shadeColor);
            if (categoryHoveredModule == null) continue;
            hoveredModule = categoryHoveredModule;
        }
        this.renderSearch(context, categories.length, colorTheme, alphaMul, this.getFadeShadeColor(alphaMul, 95));
        if (this.state.getBindingModule() != null) {
            this.keybindPopupProgress = Math.min(1.0f, this.keybindPopupProgress + 0.12f);
            this.renderKeybindPopup(context, window, colorTheme, alphaMul, this.keybindPopupProgress);
        } else {
            this.keybindPopupProgress = 0.0f;
        }
        this.renderDescription(context, window, hoveredModule, colorTheme, animationProgress);
    }

    private Module renderCategoryPanel(DrawContext context, int mouseX, int mouseY, float panelX, Module.ModuleCategory category, int colorTheme, float alphaMul, int shadeColor) {
        float panelY = this.state.getY() + this.state.getRenderOffsetY();
        RenderUtils.drawRoundedRect(context.getMatrices(), panelX + 4.0f, panelY + 22.0f, 102.0f, 0.5f, 0.0f, ColorUtils.rgb(19, 18, 24));
        if ((shadeColor >> 24 & 0xFF) > 0) {
            RenderUtils.drawRoundedRect(context.getMatrices(), panelX, panelY, 110.0f, 254.0f, 8.0f, shadeColor);
        }
        Font headerFont = this.issue(15);
        Font iconFont = this.icons(14);
        float titleWidth = headerFont.getWidth(category.getName());
        float iconWidth = iconFont.getWidth(category.getIcons());
        float groupWidth = titleWidth + iconWidth + 4.0f;
        float groupX = panelX + (110.0f - groupWidth) / 2.0f;
        float headerY = panelY + 8.0f;
        iconFont.draw(context.getMatrices(), category.getIcons(), groupX, headerY + 1.0f, this.alpha(colorTheme, alphaMul));
        headerFont.draw(context.getMatrices(), category.getName(), groupX + iconWidth + 4.0f, headerY + 1.0f, this.alpha(-1, alphaMul));
        float contentY = ClickGuiLayout.getContentY(panelY);
        float contentHeight = ClickGuiLayout.getContentHeight();
        this.state.clampScroll(category, contentHeight);
        float moduleY = contentY + this.state.getScroll(category);
        Module hoveredModule = null;
        ScissorUtils.push();
        ScissorUtils.setFromComponentCoordinates(panelX, contentY, 110.0, contentHeight);
        for (Module module : this.state.getModules(category)) {
            Module moduleHover;
            float openProgress;
            float moduleHeight = ClickGuiLayout.getModuleHeight(module, openProgress = this.state.getOpenProgress(module));
            if (moduleY + moduleHeight + 4.0f >= contentY && moduleY <= contentY + contentHeight && (moduleHover = this.renderModule(context, mouseX, mouseY, panelX, moduleY, module, openProgress, moduleHeight, colorTheme, alphaMul, shadeColor)) != null) {
                hoveredModule = moduleHover;
            }
            moduleY += 4.0f + moduleHeight;
        }
        ScissorUtils.pop();
        return hoveredModule;
    }

    private String abbreviateBind(String bindName) {
        if (bindName == null) {
            return "";
        }
        return switch (bindName) {
            case "PAGEDOWN" -> "PD";
            case "PAGEUP" -> "PU";
            case "BACKSPACE" -> "BS";
            case "NUMENTER" -> "NE";
            case "DELETE" -> "Del";
            case "INSERT" -> "Ins";
            case "CAPS" -> "Caps";
            default -> bindName;
        };
    }

    private Module renderModule(DrawContext context, int mouseX, int mouseY, float panelX, float moduleY, Module module, float openProgress, float moduleHeight, int colorTheme, float alphaMul, int shadeColor) {
        List<Setting> settings = module.getSettings();
        this.renderModuleBackground(context, panelX, moduleY, moduleHeight, module.isEnable(), colorTheme, shadeColor);
        String moduleName = module.getName();
        Object bindText = "";
        if (this.state.getBindingModule() == module) {
            bindText = "[...]";
            this.keybindPopupPanelX = panelX;
            this.keybindPopupModuleY = moduleY;
        } else if (module.getKey() != -1) {
            bindText = "[" + this.abbreviateBind(this.state.toEnglish(KeyBoardUtils.getBindName(module.getKey()))) + "]";
        }
        int nameColor = module.isEnable() ? this.alpha(-1, alphaMul) : this.alpha(ColorUtils.rgba(255, 255, 255, 170), alphaMul);
        int bindColor = module.isEnable() ? this.alpha(ColorUtils.rgba(255, 255, 255, 150), alphaMul) : this.alpha(ColorUtils.rgba(255, 255, 255, 100), alphaMul);
        Font nameFont = this.issue(14);
        Font vectorFont = this.vector(9);
        float nameY = moduleY + (19.0f - nameFont.getHeight()) + 2.5f;
        float iconProgress = Math.max(0.0f, Math.min(1.0f, this.state.getIconProgress(module)));
        float iconW = vectorFont != null ? vectorFont.getWidth(ICON_ENABLED) : 0.0f;
        float totalShift = vectorFont != null ? (2.0f + iconW + 4.0f) * iconProgress : 0.0f;
        float textX = panelX + 10.0f + totalShift;
        boolean hasDots = settings != null && !settings.isEmpty() && ClickGuiLayout.hasVisibleSettings(settings);
        nameFont.draw(context.getMatrices(), moduleName, textX, nameY, nameColor);
        if (!((String)bindText).isEmpty()) {
            Font bindFont = this.issue(11);
            float bindX = textX + nameFont.getWidth(moduleName);
            float bindY = nameY + (nameFont.getHeight() - bindFont.getHeight()) / 2.0f;
            bindFont.draw(context.getMatrices(), (String)bindText, bindX, bindY, bindColor);
        }
        if (iconProgress > 0.02f && vectorFont != null) {
            float iconX = panelX + 10.0f + 2.0f - (1.0f - iconProgress) * 4.0f;
            float iconY = nameY + (nameFont.getHeight() - vectorFont.getHeight()) / 2.0f - 0.5f;
            int iconColor = this.alpha(ColorUtils.applyAlpha(colorTheme, iconProgress), alphaMul);
            vectorFont.draw(context.getMatrices(), ICON_ENABLED, iconX, iconY, iconColor);
        }
        if (hasDots) {
            this.renderModuleDots(context, panelX, moduleY, module, module.isEnable(), alphaMul);
        }
        if (settings != null && !settings.isEmpty()) {
            this.settingRenderer.render(context, module, panelX, moduleY, openProgress, colorTheme, mouseX, mouseY, this.state);
        }
        if (HoveringUtils.isHovered(mouseX, mouseY, panelX + 4.0f, moduleY, 102.0, moduleHeight)) {
            return module;
        }
        return null;
    }

    private void renderModuleBackground(DrawContext context, float panelX, float moduleY, float moduleHeight, boolean enabled, int colorTheme, int shadeColor) {
        int topBorder;
        int fill;
        float bgX = panelX + 4.0f;
        float bgW = 102.0f;
        float radius = 4.0f;
        if (enabled) {
            int r2 = colorTheme >> 16 & 0xFF;
            int g2 = colorTheme >> 8 & 0xFF;
            int b2 = colorTheme & 0xFF;
            fill = ColorUtils.rgba(r2, g2, b2, 28);
            topBorder = ColorUtils.rgba(r2, g2, b2, 56);
        } else {
            fill = ColorUtils.rgba(255, 255, 255, 5);
            topBorder = ColorUtils.rgba(255, 255, 255, 5);
        }
        RenderUtils.drawRoundedRect(context.getMatrices(), bgX, moduleY, bgW, moduleHeight, radius, fill);
        RenderUtils.drawRoundedRect(context.getMatrices(), bgX + radius, moduleY, bgW - radius * 2.0f, 1.0f, 0.0f, topBorder);
        if ((shadeColor >> 24 & 0xFF) > 0) {
            RenderUtils.drawRoundedRect(context.getMatrices(), bgX, moduleY, bgW, moduleHeight, radius, shadeColor);
        }
    }

    private void renderModuleDots(DrawContext context, float panelX, float moduleY, Module module, boolean enabled, float alphaMul) {
        float[][] offsets;
        int dotsColor = enabled ? this.alpha(ColorUtils.rgba(255, 255, 255, 220), alphaMul) : this.alpha(ColorUtils.rgba(255, 255, 255, 100), alphaMul);
        float dotsX = panelX + 96.1f;
        float baseY = moduleY + 9.5f;
        float spacing = 2.0f;
        float radius = 2.1f;
        float bottomXOffset = 2.1f;
        float angle = this.state.updateDotsRotation(module, module.isOpen() ? 1.5707964f : 0.0f);
        float cos = (float)Math.cos(angle);
        float sin = (float)Math.sin(angle);
        for (float[] offset : offsets = new float[][]{{0.0f, -spacing}, {-bottomXOffset, spacing}, {bottomXOffset, spacing}}) {
            float rx = offset[0] * cos - offset[1] * sin;
            float ry = offset[0] * sin + offset[1] * cos;
            RenderUtils.drawRoundCircle(context.getMatrices(), dotsX + rx, baseY + ry, radius, dotsColor);
        }
    }

    private int getThemeColor() {
        return ColorUtils.getThemeColor();
    }

    private void renderSearch(DrawContext context, int categoryCount, int colorTheme, float alphaMul, int shadeColor) {
        String query;
        float searchY = ClickGuiLayout.getSearchY(this.state.getY() + this.state.getRenderOffsetY());
        float searchW = this.getSearchWidth();
        float searchX = ClickGuiLayout.getSearchX(this.state.getX(), categoryCount, searchW);
        float searchH = 18.0f;
        float selectionPaddingLeft = 3.0f;
        float radius = searchH / 2.0f;
        this.drawHudRect(context, searchX, searchY, searchW, searchH, radius, colorTheme, alphaMul);
        if ((shadeColor >> 24 & 0xFF) > 0) {
            RenderUtils.drawRoundedRect(context.getMatrices(), searchX, searchY, searchW, searchH, radius, shadeColor);
        }
        String text = (query = this.state.getSearchText()).isEmpty() ? "Search..." : query;
        int textColor = query.isEmpty() ? this.alpha(ColorUtils.rgba(255, 255, 255, 110), alphaMul) : this.alpha(ColorUtils.rgba(255, 255, 255, 230), alphaMul);
        float iconX = searchX + 4.0f;
        float textX = searchX + 16.0f;
        Font searchFont = this.issue(14);
        float textY = searchY + (searchH - searchFont.getHeight()) / 2.0f + 5.0f + 0.5f;
        this.iconsNew(18).drawGradientStringHorizontal(context.getMatrices(), "l", iconX + 2.0f, searchY + (searchH - 14.0f) / 2.0f + 5.0f, this.alpha(colorTheme, alphaMul), this.alpha(colorTheme, alphaMul));
        ScissorUtils.push();
        ScissorUtils.setFromComponentCoordinates(textX - selectionPaddingLeft, searchY, searchW - 16.0f - 8.0f + selectionPaddingLeft, searchH);
        if (!query.isEmpty() && this.state.hasSearchSelection()) {
            int selectionStart = this.state.getSearchSelectionStart();
            int selectionEnd = this.state.getSearchSelectionEnd();
            String before = query.substring(0, selectionStart);
            String selected = query.substring(selectionStart, selectionEnd);
            String after = query.substring(selectionEnd);
            float beforeWidth = searchFont.getWidth(before);
            float selectedWidth = searchFont.getWidth(selected);
            int selectedTextColor = this.alpha(ColorUtils.rgba(170, 170, 170, 255), alphaMul);
            searchFont.draw(context.getMatrices(), before, textX, textY, textColor);
            searchFont.draw(context.getMatrices(), selected, textX + beforeWidth, textY, selectedTextColor);
            searchFont.draw(context.getMatrices(), after, textX + beforeWidth + selectedWidth, textY, textColor);
        } else {
            searchFont.draw(context.getMatrices(), text, textX, textY, textColor);
        }
        if (this.state.isSearchActive() && System.currentTimeMillis() / 500L % 2L == 0L) {
            float cursorX = textX + searchFont.getWidth(query.substring(0, Math.min(this.state.getSearchCursor(), query.length())));
            RenderUtils.drawRoundedRect(context.getMatrices(), cursorX + 1.0f, searchY + (searchH - 9.0f) / 2.0f, 0.8f, 9.0f, 0.0f, this.alpha(ColorUtils.applyAlpha(colorTheme, 0.9f), alphaMul));
        }
        ScissorUtils.pop();
    }

    private void renderDescription(DrawContext context, Window window, Module hoveredModule, int colorTheme, float alphaMul) {
        float maxWidth;
        if (hoveredModule == null) {
            return;
        }
        String description = hoveredModule.getDisplayDescription();
        if (description == null || description.isBlank() || "NULLABLE".equalsIgnoreCase(description) || "desc".equalsIgnoreCase(description)) {
            return;
        }
        Font descriptionFont = this.issue(18);
        List<String> lines = this.wrapDescription(descriptionFont, description, maxWidth = (float)window.getScaledWidth() - 40.0f);
        if (lines.isEmpty()) {
            return;
        }
        float lineHeight = descriptionFont.getHeight() - 2.0f;
        float boxHeight = (float)lines.size() * lineHeight;
        float centerX = (float)window.getScaledWidth() * 0.5f;
        float startY = 100.0f - boxHeight + 18.0f;
        for (int i2 = 0; i2 < lines.size(); ++i2) {
            descriptionFont.drawCenteredString(context.getMatrices(), lines.get(i2), centerX, startY + (float)i2 * lineHeight, ColorUtils.applyAlpha(-1, alphaMul));
        }
    }

    private List<String> wrapDescription(Font font, String text, float maxWidth) {
        ArrayList<String> lines = new ArrayList<String>();
        String[] words = text.trim().split("\\s+");
        if (words.length == 0) {
            return lines;
        }
        StringBuilder currentLine = new StringBuilder();
        for (String word : words) {
            String candidate;
            String string = candidate = currentLine.isEmpty() ? word : String.valueOf(currentLine) + " " + word;
            if (font.getWidth(candidate) <= maxWidth || currentLine.isEmpty()) {
                currentLine.setLength(0);
                currentLine.append(candidate);
                continue;
            }
            lines.add(currentLine.toString());
            currentLine.setLength(0);
            currentLine.append(word);
        }
        if (!currentLine.isEmpty()) {
            lines.add(currentLine.toString());
        }
        return lines;
    }

    private float getSearchWidth() {
        String query = this.state.getSearchText();
        String text = query.isEmpty() ? "Search..." : query;
        float contentWidth = 16.0f + this.issue(14).getWidth(text) + 8.0f;
        return Math.max(80.0f, contentWidth);
    }

    private Font issue(int size) {
        return Fonts.getFont("suisse", size);
    }

    private Font icons(int size) {
        return Fonts.getFont("clickgui", size);
    }

    private Font iconsNew(int size) {
        return Fonts.getFont("icon1", size);
    }

    private Font vector(int size) {
        return Fonts.getFont("vector", size);
    }

    private void renderKeybindPopup(DrawContext context, Window window, int colorTheme, float alphaMul, float progress) {
        Module module = this.state.getBindingModule();
        if (module == null) {
            return;
        }
        float r2 = 6.0f;
        float padH = 20.0f;
        float padV = 0.0f;
        float gap = 6.0f;
        float badgeSz = 11.0f;
        String keyRaw = module.getKey() != -1 ? this.state.toEnglish(KeyBoardUtils.getBindName(module.getKey())) : "-";
        String keyName = keyRaw.length() > 2 ? keyRaw.substring(0, 2) : keyRaw;
        Font font = this.issue(12);
        Font badgeFont = this.issue(11);
        float badgeTextW = badgeFont.getWidth(keyName);
        float badgeW = Math.max(10.5f, badgeTextW + 0.0f);
        float row1W = font.getWidth("Set Keybind");
        float row2W = font.getWidth("Keybind") + 10.0f + badgeW;
        float popW = Math.max(row1W, row2W) + 40.0f;
        float popH = 0.0f + font.getHeight() + 6.0f + 11.0f + 0.0f;
        float popX = this.keybindPopupPanelX + (110.0f - popW) / 2.0f;
        float popY = this.keybindPopupModuleY + 19.0f + 3.0f - (1.0f - progress) * 4.0f;
        popX = Math.max(4.0f, Math.min((float)window.getScaledWidth() - popW - 4.0f, popX));
        popY = Math.max(4.0f, Math.min((float)window.getScaledHeight() - popH - 4.0f, popY));
        float a2 = alphaMul * progress;
        this.drawHudRect(context, popX, popY, popW, popH, 6.0f, colorTheme, a2);
        float row1Y = popY + 0.0f;
        float row2Y = row1Y + font.getHeight() + 6.0f;
        font.draw(context.getMatrices(), "Set Keybind", popX + 20.0f - 14.0f, row1Y + 7.5f, this.alpha(-1, a2));
        font.draw(context.getMatrices(), "Keybind", popX + 20.0f - 14.0f, row2Y + 0.5f, this.alpha(ColorUtils.rgba(255, 255, 255, 140), a2));
        float badgeX = popX + popW - 5.0f - badgeW;
        float badgeY = row2Y + (font.getHeight() - 11.0f) / 2.0f - 5.0f;
        RenderUtils.drawRoundedRect(context.getMatrices(), badgeX, badgeY, badgeW, 11.0f, 3.0f, this.alpha(colorTheme, a2));
        badgeFont.draw(context.getMatrices(), keyName, badgeX + (badgeW - badgeTextW) / 2.0f, badgeY + (11.0f - badgeFont.getHeight() * 0.5f) / 2.0f + 2.0f, this.alpha(ColorUtils.rgba(0, 0, 0, 220), a2));
    }

    private int alpha(int color, float alphaMul) {
        return ColorUtils.applyAlpha(color, alphaMul);
    }

    private void drawHudRect(DrawContext context, float x2, float y2, float width, float height, float radius, int themeColor, float alphaMul) {
        this.drawHudRectBase(context, x2, y2, width, height, radius, themeColor, alphaMul);
        RenderUtils.drawHudBlur(context.getMatrices(), x2, y2, width, height, radius, alphaMul * 0.45f);
    }

    private void drawHudRectBase(DrawContext context, float x2, float y2, float width, float height, float radius, int themeColor, float alphaMul) {
        RenderUtils.drawDefaultHudPanel(context.getMatrices(), x2, y2, width, height, radius, radius + 0.5f, ColorUtils.applyAlpha(ColorUtils.rgba(50, 50, 50, 255), alphaMul), ColorUtils.applyAlpha(ColorUtils.darken(themeColor, 0.15f), alphaMul), ColorUtils.applyAlpha(ColorUtils.darken(themeColor, 0.05f), alphaMul));
    }

    private int getFadeShadeColor(float alphaMul, int maxAlpha) {
        int alpha = MathHelper.clamp((int)((int)((1.0f - alphaMul) * (float)maxAlpha)), (int)0, (int)255);
        return ColorUtils.rgba(0, 0, 0, alpha);
    }
}