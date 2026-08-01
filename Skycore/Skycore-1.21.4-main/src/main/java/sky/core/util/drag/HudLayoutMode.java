package sky.core.util.drag;

import net.minecraft.client.MinecraftClient;
import net.minecraft.client.gui.screen.ChatScreen;

public final class HudLayoutMode {
    private HudLayoutMode() {
    }

    public static boolean isActive() {
        MinecraftClient client = MinecraftClient.getInstance();
        return client.currentScreen instanceof ChatScreen;
    }
}
