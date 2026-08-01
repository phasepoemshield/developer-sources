package fun.nexisdlc.ui.screen;

import fun.nexisdlc.ClientContainer;
import fun.nexisdlc.Nexis;
import fun.nexisdlc.client.ClientColors;
import fun.nexisdlc.client.utils.config.AltStorage;
import fun.nexisdlc.client.events.impl.render.EventRender;
import fun.nexisdlc.client.utils.eventbus.EventHandler;
import fun.nexisdlc.client.utils.render.color.basic.ColorUtils;
import fun.nexisdlc.client.utils.render.main.core.Renderer2D;
import fun.nexisdlc.client.utils.render.main.gl.GlState;
import fun.nexisdlc.client.utils.render.main.gl.ShaderProgram;
import fun.nexisdlc.client.utils.render.main.text.FontRegistry;
import net.minecraft.client.gui.DrawContext;
import net.minecraft.client.gui.Click;
import net.minecraft.client.gui.screen.Screen;
import net.minecraft.client.gui.screen.multiplayer.MultiplayerScreen;
import net.minecraft.client.gui.screen.option.OptionsScreen;
import net.minecraft.client.gui.screen.world.SelectWorldScreen;
import net.minecraft.text.Text;
import org.joml.Matrix4f;
import org.lwjgl.opengl.GL11;
import org.lwjgl.opengl.GL15;
import org.lwjgl.opengl.GL20;
import org.lwjgl.opengl.GL30;
import org.lwjgl.system.MemoryStack;

import java.awt.*;
import java.nio.FloatBuffer;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

import static fun.nexisdlc.client.utils.client.IMinecraft.mc;

public class MainMenuScreen extends Screen {
    private static final float MENU_SCALE = 0.9f;
    private static final String ALERT_TITLE = "Внимание";
    private static final String ALERT_MESSAGE = "Наш телеграмм канал @NexisDlcFun был взломан. А так-же аккаунт владельца клиента @sterford был взломан. Просьба перейти всех в наш новый канал @NexisNew . А так-же вступить в новую группу можно попросив ссылку у @ItsReallySterford";

    public static final MenuShaderBackground MENU_SHADER = new MenuShaderBackground();

    private final List<ButtonComponent> buttons = new ArrayList<>();
    private Integer previousMaxFps;

    int ticks = 0;
    private float panelX;
    private float panelY;
    private float panelW;
    private float panelH;
    private float panelHeaderH;
    private float bannerX;
    private float bannerY;
    private float bannerW;
    private float bannerH;

    public MainMenuScreen() {
        super(Text.of("Main Menu"));
    }

    @Override
    protected void init() {
        AltStorage.applyLastSelectedAltSession();
        applyMenuFpsCap();
        buttons.clear();
        buttons.add(new ButtonComponent("Одиночная игра", () -> mc.setScreen(new SelectWorldScreen(this))));
        buttons.add(new ButtonComponent("Онлайн игра", () -> mc.setScreen(new MultiplayerScreen(this))));
        buttons.add(new ButtonComponent("Аккаунты", () -> mc.setScreen(new AltManagerScreen(this))));
        buttons.add(new ButtonComponent("Настройки", () -> mc.setScreen(new OptionsScreen(this, mc.options))));
        buttons.add(new ButtonComponent("Выйти", mc::stop));

        updateLayout();
    }

