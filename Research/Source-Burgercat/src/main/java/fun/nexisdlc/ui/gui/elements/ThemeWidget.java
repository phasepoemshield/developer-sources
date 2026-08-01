package fun.nexisdlc.ui.gui.elements;

import fun.nexisdlc.client.ClientColors;
import fun.nexisdlc.client.utils.config.ThemeConfig;
import fun.nexisdlc.client.utils.math.MathUtil;
import fun.nexisdlc.client.utils.render.color.basic.ColorUtils;
import fun.nexisdlc.client.utils.render.main.core.Renderer2D;
import fun.nexisdlc.client.utils.render.main.text.FontRegistry;
import net.minecraft.client.MinecraftClient;
import org.lwjgl.glfw.GLFW;

import java.awt.Color;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.IntConsumer;
import java.util.function.IntSupplier;

import static fun.nexisdlc.client.utils.math.MathUtil.clamp;

public class ThemeWidget {
    private static final float WIDTH = 245f;
    private static final float HEADER_HEIGHT = 40f;
    private static final float ITEM_HEIGHT = 36.9f;
    private static final float ITEM_GAP = 5f;
    private static final float PADDING = 9.2f;
    private static final float ROUNDING = 25f;
    private static final float PREVIEW_SIZE = 14f;
    private static final float THEME_CIRCLE = 18f;
    private static final float THEME_GAP = 8f;
    private static final float THEME_ROW_GAP = 6f;
    private static final float THEME_BUTTON_HEIGHT = 18f;
    private static final float THEME_BUTTON_GAP = 8f;
    private static final float SECTION_GAP = 12f;

    private static final float PICKER_PADDING = 10f;
    private static final float PICKER_HEADER = 18f;
    private static final float PICKER_ROUNDING = 10f;
    private static final float SV_SIZE = 106f;
    private static final float HUE_GAP = 8f;
    private static final float HUE_HEIGHT = 10f;
    private static final float RGB_HEIGHT = 18f;
    private static final float RGB_ROW_GAP = 4f;
    private static final float ALPHA_HEIGHT = 6f;
    private static final float ALPHA_GAP = 8f;
    private static final float BUTTON_GAP = 6f;
    private static final float ANIM_SPEED = 12f;
    private static boolean open = false;

    private final List<ThemeEntry> entries = new ArrayList<>();
    private ThemeEntry activeEntry;
    private int activeIndex = -1;
    private boolean pickerOpen = false;
    private boolean draggingSv = false;
    private boolean draggingHue = false;
    private boolean draggingAlpha = false;
    private boolean draggingPicker = false;
    private boolean manualPickerPosition = false;
    private boolean dirty = false;
    private float pickerAnim = 0f;
    private float tooltipAnim = 0f;
    private float saveHover = 0f;
    private float newHover = 0f;
    private float deleteHover = 0f;
    private float closeHover = 0f;
    private float renameFieldHover = 0f;
    private float renameButtonHover = 0f;
    private boolean rgbInputFocused = false;
    private String rgbInputText = "";
    private int rgbCursorPos = 0;
    private boolean renameInputFocused = false;
    private String renameInputText = "";
    private int renameCursorPos = 0;
    private long lastAnimTime = System.currentTimeMillis();

    private float lastX;
    private float lastY;
    private float lastMouseX;
    private float lastMouseY;
    private float lastScreenW;
    private float lastScreenH;
    private float pickerX;
    private float pickerY;
    private float pickerW;
    private float pickerH;
    private float pickerDragOffsetX;
    private float pickerDragOffsetY;
    private float svX;
    private float svY;
    private float hueX;
    private float hueY;
    private float hueW;
    private float hueH;
    private float rgbX;
    private float rgbY;
    private float rgbW;
    private float rgbH;
    private float copyX;
    private float copyY;
    private float copyW;
    private float copyH;
    private float pasteX;
    private float pasteY;
    private float pasteW;
    private float pasteH;
    private float closeX;
    private float closeY;
    private float closeW;
    private float closeH;
    private float alphaX;
    private float alphaY;
    private float alphaW;
    private float alphaH;
    private float saveX;
    private float saveY;
    private float saveW;
    private float saveH;
    private float newX;
    private float newY;
    private float newW;
    private float newH;
    private float deleteX;
    private float deleteY;
    private float deleteW;
    private float deleteH;
    private float renameFieldX;
    private float renameFieldY;
    private float renameFieldW;
    private float renameFieldH;
    private float renameButtonX;
    private float renameButtonY;
    private float renameButtonW;
    private float renameButtonH;
    private float lastEntriesStartY;
    private float themesScroll;
    private float themesAreaY;
    private float themesAreaH;
    private float themesContentH;

    private final List<ThemeSlot> themeSlots = new ArrayList<>();
    private final Map<String, Float> themeHover = new HashMap<>();
    private final List<Float> entryHover = new ArrayList<>();
    private ThemeSlot lastTooltipSlot;
    private ThemeConfig.Theme pendingTheme;
    private float pendingCenterX;
    private float pendingCenterY;

    public ThemeWidget() {
        entries.add(new ThemeEntry("Фон", () -> ClientColors.BACKGROUND.getRGB(), ClientColors::setBackground));
        entries.add(new ThemeEntry("Текст", () -> ClientColors.TEXT.getRGB(), ClientColors::setText));
        entries.add(new ThemeEntry("Иконки", () -> ClientColors.ICON.getRGB(), ClientColors::setIcon));
        entries.add(new ThemeEntry("Градиент 1", () -> ClientColors.GRADIENT_START.getRGB(), ClientColors::setGradientStart));
        entries.add(new ThemeEntry("Градиент 2", () -> ClientColors.GRADIENT_END.getRGB(), ClientColors::setGradientEnd));
        ensureEntryHoverCapacity();
    }

    public float getWidth() {
        return WIDTH;
    }

    public float getHeight() {
        float itemsHeight = entries.isEmpty() ? 0f : (entries.size() * ITEM_HEIGHT) + ((entries.size() - 1) * ITEM_GAP);
        float themeHeight = getThemeSectionHeight();
        return 575f;
    }

    public static void toggleOpen() {
        open = !open;
    }

    public static boolean isOpen() {
        return open;
    }

    public static void setOpen(boolean open) {
        ThemeWidget.open = open;
    }

    public boolean isPickerOpen() {
        return pickerOpen;
    }

