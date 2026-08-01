package zenith.zov.client.screens.autobuy.items;

import zenith.hud.*;

import com.google.gson.JsonObject;
import net.minecraft.item.ItemStack;
import zenith.GetDisplayNameHandler_2;

public class AutoInventoryItem {
   private final GetDisplayNameHandler_2 itemBuy;
   private long maxSumBuy = 0L;
   private int countBuy = 1;
   private boolean selected = false;
   private int slotId;

   public AutoInventoryItem(GetDisplayNameHandler_2 li1ll11ilil1ii1lilll1i) {
      this.itemBuy = li1ll11ilil1ii1lilll1i;
   }

   public void toggleSelected() {
      this.selected = !this.selected;
   }

   public AutoInventoryItem copy() {
      AutoInventoryItem autoinventoryitem1 = new AutoInventoryItem(this.itemBuy);
      autoinventoryitem1.maxSumBuy = this.maxSumBuy;
      autoinventoryitem1.countBuy = this.countBuy;
      autoinventoryitem1.selected = this.selected;
      return autoinventoryitem1;
   }

   public JsonObject save() {
      JsonObject jsonobject = new JsonObject();
      jsonobject.addProperty("maxSumBuy", this.maxSumBuy);
      jsonobject.addProperty("countBuy", this.countBuy);
      jsonobject.addProperty("selected", this.selected);
      jsonobject.addProperty("slotId", this.slotId);
      return jsonobject;
   }

   public void load(JsonObject jsonobject) {
      if (jsonobject.has("maxSumBuy")) {
         this.maxSumBuy = jsonobject.get("maxSumBuy").getAsLong();
      }

      if (jsonobject.has("countBuy")) {
         this.countBuy = jsonobject.get("countBuy").getAsInt();
      }

      if (jsonobject.has("selected")) {
         this.selected = jsonobject.get("selected").getAsBoolean();
      }

      if (jsonobject.has("slotId")) {
         this.slotId = jsonobject.get("slotId").getAsInt();
      }
   }

   public boolean isBuy(ItemStack ItemStack) {
      return this.itemBuy.isBuy(ItemStack);
   }

   public GetDisplayNameHandler_2 getItemBuy() {
      return this.itemBuy;
   }

   public long getMaxSumBuy() {
      return this.maxSumBuy;
   }

   public int getCountBuy() {
      return this.countBuy;
   }

   public boolean isSelected() {
      return this.selected;
   }

   public int getSlotId() {
      return this.slotId;
   }

   public void setMaxSumBuy(long i) {
      this.maxSumBuy = i;
   }

   public void setCountBuy(int i) {
      this.countBuy = i;
   }

   public void setSelected(boolean flag) {
      this.selected = flag;
   }

   public void setSlotId(int i) {
      this.slotId = i;
   }
}
