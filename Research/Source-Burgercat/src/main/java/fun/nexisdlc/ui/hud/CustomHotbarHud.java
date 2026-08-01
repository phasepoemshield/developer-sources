package fun.nexisdlc.ui.hud;

import fun.nexisdlc.Nexis;
import fun.nexisdlc.client.ClientColors;
import fun.nexisdlc.client.events.impl.render.EventRender;
import fun.nexisdlc.client.utils.render.color.basic.ColorUtils;
import fun.nexisdlc.client.utils.render.main.core.Renderer2D;
import fun.nexisdlc.client.utils.render.main.text.FontObject;
import fun.nexisdlc.client.utils.render.main.text.FontRegistry;
import fun.nexisdlc.modules.api.FunctionManager;
import fun.nexisdlc.modules.impl.render.Interface;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.gui.DrawContext;
import net.minecraft.client.gui.screen.ChatScreen;
import net.minecraft.entity.attribute.EntityAttributes;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;

import java.awt.Color;

public final class CustomHotbarHud {
    public static final String ELEMENT_NAME = "Кастом хотбар";
    public static final String HEARTS_SETTING_NAME = "Кастомные сердца";
    public static final String ARMOR_SETTING_NAME = "Кастомная броня";
    public static final String FOOD_SETTING_NAME = "Кастомная еда";
    private static final float VISUAL_SCALE = 1.5f;
    private static final int SLOT_COUNT = 9;
    private static final float SLOT_SIZE = 22f;
    private static final float SLOT_GAP = 5f;
    private static final float PANEL_PADDING_X = 4f;
    private static final float PANEL_PADDING_Y = 4f;
    private static final float BOTTOM_MARGIN = 8f;
    private static final float SELECTED_EXTRA = 3f;
    private static final float ROUNDING = 9f;
    private static final float SLOT_ROUNDING = 6f;
    private static final float TEXT_SIZE = 8.5f;
    private static final float ITEM_COUNT_TEXT_SIZE = 8f;
    private static final float STATUS_SEGMENT_SIZE = 7f;
    private static final float STATUS_SEGMENT_GAP = 2f;
    private static final float STATUS_ROW_GAP = 3f;

    private static float selectedX = Float.NaN;
    private static float animatedArmor = Float.NaN;
    private static float animatedHealth = Float.NaN;
    private static float animatedAbsorption = Float.NaN;
    private static float animatedFood = Float.NaN;

    private CustomHotbarHud() {
    }

    public static boolean shouldUseCustomHotbar() {
        FunctionManager manager = Nexis.getFunctionManager();
        if (manager == null || manager.getAnInterface() == null || !manager.getAnInterface().isState()) {
            return false;
        }
        return Interface.elements != null
                && Interface.elements.getByName(ELEMENT_NAME) != null
                && Interface.elements.getByName(ELEMENT_NAME).get();
    }

    public static boolean shouldRenderCustomHearts() {
        return shouldUseCustomHotbar()
                && Interface.elements.getByName(HEARTS_SETTING_NAME) != null
                && Interface.elements.getByName(HEARTS_SETTING_NAME).get();
    }

    public static boolean shouldRenderCustomArmor() {
        return shouldUseCustomHotbar()
                && Interface.elements.getByName(ARMOR_SETTING_NAME) != null
                && Interface.elements.getByName(ARMOR_SETTING_NAME).get();
    }

    public static boolean shouldRenderCustomFood() {
        return shouldUseCustomHotbar()
                && Interface.elements.getByName(FOOD_SETTING_NAME) != null
                && Interface.elements.getByName(FOOD_SETTING_NAME).get();
    }

