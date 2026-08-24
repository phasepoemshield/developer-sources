package oxxxde

import java.util.Arrays
import java.util.LinkedHashMap
import net.minecraft.client.network.ClientPlayerEntity
import net.minecraft.entity.LivingEntity
import net.minecraft.entity.effect.StatusEffectInstance
import net.minecraft.registry.Registries
import net.minecraft.text.Text
import net.minecraft.util.Identifier
import sweetie.evaware.flora.api.Commando

// $VF: Compiled from heavy
public object بآ : زك("Potions", "Отображает активные зелья", 200.0F, 200.0F, "q") {
   private final var amplifierSnapshot: IntArray = IntArray(8)
   private final var effectCount: Int
   private final var durationDisplaySnapshot: IntArray = IntArray(8)
   @JvmStatic
   private StatusEffectInstance[] effectSnapshot = arrayOfNulls(8);
   private final val map: LinkedHashMap<صه, تِ> = LinkedHashMap()

   private fun durationDisplayKey(ticks: Int): Int {
      return if (ticks == -1) -1 else ticks / 20
   }

   @Commando
   public fun onOverlayRender(event: ثآ) {
      this.renderContainer(event)
   }

   protected override fun getCurrentData(): Map<صه, تِ> {
      val var10000: ClientPlayerEntity = ضك.getMc().player
      if (var10000 == null) {
         val var11: بآ = this
         if (effectCount != 0) {
            effectCount = 0
            map.clear()
         }

         return map
      } else {
         var nextCount: Int = 0
         var changed: Boolean = false

         for (effect in طث.getStatusEffects(var10000 as LivingEntity)) {
            if (!خْ.INSTANCE.isInjectedNightVisionEffect(effect)) {
               this.ensureSnapshotCapacity(nextCount + 1)
               val effectx: Int = this.durationDisplayKey(effect.getDuration())
               if (effectSnapshot[nextCount] != effect
                  || amplifierSnapshot[nextCount] != effect.getAmplifier()
                  || durationDisplaySnapshot[nextCount] != effectx) {
                  changed = true
               }

               effectSnapshot[nextCount] = effect
               amplifierSnapshot[nextCount] = effect.getAmplifier()
               durationDisplaySnapshot[nextCount] = effectx
               nextCount++
            }
         }

         if (nextCount != effectCount) {
            changed = true
         }

         effectCount = nextCount
         if (!changed) {
            return map
         } else {
            map.clear()
            var var10: Int = 0

            for (var12 in effectCount..var10) {
               val var15: StatusEffectInstance = effectSnapshot[var10]
               if (effectSnapshot[var10] != null) {
                  map.put(
                     صه(
                        "${Text.translatable(طث.getTranslationKey(var15)).getString()}${if (var15.getAmplifier() > 0) " ${var15.getAmplifier() + 1}" else ""}",
                        جا(this.effectIconTexture(var15))
                     ),
                     تِ(this.durationText(var15.getDuration()), طغ.INSTANCE.VALUE_COLOR)
                  )
               }
            }

            return map
         }
      }
   }

   fun effectIconTexture(effect: StatusEffectInstance): Identifier {
      var var10000: Identifier = Registries.STATUS_EFFECT.getId(طث.getEffectType(effect).value())
      if (var10000 == null) {
         var10000 = Identifier.ofVanilla("speed")
      }

      var10000 = Identifier.of(var10000.getNamespace(), "textures/mob_effect/${var10000.getPath()}.png")
      var10000
   }

   private fun ensureSnapshotCapacity(required: Int) {
      if (required > effectSnapshot.length) {
         val newSize: Int = Math.max(required, effectSnapshot.length * 2)
         val var10000: Array<Any> = Arrays.copyOf(effectSnapshot, newSize)
         effectSnapshot = var10000 as Array<StatusEffectInstance>
         var var3: IntArray = Arrays.copyOf(amplifierSnapshot, newSize)
         amplifierSnapshot = var3
         var3 = Arrays.copyOf(durationDisplaySnapshot, newSize)
         durationDisplaySnapshot = var3
      }
   }

   public fun durationText(ticks: Int): String {
      if (ticks == -1) {
         return "**:**"
      } else {
         val seconds: Int = ticks / 20
         val minutes: Int = ticks / 20 / 60
         val hours: Int = ticks / 20 / 60 / 60
         val normalizedMinutes: Int = ticks / 20 / 60 % 60
         val remainingSeconds: Int = seconds % 60
         val var10000: java.lang.String
         if (hours > 0) {
            val var10: Array<Any> = arrayOf(hours, normalizedMinutes, remainingSeconds)
            var10000 = java.lang.String.format("%d:%02d:%02d", Arrays.copyOf(var10, var10.length))
         } else if (minutes > 0) {
            val var12: Array<Any> = arrayOf(minutes, remainingSeconds)
            var10000 = java.lang.String.format("%d:%02d", Arrays.copyOf(var12, var12.length))
         } else {
            var10000 = "$secondss"
         }

         return var10000
      }
   }
}
