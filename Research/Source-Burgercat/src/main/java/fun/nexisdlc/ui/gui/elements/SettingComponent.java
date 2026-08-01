package fun.nexisdlc.ui.gui.elements;

import fun.nexisdlc.client.ClientColors;
import fun.nexisdlc.client.utils.math.MathUtil;
import fun.nexisdlc.client.utils.player.PlayerUtils;
import fun.nexisdlc.client.utils.render.CursorHelper;
import fun.nexisdlc.client.utils.render.animations.impl.SimpleLinearAnimation;
import fun.nexisdlc.client.utils.render.color.ColorUtils;
import fun.nexisdlc.client.utils.render.main.core.Renderer2D;
import fun.nexisdlc.client.utils.render.main.text.FontRegistry;
import fun.nexisdlc.modules.api.settings.api.Setting;
import fun.nexisdlc.modules.api.settings.impl.*;
import net.minecraft.client.MinecraftClient;
import org.lwjgl.glfw.GLFW;

import java.util.ArrayList;
import java.util.List;

public abstract class SettingComponent<T extends Setting<?>> {
    protected final T setting;
    protected float width;
    protected float height;
    protected final SimpleLinearAnimation hoverAnimation = new SimpleLinearAnimation(150);
    private float textOffsetX = 0f;

    public static BooleanComp listeningBooleanComp = null;

    protected static final long MARQUEE_PAUSE_MS = 3000L;
    protected static final float MARQUEE_SPEED_PX_PER_SEC = 28f;
    protected static final float MARQUEE_GAP = 24f;
    protected static final float MARQUEE_SIDE_PADDING = 2f;
    protected static final float MARQUEE_VALUE_GAP = 16f;
    protected static final float ROW_PAD_X = 4f;
    protected static final float CONTENT_PAD_X = 5f;

    protected SettingComponent(T setting, float width, float height) {
        this.setting = setting;
        this.width = width;
        this.height = height;
    }

    public static SettingComponent<?> create(Setting<?> setting, float width) {
        if (setting instanceof BooleanSetting s) return new BooleanComp(s, width);
        if (setting instanceof SliderSetting s) return new SliderComp(s, width);
        if (setting instanceof ModeSetting s) return new ModeComp(s, width);
        if (setting instanceof ModeListSetting s) return new ModeListComp(s, width);
        if (setting instanceof BindSetting s) return new BindComp(s, width);
        if (setting instanceof ButtonSetting s) return new ButtonComp(s, width);
        if (setting instanceof StringSetting s) return new StringComp(s, width);
        if (setting instanceof ColorSetting s) return new ColorComp(s, width);
        return new UnknownComp(setting, width);
    }

    public void setWidth(float width) {
        this.width = width;
    }

    public float getHeight() {
        return height;
    }

    public abstract void draw(Renderer2D render, float x, float y, int mouseX, int mouseY, int alpha);

    public abstract void mouseClicked(double mouseX, double mouseY, int button, float x, float y);

    public void drawOverlay(Renderer2D render, float x, float y, int mouseX, int mouseY, int alpha) {
    }

    public boolean mouseClickedOverlay(double mouseX, double mouseY, int button, float x, float y) {
        return false;
    }

    public void keyPressed(int key) {
    }

    public void charTyped(char c) {
    }

    public boolean mouseScrolled(double mouseX, double mouseY, float x, float y) {
        return false;
    }

    protected boolean hovered(double mx, double my, float x, float y, float w, float h) {
        return mx >= x && mx <= x + w && my >= y && my <= y + h;
    }

    protected float textWidth(String text, float size) {
        return text == null || text.isEmpty() ? 0f : FontRegistry.SF_MEDIUM.getWidth(text, size);
    }

    protected float centeredTextBaseline(float y, float boxHeight, float textSize) {
        return y + boxHeight * 0.5f + textSize * 0.36f;
    }

