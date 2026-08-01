package fun.nexisdlc.ui.screen.irc;

import fun.nexisdlc.Nexis;
import fun.nexisdlc.client.ClientColors;
import fun.nexisdlc.client.events.impl.render.EventRender;
import fun.nexisdlc.client.utils.eventbus.EventHandler;
import fun.nexisdlc.client.utils.render.animations.impl.SimpleLinearAnimation;
import fun.nexisdlc.client.utils.render.color.basic.ColorUtils;
import fun.nexisdlc.client.utils.render.main.core.Renderer2D;
import fun.nexisdlc.client.utils.render.main.text.FontObject;
import fun.nexisdlc.client.utils.render.main.text.FontRegistry;
import net.minecraft.client.gui.DrawContext;
import net.minecraft.client.gui.screen.Screen;
import net.minecraft.text.Text;
import org.lwjgl.glfw.GLFW;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

import static fun.nexisdlc.client.utils.client.IMinecraft.mc;

public class IrcChatScreen extends Screen {
    private static final float WIDTH = 600f;
    private static final float HEIGHT = 500f;
    private static final float TITLE_HEIGHT = 50f;
    private static final float INPUT_HEIGHT = 60f;
    private static final float PADDING = 12f;
    private static final float ROUNDING = 20f;
    private static final float MESSAGE_SPACING = 8f;
    private static final float SCROLLBAR_WIDTH = 3.5f;
    private static final float SCROLLBAR_MIN_THUMB = 24f;
    private static final double SCROLL_STEP = 70.0;
    private static final float SMOOTHNESS = 5.0f;

    private float x, y;
    private double scrollY = 0;
    private double targetScrollY = 0;
    private boolean draggingScrollbar = false;
    private float scrollbarGrabOffset = 0f;
    private long lastTime = System.nanoTime();

    private String inputText = "";
    private boolean inputFocused = true;
    private int cursorPos = 0;
    private long lastBlinkTime = 0;
    private boolean cursorVisible = true;

    private final List<IrcMessageComponent> messageComponents = new ArrayList<>();
    private boolean needsRebuild = true;
    private boolean eventSubscribed = false;
    private boolean closing = false;

    private final SimpleLinearAnimation uiFade = new SimpleLinearAnimation(280);

    public IrcChatScreen() {
        super(Text.literal("IRC Chat"));
    }

    
    protected void init() {
        if (!eventSubscribed) {
            Nexis.getEventBus().subscribe(this);
            eventSubscribed = true;
        }

        this.x = (this.width - WIDTH) / 2f;
        this.y = (this.height - HEIGHT) / 2f;
        rebuildMessages();

        closing = false;
        uiFade.show();
    }

    
    public void removed() {
        if (eventSubscribed) {
            Nexis.getEventBus().unsubscribe(this);
            eventSubscribed = false;
        }
        super.removed();
    }

    private void rebuildMessages() {
        messageComponents.clear();
        float messageWidth = WIDTH - PADDING * 2 - SCROLLBAR_WIDTH - 10f;
        
        // Получаем все сообщения из IRCManager
        fun.nexisdlc.client.utils.irc.IRCManager manager = fun.nexisdlc.modules.impl.utils.IRC.getManager();
        if (manager != null) {
            for (fun.nexisdlc.client.utils.irc.IRCMessage ircMsg : manager.getMessages()) {
                // Конвертируем IRCMessage в IrcChatHistory.IrcMessage
                long timestamp = parseIrcTimestamp(ircMsg.getTimestamp());
                IrcChatHistory.IrcMessage historyMsg = new IrcChatHistory.IrcMessage(
                    ircMsg.getUsername(),
                    ircMsg.getMessage(),
                    timestamp
                );
                messageComponents.add(new IrcMessageComponent(historyMsg, messageWidth));
            }
        }
        
        needsRebuild = false;
        scrollToBottom();
    }

    private long parseIrcTimestamp(String timestamp) {
        if (timestamp == null || timestamp.isEmpty()) {
            return System.currentTimeMillis();
        }
        try {
            return java.time.Instant.parse(timestamp).toEpochMilli();
        } catch (Exception e) {
            return System.currentTimeMillis();
        }
    }

