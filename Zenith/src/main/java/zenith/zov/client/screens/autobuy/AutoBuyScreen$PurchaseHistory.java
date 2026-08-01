package zenith.zov.client.screens.autobuy;

import net.minecraft.item.ItemStack;

class AutoBuyScreen$PurchaseHistory {
   private final String itemName;
   private final String seller;
   private final int amount;
   private final int price;
   private final long timestamp;
   private transient ItemStack itemStack;

   public AutoBuyScreen$PurchaseHistory(String s, String s1, int i, int j) {
      this.itemName = s;
      this.seller = s1;
      this.amount = i;
      this.price = j;
      this.timestamp = System.currentTimeMillis();
      this.itemStack = null;
   }

   public AutoBuyScreen$PurchaseHistory(String s, String s1, int i, int j, long k) {
      this.itemName = s;
      this.seller = s1;
      this.amount = i;
      this.price = j;
      this.timestamp = k;
      this.itemStack = null;
   }

   public AutoBuyScreen$PurchaseHistory(String s, String s1, int i, int j, long k, ItemStack ItemStack) {
      this.itemName = s;
      this.seller = s1;
      this.amount = i;
      this.price = j;
      this.timestamp = k;
      this.itemStack = ItemStack;
   }

   public String getItemName() {
      return this.itemName;
   }

   public String getSeller() {
      return this.seller;
   }

   public int getAmount() {
      return this.amount;
   }

   public int getPrice() {
      return this.price;
   }

   public long getTimestamp() {
      return this.timestamp;
   }

   public ItemStack getItemStack() {
      return this.itemStack;
   }

   public void setItemStack(ItemStack ItemStack) {
      this.itemStack = ItemStack;
   }
}
