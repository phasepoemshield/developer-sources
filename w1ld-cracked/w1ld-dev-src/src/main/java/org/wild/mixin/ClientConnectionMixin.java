package org.wild.mixin;

import net.minecraft.class_2535;
import net.minecraft.class_2547;
import net.minecraft.class_2596;
import net.minecraft.class_2815;
import net.minecraft.class_310;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import ru.metaculture.protection.NUvnVVNvvu;
import ru.metaculture.protection.NVnVnNnN;
import ru.metaculture.protection.UVVNuuUvuu;
import ru.metaculture.protection.VUUnVnVNNU;
import ru.metaculture.protection.VunUNUNVUnv;
import ru.metaculture.protection.nVVuNnVvvnnn;
import ru.metaculture.protection.nVuVUNvVV;
import ru.metaculture.protection.uvUUuvnunU;

@Mixin({class_2535.class})
public class ClientConnectionMixin {
   @Inject(
      method = {"handlePacket"},
      at = {@At("HEAD")},
      cancellable = true
   )
   private static <T extends class_2547> void handlePacketPre(class_2596<T> var0, class_2547 var1, CallbackInfo var2) {
      VUUnVnVNNU.UuUVuuUu();
      boolean var3 = wild$dispatchReceiveEvent(var0);
      wild$updateTps(var0);
      if (var3) {
         var2.cancel();
      }
   }

   private static <T extends class_2547> boolean wild$dispatchReceiveEvent(class_2596<T> var0) {
      try {
         uvUUuvnunU var1 = new uvUUuvnunU(var0, uvUUuvnunU.NVnVnNnN.RECEIVE);
         boolean var2 = UVVNuuUvuu.UuUVuuUu(var1);
         NUvnVVNvvu.UuUVuuUu((VunUNUNVUnv)var1);
         if (var2) {
            NVnVnNnN.VVuuUN();
         }

         return var1.UuUVuuUu();
      } catch (Throwable var3) {
         return false;
      }
   }

   private static void wild$updateTps(class_2596<?> var0) {
      nVuVUNvVV.C00OOC00oO(var0);
   }

   @Inject(
      method = {"send(Lnet/minecraft/network/packet/Packet;)V"},
      at = {@At("HEAD")},
      cancellable = true
   )
   private void sendPre(class_2596<?> var1, CallbackInfo var2) {
      VUUnVnVNNU.UuUVuuUu();

      try {
         uvUUuvnunU var3 = new uvUUuvnunU(var1, uvUUuvnunU.NVnVnNnN.SEND);
         NUvnVVNvvu.UuUVuuUu((VunUNUNVUnv)var3);
         if (var3.UuUVuuUu()) {
            var2.cancel();
            return;
         }
      } catch (Throwable var7) {
      }

      nVuVUNvVV.UuUVuuUu(var1);
      if (var1 instanceof class_2815 var8) {
         try {
            class_310 var4 = class_310.method_1551();
            if (var4 != null) {
               nVVuNnVvvnnn var5 = new nVVuNnVvvnnn(var4.field_1755, var8.method_36168());
               NUvnVVNvvu.UuUVuuUu((VunUNUNVUnv)var5);
               if (var5.UuUVuuUu()) {
                  var2.cancel();
               }
            }
         } catch (Throwable var6) {
         }
      }
   }
}
