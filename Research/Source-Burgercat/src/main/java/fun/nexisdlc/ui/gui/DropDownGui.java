package fun.nexisdlc.ui.gui;

import fun.nexisdlc.NexisClient;
import fun.nexisdlc.client.ClientColors;
import fun.nexisdlc.client.utils.config.ThemeConfig;
import fun.nexisdlc.client.utils.player.PlayerUtils;
import fun.nexisdlc.client.utils.render.CursorHelper;
import fun.nexisdlc.client.utils.render.animations.Easings;
import fun.nexisdlc.client.utils.render.animations.impl.SimpleLinearAnimation;
import fun.nexisdlc.client.utils.render.color.ColorUtils;
import fun.nexisdlc.client.utils.render.main.core.Renderer2D;
import fun.nexisdlc.client.utils.render.main.text.FontRegistry;
import fun.nexisdlc.modules.api.Category;
import fun.nexisdlc.modules.api.Function;
import fun.nexisdlc.modules.api.settings.api.Setting;
import fun.nexisdlc.ui.gui.elements.ColorComp;
import fun.nexisdlc.ui.gui.elements.SearchComponent;
import fun.nexisdlc.ui.gui.elements.SettingComponent;
import fun.nexisdlc.ui.gui.elements.ThemeWidget;
import net.minecraft.client.gui.Click;
import net.minecraft.client.input.CharInput;
import net.minecraft.client.input.KeyInput;
import org.lwjgl.glfw.GLFW;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

import static fun.nexisdlc.client.utils.client.IMinecraft.mc;

public class DropDownGui extends BaseClickGui {
    private static final float PANEL_WIDTH = 252f;
    private static final float PANEL_GAP = 5f;
    private static final float HEADER_HEIGHT = 40f;
    private static final float MODULE_HEIGHT = 36.9f;
    private static final float MODULE_GAP = 5f;
    private static final float PADDING = 9.2f;
    private static final float ROUNDING = 25f;
    private static final float SETTINGS_OFFSET = -6f;
    private static final float SETTINGS_HEIGHT_REDUCTION = 8f;
    private static final float BOTTOM_PADDING = 10f;
    private static final float GLOBAL_HINT_TOP_GAP = 12f;
    private static final long PANEL_ANIM_MS = 220L;
    private static final float DESC_TEXT_SIZE = 24f;
    private static final float DESC_PADDING_X = 12f;
    private static final float SEARCH_BOTTOM_GAP = 12f;

    private static final int TEXT_WHITE = ColorUtils.rgb(255, 255, 255);
    private static final int ROW_HOVER = ColorUtils.rgba(255, 255, 255, 18);
    private static final int ROW_BG = ColorUtils.rgba(255, 255, 255, 10);

    private final List<Panel> panels = new ArrayList<>();
    private final ThemeWidget themeWidget = new ThemeWidget();
    private final SearchComponent searchComponent = new SearchComponent();
    private final SimpleLinearAnimation descriptionAlpha = new SimpleLinearAnimation(180);
    private final SimpleLinearAnimation themeWidgetSlideAnimation = new SimpleLinearAnimation(300);

    private Function bindingFunction = null;
    private float panelHeight = 575f;
    private static String hoveredDescription = "";
    private String lastHoveredDescription = "";

    public static void setHoveredDescription(String description) {
        hoveredDescription = description == null ? "" : description.trim();
    }

    DropDownGui() {
        themeWidgetSlideAnimation.setEasing(Easings.EASE_OUT_CUBIC);
        if (ThemeWidget.isOpen()) {
            themeWidgetSlideAnimation.show();
        }

        for (Category cat : Category.values()) {
            panels.add(new Panel(cat));
        }
    }

    @Override
    protected void resetAnimations() {
        super.resetAnimations();
        if (ThemeWidget.isOpen()) {
            themeWidgetSlideAnimation.show();
        } else {
            themeWidgetSlideAnimation.hide();
        }
    }

    @Override
    protected void renderGui(Renderer2D r, int vw, int vh) {
        CursorHelper.setArrow();
        updatePanelPositions(vw, vh);

        if (ThemeWidget.isOpen()) {
            themeWidgetSlideAnimation.show();
        } else {
            themeWidgetSlideAnimation.hide();
        }

        for (int i = 0; i < panels.size(); i++) {
            renderAnimatedPanel(r, panels.get(i), i);
        }

        renderSearchComponent(r, vw, vh);
        renderGlobalHint(r);
        drawHoveredDescription(r, vw, vh);

        float guiProgress = panelProgress(0);
        float themeSlideProgress = themeWidgetSlideAnimation.getProgress();
        if (themeSlideProgress > 0f && !panels.isEmpty() && guiProgress > 0f) {
            float widgetAnimX = panels.get(0).x - (2f - themeSlideProgress) * (themeWidget.getWidth() + PANEL_GAP);
            float widgetY = panels.get(0).y;
            themeWidget.draw(r, widgetAnimX, widgetY, 255f * guiProgress * themeSlideProgress, scaledMouseX(), scaledMouseY(),
                    (float) (vw * mc.getWindow().getScaleFactor()),
                    (float) (vh * mc.getWindow().getScaleFactor()));
        }

        hoveredDescription = "";
    }

