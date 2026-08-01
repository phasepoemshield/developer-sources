package zenith;

import zenith.hud.*;

import net.minecraft.item.ItemStack;

public class GetDisplayNameHandler_2 implements ZenithInternal140 {
   protected ItemStack itemStack;
   protected final String displayName;
   protected final String GetHeightHandler;
   protected final ZenithInternal105$Helper OnMouseReleasedHandler;

   public GetDisplayNameHandler_2(ItemStack ItemStack, String s, ZenithInternal105$Helper li1ll11ilil1ii1lilll1i$ii1il11l111ii11iil) {
      this.itemStack = ItemStack;
      this.displayName = s;
      this.GetHeightHandler = s;
      this.OnMouseReleasedHandler = li1ll11ilil1ii1lilll1i$ii1il11l111ii11iil;
   }

   public GetDisplayNameHandler_2(
      ItemStack ItemStack, String s, String s1, ZenithInternal105$Helper li1ll11ilil1ii1lilll1i$ii1il11l111ii11iil
   ) {
      this.itemStack = ItemStack;
      this.displayName = s;
      this.GetHeightHandler = s1;
      this.OnMouseReleasedHandler = li1ll11ilil1ii1lilll1i$ii1il11l111ii11iil;
   }

   public boolean isBuy(ItemStack ItemStack) {
      return ItemStack != null && ItemStack.getItem() == this.itemStack.getItem();
   }

   public ItemStack getItemStack() {
      return this.itemStack;
   }

   public String getDisplayName() {
      return this.displayName;
   }

   public String HudElement() {
      return this.GetHeightHandler;
   }

   public ZenithInternal105$Helper Category() {
      return this.OnMouseReleasedHandler;
   }
}
