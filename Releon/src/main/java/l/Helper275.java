package l;

import java.util.List;
import net.minecraft.util.Formatting;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Helper275 implements Helper94, Helper160 {
   private static final Logger LOGGER = LogManager.getLogger("releon-module-switcher");
   private final List<Helper242> modules;

   public Helper275(List<Helper242> var1, Helper124 var2) {
      this.modules = var1;
      var2.method1016(this);
   }

   @Helper104
   public void method2757(Event17 var1) {
      for (Helper242 var3 : this.modules) {
         if (var1.method3909() == var3.getKey() && mc.currentScreen == null) {
            try {
               this.method2758(var3, var1.method3910());
            } catch (Exception var5) {
               this.method2759(var3.getName(), var5);
            }
         }
      }
   }

   private void method2758(Helper242 var1, int var2) {
      if (var1.getType() == 1 && var2 == 1) {
         var1.switchState();
      }
   }

   private void method2759(String var1, Exception var2) {
      if (var2 instanceof Exception5) {
         this.method906("[" + var1 + "] " + Formatting.RED + var2.getMessage());
      } else {
         LOGGER.error("Error in module {}: {}", var1, var2.getMessage(), var2);
      }
   }
}
