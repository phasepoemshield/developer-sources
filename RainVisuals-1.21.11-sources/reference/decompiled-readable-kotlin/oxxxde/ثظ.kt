package oxxxde

import com.mojang.blaze3d.opengl.GlStateManager
import com.mojang.blaze3d.textures.GpuTexture
import kotakbaz.rain.client.render.main.ChromaRenderer
import kotakbaz.rain.module.Module
import kotakbaz.rain.module.modules.render.Menu3DModule$Ghost
import kotakbaz.rain.module.modules.render.Menu3DModule$Placement
import kotakbaz.rain.module.setting.settings.SliderSetting
import kotakbaz.rain.ui.menu.MenuScreen
import kotlin.jdk7.AutoCloseableKt
import kotlin.math.MathKt
import net.minecraft.client.gl.Framebuffer
import net.minecraft.client.render.Camera
import net.minecraft.client.render.GameRenderer
import net.minecraft.client.render.RainRenderLayers
import net.minecraft.client.render.RenderLayer
import net.minecraft.client.render.VertexConsumer
import net.minecraft.client.render.VertexConsumerProvider
import net.minecraft.client.render.VertexConsumerProvider.Immediate
import net.minecraft.client.texture.AbstractTexture
import net.minecraft.client.texture.GlTexture
import net.minecraft.client.texture.NativeImageBackedTexture
import net.minecraft.client.util.BufferAllocator
import net.minecraft.client.util.math.MatrixStack.Entry
import net.minecraft.client.world.ClientWorld
import net.minecraft.util.Identifier
import net.minecraft.util.math.Vec3d
import org.joml.Quaternionf
import org.joml.Quaternionfc
import org.joml.Vector3fc
import org.lwjgl.opengl.GL11
import org.slf4j.Logger
import org.slf4j.LoggerFactory
import sweetie.evaware.flora.api.Commando

// $VF: Compiled from heavy
public object ثظ : Module("3DMenu", RENDER, "Оставляет закрытое меню в мире и плавно скрывает его") {
   private final var completingClose: Boolean
   private final val logger: Logger = LoggerFactory.getLogger("Rain 3D Menu")
   @JvmStatic
   private NativeImageBackedTexture snapshotTexture;
   @JvmStatic
   private SliderSetting holdTime = Module.slider$default(ثظ.INSTANCE, "Время показа", 2.5F, 0.5F, 5.0F, 0.1F, null, 32, null);
   private final var snapshotWidth: Int
   private const val BUFFER_SIZE: Int = 262144
   @JvmStatic
   private Identifier SNAPSHOT_TEXTURE_ID;
   @JvmStatic
   private Menu3DModule$Ghost ghost;
   private final var snapshotHeight: Int
   @JvmStatic
   private SliderSetting distance = Module.slider$default(ثظ.INSTANCE, "Дистанция", 2.0F, 1.0F, 4.0F, 0.1F, null, 32, null);
   @JvmStatic
   private Menu3DModule$Placement pendingPlacement;
   @JvmStatic
   private SliderSetting fadeTime = Module.slider$default(INSTANCE, "Время затухания", 1.0F, 0.25F, 3.0F, 0.05F, null, 32, null);

   private fun renderGhost(event: شث, placement: اب, alpha: Float) {
      val var10000: GameRenderer = ضك.getMc().gameRenderer
      val cameraPos: Vec3d = طث.getPos(طث.getCamera(var10000))
      val halfWidth: Float = placement.width * 0.5F
      val halfHeight: Float = placement.height * 0.5F
      val colorAlpha: Int = RangesKt.coerceIn(MathKt.roundToInt(alpha * 255.0F), 0, 255)
      val layer: RenderLayer = RainRenderLayers.getMenu3D(SNAPSHOT_TEXTURE_ID)
      val var9: AutoCloseable = BufferAllocator(262144) as AutoCloseable
      var var10: java.lang.Throwable = null

      try {
         val var24: Immediate = VertexConsumerProvider.immediate(var9 as BufferAllocator)
         val var25: VertexConsumer = var24.getBuffer(layer)
         event.getMatrices().push()
         event.getMatrices().translate(placement.getCenter().x - cameraPos.x, placement.getCenter().y - cameraPos.y, placement.getCenter().z - cameraPos.z)
         event.getMatrices().multiply(placement.rotation as Quaternionfc)
         val var26: Entry = event.getMatrices().peek()
         var25.vertex(var26, -halfWidth, halfHeight, 0.0F).color(255, 255, 255, colorAlpha).texture(0.0F, 1.0F)
         var25.vertex(var26, halfWidth, halfHeight, 0.0F).color(255, 255, 255, colorAlpha).texture(1.0F, 1.0F)
         var25.vertex(var26, halfWidth, -halfHeight, 0.0F).color(255, 255, 255, colorAlpha).texture(1.0F, 0.0F)
         var25.vertex(var26, -halfWidth, -halfHeight, 0.0F).color(255, 255, 255, colorAlpha).texture(0.0F, 0.0F)
         event.getMatrices().pop()
         var24.draw(layer)
      } catch (var21: java.lang.Throwable) {
         var10 = var21
         throw var21
      } finally {
         AutoCloseableKt.closeFinally(var9, var10)
      }
   }

