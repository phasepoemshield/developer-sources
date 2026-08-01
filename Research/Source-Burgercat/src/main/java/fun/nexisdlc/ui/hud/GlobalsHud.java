package fun.nexisdlc.ui.hud;

import fun.nexisdlc.client.ClientColors;
import fun.nexisdlc.client.events.impl.render.EventRender;
import fun.nexisdlc.client.utils.globals.GlobalsManager;
import fun.nexisdlc.client.utils.globals.GlobalsMember;
import fun.nexisdlc.client.utils.globals.GlobalsParty;
import fun.nexisdlc.client.utils.render.animations.impl.SimpleLinearAnimation;
import fun.nexisdlc.client.utils.render.drag.DraggingManager;
import fun.nexisdlc.client.utils.render.drag.api.Dragging;
import fun.nexisdlc.client.utils.render.main.text.FontRegistry;
import fun.nexisdlc.modules.impl.render.Interface;
import fun.nexisdlc.ui.hud.api.HudElement;
import lombok.RequiredArgsConstructor;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.gui.screen.ChatScreen;
import net.minecraft.client.network.PlayerListEntry;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.Vec3d;

import java.awt.Color;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import static fun.nexisdlc.client.utils.client.IMinecraft.mc;

@RequiredArgsConstructor
public class GlobalsHud implements HudElement {
    public static final String SETTINGS_SCOPE = "Globals";
    public static final String SETTING_ALWAYS_SHOW = "alwaysShow";
    public static final String SETTING_VARIANT = "variant";
    public static final String VARIANT_DEFAULT = "Дефолт";
    public static final String VARIANT_NEW = "Новый";

    public static float width;
    public static float height;

    private final Dragging dragging;
    private final SimpleLinearAnimation animation = new SimpleLinearAnimation();

    @Override
    public void render(EventRender.Screen.Hud event) {
        if (DraggingManager.getHudMode(SETTINGS_SCOPE, SETTING_VARIANT, VARIANT_DEFAULT).equalsIgnoreCase(VARIANT_NEW)) {
            renderNew(event);
            return;
        }
        renderDefault(event);
    }

    private void renderDefault(EventRender.Screen.Hud event) {
        if (mc.player == null || mc.world == null) return;

        float elementScale = 0.925f;
        float x = Interface.scalePos(SETTINGS_SCOPE, dragging.getX());
        float y = Interface.scalePos(SETTINGS_SCOPE, dragging.getY());
        List<GlobalsMember> members = members();
        boolean chatOpen = MinecraftClient.getInstance().currentScreen instanceof ChatScreen;
        boolean shouldShow = DraggingManager.getHudBoolean(SETTINGS_SCOPE, SETTING_ALWAYS_SHOW, false) || chatOpen || !members.isEmpty();

        animation.setDuration(Interface.getAlphaDurationMs());
        if (shouldShow) animation.show();
        else animation.hide();
        float alpha = animation.getProgress();
        if (alpha <= 0f && animation.get() == 0) {
            width = 0f;
            height = 0f;
            dragging.setWidth(0f);
            dragging.setHeight(0f);
            return;
        }

        String title = "Globals";
        float titleSize = 17f * elementScale;
        float rowTextSize = 15.5f * elementScale;
        float metaTextSize = 13f * elementScale;
        float headerHeight = 32f * elementScale;
        float rowHeight = 30.75f * elementScale;
        float rowGap = 3f * elementScale;
        float paddingX = 9.4f * elementScale;
        float dotSize = 10f * elementScale;
        int rounding = Interface.getHudRoundedInt(SETTINGS_SCOPE, 11f * elementScale);

        width = FontRegistry.SF_SEMIBOLD.getWidth(title, titleSize) + paddingX * 2f + 50f * elementScale;
        for (GlobalsMember member : members) {
            float lineWidth = event.getRenderer().measureText(FontRegistry.SF_SEMIBOLD, displayName(member), rowTextSize).width;
            float metaWidth = event.getRenderer().measureText(FontRegistry.SF_SEMIBOLD, meta(member), metaTextSize).width;
            width = Math.max(width, paddingX + dotSize + 7f * elementScale + lineWidth + 8f + metaWidth + paddingX);
        }
        width = Math.max(width, 132f * elementScale);
        height = headerHeight;
        if (!members.isEmpty()) {
            height += rowGap + members.size() * rowHeight + Math.max(0, members.size() - 1) * rowGap;
        }

        float scale = Interface.animatedScale(Interface.isBounceAnimation() ? 0f : 0.8f, alpha, animation.getTarget() == 0f);
        event.getRenderer().pushScale(scale, scale, x + width * 0.5f, y + height * 0.5f);
        try {
            int panelColor = ClientColors.applyAlpha(ClientColors.BACKGROUND.getRGB(), alpha);
            int textColor = ClientColors.applyAlpha(ClientColors.TEXT.getRGB(), alpha);
            int separatorColor = ClientColors.applyAlpha(Color.GRAY.getRGB(), alpha);

            event.getRenderer().blur(x, y, width, headerHeight, rounding, alpha);
            event.getRenderer().rect(x, y, width, headerHeight, rounding, panelColor);
            event.getRenderer().text(FontRegistry.WEXSIDE_MENU_ICONS, x + 8f * elementScale, centeredTextY(y, headerHeight, 21f * elementScale) + 2.4f * elementScale, 21f * elementScale, "p", ClientColors.applyAlpha(ClientColors.ICON.getRGB(), alpha));
            event.getRenderer().rect(x + 33f * elementScale, y + 6f * elementScale, 2f * elementScale, 20f * elementScale, 0, separatorColor);
            event.getRenderer().text(FontRegistry.SF_SEMIBOLD, x + 41f * elementScale, centeredTextY(y, headerHeight, titleSize), titleSize, title, textColor);

            float cy = y + headerHeight + rowGap;
            for (GlobalsMember member : members) {
                drawRow(event, x, cy, width, rowHeight, rounding, alpha, displayName(member), meta(member), member.online(), rowTextSize, metaTextSize, paddingX, dotSize);
                cy += rowHeight + rowGap;
            }
        } finally {
            event.getRenderer().popTransform();
        }

        dragging.setWidth(width);
        dragging.setHeight(height);
    }

