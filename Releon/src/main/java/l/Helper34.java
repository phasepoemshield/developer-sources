package l;

import java.awt.Color;
import net.minecraft.client.gui.DrawContext;

public class Helper34 implements Helper160 {
   public Helper34() {
   }

   public static void method497(DrawContext var0, int var1, int var2, int var3, int var4, double var5, boolean var7, String var8) {
      Helper80 var9 = Helper80.method841(var0.getMatrices(), var1 + (var3 - var3) / 2.0F, var2 + (var4 - var4) / 2.0F, var3, var4)
         .method826(7.0F)
         .method835(1.2121213E7F)
         .method839(new Color(150, 150, 150, 255).getRGB())
         .method825(
            new Color(139, 0, 255, 145).getRGB(),
            new Color(139, 0, 255, 145).getRGB(),
            new Color(139, 0, 255, 145).getRGB(),
            new Color(139, 0, 255, 145).getRGB()
         )
         .method840();
      rectangle.method677(var9);
      Helper80 var10 = Helper80.method841(var0.getMatrices(), (float)(var1 + var5 * (var3 - 7)), var2 + 1, 7.0, var4 - 2)
         .method826(7.0F)
         .method823(new Color(139, 0, 255, var7 ? 155 : 0).getRGB())
         .method840();
      rectangle.method677(var10);
      if (var8 != null && !var8.isEmpty()) {
         Helper103.method927(18, Helper101.DEFAULT)
            .method1474(
               var0.getMatrices(),
               var8,
               var1 - Helper103.method927(18, Helper101.DEFAULT).method1479(var8) / 2.0F + var3 / 2.0F,
               var2 + 7.0F,
               Color.WHITE.getRGB()
            );
      }
   }
}
