package l;

import java.awt.Color;
import net.minecraft.client.gui.DrawContext;

public class Helper54 implements Helper160 {
   public Helper54() {
   }

   public static void method637(DrawContext var0, int var1, int var2, int var3, int var4) {
      method641(var0, var1, var2, var3, var4, new Color(139, 0, 255, 145), new Color(139, 0, 255, 145), 8.0F);
   }

   public static void method638(DrawContext var0, int var1, int var2, int var3, int var4) {
      method641(var0, var1, var2, var3, var4, new Color(139, 0, 255, 145), new Color(139, 0, 255, 145), 10.0F);
   }

   public static void method639(DrawContext var0, int var1, int var2, int var3, int var4) {
      method641(var0, var1, var2, var3, var4, new Color(139, 0, 255, 145), new Color(139, 0, 255, 145), 10.0F);
   }

   public static void method640(DrawContext var0, int var1, int var2, int var3, int var4) {
      method641(var0, var1, var2, var3, var4, new Color(139, 0, 255, 145), new Color(139, 0, 255, 145), 10.0F);
   }

   public static void method641(DrawContext var0, int var1, int var2, int var3, int var4, Color var5, Color var6, float var7) {
      Helper80 var8 = Helper80.method841(var0.getMatrices(), var1, var2, var3, var4).method826(var7).method823(var5.getRGB()).method840();
      rectangle.method677(var8);
      Helper80 var9 = Helper80.method841(var0.getMatrices(), var1 - 1, var2 - 1, var3 + 2, var4 + 2)
         .method826(var7 + 1.0F)
         .method823(var6.getRGB())
         .method840();
      rectangle.method677(var9);
   }
}