    private void renderNew(EventRender.Screen.Hud event) {
        if (mc.player == null || mc.world == null) return;

        float startScale = Interface.isBounceAnimation() ? 0f : 0.8f;
        float elementScale = 0.925f;
        float scaleFactor = Interface.getHudScale(SETTINGS_SCOPE);
        float x = Interface.scalePos(SETTINGS_SCOPE, dragging.getX());
        float y = Interface.scalePos(SETTINGS_SCOPE, dragging.getY());
        List<GlobalsMember> members = members();
        boolean chatOpen = MinecraftClient.getInstance().currentScreen instanceof ChatScreen;
        boolean shouldShow = DraggingManager.getHudBoolean(SETTINGS_SCOPE, SETTING_ALWAYS_SHOW, false) || chatOpen || !members.isEmpty();

        animation.setDuration(Interface.getAlphaDurationMs());
        if (shouldShow) animation.show();
        else animation.hide();
        float alpha = animation.getProgress();
        boolean hiding = animation.getTarget() == 0f;
        if (alpha <= 0f && animation.get() == 0) {
            width = 0f;
            height = 0f;
            dragging.setWidth(0f);
            dragging.setHeight(0f);
            return;
        }

        String title = "Участники пати";
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
        float faceSize = 16f * elementScale;
        int rounding = Interface.getHudRoundedInt(SETTINGS_SCOPE, 10f * elementScale);

        float targetMaxWidth = 0f;
        for (GlobalsMember member : members) {
            float rowWidth = event.getRenderer().measureText(FontRegistry.SF_SEMIBOLD, trim(displayName(member), 18), itemSize).width
                    + faceSize
                    + paddingX * 2f
                    + (74f * elementScale);
            targetMaxWidth = Math.max(targetMaxWidth, rowWidth);
        }

        float minHeaderWidth = FontRegistry.SF_SEMIBOLD.getWidth(title, titleSize) + paddingX * 2f + (50f * elementScale);
        width = Math.max(targetMaxWidth, minHeaderWidth);
        float headerWidth = width;
        float bodyY = y + rectHeight + bodyGap;
        float bodyHeight = members.isEmpty() ? 0f : Math.max(0f, bodyTopPadding + members.size() * (itemHeight - rowSpacing) + bottomPadding);
        float preHeight = Math.max(rectHeight, (members.isEmpty() ? y + rectHeight : bodyY + bodyHeight) - y);
        height = preHeight;

        float scale = Interface.animatedScale(startScale, alpha, hiding);
        event.getRenderer().pushScale(scale, scale, x + headerWidth * 0.5f, y + preHeight * 0.5f);
        try {
            int panelColor = ClientColors.applyAlpha(ClientColors.BACKGROUND.getRGB(), alpha * 0.74f);
            int outlineColor = ClientColors.applyAlpha(new Color(45, 45, 45, 95).getRGB(), alpha);
            int separatorColor = ClientColors.applyAlpha(new Color(134, 134, 139, 255).getRGB(), alpha);

            event.getRenderer().blur(x, y, headerWidth, rectHeight, rounding, alpha);
            event.getRenderer().rectOutline(x - outlineSize, y - outlineSize, headerWidth + outlineSize * 2f, rectHeight + outlineSize * 2f, rounding + outlineSize, outlineColor, 1);
            event.getRenderer().rect(x, y, headerWidth, rectHeight, rounding, panelColor);

            if (!members.isEmpty()) {
                event.getRenderer().blur(x, bodyY, headerWidth, bodyHeight, rounding, alpha);
                event.getRenderer().rectOutline(x - outlineSize, bodyY - outlineSize, headerWidth + outlineSize * 2f, bodyHeight + outlineSize * 2f, rounding + outlineSize, outlineColor, 1);
                event.getRenderer().rect(x, bodyY, headerWidth, bodyHeight, rounding, panelColor);
            }

            String headerIcon = "щ";
            float headerIconSize = 16f * elementScale;
            float headerIconWidth = FontRegistry.WEXSIDE_MENU_ICONS.getWidth(headerIcon, headerIconSize);
            float headerIconX = x + (12f * elementScale);
            float headerIconY = y + rectHeight * 0.5f + FontRegistry.centeredBaselineOffset(FontRegistry.WEXSIDE_MENU_ICONS, headerIcon.charAt(0), headerIconSize) + 1f;
            float separatorHeight = 15f * elementScale;
            float separatorX = headerIconX + headerIconWidth + (10f * elementScale) - 2f;
            float separatorY = y + rectHeight * 0.5f - separatorHeight * 0.5f;
            float titleX = separatorX + (10f * elementScale);
            float centerY = centeredTextY(y, rectHeight, titleSize);
            event.getRenderer().text(FontRegistry.WEXSIDE_MENU_ICONS, headerIconX - 2, headerIconY + 1, 20, headerIcon, ClientColors.applyAlpha(ClientColors.ICON.getRGB(), alpha));
            event.getRenderer().rect(separatorX, separatorY, 3f * elementScale, separatorHeight, separatorColor);
            event.getRenderer().text(FontRegistry.SF_SEMIBOLD, titleX, centerY, titleSize, title, ClientColors.applyAlpha(ClientColors.TEXT.getRGB(), alpha));

            float cy = bodyY + bodyTopPadding;
            float maxBottom = members.isEmpty() ? y + rectHeight : bodyY + bodyHeight;
            for (GlobalsMember member : members) {
                float rowHeight = itemHeight - rowSpacing;
                float textY = centeredTextY(cy, rowHeight, itemSize);
                float faceX = x + (12f * elementScale);
                float faceY = cy + (rowHeight - faceSize) * 0.5f;
                float rowSeparatorHeight = 15f * elementScale;
                float rowSeparatorX = faceX + faceSize + (10f * elementScale) - 2f;
                float rowSeparatorY = cy + rowHeight * 0.5f - rowSeparatorHeight * 0.5f;
                float textX = rowSeparatorX + (10f * elementScale);

                renderGlobalHead(event, skinName(member), faceX, faceY, faceSize, alpha, 5f * elementScale);
                event.getRenderer().rect(rowSeparatorX, rowSeparatorY, 3f * elementScale, rowSeparatorHeight, separatorColor);
                event.getRenderer().text(FontRegistry.SF_SEMIBOLD, textX, textY, itemSize, trim(displayName(member), 18), ClientColors.applyAlpha(ClientColors.TEXT.getRGB(), alpha));

                cy += rowHeight;
                maxBottom = Math.max(maxBottom, cy);
            }
            height = Math.max(rectHeight, maxBottom - y);
        } finally {
            event.getRenderer().popScale();
        }

        dragging.setWidth(width * scaleFactor);
        dragging.setHeight(height * scaleFactor);
    }

