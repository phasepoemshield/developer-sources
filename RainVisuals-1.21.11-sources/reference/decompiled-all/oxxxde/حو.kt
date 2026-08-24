package oxxxde

import java.util.ArrayList
import net.minecraft.client.world.ClientWorld
import net.minecraft.entity.Entity
import net.minecraft.entity.LivingEntity
import net.minecraft.entity.player.PlayerEntity
import net.minecraft.entity.projectile.ProjectileUtil
import net.minecraft.fluid.FluidState
import net.minecraft.registry.tag.FluidTags
import net.minecraft.registry.tag.TagKey
import net.minecraft.util.hit.BlockHitResult
import net.minecraft.util.hit.EntityHitResult
import net.minecraft.util.hit.HitResult.Type
import net.minecraft.util.math.BlockPos
import net.minecraft.util.math.Box
import net.minecraft.util.math.Position
import net.minecraft.util.math.Vec3d
import net.minecraft.world.RaycastContext
import net.minecraft.world.World
import net.minecraft.world.RaycastContext.FluidHandling
import net.minecraft.world.RaycastContext.ShapeType

// $VF: Compiled from heavy
internal object حو {
   private const val MAX_STEPS: Int = 240
   private const val WORLD_HEIGHT_PADDING: Double = 16.0
   private const val SEARCH_MARGIN: Double = 1.0

   fun predict(shooter: ClientWorld, world: PlayerEntity, launch: ظر): بخ {
      val points: ArrayList = ArrayList(241)
      var var15: Any = launch.getOrigin()
      var var16: Any = this.initialVelocity(launch)
      points.add(var15)
      val var7: Short = 240

      repeat(var7) { var8 ->
         val var10000: FluidState = world.getFluidState(BlockPos.ofFloored(var15 as Position))
         val var22: TagKey = FluidTags.WATER
         val inWater: Boolean = var10000.isIn(var22)
         val var19: Vec3d = if (inWater) var16.multiply(launch.getProjectile().waterDrag) else var16
         val var23: Vec3d = var15.add(var19)
         val var21: اأ = INSTANCE.findCollision(world, shooter, var15, var23)
         if (var21 != null) {
            points.add(var21.getPosition())
            بخ(points, var21)
         }

         var15 = var23
         points.add(var23)
         if (INSTANCE.isOutsideWorld(world, var23)) {
            بخ(points, اأ(شِ.LIMIT, var23, null, 4, null))
         }

         val var24: Vec3d
         if (inWater) {
            var24 = var19
         } else {
            var24 = var16.multiply(launch.getProjectile().airDrag)
         }

         val var25: Vec3d = var24.add(0.0, -launch.getProjectile().gravity, 0.0)
         var16 = var25
      }

      بخ(points, اأ(شِ.LIMIT, CollectionsKt.last(points), null, 4, null))
   }

   fun isOutsideWorld(position: ClientWorld, world: Vec3d): Boolean {
      position.y < طث.getBottomY(world as World) - 16.0 || position.y > طث.getTopYInclusive(world as World) + 16.0
   }

   fun initialVelocity(launch: ظر): Vec3d {
      var var10000: Vec3d = launch.getDirection().normalize().multiply(launch.speed)
      if (!launch.getProjectile().inheritsShooterMovement) {
         var10000
      } else {
         var10000 = var10000.add(launch.getInheritedMovement().x, launch.getInheritedMovement().y, launch.getInheritedMovement().z)
         var10000
      }
   }

   fun isValidTarget(shooter: PlayerEntity, entity: Entity): Boolean {
      (entity as? LivingEntity) != null
         && (entity as? LivingEntity) != shooter
         && !(entity as? LivingEntity).isRemoved()
         && (entity as? LivingEntity).isAlive()
         && (entity as? LivingEntity).canBeHitByProjectile()
         && !(entity as? LivingEntity).isConnectedThroughVehicle(shooter as Entity)
         && ((entity as? LivingEntity) !is PlayerEntity || shooter.shouldDamagePlayer((entity as? LivingEntity) as PlayerEntity))
      }

   fun findCollision(shooter: ClientWorld, start: PlayerEntity, intendedEnd: Vec3d, world: Vec3d): اأ {
      val var10000: BlockHitResult = (world as World).raycast(RaycastContext(start, intendedEnd, ShapeType.COLLIDER, FluidHandling.NONE, shooter as Entity))
      val var14: Vec3d
      if (var10000.getType() === Type.MISS) {
         var14 = intendedEnd
      } else {
         var14 = var10000.getPos()
      }

      val var15: Box = Box(start, var14).expand(1.0)
      val entityHit: EntityHitResult = ProjectileUtil.raycast(shooter as Entity, start, var14, var15, { entity: Entity ->
         INSTANCE.isValidTarget(`$shooter`, entity)
      }, start.squaredDistanceTo(var14))
      if (entityHit != null) {
         val var16: شِ = شِ.ENTITY
         val var17: Vec3d = entityHit.getPos()
         val var10004: Entity = entityHit.getEntity()
         اأ(var16, var17, var10004 as LivingEntity)
      } else if (var10000.getType() != Type.MISS) {
         val var10002: شِ = شِ.BLOCK
         val var10003: Vec3d = var10000.getPos()
         اأ(var10002, var10003, null, 4, null)
      } else {
         null
      }
   }
}
