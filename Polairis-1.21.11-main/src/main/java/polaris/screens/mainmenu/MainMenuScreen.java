package polaris.screens.mainmenu;

import com.mojang.authlib.GameProfile;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiGraphics;
import net.minecraft.client.gui.screens.Screen;
import net.minecraft.client.gui.screens.options.OptionsScreen;
import net.minecraft.client.gui.screens.worldselection.SelectWorldScreen;
import net.minecraft.client.input.MouseButtonEvent;
import net.minecraft.client.resources.DefaultPlayerSkin;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.Identifier;
import net.minecraft.world.entity.player.PlayerSkin;
import org.lwjgl.glfw.GLFW;
import polaris.utils.render.color.ColorUtil;
import polaris.utils.render.ui.Render2D;
import polaris.utils.render.ui.font.FontType;
import polaris.utils.render.ui.gif.GifRenderer;
import polaris.utils.render.ui.gif.MainMenuGifPreloader;

import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.function.Supplier;

public final class MainMenuScreen extends Screen {
    private static final float REF_W = 960f;
    private static final float REF_H = 540f;

    private static final float BASE_BTN_H = 26f;
    private static final float BASE_BTN_GAP = 6f;
    private static final float BASE_BTN_R = 7f;
    private static final float BASE_PRIMARY_W = 210f;
    private static final float BASE_ROW_BTN_W = 64f;
    private static final float MAX_PRIMARY_FRAC = 0.28f;

    private final Minecraft mc = Minecraft.getInstance();
    private GifRenderer backgroundGif;

    private final List<MenuButton> buttons = new ArrayList<>();
    private float contentX;
    private float contentY;
    private float uiScale = 1f;
    private float lastDw = -1f;
    private float lastDh = -1f;

    private Supplier<PlayerSkin> skinLookup;
    private String cachedPlayerName = "Player";

    public MainMenuScreen() {
        super(Component.literal("Main Menu"));
    }

    @Override
    protected void init() {
        super.init();
        backgroundGif = MainMenuGifPreloader.background();
        if (backgroundGif != null && !backgroundGif.isReady() && !backgroundGif.isFailed()) {
            backgroundGif.ensureLoaded();
        }
        ensureSkinLookup();
        rebuildButtons();
    }

    @Override
    public void removed() {
        super.removed();
    }

    @Override
    public void onClose() {
    }

    private float designW() {
        return Render2D.getFixedScaledWidth();
    }

    private float designH() {
        return Render2D.getFixedScaledHeight();
    }

    private float mx(double guiX) {
        return (float) Render2D.guiToFixed(guiX);
    }

    private float my(double guiY) {
        return (float) Render2D.guiToFixed(guiY);
    }

    private float computeUiScale(float dw, float dh) {
        float s = Math.min(dw / REF_W, dh / REF_H);
        return Math.max(0.70f, Math.min(s, 1.20f));
    }

    private void ensureSkinLookup() {
        cachedPlayerName = playerName();
        try {
            var user = mc.getUser();
            if (user == null) {
                skinLookup = DefaultPlayerSkin::getDefaultSkin;
                return;
            }
            java.util.UUID uuid = user.getProfileId();
            String name = user.getName() != null ? user.getName() : "Player";
            GameProfile profile = new GameProfile(uuid, name);
            skinLookup = mc.getSkinManager().createLookup(profile, true);
        } catch (Throwable t) {
            skinLookup = DefaultPlayerSkin::getDefaultSkin;
        }
    }

    private void rebuildButtons() {
        buttons.clear();
        float dw = designW();
        float dh = designH();
        uiScale = computeUiScale(dw, dh);
        lastDw = dw;
        lastDh = dh;

        float s = uiScale;
        float btnH = BASE_BTN_H * s;
        float gap = BASE_BTN_GAP * s;
        float primaryW = Math.min(BASE_PRIMARY_W * s, dw * MAX_PRIMARY_FRAC);
        primaryW = Math.max(primaryW, 150f * s);

        contentX = Math.max(28f * s, dw * 0.065f);
        contentY = dh * 0.28f;

        float y = contentY + 66f * s;

        buttons.add(new MenuButton("multi", "Многопользовательская игра", contentX, y, primaryW, btnH, true, true, false));
        y += btnH + gap;
        buttons.add(new MenuButton("single", "Одиночная игра", contentX, y, primaryW, btnH, false, true, false));
        y += btnH + gap;
        buttons.add(new MenuButton("account", "Сменить аккаунт", contentX, y, primaryW, btnH, false, true, true));
        y += btnH + gap + 2f * s;

        float smallW = BASE_ROW_BTN_W * s;
        float smallH = Math.max(18f, btnH - 2f * s);
        float rowGap = 5f * s;
        buttons.add(new MenuButton("options", "Опции", contentX, y, smallW + 8f * s, smallH, false, false, false));
        buttons.add(new MenuButton("quit", "Выход",
                contentX + smallW + 8f * s + rowGap, y, smallW, smallH, false, false, false));
    }

