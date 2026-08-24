package oxxxde

import java.util.ArrayList
import kotakbaz.rain.module.Module
import kotakbaz.rain.module.modules.render.PredictsModule$HeldWeapon
import kotakbaz.rain.module.modules.render.predicts.PredictedProjectile
import kotakbaz.rain.module.modules.render.predicts.ProjectileLaunch
import kotakbaz.rain.module.modules.render.predicts.TrajectoryPrediction
import kotakbaz.rain.module.setting.settings.BooleanSetting
import net.minecraft.client.network.ClientPlayerEntity
import net.minecraft.client.option.GameOptions
import net.minecraft.client.world.ClientWorld
import net.minecraft.component.DataComponentTypes
import net.minecraft.component.type.ChargedProjectilesComponent
import net.minecraft.enchantment.EnchantmentHelper
import net.minecraft.entity.LivingEntity
import net.minecraft.entity.player.PlayerEntity
import net.minecraft.item.CrossbowItem
import net.minecraft.item.ItemStack
import net.minecraft.item.Items
import net.minecraft.util.math.Vec3d
import sweetie.evaware.flora.api.Commando

// $VF: Compiled from heavy
public object جق : Module("Predicts", RENDER, "Отображение траектории предметов") {
   @JvmStatic
   private BooleanSetting crossbow = Module.boolean$default(جق.INSTANCE, "Арбалет", true, null, 4, null);
   @JvmStatic
   private BooleanSetting enderPearl = Module.boolean$default(جق.INSTANCE, "Эндер-перл", true, null, 4, null);
   private const val CROSSHAIR_START_DISTANCE: Double = 0.15
   private const val TRIDENT_CHARGE_TICKS: Float = 10.0F
   private const val MIN_BOW_POWER: Float = 0.1F
   @JvmStatic
   private Vec3d currentMovement;
   @JvmStatic
   private Vec3d previousMovement;
   @JvmStatic
   private PlayerEntity trackedMotionPlayer;
   private const val BOW_MAX_SPEED: Double = 3.0
   @JvmStatic
   private BooleanSetting trident = Module.boolean$default(INSTANCE, "Трезубец", true, null, 4, null);
   private final var lastMotionTick: Int = -1
   private const val LINE_WIDTH: Float = 2.0F
   @JvmStatic
   private BooleanSetting bow = Module.boolean$default(INSTANCE, "Лук", true, null, 4, null);
   private const val BOW_CHARGE_TICKS: Float = 20.0F
   private const val MARKER_SIZE: Float = 0.25F

   public override fun onDisable() {
      this.resetMotionSmoothing()
   }

   fun findHeldWeapon(player: PlayerEntity): PredictsModule$HeldWeapon {
      if (player.isUsingItem()) {
         val var10001: ItemStack = player.getActiveItem()
         val mainHand: PredictsModule$HeldWeapon = this.resolveWeapon(var10001)
         if (mainHand != null) {
            mainHand
         }
      }

      var var6: ItemStack = player.getMainHandStack()
      val var5: PredictsModule$HeldWeapon = this.resolveWeapon(var6)
      if (var5 != null) {
         var5
      } else {
         var6 = player.getOffHandStack()
         this.resolveWeapon(var6)
      }
   }

   fun bowPower(partialTicks: PlayerEntity, player: Float): Float {
      val charge: Float = player.getItemUseTime(partialTicks) / 20.0F
      RangesKt.coerceIn((charge * charge + charge * 2.0F) / 3.0F, 0.0F, 1.0F)
   }

