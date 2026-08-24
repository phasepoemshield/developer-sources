package oxxxde

import java.util.Optional
import net.minecraft.client.gl.PostEffectPipeline
import net.minecraft.client.gl.PostEffectProcessor
import net.minecraft.client.gl.PostEffectPipeline.Pass
import net.minecraft.client.gl.PostEffectPipeline.TargetSampler
import net.minecraft.client.gl.PostEffectPipeline.Targets
import net.minecraft.client.gl.UniformValue.FloatValue
import net.minecraft.client.gl.UniformValue.Vec4fValue
import net.minecraft.client.render.DefaultFramebufferSet
import net.minecraft.client.render.ProjectionMatrix2
import net.minecraft.client.util.memory.ObjectAllocator
import net.minecraft.client.util.memory.ObjectPool
import net.minecraft.util.Identifier
import org.joml.Vector4f
import org.joml.Vector4fc
import ru.ocz.protection.virtualmachine.annotation.RecompileFormat

// $VF: Compiled from heavy
@RecompileFormat
public object `ْ` : دِ("ColorSaturation", ظن.getRENDER(), "Изменяет цвет насыщенности") {
   @JvmStatic
   private Identifier swapTargetId;
   @JvmStatic
   private Identifier effectId;
   private final val saturation: طُ = دِ.slider$default(ْ.INSTANCE, "Насыщенность", 1.35F, 0.0F, 2.0F, 0.05F, null, 32, null)
   @JvmStatic
   private Identifier screenQuadShaderId;
   @JvmStatic
   private Identifier saturationShaderId;
   @JvmStatic
   private ProjectionMatrix2 projectionMatrix;
   @JvmStatic
   private Identifier blitShaderId;
   @JvmStatic
   private ObjectPool renderPool;
   private final var cachedSaturation: Float = java.lang.Float.NaN
   @JvmStatic
   private PostEffectProcessor processor;

   fun createPipeline(currentSaturation: Float): PostEffectPipeline {
      PostEffectPipeline(
         MapsKt.mapOf(swapTargetId to Targets(Optional.empty(), Optional.empty(), false, 0)),
         CollectionsKt.listOf(
            Pass(
               screenQuadShaderId,
               saturationShaderId,
               CollectionsKt.listOf(TargetSampler("In", DefaultFramebufferSet.MAIN, false, false)),
               swapTargetId,
               MapsKt.mapOf("SaturationConfig" to CollectionsKt.listOf(FloatValue(currentSaturation)))
            ),
            Pass(
               screenQuadShaderId,
               blitShaderId,
               CollectionsKt.listOf(TargetSampler("In", swapTargetId, false, false)),
               DefaultFramebufferSet.MAIN,
               MapsKt.mapOf("BlitConfig" to CollectionsKt.listOf(Vec4fValue(Vector4f(1.0F, 1.0F, 1.0F, 1.0F) as Vector4fc)))
            )
         )
      )
   }

   public override fun onDisable() {
      this.releaseEffect()
   }

   private fun releaseEffect() {
      this.releaseProcessor()
      if (renderPool != null) {
         renderPool.close()
      }

      renderPool = null
      cachedSaturation = java.lang.Float.NaN
   }

   private fun releaseProcessor() {
      if (processor != null) {
         processor.close()
      }

      processor = null
      if (projectionMatrix != null) {
         projectionMatrix.close()
      }

      projectionMatrix = null
      if (renderPool != null) {
         renderPool.clear()
      }
   }

   public fun renderWorldIfNeeded() {
      if (this.isEnabled()) {
         if (ضك.getMc().world != null && ضك.getMc().player != null) {
            val currentSaturation: Float = saturation.getValue().floatValue()
            if (!(Math.abs(currentSaturation - 1.0F) <= 0.001F)) {
               val var10000: PostEffectProcessor = this.ensureProcessor(currentSaturation)
               if (var10000 != null) {
                  val activeProcessor: PostEffectProcessor = var10000
                  var var14: ObjectPool = renderPool
                  if (renderPool == null) {
                     val `$this$renderWorldIfNeeded_u24lambda_u241`: ObjectPool = ObjectPool(3)
                     renderPool = `$this$renderWorldIfNeeded_u24lambda_u241`
                     var14 = `$this$renderWorldIfNeeded_u24lambda_u241`
                  }

                  val pool: ObjectPool = var14
                  val var4: ْ = this

                  var var10: Any
                  try {
                     var10 = var4
                     activeProcessor.render(ضك.getMc().getFramebuffer(), pool as ObjectAllocator)
                     var10 = Result.constructor_impl/* $VF was: constructor-impl */(Unit.INSTANCE)
                  } catch (var8: java.lang.Throwable) {
                     var10 = Result.constructor_impl/* $VF was: constructor-impl */(ResultKt.createFailure(var8))
                  }

                  if (Result.exceptionOrNull_impl/* $VF was: exceptionOrNull-impl */(var10) != null) {
                     INSTANCE.releaseEffect()
                  }
               }
            }
         }
      }
   }

   fun ensureProcessor(currentSaturation: Float): PostEffectProcessor {
      if (processor != null && currentSaturation == cachedSaturation) {
         processor
      } else {
         this.releaseProcessor()
         val newProjectionMatrix: ProjectionMatrix2 = ProjectionMatrix2("rain_color_saturation", 0.05F, 1000.0F, false)
         val var5: ْ = this

         var it: Any
         try {
            it = Result.constructor_impl/* $VF was: constructor-impl */(
               PostEffectProcessor.parseEffect(
                  var5.createPipeline(currentSaturation), ضك.getMc().getTextureManager(), DefaultFramebufferSet.MAIN_ONLY, effectId, newProjectionMatrix
               )
            )
         } catch (var8: java.lang.Throwable) {
            it = Result.constructor_impl/* $VF was: constructor-impl */(ResultKt.createFailure(var8))
         }

         if (Result.exceptionOrNull_impl/* $VF was: exceptionOrNull-impl */(it) == null) {
            val newProcessor: PostEffectProcessor = it as PostEffectProcessor
            projectionMatrix = newProjectionMatrix
            processor = newProcessor
            cachedSaturation = currentSaturation
            newProcessor
         } else {
            newProjectionMatrix.close()
            null
         }
      }
   }

   @JvmStatic
   fun {
      var var10000: Identifier = Identifier.of("rain", "color_saturation")
      effectId = var10000
      var10000 = Identifier.of("rain", "color_saturation_swap")
      swapTargetId = var10000
      var10000 = Identifier.of("minecraft", "core/screenquad")
      screenQuadShaderId = var10000
      var10000 = Identifier.of("minecraft", "post/blit")
      blitShaderId = var10000
      var10000 = Identifier.of("rain", "post/saturation")
      saturationShaderId = var10000
   }
}
