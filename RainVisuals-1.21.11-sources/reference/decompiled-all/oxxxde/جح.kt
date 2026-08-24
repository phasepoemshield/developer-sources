package oxxxde

import net.minecraft.entity.Entity
import net.minecraft.entity.LivingEntity
import net.minecraft.entity.player.PlayerEntity
import net.minecraft.util.math.Vec3d

// $VF: Compiled from heavy
public companion object جح {
   fun from(player: PlayerEntity, position: Vec3d, createdAt: Long): خب {
      خب(
         createdAt,
         position,
         طث.getPitch(player as Entity),
         طث.getBodyYaw(player as LivingEntity),
         طث.getHeadYaw(player as LivingEntity),
         player.limbAnimator.getAnimationProgress(),
         player.limbAnimator.getSpeed(),
         player.isGliding()
      )
   }
}