    private void updateLayout() {
        float sw = (float) mc.getWindow().getFramebufferWidth();
        float sh = (float) mc.getWindow().getFramebufferHeight();

        panelW = scaled(450f);
        bannerW = Math.min(scaled(760f), sw - scaled(48f));

        float headerH = scaled(85f);
        panelHeaderH = headerH;
        float padding = clamp(panelW * 0.08f, scaled(18f), scaled(28f));
        float btnH = scaled(48f);
        float spacing = clamp(sh * 0.016f * MENU_SCALE, scaled(5f), scaled(9f));
        float bannerTopOffset = scaled(22f);
        float bannerInnerPadding = scaled(16f);
        float bannerTitleSize = scaled(17f);
        float bannerTextSize = scaled(13f);
        float bannerLineHeight = bannerTextSize + scaled(6f);
        List<String> bannerLines = wrapText(ALERT_MESSAGE, bannerW - bannerInnerPadding * 2f, bannerTextSize);
        bannerH = bannerInnerPadding * 2f + bannerTitleSize + scaled(10f) + bannerLines.size() * bannerLineHeight;

        int regularButtonsCount = Math.max(0, buttons.size() - 2);
        float regularButtonSpace = regularButtonsCount > 0 ? (btnH * regularButtonsCount) + (spacing * (regularButtonsCount - 1)) : 0;

        float bottomRowSpace = btnH;

        panelH = headerH + regularButtonSpace + spacing + bottomRowSpace + padding * 0.9f;

        panelX = (sw - panelW) * 0.5f;
        panelY = bannerTopOffset + bannerH + scaled(26f);
        float centeredPanelY = (sh - panelH) * 0.5f;
        if (panelY < centeredPanelY) {
            panelY = centeredPanelY;
        }
        bannerX = (sw - bannerW) * 0.5f;
        bannerY = panelY - bannerH - scaled(22f);

        float startY = panelY + headerH;

        for (int i = 0; i < regularButtonsCount; i++) {
            float btnW = panelW - padding * 2f;
            float centerX = panelX + (panelW - btnW) * 0.5f;
            buttons.get(i).setBounds(centerX, startY + i * (btnH + spacing), btnW, btnH);
        }

        if (buttons.size() >= 2) {
            ButtonComponent settingsBtn = buttons.get(buttons.size() - 2);
            ButtonComponent exitBtn = buttons.get(buttons.size() - 1);
            
            float combinedPadding = scaled(16f);
            float gap = scaled(16f);
            float availableWidth = panelW - combinedPadding - gap;
            float halfBtnW = (availableWidth) / 2f - scaled(16f);
            
            float yPos = startY + regularButtonSpace + spacing;

            settingsBtn.setBounds(panelX + combinedPadding / 2f + scaled(20f), yPos, halfBtnW, btnH);

            exitBtn.setBounds(panelX + combinedPadding / 2f + halfBtnW + gap + scaled(12f), yPos, halfBtnW, btnH);
        }
    }

    @Override
    public void tick() {
        SharedBackgroundParticles.tick();
    }

    @EventHandler
    public void onRender(EventRender.Screen.Gui event) {
        if (mc.currentScreen != this || ticks < 19) return;

        updateLayout();
        Renderer2D renderer = event.getRenderer();

        float bgAlpha = SharedBackgroundParticles.getBackgroundFadeAlpha();

        boolean shaderRendered = MENU_SHADER.render(ClientColors.GRADIENT_START.getRGB(), bgAlpha);
        if (!shaderRendered) {
            int a = (int)(bgAlpha * 255);
            renderer.gradient(0f, 0f, event.getViewportWidth(), event.getViewportHeight(),
                    brighten(darken(withAlpha(ClientColors.GRADIENT_START.getRGB(), a), 0.85f), 4),
                    brighten(darken(withAlpha(ClientColors.ICON.getRGB(), a), 0.88f), 4),
                    brighten(darken(withAlpha(ClientColors.GRADIENT_END.getRGB(), a), 0.65f), 4),
                    brighten(darken(withAlpha(ClientColors.BACKGROUND.getRGB(), a), 0.89f), 4));
            renderer.flush();
        } else {
            renderer.flush();
        }
        renderer.prepareBlurForced(8f);
    }

