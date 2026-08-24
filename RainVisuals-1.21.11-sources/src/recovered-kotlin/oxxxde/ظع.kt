package oxxxde

import kotakbaz.rain.module.modules.render.HitParticlesModule$ParticlePhysics

// $VF: Class flags could not be determined
// $VF: Compiled from heavy
@JvmSynthetic
internal class ظع {
   @JvmStatic
   fun {
      val var0: IntArray = IntArray(HitParticlesModule$ParticlePhysics.values().length)

      try {
         var0[HitParticlesModule$ParticlePhysics.EXPLOSION.ordinal()] = 1
      } catch (var3: NoSuchFieldError) {
      }

      try {
         var0[HitParticlesModule$ParticlePhysics.BOUNCE.ordinal()] = 2
      } catch (var2: NoSuchFieldError) {
      }

      $EnumSwitchMapping$0 = var0
   }
}
