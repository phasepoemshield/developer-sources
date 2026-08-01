package fun.nexisdlc.ui.hud;

import fun.nexisdlc.Nexis;
import fun.nexisdlc.client.ClientColors;
import fun.nexisdlc.client.events.impl.render.EventRender;
import fun.nexisdlc.client.utils.math.MathUtil;
import fun.nexisdlc.ui.hud.api.HudElement;
import fun.nexisdlc.client.utils.render.drag.DraggingManager;
import fun.nexisdlc.client.utils.render.drag.api.Dragging;
import fun.nexisdlc.client.utils.render.main.text.FontRegistry;
import fun.nexisdlc.modules.impl.render.Interface;
import fun.nexisdlc.ui.hud.cooldowns.CooldownsHudFirst;
import fun.nexisdlc.ui.hud.cooldowns.CooldownsHudTwo;
import net.minecraft.client.gui.screen.ChatScreen;
import net.minecraft.entity.player.ItemCooldownManager;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

import java.awt.*;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class CooldownsHud implements HudElement {
    public static final String SETTINGS_SCOPE = "Cooldowns";
    public static final String SETTING_ALWAYS_SHOW = "alwaysShow";
    public static final String SETTING_VARIANT = "variant";
    public static final String VARIANT_DEFAULT = "Дефолт";
    public static final String VARIANT_NEW = "Новый";
    public static float width;
    public static float height;

    protected final Dragging dragging;
    protected final fun.nexisdlc.client.utils.render.animations.impl.SimpleLinearAnimation animation = new fun.nexisdlc.client.utils.render.animations.impl.SimpleLinearAnimation();
    protected long lastAnimTime = System.currentTimeMillis();

    private final CooldownsHudFirst first;
    private final CooldownsHudTwo two;

    public CooldownsHud(Dragging dragging) {
        this(dragging, true);
    }

    protected CooldownsHud(Dragging dragging, boolean createVariants) {
        this.dragging = dragging;
        if (createVariants) {
            this.first = new CooldownsHudFirst(dragging);
            this.two = new CooldownsHudTwo(dragging);
        } else {
            this.first = null;
            this.two = null;
        }
    }

    public void render(EventRender.Screen.Hud event) {
        String variant = DraggingManager.getHudMode(SETTINGS_SCOPE, SETTING_VARIANT, VARIANT_DEFAULT);
        if (VARIANT_NEW.equalsIgnoreCase(variant)) {
            two.render(event);
            return;
        }
        first.render(event);
    }

    protected void renderHud(EventRender.Screen.Hud event) {
        if (!prepare()) return;

        List<CooldownEntry> entries = collectCooldowns();
        updateVisibility(entries);
        float alphaProgress = animation.getProgress();
        boolean hiding = animation.getTarget() == 0f;
        if (alphaProgress <= 0f && animation.get() == 0) {
            resetSize();
            return;
        }

        float dt = updateAnimTime();
        float elementScale = 0.925f;
        float scaleFactor = Interface.getHudScale(SETTINGS_SCOPE);
        float x = Interface.scalePos(SETTINGS_SCOPE, dragging.getX());
        float y = Interface.scalePos(SETTINGS_SCOPE, dragging.getY());
        float titleSize = 17f * elementScale;
        float rowTextSize = 17f * elementScale;
        float timeTextSize = 13f * elementScale;
        float timeIconSize = 16f * elementScale;
        float rowHeight = 30.75f * elementScale;
        float rowSpacing = 2.5f * elementScale;
        float bodyGap = 4f * elementScale;
        float bodyTopPadding = 3f * elementScale;
        float bottomPadding = 4f * elementScale;
        float outlineSize = 1f * elementScale;
        float paddingX = 9.4f * elementScale;
        float headerHeight = 35f * elementScale;
        float iconSize = 16f * elementScale;
        float iconGap = 6f * elementScale;
        int rounding = Interface.getHudRoundedInt(SETTINGS_SCOPE, 10f * elementScale);

        float targetWidth = measureWidth(event, entries, FontRegistry.SF_SEMIBOLD, titleSize, rowTextSize, timeTextSize, timeIconSize, paddingX, iconSize, 85);
        width = animate(width == 0f ? targetWidth : width, targetWidth, 120f, dt);

        float bodyY = y + headerHeight + bodyGap;
        float listStartY = bodyY + bodyTopPadding;
        float itemRowHeight = Math.max(0f, rowHeight - rowSpacing);
        float bodyHeight = entries.isEmpty() ? 0f : Math.max(0f, bodyTopPadding + entries.size() * itemRowHeight + bottomPadding);
        float preHeight = entries.isEmpty() ? headerHeight : bodyY + bodyHeight - y;

        float scale = Interface.animatedScale(Interface.isBounceAnimation() ? 0f : 0.8f, alphaProgress, hiding);
        event.getRenderer().pushScale(scale, scale, x + width * 0.5f, y + preHeight * 0.5f);

        int panelColor = ClientColors.applyAlpha(ClientColors.BACKGROUND.getRGB(), alphaProgress);
        int outlineColor = ClientColors.applyAlpha(new Color(45, 45, 45, 95).getRGB(), alphaProgress);
        int separatorColor = ClientColors.applyAlpha(new Color(134, 134, 139, 255).getRGB(), alphaProgress);

        event.getRenderer().blur(x, y, width, headerHeight, rounding, alphaProgress);
//        event.getRenderer().rectOutline(x - outlineSize, y - outlineSize, width + outlineSize * 2f, headerHeight + outlineSize * 2f, rounding + outlineSize, outlineColor, 1);
        event.getRenderer().rect(x, y, width, headerHeight, rounding, panelColor);

        if (!entries.isEmpty()) {
            event.getRenderer().blur(x, bodyY, width, bodyHeight, rounding);
//            event.getRenderer().rectOutline(x - outlineSize, bodyY - outlineSize, width + outlineSize * 2f, bodyHeight + outlineSize * 2f, rounding + outlineSize, outlineColor, 1);
            event.getRenderer().rect(x, bodyY, width, bodyHeight, rounding, panelColor);
        }

        String headerIcon = "W";
        float headerIconSize = 16f * elementScale;
        float headerIconWidth = FontRegistry.WEXSIDE_MENU_ICONS.getWidth(headerIcon, headerIconSize);
        float headerIconX = x + (12f * elementScale);
        float headerIconY = y + headerHeight * 0.5f + FontRegistry.centeredBaselineOffset(FontRegistry.WEXSIDE_MENU_ICONS, headerIcon.charAt(0), headerIconSize) + 1f;
        float separatorHeight = 15f * elementScale;
        float separatorX = headerIconX + headerIconWidth + (10f * elementScale) - 2f;
        float separatorY = y + headerHeight * 0.5f - separatorHeight * 0.5f;
        float titleX = separatorX + (10f * elementScale);
        event.getRenderer().text(FontRegistry.WEXSIDE_MENU_ICONS, headerIconX - 2, headerIconY + 1, 20, headerIcon, ClientColors.applyAlpha(ClientColors.ICON.getRGB(), alphaProgress));
        event.getRenderer().rect(separatorX, separatorY, 3f * elementScale, separatorHeight, separatorColor);
        event.getRenderer().text(FontRegistry.SF_SEMIBOLD, titleX, centeredTextY(y, headerHeight, titleSize),
                titleSize, "Задержки", ClientColors.applyAlpha(ClientColors.TEXT.getRGB(), alphaProgress));

        List<ItemRenderCall> itemCalls = new ArrayList<>();
        float currentY = listStartY;
        for (CooldownEntry entry : entries) {
            itemCalls.add(renderNewRow(event, entry, x, currentY, width, itemRowHeight, paddingX, iconSize, rowTextSize, timeTextSize, timeIconSize, alphaProgress, elementScale));
            currentY += itemRowHeight;
        }

        event.getRenderer().popScale();
        for (ItemRenderCall call : itemCalls) {
            renderVanillaItem(call.stack(), call.x(), call.y(), call.size(), scaleFactor);
        }
        height = entries.isEmpty() ? headerHeight : bodyY + bodyHeight - y;
        dragging.setWidth(width * scaleFactor);
        dragging.setHeight(height * scaleFactor);
    }

    protected boolean prepare() {
        if (mc == null || mc.player == null || mc.world == null) {
            resetSize();
            return false;
        }
        return true;
    }

    protected void updateVisibility(List<CooldownEntry> entries) {
        boolean chatOpen = mc.currentScreen instanceof ChatScreen;
        boolean shouldShow = DraggingManager.getHudBoolean(SETTINGS_SCOPE, SETTING_ALWAYS_SHOW, false) || chatOpen || !entries.isEmpty();
        animation.setDuration(Interface.getAlphaDurationMs());
        if (shouldShow) animation.show();
        else animation.hide();
    }

    protected List<CooldownEntry> collectCooldowns() {
        ItemCooldownManager cooldownManager = mc.player.getItemCooldownManager();
        Map<Identifier, CooldownEntry> entries = new LinkedHashMap<>();
        for (int i = 0; i < 36; i++) {
            addCooldownEntry(entries, mc.player.getInventory().getStack(i), cooldownManager);
        }
        addCooldownEntry(entries, mc.player.getOffHandStack(), cooldownManager);
        return entries.values().stream().sorted(Comparator.comparingDouble(CooldownEntry::seconds).reversed()).toList();
    }

    protected void addCooldownEntry(Map<Identifier, CooldownEntry> entries, ItemStack stack, ItemCooldownManager cooldownManager) {
        if (stack == null || stack.isEmpty() || !cooldownManager.isCoolingDown(stack)) return;
        Identifier group = cooldownManager.getGroup(stack);
        ItemCooldownManager.Entry cooldown = cooldownManager.entries.get(group);
        if (cooldown == null) return;
        float seconds = Math.max(0f, (cooldown.endTick - cooldownManager.tick) / 20f);
        if (seconds > 0f) {
            entries.putIfAbsent(group, new CooldownEntry(stack.copy(), seconds));
        }
    }

    private float measureWidth(EventRender.Screen.Hud event, List<CooldownEntry> entries,
                               fun.nexisdlc.client.utils.render.main.text.FontObject font,
                               float titleSize, float rowTextSize, float timeTextSize, float timeIconSize,
                               float paddingX, float iconSize, float minWidth) {
        float result = font.getWidth("Кулдауны", titleSize) + paddingX * 2f + 50f;
        for (CooldownEntry entry : entries) {
            String time = formatSeconds(entry.seconds());
            String timeIcon = "Л";
            float nameWidth = event.getRenderer().measureText(font, entry.name(), rowTextSize).width;
            float timePillWidth = FontRegistry.SF_SEMIBOLD.getWidth(time, timeTextSize)
                    + FontRegistry.WEXSIDE_MENU_ICONS.getWidth(timeIcon, timeIconSize)
                    + (16f * 0.925f);
            result = Math.max(result, paddingX * 2f + iconSize + nameWidth + timePillWidth + 30 * 0.925f);
        }
        return Math.max(minWidth, result);
    }

    private ItemRenderCall renderRow(EventRender.Screen.Hud event, CooldownEntry entry, float x, float y, float width, float height,
                                     float paddingX, float iconSize, float iconGap, float textSize, float alpha) {
        float iconX = x + paddingX;
        float iconY = y + (height - iconSize) * 0.5f;

        float textX = iconX + iconSize + iconGap;
        float textY = centeredTextY(y, height, textSize);
        String time = formatSeconds(entry.seconds());
        float timeWidth = FontRegistry.SF_SEMIBOLD.getWidth(time, textSize);
        float timeX = x + width - paddingX - timeWidth;
        event.getRenderer().text(FontRegistry.SF_SEMIBOLD, textX, textY, textSize, entry.name(), ClientColors.applyAlpha(ClientColors.TEXT.getRGB(), alpha));
        event.getRenderer().text(FontRegistry.SF_SEMIBOLD, timeX, textY, textSize, time, ClientColors.applyAlpha(ClientColors.ICON.getRGB(), alpha));
        return new ItemRenderCall(entry.stack(), iconX, iconY, iconSize);
    }

    private ItemRenderCall renderNewRow(EventRender.Screen.Hud event, CooldownEntry entry, float x, float y, float width, float height,
                                        float paddingX, float iconSize, float textSize, float timeTextSize, float timeIconSize,
                                        float alpha, float elementScale) {
        float textY = centeredTextY(y, height, textSize);
        String time = formatSeconds(entry.seconds());
        String timeIcon = "ъ";
        float timeWidth = FontRegistry.SF_SEMIBOLD.getWidth(time, timeTextSize);
        float timeIconWidth = FontRegistry.WEXSIDE_MENU_ICONS.getWidth(timeIcon, timeIconSize);
        float iconX = x + (12f * elementScale);
        float iconY = y + (height - iconSize) * 0.5f;
        float rowSeparatorHeight = 15f * elementScale;
        float rowSeparatorX = iconX + iconSize + (10f * elementScale) - 2f;
        float rowSeparatorY = y + height * 0.5f - rowSeparatorHeight * 0.5f;
        float textX = rowSeparatorX + (10f * elementScale);
        float timeW = timeWidth + timeIconWidth + (16f * elementScale);
        float timeH = 19f * elementScale;
        float timeX = x + width - paddingX - timeW;
        float timeY = y + height * 0.5f - timeH * 0.5f;
        float timeIconX = timeX + (6f * elementScale);
        float timeIconY = timeY + timeH * 0.52f + FontRegistry.centeredBaselineOffset(FontRegistry.WEXSIDE_MENU_ICONS, timeIcon.charAt(0), timeIconSize);
        float timeTextX = timeX + (10f * elementScale) + timeIconWidth;
        float timeTextY = timeY + timeH * 0.5f + FontRegistry.centeredBaselineOffset(FontRegistry.SF_SEMIBOLD, 'H', timeTextSize) + 0.5f;
        int textColor = ClientColors.applyAlpha(ClientColors.TEXT.getRGB(), alpha);
        int timeBgColor = ClientColors.applyAlpha(new Color(255, 255, 255, 15).getRGB(), alpha);
        int rowSeparatorColor = ClientColors.applyAlpha(new Color(134, 134, 139, 255).getRGB(), alpha);

        event.getRenderer().rect(rowSeparatorX, rowSeparatorY, 3f * elementScale, rowSeparatorHeight, rowSeparatorColor);
        event.getRenderer().text(FontRegistry.SF_SEMIBOLD, textX, textY, textSize, entry.name(), textColor);
        event.getRenderer().rect(timeX, timeY, timeW, timeH, 5f * elementScale, timeBgColor);
        event.getRenderer().text(FontRegistry.WEXSIDE_MENU_ICONS, timeIconX, timeIconY, timeIconSize, timeIcon, ClientColors.applyAlpha(Color.WHITE.getRGB(), alpha * 0.5f));
        event.getRenderer().text(FontRegistry.SF_SEMIBOLD, timeTextX, timeTextY, timeTextSize, time, ClientColors.applyAlpha(0xFFEBEBEB, alpha * 0.5f));
        return new ItemRenderCall(entry.stack(), iconX - 4, iconY - 4, 22);
    }

    protected void renderVanillaItem(ItemStack stack, float x, float y, float size, float hudScale) {
        if (stack == null || stack.isEmpty() || mc == null || mc.getItemRenderer() == null || size <= 0f || hudScale <= 0f)
            return;
        var context = Nexis.getInstance().testRender.getDrawContext();
        if (context == null) return;
        double windowScale = mc.getWindow().getScaleFactor();
        if (windowScale <= 0.0) return;

        float absX = x * hudScale;
        float absY = y * hudScale;
        float absSize = size * hudScale;

        var matrices = context.getMatrices();
        matrices.pushMatrix();
        matrices.translate((float) (absX / windowScale), (float) (absY / windowScale));
        matrices.scale((float) (absSize / (16f * windowScale)), (float) (absSize / (16f * windowScale)));
        context.drawItemWithoutEntity(stack, 0, 0, 0);
        matrices.popMatrix();
    }

    protected String formatSeconds(float seconds) {
        return String.format("%.1fс", Math.max(0f, seconds));
    }

    protected void resetSize() {
        width = 0f;
        height = 0f;
        dragging.setWidth(0f);
        dragging.setHeight(0f);
    }

    protected float updateAnimTime() {
        long now = System.currentTimeMillis();
        float dt = (now - lastAnimTime) / 1000f;
        lastAnimTime = now;
        if (!Float.isFinite(dt) || dt < 0f) return 0f;
        return Math.min(dt, 0.05f);
    }

    protected static float animate(float value, float target, float durationMs, float dt) {
        if (durationMs <= 0f) return target;
        float duration = Math.max(1e-6f, durationMs / 1000f);
        float k = (float) (-Math.log(0.05f) / duration);
        float t = 1f - (float) Math.exp(-k * Math.max(0f, dt));
        return value + (target - value) * MathUtil.clamp(t, 0f, 1f);
    }

    protected static float centeredTextY(float y, float height, float size) {
        return y + height * 0.5f + FontRegistry.centeredBaselineOffset(FontRegistry.SF_SEMIBOLD, 'H', size) + 0.5f;
    }

    protected record ItemRenderCall(ItemStack stack, float x, float y, float size) {
    }

    protected record CooldownEntry(ItemStack stack, float seconds) {
        private Text name() {
            return stack.getName();
        }
    }
}
