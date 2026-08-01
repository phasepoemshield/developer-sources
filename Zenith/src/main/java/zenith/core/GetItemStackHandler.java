package zenith;

import net.minecraft.item.ItemStack;

public class GetItemStackHandler {
   private final ItemStack II1IIII11lI11;
   private final String Illl1ll1III;
   private final int lIlI11Ill1IIlIIIIl111l1lIlI;
   private final long Ill1llI1IIl11I1;
   private final long lI111l1II111l1I;

   public GetItemStackHandler(ItemStack ItemStack, String s, int i, long j) {
      this.II1IIII11lI11 = ItemStack == null ? ItemStack.EMPTY : ItemStack.copy();
      this.Illl1ll1III = s == null ? "" : s;
      this.lIlI11Ill1IIlIIIIl111l1lIlI = i;
      this.Ill1llI1IIl11I1 = j;
      this.lI111l1II111l1I = System.currentTimeMillis();
   }

   public ItemStack getItemStack() {
      return this.II1IIII11lI11;
   }

   public String getItemName() {
      return this.Illl1ll1III;
   }

   public int getAmount() {
      return this.lIlI11Ill1IIlIIIIl111l1lIlI;
   }

   public long getPrice() {
      return this.Ill1llI1IIl11I1;
   }

   public long getTimestamp() {
      return this.lI111l1II111l1I;
   }
}
