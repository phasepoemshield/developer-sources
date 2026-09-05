package ru.metaculture.protection;

import net.minecraft.class_1041;
import net.minecraft.class_310;
import org.lwjgl.glfw.GLFW;

public final class NvuUNuUnUUVv {
   private static volatile boolean UuUVuuUu = false;

   private NvuUNuUnUUVv() {
   }

   public static void UuUVuuUu() {
      if (!UuUVuuUu) {
         UuUVuuUu = true;
         NUvnVVNvvu.UuUVuuUu(
            new Object() {
               // $VF: Could not verify finally blocks. A semaphore variable has been added to preserve control flow.
               // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
               @vuVvUNNvVNV
               public void UuUVuuUu(uVNnNvUnNUNu var1) {
                  class_310 var2 = var1.uUnuvNvvNU();
                  if (var2 != null) {
                     if (var2.field_1755 instanceof nNVvvnU) {
                        if (!NvuUNuUnUUVv.UuUVuuUu(var2)) {
                           return;
                        }

                        double[] var3 = new double[1];
                        double[] var4 = new double[1];
                        if (var2.method_22683() != null) {
                           GLFW.glfwGetCursorPos(var2.method_22683().method_4490(), var3, var4);
                           if (var2.field_1729 != null) {
                              var2.field_1729.method_1610();
                           }
                        }

                        oocOO0CCC0O var5 = oocOO0CCC0O.UuUVuuUu();
                        boolean var6 = var5.UuUVuuUu(var2.field_1755) && var5.UuUVuuUu(var2.method_22683().method_4489(), var2.method_22683().method_4506());
                        boolean var9 = false /* VF: Semaphore variable */;

                        try {
                           var9 = true;
                           VUUVuNv.UuUVuuUu(var1.vVvUvVVuuNvV(), null, (int)var3[0], (int)var4[0], var2.method_61966().method_60636());
                           var1.vVvUvVVuuNvV().uUnuvNvvNU();
                           var9 = false;
                        } finally {
                           if (var9) {
                              if (var6) {
                                 var5.uUnuvNvvNU();
                              }
                           }
                        }

                        if (var6) {
                           var5.uUnuvNvvNU();
                        }
                     }
                  }
               }
            }
         );
      }
   }

   static boolean UuUVuuUu(class_310 var0) {
      if (var0 != null && var0.method_22683() != null) {
         class_1041 var1 = var0.method_22683();
         return !var1.method_65966() && var1.method_4489() > 0 && var1.method_4506() > 0;
      } else {
         return false;
      }
   }
}