    public void draw(Renderer2D render, float x, float y, float alpha, int mouseX, int mouseY, float screenW, float screenH) {
        lastX = x;
        lastY = y;
        lastMouseX = mouseX;
        lastMouseY = mouseY;
        lastScreenW = screenW;
        lastScreenH = screenH;
        float dt = updateAnimTime();
        ensureEntryHoverCapacity();
        pickerAnim = approach(pickerAnim, pickerOpen ? 1f : 0f, ANIM_SPEED, dt);
        float alphaFactor = alpha / 255f;
        int panelAlpha = (int) (alphaFactor * 200f);
        int outlineAlpha = (int) ((alpha / 255f) * 120f);
        int panelColor = new Color(4, 0, 12, panelAlpha).getRGB();
        int testClr =  ColorUtils.multAlpha(ClientColors.applyAlpha(ClientColors.BACKGROUND.getRGB(), 0.78f), Math.max(0f, Math.min(1f, alpha / 255)));
        int outlineColor = new Color(140, 140, 150, outlineAlpha).getRGB();

        float height = getHeight();
        float shadowExpand = 1.5f;
        float shadowShrink = shadowExpand * 2f;
        int shadowAlpha = (int) (105 * alphaFactor);
        int blackShadow = fun.nexisdlc.client.utils.render.color.ColorUtils.rgba(0, 0, 0, shadowAlpha);
        render.gradientShadow(x + shadowShrink, y + shadowShrink, WIDTH - shadowShrink * 2f, height - shadowShrink * 2f, ROUNDING, 3f, shadowExpand, blackShadow, blackShadow, blackShadow, blackShadow);

        render.blur(x, y, WIDTH, height, ROUNDING, alphaFactor);
        render.rect(x, y, WIDTH, height, ROUNDING, testClr);

        if (FontRegistry.SF_SEMIBOLD != null) {
            float titleSize = 26f;
            String title = "Themes";
            float titleX = x + (WIDTH - FontRegistry.SF_SEMIBOLD.getWidth(title, titleSize)) / 2f - 2f;
            float titleY = y + HEADER_HEIGHT / 2f + 12f;
            render.text(FontRegistry.SF_SEMIBOLD, titleX, titleY, titleSize, title,
                    new Color(255, 255, 255, (int) alpha).getRGB());
        }

        float entriesStartY = layoutThemes(x, y);

        float rowY = entriesStartY;
        float textSize = 20f;
        render.pushClipRect((int) x, (int) (y + HEADER_HEIGHT), (int) WIDTH, (int) (saveY - y - HEADER_HEIGHT - SECTION_GAP));
        for (int i = 0; i < entries.size(); i++) {
            ThemeEntry entry = entries.get(i);
            boolean hovered = MathUtil.isHovered(mouseX, mouseY, x + 4f, rowY, WIDTH - 8f, ITEM_HEIGHT);
            boolean active = entry == activeEntry && pickerOpen;
            float hoverTarget = (hovered || active) ? 1f : 0f;
            float hoverValue = entryHover.get(i);
            hoverValue = approach(hoverValue, hoverTarget, ANIM_SPEED, dt);
            entryHover.set(i, hoverValue);
            int baseRowColor = ColorUtils.rgba(255, 255, 255, 10);
            int hoverRowColor = ColorUtils.rgba(255, 255, 255, 18);
            int rowColor = ColorUtils.interpolate(baseRowColor, hoverRowColor, hoverValue);
            render.rect(x + 4f, rowY, WIDTH - 8f, ITEM_HEIGHT, 12f, applyAlpha(rowColor, alphaFactor));
            render.rectOutline(x + 4f, rowY, WIDTH - 8f, ITEM_HEIGHT, 12f, applyAlpha(ColorUtils.rgba(125, 125, 125, 40), alphaFactor), 1f);
            if (hoverValue > 0.01f) {
                float strength = active ? 0.12f : 0.08f;
                int hoverAlpha = (int) (alpha * (strength * hoverValue));
                render.rect(x + 4f, rowY, WIDTH - 8f, ITEM_HEIGHT, 12f,
                        new Color(255, 255, 255, hoverAlpha).getRGB());
            }

            float textY = centeredTextY(rowY, ITEM_HEIGHT, textSize);
            int textColor = new Color(220, 224, 235, (int) alpha).getRGB();
            render.text(FontRegistry.SF_MEDIUM, x + PADDING + 4f, textY, textSize, entry.label, textColor);

            int color = applyAlpha(entry.getColor(), alpha / 255f);
            float previewX = x + WIDTH - PADDING - PREVIEW_SIZE - 8f;
            float previewY = rowY + (ITEM_HEIGHT - PREVIEW_SIZE) * 0.5f;
            render.rect(previewX, previewY, PREVIEW_SIZE, PREVIEW_SIZE, 4f, color);
            render.rectOutline(previewX, previewY, PREVIEW_SIZE, PREVIEW_SIZE, 4f, applyAlpha(0x66FFFFFF, alphaFactor), 1f);

            rowY += ITEM_HEIGHT + ITEM_GAP;
        }
        render.popClipRect();

        drawThemes(render, alpha, mouseX, mouseY, dt);

        if ((pickerOpen || pickerAnim > 0.01f) && activeEntry != null) {
            updatePickerLayout(screenW, screenH, !manualPickerPosition && pickerOpen);
            drawPicker(render, alpha * pickerAnim, dt);
            if (pickerOpen) {
                updateDragging(mouseX, mouseY);
            }
        }

        if (lastTooltipSlot != null && tooltipAnim > 0.01f) {
            drawThemeTooltip(render, lastTooltipSlot, alphaFactor * tooltipAnim);
        }
    }

    public ThemeConfig.Theme consumePendingTheme() {
        ThemeConfig.Theme t = pendingTheme;
        pendingTheme = null;
        return t;
    }

    public float getPendingCenterX() {
        return pendingCenterX;
    }

    public float getPendingCenterY() {
        return pendingCenterY;
    }

    public boolean mouseClicked(double mouseX, double mouseY, int button, float x, float y, float screenW, float screenH) {
        if (button != 0) {
            return false;
        }
        lastX = x;
        lastY = y;
        lastScreenW = screenW;
        lastScreenH = screenH;

        float entriesStartY = layoutThemes(x, y);

        boolean clickedOnRename = MathUtil.isHovered(mouseX, mouseY, renameFieldX, renameFieldY, renameFieldW, renameFieldH)
                || MathUtil.isHovered(mouseX, mouseY, renameButtonX, renameButtonY, renameButtonW, renameButtonH);
        if (!clickedOnRename) {
            renameInputFocused = false;
        }

        if (pickerOpen && activeEntry != null) {
            updatePickerLayout(screenW, screenH, false);
            if (MathUtil.isHovered(mouseX, mouseY, pickerX, pickerY, pickerW, pickerH)) {
                return handlePickerClick(mouseX, mouseY, screenW, screenH);
            }
        }

        float entryClickY = entriesStartY;
        for (int i = 0; i < entries.size(); i++) {
            if (MathUtil.isHovered(mouseX, mouseY, x + 4f, entryClickY, WIDTH - 8f, ITEM_HEIGHT)) {
                ensureEditableTheme();
                activeEntry = entries.get(i);
                activeIndex = i;
                activeEntry.syncFromColor();
                pickerOpen = true;
                draggingSv = false;
                draggingHue = false;
                draggingAlpha = false;
                draggingPicker = false;
                manualPickerPosition = false;
                rgbInputFocused = false;
                updatePickerLayout(screenW, screenH, true);
                return true;
            }
            entryClickY += ITEM_HEIGHT + ITEM_GAP;
        }

        for (ThemeSlot slot : themeSlots) {
            if (MathUtil.isHovered(mouseX, mouseY, slot.x, slot.y, THEME_CIRCLE, THEME_CIRCLE)) {
                pendingTheme = slot.theme;
                pendingCenterX = slot.x + THEME_CIRCLE * 0.5f;
                pendingCenterY = slot.y + THEME_CIRCLE * 0.5f;
                if (activeEntry != null) {
                    activeEntry.syncFromColor();
                }
                pickerOpen = false;
                draggingSv = false;
                draggingHue = false;
                draggingAlpha = false;
                draggingPicker = false;
                rgbInputFocused = false;
                dirty = false;
                ThemeConfig.clearDirty();
                return true;
            }
        }

        if (MathUtil.isHovered(mouseX, mouseY, saveX, saveY, saveW, saveH)) {
            ensureEditableTheme();
            ThemeConfig.saveCurrentTheme(true);
            ThemeConfig.clearDirty();
            ThemeConfig.save();
            dirty = false;
            return true;
        }

        if (MathUtil.isHovered(mouseX, mouseY, newX, newY, newW, newH)) {
            ThemeConfig.createThemeFromCurrent("Новая тема");
            ThemeConfig.clearDirty();
            ThemeConfig.save();
            dirty = false;
            return true;
        }

        if (MathUtil.isHovered(mouseX, mouseY, deleteX, deleteY, deleteW, deleteH)) {
            if (ThemeConfig.getThemes().size() > 1) {
                ThemeConfig.Theme current = ThemeConfig.getCurrentTheme();
                ThemeConfig.removeTheme(current);
                ThemeConfig.clearDirty();
                ThemeConfig.save();
                if (activeEntry != null) {
                    activeEntry.syncFromColor();
                }
                dirty = false;
            }
            return true;
        }

        if (MathUtil.isHovered(mouseX, mouseY, renameButtonX, renameButtonY, renameButtonW, renameButtonH)) {
            applyThemeRename();
            return true;
        }

        if (MathUtil.isHovered(mouseX, mouseY, renameFieldX, renameFieldY, renameFieldW, renameFieldH)) {
            if (!ThemeConfig.isEditable(ThemeConfig.getCurrentTheme())) {
                return true;
            }
            renameInputFocused = true;
            ThemeConfig.Theme current = ThemeConfig.getCurrentTheme();
            if (current != null) {
                renameInputText = current.name;
            }
            renameCursorPos = renameInputText.length();
            return true;
        }

        float rowY = entriesStartY;
        for (int i = 0; i < entries.size(); i++) {
            if (MathUtil.isHovered(mouseX, mouseY, x, rowY, WIDTH, ITEM_HEIGHT)) {
                ensureEditableTheme();
                activeEntry = entries.get(i);
                activeIndex = i;
                activeEntry.syncFromColor();
                pickerOpen = true;
                draggingSv = false;
                draggingHue = false;
                draggingAlpha = false;
                draggingPicker = false;
                manualPickerPosition = false;
                rgbInputFocused = false;
                updatePickerLayout(screenW, screenH, true);
                return true;
            }
            rowY += ITEM_HEIGHT + ITEM_GAP;
        }

        if (pickerOpen && activeEntry != null) {
            updatePickerLayout(screenW, screenH, false);
            if (!MathUtil.isHovered(mouseX, mouseY, pickerX, pickerY, pickerW, pickerH)) {
                pickerOpen = false;
                draggingSv = false;
                draggingHue = false;
                draggingAlpha = false;
                draggingPicker = false;
                rgbInputFocused = false;
                return true;
            }

            if (MathUtil.isHovered(mouseX, mouseY, closeX, closeY, closeW, closeH)) {
                pickerOpen = false;
                draggingSv = false;
                draggingHue = false;
                draggingAlpha = false;
                draggingPicker = false;
                rgbInputFocused = false;
                return true;
            }

            if (MathUtil.isHovered(mouseX, mouseY, pickerX, pickerY, pickerW, PICKER_PADDING + PICKER_HEADER)) {
                draggingPicker = true;
                manualPickerPosition = true;
                pickerDragOffsetX = (float) mouseX - pickerX;
                pickerDragOffsetY = (float) mouseY - pickerY;
                rgbInputFocused = false;
                return true;
            }

            if (MathUtil.isHovered(mouseX, mouseY, svX, svY, SV_SIZE, SV_SIZE)) {
                draggingSv = true;
                draggingHue = false;
                draggingAlpha = false;
                draggingPicker = false;
                rgbInputFocused = false;
                updateSv(mouseX, mouseY);
                return true;
            }

            if (MathUtil.isHovered(mouseX, mouseY, hueX - 2f, hueY - 2f, hueW + 4f, hueH + 4f)) {
                draggingHue = true;
                draggingSv = false;
                draggingAlpha = false;
                draggingPicker = false;
                rgbInputFocused = false;
                updateHue(mouseX);
                return true;
            }

            if (MathUtil.isHovered(mouseX, mouseY, alphaX - 2f, alphaY - 2f, alphaW + 4f, alphaH + 4f)) {
                draggingAlpha = true;
                draggingSv = false;
                draggingHue = false;
                draggingPicker = false;
                rgbInputFocused = false;
                updateAlpha(mouseX);
                return true;
            }

            if (MathUtil.isHovered(mouseX, mouseY, copyX, copyY, copyW, copyH)) {
                copyRgbToClipboard();
                rgbInputFocused = false;
                return true;
            }

            if (MathUtil.isHovered(mouseX, mouseY, pasteX, pasteY, pasteW, pasteH)) {
                pasteRgbFromClipboard();
                rgbInputFocused = false;
                return true;
            }

            rgbInputFocused = false;
            return true;
        }

        return false;
    }

