package fun.nexisdlc.ui.gui.elements;

import fun.nexisdlc.client.utils.math.MathUtil;
import fun.nexisdlc.client.utils.render.CursorHelper;
import fun.nexisdlc.client.utils.render.animations.impl.SimpleLinearAnimation;
import fun.nexisdlc.client.utils.render.color.basic.ColorUtils;
import fun.nexisdlc.client.utils.render.main.core.Renderer2D;
import fun.nexisdlc.client.utils.render.main.text.FontRegistry;
import fun.nexisdlc.modules.api.settings.impl.ColorSetting;
import net.minecraft.client.MinecraftClient;
import org.lwjgl.glfw.GLFW;

import java.awt.Color;
import java.util.ArrayList;
import java.util.List;

public class ColorComp extends SettingComponent<ColorSetting> {
    private static final float PICKER_W = 152f;
    private static final float SV_SIZE = 126f;
    private static final float HUE_W = 12f;
    private static final float SPACING = 8f;
    private static final float PADDING = 10f;
    private static final float RGB_GAP = 8f;
    private static final float RGB_HEIGHT = 18f;
    private static final float BUTTON_GAP = 6f;
    private static final float BUTTON_W = 30f;

    public boolean open = false;
    private static final List<ColorComp> openPickers = new ArrayList<>();

    public static boolean isAnyPickerOpen() {
        return !openPickers.isEmpty();
    }

    public boolean isOpen() {
        return open;
    }

    public void close() {
        open = false;
        rgbInputFocused = false;
        unregisterOpen(this);
    }

    private static void registerOpen(ColorComp comp) {
        if (!openPickers.contains(comp)) {
            openPickers.add(comp);
        }
    }

    private static void unregisterOpen(ColorComp comp) {
        openPickers.remove(comp);
    }

    private final SimpleLinearAnimation openAnimation = new SimpleLinearAnimation(250);
    private boolean draggingSv = false;
    private boolean draggingHue = false;

    private boolean rgbInputFocused = false;
    private String rgbInputText = "";
    private int rgbCursor = 0;

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

    public ColorComp(ColorSetting s, float w) {
        super(s, w, 24f);
    }

    @Override
    public void draw(Renderer2D render, float x, float y, int mouseX, int mouseY, int alpha) {
        int a = alpha;
        float rowX = x + 14f;
        float rowY = y + 2f;
        float rowW = width - 28f;
        float rowH = height - 4f;

        if (MathUtil.isHovered(mouseX, mouseY, rowX, rowY, rowW, rowH)) {
            hoverAnimation.show();
        } else {
            hoverAnimation.hide();
        }

        float previewX = rowX + rowW - 28f;
        float previewY = rowY + (rowH - 12f) * 0.5f;
        if (MathUtil.isHovered(mouseX, mouseY, previewX + 8, previewY, 20f, 12f)) {
            CursorHelper.setHand();
        }
        float baseline = centeredTextBaseline(rowY, rowH, 13f);
        float availableWidth = Math.max(20f, previewX - (rowX - 4) - MARQUEE_VALUE_GAP);
        String settingName = setting.getName();

        drawAnimatedSettingText(render, rowX - 4, baseline, availableWidth, 13f, settingName,
                new Color(230, 230, 235, a).getRGB());

        render.rect(previewX + 8, previewY, 20f, 12f, 3f, applyAlpha(setting.get(), a / 255f));
        render.rectOutline(previewX + 8, previewY, 20f, 12f, 3f, applyAlpha(0xFFFFFF, (a / 255f) * 0.5f), 1f);

        if (open) {
            handleDragging(mouseX, mouseY, x, y);
        }
    }