   fun resolveWeapon(stack: ItemStack): PredictsModule$HeldWeapon {
      if (crossbow.getValue() && stack.isOf(Items.CROSSBOW))
         PredictsModule$HeldWeapon(stack, PredictedProjectile.CROSSBOW_ARROW)
         else
         (
            if (bow.getValue() && stack.isOf(Items.BOW))
               PredictsModule$HeldWeapon(stack, PredictedProjectile.BOW_ARROW)
               else
               (
                  if (enderPearl.getValue() && stack.isOf(Items.ENDER_PEARL))
                     PredictsModule$HeldWeapon(stack, PredictedProjectile.ENDER_PEARL)
                     else
                     (if (trident.getValue() && stack.isOf(Items.TRIDENT)) PredictsModule$HeldWeapon(stack, PredictedProjectile.TRIDENT) else null)
               )
         )
      }

   @JvmStatic
   fun {
      var var10000: Vec3d = Vec3d.ZERO
      previousMovement = var10000
      var10000 = Vec3d.ZERO
      currentMovement = var10000
   }

   fun createLaunches(weapon: PlayerEntity, player: PredictsModule$HeldWeapon, cameraPos: Vec3d, partialTicks: Float): MutableList<ProjectileLaunch> {
      if (weapon.projectile === PredictedProjectile.TRIDENT && EnchantmentHelper.getTridentSpinAttackStrength(weapon.getStack(), player as LivingEntity) > 0.0F
         )
       {
         CollectionsKt.emptyList()
      } else {
         var var10000: ChargedProjectilesComponent = player.getRotationVec(partialTicks).normalize()
         var10000 = cameraPos.add(var10000.multiply(0.15))
         if (weapon.projectile === PredictedProjectile.TRIDENT || weapon.projectile === PredictedProjectile.ENDER_PEARL) {
            CollectionsKt.listOf(ProjectileLaunch(var10000, var10000, weapon.projectile, 0.0, this.smoothShooterMovement(player, partialTicks), 8, null))
         } else if (weapon.projectile === PredictedProjectile.BOW_ARROW) {
            if (player.isUsingItem() && player.getActiveItem().isOf(Items.BOW)) {
               val var14: Float = this.bowPower(player, partialTicks)
               if (var14 < 0.1F)
                  CollectionsKt.emptyList()
                  else
                  CollectionsKt.listOf(
                     ProjectileLaunch(var10000, var10000, weapon.projectile, 3.0 * (double)var14, this.smoothShooterMovement(player, partialTicks))
                  )
               } else {
               CollectionsKt.emptyList()
            }
         } else if (!CrossbowItem.isCharged(weapon.getStack())) {
            CollectionsKt.emptyList()
         } else {
            var10000 = (ChargedProjectilesComponent)weapon.getStack().getOrDefault(DataComponentTypes.CHARGED_PROJECTILES, ChargedProjectilesComponent.DEFAULT)
            val charged: ChargedProjectilesComponent = var10000
            if (var10000.contains(Items.FIREWORK_ROCKET)) {
               CollectionsKt.emptyList()
            } else {
               val var17: java.util.List = charged.getProjectiles()
               val `$this$none$iv`: java.lang.Iterable = var17
               val var18: Boolean
               if (var17 is java.util.Collection && (var17 as java.util.Collection).isEmpty()) {
                  var18 = true
               } else {
                  for (`element$iv` in `$this$none$iv`) {
                     if (!(`element$iv` as ItemStack).isEmpty()) {
                        if (false)
                           CollectionsKt.emptyList()
                           else
                           CollectionsKt.listOf(ProjectileLaunch(var10000, var10000, weapon.projectile, 0.0, null, 24, null))
                        }
                  }

                  var18 = true
               }

               if (var18) CollectionsKt.emptyList() else CollectionsKt.listOf(ProjectileLaunch(var10000, var10000, weapon.projectile, 0.0, null, 24, null))
            }
         }
      }
   }

   private fun resetMotionSmoothing() {
      trackedMotionPlayer = null
      lastMotionTick = -1
      var var10000: Vec3d = Vec3d.ZERO
      previousMovement = var10000
      var10000 = Vec3d.ZERO
      currentMovement = var10000
   }

