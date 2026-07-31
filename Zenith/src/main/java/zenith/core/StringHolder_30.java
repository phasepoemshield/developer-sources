package zenith;

import zenith.hud.*;

import net.minecraft.item.ItemStack;

public abstract class StringHolder_30 {
   protected final String HashMapHolder;
   protected final String doubleHolder;
   protected int OnMouseClickedHandler;

   public abstract boolean StringHolder_8(ItemStack ItemStack);

   @Override
   public String toString() {
      return this.getClass().getSimpleName() + " [checked=" + this.doubleHolder + ", level=" + this.OnMouseClickedHandler + "]";
   }

   public StringHolder_30(String s, String s1, int i) {
      this.HashMapHolder = s;
      this.doubleHolder = s1;
      this.OnMouseClickedHandler = i;
   }

   public String getName() {
      return this.HashMapHolder;
   }

   public String Staffs() {
      return this.doubleHolder;
   }

   public int TargetHud() {
      return this.OnMouseClickedHandler;
   }

   public void FinishThread(int i) {
      this.OnMouseClickedHandler = i;
   }
}
