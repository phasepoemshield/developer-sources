package zenith;

import java.util.List;
import java.util.Optional;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.component.type.PotionContentsComponent;
import net.minecraft.registry.entry.RegistryEntry;
import net.minecraft.component.DataComponentTypes;

public class RegistryEntryHolder extends GetDisplayNameHandler_2 {
   private final RegistryEntry<Potion> floatHolder_4;

   public RegistryEntryHolder(
      Item Item, RegistryEntry<Potion> RegistryEntry, String s, ZenithInternal105$Helper li1ll11ilil1ii1lilll1i$ii1il11l111ii11iil
   ) {
      super(Item.getDefaultStack(), s, li1ll11ilil1ii1lilll1i$ii1il11l111ii11iil);
      this.floatHolder_4 = RegistryEntry;
      this.itemStack.set(DataComponentTypes.POTION_CONTENTS, new PotionContentsComponent(Optional.of(RegistryEntry), Optional.empty(), List.of(), Optional.empty()));
   }

   @Override
   public boolean isBuy(ItemStack ItemStack) {
      if (!super.isBuy(ItemStack)) {
         return false;
      } else {
         PotionContentsComponent PotionContentsComponent = (PotionContentsComponent)ItemStack.get(DataComponentTypes.POTION_CONTENTS);
         if (PotionContentsComponent == null) {
            return false;
         } else {
            Optional optional = PotionContentsComponent.potion();
            return optional.isEmpty() ? false : ((RegistryEntry)optional.get()).equals(this.floatHolder_4);
         }
      }
   }
}
