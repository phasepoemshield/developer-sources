package fun.nexisdlc.ui.hud;

import fun.nexisdlc.Nexis;
import fun.nexisdlc.client.ClientColors;
import fun.nexisdlc.client.events.impl.render.EventRender;
import fun.nexisdlc.client.utils.math.MathUtil;
import fun.nexisdlc.client.utils.render.animations.impl.SimpleLinearAnimation;
import fun.nexisdlc.client.utils.render.drag.DraggingManager;
import fun.nexisdlc.client.utils.render.drag.api.Dragging;
import fun.nexisdlc.client.utils.render.main.text.FontRegistry;
import fun.nexisdlc.modules.impl.render.Interface;
import fun.nexisdlc.modules.impl.utils.StructureInfo;
import fun.nexisdlc.ui.hud.api.HudElement;
import lombok.RequiredArgsConstructor;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.gui.screen.ChatScreen;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;

import java.awt.*;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@RequiredArgsConstructor
public class NearbyInfo implements HudElement {
    public static final String SETTINGS_SCOPE = "NearbyInfo";
    public static final String SETTING_ALWAYS_SHOW = "alwaysShow";
    public static final String SETTING_VARIANT = "variant";
    public static final String VARIANT_DEFAULT = "\u0414\u0435\u0444\u043e\u043b\u0442";
    public static final String VARIANT_NEW = "\u041d\u043e\u0432\u044b\u0439";
    public static float width;
    public static float height;

    final Dragging dragging;
    private final SimpleLinearAnimation animation = new SimpleLinearAnimation();
    private final Map<StructureInfo.TrapPosition, Float> itemAnimations = new HashMap<>();
    private long lastAnimTime = System.currentTimeMillis();
    private static final float ITEM_ANIM_DURATION_MS = 0;

    public void render(EventRender.Screen.Hud event) {
        String variant = DraggingManager.getHudMode(SETTINGS_SCOPE, SETTING_VARIANT, VARIANT_DEFAULT);
        if (VARIANT_NEW.equalsIgnoreCase(variant)) {
            renderNew(event);
            return;
        }
        renderDefault(event);
    }