    @Override
    public void drawOverlay(Renderer2D render, float x, float y, int mouseX, int mouseY, int alpha) {
        if (open) {
            openAnimation.show();
        } else {
            openAnimation.hide();
        }

        float progress = openAnimation.getProgress() * (alpha / 255f);
        if (progress <= 0.001f) {
            return;
        }

        if (!rgbInputFocused) {
            syncRgbInputFromSetting();
        }

        int a = (int) (155 * progress);
        float pickerX = x + width - PICKER_W - 14f;
        float pickerY = y + height + 2f - (6f * (1f - openAnimation.getProgress()));

        float contentW = SV_SIZE + SPACING + HUE_W;
        float fullH = PADDING * 2f + SV_SIZE + RGB_GAP + RGB_HEIGHT + 8f;

        render.blur(pickerX, pickerY, PICKER_W + 14f, fullH, 10f, progress);
        render.rect(pickerX, pickerY, PICKER_W + 14f, fullH, 10f, applyAlpha(ColorUtils.rgb(0, 0, 0), progress * 0.75f));

        float svX = pickerX + PADDING;
        float svY = pickerY + PADDING;
        int currentHueRGB = Color.HSBtoRGB(setting.getHue(), 1f, 1f);

        render.gradient(svX, svY, SV_SIZE, SV_SIZE, 4f,
                applyAlpha(0xFFFFFFFF, progress), applyAlpha(currentHueRGB, progress),
                applyAlpha(currentHueRGB, progress), applyAlpha(0xFFFFFFFF, progress));
        render.gradient(svX, svY, SV_SIZE, SV_SIZE, 4f,
                applyAlpha(0x00000000, 0f), applyAlpha(0x00000000, 0f),
                applyAlpha(0xFF000000, progress), applyAlpha(0xFF000000, progress));

        float markerX = svX + (setting.getSaturation() * SV_SIZE);
        float markerY = svY + ((1f - setting.getValue()) * SV_SIZE);
        render.rectOutline(markerX - 3.5f, markerY - 3.5f, 7f, 7f, 3.5f,
                applyAlpha(ColorUtils.rgb(255, 255, 255), progress * 0.5f), 1.5f);
        render.rectOutline(markerX - 3f, markerY - 3f, 6f, 6f, 3f,
                applyAlpha(ColorUtils.rgb(255, 255, 255), progress), 1f);

        float hueX = svX + SV_SIZE + SPACING;
        int[] hueStops = {0xFFFF0000, 0xFFFFFF00, 0xFF00FF00, 0xFF00FFFF, 0xFF0000FF, 0xFFFF00FF, 0xFFFF0000};
        for (int i = 0; i < 6; i++) {
            float segmentY = svY + (i * SV_SIZE / 6f);
            float segmentNextY = svY + ((i + 1) * SV_SIZE / 6f);
            float segmentH = (segmentNextY - segmentY) + 1.5f;
            float rTop = (i == 0) ? 5f : 0f;
            float rBottom = (i == 5) ? 5f : 0f;

            render.gradient(hueX, segmentY, HUE_W, segmentH, rTop, rTop, rBottom, rBottom,
                    applyAlpha(hueStops[i], progress), applyAlpha(hueStops[i], progress),
                    applyAlpha(hueStops[i + 1], progress), applyAlpha(hueStops[i + 1], progress));
        }

        float hueMarkerY = svY + (setting.getHue() * SV_SIZE);
        render.rect(hueX, hueMarkerY - 1f, HUE_W, 4f, 0f, applyAlpha(ColorUtils.rgb(255, 255, 255), progress));

        rgbX = svX;
        rgbY = svY + SV_SIZE + RGB_GAP;
        rgbW = contentW - (BUTTON_W * 2f + BUTTON_GAP * 2f);
        rgbH = RGB_HEIGHT;

        copyX = rgbX + rgbW + BUTTON_GAP;
        copyY = rgbY;
        copyW = BUTTON_W;
        copyH = RGB_HEIGHT;

        pasteX = copyX + copyW + BUTTON_GAP;
        pasteY = rgbY;
        pasteW = BUTTON_W;
        pasteH = RGB_HEIGHT;

        render.rect(rgbX, rgbY, rgbW, rgbH, 6f, new Color(16, 12, 26, (int) (a * 0.85f)).getRGB());
        render.rectOutline(rgbX, rgbY, rgbW, rgbH, 6f, applyAlpha(0x82000000, progress), 1f);
        render.text(FontRegistry.SF_MEDIUM, rgbX + 6f, centeredTextBaseline(rgbY, rgbH, 12f), 12f, rgbInputText,
                new Color(210, 210, 220, (int) (255 * progress)).getRGB());

        if (rgbInputFocused) {
            float blink = (float) ((Math.sin(System.currentTimeMillis() / 140.0) + 1.0) * 0.5);
            int cursorColor = applyAlpha(0xFFFFFFFF, progress * (0.25f + 0.75f * blink));
            String left = rgbCursor <= 0 ? "" : rgbInputText.substring(0, Math.min(rgbCursor, rgbInputText.length()));
            float cursorOffset = textWidth(left, 12f);
            float cx = rgbX + 6f + cursorOffset;
            render.rect(cx, rgbY + 3f, 1.5f, rgbH - 6f, 0.75f, cursorColor);
        }

        drawSmallButton(render, copyX, copyY, copyW, copyH, "Коп.", progress, mouseX, mouseY);
        drawSmallButton(render, pasteX, pasteY, pasteW, pasteH, "Вст.", progress, mouseX, mouseY);

        if (MathUtil.isHovered(mouseX, mouseY, svX, svY, SV_SIZE, SV_SIZE)
                || MathUtil.isHovered(mouseX, mouseY, hueX, svY, HUE_W, SV_SIZE)) {
            CursorHelper.setHand();
        } else if (MathUtil.isHovered(mouseX, mouseY, rgbX, rgbY, rgbW, rgbH)) {
            CursorHelper.setIBeam();
        } else if (MathUtil.isHovered(mouseX, mouseY, copyX, copyY, copyW, copyH)
                || MathUtil.isHovered(mouseX, mouseY, pasteX, pasteY, pasteW, pasteH)) {
            CursorHelper.setHand();
        }
    }

