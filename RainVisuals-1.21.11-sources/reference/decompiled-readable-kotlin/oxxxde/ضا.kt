package oxxxde

import java.util.ArrayList
import java.util.Optional
import kotakbaz.rain.module.Module
import kotakbaz.rain.module.setting.settings.BooleanSetting
import net.minecraft.block.ShulkerBoxBlock
import net.minecraft.client.MinecraftClient
import net.minecraft.client.gui.DrawContext
import net.minecraft.client.gui.screen.Screen
import net.minecraft.component.DataComponentTypes
import net.minecraft.component.type.ContainerComponent
import net.minecraft.item.BlockItem
import net.minecraft.item.Item
import net.minecraft.item.ItemStack
import net.minecraft.registry.tag.ItemTags
import net.minecraft.util.Identifier
import net.minecraft.util.collection.DefaultedList

// $VF: Compiled from heavy
public object ضا : Module("ShulkerHelper", PLAYER, "Разные настройки шалкера") {
   private const val SHULKER_SLOTS: Int = 27
   @JvmStatic
   private BooleanSetting showContents = Module.boolean$default(INSTANCE, "Предосмотр содержимого", true, null, 4, null);

   fun scheduleTooltip(mouseX: DrawContext, stack: ItemStack, mouseY: Int, graphics: Int): Boolean {
      if (this.isEnabled() && showContents.getValue() && this.isShulker(stack)) {
         val var10000: MinecraftClient = MinecraftClient.getInstance()
         val var19: ItemStack = stack.copy()
         var19.remove(DataComponentTypes.CONTAINER)
         val `$this$map$iv`: java.lang.Iterable = this.contents(stack) as java.lang.Iterable
         val `destination$iv$iv`: java.util.Collection = ArrayList(CollectionsKt.collectionSizeOrDefault(`$this$map$iv`, 10))

         for (`item$iv$iv` in `$this$map$iv`) {
            `destination$iv$iv`.add((`item$iv$iv` as ItemStack).copy())
         }

         graphics.drawTooltip(
            var10000.textRenderer,
            Screen.getTooltipFromItem(var10000, var19),
            Optional.of(دؤ(`destination$iv$iv` as MutableList<ItemStack>)),
            mouseX,
            mouseY,
            stack.get(DataComponentTypes.TOOLTIP_STYLE) as Identifier
         )
         true
      } else {
         false
      }
   }

   fun contents(stack: ItemStack): DefaultedList<ItemStack> {
      val var10000: DefaultedList = DefaultedList.ofSize(27, ItemStack.EMPTY)
      val var3: ContainerComponent = stack.get(DataComponentTypes.CONTAINER) as ContainerComponent
      if (var3 != null) {
         var3.copyTo(var10000)
      }

      var10000
   }

   fun isShulker(stack: ItemStack): Boolean {
      label22@
      if (stack.isIn(ItemTags.SHULKER_BOXES)) {
         true
      } else {
         val var3: Item = stack.getItem()
         (var3 as? BlockItem) != null && (var3 as? BlockItem).getBlock() is ShulkerBoxBlock
      }
   }
}