    private void renderDefault(EventRender.Screen.Hud event) {
        MinecraftClient mc = MinecraftClient.getInstance();

        if (mc.player == null || mc.world == null) {
            width = 0f;
            height = 0f;
            dragging.setWidth(0f);
            dragging.setHeight(0f);
            return;
        }

        StructureInfo structureInfo = (StructureInfo) Nexis.getFunctionManager().getFunctionByName("StructureInfo");
        if (structureInfo == null || !structureInfo.isState()) {
            width = 0f;
            height = 0f;
            dragging.setWidth(0f);
            dragging.setHeight(0f);
            return;
        }

        List<StructureInfo.TrapPosition> traps = structureInfo.trapPositions;

        float dt = updateAnimTime();
        boolean hasVisibleTraps = false;

        for (StructureInfo.TrapPosition trap : traps) {
            if (!trap.typeDetermined) continue;

            float anim = itemAnimations.getOrDefault(trap, 0f);
            boolean shouldBeVisible = trap.typeDetermined;
            anim = animate(anim, shouldBeVisible ? 1f : 0f, ITEM_ANIM_DURATION_MS, dt);

            if (anim <= 0.01f && !shouldBeVisible) {
                itemAnimations.remove(trap);
                continue;
            }

            itemAnimations.put(trap, anim);
            if (anim > 0.01f) {
                hasVisibleTraps = true;
            }
        }

        float elementScale = 0.925f;
        float scaleFactor = Interface.getHudScale(SETTINGS_SCOPE);
        float x = Interface.scalePos(SETTINGS_SCOPE, dragging.getX());
        float y = Interface.scalePos(SETTINGS_SCOPE, dragging.getY());

        float titleSize = 17f * elementScale;
        float itemSize = 17f * elementScale;
        float itemHeight = 30.75f * elementScale;
        float itemGap = 3f * elementScale;
        float paddingX = 9.4f * elementScale;
        float rectHeight = 32f * elementScale;

        int rounding = Interface.getHudRoundedInt(SETTINGS_SCOPE, 11f * elementScale);

        boolean chatOpen = mc.currentScreen instanceof ChatScreen;
        boolean shouldShow = DraggingManager.getHudBoolean(SETTINGS_SCOPE, SETTING_ALWAYS_SHOW, false) || chatOpen || hasVisibleTraps;

        animation.setDuration(Interface.getAlphaDurationMs());
        if (shouldShow) {
            animation.show();
        } else {
            animation.hide();
        }

        float alphaProgress = animation.getProgress();
        boolean hiding = animation.getTarget() == 0f;

        if (alphaProgress <= 0f && animation.get() == 0) {
            width = 0f;
            height = 0f;
            dragging.setWidth(0f);
            dragging.setHeight(0f);
            return;
        }

        List<StructureInfo.TrapPosition> visibleTraps = traps.stream()
                .filter(trap -> trap.typeDetermined && itemAnimations.getOrDefault(trap, 0f) > 0.01f)
                .sorted(Comparator.comparingDouble(trap -> trap.position.distanceTo(mc.player.getEntityPos())))
                .collect(Collectors.toList());

        String headerText = "Structures";
        float headerWidth = FontRegistry.SF_SEMIBOLD.getWidth(headerText, titleSize);
        float maxItemWidth = headerWidth + paddingX * 2f + (50f * elementScale);

        long currentTime = System.currentTimeMillis();
        for (StructureInfo.TrapPosition trap : visibleTraps) {
            String trapTypeText = getTrapTypeText(trap.type);
            long elapsed = currentTime - trap.creationTime;
            long remaining = trap.duration - elapsed;
            float remainingSeconds = Math.max(0, remaining / 1000.0f);
            String timeText = String.format("%.1f сек", remainingSeconds);
            String displayText = trapTypeText;

            float textWidth = FontRegistry.SF_SEMIBOLD.getWidth(displayText, itemSize);
            float timeWidth = FontRegistry.SF_SEMIBOLD.getWidth(timeText, itemSize);
            float iconSize = 16f * elementScale;
            float iconPadding = 4f * elementScale;

            float itemTotalWidth = textWidth + timeWidth + iconSize + iconPadding + paddingX * 2f + 10f;
            maxItemWidth = Math.max(maxItemWidth, itemTotalWidth);
        }

        width = animate(width, maxItemWidth, ITEM_ANIM_DURATION_MS * 1.5f, dt);

        float scale = Interface.animatedScale(0.8f, alphaProgress, hiding);
        float scaleCenterX = x + width * 0.5f;
        float scaleCenterY = y + rectHeight * 0.5f;
        event.getRenderer().pushScale(scale, scale, scaleCenterX, scaleCenterY);

        renderHeader(event, x, y, width, rectHeight, rounding, alphaProgress, elementScale, titleSize, paddingX);

        float currentY = y + rectHeight + itemGap;
        float iconSize = 16f * elementScale;
        float iconPadding = 4f * elementScale;

        for (StructureInfo.TrapPosition trap : visibleTraps) {
            float itemAlpha = itemAnimations.getOrDefault(trap, 1f);
            float fullAlpha = Math.min(1f, itemAlpha * alphaProgress);

            if (fullAlpha <= 0.01f) continue;

            long elapsed = currentTime - trap.creationTime;
            long remaining = trap.duration - elapsed;
            float remainingSeconds = Math.max(0, remaining / 1000.0f);

            String trapTypeText = getTrapTypeText(trap.type);
            String timeText = String.format("%.1f сек", remainingSeconds);
            String displayText = trapTypeText;
            ItemStack icon = getTrapIcon(trap.type);

            int itemBgColor = ClientColors.applyAlpha(ClientColors.BACKGROUND.getRGB(), fullAlpha);
            event.getRenderer().blur(x, currentY, width, itemHeight, rounding, fullAlpha);
            event.getRenderer().rect(x, currentY, width, itemHeight, rounding, itemBgColor);

            float iconX = x + paddingX;
            float iconY = currentY + (itemHeight - iconSize) / 2f;
            renderVanillaItem(event.getRenderer(), icon, iconX, iconY, 1f, 0, 0, iconSize);

            float textX = x + paddingX + iconSize + iconPadding;
            float textY = centeredTextY(currentY, itemHeight, itemSize);
            int textColor = ClientColors.applyAlpha(ClientColors.TEXT.getRGB(), fullAlpha);
            event.getRenderer().text(FontRegistry.SF_SEMIBOLD, textX, textY, itemSize, displayText, textColor);

            float timeX = x + width - paddingX - FontRegistry.SF_SEMIBOLD.getWidth(timeText, itemSize);
            event.getRenderer().text(FontRegistry.SF_SEMIBOLD, timeX, textY, itemSize, timeText,
                    ClientColors.applyAlpha(ClientColors.ICON.getRGB(), fullAlpha));

            currentY += itemHeight + itemGap;
        }

        event.getRenderer().popScale();

        height = rectHeight + (visibleTraps.size() * (itemHeight + itemGap));


        dragging.setWidth(width * scaleFactor);
        dragging.setHeight(height * scaleFactor);
    }

