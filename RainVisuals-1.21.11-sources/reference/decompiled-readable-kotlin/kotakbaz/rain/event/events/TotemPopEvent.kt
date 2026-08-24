package kotakbaz.rain.event.events

import net.minecraft.entity.player.PlayerEntity

// $VF: Compiled from TotemPopEvent.kt
public data class TotemPopEvent {
   private PlayerEntity player;

   fun TotemPopEvent(player: PlayerEntity) {
      this.player = player
   }

   public override operator fun equals(other: Any?): Boolean {
      label22@
      if (this === other) {
         return true
      } else {
         return other is TotemPopEvent && this.player == (other as TotemPopEvent).player
      }
   }

   public override fun hashCode(): Int {
      return this.player.hashCode()
   }

   fun component1(): PlayerEntity {
      this.player
   }

   fun copy(player: PlayerEntity): TotemPopEvent {
      TotemPopEvent(player)
   }

   public override fun toString(): String {
      return "TotemPopEvent(player=${this.player})"
   }

   fun getPlayer(): PlayerEntity {
      this.player
   }
}