    @Override
    public void mouseClicked(double mx, double my, int button, float x, float y) {
        float rowX = x + 14f;
        float rowY = y + 2f;
        float rowW = width - 28f;
        float rowH = 20f;
        float previewX = rowX + rowW - 28f;
        float previewY = rowY + (rowH - 12f) * 0.5f;
        if (button == 1 && MathUtil.isHovered(mx, my, previewX + 8, previewY, 20f, 12f)) {
            open = !open;
            if (open) {
                registerOpen(this);
            } else {
                unregisterOpen(this);
                rgbInputFocused = false;
            }
        }
    }

    @Override
    public boolean mouseClickedOverlay(double mx, double my, int button, float x, float y) {
        if (openAnimation.getProgress() <= 0.001f) {
            return false;
        }

        float pickerX = x + width - PICKER_W - 14f;
        float pickerY = y + height + 2f - (6f * (1f - openAnimation.getProgress()));
        float pickerW = PICKER_W + 14f;
        float pickerH = PADDING * 2f + SV_SIZE + RGB_GAP + RGB_HEIGHT + 8f;

        float svX = pickerX + PADDING;
        float svY = pickerY + PADDING;

        if (button == 0) {
            if (MathUtil.isHovered(mx, my, svX, svY, SV_SIZE, SV_SIZE)) {
                draggingSv = true;
                draggingHue = false;
                rgbInputFocused = false;
                return true;
            }
            if (MathUtil.isHovered(mx, my, svX + SV_SIZE + SPACING, svY, HUE_W, SV_SIZE)) {
                draggingHue = true;
                draggingSv = false;
                rgbInputFocused = false;
                return true;
            }
            if (MathUtil.isHovered(mx, my, rgbX, rgbY, rgbW, rgbH)) {
                rgbInputFocused = true;
                syncRgbInputFromSetting();
                rgbCursor = rgbInputText.length();
                return true;
            }
            if (MathUtil.isHovered(mx, my, copyX, copyY, copyW, copyH)) {
                copyRgbToClipboard();
                rgbInputFocused = false;
                return true;
            }
            if (MathUtil.isHovered(mx, my, pasteX, pasteY, pasteW, pasteH)) {
                pasteRgbFromClipboard();
                rgbInputFocused = false;
                return true;
            }
        }

        if (!MathUtil.isHovered(mx, my, pickerX, pickerY, pickerW, pickerH)) {
            close();
        }
        return true;
    }

