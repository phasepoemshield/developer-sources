package oxxxde

import com.mojang.blaze3d.buffers.GpuBuffer
import com.mojang.blaze3d.systems.RenderSystem
import java.nio.ByteBuffer
import java.util.Optional
import kotakbaz.rain.mixin.PostChainAccessor
import kotakbaz.rain.mixin.PostPassAccessor
import kotlin.jdk7.AutoCloseableKt
import net.minecraft.client.gl.PostEffectPass
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
import org.lwjgl.system.MemoryStack

// $VF: Compiled from heavy
public object سء : دِ("AspectRatio", ظن.getRENDER(), "Изменение растяга экрана") {
   private final var animatedRatio: Float = 1.0F
   private const val UNIFORM_NAME: String = "AspectConfig"
   private final var uploadedRatio: Float = java.lang.Float.NaN
   private final var lastFrameNanos: Long
   private final var ratioUniform: GpuBuffer?
   @JvmStatic
   private Identifier screenQuadShaderId;
   @JvmStatic
   private ProjectionMatrix2 projectionMatrix;
   @JvmStatic
   private ObjectPool renderPool;
   @JvmStatic
   private Identifier effectId;
   private const val ANIMATION_SPEED: Float = 9.0F
   private const val RATIO_EPSILON: Float = 0.001F
   @JvmStatic
   private Identifier aspectShaderId;
   @JvmStatic
   private Identifier swapTargetId;
   private final val ratio: طُ = دِ.slider$default(INSTANCE, "Разрешение", 1.25F, 1.0F, 2.0F, 0.01F, null, 32, null)
   @JvmStatic
   private Identifier blitShaderId;
   @JvmStatic
   private PostEffectProcessor processor;

   private fun updateRatioUniform(currentRatio: Float): Boolean {
      if (Math.abs(currentRatio - uploadedRatio) <= 1.0E-5F) {
         return true
      } else if (ratioUniform == null) {
         return false
      } else {
         val uniform: GpuBuffer = ratioUniform
         val var3: سء = this

         var `$this$updateRatioUniform_u24lambda_u240`: سء
         try {
            `$this$updateRatioUniform_u24lambda_u240` = var3
            val var6: AutoCloseable = MemoryStack.stackPush() as AutoCloseable
            var var7: java.lang.Throwable = null

            try {
               val data: ByteBuffer = (var6 as MemoryStack).malloc(4)
               data.putFloat(0, currentRatio)
               RenderSystem.getDevice().createCommandEncoder().writeToBuffer(uniform.slice(0L, 4L), data)
            } catch (var14: java.lang.Throwable) {
               var7 = var14
               throw var14
            } finally {
               AutoCloseableKt.closeFinally(var6, var7)
            }

            uploadedRatio = currentRatio
            `$this$updateRatioUniform_u24lambda_u240` = (سء)Result.constructor_impl/* $VF was: constructor-impl */(Unit.INSTANCE)
         } catch (var16: java.lang.Throwable) {
            `$this$updateRatioUniform_u24lambda_u240` = (سء)Result.constructor_impl/* $VF was: constructor-impl */(ResultKt.createFailure(var16))
         }

         return isSuccess
      }
   }

   @JvmStatic
   fun {
      var var10000: Identifier = Identifier.of("rain", "aspect_ratio")
      effectId = var10000
      var10000 = Identifier.of("rain", "aspect_ratio_swap")
      swapTargetId = var10000
      var10000 = Identifier.of("minecraft", "core/screenquad")
      screenQuadShaderId = var10000
      var10000 = Identifier.of("minecraft", "post/blit")
      blitShaderId = var10000
      var10000 = Identifier.of("rain", "post/aspect_ratio")
      aspectShaderId = var10000
   }

   private fun updateAnimatedRatio(): Float {
      val now: Long = System.nanoTime()
      val deltaSeconds: Float = if (lastFrameNanos == 0L)
         0.0F
         else
         RangesKt.coerceAtMost((float)RangesKt.coerceAtLeast(now - lastFrameNanos, 0L) / 1.0E9F, 0.05F)
         lastFrameNanos = now
      val targetRatio: Float = if (this.isEnabled()) ratio.getValue().floatValue() else 1.0F
      val difference: Float = targetRatio - animatedRatio
      if (Math.abs(targetRatio - animatedRatio) <= 0.001F) {
         animatedRatio = targetRatio
         return animatedRatio
      } else {
         animatedRatio += difference * (float)(1.0 - Math.exp((double)(-9.0F * deltaSeconds)))
         return animatedRatio
      }
   }

   public override fun onEnable() {
      lastFrameNanos = System.nanoTime()
   }

   private fun releaseProcessor() {
      if (processor != null) {
         processor.close()
      }

      processor = null
      ratioUniform = null
      if (projectionMatrix != null) {
         projectionMatrix.close()
      }

      projectionMatrix = null
      if (renderPool != null) {
         renderPool.clear()
      }
   }

   private fun releaseEffect() {
      this.releaseProcessor()
      if (renderPool != null) {
         renderPool.close()
      }

      renderPool = null
      uploadedRatio = java.lang.Float.NaN
   }

