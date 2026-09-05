package ru.metaculture.protection;

import net.minecraft.class_1713;
import net.minecraft.class_1792;
import net.minecraft.class_1799;
import net.minecraft.class_2868;

public class UVuvVVvnVNu implements O000c0oocoo {
   public static void UuUVuuUu(int var0) {
      if (a_.field_1724 != null && var0 >= 0 && var0 <= 8) {
         if (a_.field_1724.method_31548().method_67532() != var0) {
            a_.field_1724.method_31548().method_61496(var0);
            a_.field_1724.field_3944.method_52787(new class_2868(var0));
         }
      }
   }

   public static void UuUVuuUu(int var0, int var1) {
      if (a_.field_1724 != null && a_.field_1761 != null) {
         int var2 = a_.field_1724.field_7498.field_7763;
         if (var0 >= 36 && var0 <= 44) {
            a_.field_1761.method_2906(var2, var1, var0 % 9, class_1713.field_7791, a_.field_1724);
         } else {
            int var3 = a_.field_1724.method_31548().method_67532();
            a_.field_1761.method_2906(var2, var0, var3, class_1713.field_7791, a_.field_1724);
            a_.field_1761.method_2906(var2, var1, var3, class_1713.field_7791, a_.field_1724);
            a_.field_1761.method_2906(var2, var0, var3, class_1713.field_7791, a_.field_1724);
         }
      }
   }

   public static int UuUVuuUu(class_1792 var0) {
      if (a_.field_1724 == null) {
         return -1;
      } else {
         int var1 = -1;

         for (int var2 = 0; var2 < 36; var2++) {
            class_1799 var3 = a_.field_1724.method_31548().method_5438(var2);
            if (!var3.method_7960() && var3.method_7909() == var0) {
               var1 = var2;
               break;
            }
         }

         if (var1 < 9 && var1 != -1) {
            var1 += 36;
         }

         return var1;
      }
   }

   public static int C00OOC00oO(class_1792 var0) {
      if (a_.field_1724 == null) {
         return -1;
      } else {
         for (int var1 = 0; var1 < 9; var1++) {
            class_1799 var2 = a_.field_1724.method_31548().method_5438(var1);
            if (!var2.method_7960() && var2.method_31574(var0)) {
               return var1;
            }
         }

         return -1;
      }
   }

   public static int UuUVuuUu(class_1792 var0, boolean var1) {
      return UuUVuuUu(var0, var1, false);
   }

   public static int UuUVuuUu(class_1792 var0, boolean var1, boolean var2) {
      if (a_.field_1724 == null) {
         return -1;
      } else {
         int var3 = -1;
         if (var2) {
            for (int var4 = 0; var4 < 36; var4++) {
               class_1799 var5 = a_.field_1724.method_31548().method_5438(var4);
               if (!var5.method_7960() && var5.method_7909() == var0 && var5.method_7942()) {
                  var3 = var4;
                  break;
               }
            }
         } else {
            for (int var6 = 0; var6 < 36; var6++) {
               class_1799 var8 = a_.field_1724.method_31548().method_5438(var6);
               if (!var8.method_7960() && var8.method_7909() == var0 && !var8.method_7942()) {
                  var3 = var6;
                  break;
               }
            }

            if (var3 == -1 && !var1) {
               for (int var7 = 0; var7 < 36; var7++) {
                  class_1799 var9 = a_.field_1724.method_31548().method_5438(var7);
                  if (!var9.method_7960() && var9.method_7909() == var0) {
                     var3 = var7;
                     break;
                  }
               }
            }
         }

         if (var3 < 9 && var3 != -1) {
            var3 += 36;
         }

         return var3;
      }
   }
}