    @EventHandler
    public void onRender(EventRender.Screen.OverGui event) {
        if (mc.currentScreen != this || ticks < 19) return;

        var window = mc.getWindow();
        updateLayout();
        Renderer2D renderer = event.getRenderer();

        float fade = SharedBackgroundParticles.getBackgroundFadeAlpha();
        renderer.pushAlpha(fade);

        float sh = event.getViewportHeight();
        float mx = getMouseX(window, event.getViewportWidth());
        float my = getMouseY(window, event.getViewportHeight());

        renderTitle(renderer, sh);
        //  renderAlertBanner(renderer);

        for (ButtonComponent btn : buttons) {
            btn.render(renderer, FontRegistry.INTER, mx, my);
        }
        renderSelectedNickInfo(renderer, sh);

        renderer.popAlpha();
    }

    private void renderAlertBanner(Renderer2D renderer) {
        float outerRadius = scaled(14f);
        float innerRadius = scaled(12f);
        float innerPadding = scaled(16f);
        float accentW = scaled(5f);
        float titleSize = scaled(17f);
        float textSize = scaled(16);
        float lineHeight = textSize + scaled(6f);

        int outlineColor = withAlpha(brighten(ClientColors.GRADIENT_START.getRGB(), 28), 115);
        int panelColor = withAlpha(darken(ClientColors.BACKGROUND.getRGB(), 0.22f), 162);
        int glowColor = withAlpha(ClientColors.GRADIENT_END.getRGB(), 36);
        int accentColor = withAlpha(ClientColors.GRADIENT_START.getRGB(), 230);
        int titleColor = 0xFFF7FAFF;
        int textColor = ColorUtils.rgba(220, 228, 240, 235);
        int mentionColor = ClientColors.TEXT.getRGB();

        renderer.rect(bannerX - scaled(6f), bannerY - scaled(6f), bannerW + scaled(12f), bannerH + scaled(12f), outerRadius + scaled(4f), glowColor);
        renderer.rectOutline(bannerX, bannerY, bannerW, bannerH, outerRadius, outlineColor, 1);
        renderer.rect(bannerX, bannerY, bannerW, bannerH, outerRadius, panelColor);
        renderer.rect(bannerX + scaled(9f), bannerY + scaled(9f), accentW, bannerH - scaled(18f), innerRadius, accentColor);

        float contentX = bannerX + innerPadding + scaled(12f) + accentW;
        float titleBaseline = bannerY + innerPadding + FontRegistry.centeredBaselineOffset(FontRegistry.INTER, 'H', titleSize);
        renderer.text(FontRegistry.INTER, contentX, titleBaseline + 2, titleSize, ALERT_TITLE, titleColor);

        float textY = titleBaseline + scaled(30);
        for (String line : wrapText(ALERT_MESSAGE, bannerW - (contentX - bannerX) - innerPadding, textSize)) {
            drawRichLine(renderer, line, contentX, textY, textSize, textColor, mentionColor);
            textY += lineHeight;
        }
    }

    private void drawRichLine(Renderer2D renderer, String line, float x, float baseline, float textSize, int textColor, int mentionColor) {
        float drawX = x;
        for (String part : line.split(" ")) {
            if (part.isEmpty()) {
                continue;
            }
            String word = part + " ";
            int color = part.startsWith("@") ? mentionColor : textColor;
            renderer.text(FontRegistry.INTER, drawX, baseline, textSize, word, color);
            drawX += FontRegistry.INTER.getWidth(word, textSize);
        }
    }

    private List<String> wrapText(String text, float maxWidth, float textSize) {
        List<String> lines = new ArrayList<>();
        String[] words = text.split(" ");
        StringBuilder currentLine = new StringBuilder();

        for (String word : words) {
            String candidate = currentLine.length() == 0 ? word : currentLine + " " + word;
            if (FontRegistry.INTER.getWidth(candidate, textSize) <= maxWidth || currentLine.length() == 0) {
                if (currentLine.length() != 0) {
                    currentLine.append(' ');
                }
                currentLine.append(word);
            } else {
                lines.add(currentLine.toString());
                currentLine = new StringBuilder(word);
            }
        }

        if (currentLine.length() != 0) {
            lines.add(currentLine.toString());
        }
        return lines;
    }

