package oxxxde

import java.util.Locale
import net.minecraft.client.network.ClientPlayNetworkHandler
import net.minecraft.client.network.ClientPlayerEntity
import net.minecraft.item.ItemStack
import sweetie.evaware.flora.api.Commando

// $VF: Compiled from heavy
public object اف : دِ("SearchHelper", ظن.getPLAYER(), "Поиск предмета в руке /ah search") {
   private const val MODE_BY_KEY: String = "По кнопке"
   private final val searchMode: ظي = دِ.mode$default(اف.INSTANCE, "Режим", CollectionsKt.listOf("С руки", "По кнопке"), 0, null, 12, null)

   private final val searchKey: ذُ = دِ.bind$default(اف.INSTANCE, "Кнопка", 0, null, 6, null).setVisible({ 
      searchMode.getValue() == "По кнопке"
   })

   private final var keyPressed: Boolean
   private const val MODE_FROM_HAND: String = "С руки"

   fun getHeldItem(offHand: ItemStack, mainHand: ItemStack): ItemStack {
      if (!mainHand.isEmpty()) {
         mainHand
      } else {
         if (!offHand.isEmpty()) offHand else null
      }
   }

   @JvmStatic
   fun {
      اُ.moduleOnFuntime$default(اُ.INSTANCE, INSTANCE, null, 2, null)
   }

   public override fun onEnable() {
      keyPressed = false
   }

   public override fun onDisable() {
      keyPressed = false
   }

   @Commando
   public fun onChat(event: دش) {
      if (event.send) {
         if (searchMode.getValue() == "С руки") {
            if (ضه.INSTANCE.isFunTime()) {
               if (this.isBareAhSearch(event.text)) {
                  if (this.searchHeldItem()) {
                     event.setCancel(true)
                  }
               }
            }
         }
      }
   }

   private fun isBareAhSearch(message: String): Boolean {
      val trimmed: java.lang.String = StringsKt.trim(message).toString()
      if (trimmed.length() == 0) {
         return false
      } else {
         val var10000: Locale = Locale.ROOT
         val var9: java.lang.String = trimmed.toLowerCase(var10000)
         if (!StringsKt.startsWith$default(var9, "/ah", false, 2, null)) {
            return false
         } else {
            val var8: java.util.List = Regex("\\s+").split(trimmed, 0)
            return var8.size() == 2
               && StringsKt.equals(var8.get(0) as java.lang.String, "/ah", true)
               && StringsKt.equals(var8.get(1) as java.lang.String, "search", true)
            }
      }
   }

   private fun searchHeldItem(): Boolean {
      val var10000: ClientPlayerEntity = ضك.getMc().player
      if (var10000 == null) {
         return false
      } else {
         val var10001: ItemStack = var10000.getMainHandStack()
         val var10002: ItemStack = var10000.getOffHandStack()
         val heldItem: ItemStack = this.getHeldItem(var10001, var10002)
         if (heldItem != null && !heldItem.isEmpty()) {
            val itemName: java.lang.String = ضَ.sanitizeName(طث.getName(heldItem))
            if (itemName.length() == 0) {
               سِ.INSTANCE.showMessage(this, "Не удалось определить название предмета для поиска")
               return true
            } else {
               val var5: ClientPlayNetworkHandler = ضك.getMc().getNetworkHandler()
               if (var5 == null) {
                  return false
               } else {
                  var5.sendChatCommand("ah search $itemName")
                  return true
               }
            }
         } else {
            سِ.INSTANCE.showMessage(this, "Держите в руке предмет, который хотите найти на аукционе.")
            return true
         }
      }
   }

   @Commando
   public fun onKey(event: تز) {
      val var10000: Int = event.get(تز.Companion.getBUTTON())
      if (var10000 != null) {
         val button: Int = var10000
         if (!(event.get(تز.Companion.getMOUSE()) == true)) {
            if (searchKey.getValue().intValue() != -1 && button == searchKey.getValue().intValue()) {
               if (event.get(تز.Companion.getRELEASE()) == true) {
                  keyPressed = false
               } else if (searchMode.getValue() == "По кнопке" && !keyPressed) {
                  keyPressed = true
                  if (ضه.INSTANCE.isFunTime()) {
                     if (ضك.getMc().currentScreen == null && صص.INSTANCE.getCustomScreen() == null) {
                        this.searchHeldItem()
                     }
                  }
               }
            }
         }
      }
   }
}