    private void scrollToBottom() {
        float contentHeight = getContentHeight();
        float totalHeight = getTotalContentHeight();
        double maxScroll = Math.max(0.0, totalHeight - contentHeight);
        targetScrollY = maxScroll;
        scrollY = maxScroll;
    }

    @EventHandler
    public void onRender(EventRender.Screen.Gui event) {
        if (mc.currentScreen != this) return;

        Renderer2D renderer = event.getRenderer();
        renderer.flush();
        renderer.prepareBlurForced(8f);
    }

    @EventHandler
    public void onRender(EventRender.Screen.OverGui event) {
        if (mc.currentScreen != this) return;

        if (needsRebuild) {
            rebuildMessages();
        }

        Renderer2D renderer = event.getRenderer();
        float vw = event.getViewportWidth();
        float vh = event.getViewportHeight();

        this.x = (vw - WIDTH) / 2f;
        this.y = (vh - HEIGHT) / 2f;

        long currentTime = System.nanoTime();
        double deltaTime = (currentTime - lastTime) / 1_000_000_000.0;
        lastTime = currentTime;
        if (deltaTime > 0.1) deltaTime = 0.1;

        float contentHeight = getContentHeight();
        float totalHeight = getTotalContentHeight();
        double maxScroll = Math.max(0.0, totalHeight - contentHeight);
        boolean hasScrollbar = maxScroll > 0.0;

        updateScroll(deltaTime, maxScroll);

        float uiT = uiFade.getProgress();
        float mx = getMouseX(vw);
        float my = getMouseY(vh);

        // Фон с блюром
        renderer.blur(x, y, WIDTH, HEIGHT, ROUNDING, 1f * uiT);
        int bgColor = withAlpha(ColorUtils.darkenWithAlpha(ClientColors.BACKGROUND.getRGB(), 0.65f), (int)(255 * uiT));
        renderer.rect(x, y, WIDTH, HEIGHT, ROUNDING, bgColor);

        // Заголовок
        drawTitle(renderer, uiT);

        // Область сообщений
        drawMessages(renderer, hasScrollbar, uiT);

        // Скроллбар
        if (hasScrollbar) {
            drawScrollbar(renderer, maxScroll, uiT);
        }

        // Поле ввода
        drawInputField(renderer, mx, my, uiT);

        if (closing && uiFade.isFinished()) {
            close();
        }
    }

    private void drawTitle(Renderer2D renderer, float uiT) {
        FontObject font = FontRegistry.SF_MEDIUM;
        String title = "IRC Chat";
        float titleSize = 24f;
        float titleWidth = font.getWidth(title, titleSize);
        float titleX = x + (WIDTH - titleWidth) / 2f;
        float titleY = y + TITLE_HEIGHT / 2f + FontRegistry.centeredBaselineOffset(font, 'H', titleSize);
        renderer.text(font, titleX, titleY, titleSize, title, withAlpha(Color.WHITE.getRGB(), (int)(255 * uiT)));
    }

    private void drawMessages(Renderer2D renderer, boolean hasScrollbar, float uiT) {
        float contentX = x + PADDING;
        float contentY = y + TITLE_HEIGHT;
        float contentWidth = WIDTH - PADDING * 2 - (hasScrollbar ? SCROLLBAR_WIDTH + 10f : 0);
        float contentHeight = getContentHeight();

        renderer.pushClipRect(
            (int) contentX,
            (int) contentY,
            (int) contentWidth,
            (int) contentHeight
        );

        float currentY = contentY - (float) scrollY;
        
        for (IrcMessageComponent component : messageComponents) {
            if (currentY + component.getHeight() > contentY && currentY < contentY + contentHeight) {
                component.draw(renderer, contentX, currentY, uiT);
            }
            currentY += component.getHeight() + MESSAGE_SPACING;
        }

        renderer.popClipRect();
    }