    public boolean mouseScrolled(double mouseX, double mouseY, double verticalAmount, float x, float y, float screenW, float screenH) {
        lastX = x;
        lastY = y;
        lastScreenW = screenW;
        lastScreenH = screenH;
        layoutThemes(x, y);
        if (!MathUtil.isHovered(mouseX, mouseY, x, themesAreaY, WIDTH, themesAreaH)) {
            return false;
        }
        float maxScroll = Math.max(0f, themesContentH - themesAreaH);
        if (maxScroll <= 0.01f) {
            themesScroll = 0f;
            return false;
        }
        themesScroll = Math.max(0f, Math.min(maxScroll, themesScroll - (float) verticalAmount * 24f));
        layoutThemes(x, y);
        return true;
    }

    private boolean handlePickerClick(double mouseX, double mouseY, float screenW, float screenH) {
        ensureEditableTheme();

        if (MathUtil.isHovered(mouseX, mouseY, closeX, closeY, closeW, closeH)) {
            pickerOpen = false;
            draggingSv = false;
            draggingHue = false;
            draggingAlpha = false;
            draggingPicker = false;
            rgbInputFocused = false;
            return true;
        }

        if (MathUtil.isHovered(mouseX, mouseY, pickerX, pickerY, pickerW, PICKER_PADDING + PICKER_HEADER)) {
            draggingPicker = true;
            manualPickerPosition = true;
            pickerDragOffsetX = (float) mouseX - pickerX;
            pickerDragOffsetY = (float) mouseY - pickerY;
            rgbInputFocused = false;
            return true;
        }

        if (MathUtil.isHovered(mouseX, mouseY, svX, svY, SV_SIZE, SV_SIZE)) {
            draggingSv = true;
            draggingHue = false;
            draggingAlpha = false;
            draggingPicker = false;
            rgbInputFocused = false;
            updateSv(mouseX, mouseY);
            return true;
        }

        if (MathUtil.isHovered(mouseX, mouseY, hueX - 2f, hueY - 2f, hueW + 4f, hueH + 4f)) {
            draggingHue = true;
            draggingSv = false;
            draggingAlpha = false;
            draggingPicker = false;
            rgbInputFocused = false;
            updateHue(mouseX);
            return true;
        }

        if (MathUtil.isHovered(mouseX, mouseY, alphaX - 2f, alphaY - 2f, alphaW + 4f, alphaH + 4f)) {
            draggingAlpha = true;
            draggingSv = false;
            draggingHue = false;
            draggingPicker = false;
            rgbInputFocused = false;
            updateAlpha(mouseX);
            return true;
        }

        if (MathUtil.isHovered(mouseX, mouseY, copyX, copyY, copyW, copyH)) {
            copyRgbToClipboard();
            rgbInputFocused = false;
            return true;
        }

        if (MathUtil.isHovered(mouseX, mouseY, pasteX, pasteY, pasteW, pasteH)) {
            pasteRgbFromClipboard();
            rgbInputFocused = false;
            return true;
        }

        rgbInputFocused = false;
        return true;
    }

    private void ensureEditableTheme() {
        ThemeConfig.Theme current = ThemeConfig.getCurrentTheme();
        if (ThemeConfig.isEditable(current)) {
            return;
        }
        String baseName = current == null ? "Theme" : current.name + " Custom";
        ThemeConfig.Theme customCopy = ThemeConfig.createThemeFromCurrent(baseName);
        ThemeConfig.applyTheme(customCopy);
        ThemeConfig.save();
        if (activeEntry != null) {
            activeEntry.syncFromColor();
        }
    }

    public void saveIfDirty() {
        if (!dirty) {
            return;
        }
        ThemeConfig.saveCurrentTheme(true);
        ThemeConfig.clearDirty();
        ThemeConfig.save();
        dirty = false;
    }

    public boolean isDirty() {
        return dirty;
    }

    private float getThemeSectionHeight() {
        int themeCount = Math.max(1, ThemeConfig.getThemes().size());
        int columns = getThemeColumns();
        int rows = Math.max(1, (int) Math.ceil(themeCount / (float) columns));
        float gridHeight = rows * THEME_CIRCLE + (rows - 1) * THEME_ROW_GAP;
        float buttonsHeight = THEME_BUTTON_HEIGHT;
        float renameHeight = THEME_BUTTON_HEIGHT + THEME_BUTTON_GAP;
        return gridHeight + THEME_BUTTON_GAP + buttonsHeight + THEME_BUTTON_GAP + renameHeight;
    }

