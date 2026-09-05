package ru.metaculture.protection;

import java.util.Objects;
import lombok.Generated;
import net.minecraft.class_1268;
import net.minecraft.class_2596;
import net.minecraft.class_2678;
import net.minecraft.class_2724;
import net.minecraft.class_2799;
import net.minecraft.class_2846;
import net.minecraft.class_2799.class_2800;
import net.minecraft.class_2846.class_2847;

public class nuNvuvVvuNUn extends nvnnUuNnUvUN implements O000c0oocoo {
   public static final nuNvuvVvuNUn UuUVuuUu = new nuNvuvVvuNUn();
   public boolean C00OOC00oO;
   public boolean uUnuvNvvNU = true;

   @vuVvUNNvVNV
   public void UuUVuuUu(uvUUuvnunU var1) {
      class_2596 var10000 = var1.vVvUvVVuuNvV();
      Objects.requireNonNull(var10000);
      Object var2 = var10000;
      switch (var2) {
         case class_2846 var4 when var4.method_12363().equals(class_2847.field_12974):
            this.uUnuvNvvNU = true;
            break;
         case class_2799 var5 when var5.method_12119().equals(class_2800.field_12774):
            this.uUnuvNvvNU = true;
            break;
         case class_2724 var6:
            this.uUnuvNvvNU = true;
            break;
         case class_2678 var7:
            this.uUnuvNvvNU = true;
            break;
         default:
      }
   }

   public void UuUVuuUu(class_1268 var1) {
      if (this.uUnuvNvvNU) {
         a_.field_1761.method_2919(a_.field_1724, var1);
         this.uUnuvNvvNU = false;
      }

      this.C00OOC00oO = true;
   }

   @Generated
   public void UuUVuuUu(boolean var1) {
      this.C00OOC00oO = var1;
   }

   @Generated
   public void C00OOC00oO(boolean var1) {
      this.uUnuvNvvNU = var1;
   }

   @Generated
   public boolean UuUVuuUu() {
      return this.C00OOC00oO;
   }

   @Generated
   public boolean C00OOC00oO() {
      return this.uUnuvNvvNU;
   }
}