   fun ensureProcessor(): PostEffectProcessor {
      if (processor != null) {
         processor
      } else {
         this.releaseProcessor()
         val newProjectionMatrix: ProjectionMatrix2 = ProjectionMatrix2("rain_aspect_ratio", 0.05F, 1000.0F, false)
         val var4: سء = this

         var it: Any
         try {
            it = Result.constructor_impl/* $VF was: constructor-impl */(
               PostEffectProcessor.parseEffect(
                  var4.createPipeline(), ضك.getMc().getTextureManager(), DefaultFramebufferSet.MAIN_ONLY, effectId, newProjectionMatrix
               )
            )
         } catch (var7: java.lang.Throwable) {
            it = Result.constructor_impl/* $VF was: constructor-impl */(ResultKt.createFailure(var7))
         }

         if (Result.exceptionOrNull_impl/* $VF was: exceptionOrNull-impl */(it) == null) {
            val newProcessor: PostEffectProcessor = it as PostEffectProcessor
            val mutableRatioUniform: GpuBuffer = this.replaceRatioUniform(it as PostEffectProcessor)
            if (mutableRatioUniform == null) {
               newProcessor.close()
               newProjectionMatrix.close()
               null
            } else {
               projectionMatrix = newProjectionMatrix
               processor = newProcessor
               ratioUniform = mutableRatioUniform
               uploadedRatio = 1.0F
               newProcessor
            }
         } else {
            newProjectionMatrix.close()
            null
         }
      }
   }

   public override fun onDisable() {
      lastFrameNanos = System.nanoTime()
   }

   public fun renderWorldIfNeeded() {
      if (ضك.getMc().world != null && ضك.getMc().player != null) {
         val currentRatio: Float = this.updateAnimatedRatio()
         if (Math.abs(currentRatio - 1.0F) <= 0.001F) {
            if (processor != null) {
               this.releaseEffect()
            }
         } else {
            val var10000: PostEffectProcessor = this.ensureProcessor()
            if (var10000 != null) {
               val activeProcessor: PostEffectProcessor = var10000
               if (!this.updateRatioUniform(currentRatio)) {
                  this.releaseEffect()
               } else {
                  var var14: ObjectPool = renderPool
                  if (renderPool == null) {
                     val `$this$renderWorldIfNeeded_u24lambda_u241`: ObjectPool = ObjectPool(3)
                     renderPool = `$this$renderWorldIfNeeded_u24lambda_u241`
                     var14 = `$this$renderWorldIfNeeded_u24lambda_u241`
                  }

                  val pool: ObjectPool = var14
                  val var4: سء = this

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
      } else {
         lastFrameNanos = System.nanoTime()
         if (!this.isEnabled()) {
            animatedRatio = 1.0F
            this.releaseEffect()
         }
      }
   }

   fun replaceRatioUniform(chain: PostEffectProcessor): GpuBuffer {
      val var10000: java.util.List = (chain as PostChainAccessor).rain$getPasses()
      val var23: PostEffectPass = CollectionsKt.firstOrNull(var10000)
      if (var23 == null) {
         null
      } else {
         val uniforms: java.util.Map = (var23 as PostPassAccessor).rain$getCustomUniforms()
         val var24: GpuBuffer = uniforms.get("AspectConfig") as GpuBuffer
         if (var24 == null) {
            null
         } else {
            val original: GpuBuffer = var24
            val var5: سء = this

            var `$this$replaceRatioUniform_u24lambda_u240`: Any
            try {
               `$this$replaceRatioUniform_u24lambda_u240` = var5
               val var8: AutoCloseable = MemoryStack.stackPush() as AutoCloseable
               var var9: java.lang.Throwable = null

               var var22: GpuBuffer
               try {
                  val initialData: ByteBuffer = (var8 as MemoryStack).calloc((int)original.size())
                  initialData.putFloat(0, 1.0F)
                  val var25: GpuBuffer = RenderSystem.getDevice().createBuffer({ 
                     "rain_aspect_ratio_uniform"
                  }, 136, initialData)
                  uniforms.put("AspectConfig", var25)
                  original.close()
                  var22 = var25
               } catch (var17: java.lang.Throwable) {
                  var9 = var17
                  throw var17
               } finally {
                  AutoCloseableKt.closeFinally(var8, var9)
               }

               `$this$replaceRatioUniform_u24lambda_u240` = Result.constructor_impl/* $VF was: constructor-impl */(var22)
            } catch (var19: java.lang.Throwable) {
               `$this$replaceRatioUniform_u24lambda_u240` = Result.constructor_impl/* $VF was: constructor-impl */(ResultKt.createFailure(var19))
            }

            (if (isFailure) null else `$this$replaceRatioUniform_u24lambda_u240`) as GpuBuffer
         }
      }
   }

   fun createPipeline(): PostEffectPipeline {
      PostEffectPipeline(
         MapsKt.mapOf(swapTargetId to Targets(Optional.empty(), Optional.empty(), false, 0)),
         CollectionsKt.listOf(
            Pass(
               screenQuadShaderId,
               aspectShaderId,
               CollectionsKt.listOf(TargetSampler("In", DefaultFramebufferSet.MAIN, false, false)),
               swapTargetId,
               MapsKt.mapOf("AspectConfig" to CollectionsKt.listOf(FloatValue(1.0F)))
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
}
