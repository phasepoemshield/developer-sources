package Nursultan;

import it.unimi.dsi.fastutil.objects.Object2IntMap;
import it.unimi.dsi.fastutil.objects.Object2IntOpenHashMap;

public class class11446 extends class11807<Notifications> {
   public static Object y_0;
   public Object L_0;

   public class11446(Notifications var1, String var2, boolean var3) {
      super(var1, var2, var3);
      this.N();
      this.L_0 = new Object2IntOpenHashMap();
   }

   static {
      R();
   }

   @Override
   public void y(Object var1) {
      this.N();
      if (var1 instanceof class11403) {
         class11067 var3 = ((class11403)var1).N();
         if (!var3.R().N()) {
            return;
         }

         String var4 = class12020.N(var3.U() ? "module-enabled" : "module-disabled").formatted(var3.L());
         int var5 = class11938.g()
            .N(
               ((Object2IntMap)this.L_0).getInt(var3),
               var2 -> var2.N(new class11875(var3::U)).y(new class11857(var4)),
               var2 -> var2.y().N(new class11875(var3::U)).N(new class11857(var4)).N(3000L)
            );
         ((Object2IntMap)this.L_0).put(var3, var5);
      }
   }

   private void N() {
   }

   private static void R() {
      y_0 = 3000L;
   }
}
