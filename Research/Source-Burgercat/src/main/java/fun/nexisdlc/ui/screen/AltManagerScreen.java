package fun.nexisdlc.ui.screen;

import fun.nexisdlc.Nexis;
import fun.nexisdlc.client.ClientColors;
import fun.nexisdlc.client.events.impl.render.EventRender;
import fun.nexisdlc.client.utils.config.AltStorage;
import fun.nexisdlc.client.utils.eventbus.EventHandler;
import fun.nexisdlc.client.utils.render.animations.impl.SimpleLinearAnimation;
import fun.nexisdlc.client.utils.render.color.basic.ColorUtils;
import fun.nexisdlc.client.utils.render.main.core.Renderer2D;
import fun.nexisdlc.client.utils.render.main.gl.GlState;
import fun.nexisdlc.client.utils.render.main.gl.ShaderProgram;
import fun.nexisdlc.client.utils.render.main.text.FontObject;
import fun.nexisdlc.client.utils.render.main.text.FontRegistry;
import net.minecraft.client.gui.DrawContext;
import net.minecraft.client.gui.Click;
import net.minecraft.client.input.CharInput;
import net.minecraft.client.input.KeyInput;
import net.minecraft.client.gui.screen.Screen;
import net.minecraft.text.Text;
import net.minecraft.util.math.MathHelper;
import org.joml.Matrix4f;
import org.lwjgl.glfw.GLFW;
import org.lwjgl.opengl.GL11;
import org.lwjgl.opengl.GL15;
import org.lwjgl.opengl.GL20;
import org.lwjgl.opengl.GL30;
import org.lwjgl.system.MemoryStack;

import java.nio.FloatBuffer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Random;

import static fun.nexisdlc.client.utils.client.IMinecraft.mc;

public class AltManagerScreen extends Screen {
    private static final Random RANDOM = new Random();
    private static final MenuShaderBackground MENU_SHADER = new MenuShaderBackground();
    private static final int INPUT_MAX_LENGTH = 16;
    private static final float TEXT_SCALE_MULTIPLIER = 2f;
    private static final String[] NICK_PART_A = {
            // Common nickname words
            "amber", "bubble", "cherry", "cinder", "cloud", "comet", "cookie", "coral",
            "crystal", "dream", "echo", "ember", "fable", "flame", "frost", "glimmer",
            "honey", "lucky", "marble", "midnight", "misty", "moon", "pearl", "pepper",
            "pixel", "rain", "river", "shadow", "silver", "smokey", "snow", "spark",
            "star", "storm", "sunny", "velvet", "willow", "winter", "team", "grinch", "Deus", "McDonalds", "KFC", "Cola",
            // Meme / brainrot starters
            "burger", "fries", "cappuccino", "tung", "sahur", "udindindindun", "tripi", "tropa",
            "strawberry", "frulli", "frulla", "frullifrulla", "delta", "ballerina", "bombardiro",
            "tralalero", "lirili", "chimpanzini", "crocodilo", "espresso", "gelato", "ravioli",

            // Привет
            "svinya", "Pro", "PvP", "pvp", "pVp", "pro", "bems", "chick", "pizza", "tako"
    };
    private static final String[] NICK_PART_B = {
            // Common nickname endings
            "beam", "berry", "blink", "bloom", "burst", "dream", "drift", "dust",
            "flare", "flash", "glow", "groove", "heart", "leaf", "light", "mist",
            "nova", "petal", "pop", "ray", "rush", "shine", "sketch", "song",
            "spark", "spirit", "stone", "tune", "vibe", "wave", "wind", "zone",
            // Meme / brainrot endings
            "burger", "fries", "cappuccino", "tung", "sahur", "udindindindun", "tripi", "tropa",
            "strawberry", "frulli", "frulla", "frullifrulla", "delta", "crocodilo", "bandito",
            "bananini", "assassino", "tralala", "larila", "macchiato", "spaghetti", "mozzarella",

            // Привет
            "svinya", "Pro", "PvP", "pvp", "pVp", "pro", "bems", "chick", "pizza", "tako"
    };

    private final Screen parent;
    private final List<AltStorage.AltEntry> alts = new ArrayList<>();
    private final List<CardBounds> cardBounds = new ArrayList<>();
    private final Map<String, SimpleLinearAnimation> cardActionAnimations = new HashMap<>();
    private final Map<String, SimpleLinearAnimation> cardAppearAnimations = new HashMap<>();
    private final Map<String, SimpleLinearAnimation> cardFavoriteAnimations = new HashMap<>();

    private final SimpleLinearAnimation saveHover = new SimpleLinearAnimation(280);
    private final SimpleLinearAnimation generateHover = new SimpleLinearAnimation(280);
    private final SimpleLinearAnimation backHover = new SimpleLinearAnimation(280);
    private final SimpleLinearAnimation scrollHover = new SimpleLinearAnimation(260);
    private final SimpleLinearAnimation textFade = new SimpleLinearAnimation(240);
    private final SimpleLinearAnimation uiFade = new SimpleLinearAnimation(260);
    private final SimpleLinearAnimation infoFade = new SimpleLinearAnimation(220);

    private boolean eventSubscribed;
    private boolean inputFocused;
    private boolean draggingScrollBar;
    private boolean generateNumbers = true;
    private float scrollGrabOffset;

    private String nickInput = "";
    private float scroll;
    private float targetScroll;
    private long lastScrollUpdateNanos = System.nanoTime();
    private float uiScale = 1f;
    private String infoText = "";
    private long infoUntil;
    private Integer previousMaxFps;

    private float leftX;
    private float leftY;
    private float leftW;
    private float leftH;
    private float rightX;
    private float rightY;
    private float rightW;
    private float rightH;

    private float inputX;
    private float inputY;
    private float inputW;
    private float inputH;
    private float numberToggleX;
    private float numberToggleY;
    private float numberToggleW;
    private float numberToggleH;

    private float saveX;
    private float saveY;
    private float saveW;
    private float saveH;
    private float genX;
    private float genY;
    private float genW;
    private float genH;
    private float backX;
    private float backY;
    private float backW;
    private float backH;

    private float listX;
    private float listY;
    private float listW;
    private float listH;

    private float scrollbarTrackX;
    private float scrollbarTrackY;
    private float scrollbarTrackW;
    private float scrollbarTrackH;
    private float scrollbarThumbX;
    private float scrollbarThumbY;
    private float scrollbarThumbW;
    private float scrollbarThumbH;

    public AltManagerScreen(Screen parent) {
        super(Text.of("Alt Manager"));
        this.parent = parent;
    }

