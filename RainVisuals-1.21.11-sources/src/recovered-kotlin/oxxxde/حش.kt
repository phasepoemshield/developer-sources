package oxxxde

import kotakbaz.rain.event.events.KeyEvent
import kotakbaz.rain.module.Module
import kotakbaz.rain.module.setting.settings.BindSetting
import kotakbaz.rain.module.setting.settings.BooleanSetting
import net.minecraft.client.network.ClientPlayerEntity
import net.minecraft.client.option.GameOptions
import net.minecraft.client.option.Perspective
import net.minecraft.entity.Entity
import org.lwjgl.glfw.GLFW
import sweetie.evaware.flora.api.Commando

// $VF: Compiled from heavy
public object حش : Module("Perspective", RENDER, "Улучшеный вид от третьего лица") {
   private final var cameraYaw: Float
   private const val MAX_CAMERA_PITCH: Float = 90.0F
   private const val INPUT_MOUSE_OFFSET: Int = 400
   private final var held: Boolean
   @JvmStatic
   private BooleanSetting holdMode = Module.boolean$default(INSTANCE, "Режим удержания", false, null, 4, null);
   private final var cameraPitch: Float
   @JvmStatic
   private BindSetting perspectiveKey = Module.bind$default(INSTANCE, "Кнопка", 293, null, 4, null);
   private final var perspectiveActive: Boolean

   public fun rotateCamera(mouseXDelta: Double, mouseYDelta: Double) {
      if (this.isPerspectiveActive()) {
         cameraYaw += (float)(mouseXDelta / 8.0)
         cameraPitch += (float)(mouseYDelta / 8.0)
         cameraPitch = RangesKt.coerceIn(cameraPitch, -90.0F, 90.0F)
      }
   }

   public override fun onEnable() {
      super.onEnable()
      this.resetState()
   }

   private fun captureCamera(pitch: Float, yaw: Float) {
      cameraPitch = pitch
      cameraYaw = yaw
   }

   public override fun onDisable() {
      this.disablePerspective(true)
      this.resetState()
      super.onDisable()
   }

   private fun isBindPressedNow(): Boolean {
      val key: Int = perspectiveKey.getValue().intValue()
      label36@
      if (key <= 0) {
         return false
      } else {
         val window: Long = ضك.getMc().getWindow().getHandle()
         return if (key >= 400) key - 400 >= 0 && key - 400 <= 7 && GLFW.glfwGetMouseButton(window, key - 400) == 1 else GLFW.glfwGetKey(window, key) == 1
      }
   }

   @Commando
   public fun onKey(event: تز) {
      val var10000: ClientPlayerEntity = ضك.getMc().player
      if (var10000 != null) {
         if (ضك.getMc().world != null && !holdMode.getValue() && this.canHandlePerspectiveInput()) {
            val var7: Int = event.get(KeyEvent.Companion.BUTTON)
            if (var7 != null) {
               val button: Int = var7
               val isMouse: Boolean = event.get(KeyEvent.Companion.MOUSE) == true
               if (!(event.get(KeyEvent.Companion.RELEASE) == true)) {
                  if ((if (isMouse) button + 400 else button) == perspectiveKey.getValue().intValue()) {
                     perspectiveActive = !perspectiveActive
                     this.captureCamera(طث.getPitch(var10000 as Entity), طث.getYaw(var10000 as Entity))
                     val var8: GameOptions = ضك.getMc().options
                     طث.setPerspective(var8, if (perspectiveActive) Perspective.THIRD_PERSON_BACK else Perspective.FIRST_PERSON)
                  }
               }
            }
         }
      }
   }

   private fun resetState() {
      perspectiveActive = false
      held = false
      cameraPitch = 0.0F
      cameraYaw = 0.0F
   }

   private fun disablePerspective(forceFirstPerson: Boolean) {
      if (perspectiveActive || held) {
         perspectiveActive = false
         held = false
         if (forceFirstPerson) {
            val var10000: GameOptions = ضك.getMc().options
            طث.setPerspective(var10000, Perspective.FIRST_PERSON)
         }
      }
   }

   public fun isPerspectiveActive(): Boolean {
      return this.isEnabled() && perspectiveActive && ضك.getMc().player != null
   }

   private fun canHandlePerspectiveInput(): Boolean {
      return ضك.getMc().currentScreen == null && صص.INSTANCE.customScreen == null
   }

   public fun cameraPitch(): Float {
      return cameraPitch
   }

   public fun cameraYaw(): Float {
      return cameraYaw
   }

   @Commando
   public fun onUpdate(event: سح) {
      val var10000: ClientPlayerEntity = ضك.getMc().player
      if (var10000 == null) {
         this.disablePerspective(true)
      } else {
         if (holdMode.getValue()) {
            if (!this.canHandlePerspectiveInput()) {
               this.disablePerspective(true)
               return
            }

            perspectiveActive = this.isBindPressedNow()
            if (perspectiveActive && !held) {
               held = true
               this.captureCamera(طث.getPitch(var10000 as Entity), طث.getYaw(var10000 as Entity))
               val var5: GameOptions = ضك.getMc().options
               طث.setPerspective(var5, Perspective.THIRD_PERSON_BACK)
            }
         }

         if (!perspectiveActive && held) {
            held = false
            val var6: GameOptions = ضك.getMc().options
            طث.setPerspective(var6, Perspective.FIRST_PERSON)
         }

         if (perspectiveActive) {
            val var7: GameOptions = ضك.getMc().options
            if (طث.getPerspective(var7) != Perspective.THIRD_PERSON_BACK) {
               perspectiveActive = false
            }
         }
      }
   }
}