    public static void render(EventRender.Screen.Hud event) {
        if (!shouldUseCustomHotbar()) {
            selectedX = Float.NaN;
            resetStatusAnimations();
            return;
        }

        MinecraftClient mc = MinecraftClient.getInstance();
        if (mc == null || mc.player == null || mc.world == null || mc.options.hudHidden) {
            resetStatusAnimations();
            return;
        }

        DrawContext context = Nexis.getInstance().testRender.getDrawContext();
        if (context == null) {
            return;
        }

        Renderer2D renderer = event.getRenderer();
        float scale = Math.max(0.01f, Interface.getInterfaceScale());
        float viewportWidth = event.getViewportWidth() / scale;
        float viewportHeight = event.getViewportHeight() / scale;
        boolean chatOpen = false;

        float slotSize = SLOT_SIZE * VISUAL_SCALE;
        float slotGap = SLOT_GAP * VISUAL_SCALE;
        float panelPaddingX = PANEL_PADDING_X * VISUAL_SCALE;
        float panelPaddingY = PANEL_PADDING_Y * VISUAL_SCALE;
        float bottomMargin = BOTTOM_MARGIN * VISUAL_SCALE;
        float selectedExtra = SELECTED_EXTRA * VISUAL_SCALE;
        float slotRounding = SLOT_ROUNDING * VISUAL_SCALE;
        float hotbarWidth = SLOT_COUNT * slotSize + (SLOT_COUNT - 1) * slotGap;
        float panelWidth = hotbarWidth + panelPaddingX * 2f;
        float panelHeight = slotSize + panelPaddingY * 2f;
        float x = (viewportWidth - panelWidth) * 0.5f;
        float y = viewportHeight - panelHeight - bottomMargin - (chatOpen ? 10f * VISUAL_SCALE : 0f);
        int selectedSlot = mc.player.getInventory().getSelectedSlot();
        float targetSelectedX = x + panelPaddingX + selectedSlot * (slotSize + slotGap);
        selectedX = Float.isNaN(selectedX) ? targetSelectedX : animate(selectedX, targetSelectedX, 0.28f);

        renderStatusBars(renderer, mc, viewportWidth, y, chatOpen);

        int outlineColor = ClientColors.applyAlpha(new Color(45, 45, 45, 95).getRGB(), 1);
        int rounding = Interface.getHudRoundedInt(ROUNDING * VISUAL_SCALE);
        renderer.blur(x, y, panelWidth, panelHeight, rounding, 1f);
        renderer.rectOutline(x - 1f, y - 1f, panelWidth + 2f, panelHeight + 2f, rounding, outlineColor, 1f);
        renderer.rect(x, y, panelWidth, panelHeight, rounding,  ColorUtils.multAlpha(ClientColors.applyAlpha(ClientColors.BACKGROUND.getRGB(), 0.74f), Math.max(0f, Math.min(1f, 0.74f))));

        float selectedY = y + panelPaddingY - selectedExtra;


        renderer.rect(selectedX + 4f * VISUAL_SCALE, selectedY + slotSize + selectedExtra * 2f - 2f * VISUAL_SCALE,
                slotSize - 8f * VISUAL_SCALE, 1.5f * VISUAL_SCALE, Interface.getHudRounding(1f),
                ClientColors.applyAlpha(ClientColors.ICON.getRGB(), 0.9f));

        ItemStack offhandStack = mc.player.getOffHandStack();
        if (offhandStack != null && !offhandStack.isEmpty()) {
            float offhandWidth = slotSize + panelPaddingX * 2f;
            float offhandX = x - slotGap - offhandWidth;
            renderer.blur(offhandX, y, offhandWidth, panelHeight, rounding, 1f);
            renderer.rectOutline(offhandX - 1f, y - 1f, offhandWidth + 2f, panelHeight + 2f, rounding, outlineColor, 1f);
            renderer.rect(offhandX, y, offhandWidth, panelHeight, rounding,
                    ColorUtils.multAlpha(ClientColors.applyAlpha(ClientColors.BACKGROUND.getRGB(), 0.74f), Math.max(0f, Math.min(1f, 0.74f))));
            drawItem(renderer, context, offhandStack, offhandX + panelPaddingX + 3f * VISUAL_SCALE, y + panelPaddingY + 3f * VISUAL_SCALE,
                    16f * VISUAL_SCALE, scale);
        }

        for (int i = 0; i < SLOT_COUNT; i++) {
            float slotX = x + panelPaddingX + i * (slotSize + slotGap);
            float slotY = y + panelPaddingY;
            boolean selected = i == selectedSlot;

            if (i > 0) {
                float separatorX = slotX - slotGap * 0.5f - (1 * VISUAL_SCALE) * 0.5f;
                renderer.rect(separatorX, slotY, 0.8f * VISUAL_SCALE, slotSize, 0f,
                        ClientColors.applyAlpha(0xFFB8B8B8, 0.38f));
            }

            ItemStack mainHand = mc.player.getMainHandStack();
            ItemStack stack = mc.player.getInventory().getStack(i);
            var delta = VISUAL_SCALE;
            if (stack != null && !stack.isEmpty()) {
                boolean b = stack != mainHand;
                if (b) drawItem(renderer, context, stack, slotX + 3f * VISUAL_SCALE, slotY + 3f * VISUAL_SCALE, 16f * VISUAL_SCALE, scale);
                if (!b) delta += 0.3f;
                if (!b) drawItem(renderer, context, stack, slotX + 1f * delta, slotY + 1f * delta, 16f * delta, scale);
            } else {
                drawSlotNumber(renderer, i + 1, slotX, slotY, slotSize);
            }
        }
    }

