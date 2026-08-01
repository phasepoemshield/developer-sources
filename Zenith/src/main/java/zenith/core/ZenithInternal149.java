package zenith;

import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NbtCompound;
import net.minecraft.nbt.NbtList;
import net.minecraft.component.type.NbtComponent;
import net.minecraft.component.DataComponentTypes;

public class ZenithInternal149 extends StringHolder_30 {
   public ZenithInternal149(String s, String s1, int i) {
      super(s, s1, i);
   }

   @Override
   public boolean StringHolder_8(ItemStack ItemStack) {
      NbtComponent NbtComponent = (NbtComponent)ItemStack.get(DataComponentTypes.CUSTOM_DATA);
      if (NbtComponent != null
         && NbtComponent.getNbt()
            .contains(
               ZenithClient.getInstance().SupplierHolder().Ill1I11IIIlllIIllII1lIl()
                  ? "custom-enchantments"
                  : "Enchantments",
               9
            )) {
         NbtList NbtList = NbtComponent.getNbt()
            .getList(
               ZenithClient.getInstance().SupplierHolder().Ill1I11IIIlllIIllII1lIl()
                  ? "custom-enchantments"
                  : "Enchantments",
               10
            );

         for (int i = 0; i < NbtList.size(); i++) {
            NbtCompound NbtCompound = NbtList.getCompound(i);
            String s = NbtCompound.getString(
               ZenithClient.getInstance().SupplierHolder().Ill1I11IIIlllIIllII1lIl() ? "type" : "id"
            );
            int j = NbtCompound.getInt(
               ZenithClient.getInstance().SupplierHolder().Ill1I11IIIlllIIllII1lIl() ? "level" : "lvl"
            );
            if (s.equals(this.doubleHolder)) {
               return j >= this.OnMouseClickedHandler;
            }
         }
      }

      return false;
   }
}