    @Override
    protected void init() {
        applyMenuFpsCap();
        if (!eventSubscribed) {
            Nexis.getEventBus().subscribe(this);
            eventSubscribed = true;
        }
        reloadAlts();
        nickInput = mc.getSession() != null ? mc.getSession().getUsername() : "";
        nickInput = cutToMaxLen(sanitizeNicknameCharacters(nickInput));
        generateNumbers = true;
        targetScroll = scroll;
        lastScrollUpdateNanos = System.nanoTime();
        textFade.show();
        uiFade.show();
        infoFade.hide();
    }

    @Override
    public void tick() {
        SharedBackgroundParticles.tick();
    }

    @Override
    public void removed() {
        restorePreviousFpsCap();
        if (eventSubscribed) {
            Nexis.getEventBus().unsubscribe(this);
            eventSubscribed = false;
        }
        super.removed();
    }

    @Override
    public void close() {
        mc.setScreen(parent);
    }

    @EventHandler
    public void onRender(EventRender.Screen.Gui event) {
        if (mc.currentScreen != this) {
            return;
        }

        updateLayout(event.getViewportWidth(), event.getViewportHeight());
        Renderer2D renderer = event.getRenderer();

        float bgAlpha = SharedBackgroundParticles.getBackgroundFadeAlpha();

        boolean shaderRendered = MENU_SHADER.render(ClientColors.GRADIENT_START.getRGB(), bgAlpha);
        if (!shaderRendered) {
            int a = (int) (bgAlpha * 255);
            renderer.gradient(0f, 0f, event.getViewportWidth(), event.getViewportHeight(),
                    brighten(darken(withAlpha(ClientColors.GRADIENT_START.getRGB(), a), 0.85f), 4),
                    brighten(darken(withAlpha(ClientColors.ICON.getRGB(), a), 0.88f), 4),
                    brighten(darken(withAlpha(ClientColors.GRADIENT_END.getRGB(), a), 0.65f), 4),
                    brighten(darken(withAlpha(ClientColors.BACKGROUND.getRGB(), a), 0.89f), 4));
        }
        renderer.flush();
        renderer.prepareBlurForced(8f);
    }

    @EventHandler
    public void onRender(EventRender.Screen.OverGui event) {
        if (mc.currentScreen != this) {
            return;
        }

        updateLayout(event.getViewportWidth(), event.getViewportHeight());
        Renderer2D renderer = event.getRenderer();
        FontObject font = FontRegistry.SF_SEMIBOLD;
        float mx = getMouseX(event.getViewportWidth());
        float my = getMouseY(event.getViewportHeight());
        float uiT = uiFade.getProgress();

        float fade = SharedBackgroundParticles.getBackgroundFadeAlpha();
        renderer.pushAlpha(fade);

        float round = s(14f);
        drawPanel(renderer, leftX, leftY, leftW, leftH, round);
        drawPanel(renderer, rightX, rightY, rightW, rightH, round);
        renderer.blur(leftX, leftY, leftW, leftH, round, 0.55f + 0.35f * uiT);
        renderer.blur(rightX, rightY, rightW, rightH, round, 0.55f + 0.35f * uiT);

        float headerSize = t(9f);
        float headerTopY = leftY + s(9f);
        float leftHeaderBaseline = centerBaseline(font, headerTopY + headerSize * 0.75f, headerSize);
        float rightHeaderBaseline = centerBaseline(font, headerTopY + headerSize * 0.65f, headerSize);
        renderer.centredText(font, snap(leftX + leftW * 0.5f), leftHeaderBaseline, headerSize, "Alt Manager", withGlobalTextAlpha(0xFFFFFFFF));
        renderer.centredText(font, snap(rightX + rightW * 0.5f), rightHeaderBaseline, headerSize, "Аккаунты", withGlobalTextAlpha(0xFFFFFFFF));

        String current = mc.getSession() != null ? mc.getSession().getUsername() : "unknown";
        drawText(renderer, font, leftX + s(12f), leftY + s(42f), t(8f), "Текущий: " + current, 0xFFB9C1D3);
        drawText(renderer, font, leftX + s(12f), leftY + s(62f), t(7f), "Ник: от 1 до 16 символов (буквы, цифры и _)", 0xFFD0D8E7);

        drawInput(renderer, font, mx, my);
        drawButtons(renderer, font, mx, my);
        renderAltList(renderer, font, mx, my);

        if (!infoText.isEmpty() && System.currentTimeMillis() < infoUntil) {
            infoFade.show();
        } else {
            infoFade.hide();
        }

        if (!infoText.isEmpty() && infoFade.getProgress() > 0.01f) {
            float w = font.getWidth(infoText, t(8f));
            float x = leftX + (leftW - w) * 0.5f;
            drawText(renderer, font, x, leftY + leftH - s(170), t(8f), infoText, applyAlphaFactor(0xFFFFFFFF, infoFade.getProgress()));
        } else if (!infoText.isEmpty() && System.currentTimeMillis() >= infoUntil) {
            infoText = "";
        }

        renderer.popAlpha();
    }

    @Override
    public boolean mouseClicked(Click click, boolean isRepeated) {
        int button = click.button();
        if (button != 0) {
            return super.mouseClicked(click, isRepeated);
        }

        updateLayout(mc.getWindow().getFramebufferWidth(), mc.getWindow().getFramebufferHeight());
        float mx = getMouseX(mc.getWindow().getFramebufferWidth());
        float my = getMouseY(mc.getWindow().getFramebufferHeight());

        inputFocused = isInside(mx, my, inputX, inputY, inputW, inputH);

        if (isInside(mx, my, saveX, saveY, saveW, saveH)) {
            createAlt();
            return true;
        }
        if (isInside(mx, my, genX, genY, genW, genH)) {
            nickInput = generateNickname();
            return true;
        }
        if (isInside(mx, my, numberToggleX, numberToggleY, numberToggleW, numberToggleH)) {
            generateNumbers = !generateNumbers;
            return true;
        }
        if (isInside(mx, my, backX, backY, backW, backH)) {
            close();
            return true;
        }

        if (hasScrollableList()) {
            if (isInside(mx, my, scrollbarThumbX, scrollbarThumbY, scrollbarThumbW, scrollbarThumbH)) {
                draggingScrollBar = true;
                scrollGrabOffset = my - scrollbarThumbY;
                return true;
            }
        }

        for (CardBounds bounds : cardBounds) {
            if (bounds.actionsVisible && bounds.inFavorite(mx, my)) {
                boolean nowFavorite = AltStorage.toggleFavorite(bounds.nickname);
                reloadAlts();
                showInfo(nowFavorite ? "Добавлен в избранные" : "Убран из избранных");
                return true;
            }

            if (bounds.actionsVisible && bounds.inDelete(mx, my)) {
                if (AltStorage.isFavorite(bounds.nickname)) {
                    showInfo("Избранные аккаунты нельзя удалить");
                    return true;
                }
                if (AltStorage.removeAlt(bounds.nickname)) {
                    reloadAlts();
                    showInfo("Аккаунт удален");
                }
                return true;
            }

            if (bounds.actionsVisible && bounds.inCopy(mx, my)) {
                mc.keyboard.setClipboard(bounds.nickname);
                showInfo("Ник скопирован");
                return true;
            }

            if (bounds.inCard(mx, my)) {
                if (AltStorage.normalizeNickname(bounds.nickname) != null && AltStorage.containsIgnoreCase(bounds.nickname)) {
                    if (fun.nexisdlc.client.utils.player.AltSessionUtil.applyOfflineSession(bounds.nickname)) {
                        AltStorage.setLastSelectedAlt(bounds.nickname);
                        showInfo("Выбран аккаунт: " + bounds.nickname);
                    } else {
                        showInfo("Не удалось применить аккаунт");
                    }
                }
                return true;
            }
        }

        return super.mouseClicked(click, isRepeated);
    }