    @Override
    public void render(GuiGraphics g, int mouseX, int mouseY, float partialTick) {
        float dw = designW();
        float dh = designH();
        float fmx = mx(mouseX);
        float fmy = my(mouseY);

        if (buttons.isEmpty() || Math.abs(dw - lastDw) > 0.5f || Math.abs(dh - lastDh) > 0.5f) {
            rebuildButtons();
        }

        Render2D.beginFrame(g);

        Render2D.rect(0, 0, dw, dh, 0f, ColorUtil.rgba(6, 8, 12, 255));
        if (backgroundGif != null) {
            backgroundGif.renderCover(0, 0, dw, dh, ColorUtil.rgba(255, 255, 255, 255));
        }

        Render2D.rect(0, 0, dw * 0.52f, dh, 0f,
                ColorUtil.rgba(0, 0, 0, 125),
                ColorUtil.rgba(0, 0, 0, 0),
                ColorUtil.rgba(0, 0, 0, 0),
                ColorUtil.rgba(0, 0, 0, 135));
        Render2D.rect(0, dh - 64f * uiScale, dw, 64f * uiScale, 0f, ColorUtil.rgba(0, 0, 0, 80));

        renderAccountChip();
        renderHero();
        renderButtons(fmx, fmy);
        renderFooter();

        Render2D.flush();
    }

    private void renderAccountChip() {
        String name = playerName();
        float s = uiScale;

        float pillX = 16f * s;
        float pillY = 12f * s;
        float pillH = 20f * s;
        float face = 14f * s;
        float nameSize = 7.5f * s;
        float nameW = Render2D.textWidth(FontType.SEMIBOLD, name, nameSize);
        float pillW = 7f * s + face + 6f * s + nameW + 10f * s;

        Render2D.rect(pillX, pillY, pillW, pillH, pillH * 0.5f, ColorUtil.rgba(0, 0, 0, 70));
        Render2D.outline(pillX, pillY, pillW, pillH, pillH * 0.5f, 0.5f, ColorUtil.rgba(255, 255, 255, 18));

        float faceX = pillX + 3f * s;
        float faceY = pillY + (pillH - face) * 0.5f;
        drawPlayerHead(faceX, faceY, face);

        Render2D.text(FontType.SEMIBOLD, name, faceX + face + 5f * s, pillY + (pillH - nameSize) * 0.48f, nameSize,
                ColorUtil.rgba(220, 222, 230, 240));
    }

    private void renderHero() {
        String name = playerName().toUpperCase(Locale.ROOT);
        float s = uiScale;
        float x = contentX;
        float y = contentY;

        Render2D.text(FontType.SEMIBOLD, "ДАВНО НЕ ВИДЕЛИСЬ, " + name + " !", x, y, 6f * s,
                ColorUtil.rgba(130, 160, 255, 210));

        y += 12f * s;
        Render2D.text(FontType.SEMIBOLD, "Приветствуем тебя в", x, y, 14.5f * s,
                ColorUtil.rgba(245, 246, 250, 255));
        y += 17f * s;
        Render2D.text(FontType.SEMIBOLD, "Polaris Client!", x, y, 16f * s,
                ColorUtil.rgba(255, 255, 255, 255));

        y += 20f * s;
        Render2D.text(FontType.REGULARNEW, "Есть план или доверимся случайному направлению?", x, y, 7.5f * s,
                ColorUtil.rgba(175, 178, 188, 200));
    }