    private void updatePanelPositions(int vw, int vh) {
        double scale = mc.getWindow().getScaleFactor();
        float scaledWidth = (float) (vw * scale);
        float scaledHeight = (float) (vh * scale);

        int panelCount = panels.size();

        float totalWidth = panelCount * PANEL_WIDTH + (panelCount - 1) * PANEL_GAP;
        float startX = (scaledWidth - totalWidth) / 2f;
        float y = (scaledHeight - panelHeight) / 2f;

        for (int i = 0; i < panels.size(); i++) {
            Panel p = panels.get(i);
            p.x = startX + i * (PANEL_WIDTH + PANEL_GAP);
            p.y = y;
            p.w = PANEL_WIDTH;
            p.h = panelHeight;
        }
    }

    private void renderSearchComponent(Renderer2D r, int vw, int vh) {
        float alphaProgress = panelProgress(0);
        if (alphaProgress <= 0f) return;

        float left = Float.MAX_VALUE;
        float right = -Float.MAX_VALUE;
        float bottom = -Float.MAX_VALUE;
        for (Panel panel : panels) {
            left = Math.min(left, panel.x);
            right = Math.max(right, panel.x + panel.w);
            bottom = Math.max(bottom, panel.y + panel.h);
        }
        if (left == Float.MAX_VALUE) return;

        searchComponent.setWidth(230);
        float searchX = left + (right - left - 230) * 0.5f;
        float searchY = bottom + SEARCH_BOTTOM_GAP;
        float alpha = 255f * alphaProgress;
        searchComponent.draw(r, searchX, searchY, alpha);
    }

    private void drawHoveredDescription(Renderer2D r, int vw, int vh) {
        boolean hasDescription = !hoveredDescription.isBlank();
        if (hasDescription) {
            lastHoveredDescription = hoveredDescription;
            descriptionAlpha.show();
        } else {
            descriptionAlpha.hide();
        }

        float progress = descriptionAlpha.getProgress();
        if (progress <= 0.01f) return;

        String text = hasDescription ? hoveredDescription : lastHoveredDescription;
        if (text.isEmpty()) return;

        float alphaProgress = panelProgress(0);
        if (alphaProgress <= 0f) return;

        float left = Float.MAX_VALUE;
        float right = -Float.MAX_VALUE;
        float top = Float.MAX_VALUE;
        for (Panel panel : panels) {
            left = Math.min(left, panel.x);
            right = Math.max(right, panel.x + panel.w);
            top = Math.min(top, panel.y);
        }
        if (left == Float.MAX_VALUE) return;

        float width = FontRegistry.SF_MEDIUM.getWidth(text, DESC_TEXT_SIZE) + DESC_PADDING_X * 2f;
        float x = left + (right - left - width) * 0.5f;
        float y = top - 36f;

        int alpha = Math.min(255, Math.round(255f * alphaProgress * progress));
        int textColor = ColorUtils.rgba(235, 235, 240, alpha);

        r.text(FontRegistry.SF_MEDIUM, x + DESC_PADDING_X, y + 16.5f, DESC_TEXT_SIZE, text, textColor);
    }

    private void renderGlobalHint(Renderer2D r) {
        if (panels.isEmpty()) return;

        float alphaProgress = panelProgress(0);
        if (alphaProgress <= 0f) return;

        float left = Float.MAX_VALUE;
        float right = -Float.MAX_VALUE;
        float bottom = -Float.MAX_VALUE;
        for (Panel panel : panels) {
            left = Math.min(left, panel.x);
            right = Math.max(right, panel.x + panel.w);
            bottom = Math.max(bottom, panel.y + panel.h);
        }
        if (left == Float.MAX_VALUE) return;

        float hintY = bottom + SEARCH_BOTTOM_GAP + SearchComponent.DEFAULT_HEIGHT + 32f;

        String bindHint = "Для бинда булевых сеттингов — нажмите правой кнопкой мыши";
        String resetHint = "Для сброса состояния сеттинга по умолчанию — нажмите колёсиком мыши по сеттингу";
        float hintSize = 18f;
        float centerX = left + (right - left) * 0.5f;
        float bindHintX = centerX - FontRegistry.SF_MEDIUM.getWidth(bindHint, hintSize) * 0.5f;
        float resetHintX = centerX - FontRegistry.SF_MEDIUM.getWidth(resetHint, hintSize) * 0.5f;
        float lineGap = 24f;
        int hintAlpha = (int) (255f * alphaProgress * 0.88f);

        r.text(FontRegistry.SF_MEDIUM, bindHintX, hintY, hintSize, bindHint, fadeColor(fadeColor(TEXT_WHITE, 0.72f), hintAlpha));
        r.text(FontRegistry.SF_MEDIUM, resetHintX, hintY + lineGap, hintSize, resetHint, fadeColor(fadeColor(TEXT_WHITE, 0.72f), hintAlpha));
    }

    private void renderAnimatedPanel(Renderer2D r, Panel panel, int index) {
        float progress = panelProgress(index);
        if (progress <= 0f) return;

        float centerX = panel.getX() + panel.getW() * 0.5f;
        float centerY = panel.getY() + panel.getH() * 0.5f;

        r.pushScale(1, centerX, centerY);
        panel.render(r, progress);
        r.popScale();
    }

