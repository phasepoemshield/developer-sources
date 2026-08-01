package zenith;

import zenith.hud.*;

import java.util.ArrayList;
import net.minecraft.item.ItemStack;

public class ArrayListHolder extends GetDisplayNameHandler_2 {
   protected final ArrayList<StringHolder_30> floatHolder_5 = new ArrayList<>();

   public ArrayListHolder(ItemStack ItemStack, String s, String s1, ZenithInternal105$Helper li1ll11ilil1ii1lilll1i$ii1il11l111ii11iil) {
      super(ItemStack, s, s1, li1ll11ilil1ii1lilll1i$ii1il11l111ii11iil);
   }

   public ArrayListHolder(ItemStack ItemStack, String s, ZenithInternal105$Helper li1ll11ilil1ii1lilll1i$ii1il11l111ii11iil) {
      super(ItemStack, s, li1ll11ilil1ii1lilll1i$ii1il11l111ii11iil);
   }

   @Override
   public boolean isBuy(ItemStack ItemStack) {
      if (!super.isBuy(ItemStack)) {
         return false;
      } else {
         for (StringHolder_30 llii1li1i1l : this.floatHolder_5) {
            if (!llii1li1i1l.StringHolder_8(ItemStack)) {
               return false;
            }
         }

         return true;
      }
   }

   public void StringHolder_8(StringHolder_30 llii1li1i1l) {
      this.floatHolder_5.add(llii1li1i1l);
   }

   public ArrayList<StringHolder_30> Watermark() {
      return this.floatHolder_5;
   }
}
