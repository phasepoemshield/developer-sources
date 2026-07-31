package fun.nexisdlc.ui.hud;

import fun.nexisdlc.client.ClientColors;
import fun.nexisdlc.client.events.impl.render.EventRender;
import fun.nexisdlc.client.utils.render.main.core.Renderer2D;
import fun.nexisdlc.client.utils.render.main.text.FontObject;
import fun.nexisdlc.client.utils.render.main.text.FontRegistry;
import fun.nexisdlc.mixins.accessors.BossBarHudAccessor;
import fun.nexisdlc.modules.api.FunctionManager;
import fun.nexisdlc.modules.impl.render.Interface;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.gui.hud.BossBarHud;
import net.minecraft.client.gui.hud.ClientBossBar;
import net.minecraft.entity.boss.BossBar;

import java.awt.Color;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public final class CustomBossBarHud {
    private static final float BASE_WIDTH = 450;
    private static final float PANEL_PADDING_X = 6;
    private static final float PANEL_PADDING_Y = 4f;
    private static final float PANEL_GAP = 4f;
    private static final float BAR_HEIGHT = 8f;
    private static final float BAR_GAP = 0f;
    private static final float TEXT_SIZE = 18f;
    private static final float PANEL_ROUNDING = 6f;
    private static final float BAR_ROUNDING = 3f;

    private static BossBarHud activeBossBarHud;
    private static float occupiedHeight;

    private CustomBossBarHud() {
    }

    public static boolean shouldUseCustomBossBar() {
        FunctionManager manager = fun.nexisdlc.Nexis.getFunctionManager();
        if (manager == null || manager.getAnInterface() == null || !manager.getAnInterface().isState()) {
            return false;
        }
        return Interface.elements.getByName("Кастомный боссбар").get();
    }

    public static void markActive(BossBarHud bossBarHud) {
        activeBossBarHud = bossBarHud;
    }

    public static float getOccupiedHeight() {
        return Math.max(0f, occupiedHeight);
    }

    public static void render(EventRender.Screen.Hud event) {
        if (!shouldUseCustomBossBar()) {
            activeBossBarHud = null;
            occupiedHeight = 0f;
            return;
        }
        MinecraftClient mc = MinecraftClient.getInstance();
        BossBarHud bossBarHud = activeBossBarHud;
        if (mc == null || bossBarHud == null || mc.options.hudHidden) {
            occupiedHeight = 0f;
            return;
        }

        Map<?, ClientBossBar> bars = ((BossBarHudAccessor) bossBarHud).getBossBars();
        if (bars == null || bars.isEmpty()) {
            occupiedHeight = 0f;
            return;
        }

        FontObject font = FontRegistry.SF_SEMIBOLD != null ? FontRegistry.SF_SEMIBOLD : FontRegistry.SF_MEDIUM;
        if (font == null) {
            return;
        }

        Renderer2D renderer = event.getRenderer();
        float scale = Interface.getInterfaceScale();
        float scaledW = (float) mc.getWindow().getWidth();
        float scaledH = (float) mc.getWindow().getHeight() / scale;
        float maxY = scaledH / 3f;
        float panelWidth = BASE_WIDTH + PANEL_PADDING_X * 2f;
        float startY = 12f;
        float x = (scaledW - panelWidth) * 0.5f;
        float y = startY;
        occupiedHeight = 0f;

        List<ClientBossBar> barList = new ArrayList<>(bars.values());
        for (ClientBossBar bossBar : barList) {
            if (bossBar == null) {
                continue;
            }

            float textHeight = renderer.measureText(font, bossBar.getName(), TEXT_SIZE).height;
            float panelHeight = PANEL_PADDING_Y * 2f + textHeight + BAR_GAP + BAR_HEIGHT;
            if (y + panelHeight > maxY) {
                break;
            }

            drawBossBar(renderer, font, bossBar, x, y, panelWidth, panelHeight);
            y += panelHeight + PANEL_GAP;
        }

        occupiedHeight = Math.max(0f, (y - startY) * scale);
    }

    private static void drawBossBar(Renderer2D renderer, FontObject font, ClientBossBar bossBar,
                                    float x, float y, float width, float height) {
        float rounding = Interface.getHudRounding(PANEL_ROUNDING);
        float textY = y + PANEL_PADDING_Y + 4 + FontRegistry.centeredBaselineOffset(font, 'H', TEXT_SIZE);
        float textWidth = renderer.measureText(font, bossBar.getName(), TEXT_SIZE).width;
        float textX = x + (width - textWidth) * 0.5f;
        float barX = x + PANEL_PADDING_X;
        float barY = y + height - 4 - BAR_HEIGHT;
        float barWidth = width - PANEL_PADDING_X * 2f;


        renderer.text(font, textX, textY, TEXT_SIZE, bossBar.getName(), ClientColors.TEXT.getRGB());

        drawBarFill(renderer, bossBar, barX, barY, barWidth, BAR_HEIGHT);
    }

    private static void drawBarBackground(Renderer2D renderer, float x, float y, float width, float height) {
        float rounding = Interface.getHudRounding(BAR_ROUNDING);
        renderer.rect(x, y, width, height, rounding, ClientColors.applyAlpha(0xFF000000, 0.55f));
        renderer.rectOutline(x, y, width, height, rounding, ClientColors.applyAlpha(Color.WHITE.getRGB(), 0.08f), 1f);
    }

    private static void drawBarFill(Renderer2D renderer, ClientBossBar bossBar, float x, float y, float width, float height) {
        float progress = Math.max(0f, Math.min(1f, bossBar.getPercent()));
        if (progress <= 0f) {
            return;
        }

        int[] colors = resolveBarColors(bossBar.getColor());
        BossBar.Style style = bossBar.getStyle();
        if (style == BossBar.Style.PROGRESS) {
            float fillWidth = width * progress;
            float rounding = Interface.getHudRounding(BAR_ROUNDING);
            renderer.gradient(x, y, fillWidth, height, rounding, colors[0], colors[1], colors[1], colors[0]);
            return;
        }

        int segments = getSegments(style);
        if (segments <= 0) {
            float fillWidth = width * progress;
            float rounding = Interface.getHudRounding(BAR_ROUNDING);
            renderer.gradient(x, y, fillWidth, height, rounding, colors[0], colors[1], colors[1], colors[0]);
            return;
        }

        float gap = -2f;
        float totalGap = gap * (segments - 1);
        float segmentWidth = Math.max(1f, (width - totalGap) / segments);
        float remaining = progress * segments;

        for (int i = 0; i < segments; i++) {
            float drawX = x + i * (segmentWidth + gap);
            float segmentProgress = Math.max(0f, Math.min(1f, remaining));
            remaining -= 1f;
            if (segmentProgress <= 0f) {
                renderer.rect(drawX, y, segmentWidth, height, Interface.getHudRounding(1.5f),
                        ClientColors.applyAlpha(Color.WHITE.getRGB(), 0.05f));
                continue;
            }

            float fillWidth = segmentWidth * segmentProgress;
            renderer.gradient(drawX, y, fillWidth, height, Interface.getHudRounding(1.5f),
                    colors[0], colors[0], colors[0], colors[0]);

            if (segmentProgress < 1f) {
                renderer.rect(drawX + fillWidth, y, segmentWidth - fillWidth, height, Interface.getHudRounding(1.5f),
                        ClientColors.applyAlpha(Color.WHITE.getRGB(), 0.05f));
            }
        }
    }

    private static int getSegments(BossBar.Style style) {
        return switch (style) {
            case NOTCHED_6 -> 6;
            case NOTCHED_10 -> 10;
            case NOTCHED_12 -> 12;
            case NOTCHED_20 -> 20;
            default -> 0;
        };
    }

    private static int[] resolveBarColors(BossBar.Color color) {
        int base = switch (color) {
            case PINK -> 0xFFF26DCC;
            case BLUE -> 0xFF6AA9FF;
            case RED -> 0xFFFF5E5E;
            case GREEN -> 0xFF69E087;
            case YELLOW -> 0xFFFFD65C;
            case PURPLE -> 0xFFC18BFF;
            case WHITE -> 0xFFF3F3F3;
        };
        return new int[] {
                withAlpha(adjustBrightness(base, 0.82f)),
                withAlpha(adjustBrightness(base, 1.08f))
        };
    }

    private static int adjustBrightness(int color, float factor) {
        int a = color >>> 24;
        int r = Math.min(255, Math.max(0, Math.round(((color >> 16) & 0xFF) * factor)));
        int g = Math.min(255, Math.max(0, Math.round(((color >> 8) & 0xFF) * factor)));
        int b = Math.min(255, Math.max(0, Math.round((color & 0xFF) * factor)));
        return (a << 24) | (r << 16) | (g << 8) | b;
    }

    private static int withAlpha(int color) {
        return 0xFF000000 | (color & 0x00FFFFFF);
    }
}
