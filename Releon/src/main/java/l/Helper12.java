package l;

import java.awt.Color;
import net.minecraft.client.util.math.MatrixStack;

public final class Helper12 implements Helper160 {
   private static final Helper118 LIQUID_GLASS = new Helper118();

   private Helper12() {
   }

   public static void method361(MatrixStack var0, float var1, float var2, float var3, float var4, float var5, int var6, int var7, int var8) {
      Hud var9 = Hud.method1824();
      if (var9.method1838()) {
         int var10 = Helper133.method1123(Helper133.method1106(var7, var6), Helper133.method1106(var8, var6), 0.35F);
         LIQUID_GLASS.method963(var0, var1, var2, var3, var4, var5, var10, 1.8F, 1.6F, 0.34F, 0.28F, false, 0.88F, 6.8F);
      } else {
         blur.method677(
            Helper80.method841(var0, var1, var2, var3, var4).method826(var5).method838(1312.0F).method823(new Color(0, 0, 0, var6).getRGB()).method840()
         );
      }
   }
}
