package oxxxde

import kotakbaz.rain.module.Module
import kotakbaz.rain.module.setting.settings.BindSetting
import kotakbaz.rain.module.setting.settings.BooleanSetting
import kotakbaz.rain.module.setting.settings.SliderSetting
import org.joml.Matrix3x2f
import org.joml.Matrix3x2fc
import org.lwjgl.glfw.GLFW

// $VF: Compiled from heavy
public object شز : Module("Zoom", RENDER, "Настройка приближения камеры") {
   private final var smoothCameraRestoreValue: Boolean
   private final var lastMouseY: Float
   @JvmStatic
   private SliderSetting scrollSensitivity = Module.slider$default(شز.INSTANCE, "Сила скролла", 1.0F, 0.1F, 5.0F, 0.1F, null, 32, null);
   private final var screenBoom: Double = 1.0
   private const val RESUME_ZOOM: Boolean = false
   @JvmStatic
   private BooleanSetting useCinematicCamera = Module.boolean$default(شز.INSTANCE, "Кинематографическая камера", false, null, 4, null);
   private final var booming: Boolean
   private const val ROTATE_KEY: Int = -1
   private const val SCREEN_ZOOM_KEY: Int = -1
   private final var boomDivisor: Double = 1.0

   public final var mouseTransform: Matrix3x2fc = Matrix3x2f() as Matrix3x2fc
      private set

   private const val TRANSITION_SPEED: Double = 1.0
   private final var lastMouseX: Float

   public final var renderTransform: Matrix3x2fc = Matrix3x2f() as Matrix3x2fc
      private set

   private const val ALLOW_ZOOM_OUT: Boolean = false
   private final var screenRotation: Float
   @JvmStatic
   private SliderSetting defaultZoom = Module.slider$default(شز.INSTANCE, "Дефолт зум", 5.0F, 2.0F, 15.0F, 0.1F, null, 32, null);
   private final var lastBoomDivisor: Double = 1.0
   private const val ENABLE_SCREEN_ZOOM: Boolean = true
   private final var screenZooming: Boolean
   private const val INPUT_MOUSE_OFFSET: Int = 400
   @JvmStatic
   private BindSetting zoomKey = Module.bind$default(INSTANCE, "Кнопка", 67, null, 4, null);
   private final var lastScreenBoom: Float = 1.0F
   private const val MAX_SCREEN_ZOOM: Double = 5.0
   private final var lastDynamicDeltaTicks: Float = 1.0F
   private const val MAX_ZOOM: Double = 100.0
   private final var rotating: Boolean
   private final var prevBoomDivisor: Double = defaultZoom.getValue().floatValue()
   private const val ENABLE_LIMITS: Boolean = true
   private const val ZOOM_TRANSITION: Boolean = true

   public fun shouldTransformScreenMouse(): Boolean {
      return this.isEnabled() && صص.INSTANCE.customScreen == null && ضك.getMc().currentScreen != null
   }

   private fun interpolator(): Double {
      return lastDynamicDeltaTicks * 1.0
   }

   private fun maxScreenZoomValue(): Double {
      return 5.0
   }

   private fun nudge(value: Float, target: Float): Float {
      return if (Math.abs(target - value) < 0.005F) target else value
   }

   private fun updateState() {
      if (this.isEnabled()) {
         val nowScreenZooming: Boolean = this.isBindPressedNow(zoomKey.getValue().intValue())
            && ((this.isKeyPressed(341) || this.isKeyPressed(345)) && (this.isKeyPressed(340) || this.isKeyPressed(344)) || screenZooming)
            if (screenZooming != nowScreenZooming) {
            screenBoom = if (screenZooming) 1.0 else 2.0
            screenZooming = nowScreenZooming
         }

         rotating = false
         val nowBooming: Boolean = this.isBindPressedNow(zoomKey.getValue().intValue())
            && ضك.getMc().currentScreen == null
            && ضك.getMc().player != null
            && ضك.getMc().world != null
            if (booming != nowBooming) {
            if (booming) {
               prevBoomDivisor = boomDivisor
               boomDivisor = 1.0
               this.restoreSmoothCameraIfNeeded()
            } else {
               boomDivisor = defaultZoom.getValue().floatValue()
               smoothCameraRestoreValue = ضك.getMc().options.smoothCameraEnabled
               if (useCinematicCamera.getValue()) {
                  ضك.getMc().options.smoothCameraEnabled = true
               }
            }

            booming = nowBooming
         }
      }
   }

