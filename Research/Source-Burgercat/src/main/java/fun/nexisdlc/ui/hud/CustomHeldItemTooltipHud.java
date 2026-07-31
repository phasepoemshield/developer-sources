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
import net.minecraft.client.gui.screen.ChatScreen;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;

public final class CustomHeldItemTooltipHud {
    public static final String ELEMENT_NAME = "Кастом имя предмета";
    private static final float TEXT_SIZE = 16f;
    private static final float BOTTOM_MARGIN = 116f;

    private CustomHeldItemTooltipHud() {
    }

    public static boolean shouldUseCustomHeldItemTooltip() {
        FunctionManager manager = fun.nexisdlc.Nexis.getFunctionManager();
        if (manager == null || manager.getAnInterface() == null || !manager.getAnInterface().isState()) {
            return false;
        }
        return Interface.elements != null
                && Interface.elements.getByName(ELEMENT_NAME) != null
                && Interface.elements.getByName(ELEMENT_NAME).get();
    }

    public static void render(EventRender.Screen.Hud event) {
        if (!shouldUseCustomHeldItemTooltip()) {
            return;
        }

        MinecraftClient mc = MinecraftClient.getInstance();
        if (mc == null || mc.inGameHud == null || mc.player == null || mc.world == null || mc.options.hudHidden) {
            return;
        }

        InGameHudAccessor accessor = (InGameHudAccessor) mc.inGameHud;
        ItemStack stack = accessor.getCurrentStack();
        int fade = accessor.getHeldItemTooltipFade();
        if (stack == null || stack.isEmpty() || fade <= 0) {
            return;
        }

        Text name = stack.getName();
        if (name == null || name.getString().isEmpty()) {
            return;
        }

        FontObject font = FontRegistry.SF_SEMIBOLD != null ? FontRegistry.SF_SEMIBOLD : FontRegistry.SF_MEDIUM;
        if (font == null) {
            return;
        }

        Renderer2D renderer = event.getRenderer();
        float alpha = Math.max(0f, Math.min(1f, fade / 10f));
        float scale = Math.max(0.01f, Interface.getInterfaceScale());
        float viewportWidth = event.getViewportWidth() / scale;
        float viewportHeight = event.getViewportHeight() / scale;
        boolean chatOpen = mc.currentScreen instanceof ChatScreen;

        float textWidth = renderer.measureText(font, name, TEXT_SIZE).width;
        float x = (viewportWidth - textWidth) * 0.5f;
        float y = viewportHeight - BOTTOM_MARGIN - (chatOpen ? 10f : 0f);

        renderer.text(font,
                x,
                y + FontRegistry.centeredBaselineOffset(font, 'H', TEXT_SIZE),
                TEXT_SIZE,
                name,
                ClientColors.applyAlpha(ClientColors.TEXT.getRGB(), alpha));
    }
}