    private void drawInputField(Renderer2D renderer, float mx, float my, float uiT) {
        FontObject font = FontRegistry.SF_MEDIUM;
        float inputX = x + PADDING;
        float inputY = y + HEIGHT - INPUT_HEIGHT - PADDING;
        float inputWidth = WIDTH - PADDING * 2;
        float fieldHeight = 35f;
        float buttonWidth = 80f;
        float buttonHeight = fieldHeight;
        float gap = 8f;

        float fieldWidth = inputWidth - buttonWidth - gap;

        // Поле ввода
        int fieldBg = withAlpha(ColorUtils.darkenWithAlpha(ClientColors.BACKGROUND.getRGB(), 0.5f), (int)(255 * uiT));
        renderer.rect(inputX, inputY, fieldWidth, fieldHeight, 8f, fieldBg);
        renderer.rectOutline(inputX, inputY, fieldWidth, fieldHeight, 8f, 
            withAlpha(Color.WHITE.getRGB(), (int)(25 * uiT)), 1f);

        // Текст в поле ввода
        float textX = inputX + 10f;
        float textSize = 13f;
        float textY = inputY + fieldHeight / 2f + FontRegistry.centeredBaselineOffset(font, 'H', textSize);
        
        if (inputText.isEmpty() && !inputFocused) {
            renderer.text(font, textX, textY, textSize, "Введите сообщение...", 
                withAlpha(Color.GRAY.getRGB(), (int)(128 * uiT)));
        } else {
            renderer.text(font, textX, textY, textSize, inputText, withAlpha(ClientColors.TEXT.getRGB(), (int)(255 * uiT)));
            
            // Курсор
            if (inputFocused && cursorVisible) {
                String beforeCursor = inputText.substring(0, Math.min(cursorPos, inputText.length()));
                float cursorX = textX + font.getWidth(beforeCursor, textSize);
                float cursorHeight = font.getLineHeight(textSize);
                float cursorY = inputY + (fieldHeight - cursorHeight) / 2f;
                renderer.rect(cursorX, cursorY, 1.5f, cursorHeight, 0f, withAlpha(Color.WHITE.getRGB(), (int)(255 * uiT)));
            }
        }

        // Кнопка отправить
        float buttonX = inputX + fieldWidth + gap;
        boolean buttonHovered = mx >= buttonX && mx <= buttonX + buttonWidth &&
                                my >= inputY && my <= inputY + buttonHeight;
        
        int buttonBg = buttonHovered ? 
            withAlpha(ClientColors.ICON.getRGB(), (int)(255 * uiT)) : 
            withAlpha(ColorUtils.darkenWithAlpha(ClientColors.ICON.getRGB(), 0.7f), (int)(255 * uiT));
        renderer.rect(buttonX, inputY, buttonWidth, buttonHeight, 8f, buttonBg);

        String buttonText = "Отправить";
        float btnTextSize = 13f;
        float buttonTextWidth = font.getWidth(buttonText, btnTextSize);
        float buttonTextX = buttonX + (buttonWidth - buttonTextWidth) / 2f;
        float buttonTextY = inputY + buttonHeight / 2f + FontRegistry.centeredBaselineOffset(font, 'H', btnTextSize);
        renderer.text(font, buttonTextX, buttonTextY, btnTextSize, buttonText, withAlpha(Color.WHITE.getRGB(), (int)(255 * uiT)));

        // Мигание курсора
        if (System.currentTimeMillis() - lastBlinkTime > 530) {
            cursorVisible = !cursorVisible;
            lastBlinkTime = System.currentTimeMillis();
        }
    }

    private void drawScrollbar(Renderer2D renderer, double maxScroll, float uiT) {
        if (maxScroll <= 0.0) return;

        float trackX = x + WIDTH - SCROLLBAR_WIDTH - 7f;
        float trackY = y + TITLE_HEIGHT;
        float trackHeight = getContentHeight();

        renderer.rect(trackX, trackY, SCROLLBAR_WIDTH, trackHeight, 4f,
            withAlpha(new Color(47, 47, 52).getRGB(), (int)(255 * uiT)));

        float visibleRatio = Math.max(0.0f, Math.min(1.0f, 
            trackHeight / Math.max(trackHeight, getTotalContentHeight())));
        float thumbHeight = Math.max(SCROLLBAR_MIN_THUMB, trackHeight * visibleRatio);
        float scrollProgress = maxScroll > 0.0 ? (float) (scrollY / maxScroll) : 0f;
        float thumbY = trackY + (trackHeight - thumbHeight) * Math.max(0f, Math.min(1f, scrollProgress));

        renderer.rect(trackX, thumbY, SCROLLBAR_WIDTH, thumbHeight, 4f,
            withAlpha(ClientColors.ICON.getRGB(), (int)(255 * uiT)));
    }