    private void renderNew(EventRender.Screen.Hud event) {
        MinecraftClient mc = MinecraftClient.getInstance();

        if (mc.player == null || mc.world == null) {
            width = 0f;
            height = 0f;
            dragging.setWidth(0f);
            dragging.setHeight(0f);
            return;
        }

        StructureInfo structureInfo = (StructureInfo) Nexis.getFunctionManager().getFunctionByName("StructureInfo");
        if (structureInfo == null || !structureInfo.isState()) {
            width = 0f;
            height = 0f;
            dragging.setWidth(0f);
            dragging.setHeight(0f);
            return;
        }

        List<StructureInfo.TrapPosition> traps = structureInfo.trapPositions;
        float dt = updateAnimTime();
        boolean hasVisibleTraps = false;

        for (StructureInfo.TrapPosition trap : traps) {
            if (!trap.typeDetermined) {
                continue;
            }

            float anim = itemAnimations.getOrDefault(trap, 0f);
            anim = animate(anim, 1f, ITEM_ANIM_DURATION_MS, dt);
            itemAnimations.put(trap, anim);
            if (anim > 0.01f) {
                hasVisibleTraps = true;
            }
        }

        float startScale = Interface.isBounceAnimation() ? 0f : 0.8f;
        float elementScale = 0.925f;
        float scaleFactor = Interface.getHudScale(SETTINGS_SCOPE);
        float x = Interface.scalePos(SETTINGS_SCOPE, dragging.getX());
        float y = Interface.scalePos(SETTINGS_SCOPE, dragging.getY());

        String title = "Структуры";
        float titleSize = 17f * elementScale;
        float itemSize = 17f * elementScale;
        float statusTextSize = 13f * elementScale;
        float itemHeight = 30.75f * elementScale;
        float rowSpacing = 2.5f * elementScale;
        float bodyGap = 4f * elementScale;
        float bodyTopPadding = 3f * elementScale;
        float bottomPadding = 4f * elementScale;
        float outlineSize = 1f * elementScale;
        float paddingX = 9.4f * elementScale;
        float rectHeight = 35f * elementScale;
        float iconSize = 16f * elementScale;
        int rounding = Interface.getHudRoundedInt(SETTINGS_SCOPE, 10f * elementScale);

        boolean chatOpen = mc.currentScreen instanceof ChatScreen;
        boolean shouldShow = DraggingManager.getHudBoolean(SETTINGS_SCOPE, SETTING_ALWAYS_SHOW, false) || chatOpen || hasVisibleTraps;
        animation.setDuration(Interface.getAlphaDurationMs());
        if (shouldShow) {
            animation.show();
        } else {
            animation.hide();
        }

        float alphaProgress = animation.getProgress();
        boolean hiding = animation.getTarget() == 0f;
        if (alphaProgress <= 0f && animation.get() == 0) {
            width = 0f;
            height = 0f;
            dragging.setWidth(0f);
            dragging.setHeight(0f);
            return;
        }

        List<StructureInfo.TrapPosition> visibleTraps = traps.stream()
                .filter(trap -> trap.typeDetermined && itemAnimations.getOrDefault(trap, 0f) > 0.01f)
                .sorted(Comparator.comparingDouble(trap -> trap.position.distanceTo(mc.player.getEntityPos())))
                .collect(Collectors.toList());

        float targetMaxWidth = 0f;
        long currentTime = System.currentTimeMillis();
        for (StructureInfo.TrapPosition trap : visibleTraps) {
            String trapTypeText = getTrapTypeText(trap.type);
            long remaining = trap.duration - (currentTime - trap.creationTime);
            String timeText = String.format("%.1f сек", Math.max(0, remaining / 1000.0f));
            float statusWidth = FontRegistry.SF_SEMIBOLD.getWidth(timeText, statusTextSize) + (12f * elementScale);
            float rowWidth = FontRegistry.SF_SEMIBOLD.getWidth(trapTypeText, itemSize)
                    + iconSize
                    + statusWidth
                    + paddingX * 2f
                    + (34f * elementScale);
            targetMaxWidth = Math.max(targetMaxWidth, rowWidth);
        }

        float minHeaderWidth = FontRegistry.SF_SEMIBOLD.getWidth(title, titleSize) + paddingX * 2f + (50f * elementScale);
        if (Float.isNaN(width) || width == 0f) {
            width = minHeaderWidth;
        }
        float targetWidth = Math.max(targetMaxWidth, minHeaderWidth);
        width = animate(width, targetWidth, ITEM_ANIM_DURATION_MS * 1.5f, dt);
        float headerWidth = width;

        float bodyY = y + rectHeight + bodyGap;
        float listStartY = bodyY + bodyTopPadding;
        float targetY = listStartY;
        Map<StructureInfo.TrapPosition, Float> rowHeights = new HashMap<>();
        for (StructureInfo.TrapPosition trap : visibleTraps) {
            float anim = MathUtil.clamp(itemAnimations.getOrDefault(trap, 0f), 0f, 1f);
            float rowHeight = Math.max(0f, (itemHeight - rowSpacing) * anim);
            rowHeights.put(trap, rowHeight);
            targetY += rowHeight;
        }

        float bodyHeight = visibleTraps.isEmpty() ? 0f : Math.max(rectHeight * 0.5f, targetY - bodyY + bottomPadding);
        float preMaxBottom = visibleTraps.isEmpty() ? y + rectHeight : bodyY + bodyHeight;
        float preHeight = Math.max(rectHeight, preMaxBottom - y);
        float scale = Interface.animatedScale(startScale, alphaProgress, hiding);
        float scaleCenterX = x + headerWidth * 0.5f;
        float scaleCenterY = y + preHeight * 0.5f;
        event.getRenderer().pushScale(scale, scale, scaleCenterX, scaleCenterY);

        int panelColor = ClientColors.applyAlpha(ClientColors.BACKGROUND.getRGB(), alphaProgress);
        int outlineColor = ClientColors.applyAlpha(new Color(45, 45, 45, 95).getRGB(), alphaProgress);
        int separatorColor = ClientColors.applyAlpha(new Color(255, 255, 255, 255).getRGB(), alphaProgress);

        event.getRenderer().blur(x, y, headerWidth, rectHeight, rounding, alphaProgress);
//        event.getRenderer().rectOutline(x - outlineSize, y - outlineSize, headerWidth + outlineSize * 2f, rectHeight + outlineSize * 2f, rounding + outlineSize, outlineColor, 1);
        event.getRenderer().rect(x, y, headerWidth, rectHeight, rounding, panelColor);

        if (!visibleTraps.isEmpty()) {
            event.getRenderer().blur(x, bodyY, headerWidth, bodyHeight, rounding);
//            event.getRenderer().rectOutline(x - outlineSize, bodyY - outlineSize, headerWidth + outlineSize * 2f, bodyHeight + outlineSize * 2f, rounding + outlineSize, outlineColor, 1);
            event.getRenderer().rect(x, bodyY, headerWidth, bodyHeight, rounding, panelColor);
        }

        String headerIcon = "Щ";
        float headerIconSize = 16f * elementScale;
        float headerIconWidth = FontRegistry.WEXSIDE_MENU_ICONS.getWidth(headerIcon, headerIconSize);
        float headerIconX = x + (12f * elementScale);
        float headerIconY = y + rectHeight * 0.5f + FontRegistry.centeredBaselineOffset(FontRegistry.WEXSIDE_MENU_ICONS, headerIcon.charAt(0), headerIconSize);
        float separatorHeight = rectHeight * 0.35f;
        float separatorX = headerIconX + headerIconWidth + (10f * elementScale);
        float separatorY = y + rectHeight * 0.5f - separatorHeight * 0.5f;
        float titleX = separatorX + (10f * elementScale);
        float centerY = centeredTextY(y, rectHeight, titleSize) - (1f * elementScale);
        event.getRenderer().text(FontRegistry.WEXSIDE_MENU_ICONS, headerIconX - 2, headerIconY + 2, 20, headerIcon, ClientColors.applyAlpha(ClientColors.ICON.getRGB(), alphaProgress));
        event.getRenderer().rect(separatorX, separatorY, 1f * elementScale, separatorHeight, separatorColor);
        event.getRenderer().text(FontRegistry.SF_SEMIBOLD, titleX, centerY, titleSize, title, ClientColors.applyAlpha(ClientColors.TEXT.getRGB(), alphaProgress));

        float currentY = listStartY;
        float maxBottom = visibleTraps.isEmpty() ? y + rectHeight : bodyY + bodyHeight;
        for (StructureInfo.TrapPosition trap : visibleTraps) {
            float itemAlpha = Math.min(1f, itemAnimations.getOrDefault(trap, 1f));
            float fullAlpha = itemAlpha * alphaProgress;
            float rowHeight = rowHeights.getOrDefault(trap, itemHeight * itemAlpha);
            if (fullAlpha <= 0.01f || rowHeight <= 0.5f) {
                continue;
            }

            long remaining = trap.duration - (System.currentTimeMillis() - trap.creationTime);
            String trapTypeText = getTrapTypeText(trap.type);
            String timeText = String.format("%.1f сек", Math.max(0, remaining / 1000.0f));
            ItemStack icon = getTrapIcon(trap.type);
            float itemProgress = Math.round(255f * fullAlpha) / 255f;
            float textY = centeredTextY(currentY, rowHeight, itemSize);
            float iconX = x + (12f * elementScale);
            float iconY = currentY + (rowHeight - iconSize) * 0.5f;
            float rowSeparatorHeight = rectHeight * 0.35f;
            float rowSeparatorX = iconX + iconSize + (10f * elementScale);
            float rowSeparatorY = currentY + rowHeight * 0.51f - rowSeparatorHeight * 0.5f;
            float textX = rowSeparatorX + (10f * elementScale);
            float statusWidth = FontRegistry.SF_SEMIBOLD.getWidth(timeText, statusTextSize);
            float statusW = statusWidth + (12f * elementScale);
            float statusH = 19f * elementScale;
            float statusX = x + headerWidth - paddingX - statusW;
            float statusY = currentY + rowHeight * 0.5f - statusH * 0.5f;
            float statusTextX = statusX + (statusW - statusWidth) * 0.5f;
            float statusTextY = statusY + statusH * 0.5f + FontRegistry.centeredBaselineOffset(FontRegistry.SF_SEMIBOLD, 'H', statusTextSize) + 0.5f;
            int statusTextColor = ClientColors.applyAlpha(ClientColors.ICON.getRGB(), itemProgress * 0.85f);
            int statusBgColor = ClientColors.applyAlpha(new Color(255, 255, 255, 15).getRGB(), itemProgress);
            int rowseparator = ClientColors.applyAlpha(new Color(255, 255, 255, 255).getRGB(), alphaProgress);

            renderVanillaItem(event.getRenderer(), icon, iconX, iconY, 1f, 0, 0, iconSize);
            event.getRenderer().rect(rowSeparatorX, rowSeparatorY, 1f * elementScale, rowSeparatorHeight, rowseparator);
            event.getRenderer().text(FontRegistry.SF_SEMIBOLD, textX, textY, itemSize, trapTypeText, ClientColors.applyAlpha(ClientColors.TEXT.getRGB(), itemProgress));
            event.getRenderer().rect(statusX, statusY, statusW, statusH, 5f * elementScale, statusBgColor);
            event.getRenderer().text(FontRegistry.SF_SEMIBOLD, statusTextX, statusTextY, statusTextSize, timeText, statusTextColor);

            currentY += rowHeight;
            maxBottom = Math.max(maxBottom, currentY);
        }

        event.getRenderer().popScale();

        height = Math.max(rectHeight, maxBottom - y);
        dragging.setWidth(width * scaleFactor);
        dragging.setHeight(height * scaleFactor);
    }

