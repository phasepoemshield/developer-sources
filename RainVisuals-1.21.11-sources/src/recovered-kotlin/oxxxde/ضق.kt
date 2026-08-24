package oxxxde

import kotakbaz.rain.event.events.KeyEvent
import kotakbaz.rain.module.Module
import kotakbaz.rain.module.setting.ModeSetting
import kotakbaz.rain.module.setting.settings.BindSetting
import kotakbaz.rain.module.setting.settings.BooleanSetting
import net.minecraft.client.gui.Click
import net.minecraft.client.input.KeyInput
import net.minecraft.client.input.MouseInput
import net.minecraft.client.option.KeyBinding
import net.minecraft.client.option.SimpleOption
import net.minecraft.util.Arm
import org.lwjgl.glfw.GLFW
import ru.ocz.protection.annotation.Compile
import sweetie.evaware.flora.api.Commando

// $VF: Compiled from heavy
public object ضق : Module("ChangeHand", PLAYER, "Изменение ведущей руки") {
   private const val INPUT_MOUSE_OFFSET: Int = 400
   private const val MODE_ON_ATTACK: String = "При ударе"
   @JvmStatic
   private BooleanSetting onlyOnHit = Module.boolean$default(ضق.INSTANCE, "При попадании", true, null, 4, null).setVisible({ 
      changeMode.getValue() == "При ударе"
   });
   @JvmStatic
   private ModeSetting changeMode = Module.mode$default(ضق.INSTANCE, "Режим", CollectionsKt.listOf("По кнопке", "При ударе"), 0, null, 12, null);
   private final var attackModePressed: Boolean
   private final var keyModePressed: Boolean
   private const val MODE_BY_KEY: String = "По кнопке"
   @JvmStatic
   private BindSetting changeHandKey = Module.bind$default(INSTANCE, "Кнопка", 72, null, 4, null).setVisible({ 
      changeMode.getValue() == "По кнопке"
   });

   private fun matchesAttackKey(button: Int, isMouse: Boolean): Boolean {
      val var10000: KeyBinding = ضك.getMc().options.attackKey
      return if (isMouse)
         var10000.matchesMouse(Click(0.0, 0.0, MouseInput(button, 0)))
         else
         var10000.matchesKey(KeyInput(button, GLFW.glfwGetKeyScancode(button), 0))
      }

   @Commando
   @Compile
   public fun onAttack(event: ذم) {
      if (changeMode.getValue() == "При ударе") {
         if (!onlyOnHit.getValue() || this.canProcessInput()) {
            this.changeMainArm()
         }
      }
   }

   public override fun onEnable() {
      this.resetInputState()
   }

   private fun handleAttackMode(button: Int, isMouse: Boolean, isRelease: Boolean) {
      if (this.matchesAttackKey(button, isMouse)) {
         if (isRelease) {
            attackModePressed = false
         } else if (!attackModePressed) {
            attackModePressed = true
            this.changeMainArm()
         }
      }
   }

   private fun canProcessInput(): Boolean {
      return ضك.getMc().player != null && ضك.getMc().world != null && ضك.getMc().currentScreen == null
   }

   private fun handleKeyMode(button: Int, isMouse: Boolean, isRelease: Boolean) {
      if (changeHandKey.getValue().intValue() != -1 && this.toIncomingCode(button, isMouse) == changeHandKey.getValue().intValue()) {
         if (isRelease) {
            keyModePressed = false
         } else if (!keyModePressed) {
            keyModePressed = true
            this.changeMainArm()
         }
      }
   }

   private fun resetInputState() {
      keyModePressed = false
      attackModePressed = false
   }

   @Commando
   @Compile
   public fun onKey(event: تز) {
      val var2: Int = event.get(KeyEvent.Companion.BUTTON)
      val var3: Boolean = event.get(KeyEvent.Companion.MOUSE) == true
      val var4: Boolean = event.get(KeyEvent.Companion.RELEASE) == true
      if (this.canProcessInput()) {
         val var5: java.lang.String = changeMode.getValue()
         if (var5 == "По кнопке") {
            this.handleKeyMode(var2, var3, var4)
         } else if (var5 == "При ударе") {
            if (!onlyOnHit.getValue()) {
               this.handleAttackMode(var2, var3, var4)
            }
         }
      }
   }

   public fun shouldKeepLeftOffhandSlotInHud(): Boolean {
      return this.isEnabled() && changeMode.getValue() == "При ударе"
   }

   private fun changeMainArm() {
      val var10000: SimpleOption = ضك.getMc().options.getMainArm()
      var10000.setValue(if (var10000.getValue() === Arm.RIGHT) Arm.LEFT else Arm.RIGHT)
      ضك.getMc().options.write()
   }

   private fun toIncomingCode(button: Int, isMouse: Boolean): Int {
      return if (isMouse) button + 400 else button
   }

   public override fun onDisable() {
      this.resetInputState()
   }
}
