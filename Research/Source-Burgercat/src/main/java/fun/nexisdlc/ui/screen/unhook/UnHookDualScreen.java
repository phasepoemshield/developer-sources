package fun.nexisdlc.ui.screen.unhook;

import fun.nexisdlc.Nexis;
import fun.nexisdlc.client.events.impl.render.EventRender;
import fun.nexisdlc.client.utils.eventbus.EventHandler;
import fun.nexisdlc.client.utils.render.animations.impl.SimpleLinearAnimation;
import fun.nexisdlc.client.utils.render.main.core.Renderer2D;
import fun.nexisdlc.client.utils.render.main.text.FontObject;
import fun.nexisdlc.client.utils.render.main.text.FontRegistry;
import fun.nexisdlc.modules.api.Function;
import fun.nexisdlc.modules.impl.utils.ProxyServer;
import net.minecraft.client.gui.Click;
import net.minecraft.client.gui.DrawContext;
import net.minecraft.client.input.CharInput;
import net.minecraft.client.input.KeyInput;
import net.minecraft.client.gui.screen.Screen;
import net.minecraft.text.Text;
import org.lwjgl.glfw.GLFW;

import java.util.ArrayList;
import java.util.List;

import static fun.nexisdlc.client.utils.client.IMinecraft.mc;

public class UnHookDualScreen extends Screen {
    private static final float TEXT_SCALE = 1.65f;
    private static final int FIELD_TARGET = 0;
    private static final int FIELD_LOCAL_IP = 1;
    private static final int FIELD_PORT = 2;
    private static final int FIELD_COUNT = 3;

    private static final int BTN_APPLY = 0;
    private static final int BTN_SWITCH = 1;
    private static final int BTN_STOP = 2;
    private static final int BTN_REFRESH = 3;

    private final ProxyServer proxyServer;

    private String targetValue;
    private String localIpValue;
    private String portValue;
    private int focusedField = FIELD_TARGET;

    private final List<String> status = new ArrayList<>();
    private String lastAction = "";
    private boolean eventSubscribed;
    private boolean closing;

    private final Rect targetRect = new Rect();
    private final Rect localIpRect = new Rect();
    private final Rect portRect = new Rect();
    private final Rect applyRect = new Rect();
    private final Rect switchRect = new Rect();
    private final Rect stopRect = new Rect();
    private final Rect refreshRect = new Rect();

    private final SimpleLinearAnimation uiFade = new SimpleLinearAnimation(280);
    private final SimpleLinearAnimation[] fieldHover = {
            new SimpleLinearAnimation(180), new SimpleLinearAnimation(180),
            new SimpleLinearAnimation(180)
    };
    private final SimpleLinearAnimation[] buttonHover = {
            new SimpleLinearAnimation(170), new SimpleLinearAnimation(170),
            new SimpleLinearAnimation(170), new SimpleLinearAnimation(170)
    };

    public UnHookDualScreen(ProxyServer proxyServer) {
        super(Text.literal("ProxyServer Дуал"));
        this.proxyServer = proxyServer;
    }

    @Override
    protected void init() {
        if (!eventSubscribed) {
            Nexis.getEventBus().subscribe(this);
            eventSubscribed = true;
        }

        targetValue = proxyServer.targetServerAddress.get();
        localIpValue = proxyServer.localServerIp.get();
        portValue = proxyServer.localServerPort.get();

        recalcLayout(this.width, this.height);
        focusedField = -1;
        refreshStatus();

        closing = false;
        uiFade.show();
        for (SimpleLinearAnimation anim : fieldHover) anim.hide();
        for (SimpleLinearAnimation anim : buttonHover) anim.hide();
    }

    @Override
    public void removed() {
        if (eventSubscribed) {
            Nexis.getEventBus().unsubscribe(this);
            eventSubscribed = false;
        }
        super.removed();
    }

    private void recalcLayout(float viewportW, float viewportH) {
        int panelW = Math.min(832, (int) viewportW - 60);
        int panelH = Math.min(512, (int) viewportH - 60);
        int panelX = ((int) viewportW - panelW) / 2;
        int panelY = ((int) viewportH - panelH) / 2;

        int fieldX = panelX + 26;
        int fieldW = panelW - 52;
        int y = panelY + 80;

        targetRect.set(fieldX, y, fieldW, 43);
        y += 72;

        localIpRect.set(fieldX, y, fieldW / 2 - 7, 43);
        portRect.set(fieldX + fieldW / 2 + 7, y, fieldW / 2 - 7, 43);
        y += 50;
        y += 8;

        int btnW = (fieldW - 13) / 2;
        applyRect.set(fieldX, y, btnW, 43);
        switchRect.set(fieldX + btnW + 13, y, btnW, 43);
        y += 53;

        stopRect.set(fieldX, y, btnW, 43);
        refreshRect.set(fieldX + btnW + 13, y, btnW, 43);
    }