    private void renderTitle(Renderer2D renderer, float sh) {
        float titleSize = scaled(24f);
        float subtitleSize = scaled(20f);
        float titleX = panelX + panelW * 0.5f;
        float headerCenter = panelY + panelHeaderH * 0.5f;
        float titleY = headerCenter - subtitleSize * 0.25f;
        float subtitleY = headerCenter + titleSize * 0.35f;
        float titleBaseline = titleY + FontRegistry.centeredBaselineOffset(FontRegistry.INTER, 'H', titleSize) - scaled(7f);
        float subtitleBaseline = subtitleY + scaled(6f) + FontRegistry.centeredBaselineOffset(FontRegistry.INTER, 'H', subtitleSize) + scaled(4f);

        int startColor = ClientColors.GRADIENT_START.getRGB();
        int endColor = ClientColors.GRADIENT_END.getRGB();
        String titleText = "Добро пожаловать,";
        SimpleDateFormat dateFormat = new SimpleDateFormat("EEEE dd MMMM", Locale.ENGLISH);
        String dateString = dateFormat.format(new Date());
        String subtitleText = "Билд от " + ClientContainer.getBuildDate();

        float titleWidth = FontRegistry.INTER.getWidth(titleText, titleSize);
        float subtitleWidth = FontRegistry.INTER.getWidth(subtitleText, subtitleSize);
        String username = ClientContainer.getUser();
        float usernameWidth = FontRegistry.INTER.getWidth(username, titleSize);
        float padding = scaled(4f);
        float combinedWidth = titleWidth + padding + usernameWidth;

        renderer.text(FontRegistry.INTER, titleX - combinedWidth * 0.5f, titleBaseline, titleSize, titleText, 0xFFFFFFFF);

        float usernameX = titleX - combinedWidth * 0.5f + titleWidth + padding;

        Color animStartColor = fun.nexisdlc.client.utils.render.color.ColorUtils.gradient(ClientColors.GRADIENT_START, ClientColors.GRADIENT_END, 4, 0);
        Color animEndColor = fun.nexisdlc.client.utils.render.color.ColorUtils.gradient(ClientColors.GRADIENT_END, ClientColors.GRADIENT_START, 4, 90);

        renderer.gradientText(FontRegistry.INTER, usernameX, titleBaseline, titleSize, username, animStartColor.getRGB(), animEndColor.getRGB());

        renderer.text(FontRegistry.INTER, titleX - subtitleWidth * 0.5f, subtitleBaseline, subtitleSize, subtitleText, ColorUtils.rgb(182,182,182));
    }

    private void renderSelectedNickInfo(Renderer2D renderer, float sh) {
        if (buttons.isEmpty()) {
            return;
        }

        ButtonComponent exitButton = buttons.get(buttons.size() - 1);
        String selectedNick = mc.getSession() != null ? mc.getSession().getUsername() : "не выбран";
        String infoText = "Текущий никнейм: "
                + (Nexis.getFunctionManager().getStreamerMode().isState()
                && Nexis.getFunctionManager().getStreamerMode().nameProtect.get()
                ? Nexis.getFunctionManager().getStreamerMode().nameProtectName.get() :  selectedNick);

        float fontSize = clamp(sh * 0.0155f * MENU_SCALE, scaled(11f), scaled(15f));
        float y = exitButton.y + exitButton.h + clamp(sh * 0.018f * MENU_SCALE, scaled(10f), scaled(18f));
        float baseline = y + FontRegistry.centeredBaselineOffset(FontRegistry.INTER, 'H', fontSize);

        renderer.centredText(
                FontRegistry.INTER,
                panelX + panelW * 0.5f,
                baseline,
                fontSize,
                infoText,
                ColorUtils.rgba(230, 236, 248, 210)
        );
    }