    protected void drawAnimatedSettingText(Renderer2D render, float textX, float baselineY, float availableWidth,
                                           float textSize, String text, int color) {
        float innerWidth = availableWidth - MARQUEE_SIDE_PADDING * 2f;
        if (text == null || text.isEmpty() || innerWidth <= 0f) return;

        float fullWidth = textWidth(text, textSize);
        textOffsetX = fullWidth <= innerWidth ? 0f : -getMarqueeOffset(fullWidth - innerWidth);

        float drawX = textX + MARQUEE_SIDE_PADDING;
        float clipY = baselineY - textSize - 4f;
        float clipH = textSize * 2f;
        render.pushClipRect((int) Math.floor(drawX), (int) Math.floor(clipY),
                (int) Math.ceil(innerWidth), (int) Math.ceil(clipH));
        render.text(FontRegistry.SF_MEDIUM, drawX + textOffsetX, baselineY, textSize, text, color);
        if (fullWidth > innerWidth && textOffsetX < -0.5f) {
            render.text(FontRegistry.SF_MEDIUM, drawX + textOffsetX + fullWidth + MARQUEE_GAP + MARQUEE_SIDE_PADDING,
                    baselineY, textSize, text, color);
        }
        render.popClipRect();
    }

    protected float getMarqueeOffset(float overflow) {
        float travel = overflow + MARQUEE_GAP;
        long animationMs = Math.max(1L, (long) ((travel / MARQUEE_SPEED_PX_PER_SEC) * 1000f));
        long cycle = MARQUEE_PAUSE_MS + animationMs + MARQUEE_PAUSE_MS + animationMs;
        long time = System.currentTimeMillis() % cycle;
        if (time < MARQUEE_PAUSE_MS) return 0f;
        time -= MARQUEE_PAUSE_MS;
        if (time < animationMs) return easeInOut(time / (float) animationMs) * travel;
        time -= animationMs;
        if (time < MARQUEE_PAUSE_MS) return travel;
        time -= MARQUEE_PAUSE_MS;
        return (1f - easeInOut(time / (float) animationMs)) * travel;
    }

    protected float easeInOut(float value) {
        float v = Math.max(0f, Math.min(1f, value));
        return v * v * (3f - 2f * v);
    }

    protected int alpha(int rgb, int alpha) {
        return ColorUtils.injectAlpha(rgb, Math.max(0, Math.min(255, alpha)));
    }

    protected int rgba(int r, int g, int b, int a) {
        return ColorUtils.rgba(r, g, b, Math.max(0, Math.min(255, a)));
    }

    protected int blend(int from, int to, float progress) {
        return ColorUtils.interpolate(from, to, Math.max(0f, Math.min(1f, progress)));
    }

    protected String truncate(String text, int max) {
        if (text == null) return "";
        return text.length() <= max ? text : text.substring(0, max) + "...";
    }

    public static final class BooleanComp extends SettingComponent<BooleanSetting> {
        private final SimpleLinearAnimation toggleAnimation = new SimpleLinearAnimation(180);
        private final SimpleLinearAnimation listenAnimation = new SimpleLinearAnimation(200);
        public final BooleanSetting setting;

        BooleanComp(BooleanSetting setting, float width) {
            super(setting, width, 24f);
            this.setting = setting;
        }