    @Override
    public boolean mouseReleased(Click click) {
        int button = click.button();
        if (button == 0) {
            draggingScrollBar = false;
        }
        return super.mouseReleased(click);
    }

    @Override
    public boolean mouseDragged(Click click, double deltaX, double deltaY) {
        int button = click.button();
        if (button != 0 || !draggingScrollBar || !hasScrollableList()) {
            return super.mouseDragged(click, deltaX, deltaY);
        }
        float my = getMouseY(mc.getWindow().getFramebufferHeight());
        float contentHeight = getContentHeight();
        float maxScroll = Math.max(0f, contentHeight - listH);
        float newThumbY = MathHelper.clamp(my - scrollGrabOffset, scrollbarTrackY, scrollbarTrackY + scrollbarTrackH - scrollbarThumbH);
        float ratio = (newThumbY - scrollbarTrackY) / Math.max(1f, (scrollbarTrackH - scrollbarThumbH));
        targetScroll = ratio * maxScroll;
        scroll = targetScroll;
        return true;
    }

    @Override
    public boolean mouseScrolled(double mouseX, double mouseY, double horizontalAmount, double verticalAmount) {
        if (!isInside(getMouseX(mc.getWindow().getFramebufferWidth()), getMouseY(mc.getWindow().getFramebufferHeight()), rightX, rightY, rightW, rightH)) {
            return super.mouseScrolled(mouseX, mouseY, horizontalAmount, verticalAmount);
        }
        float maxScroll = Math.max(0f, getContentHeight() - listH);
        targetScroll = MathHelper.clamp(targetScroll - (float) verticalAmount * s(18f), 0f, maxScroll);
        return true;
    }

    @Override
    public boolean keyPressed(KeyInput keyInput) {
        int keyCode = keyInput.key();
        int modifiers = keyInput.modifiers();
        if (keyCode == GLFW.GLFW_KEY_ESCAPE) {
            close();
            return true;
        }

        if (!inputFocused) {
            return super.keyPressed(keyInput);
        }

        if (keyCode == GLFW.GLFW_KEY_ENTER || keyCode == GLFW.GLFW_KEY_KP_ENTER) {
            createAlt();
            return true;
        }

        if (hasControlDown(modifiers) && keyCode == GLFW.GLFW_KEY_V) {
            String clipboard = mc.keyboard.getClipboard();
            String sanitized = sanitizeNicknameCharacters(clipboard);
            nickInput = cutToMaxLen(sanitized);
            return true;
        }

        if (hasControlDown(modifiers) && keyCode == GLFW.GLFW_KEY_C) {
            mc.keyboard.setClipboard(nickInput);
            return true;
        }

        if (keyCode == GLFW.GLFW_KEY_BACKSPACE) {
            if (!nickInput.isEmpty()) {
                nickInput = nickInput.substring(0, nickInput.length() - 1);
            }
            return true;
        }

        return super.keyPressed(keyInput);
    }

    @Override
    public boolean charTyped(CharInput charInput) {
        char chr = (char) charInput.codepoint();
        if (!inputFocused) {
            return super.charTyped(charInput);
        }
        if (nickInput.length() >= INPUT_MAX_LENGTH) {
            return true;
        }
        if (isNicknameChar(chr)) {
            nickInput += chr;
            return true;
        }
        return super.charTyped(charInput);
    }

    @Override
    public void renderBackground(DrawContext context, int mouseX, int mouseY, float delta) {
    }

    @Override
    protected void renderDarkening(DrawContext context) {
    }

    @Override
    protected void applyBlur(DrawContext context) {
    }

    private void drawPanel(Renderer2D renderer, float x, float y, float w, float h, float rounding) {
        int top = withUiAlpha(withAlpha(brighten(ClientColors.BACKGROUND.getRGB(), 42), 246));
        int bottom = withUiAlpha(withAlpha(brighten(ClientColors.BACKGROUND.getRGB(), 24), 248));
        renderer.gradient(x, y, w, h, rounding, top, top, bottom, bottom);
        renderer.rect(x, y, w, h, rounding, ColorUtils.rgba(255, 255, 255, 20));
    }

