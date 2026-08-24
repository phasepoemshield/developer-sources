package oxxxde

import net.minecraft.entity.Entity
import net.minecraft.entity.player.PlayerEntity
import net.minecraft.util.hit.EntityHitResult
import net.minecraft.util.hit.HitResult
import ru.ocz.protection.virtualmachine.annotation.RecompileFormat

// $VF: Compiled from heavy
@RecompileFormat
public object ظً {
   @JvmStatic
   private PlayerEntity currentTarget;
   private const val LIVE_TARGET_MILLIS: Long = 100L
   private final var lastSeenAt: Long
   private const val HOLD_MILLIS: Long = 3000L

   public fun update() {
      val hovered: PlayerEntity = this.hoveredPlayer()
      val now: Long = System.currentTimeMillis()
      if (hovered != null) {
         currentTarget = hovered
         lastSeenAt = now
      } else if ((currentTarget == null || !this.isUsableTarget(currentTarget)) && now - lastSeenAt > 3000L) {
         currentTarget = null
      }
   }

   fun liveTarget(): PlayerEntity? {
      if (currentTarget == null) {
         null
      } else {
         val target: PlayerEntity = currentTarget
         if (!this.isUsableTarget(currentTarget)) {
            null
         } else {
            if (System.currentTimeMillis() - lastSeenAt > 100L) null else target
         }
      }
   }

   fun hoveredPlayer(): PlayerEntity {
      val var3: HitResult = ضك.getMc().crosshairTarget
      val var10000: EntityHitResult = var3 as? EntityHitResult
      if ((var3 as? EntityHitResult) == null) {
         null
      } else {
         val p0: Entity = var10000.getEntity()
         val var8: PlayerEntity = p0 as? PlayerEntity
         if ((p0 as? PlayerEntity) == null) {
            null
         } else if (var8 == ضك.getMc().player) {
            null
         } else {
            if (this.isUsableTarget(var8)) var8 else null
         }
      }
   }

   fun hoveredTarget(): PlayerEntity? {
      this.hoveredPlayer()
   }

   fun isUsableTarget(player: PlayerEntity): Boolean {
      !player.isRemoved() && player.isAlive()
   }

   fun currentTarget(): PlayerEntity? {
      if (currentTarget == null) {
         null
      } else {
         val target: PlayerEntity = currentTarget
         if (!this.isUsableTarget(currentTarget)) {
            null
         } else {
            if (System.currentTimeMillis() - lastSeenAt > 3000L) null else target
         }
      }
   }

   fun track(player: PlayerEntity) {
      if (this.isUsableTarget(player)) {
         currentTarget = player
         lastSeenAt = System.currentTimeMillis()
      }
   }
}