    private float layoutThemes(float x, float y) {
        themeSlots.clear();
        List<ThemeConfig.Theme> themes = ThemeConfig.getThemes();
        int columns = getThemeColumns();
        int rows = Math.max(1, (int) Math.ceil(Math.max(1, themes.size()) / (float) columns));
        float gridHeight = rows * THEME_CIRCLE + (rows - 1) * THEME_ROW_GAP;
        float itemsHeight = entries.isEmpty() ? 0f : (entries.size() * ITEM_HEIGHT) + ((entries.size() - 1) * ITEM_GAP);

        saveW = Math.max(72f, FontRegistry.SF_MEDIUM.getWidth("Сохранить", 13f) + 22f);
        saveH = THEME_BUTTON_HEIGHT + 8f;
        newW = Math.max(58f, FontRegistry.SF_MEDIUM.getWidth("Новая", 13f) + 22f);
        newH = saveH;
        deleteW = Math.max(64f, FontRegistry.SF_MEDIUM.getWidth("Удалить", 13f) + 22f);
        deleteH = saveH;

        float totalButtonsWidth = saveW + THEME_BUTTON_GAP + newW + THEME_BUTTON_GAP + deleteW;
        float buttonsStartX = x + (WIDTH - totalButtonsWidth) * 0.5f;

        renameButtonW = saveH;
        renameButtonH = saveH;
        renameFieldW = totalButtonsWidth - THEME_BUTTON_GAP - renameButtonW;
        renameFieldH = saveH;
        renameFieldX = buttonsStartX;
        renameButtonX = renameFieldX + renameFieldW + THEME_BUTTON_GAP;
        renameFieldY = y + getHeight() - PADDING - renameFieldH;
        renameButtonY = renameFieldY;

        float startX = x + PADDING;
        saveY = renameFieldY - THEME_BUTTON_GAP - 2f - saveH;
        newY = saveY;
        deleteY = saveY;

        saveX = buttonsStartX;
        newX = saveX + saveW + THEME_BUTTON_GAP;
        deleteX = newX + newW + THEME_BUTTON_GAP;

        themesAreaY = y + HEADER_HEIGHT + PADDING + itemsHeight + SECTION_GAP;
        themesAreaH = Math.max(0f, saveY - THEME_BUTTON_GAP - themesAreaY);
        themesContentH = gridHeight;
        themesScroll = Math.max(0f, Math.min(themesScroll, Math.max(0f, themesContentH - themesAreaH)));
        float startY = themesAreaY - themesScroll;
        for (int i = 0; i < themes.size(); i++) {
            int col = i % columns;
            int row = i / columns;
            float cx = startX + col * (THEME_CIRCLE + THEME_GAP);
            float cy = startY + row * (THEME_CIRCLE + THEME_ROW_GAP);
            themeSlots.add(new ThemeSlot(themes.get(i), cx, cy));
        }

        lastEntriesStartY = y + HEADER_HEIGHT + PADDING;
        return lastEntriesStartY;
    }

    private int getThemeColumns() {
        float available = WIDTH - PADDING * 2f;
        float step = THEME_CIRCLE + THEME_GAP;
        return Math.max(1, (int) Math.floor((available + THEME_GAP) / step));
    }

    private void drawThemes(Renderer2D render, float alpha, int mouseX, int mouseY, float dt) {
        ThemeConfig.Theme current = ThemeConfig.getCurrentTheme();
        float alphaFactor = alpha / 255f;
        ThemeSlot hovered = null;

        render.pushClipRect((int) lastX, (int) themesAreaY, (int) WIDTH, (int) themesAreaH);
        for (ThemeSlot slot : themeSlots) {
            boolean isHovered = MathUtil.isHovered(mouseX, mouseY, slot.x, slot.y, THEME_CIRCLE, THEME_CIRCLE);
            float hoverValue = themeHover.getOrDefault(slot.theme.name, 0f);
            hoverValue = approach(hoverValue, isHovered ? 1f : 0f, ANIM_SPEED, dt);
            themeHover.put(slot.theme.name, hoverValue);
            int iconColor = slot.theme == current
                    ? ClientColors.BACKGROUND.getRGB()
                    : slot.theme.background;

            int fill = applyAlpha(iconColor, alphaFactor);
            render.rect(slot.x, slot.y, THEME_CIRCLE, THEME_CIRCLE, THEME_CIRCLE * 0.5f, applyAlpha(slot.theme.gradientStart, alphaFactor));

            if (slot.theme == current) {
                render.rectOutline(slot.x, slot.y, THEME_CIRCLE, THEME_CIRCLE, THEME_CIRCLE * 0.5f,
                        applyAlpha(0xCCFFFFFF, alphaFactor), 1.5f);
            } else if (hoverValue > 0.01f) {
                render.rectOutline(slot.x, slot.y, THEME_CIRCLE, THEME_CIRCLE, THEME_CIRCLE * 0.5f,
                        applyAlpha(0x88FFFFFF, alphaFactor * hoverValue), 1.5f);
            }

            if (isHovered) {
                hovered = slot;
            }
        }

        float maxThemeBottom = themesAreaY;
        for (ThemeSlot slot : themeSlots) {
            maxThemeBottom = Math.max(maxThemeBottom, slot.y + THEME_CIRCLE);
        }
        if (themesContentH <= themesAreaH - 70f && themesAreaY + themesAreaH - maxThemeBottom > 56f) {
            String line1 = "Здесь будут ваши";
            String line2 = "новые темы";
            float size = 18f;
            float centerY = maxThemeBottom + (themesAreaY + themesAreaH - maxThemeBottom) * 0.5f;
            float line1W = FontRegistry.SF_MEDIUM.getWidth(line1, size);
            float line2W = FontRegistry.SF_MEDIUM.getWidth(line2, size);
            render.text(FontRegistry.SF_MEDIUM, lastX + (WIDTH - line1W) * 0.5f, centerY - 10f, size, line1,
                    applyAlpha(0xFFD0D6E4, alphaFactor * 0.34f));
            render.text(FontRegistry.SF_MEDIUM, lastX + (WIDTH - line2W) * 0.5f, centerY + 10f, size, line2,
                    applyAlpha(0xFFD0D6E4, alphaFactor * 0.34f));
        }

        if (themesContentH > themesAreaH + 0.01f) {
            float trackX = lastX + WIDTH - 7f;
            float trackY = themesAreaY;
            float trackH = themesAreaH;
            float thumbH = Math.max(18f, trackH * (themesAreaH / themesContentH));
            float thumbY = trackY + (trackH - thumbH) * (themesScroll / Math.max(1f, themesContentH - themesAreaH));
            render.rect(trackX, trackY, 2f, trackH, 1f, applyAlpha(0x22FFFFFF, alphaFactor));
            render.rect(trackX - 1f, thumbY, 4f, thumbH, 2f, applyAlpha(0x88FFFFFF, alphaFactor));
        }
        render.popClipRect();

        saveHover = approach(saveHover, MathUtil.isHovered(mouseX, mouseY, saveX, saveY, saveW, saveH) ? 1f : 0f, ANIM_SPEED, dt);
        newHover = approach(newHover, MathUtil.isHovered(mouseX, mouseY, newX, newY, newW, newH) ? 1f : 0f, ANIM_SPEED, dt);
        deleteHover = approach(deleteHover, MathUtil.isHovered(mouseX, mouseY, deleteX, deleteY, deleteW, deleteH) ? 1f : 0f, ANIM_SPEED, dt);
        boolean renameFieldHov = MathUtil.isHovered(mouseX, mouseY, renameFieldX, renameFieldY, renameFieldW, renameFieldH);
        renameFieldHover = approach(renameFieldHover, (renameFieldHov || renameInputFocused) ? 1f : 0f, ANIM_SPEED, dt);
        renameButtonHover = approach(renameButtonHover, MathUtil.isHovered(mouseX, mouseY, renameButtonX, renameButtonY, renameButtonW, renameButtonH) ? 1f : 0f, ANIM_SPEED, dt);
        drawButton(render, saveX, saveY, saveW, saveH, "Сохранить", alpha, saveHover);
        drawButton(render, newX, newY, newW, newH, "Новая", alpha, newHover);
        drawButton(render, deleteX, deleteY, deleteW, deleteH, "Удалить", alpha, deleteHover);

        drawRenameField(render, alpha);
        drawRenameButton(render, alpha);

        if (hovered != null) {
            lastTooltipSlot = hovered;
        }
        tooltipAnim = approach(tooltipAnim, hovered != null ? 1f : 0f, ANIM_SPEED, dt);
        if (hovered == null && tooltipAnim <= 0.01f) {
            lastTooltipSlot = null;
        }
    }

