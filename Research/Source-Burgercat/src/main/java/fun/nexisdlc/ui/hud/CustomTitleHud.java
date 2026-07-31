package fun.nexisdlc.ui.hud;

import fun.nexisdlc.client.ClientColors;
import fun.nexisdlc.client.events.impl.render.EventRender;
import fun.nexisdlc.client.utils.render.main.core.Renderer2D;
import fun.nexisdlc.client.utils.render.main.text.FontObject;
import fun.nexisdlc.client.utils.render.main.text.FontRegistry;
import fun.nexisdlc.mixins.accessors.InGameHudAccessor;
import fun.nexisdlc.modules.api.FunctionManager;
import fun.nexisdlc.modules.impl.render.Interface;
import net.minecraft.client.MinecraftClient;
import net.minecraft.text.Text;

public final class CustomTitleHud {
    public static final String ELEMENT_NAME = "Кастом тайтл";
    private static final float TITLE_SIZE = 72;
    private static final float SUBTITLE_SIZE = 48;
    private static final float SUBTITLE_GAP = 8f;

    private CustomTitleHud() {
    }

    public static boolean shouldUseCustomTitle() {
        FunctionManager manager = fun.nexisdlc.Nexis.getFunctionManager();
        if (manager == null || manager.getAnInterface() == null || !manager.getAnInterface().isState()) {
            return false;
        }
        return Interface.elements != null
                && Interface.elements.getByName(ELEMENT_NAME) != null
                && Interface.elements.getByName(ELEMENT_NAME).get();
    }

    public static void render(EventRender.Screen.Hud event) {
        if (!shouldUseCustomTitle()) {
            return;
        }

        MinecraftClient mc = MinecraftClient.getInstance();
        if (mc == null || mc.inGameHud == null || mc.player == null || mc.world == null || mc.options.hudHidden) {
            return;
        }

        InGameHudAccessor accessor = (InGameHudAccessor) mc.inGameHud;
        int remaining = accessor.getTitleRemainTicks();
        Text title = accessor.getTitle();
        Text subtitle = accessor.getSubtitle();
        if (remaining <= 0 || (isEmpty(title) && isEmpty(subtitle))) {
            return;
        }

        FontObject titleFont = FontRegistry.SF_SEMIBOLD != null ? FontRegistry.SF_SEMIBOLD : FontRegistry.SF_MEDIUM;
        FontObject subtitleFont = FontRegistry.SF_MEDIUM != null ? FontRegistry.SF_MEDIUM : titleFont;
        if (titleFont == null || subtitleFont == null) {
            return;
        }

        float alpha = titleAlpha(accessor, remaining);
        Renderer2D renderer = event.getRenderer();
        float scale = Math.max(0.01f, Interface.getInterfaceScale());
        float viewportWidth = event.getViewportWidth() / scale;
        float viewportHeight = event.getViewportHeight() / scale;
        float centerY = viewportHeight * 0.42f;

        if (!isEmpty(title)) {
            float width = renderer.measureText(titleFont, title, TITLE_SIZE).width;
            renderer.text(titleFont, (viewportWidth - width) * 0.5f,
                    centerY + FontRegistry.centeredBaselineOffset(titleFont, 'H', TITLE_SIZE),
                    TITLE_SIZE, title, ClientColors.applyAlpha(ClientColors.TEXT.getRGB(), alpha));
        }

        if (!isEmpty(subtitle)) {
            float width = renderer.measureText(subtitleFont, subtitle, SUBTITLE_SIZE).width;
            renderer.text(subtitleFont, (viewportWidth - width) * 0.5f,
                    centerY + TITLE_SIZE + SUBTITLE_GAP + FontRegistry.centeredBaselineOffset(subtitleFont, 'H', SUBTITLE_SIZE),
                    SUBTITLE_SIZE, subtitle, ClientColors.applyAlpha(ClientColors.TEXT.getRGB(), alpha * 0.9f));
        }
    }

    private static float titleAlpha(InGameHudAccessor accessor, int remaining) {
        int fadeIn = Math.max(0, accessor.getTitleFadeInTicks());
        int stay = Math.max(0, accessor.getTitleStayTicks());
        int fadeOut = Math.max(0, accessor.getTitleFadeOutTicks());
        int total = fadeIn + stay + fadeOut;
        if (total <= 0) {
            return 1f;
        }
        if (remaining > stay + fadeOut && fadeIn > 0) {
            return Math.max(0f, Math.min(1f, (total - remaining) / (float) fadeIn));
        }
        if (remaining <= fadeOut && fadeOut > 0) {
            return Math.max(0f, Math.min(1f, remaining / (float) fadeOut));
        }
        return 1f;
    }

    private static boolean isEmpty(Text text) {
        return text == null || text.getString().isEmpty();
    }
}
