package Nursultan;

import java.util.Iterator;
import java.util.List;
import minecraft.class04453;
import minecraft.class06202;

@class11080(
   L = "AutoLeave",
   y = class11072.PLAYER,
   N = class11106.AUTO
)
public class AutoLeave extends class11067 {
   public Object L_0;
   public Object L_1;

   public AutoLeave() {
      this.j();
      this.L_0 = class11524.N(
         this,
         "action",
         new class11710(this, "hub", "hub", true),
         new class11710(this, "spawn", "spawn", false),
         new class11716(this, "custom-command", false),
         new class11677("disconnect", false)
      );

      for (class11535 var2 : ((class11517)this.L_0).L()) {
         if (var2 instanceof class11801 var3) {
            var3.N(this);
         }
      }

      this.L_1 = class11524.y(
         this, "triggers", new class11719(this, "player-nearby", true), new class11700(this, "health", false), new class11707(this, "was-in-pvp", false)
      );

      for (class11807 var5 : ((class11523)this.L_1).L()) {
         if (var5 instanceof class11801 var6) {
            var6.N(this);
         }
      }
   }

   @Override
   public void m() {
      this.j();
      if (!((class11822)((class04453)((class06202)super.y_0).T_4)).dataManager().y().N().N()) {
         ((class11708)((class11535)((class11517)this.L_0).i())).N();
         this.N(false);
      }
   }

   private void j() {
   }

   @class11782
   public void N(class10957 var1) {
      this.j();
      Iterator var2 = ((List)((class11523)this.L_1).i()).iterator();

      while (var2.hasNext()) {
         ((class11807)var2.next()).y(var1);
      }
   }
}