    private void drawRow(EventRender.Screen.Hud event, float x, float y, float rowWidth, float rowHeight, int rounding,
                         float alpha, String name, String meta, boolean online, float rowTextSize,
                         float metaTextSize, float paddingX, float dotSize) {
        event.getRenderer().blur(x, y, rowWidth, rowHeight, rounding, alpha);
        event.getRenderer().rect(x, y, rowWidth, rowHeight, rounding, ClientColors.applyAlpha(ClientColors.BACKGROUND.getRGB(), alpha));

        int dot = ClientColors.applyAlpha(ClientColors.TEXT.getRGB(), (alpha / 255f) * 0.45f);
        event.getRenderer().rect(x + paddingX, y + (rowHeight - dotSize) * 0.5f, dotSize, dotSize, dotSize * 0.5f, ClientColors.applyAlpha(dot, alpha));

        float nameX = x + paddingX + dotSize + 7f;
        float metaWidth = event.getRenderer().measureText(FontRegistry.SF_SEMIBOLD, meta, metaTextSize).width;
        event.getRenderer().text(FontRegistry.SF_SEMIBOLD, nameX, centeredTextY(y, rowHeight, rowTextSize), rowTextSize, trim(name, 18), ClientColors.applyAlpha(ClientColors.TEXT.getRGB(), alpha));
        event.getRenderer().text(FontRegistry.SF_SEMIBOLD, x + rowWidth - metaWidth - paddingX, centeredTextY(y, rowHeight, metaTextSize), metaTextSize, meta, ClientColors.applyAlpha(0xFFB8C0CC, alpha));
    }

