package oxxxde

import net.minecraft.entity.player.PlayerEntity
import net.minecraft.util.ActionResult
import net.minecraft.util.Hand

// $VF: Compiled from ItemUseEvent.kt
public class جم {
   private PlayerEntity player;
   private Hand hand;
   private ActionResult actionResult;

   fun getPlayer(): PlayerEntity {
      this.player
   }

   fun getActionResult(): ActionResult {
      this.actionResult
   }

   fun getHand(): Hand {
      this.hand
   }

   fun جم(player: PlayerEntity, hand: Hand, actionResult: ActionResult) {
      this.player = player
      this.hand = hand
      this.actionResult = actionResult
   }
}
