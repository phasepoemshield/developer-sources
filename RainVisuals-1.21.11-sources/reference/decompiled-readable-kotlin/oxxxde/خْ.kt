package oxxxde

import kotakbaz.rain.mixin.OptionInstanceAccessor
import kotakbaz.rain.module.Module
import kotakbaz.rain.module.setting.ModeSetting
import net.minecraft.client.network.ClientPlayerEntity
import net.minecraft.client.option.SimpleOption
import net.minecraft.entity.LivingEntity
import net.minecraft.entity.effect.StatusEffectInstance
import net.minecraft.entity.effect.StatusEffects
import net.minecraft.registry.entry.RegistryEntry
import sweetie.evaware.flora.api.Commando

// $VF: Compiled from heavy
public object خْ : Module("Fullbright", RENDER, "Убирает темноту") {
   private const val MODE_GAMMA: String = "Gamma"
   @JvmStatic
   private ModeSetting brightnessMode = Module.mode$default(خْ.INSTANCE, "Режим", CollectionsKt.listOf("Gamma", "Night Vision"), 0, null, 12, null)
      .withDisplayNameProvider({ it: java.lang.String ->
         if (it == "Gamma") "Гамма" else (if (it == "Night Vision") "Ночное зрение" else it)
      });
   private const val FULL_BRIGHT_GAMMA: Double = 16.0
   private final var effectApplied: Boolean
   private const val EFFECT_DURATION: Int = 400
   private const val MODE_NIGHT_VISION: String = "Night Vision"
   private final var previousGamma: Double?

   @Commando
   public fun onUpdate(event: سح) {
      if (brightnessMode.getValue() == "Night Vision") {
         this.restoreGammaIfNeeded()
         this.applyEffectMode()
      } else {
         this.clearEffectIfNeeded()
         this.applyGammaMode()
      }
   }

   public override fun onDisable() {
      this.clearEffectIfNeeded()
      this.restoreGammaIfNeeded()
      super.onDisable()
   }

   private fun restoreGammaIfNeeded() {
      if (previousGamma != null) {
         ضك.getMc().options.getGamma().setValue(previousGamma)
         previousGamma = null
      }
   }

   private fun applyGammaMode() {
      val var10000: SimpleOption = ضك.getMc().options.getGamma()
      if (previousGamma == null) {
         previousGamma = var10000.getValue() as java.lang.Double
      }

      (var10000 as OptionInstanceAccessor).rain$setValue(16.0)
   }

   private fun applyEffectMode() {
      val var10000: ClientPlayerEntity = ضك.getMc().player
      if (var10000 != null) {
         var10000.addStatusEffect(StatusEffectInstance(StatusEffects.NIGHT_VISION, 400, 0, false, false, false))
         effectApplied = true
      }
   }

   fun isInjectedNightVisionEffect(effect: StatusEffectInstance): Boolean {
      طث.getEffectType(effect) == StatusEffects.NIGHT_VISION
         && effect.getAmplifier() == 0
         && effect.getDuration() > 0
         && effect.getDuration() <= 400
         && !effect.isAmbient()
         && !effect.shouldShowParticles()
         && !effect.shouldShowIcon()
      }

   private fun clearEffectIfNeeded() {
      val player: ClientPlayerEntity = ضك.getMc().player
      if (effectApplied && player != null) {
         var `$this$removeStatusEffect$iv`: LivingEntity = player as LivingEntity
         var var10000: RegistryEntry = StatusEffects.NIGHT_VISION
         val currentEffect: StatusEffectInstance = `$this$removeStatusEffect$iv`.getStatusEffect(var10000)
         if (currentEffect != null && this.isInjectedNightVisionEffect(currentEffect)) {
            `$this$removeStatusEffect$iv` = player as LivingEntity
            var10000 = StatusEffects.NIGHT_VISION
            `$this$removeStatusEffect$iv`.removeStatusEffect(var10000)
         }

         effectApplied = false
      } else {
         effectApplied = false
      }
   }

   public fun usesNightVisionEffect(): Boolean {
      return this.isEnabled() && brightnessMode.getValue() == "Night Vision"
   }
}
