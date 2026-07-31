package l;

import java.util.ArrayList;
import java.util.List;

public class Helper7 implements Helper94, Helper160 {
   public List<Helper8> macroList = new ArrayList<>();

   public Helper7(Helper124 var1) {
      var1.method1016(this);
   }

   public void method332(String var1, String var2, int var3) {
      this.macroList.add(new Helper8(var1, var2, var3));
   }

   public boolean method333(String var1) {
      return this.macroList.stream().anyMatch(var1x -> var1x.method345().equalsIgnoreCase(var1));
   }

   public void method334(String var1) {
      this.macroList.removeIf(var1x -> var1x.method345().equalsIgnoreCase(var1));
   }

   public void method335() {
      this.macroList.clear();
   }

   @Helper104
   public void method336(Event17 var1) {
      if (mc.player != null && var1.method3910() == 0 && mc.currentScreen == null) {
         this.macroList
            .stream()
            .filter(var1x -> var1x.method347() == var1.method3909())
            .findFirst()
            .ifPresent(var0 -> mc.player.networkHandler.sendChatMessage(var0.method346()));
      }
   }
}