    private void drawThemeTooltip(Renderer2D render, ThemeSlot slot, float alphaFactor) {
        if (slot == null || slot.theme == null || FontRegistry.SF_MEDIUM == null) {
            return;
        }
        String name = slot.theme.name;
        String date = "Изменено: " + slot.theme.formattedDate();
        float size = 11.5f;
        float pad = 6f;
        float lineHeight = FontRegistry.SF_MEDIUM.getLineHeight(size);

        float w1 = render.measureText(FontRegistry.SF_MEDIUM, name, size).width;
        float w2 = render.measureText(FontRegistry.SF_MEDIUM, date, size).width;
        float width = Math.max(w1, w2) + pad * 2f;
        float height = lineHeight * 2f + pad * 2f;

        float centerX = slot.x + THEME_CIRCLE * 0.5f;
        float tx = centerX - width * 0.5f;
        float ty = slot.y - height - 6f;
        if (ty < lastY + 4f) {
            ty = slot.y + THEME_CIRCLE + 6f;
        }

        float minX = lastX + 6f;
        float maxX = lastX + WIDTH - width - 6f;
        if (tx < minX) tx = minX;
        if (tx > maxX) tx = maxX;

        int bg = applyAlpha(0xFF0B0914, alphaFactor);
        render.blur(tx, ty, width, height, 8f, alphaFactor);
        render.rect(tx, ty, width, height, 8f, bg);

        render.text(FontRegistry.SF_MEDIUM, tx + pad, ty + pad + lineHeight - 2f, size, name,
                applyAlpha(0xFFFFFFFF, alphaFactor));
        render.text(FontRegistry.SF_MEDIUM, tx + pad, ty + pad + lineHeight * 2f - 2f, size, date,
                applyAlpha(0xFFB8B8C0, alphaFactor));
    }

    private void updatePickerLayout(float screenW, float screenH, boolean autoPosition) {
        float infoRowsHeight = (RGB_HEIGHT * 2.8f) + (RGB_ROW_GAP * 2f);
        pickerW = SV_SIZE + PICKER_PADDING * 2f + 48f;
        float contentW = pickerW - PICKER_PADDING * 2f;
        pickerH = PICKER_PADDING * 3f + PICKER_HEADER
                + SV_SIZE
                + HUE_GAP + HUE_HEIGHT
                + infoRowsHeight
        ;

        float baseX = pickerX;
        float baseY = pickerY;
        if (autoPosition) {
            baseX = lastX + WIDTH + 10f;
            baseY = lastY + 200f;
            if (activeIndex >= 0) {
                baseY = lastY + 200f + (activeIndex * (ITEM_HEIGHT + ITEM_GAP));
            }
        }

        if (baseX + pickerW > screenW - 10f) {
            baseX = screenW - pickerW - 10f;
        }
        if (baseX < 8f) {
            baseX = 8f;
        }
        if (baseY + pickerH > screenH - 8f) {
            baseY = screenH - pickerH - 8f;
        }
        if (baseY < 8f) {
            baseY = 8f;
        }

        pickerX = baseX;
        pickerY = baseY;

        svX = pickerX + (contentW - SV_SIZE) * 0.2f;
        svY = pickerY + PICKER_PADDING + PICKER_HEADER;
        hueX = pickerX + PICKER_PADDING + 2f;
        hueY = svY + SV_SIZE + HUE_GAP;
        hueW = contentW - 4f;
        hueH = HUE_HEIGHT;

        alphaX = hueX;
        alphaY = hueY + hueH + ALPHA_GAP;
        alphaW = hueW;
        alphaH = 12f;

        rgbX = pickerX + PICKER_PADDING;
        rgbY = alphaY + alphaH + ALPHA_GAP;
        rgbW = contentW;
        rgbH = RGB_HEIGHT;

        copyX = rgbX;
        copyY = rgbY + (RGB_HEIGHT * 0.6f) + (RGB_ROW_GAP * 1f) + ALPHA_GAP;
        copyW = (contentW - BUTTON_GAP) * 0.5f;
        copyH = RGB_HEIGHT;

        pasteX = copyX + copyW + BUTTON_GAP;
        pasteY = copyY;
        pasteW = copyW;
        pasteH = RGB_HEIGHT;

        closeW = 14f;
        closeH = 14f;
        closeX = pickerX + pickerW - PICKER_PADDING - closeW;
        closeY = pickerY + PICKER_PADDING + (PICKER_HEADER - closeH) * 0.1f;

    }

    private void drawPicker
            (Renderer2D render, float alpha, float dt) {
        float alphaFactor = alpha / 255f;
        int panelAlpha = (int) (alphaFactor * 220f);
        int panelColor =ColorUtils.multAlpha(ColorUtils.darkenWithAlpha(ClientColors.BACKGROUND.getRGB(), 0.65f), alpha / 255f);
        int shadowColor = new Color(0, 0, 0, (int) (alphaFactor * 70f)).getRGB();
        render.shadow(pickerX, pickerY, pickerW, pickerH, PICKER_ROUNDING, 4f, 0f, shadowColor);
        render.blur(pickerX, pickerY + 0.4f, pickerW - 0.4f, pickerH - 0.4f, PICKER_ROUNDING, alpha / 255f);
        render.rect(pickerX, pickerY, pickerW, pickerH, PICKER_ROUNDING, panelColor);

        if (FontRegistry.SF_MEDIUM != null && activeEntry != null) {
            render.text(FontRegistry.SF_MEDIUM, pickerX + PICKER_PADDING, pickerY + 18f, 14f,
                    activeEntry.label, new Color(220, 220, 230, (int) alpha).getRGB());
        }

        float closeTarget = MathUtil.isHovered(lastMouseX, lastMouseY, closeX, closeY, closeW, closeH) ? 1f : 0f;
        closeHover = approach(closeHover, closeTarget, ANIM_SPEED * 1.4f, dt);
        int closeAlpha = (int) (alpha * (0.2f + 0.35f * closeHover));
        render.rect(closeX, closeY, closeW, closeH, 4f, new Color(18, 14, 26, closeAlpha).getRGB());

        if (FontRegistry.SF_MEDIUM != null) {
            float closeCenterX = closeX + closeW * 0.5f;
            float closeCenterY = closeY + closeH * 0.5f;
            float closeBaseline = closeCenterY
                    + FontRegistry.centeredBaselineOffset(FontRegistry.SF_MEDIUM, 'X', 11f);
            render.text(FontRegistry.SF_MEDIUM, closeCenterX, closeBaseline, 11f, "X",
                    applyAlpha(0xFFE6E6EE, alphaFactor), "c");
        }

        int hueColor = 0xFF000000 | (Color.HSBtoRGB(activeEntry.hue, 1f, 1f) & 0xFFFFFF);
        int tl = applyAlpha(0xFFFFFFFF, alphaFactor);
        int tr = applyAlpha(hueColor, alphaFactor);
        int br = applyAlpha(hueColor, alphaFactor);
        int bl = applyAlpha(0xFFFFFFFF, alphaFactor);
        render.gradient(svX, svY, SV_SIZE, SV_SIZE, 4f, tl, tr, br, bl);
        int maskTop = applyAlpha(0x00000000, alphaFactor);
        int maskBottom = applyAlpha(0xFF000000, alphaFactor);
        render.gradient(svX, svY, SV_SIZE, SV_SIZE, 4f, maskTop, maskTop, maskBottom, maskBottom);

        drawHueBar(render, alphaFactor);

        drawSvMarker(render, alphaFactor);
        drawHueMarker(render, alphaFactor);

        drawRgbField(render, alpha);
        drawAlphaBar(render, alphaFactor);
    }

    private void drawHueBar(Renderer2D render, float alphaFactor) {
        int[] hueStops = {0xFFFF0000, 0xFFFFFF00, 0xFF00FF00, 0xFF00FFFF, 0xFF0000FF, 0xFFFF00FF, 0xFFFF0000};
        for (int i = 0; i < 6; i++) {
            float segmentX = hueX + (i * hueW / 6f);
            float segmentNextX = hueX + ((i + 1) * hueW / 6f);
            float segmentW = (segmentNextX - segmentX) + 1.5f;
            float rLeft = (i == 0) ? 5f : 0f;
            float rRight = (i == 5) ? 5f : 0f;
            render.gradient(segmentX, hueY, segmentW, hueH, rLeft, rRight, rRight, rLeft,
                    applyAlpha(hueStops[i], alphaFactor), applyAlpha(hueStops[i + 1], alphaFactor),
                    applyAlpha(hueStops[i + 1], alphaFactor), applyAlpha(hueStops[i], alphaFactor));
        }

    }