        @Override
        public void draw(Renderer2D render, float x, float y, int mouseX, int mouseY, int alpha) {
            float rowX = x + ROW_PAD_X;
            float rowY = y + 2f;
            float rowW = width - ROW_PAD_X * 2f;
            float rowH = height - 4f;
            if (hovered(mouseX, mouseY, rowX, rowY, rowW, rowH)) {
                hoverAnimation.show();
            } else {
                hoverAnimation.hide();
            }
            if (setting.get()) toggleAnimation.show();
            else toggleAnimation.hide();

            boolean listening = listeningBooleanComp == this;
            if (listening) listenAnimation.show();
            else listenAnimation.hide();

            float p = toggleAnimation.getProgress();
            int text = blend(rgba(155, 155, 165, alpha), rgba(230, 230, 235, alpha), p);

            boolean hasBind = setting.isBound();
            float rightAreaW = hasBind ? 0f : 34f;
            drawAnimatedSettingText(render, rowX + CONTENT_PAD_X, centeredTextBaseline(rowY, rowH, 13f),
                    rowW - (hasBind ? 60f : 58f), 13f, setting.getName(), text);

            String enabledLetter = "T";
            String disabledLetter = "x";

            if (hasBind || listening) {
                String keyText = listening ? "..." : PlayerUtils.getBindName(setting.getBind());
                float keySize = 12.5f;
                float keyTextW = textWidth(keyText, keySize) + 12f;
                float keyX = rowX + rowW - 8f - keyTextW;
                float keyY = rowY + (rowH - 16f) * 0.5f;
                if (hovered(mouseX, mouseY, keyX, keyY, keyTextW, 16f)) {
                    CursorHelper.setHand();
                }
                float listenP = listenAnimation.getProgress();
                int bg = blend(rgba(18, 20, 27, (int) (alpha * 0.65f)),
                        alpha(ClientColors.ICON.getRGB(), (int) (alpha * 0.28f)), listenP);
                render.rect(keyX, keyY, keyTextW, 16f, 4f, bg);
                int enabledColor = alpha(ClientColors.ICON.getRGB(), alpha);
                int disabledColor = rgba(155, 155, 165, alpha);
                int keyColor = listening
                        ? alpha(ClientColors.ICON.getRGB(), alpha)
                        : blend(disabledColor, enabledColor, p);
                render.text(FontRegistry.SF_MEDIUM, keyX + 6f,
                        centeredTextBaseline(keyY, 16f, keySize), keySize, keyText, keyColor);
            } else {
                float boxSize = 16f;
                float boxX = rowX + rowW - boxSize - 8f;
                float boxY = rowY + (rowH - boxSize) * 0.5f;
                if (hovered(mouseX, mouseY, boxX, boxY, boxSize, boxSize)) {
                    CursorHelper.setHand();
                }

                int boxBg = blend(rgba(40, 40, 48, (int) (alpha * 0.6f)),
                        alpha(ClientColors.ICON.getRGB(), (int) (alpha * 0.9f)), p);
                int boxBorder = blend(rgba(60, 60, 68, alpha),
                        alpha(ClientColors.ICON.getRGB(), (int) (alpha * 0.7f)), p);

                render.rect(boxX, boxY, boxSize, boxSize, 4f, boxBg);
                render.rectOutline(boxX, boxY, boxSize, boxSize, 4f, boxBorder, 1f);

                float symSize = 13f;
                float onW = textWidth(enabledLetter, symSize), offW = textWidth(disabledLetter, symSize);
                float posX = setting.get() ? boxX + (boxSize - onW) * 0.5f - 2.7f : boxX + (boxSize - offW) * 0.5f + 0.25f;
                float posY = centeredTextBaseline(boxY, boxSize, symSize) + (setting.get() ? 1.2f : -1f);

                render.text(setting.get() ? FontRegistry.WEXSIDE_MENU_ICONS : FontRegistry.SF_MEDIUM,
                        posX, posY, symSize, setting.get() ? enabledLetter : disabledLetter,
                        setting.get()
                                ? rgba(242, 242, 246, Math.round(alpha * p))
                                : rgba(155, 155, 165, Math.round(alpha * (1f - p))));
            }
        }

