package oxxxde

import kotakbaz.rain.mixin.MinecraftClientAccessor
import net.minecraft.client.MinecraftClient
import net.minecraft.client.network.ClientPlayerEntity
import net.minecraft.item.Items
import ru.ocz.protection.annotation.Compile
import sweetie.evaware.flora.api.Commando

// $VF: Compiled from heavy
public object سه : دِ("FastExp", ظن.getPLAYER(), "Быстрый бросок пузырьков опыта>") {
   private final val speed: طُ = دِ.slider$default(سه.INSTANCE, "Скорость", 4.0F, 1.0F, 4.0F, 1.0F, null, 32, null)
   private final val onlyWithoutPvp: خذ = دِ.boolean$default(INSTANCE, "Только без пвп", false, null, 4, null)

   @JvmStatic
   fun {
      اُ.moduleOnFuntime$default(اُ.INSTANCE, INSTANCE, null, 2, null)
   }

   @Commando
   @Compile
   public fun onUpdate(event: سح) {
      val var2: ClientPlayerEntity = ضك.getMc().player
      if (var2 != null) {
         if (ضك.getMc().world != null) {
            if (!onlyWithoutPvp.getValue() || !ثو.INSTANCE.isCombatTagged()) {
               if (var2.getMainHandStack().isOf(Items.EXPERIENCE_BOTTLE) || var2.getOffHandStack().isOf(Items.EXPERIENCE_BOTTLE)) {
                  val var3: MinecraftClient = ضك.getMc()
                  if (var3 is MinecraftClientAccessor) {
                     val var5: MinecraftClientAccessor = var3 as MinecraftClientAccessor
                     val var4: Int = RangesKt.coerceAtLeast(5 - (int)speed.getValue().floatValue(), 0)
                     if (var5.rain$getItemUseCooldown() > var4) {
                        var5.rain$setItemUseCooldown(var4)
                     }
                  }
               }
            }
         }
      }
   }
}