    private void drawSvMarker(Renderer2D render, float alphaFactor) {
        float markerX = svX + (activeEntry.saturation * SV_SIZE);
        float markerY = svY + ((1f - activeEntry.value) * SV_SIZE);
        render.rectOutline(markerX - 3.5f, markerY - 3.5f, 7f, 7f, 3.5f,
                applyAlpha(0x80FFFFFF, alphaFactor), 1.5f);
        render.rectOutline(markerX - 3f, markerY - 3f, 6f, 6f, 3f,
                applyAlpha(0xFFFFFFFF, alphaFactor), 1f);
    }

    private void drawHueMarker(Renderer2D render, float alphaFactor) {
        float markerX = hueX + (activeEntry.hue * hueW);
        markerX = Math.max(hueX, Math.min(markerX, hueX + hueW));
        render.rect(markerX - 2f, hueY - 2f, 4f, hueH + 4f, 2f, applyAlpha(0xFFFFFFFF, alphaFactor));
        render.rectOutline(markerX - 2f, hueY - 2f, 4f, hueH + 4f, 2f,
                applyAlpha(0xB0000000, alphaFactor), 1f);
    }

    private void drawRgbField(Renderer2D render, float alpha) {
        float alphaFactor = alpha / 255f;
        if (activeEntry == null) {
            return;
        }

        Color color = new Color(activeEntry.getColor(), true);
        float rowY = rgbY;

        drawInfoRow(render, rgbX, rowY, rgbW, rgbH, "RGB",
                color.getRed() + ", " + color.getGreen() + ", " + color.getBlue(), alphaFactor);
        float copyHoverValue = MathUtil.isHovered(lastMouseX, lastMouseY, copyX, copyY, copyW, copyH) ? 1f : 0f;
        float pasteHoverValue = MathUtil.isHovered(lastMouseX, lastMouseY, pasteX, pasteY, pasteW, pasteH) ? 1f : 0f;
        drawSmallButton(render, copyX, copyY, copyW, copyH, "Копировать", alphaFactor, copyHoverValue > 0.5f);
        drawSmallButton(render, pasteX, pasteY, pasteW, pasteH, "Вставить", alphaFactor, pasteHoverValue > 0.5f);
    }

    private void drawInfoRow(Renderer2D render, float x, float y, float w, float h, String label, String value, float alphaFactor) {
        int fill = ColorUtils.multAlpha(ColorUtils.lightenWithAlpha(ClientColors.BACKGROUND.getRGB(), 0.15f), alphaFactor);
        render.rect(x, y, w, h, 6f, fill);

        render.text(FontRegistry.SF_MEDIUM, x + 6f, centeredTextY(y, h, 12f), 12f, label,
                applyAlpha(0xFFE0E0EA, alphaFactor));
        float valueW = render.measureText(FontRegistry.SF_MEDIUM, value, 12f).width;
        render.text(FontRegistry.SF_MEDIUM, x + w - valueW - 6f, centeredTextY(y, h, 12f), 12f, value,
                applyAlpha(0xFFCFCFDB, alphaFactor));
    }

    private void drawSmallButton(Renderer2D render, float x, float y, float w, float h, String label, float alphaFactor, boolean hovered) {
        int fill = ColorUtils.multAlpha(ColorUtils.lightenWithAlpha(ClientColors.BACKGROUND.getRGB(), 0.25f), alphaFactor);
        int fill1 = ColorUtils.multAlpha(ColorUtils.lightenWithAlpha(ClientColors.BACKGROUND.getRGB(), 0.15f), alphaFactor);
        render.rect(x, y, w, h, 6f, (hovered ? fill : fill1));
        float textW = render.measureText(FontRegistry.SF_MEDIUM, label, 12f).width;
        float textX = x + Math.max(2f, (w - textW) * 0.5f);
        render.text(FontRegistry.SF_MEDIUM, textX, centeredTextY(y, h, 12f), 12f, label, applyAlpha(0xFFE0E0EA, alphaFactor));
    }

    private void drawRenameField(Renderer2D render, float alpha) {
        float alphaFactor = alpha / 255f;
        float hoverProgress = renameFieldHover;
        int baseRowColor = ColorUtils.interpolate(ColorUtils.rgba(255, 255, 255, 10), ColorUtils.rgba(255, 255, 255, 18), hoverProgress);
        int activeRowColor = ColorUtils.rgba(136, 121, 207, 20);
        int rowColor = ColorUtils.interpolate(baseRowColor, activeRowColor, renameInputFocused ? 1f : 0f);

        render.rect(renameFieldX, renameFieldY, renameFieldW, renameFieldH, 10f, ColorUtils.multAlpha(rowColor, alphaFactor));
        render.rectOutline(renameFieldX, renameFieldY, renameFieldW, renameFieldH, 10f, ColorUtils.multAlpha(ColorUtils.rgba(125, 125, 125, 40), alphaFactor), 1f);

        if (!renameInputFocused) {
            ThemeConfig.Theme current = ThemeConfig.getCurrentTheme();
            if (current != null && !renameInputText.equals(current.name)) {
                renameInputText = current.name;
            }
        }

        render.text(FontRegistry.SF_MEDIUM, renameFieldX + 9f, centeredTextY(renameFieldY, renameFieldH, 12f), 12f, renameInputText,
                new Color(210, 210, 220, (int) alpha).getRGB());

        if (renameInputFocused) {
            float blink = (float) ((Math.sin(System.currentTimeMillis() / 140.0) + 1.0) * 0.5);
            int cursorColor = applyAlpha(0xFFFFFFFF, alphaFactor * (0.25f + 0.75f * blink));
            String left = renameCursorPos <= 0 ? "" : renameInputText.substring(0, Math.min(renameCursorPos, renameInputText.length()));
            float cursorOffset = render.measureText(FontRegistry.SF_MEDIUM, left, 12f).width;
            float cx = renameFieldX + 9f + cursorOffset;
            render.rect(cx, renameFieldY + 3f, 1.5f, renameFieldH - 6f, 1f, cursorColor);
        }
    }

    private void drawRenameButton(Renderer2D render, float alpha) {
        float alphaFactor = alpha / 255f;
        float hoverProgress = renameButtonHover;
        int baseRowColor = ColorUtils.interpolate(ColorUtils.rgba(255, 255, 255, 10), ColorUtils.rgba(255, 255, 255, 18), hoverProgress);
        int activeRowColor = ColorUtils.rgba(136, 121, 207, 20);
        int rowColor = ColorUtils.interpolate(baseRowColor, activeRowColor, hoverProgress);
        render.rect(renameButtonX, renameButtonY, renameButtonW, renameButtonH, 10f, ColorUtils.multAlpha(rowColor, alphaFactor));
        render.rectOutline(renameButtonX, renameButtonY, renameButtonW, renameButtonH, 10f, ColorUtils.multAlpha(ColorUtils.rgba(125, 125, 125, 40), alphaFactor), 1f);
        float textW = render.measureText(FontRegistry.WEXSIDE_MENU_ICONS, "ч", 12f).width;
        float textX = renameButtonX + (renameButtonW - textW) * 0.5f;
        render.text(FontRegistry.WEXSIDE_MENU_ICONS, textX, centeredTextY(renameButtonY, renameButtonH, 12f), 12f, "ч", applyAlpha(0xFFE0E0EA, alphaFactor));
    }

    private void applyThemeRename() {
        if (renameInputText == null || renameInputText.trim().isEmpty()) {
            return;
        }
        String newName = renameInputText.trim();
        ThemeConfig.Theme current = ThemeConfig.getCurrentTheme();
        if (current != null) {
            ThemeConfig.renameTheme(current, newName);
            ThemeConfig.save();
            renameInputFocused = false;
        }
    }

