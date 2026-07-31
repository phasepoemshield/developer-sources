package sg.mx;

import java.util.ArrayList;
import java.util.List;
import net.minecraft.client.option.GameOptions;
import net.minecraft.client.option.GraphicsMode;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.ModifyArg;

@Mixin(GameOptions.class)
public class GameOptionsMixin {
   @ModifyArg(
      method = "<init>",
      at = @At(
         value = "INVOKE",
         target = "Lnet/minecraft/client/option/SimpleOption$AlternateValuesSupportingCyclingCallbacks;<init>(Ljava/util/List;Ljava/util/List;Ljava/util/function/BooleanSupplier;Lnet/minecraft/client/option/SimpleOption$CyclingCallbacks$ValueSetter;Lcom/mojang/serialization/Codec;)V"
      ),
      index = 0
   )
   private List<?> destra$removeFabulousFromPrimaryValues(List<?> var1) {
      return destra$withoutFabulous(var1);
   }

   @ModifyArg(
      method = "<init>",
      at = @At(
         value = "INVOKE",
         target = "Lnet/minecraft/client/option/SimpleOption$AlternateValuesSupportingCyclingCallbacks;<init>(Ljava/util/List;Ljava/util/List;Ljava/util/function/BooleanSupplier;Lnet/minecraft/client/option/SimpleOption$CyclingCallbacks$ValueSetter;Lcom/mojang/serialization/Codec;)V"
      ),
      index = 1
   )
   private List<?> destra$removeFabulousFromAltValues(List<?> var1) {
      return destra$withoutFabulous(var1);
   }

   private static List<?> destra$withoutFabulous(List<?> var0) {
      boolean var1 = false;
      boolean var2 = false;

      for (Object var4 : var0) {
         if (var4 instanceof GraphicsMode) {
            var1 = true;
            if (var4 == GraphicsMode.FABULOUS) {
               var2 = true;
               break;
            }
         }
      }

      if (var1 && var2) {
         ArrayList var6 = new ArrayList(var0.size() - 1);

         for (Object var5 : var0) {
            if (var5 != GraphicsMode.FABULOUS) {
               var6.add(var5);
            }
         }

         return var6;
      } else {
         return var0;
      }
   }
}