   @Commando
   public fun onRender3D(event: شث) {
      if (ghost != null) {
         val currentGhost: Menu3DModule$Ghost = ghost
         if (ضك.getMc().world === currentGhost.placement.getLevel() && snapshotTexture != null) {
            val alpha: Float = currentGhost.alpha(System.nanoTime())
            if (alpha <= 0.0F) {
               ghost = null
            } else {
               this.renderGhost(event, currentGhost.placement, alpha)
            }
         } else {
            ghost = null
         }
      }
   }

   private fun releaseResources() {
      if (snapshotTexture != null) {
         val it: NativeImageBackedTexture = snapshotTexture
         ضك.getMc().getTextureManager().destroyTexture(SNAPSHOT_TEXTURE_ID)
      }

      snapshotTexture = null
      snapshotWidth = 0
      snapshotHeight = 0
   }

   private fun secondsToNanos(seconds: Float): Long {
      return RangesKt.coerceAtLeast((long)(RangesKt.coerceAtLeast(seconds, 0.0F) * (float)1000000000L), 1L)
   }

   public fun onMenuOpened() {
      pendingPlacement = null
      ghost = null
   }

   public fun capturePendingFrame() {
      if (pendingPlacement != null) {
         val placement: Menu3DModule$Placement = pendingPlacement
         if (this.isEnabled() && صص.INSTANCE.customScreen === MenuScreen.INSTANCE) {
            val framebufferState: ChromaRenderer.FramebufferState = ChromaRenderer.captureFramebufferState()

            var var32: Boolean
            run label214@{
               try {
                  val var34: Boolean = true
                  ChromaRenderer.bindMainFramebuffer()
                  val var10001: Framebuffer = ضك.getMc().getFramebuffer()
                  var32 = this.copyMenuPanel(var10001)
                  break label214;
               } catch (var30: Exception) {
                  logger.error("Unable to capture 3D menu snapshot", var30)
               } finally {
                  if (var26) {
                     ChromaRenderer.restoreFramebufferState(framebufferState)
                     pendingPlacement = null
                     completingClose = true

                     try {
                        MenuScreen.INSTANCE.close()
                     } finally {
                        completingClose = false
                     }
                  }
               }

               ChromaRenderer.restoreFramebufferState(framebufferState)
               pendingPlacement = null
               completingClose = true

               val var26: <unknown>
               try {
                  MenuScreen.INSTANCE.close()
                  return
               } finally {
                  completingClose = false
               }
            }

            ChromaRenderer.restoreFramebufferState(framebufferState)
            pendingPlacement = null
            if (var32) {
               ghost = Menu3DModule$Ghost(
                  placement, System.nanoTime(), this.secondsToNanos(holdTime.getValue().floatValue()), this.secondsToNanos(fadeTime.getValue().floatValue())
               )
            }

            completingClose = true

            try {
               MenuScreen.INSTANCE.close()
               if (var32 && صص.INSTANCE.customScreen === MenuScreen.INSTANCE) {
                  صص.INSTANCE.customScreen = null
               }
            } finally {
               completingClose = false
            }
         } else {
            pendingPlacement = null
         }
      }
   }

   @JvmStatic
   fun {
      val var10000: Identifier = Identifier.of("rain", "menu_3d_snapshot")
      SNAPSHOT_TEXTURE_ID = var10000
   }

   fun prepareSnapshotTexture(height: Int, width: Int): NativeImageBackedTexture {
      if (snapshotTexture != null && snapshotWidth == width && snapshotHeight == height) {
         snapshotTexture
      } else {
         if (snapshotTexture != null) {
            ضك.getMc().getTextureManager().destroyTexture(SNAPSHOT_TEXTURE_ID)
         }

         val var4: NativeImageBackedTexture = NativeImageBackedTexture("rain_menu_3d_snapshot", width, height, false)
         ضك.getMc().getTextureManager().registerTexture(SNAPSHOT_TEXTURE_ID, var4 as AbstractTexture)
         snapshotTexture = var4
         snapshotWidth = width
         snapshotHeight = height
         var4
      }
   }

