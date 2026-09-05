package org.wild.mixin.perf;

import java.util.ArrayList;
import java.util.Map;
import java.util.Optional;
import java.util.concurrent.ConcurrentHashMap;
import net.minecraft.class_2583;
import net.minecraft.class_5348;
import net.minecraft.class_5481;
import net.minecraft.class_5491;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin({class_5491.class})
public class ReorderingUtilMixin {
   private static final Map<class_5348, class_5481> WILD$CACHE = new ConcurrentHashMap<>(2048);
   private static final int WILD$CACHE_LIMIT = 8192;

   @Inject(
      method = {"reorder"},
      at = {@At("HEAD")},
      cancellable = true
   )
   private static void wild$skipBidi(class_5348 var0, boolean var1, CallbackInfoReturnable<class_5481> var2) {
      if (var0 == null) {
         var2.setReturnValue(class_5481.field_26385);
      } else {
         class_5481 var3 = WILD$CACHE.get(var0);
         if (var3 != null) {
            var2.setReturnValue(var3);
         } else {
            class_5481 var4 = wild$buildLtr(var0);
            if (WILD$CACHE.size() >= 8192) {
               WILD$CACHE.clear();
            }

            WILD$CACHE.put(var0, var4);
            var2.setReturnValue(var4);
         }
      }
   }

   private static class_5481 wild$buildLtr(class_5348 var0) {
      ArrayList var1 = new ArrayList(4);
      var0.method_27658((var1x, var2) -> {
         if (!var2.isEmpty()) {
            var1.add(class_5481.method_30747(var2, var1x));
         }

         return Optional.empty();
      }, class_2583.field_24360);
      if (var1.isEmpty()) {
         return class_5481.field_26385;
      } else {
         return var1.size() == 1 ? (class_5481)var1.get(0) : class_5481.method_30749(var1);
      }
   }
}
