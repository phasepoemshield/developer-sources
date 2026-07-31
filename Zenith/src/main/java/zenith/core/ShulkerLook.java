package zenith;

import java.util.Optional;
import net.minecraft.item.BlockItem;
import net.minecraft.item.ItemStack;
import net.minecraft.util.collection.DefaultedList;
import net.minecraft.block.ShulkerBoxBlock;
import net.minecraft.item.tooltip.TooltipData;
import net.minecraft.client.gui.tooltip.TooltipComponent;
import net.minecraft.component.type.ContainerComponent;
import net.minecraft.component.DataComponentTypes;
import zenith.zov.client.screens.shulker.ShulkerTooltipComponent;

@ModuleInfo(
   name = "Shulker look",
   category = Category.MISC,
   description = "Показывает что находится в шалкере"
)
public class ShulkerLook extends Module {
   public static final ShulkerLook l1lllI1II1lll1 = new ShulkerLook();

   public static Optional<TooltipData> byteHolder(ItemStack ItemStack) {
      if (!l1lllI1II1lll1.Spider()) {
         return Optional.empty();
      } else {
         if (ItemStack.getItem() instanceof BlockItem BlockItem && BlockItem.getBlock() instanceof ShulkerBoxBlock) {
            DefaultedList DefaultedList = DefaultedList.ofSize(27, ItemStack.EMPTY);
            ContainerComponent ContainerComponent = (ContainerComponent)ItemStack.get(DataComponentTypes.CONTAINER);
            if (ContainerComponent != null) {
               ContainerComponent.copyTo(DefaultedList);
            }

            return Optional.of(new ShulkerLook$II1Il11l111II11IIl(DefaultedList));
         }

         return Optional.empty();
      }
   }

   public static TooltipComponent StringHolder_8(TooltipData TooltipData) {
      return TooltipData instanceof ShulkerLook$II1Il11l111II11IIl li11ii1ill111l11lli1il11i1lill$ii1il11l111ii11iil
         ? new ShulkerTooltipComponent(li11ii1ill111l11lli1il11i1lill$ii1il11l111ii11iil.ll11lII1Il11ll1l())
         : null;
   }
}
