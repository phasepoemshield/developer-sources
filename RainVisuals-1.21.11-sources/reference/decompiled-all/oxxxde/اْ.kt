package oxxxde

import com.mojang.blaze3d.textures.GpuTexture
import com.mojang.blaze3d.textures.GpuTextureView
import java.util.ArrayList
import kotlin.jvm.internal.Intrinsics
import net.minecraft.client.gl.Framebuffer
import net.minecraft.client.texture.GlTexture
import net.minecraft.client.texture.GlTextureView
import org.joml.Vector2f

// $VF: Compiled from heavy
public class اْ : طء {
   private final var fullscreenHeight: Int
   private final var fullscreenMesh: طأ?
   private final val fbos: ArrayList<جّ> = ArrayList()
   private final lateinit var downscaleOffsetUniform: ذء
   private final var downscaleProgram: خر?
   private final lateinit var downscaleTextureUniform: خة
   private final lateinit var upscaleOffsetUniform: ذء
   private final var upscaleProgram: خر?
   private final var fullscreenWidth: Int
   private final val blurPasses: Int = 3
   private final lateinit var upscaleTexelUniform: دط
   private final lateinit var upscaleTextureUniform: خة
   private final val texelSize: Vector2f
   private final lateinit var downscaleTexelUniform: دط
   private final val offset: Float = 25.0F
   private final var initialized: Boolean

   public override fun drawMode(): شم {
      return شم.QUADS
   }

   public override fun name(): String {
      return "kawase"
   }

   fun applyBlurPass(source: خر, pass: Framebuffer, maxPass: جّ, program: Int, destination: Int) {
      ِ.disableBlend()
      destination.clearAllTextures()
      ِ.bindFramebuffer(destination)
      this.setGlobalProgram(program)
      this.initMatrix()
      val texelSizeX: Float = 1.0F / source.textureWidth
      val texelSizeY: Float = 1.0F / source.textureHeight
      val var12: دط
      val var13: ذء
      val var14: خة
      if (program === this.downscaleProgram) {
         var var10000: دط = this.downscaleTexelUniform
         if (this.downscaleTexelUniform == null) {
            Intrinsics.throwUninitializedPropertyAccessException("downscaleTexelUniform")
            var10000 = null
         }

         var12 = var10000
         var var15: ذء = this.downscaleOffsetUniform
         if (this.downscaleOffsetUniform == null) {
            Intrinsics.throwUninitializedPropertyAccessException("downscaleOffsetUniform")
            var15 = null
         }

         var13 = var15
         var var16: خة = this.downscaleTextureUniform
         if (this.downscaleTextureUniform == null) {
            Intrinsics.throwUninitializedPropertyAccessException("downscaleTextureUniform")
            var16 = null
         }

         var14 = var16
      } else {
         var var17: دط = this.upscaleTexelUniform
         if (this.upscaleTexelUniform == null) {
            Intrinsics.throwUninitializedPropertyAccessException("upscaleTexelUniform")
            var17 = null
         }

         var12 = var17
         var var18: ذء = this.upscaleOffsetUniform
         if (this.upscaleOffsetUniform == null) {
            Intrinsics.throwUninitializedPropertyAccessException("upscaleOffsetUniform")
            var18 = null
         }

         var13 = var18
         var var19: خة = this.upscaleTextureUniform
         if (this.upscaleTextureUniform == null) {
            Intrinsics.throwUninitializedPropertyAccessException("upscaleTextureUniform")
            var19 = null
         }

         var14 = var19
      }

      var12.set(this.texelSize.set(texelSizeX, texelSizeY))
      var13.set(this.offset * 0.5F * ((float)pass / (float)maxPass))
      val var20: GpuTextureView = source.getColorAttachmentView()
      if (var20 != null) {
         if (var20 is GlTextureView) {
            var14.set(var20 as GlTextureView)
         } else {
            val var10001: GpuTexture = var20.texture()
            var14.set(var10001 as GlTexture)
         }

         this.drawFullscreenQuad()
      }
   }

   public override fun shader(): String {
      return "kawase/"
   }

   private fun createFramebuffers(width: Int, height: Int) {
      var i: Int = 0
      val var4: Int = this.blurPasses
      if (0 <= this.blurPasses) {
         while (true) {
            this.fbos.add(جّ("kawase_fbo_$i", width, height, false))
            if (i == var4) {
               break
            }

            i++
         }
      }
   }

   fun framebuffer(): Framebuffer {
      CollectionsKt.first(this.fbos) as Framebuffer
   }

   fun texture(): GlTextureView {
      val var1: GpuTextureView = CollectionsKt.first(this.fbos).getColorAttachmentView()
      val var10000: GlTextureView = var1 as? GlTextureView
      if ((var1 as? GlTextureView) == null) {
         throw IllegalStateException("Kawase framebuffer has no GL texture view".toString())
      } else {
         var10000
      }
   }