    @EventHandler
    public void onRender(EventRender.Screen.Gui event) {
        if (mc.currentScreen != this) return;

        Renderer2D renderer = event.getRenderer();
        float w = event.getViewportWidth();
        float h = event.getViewportHeight();
        recalcLayout(w, h);

        int bgA = (int) (164 * uiFade.getProgress());
        int bgB = (int) (184 * uiFade.getProgress());

        //   renderer.gradient(0f, 0f, w, h,
        //           (bgA << 24) | 0x08040F,
        //           (bgA << 24) | 0x090511,
        //           (bgB << 24) | 0x0E0915,
        //           (bgB << 24) | 0x0C0713);

        renderer.flush();
        renderer.prepareBlurForced(8f);
    }

    @EventHandler
    public void onRender(EventRender.Screen.OverGui event) {
        if (mc.currentScreen != this) return;

        Renderer2D renderer = event.getRenderer();
        FontObject font = FontRegistry.SF_SEMIBOLD;

        float vw = event.getViewportWidth();
        float vh = event.getViewportHeight();
        recalcLayout(vw, vh);

        float mx = getMouseX(vw);
        float my = getMouseY(vh);

        int panelW = Math.min(832, (int) vw - 60);
        int panelH = Math.min(512, (int) vh - 60);
        int panelX = ((int) vw - panelW) / 2;
        int panelY = ((int) vh - panelH) / 2;

        updateHoverState(mx, my);

        float uiT = uiFade.getProgress();
        int panelColor = withAlpha(0x04000C, (int) (200 * uiT));
        int headerColor = withAlpha(0x090313, (int) (212 * uiT));

        renderer.blur(panelX, panelY, panelW, panelH, 16f, 1 * uiT);
        renderer.rect(panelX, panelY, panelW, panelH, 20f, panelColor);
        // renderer.rect(panelX, panelY, panelW, 72f, 20f, headerColor);

        int edge = withAlpha(0xFFFFFF, (int) (22 * uiT));
        renderer.rect(panelX, panelY, panelW, 1f, 0f, edge);
        renderer.rect(panelX, panelY + panelH - 1f, panelW, 1f, 0f, edge);

        renderer.centredText(font,
                panelX + panelW * 0.5f,
                panelY + 26f + FontRegistry.centeredBaselineOffset(font, 'H', 14f * TEXT_SCALE),
                14f * TEXT_SCALE,
                "Управление UnHook",
                withAlpha(0xEAF2FF, (int) (255 * uiT)));

        drawField(renderer, font, targetRect, "Цель (ip:port)", targetValue, focusedField == FIELD_TARGET, fieldHover[FIELD_TARGET].getProgress(), uiT);
        drawField(renderer, font, localIpRect, "Локальный IP", localIpValue, focusedField == FIELD_LOCAL_IP, fieldHover[FIELD_LOCAL_IP].getProgress(), uiT);
        drawField(renderer, font, portRect, "Порт", portValue, focusedField == FIELD_PORT, fieldHover[FIELD_PORT].getProgress(), uiT);

        drawButton(renderer, font, applyRect, "Применить", buttonHover[BTN_APPLY].getProgress(), uiT);
        drawButton(renderer, font, switchRect, "Сменить управление", buttonHover[BTN_SWITCH].getProgress(), uiT);
        drawButton(renderer, font, stopRect, "Остановить сервер", buttonHover[BTN_STOP].getProgress(), uiT);
        drawButton(renderer, font, refreshRect, "Обновить статус", buttonHover[BTN_REFRESH].getProgress(), uiT);

        float statusY = panelY + 355f;
        float labelX = panelX + 26f;
        renderer.text(font, labelX, statusY + FontRegistry.centeredBaselineOffset(font, 'H', 11f * TEXT_SCALE), 11f * TEXT_SCALE,
                "Статус:", withAlpha(0xECEAF2, (int) (255 * uiT)));

        float lineY = statusY + 20f;
        int maxLines = 8;
        int start = Math.max(0, status.size() - maxLines);
        for (int i = start; i < status.size(); i++) {
            String line = fitFromEnd(status.get(i), panelW - 64f, font, 9f * TEXT_SCALE);
            renderer.text(font, labelX,
                    lineY + FontRegistry.centeredBaselineOffset(font, 'H', 9f * TEXT_SCALE),
                    9f * TEXT_SCALE,
                    line,
                    withAlpha(0xB8B4C2, (int) (255 * uiT)));
            lineY += 18;
        }

        if (!lastAction.isEmpty()) {
            String lastLine = fitFromEnd("Последнее: " + lastAction, panelW - 64f, font, 9f * TEXT_SCALE);
            renderer.text(font,
                    labelX,
                    panelY + panelH - 20f + FontRegistry.centeredBaselineOffset(font, 'H', 9f * TEXT_SCALE),
                    9f * TEXT_SCALE,
                    lastLine,
                    withAlpha(0xECEAF2, (int) (255 * uiT)));
        }

        if (closing && uiFade.isFinished()) {
            close();
        }
    }

