package ru.metaculture.protection;

import net.minecraft.class_310;
import net.minecraft.class_3532;
import net.minecraft.class_7172;

public class UnVnUVUUUVvn {
   private final double UuUVuuUu;
   private final double C00OOC00oO;
   private int uUnuvNvvNU;
   private int vVvUvVVuuNvV;
   private static int uNNnnnuuuN;

   public UnVnUVUUUVvn(class_310 var1) {
      if (var1 != null && var1.method_22683() != null) {
         this.uUnuvNvvNU = var1.method_22683().method_4480();
         this.vVvUvVVuuNvV = var1.method_22683().method_4507();
         uNNnnnuuuN = 1;
         boolean var2 = false;

         try {
            class_7172 var3 = var1.field_1690.method_42437();
            var2 = var3 != null && Boolean.TRUE.equals(var3.method_41753());
         } catch (Exception var4) {
         }

         byte var5 = 2;

         while (uNNnnnuuuN < var5 && this.uUnuvNvvNU / (uNNnnnuuuN + 1) >= 320 && this.vVvUvVVuuNvV / (uNNnnnuuuN + 1) >= 240) {
            uNNnnnuuuN++;
         }

         if (var2 && uNNnnnuuuN % 2 != 0 && uNNnnnuuuN != 1) {
            uNNnnnuuuN--;
         }

         this.UuUVuuUu = (double)this.uUnuvNvvNU / uNNnnnuuuN;
         this.C00OOC00oO = (double)this.vVvUvVVuuNvV / uNNnnnuuuN;
         this.uUnuvNvvNU = class_3532.method_15384(this.UuUVuuUu);
         this.vVvUvVVuuNvV = class_3532.method_15384(this.C00OOC00oO);
      } else {
         this.uUnuvNvvNU = 1920;
         this.vVvUvVVuuNvV = 1080;
         uNNnnnuuuN = 1;
         this.UuUVuuUu = this.uUnuvNvvNU;
         this.C00OOC00oO = this.vVvUvVVuuNvV;
      }
   }

   public int UuUVuuUu() {
      return this.uUnuvNvvNU;
   }

   public int C00OOC00oO() {
      return this.vVvUvVVuuNvV;
   }

   public double uUnuvNvvNU() {
      return this.UuUVuuUu;
   }

   public double vVvUvVVuuNvV() {
      return this.C00OOC00oO;
   }

   public static int uNNnnnuuuN() {
      return uNNnnnuuuN;
   }
}