    private void drawInput(Renderer2D renderer, FontObject font, float mx, float my) {
        long now = System.currentTimeMillis();
        float colorPulse = 0.5f + 0.5f * (float) Math.sin(now * 0.0054f);
        boolean hovered = isInside(mx, my, inputX, inputY, inputW, inputH);
        int idleBorder = blend(ColorUtils.rgba(70, 88, 118, 224), ColorUtils.rgba(90, 112, 146, 226), colorPulse * 0.5f);
        int hoverBorder = blend(ColorUtils.rgba(102, 128, 170, 236), withAlpha(brighten(ClientColors.ICON.getRGB(), 8), 238), colorPulse * 0.45f);
        int focusBorder = blend(withAlpha(brighten(ClientColors.ICON.getRGB(), 12), 246), withAlpha(brighten(ClientColors.GRADIENT_END.getRGB(), 12), 246), colorPulse * 0.65f);
        int borderColor = inputFocused ? focusBorder : (hovered ? hoverBorder : idleBorder);
        float round = s(11f);

        renderer.blur(inputX - s(1.1f), inputY - s(1.1f), inputW + s(2.2f), inputH + s(2.2f), round + s(1f), inputFocused ? 0.56f : 0.28f);
        //   renderer.rect(inputX - s(1.2f), inputY - s(1.2f), inputW + s(2.4f), inputH + s(2.4f), round + s(1f), withUiAlpha(withAlpha(borderColor, inputFocused ? 170 : 130)));
        renderer.rect(inputX, inputY, inputW, inputH, round, withUiAlpha(ColorUtils.rgba(255, 255, 255, 17)));
        //     renderer.rect(inputX + s(1.4f), inputY + s(1.3f), inputW - s(2.8f), s(1f), withUiAlpha(ColorUtils.rgba(255, 255, 255, 36)));
        renderer.rect(inputX + s(1.4f), inputY + inputH - s(2.3f), inputW - s(2.8f), s(1f), withUiAlpha(ColorUtils.rgba(0, 0, 0, 96)));

        String visibleText = nickInput.isEmpty() && !inputFocused ? "Введите ник..." : nickInput;
        int textColor = nickInput.isEmpty() && !inputFocused ? 0x88FFFFFF : 0xFFFFFFFF;
        float textSize = t(8.5f);
        float textX = inputX + s(10f);
        float textBaseline = centerBaseline(font, inputY + inputH * 0.5f, textSize);
        renderer.text(font, snap(textX), textBaseline, textSize, visibleText, withGlobalTextAlpha(textColor));

        if (inputFocused && ((System.currentTimeMillis() / 450L) % 2L == 0L)) {
            float textW = font.getWidth(nickInput, textSize);
            float cx = Math.min(inputX + inputW - s(10f), textX + textW + s(1.5f));
            float cursorH = s(20f);
            float cy = inputY + (inputH - cursorH) * 0.5f;
            int cursorColor = blend(ColorUtils.rgba(255, 255, 255, 210), ColorUtils.rgba(192, 218, 255, 235), colorPulse * 0.65f);
            renderer.rect(cx, cy, s(1.15f), cursorH, withUiAlpha(withGlobalTextAlpha(cursorColor)));
        }
    }

    private void drawButtons(Renderer2D renderer, FontObject font, float mx, float my) {
        drawNumberToggle(renderer, font, mx, my);
        drawButton(renderer, font, saveX, saveY, saveW, saveH, "Сохранить", isInside(mx, my, saveX, saveY, saveW, saveH), saveHover, ColorUtils.rgba(52, 142, 95, 255));
        drawButton(renderer, font, genX, genY, genW, genH, "Сгенерировать", isInside(mx, my, genX, genY, genW, genH), generateHover, ColorUtils.rgba(45, 108, 194, 255));
        drawButton(renderer, font, backX, backY, backW, backH, "Назад", isInside(mx, my, backX, backY, backW, backH), backHover, ColorUtils.rgba(124, 94, 186, 255));
    }

    private void drawNumberToggle(Renderer2D renderer, FontObject font, float mx, float my) {
        int textColor = 0xFFFFFFFF;
        float round = s(7f);

        renderer.rect(numberToggleX, numberToggleY, numberToggleW, numberToggleH, round, withUiAlpha(ColorUtils.rgba(255, 255, 255, 17)));
        renderer.rect(numberToggleX + s(1.4f), numberToggleY + numberToggleH - s(2.3f), numberToggleW - s(2.8f), s(1f), withUiAlpha(ColorUtils.rgba(0, 0, 0, 96)));

        float boxSize = s(13f);
        float boxX = numberToggleX + s(8f);
        float boxY = numberToggleY + (numberToggleH - boxSize) * 0.5f;
        renderer.rect(boxX, boxY, boxSize, boxSize, s(3f), withUiAlpha(ColorUtils.rgba(18, 24, 34, 170)));
        if (generateNumbers) {
            renderer.rect(boxX + s(2.5f), boxY + s(2.5f), boxSize - s(5f), boxSize - s(5f), s(2f), withUiAlpha(ColorUtils.rgba(255, 255, 255, 210)));
        }

        String label = "Генерация чисел";
        float size = t(7.2f);
        float baseline = centerBaseline(font, numberToggleY + numberToggleH * 0.5f, size);
        renderer.text(font, snap(boxX + boxSize + s(6f)), baseline, size, label, withGlobalTextAlpha(textColor));
    }

    private void drawButton(Renderer2D renderer, FontObject font, float x, float y, float w, float h, String label, boolean hovered, SimpleLinearAnimation animation, int accent) {
        if (hovered) {
            animation.show();
        } else {
            animation.hide();
        }
        float hoverProgress = animation.getProgress();
        float hoverMix = hoverProgress * 0.95f;
        int vividAccent = withAlpha(brighten(accent, 24), 255);
        int bg = withUiAlpha(blend(ColorUtils.rgba(255, 255, 255, 17), vividAccent, hoverMix));
        float round = s(7f);
        renderer.blur(x, y, w, h, round, 0.24f + 0.40f * hoverProgress);
        renderer.rect(x, y, w, h, round, bg);
        renderer.rect(x + s(1f), y + s(1f), w - s(2f), s(1f), withUiAlpha(ColorUtils.rgba(255, 255, 255, 34)));
        renderer.rect(x + s(1f), y + h - s(2f), w - s(2f), s(1f), withUiAlpha(ColorUtils.rgba(0, 0, 0, 86)));
        float labelSize = t(8f);
        float baseline = centerBaseline(font, y + h * 0.5f, labelSize);
        renderer.centredText(font, snap(x + w * 0.5f), baseline, labelSize, label, withGlobalTextAlpha(0xFFFFFFFF));
    }

