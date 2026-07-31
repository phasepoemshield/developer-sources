package zenith;

import net.minecraft.item.ItemStack;

public class Autobuy$II1Il11l111II11IIl {
   private final String ll1l11l1lIllI11lII111;
   private final String I1l1Ill1IlllllI;
   private final int IIIll11I11lI1IIl1II1lllI1II1;
   private final int I1l1IIIl111Ill;
   private final long Il1llIlllIIl11l1IlI;
   private transient ItemStack itemStack;

   public Autobuy$II1Il11l111II11IIl(String s, String s1, int i, int j) {
      this.ll1l11l1lIllI11lII111 = s;
      this.I1l1Ill1IlllllI = s1;
      this.IIIll11I11lI1IIl1II1lllI1II1 = i;
      this.I1l1IIIl111Ill = j;
      this.Il1llIlllIIl11l1IlI = System.currentTimeMillis();
      this.itemStack = null;
   }

   public Autobuy$II1Il11l111II11IIl(String s, String s1, int i, int j, long k) {
      this.ll1l11l1lIllI11lII111 = s;
      this.I1l1Ill1IlllllI = s1;
      this.IIIll11I11lI1IIl1II1lllI1II1 = i;
      this.I1l1IIIl111Ill = j;
      this.Il1llIlllIIl11l1IlI = k;
      this.itemStack = null;
   }

   public Autobuy$II1Il11l111II11IIl(String s, String s1, int i, int j, ItemStack ItemStack) {
      this.ll1l11l1lIllI11lII111 = s;
      this.I1l1Ill1IlllllI = s1;
      this.IIIll11I11lI1IIl1II1lllI1II1 = i;
      this.I1l1IIIl111Ill = j;
      this.Il1llIlllIIl11l1IlI = System.currentTimeMillis();
      this.itemStack = ItemStack;
   }

   public String getItemName() {
      return this.ll1l11l1lIllI11lII111;
   }

   public String getSeller() {
      return this.I1l1Ill1IlllllI;
   }

   public int getAmount() {
      return this.IIIll11I11lI1IIl1II1lllI1II1;
   }

   public int getPrice() {
      return this.I1l1IIIl111Ill;
   }

   public long getTimestamp() {
      return this.Il1llIlllIIl11l1IlI;
   }

   public ItemStack getItemStack() {
      return this.itemStack;
   }

   public void setItemStack(ItemStack ItemStack) {
      this.itemStack = ItemStack;
   }
}