    private static void renderStatusBars(Renderer2D renderer, MinecraftClient mc, float viewportWidth, float hotbarY, boolean chatOpen) {
        if (mc.interactionManager == null || mc.interactionManager.getCurrentGameMode().isCreative() || mc.player.isSpectator()) {
            resetStatusAnimations();
            return;
        }

        boolean renderArmor = shouldRenderCustomArmor();
        boolean renderHearts = shouldRenderCustomHearts();
        boolean renderFood = shouldRenderCustomFood();
        if (!renderArmor && !renderHearts && !renderFood) {
            resetStatusAnimations();
            return;
        }

        float scale = VISUAL_SCALE;
        float segmentSize = STATUS_SEGMENT_SIZE * scale;
        float gap = 3.5f * scale;
        float rowGap = STATUS_ROW_GAP * scale;
        float rowWidth = 10f * segmentSize + 9f * gap;
        float leftX = viewportWidth * 0.5f - rowWidth - 18f * scale;
        float rightX = viewportWidth * 0.5f + 18f * scale;
        float baseY = hotbarY - 23f * scale - (chatOpen ? 2f * scale : 0f);

        int armor = Math.max(0, Math.min(20, mc.player.getArmor()));
        int health = (int) Math.ceil(mc.player.getHealth());
        int maxHealth = Math.max(1, (int) Math.ceil(mc.player.getAttributeValue(EntityAttributes.MAX_HEALTH)));
        int absorption = Math.max(0, (int) Math.ceil(mc.player.getAbsorptionAmount()));
        int food = Math.max(0, Math.min(20, mc.player.getHungerManager().getFoodLevel()));

        if (renderArmor) {
            animatedArmor = animateStatus(animatedArmor, armor);
            drawSegmentRow(renderer, leftX, baseY, 10, animatedArmor, 20, 0xFFF2F2F2, segmentSize, gap, false);
        } else {
            animatedArmor = Float.NaN;
        }

        if (renderHearts) {
            animatedHealth = animateStatus(animatedHealth, health);
            animatedAbsorption = animateStatus(animatedAbsorption, absorption);
            drawSegmentRow(renderer, leftX, baseY + segmentSize + rowGap, 10, animatedHealth, maxHealth, 0xFFFF3B30, segmentSize, gap, false);
            if (animatedAbsorption > 0.05f) {
                drawAbsorptionOverlay(renderer, leftX, baseY + segmentSize + rowGap, 10, animatedHealth,
                        animatedAbsorption, maxHealth, segmentSize, gap);
            }
        } else {
            animatedHealth = Float.NaN;
            animatedAbsorption = Float.NaN;
        }

        if (renderFood) {
            animatedFood = animateStatus(animatedFood, food);
            drawSegmentRow(renderer, rightX, baseY + segmentSize + rowGap, 10, animatedFood, 20, 0xFFE8B65A, segmentSize, gap, true);
        } else {
            animatedFood = Float.NaN;
        }
        drawExperienceLevel(renderer, mc, viewportWidth, baseY + segmentSize + rowGap, segmentSize);
    }

    private static void drawExperienceLevel(Renderer2D renderer, MinecraftClient mc, float viewportWidth, float y, float segmentSize) {
        FontObject font = FontRegistry.SF_SEMIBOLD != null ? FontRegistry.SF_SEMIBOLD : FontRegistry.SF_MEDIUM;
        if (font == null || mc.player.experienceLevel <= 0) {
            return;
        }

        String level = String.valueOf(mc.player.experienceLevel);
        float textSize = 10f * VISUAL_SCALE;
        float textWidth = renderer.measureText(font, Text.literal(level), textSize).width;
        renderer.text(font, viewportWidth * 0.5f - textWidth * 0.5f,
                y + segmentSize * 0.5f + FontRegistry.centeredBaselineOffset(font, 'H', textSize),
                textSize, level, 0xFFFFFF55);
    }