    private float panelProgress(int index) {
        long base = closing ? closeStartMs : openStartMs;
        long elapsed = System.currentTimeMillis() - base;
        float linear = Math.max(0f, Math.min(1f, elapsed / (float) PANEL_ANIM_MS));
        float eased = Easings.EASE_OUT_CUBIC.ease(linear);
        return closing ? 1f - eased : eased;
    }

    @Override
    protected boolean handleMouseClicked(double mouseX, double mouseY, int button) {
        boolean anyPickerOpen = ColorComp.isAnyPickerOpen() || (ThemeWidget.isOpen() && themeWidget.isPickerOpen());
        if (anyPickerOpen) {
            for (Panel p : panels) {
                if (p.handleColorPickerClick(mouseX, mouseY, button)) return true;
            }
            if (ThemeWidget.isOpen()) {
                updatePanelPositions(width, height);
                float slideProgress = themeWidgetSlideAnimation.getProgress();
                float widgetY = panels.isEmpty() ? 0f : panels.get(0).y;
                float widgetX = panels.isEmpty() ? 0f : panels.get(0).x - (2f - slideProgress) * (themeWidget.getWidth() + PANEL_GAP);
                if (themeWidget.mouseClicked(mouseX, mouseY, button, widgetX, widgetY,
                        (float) (width * mc.getWindow().getScaleFactor()), (float) (height * mc.getWindow().getScaleFactor()))) {
                    ThemeConfig.Theme pending = themeWidget.consumePendingTheme();
                    if (pending != null) {
                        ThemeConfig.applyTheme(pending);
                        ThemeConfig.save();
                    }
                }
            }
            return true;
        }

        if (searchComponent.isFocused()) {
            boolean searchClicked = searchComponent.mouseClicked(mouseX, mouseY, button);
            if (!searchClicked && button == GLFW.GLFW_MOUSE_BUTTON_LEFT) {
                searchComponent.setFocused(false);
            }
            if (searchClicked) {
                updateAllFilters();
                return true;
            }
        } else {
            if (button == GLFW.GLFW_MOUSE_BUTTON_LEFT && searchComponent.mouseClicked(mouseX, mouseY, button)) {
                searchComponent.setFocused(true);
                updateAllFilters();
                return true;
            }
        }

        if (bindingFunction != null) {
            if (button == GLFW.GLFW_MOUSE_BUTTON_RIGHT) bindingFunction.setBind(0);
            else bindingFunction.setBind(1000 + button);
            bindingFunction = null;
            return true;
        }

        if (SettingComponent.listeningBooleanComp != null) {
            if (button == GLFW.GLFW_MOUSE_BUTTON_RIGHT) {
                SettingComponent.listeningBooleanComp = null;
                return true;
            } else if (button != GLFW.GLFW_MOUSE_BUTTON_LEFT) {
                SettingComponent.listeningBooleanComp.setting.setBind(1000 + button);
                SettingComponent.listeningBooleanComp = null;
                return true;
            }
            SettingComponent.listeningBooleanComp = null;
            return true;
        }

        updatePanelPositions(width, height);
        float slideProgress = themeWidgetSlideAnimation.getProgress();
        float widgetY = panels.isEmpty() ? 0f : panels.get(0).y;
        float widgetX = panels.isEmpty() ? 0f : panels.get(0).x - (2f - slideProgress) * (themeWidget.getWidth() + PANEL_GAP);
        if (ThemeWidget.isOpen() && themeWidget.mouseClicked(mouseX, mouseY, button, widgetX, widgetY,
                (float) (width * mc.getWindow().getScaleFactor()), (float) (height * mc.getWindow().getScaleFactor()))) {
            ThemeConfig.Theme pending = themeWidget.consumePendingTheme();
            if (pending != null) {
                ThemeConfig.applyTheme(pending);
                ThemeConfig.save();
            }
            return true;
        }
        for (Panel p : panels) {
            if (p.mouseClicked(mouseX, mouseY, button)) return true;
        }
        return false;
    }

    @Override
    public boolean mouseReleased(Click click) {
        double scale = mc.getWindow().getScaleFactor();
        double mouseX = click.x() * scale;
        double mouseY = click.y() * scale;
        int button = click.button();
        updatePanelPositions(width, height);
        for (Panel p : panels) {
            if (p.mouseReleased(mouseX, mouseY, button)) return true;
        }
        return super.mouseReleased(click);
    }

    @Override
    public boolean mouseScrolled(double mouseX, double mouseY, double horizontalAmount, double verticalAmount) {
        double scale = mc.getWindow().getScaleFactor();
        mouseX *= scale;
        mouseY *= scale;
        updatePanelPositions(width, height);
        float slideProgress = themeWidgetSlideAnimation.getProgress();
        float widgetY = panels.isEmpty() ? 0f : panels.get(0).y;
        float widgetX = panels.isEmpty() ? 0f : panels.get(0).x - (2f - slideProgress) * (themeWidget.getWidth() + PANEL_GAP);
        if (ThemeWidget.isOpen() && themeWidget.mouseScrolled(mouseX, mouseY, verticalAmount, widgetX, widgetY,
                (float) (width * mc.getWindow().getScaleFactor()), (float) (height * mc.getWindow().getScaleFactor()))) {
            return true;
        }
        for (Panel p : panels) {
            if (p.isInside(mouseX, mouseY)) {
                if (p.mouseScrolledSettings(mouseX, mouseY)) return true;
                p.scrollVelocity -= (float) verticalAmount * 34f / 2.3f;
                p.targetScrollOffset += p.scrollVelocity;
                p.clampTargetScroll();
                return true;
            }
        }
        return super.mouseScrolled(mouseX, mouseY, horizontalAmount, verticalAmount);
    }

