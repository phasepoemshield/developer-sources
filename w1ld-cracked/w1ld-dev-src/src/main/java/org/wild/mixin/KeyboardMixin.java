package org.wild.mixin;

import net.minecraft.class_1041;
import net.minecraft.class_309;
import net.minecraft.class_310;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import ru.metaculture.protection.NUvnVVNvvu;
import ru.metaculture.protection.NVnVnNnN;
import ru.metaculture.protection.NnNvuuvuNu;
import ru.metaculture.protection.VUUnVnVNNU;
import ru.metaculture.protection.VunUNUNVUnv;
import ru.metaculture.protection.nuUnNNVUUnU;
import ru.metaculture.protection.o00Co0coo0o;
import ru.metaculture.protection.uVuVNVuuN;
import ru.metaculture.protection.uuUnvvnNUU;
import ru.metaculture.protection.uuVUVN;
import ru.metaculture.protection.vUvVuNvvvuN;
import ru.metaculture.protection.vVvuNVUVvNv;

@Mixin({class_309.class})
public class KeyboardMixin {
   @Inject(
      method = {"onKey"},
      at = {@At("HEAD")},
      cancellable = true
   )
   private void handleMenuKeyEvent(long var1, int var3, int var4, int var5, int var6, CallbackInfo var7) {
      if (NVnVnNnN.vNUvnnVnUvu()) {
         VUUnVnVNNU.UuUVuuUu();
         if (uVuVNVuuN.uVunuUNVVUUV) {
            if (var5 == 1 && var3 == 344 && (var6 & 2) != 0) {
               var7.cancel();
            }
         } else if (uuUnvvnNUU.UuuNnUvUuv() && var5 == 1 && var3 == 66 && (var6 & 2) != 0) {
            var7.cancel();
         } else if (NVnVnNnN.unNNVVNnvvV() && NVnVnNnN.UuUVuuUu != null) {
            class_310 var8 = class_310.method_1551();
            if (var8 != null && var8.method_22683() != null) {
               if (var5 == 1 && var3 == 67 && (var6 & 2) != 0 && (var6 & 4) != 0 && vUvVuNvvvuN.UuUVuuUu(var8)) {
                  var7.cancel();
               } else if (var8.field_1755 == null) {
                  if (isWindowInputUsable(var8, var1)) {
                     vVvuNVUVvNv var9 = new vVvuNVUVvNv(var1, var3, var4, var5, var6);
                     NUvnVVNvvu.UuUVuuUu((VunUNUNVUnv)var9);
                     if (!var9.UuUVuuUu() && var9.nuUnNvnuUu() == 1 && var8.field_1755 == null) {
                        uuVUVN var10 = NVnVnNnN.UuUVuuUu.C00OOC00oO.UuUVuuUu(uuVUVN.class);
                        if (var10 != null && var10.nnuUVNUuvvVU.uUnuvNvvNU() != -1 && var9.vVvUvVVuuNvV() == var10.nnuUVNUuvvVU.uUnuvNvvNU()) {
                           var8.method_1507(new o00Co0coo0o());
                           if (var8.field_1729 != null) {
                              var8.field_1729.method_1610();
                           }

                           var9.C00OOC00oO();
                        }

                        NnNvuuvuNu var11 = NnNvuuvuNu.vNVuvnUUnuUn();
                        int var12 = var11 != null && var11.uNNnnnuuuN != -1 ? var11.uNNnnnuuuN : 344;
                        if (var12 != -1 && var9.vVvUvVVuuNvV() == var12) {
                           nuUnNNVUUnU var13 = NVnVnNnN.UuUVuuUu.vVvUvVVuuNvV();
                           if (var13 != null) {
                              var8.method_1507(var13);
                              if (var8.field_1729 != null) {
                                 var8.field_1729.method_1610();
                              }

                              var9.C00OOC00oO();
                           }
                        }
                     }

                     if (var9.UuUVuuUu()) {
                        var7.cancel();
                     }
                  }
               }
            }
         }
      }
   }

   private static boolean isWindowInputUsable(class_310 var0, long var1) {
      if (var0 != null && var0.method_22683() != null && var1 != 0L && var0.method_1569()) {
         class_1041 var3 = var0.method_22683();
         return var1 == var3.method_4490() && !var3.method_65966() && var3.method_4489() > 0 && var3.method_4506() > 0;
      } else {
         return false;
      }
   }
}
