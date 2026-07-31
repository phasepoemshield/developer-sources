package fun.nexisdlc.ui.hud;

import fun.nexisdlc.Nexis;
import fun.nexisdlc.client.ClientColors;
import fun.nexisdlc.client.events.impl.render.EventRender;
import fun.nexisdlc.client.utils.render.drag.DraggingManager;
import fun.nexisdlc.client.utils.render.drag.api.Dragging;
import fun.nexisdlc.client.utils.render.main.core.Renderer2D;
import fun.nexisdlc.client.utils.render.main.text.FontRegistry;
import fun.nexisdlc.modules.impl.render.Interface;
import fun.nexisdlc.ui.hud.api.HudElement;
import lombok.RequiredArgsConstructor;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.gui.DrawContext;
import net.minecraft.client.gui.screen.ChatScreen;
import net.minecraft.item.ItemStack;

import java.awt.Color;

@RequiredArgsConstructor
public class InventoryHud implements HudElement {
    public static final String SETTINGS_SCOPE = "InventoryHud";
    public static final String SETTING_ALWAYS_SHOW = "alwaysShow";
    public static final String SETTING_SLOT_RECTS = "slotRects";
    public static final String SETTING_SHOW_HOTBAR = "showHotbar";

    private static final int INVENTORY_COLUMNS = 9;
    private static final int INVENTORY_ROWS = 3;
    private static final int HOTBAR_SIZE = 9;

    private static final float ELEMENT_SCALE = 1.5f;
    private static final float SLOT_SIZE = 15.5f * ELEMENT_SCALE;
    private static final float SLOT_GAP = 2.5f * ELEMENT_SCALE;
    private static final float PADDING_X = 8.5f * ELEMENT_SCALE;
    private static final float PADDING_Y = 7.5f * ELEMENT_SCALE;
    private static final float HEADER_HEIGHT = 18f * ELEMENT_SCALE;
    private static final float TITLE_SIZE = 9.25f * ELEMENT_SCALE;
    private static final float ROW_GAP = 4.5f * ELEMENT_SCALE;
    private static final float HOTBAR_GAP = 4.0f * ELEMENT_SCALE;

    private final Dragging dragging;

    public void render(EventRender.Screen.Hud event) {
        MinecraftClient mc = MinecraftClient.getInstance();
        if (mc.player == null || mc.world == null) {
            dragging.setWidth(0f);
            dragging.setHeight(0f);
            return;
        }

        DrawContext context = Nexis.getInstance().testRender.getDrawContext();
        if (context == null) {
            dragging.setWidth(0f);
            dragging.setHeight(0f);
            return;
        }

        boolean chatOpen = mc.currentScreen instanceof ChatScreen;
        boolean alwaysShow = DraggingManager.getHudBoolean(SETTINGS_SCOPE, SETTING_ALWAYS_SHOW, false);
        if (mc.options.hudHidden && !chatOpen && !alwaysShow) {
            dragging.setWidth(0f);
            dragging.setHeight(0f);
            return;
        }

        boolean showSlotRects = DraggingManager.getHudBoolean(SETTINGS_SCOPE, SETTING_SLOT_RECTS, true);
        boolean showHotbar = DraggingManager.getHudBoolean(SETTINGS_SCOPE, SETTING_SHOW_HOTBAR, false);

        float scaleFactor = Interface.getHudScale(SETTINGS_SCOPE);
        float x = Interface.scalePos(SETTINGS_SCOPE, dragging.getX());
        float y = Interface.scalePos(SETTINGS_SCOPE, dragging.getY());

        float gridWidth = INVENTORY_COLUMNS * SLOT_SIZE + (INVENTORY_COLUMNS - 1) * SLOT_GAP;
        float invGridHeight = INVENTORY_ROWS * SLOT_SIZE + (INVENTORY_ROWS - 1) * SLOT_GAP;
        float hotbarHeight = showHotbar ? SLOT_SIZE : 0f;
        float totalHeight = HEADER_HEIGHT + invGridHeight + PADDING_Y * 2f + (showHotbar ? HOTBAR_GAP + hotbarHeight : 0f);
        float totalWidth = gridWidth + PADDING_X * 2f;
        int rounding = Interface.getHudRoundedInt(SETTINGS_SCOPE, 9.5f * ELEMENT_SCALE);

        Renderer2D renderer = event.getRenderer();
        float alpha = 1.0f;
        renderer.blur(x, y, totalWidth, totalHeight, rounding, alpha);
        renderer.rect(x, y, totalWidth, totalHeight, rounding, ClientColors.applyAlpha(ClientColors.BACKGROUND.getRGB(), 0.74f));
        renderer.rectOutline(x, y, totalWidth, totalHeight, rounding, ClientColors.applyAlpha(Color.WHITE.getRGB(), 0.12f), 1f);

        float titleY = y + centeredTextY(HEADER_HEIGHT, TITLE_SIZE) + 5;
        renderer.text(FontRegistry.SF_SEMIBOLD, x + 10f * ELEMENT_SCALE, titleY, TITLE_SIZE, "Инвентарь", ClientColors.TEXT.getRGB());
       // renderer.text(FontRegistry.WEXSIDE_MENU_ICONS, x + totalWidth - 18f * ELEMENT_SCALE, titleY + 4f * ELEMENT_SCALE, 13.5f * ELEMENT_SCALE, "k", ClientColors.ICON.getRGB());

        float separatorY = y + HEADER_HEIGHT + 4;
        renderer.rect(x + 8f * ELEMENT_SCALE, separatorY, totalWidth - 16f * ELEMENT_SCALE, 1f, 0f, ClientColors.applyAlpha(Color.WHITE.getRGB(), 1f));

        float startX = x + PADDING_X;
        float startY = y + HEADER_HEIGHT + PADDING_Y;
        renderRowBlock(renderer, context, mc.player.getInventory().getMainStacks(), 9, 36, startX, startY, showSlotRects);

        if (showHotbar) {
            float hotbarY = startY + invGridHeight + HOTBAR_GAP;
            renderRowBlock(renderer, context, mc.player.getInventory().getMainStacks(), 0, HOTBAR_SIZE, startX, hotbarY, showSlotRects);
        }

        dragging.setWidth(totalWidth * scaleFactor);
        dragging.setHeight(totalHeight * scaleFactor);
    }