        @Override
        public void mouseClicked(double mx, double my, int button, float x, float y) {
            float rowX = x + ROW_PAD_X;
            float rowY = y + 2f;
            float rowW = width - ROW_PAD_X * 2f;
            float rowH = height - 4f;

            boolean hasBind = setting.isBound();
            boolean listening = listeningBooleanComp == this;

            if (hasBind || listening) {
                float keySize = 12.5f;
                String keyText = listening ? "..." : PlayerUtils.getBindName(setting.getBind());
                float keyTextW = textWidth(keyText, keySize) + 12f;
                float keyX = rowX + rowW - 8f - keyTextW;
                float keyY = rowY + (rowH - 16f) * 0.5f;
                if (!hovered(mx, my, keyX, keyY, keyTextW, 16f)) return;
            } else {
                float boxSize = 16f;
                float boxX = rowX + rowW - boxSize - 8f;
                float boxY = rowY + (rowH - boxSize) * 0.5f;
                if (!hovered(mx, my, boxX, boxY, boxSize, boxSize)) return;
            }

            if (button == GLFW.GLFW_MOUSE_BUTTON_LEFT) {
                if (listeningBooleanComp == this) {
                    listeningBooleanComp = null;
                } else {
                    setting.set(!setting.get());
                }
            } else if (button == GLFW.GLFW_MOUSE_BUTTON_RIGHT) {
                if (listeningBooleanComp == this) {
                    listeningBooleanComp = null;
                } else {
                    listeningBooleanComp = this;
                }
            } else if (button == GLFW.GLFW_MOUSE_BUTTON_MIDDLE) {
                setting.set(setting.getDefaultValue());
                if (listeningBooleanComp == this) listeningBooleanComp = null;
            }
        }

        @Override
        public void keyPressed(int key) {
            if (listeningBooleanComp != this) return;
            if (key == GLFW.GLFW_KEY_ESCAPE || key == GLFW.GLFW_KEY_DELETE) {
                setting.setBind(-1);
            } else if (key != GLFW.GLFW_KEY_LEFT_SHIFT && key != GLFW.GLFW_KEY_RIGHT_SHIFT
                    && key != GLFW.GLFW_KEY_LEFT_CONTROL && key != GLFW.GLFW_KEY_RIGHT_CONTROL
                    && key != GLFW.GLFW_KEY_LEFT_ALT && key != GLFW.GLFW_KEY_RIGHT_ALT) {
                setting.setBind(key);
            }
            listeningBooleanComp = null;
        }

        @Override
        public boolean mouseScrolled(double mouseX, double mouseY, float x, float y) {
            return false;
        }
    }

    private static final class SliderComp extends SettingComponent<SliderSetting> {
        private double visualPercent;
        private boolean dragging = false;

        SliderComp(SliderSetting setting, float width) {
            super(setting, width, 38f);
            visualPercent = percent();
        }

        @Override
        public void draw(Renderer2D render, float x, float y, int mouseX, int mouseY, int alpha) {
            float target = percent();
            visualPercent += (target - visualPercent) * 0.2;

            float rowX = x + ROW_PAD_X;
            float rowY = y + 3f;
            float rowW = width - ROW_PAD_X * 2f;
            float rowH = height - 6f;

            String value = String.format(java.util.Locale.US, "%.2f", setting.get());
            float valueW = textWidth(value, 11.5f);

            drawAnimatedSettingText(render, rowX + CONTENT_PAD_X, rowY + 13f, rowW - valueW - 18f, 12.5f,
                    setting.getName(), rgba(235, 235, 240, alpha));
            render.text(FontRegistry.SF_MEDIUM, rowX + rowW - valueW - 8f, rowY + 13f, 11.5f, value, rgba(170, 174, 188, alpha));

            float barX = rowX + CONTENT_PAD_X;
            float barW = rowW - CONTENT_PAD_X * 2f;
            float barY = rowY + rowH - 10f;

            if (hovered(mouseX, mouseY, barX, barY - 5f, barW, 16f)) {
                CursorHelper.setHResize();
                hoverAnimation.show();
            } else {
                hoverAnimation.hide();
            }

            if (dragging) {
                long handle = MinecraftClient.getInstance().getWindow().getHandle();
                if (GLFW.glfwGetMouseButton(handle, GLFW.GLFW_MOUSE_BUTTON_LEFT) != GLFW.GLFW_PRESS) {
                    dragging = false;
                } else {
                    setFromMouse(mouseX, barX, barW);
                }
            }

            render.rect(barX, barY, barW, 6f, 3f, rgba(40, 40, 48, (int) (alpha * 0.72f)));
            render.rect(barX, barY, barW * (float) visualPercent, 6f, 3f, alpha(ClientColors.ICON.getRGB(), (int) (alpha * 0.95f)));
            render.circle(barX + barW * (float) visualPercent, barY + 3f, 4f, 0, 1f, rgba(242, 242, 246, alpha));
        }