    private void renderHeader(EventRender.Screen.Hud event, float x, float y, float width, float height,
                              int rounding, float alpha, float elementScale, float titleSize, float paddingX) {
        int panelColor = ClientColors.applyAlpha(ClientColors.BACKGROUND.getRGB(), alpha);
        event.getRenderer().blur(x, y, width, height, rounding, alpha);
        event.getRenderer().rect(x, y, width, height, rounding, panelColor);

        float centerY = centeredTextY(y, height, titleSize) - (1f * elementScale);

        float iconX = x + (7f * elementScale);
        float iconY = centerY + (4f * elementScale);
        event.getRenderer().text(FontRegistry.WEXSIDE_MENU_ICONS, iconX, iconY, 23f * elementScale,
                "Щ", ClientColors.applyAlpha(ClientColors.ICON.getRGB(), alpha));

        float separatorX = x + (33f * elementScale);
        float separatorY = y + (6f * elementScale);
        float separatorWidth = 2f * elementScale;
        float separatorHeight = 20f * elementScale;
        int separatorColor = ClientColors.applyAlpha(Color.GRAY.getRGB(), alpha);
        event.getRenderer().rect(separatorX, separatorY, separatorWidth, separatorHeight, 0, separatorColor);

        float titleX = x + (41f * elementScale);
        int titleColor = ClientColors.applyAlpha(ClientColors.TEXT.getRGB(), alpha);
        event.getRenderer().text(FontRegistry.SF_SEMIBOLD, titleX, centerY, titleSize, "Structures", titleColor);
    }