    @Override
    public boolean keyPressed(KeyInput keyInput) {
        int keyCode = keyInput.key();
        int modifiers = keyInput.modifiers();

        if (keyCode == GLFW.GLFW_KEY_F && (modifiers & GLFW.GLFW_MOD_CONTROL) != 0) {
            searchComponent.setFocused(true);
            return true;
        }

        if (searchComponent.isFocused()) {
            boolean handled = searchComponent.keyPressed(keyCode);
            if (handled) {
                updateAllFilters();
                return true;
            }
        }

        if (SettingComponent.listeningBooleanComp != null) {
            if (keyCode == GLFW.GLFW_KEY_ESCAPE || keyCode == GLFW.GLFW_KEY_DELETE) {
                SettingComponent.listeningBooleanComp.setting.setBind(-1);
            } else if (keyCode != GLFW.GLFW_KEY_LEFT_SHIFT && keyCode != GLFW.GLFW_KEY_RIGHT_SHIFT
                    && keyCode != GLFW.GLFW_KEY_LEFT_CONTROL && keyCode != GLFW.GLFW_KEY_RIGHT_CONTROL
                    && keyCode != GLFW.GLFW_KEY_LEFT_ALT && keyCode != GLFW.GLFW_KEY_RIGHT_ALT) {
                SettingComponent.listeningBooleanComp.setting.setBind(keyCode);
            }
            SettingComponent.listeningBooleanComp = null;
            return true;
        }

        if (bindingFunction != null) {
            if (keyCode == GLFW.GLFW_KEY_ESCAPE || keyCode == GLFW.GLFW_KEY_BACKSPACE || keyCode == GLFW.GLFW_KEY_DELETE) {
                bindingFunction.setBind(0);
            } else if (keyCode != GLFW.GLFW_KEY_LEFT_SHIFT && keyCode != GLFW.GLFW_KEY_RIGHT_SHIFT
                    && keyCode != GLFW.GLFW_KEY_LEFT_CONTROL && keyCode != GLFW.GLFW_KEY_RIGHT_CONTROL
                    && keyCode != GLFW.GLFW_KEY_LEFT_ALT && keyCode != GLFW.GLFW_KEY_RIGHT_ALT) {
                bindingFunction.setBind(keyCode);
            }
            bindingFunction = null;
            return true;
        }

        if (keyCode == GLFW.GLFW_KEY_ESCAPE || keyCode == GLFW.GLFW_KEY_RIGHT_SHIFT) {
            if (keyCode == GLFW.GLFW_KEY_RIGHT_SHIFT && rightShiftCloseGuard) return true;
            startClosing();
            return true;
        }

        if (ThemeWidget.isOpen() && themeWidget.keyPressed(keyCode)) {
            return true;
        }

        for (Panel p : panels) {
            if (p.keyPressed(keyCode)) return true;
        }
        return super.keyPressed(keyInput);
    }

    @Override
    public boolean charTyped(CharInput charInput) {
        char chr = (char) charInput.codepoint();

        if (searchComponent.isFocused()) {
            boolean typed = searchComponent.charTyped(chr);
            if (typed) {
                updateAllFilters();
                return true;
            }
        }

        if (ThemeWidget.isOpen() && themeWidget.charTyped(chr)) {
            return true;
        }
        for (Panel p : panels) {
            if (p.charTyped(chr)) return true;
        }
        return super.charTyped(charInput);
    }

    private void updateAllFilters() {
        String searchText = searchComponent.getSearchText().toLowerCase(Locale.ROOT);
        for (Panel panel : panels) {
            panel.updateFilter(searchText);
        }
    }

    @Override
    public void close() {
        startClosing();
    }

    @Override
    protected void startClosing() {
        if (closing) return;
        closing = true;
        closeStartMs = System.currentTimeMillis();
        guiOpenAnimation.hide();
        themeWidget.saveIfDirty();
    }

    private interface RenderablePanel {
        void render(Renderer2D r, float alphaProgress);
        float getX();
        float getY();
        float getW();
        float getH();
    }

    private class Panel implements RenderablePanel {
        final Category category;
        final Set<Function> expandedModules = new HashSet<>();
        final Map<Function, SimpleLinearAnimation> expandAnimations = new HashMap<>();
        final Map<Function, SimpleLinearAnimation> noSettingsFlash = new HashMap<>();
        final Map<Function, SimpleLinearAnimation> hoverAnimations = new HashMap<>();
        final Map<Function, SimpleLinearAnimation> toggleAnimations = new HashMap<>();
        final Map<Function, Float> settingsArrowAnimations = new HashMap<>();
        final Map<Setting<?>, SettingComponent<?>> settingComponents = new HashMap<>();
        final java.util.Map<Setting<?>, float[]> settingPositions = new java.util.HashMap<>();