        @Override
        public void mouseClicked(double mx, double my, int button, float x, float y) {
            float rowX = x + ROW_PAD_X;
            float rowY = y + 3f;
            float rowW = width - ROW_PAD_X * 2f;
            float rowH = height - 6f;

            if (!hovered(mx, my, rowX, rowY, rowW, rowH)) return;

            if (button == GLFW.GLFW_MOUSE_BUTTON_LEFT) {
                float barX = x + ROW_PAD_X + CONTENT_PAD_X;
                float barY = y + height - 13f;
                float barW = width - (ROW_PAD_X + CONTENT_PAD_X) * 2f;
                if (hovered(mx, my, barX, barY - 5f, barW, 16f)) {
                    dragging = true;
                    setFromMouse(mx, barX, barW);
                }
            } else if (button == GLFW.GLFW_MOUSE_BUTTON_MIDDLE) {
                setting.set(setting.getDefaultValue());
            }
        }

        @Override
        public boolean mouseScrolled(double mouseX, double mouseY, float x, float y) {
            return false;
        }

        private float percent() {
            return Math.max(0f, Math.min(1f, (setting.get() - setting.min) / (setting.max - setting.min)));
        }

        private void setFromMouse(double mx, float barX, float barW) {
            float p = Math.max(0f, Math.min(1f, (float) ((mx - barX) / barW)));
            float value = setting.min + (setting.max - setting.min) * p;
            if (setting.increment > 0f) value = Math.round(value / setting.increment) * setting.increment;
            setting.set(value);
        }
    }

    private static final class ModeComp extends ChipSettingComponent<ModeSetting> {
        ModeComp(ModeSetting setting, float width) {
            super(setting, width);
        }

        @Override
        protected int count() {
            return setting.strings.length;
        }

        @Override
        protected String label(int index) {
            return setting.strings[index];
        }

        @Override
        protected boolean selected(int index) {
            return setting.strings[index].equalsIgnoreCase(setting.get());
        }

        @Override
        protected void click(int index) {
            setting.set(setting.strings[index]);
        }
    }

    private static final class ModeListComp extends ChipSettingComponent<ModeListSetting> {
        ModeListComp(ModeListSetting setting, float width) {
            super(setting, width);
        }

        @Override
        protected int count() {
            return setting.get().size();
        }

        @Override
        protected String label(int index) {
            return setting.get().get(index).getName();
        }

        @Override
        protected boolean selected(int index) {
            return setting.get().get(index).get();
        }

        @Override
        protected void click(int index) {
            BooleanSetting sub = setting.get().get(index);
            sub.set(!sub.get());
        }
    }

    private abstract static class ChipSettingComponent<T extends Setting<?>> extends SettingComponent<T> {
        private final List<SimpleLinearAnimation> selectionAnims = new ArrayList<>();
        private final List<SimpleLinearAnimation> hoverAnims = new ArrayList<>();
        private final List<Chip> chips = new ArrayList<>();

        ChipSettingComponent(T setting, float width) {
            super(setting, width, 44f);
        }

        protected abstract int count();

        protected abstract String label(int index);

        protected abstract boolean selected(int index);

        protected abstract void click(int index);