   private fun drawFullscreenQuad() {
      val width: Int = ضك.getMc().getWindow().getScaledWidth()
      val height: Int = ضك.getMc().getWindow().getScaledHeight()
      var mesh: طأ = this.fullscreenMesh
      if (this.fullscreenMesh == null || this.fullscreenWidth != width || this.fullscreenHeight != height) {
         if (this.fullscreenMesh != null) {
            this.fullscreenMesh.close()
         }

         val buffer: ان = ِ.borrowMeshBuilder(this.drawMode(), this.vertexFormat())

         var var5: طأ
         try {
            buffer.vertex(0.0F, 0.0F, 0.0F)
            buffer.vertex(0.0F, (float)height, 0.0F)
            buffer.vertex((float)width, (float)height, 0.0F)
            buffer.vertex((float)width, 0.0F, 0.0F)
            var5 = buffer.buildNullable()
         } finally {
            ِ.recycleMeshBuilder(buffer)
         }

         mesh = var5
         this.fullscreenMesh = var5
         this.fullscreenWidth = width
         this.fullscreenHeight = height
      }

      if (mesh != null) {
         ِ.draw(mesh, false)
      }
   }

   public override fun load() {
      if (!this.initialized) {
         this.createPrograms()
         if (this.hasValidWindowSize()) {
            this.createFramebuffers(ضك.getMc().getWindow().getFramebufferWidth(), ضك.getMc().getWindow().getFramebufferHeight())
         }

         this.initialized = true
      }
   }

   public override fun vertexFormat(): سا {
      val var10000: سا = شو.POSITION
      return var10000
   }

   public fun hasFramebuffer(): Boolean {
      return !this.fbos.isEmpty()
   }

   private fun createPrograms() {
      val kawase: java.lang.String = "${this.shader()}${this.name()}"
      this.downscaleProgram = this.createShaderBuilder("downscale", "${this.shader()}downscale", kawase)
         .uniform("uHalfTexelSize", جد.VEC2)
         .uniform("uOffset", جد.FLOAT)
         .sampler("uTexture")
         .build()
         this.upscaleProgram = this.createShaderBuilder("upscale", "${this.shader()}upscale", kawase)
         .uniform("uHalfTexelSize", جد.VEC2)
         .uniform("uOffset", جد.FLOAT)
         .sampler("uTexture")
         .build()
         var var10001: خر = this.downscaleProgram
      val var4: طي = var10001.getUniform("uHalfTexelSize", جد.VEC2)
      this.downscaleTexelUniform = var4 as دط
      var10001 = this.downscaleProgram
      val var6: طي = var10001.getUniform("uOffset", جد.FLOAT)
      this.downscaleOffsetUniform = var6 as ذء
      var10001 = this.downscaleProgram
      val var8: طي = var10001.getUniform("uTexture", جد.SAMPLER)
      this.downscaleTextureUniform = var8 as خة
      var10001 = this.upscaleProgram
      val var10: طي = var10001.getUniform("uHalfTexelSize", جد.VEC2)
      this.upscaleTexelUniform = var10 as دط
      var10001 = this.upscaleProgram
      val var12: طي = var10001.getUniform("uOffset", جد.FLOAT)
      this.upscaleOffsetUniform = var12 as ذء
      var10001 = this.upscaleProgram
      val var14: طي = var10001.getUniform("uTexture", جد.SAMPLER)
      this.upscaleTextureUniform = var14 as خة
      this.setGlProgram(this.downscaleProgram)
   }

   private fun hasValidWindowSize(): Boolean {
      return ضك.getMc().getWindow().getFramebufferWidth() > 0 && ضك.getMc().getWindow().getFramebufferHeight() > 0
   }

   private fun checkResize(): Boolean {
      if (!this.hasValidWindowSize()) {
         return false
      } else {
         val width: Int = ضك.getMc().getWindow().getFramebufferWidth()
         val height: Int = ضك.getMc().getWindow().getFramebufferHeight()
         if (this.fbos.isEmpty() || CollectionsKt.first(this.fbos).textureWidth != width || CollectionsKt.first(this.fbos).textureHeight != height) {
            for (`element$iv` in this.fbos) {
               (`element$iv` as جّ).delete()
            }

            this.fbos.clear()
            this.createFramebuffers(width, height)
         }

         return !this.fbos.isEmpty()
      }
   }

   public fun applyBlur() {
      if (this.checkResize()) {
         val actualPasses: Int = Math.max(this.fbos.size() - 1, 1)
         if (this.downscaleProgram != null) {
            val downscale: خر = this.downscaleProgram
            if (this.upscaleProgram != null) {
               val upscale: خر = this.upscaleProgram
               ِ.beginDrawScope()

               try {
                  var var10002: Framebuffer = ضك.getMc().getFramebuffer()
                  this.applyBlurPass(downscale, var10002, CollectionsKt.first(this.fbos), 0, actualPasses)

                  repeat(actualPasses) { i ->
                     var10002 = this.fbos.get(i)
                     var10002 = var10002
                     val var10003: Any = this.fbos.get(i + 1)
                     this.applyBlurPass(downscale, var10002, var10003 as جّ, i + 1, actualPasses)
                  }

                  for (var7 in actualPasses downTo 1) {
                     var10002 = this.fbos.get(var7)
                     var10002 = var10002
                     val var12: Any = this.fbos.get(var7 - 1)
                     this.applyBlurPass(upscale, var10002, var12 as جّ, var7, actualPasses)
                  }
               } finally {
                  ِ.endDrawScope()
               }
            }
         }
      }
   }
}