    private void updateScroll(double delta, double maxScroll) {
        if (maxScroll <= 0) {
            scrollY = 0;
            targetScrollY = 0;
            return;
        }

        if (Math.abs(targetScrollY - scrollY) > 0.1) {
            double factor = 1.0 - Math.pow(0.0001, delta * (SMOOTHNESS / 10.0));
            scrollY += (targetScrollY - scrollY) * factor;
        } else {
            scrollY = targetScrollY;
        }

        if (targetScrollY > maxScroll) targetScrollY = maxScroll;
        if (scrollY < 0) scrollY = 0;
    }

    private float getContentHeight() {
        return HEIGHT - TITLE_HEIGHT - INPUT_HEIGHT - PADDING * 2;
    }

    private float getTotalContentHeight() {
        float total = 0f;
        for (IrcMessageComponent comp : messageComponents) {
            total += comp.getHeight() + MESSAGE_SPACING;
        }
        return total > 0f ? total - MESSAGE_SPACING : 0f;
    }

    
    public boolean mouseScrolled(double mouseX, double mouseY, double horizontalAmount, double verticalAmount) {
        if (draggingScrollbar) return true;

        float contentHeight = getContentHeight();
        float totalHeight = getTotalContentHeight();
        double maxScroll = Math.max(0.0, totalHeight - contentHeight);

        if (maxScroll > 0) {
            targetScrollY -= verticalAmount * SCROLL_STEP;
            targetScrollY = Math.max(0.0, Math.min(targetScrollY, maxScroll));
        }
        return true;
    }

    
    public boolean mouseClicked(double mouseX, double mouseY, int button) {
        if (button != 0) return false;

        float mx = getMouseX(mc.getWindow().getFramebufferWidth());
        float my = getMouseY(mc.getWindow().getFramebufferHeight());

        // Проверка клика по кнопке отправить
        float inputX = x + PADDING;
        float inputY = y + HEIGHT - INPUT_HEIGHT - PADDING;
        float fieldHeight = 35f;
        float buttonWidth = 80f;
        float gap = 8f;
        float fieldWidth = WIDTH - PADDING * 2 - buttonWidth - gap;
        float buttonX = inputX + fieldWidth + gap;

        if (mx >= buttonX && mx <= buttonX + buttonWidth &&
            my >= inputY && my <= inputY + fieldHeight) {
            sendMessage();
            return true;
        }

        // Проверка клика по полю ввода
        if (mx >= inputX && mx <= inputX + fieldWidth &&
            my >= inputY && my <= inputY + fieldHeight) {
            inputFocused = true;
            return true;
        }

        // Проверка клика по скроллбару
        if (tryStartScrollbarDrag(mx, my)) {
            return true;
        }

        inputFocused = false;
        return false;
    }

    
    public boolean mouseDragged(double mouseX, double mouseY, int button, double deltaX, double deltaY) {
        if (draggingScrollbar && button == 0) {
            float my = getMouseY(mc.getWindow().getFramebufferHeight());
            updateScrollFromThumb(my);
            return true;
        }
        return false;
    }

    
    public boolean mouseReleased(double mouseX, double mouseY, int button) {
        if (button == 0) {
            draggingScrollbar = false;
        }
        return false;
    }

    
    public boolean keyPressed(int keyCode, int scanCode, int modifiers) {
        if (keyCode == GLFW.GLFW_KEY_ESCAPE) {
            if (!closing) {
                closing = true;
                uiFade.hide();
            }
            return true;
        }

        if (inputFocused) {
            if (keyCode == GLFW.GLFW_KEY_ENTER) {
                sendMessage();
                return true;
            } else if (keyCode == GLFW.GLFW_KEY_BACKSPACE) {
                if (!inputText.isEmpty() && cursorPos > 0) {
                    inputText = inputText.substring(0, cursorPos - 1) + 
                               inputText.substring(cursorPos);
                    cursorPos--;
                }
                return true;
            } else if (keyCode == GLFW.GLFW_KEY_DELETE) {
                if (cursorPos < inputText.length()) {
                    inputText = inputText.substring(0, cursorPos) + 
                               inputText.substring(cursorPos + 1);
                }
                return true;
            } else if (keyCode == GLFW.GLFW_KEY_LEFT) {
                if (cursorPos > 0) cursorPos--;
                return true;
            } else if (keyCode == GLFW.GLFW_KEY_RIGHT) {
                if (cursorPos < inputText.length()) cursorPos++;
                return true;
            } else if (keyCode == GLFW.GLFW_KEY_HOME) {
                cursorPos = 0;
                return true;
            } else if (keyCode == GLFW.GLFW_KEY_END) {
                cursorPos = inputText.length();
                return true;
            }
        }

        return false;
    }

    
    public boolean charTyped(char chr, int modifiers) {
        if (inputFocused && chr >= 32 && chr != 127) {
            inputText = inputText.substring(0, cursorPos) + chr + inputText.substring(cursorPos);
            cursorPos++;
            return true;
        }
        return false;
    }