    private void renderGlobalHead(EventRender.Screen.Hud event, String name, float x, float y, float size, float alpha, float rounding) {
        Identifier skin = getMemberSkin(name);
        if (skin == null) {
            event.getRenderer().rect(x, y, size, size, rounding, ClientColors.applyAlpha(ClientColors.BACKGROUND.getRGB(), alpha));
            return;
        }

        int color = ClientColors.applyAlpha(Color.WHITE.getRGB(), alpha);
        float u0 = 8f / 64f;
        float v0 = 8f / 64f;
        float u1 = 16f / 64f;
        float v1 = 16f / 64f;
        event.getRenderer().drawTextureRegionRounded(skin, x, y, size, size, u0, v0, u1, v1, color, rounding);

        float hatU0 = 40f / 64f;
        float hatU1 = 48f / 64f;
        event.getRenderer().drawTextureRegionRounded(skin, x, y, size, size, hatU0, v0, hatU1, v1, color, rounding);
    }

    private Identifier getMemberSkin(String name) {
        if (name == null || mc.getNetworkHandler() == null) {
            return null;
        }
        for (PlayerListEntry entry : mc.getNetworkHandler().getPlayerList()) {
            if (entry == null || entry.getProfile() == null || entry.getProfile().name() == null) {
                continue;
            }
            if (entry.getProfile().name().equalsIgnoreCase(name) && entry.getSkinTextures() != null
                    && entry.getSkinTextures().body().texturePath() != null) {
                return entry.getSkinTextures().body().texturePath();
            }
        }
        return null;
    }

    private List<GlobalsMember> members() {
        GlobalsParty party = GlobalsManager.getInstance().getParty();
        List<GlobalsMember> members = new ArrayList<>();
        if (party != null) members.addAll(party.members());
        members.sort(Comparator.comparing(GlobalsHud::displayName, String.CASE_INSENSITIVE_ORDER));
        return members;
    }

    private static String displayName(GlobalsMember member) {
        if (member == null) return "";
        if (member.username() != null && !member.username().isBlank()) return member.username();
        return member.minecraftName() == null ? "" : member.minecraftName();
    }

    private static String skinName(GlobalsMember member) {
        if (member == null) return "";
        if (member.minecraftName() != null && !member.minecraftName().isBlank()) return member.minecraftName();
        return displayName(member);
    }

    private static boolean sameWorld(GlobalsMember member) {
        return member != null && mc.player != null && mc.world != null && member.worldKey() != null
                && member.worldKey().equals(mc.world.getRegistryKey().getValue().toString());
    }

    private static String meta(GlobalsMember member) {
        if (member == null) return "";
        String hp = hpText(member);
        if (mc.player != null && mc.world != null && member.worldKey() != null && member.worldKey().equals(mc.world.getRegistryKey().getValue().toString())) {
            double dst = mc.player.getEntityPos().distanceTo(new Vec3d(member.x(), member.y(), member.z()));
            return hp + " " + Math.round(dst) + "m";
        }
        return hp;
    }

    private static String hpText(GlobalsMember member) {
        if (member == null) return "0hp";
        return Math.round(member.health()) + "hp";
    }

    private static String distanceText(GlobalsMember member) {
        if (member == null || mc.player == null || mc.world == null || member.worldKey() == null
                || !member.worldKey().equals(mc.world.getRegistryKey().getValue().toString())) {
            return "-";
        }
        double dst = mc.player.getEntityPos().distanceTo(new Vec3d(member.x(), member.y(), member.z()));
        return Math.round(dst) + "m";
    }

    private static String trim(String value, int max) {
        if (value == null) return "";
        if (value.length() <= max) return value;
        return value.substring(0, Math.max(0, max - 1)) + "…";
    }

    private static float centeredTextY(float y, float height, float size) {
        return y + height * 0.5f + FontRegistry.centeredBaselineOffset(FontRegistry.SF_SEMIBOLD, 'H', size);
    }
}
