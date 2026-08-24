package oxxxde

import java.awt.Color
import java.util.HashMap
import java.util.HashSet
import kotakbaz.rain.event.events.Render3DEvent
import kotakbaz.rain.module.Module
import kotakbaz.rain.module.modules.render.ModuleCustomHitBox$DamageAnimation
import kotakbaz.rain.module.setting.settings.BooleanSetting
import kotakbaz.rain.module.setting.settings.ColorSetting
import kotakbaz.rain.module.setting.settings.SliderSetting
import kotlin.jdk7.AutoCloseableKt
import net.minecraft.client.option.GameOptions
import net.minecraft.client.render.GameRenderer
import net.minecraft.client.render.RainRenderLayers
import net.minecraft.client.render.VertexConsumer
import net.minecraft.client.render.VertexConsumerProvider
import net.minecraft.client.render.VertexConsumerProvider.Immediate
import net.minecraft.client.util.BufferAllocator
import net.minecraft.client.world.ClientWorld
import net.minecraft.entity.Entity
import net.minecraft.entity.LivingEntity
import net.minecraft.entity.mob.MobEntity
import net.minecraft.entity.passive.AnimalEntity
import net.minecraft.entity.player.PlayerEntity
import net.minecraft.util.math.Box
import net.minecraft.util.math.Vec3d
import sweetie.evaware.flora.api.Commando

// $VF: Compiled from heavy
public object جض : Module("CustomHitBox", RENDER, "Настройка визуала хитбокса") {
   @JvmStatic
   private ColorSetting boxColor;
   @JvmStatic
   private BooleanSetting striped = Module.boolean$default(INSTANCE, "Пунктирная обводка", false, null, 4, null);
   @JvmStatic
   private BooleanSetting damageEffect = Module.boolean$default(INSTANCE, "Эффект урона", false, null, 4, null);
   @JvmStatic
   private BooleanSetting useClientColor = Module.boolean$default(INSTANCE, "Цвет клиента", false, null, 4, null).setVisible({ 
      ظث.INSTANCE.isEnabled()
   });
   private const val DAMAGE_TINT_STRENGTH: Float = 0.78F
   @JvmStatic
   private ClientWorld trackedWorld;
   @JvmStatic
   private BooleanSetting filled = Module.boolean$default(INSTANCE, "Заполнить", false, null, 4, null);
   private final val damageAnimations: HashMap<Int, حٌ> = HashMap()
   private const val DAMAGE_FADE_IN_SPEED: Float = 14.0F
   @JvmStatic
   private BooleanSetting onlyPlayers = Module.boolean$default(INSTANCE, "Только игроки", true, null, 4, null);
   @JvmStatic
   private BooleanSetting outlined = Module.boolean$default(INSTANCE, "Обводка", true, null, 4, null);
   @JvmStatic
   private SliderSetting stripedGap = Module.slider$default(INSTANCE, "Разрыв", 0.2F, 0.1F, 0.35F, 0.01F, null, 32, null).setVisible({ 
      striped.getValue()
   });
   private const val DAMAGE_FADE_OUT_SPEED: Float = 11.0F
   private const val BUFFER_SIZE: Int = 1048576
   @JvmStatic
   private SliderSetting lineWidth = Module.slider$default(INSTANCE, "Толщина", 1.0F, 1.0F, 3.5F, 0.1F, null, 32, null).setVisible({ 
      outlined.getValue() || striped.getValue()
   });

   fun clearState(world: ClientWorld) {
      damageAnimations.clear()
      trackedWorld = world
   }

   public override fun onDisable() {
      this.clearState(null)
   }

   @JvmStatic
   fun {
      val var10000: Module = INSTANCE
      val var10002: Color = Color.WHITE
      boxColor = Module.color$default(var10000, "Цвет", var10002, null, 4, null).setVisible({ 
         !useClientColor.getValue() || !ظث.INSTANCE.isEnabled()
      })
      outlined.onChange({ enabled: Boolean ->
         if (enabled && striped.getValue()) {
            striped.set(false)
         }

         Unit.INSTANCE
      })
      striped.onChange({ enabled: Boolean ->
         if (enabled && outlined.getValue()) {
            outlined.set(false)
         }

         Unit.INSTANCE
      })
   }

   fun updateDamageAnimation(entity: LivingEntity): Float {
      val now: Long = System.currentTimeMillis()
      val deltaSeconds: java.util.Map = damageAnimations
      var target: Any = entity.getId()
      val factor: Any = deltaSeconds.get(target)
      val var10000: Any
      if (factor == null) {
         val `answer$iv`: Any = ModuleCustomHitBox$DamageAnimation(0.0F, now, 1, null)
         deltaSeconds.put(target, `answer$iv`)
         var10000 = `answer$iv`
      } else {
         var10000 = factor
      }

      val state: ModuleCustomHitBox$DamageAnimation = var10000 as ModuleCustomHitBox$DamageAnimation
      val var11: Float = (float)RangesKt.coerceAtLeast(now - (var10000 as ModuleCustomHitBox$DamageAnimation).lastUpdateAt, 0L) / 1000.0F
      (var10000 as ModuleCustomHitBox$DamageAnimation).lastUpdateAt = now
      target = if (entity.hurtTime <= 0 && entity.deathTime <= 0) 0.0F else 1.0F
      state.progress = state.progress
         + (target - state.progress)
            * RangesKt.coerceIn(
               var11 * (if ((if (entity.hurtTime <= 0 && entity.deathTime <= 0) 0.0F else 1.0F) > state.progress) 14.0F else 11.0F), 0.0F, 1.0F
            )
            val var15: Float = RangesKt.coerceIn(state.progress, 0.0F, 1.0F)
      if (var15 <= 0.001F && target <= 0.0F) {
         damageAnimations.remove(entity.getId())
         0.0F
      } else {
         var15
      }
   }

