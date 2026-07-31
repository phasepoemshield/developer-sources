package l;

import net.minecraft.text.MutableText;
import net.minecraft.text.Text;
import net.minecraft.util.Formatting;

public class Helper121 {
   public Helper121() {
   }

   public static int[] method1008(String var0) {
      switch (var0) {
         case "Дезориентация":
            return new int[]{Helper133.method1119("#00FF6A"), Helper133.method1119("#2761F5"), Helper133.method1119("#B80081")};
         case "Божья аура":
            return new int[]{Helper133.method1119("#FBFF00"), Helper133.method1119("#FF9873"), Helper133.method1119("#FF9873")};
         case "Пласт":
            return new int[]{Helper133.method1119("#3B005E"), Helper133.method1119("#8900DB"), Helper133.method1119("#8900DB")};
         case "Трапка":
            return new int[]{Helper133.method1119("#8F0000"), Helper133.method1119("#DE0000"), Helper133.method1119("#FF0000")};
         case "Огненный смерч":
            return new int[]{Helper133.method1119("#ED0000"), Helper133.method1119("#FF682B"), Helper133.method1119("#FF682B")};
         case "Снежок заморозка":
            return new int[]{Helper133.method1119("#2BFFCE"), Helper133.method1119("#00E6B0"), Helper133.method1119("#00E6B0")};
         case "Явная пыль":
            return new int[]{Helper133.method1119("#00FFFA"), Helper133.method1119("#00FF95"), Helper133.method1119("#00FF95")};
         case "Зелье мочи Флеша":
            return new int[]{Helper133.method1119("#00799E"), Helper133.method1119("#00FFFF")};
         case "Зелье медика":
            return new int[]{Helper133.method1119("#8A007D"), Helper133.method1119("#FF00E8")};
         case "Зелье агента":
            return new int[]{Helper133.method1119("#D99A00"), Helper133.method1119("#FFEE00")};
         case "Зелье победителя":
            return new int[]{Helper133.method1119("#00821F"), Helper133.method1119("#00FF3D")};
         case "Зелье киллера":
            return new int[]{Helper133.method1119("#9C0000"), Helper133.method1119("#FF0F0F")};
         case "Зелье отрыжки":
            return new int[]{Helper133.method1119("#CC4E00"), Helper133.method1119("#FFA100")};
         case "Зелье серной кислоты":
            return new int[]{Helper133.method1119("#319C00"), Helper133.method1119("#4AEB00")};
         case "Зелье вспышки":
            return new int[]{Helper133.method1119("#D48600"), Helper133.method1119("#FFE600")};
         default:
            return new int[]{Helper133.method1160()};
      }
   }

   public static MutableText method1009(String var0, int[] var1, boolean var2) {
      MutableText var3 = Text.empty();
      String var4 = var2 ? "[★] " + var0 : var0;
      if (var1.length == 2 && var2) {
         var3.append(Text.literal("[★] ").formatted(Formatting.RESET).styled(var1x -> var1x.withColor(var1[0])));
         var3.append(Text.literal(var0).formatted(Formatting.RESET).styled(var1x -> var1x.withColor(var1[1])));
      } else if (var1.length != 0 && (var1.length != 1 || var1[0] != Helper133.method1160())) {
         int var5 = var4.length();
         int var6 = var1.length;

         for (int var7 = 0; var7 < var5; var7++) {
            float var8 = (float)var7 / (var5 - 1);
            int var9 = (int)(var8 * (var6 - 1));
            int var10 = var1[var9];
            int var11 = var1[Math.min(var9 + 1, var6 - 1)];
            float var12 = var8 * (var6 - 1) - var9;
            int var13 = Helper133.method1123(var10, var11, var12);
            var3.append(Text.literal(String.valueOf(var4.charAt(var7))).formatted(Formatting.RESET).styled(var1x -> var1x.withColor(var13)));
         }
      } else {
         var3.append(Text.literal(var4).formatted(Formatting.RESET));
      }

      return var3;
   }
}