    private void renderAltList(Renderer2D renderer, FontObject font, float mx, float my) {
        cardBounds.clear();

        listX = rightX + s(10f);
        listY = rightY + s(36f);
        listW = rightW - s(20f);
        listH = rightH - s(46f);

        // Keep the list container transparent so the right panel background stays identical to the left panel.
        renderer.pushClipRect(Math.round(listX), Math.round(listY), Math.round(listW), Math.round(listH));

        float cardHeight = s(34f);
        float gap = s(8f);
        float contentHeight = getContentHeight();
        float maxScroll = Math.max(0f, contentHeight - listH);
        targetScroll = MathHelper.clamp(targetScroll, 0f, maxScroll);
        long now = System.nanoTime();
        float dt = Math.max(0f, (now - lastScrollUpdateNanos) / 1_000_000_000f);
        lastScrollUpdateNanos = now;
        dt = Math.min(dt, 0.05f);
        float follow = 1f - (float) Math.pow(0.001f, dt * 14f);
        scroll += (targetScroll - scroll) * follow;
        if (Math.abs(scroll - targetScroll) < 0.02f) {
            scroll = targetScroll;
        }

        String selected = mc.getSession() != null ? mc.getSession().getUsername() : "";

        for (int i = 0; i < alts.size(); i++) {
            AltStorage.AltEntry alt = alts.get(i);
            float y = listY + s(6f) + i * (cardHeight + gap) - scroll;
            float x = listX + s(6f);
            float w = listW - s(12f);
            float h = cardHeight;

            if (y + h < listY || y > listY + listH) {
                continue;
            }

            boolean hovered = isInside(mx, my, x, y, w, h);
            SimpleLinearAnimation actionAnim = cardActionAnimations.computeIfAbsent(alt.getName(), k -> new SimpleLinearAnimation(160));
            SimpleLinearAnimation appearAnim = cardAppearAnimations.computeIfAbsent(alt.getName(), k -> new SimpleLinearAnimation(280));
            SimpleLinearAnimation favoriteAnim = cardFavoriteAnimations.computeIfAbsent(alt.getName(), k -> new SimpleLinearAnimation(190));

            if (hovered) {
                actionAnim.show();
            } else {
                actionAnim.hide();
            }
            appearAnim.show();
            boolean favorite = AltStorage.isFavorite(alt.getName());
            if (favorite) {
                favoriteAnim.show();
            } else {
                favoriteAnim.hide();
            }

            float actionProgress = actionAnim.getProgress();
            float appearProgress = Math.max(0.1f, appearAnim.getProgress());
            float favoriteProgress = favoriteAnim.getProgress();

            boolean isSelected = alt.getName().equalsIgnoreCase(selected);
            int cardBg = isSelected
                    ? withUiAlpha(blend(withAlpha(brighten(ClientColors.GRADIENT_END.getRGB(), 28), 216), withAlpha(brighten(ClientColors.GRADIENT_START.getRGB(), 34), 236), actionProgress * 0.78f))
                    : withUiAlpha(blend(ColorUtils.rgba(255, 255, 255, 17), withAlpha(brighten(ClientColors.GRADIENT_START.getRGB(), 20), 194), actionProgress * 0.64f));
            float round = s(8f);
            renderer.rect(x, y, w, h, round, applyAlphaFactor(cardBg, appearProgress));

            int accountTextAlpha = MathHelper.clamp((int) (255 + actionProgress * 85f), 0, 255);
            float nameX = x + s(10f);
            float nameY = y + s(9f);
            float nameSize = t(8f);
            if (favorite) {
                String marker = "* ";
                float markerSize = t(16f);
                drawText(renderer, font, nameX, y + s(8.5f), markerSize, marker, ColorUtils.rgba(255, 240, 0, accountTextAlpha));
                nameX += font.getWidth(marker, markerSize * 0.9f);
            }
            drawText(renderer, font, nameX, nameY, nameSize, alt.getName(), withAlpha(0xFFFFFF, accountTextAlpha));
            float btnH = s(16f);
            float btnGap = s(4f);
            float labelSize = t(6.2f);
            float btnPadX = s(5.5f);
            float minBtnW = s(24f);

            String deleteLabel = "Удалить";
            String copyLabel = "Копировать";
            String favoriteLabel = favorite ? "В избранном" : "В избранное";

            float delW = Math.max(minBtnW, font.getWidth(deleteLabel, labelSize) + btnPadX * 2f);
            float copyW = Math.max(minBtnW, font.getWidth(copyLabel, labelSize) + btnPadX * 2f);
            float favW = Math.max(minBtnW, font.getWidth(favoriteLabel, labelSize) + btnPadX * 2f);

            float maxButtonsWidth = Math.max(s(56f), w - s(16f));
            float totalButtons = delW + copyW + favW + btnGap * 2f;
            if (totalButtons > maxButtonsWidth) {
                float scale = maxButtonsWidth / totalButtons;
                delW *= scale;
                copyW *= scale;
                favW *= scale;
                totalButtons = delW + copyW + favW + btnGap * 2f;
            }

            float actionsStartX = x + w - s(8f) - totalButtons;
            float minStartX = x + s(8f);
            if (actionsStartX < minStartX) {
                actionsStartX = minStartX;
            }

            float delX = actionsStartX;
            float copyX = delX + delW + btnGap;
            float favX = copyX + copyW + btnGap;
            float delY = y + (h - btnH) * 0.5f;
            float copyY = delY;
            float favY = delY;

            int btnAlpha = Math.round(actionProgress * 220f);
            if (btnAlpha > 4) {
                renderer.rect(delX, delY, delW, btnH, s(4.5f), withUiAlpha(ColorUtils.rgba(166, 58, 58, btnAlpha)));
                renderer.rect(copyX, copyY, copyW, btnH, s(4.5f), withUiAlpha(ColorUtils.rgba(56, 112, 192, btnAlpha)));
                renderer.rect(favX, favY, favW, btnH, s(4.5f), withUiAlpha(blend(
                        ColorUtils.rgba(124, 124, 146, btnAlpha),
                        ColorUtils.rgba(196, 156, 62, btnAlpha),
                        favoriteProgress)));

                float delBase = centerBaseline(font, delY + btnH * 0.5f, labelSize);
                float copyBase = centerBaseline(font, copyY + btnH * 0.5f, labelSize);
                float favBase = centerBaseline(font, favY + btnH * 0.5f, labelSize);
                int actionTextColor = withGlobalTextAlpha(withAlpha(0xFFFFFF, btnAlpha));
                renderer.centredText(font, snap(delX + delW * 0.5f), delBase, labelSize, deleteLabel, actionTextColor);
                renderer.centredText(font, snap(copyX + copyW * 0.5f), copyBase, labelSize, copyLabel, actionTextColor);
                renderer.centredText(font, snap(favX + favW * 0.5f), favBase, labelSize, favoriteLabel, actionTextColor);
            }

            cardBounds.add(new CardBounds(
                    alt.getName(),
                    x, y, w, h,
                    delX, delY, delW, btnH,
                    copyX, copyY, copyW, btnH,
                    favX, favY, favW, btnH,
                    actionProgress > 0.05f
            ));
        }

        renderer.popClipRect();
        drawScrollbar(renderer, mx, my, contentHeight, maxScroll);
    }