   fun smoothShooterMovement(player: PlayerEntity, partialTicks: Float): Vec3d {
      val sampledMovement: Vec3d = this.sampleShooterMovement(player)
      val tick: Int = player.age
      val ticksPassed: Int = player.age - lastMotionTick
      if (trackedMotionPlayer === player && lastMotionTick >= 0 && 0 <= player.age - lastMotionTick && player.age - lastMotionTick < 2) {
         if (ticksPassed == 1) {
            previousMovement = currentMovement
            currentMovement = sampledMovement
            lastMotionTick = tick
         }

         val var10000: Vec3d = previousMovement.add(currentMovement.subtract(previousMovement).multiply((double)RangesKt.coerceIn(partialTicks, 0.0F, 1.0F)))
         var10000
      } else {
         trackedMotionPlayer = player
         lastMotionTick = tick
         previousMovement = sampledMovement
         currentMovement = sampledMovement
         sampledMovement
      }
   }

   @Commando
   public fun onRender3D(event: شث) {
      if (this.isEnabled()) {
         val var10000: GameOptions = ضك.getMc().options
         if (طث.getPerspective(var10000).isFirstPerson()) {
            val var19: ClientWorld = ضك.getMc().world
            if (var19 != null) {
               val world: ClientWorld = var19
               val var20: ClientPlayerEntity = ضك.getMc().player
               if (var20 != null) {
                  val player: ClientPlayerEntity = var20
                  val var21: PredictsModule$HeldWeapon = this.findHeldWeapon(var20 as PlayerEntity)
                  if (var21 != null) {
                     val previewAlpha: Float = this.previewAlpha(var20 as PlayerEntity, var21, event.partialTicks)
                     if (!(previewAlpha <= 0.0F)) {
                        val var22: Vec3d = ضك.getMc().gameRenderer.getCamera().getCameraPos()
                        val launches: java.util.List = this.createLaunches(var20 as PlayerEntity, var21, var22, event.partialTicks)
                        if (!launches.isEmpty()) {
                           val `$this$mapTo$iv$iv`: java.lang.Iterable = launches
                           val `destination$iv$iv`: java.util.Collection = ArrayList(CollectionsKt.collectionSizeOrDefault(launches, 10))

                           for (`item$iv$iv` in `$this$mapTo$iv$iv`) {
                              `destination$iv$iv`.add(حو.INSTANCE.predict(world, player as PlayerEntity, `item$iv$iv` as ProjectileLaunch))
                           }

                           طر.INSTANCE.render(event, var22, `destination$iv$iv` as MutableList<TrajectoryPrediction>, 2.0F, 0.25F, previewAlpha)
                        }
                     }
                  }
               }
            }
         }
      }
   }

   public override fun onEnable() {
      this.resetMotionSmoothing()
   }

   fun sampleShooterMovement(player: PlayerEntity): Vec3d {
      val var10000: Vec3d = player.getMovement()
      Vec3d(var10000.x, if (player.isOnGround()) 0.0 else var10000.y, var10000.z)
   }

   fun previewAlpha(weapon: PlayerEntity, partialTicks: PredictsModule$HeldWeapon, player: Float): Float {
      var var10000: Float
      when (صذ.$EnumSwitchMapping$0[weapon.projectile.ordinal()]) {
         1 -> {
            if (!player.isUsingItem() || !player.getActiveItem().isOf(Items.TRIDENT)) {
               0.0F
            }

            val progress: Float = RangesKt.coerceIn(player.getItemUseTime(partialTicks) / 10.0F, 0.0F, 1.0F)
            var10000 = progress * progress * (3.0F - 2.0F * progress)
            break
         }
         2 -> {
            if (!player.isUsingItem() || !player.getActiveItem().isOf(Items.BOW)) {
               0.0F
            }

            var10000 = if (this.bowPower(player, partialTicks) >= 0.1F) 1.0F else 0.0F
            break
         }
         else -> var10000 = 1.0F
      }

      var10000
   }
}
