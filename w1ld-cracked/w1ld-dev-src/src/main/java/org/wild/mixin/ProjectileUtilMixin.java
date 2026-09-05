package org.wild.mixin;

import java.util.function.Predicate;
import net.minecraft.class_1297;
import net.minecraft.class_1657;
import net.minecraft.class_1675;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.ModifyVariable;
import ru.metaculture.protection.NVnVnNnN;
import ru.metaculture.protection.uNvUVUNvuUVV;
import ru.metaculture.protection.vUUNuvuVn;

@Mixin({class_1675.class})
public class ProjectileUtilMixin {
   @ModifyVariable(
      method = {"raycast"},
      at = @At("HEAD"),
      argsOnly = true
   )
   private static Predicate<class_1297> litka$ignoreFriendsCollision(Predicate<class_1297> var0) {
      return !NVnVnNnN.vNUvnnVnUvu() ? var0 : var1 -> {
         if (var1 instanceof class_1657 var2) {
            vUUNuvuVn var3 = NVnVnNnN.UuUVuuUu.C00OOC00oO.UuUVuuUu(vUUNuvuVn.class);
            if (var3 != null && var3.nuUnNvnuUu && vUUNuvuVn.UNnVVNvvnVvU.uUnuvNvvNU() && uNvUVUNvuUVV.UuUVuuUu(var2.method_5477().getString())) {
               return false;
            }
         }

         return var0 != null && var0.test(var1);
      };
   }
}