        @Override
        public void draw(Renderer2D render, float x, float y, int mouseX, int mouseY, int alpha) {
            layout(x, y);
            float rowX = x + ROW_PAD_X;
            float rowY = y + 4f;
            float rowW = width - ROW_PAD_X * 2f;
            drawAnimatedSettingText(render, rowX + CONTENT_PAD_X, rowY + 13f, rowW - CONTENT_PAD_X * 2f, 12.5f, setting.getName(), rgba(235, 235, 240, alpha));

            for (int i = 0; i < chips.size(); i++) {
                while (selectionAnims.size() <= i) selectionAnims.add(new SimpleLinearAnimation(450));
                while (hoverAnims.size() <= i) hoverAnims.add(new SimpleLinearAnimation(120));

                Chip chip = chips.get(i);
                SimpleLinearAnimation select = selectionAnims.get(i);
                SimpleLinearAnimation hover = hoverAnims.get(i);
                if (selected(i)) select.show();
                else select.hide();
                if (hovered(mouseX, mouseY, chip.x, chip.y, chip.w, chip.h)) {
                    CursorHelper.setHand();
                    hover.show();
                } else {
                    hover.hide();
                }

                int bg = blend(rgba(24, 26, 34, (int) (alpha * (0.72f + 0.08f * hover.getProgress()))),
                        alpha(ClientColors.ICON.getRGB(), (int) (alpha * 0.96f)), select.getProgress());
                int text = blend(rgba(132, 138, 156, alpha), rgba(230, 230, 240, alpha), select.getProgress());
                if (!selected(i)) render.rectOutline(chip.x, chip.y, chip.w, chip.h, 3.5f, rgba(40, 40, 40, alpha), 1f);
                render.rect(chip.x, chip.y, chip.w, chip.h, 3.5f, bg);
                String label = label(i);
                render.text(FontRegistry.SF_MEDIUM, chip.x + Math.max(2f, (chip.w - textWidth(label, 12f)) * 0.5f),
                        centeredTextBaseline(chip.y, chip.h, 12f), 12f, label, text);
            }
        }

        @Override
        public void mouseClicked(double mx, double my, int button, float x, float y) {
            if (button != GLFW.GLFW_MOUSE_BUTTON_LEFT) return;
            layout(x, y);
            for (int i = 0; i < chips.size(); i++) {
                Chip chip = chips.get(i);
                if (hovered(mx, my, chip.x, chip.y, chip.w, chip.h)) {
                    click(i);
                    return;
                }
            }
        }

        private void layout(float x, float y) {
            chips.clear();
            float rowX = x + ROW_PAD_X;
            float rowW = width - ROW_PAD_X * 2f;
            float chipX = rowX + CONTENT_PAD_X;
            float chipY = y + 4f + 12.5f + 7f;
            float right = rowX + rowW;
            for (int i = 0; i < count(); i++) {
                String value = label(i);
                float chipW = Math.max(28f, textWidth(value, 12f) + Math.max(3f, Math.min(8f, textWidth(value, 12f) * 0.17f)));
                chipW = Math.min(chipW, rowW - 8f);
                if (!chips.isEmpty() && chipX + chipW > right) {
                    chipX = rowX + CONTENT_PAD_X;
                    chipY += 20f;
                }
                chips.add(new Chip(chipX, chipY, chipW, 16f));
                chipX += chipW + 4f;
            }
            height = Math.max(44f, chipY + 16f - y + 4f);
        }
    }

    private static final class BindComp extends SettingComponent<BindSetting> {
        private boolean listening = false;
        private final SimpleLinearAnimation listenAnimation = new SimpleLinearAnimation(200);

        BindComp(BindSetting setting, float width) {
            super(setting, width, 24f);
        }

        @Override
        public void draw(Renderer2D render, float x, float y, int mouseX, int mouseY, int alpha) {
            if (listening) listenAnimation.show();
            else listenAnimation.hide();
            float rowX = x + ROW_PAD_X;
            float rowY = y + 3f;
            float rowW = width - ROW_PAD_X * 2f;
            float rowH = height - 6f;
            String keyText = listening ? "..." : PlayerUtils.getBindName(setting.get());
            float valueW = textWidth(keyText, 12.5f) + 12f;
            float valueX = rowX + rowW - 8f - valueW;
            if (hovered(mouseX, mouseY, valueX, rowY + (rowH - 16f) * 0.5f, valueW, 16f)) {
                CursorHelper.setHand();
            }
            drawAnimatedSettingText(render, rowX + CONTENT_PAD_X, centeredTextBaseline(rowY, rowH, 13.5f),
                    Math.max(10f, valueX - rowX - MARQUEE_VALUE_GAP), 13.5f, setting.getName(), rgba(242, 244, 248, alpha));
            int bg = blend(rgba(18, 20, 27, (int) (alpha * 0.65f)), alpha(ClientColors.ICON.getRGB(), (int) (alpha * 0.28f)), listenAnimation.getProgress());
            render.rect(valueX, rowY + (rowH - 16f) * 0.5f, valueW, 16f, 4f, bg);
            render.text(FontRegistry.SF_MEDIUM, valueX + 6f, centeredTextBaseline(rowY + (rowH - 16f) * 0.5f, 16f, 12.5f),
                    12.5f, keyText, rgba(220, 224, 235, alpha));
        }

