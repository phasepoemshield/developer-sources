package l;

import antidaunleak.api.UserProfile;
import java.lang.invoke.StringConcatFactory;

public class Helper60 {
   private static final Helper60 INSTANCE = new Helper60();
   private String currentTitle = UserProfile.getInstance().profile("");
   private int animationTick = 0;
   private boolean isRemoving = true;
   private boolean isUserPhase = true;
   private int pauseTicks = 0;
   private final int delayTicks = 1;
   private final int pauseDuration = 100;

   private Helper60() {
   }

   public static Helper60 method671() {
      return INSTANCE;
   }

   public void method672() {
      if (this.pauseTicks > 0) {
         this.pauseTicks--;
      } else {
         if (this.animationTick >= 1) {
            if (this.isRemoving) {
               if (this.currentTitle.length() > 1) {
                  String var1 = this.currentTitle.substring(0, this.currentTitle.length() - 1);
               } else {
                  String var2 = "<";
                  this.isRemoving = false;
               }
            }

            this.animationTick = 0;
         }

         this.animationTick++;
      }
   }

   public String method673() {
      return "Releon Client " + this.currentTitle;
   }
}