    private void drawScrollbar(Renderer2D renderer, float mx, float my, float contentHeight, float maxScroll) {
        scrollbarTrackW = s(6f);
        scrollbarTrackH = listH - s(4f);
        scrollbarTrackX = rightX + rightW - s(12f);
        scrollbarTrackY = listY + s(2f);

        boolean hoverTrack = isInside(mx, my, scrollbarTrackX, scrollbarTrackY, scrollbarTrackW, scrollbarTrackH);
        if (hoverTrack || draggingScrollBar) {
            scrollHover.show();
        } else {
            scrollHover.hide();
        }

        renderer.rect(scrollbarTrackX, scrollbarTrackY, scrollbarTrackW, scrollbarTrackH, s(4f), withUiAlpha(ColorUtils.rgba(19, 28, 44, 194)));

        if (contentHeight <= listH + 0.01f) {
            scrollbarThumbX = scrollbarTrackX;
            scrollbarThumbY = scrollbarTrackY;
            scrollbarThumbW = scrollbarTrackW;
            scrollbarThumbH = scrollbarTrackH;
            return;
        }

        float thumbMin = s(24f);
        scrollbarThumbH = Math.max(thumbMin, (listH / contentHeight) * scrollbarTrackH);
        float t = maxScroll <= 0.001f ? 0f : (scroll / maxScroll);
        scrollbarThumbY = scrollbarTrackY + (scrollbarTrackH - scrollbarThumbH) * t;
        scrollbarThumbX = scrollbarTrackX;
        scrollbarThumbW = scrollbarTrackW;

        int thumbColor = blend(ColorUtils.rgba(255, 255, 255, 17), withAlpha(brighten(ClientColors.ICON.getRGB(), 14), 246), scrollHover.getProgress());
        renderer.rect(scrollbarThumbX, scrollbarThumbY, scrollbarThumbW, scrollbarThumbH, s(4f), withUiAlpha(thumbColor));
    }

    private boolean hasScrollableList() {
        return getContentHeight() > listH + 0.01f;
    }

    private float getContentHeight() {
        float cardHeight = s(34f);
        float gap = s(8f);
        return Math.max(0f, alts.size() * (cardHeight + gap) - gap + s(12f));
    }

    private void createAlt() {
        String normalized = AltStorage.normalizeNickname(nickInput);
        if (normalized == null) {
            showInfo("Некорректный ник");
            return;
        }

        if (!AltStorage.addAlt(normalized)) {
            showInfo("Ник уже существует");
            return;
        }

        reloadAlts();
        if (fun.nexisdlc.client.utils.player.AltSessionUtil.applyOfflineSession(normalized)) {
            AltStorage.setLastSelectedAlt(normalized);
            showInfo("Аккаунт создан и выбран");
        } else {
            showInfo("Аккаунт создан");
        }
    }

    private String generateNickname() {
        for (int i = 0; i < 260; i++) {
            String a = NICK_PART_A[RANDOM.nextInt(NICK_PART_A.length)];
            String b = NICK_PART_B[RANDOM.nextInt(NICK_PART_B.length)];

            String base;
            int pattern = RANDOM.nextInt(6);
            switch (pattern) {
                case 0 -> base = capitalize(a) + capitalize(b);
                case 1 -> base = a + capitalize(b);
                case 2 -> base = capitalize(a) + b;
                case 3 -> base = a + "_" + b;
                case 4 -> base = a + b;
                default -> base = capitalize(a) + "_" + capitalize(b);
            }

            if (generateNumbers) {
                int digitsCount = RANDOM.nextInt(1, 4);
                StringBuilder suffix = new StringBuilder(digitsCount);
                for (int d = 0; d < digitsCount; d++) {
                    suffix.append(RANDOM.nextInt(0, 10));
                }
                base += suffix;
            }

            String name = cutToMaxLen(base);
            String normalized = AltStorage.normalizeNickname(name);
            if (normalized != null && !AltStorage.containsIgnoreCase(normalized)) {
                return normalized;
            }
        }
        StringBuilder fallback = new StringBuilder("Proxy");
        if (generateNumbers) {
            int fallbackDigits = RANDOM.nextInt(1, 4);
            for (int i = 0; i < fallbackDigits; i++) {
                fallback.append(RANDOM.nextInt(0, 10));
            }
        }
        return fallback.toString();
    }

    private String capitalize(String value) {
        if (value.isEmpty()) {
            return value;
        }
        return Character.toUpperCase(value.charAt(0)) + value.substring(1).toLowerCase();
    }

    private void reloadAlts() {
        alts.clear();
        alts.addAll(AltStorage.getAlts());
        alts.sort((a, b) -> {
            boolean af = AltStorage.isFavorite(a.getName());
            boolean bf = AltStorage.isFavorite(b.getName());
            if (af != bf) {
                return af ? -1 : 1;
            }
            return Long.compare(b.getCreatedAt(), a.getCreatedAt());
        });

        Iterator<String> iterator = cardActionAnimations.keySet().iterator();
        while (iterator.hasNext()) {
            String key = iterator.next();
            boolean exists = alts.stream().anyMatch(entry -> entry.getName().equalsIgnoreCase(key));
            if (!exists) {
                iterator.remove();
            }
        }

        cardAppearAnimations.keySet().removeIf(key -> alts.stream().noneMatch(entry -> entry.getName().equalsIgnoreCase(key)));
        cardFavoriteAnimations.keySet().removeIf(key -> alts.stream().noneMatch(entry -> entry.getName().equalsIgnoreCase(key)));
        targetScroll = MathHelper.clamp(targetScroll, 0f, Math.max(0f, getContentHeight() - listH));
    }

    private void showInfo(String text) {
        infoText = text;
        infoUntil = System.currentTimeMillis() + 1900L;
        infoFade.show();
    }

    private void updateLayout(float viewportW, float viewportH) {
        float baseGap = 14;
        float baseLeftW = 380f;
        float baseRightW = 500f;
        float baseH = 700f;
        float availableW = Math.max(120f, viewportW - 24f);
        float availableH = Math.max(120f, viewportH - 24f);
        float scaleByW = availableW / (baseLeftW + baseGap + baseRightW);
        float scaleByH = availableH / baseH;
        uiScale = Math.max(0.55f, Math.min(1f, Math.min(scaleByW, scaleByH)));

        float gap = s(baseGap);
        leftW = s(baseLeftW);
        rightW = s(baseRightW);
        leftH = s(baseH);
        rightH = leftH;

        float totalW = leftW + gap + rightW;
        leftX = (viewportW - totalW) * 0.5f;
        leftY = (viewportH - leftH) * 0.5f;
        rightX = leftX + leftW + gap;
        rightY = leftY;

        inputX = leftX + s(24f);
        inputY = leftY + s(172f);
        inputW = leftW - s(48f);
        inputH = s(48f);
        numberToggleX = inputX;
        numberToggleY = inputY + inputH + s(10f);
        numberToggleW = inputW;
        numberToggleH = s(26f);

        float bottomPad = s(28f);
        float rowGap = s(16f);
        saveW = (leftW - s(56f)) * 0.5f;
        saveH = s(44f);
        genW = saveW;
        genH = saveH;
        saveX = leftX + s(24f);
        genX = saveX + saveW + s(8f);
        saveY = leftY + leftH - (saveH * 2f + rowGap + bottomPad);
        genY = saveY;

        backW = leftW - s(48f);
        backH = s(44f);
        backX = leftX + s(24f);
        backY = saveY + saveH + rowGap;
    }