        @Override
        public void mouseClicked(double mx, double my, int button, float x, float y) {
            float rowX = x + ROW_PAD_X;
            float rowY = y + 3f;
            float rowW = width - ROW_PAD_X * 2f;
            float rowH = height - 6f;
            String keyText = listening ? "..." : PlayerUtils.getBindName(setting.get());
            float valueW = textWidth(keyText, 12.5f) + 12f;
            float valueX = rowX + rowW - 8f - valueW;
            if (hovered(mx, my, valueX, rowY + (rowH - 16f) * 0.5f, valueW, 16f)) {
                if (button == GLFW.GLFW_MOUSE_BUTTON_LEFT) listening = !listening;
                else if (listening) {
                    setting.set(1000 + button);
                    listening = false;
                }
            }
        }

        @Override
        public void keyPressed(int key) {
            if (!listening) return;
            setting.set(key == GLFW.GLFW_KEY_ESCAPE || key == GLFW.GLFW_KEY_DELETE ? -1 : key);
            listening = false;
        }
    }

    private static final class ButtonComp extends SettingComponent<ButtonSetting> {
        ButtonComp(ButtonSetting setting, float width) {
            super(setting, width, 28f);
        }

        @Override
        public void draw(Renderer2D render, float x, float y, int mouseX, int mouseY, int alpha) {
            float rowX = x + ROW_PAD_X;
            float rowY = y + 3f;
            float rowW = width - ROW_PAD_X * 2f;
            float rowH = height - 6f;
            if (hovered(mouseX, mouseY, rowX, rowY, rowW, rowH)) {
                CursorHelper.setHand();
                hoverAnimation.show();
            } else {
                hoverAnimation.hide();
            }
            float alphaFactor = alpha / 255f;
            float hoverProgress = MathUtil.clamp(hoverAnimation.getProgress(), 0f, 1f);
            int baseRowColor = fun.nexisdlc.client.utils.render.color.basic.ColorUtils.interpolate(fun.nexisdlc.client.utils.render.color.basic.ColorUtils.rgba(255, 255, 255, 10), fun.nexisdlc.client.utils.render.color.basic.ColorUtils.rgba(255, 255, 255, 18), hoverProgress);
            int activeRowColor = fun.nexisdlc.client.utils.render.color.basic.ColorUtils.rgba(136, 121, 207, 20);
            int rowColor = fun.nexisdlc.client.utils.render.color.basic.ColorUtils.interpolate(baseRowColor, activeRowColor, hoverProgress);

            render.rect(rowX, rowY, rowW, rowH, 5, fun.nexisdlc.client.utils.render.color.basic.ColorUtils.multAlpha(rowColor, alphaFactor));
            render.rectOutline(rowX, rowY, rowW, rowH, 5, fun.nexisdlc.client.utils.render.color.basic.ColorUtils.multAlpha(fun.nexisdlc.client.utils.render.color.basic.ColorUtils.rgba(125, 125, 125, 40), alphaFactor), 1f);
            String label = truncate(setting.getName(), 24);
            render.text(FontRegistry.SF_MEDIUM, rowX + (rowW - textWidth(label, 13.5f)) * 0.5f,
                    centeredTextBaseline(rowY, rowH, 13.5f), 13.5f, label, rgba(245, 247, 250, alpha));
        }

        @Override
        public void mouseClicked(double mx, double my, int button, float x, float y) {
            if (button == GLFW.GLFW_MOUSE_BUTTON_LEFT && hovered(mx, my, x + ROW_PAD_X, y + 3f, width - ROW_PAD_X * 2f, height - 6f)) {
                setting.press();
            }
        }
    }

