package moscow.rockstar.util.interfaces;

import net.minecraft.client.MinecraftClient;
import net.minecraft.client.util.Window;

public interface IWindow {
   Window mw = MinecraftClient.getInstance().getWindow();
}