    private String getTrapTypeText(StructureInfo.TrapType type) {
        if (type == null) return "Unknown";

        return switch (type) {
            case TRAPKA -> "Трапка";
            case DRAGON_TRAP -> "Драконья трапка";
            case PLAST -> "Пласт";
            case DRAGON_PLAST -> "Драконий пласт";
            default -> "Unknown";
        };
    }

    private ItemStack getTrapIcon(StructureInfo.TrapType type) {
        if (type == null) return Items.DRIED_KELP.getDefaultStack();

        return switch (type) {
            case TRAPKA, DRAGON_TRAP -> Items.NETHERITE_SCRAP.getDefaultStack();
            case PLAST, DRAGON_PLAST -> Items.DRIED_KELP.getDefaultStack();
            default -> Items.DRIED_KELP.getDefaultStack();
        };
    }

    private void renderVanillaItem(fun.nexisdlc.client.utils.render.main.core.Renderer2D render, ItemStack stack,
                                   float originX, float originY, float scale,
                                   float x, float y, float size) {
        if (stack == null || stack.isEmpty()) return;
        if (MinecraftClient.getInstance() == null || MinecraftClient.getInstance().getItemRenderer() == null) return;

        var context = Nexis.getInstance().testRender.getDrawContext();
        if (context == null) return;
        if (size <= 0f) return;

        var window = MinecraftClient.getInstance().getWindow();
        double scaleFactor = window.getScaleFactor();
        if (scaleFactor <= 0.0) return;

        float absX = (originX + x) * scale;
        float absY = (originY + y) * scale;
        float absSize = size * scale;

        float guiX = (float) (absX / scaleFactor);
        float guiY = (float) (absY / scaleFactor);
        float guiScale = (float) (absSize / (16f * scaleFactor));

        var matrices = context.getMatrices();
        matrices.pushMatrix();
        matrices.translate(guiX, guiY);
        matrices.scale(guiScale, guiScale);
        context.drawItemWithoutEntity(stack, 0, 0, 0);
        matrices.popMatrix();
    }

    private static float centeredTextY(float y, float height, float size) {
        if (FontRegistry.SF_SEMIBOLD == null) {
            return y + height * 0.5f;
        }
        float offset = FontRegistry.centeredBaselineOffset(FontRegistry.SF_SEMIBOLD, 'H', size);
        return y + height * 0.5f + offset + 0.5f;
    }

    private float updateAnimTime() {
        long now = System.currentTimeMillis();
        float dt = (now - lastAnimTime) / 1000f;
        lastAnimTime = now;
        if (!Float.isFinite(dt) || dt < 0f) {
            return 0f;
        }
        return Math.min(dt, 0.05f);
    }

    private static float animate(float value, float target, float durationMs, float dt) {
        if (durationMs <= 0f) {
            return target;
        }
        float duration = Math.max(1e-6f, durationMs / 1000f);
        float k = (float) (-Math.log(0.05f) / duration);
        float t = 1f - (float) Math.exp(-k * Math.max(0f, dt));
        return value + (target - value) * MathUtil.clamp(t, 0f, 1f);
    }
}
