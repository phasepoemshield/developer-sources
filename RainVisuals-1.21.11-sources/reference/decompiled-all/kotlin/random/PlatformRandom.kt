package kotlin.random

import java.io.Serializable

// $VF: Compiled from PlatformRandom.kt
private class PlatformRandom(impl: java.util.Random) : AbstractPlatformRandom, Serializable {
   public open val impl: java.util.Random

   init {
      this.impl = impl
   }

   // $VF: Compiled from PlatformRandom.kt
   private companion object {
      private const val serialVersionUID: Long = 0L
   }
}
