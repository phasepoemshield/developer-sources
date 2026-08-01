package zenith;

import it.unimi.dsi.fastutil.objects.Object2IntMap.Entry;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.entry.RegistryEntry;
import net.minecraft.component.type.ItemEnchantmentsComponent;

public class ZenithInternal150 extends StringHolder_30 {
   public ZenithInternal150(String s, String s1, int i) {
      super(s, s1, i);
   }

   @Override
   public boolean StringHolder_8(ItemStack ItemStack) {
      if (this.OnMouseClickedHandler <= 0) {
         return true;
      } else {
         ItemEnchantmentsComponent ItemEnchantmentsComponent = ItemStack.getEnchantments();

         for (Entry entry : ItemEnchantmentsComponent.getEnchantmentEntries()) {
            String s = ((RegistryEntry)entry.getKey()).getKey().toString();
            if (s.contains(this.doubleHolder)) {
               return entry.getIntValue() >= this.OnMouseClickedHandler;
            }
         }

         return false;
      }
   }
}