        float x, y, w, h;
        float scrollOffset = 0f;
        float targetScrollOffset = 0f;
        float scrollVelocity = 0f;
        long lastScrollTime = System.nanoTime();
        long lastArrowTime = System.nanoTime();
        float arrowDt = 0f;

        Panel(Category category) {
            this.category = category;
        }

        void updateFilter(String lowerQuery) {}

        boolean isInside(double mx, double my) {
            return mx >= x && mx <= x + w && my >= y && my <= y + h;
        }

        @Override
        public void render(Renderer2D r, float alphaProgress) {
            settingPositions.clear();
            updateSmoothScroll();
            int panelAlpha = (int) (255f * alphaProgress);

            float shadowExpand = 1.5f;
            float shadowShrink = shadowExpand * 2f;
            int shadowAlpha = (int) (105 * alphaProgress);
            int blackShadow = ColorUtils.rgba(0, 0, 0, shadowAlpha);
            r.gradientShadow(x + shadowShrink, y + shadowShrink, w - shadowShrink * 2f, h - shadowShrink * 2f, ROUNDING, 3f, shadowExpand, blackShadow, blackShadow, blackShadow, blackShadow);

            r.blur(x, y, w, h, ROUNDING, alphaProgress);
            r.rect(x, y, w, h, ROUNDING, fadeColor(ClientColors.applyAlpha(ClientColors.BACKGROUND.getRGB(), 0.78f), alphaProgress));

            float headerH = HEADER_HEIGHT;
            String displayText = category.getDisplay();
            float textWidth = FontRegistry.SF_MEDIUM.getWidth(displayText, 26);
            r.text(FontRegistry.SF_MEDIUM, x + (w - textWidth) / 2f - 2f, y + headerH / 2f + 14f, 26f, displayText,
                    fadeColor(TEXT_WHITE, panelAlpha));

            float contentY = y + headerH;
            float contentH = h - headerH - BOTTOM_PADDING;
            r.pushClipRect((int) Math.round(x), (int) Math.round(contentY), (int) Math.round(w), (int) Math.round(contentH));

            List<Function> functions = getFilteredFunctions();
            float rowY = contentY + PADDING - scrollOffset;
            int mouseX = scaledMouseX();
            int mouseY = scaledMouseY();

            arrowDt = Math.min((System.nanoTime() - lastArrowTime) / 1_000_000_000f, 0.05f);
            lastArrowTime = System.nanoTime();

            for (Function f : functions) {
                float settingsHeight = visibleSettingsHeight(f);
                SimpleLinearAnimation anim = expandAnimation(f);
                if (expandedModules.contains(f)) anim.show();
                else anim.hide();

                float progress = anim.getProgress();
                float currentHeight = settingsHeight * progress;
                if (currentHeight < 1.0f) {
                    currentHeight = 0f;
                    progress = 0f;
                }
                float blockHeight = MODULE_HEIGHT + (currentHeight > 0f ? (currentHeight + PADDING - SETTINGS_HEIGHT_REDUCTION) : 0f);

                if (rowY + blockHeight >= contentY && rowY <= contentY + contentH) {
                    renderModuleBlock(r, f, rowY, settingsHeight, progress, mouseX, mouseY, panelAlpha);
                }

                rowY += blockHeight + MODULE_GAP;
            }

            r.popClipRect();

            for (Map.Entry<Setting<?>, float[]> entry : settingPositions.entrySet()) {
                SettingComponent<?> comp = settingComponents.get(entry.getKey());
                if (comp != null) {
                    float[] pos = entry.getValue();
                    comp.drawOverlay(r, pos[0], pos[1], mouseX, mouseY, panelAlpha);
                }
            }

            clampTargetScroll();
        }

        private List<Function> getFilteredFunctions() {
            List<Function> functions = NexisClient.getFunctionManager().getFunctionsByCategory(category);
            String lowerQuery = searchComponent.getSearchText().toLowerCase(Locale.ROOT);
            if (lowerQuery.isEmpty()) return functions;
            return functions.stream()
                    .filter(f -> f.getName().toLowerCase(Locale.ROOT).contains(lowerQuery)
                            || f.getDescription().toLowerCase(Locale.ROOT).contains(lowerQuery))
                    .collect(Collectors.toList());
        }

