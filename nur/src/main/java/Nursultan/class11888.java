package Nursultan;

import java.time.Duration;
import minecraft.class00401;
import minecraft.class00405;
import minecraft.class00625;
import minecraft.class05216;
import minecraft.class06541;
import minecraft.class06889;

public abstract class class11888 {
   static {
      N();
   }

   private String i(String var1) {
      String var2 = var1;
      long var3 = class11938.E().y().filter(var1x -> var1x.equals(var1)).count();
      if (var3 > 0L) {
         var2 = var1 + " (" + var3 + ")";
      }

      return var2;
   }

   private String N(double var1) {
      return "" + class06541.field_1068 + (int)var1 + class06541.field_1080;
   }

   public void N(String var1, double var2, double var4, double var6, boolean var8) {
      Object var9 = this.i(var1);
      if (var8) {
         this.N((String)var9, var2, var4, var6);
      }

      class05216 var10 = class11921.N("event-waypoint", class06541.field_1068 + var9 + class06541.field_1080, this.N(var2), this.N(var4), this.N(var6))
         .N(class06541.field_1080);
      if (!var8) {
         class00401 var11 = new class00401(class11921.N("click-to-way"));
         class00625 var12 = new class00625((Character)class10626.N_1 + "gps " + var2 + " " + var6);
         var10.y(class00405.N.N(var11).N(var12));
      }

      class11303.y(var10);
   }

   public void N(String var1) {
      Object var2 = this.i(var1);
      class11303.y(class11921.N("event-notify", class06541.field_1068 + var2 + class06541.field_1080).N(class06541.field_1080));
   }

   private void N(String var1, double var2, double var4, double var6) {
      String var8 = class11910.L();
      Duration var9 = Duration.ofSeconds(500L);
      class06889 var10 = new class06889(var2, var4, var6);
      class11475 var11 = new class11475(var1, var10, var9, var8);
      class11938.E().N(var11);
   }

   public abstract void N(class10990 var1);

   private static void N() {
   }
}