    private static void drawSegmentRow(Renderer2D renderer, float x, float y, int segments, float value, int maxValue,
                                       int fillColor, float segmentSize, float gap, boolean reverse) {
        int clampedMax = Math.max(1, maxValue);
        float rowWidth = segments * segmentSize + Math.max(0, segments - 1) * gap;
        float progress = Math.max(0f, Math.min(1f, value / clampedMax));
        float fillWidth = rowWidth * progress;
        float fillX = reverse ? x + rowWidth - fillWidth : x;
        float rounding = Interface.getHudRounding(1.5f) + 2;

        renderer.rect(x, y, rowWidth, segmentSize, rounding, ClientColors.applyAlpha(0xFF050506, 0.72f));
        if (fillWidth > 0.01f) {
            renderer.rect(fillX, y, fillWidth, segmentSize, rounding,
                    ClientColors.applyAlpha(fillColor, Math.max(0.15f, progress)));
        }
    }

    private static void drawAbsorptionOverlay(Renderer2D renderer, float x, float y, int segments, float health,
                                              float absorption, int maxHealth, float segmentSize, float gap) {
        int clampedMax = Math.max(1, maxHealth);
        float rowWidth = segments * segmentSize + Math.max(0, segments - 1) * gap;
        float fillWidth = rowWidth * Math.max(0f, Math.min(1f, absorption / clampedMax));
        if (fillWidth > 0.01f) {
            float fillX = x + rowWidth - fillWidth;
            float alpha = Math.max(0.2f, Math.min(1f, absorption / clampedMax));
            renderer.rect(fillX, y, fillWidth, segmentSize, Interface.getHudRounding(1.5f),
                    ClientColors.applyAlpha(0xFFFFD23F, alpha));
        }
    }

    private static void drawSlotNumber(Renderer2D renderer, int number, float x, float y, float slotSize) {
        FontObject font = FontRegistry.SF_SEMIBOLD != null ? FontRegistry.SF_SEMIBOLD : FontRegistry.SF_MEDIUM;
        if (font == null) {
            return;
        }

        String text = String.valueOf(number);
        float textSize = TEXT_SIZE * VISUAL_SCALE;
        float textWidth = renderer.measureText(font, Text.literal(text), textSize).width;
        renderer.text(font, x + (slotSize - textWidth) * 0.5f,
                y + FontRegistry.centeredBaselineOffset(font, 'H', textSize) + slotSize * 0.5f,
                textSize, text, ClientColors.applyAlpha(ClientColors.TEXT.getRGB(), 0.26f));
    }

    private static void drawItem(Renderer2D renderer, DrawContext context, ItemStack stack, float x, float y, float size, float interfaceScale) {
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
        } else {
            absX *= interfaceScale;
            absY *= interfaceScale;
            absSize *= interfaceScale;
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

    private static void drawItemCount(Renderer2D renderer, ItemStack stack, float x, float y, float size) {
        int count = stack.getCount();
        if (count <= 1) {
            return;
        }

        FontObject font = FontRegistry.SF_SEMIBOLD != null ? FontRegistry.SF_SEMIBOLD : FontRegistry.SF_MEDIUM;
        if (font == null) {
            return;
        }

        String text = String.valueOf(count);
        float textSize = ITEM_COUNT_TEXT_SIZE * VISUAL_SCALE;
        float textWidth = renderer.measureText(font, Text.literal(text), textSize).width;
        float textX = x + size - textWidth - 0.75f * VISUAL_SCALE;
        float textY = y + size - 7f * VISUAL_SCALE + FontRegistry.centeredBaselineOffset(font, 'H', textSize);
        renderer.text(font, textX, textY, textSize, text, 0xFFFFFFFF);
    }

    private static float animate(float value, float target, float speed) {
        float delta = target - value;
        if (Math.abs(delta) < 0.01f) {
            return target;
        }
        return value + delta * Math.max(0.01f, Math.min(1f, speed));
    }

    private static float animateStatus(float value, float target) {
        if (!Float.isFinite(value)) {
            return target;
        }
        return animate(value, target, target < value ? 0.18f : 0.32f);
    }

    private static void resetStatusAnimations() {
        animatedArmor = Float.NaN;
        animatedHealth = Float.NaN;
        animatedAbsorption = Float.NaN;
        animatedFood = Float.NaN;
    }
}