    private void drawAlphaBar(Renderer2D render, float alphaFactor) {
        int baseRgb = 0x00FFFFFF & activeEntry.getColor();
        int left = applyAlpha(baseRgb, 0f);
        int right = applyAlpha(0xFF000000 | baseRgb, alphaFactor);
        int outline = applyAlpha(0x78000000, alphaFactor);

        render.rect(alphaX, alphaY, alphaW, alphaH, 4f, applyAlpha(0x1A10161A, alphaFactor));
        render.gradient(alphaX, alphaY, alphaW, alphaH, 4f, left, right, right, left);


        float markerX = alphaX + (activeEntry.alpha * alphaW);
        render.rect(markerX - 2f, alphaY - 2f, 4f, alphaH + 4f, 2f,
                applyAlpha(0xCCFFFFFF, alphaFactor));
        render.rectOutline(markerX - 2f, alphaY - 2f, 4f, alphaH + 4f, 2f,
                applyAlpha(0xB0000000, alphaFactor), 1f);

    }

    private void drawButton(Renderer2D render, float x, float y, float w, float h, String label, float alpha, float hover) {
        float alphaFactor = alpha / 255f;
        float hoverProgress = MathUtil.clamp(hover, 0f, 1f);
        int baseRowColor = ColorUtils.interpolate(ColorUtils.rgba(255, 255, 255, 10), ColorUtils.rgba(255, 255, 255, 18), hoverProgress);
        int activeRowColor = ColorUtils.rgba(136, 121, 207, 20);
        int rowColor = ColorUtils.interpolate(baseRowColor, activeRowColor, hoverProgress);

        render.rect(x, y, w, h, 10f, ColorUtils.multAlpha(rowColor, alphaFactor));
        render.rectOutline(x, y, w, h, 10f, ColorUtils.multAlpha(ColorUtils.rgba(125, 125, 125, 40), alphaFactor), 1f);
        float textY = buttonTextY(y, h, 13f);
        float textW = render.measureText(FontRegistry.SF_MEDIUM, label, 13f).width;
        render.text(FontRegistry.SF_MEDIUM, x + (w - textW) * 0.5f, textY, 13f, label,
                new Color(220, 220, 230, (int) alpha).getRGB());
    }

    private void updateDragging(int mouseX, int mouseY) {
        if (!draggingSv && !draggingHue && !draggingAlpha && !draggingPicker) {
            return;
        }
        MinecraftClient client = MinecraftClient.getInstance();
        if (client == null) {
            draggingSv = false;
            draggingHue = false;
            draggingAlpha = false;
            draggingPicker = false;
            return;
        }
        if (GLFW.glfwGetMouseButton(client.getWindow().getHandle(), GLFW.GLFW_MOUSE_BUTTON_1) == 0) {
            draggingSv = false;
            draggingHue = false;
            draggingAlpha = false;
            draggingPicker = false;
            return;
        }
        if (draggingPicker) {
            float targetX = mouseX - pickerDragOffsetX;
            float targetY = mouseY - pickerDragOffsetY;
            pickerX = clamp(targetX, 8f, lastScreenW - pickerW - 8f);
            pickerY = clamp(targetY, 8f, lastScreenH - pickerH - 8f);
            manualPickerPosition = true;
            updatePickerLayout(lastScreenW, lastScreenH, false);
        } else if (draggingSv) {
            updateSv(mouseX, mouseY);
        } else if (draggingHue) {
            updateHue(mouseX);
        } else if (draggingAlpha) {
            updateAlpha(mouseX);
        }
    }

    private void updateSv(double mouseX, double mouseY) {
        if (activeEntry == null) {
            return;
        }
        float sx = clamp01((float) ((mouseX - svX) / SV_SIZE));
        float sy = clamp01((float) ((mouseY - svY) / SV_SIZE));
        activeEntry.saturation = sx;
        activeEntry.value = 1f - sy;
        activeEntry.applyFromHSB();
        dirty = true;
        ThemeConfig.markDirty();
    }

    private void updateHue(double mouseX) {
        if (activeEntry == null) {
            return;
        }
        float relativeX = (float) (mouseX - hueX);
        float hx = clamp01(relativeX / hueW);
        activeEntry.hue = hx;
        activeEntry.applyFromHSB();
        dirty = true;
        ThemeConfig.markDirty();
    }

    private void updateAlpha(double mouseX) {
        if (activeEntry == null) {
            return;
        }
        float relativeX = (float) (mouseX - alphaX);
        float value = clamp01(relativeX / alphaW);
        activeEntry.alpha = value;
        activeEntry.applyFromHSB();
        dirty = true;
        ThemeConfig.markDirty();
    }

    private void copyRgbToClipboard() {
        if (activeEntry == null) {
            return;
        }
        syncRgbInputFromActive();
        MinecraftClient client = MinecraftClient.getInstance();
        if (client != null) {
            client.keyboard.setClipboard(rgbInputText);
        }
    }

    private void pasteRgbFromClipboard() {
        String text = readClipboardText();
        if (activeEntry == null) {
            return;
        }
        rgbInputText = text;
        rgbCursorPos = rgbInputText.length();
        applyRgbInputText();
    }

    private void syncRgbInputFromActive() {
        if (activeEntry == null) {
            return;
        }
        rgbInputText = formatRgb(activeEntry.getColor());
        rgbCursorPos = Math.max(0, Math.min(rgbCursorPos, rgbInputText.length()));
    }

    private void applyRgbInputText() {
        if (activeEntry == null) {
            return;
        }
        int rgb = parseRgb(rgbInputText);
        if (rgb == -1) {
            syncRgbInputFromActive();
            return;
        }
        activeEntry.setRgb(rgb);
        rgbInputText = formatRgb(activeEntry.getColor());
        rgbCursorPos = Math.max(0, Math.min(rgbCursorPos, rgbInputText.length()));
        dirty = true;
        ThemeConfig.markDirty();
    }

    private static boolean isAllowedRgbChar(char c) {
        return (c >= '0' && c <= '9')
                || c == ','
                || c == ' '
                || c == '#'
                || c == 'x'
                || c == 'X'
                || (c >= 'a' && c <= 'f')
                || (c >= 'A' && c <= 'F');
    }

    private static boolean isControlDown() {
        MinecraftClient client = MinecraftClient.getInstance();
        if (client == null) {
            return false;
        }
        long handle = client.getWindow().getHandle();
        return GLFW.glfwGetKey(handle, GLFW.GLFW_KEY_LEFT_CONTROL) == GLFW.GLFW_PRESS
                || GLFW.glfwGetKey(handle, GLFW.GLFW_KEY_RIGHT_CONTROL) == GLFW.GLFW_PRESS;
    }

    public boolean keyPressed(int keyCode) {
        if (!pickerOpen || !rgbInputFocused) {
            if (renameInputFocused) {
                return handleRenameKeyPress(keyCode);
            }
            return false;
        }

        switch (keyCode) {
            case GLFW.GLFW_KEY_LEFT -> {
                if (rgbCursorPos > 0) {
                    rgbCursorPos--;
                }
                return true;
            }
            case GLFW.GLFW_KEY_RIGHT -> {
                if (rgbCursorPos < rgbInputText.length()) {
                    rgbCursorPos++;
                }
                return true;
            }
            case GLFW.GLFW_KEY_HOME -> {
                rgbCursorPos = 0;
                return true;
            }
            case GLFW.GLFW_KEY_END -> {
                rgbCursorPos = rgbInputText.length();
                return true;
            }
            case GLFW.GLFW_KEY_BACKSPACE -> {
                if (rgbCursorPos > 0 && !rgbInputText.isEmpty()) {
                    rgbInputText = rgbInputText.substring(0, rgbCursorPos - 1) + rgbInputText.substring(rgbCursorPos);
                    rgbCursorPos--;
                }
                return true;
            }
            case GLFW.GLFW_KEY_DELETE -> {
                if (rgbCursorPos < rgbInputText.length() && !rgbInputText.isEmpty()) {
                    rgbInputText = rgbInputText.substring(0, rgbCursorPos) + rgbInputText.substring(rgbCursorPos + 1);
                }
                return true;
            }
            case GLFW.GLFW_KEY_ENTER, GLFW.GLFW_KEY_KP_ENTER -> {
                applyRgbInputText();
                rgbInputFocused = false;
                return true;
            }
            case GLFW.GLFW_KEY_ESCAPE -> {
                rgbInputFocused = false;
                return true;
            }
            case GLFW.GLFW_KEY_V -> {
                if (isControlDown()) {
                    pasteRgbFromClipboard();
                    return true;
                }
                return false;
            }
            default -> {
                return false;
            }
        }
    }

