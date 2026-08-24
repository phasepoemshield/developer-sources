package oxxxde

import com.mojang.blaze3d.opengl.GlStateManager
import com.mojang.blaze3d.systems.RenderSystem
import java.util.Arrays
import kotlin.jvm.internal.SpreadBuilder
import net.minecraft.client.gl.GlGpuBuffer
import net.minecraft.client.gui.screen.ChatScreen

// $VF: Compiled from heavy
public object ذخ : تم {
   private final val framebufferState: جظ = جظ()
   private final val frameGate: دد = دد(null, 1, null)
   private final val overlayRenderEvent: ثآ = ثآ()
   public final var loaded: Boolean

   private fun beginFramePipelines(): جظ {
      ِ.captureFramebufferState(framebufferState)
      ِ.bindMainFramebuffer()
      ِ.applyBlend(صْ.SRC_ALPHA, حن.ONE_MINUS_SRC_ALPHA, صْ.ONE, حن.ZERO)
      return framebufferState
   }

   private fun flushFramePipelines(vararg pipelines: صؤ) {
      RenderSystem.backupProjectionMatrix()
      var fbState: جظ = null

      try {
         val var11: Boolean = true
         بد.INSTANCE.unscaledProjection()
         بد.INSTANCE.reset()
         GlStateManager._disableDepthTest()
         fbState = this.beginFramePipelines()
         طئ.INSTANCE.renderQueuedFrom(pipelines)
         ظق.INSTANCE.flushPipelineArray(pipelines)
      } finally {
         if (var8) {
            if (fbState != null) {
               this.endFramePipelines(fbState)
            }

            RenderSystem.restoreProjectionMatrix()
         }
      }

      if (fbState != null) {
         this.endFramePipelines(fbState)
      }

      RenderSystem.restoreProjectionMatrix()
      val var8: Boolean
   }

   public fun ensureLoaded() {
      if (!loaded) {
         val var10000: ظق = ظق.INSTANCE
         val var1: SpreadBuilder = SpreadBuilder(3)
         var1.add(ذر.INSTANCE.getADVANCED_RECT())
         var1.add(ذر.INSTANCE.getKAWASE())
         var1.addSpread(رَ.INSTANCE.all.toArray(arrayOfNulls(0)))
         var10000.loadShaders(var1.toArray(arrayOfNulls(var1.size())) as Array<طء>)
         ظق.INSTANCE.loadRender()
         شس.INSTANCE.load()
         loaded = true
      }
   }

   private fun registerShaderLibs() {
      ثذ.registerShaderLibraries(
         this.registerShaderLib("math_utils"), this.registerShaderLib("shapes"), this.registerShaderLib("matrices"), this.registerShaderLib("scissor_check")
      )
   }

   private fun registerShaderLib(file: String?): صغ {
      val var10000: صغ = رس.IN_JAR.createShaderLibraryBuilder().name(file).library("${طء.Companion.SHADER_INCLUDE_PATH}$file.glsl").build()
      return var10000
   }

   public fun hookRender(partialTicks: Float, vararg pipelines: صؤ) {
      this.hookRenderInternal(partialTicks, pipelines, ArraysKt.contains(pipelines, صؤ.HUD_RECT), ArraysKt.contains(pipelines, صؤ.GUI_RECT))
   }

   private fun hookRenderInternal(partialTicks: Float, pipelines: Array<out صؤ>, hasHud: Boolean, hasGui: Boolean) {
      this.ensureLoaded()
      if (ضك.getMc().player != null && ضك.getMc().world != null) {
         if (hasHud) {
            سء.INSTANCE.renderWorldIfNeeded()
            ْ.INSTANCE.renderWorldIfNeeded()
         }

         val mouseX: Int = حل.INSTANCE.mouseX()
         val mouseY: Int = حل.INSTANCE.mouseY()
         RenderSystem.backupProjectionMatrix()
         var fbState: جظ = null

         try {
            بد.INSTANCE.unscaledProjection()
            بد.INSTANCE.reset()
            GlStateManager._disableDepthTest()
            if (ArraysKt.contains(pipelines, صؤ.LOW) && frameGate.shouldExecute(30)) {
               ذر.INSTANCE.getKAWASE().applyBlur()
            }

            fbState = this.beginFramePipelines()
            if (hasHud) {
               ذة.INSTANCE.renderHud(partialTicks)
            }

            if (hasHud && ضك.getMc().currentScreen is ChatScreen) {
               val var10000: java.util.Collection = ثٌ.INSTANCE.draggables.values()

               for (var17 in var10000) {
                  val var19: ظذ = var17 as ظذ
                  if ((var17 as ظذ).getModule().isEnabled()) {
                     var19.onDraw()
                  }
               }
            }

            if (hasHud) {
               رظ.INSTANCE.post(overlayRenderEvent)
               ضش.INSTANCE.render()
            }

            if (hasGui) {
               val var20: جع = صص.INSTANCE.getCustomScreen()
               if (var20 != null) {
                  var20.render(mouseX, mouseY, partialTicks)
                  if (var20.shouldRemove()) {
                     صص.INSTANCE.setCustomScreen(null)
                  }
               }
            }

            طئ.INSTANCE.renderQueuedFrom(pipelines)
            ظق.INSTANCE.flushPipelineArray(pipelines)
            if (!hasGui || !حز.INSTANCE.canRenderModelPreviews() && !شآ.hasPendingWork()) {
               شآ.clear()
            } else {
               شآ.renderQueued()
            }

            if (hasGui) {
               ثظ.INSTANCE.capturePendingFrame()
            }
         } finally {
            if (fbState != null) {
               this.endFramePipelines(fbState)
            }

            RenderSystem.restoreProjectionMatrix()
         }
      } else {
         this.flushFramePipelines(Arrays.copyOf(pipelines, pipelines.length))
      }
   }

   private fun endFramePipelines(fbState: جظ) {
      ِ.restoreFramebufferState(fbState)
   }

   public override fun init() {
      ِ.init({ glGpuBuffer: GlGpuBuffer ->
         glGpuBuffer.id
      }, { 
         ضك.getMc().getWindow().getScaleFactor()
      })
      this.registerShaderLibs()
      شس.INSTANCE.register("interface_hue", "textures/interface/hue.png")
      شس.INSTANCE.register("interface_avatar", "textures/interface/avatar.png")
      شس.INSTANCE.register("main_menu_background", "textures/mainmenu/mainnew.png")
      شس.INSTANCE.register("main_menu_icon_glow", "images/particles/glow.png")
   }
}
