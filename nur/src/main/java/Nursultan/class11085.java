package Nursultan;

public enum class11085 {
   MID_CHEST,
   UPPER_CHEST,
   SHOULDER,
   HEAD_LINE;

   static {
      u();
   }

   private static void u() {
   }

   public class11085 N(class09166 var1) {
      class11085[] var2 = values();
      class11085 var3 = var2[var1.N(0, var2.length - 1)];
      return var3 == this ? var2[(this.ordinal() + 1) % var2.length] : var3;
   }
}