    @Override
    public void keyPressed(int key) {
        if (!rgbInputFocused) {
            return;
        }

        switch (key) {
            case GLFW.GLFW_KEY_LEFT -> {
                if (rgbCursor > 0) {
                    rgbCursor--;
                }
            }
            case GLFW.GLFW_KEY_RIGHT -> {
                if (rgbCursor < rgbInputText.length()) {
                    rgbCursor++;
                }
            }
            case GLFW.GLFW_KEY_BACKSPACE -> {
                if (rgbCursor > 0 && !rgbInputText.isEmpty()) {
                    rgbInputText = rgbInputText.substring(0, rgbCursor - 1) + rgbInputText.substring(rgbCursor);
                    rgbCursor--;
                }
            }
            case GLFW.GLFW_KEY_DELETE -> {
                if (rgbCursor < rgbInputText.length() && !rgbInputText.isEmpty()) {
                    rgbInputText = rgbInputText.substring(0, rgbCursor) + rgbInputText.substring(rgbCursor + 1);
                }
            }
            case GLFW.GLFW_KEY_HOME -> rgbCursor = 0;
            case GLFW.GLFW_KEY_END -> rgbCursor = rgbInputText.length();
            case GLFW.GLFW_KEY_ENTER, GLFW.GLFW_KEY_KP_ENTER -> {
                applyRgbInput();
                rgbInputFocused = false;
            }
            case GLFW.GLFW_KEY_ESCAPE -> rgbInputFocused = false;
            case GLFW.GLFW_KEY_V -> {
                if (isCtrlPressed()) {
                    pasteRgbFromClipboard();
                }
            }
            default -> {
            }
        }
    }

    @Override
    public void charTyped(char c) {
        if (!rgbInputFocused) {
            return;
        }
        if (!isAllowedRgbChar(c)) {
            return;
        }
        rgbInputText = rgbInputText.substring(0, rgbCursor) + c + rgbInputText.substring(rgbCursor);
        rgbCursor++;
    }

    private void handleDragging(int mouseX, int mouseY, float x, float y) {
        if (GLFW.glfwGetMouseButton(GLFW.glfwGetCurrentContext(), 0) == 0) {
            draggingSv = false;
            draggingHue = false;
            return;
        }
        float pickerX = x + width - PICKER_W - 14f;
        float pickerY = y + height + 2f - (6f * (1f - openAnimation.getProgress()));
        float svX = pickerX + PADDING;
        float svY = pickerY + PADDING;
        float hueY = svY;

        if (draggingSv) {
            setting.setSaturation(MathUtil.clamp((float) ((mouseX - svX) / SV_SIZE), 0f, 1f));
            setting.setValue(1f - MathUtil.clamp((float) ((mouseY - svY) / SV_SIZE), 0f, 1f));
        } else if (draggingHue) {
            setting.setHue(MathUtil.clamp((float) ((mouseY - hueY) / SV_SIZE), 0f, 1f));
        }
    }