    public static final class StringComp extends SettingComponent<StringSetting> {
        public static StringComp focusedStringComp = null;
        private final TextInputField input;

        StringComp(StringSetting setting, float width) {
            super(setting, width, 40f);
            TextInputField field = new TextInputField()
                    .setFontSize(11.5f)
                    .setPadding(6f, 0f)
                    .setMaxLength(256)
                    .setText(setting.get());
            field.setOnChange(() -> setting.set(field.getText()));
            if (setting.isOnlyNumber()) {
                field.setCharFilter(c -> Character.isDigit(c) || c == '.' || c == '-');
            }
            this.input = field;
        }

        @Override
        public void draw(Renderer2D render, float x, float y, int mouseX, int mouseY, int alpha) {
            if (!input.getText().equals(setting.get()) && !input.isFocused()) {
                input.setText(setting.get());
            }
            float rowX = x + ROW_PAD_X;
            float rowY = y + 3f;
            float rowW = width - ROW_PAD_X * 2f;
            drawAnimatedSettingText(render, rowX + CONTENT_PAD_X, rowY + 14.5f, rowW - CONTENT_PAD_X * 2f, 12.5f,
                    setting.getName(), rgba(160, 160, 170, alpha));
            float inputX = rowX + CONTENT_PAD_X;
            float inputY = rowY + 20f;
            float inputW = rowW - CONTENT_PAD_X * 2f;
            render.rect(inputX, inputY, inputW, 15f, 5f, rgba(24, 24, 30, (int) (alpha * 0.4f)));
            input.render(render, inputX, inputY, inputW, 15f, alpha / 255f);
        }

        @Override
        public void mouseClicked(double mx, double my, int button, float x, float y) {
            float rowX = x + ROW_PAD_X;
            float rowY = y + 3f;
            float rowW = width - ROW_PAD_X * 2f;
            float inputX = rowX + CONTENT_PAD_X;
            float inputY = rowY + 20f;
            float inputW = rowW - CONTENT_PAD_X * 2f;
            input.mouseClicked(mx, my, button, inputX, inputY, inputW, 15f);
            if (input.isFocused()) focusedStringComp = this;
            else if (focusedStringComp == this) focusedStringComp = null;
        }

        @Override
        public void keyPressed(int key) {
            long handle = MinecraftClient.getInstance().getWindow().getHandle();
            int m = 0;
            if (GLFW.glfwGetKey(handle, GLFW.GLFW_KEY_LEFT_CONTROL) == GLFW.GLFW_PRESS
                    || GLFW.glfwGetKey(handle, GLFW.GLFW_KEY_RIGHT_CONTROL) == GLFW.GLFW_PRESS)
                m |= GLFW.GLFW_MOD_CONTROL;
            if (GLFW.glfwGetKey(handle, GLFW.GLFW_KEY_LEFT_SHIFT) == GLFW.GLFW_PRESS
                    || GLFW.glfwGetKey(handle, GLFW.GLFW_KEY_RIGHT_SHIFT) == GLFW.GLFW_PRESS) m |= GLFW.GLFW_MOD_SHIFT;
            input.keyPressed(key, m);
            if (!input.isFocused() && focusedStringComp == this) focusedStringComp = null;
        }

        @Override
        public void charTyped(char c) {
            input.charTyped(c);
        }
    }

    private static final class UnknownComp extends SettingComponent<Setting<?>> {
        UnknownComp(Setting<?> setting, float width) {
            super(setting, width, 24f);
        }

        @Override
        public void draw(Renderer2D render, float x, float y, int mouseX, int mouseY, int alpha) {
            drawAnimatedSettingText(render, x + ROW_PAD_X + CONTENT_PAD_X, y + 16f, width - (ROW_PAD_X + CONTENT_PAD_X) * 2f, 13f, setting.getName(), rgba(180, 180, 190, alpha));
        }

        @Override
        public void mouseClicked(double mouseX, double mouseY, int button, float x, float y) {
        }
    }

    private record Chip(float x, float y, float w, float h) {
    }
}
