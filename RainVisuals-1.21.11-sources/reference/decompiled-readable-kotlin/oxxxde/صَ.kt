package oxxxde

import kotakbaz.rain.mixin.MinecraftClientAccessor
import kotakbaz.rain.mixin.MinecraftClientInvoker
import kotakbaz.rain.module.Module
import kotakbaz.rain.module.setting.ModeSetting
import kotakbaz.rain.module.setting.settings.SliderSetting
import net.minecraft.client.MinecraftClient
import net.minecraft.client.network.ClientPlayerEntity
import net.minecraft.component.DataComponentTypes
import net.minecraft.item.ItemStack
import ru.ocz.protection.annotation.Compile
import ru.ocz.protection.virtualmachine.annotation.RecompileFormat
import sweetie.evaware.flora.api.Commando

// $VF: Compiled from heavy
@RecompileFormat
public object صَ : Module("TapeMouse", PLAYER, "Авто-клики выбранной кнопки") {
   private final var lastActionAt: Long
   private const val BUTTON_LEFT: Int = 0
   @JvmStatic
   private SliderSetting delay = Module.slider$default(INSTANCE, "Задержка", 500.0F, 200.0F, 2000.0F, 10.0F, null, 32, null);
   @JvmStatic
   private ModeSetting button = Module.mode$default(INSTANCE, "Кнопка", CollectionsKt.listOf("Левая", "Правая"), 0, null, 12, null);
   private const val BUTTON_RIGHT: Int = 1

   private fun isUsingFood(): Boolean {
      val var10000: ClientPlayerEntity = ضك.getMc().player
      if (var10000 == null) {
         return false
      } else if (!var10000.isUsingItem()) {
         return false
      } else {
         val var3: ItemStack = var10000.getActiveItem()
         return !var3.isEmpty() && var3.get(DataComponentTypes.FOOD) != null
      }
   }

   private fun shouldClickNow(): Boolean {
      return this.isEnabled()
         && !سظ.INSTANCE.isActiveEating()
         && !this.isUsingFood()
         && صص.INSTANCE.customScreen == null
         && ضك.getMc().player != null
         && ضك.getMc().world != null
         && ضك.getMc().interactionManager != null
         && ضك.getMc().currentScreen == null
         && ضك.getMc().mouse.isCursorLocked()
      }

   public override fun onEnable() {
      lastActionAt = 0L
   }

   @Commando
   @Compile
   public fun onUpdate(event: سح) {
      if (this.shouldClickNow()) {
         val var2: Long = System.currentTimeMillis()
         if (!((float)(var2 - lastActionAt) < delay.getValue().floatValue())) {
            val var4: MinecraftClient = ضك.getMc()
            if (button.selectedIndex == 0) {
               (var4 as MinecraftClientInvoker).rain$doAttack()
               lastActionAt = var2
            } else if ((var4 as MinecraftClientAccessor).rain$getItemUseCooldown() == 0 && !var4.player.isUsingItem()) {
               (var4 as MinecraftClientInvoker).rain$doItemUse()
               lastActionAt = var2
            }
         }
      }
   }
}