        private void renderModuleBlock(Renderer2D r, Function f, float rowY, float settingsHeight, float open,
                                       int mouseX, int mouseY, int alpha) {
            boolean hovered = mouseX >= x + 9 && mouseX <= x + w - 9
                    && mouseY >= Math.max(rowY, y + HEADER_HEIGHT)
                    && mouseY <= Math.min(rowY + MODULE_HEIGHT, y + h - BOTTOM_PADDING);

            SimpleLinearAnimation hoverAnim = hoverAnimations.computeIfAbsent(f, ignored -> new SimpleLinearAnimation(200));
            if (hovered) {
                CursorHelper.setHand();
                hoverAnim.show();
            } else {
                hoverAnim.hide();
            }
            float hoverProgress = hoverAnim.getProgress();

            if (hovered && hoverProgress > 0.5f) {
                setHoveredDescription(f.getDescription());
            }

            SimpleLinearAnimation toggleAnim = toggleAnimations.computeIfAbsent(f, ignored -> new SimpleLinearAnimation(200));
            if (f.isState()) toggleAnim.show();
            else toggleAnim.hide();
            float toggleProgress = toggleAnim.getProgress();

            float fullHeight = MODULE_HEIGHT + (settingsHeight > 0f && open > 0f ? (settingsHeight * open + PADDING - SETTINGS_HEIGHT_REDUCTION) : 0f);

            int baseRowColor = ColorUtils.interpolate(ROW_BG, ROW_HOVER, hoverProgress);
            int activeRowColor = ColorUtils.rgba(136, 121, 207, 20);
            int rowColor = ColorUtils.interpolate(baseRowColor, activeRowColor, toggleProgress);

            r.rect(x + 9, rowY, w - 18, fullHeight, 12f, fadeColor(rowColor, alpha));
            r.rectOutline(x + 9.5f, rowY + 0.5f, w - 19, fullHeight - 1f, 12f, fadeColor(ColorUtils.rgba(125, 125, 125, 40), alpha), 1f);

            int nameColor = ColorUtils.interpolate(ClientColors.TEXT.getRGB(), ClientColors.ICON.getRGB(), toggleProgress);

            SimpleLinearAnimation flash = noSettingsFlash.computeIfAbsent(f, ignored -> new SimpleLinearAnimation(360));
            flash.hide();
            float flashProgress = flash.getProgress();
            if (flashProgress > 0.01f) {
                float wave = flashProgress < 0.5f ? flashProgress * 2f : (1f - flashProgress) * 2f;
                nameColor = ColorUtils.interpolate(nameColor, ColorUtils.rgb(255, 68, 68), wave);
            }
            r.text(FontRegistry.SF_MEDIUM, x + PADDING + 9f, rowY + MODULE_HEIGHT / 2f + 7f, 20f, f.getName(),
                    fadeColor(nameColor, alpha));

            String bind = PlayerUtils.getBindName(f.getBind());
            if (bindingFunction == f) bind = "...";
            boolean hasSettings = hasVisibleSettings(f);
            float arrowSpace = hasSettings ? 22f : 0f;
            if (bindingFunction == f || (bind != null && !bind.equalsIgnoreCase("None") && !bind.equals("-"))) {
                float bindSize = 13f;
                float iconSize = 12f;
                float iconW = FontRegistry.WEXSIDE_MENU_ICONS.getWidth("Л", iconSize);
                float bindW = FontRegistry.SF_MEDIUM.getWidth(bind, bindSize) + iconW + 16f;
                float bindH = 19f;
                float bindX = x + w - PADDING - bindW - 13f - arrowSpace;
                float bindY = rowY + MODULE_HEIGHT / 2f - bindH / 2f;
                if (hovered && mouseX >= bindX && mouseX <= bindX + bindW && mouseY >= bindY && mouseY <= bindY + bindH) {
                    CursorHelper.setHand();
                }
                r.rect(bindX, bindY, bindW, bindH, 5f, ColorUtils.rgba(210, 210, 220, (int) (42 * (alpha / 255f))));
                r.rectOutline(bindX, bindY, bindW, bindH, 5f, ColorUtils.rgba(210, 210, 220, (int) (22 * (alpha / 255f))), 1f);
                r.text(FontRegistry.WEXSIDE_MENU_ICONS, bindX + 6f,
                        bindY + FontRegistry.centeredBaselineOffset(FontRegistry.WEXSIDE_MENU_ICONS, 'H', iconSize) + bindH * 0.5f,
                        iconSize, "Л", fadeColor(0xFFFFFFFF, alpha));
                r.text(FontRegistry.SF_MEDIUM, bindX + 10f + iconW, bindY + 13.7f, bindSize, bind,
                        fadeColor(bindingFunction == f ? ClientColors.ICON.getRGB() : ClientColors.TEXT.getRGB(), alpha));
            }

            if (hasSettings) {
                float target = expandedModules.contains(f) ? 1f : 0f;
                float arrowProgress = settingsArrowAnimations.getOrDefault(f, target);
                float arrowLerp = 1f - (float) Math.pow(1f - 0.14f / 0.95f, arrowDt * 60f);
                arrowProgress += (target - arrowProgress) * arrowLerp;
                if (Math.abs(arrowProgress - target) < 0.01f) {
                    arrowProgress = target;
                }
                settingsArrowAnimations.put(f, arrowProgress);

                float arrowCenterX = x + w - PADDING - 20f;
                float arrowCenterY = rowY + MODULE_HEIGHT * 0.49f;
                int arrowColor = ColorUtils.interpolate(ClientColors.TEXT.getRGB(), ClientColors.TEXT.getRGB(), arrowProgress);
                float arrowRotation = 180f * (1f - arrowProgress);
                float arrowScale = 0.84f + 0.14f * Math.max(arrowProgress, 1f - arrowProgress);
                int arrowRgba = fadeColor(arrowColor, alpha);

                r.pushTranslation(arrowCenterX, arrowCenterY);
                r.pushRotation(arrowRotation);
                r.pushScale(arrowScale, 0f, 0f);
                r.pushRotation(42f);
                r.rect(-4.8f, -1.0f, 7.0f, 2.0f, 1.0f, arrowRgba);
                r.popRotation();
                r.pushRotation(-42f);
                r.rect(-2.2f, -1.0f, 7.0f, 2.0f, 1.0f, arrowRgba);
                r.popRotation();
                r.popScale();
                r.popTransform();
                r.popTransform();
            } else {
                settingsArrowAnimations.remove(f);
            }

            if (settingsHeight > 0f && open > 0f) {
                float baseSettingsY = rowY + MODULE_HEIGHT + SETTINGS_OFFSET;
                float clipY = rowY + MODULE_HEIGHT + SETTINGS_OFFSET;
                float clipHeight = settingsHeight * open + PADDING * open - SETTINGS_OFFSET;
                r.pushClipRect((int) (x + 9), (int) clipY, (int) (w - 18), (int) Math.ceil(clipHeight));
                float sy = baseSettingsY;
                float sw = w - 22f;
                for (Setting<?> setting : f.getSettings()) {
                    if (!setting.isVisible()) continue;
                    SettingComponent<?> comp = settingComponents.computeIfAbsent(setting, s -> SettingComponent.create(s, sw));
                    comp.setWidth(sw);
                    comp.draw(r, x + 9, sy, mouseX, mouseY, (int) (alpha * open));
                    settingPositions.put(setting, new float[]{x + 9, sy});
                    sy += comp.getHeight();
                }
                r.popClipRect();
            }
        }