    private void renderButtons(float mx, float my) {
        float s = uiScale;
        float radius = BASE_BTN_R * s;
        for (MenuButton b : buttons) {
            boolean hov = b.contains(mx, my);
            float blurR = hov ? 22f : 18f;
            if (b.primary) {
                int tint = hov
                        ? ColorUtil.rgba(100, 120, 245, 95)
                        : ColorUtil.rgba(90, 110, 230, 72);
                Render2D.blur(b.x, b.y, b.w, b.h, radius, blurR, 1.1f, tint);
                Render2D.rect(b.x, b.y, b.w, b.h, radius,
                        hov ? ColorUtil.rgba(120, 140, 255, 38) : ColorUtil.rgba(100, 120, 240, 22));
                Render2D.outline(b.x, b.y, b.w, b.h, radius, 0.65f,
                        ColorUtil.rgba(180, 195, 255, hov ? 90 : 55));
                float size = 9f * s;
                Render2D.text(FontType.SEMIBOLD, b.label,
                        b.x + 12f * s, b.y + (b.h - size) * 0.48f, size,
                        ColorUtil.rgba(255, 255, 255, 255));
                float chevron = 11f * s;
                Render2D.rect(b.x + b.w - 20f * s, b.y + (b.h - chevron) * 0.5f, chevron, chevron, 3.5f * s,
                        ColorUtil.rgba(255, 255, 255, 40));
            } else {
                int tint = hov
                        ? ColorUtil.rgba(255, 255, 255, 48)
                        : ColorUtil.rgba(0, 0, 0, 55);
                Render2D.blur(b.x, b.y, b.w, b.h, radius, blurR, 1.1f, tint);
                Render2D.rect(b.x, b.y, b.w, b.h, radius,
                        hov ? ColorUtil.rgba(255, 255, 255, 18) : ColorUtil.rgba(0, 0, 0, 28));
                Render2D.outline(b.x, b.y, b.w, b.h, radius, 0.6f,
                        ColorUtil.rgba(255, 255, 255, hov ? 55 : 28));
                float size = (b.wide ? 9f : 8f) * s;

                float textPadLeft = 12f * s;
                if (b.showHead) {
                    float face = Math.min(14f * s, b.h - 8f * s);
                    float faceX = b.x + b.w - face - 8f * s;
                    float faceY = b.y + (b.h - face) * 0.5f;
                    drawPlayerHead(faceX, faceY, face);
                }

                float tw = Render2D.textWidth(FontType.SEMIBOLD, b.label, size);
                float tx = b.wide ? b.x + textPadLeft : b.x + (b.w - tw) * 0.5f;
                Render2D.text(FontType.SEMIBOLD, b.label, tx, b.y + (b.h - size) * 0.48f, size,
                        ColorUtil.rgba(235, 237, 242, 245));
            }
        }
    }

    private void renderFooter() {
        float dh = designH();
        float s = uiScale;
        float x = contentX;
        float y = dh - 52f * s;

        Render2D.rect(x, y, 6f * s, 6f * s, 3f * s, ColorUtil.rgba(70, 210, 120, 255));
        Render2D.text(FontType.SEMIBOLD, "ALL SYSTEMS OPERATIONAL", x + 10f * s, y - 0.5f * s, 6.5f * s,
                ColorUtil.rgba(90, 200, 130, 220));

        y += 12f * s;
        Render2D.text(FontType.REGULARNEW,
                "Продукты Polaris Client не связаны с Mojang и Microsoft.",
                x, y, 6.5f * s, ColorUtil.rgba(140, 144, 155, 170));
        y += 10f * s;
        Render2D.text(FontType.REGULARNEW,
                "Не является официальным продуктом Minecraft.",
                x, y, 6.5f * s, ColorUtil.rgba(140, 144, 155, 150));

        if (backgroundGif != null && backgroundGif.isLoading()) {
            Render2D.text(FontType.REGULARNEW, "Loading background…", x, dh - 16f * s, 7f * s,
                    ColorUtil.rgba(180, 184, 195, 170));
        } else if (backgroundGif != null && backgroundGif.isFailed()) {
            Render2D.text(FontType.REGULARNEW, "GIF: " + backgroundGif.failReason(), x, dh - 16f * s, 7f * s,
                    ColorUtil.rgba(220, 120, 120, 200));
        }
    }

