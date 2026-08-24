package oxxxde

import com.mojang.blaze3d.opengl.GlStateManager
import com.mojang.blaze3d.systems.RenderSystem
import java.util.Arrays
import kotakbaz.rain.client.draggable.Draggable
import kotakbaz.rain.client.listener.Listener
import kotakbaz.rain.client.render.main.ChromaRenderer
import kotakbaz.rain.client.render.main.compile.GlShaderLibrary
import kotakbaz.rain.client.render.main.compile.b
import kotakbaz.rain.client.util.other.CustomScreen
import kotakbaz.rain.client.util.render.engine.Renderable
import kotakbaz.rain.client.util.render.engine.controls.ClientRenderPipeline
import kotakbaz.rain.client.waypoint.WayPointManager
import kotakbaz.rain.event.events.OverlayRenderEvent
import kotakbaz.rain.ui.menu.MenuScreen
import kotlin.jvm.internal.SpreadBuilder
import net.minecraft.client.gl.GlGpuBuffer
import net.minecraft.client.gui.screen.ChatScreen

// $VF: Compiled from heavy
public object ذخ : Listener {
   @JvmStatic
   private ChromaRenderer.FramebufferState framebufferState = ChromaRenderer.FramebufferState();
   private final val frameGate: دد = دد(null, 1, null)
   @JvmStatic
   private OverlayRenderEvent overlayRenderEvent = OverlayRenderEvent();
   public final var loaded: Boolean

   private fun beginFramePipelines(): جظ {
      ChromaRenderer.captureFramebufferState(framebufferState)
      ChromaRenderer.bindMainFramebuffer()
      ChromaRenderer.applyBlend(صْ.SRC_ALPHA, حن.ONE_MINUS_SRC_ALPHA, صْ.ONE, حن.ZERO)
      return framebufferState
   }

   private fun flushFramePipelines(vararg pipelines: صؤ) {
      RenderSystem.backupProjectionMatrix()
      var fbState: ChromaRenderer.FramebufferState = null

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
         var1.add(ذر.INSTANCE.ADVANCED_RECT)
         var1.add(ذر.INSTANCE.KAWASE)
         var1.addSpread(رَ.INSTANCE.all.toArray(arrayOfNulls(0)))
         var10000.loadShaders(var1.toArray(arrayOfNulls(var1.size())) as Array<Renderable>)
         ظق.INSTANCE.loadRender()
         شس.INSTANCE.load()
         loaded = true
      }
   }

   private fun registerShaderLibs() {
      b.registerShaderLibraries(
         this.registerShaderLib("math_utils"), this.registerShaderLib("shapes"), this.registerShaderLib("matrices"), this.registerShaderLib("scissor_check")
      )
   }

   private fun registerShaderLib(file: String?): صغ {
      val var10000: GlShaderLibrary = رس.IN_JAR
         .createShaderLibraryBuilder()
         .name(file)
         .library("${Renderable.Companion.SHADER_INCLUDE_PATH}$file.glsl")
         .build()
         return var10000
   }

   public fun hookRender(partialTicks: Float, vararg pipelines: صؤ) {
      this.hookRenderInternal(
         partialTicks, pipelines, ArraysKt.contains(pipelines, ClientRenderPipeline.HUD_RECT), ArraysKt.contains(pipelines, ClientRenderPipeline.GUI_RECT)
      )
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
         var fbState: ChromaRenderer.FramebufferState = null

         try {
            بد.INSTANCE.unscaledProjection()
            بد.INSTANCE.reset()
            GlStateManager._disableDepthTest()
            if (ArraysKt.contains(pipelines, ClientRenderPipeline.LOW) && frameGate.shouldExecute(30)) {
               ذر.INSTANCE.KAWASE.applyBlur()
            }

            fbState = this.beginFramePipelines()
            if (hasHud) {
               WayPointManager.INSTANCE.renderHud(partialTicks)
            }

            if (hasHud && ضك.getMc().currentScreen is ChatScreen) {
               val var10000: java.util.Collection = ثٌ.INSTANCE.draggables.values()

               for (var17 in var10000) {
                  val var19: Draggable = var17 as Draggable
                  if ((var17 as Draggable).module.isEnabled()) {
                     var19.onDraw()
                  }
               }
            }

            if (hasHud) {
               رظ.INSTANCE.post(overlayRenderEvent)
               ضش.INSTANCE.render()
            }

            if (hasGui) {
               val var20: CustomScreen = صص.INSTANCE.customScreen
               if (var20 != null) {
                  var20.render(mouseX, mouseY, partialTicks)
                  if (var20.shouldRemove()) {
                     صص.INSTANCE.customScreen = null
                  }
               }
            }

            طئ.INSTANCE.renderQueuedFrom(pipelines)
            ظق.INSTANCE.flushPipelineArray(pipelines)
            if (!hasGui || !MenuScreen.INSTANCE.canRenderModelPreviews() && !شآ.hasPendingWork()) {
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
      ChromaRenderer.restoreFramebufferState(fbState)
   }

   public override fun init() {
      ChromaRenderer.init({ glGpuBuffer: GlGpuBuffer ->
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
