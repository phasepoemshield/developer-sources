package ru.metaculture.protection;

import net.minecraft.class_310;
import net.minecraft.class_636;
import net.minecraft.class_638;
import net.minecraft.class_746;

public final class VVUvVnVVV {
   private VVUvVnVVV() {
   }

   // $VF: Could not verify finally blocks. A semaphore variable has been added to preserve control flow.
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public static void UuUVuuUu(vUNVNUnuv var0, Runnable var1) {
      class_310 var2 = class_310.method_1551();
      if (var2 != null && var0 != null) {
         VnUvNVNVNUUn var3 = var0.VVuuUN();
         VNNVunUvvnn var4 = var0.vNUvnnVnUvu();
         class_636 var5 = var0.uVUuuVnNVU();
         if (var3 != null && var4 != null && var5 != null) {
            class_638 var6 = var2.field_1687;
            class_746 var7 = var2.field_1724;
            class_636 var8 = var2.field_1761;
            boolean var11 = false /* VF: Semaphore variable */;

            try {
               var11 = true;
               var2.field_1687 = var3;
               var2.field_1724 = var4;
               var2.field_1761 = var5;
               var1.run();
               var11 = false;
            } finally {
               if (var11) {
                  var2.field_1687 = var6;
                  var2.field_1724 = var7;
                  var2.field_1761 = var8;
               }
            }

            var2.field_1687 = var6;
            var2.field_1724 = var7;
            var2.field_1761 = var8;
         }
      }
   }
}