        boolean handleColorPickerClick(double mx, double my, int button) {
            for (Map.Entry<Setting<?>, SettingComponent<?>> entry : settingComponents.entrySet()) {
                if (entry.getValue() instanceof ColorComp colorComp && colorComp.open) {
                    float[] pos = settingPositions.get(entry.getKey());
                    if (pos != null) {
                        boolean handled = colorComp.mouseClickedOverlay(mx, my, button, pos[0], pos[1]);
                        if (!handled) {
                            colorComp.close();
                        }
                        return true;
                    }
                    return true;
                }
            }
            return false;
        }

        boolean mouseClicked(double mx, double my, int button) {
            if (!isInside(mx, my) || mx < x + 9 || mx > x + w - 9) return false;

            float contentY = y + HEADER_HEIGHT;
            float contentH = h - HEADER_HEIGHT;
            if (my < contentY || my > contentY + contentH) return false;

            List<Function> functions = getFilteredFunctions();
            float rowY = contentY + PADDING - scrollOffset;
            for (Function f : functions) {
                float settingsHeight = visibleSettingsHeight(f);
                SimpleLinearAnimation anim = expandAnimation(f);
                float progress = anim.getProgress();
                if (!expandedModules.contains(f) && (progress < 0.01f || anim.isFinished())) progress = 0f;
                float currentHeight = settingsHeight * progress;
                if (currentHeight < 1.0f) {
                    currentHeight = 0f;
                    progress = 0f;
                }

                if (my >= rowY && my < rowY + MODULE_HEIGHT) {
                    if (button == GLFW.GLFW_MOUSE_BUTTON_LEFT) {
                        f.toggle();
                    } else if (button == GLFW.GLFW_MOUSE_BUTTON_RIGHT) {
                        if (hasVisibleSettings(f)) toggleExpanded(f);
                        else flashNoSettings(f);
                    } else if (button == GLFW.GLFW_MOUSE_BUTTON_MIDDLE) {
                        bindingFunction = f;
                    }
                    return true;
                }

                rowY += MODULE_HEIGHT;
                if (currentHeight > 0f) {
                    float baseSettingsY = rowY + SETTINGS_OFFSET;
                    float settingsY = baseSettingsY;
                    if (expandedModules.contains(f) && my >= settingsY && my < settingsY + currentHeight + PADDING) {
                        float sy = settingsY;
                        float sw = w - 22f;
                        for (Setting<?> setting : f.getSettings()) {
                            if (!setting.isVisible()) continue;
                            SettingComponent<?> comp = settingComponents.computeIfAbsent(setting, s -> SettingComponent.create(s, sw));
                            comp.setWidth(sw);
                            if (comp.mouseClickedOverlay(mx, my, button, x + 9, sy)) {
                                return true;
                            }
                            if (my >= sy && my <= sy + comp.getHeight()) {
                                comp.mouseClicked(mx, my, button, x + 9, sy);
                                return true;
                            }
                            sy += comp.getHeight();
                        }
                    }
                    rowY += currentHeight + PADDING - SETTINGS_HEIGHT_REDUCTION;
                }
                rowY += MODULE_GAP;
            }
            return false;
        }

        boolean mouseReleased(double mx, double my, int button) {
            return false;
        }

