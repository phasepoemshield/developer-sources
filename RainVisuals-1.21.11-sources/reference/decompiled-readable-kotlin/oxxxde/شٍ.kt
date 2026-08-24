package oxxxde

import net.minecraft.class_1799
import net.minecraft.item.ItemStack

// $VF: Compiled from heavy
private class شٍ {
   private ItemStack shell;
   public final val contents: MutableList<class_1799>
   public final var containerCount: Int

   fun addContent(stack: ItemStack) {
      val var5: java.util.Iterator = this.contents.iterator()

      var var10000: Any
      while (true) {
         if (var5.hasNext()) {
            val `element$iv`: Any = var5.next()
            if (!ItemStack.areItemsAndComponentsEqual(`element$iv` as ItemStack, stack)) {
               continue
            }

            var10000 = `element$iv`
            break
         }

         var10000 = null
         break
      }

      val existing: ItemStack = var10000 as ItemStack
      if (var10000 as ItemStack == null) {
         this.contents.add(stack.copy())
      } else {
         existing.increment(stack.getCount())
      }
   }

   fun getShell(): ItemStack {
      this.shell
   }

   fun شٍ(shell: ItemStack, containerCount: Int, contents: MutableList<ItemStack>) {
      super()
      this.shell = shell
      this.containerCount = containerCount
      this.contents = contents
   }
}