    private String playerName() {
        try {
            if (mc.getUser() != null && mc.getUser().getName() != null && !mc.getUser().getName().isBlank()) {
                return mc.getUser().getName();
            }
        } catch (Throwable ignored) {
        }
        return cachedPlayerName != null ? cachedPlayerName : "Player";
    }

    private void drawPlayerHead(float x, float y, float size) {
        float radius = Math.max(2.5f, size * 0.22f);
        try {
            if (mc.player != null) {
                String texture = mc.player.getSkin().body().texturePath().toString();
                drawSkinFace(texture, x, y, size, radius);
                return;
            }

            if (skinLookup == null) {
                ensureSkinLookup();
            }
            if (skinLookup != null) {
                PlayerSkin skin = skinLookup.get();
                if (skin != null && skin.body() != null) {
                    Identifier path = skin.body().texturePath();
                    if (path != null) {
                        drawSkinFace(path.toString(), x, y, size, radius);
                        return;
                    }
                }
            }

            try {
                java.util.UUID uuid = mc.getUser() != null ? mc.getUser().getProfileId() : null;
                PlayerSkin def = uuid != null ? DefaultPlayerSkin.get(uuid) : DefaultPlayerSkin.getDefaultSkin();
                if (def != null && def.body() != null) {
                    drawSkinFace(def.body().texturePath().toString(), x, y, size, radius);
                    return;
                }
            } catch (Throwable ignored) {
            }
        } catch (Throwable ignored) {
        }

        Render2D.rect(x, y, size, size, radius, ColorUtil.rgba(50, 54, 64, 230));
    }

    private void drawSkinFace(String texture, float x, float y, float size, float radius) {
        int col = ColorUtil.rgba(255, 255, 255, 255);
        Render2D.imageUvNearest(texture, x, y, size, size, radius, 0.8f,
                8f / 64f, 8f / 64f, 16f / 64f, 16f / 64f, col);
        Render2D.imageUvNearest(texture, x, y, size, size, radius, 0.8f,
                40f / 64f, 8f / 64f, 48f / 64f, 16f / 64f, col);
    }

    @Override
    public boolean mouseClicked(MouseButtonEvent event, boolean doubled) {
        if (event.button() != GLFW.GLFW_MOUSE_BUTTON_LEFT) {
            return super.mouseClicked(event, doubled);
        }
        float mx = mx(event.x());
        float my = my(event.y());
        for (MenuButton b : buttons) {
            if (b.contains(mx, my)) {
                onButton(b.id);
                return true;
            }
        }
        return super.mouseClicked(event, doubled);
    }

    private void onButton(String id) {
        switch (id) {
            case "multi" -> mc.setScreen(new CustomMultiplayerScreen(this));
            case "single" -> mc.setScreen(new SelectWorldScreen(this));
            case "options" -> mc.setScreen(new OptionsScreen(this, mc.options));
            case "account" -> openAccountSwitcher();
            case "quit" -> mc.stop();
            default -> {
            }
        }
    }

    private void openAccountSwitcher() {
        try {
            Class<?> cls = Class.forName("ru.vidtu.ias.screen.AccountScreen");
            Constructor<?> ctor = cls.getConstructor(Screen.class);
            Object screen = ctor.newInstance(this);
            if (screen instanceof Screen s) {
                mc.setScreen(s);
                return;
            }
        } catch (ClassNotFoundException e) {
        } catch (Throwable t) {
            t.printStackTrace();
        }
        mc.setScreen(new CustomMultiplayerScreen(this));
    }

    @Override
    public boolean isPauseScreen() {
        return false;
    }

    @Override
    public boolean shouldCloseOnEsc() {
        return false;
    }

    private static final class MenuButton {
        final String id;
        final String label;
        final float x, y, w, h;
        final boolean primary;
        final boolean wide;
        final boolean showHead;

        MenuButton(String id, String label, float x, float y, float w, float h,
                   boolean primary, boolean wide, boolean showHead) {
            this.id = id;
            this.label = label;
            this.x = x;
            this.y = y;
            this.w = w;
            this.h = h;
            this.primary = primary;
            this.wide = wide;
            this.showHead = showHead;
        }

        boolean contains(float mx, float my) {
            return mx >= x && mx <= x + w && my >= y && my <= y + h;
        }
    }
}
