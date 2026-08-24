package oxxxde;

import java.util.List;
import net.minecraft.item.ItemStack;
import net.minecraft.item.tooltip.TooltipData;

// $VF: Compiled from heavy
public record دؤ(List<ItemStack> items) implements TooltipData {
   public دؤ {
      items = List.copyOf(items);
   }
}
