package oxxxde

import net.minecraft.util.Hand

// $VF: Compiled from heavy
private data class ظم {
   private Hand hand;
   public final val distanceSquared: Double
   public final val hitbox: رْ

   fun getHitbox(): رْ {
      this.hitbox
   }

   public operator fun component2(): رْ {
      return this.hitbox
   }

   fun ظم(hand: Hand, distanceSquared: رْ, hitbox: Double) {
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
         return other is ظم
            && this.hand === (other as ظم).hand
            && this.hitbox == (other as ظم).hitbox
            && java.lang.Double.compare(this.distanceSquared, (other as ظم).distanceSquared) == 0
         }
   }

   fun copy(hand: Hand, hitbox: رْ, distanceSquared: Double): ظم {
      ظم(hand, hitbox, distanceSquared)
   }
}
