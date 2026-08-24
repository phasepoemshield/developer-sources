package kotakbaz.rain.module.modules.render

import net.minecraft.util.Hand
import oxxxde.رْ

// $VF: Compiled from heavy
private data class `ViewModelModule$HandHitTarget` {
   private Hand hand;
   public final val distanceSquared: Double
   private ViewModelModule$HandHitbox hitbox;

   public final val hitbox: رْ

   public operator fun component2(): رْ {
      return this.hitbox
   }

   fun `ViewModelModule$HandHitTarget`(hand: Hand, distanceSquared: ViewModelModule$HandHitbox, hitbox: Double) {
      this.hand = hand
      this.hitbox = hitbox
      this.distanceSquared = distanceSquared
   }

   fun component1(): Hand {
      this.hand
   }

   public override fun hashCode(): Int {
      return (this.hand.hashCode() * 31 + this.hitbox.hashCode()) * 31 + java.lang.Double.hashCode(this.distanceSquared)
   }

   public operator fun component3(): Double {
      return this.distanceSquared
   }

   public override fun toString(): String {
      return "HandHitTarget(hand=${this.hand}, hitbox=${this.hitbox}, distanceSquared=${this.distanceSquared})"
   }

   fun getHand(): Hand {
      this.hand
   }

   public override operator fun equals(other: Any?): Boolean {
      label34@
      if (this === other) {
         return true
      } else {
         return other is ViewModelModule$HandHitTarget
            && this.hand === (other as ViewModelModule$HandHitTarget).hand
            && this.hitbox == (other as ViewModelModule$HandHitTarget).hitbox
            && java.lang.Double.compare(this.distanceSquared, (other as ViewModelModule$HandHitTarget).distanceSquared) == 0
         }
   }

   fun copy(hand: Hand, hitbox: ViewModelModule$HandHitbox, distanceSquared: Double): ViewModelModule$HandHitTarget {
      ViewModelModule$HandHitTarget(hand, hitbox, distanceSquared)
   }
}