    private void updateHoverState(float mx, float my) {
        setHover(fieldHover[FIELD_TARGET], targetRect.contains(mx, my));
        setHover(fieldHover[FIELD_LOCAL_IP], localIpRect.contains(mx, my));
        setHover(fieldHover[FIELD_PORT], portRect.contains(mx, my));

        setHover(buttonHover[BTN_APPLY], applyRect.contains(mx, my));
        setHover(buttonHover[BTN_SWITCH], switchRect.contains(mx, my));
        setHover(buttonHover[BTN_STOP], stopRect.contains(mx, my));
        setHover(buttonHover[BTN_REFRESH], refreshRect.contains(mx, my));
    }

    private void setHover(SimpleLinearAnimation anim, boolean hovered) {
        if (hovered) anim.show();
        else anim.hide();
    }

    @Override
    public boolean keyPressed(KeyInput keyInput) {
        int keyCode = keyInput.key();
        int modifiers = keyInput.modifiers();
        if (keyCode == GLFW.GLFW_KEY_ESCAPE) {
            if (!closing) {
                closing = true;
                uiFade.hide();
            }
            return true;
        }

        if (keyCode == GLFW.GLFW_KEY_ENTER || keyCode == GLFW.GLFW_KEY_KP_ENTER) {
            if (focusedField != -1) {
                focusedField = -1;
                return true;
            }
        }

        if (keyCode == GLFW.GLFW_KEY_TAB) {
            cycleFocus((modifiers & GLFW.GLFW_MOD_SHIFT) == 0);
            return true;
        }

        if (focusedField != -1) {
            if ((modifiers & GLFW.GLFW_MOD_CONTROL) != 0 && keyCode == GLFW.GLFW_KEY_V) {
                String clip = GLFW.glfwGetClipboardString(mc.getWindow().getHandle());
                if (clip != null && !clip.isEmpty()) appendToFocused(clip);
                return true;
            }
            if (keyCode == GLFW.GLFW_KEY_BACKSPACE) {
                setFocusedValue(dropLast(getFocusedValue()));
                return true;
            }
        }

        return false;
    }

    @Override
    public boolean charTyped(CharInput charInput) {
        char chr = (char) charInput.codepoint();
        if (focusedField == -1) return false;
        if (chr < 32 || chr == 127) return false;
        appendToFocused(String.valueOf(chr));
        return true;
    }

    @Override
    public boolean mouseClicked(Click click, boolean isRepeated) {
        int button = click.button();
        if (button != 0) return false;

        float mx = getMouseX(mc.getWindow().getFramebufferWidth());
        float my = getMouseY(mc.getWindow().getFramebufferHeight());

        if (targetRect.contains(mx, my)) {
            focusedField = FIELD_TARGET;
            return true;
        }
        if (localIpRect.contains(mx, my)) {
            focusedField = FIELD_LOCAL_IP;
            return true;
        }
        if (portRect.contains(mx, my)) {
            focusedField = FIELD_PORT;
            return true;
        }

        focusedField = -1;

        if (applyRect.contains(mx, my)) {
            onApply();
            return true;
        }
        if (switchRect.contains(mx, my)) {
            onSwitchControl();
            return true;
        }
        if (stopRect.contains(mx, my)) {
            onStop();
            return true;
        }
        if (refreshRect.contains(mx, my)) {
            refreshStatus();
            return true;
        }

        return false;
    }

