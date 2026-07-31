package l;

import java.awt.Color;
import net.minecraft.client.gui.DrawContext;

public class Helper72 implements Helper160 {
   private final Helper467 animation = new Animation2().method5003(200).method5004(8.0);

   public Helper72() {
   }

   public static void method779(DrawContext var0, int var1, int var2, int var3, int var4, boolean var5, String var6) {
      Helper80 var7 = Helper80.method841(var0.getMatrices(), var1 + (var3 - var3) / 2.0F, var2 + (var4 - var4) / 2.0F, var3, var4)
         .method826(8.0F)
         .method835(1.8318328E8F)
         .method839(new Color(139, 0, 255, 145).getRGB())
         .method825(
            new Color(139, 0, 255, 145).getRGB(),
            new Color(139, 0, 255, 145).getRGB(),
            new Color(139, 0, 255, 145).getRGB(),
            new Color(139, 0, 255, 145).getRGB()
         )
         .method840();
      rectangle.method677(var7);
      if (var6 != null && !var6.isEmpty() && Helper103.method927(18, Helper101.DEFAULT).method1479(var6) <= var3) {
         Helper103.method927(18, Helper101.DEFAULT)
            .method1474(
               var0.getMatrices(),
               var6,
               var1 - Helper103.method927(18, Helper101.DEFAULT).method1479(var6) / 2.0F + var3 / 2.0F,
               var2 + 7.0F,
               new Color(255, 255, 255, 255).getRGB()
            );
      }
   }
}
