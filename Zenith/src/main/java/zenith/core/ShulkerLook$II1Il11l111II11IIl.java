package zenith;

import net.minecraft.item.ItemStack;
import net.minecraft.util.collection.DefaultedList;
import net.minecraft.item.tooltip.TooltipData;

public final class ShulkerLook$II1Il11l111II11IIl implements TooltipData {
   private final DefaultedList<ItemStack> l1I1I1l1ll1lI1l11IlIllllIIll = DefaultedList.ofSize(27, ItemStack.EMPTY);

   public ShulkerLook$II1Il11l111II11IIl(DefaultedList<ItemStack> DefaultedList) {
      for (int i = 0; i < 27 && i < DefaultedList.size(); i++) {
         ItemStack ItemStack = (ItemStack)DefaultedList.get(i);
         this.l1I1I1l1ll1lI1l11IlIllllIIll.set(i, ItemStack.isEmpty() ? ItemStack.EMPTY : ItemStack.copy());
      }
   }

   public DefaultedList<ItemStack> ll11lII1Il11ll1l() {
      return this.l1I1I1l1ll1lI1l11IlIllllIIll;
   }
}
