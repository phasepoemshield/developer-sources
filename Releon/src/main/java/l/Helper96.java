package l;

import net.minecraft.client.MinecraftClient;
import net.minecraft.client.util.math.MatrixStack;

public class Helper96 {
   private int currentFrame = 0;
   private float frameTime = 0.0F;
   private final float frameDuration = 0.0015F;
   private final String[] frames;
   private final Helper63 image;

   public Helper96(String var1, int var2) {
      this.frames = new String[var2];

      for (int var3 = 0; var3 < var2; var3++) {
         this.frames[var3] = String.format("minecraft:gif/backgrounds/mainmenutype1/%05d.png", var3 + 1);
      }

      this.image = new Helper63();
   }

   public void method908(MatrixStack var1, float var2, float var3, float var4, float var5) {
      if (MinecraftClient.getInstance().isWindowFocused()) {
         this.frameTime = this.frameTime + (Helper146.INSTANCE.method1222() > 0 ? 1.0F / Helper146.INSTANCE.method1222() : 0.006F);
         if (this.frameTime >= 0.0015F) {
            this.currentFrame = (this.currentFrame + 1) % this.frames.length;
            this.frameTime = 0.0F;
         }

         this.image.method678(this.frames[this.currentFrame]).method677(Helper80.method841(var1, var2, var3, var4, var5).method823(-1).method840());
      }
   }
}