    private boolean handleRenameKeyPress(int keyCode) {
        switch (keyCode) {
            case GLFW.GLFW_KEY_LEFT -> {
                if (renameCursorPos > 0) {
                    renameCursorPos--;
                }
                return true;
            }
            case GLFW.GLFW_KEY_RIGHT -> {
                if (renameCursorPos < renameInputText.length()) {
                    renameCursorPos++;
                }
                return true;
            }
            case GLFW.GLFW_KEY_HOME -> {
                renameCursorPos = 0;
                return true;
            }
            case GLFW.GLFW_KEY_END -> {
                renameCursorPos = renameInputText.length();
                return true;
            }
            case GLFW.GLFW_KEY_BACKSPACE -> {
                if (renameCursorPos > 0 && !renameInputText.isEmpty()) {
                    renameInputText = renameInputText.substring(0, renameCursorPos - 1) + renameInputText.substring(renameCursorPos);
                    renameCursorPos--;
                }
                return true;
            }
            case GLFW.GLFW_KEY_DELETE -> {
                if (renameCursorPos < renameInputText.length() && !renameInputText.isEmpty()) {
                    renameInputText = renameInputText.substring(0, renameCursorPos) + renameInputText.substring(renameCursorPos + 1);
                }
                return true;
            }
            case GLFW.GLFW_KEY_ENTER, GLFW.GLFW_KEY_KP_ENTER -> {
                applyThemeRename();
                return true;
            }
            case GLFW.GLFW_KEY_ESCAPE -> {
                renameInputFocused = false;
                return true;
            }
            case GLFW.GLFW_KEY_V -> {
                if (isControlDown()) {
                    String clipboard = readClipboardText();
                    if (!clipboard.isEmpty()) {
                        renameInputText = renameInputText.substring(0, renameCursorPos) + clipboard + renameInputText.substring(renameCursorPos);
                        renameCursorPos += clipboard.length();
                    }
                    return true;
                }
                return false;
            }
            default -> {
                return false;
            }
        }
    }

    public boolean charTyped(char codePoint) {
        if (!pickerOpen || !rgbInputFocused) {
            if (renameInputFocused) {
                return handleRenameCharTyped(codePoint);
            }
            return false;
        }
        if (!isAllowedRgbChar(codePoint)) {
            return false;
        }

        rgbCursorPos = Math.max(0, Math.min(rgbCursorPos, rgbInputText.length()));
        rgbInputText = rgbInputText.substring(0, rgbCursorPos) + codePoint + rgbInputText.substring(rgbCursorPos);
        rgbCursorPos++;
        return true;
    }

    private boolean handleRenameCharTyped(char codePoint) {
        if (codePoint < ' ' || Character.isISOControl(codePoint)) {
            return false;
        }
        renameCursorPos = Math.max(0, Math.min(renameCursorPos, renameInputText.length()));
        renameInputText = renameInputText.substring(0, renameCursorPos) + codePoint + renameInputText.substring(renameCursorPos);
        renameCursorPos++;
        return true;
    }

    private static String readClipboardText() {
        MinecraftClient client = MinecraftClient.getInstance();
        if (client == null) {
            return "";
        }
        String value = client.keyboard.getClipboard();
        return value == null ? "" : value.trim();
    }

    private static String formatRgb(int argb) {
        Color color = new Color(argb, true);
        return color.getRed() + ", " + color.getGreen() + ", " + color.getBlue();
    }

    private static int parseRgb(String text) {
        if (text == null) {
            return -1;
        }
        String t = text.trim();
        if (t.isEmpty()) {
            return -1;
        }
        if (t.startsWith("#")) {
            t = t.substring(1).trim();
            if (t.length() == 6 || t.length() == 8) {
                try {
                    int value = (int) Long.parseLong(t, 16);
                    if (t.length() == 8) {
                        value = value & 0xFFFFFF;
                    }
                    return value & 0xFFFFFF;
                } catch (NumberFormatException ignored) {
                    return -1;
                }
            }
        }
        if (t.startsWith("0x") || t.startsWith("0X")) {
            String hex = t.substring(2);
            try {
                int value = (int) Long.parseLong(hex, 16);
                return value & 0xFFFFFF;
            } catch (NumberFormatException ignored) {
                return -1;
            }
        }

        String[] parts = t.split("[^0-9]+");
        int[] vals = new int[3];
        int count = 0;
        for (String part : parts) {
            if (part.isEmpty()) {
                continue;
            }
            if (count >= 3) {
                break;
            }
            try {
                vals[count++] = Integer.parseInt(part);
            } catch (NumberFormatException ignored) {
                return -1;
            }
        }
        if (count < 3) {
            return -1;
        }
        int r = clamp255(vals[0]);
        int g = clamp255(vals[1]);
        int b = clamp255(vals[2]);
        return (r << 16) | (g << 8) | b;
    }

    private static int clamp255(int value) {
        return Math.max(0, Math.min(255, value));
    }

    private static float clamp01(float value) {
        return Math.max(0f, Math.min(1f, value));
    }

    private static float centeredTextY(float y, float height, float textSize) {
        if (FontRegistry.SF_MEDIUM == null) {
            return y + height * 0.5f;
        }
        float offset = FontRegistry.centeredBaselineOffset(FontRegistry.SF_MEDIUM, 'H', textSize);
        return y + height * 0.5f + offset;
    }

    private static float buttonTextY(float y, float height, float textSize) {
        if (FontRegistry.SF_MEDIUM == null) {
            return y + height * 0.5f;
        }
        float offset = FontRegistry.centeredBaselineOffset(FontRegistry.SF_MEDIUM, 'H', textSize);
        return y + height * 0.5f + offset;
    }

    private void ensureEntryHoverCapacity() {
        while (entryHover.size() < entries.size()) {
            entryHover.add(0f);
        }
        while (entryHover.size() > entries.size()) {
            entryHover.remove(entryHover.size() - 1);
        }
    }

    private float updateAnimTime() {
        long now = System.currentTimeMillis();
        float dt = (now - lastAnimTime) / 1000f;
        lastAnimTime = now;
        if (!Float.isFinite(dt) || dt < 0f) {
            return 0f;
        }
        return Math.min(dt, 0.05f);
    }

    private static float approach(float value, float target, float speed, float dt) {
        float t = MathUtil.clamp(dt * speed, 0f, 1f);
        return value + (target - value) * t;
    }

    private static int applyAlpha(int argb, float alpha) {
        int a = (argb >>> 24) & 0xFF;
        int r = (argb >>> 16) & 0xFF;
        int g = (argb >>> 8) & 0xFF;
        int b = argb & 0xFF;
        int na = Math.round(a * alpha);
        return (na << 24) | (r << 16) | (g << 8) | b;
    }

    private static final class ThemeEntry {
        private final String label;
        private final IntSupplier getter;
        private final IntConsumer setter;
        private float hue;
        private float saturation;
        private float value;
        private float alpha;

        private ThemeEntry(String label, IntSupplier getter, IntConsumer setter) {
            this.label = label;
            this.getter = getter;
            this.setter = setter;
            syncFromColor();
        }

        private int getColor() {
            return getter.getAsInt();
        }

        private void setRgb(int rgb) {
            int alphaByte = Math.round(clamp01(alpha) * 255f);
            setter.accept((alphaByte << 24) | (rgb & 0xFFFFFF));
            syncFromColor();
        }

        private void applyFromHSB() {
            int rgb = Color.HSBtoRGB(clamp01(hue), clamp01(saturation), clamp01(value));
            int alphaByte = Math.round(clamp01(alpha) * 255f);
            setter.accept((alphaByte << 24) | (rgb & 0xFFFFFF));
        }

        private void syncFromColor() {
            Color color = new Color(getColor(), true);
            float[] hsb = Color.RGBtoHSB(color.getRed(), color.getGreen(), color.getBlue(), null);
            this.hue = hsb[0];
            this.saturation = hsb[1];
            this.value = hsb[2];
            this.alpha = color.getAlpha() / 255f;
        }
    }

    private static final class ThemeSlot {
        private final ThemeConfig.Theme theme;
        private final float x;
        private final float y;

        private ThemeSlot(ThemeConfig.Theme theme, float x, float y) {
            this.theme = theme;
            this.x = x;
            this.y = y;
        }
    }
}