        boolean mouseScrolledSettings(double mx, double my) {
            float contentY = y + HEADER_HEIGHT;
            float contentH = h - HEADER_HEIGHT;
            if (my < contentY || my > contentY + contentH) return false;

            List<Function> functions = getFilteredFunctions();
            float rowY = contentY + PADDING - scrollOffset;
            for (Function f : functions) {
                float settingsHeight = visibleSettingsHeight(f);
                SimpleLinearAnimation anim = expandAnimation(f);
                float progress = anim.getProgress();
                if (!expandedModules.contains(f) && (progress < 0.01f || anim.isFinished())) progress = 0f;
                float currentHeight = settingsHeight * progress;
                if (currentHeight < 1.0f) {
                    currentHeight = 0f;
                    progress = 0f;
                }

                rowY += MODULE_HEIGHT;
                if (currentHeight > 0f && expandedModules.contains(f)) {
                    float baseSettingsY = rowY + SETTINGS_OFFSET;
                    float settingsY = baseSettingsY;
                    if (my >= settingsY && my < settingsY + currentHeight + PADDING) {
                        float sy = settingsY;
                        float sw = w - 22f;
                        for (Setting<?> setting : f.getSettings()) {
                            if (!setting.isVisible()) continue;
                            SettingComponent<?> comp = settingComponents.computeIfAbsent(setting, s -> SettingComponent.create(s, sw));
                            comp.setWidth(sw);
                            if (my >= sy && my <= sy + comp.getHeight()) {
                                return comp.mouseScrolled(mx, my, x + 9f, sy);
                            }
                            sy += comp.getHeight();
                        }
                    }
                    rowY += currentHeight + PADDING - SETTINGS_HEIGHT_REDUCTION;
                }
                rowY += MODULE_GAP;
            }
            return false;
        }

        boolean keyPressed(int key) {
            for (SettingComponent<?> component : settingComponents.values()) {
                component.keyPressed(key);
            }
            return false;
        }

        boolean charTyped(char chr) {
            for (SettingComponent<?> component : settingComponents.values()) {
                component.charTyped(chr);
            }
            return false;
        }

        private void toggleExpanded(Function f) {
            if (expandedModules.contains(f)) expandedModules.remove(f);
            else expandedModules.add(f);
        }

        private void flashNoSettings(Function f) {
            SimpleLinearAnimation flash = noSettingsFlash.computeIfAbsent(f, ignored -> new SimpleLinearAnimation(360));
            flash.show();
        }

        private boolean hasVisibleSettings(Function f) {
            for (Setting<?> setting : f.getSettings()) {
                if (setting.isVisible()) return true;
            }
            return false;
        }

        private float visibleSettingsHeight(Function f) {
            float total = 0f;
            float sw = w > 0 ? w - 22f : PANEL_WIDTH - 22f;
            for (Setting<?> setting : f.getSettings()) {
                if (!setting.isVisible()) continue;
                SettingComponent<?> comp = settingComponents.computeIfAbsent(setting, s -> SettingComponent.create(s, sw));
                comp.setWidth(sw);
                total += comp.getHeight();
            }
            return total;
        }

        private SimpleLinearAnimation expandAnimation(Function f) {
            return expandAnimations.computeIfAbsent(f, ignored -> {
                SimpleLinearAnimation newAnim = new SimpleLinearAnimation(300);
                newAnim.setEasing(Easings.FIGMA_EASE_IN_OUT);
                return newAnim;
            });
        }

        void updateSmoothScroll() {
            long now = System.nanoTime();
            float deltaSeconds = (now - lastScrollTime) / 1_000_000_000f;
            lastScrollTime = now;
            deltaSeconds = Math.min(deltaSeconds, 0.05f);

            targetScrollOffset += scrollVelocity;
            float damping = (float) Math.pow(0.52f, deltaSeconds * 60f);
            scrollVelocity *= damping;
            if (Math.abs(scrollVelocity) < 0.05f) scrollVelocity = 0f;
            clampTargetScroll();
            float lerpFactor = 1f - (float) Math.pow(1f - 0.16f, deltaSeconds * 60f);
            scrollOffset += (targetScrollOffset - scrollOffset) * lerpFactor;
            if (Math.abs(targetScrollOffset - scrollOffset) < 0.03f && scrollVelocity == 0f)
                scrollOffset = targetScrollOffset;
        }

        void clampTargetScroll() {
            float maxScroll = maxScroll();
            targetScrollOffset = Math.max(0f, Math.min(targetScrollOffset, maxScroll));
            scrollOffset = Math.max(0f, Math.min(scrollOffset, maxScroll));
        }

        private float maxScroll() {
            List<Function> functions = getFilteredFunctions();
            float total = PADDING;
            for (Function f : functions) {
                float settingsHeight = visibleSettingsHeight(f);
                SimpleLinearAnimation anim = expandAnimation(f);
                float progress = anim.getProgress();
                if (!expandedModules.contains(f) && (progress < 0.01f || anim.isFinished())) progress = 0f;
                float currentHeight = settingsHeight * progress;
                if (currentHeight < 1.0f) {
                    currentHeight = 0f;
                    progress = 0f;
                }

                total += MODULE_HEIGHT;
                if (currentHeight > 0f) {
                    total += currentHeight + PADDING - SETTINGS_HEIGHT_REDUCTION;
                }
                total += MODULE_GAP;
            }
            return Math.max(0f, total - (h - HEADER_HEIGHT - PADDING));
        }

        @Override
        public float getX() { return x; }

        @Override
        public float getY() { return y; }

        @Override
        public float getW() { return w; }

        @Override
        public float getH() { return h; }
    }
}
