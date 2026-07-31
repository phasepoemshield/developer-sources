package sky.core.util.client;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.event.lifecycle.v1.ClientLifecycleEvents;
import net.fabricmc.fabric.api.client.message.v1.ClientSendMessageEvents;
import net.fabricmc.fabric.api.client.screen.v1.ScreenEvents;
import net.fabricmc.fabric.api.client.screen.v1.ScreenMouseEvents;
import net.minecraft.client.gui.screen.ChatScreen;
import org.lwjgl.glfw.GLFW;
import sky.core.Skycore;
import sky.core.util.config.ConfigCommands;
import sky.core.ui.gui.click.theme.Themes;
import sky.core.util.drag.DragController;
import sky.core.ui.hud.HudElementManager;
import sky.core.util.render.RenderUtil;
import sky.core.util.render.shader.ShaderLibrary;

public class SkycoreClient implements ClientModInitializer {
    private static boolean renderingInitialized;

    @Override
    public void onInitializeClient() {
        RenderUtil.init();
        Skycore skycore = Skycore.getInstance();
        skycore.getConfigManager().init();
        skycore.getModuleManager().init();
        skycore.getClientConfig().init();
        Themes.init();
        skycore.getClientConfig().applySettings();
        HudElementManager.getInstance().registerEvents();

        ClientSendMessageEvents.ALLOW_CHAT.register(message -> !ConfigCommands.handle(message));
        ClientLifecycleEvents.CLIENT_STOPPING.register(client -> skycore.getClientConfig().saveCurrentSettings());

        ScreenEvents.BEFORE_INIT.register((client, screen, scaledWidth, scaledHeight) -> {
            if (!(screen instanceof ChatScreen)) {
                return;
            }

            ScreenEvents.afterRender(screen).register((currentScreen, context, mouseX, mouseY, tickDelta) -> {
                HudElementManager.getInstance().renderChatOverlay(context, tickDelta);
            });

            ScreenMouseEvents.allowMouseClick(screen).register((currentScreen, mouseX, mouseY, button) -> {
                if (button != GLFW.GLFW_MOUSE_BUTTON_LEFT) {
                    return true;
                }
                return !DragController.getInstance().tryStartDrag();
            });

            ScreenMouseEvents.allowMouseRelease(screen).register((currentScreen, mouseX, mouseY, button) -> {
                if (button != GLFW.GLFW_MOUSE_BUTTON_LEFT || !DragController.getInstance().isDragging()) {
                    return true;
                }
                DragController.getInstance().stopDragging();
                return false;
            });
        });
    }

    public static void initRendering() {
        if (renderingInitialized) {
            return;
        }
        ShaderLibrary.loadDefaultShaders();
        renderingInitialized = true;
    }
}