    private boolean isInside(float mx, float my, float x, float y, float w, float h) {
        return mx >= x && mx <= x + w && my >= y && my <= y + h;
    }

    private float getMouseX(float viewportWidth) {
        var window = mc.getWindow();
        return (float) (mc.mouse.getX() * (double) viewportWidth / (double) window.getWidth());
    }

    private float getMouseY(float viewportHeight) {
        var window = mc.getWindow();
        return (float) (mc.mouse.getY() * (double) viewportHeight / (double) window.getHeight());
    }

    private void applyMenuFpsCap() {
        if (mc == null || mc.options == null || mc.options.getMaxFps() == null) {
            return;
        }
        int current = mc.options.getMaxFps().getValue();
        if (previousMaxFps == null) {
            previousMaxFps = current;
        }
        if (current < 120) {
            mc.options.getMaxFps().setValue(120);
        }
    }

    private void restorePreviousFpsCap() {
        if (previousMaxFps == null || mc == null || mc.options == null || mc.options.getMaxFps() == null) {
            return;
        }
        mc.options.getMaxFps().setValue(previousMaxFps);
        previousMaxFps = null;
    }

    private static boolean isNicknameChar(char c) {
        return (c >= 'a' && c <= 'z')
                || (c >= 'A' && c <= 'Z')
                || (c >= '0' && c <= '9')
                || c == '_';
    }

    private static boolean hasControlDown(int modifiers) {
        return (modifiers & GLFW.GLFW_MOD_CONTROL) != 0;
    }

