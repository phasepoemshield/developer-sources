package oxxxde

import net.minecraft.client.network.ClientPlayerEntity
import net.minecraft.client.sound.PositionedSoundInstance
import net.minecraft.client.sound.SoundInstance
import net.minecraft.entity.LivingEntity
import net.minecraft.entity.effect.StatusEffects
import net.minecraft.entity.player.PlayerEntity
import net.minecraft.registry.entry.RegistryEntry
import net.minecraft.sound.SoundEvent
import sweetie.evaware.flora.api.Commando

// $VF: Compiled from heavy
public object بو : دِ("HitSounds", ظن.getPLAYER(), "Возпроизведение звуков при ударе") {
   private final val onlyCrit: خذ = دِ.boolean$default(بو.INSTANCE, "Только при крите", false, null, 4, null)
   private const val SOUND_BONK: Int = 1
   private final val volume: طُ = دِ.slider$default(INSTANCE, "Громкость", 1.0F, 0.1F, 2.0F, 0.1F, null, 32, null)
   private const val SOUND_BELL: Int = 0
   private final val sound: ظي = دِ.mode$default(INSTANCE, "Звук", CollectionsKt.listOf("Колокол", "Бонк", "Пузырёк", "Поп", ">_<", "Вк"), 0, null, 12, null)
   private const val SOUND_UWU: Int = 4
   private const val SOUND_POP: Int = 3
   private const val SOUND_BUBBLE: Int = 2
   private final val soundLabels: Map<String, String> =
      MapsKt.mapOf("Bell" to "Bell", "Bonk" to "Bonk", "Bubble" to "Bubble", "Pop" to "Pop", "Uwu" to "Uwu", "Vk" to "VK")
      private const val SOUND_VK: Int = 5

   fun selectedSound(): SoundEvent {
      var var10000: SoundEvent
      when (sound.selectedIndex) {
         0 -> var10000 = زد.INSTANCE.getBELL()
         1 -> var10000 = زد.INSTANCE.getBONK()
         2 -> var10000 = زد.INSTANCE.getBUBBLE()
         3 -> var10000 = زد.INSTANCE.getPOP()
         4 -> var10000 = زد.INSTANCE.getUWU()
         5 -> var10000 = زد.INSTANCE.getVK()
         else -> var10000 = زد.INSTANCE.getBELL()
      }

      var10000
   }

   private fun displayNameForSound(mode: String): String {
      var var10000: java.lang.String = soundLabels.get(mode)
      if (var10000 == null) {
         var10000 = mode
      }

      return var10000
   }

   fun isCriticalHit(player: ClientPlayerEntity): Boolean {
      if (player.fallDistance > 0.0
         && !player.isOnGround()
         && !طث.isClimbing(player as LivingEntity)
         && !player.isTouchingWater()
         && !player.hasVehicle()
         && !player.isSprinting()) {
         val `$this$hasStatusEffect$iv`: LivingEntity = player as LivingEntity
         val var10000: RegistryEntry = StatusEffects.BLINDNESS
         if (!`$this$hasStatusEffect$iv`.hasStatusEffect(var10000) && player.getAttackCooldownProgress(0.5F) > 0.9F) {
            true
         }
      }

      false
   }

   @Commando
   public fun onAttack(event: ذم) {
      val var10000: ClientPlayerEntity = ضك.getMc().player
      if (var10000 != null) {
         if (this.isEnabled()) {
            if (event.getEntity() is PlayerEntity) {
               if (!اإ.INSTANCE.isFakePlayer(event.getEntity())) {
                  if (!onlyCrit.getValue() || this.isCriticalHit(var10000)) {
                     ضك.getMc().getSoundManager().play(PositionedSoundInstance.ui(this.selectedSound(), 1.0F, volume.getValue().floatValue()) as SoundInstance)
                  }
               }
            }
         }
      }
   }
}
