package l;

import com.google.gson.Gson;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.render.RenderTickCounter;
import net.minecraft.client.render.Tessellator;
import net.minecraft.client.util.Window;

public interface Helper160 extends Helper94 {
   MinecraftClient mc = MinecraftClient.getInstance();
   RenderTickCounter tickCounter = mc.getRenderTickCounter();
   Window window = mc.getWindow();
   Tessellator tessellator = Tessellator.getInstance();
   Helper169 drawEngine = new Helper176();
   Helper105 rectangle = new Helper105();
   Helper116 blur = new Helper116();
   Helper83 arc = new Helper83();
   Helper63 image = new Helper63();
   Gson gson = new Gson();
   Widget34 windowManager = new Widget34();
}
