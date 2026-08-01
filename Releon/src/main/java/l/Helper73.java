package l;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;

public class Helper73 {
   public Helper73() {
   }

   public void method780(File... var1) {
      ArrayList var2 = new ArrayList();
      Arrays.stream(var1).filter(var0 -> !var0.exists()).forEach(var1x -> {
         if (var1x.mkdirs()) {
            var2.add(var1x.getName());
         }
      });
      Helper211.method1807("Number of directories created: " + var2.size());
      if (!var2.isEmpty()) {
         Helper211.method1807("Directories created:");
         var2.forEach(Helper211::method1807);
      }
   }
}