   private fun createPlacement(): اب? {
      val var10000: ClientWorld = ضك.getMc().world
      if (var10000 == null) {
         return null
      } else {
         val var14: GameRenderer = ضك.getMc().gameRenderer
         val camera: Camera = طث.getCamera(var14)
         if (!camera.isReady()) {
            return null
         } else {
            val planeDistance: Double = distance.getValue().floatValue()
            val var15: Vector3fc = camera.getHorizontalPlane()
            val var16: Vec3d = طث.getPos(camera).add((double)var15.x() * planeDistance, (double)var15.y() * planeDistance, (double)var15.z() * planeDistance)
            val menuHeight: Float = (float)(
               2.0
                  * planeDistance
                  * Math.tan(Math.toRadians((double)RangesKt.coerceIn(ضك.getMc().gameRenderer.getFov(camera, 1.0F, true), 20.0F, 150.0F) * 0.5))
                  * (
                     MenuScreen.INSTANCE.height
                        * MenuScreen.INSTANCE.renderedScale()
                        / RangesKt.coerceAtLeast((float)ضك.getMc().getWindow().getScaledHeight(), 1.0F)
                  )
            )
            return Menu3DModule$Placement(
               var10000,
               var16,
               Quaternionf(camera.getRotation() as Quaternionfc),
               menuHeight * (MenuScreen.INSTANCE.width / MenuScreen.INSTANCE.height),
               menuHeight
            )
         }
      }
   }

   fun copyMenuPanel(target: Framebuffer): Boolean {
      val scale: Float = ضك.getMc().getWindow().getScaleFactor()
      val renderedScale: Float = MenuScreen.INSTANCE.renderedScale()
      val renderedWidth: Float = MenuScreen.INSTANCE.width * renderedScale
      val renderedHeight: Float = MenuScreen.INSTANCE.height * renderedScale
      val renderedX: Float = ضك.getMc().getWindow().getScaledWidth() * 0.5F - renderedWidth * 0.5F
      val renderedY: Float = ضك.getMc().getWindow().getScaledHeight() * 0.5F - renderedHeight * 0.5F
      val sourceX: Int = MathKt.roundToInt(renderedX * scale)
      val sourceTop: Int = MathKt.roundToInt(renderedY * scale)
      val width: Int = RangesKt.coerceAtLeast(MathKt.roundToInt(renderedWidth * scale), 1)
      val height: Int = RangesKt.coerceAtLeast(MathKt.roundToInt(renderedHeight * scale), 1)
      val sourceY: Int = target.textureHeight - sourceTop - height
      if (sourceX >= 0
         && target.textureHeight - sourceTop - height >= 0
         && sourceX + width <= target.textureWidth
         && target.textureHeight - sourceTop - height + height <= target.textureHeight) {
         val previousReadBuffer: GpuTexture = this.prepareSnapshotTexture(width, height).getGlTexture()
         val var10000: GlTexture = previousReadBuffer as? GlTexture
         if ((previousReadBuffer as? GlTexture) == null) {
            false
         } else {
            val glTexture: GlTexture = var10000

            try {
               GL11.glReadBuffer(36064)
               GlStateManager._bindTexture(glTexture.getGlId())
               GL11.glTexParameteri(3553, 36421, 1)
               GL11.glCopyTexSubImage2D(3553, 0, 0, 0, sourceX, sourceY, width, height)
            } finally {
               GlStateManager._bindTexture(GL11.glGetInteger(32873))
               GL11.glReadBuffer(GL11.glGetInteger(3074))
            }

            true
         }
      } else {
         false
      }
   }

   public override fun onDisable() {
      pendingPlacement = null
      ghost = null
      this.releaseResources()
   }

   public fun requestCloseSnapshot(): Boolean {
      if (!this.isEnabled() || completingClose || ضك.getMc().world == null || ضك.getMc().player == null) {
         return false
      } else if (pendingPlacement != null) {
         return true
      } else {
         val var10000: Menu3DModule$Placement = this.createPlacement()
         if (var10000 == null) {
            return false
         } else {
            pendingPlacement = var10000
            return true
         }
      }
   }
}