   public fun onRenderFrame(dynamicDeltaTicks: Float) {
      lastDynamicDeltaTicks = dynamicDeltaTicks
      this.updateState()
      if (!this.isEnabled()) {
         this.resetTransforms()
      } else {
         val mouseX: Float = (float)(ضك.getMc().mouse.getX() / ضك.getMc().getWindow().getScaleFactor())
         val mouseY: Float = (float)(ضك.getMc().mouse.getY() / ضك.getMc().getWindow().getScaleFactor())
         val render: Matrix3x2f = Matrix3x2f().identity()
         render.translate(lastMouseX, lastMouseY)
         render.scale(lastScreenBoom, lastScreenBoom)
         render.translate(-lastMouseX, -lastMouseY)
         val rotation: Matrix3x2f = Matrix3x2f().identity()
         rotation.translate((float)ضك.getMc().getWindow().getScaledWidth() / 2.0F, (float)ضك.getMc().getWindow().getScaledHeight() / 2.0F)
         rotation.rotate((float)Math.toRadians((double)screenRotation))
         rotation.translate((float)ضك.getMc().getWindow().getScaledWidth() / -2.0F, (float)ضك.getMc().getWindow().getScaledHeight() / -2.0F)
         render.mul(rotation as Matrix3x2fc)
         renderTransform = Matrix3x2f(render as Matrix3x2fc) as Matrix3x2fc
         val var10000: Matrix3x2f = Matrix3x2f(rotation as Matrix3x2fc).invert()
         mouseTransform = var10000 as Matrix3x2fc
         lastScreenBoom = lastScreenBoom + 0.45F * (((float)screenBoom - lastScreenBoom) * (float)this.interpolator())
         lastMouseX = lastMouseX + 0.65F * ((mouseX - lastMouseX) * dynamicDeltaTicks)
         lastMouseY = lastMouseY + 0.65F * ((mouseY - lastMouseY) * dynamicDeltaTicks)
         lastScreenBoom = this.nudge(lastScreenBoom, 1.0F)
         lastMouseX = this.nudge(lastMouseX, mouseX)
         lastMouseY = this.nudge(lastMouseY, mouseY)
      }
   }

   private fun maxZoomValue(): Double {
      return 100.0
   }

   private fun resetTransforms() {
      renderTransform = Matrix3x2f() as Matrix3x2fc
      mouseTransform = Matrix3x2f() as Matrix3x2fc
   }

   public override fun onEnable() {
      prevBoomDivisor = defaultZoom.getValue().floatValue()
      lastBoomDivisor = 1.0
      this.resetTransforms()
   }

   private fun restoreSmoothCameraIfNeeded() {
      ضك.getMc().options.smoothCameraEnabled = smoothCameraRestoreValue
   }

   public fun handleMouseScroll(vertical: Double): Boolean {
      if (this.isEnabled() && صص.INSTANCE.customScreen == null) {
         this.updateState()
         val var10000: Boolean
         if (ضك.getMc().currentScreen != null) {
            if (rotating) {
               screenRotation += (float)vertical
               var10000 = true
            } else if (screenZooming) {
               screenBoom = Math.min(Math.max(this.minZoom(), screenBoom + vertical * 0.2 * screenBoom), this.maxScreenZoomValue())
               var10000 = true
            } else {
               var10000 = false
            }
         } else if (booming) {
            boomDivisor = Math.min(
               Math.max(this.minZoom(), boomDivisor + vertical * (boomDivisor / 10.0) * (double)scrollSensitivity.getValue().floatValue()), this.maxZoomValue()
            )
            var10000 = true
         } else {
            var10000 = false
         }

         return var10000
      } else {
         return false
      }
   }

   private fun isBindPressedNow(key: Int): Boolean {
      if (key <= 0) {
         return false
      } else {
         return if (key >= 400)
            0 <= key - 400 && key - 400 < 8 && GLFW.glfwGetMouseButton(ضك.getMc().getWindow().getHandle(), key - 400) == 1
            else
            GLFW.glfwGetKey(ضك.getMc().getWindow().getHandle(), key) == 1
         }
   }

   public override fun onDisable() {
      this.restoreSmoothCameraIfNeeded()
      booming = false
      screenZooming = false
      rotating = false
      boomDivisor = 1.0
      prevBoomDivisor = defaultZoom.getValue().floatValue()
      lastBoomDivisor = 1.0
      screenBoom = 1.0
      screenRotation = 0.0F
      lastScreenBoom = 1.0F
      lastMouseX = 0.0F
      lastMouseY = 0.0F
      lastDynamicDeltaTicks = 1.0F
      this.resetTransforms()
   }

   public fun modifyFov(fov: Float): Float {
      if (!this.isEnabled()) {
         return fov
      } else {
         this.updateState()
         lastBoomDivisor = lastBoomDivisor + 0.45 * (boomDivisor - lastBoomDivisor) * this.interpolator()
         return (float)(fov / Math.max(lastBoomDivisor, 0.01))
      }
   }

   private fun minZoom(): Double {
      return 1.0
   }

   private fun isKeyPressed(key: Int): Boolean {
      return GLFW.glfwGetKey(ضك.getMc().getWindow().getHandle(), key) == 1
   }

   public fun adjustMouseSensitivity(delta: Double): Double {
      if (!this.isEnabled()) {
         return delta
      } else {
         this.updateState()
         return if (booming) delta / Math.max(boomDivisor, 0.01) else delta
      }
   }
}