   fun shouldRender(entity: LivingEntity): Boolean {
      if (entity.isAlive() && !entity.isRemoved() && !entity.isInvisible()) {
         if (entity == ضك.getMc().player) {
            val var10000: GameOptions = ضك.getMc().options
            !طث.getPerspective(var10000).isFirstPerson()
         } else if (!onlyPlayers.getValue()) {
            if (entity is PlayerEntity) !(entity as PlayerEntity).isSpectator() else entity is AnimalEntity || entity is MobEntity
         } else {
            entity is PlayerEntity && !(entity as PlayerEntity).isSpectator()
         }
      } else {
         false
      }
   }

   @JvmStatic
   fun `onRender3D$renderBoxes`(
      quadBuffer: ClientWorld,
      baseColor: HashSet<Int>,
      world: Render3DEvent,
      cameraPos: Vec3d,
      lineBuffer: Color,
      activeEntityIds: VertexConsumer,
      `$event`: VertexConsumer
   ) {
      val var10000: java.lang.Iterable = world.getEntities()

      for (`element$iv` in var10000) {
         val entity: Entity = `element$iv` as Entity
         val var29: LivingEntity = `element$iv` as Entity as? LivingEntity
         if ((entity as? LivingEntity) != null && INSTANCE.shouldRender(`element$iv` as Entity as? LivingEntity)) {
            activeEntityIds.add(var29.getId())
            val var30: Vec3d = var29.getLerpedPos(`$event`.partialTicks)
            val var31: Box = var29.getBoundingBox()
            val var32: Box = var31.offset(var30.x - var29.getX(), var30.y - var29.getY(), var30.z - var29.getZ())
            val var33: Box = var32.offset(-cameraPos.x, -cameraPos.y, -cameraPos.z)
            تد.draw$default(
               تد.INSTANCE,
               `$event`,
               quadBuffer,
               lineBuffer,
               var33,
               INSTANCE.resolveRenderColor(var29, baseColor),
               filled.getValue(),
               outlined.getValue(),
               striped.getValue(),
               lineWidth.getValue().floatValue(),
               stripedGap.getValue().floatValue(),
               0.0F,
               1024,
               null
            )
         }
      }
   }

   private fun selectedColor(): Color {
      return if (useClientColor.getValue() && ظث.INSTANCE.isEnabled()) ظث.INSTANCE.getClientColor() else boxColor.getValue()
   }

   @Commando
   public fun onRender3D(event: شث) {
      if (this.isEnabled()) {
         if (filled.getValue() || outlined.getValue() || striped.getValue()) {
            val var10000: ClientWorld = ضك.getMc().world
            if (var10000 != null) {
               val world: ClientWorld = var10000
               if (trackedWorld != var10000) {
                  this.clearState(var10000)
               }

               val var39: GameRenderer = ضك.getMc().gameRenderer
               val cameraPos: Vec3d = طث.getPos(طث.getCamera(var39))
               val allocator: BufferAllocator = BufferAllocator(1048576)
               val baseColor: Color = this.selectedColor()
               val activeEntityIds: HashSet = HashSet()
               val var7: AutoCloseable = allocator as AutoCloseable
               var var8: java.lang.Throwable = null

               try {
                  val var40: Immediate = VertexConsumerProvider.immediate(var7 as BufferAllocator)
                  val quadConsumers: Immediate = var40
                  val var41: VertexConsumer = var40.getBuffer(RainRenderLayers.getHitBoxQuad(true))
                  val quadBuffer: VertexConsumer = var41
                  if (outlined.getValue()) {
                     val `$this$draw$iv`: AutoCloseable = BufferAllocator(1048576) as AutoCloseable
                     var `$i$f$draw`: java.lang.Throwable = null

                     try {
                        val var42: Immediate = VertexConsumerProvider.immediate(`$this$draw$iv` as BufferAllocator)
                        val var43: VertexConsumer = var42.getBuffer(RainRenderLayers.getHitBoxLine((double)lineWidth.getValue().floatValue()))
                        onRender3D$renderBoxes(world, activeEntityIds, event, cameraPos, baseColor, quadBuffer, var43)
                        quadConsumers.draw()
                        var42.draw()
                     } catch (var29: java.lang.Throwable) {
                        `$i$f$draw` = var29
                        throw var29
                     } finally {
                        AutoCloseableKt.closeFinally(`$this$draw$iv`, `$i$f$draw`)
                     }
                  } else {
                     onRender3D$renderBoxes(world, activeEntityIds, event, cameraPos, baseColor, var41, null)
                     var40.draw()
                  }
               } catch (var31: java.lang.Throwable) {
                  var8 = var31
                  throw var31
               } finally {
                  AutoCloseableKt.closeFinally(var7, var8)
               }

               damageAnimations.keySet().retainAll(activeEntityIds)
            }
         }
      }
   }

   fun resolveRenderColor(baseColor: LivingEntity, entity: Color): Color {
      label16@
      if (!damageEffect.getValue()) {
         baseColor
      } else {
         val progress: Float = this.updateDamageAnimation(entity) * 0.78F
         if (progress <= 0.0F) baseColor else بح.INSTANCE.interpolateColor(baseColor, Color(255, 0, 0, baseColor.getAlpha()), progress)
      }
   }

   public override fun onEnable() {
      clearState$default(this, null, 1, null)
   }
}