    @Override
    public void render(DrawContext context, int mouseX, int mouseY, float delta) {
        // Рендер в событиях EventRender.Screen.Gui/OverGui
    }

    @Override
    public boolean shouldPause() {
        return false;
    }

    @Override
    public void renderBackground(DrawContext context, int mouseX, int mouseY, float delta) {
    }

    @Override
    protected void applyBlur(DrawContext context) {
    }

    @Override
    protected void renderDarkening(DrawContext context) {
    }

    private void drawField(Renderer2D renderer, FontObject font, Rect rect, String label, String value,
                           boolean focused, float hoverT, float uiT) {
        int labelColor = blend(withAlpha(0xB4B4BE, (int) (220 * uiT)), withAlpha(0xEAEAF1, (int) (255 * uiT)), hoverT);
        renderer.text(font,
                rect.x,
                rect.y - 11f + FontRegistry.centeredBaselineOffset(font, 'H', 8f * TEXT_SCALE),
                9f * TEXT_SCALE,
                label,
                labelColor);

        int baseFieldAlpha = focused ? 22 : 14;
        int hoverFieldAlpha = focused ? 30 : 20;
        int bg = withAlpha(0xFFFFFF, (int) ((baseFieldAlpha + (hoverFieldAlpha - baseFieldAlpha) * hoverT) * uiT));
        int edge = withAlpha(0xFFFFFF, (int) ((focused ? 58 : 34) * uiT));

        renderer.blur(rect.x - 1f, rect.y - 1f, rect.w + 2f, rect.h + 2f, 7f, (0.18f + 0.25f * hoverT) * uiT);
        renderer.rect(rect.x, rect.y, rect.w, rect.h, 7f, bg);
        renderer.rect(rect.x, rect.y, rect.w, 1f, 0f, edge);
        renderer.rect(rect.x, rect.y + rect.h - 1f, rect.w, 1f, 0f, edge);

        String shown = fitFromEnd(value, rect.w - 20f, font, 10.5f * TEXT_SCALE);
        float textY = rect.y + rect.h * 0.5f + FontRegistry.centeredBaselineOffset(font, 'H', 10.5f * TEXT_SCALE);
        renderer.text(font, rect.x + 10f, textY, 10.5f * TEXT_SCALE, shown, withAlpha(0xF4F4FA, (int) (255 * uiT)));

        if (focused && ((System.currentTimeMillis() / 500L) % 2L == 0L)) {
            float caretX = rect.x + 10f + font.getWidth(shown, 10.5f * TEXT_SCALE);
            if (caretX < rect.x + rect.w - 3f) {
                renderer.rect(caretX, rect.y + 8f, 1f, rect.h - 16f, 0f, withAlpha(0xFFFFFF, (int) (255 * uiT)));
            }
        }
    }

    private void drawButton(Renderer2D renderer, FontObject font, Rect rect, String text, float hoverT, float uiT) {
        int bgAlpha = lerpInt(12, 20, hoverT);
        int bg = withAlpha(0xFFFFFF, (int) (bgAlpha * uiT));
        int edge = withAlpha(0xFFFFFF, (int) ((26 + 20 * hoverT) * uiT));

        renderer.blur(rect.x, rect.y, rect.w, rect.h, 7f, (0.14f + 0.30f * hoverT) * uiT);
        renderer.rect(rect.x, rect.y, rect.w, rect.h, 7f, bg);
        renderer.rect(rect.x, rect.y, rect.w, 1f, 0f, edge);
        renderer.rect(rect.x, rect.y + rect.h - 1f, rect.w, 1f, 0f, edge);

        String shown = fitFromEnd(text, rect.w - 20f, font, 9.8f * TEXT_SCALE);
        float tx = rect.x + (rect.w - font.getWidth(shown, 9.8f * TEXT_SCALE)) * 0.5f;
        float ty = rect.y + rect.h * 0.5f + FontRegistry.centeredBaselineOffset(font, 'H', 9.8f * TEXT_SCALE);
        int tr = lerpInt(180, 255, hoverT);
        int tg = lerpInt(180, 255, hoverT);
        int tb = lerpInt(190, 255, hoverT);
        renderer.text(font, tx, ty, 9.8f * TEXT_SCALE, shown, withAlpha((tr << 16) | (tg << 8) | tb, (int) (255 * uiT)));
    }