    private void renderRowBlock(Renderer2D renderer,
                                DrawContext context,
                                net.minecraft.util.collection.DefaultedList<ItemStack> stacks,
                                int startIndex,
                                int endIndex,
                                float startX,
                                float startY,
                                boolean showSlotRects) {
        int count = Math.max(0, endIndex - startIndex);
        int rows = Math.max(1, (int) Math.ceil(count / (float) INVENTORY_COLUMNS));

        for (int local = 0; local < count; local++) {
            int slot = startIndex + local;
            int column = local % INVENTORY_COLUMNS;
            int row = local / INVENTORY_COLUMNS;

            float slotX = startX + column * (SLOT_SIZE + SLOT_GAP);
            float slotY = startY + row * (SLOT_SIZE + SLOT_GAP);

            if (showSlotRects) {
                renderer.rect(slotX, slotY, SLOT_SIZE, SLOT_SIZE, 4f * ELEMENT_SCALE, new Color(20, 20, 24, 130).getRGB());
                renderer.rectOutline(slotX, slotY, SLOT_SIZE, SLOT_SIZE, 4f * ELEMENT_SCALE, new Color(255, 255, 255, 24).getRGB(), 1f);
            }

            if (slot < 0 || slot >= stacks.size()) {
                continue;
            }

            ItemStack stack = stacks.get(slot);
            if (stack == null || stack.isEmpty()) {
                continue;
            }

            drawItem(renderer, context, stack, slotX + 1f, slotY + 1f, SLOT_SIZE - 2f);
        }
    }

    private void drawItem(Renderer2D renderer, DrawContext context, ItemStack stack, float x, float y, float size) {
        if (stack == null || stack.isEmpty()) {
            return;
        }
        
        var transform = renderer.getTransformStack().current();
        float absX = x;
        float absY = y;
        float absSize = size;

        if (transform != null && transform.length >= 6) {
            float scaleX = (float) Math.sqrt(transform[0] * transform[0] + transform[3] * transform[3]);
            float scaleY = (float) Math.sqrt(transform[1] * transform[1] + transform[4] * transform[4]);
            absX = transform[0] * x + transform[1] * y + transform[2];
            absY = transform[3] * x + transform[4] * y + transform[5];
            absSize = size * Math.min(scaleX, scaleY);
        }
        if (!Float.isFinite(absX) || !Float.isFinite(absY) || !Float.isFinite(absSize) || absSize <= 0f) {
            return;
        }

        double windowScale = MinecraftClient.getInstance().getWindow().getScaleFactor();
        if (windowScale <= 0.0) {
            return;
        }

        float guiX = (float) (absX / windowScale);
        float guiY = (float) (absY / windowScale);
        float guiScale = (float) (absSize / (16f * windowScale));
        if (!Float.isFinite(guiX) || !Float.isFinite(guiY) || !Float.isFinite(guiScale) || guiScale <= 0f) {
            return;
        }

        renderer.flush();
        var matrices = context.getMatrices();
        matrices.pushMatrix();
        try {
            matrices.translate(guiX, guiY);
            matrices.scale(guiScale, guiScale);
            context.drawItem(stack, 0, 0);
            context.drawStackOverlay(MinecraftClient.getInstance().textRenderer, stack, 0, 0);
        } catch (Throwable ignored) {
        } finally {
            matrices.popMatrix();
            renderer.resetPipelineState();
        }
    }

    private static float centeredTextY(float height, float size) {
        if (FontRegistry.SF_SEMIBOLD == null) {
            return height * 0.5f;
        }
        return FontRegistry.centeredBaselineOffset(FontRegistry.SF_SEMIBOLD, 'H', size) + height * 0.5f;
    }
}
