package oxxxde

import java.util.ArrayList
import kotakbaz.rain.module.Module
import kotakbaz.rain.module.setting.settings.BooleanSetting
import net.minecraft.client.network.ClientPlayerEntity
import net.minecraft.item.ItemStack
import net.minecraft.item.Items
import net.minecraft.screen.ScreenHandler
import net.minecraft.screen.slot.Slot
import net.minecraft.screen.slot.SlotActionType
import ru.ocz.protection.annotation.Compile
import sweetie.evaware.flora.api.Commando

// $VF: Compiled from heavy
public object تص : Module("LockSlot", PLAYER, "Блокировка слотов от выброса") {
   @JvmStatic
   private BooleanSetting lockTalismansAndSpheres = Module.boolean$default(تص.INSTANCE, "Блокировать талисманы и сферы", false, null, 4, null);
   private final val slotSettings: List<خذ>
   @JvmStatic
   private BooleanSetting lockAll = Module.boolean$default(تص.INSTANCE, "Заблокировать все", false, null, 4, null);
   private const val OUTSIDE_SLOT: Int = -999

   fun isTalismanOrSphere(stack: ItemStack): Boolean {
      stack.isOf(Items.PLAYER_HEAD) || stack.isOf(Items.TOTEM_OF_UNDYING) && stack.hasGlint()
   }

   @Commando
   @Compile
   public fun onDrop(event: شض) {
      if (this.isEnabled()) {
         val var2: ClientPlayerEntity = ضك.getMc().player
         if (var2 != null) {
            if (lockTalismansAndSpheres.getValue()) {
               val var10001: ItemStack = var2.getMainHandStack()
               if (this.isTalismanOrSphere(var10001)) {
                  event.setCancel(true)
               }
            }
         }
      }
   }

   @JvmStatic
   fun {
      val var0: Byte = 9
      val var1: ArrayList = ArrayList(9)

      repeat(var0) { var2 ->
         var1.add(Module.boolean$default(INSTANCE, java.lang.String.valueOf(var2 + 1), false, null, 4, null).setVisible({ 
            !lockAll.getValue()
         }))
      }

      slotSettings = var1
   }

   @Commando
   @Compile
   public fun onClickSlot(event: تغ) {
      if (lockTalismansAndSpheres.getValue()) {
         val var2: ClientPlayerEntity = ضك.getMc().player
         if (var2 != null) {
            val var3: ScreenHandler = var2.currentScreenHandler
            if (event.syncId == var3.syncId) {
               var var5: ItemStack
               run label39@{
                  if (event.getSlotActionType() === SlotActionType.THROW) {
                     val var4: Int = event.slot
                     if (var4 >= 0 && var4 < (var3.slots as java.util.Collection).size()) {
                        var5 = (var3.slots.get(var4) as Slot).getStack()
                        return@label39
                     }
                  }

                  if (event.getSlotActionType() != SlotActionType.PICKUP || event.slot != -999) {
                     return
                  }

                  var5 = var3.getCursorStack()
               }

               if (this.isTalismanOrSphere(var5)) {
                  event.setCancel(true)
               }
            }
         }
      }
   }
}