    private void sendMessage() {
        if (inputText.trim().isEmpty()) return;

        // Отправка сообщения через IRC модуль
        fun.nexisdlc.modules.impl.utils.IRC.sendIRCMessage(inputText.trim());

        // Очистка поля ввода
        inputText = "";
        cursorPos = 0;
        needsRebuild = true;
    }

    private boolean tryStartScrollbarDrag(float mouseX, float mouseY) {
        ScrollbarLayout sb = getScrollbarLayout();
        if (sb == null) return false;

        boolean insideThumb = mouseX >= sb.trackX && mouseX <= sb.trackX + SCROLLBAR_WIDTH &&
                             mouseY >= sb.thumbY && mouseY <= sb.thumbY + sb.thumbHeight;
        if (!insideThumb) return false;

        draggingScrollbar = true;
        scrollbarGrabOffset = mouseY - sb.thumbY;
        return true;
    }

    private void updateScrollFromThumb(float mouseY) {
        ScrollbarLayout sb = getScrollbarLayout();
        if (sb == null) {
            draggingScrollbar = false;
            return;
        }

        float trackMove = Math.max(1f, sb.trackHeight - sb.thumbHeight);
        float thumbTop = mouseY - scrollbarGrabOffset;
        float clampedTop = Math.max(sb.trackY, Math.min(thumbTop, sb.trackY + trackMove));
        float progress = (clampedTop - sb.trackY) / trackMove;
        double next = progress * sb.maxScroll;
        targetScrollY = next;
        scrollY = next;
    }

    private ScrollbarLayout getScrollbarLayout() {
        float contentHeight = getContentHeight();
        float totalHeight = getTotalContentHeight();
        double maxScroll = Math.max(0.0, totalHeight - contentHeight);
        if (maxScroll <= 0.0) return null;

        float trackX = x + WIDTH - SCROLLBAR_WIDTH - 7f;
        float trackY = y + TITLE_HEIGHT;
        float trackHeight = contentHeight;

        float visibleRatio = Math.max(0.0f, Math.min(1.0f, contentHeight / Math.max(contentHeight, totalHeight)));
        float thumbHeight = Math.max(SCROLLBAR_MIN_THUMB, trackHeight * visibleRatio);
        float scrollProgress = (float) (maxScroll > 0.0 ? (scrollY / maxScroll) : 0f);
        scrollProgress = Math.max(0f, Math.min(1f, scrollProgress));
        float thumbY = trackY + (trackHeight - thumbHeight) * scrollProgress;

        return new ScrollbarLayout(trackX, trackY, trackHeight, thumbY, thumbHeight, maxScroll);
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

    
    public void render(DrawContext context, int mouseX, int mouseY, float delta) {
        // Рендер в событиях EventRender.Screen.Gui/OverGui
    }

    
    public boolean shouldPause() {
        return false;
    }

    
    public void renderBackground(DrawContext context, int mouseX, int mouseY, float delta) {
    }

    
    protected void applyBlur(DrawContext context) {
    }

    
    protected void renderDarkening(DrawContext context) {
    }

    private record ScrollbarLayout(float trackX, float trackY, float trackHeight, 
                                   float thumbY, float thumbHeight, double maxScroll) {
    }
}