    private String fitFromEnd(String text, float maxWidth, FontObject font, float fontSize) {
        if (text == null) return "";
        String out = text;
      // while (!out.isEmpty() && font.getWidth(out, fontSize) > maxWidth) {
      //     out = out.substring(0);
      // }
        return out;
    }

    private void cycleFocus(boolean forward) {
        if (focusedField == -1) {
            focusedField = FIELD_TARGET;
            return;
        }
        focusedField = forward
                ? (focusedField + 1) % FIELD_COUNT
                : (focusedField - 1 + FIELD_COUNT) % FIELD_COUNT;
    }

    private void appendToFocused(String text) {
        if (text == null || text.isEmpty()) return;

        String cur = getFocusedValue();
        int maxLen = switch (focusedField) {
            case FIELD_TARGET -> 120;
            case FIELD_LOCAL_IP -> 80;
            case FIELD_PORT -> 5;
            default -> 120;
        };

        String next = (cur + text).replace("\n", "").replace("\r", "");
        if (focusedField == FIELD_PORT) next = next.replaceAll("[^0-9]", "");
        if (next.length() > maxLen) next = next.substring(0, maxLen);

        setFocusedValue(next);
    }

    private String getFocusedValue() {
        return switch (focusedField) {
            case FIELD_TARGET -> targetValue;
            case FIELD_LOCAL_IP -> localIpValue;
            case FIELD_PORT -> portValue;
            default -> "";
        };
    }

    private void setFocusedValue(String value) {
        switch (focusedField) {
            case FIELD_TARGET -> targetValue = value;
            case FIELD_LOCAL_IP -> localIpValue = value;
            case FIELD_PORT -> portValue = value;
            default -> {
            }
        }
    }

    private String dropLast(String s) {
        if (s == null || s.isEmpty()) return "";
        return s.substring(0, s.length() - 1);
    }

    private void onApply() {
        lastAction = proxyServer.applyDualSettings(
                localIpValue.trim(),
                portValue.trim(),
                targetValue.trim(),
                proxyServer.targetVersion.get()
        );
        Function.sendMessage(lastAction);
        refreshStatus();
    }

    private void onSwitchControl() {
        lastAction = proxyServer.switchControlFromGui();
        Function.sendMessage(lastAction);
        refreshStatus();
    }

    private void onStop() {
        lastAction = proxyServer.stopFromGui();
        Function.sendMessage(lastAction);
        refreshStatus();
    }

    private void refreshStatus() {
        status.clear();
        status.addAll(proxyServer.statusLinesForGui());
        if (status.isEmpty()) status.add("Нет данных статуса");
    }

    private float getMouseX(float viewportWidth) {
        var window = mc.getWindow();
        return (float) (mc.mouse.getX() * (double) viewportWidth / (double) window.getWidth());
    }

    private float getMouseY(float viewportHeight) {
        var window = mc.getWindow();
        return (float) (mc.mouse.getY() * (double) viewportHeight / (double) window.getHeight());
    }

    private int withAlpha(int rgb, int alpha) {
        int a = Math.max(0, Math.min(255, alpha));
        return (a << 24) | (rgb & 0x00FFFFFF);
    }

    private int blend(int c1, int c2, float t) {
        float k = Math.max(0f, Math.min(1f, t));
        int a1 = (c1 >>> 24) & 0xFF;
        int r1 = (c1 >>> 16) & 0xFF;
        int g1 = (c1 >>> 8) & 0xFF;
        int b1 = c1 & 0xFF;
        int a2 = (c2 >>> 24) & 0xFF;
        int r2 = (c2 >>> 16) & 0xFF;
        int g2 = (c2 >>> 8) & 0xFF;
        int b2 = c2 & 0xFF;
        int a = (int) (a1 + (a2 - a1) * k);
        int r = (int) (r1 + (r2 - r1) * k);
        int g = (int) (g1 + (g2 - g1) * k);
        int b = (int) (b1 + (b2 - b1) * k);
        return (a << 24) | (r << 16) | (g << 8) | b;
    }

    private int lerpInt(int from, int to, float t) {
        float k = Math.max(0f, Math.min(1f, t));
        return (int) (from + (to - from) * k);
    }

    private static class Rect {
        float x;
        float y;
        float w;
        float h;

        void set(float x, float y, float w, float h) {
            this.x = x;
            this.y = y;
            this.w = w;
            this.h = h;
        }

        boolean contains(float mx, float my) {
            return mx >= x && mx <= x + w && my >= y && my <= y + h;
        }
    }
}