    private void drawSmallButton(Renderer2D render, float x, float y, float w, float h, String label, float alphaFactor, int mouseX, int mouseY) {
        boolean hovered = MathUtil.isHovered(mouseX, mouseY, x, y, w, h);
        int fill = new Color(36 + (hovered ? 18 : 0), 30 + (hovered ? 15 : 0), 44 + (hovered ? 16 : 0),
                (int) (255 * alphaFactor)).getRGB();
        render.rect(x, y, w, h, 6f, fill);
        float textW = render.measureText(FontRegistry.SF_MEDIUM, label, 12f).width;
        float textX = x + Math.max(2f, (w - textW) * 0.5f);
        render.text(FontRegistry.SF_MEDIUM, textX, centeredTextBaseline(y, h, 12f), 12f, label, applyAlpha(0xFFE0E0EA, alphaFactor));
    }

    private void syncRgbInputFromSetting() {
        int rgb = setting.get() & 0xFFFFFF;
        int r = (rgb >> 16) & 0xFF;
        int g = (rgb >> 8) & 0xFF;
        int b = rgb & 0xFF;
        rgbInputText = r + ", " + g + ", " + b;
        rgbCursor = Math.min(rgbCursor, rgbInputText.length());
    }

    private void copyRgbToClipboard() {
        MinecraftClient client = MinecraftClient.getInstance();
        if (client == null) {
            return;
        }
        syncRgbInputFromSetting();
        client.keyboard.setClipboard(rgbInputText);
    }

    private void pasteRgbFromClipboard() {
        MinecraftClient client = MinecraftClient.getInstance();
        if (client == null) {
            return;
        }
        String text = client.keyboard.getClipboard();
        if (text == null) {
            return;
        }
        rgbInputText = text.trim();
        rgbCursor = rgbInputText.length();
        applyRgbInput();
    }

    private void applyRgbInput() {
        int rgb = parseRgb(rgbInputText);
        if (rgb < 0) {
            syncRgbInputFromSetting();
            return;
        }
        int alphaByte = (setting.get() >>> 24) & 0xFF;
        setting.set((alphaByte << 24) | (rgb & 0xFFFFFF));
        setting.updateHSB();
        syncRgbInputFromSetting();
    }

    private static int parseRgb(String text) {
        if (text == null) {
            return -1;
        }
        String value = text.trim();
        if (value.isEmpty()) {
            return -1;
        }

        if (value.startsWith("#")) {
            value = value.substring(1).trim();
            if (value.length() == 6 || value.length() == 8) {
                try {
                    int parsed = (int) Long.parseLong(value, 16);
                    if (value.length() == 8) {
                        parsed = parsed & 0xFFFFFF;
                    }
                    return parsed & 0xFFFFFF;
                } catch (NumberFormatException ignored) {
                    return -1;
                }
            }
        }

        if (value.startsWith("0x") || value.startsWith("0X")) {
            String hex = value.substring(2);
            try {
                return ((int) Long.parseLong(hex, 16)) & 0xFFFFFF;
            } catch (NumberFormatException ignored) {
                return -1;
            }
        }

        String[] parts = value.split("[^0-9]+");
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

    private static boolean isAllowedRgbChar(char c) {
        return Character.isDigit(c)
                || c == ','
                || c == ' '
                || c == '#'
                || c == 'x' || c == 'X'
                || (c >= 'a' && c <= 'f')
                || (c >= 'A' && c <= 'F');
    }

    private boolean isCtrlPressed() {
        long handle = MinecraftClient.getInstance().getWindow().getHandle();
        return GLFW.glfwGetKey(handle, GLFW.GLFW_KEY_LEFT_CONTROL) == GLFW.GLFW_PRESS
                || GLFW.glfwGetKey(handle, GLFW.GLFW_KEY_RIGHT_CONTROL) == GLFW.GLFW_PRESS;
    }

    private int applyAlpha(int argb, float alpha) {
        int a = (int) (((argb >> 24) & 0xFF) * alpha);
        return (a << 24) | (argb & 0x00FFFFFF);
    }
}