    @Override
    public boolean mouseClicked(Click click, boolean isRepeated) {
        var window = mc.getWindow();
        float rawX = getMouseX(window, window.getFramebufferWidth());
        float rawY = getMouseY(window, window.getFramebufferHeight());
        for (ButtonComponent btn : buttons) {
            if (btn.isHovered(rawX, rawY)) {
                btn.onClick.run();
                return true;
            }
        }
        return super.mouseClicked(click, isRepeated);
    }

    @Override
    public void removed() {
        restorePreviousFpsCap();
        super.removed();
    }

    @Override
    public void renderBackground(DrawContext context, int mouseX, int mouseY, float delta) {
        if (mc.currentScreen != this) ticks = 0;
        ticks++;
    }

    @Override protected void renderDarkening(DrawContext context) {}
    @Override protected void applyBlur(DrawContext context) {}

    private float getMouseX(net.minecraft.client.util.Window window, float viewportWidth) {
        return (float) (mc.mouse.getX() * (double) viewportWidth / (double) window.getWidth());
    }

    private float getMouseY(net.minecraft.client.util.Window window, float viewportHeight) {
        return (float) (mc.mouse.getY() * (double) viewportHeight / (double) window.getHeight());
    }

    private static float clamp(float value, float min, float max) {
        return Math.max(min, Math.min(max, value));
    }

    private static float scaled(float value) {
        return value * MENU_SCALE;
    }

    private static int withAlpha(int rgb, int alpha) {
        int a = Math.max(0, Math.min(255, alpha));
        return (a << 24) | (rgb & 0x00FFFFFF);
    }

    private static int darken(int color, float factor) {
        int a = (color >>> 24) & 0xFF;
        int r = (color >>> 16) & 0xFF;
        int g = (color >>> 8) & 0xFF;
        int b = color & 0xFF;
        r = Math.round(r * (1f - factor));
        g = Math.round(g * (1f - factor));
        b = Math.round(b * (1f - factor));
        return (a << 24) | (Math.max(0, Math.min(255, r)) << 16) | (Math.max(0, Math.min(255, g)) << 8) | Math.max(0, Math.min(255, b));
    }

    private static int brighten(int color, int amount) {
        int a = (color >>> 24) & 0xFF;
        int r = Math.max(0, Math.min(255, ((color >>> 16) & 0xFF) + amount));
        int g = Math.max(0, Math.min(255, ((color >>> 8) & 0xFF) + amount));
        int b = Math.max(0, Math.min(255, (color & 0xFF) + amount));
        return (a << 24) | (r << 16) | (g << 8) | b;
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

    public static final class MenuShaderBackground {
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

        public boolean render(int accentColor, float alpha) {
            return renderInternal(accentColor, alpha, true);
        }

        public boolean renderNoStateSave(int accentColor, float alpha) {
            return renderInternal(accentColor, alpha, false);
        }

        private boolean renderInternal(int accentColor, float alpha, boolean saveState) {
            if (!ensureInit()) {
                return false;
            }

            float[] vertices = {
                    -1f, -1f, 0f, 0f, 0f, 1f, 1f, 1f, 1f,
                     1f, -1f, 0f, 1f, 0f, 1f, 1f, 1f, 1f,
                     1f,  1f, 0f, 1f, 1f, 1f, 1f, 1f, 1f,
                    -1f, -1f, 0f, 0f, 0f, 1f, 1f, 1f, 1f,
                     1f,  1f, 0f, 1f, 1f, 1f, 1f, 1f, 1f,
                    -1f,  1f, 0f, 0f, 1f, 1f, 1f, 1f, 1f
            };

            GlState.Snapshot snapshot = saveState ? GlState.push() : null;
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
                if (snapshot != null) {
                    GlState.pop(snapshot);
                }
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
