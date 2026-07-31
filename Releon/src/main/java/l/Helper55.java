package l;

import antidaunleak.api.UserProfile;
import java.util.Arrays;
import java.util.List;

public class Helper55 {
   private final List<String> messages;
   private String currentText = "";
   private int currentMessageIndex = 0;
   private int animationTick = 0;
   private boolean isRemoving = false;
   private boolean showUnderscore = true;
   private int underscoreTick = 0;
   private final int delayTicks = 2;
   private final int pauseTicksMax = 60;
   private int pauseTicks = 0;
   private final int underscoreBlinkTicks = 10;

   public Helper55() {
      String var1 = UserProfile.getInstance().profile("username");
      this.messages = Arrays.asList(
         "Glad to see you again, " + var1 + "! Come on in, everything’s ready for you",
         "Welcome back, " + var1 + "! Ready to dive into the adventure?",
         "Hey " + var1 + ", let’s make some epic moments today!",
         var1 + ", the game awaits your legendary skills!"
      );
   }

   public void method642() {
      if (this.pauseTicks > 0) {
         this.pauseTicks--;
         this.method643();
      } else {
         if (this.animationTick >= 2) {
            String var1 = this.messages.get(this.currentMessageIndex);
            if (this.isRemoving) {
               if (this.currentText.length() > 0) {
                  this.currentText = this.currentText.substring(0, this.currentText.length() - 1);
               } else {
                  this.isRemoving = false;
                  this.currentMessageIndex = (this.currentMessageIndex + 1) % this.messages.size();
                  this.pauseTicks = 60;
               }
            } else if (this.currentText.length() < var1.length()) {
               this.currentText = var1.substring(0, this.currentText.length() + 1);
            } else {
               this.isRemoving = true;
               this.pauseTicks = 60;
            }

            this.animationTick = 0;
         }

         this.animationTick++;
         this.method643();
      }
   }

   private void method643() {
      this.underscoreTick++;
      if (this.underscoreTick >= 10) {
         this.showUnderscore = !this.showUnderscore;
         this.underscoreTick = 0;
      }
   }

   public String method644() {
      return this.currentText + (this.showUnderscore ? "_" : "");
   }
}
