package zenith;

import java.util.ArrayList;
import java.util.List;
import net.minecraft.item.ItemStack;

public class ListHolder_3 {
   private static final int ll1llII11l1lIIIlIll1I1 = 100;
   private final List<GetItemStackHandler> l1IIllIIII1I1lll1lIl1IIIl = new ArrayList<>();

   public void StringHolder_8(ItemStack ItemStack, String s, int i, long j) {
      if (ItemStackx != null && !ItemStackx.isEmpty()) {
         if (i > 0) {
            ItemStack ItemStackx = ItemStackx.copy();
            ItemStackx.setCount(i);
            this.l1IIllIIII1I1lll1lIl1IIIl.add(0, new GetItemStackHandler(ItemStackx, s, i, Math.max(0L, j)));

            while (this.l1IIllIIII1I1lll1lIl1IIIl.size() > 100) {
               this.l1IIllIIII1I1lll1lIl1IIIl.removeLast();
            }
         }
      }
   }

   public List<GetItemStackHandler> I1IIIIllll() {
      return List.copyOf(this.l1IIllIIII1I1lll1lIl1IIIl);
   }
}
