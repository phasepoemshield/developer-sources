package fun.wonderful.api;

import net.minecraft.client.util.Window;
import net.minecraft.client.MinecraftClient;

public interface QClient {
    public static final MinecraftClient mc = MinecraftClient.getInstance();
    public static final Window mw = mc.getWindow();
}