    private static String sanitizeNicknameCharacters(String input) {
        if (input == null || input.isEmpty()) {
            return "";
        }
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            if (isNicknameChar(c)) {
                builder.append(c);
                if (builder.length() >= INPUT_MAX_LENGTH) {
                    break;
                }
            }
        }
        return builder.toString();
    }

    private static String cutToMaxLen(String value) {
        if (value == null) {
            return "";
        }
        return value.length() <= INPUT_MAX_LENGTH ? value : value.substring(0, INPUT_MAX_LENGTH);
    }

    private void drawText(Renderer2D renderer, FontObject font, float x, float yTop, float size, String text, int color) {
        float baseline = centerBaseline(font, yTop + size * 0.5f, size);
        renderer.text(font, snap(x), baseline, size, text, withGlobalTextAlpha(color));
    }

    private float s(float value) {
        return value * uiScale;
    }

    private float snap(float value) {
        return (float) Math.round(value);
    }

    private float centerBaseline(FontObject font, float centerY, float size) {
        return centerY + FontRegistry.centeredBaselineOffset(font, 'H', size);
    }

    private float t(float value) {
        return s(value * TEXT_SCALE_MULTIPLIER);
    }

    private int withGlobalTextAlpha(int color) {
        float t = textFade.getProgress();
        int a = (color >>> 24) & 0xFF;
        int scaled = MathHelper.clamp((int) (a * t), 0, 255);
        return (scaled << 24) | (color & 0x00FFFFFF);
    }

    private int withUiAlpha(int color) {
        return applyAlphaFactor(color, uiFade.getProgress());
    }

    private int applyAlphaFactor(int color, float factor) {
        int a = (color >>> 24) & 0xFF;
        int scaled = MathHelper.clamp((int) (a * MathHelper.clamp(factor, 0f, 1f)), 0, 255);
        return (scaled << 24) | (color & 0x00FFFFFF);
    }

    private int withAlpha(int rgb, int alpha) {
        return (MathHelper.clamp(alpha, 0, 255) << 24) | (rgb & 0x00FFFFFF);
    }

    private int darken(int color, float factor) {
        int a = (color >>> 24) & 0xFF;
        int r = (color >>> 16) & 0xFF;
        int g = (color >>> 8) & 0xFF;
        int b = color & 0xFF;
        r = Math.round(r * (1f - factor));
        g = Math.round(g * (1f - factor));
        b = Math.round(b * (1f - factor));
        return (a << 24) | (MathHelper.clamp(r, 0, 255) << 16) | (MathHelper.clamp(g, 0, 255) << 8) | MathHelper.clamp(b, 0, 255);
    }

    private int brighten(int color, int amount) {
        int a = (color >>> 24) & 0xFF;
        int r = MathHelper.clamp(((color >>> 16) & 0xFF) + amount, 0, 255);
        int g = MathHelper.clamp(((color >>> 8) & 0xFF) + amount, 0, 255);
        int b = MathHelper.clamp((color & 0xFF) + amount, 0, 255);
        return (a << 24) | (r << 16) | (g << 8) | b;
    }

    private int blend(int c1, int c2, float t) {
        t = MathHelper.clamp(t, 0f, 1f);
        int a1 = (c1 >>> 24) & 0xFF;
        int r1 = (c1 >>> 16) & 0xFF;
        int g1 = (c1 >>> 8) & 0xFF;
        int b1 = c1 & 0xFF;
        int a2 = (c2 >>> 24) & 0xFF;
        int r2 = (c2 >>> 16) & 0xFF;
        int g2 = (c2 >>> 8) & 0xFF;
        int b2 = c2 & 0xFF;
        int a = (int) (a1 + (a2 - a1) * t);
        int r = (int) (r1 + (r2 - r1) * t);
        int g = (int) (g1 + (g2 - g1) * t);
        int b = (int) (b1 + (b2 - b1) * t);
        return (a << 24) | (r << 16) | (g << 8) | b;
    }

    private static final class CardBounds {
        private final String nickname;
        private final float x;
        private final float y;
        private final float w;
        private final float h;
        private final float deleteX;
        private final float deleteY;
        private final float deleteW;
        private final float deleteH;
        private final float copyX;
        private final float copyY;
        private final float copyW;
        private final float copyH;
        private final float favoriteX;
        private final float favoriteY;
        private final float favoriteW;
        private final float favoriteH;
        private final boolean actionsVisible;

        private CardBounds(String nickname, float x, float y, float w, float h, float deleteX, float deleteY, float deleteW, float deleteH, float copyX, float copyY, float copyW, float copyH, float favoriteX, float favoriteY, float favoriteW, float favoriteH, boolean actionsVisible) {
            this.nickname = nickname;
            this.x = x;
            this.y = y;
            this.w = w;
            this.h = h;
            this.deleteX = deleteX;
            this.deleteY = deleteY;
            this.deleteW = deleteW;
            this.deleteH = deleteH;
            this.copyX = copyX;
            this.copyY = copyY;
            this.copyW = copyW;
            this.copyH = copyH;
            this.favoriteX = favoriteX;
            this.favoriteY = favoriteY;
            this.favoriteW = favoriteW;
            this.favoriteH = favoriteH;
            this.actionsVisible = actionsVisible;
        }

        private boolean inCard(float mx, float my) {
            return mx >= x && mx <= x + w && my >= y && my <= y + h;
        }

        private boolean inDelete(float mx, float my) {
            return mx >= deleteX && mx <= deleteX + deleteW && my >= deleteY && my <= deleteY + deleteH;
        }

        private boolean inCopy(float mx, float my) {
            return mx >= copyX && mx <= copyX + copyW && my >= copyY && my <= copyY + copyH;
        }

        private boolean inFavorite(float mx, float my) {
            return mx >= favoriteX && mx <= favoriteX + favoriteW && my >= favoriteY && my <= favoriteY + favoriteH;
        }
    }

    private static final class MenuShaderBackground {
        private ShaderProgram program;
        private int vao;
        private int vbo;
        private int positionLoc = -1;
        private int uvLoc = -1;
        private int colorLoc = -1;
        private int modelViewLoc = -1;
        private int projectionLoc = -1;
        private int timeLoc = -1;
        private int speedLoc = -1;
        private int accentLoc = -1;
        private int alphaLoc = -1;
        private boolean initFailed;

        boolean render(int accentColor, float alpha) {
            if (!ensureInit()) {
                return false;
            }

            float[] vertices = {
                    -1f, -1f, 0f, 0f, 0f, 1f, 1f, 1f, 1f,
                    1f, -1f, 0f, 1f, 0f, 1f, 1f, 1f, 1f,
                    1f, 1f, 0f, 1f, 1f, 1f, 1f, 1f, 1f,
                    -1f, -1f, 0f, 0f, 0f, 1f, 1f, 1f, 1f,
                    1f, 1f, 0f, 1f, 1f, 1f, 1f, 1f, 1f,
                    -1f, 1f, 0f, 0f, 1f, 1f, 1f, 1f, 1f
            };

            GlState.Snapshot snapshot = GlState.push();
            try (MemoryStack stack = MemoryStack.stackPush()) {
                GL11.glDisable(GL11.GL_CULL_FACE);
                GL11.glDisable(GL11.GL_DEPTH_TEST);
                GL11.glDisable(GL11.GL_SCISSOR_TEST);
                GL11.glEnable(GL11.GL_BLEND);
                GL11.glBlendFunc(GL11.GL_SRC_ALPHA, GL11.GL_ONE_MINUS_SRC_ALPHA);
                if (mc != null && mc.getWindow() != null) {
                    GL11.glViewport(0, 0, mc.getWindow().getFramebufferWidth(), mc.getWindow().getFramebufferHeight());
                }

                program.use();
                Matrix4f identity = new Matrix4f();
                if (modelViewLoc >= 0) {
                    FloatBuffer modelBuf = stack.mallocFloat(16);
                    identity.get(modelBuf);
                    GL20.glUniformMatrix4fv(modelViewLoc, false, modelBuf);
                }
                if (projectionLoc >= 0) {
                    FloatBuffer projBuf = stack.mallocFloat(16);
                    identity.get(projBuf);
                    GL20.glUniformMatrix4fv(projectionLoc, false, projBuf);
                }
                if (timeLoc >= 0) {
                    GL20.glUniform1f(timeLoc, (System.currentTimeMillis() - SharedBackgroundParticles.SHADER_START_TIME_MS) / 1000.0f);
                }
                if (speedLoc >= 0) {
                    GL20.glUniform1f(speedLoc, 0.9f);
                }
                if (accentLoc >= 0) {
                    float r = ((accentColor >> 16) & 0xFF) / 255.0f;
                    float g = ((accentColor >> 8) & 0xFF) / 255.0f;
                    float b = (accentColor & 0xFF) / 255.0f;
                    GL20.glUniform4f(accentLoc, r, g, b, 1.0f);
                }
                if (alphaLoc >= 0) {
                    GL20.glUniform1f(alphaLoc, Math.max(0f, Math.min(1f, alpha)));
                }

                GL30.glBindVertexArray(vao);
                GL15.glBindBuffer(GL15.GL_ARRAY_BUFFER, vbo);
                GL15.glBufferData(GL15.GL_ARRAY_BUFFER, vertices, GL15.GL_STREAM_DRAW);
                GL11.glDrawArrays(GL11.GL_TRIANGLES, 0, 6);
                return true;
            } catch (Exception ignored) {
                return false;
            } finally {
                GlState.pop(snapshot);
            }
        }

        private boolean ensureInit() {
            if (initFailed) {
                return false;
            }
            if (program != null) {
                return true;
            }
            try {
                program = ShaderProgram.fromResources(
                        "assets/nexis/shaders/core/menu_background.vsh",
                        "assets/nexis/shaders/core/menu_background.fsh"
                );
                positionLoc = GL20.glGetAttribLocation(program.id(), "Position");
                uvLoc = GL20.glGetAttribLocation(program.id(), "UV");
                colorLoc = GL20.glGetAttribLocation(program.id(), "Color");
                modelViewLoc = program.getUniformLocation("ModelViewMat");
                projectionLoc = program.getUniformLocation("ProjMat");
                timeLoc = program.getUniformLocation("Time");
                speedLoc = program.getUniformLocation("Speed");
                accentLoc = program.getUniformLocation("AccentColor");
                alphaLoc = program.getUniformLocation("Alpha");

                vao = GL30.glGenVertexArrays();
                vbo = GL15.glGenBuffers();
                GL30.glBindVertexArray(vao);
                GL15.glBindBuffer(GL15.GL_ARRAY_BUFFER, vbo);
                int stride = 9 * Float.BYTES;
                if (positionLoc >= 0) {
                    GL20.glEnableVertexAttribArray(positionLoc);
                    GL20.glVertexAttribPointer(positionLoc, 3, GL11.GL_FLOAT, false, stride, 0L);
                }
                if (uvLoc >= 0) {
                    GL20.glEnableVertexAttribArray(uvLoc);
                    GL20.glVertexAttribPointer(uvLoc, 2, GL11.GL_FLOAT, false, stride, 3L * Float.BYTES);
                }
                if (colorLoc >= 0) {
                    GL20.glEnableVertexAttribArray(colorLoc);
                    GL20.glVertexAttribPointer(colorLoc, 4, GL11.GL_FLOAT, false, stride, 5L * Float.BYTES);
                }
                GL30.glBindVertexArray(0);
                GL15.glBindBuffer(GL15.GL_ARRAY_BUFFER, 0);
                return true;
            } catch (Exception ignored) {
                initFailed = true;
                return false;
            }
        }
    }
}



