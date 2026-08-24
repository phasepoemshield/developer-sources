package org.zenith.core;

import org.zenith.event.EventRenderScreenHook;
import org.zenith.module.Module;

import org.zenith.module.AutoCraft;


public record WaypointData(WaypointKind zClass047Var159, String string117, String string118, String string119) {

   public static WaypointData call100() {
      return new WaypointData(null, "", "", "");
   }

   public boolean call038() {
      return this.zClass047Var159 == null;
   }

   public String Easing(AutoCraft var1) {
      if (this.zClass047Var159 == WaypointKind.val189) {
         return "\u041d\u0430\u0436\u043c\u0438\u0442\u0435 \u041f\u041a\u041c \u043f\u043e \u0445\u0440\u0430\u043d\u0438\u043b\u0438\u0449\u0443 \u0441 "
            + var1.EventRenderScreenHook(this.string119)
            + " \u0434\u043b\u044f \u0430\u0432\u0442\u043e\u043a\u0440\u0430\u0444\u0442\u0430";
      } else if (this.zClass047Var159 == WaypointKind.val190) {
         return "\u041d\u0430\u0436\u043c\u0438\u0442\u0435 \u041f\u041a\u041c \u043f\u043e \u0441\u0443\u043d\u0434\u0443\u043a\u0443 \u0441\u043a\u043b\u0430\u0434\u0430 \u0434\u043b\u044f \u0430\u0432\u0442\u043e\u043a\u0440\u0430\u0444\u0442\u0430";
      } else {
         return this.zClass047Var159 == WaypointKind.val191
            ? "\u041d\u0430\u0436\u043c\u0438\u0442\u0435 \u041f\u041a\u041c \u043f\u043e \u0432\u0435\u0440\u0441\u0442\u0430\u043a\u0443 \u0434\u043b\u044f \u0430\u0432\u0442\u043e\u043a\u0440\u0430\u0444\u0442\u0430"
            : "\u041d\u0430\u0436\u043c\u0438\u0442\u0435 \u041f\u041a\u041c \u043f\u043e \u0431\u043b\u043e\u043a\u0443 \u0434\u043b\u044f \u043f\u0440\u0438\u0432\u044f\u0437\u043a\u0438";
      }
   }

   public WaypointKind call079() {
      return this.zClass047Var159;
   }

   public String call061() {
      return this.string117;
   }

   public String call062() {
      return this.string118;
   }

   public String double127() {
      return this.string119;
   }
}
