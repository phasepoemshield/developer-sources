package oxxxde

import java.util.function.Predicate
import net.minecraft.class_9331
import net.minecraft.component.ComponentChanges
import net.minecraft.component.ComponentType
import net.minecraft.component.DataComponentTypes
import net.minecraft.item.ItemStack

// $VF: Compiled from heavy
internal object تا {
   private final val forgetNonIdentity: Predicate<class_9331<*>>
   private const val STAR_MARKER: String = "[★]"
   private final val nonIdentityComponents: Set<class_9331<*>>

   fun matches(actual: ItemStack, expected: ItemStack): Boolean {
      !actual.isEmpty()
         && !expected.isEmpty()
         && actual.getItem() === expected.getItem()
         && this.identityName(actual) == this.identityName(expected)
         && this.stableComponents(actual) == this.stableComponents(expected)
      }

   @JvmStatic
   fun {
      val var0: Array<ComponentType> = arrayOfNulls(13)
      var var10002: ComponentType = DataComponentTypes.CUSTOM_DATA
      var0[0] = var10002
      var10002 = DataComponentTypes.DAMAGE
      var0[1] = var10002
      var10002 = DataComponentTypes.REPAIR_COST
      var0[2] = var10002
      var10002 = DataComponentTypes.CUSTOM_NAME
      var0[3] = var10002
      var10002 = DataComponentTypes.ITEM_NAME
      var0[4] = var10002
      var10002 = DataComponentTypes.LORE
      var0[5] = var10002
      var10002 = DataComponentTypes.TOOLTIP_DISPLAY
      var0[6] = var10002
      var10002 = DataComponentTypes.ENCHANTMENT_GLINT_OVERRIDE
      var0[7] = var10002
      var10002 = DataComponentTypes.BUNDLE_CONTENTS
      var0[8] = var10002
      var10002 = DataComponentTypes.CONTAINER
      var0[9] = var10002
      var10002 = DataComponentTypes.BLOCK_ENTITY_DATA
      var0[10] = var10002
      var10002 = DataComponentTypes.CHARGED_PROJECTILES
      var0[11] = var10002
      var10002 = DataComponentTypes.BEES
      var0[12] = var10002
      nonIdentityComponents = SetsKt.setOf(var0)
      forgetNonIdentity = nonIdentityComponents.oxxxde/تا##Lambda_0_171(nonIdentityComponents)
   }

   fun identityName(stack: ItemStack): java.lang.String {
      val var10000: java.lang.String = stack.getName().getString()
      StringsKt.trim(StringsKt.replace$default(var10000, "[★]", "", false, 4, null)).toString()
   }

   fun stableComponents(stack: ItemStack): ComponentChanges {
      val var10000: ComponentChanges = stack.getComponentChanges().withRemovedIf(forgetNonIdentity)
      var10000
   }
}
