package oxxxde

import java.awt.Color
import java.util.HashMap
import kotakbaz.rain.module.Module
import kotakbaz.rain.module.modules.render.HitColorModule$DamageAnimation
import kotakbaz.rain.module.setting.settings.BooleanSetting
import kotakbaz.rain.module.setting.settings.ColorSetting
import kotakbaz.rain.module.setting.settings.SliderSetting
import net.minecraft.client.render.OverlayTexture
import net.minecraft.client.world.ClientWorld
import net.minecraft.entity.Entity
import net.minecraft.entity.LivingEntity
import ru.ocz.protection.virtualmachine.annotation.RecompileFormat

// $VF: Compiled from heavy
@RecompileFormat
public object رإ : Module("HitColor", RENDER, "Изменение цвета эффекта урона") {
   @JvmStatic
   private BooleanSetting smooth = Module.boolean$default(رإ.INSTANCE, "Плавность", false, null, 4, null);
   private const val DAMAGE_FADE_IN_SPEED: Float = 15.0F
   @JvmStatic
   private BooleanSetting armor = Module.boolean$default(رإ.INSTANCE, "Наложить на броню", true, null, 4, null);
   private const val DAMAGE_FADE_OUT_SPEED: Float = 8.0F
   @JvmStatic
   private ClientWorld trackedWorld;
   @JvmStatic
   private ColorSetting hitColor;
   @JvmStatic
   private BooleanSetting useClientColor = Module.boolean$default(INSTANCE, "Цвет клиента", false, null, 4, null).setVisible({ 
      ظث.INSTANCE.isEnabled()
   });
   private final val damageAnimations: HashMap<Int, ثخ> = HashMap()
   @JvmStatic
   private SliderSetting alpha = Module.slider$default(INSTANCE, "Прозрачность", 255.0F, 0.0F, 255.0F, 1.0F, null, 32, null);

   public fun resolveOverlay(entityId: Int, originalOverlay: Int): Int {
      if (this.isEnabled() && smooth.getValue()) {
         val progress: Float = this.damageProgress(entityId)
         return if (progress <= 0.001F) OverlayTexture.DEFAULT_UV else OverlayTexture.getUv(progress, true)
      } else {
         return originalOverlay
      }
   }

   public override fun onDisable() {
      this.clearState(null)
   }

   public override fun onEnable() {
      clearState$default(this, null, 1, null)
   }

   private fun damageProgress(entityId: Int): Float {
      val var10000: ClientWorld = ضك.getMc().world
      if (var10000 == null) {
         this.clearState(null)
         return 0.0F
      } else {
         if (trackedWorld != var10000) {
            this.clearState(var10000)
         }

         val `$this$damageProgress_u24lambda_u240`: Entity = var10000.getEntityById(entityId)
         val var12: LivingEntity = `$this$damageProgress_u24lambda_u240` as? LivingEntity
         if ((`$this$damageProgress_u24lambda_u240` as? LivingEntity) == null) {
            val var9: رإ = this
            damageAnimations.remove(entityId)
            return 0.0F
         } else {
            return this.updateDamageAnimation(var12)
         }
      }
   }

   public fun isSmoothEnabled(): Boolean {
      return smooth.getValue()
   }

   @JvmStatic
   fun {
      val var10000: Module = INSTANCE
      val var10002: Color = Color.RED
      hitColor = Module.color$default(var10000, "Цвет", var10002, null, 4, null).setVisible({ 
         !useClientColor.getValue() || !ظث.INSTANCE.isEnabled()
      })
   }

   fun updateDamageAnimation(entity: LivingEntity): Float {
      val now: Long = System.currentTimeMillis()
      val deltaSeconds: java.util.Map = damageAnimations
      var target: Any = entity.getId()
      val factor: Any = deltaSeconds.get(target)
      val var10000: Any
      if (factor == null) {
         val `answer$iv`: Any = HitColorModule$DamageAnimation(0.0F, now, 1, null)
         deltaSeconds.put(target, `answer$iv`)
         var10000 = `answer$iv`
      } else {
         var10000 = factor
      }

      val state: HitColorModule$DamageAnimation = var10000 as HitColorModule$DamageAnimation
      val var11: Float = (float)RangesKt.coerceAtLeast(now - (var10000 as HitColorModule$DamageAnimation).lastUpdateAt, 0L) / 1000.0F
      (var10000 as HitColorModule$DamageAnimation).lastUpdateAt = now
      target = if (entity.hurtTime <= 0 && entity.deathTime <= 0) 0.0F else 1.0F
      state.progress = state.progress
         + (target - state.progress)
            * RangesKt.coerceIn(var11 * (if ((if (entity.hurtTime <= 0 && entity.deathTime <= 0) 0.0F else 1.0F) > state.progress) 15.0F else 8.0F), 0.0F, 1.0F)
            val var15: Float = RangesKt.coerceIn(state.progress, 0.0F, 1.0F)
      if (var15 <= 0.001F && target <= 0.0F) {
         damageAnimations.remove(entity.getId())
         0.0F
      } else {
         var15
      }
   }

   public fun shouldColorArmor(): Boolean {
      return armor.getValue()
   }

   fun clearState(world: ClientWorld) {
      damageAnimations.clear()
      trackedWorld = world
   }

   public fun getColor(): Color {
      val color: Color = if (useClientColor.getValue() && ظث.INSTANCE.isEnabled()) ظث.INSTANCE.getClientColor() else hitColor.getValue()
      return Color(color.getRed(), color.getGreen(), color.getBlue(), (int)alpha.getValue().floatValue())
   }
}
